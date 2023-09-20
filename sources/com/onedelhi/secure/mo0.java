package com.onedelhi.secure;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;

public class mo0 extends AsyncTask<Uri, Integer, String> {

    /* renamed from: a */
    public static final /* synthetic */ boolean f32194a = false;

    /* renamed from: a */
    public Cursor f32195a;

    /* renamed from: a */
    public final Uri f32196a;

    /* renamed from: a */
    public final C6788ss f32197a;

    /* renamed from: a */
    public File f32198a;

    /* renamed from: a */
    public InputStream f32199a = null;

    /* renamed from: a */
    public String f32200a;

    /* renamed from: a */
    public final WeakReference<Context> f32201a;

    /* renamed from: b */
    public String f32202b = "";

    /* renamed from: b */
    public final WeakReference<Activity> f32203b;

    /* renamed from: com.onedelhi.secure.mo0$a */
    public class C6130a implements Runnable {
        public C6130a() {
        }

        public void run() {
            mo0.this.f32197a.mo34168h();
        }
    }

    static {
        Class<mo0> cls = mo0.class;
    }

    public mo0(Uri uri, Context context, C6788ss ssVar, Activity activity) {
        this.f32196a = uri;
        this.f32201a = new WeakReference<>(context);
        this.f32197a = ssVar;
        this.f32203b = new WeakReference<>(activity);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b3 A[Catch:{ all -> 0x0165, IOException -> 0x0163 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0119 A[Catch:{ IOException -> 0x015f }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0154 A[EDGE_INSN: B:74:0x0154->B:57:0x0154 ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String doInBackground(android.net.Uri... r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r2 = "/"
            java.lang.ref.WeakReference<android.content.Context> r0 = r1.f32201a
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 == 0) goto L_0x004e
            java.lang.String r3 = "Temp"
            java.io.File r3 = r0.getExternalFilesDir(r3)
            r1.f32198a = r3
            if (r3 == 0) goto L_0x002d
            boolean r3 = r3.exists()
            if (r3 != 0) goto L_0x002d
            java.io.File r3 = r1.f32198a
            boolean r3 = r3.mkdirs()
            if (r3 == 0) goto L_0x002d
            java.lang.String r3 = "PickiT : "
            java.lang.String r4 = "Temp folder createdd"
            android.util.Log.i(r3, r4)
        L_0x002d:
            android.content.ContentResolver r5 = r0.getContentResolver()
            android.net.Uri r6 = r1.f32196a
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r5.query(r6, r7, r8, r9, r10)
            r1.f32195a = r3
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ FileNotFoundException -> 0x004a }
            android.net.Uri r3 = r1.f32196a     // Catch:{ FileNotFoundException -> 0x004a }
            java.io.InputStream r0 = r0.openInputStream(r3)     // Catch:{ FileNotFoundException -> 0x004a }
            r1.f32199a = r0     // Catch:{ FileNotFoundException -> 0x004a }
            goto L_0x004e
        L_0x004a:
            r0 = move-exception
            r0.printStackTrace()
        L_0x004e:
            java.lang.ref.WeakReference<android.app.Activity> r0 = r1.f32203b
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            com.onedelhi.secure.mo0$a r3 = new com.onedelhi.secure.mo0$a
            r3.<init>()
            r0.runOnUiThread(r3)
            r3 = 0
            android.database.Cursor r0 = r1.f32195a     // Catch:{ all -> 0x0165 }
            r4 = -1
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r0.moveToFirst()     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x00ae
            android.net.Uri r0 = r1.f32196a     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r0.getScheme()     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x00ae
            android.net.Uri r0 = r1.f32196a     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r0.getScheme()     // Catch:{ all -> 0x0165 }
            java.lang.String r5 = "content"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x0090
            android.database.Cursor r0 = r1.f32195a     // Catch:{ all -> 0x0165 }
            java.lang.String r5 = "_size"
            int r0 = r0.getColumnIndex(r5)     // Catch:{ all -> 0x0165 }
            android.database.Cursor r5 = r1.f32195a     // Catch:{ all -> 0x0165 }
            long r5 = r5.getLong(r0)     // Catch:{ all -> 0x0165 }
        L_0x008e:
            int r0 = (int) r5     // Catch:{ all -> 0x0165 }
            goto L_0x00af
        L_0x0090:
            android.net.Uri r0 = r1.f32196a     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r0.getScheme()     // Catch:{ all -> 0x0165 }
            java.lang.String r5 = "file"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x00ae
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0165 }
            android.net.Uri r5 = r1.f32196a     // Catch:{ all -> 0x0165 }
            java.lang.String r5 = r5.getPath()     // Catch:{ all -> 0x0165 }
            r0.<init>(r5)     // Catch:{ all -> 0x0165 }
            long r5 = r0.length()     // Catch:{ all -> 0x0165 }
            goto L_0x008e
        L_0x00ae:
            r0 = -1
        L_0x00af:
            android.database.Cursor r5 = r1.f32195a     // Catch:{ IOException -> 0x0163 }
            if (r5 == 0) goto L_0x00b6
            r5.close()     // Catch:{ IOException -> 0x0163 }
        L_0x00b6:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0163 }
            r5.<init>()     // Catch:{ IOException -> 0x0163 }
            java.io.File r6 = r1.f32198a     // Catch:{ IOException -> 0x0163 }
            r5.append(r6)     // Catch:{ IOException -> 0x0163 }
            r5.append(r2)     // Catch:{ IOException -> 0x0163 }
            android.net.Uri r6 = r1.f32196a     // Catch:{ IOException -> 0x0163 }
            java.lang.ref.WeakReference<android.content.Context> r7 = r1.f32201a     // Catch:{ IOException -> 0x0163 }
            java.lang.Object r7 = r7.get()     // Catch:{ IOException -> 0x0163 }
            android.content.Context r7 = (android.content.Context) r7     // Catch:{ IOException -> 0x0163 }
            java.lang.String r6 = r1.mo40729c(r6, r7)     // Catch:{ IOException -> 0x0163 }
            r5.append(r6)     // Catch:{ IOException -> 0x0163 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0163 }
            r1.f32200a = r5     // Catch:{ IOException -> 0x0163 }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x0163 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0163 }
            r6.<init>()     // Catch:{ IOException -> 0x0163 }
            java.io.File r7 = r1.f32198a     // Catch:{ IOException -> 0x0163 }
            r6.append(r7)     // Catch:{ IOException -> 0x0163 }
            r6.append(r2)     // Catch:{ IOException -> 0x0163 }
            android.net.Uri r2 = r1.f32196a     // Catch:{ IOException -> 0x0163 }
            java.lang.ref.WeakReference<android.content.Context> r7 = r1.f32201a     // Catch:{ IOException -> 0x0163 }
            java.lang.Object r7 = r7.get()     // Catch:{ IOException -> 0x0163 }
            android.content.Context r7 = (android.content.Context) r7     // Catch:{ IOException -> 0x0163 }
            java.lang.String r2 = r1.mo40729c(r2, r7)     // Catch:{ IOException -> 0x0163 }
            r6.append(r2)     // Catch:{ IOException -> 0x0163 }
            java.lang.String r2 = r6.toString()     // Catch:{ IOException -> 0x0163 }
            r5.<init>(r2)     // Catch:{ IOException -> 0x0163 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x015f }
            java.io.InputStream r3 = r1.f32199a     // Catch:{ IOException -> 0x015f }
            r2.<init>(r3)     // Catch:{ IOException -> 0x015f }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x015f }
            r3.<init>(r5)     // Catch:{ IOException -> 0x015f }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ IOException -> 0x015f }
            r7 = 0
        L_0x0113:
            int r9 = r2.read(r6)     // Catch:{ IOException -> 0x015f }
            if (r9 == r4) goto L_0x0154
            boolean r10 = r16.isCancelled()     // Catch:{ IOException -> 0x015f }
            if (r10 != 0) goto L_0x0113
            long r10 = (long) r9
            long r7 = r7 + r10
            r10 = 0
            if (r0 == r4) goto L_0x014d
            r11 = 1
            java.lang.Integer[] r12 = new java.lang.Integer[r11]     // Catch:{ Exception -> 0x0139 }
            r13 = 100
            long r13 = r13 * r7
            r15 = r5
            long r4 = (long) r0
            long r13 = r13 / r4
            int r4 = (int) r13     // Catch:{ Exception -> 0x013a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x013a }
            r12[r10] = r4     // Catch:{ Exception -> 0x013a }
            r1.publishProgress(r12)     // Catch:{ Exception -> 0x013a }
            goto L_0x014e
        L_0x0139:
            r15 = r5
        L_0x013a:
            java.lang.String r4 = "PickiT -"
            java.lang.String r5 = "File size is less than 1"
            android.util.Log.i(r4, r5)     // Catch:{ IOException -> 0x015d }
            java.lang.Integer[] r4 = new java.lang.Integer[r11]     // Catch:{ IOException -> 0x015d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException -> 0x015d }
            r4[r10] = r5     // Catch:{ IOException -> 0x015d }
            r1.publishProgress(r4)     // Catch:{ IOException -> 0x015d }
            goto L_0x014e
        L_0x014d:
            r15 = r5
        L_0x014e:
            r3.write(r6, r10, r9)     // Catch:{ IOException -> 0x015d }
            r5 = r15
            r4 = -1
            goto L_0x0113
        L_0x0154:
            r15 = r5
            r3.flush()     // Catch:{ IOException -> 0x015d }
            r3.close()     // Catch:{ IOException -> 0x015d }
            r5 = r15
            goto L_0x017e
        L_0x015d:
            r0 = move-exception
            goto L_0x0161
        L_0x015f:
            r0 = move-exception
            r15 = r5
        L_0x0161:
            r3 = r15
            goto L_0x016e
        L_0x0163:
            r0 = move-exception
            goto L_0x016e
        L_0x0165:
            r0 = move-exception
            android.database.Cursor r2 = r1.f32195a     // Catch:{ IOException -> 0x0163 }
            if (r2 == 0) goto L_0x016d
            r2.close()     // Catch:{ IOException -> 0x0163 }
        L_0x016d:
            throw r0     // Catch:{ IOException -> 0x0163 }
        L_0x016e:
            java.lang.String r2 = r0.getMessage()
            java.lang.String r4 = "Pickit IOException = "
            android.util.Log.e(r4, r2)
            java.lang.String r0 = r0.getMessage()
            r1.f32202b = r0
            r5 = r3
        L_0x017e:
            java.lang.String r0 = r5.getAbsolutePath()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mo0.doInBackground(android.net.Uri[]):java.lang.String");
    }

    /* renamed from: c */
    public final String mo40729c(Uri uri, Context context) {
        String str = null;
        if (uri.getScheme() != null && uri.getScheme().equals(FirebaseAnalytics.C4305d.f24947P)) {
            Cursor query = context.getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
            if (query != null && query.moveToFirst()) {
                str = query.getString(query.getColumnIndex("_display_name"));
            }
            if (query != null) {
                query.close();
            }
        }
        if (str != null) {
            return str;
        }
        String path = uri.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
    }

    /* renamed from: d */
    public void onPostExecute(String str) {
        if (str == null) {
            this.f32197a.mo34169i(this.f32200a, true, false, this.f32202b);
        } else {
            this.f32197a.mo34169i(this.f32200a, true, true, "");
        }
    }

    /* renamed from: e */
    public void onProgressUpdate(Integer... numArr) {
        super.onProgressUpdate(numArr);
        this.f32197a.mo34166f(numArr[0].intValue());
    }

    public void onPreExecute() {
        this.f32197a.mo34167g();
    }
}
