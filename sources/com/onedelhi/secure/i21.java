package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

public class i21 implements gn2 {
    @mr2

    /* renamed from: a */
    public final File f30055a;
    @mr2

    /* renamed from: a */
    public final String f30056a;
    @mr2

    /* renamed from: b */
    public final String f30057b;

    public i21(@mr2 String str, @mr2 String str2, @mr2 File file) {
        this.f30056a = str;
        this.f30057b = str2;
        this.f30055a = file;
    }

    @ts2
    /* renamed from: a */
    public InputStream mo36794a() {
        if (this.f30055a.exists() && this.f30055a.isFile()) {
            try {
                return new FileInputStream(this.f30055a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @mr2
    /* renamed from: b */
    public String mo36795b() {
        return this.f30057b;
    }

    @ts2
    /* renamed from: c */
    public pa0.C6379e.C6381b mo36796c() {
        byte[] d = mo37819d();
        if (d != null) {
            return pa0.C6379e.C6381b.m60597a().mo31661b(d).mo31662c(this.f30056a).mo31660a();
        }
        return null;
    }

    @ts2
    /* renamed from: d */
    public final byte[] mo37819d() {
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr = new byte[8192];
        try {
            InputStream a = mo36794a();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (a == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (a != null) {
                            a.close();
                        }
                        return null;
                    }
                    while (true) {
                        int read = a.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream.finish();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            a.close();
                            return byteArray;
                        }
                    }
                } catch (Throwable th) {
                    byteArrayOutputStream.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                if (a != null) {
                    a.close();
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }
}
