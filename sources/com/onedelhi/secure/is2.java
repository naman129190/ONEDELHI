package com.onedelhi.secure;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import com.onedelhi.secure.es2;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@sj3(16)
public class is2 {

    /* renamed from: a */
    public static final Object f13812a = new Object();

    /* renamed from: a */
    public static final String f13813a = "NotificationCompat";

    /* renamed from: a */
    public static Field f13814a = null;

    /* renamed from: a */
    public static boolean f13815a = false;

    /* renamed from: b */
    public static final Object f13816b = new Object();

    /* renamed from: b */
    public static final String f13817b = "android.support.dataRemoteInputs";

    /* renamed from: b */
    public static Field f13818b = null;

    /* renamed from: b */
    public static boolean f13819b = false;

    /* renamed from: c */
    public static final String f13820c = "android.support.allowGeneratedReplies";

    /* renamed from: c */
    public static Field f13821c = null;

    /* renamed from: d */
    public static final String f13822d = "icon";

    /* renamed from: d */
    public static Field f13823d = null;

    /* renamed from: e */
    public static final String f13824e = "title";

    /* renamed from: e */
    public static Field f13825e = null;

    /* renamed from: f */
    public static final String f13826f = "actionIntent";

    /* renamed from: g */
    public static final String f13827g = "extras";

    /* renamed from: h */
    public static final String f13828h = "remoteInputs";

    /* renamed from: i */
    public static final String f13829i = "dataOnlyRemoteInputs";

    /* renamed from: j */
    public static final String f13830j = "resultKey";

    /* renamed from: k */
    public static final String f13831k = "label";

    /* renamed from: l */
    public static final String f13832l = "choices";

    /* renamed from: m */
    public static final String f13833m = "allowFreeFormInput";

    /* renamed from: n */
    public static final String f13834n = "allowedDataTypes";

    /* renamed from: o */
    public static final String f13835o = "semanticAction";

    /* renamed from: p */
    public static final String f13836p = "showsUserInterface";

    /* renamed from: a */
    public static SparseArray<Bundle> m17816a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: b */
    public static boolean m17817b() {
        if (f13819b) {
            return false;
        }
        try {
            if (f13818b == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                f13821c = cls.getDeclaredField("icon");
                f13823d = cls.getDeclaredField(f13824e);
                f13825e = cls.getDeclaredField(f13826f);
                Field declaredField = Notification.class.getDeclaredField(es2.C2101r.f11621d);
                f13818b = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException | NoSuchFieldException e) {
            Log.e(f13813a, "Unable to access notification actions", e);
            f13819b = true;
        }
        return !f13819b;
    }

    /* renamed from: c */
    public static ai3 m17818c(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f13834n);
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new ai3(bundle.getString(f13830j), bundle.getCharSequence("label"), bundle.getCharSequenceArray(f13832l), bundle.getBoolean(f13833m), 0, bundle.getBundle("extras"), hashSet);
    }

