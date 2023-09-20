package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.rq0;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class qq0 {

    /* renamed from: a */
    public static final int f19396a = 0;

    /* renamed from: a */
    public static final C3332c f19397a;

    /* renamed from: a */
    public static final Map<String, C3332c> f19398a;

    /* renamed from: a */
    public static final int[] f19399a = {fd3.C2153c.dynamicColorThemeOverlay};
    @SuppressLint({"PrivateApi"})

    /* renamed from: b */
    public static final C3332c f19400b;

    /* renamed from: b */
    public static final Map<String, C3332c> f19401b;

    /* renamed from: com.onedelhi.secure.qq0$a */
    public class C3330a implements C3332c {
        /* renamed from: a */
        public boolean mo23337a() {
            return true;
        }
    }

    /* renamed from: com.onedelhi.secure.qq0$b */
    public class C3331b implements C3332c {

        /* renamed from: a */
        public Long f19402a;

        /* renamed from: a */
        public boolean mo23337a() {
            if (this.f19402a == null) {
                try {
                    Method declaredMethod = Build.class.getDeclaredMethod("getLong", new Class[]{String.class});
                    declaredMethod.setAccessible(true);
                    this.f19402a = Long.valueOf(((Long) declaredMethod.invoke((Object) null, new Object[]{"ro.build.version.oneui"})).longValue());
                } catch (Exception unused) {
                    this.f19402a = -1L;
                }
            }
            return this.f19402a.longValue() >= 40100;
        }
    }

    /* renamed from: com.onedelhi.secure.qq0$c */
    public interface C3332c {
        /* renamed from: a */
        boolean mo23337a();
    }

    /* renamed from: com.onedelhi.secure.qq0$d */
    public static class C3333d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        public final rq0 f19403a;

        public C3333d(@mr2 rq0 rq0) {
            this.f19403a = rq0;
        }

        public void onActivityCreated(@mr2 Activity activity, @ts2 Bundle bundle) {
        }

        public void onActivityDestroyed(@mr2 Activity activity) {
        }

        public void onActivityPaused(@mr2 Activity activity) {
        }

        public void onActivityPreCreated(@mr2 Activity activity, @ts2 Bundle bundle) {
            qq0.m26040k(activity, this.f19403a.mo23985e(), this.f19403a.mo23984d(), this.f19403a.mo23983c());
        }

        public void onActivityResumed(@mr2 Activity activity) {
        }

        public void onActivitySaveInstanceState(@mr2 Activity activity, @mr2 Bundle bundle) {
        }

        public void onActivityStarted(@mr2 Activity activity) {
        }

        public void onActivityStopped(@mr2 Activity activity) {
        }
    }

    /* renamed from: com.onedelhi.secure.qq0$e */
    public interface C3334e {
        /* renamed from: a */
        void mo23346a(@mr2 Activity activity);
    }

    /* renamed from: com.onedelhi.secure.qq0$f */
    public interface C3335f {
        /* renamed from: a */
        boolean mo23347a(@mr2 Activity activity, @e64 int i);
    }

    static {
        C3330a aVar = new C3330a();
        f19397a = aVar;
        C3331b bVar = new C3331b();
        f19400b = bVar;
        HashMap hashMap = new HashMap();
        hashMap.put("fcnt", aVar);
        hashMap.put("google", aVar);
        hashMap.put("hmd global", aVar);
        hashMap.put("infinix", aVar);
        hashMap.put("infinix mobility limited", aVar);
        hashMap.put("itel", aVar);
        hashMap.put("kyocera", aVar);
        hashMap.put("lenovo", aVar);
        hashMap.put(fc2.f28255a, aVar);
        hashMap.put("motorola", aVar);
        hashMap.put("nothing", aVar);
        hashMap.put("oneplus", aVar);
        hashMap.put("oppo", aVar);
        hashMap.put("realme", aVar);
        hashMap.put("robolectric", aVar);
        hashMap.put(fc2.f28256b, bVar);
        hashMap.put("sharp", aVar);
        hashMap.put("sony", aVar);
        hashMap.put("tcl", aVar);
        hashMap.put("tecno", aVar);
        hashMap.put("tecno mobile limited", aVar);
        hashMap.put("vivo", aVar);
        hashMap.put("xiaomi", aVar);
        f19398a = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asus", aVar);
        hashMap2.put("jio", aVar);
        f19401b = Collections.unmodifiableMap(hashMap2);
    }

    @Deprecated
    /* renamed from: b */
    public static void m26031b(@mr2 Activity activity) {
        m26039j(activity);
    }

    @Deprecated
    /* renamed from: c */
    public static void m26032c(@mr2 Activity activity, @e64 int i) {
        m26041l(activity, new rq0.C3436c().mo23989g(i).mo23986d());
    }

    @Deprecated
    /* renamed from: d */
    public static void m26033d(@mr2 Activity activity, @mr2 C3335f fVar) {
        m26041l(activity, new rq0.C3436c().mo23988f(fVar).mo23986d());
    }

    /* renamed from: e */
    public static void m26034e(@mr2 Application application) {
        m26038i(application, new rq0.C3436c().mo23986d());
    }

    @Deprecated
    /* renamed from: f */
    public static void m26035f(@mr2 Application application, @e64 int i) {
        m26038i(application, new rq0.C3436c().mo23989g(i).mo23986d());
    }

    @Deprecated
    /* renamed from: g */
    public static void m26036g(@mr2 Application application, @e64 int i, @mr2 C3335f fVar) {
        m26038i(application, new rq0.C3436c().mo23989g(i).mo23988f(fVar).mo23986d());
    }

    @Deprecated
    /* renamed from: h */
    public static void m26037h(@mr2 Application application, @mr2 C3335f fVar) {
        m26038i(application, new rq0.C3436c().mo23988f(fVar).mo23986d());
    }

    /* renamed from: i */
    public static void m26038i(@mr2 Application application, @mr2 rq0 rq0) {
        application.registerActivityLifecycleCallbacks(new C3333d(rq0));
    }

    /* renamed from: j */
    public static void m26039j(@mr2 Activity activity) {
        m26041l(activity, new rq0.C3436c().mo23986d());
    }

    /* renamed from: k */
    public static void m26040k(@mr2 Activity activity, @e64 int i, @mr2 C3335f fVar, @mr2 C3334e eVar) {
        if (m26043n()) {
            if (i == 0) {
                i = m26042m(activity);
            }
            if (i != 0 && fVar.mo23347a(activity, i)) {
                pb4.m24572a(activity, i);
                eVar.mo23346a(activity);
            }
        }
    }

    /* renamed from: l */
    public static void m26041l(@mr2 Activity activity, @mr2 rq0 rq0) {
        m26040k(activity, rq0.mo23985e(), rq0.mo23984d(), rq0.mo23983c());
    }

    /* renamed from: m */
    public static int m26042m(@mr2 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f19399a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @SuppressLint({"DefaultLocale"})
    @C3196px(api = 31)
    /* renamed from: n */
    public static boolean m26043n() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        if (C3730uo.m29482k()) {
            return true;
        }
        C3332c cVar = f19398a.get(Build.MANUFACTURER.toLowerCase());
        if (cVar == null) {
            cVar = f19401b.get(Build.BRAND.toLowerCase());
        }
        return cVar != null && cVar.mo23337a();
    }

    @mr2
    /* renamed from: o */
    public static Context m26044o(@mr2 Context context) {
        return m26045p(context, 0);
    }

    @mr2
    /* renamed from: p */
    public static Context m26045p(@mr2 Context context, @e64 int i) {
        if (!m26043n()) {
            return context;
        }
        if (i == 0) {
            i = m26042m(context);
        }
        return i == 0 ? context : new ContextThemeWrapper(context, i);
    }
}
