package com.onedelhi.secure;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@nz3
public class ki2 implements C2448ii {

    /* renamed from: a */
    public static final String f14900a = "BackendRegistry";

    /* renamed from: b */
    public static final String f14901b = "backend:";

    /* renamed from: a */
    public final hb0 f14902a;

    /* renamed from: a */
    public final C2633a f14903a;

    /* renamed from: a */
    public final Map<String, wh4> f14904a;

    /* renamed from: com.onedelhi.secure.ki2$a */
    public static class C2633a {

        /* renamed from: a */
        public final Context f14905a;

        /* renamed from: a */
        public Map<String, String> f14906a = null;

        public C2633a(Context context) {
            this.f14905a = context;
        }

        /* renamed from: d */
        public static Bundle m19814d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w(ki2.f14900a, "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w(ki2.f14900a, "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w(ki2.f14900a, "Application info not found.");
                return null;
            }
        }

        /* renamed from: a */
        public final Map<String, String> mo19075a(Context context) {
            Bundle d = m19814d(context);
            if (d == null) {
                Log.w(ki2.f14900a, "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d.keySet()) {
                Object obj = d.get(str);
                if ((obj instanceof String) && str.startsWith(ki2.f14901b)) {
                    for (String trim : ((String) obj).split(vf4.f36537c, -1)) {
                        String trim2 = trim.trim();
                        if (!trim2.isEmpty()) {
                            hashMap.put(trim2, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        @ts2
        /* renamed from: b */
        public C2168fi mo19076b(String str) {
            String str2;
            String str3;
            String str4 = mo19077c().get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (C2168fi) Class.forName(str4).asSubclass(C2168fi.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                e = e;
                str2 = String.format("Class %s is not found.", new Object[]{str4});
                Log.w(ki2.f14900a, str2, e);
                return null;
            } catch (IllegalAccessException e2) {
                e = e2;
                str2 = String.format("Could not instantiate %s.", new Object[]{str4});
                Log.w(ki2.f14900a, str2, e);
                return null;
            } catch (InstantiationException e3) {
                e = e3;
                str2 = String.format("Could not instantiate %s.", new Object[]{str4});
                Log.w(ki2.f14900a, str2, e);
                return null;
            } catch (NoSuchMethodException e4) {
                e = e4;
                str3 = String.format("Could not instantiate %s", new Object[]{str4});
                Log.w(ki2.f14900a, str3, e);
                return null;
            } catch (InvocationTargetException e5) {
                e = e5;
                str3 = String.format("Could not instantiate %s", new Object[]{str4});
                Log.w(ki2.f14900a, str3, e);
                return null;
            }
        }

        /* renamed from: c */
        public final Map<String, String> mo19077c() {
            if (this.f14906a == null) {
                this.f14906a = mo19075a(this.f14905a);
            }
            return this.f14906a;
        }
    }

    @qq1
    public ki2(Context context, hb0 hb0) {
        this(new C2633a(context), hb0);
    }

    public ki2(C2633a aVar, hb0 hb0) {
        this.f14904a = new HashMap();
        this.f14903a = aVar;
        this.f14902a = hb0;
    }

    @ts2
    /* renamed from: a */
    public synchronized wh4 mo17813a(String str) {
        if (this.f14904a.containsKey(str)) {
            return this.f14904a.get(str);
        }
        C2168fi b = this.f14903a.mo19076b(str);
        if (b == null) {
            return null;
        }
        wh4 create = b.create(this.f14902a.mo17169a(str));
        this.f14904a.put(str, create);
        return create;
    }
}
