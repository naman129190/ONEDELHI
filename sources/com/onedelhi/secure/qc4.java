package com.onedelhi.secure;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.C1186a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class qc4 {

    /* renamed from: a */
    public static final String f19080a = "ThumbStreamOpener";

    /* renamed from: b */
    public static final s21 f19081b = new s21();

    /* renamed from: a */
    public final ContentResolver f19082a;

    /* renamed from: a */
    public final oc4 f19083a;

    /* renamed from: a */
    public final C3131pa f19084a;

    /* renamed from: a */
    public final s21 f19085a;

    /* renamed from: a */
    public final List<ImageHeaderParser> f19086a;

    public qc4(List<ImageHeaderParser> list, oc4 oc4, C3131pa paVar, ContentResolver contentResolver) {
        this(list, f19081b, oc4, paVar, contentResolver);
    }

    public qc4(List<ImageHeaderParser> list, s21 s21, oc4 oc4, C3131pa paVar, ContentResolver contentResolver) {
        this.f19085a = s21;
        this.f19083a = oc4;
        this.f19084a = paVar;
        this.f19082a = contentResolver;
        this.f19086a = list;
    }

    /* renamed from: a */
    public int mo23098a(Uri uri) {
        InputStream inputStream = null;
        try {
            InputStream openInputStream = this.f19082a.openInputStream(uri);
            int b = C1186a.m7600b(this.f19086a, openInputStream, this.f19084a);
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (IOException unused) {
                }
            }
            return b;
        } catch (IOException | NullPointerException e) {
            if (Log.isLoggable(f19080a, 3)) {
                Log.d(f19080a, "Failed to open uri: " + uri, e);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x002d A[Catch:{ all -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004b  */
    @com.onedelhi.secure.ts2
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo23099b(@com.onedelhi.secure.mr2 android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            com.onedelhi.secure.oc4 r2 = r6.f19083a     // Catch:{ SecurityException -> 0x0024, all -> 0x0022 }
            android.database.Cursor r2 = r2.mo20301a(r7)     // Catch:{ SecurityException -> 0x0024, all -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            boolean r3 = r2.moveToFirst()     // Catch:{ SecurityException -> 0x001a }
            if (r3 == 0) goto L_0x001c
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch:{ SecurityException -> 0x001a }
            r2.close()
            return r7
        L_0x001a:
            r3 = move-exception
            goto L_0x0026
        L_0x001c:
            if (r2 == 0) goto L_0x0021
            r2.close()
        L_0x0021:
            return r1
        L_0x0022:
            r7 = move-exception
            goto L_0x0049
        L_0x0024:
            r3 = move-exception
            r2 = r1
        L_0x0026:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x0041
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0047 }
            r4.<init>()     // Catch:{ all -> 0x0047 }
            java.lang.String r5 = "Failed to query for thumbnail for Uri: "
            r4.append(r5)     // Catch:{ all -> 0x0047 }
            r4.append(r7)     // Catch:{ all -> 0x0047 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0047 }
            android.util.Log.d(r0, r7, r3)     // Catch:{ all -> 0x0047 }
        L_0x0041:
            if (r2 == 0) goto L_0x0046
            r2.close()
        L_0x0046:
            return r1
        L_0x0047:
            r7 = move-exception
            r1 = r2
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            r1.close()
        L_0x004e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qc4.mo23099b(android.net.Uri):java.lang.String");
    }

    /* renamed from: c */
    public final boolean mo23100c(File file) {
        return this.f19085a.mo24173a(file) && 0 < this.f19085a.mo24175c(file);
    }

    /* renamed from: d */
    public InputStream mo23101d(Uri uri) throws FileNotFoundException {
        String b = mo23099b(uri);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        File b2 = this.f19085a.mo24174b(b);
        if (!mo23100c(b2)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(b2);
        try {
            return this.f19082a.openInputStream(fromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
        }
    }
}
