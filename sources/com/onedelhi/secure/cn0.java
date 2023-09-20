package com.onedelhi.secure;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.google.firebase.messaging.C4311b;
import java.util.WeakHashMap;

public final class cn0 {

    /* renamed from: a */
    public static final String f10409a = "android.hardware.display.category.PRESENTATION";

    /* renamed from: a */
    public static final WeakHashMap<Context, cn0> f10410a = new WeakHashMap<>();

    /* renamed from: a */
    public final Context f10411a;

    @sj3(17)
    /* renamed from: com.onedelhi.secure.cn0$a */
    public static class C1919a {
        @pn0
        /* renamed from: a */
        public static Display m12632a(DisplayManager displayManager, int i) {
            return displayManager.getDisplay(i);
        }

        @pn0
        /* renamed from: b */
        public static Display[] m12633b(DisplayManager displayManager) {
            return displayManager.getDisplays();
        }
    }

    public cn0(Context context) {
        this.f10411a = context;
    }

    @mr2
    /* renamed from: d */
    public static cn0 m12628d(@mr2 Context context) {
        cn0 cn0;
        WeakHashMap<Context, cn0> weakHashMap = f10410a;
        synchronized (weakHashMap) {
            cn0 = weakHashMap.get(context);
            if (cn0 == null) {
                cn0 = new cn0(context);
                weakHashMap.put(context, cn0);
            }
        }
        return cn0;
    }

    @ts2
    /* renamed from: a */
    public Display mo14275a(int i) {
        return C1919a.m12632a((DisplayManager) this.f10411a.getSystemService(C4311b.C4317f.C4318a.f25150b), i);
    }

    @mr2
    /* renamed from: b */
    public Display[] mo14276b() {
        return C1919a.m12633b((DisplayManager) this.f10411a.getSystemService(C4311b.C4317f.C4318a.f25150b));
    }

    @mr2
    /* renamed from: c */
    public Display[] mo14277c(@ts2 String str) {
        return C1919a.m12633b((DisplayManager) this.f10411a.getSystemService(C4311b.C4317f.C4318a.f25150b));
    }
}
