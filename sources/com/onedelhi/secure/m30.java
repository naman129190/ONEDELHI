package com.onedelhi.secure;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class m30<T> {

    /* renamed from: a */
    public static final String f31981a = "ComponentDiscovery";

    /* renamed from: b */
    public static final String f31982b = "com.google.firebase.components.ComponentRegistrar";

    /* renamed from: c */
    public static final String f31983c = "com.google.firebase.components:";

    /* renamed from: a */
    public final C6084c<T> f31984a;

    /* renamed from: a */
    public final T f31985a;

    /* renamed from: com.onedelhi.secure.m30$b */
    public static class C6083b implements C6084c<Context> {

        /* renamed from: a */
        public final Class<? extends Service> f31986a;

        public C6083b(Class<? extends Service> cls) {
            this.f31986a = cls;
        }

        /* renamed from: b */
        public final Bundle mo40457b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w(m30.f31981a, "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f31986a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w(m30.f31981a, this.f31986a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w(m30.f31981a, "Application info not found.");
                return null;
            }
        }

        /* renamed from: c */
        public List<String> mo40456a(Context context) {
            Bundle b = mo40457b(context);
            if (b == null) {
                Log.w(m30.f31981a, "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if (m30.f31982b.equals(b.get(str)) && str.startsWith(m30.f31983c)) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    @hw4
    /* renamed from: com.onedelhi.secure.m30$c */
    public interface C6084c<T> {
        /* renamed from: a */
        List<String> mo40456a(T t);
    }

    @hw4
    public m30(T t, C6084c<T> cVar) {
        this.f31985a = t;
        this.f31984a = cVar;
    }

    /* renamed from: d */
    public static m30<Context> m56859d(Context context, Class<? extends Service> cls) {
        return new m30<>(context, new C6083b(cls));
    }

    @ts2
    /* renamed from: e */
    public static ComponentRegistrar m56860e(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new ot1(String.format("Class %s is not an instance of %s", new Object[]{str, f31982b}));
        } catch (ClassNotFoundException unused) {
            Log.w(f31981a, String.format("Class %s is not an found.", new Object[]{str}));
            return null;
        } catch (IllegalAccessException e) {
            throw new ot1(String.format("Could not instantiate %s.", new Object[]{str}), e);
        } catch (InstantiationException e2) {
            throw new ot1(String.format("Could not instantiate %s.", new Object[]{str}), e2);
        } catch (NoSuchMethodException e3) {
            throw new ot1(String.format("Could not instantiate %s", new Object[]{str}), e3);
        } catch (InvocationTargetException e4) {
            throw new ot1(String.format("Could not instantiate %s", new Object[]{str}), e4);
        }
    }

    @Deprecated
    /* renamed from: b */
    public List<ComponentRegistrar> mo40454b() {
        ArrayList arrayList = new ArrayList();
        for (String e : this.f31984a.mo40456a(this.f31985a)) {
            try {
                ComponentRegistrar e2 = m56860e(e);
                if (e2 != null) {
                    arrayList.add(e2);
                }
            } catch (ot1 e3) {
                Log.w(f31981a, "Invalid component registrar.", e3);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public List<b73<ComponentRegistrar>> mo40455c() {
        ArrayList arrayList = new ArrayList();
        for (String l30 : this.f31984a.mo40456a(this.f31985a)) {
            arrayList.add(new l30(l30));
        }
        return arrayList;
    }
}
