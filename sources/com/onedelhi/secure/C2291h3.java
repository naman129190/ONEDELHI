package com.onedelhi.secure;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.onedelhi.secure.hl3;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

@hl3({hl3.C2354a.f13185a})
/* renamed from: com.onedelhi.secure.h3 */
public final class C2291h3 {

    /* renamed from: a */
    public static final Handler f12871a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static final Class<?> f12872a;

    /* renamed from: a */
    public static final String f12873a = "ActivityRecreator";

    /* renamed from: a */
    public static final Field f12874a = m16448b();

    /* renamed from: a */
    public static final Method f12875a;

    /* renamed from: b */
    public static final Field f12876b = m16452f();

    /* renamed from: b */
    public static final Method f12877b;

    /* renamed from: c */
    public static final Method f12878c;

    /* renamed from: com.onedelhi.secure.h3$a */
    public class C2292a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C2295d f12879a;

        /* renamed from: a */
        public final /* synthetic */ Object f12880a;

        public C2292a(C2295d dVar, Object obj) {
            this.f12879a = dVar;
            this.f12880a = obj;
        }

        public void run() {
            this.f12879a.f12886a = this.f12880a;
        }
    }

    /* renamed from: com.onedelhi.secure.h3$b */
    public class C2293b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Application f12881a;

        /* renamed from: a */
        public final /* synthetic */ C2295d f12882a;

        public C2293b(Application application, C2295d dVar) {
            this.f12881a = application;
            this.f12882a = dVar;
        }

        public void run() {
            this.f12881a.unregisterActivityLifecycleCallbacks(this.f12882a);
        }
    }

    /* renamed from: com.onedelhi.secure.h3$c */
    public class C2294c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Object f12883a;

        /* renamed from: b */
        public final /* synthetic */ Object f12884b;

        public C2294c(Object obj, Object obj2) {
            this.f12883a = obj;
            this.f12884b = obj2;
        }

        public void run() {
            try {
                Method method = C2291h3.f12875a;
                if (method != null) {
                    method.invoke(this.f12883a, new Object[]{this.f12884b, Boolean.FALSE, "AppCompat recreation"});
                    return;
                }
                C2291h3.f12877b.invoke(this.f12883a, new Object[]{this.f12884b, Boolean.FALSE});
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e(C2291h3.f12873a, "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.h3$d */
    public static final class C2295d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        public Activity f12885a;

        /* renamed from: a */
        public Object f12886a;

        /* renamed from: b */
        public boolean f12887b = false;

        /* renamed from: c */
        public boolean f12888c = false;

        /* renamed from: d */
        public boolean f12889d = false;

        /* renamed from: n */
        public final int f12890n;

        public C2295d(@mr2 Activity activity) {
            this.f12885a = activity;
            this.f12890n = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f12885a == activity) {
                this.f12885a = null;
                this.f12888c = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f12888c && !this.f12889d && !this.f12887b && C2291h3.m16454h(this.f12886a, this.f12890n, activity)) {
                this.f12889d = true;
                this.f12886a = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f12885a == activity) {
                this.f12887b = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a = m16447a();
        f12872a = a;
        f12875a = m16450d(a);
        f12877b = m16449c(a);
        f12878c = m16451e(a);
    }

    /* renamed from: a */
    public static Class<?> m16447a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Field m16448b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Method m16449c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Method m16450d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Method m16451e(Class<?> cls) {
        if (m16453g() && cls != null) {
            try {
                Class cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    public static Field m16452f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m16453g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: h */
    public static boolean m16454h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f12876b.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i) {
                    f12871a.postAtFrontOfQueue(new C2294c(f12874a.get(activity), obj2));
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Log.e(f12873a, "Exception while fetching field values", th);
            return false;
        }
    }

    /* renamed from: i */
    public static boolean m16455i(@mr2 Activity activity) {
        Object obj;
        Application application;
        C2295d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m16453g() && f12878c == null) {
            return false;
        } else {
            if (f12877b == null && f12875a == null) {
                return false;
            }
            try {
                Object obj2 = f12876b.get(activity);
                if (obj2 == null || (obj = f12874a.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C2295d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f12871a;
                handler.post(new C2292a(dVar, obj2));
                if (m16453g()) {
                    Method method = f12878c;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new C2293b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
