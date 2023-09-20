package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class t21 {

    /* renamed from: a */
    public static final String f35377a = ".com.google.firebase.crashlytics.files.v1";

    /* renamed from: b */
    public static final String f35378b = ".com.google.firebase.crashlytics.files.v2";

    /* renamed from: c */
    public static final String f35379c = "open-sessions";

    /* renamed from: d */
    public static final String f35380d = "native";

    /* renamed from: e */
    public static final String f35381e = "reports";

    /* renamed from: f */
    public static final String f35382f = "priority-reports";

    /* renamed from: g */
    public static final String f35383g = "native-reports";

    /* renamed from: a */
    public final File f35384a;

    /* renamed from: b */
    public final File f35385b;

    /* renamed from: c */
    public final File f35386c;

    /* renamed from: d */
    public final File f35387d;

    /* renamed from: e */
    public final File f35388e;

    /* renamed from: f */
    public final File f35389f;

    public t21(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.f35384a = filesDir;
        if (m65161w()) {
            str = f35378b + File.pathSeparator + m65160v(Application.getProcessName());
        } else {
            str = f35377a;
        }
        File r = m65156r(new File(filesDir, str));
        this.f35385b = r;
        this.f35386c = m65156r(new File(r, f35379c));
        this.f35387d = m65156r(new File(r, f35381e));
        this.f35388e = m65156r(new File(r, f35382f));
        this.f35389f = m65156r(new File(r, f35383g));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        return r4;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.io.File m65156r(java.io.File r4) {
        /*
            java.lang.Class<com.onedelhi.secure.t21> r0 = com.onedelhi.secure.t21.class
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0031
            boolean r1 = r4.isDirectory()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)
            return r4
        L_0x0011:
            com.onedelhi.secure.o92 r1 = com.onedelhi.secure.o92.m59120f()     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r2.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "Unexpected non-directory file: "
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            r2.append(r4)     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "; deleting file and creating new directory."
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0051 }
            r1.mo41613b(r2)     // Catch:{ all -> 0x0051 }
            r4.delete()     // Catch:{ all -> 0x0051 }
        L_0x0031:
            boolean r1 = r4.mkdirs()     // Catch:{ all -> 0x0051 }
            if (r1 != 0) goto L_0x004f
            com.onedelhi.secure.o92 r1 = com.onedelhi.secure.o92.m59120f()     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r2.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "Could not create Crashlytics-specific directory: "
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            r2.append(r4)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0051 }
            r1.mo41615d(r2)     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r0)
            return r4
        L_0x0051:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.t21.m65156r(java.io.File):java.io.File");
    }

    /* renamed from: s */
    public static File m65157s(File file) {
        file.mkdirs();
        return file;
    }

    /* renamed from: t */
    public static boolean m65158t(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File t : listFiles) {
                m65158t(t);
            }
        }
        return file.delete();
    }

    /* renamed from: u */
    public static <T> List<T> m65159u(@ts2 T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    @hw4
    /* renamed from: v */
    public static String m65160v(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", db0.f27369e);
    }

    @SuppressLint({"AnnotateVersionCheck"})
    /* renamed from: w */
    public static boolean m65161w() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: a */
    public final void mo44755a(File file) {
        if (file.exists() && m65158t(file)) {
            o92 f = o92.m59120f();
            f.mo41613b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    /* renamed from: b */
    public void mo44756b() {
        mo44755a(new File(this.f35384a, ".com.google.firebase.crashlytics"));
        mo44755a(new File(this.f35384a, ".com.google.firebase.crashlytics-ndk"));
        if (m65161w()) {
            mo44755a(new File(this.f35384a, f35377a));
        }
    }

    @hw4
    /* renamed from: c */
    public void mo44757c() {
        m65158t(this.f35385b);
    }

    /* renamed from: d */
    public boolean mo44758d(String str) {
        return m65158t(new File(this.f35386c, str));
    }

    /* renamed from: e */
    public List<String> mo44759e() {
        return m65159u(this.f35386c.list());
    }

    /* renamed from: f */
    public File mo44760f(String str) {
        return new File(this.f35385b, str);
    }

    /* renamed from: g */
    public List<File> mo44761g(FilenameFilter filenameFilter) {
        return m65159u(this.f35385b.listFiles(filenameFilter));
    }

    /* renamed from: h */
    public File mo44762h(String str) {
        return new File(this.f35389f, str);
    }

    /* renamed from: i */
    public List<File> mo44763i() {
        return m65159u(this.f35389f.listFiles());
    }

    /* renamed from: j */
    public File mo44764j(String str) {
        return m65157s(new File(mo44769o(str), f35380d));
    }

    /* renamed from: k */
    public File mo44765k(String str) {
        return new File(this.f35388e, str);
    }

    /* renamed from: l */
    public List<File> mo44766l() {
        return m65159u(this.f35388e.listFiles());
    }

    /* renamed from: m */
    public File mo44767m(String str) {
        return new File(this.f35387d, str);
    }

    /* renamed from: n */
    public List<File> mo44768n() {
        return m65159u(this.f35387d.listFiles());
    }

    /* renamed from: o */
    public final File mo44769o(String str) {
        return m65157s(new File(this.f35386c, str));
    }

    /* renamed from: p */
    public File mo44770p(String str, String str2) {
        return new File(mo44769o(str), str2);
    }

    /* renamed from: q */
    public List<File> mo44771q(String str, FilenameFilter filenameFilter) {
        return m65159u(mo44769o(str).listFiles(filenameFilter));
    }
}
