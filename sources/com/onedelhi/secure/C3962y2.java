package com.onedelhi.secure;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.DragEvent;
import android.view.View;
import com.onedelhi.secure.hl3;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.onedelhi.secure.y2 */
public class C3962y2 extends r70 {

    /* renamed from: a */
    public static C3972j f22862a;

    /* renamed from: com.onedelhi.secure.y2$a */
    public class C3963a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f22863a;

        /* renamed from: a */
        public final /* synthetic */ String[] f22864a;

        /* renamed from: n */
        public final /* synthetic */ int f22865n;

        public C3963a(String[] strArr, Activity activity, int i) {
            this.f22864a = strArr;
            this.f22863a = activity;
            this.f22865n = i;
        }

        public void run() {
            int[] iArr = new int[this.f22864a.length];
            PackageManager packageManager = this.f22863a.getPackageManager();
            String packageName = this.f22863a.getPackageName();
            int length = this.f22864a.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f22864a[i], packageName);
            }
            ((C3971i) this.f22863a).onRequestPermissionsResult(this.f22865n, this.f22864a, iArr);
        }
    }

    @sj3(16)
    /* renamed from: com.onedelhi.secure.y2$b */
    public static class C3964b {
        @pn0
        /* renamed from: a */
        public static void m31874a(Activity activity) {
            activity.finishAffinity();
        }

        @pn0
        /* renamed from: b */
        public static void m31875b(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        @pn0
        /* renamed from: c */
        public static void m31876c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    @sj3(21)
    /* renamed from: com.onedelhi.secure.y2$c */
    public static class C3965c {
        @pn0
        /* renamed from: a */
        public static void m31877a(Activity activity) {
            activity.finishAfterTransition();
        }

        @pn0
        /* renamed from: b */
        public static void m31878b(Activity activity) {
            activity.postponeEnterTransition();
        }

        @pn0
        /* renamed from: c */
        public static void m31879c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        @pn0
        /* renamed from: d */
        public static void m31880d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        @pn0
        /* renamed from: e */
        public static void m31881e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    @sj3(22)
    /* renamed from: com.onedelhi.secure.y2$d */
    public static class C3966d {
        @pn0
        /* renamed from: a */
        public static Uri m31882a(Activity activity) {
            return activity.getReferrer();
        }
    }

    @sj3(23)
    /* renamed from: com.onedelhi.secure.y2$e */
    public static class C3967e {
        @pn0
        /* renamed from: a */
        public static void m31883a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        @pn0
        /* renamed from: b */
        public static void m31884b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        @pn0
        /* renamed from: c */
        public static boolean m31885c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    @sj3(28)
    /* renamed from: com.onedelhi.secure.y2$f */
    public static class C3968f {
        @pn0
        /* renamed from: a */
        public static <T> T m31886a(Activity activity, int i) {
            return activity.requireViewById(i);
        }
    }

    @sj3(30)
    /* renamed from: com.onedelhi.secure.y2$g */
    public static class C3969g {
        @pn0
        /* renamed from: a */
        public static Display m31887a(ContextWrapper contextWrapper) {
            return contextWrapper.getDisplay();
        }

        @pn0
        /* renamed from: b */
        public static void m31888b(@mr2 Activity activity, @ts2 t82 t82, @ts2 Bundle bundle) {
            activity.setLocusContext(t82 == null ? null : t82.mo24775c(), bundle);
        }
    }

    @sj3(31)
    /* renamed from: com.onedelhi.secure.y2$h */
    public static class C3970h {
        @pn0
        /* renamed from: a */
        public static boolean m31889a(@mr2 Activity activity) {
            return activity.isLaunchedFromBubble();
        }
    }

    /* renamed from: com.onedelhi.secure.y2$i */
    public interface C3971i {
        void onRequestPermissionsResult(int i, @mr2 String[] strArr, @mr2 int[] iArr);
    }

    /* renamed from: com.onedelhi.secure.y2$j */
    public interface C3972j {
        /* renamed from: a */
        boolean mo27165a(@mr2 Activity activity, @js1(from = 0) int i, int i2, @ts2 Intent intent);

        /* renamed from: b */
        boolean mo27166b(@mr2 Activity activity, @mr2 String[] strArr, @js1(from = 0) int i);
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: com.onedelhi.secure.y2$k */
    public interface C3973k {
        /* renamed from: X */
        void mo4455X(int i);
    }

    @sj3(21)
    /* renamed from: com.onedelhi.secure.y2$l */
    public static class C3974l extends SharedElementCallback {

        /* renamed from: a */
        public final px3 f22866a;

        public C3974l(px3 px3) {
            this.f22866a = px3;
        }

        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f22866a.mo22679b(view, matrix, rectF);
        }

        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f22866a.mo22680c(context, parcelable);
        }

        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f22866a.mo22681d(list, map);
        }

        public void onRejectSharedElements(List<View> list) {
            this.f22866a.mo22682e(list);
        }

        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f22866a.mo22683f(list, list2, list3);
        }

        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f22866a.mo22684g(list, list2, list3);
        }

        @sj3(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f22866a.mo22685h(list, list2, new C7427z2(onSharedElementsReadyListener));
        }
    }

    @Deprecated
    /* renamed from: A */
    public static boolean m31853A(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    /* renamed from: B */
    public static boolean m31854B(@mr2 Activity activity) {
        int i = Build.VERSION.SDK_INT;
        return i >= 31 ? C3970h.m31889a(activity) : i == 30 ? (C3969g.m31887a(activity) == null || C3969g.m31887a(activity).getDisplayId() == 0) ? false : true : (i != 29 || activity.getWindowManager().getDefaultDisplay() == null || activity.getWindowManager().getDefaultDisplay().getDisplayId() == 0) ? false : true;
    }

    /* renamed from: C */
    public static /* synthetic */ void m31855C(Activity activity) {
        if (!activity.isFinishing() && !C2291h3.m16455i(activity)) {
            activity.recreate();
        }
    }

    /* renamed from: D */
    public static void m31856D(@mr2 Activity activity) {
        C3965c.m31878b(activity);
    }

    /* renamed from: E */
    public static void m31857E(@mr2 Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new C7215x2(activity));
        }
    }

    @ts2
    /* renamed from: F */
    public static qo0 m31858F(@mr2 Activity activity, @mr2 DragEvent dragEvent) {
        return qo0.m25866b(activity, dragEvent);
    }

    /* renamed from: G */
    public static void m31859G(@mr2 Activity activity, @mr2 String[] strArr, @js1(from = 0) int i) {
        C3972j jVar = f22862a;
        if (jVar == null || !jVar.mo27166b(activity, strArr, i)) {
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (!TextUtils.isEmpty(strArr[i2])) {
                    i2++;
                } else {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof C3973k) {
                    ((C3973k) activity).mo4455X(i);
                }
                C3967e.m31884b(activity, strArr, i);
            } else if (activity instanceof C3971i) {
                new Handler(Looper.getMainLooper()).post(new C3963a(strArr, activity, i));
            }
        }
    }

    @mr2
    /* renamed from: H */
    public static <T extends View> T m31860H(@mr2 Activity activity, @mo1 int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) C3968f.m31886a(activity, i);
        }
        T findViewById = activity.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    /* renamed from: I */
    public static void m31861I(@mr2 Activity activity, @ts2 px3 px3) {
        C3965c.m31879c(activity, px3 != null ? new C3974l(px3) : null);
    }

    /* renamed from: J */
    public static void m31862J(@mr2 Activity activity, @ts2 px3 px3) {
        C3965c.m31880d(activity, px3 != null ? new C3974l(px3) : null);
    }

    /* renamed from: K */
    public static void m31863K(@mr2 Activity activity, @ts2 t82 t82, @ts2 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 30) {
            C3969g.m31888b(activity, t82, bundle);
        }
    }

    /* renamed from: L */
    public static void m31864L(@ts2 C3972j jVar) {
        f22862a = jVar;
    }

    /* renamed from: M */
    public static boolean m31865M(@mr2 Activity activity, @mr2 String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C3967e.m31885c(activity, str);
        }
        return false;
    }

    /* renamed from: N */
    public static void m31866N(@mr2 Activity activity, @mr2 Intent intent, int i, @ts2 Bundle bundle) {
        C3964b.m31875b(activity, intent, i, bundle);
    }

    /* renamed from: O */
    public static void m31867O(@mr2 Activity activity, @mr2 IntentSender intentSender, int i, @ts2 Intent intent, int i2, int i3, int i4, @ts2 Bundle bundle) throws IntentSender.SendIntentException {
        C3964b.m31876c(activity, intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: P */
    public static void m31868P(@mr2 Activity activity) {
        C3965c.m31881e(activity);
    }

    /* renamed from: w */
    public static void m31870w(@mr2 Activity activity) {
        C3964b.m31874a(activity);
    }

    /* renamed from: x */
    public static void m31871x(@mr2 Activity activity) {
        C3965c.m31877a(activity);
    }

    @ts2
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: y */
    public static C3972j m31872y() {
        return f22862a;
    }

    @ts2
    /* renamed from: z */
    public static Uri m31873z(@mr2 Activity activity) {
        if (Build.VERSION.SDK_INT >= 22) {
            return C3966d.m31882a(activity);
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }
}
