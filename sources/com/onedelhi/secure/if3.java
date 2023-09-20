package com.onedelhi.secure;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class if3 extends un0 {

    /* renamed from: a */
    public File f13665a;

    public if3(@ts2 un0 un0, File file) {
        super(un0);
        this.f13665a = file;
    }

    /* renamed from: w */
    public static boolean m17498w(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z &= m17498w(file2);
                }
                if (!file2.delete()) {
                    Log.w("DocumentFile", "Failed to delete " + file2);
                    z = false;
                }
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r1.substring(r0 + 1).toLowerCase());
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m17499x(java.lang.String r1) {
        /*
            r0 = 46
            int r0 = r1.lastIndexOf(r0)
            if (r0 < 0) goto L_0x001d
            int r0 = r0 + 1
            java.lang.String r1 = r1.substring(r0)
            java.lang.String r1 = r1.toLowerCase()
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = r0.getMimeTypeFromExtension(r1)
            if (r1 == 0) goto L_0x001d
            return r1
        L_0x001d:
            java.lang.String r1 = "application/octet-stream"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.if3.m17499x(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public boolean mo17744a() {
        return this.f13665a.canRead();
    }

    /* renamed from: b */
    public boolean mo17745b() {
        return this.f13665a.canWrite();
    }

    @ts2
    /* renamed from: c */
    public un0 mo17746c(String str) {
        File file = new File(this.f13665a, str);
        if (file.isDirectory() || file.mkdir()) {
            return new if3(this, file);
        }
        return null;
    }

    @ts2
    /* renamed from: d */
    public un0 mo17747d(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = str2 + "." + extensionFromMimeType;
        }
        File file = new File(this.f13665a, str2);
        try {
            file.createNewFile();
            return new if3(this, file);
        } catch (IOException e) {
            Log.w("DocumentFile", "Failed to createFile: " + e);
            return null;
        }
    }

    /* renamed from: e */
    public boolean mo17748e() {
        m17498w(this.f13665a);
        return this.f13665a.delete();
    }

    /* renamed from: f */
    public boolean mo17749f() {
        return this.f13665a.exists();
    }

    /* renamed from: k */
    public String mo17750k() {
        return this.f13665a.getName();
    }

    @ts2
    /* renamed from: m */
    public String mo17751m() {
        if (this.f13665a.isDirectory()) {
            return null;
        }
        return m17499x(this.f13665a.getName());
    }

    /* renamed from: n */
    public Uri mo17752n() {
        return Uri.fromFile(this.f13665a);
    }

    /* renamed from: o */
    public boolean mo17753o() {
        return this.f13665a.isDirectory();
    }

    /* renamed from: q */
    public boolean mo17754q() {
        return this.f13665a.isFile();
    }

    /* renamed from: r */
    public boolean mo17755r() {
        return false;
    }

    /* renamed from: s */
    public long mo17756s() {
        return this.f13665a.lastModified();
    }

    /* renamed from: t */
    public long mo17757t() {
        return this.f13665a.length();
    }

    /* renamed from: u */
    public un0[] mo17758u() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = this.f13665a.listFiles();
        if (listFiles != null) {
            for (File if3 : listFiles) {
                arrayList.add(new if3(this, if3));
            }
        }
        return (un0[]) arrayList.toArray(new un0[arrayList.size()]);
    }

    /* renamed from: v */
    public boolean mo17759v(String str) {
        File file = new File(this.f13665a.getParentFile(), str);
        if (!this.f13665a.renameTo(file)) {
            return false;
        }
        this.f13665a = file;
        return true;
    }
}
