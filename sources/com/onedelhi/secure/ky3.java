package com.onedelhi.secure;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import androidx.appcompat.widget.C0358b;
import androidx.core.graphics.drawable.IconCompat;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.iy3;
import com.onedelhi.secure.jy3;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ky3 {

    /* renamed from: a */
    public static final int f15109a = 1;

    /* renamed from: a */
    public static volatile jy3<?> f15110a = null;
    @hw4

    /* renamed from: a */
    public static final String f15111a = "com.android.launcher.action.INSTALL_SHORTCUT";

    /* renamed from: a */
    public static volatile List<hy3> f15112a = null;

    /* renamed from: b */
    public static final int f15113b = 2;
    @hw4

    /* renamed from: b */
    public static final String f15114b = "com.android.launcher.permission.INSTALL_SHORTCUT";

    /* renamed from: c */
    public static final int f15115c = 4;

    /* renamed from: c */
    public static final String f15116c = "android.intent.extra.shortcut.ID";

    /* renamed from: d */
    public static final int f15117d = 8;

    /* renamed from: d */
    public static final String f15118d = "androidx.core.content.pm.SHORTCUT_LISTENER";

    /* renamed from: e */
    public static final int f15119e = 96;

    /* renamed from: e */
    public static final String f15120e = "androidx.core.content.pm.shortcut_listener_impl";

    /* renamed from: f */
    public static final int f15121f = 48;

    /* renamed from: com.onedelhi.secure.ky3$a */
    public class C2682a extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ IntentSender f15122a;

        public C2682a(IntentSender intentSender) {
            this.f15122a = intentSender;
        }

        public void onReceive(Context context, Intent intent) {
            try {
                this.f15122a.sendIntent(context, 0, (Intent) null, (IntentSender.OnFinished) null, (Handler) null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    @sj3(25)
    /* renamed from: com.onedelhi.secure.ky3$b */
    public static class C2683b {
        /* renamed from: a */
        public static String m20112a(@mr2 List<ShortcutInfo> list) {
            int i = -1;
            String str = null;
            for (ShortcutInfo next : list) {
                if (next.getRank() > i) {
                    String id = next.getId();
                    str = id;
                    i = next.getRank();
                }
            }
            return str;
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.ky3$c */
    public @interface C2684c {
    }

    @hw4
    /* renamed from: A */
    public static void m20083A(List<hy3> list) {
        f15112a = list;
    }

    @hw4
    /* renamed from: B */
    public static void m20084B(jy3<Void> jy3) {
        f15110a = jy3;
    }

    /* renamed from: C */
    public static boolean m20085C(@mr2 Context context, @mr2 List<iy3> list) {
        List<iy3> w = m20108w(list, 1);
        int i = Build.VERSION.SDK_INT;
        if (i <= 29) {
            m20088c(context, w);
        }
        if (i >= 25) {
            ArrayList arrayList = new ArrayList();
            for (iy3 H : w) {
                arrayList.add(H.mo18020H());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList)) {
                return false;
            }
        }
        m20100o(context).mo18803a(w);
        for (hy3 d : m20099n(context)) {
            d.mo17471d(list);
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m20086a(@mr2 Context context, @mr2 List<iy3> list) {
        List<iy3> w = m20108w(list, 1);
        int i = Build.VERSION.SDK_INT;
        if (i <= 29) {
            m20088c(context, w);
        }
        if (i >= 25) {
            ArrayList arrayList = new ArrayList();
            for (iy3 H : w) {
                arrayList.add(H.mo18020H());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList)) {
                return false;
            }
        }
        m20100o(context).mo18803a(w);
        for (hy3 b : m20099n(context)) {
            b.mo17469b(list);
        }
        return true;
    }

    @hw4
    /* renamed from: b */
    public static boolean m20087b(@mr2 Context context, @mr2 iy3 iy3) {
        Bitmap decodeStream;
        IconCompat iconCompat = iy3.f13917a;
        if (iconCompat == null) {
            return false;
        }
        int i = iconCompat.f3321a;
        if (i != 6 && i != 4) {
            return true;
        }
        InputStream G = iconCompat.mo3778G(context);
        if (G == null || (decodeStream = BitmapFactory.decodeStream(G)) == null) {
            return false;
        }
        iy3.f13917a = i == 6 ? IconCompat.m3646r(decodeStream) : IconCompat.m3649u(decodeStream);
        return true;
    }

    @hw4
    /* renamed from: c */
    public static void m20088c(@mr2 Context context, @mr2 List<iy3> list) {
        for (iy3 iy3 : new ArrayList(list)) {
            if (!m20087b(context, iy3)) {
                list.remove(iy3);
            }
        }
    }

    @mr2
    /* renamed from: d */
    public static Intent m20089d(@mr2 Context context, @mr2 iy3 iy3) {
        Intent createShortcutResultIntent = Build.VERSION.SDK_INT >= 26 ? ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(iy3.mo18020H()) : null;
        if (createShortcutResultIntent == null) {
            createShortcutResultIntent = new Intent();
        }
        return iy3.mo18021a(createShortcutResultIntent);
    }

    /* renamed from: e */
    public static void m20090e(@mr2 Context context, @mr2 List<String> list, @ts2 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).disableShortcuts(list, charSequence);
        }
        m20100o(context).mo18806d(list);
        for (hy3 c : m20099n(context)) {
            c.mo17470c(list);
        }
    }

    /* renamed from: f */
    public static void m20091f(@mr2 Context context, @mr2 List<iy3> list) {
        List<iy3> w = m20108w(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(list.size());
            for (iy3 iy3 : w) {
                arrayList.add(iy3.f13920a);
            }
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).enableShortcuts(arrayList);
        }
        m20100o(context).mo18803a(w);
        for (hy3 b : m20099n(context)) {
            b.mo17469b(list);
        }
    }

    @mr2
    /* renamed from: g */
    public static List<iy3> m20092g(@mr2 Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
            for (ShortcutInfo aVar : dynamicShortcuts) {
                arrayList.add(new iy3.C2463a(context, aVar).mo18044c());
            }
            return arrayList;
        }
        try {
            return m20100o(context).mo18804b();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    /* renamed from: h */
    public static int m20093h(@mr2 Context context, boolean z) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(C0358b.f1779e);
        int max = Math.max(1, activityManager == null || activityManager.isLowRamDevice() ? 48 : 96);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (((float) max) * ((z ? displayMetrics.xdpi : displayMetrics.ydpi) / 160.0f));
    }

    /* renamed from: i */
    public static int m20094i(@mr2 Context context) {
        k43.m19455l(context);
        return Build.VERSION.SDK_INT >= 25 ? ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxHeight() : m20093h(context, false);
    }

    /* renamed from: j */
    public static int m20095j(@mr2 Context context) {
        k43.m19455l(context);
        return Build.VERSION.SDK_INT >= 25 ? ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxWidth() : m20093h(context, true);
    }

    /* renamed from: k */
    public static int m20096k(@mr2 Context context) {
        k43.m19455l(context);
        if (Build.VERSION.SDK_INT >= 25) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    @hw4
    /* renamed from: l */
    public static List<hy3> m20097l() {
        return f15112a;
    }

    /* renamed from: m */
    public static String m20098m(@mr2 List<iy3> list) {
        int i = -1;
        String str = null;
        for (iy3 next : list) {
            if (next.mo18037v() > i) {
                String k = next.mo18030k();
                str = k;
                i = next.mo18037v();
            }
        }
        return str;
    }

    /* renamed from: n */
    public static List<hy3> m20099n(Context context) {
        Bundle bundle;
        String string;
        if (f15112a == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(f15118d);
            intent.setPackage(context.getPackageName());
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 128)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (!(activityInfo == null || (bundle = activityInfo.metaData) == null || (string = bundle.getString(f15120e)) == null)) {
                    try {
                        arrayList.add((hy3) Class.forName(string, false, ky3.class.getClassLoader()).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f15112a == null) {
                f15112a = arrayList;
            }
        }
        return f15112a;
    }

    /* renamed from: o */
    public static jy3<?> m20100o(Context context) {
        if (f15110a == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    f15110a = (jy3) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, ky3.class.getClassLoader()).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
                } catch (Exception unused) {
                }
            }
            if (f15110a == null) {
                f15110a = new jy3.C2587a();
            }
        }
        return f15110a;
    }

    @mr2
    /* renamed from: p */
    public static List<iy3> m20101p(@mr2 Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            return iy3.m17984c(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(i));
        }
        if (i2 >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            ArrayList arrayList = new ArrayList();
            if ((i & 1) != 0) {
                arrayList.addAll(shortcutManager.getManifestShortcuts());
            }
            if ((i & 2) != 0) {
                arrayList.addAll(shortcutManager.getDynamicShortcuts());
            }
            if ((i & 4) != 0) {
                arrayList.addAll(shortcutManager.getPinnedShortcuts());
            }
            return iy3.m17984c(context, arrayList);
        }
        if ((i & 2) != 0) {
            try {
                return m20100o(context).mo18804b();
            } catch (Exception unused) {
            }
        }
        return Collections.emptyList();
    }

    /* renamed from: q */
    public static boolean m20102q(@mr2 Context context) {
        k43.m19455l(context);
        return Build.VERSION.SDK_INT >= 25 ? ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRateLimitingActive() : m20101p(context, 3).size() == m20096k(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m20103r(@com.onedelhi.secure.mr2 android.content.Context r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x0013
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r4 = r4.getSystemService(r0)
            android.content.pm.ShortcutManager r4 = (android.content.pm.ShortcutManager) r4
            boolean r4 = r4.isRequestPinShortcutSupported()
            return r4
        L_0x0013:
            java.lang.String r0 = "com.android.launcher.permission.INSTALL_SHORTCUT"
            int r1 = com.onedelhi.secure.r70.m26348a(r4, r0)
            r2 = 0
            if (r1 == 0) goto L_0x001d
            return r2
        L_0x001d:
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = "com.android.launcher.action.INSTALL_SHORTCUT"
            r1.<init>(r3)
            java.util.List r4 = r4.queryBroadcastReceivers(r1, r2)
            java.util.Iterator r4 = r4.iterator()
        L_0x0030:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x004e
            java.lang.Object r1 = r4.next()
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            android.content.pm.ActivityInfo r1 = r1.activityInfo
            java.lang.String r1 = r1.permission
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x004c
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0030
        L_0x004c:
            r4 = 1
            return r4
        L_0x004e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ky3.m20103r(android.content.Context):boolean");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: s */
    public static boolean m20104s(@com.onedelhi.secure.mr2 android.content.Context r6, @com.onedelhi.secure.mr2 com.onedelhi.secure.iy3 r7) {
        /*
            com.onedelhi.secure.k43.m19455l(r6)
            com.onedelhi.secure.k43.m19455l(r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 31
            if (r0 > r2) goto L_0x0030
            boolean r2 = r7.mo18017E(r1)
            if (r2 == 0) goto L_0x0030
            java.util.List r6 = m20099n(r6)
            java.util.Iterator r6 = r6.iterator()
        L_0x001b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r6.next()
            com.onedelhi.secure.hy3 r0 = (com.onedelhi.secure.hy3) r0
            java.util.List r2 = java.util.Collections.singletonList(r7)
            r0.mo17469b(r2)
            goto L_0x001b
        L_0x002f:
            return r1
        L_0x0030:
            int r2 = m20096k(r6)
            r3 = 0
            if (r2 != 0) goto L_0x0038
            return r3
        L_0x0038:
            r4 = 29
            if (r0 > r4) goto L_0x003f
            m20087b(r6, r7)
        L_0x003f:
            r4 = 30
            if (r0 < r4) goto L_0x0053
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r6.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            android.content.pm.ShortcutInfo r4 = r7.mo18020H()
            r0.pushDynamicShortcut(r4)
            goto L_0x008e
        L_0x0053:
            r4 = 25
            if (r0 < r4) goto L_0x008e
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r6.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            boolean r4 = r0.isRateLimitingActive()
            if (r4 == 0) goto L_0x0066
            return r3
        L_0x0066:
            java.util.List r4 = r0.getDynamicShortcuts()
            int r5 = r4.size()
            if (r5 < r2) goto L_0x007f
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.String r4 = com.onedelhi.secure.ky3.C2683b.m20112a(r4)
            r5[r3] = r4
            java.util.List r4 = java.util.Arrays.asList(r5)
            r0.removeDynamicShortcuts(r4)
        L_0x007f:
            android.content.pm.ShortcutInfo[] r4 = new android.content.pm.ShortcutInfo[r1]
            android.content.pm.ShortcutInfo r5 = r7.mo18020H()
            r4[r3] = r5
            java.util.List r4 = java.util.Arrays.asList(r4)
            r0.addDynamicShortcuts(r4)
        L_0x008e:
            com.onedelhi.secure.jy3 r0 = m20100o(r6)
            java.util.List r4 = r0.mo18804b()     // Catch:{ Exception -> 0x00ff, all -> 0x00da }
            int r5 = r4.size()     // Catch:{ Exception -> 0x00ff, all -> 0x00da }
            if (r5 < r2) goto L_0x00ab
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ Exception -> 0x00ff, all -> 0x00da }
            java.lang.String r4 = m20098m(r4)     // Catch:{ Exception -> 0x00ff, all -> 0x00da }
            r2[r3] = r4     // Catch:{ Exception -> 0x00ff, all -> 0x00da }
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch:{ Exception -> 0x00ff, all -> 0x00da }
            r0.mo18806d(r2)     // Catch:{ Exception -> 0x00ff, all -> 0x00da }
        L_0x00ab:
            com.onedelhi.secure.iy3[] r2 = new com.onedelhi.secure.iy3[r1]     // Catch:{ Exception -> 0x00ff, all -> 0x00da }
            r2[r3] = r7     // Catch:{ Exception -> 0x00ff, all -> 0x00da }
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch:{ Exception -> 0x00ff, all -> 0x00da }
            r0.mo18803a(r2)     // Catch:{ Exception -> 0x00ff, all -> 0x00da }
            java.util.List r0 = m20099n(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x00be:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00d2
            java.lang.Object r2 = r0.next()
            com.onedelhi.secure.hy3 r2 = (com.onedelhi.secure.hy3) r2
            java.util.List r3 = java.util.Collections.singletonList(r7)
            r2.mo17469b(r3)
            goto L_0x00be
        L_0x00d2:
            java.lang.String r7 = r7.mo18030k()
            m20109x(r6, r7)
            return r1
        L_0x00da:
            r0 = move-exception
            java.util.List r1 = m20099n(r6)
            java.util.Iterator r1 = r1.iterator()
        L_0x00e3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00f7
            java.lang.Object r2 = r1.next()
            com.onedelhi.secure.hy3 r2 = (com.onedelhi.secure.hy3) r2
            java.util.List r3 = java.util.Collections.singletonList(r7)
            r2.mo17469b(r3)
            goto L_0x00e3
        L_0x00f7:
            java.lang.String r7 = r7.mo18030k()
            m20109x(r6, r7)
            throw r0
        L_0x00ff:
            java.util.List r0 = m20099n(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x0107:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x011b
            java.lang.Object r1 = r0.next()
            com.onedelhi.secure.hy3 r1 = (com.onedelhi.secure.hy3) r1
            java.util.List r2 = java.util.Collections.singletonList(r7)
            r1.mo17469b(r2)
            goto L_0x0107
        L_0x011b:
            java.lang.String r7 = r7.mo18030k()
            m20109x(r6, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ky3.m20104s(android.content.Context, com.onedelhi.secure.iy3):boolean");
    }

    /* renamed from: t */
    public static void m20105t(@mr2 Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        }
        m20100o(context).mo18805c();
        for (hy3 a : m20099n(context)) {
            a.mo17468a();
        }
    }

    /* renamed from: u */
    public static void m20106u(@mr2 Context context, @mr2 List<String> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        }
        m20100o(context).mo18806d(list);
        for (hy3 c : m20099n(context)) {
            c.mo17470c(list);
        }
    }

    /* renamed from: v */
    public static void m20107v(@mr2 Context context, @mr2 List<String> list) {
        if (Build.VERSION.SDK_INT < 30) {
            m20106u(context, list);
            return;
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeLongLivedShortcuts(list);
        m20100o(context).mo18806d(list);
        for (hy3 c : m20099n(context)) {
            c.mo17470c(list);
        }
    }

    @mr2
    /* renamed from: w */
    public static List<iy3> m20108w(@mr2 List<iy3> list, int i) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 31) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (iy3 next : list) {
            if (next.mo18017E(i)) {
                arrayList.remove(next);
            }
        }
        return arrayList;
    }

    /* renamed from: x */
    public static void m20109x(@mr2 Context context, @mr2 String str) {
        k43.m19455l(context);
        k43.m19455l(str);
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        }
        for (hy3 e : m20099n(context)) {
            e.mo17472e(Collections.singletonList(str));
        }
    }

    /* renamed from: y */
    public static boolean m20110y(@mr2 Context context, @mr2 iy3 iy3, @ts2 IntentSender intentSender) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 31 && iy3.mo18017E(1)) {
            return false;
        }
        if (i >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(iy3.mo18020H(), intentSender);
        }
        if (!m20103r(context)) {
            return false;
        }
        Intent a = iy3.mo18021a(new Intent(f15111a));
        if (intentSender == null) {
            context.sendBroadcast(a);
            return true;
        }
        context.sendOrderedBroadcast(a, (String) null, new C2682a(intentSender), (Handler) null, -1, (String) null, (Bundle) null);
        return true;
    }

    /* renamed from: z */
    public static boolean m20111z(@mr2 Context context, @mr2 List<iy3> list) {
        k43.m19455l(context);
        k43.m19455l(list);
        List<iy3> w = m20108w(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(w.size());
            for (iy3 H : w) {
                arrayList.add(H.mo18020H());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList)) {
                return false;
            }
        }
        m20100o(context).mo18805c();
        m20100o(context).mo18803a(w);
        for (hy3 next : m20099n(context)) {
            next.mo17468a();
            next.mo17469b(list);
        }
        return true;
    }
}
