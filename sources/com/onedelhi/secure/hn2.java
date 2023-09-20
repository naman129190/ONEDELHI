package com.onedelhi.secure;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

public class hn2 {
    /* renamed from: a */
    public static void m50680a(@ts2 InputStream inputStream, @mr2 File file) throws IOException {
        if (inputStream != null) {
            byte[] bArr = new byte[8192];
            GZIPOutputStream gZIPOutputStream = null;
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream2.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream2.finish();
                            u10.m66359f(gZIPOutputStream2);
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        gZIPOutputStream = gZIPOutputStream2;
                        u10.m66359f(gZIPOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                u10.m66359f(gZIPOutputStream);
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static void m50681b(File file, List<gn2> list) {
        for (gn2 next : list) {
            InputStream inputStream = null;
            try {
                inputStream = next.mo36794a();
                if (inputStream != null) {
                    m50680a(inputStream, new File(file, next.mo36795b()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                u10.m66359f(inputStream);
                throw th;
            }
            u10.m66359f(inputStream);
        }
    }
}
