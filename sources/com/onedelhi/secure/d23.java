package com.onedelhi.secure;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.util.ArrayList;

public class d23 implements C6788ss {

    /* renamed from: a */
    public int f27188a;

    /* renamed from: a */
    public final Activity f27189a;

    /* renamed from: a */
    public final Context f27190a;

    /* renamed from: a */
    public final e23 f27191a;

    /* renamed from: a */
    public mo0 f27192a;

    /* renamed from: a */
    public ArrayList<String> f27193a = new ArrayList<>();

    /* renamed from: a */
    public boolean f27194a = false;

    /* renamed from: b */
    public int f27195b;

    /* renamed from: b */
    public boolean f27196b = false;

    /* renamed from: c */
    public boolean f27197c = false;

    /* renamed from: d */
    public boolean f27198d = false;

    /* renamed from: e */
    public boolean f27199e = false;

    /* renamed from: f */
    public boolean f27200f = true;

    /* renamed from: g */
    public boolean f27201g = false;

    /* renamed from: h */
    public boolean f27202h = false;

    public d23(Context context, e23 e23, Activity activity) {
        this.f27190a = context;
        this.f27191a = e23;
        this.f27189a = activity;
    }

    /* renamed from: a */
    public void mo34161a() {
        mo0 mo0 = this.f27192a;
        if (mo0 != null) {
            mo0.cancel(true);
            mo34163c(this.f27190a);
        }
    }

