package com.onedelhi.secure;

import android.os.StrictMode;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public final class oo3 {

    /* renamed from: a */
    public static final String f18052a = "GlideRuntimeCompat";

    /* renamed from: b */
    public static final String f18053b = "cpu[0-9]+";

    /* renamed from: c */
    public static final String f18054c = "/sys/devices/system/cpu/";

    /* renamed from: com.onedelhi.secure.oo3$a */
    public class C3079a implements FilenameFilter {

        /* renamed from: a */
        public final /* synthetic */ Pattern f18055a;

        public C3079a(Pattern pattern) {
            this.f18055a = pattern;
        }

        public boolean accept(File file, String str) {
            return this.f18055a.matcher(str).matches();
        }
    }

    /* renamed from: a */
    public static int m23964a() {
        return Runtime.getRuntime().availableProcessors();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static int m23965b() {
        File[] fileArr;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File(f18054c).listFiles(new C3079a(Pattern.compile(f18053b)));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        return Math.max(1, fileArr != null ? fileArr.length : 0);
    }
}
