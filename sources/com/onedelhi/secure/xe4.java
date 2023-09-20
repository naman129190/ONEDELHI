package com.onedelhi.secure;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.onedelhi.secure.hl3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class xe4 extends ContextWrapper {

    /* renamed from: a */
    public static final Object f22536a = new Object();

    /* renamed from: a */
    public static ArrayList<WeakReference<xe4>> f22537a;

    /* renamed from: a */
    public final Resources.Theme f22538a;

    /* renamed from: a */
    public final Resources f22539a;

    public xe4(@mr2 Context context) {
        super(context);
        if (ms4.m21939d()) {
            ms4 ms4 = new ms4(this, context.getResources());
            this.f22539a = ms4;
            Resources.Theme newTheme = ms4.newTheme();
            this.f22538a = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f22539a = new ze4(this, context.getResources());
        this.f22538a = null;
    }

    /* renamed from: a */
    public static boolean m31414a(@mr2 Context context) {
        return !(context instanceof xe4) && !(context.getResources() instanceof ze4) && !(context.getResources() instanceof ms4) && ms4.m21939d();
    }

    /* renamed from: b */
    public static Context m31415b(@mr2 Context context) {
        if (!m31414a(context)) {
            return context;
        }
        synchronized (f22536a) {
            ArrayList<WeakReference<xe4>> arrayList = f22537a;
            if (arrayList == null) {
                f22537a = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f22537a.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f22537a.remove(size);
                    }
                }
                for (int size2 = f22537a.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f22537a.get(size2);
                    xe4 xe4 = weakReference2 != null ? (xe4) weakReference2.get() : null;
                    if (xe4 != null && xe4.getBaseContext() == context) {
                        return xe4;
                    }
                }
            }
            xe4 xe42 = new xe4(context);
            f22537a.add(new WeakReference(xe42));
            return xe42;
        }
    }

    public AssetManager getAssets() {
        return this.f22539a.getAssets();
    }

    public Resources getResources() {
        return this.f22539a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f22538a;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f22538a;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