    /* renamed from: d */
    public static ai3[] m17819d(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        ai3[] ai3Arr = new ai3[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            ai3Arr[i] = m17818c(bundleArr[i]);
        }
        return ai3Arr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r5 = r5.getSparseParcelableArray(com.onedelhi.secure.hs2.f13246e);
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.es2.C2072b m17820e(android.app.Notification r5, int r6) {
        /*
            java.lang.Object r0 = f13816b
            monitor-enter(r0)
            r1 = 0
            java.lang.Object[] r2 = m17823h(r5)     // Catch:{ IllegalAccessException -> 0x0040 }
            if (r2 == 0) goto L_0x004b
            r2 = r2[r6]     // Catch:{ IllegalAccessException -> 0x0040 }
            android.os.Bundle r5 = m17826k(r5)     // Catch:{ IllegalAccessException -> 0x0040 }
            if (r5 == 0) goto L_0x0021
            java.lang.String r3 = "android.support.actionExtras"
            android.util.SparseArray r5 = r5.getSparseParcelableArray(r3)     // Catch:{ IllegalAccessException -> 0x0040 }
            if (r5 == 0) goto L_0x0021
            java.lang.Object r5 = r5.get(r6)     // Catch:{ IllegalAccessException -> 0x0040 }
            android.os.Bundle r5 = (android.os.Bundle) r5     // Catch:{ IllegalAccessException -> 0x0040 }
            goto L_0x0022
        L_0x0021:
            r5 = r1
        L_0x0022:
            java.lang.reflect.Field r6 = f13821c     // Catch:{ IllegalAccessException -> 0x0040 }
            int r6 = r6.getInt(r2)     // Catch:{ IllegalAccessException -> 0x0040 }
            java.lang.reflect.Field r3 = f13823d     // Catch:{ IllegalAccessException -> 0x0040 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ IllegalAccessException -> 0x0040 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ IllegalAccessException -> 0x0040 }
            java.lang.reflect.Field r4 = f13825e     // Catch:{ IllegalAccessException -> 0x0040 }
            java.lang.Object r2 = r4.get(r2)     // Catch:{ IllegalAccessException -> 0x0040 }
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2     // Catch:{ IllegalAccessException -> 0x0040 }
            com.onedelhi.secure.es2$b r5 = m17827l(r6, r3, r2, r5)     // Catch:{ IllegalAccessException -> 0x0040 }
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            return r5
        L_0x003e:
            r5 = move-exception
            goto L_0x004d
        L_0x0040:
            r5 = move-exception
            java.lang.String r6 = "NotificationCompat"
            java.lang.String r2 = "Unable to access notification actions"
            android.util.Log.e(r6, r2, r5)     // Catch:{ all -> 0x003e }
            r5 = 1
            f13819b = r5     // Catch:{ all -> 0x003e }
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            return r1
        L_0x004d:
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.is2.m17820e(android.app.Notification, int):com.onedelhi.secure.es2$b");
    }

    /* renamed from: f */
    public static int m17821f(Notification notification) {
        int length;
        synchronized (f13816b) {
            Object[] h = m17823h(notification);
            length = h != null ? h.length : 0;
        }
        return length;
    }

    /* renamed from: g */
    public static es2.C2072b m17822g(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        return new es2.C2072b(bundle.getInt("icon"), bundle.getCharSequence(f13824e), (PendingIntent) bundle.getParcelable(f13826f), bundle.getBundle("extras"), m17819d(m17824i(bundle, f13828h)), m17819d(m17824i(bundle, f13829i)), bundle2 != null ? bundle2.getBoolean(f13820c, false) : false, bundle.getInt(f13835o), bundle.getBoolean(f13836p), false, false);
    }

    /* renamed from: h */
    public static Object[] m17823h(Notification notification) {
        synchronized (f13816b) {
            if (!m17817b()) {
                return null;
            }
            try {
                Object[] objArr = (Object[]) f13818b.get(notification);
                return objArr;
            } catch (IllegalAccessException e) {
                Log.e(f13813a, "Unable to access notification actions", e);
                f13819b = true;
                return null;
            }
        }
    }

    /* renamed from: i */
    public static Bundle[] m17824i(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    /* renamed from: j */
    public static Bundle m17825j(es2.C2072b bVar) {
        Bundle bundle = new Bundle();
        IconCompat f = bVar.mo15292f();
        bundle.putInt("icon", f != null ? f.mo3774B() : 0);
        bundle.putCharSequence(f13824e, bVar.mo15296j());
        bundle.putParcelable(f13826f, bVar.mo15287a());
        Bundle bundle2 = bVar.mo15290d() != null ? new Bundle(bVar.mo15290d()) : new Bundle();
        bundle2.putBoolean(f13820c, bVar.mo15288b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray(f13828h, m17829n(bVar.mo15293g()));
        bundle.putBoolean(f13836p, bVar.mo15295i());
        bundle.putInt(f13835o, bVar.mo15294h());
        return bundle;
    }

    /* renamed from: k */
    public static Bundle m17826k(Notification notification) {
        String str;
        String str2;
        synchronized (f13812a) {
            if (f13815a) {
                return null;
            }
            try {
                if (f13814a == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e(f13813a, "Notification.extras field is not of type Bundle");
                        f13815a = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f13814a = declaredField;
                }
                Bundle bundle = (Bundle) f13814a.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f13814a.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                e = e;
                str = f13813a;
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f13815a = true;
                return null;
            } catch (NoSuchFieldException e2) {
                e = e2;
                str = f13813a;
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f13815a = true;
                return null;
            }
        }
    }

    /* renamed from: l */
    public static es2.C2072b m17827l(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        boolean z;
        ai3[] ai3Arr;
        ai3[] ai3Arr2;
        Bundle bundle2 = bundle;
        if (bundle2 != null) {
            ai3Arr2 = m17819d(m17824i(bundle2, hs2.f13247f));
            ai3Arr = m17819d(m17824i(bundle2, f13817b));
            z = bundle2.getBoolean(f13820c);
        } else {
            ai3Arr2 = null;
            ai3Arr = null;
            z = false;
        }
        return new es2.C2072b(i, charSequence, pendingIntent, bundle, ai3Arr2, ai3Arr, z, 0, true, false, false);
    }

    /* renamed from: m */
    public static Bundle m17828m(ai3 ai3) {
        Bundle bundle = new Bundle();
        bundle.putString(f13830j, ai3.mo13099o());
        bundle.putCharSequence("label", ai3.mo13098n());
        bundle.putCharSequenceArray(f13832l, ai3.mo13095h());
        bundle.putBoolean(f13833m, ai3.mo13093f());
        bundle.putBundle("extras", ai3.mo13097m());
        Set<String> g = ai3.mo13094g();
        if (g != null && !g.isEmpty()) {
            ArrayList arrayList = new ArrayList(g.size());
            for (String add : g) {
                arrayList.add(add);
            }
            bundle.putStringArrayList(f13834n, arrayList);
        }
        return bundle;
    }

    /* renamed from: n */
    public static Bundle[] m17829n(ai3[] ai3Arr) {
        if (ai3Arr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[ai3Arr.length];
        for (int i = 0; i < ai3Arr.length; i++) {
            bundleArr[i] = m17828m(ai3Arr[i]);
        }
        return bundleArr;
    }

    /* renamed from: o */
    public static Bundle m17830o(Notification.Builder builder, es2.C2072b bVar) {
        IconCompat f = bVar.mo15292f();
        builder.addAction(f != null ? f.mo3774B() : 0, bVar.mo15296j(), bVar.mo15287a());
        Bundle bundle = new Bundle(bVar.mo15290d());
        if (bVar.mo15293g() != null) {
            bundle.putParcelableArray(hs2.f13247f, m17829n(bVar.mo15293g()));
        }
        if (bVar.mo15289c() != null) {
            bundle.putParcelableArray(f13817b, m17829n(bVar.mo15289c()));
        }
        bundle.putBoolean(f13820c, bVar.mo15288b());
        return bundle;
    }
}
