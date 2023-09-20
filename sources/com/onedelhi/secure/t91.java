package com.onedelhi.secure;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onedelhi.secure.aa1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class t91 {

    /* renamed from: a */
    public static final Comparator<byte[]> f20708a = s91.f34938a;

    @sj3(16)
    /* renamed from: com.onedelhi.secure.t91$a */
    public static class C3579a {
        @pn0
        /* renamed from: a */
        public static Cursor m28211a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* renamed from: b */
    public static List<byte[]> m28204b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: c */
    public static boolean m28205c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static List<List<byte[]>> m28206d(u91 u91, Resources resources) {
        return u91.mo25458b() != null ? u91.mo25458b() : z91.m32937c(resources, u91.mo25459c());
    }

    @mr2
    /* renamed from: e */
    public static aa1.C1674b m28207e(@mr2 Context context, @mr2 u91 u91, @ts2 CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo f = m28208f(context.getPackageManager(), u91, context.getResources());
        return f == null ? aa1.C1674b.m10960a(1, (aa1.C1675c[]) null) : aa1.C1674b.m10960a(0, m28210h(context, u91, f.authority, cancellationSignal));
    }

    @hw4
    @ts2
    /* renamed from: f */
    public static ProviderInfo m28208f(@mr2 PackageManager packageManager, @mr2 u91 u91, @ts2 Resources resources) throws PackageManager.NameNotFoundException {
        String f = u91.mo25462f();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(f, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + f);
        } else if (resolveContentProvider.packageName.equals(u91.mo25463g())) {
            List<byte[]> b = m28204b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(b, f20708a);
            List<List<byte[]>> d = m28206d(u91, resources);
            for (int i = 0; i < d.size(); i++) {
                ArrayList arrayList = new ArrayList(d.get(i));
                Collections.sort(arrayList, f20708a);
                if (m28205c(b, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + f + ", but package was not " + u91.mo25463g());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ int m28209g(byte[] r4, byte[] r5) {
        /*
            int r0 = r4.length
            int r1 = r5.length
            if (r0 == r1) goto L_0x0008
            int r4 = r4.length
            int r5 = r5.length
        L_0x0006:
            int r4 = r4 - r5
            return r4
        L_0x0008:
            r0 = 0
            r1 = 0
        L_0x000a:
            int r2 = r4.length
            if (r1 >= r2) goto L_0x001b
            byte r2 = r4[r1]
            byte r3 = r5[r1]
            if (r2 == r3) goto L_0x0018
            byte r4 = r4[r1]
            byte r5 = r5[r1]
            goto L_0x0006
        L_0x0018:
            int r1 = r1 + 1
            goto L_0x000a
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.t91.m28209g(byte[], byte[]):int");
    }

    @hw4
    @mr2
    /* renamed from: h */
    public static aa1.C1675c[] m28210h(Context context, u91 u91, String str, CancellationSignal cancellationSignal) {
        boolean z;
        int i;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme(FirebaseAnalytics.C4305d.f24947P).authority(str2).build();
        Uri build2 = new Uri.Builder().scheme(FirebaseAnalytics.C4305d.f24947P).authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            cursor = C3579a.m28211a(context.getContentResolver(), build, new String[]{"_id", aa1.C1673a.f8924a, aa1.C1673a.f8926b, aa1.C1673a.f8928c, aa1.C1673a.f8930d, aa1.C1673a.f8931e, aa1.C1673a.f8932f}, "query = ?", new String[]{u91.mo25464h()}, (String) null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex(aa1.C1673a.f8932f);
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex(aa1.C1673a.f8924a);
                int columnIndex4 = cursor.getColumnIndex(aa1.C1673a.f8926b);
                int columnIndex5 = cursor.getColumnIndex(aa1.C1673a.f8930d);
                int columnIndex6 = cursor.getColumnIndex(aa1.C1673a.f8931e);
                while (cursor.moveToNext()) {
                    int i2 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i3 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    int i4 = i2;
                    Uri withAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    int i5 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        i = i4;
                        z = false;
                    } else {
                        i = i4;
                        z = true;
                    }
                    arrayList2.add(aa1.C1675c.m10963a(withAppendedId, i3, i5, z, i));
                }
                arrayList = arrayList2;
            }
            return (aa1.C1675c[]) arrayList.toArray(new aa1.C1675c[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