    /* renamed from: b */
    public final boolean mo34162b(File file) {
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    mo34162b(file2);
                } else if (file2.delete()) {
                    Log.i("Deleted ", "successfully");
                }
            }
        }
        return file.delete();
    }

    /* renamed from: c */
    public void mo34163c(Context context) {
        File externalFilesDir = context.getExternalFilesDir("Temp");
        if (externalFilesDir != null && mo34162b(externalFilesDir)) {
            Log.i("PickiT ", " deleteDirectory was called");
        }
    }

    /* renamed from: d */
    public final void mo34164d(Uri uri) {
        mo0 mo0 = new mo0(uri, this.f27190a, this, this.f27189a);
        this.f27192a = mo0;
        mo0.execute(new Uri[0]);
    }

    /* renamed from: e */
    public void mo34165e(boolean z) {
        this.f27200f = z;
    }

    /* renamed from: f */
    public void mo34166f(int i) {
        this.f27191a.mo7584f(i);
    }

    /* renamed from: g */
    public void mo34167g() {
        if (!this.f27199e) {
            this.f27191a.mo7585g();
        } else if (!this.f27201g) {
            this.f27191a.mo7585g();
            this.f27201g = true;
        }
    }

    /* renamed from: h */
    public void mo34168h() {
        if (this.f27199e || this.f27196b) {
            if (!this.f27202h) {
                this.f27202h = true;
            } else {
                return;
            }
        }
        this.f27191a.mo7573O();
    }

    /* renamed from: i */
    public void mo34169i(String str, boolean z, boolean z2, String str2) {
        String str3;
        boolean z3;
        boolean z4;
        boolean z5;
        String str4;
        e23 e23;
        e23 e232;
        boolean z6;
        boolean z7;
        this.f27198d = false;
        if (!z2) {
            if (this.f27194a) {
                e232 = this.f27191a;
                z6 = true;
                z7 = false;
            } else if (this.f27197c) {
                e232 = this.f27191a;
                z6 = false;
                z7 = true;
            } else {
                return;
            }
            z3 = false;
            str4 = str;
            str3 = str2;
        } else if (this.f27199e) {
            this.f27195b++;
            this.f27193a.add(str);
            if (this.f27195b == this.f27188a) {
                this.f27202h = false;
                this.f27201g = false;
                this.f27191a.mo7587n(this.f27193a, true, "");
                this.f27193a.clear();
                this.f27201g = false;
                this.f27202h = false;
                return;
            }
            return;
        } else {
            if (this.f27194a) {
                e23 = this.f27191a;
                z5 = true;
                z4 = false;
            } else if (this.f27197c || this.f27196b) {
                e23 = this.f27191a;
                z5 = false;
                z4 = true;
            } else {
                return;
            }
            z3 = true;
            str3 = "";
            str4 = str;
        }
        e23.mo7586l(str4, z5, z4, z3, str3);
    }

    /* renamed from: j */
    public void mo34170j(ClipData clipData) {
        this.f27199e = true;
        this.f27188a = clipData.getItemCount();
        for (int i = 0; i < clipData.getItemCount(); i++) {
            mo34171k(clipData.getItemAt(i).getUri(), Build.VERSION.SDK_INT);
        }
        if (!this.f27194a) {
            this.f27191a.mo7587n(this.f27193a, true, "");
            this.f27193a.clear();
            this.f27199e = false;
            this.f27201g = false;
            this.f27202h = false;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:20|(3:22|23|(2:30|88)(2:29|84))|31|32|89) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017f, code lost:
        if (com.onedelhi.secure.cr4.m44235a().equals("dataReturnedNull") != false) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0192, code lost:
        if (com.onedelhi.secure.cr4.m44235a().contains("column '_data' does not exist") != false) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a5, code lost:
        if (com.onedelhi.secure.cr4.m44235a().equals("uri") != false) goto L_0x0140;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00c6 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34171k(android.net.Uri r9, int r10) {
        /*
            r8 = this;
            r0 = 19
            if (r10 < r0) goto L_0x01b9
            r10 = 0
            java.lang.String r10 = android.provider.DocumentsContract.getDocumentId(r9)     // Catch:{ Exception -> 0x000a }
            goto L_0x000b
        L_0x000a:
        L_0x000b:
            boolean r0 = r8.mo34175o(r9)
            r1 = 1
            if (r0 != 0) goto L_0x01b5
            boolean r0 = r8.mo34173m(r9)
            if (r0 != 0) goto L_0x01b5
            boolean r0 = r8.mo34174n(r9)
            if (r0 == 0) goto L_0x0020
            goto L_0x01b5
        L_0x0020:
            if (r10 == 0) goto L_0x00d4
            java.lang.String r0 = "msf"
            boolean r10 = r10.startsWith(r0)
            if (r10 == 0) goto L_0x00d4
            android.content.Context r10 = r8.f27190a
            java.lang.String r10 = com.onedelhi.secure.cr4.m44237c(r10, r9)
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00cd }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cd }
            r2.<init>()     // Catch:{ Exception -> 0x00cd }
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x00cd }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00cd }
            r2.append(r3)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r3 = "/Download/"
            r2.append(r3)     // Catch:{ Exception -> 0x00cd }
            r2.append(r10)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r10 = r2.toString()     // Catch:{ Exception -> 0x00cd }
            r0.<init>(r10)     // Catch:{ Exception -> 0x00cd }
            boolean r10 = r0.exists()     // Catch:{ Exception -> 0x00cd }
            if (r10 == 0) goto L_0x0067
            com.onedelhi.secure.e23 r2 = r8.f27191a     // Catch:{ Exception -> 0x00cd }
            java.lang.String r3 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x00cd }
            r4 = 0
            r5 = 0
            r6 = 1
            java.lang.String r7 = ""
            r2.mo7586l(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00cd }
            goto L_0x01c9
        L_0x0067:
            boolean r10 = r8.f27200f     // Catch:{ Exception -> 0x00cd }
            if (r10 == 0) goto L_0x00c6
            android.content.Context r10 = r8.f27190a     // Catch:{ Exception -> 0x00c6 }
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r10 = r10.openFileDescriptor(r9, r0)     // Catch:{ Exception -> 0x00c6 }
            int r10 = r10.getFd()     // Catch:{ Exception -> 0x00c6 }
            int r0 = android.os.Process.myPid()     // Catch:{ Exception -> 0x00c6 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c6 }
            r2.<init>()     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r3 = "/proc/"
            r2.append(r3)     // Catch:{ Exception -> 0x00c6 }
            r2.append(r0)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r0 = "/fd/"
            r2.append(r0)     // Catch:{ Exception -> 0x00c6 }
            r2.append(r10)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r10 = r2.toString()     // Catch:{ Exception -> 0x00c6 }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00c6 }
            r0.<init>(r10)     // Catch:{ Exception -> 0x00c6 }
            boolean r10 = r0.exists()     // Catch:{ Exception -> 0x00c6 }
            if (r10 == 0) goto L_0x00bf
            boolean r10 = r0.canRead()     // Catch:{ Exception -> 0x00c6 }
            if (r10 == 0) goto L_0x00bf
            boolean r10 = r0.canWrite()     // Catch:{ Exception -> 0x00c6 }
            if (r10 == 0) goto L_0x00bf
            com.onedelhi.secure.e23 r2 = r8.f27191a     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r3 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x00c6 }
            r4 = 0
            r5 = 0
            r6 = 1
            java.lang.String r7 = ""
            r2.mo7586l(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00c6 }
            goto L_0x01c9
        L_0x00bf:
            r8.f27196b = r1     // Catch:{ Exception -> 0x00c6 }
            r8.mo34164d(r9)     // Catch:{ Exception -> 0x00c6 }
            goto L_0x01c9
        L_0x00c6:
            r8.f27196b = r1     // Catch:{ Exception -> 0x00cd }
            r8.mo34164d(r9)     // Catch:{ Exception -> 0x00cd }
            goto L_0x01c9
        L_0x00cd:
            r8.f27196b = r1
        L_0x00cf:
            r8.mo34164d(r9)
            goto L_0x01c9
        L_0x00d4:
            android.content.Context r10 = r8.f27190a
            java.lang.String r3 = com.onedelhi.secure.cr4.m44238d(r10, r9)
            android.webkit.MimeTypeMap r10 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "."
            int r2 = r2.lastIndexOf(r4)
            int r2 = r2 + r1
            java.lang.String r0 = r0.substring(r2)
            android.content.Context r2 = r8.f27190a
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r2 = r2.getType(r9)
            java.lang.String r10 = r10.getExtensionFromMimeType(r2)
            java.lang.String r2 = "content"
            if (r3 == 0) goto L_0x0159
            java.lang.String r4 = ""
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x010c
            goto L_0x0159
        L_0x010c:
            java.lang.String r4 = "jpeg"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0146
            boolean r10 = r0.equals(r10)
            if (r10 != 0) goto L_0x0146
            java.lang.String r10 = r9.getScheme()
            if (r10 == 0) goto L_0x0146
            java.lang.String r10 = r9.getScheme()
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0146
            java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x0140 }
            r10.<init>(r3)     // Catch:{ Exception -> 0x0140 }
            boolean r10 = r10.exists()     // Catch:{ Exception -> 0x0140 }
            if (r10 == 0) goto L_0x0140
            com.onedelhi.secure.e23 r2 = r8.f27191a     // Catch:{ Exception -> 0x0140 }
            r4 = 0
            r5 = 0
            r6 = 1
            java.lang.String r7 = ""
            r2.mo7586l(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0140 }
            return
        L_0x0140:
            r8.f27197c = r1
            r8.mo34164d(r9)
            return
        L_0x0146:
            boolean r9 = r8.f27199e
            if (r9 == 0) goto L_0x0151
            java.util.ArrayList<java.lang.String> r9 = r8.f27193a
            r9.add(r3)
            goto L_0x01c9
        L_0x0151:
            com.onedelhi.secure.e23 r2 = r8.f27191a
            r4 = 0
            r5 = 0
            r6 = 1
            java.lang.String r7 = ""
            goto L_0x01b1
        L_0x0159:
            boolean r10 = r8.f27198d
            if (r10 != 0) goto L_0x01a8
            r8.f27198d = r1
            java.lang.String r10 = r9.getScheme()
            if (r10 == 0) goto L_0x01a8
            java.lang.String r10 = r9.getScheme()
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x01a8
            java.lang.String r10 = com.onedelhi.secure.cr4.m44235a()
            if (r10 == 0) goto L_0x0182
            java.lang.String r10 = com.onedelhi.secure.cr4.m44235a()
            java.lang.String r0 = "dataReturnedNull"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x0182
            goto L_0x0140
        L_0x0182:
            java.lang.String r10 = com.onedelhi.secure.cr4.m44235a()
            if (r10 == 0) goto L_0x0195
            java.lang.String r10 = com.onedelhi.secure.cr4.m44235a()
            java.lang.String r0 = "column '_data' does not exist"
            boolean r10 = r10.contains(r0)
            if (r10 == 0) goto L_0x0195
            goto L_0x0140
        L_0x0195:
            java.lang.String r10 = com.onedelhi.secure.cr4.m44235a()
            if (r10 == 0) goto L_0x01a8
            java.lang.String r10 = com.onedelhi.secure.cr4.m44235a()
            java.lang.String r0 = "uri"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x01a8
            goto L_0x0140
        L_0x01a8:
            com.onedelhi.secure.e23 r2 = r8.f27191a
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r7 = com.onedelhi.secure.cr4.m44235a()
        L_0x01b1:
            r2.mo7586l(r3, r4, r5, r6, r7)
            goto L_0x01c9
        L_0x01b5:
            r8.f27194a = r1
            goto L_0x00cf
        L_0x01b9:
            android.content.Context r10 = r8.f27190a
            java.lang.String r1 = com.onedelhi.secure.cr4.m44239e(r10, r9)
            com.onedelhi.secure.e23 r0 = r8.f27191a
            r2 = 0
            r3 = 0
            r4 = 1
            java.lang.String r5 = ""
            r0.mo7586l(r1, r2, r3, r4, r5)
        L_0x01c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.d23.mo34171k(android.net.Uri, int):void");
    }

    /* renamed from: l */
    public boolean mo34172l(Uri uri) {
        return mo34175o(uri) || mo34173m(uri) || mo34174n(uri);
    }

    /* renamed from: m */
    public final boolean mo34173m(Uri uri) {
        return String.valueOf(uri).toLowerCase().contains("content://com.dropbox.");
    }

    /* renamed from: n */
    public final boolean mo34174n(Uri uri) {
        return String.valueOf(uri).toLowerCase().contains("com.google.android.apps");
    }

    /* renamed from: o */
    public final boolean mo34175o(Uri uri) {
        return String.valueOf(uri).toLowerCase().contains("com.microsoft.skydrive.content");
    }

    /* renamed from: p */
    public boolean mo34176p(Uri uri, int i) {
        String d = cr4.m44238d(this.f27190a, uri);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String substring = String.valueOf(d).substring(String.valueOf(d).lastIndexOf(".") + 1);
        String extensionFromMimeType = singleton.getExtensionFromMimeType(this.f27190a.getContentResolver().getType(uri));
        if (!mo34175o(uri) && !mo34173m(uri) && !mo34174n(uri)) {
            if (d != null && !d.equals("")) {
                return !substring.equals("jpeg") && !substring.equals(extensionFromMimeType) && uri.getScheme() != null && uri.getScheme().equals(FirebaseAnalytics.C4305d.f24947P);
            }
            if (uri.getScheme() != null && uri.getScheme().equals(FirebaseAnalytics.C4305d.f24947P)) {
                if (cr4.m44235a() != null && cr4.m44235a().equals("dataReturnedNull")) {
                    return true;
                }
                if (cr4.m44235a() == null || !cr4.m44235a().contains("column '_data' does not exist")) {
                    return cr4.m44235a() != null && cr4.m44235a().equals("uri");
                }
                return true;
            }
        }
    }

    /* renamed from: q */
    public boolean mo34177q(Uri uri) {
        return !mo34173m(uri) && !mo34174n(uri) && !mo34175o(uri);
    }
}
