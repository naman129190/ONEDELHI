package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C0694f;
import com.onedelhi.secure.bc2;
import com.onedelhi.secure.sj3;
import java.lang.reflect.Field;

@sj3(19)
final class ImmLeaksCleaner implements C0694f {

    /* renamed from: a */
    public static Field f599a = null;

    /* renamed from: b */
    public static Field f600b = null;

    /* renamed from: c */
    public static Field f601c = null;

    /* renamed from: n */
    public static final int f602n = 0;

    /* renamed from: o */
    public static final int f603o = 1;

    /* renamed from: p */
    public static final int f604p = 2;

    /* renamed from: q */
    public static int f605q;

    /* renamed from: a */
    public Activity f606a;

    public ImmLeaksCleaner(Activity activity) {
        this.f606a = activity;
    }

    @bc2
    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: h */
    public static void m1082h() {
        try {
            f605q = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f600b = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f601c = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f599a = declaredField3;
            declaredField3.setAccessible(true);
            f605q = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:29|30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0044 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo669g(@com.onedelhi.secure.mr2 com.onedelhi.secure.a32 r3, @com.onedelhi.secure.mr2 androidx.lifecycle.C0690e.C0692b r4) {
        /*
            r2 = this;
            androidx.lifecycle.e$b r3 = androidx.lifecycle.C0690e.C0692b.ON_DESTROY
            if (r4 == r3) goto L_0x0005
            return
        L_0x0005:
            int r3 = f605q
            if (r3 != 0) goto L_0x000c
            m1082h()
        L_0x000c:
            int r3 = f605q
            r4 = 1
            if (r3 != r4) goto L_0x004e
            android.app.Activity r3 = r2.f606a
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.reflect.Field r4 = f599a     // Catch:{ IllegalAccessException -> 0x004e }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalAccessException -> 0x004e }
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            monitor-enter(r4)
            java.lang.reflect.Field r0 = f600b     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            if (r0 != 0) goto L_0x0031
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0031:
            boolean r0 = r0.isAttachedToWindow()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0039
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0039:
            java.lang.reflect.Field r0 = f601c     // Catch:{ IllegalAccessException -> 0x0044 }
            r1 = 0
            r0.set(r3, r1)     // Catch:{ IllegalAccessException -> 0x0044 }
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            r3.isActive()
            goto L_0x004e
        L_0x0044:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0046:
            r3 = move-exception
            goto L_0x004c
        L_0x0048:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x004a:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x004c:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            throw r3
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.ImmLeaksCleaner.mo669g(com.onedelhi.secure.a32, androidx.lifecycle.e$b):void");
    }
}
