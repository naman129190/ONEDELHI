package com.onedelhi.secure;

import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class io2 {

    /* renamed from: a */
    public final Context f13779a;

    public io2(Context context) {
        this.f13779a = context.getApplicationContext();
    }

    /* renamed from: c */
    public static String m17731c(String str, m21 m21, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? m21.mo20044b() : m21.f15877b);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo17888a() {
        File e = mo17891e();
        if (e.exists()) {
            File[] listFiles = e.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File delete : e.listFiles()) {
                    delete.delete();
                }
            }
            e.delete();
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @com.onedelhi.secure.ts2
    @com.onedelhi.secure.ly4
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.onedelhi.secure.fy2<com.onedelhi.secure.m21, java.io.InputStream> mo17889b(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.io.File r1 = r5.mo17890d(r6)     // Catch:{ FileNotFoundException -> 0x0044 }
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{  }
            r2.<init>(r1)     // Catch:{  }
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.String r3 = ".zip"
            boolean r0 = r0.endsWith(r3)
            if (r0 == 0) goto L_0x001c
            com.onedelhi.secure.m21 r0 = com.onedelhi.secure.m21.ZIP
            goto L_0x001e
        L_0x001c:
            com.onedelhi.secure.m21 r0 = com.onedelhi.secure.m21.JSON
        L_0x001e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cache hit for "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = " at "
            r3.append(r6)
            java.lang.String r6 = r1.getAbsolutePath()
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            com.onedelhi.secure.p92.m24540a(r6)
            com.onedelhi.secure.fy2 r6 = new com.onedelhi.secure.fy2
            r6.<init>(r0, r2)
            return r6
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.io2.mo17889b(java.lang.String):com.onedelhi.secure.fy2");
    }

    @ts2
    /* renamed from: d */
    public final File mo17890d(String str) throws FileNotFoundException {
        File file = new File(mo17891e(), m17731c(str, m21.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(mo17891e(), m17731c(str, m21.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    /* renamed from: e */
    public final File mo17891e() {
        File file = new File(this.f13779a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: f */
    public void mo17892f(String str, m21 m21) {
        File file = new File(mo17891e(), m17731c(str, m21, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        p92.m24540a("Copying temp file to real file (" + file2 + pl2.f33727d);
        if (!renameTo) {
            p92.m24544e("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
        }
    }

    /* renamed from: g */
    public File mo17893g(String str, InputStream inputStream, m21 m21) throws IOException {
        FileOutputStream fileOutputStream;
        File file = new File(mo17891e(), m17731c(str, m21, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }
}
