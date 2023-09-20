package com.onedelhi.secure;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.onedelhi.secure.sb */
public class C3484sb {

    /* renamed from: a */
    public static final String f20272a = "AtomicFile";

    /* renamed from: a */
    public final File f20273a;

    /* renamed from: b */
    public final File f20274b;

    /* renamed from: c */
    public final File f20275c;

    public C3484sb(@mr2 File file) {
        this.f20273a = file;
        this.f20274b = new File(file.getPath() + ".new");
        this.f20275c = new File(file.getPath() + ".bak");
    }

    /* renamed from: g */
    public static void m27412g(@mr2 File file, @mr2 File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e(f20272a, "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e(f20272a, "Failed to rename " + file + " to " + file2);
        }
    }

    /* renamed from: i */
    public static boolean m27413i(@mr2 FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo24282a() {
        this.f20273a.delete();
        this.f20274b.delete();
        this.f20275c.delete();
    }

    /* renamed from: b */
    public void mo24283b(@ts2 FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            if (!m27413i(fileOutputStream)) {
                Log.e(f20272a, "Failed to sync file output stream");
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                Log.e(f20272a, "Failed to close file output stream", e);
            }
            if (!this.f20274b.delete()) {
                Log.e(f20272a, "Failed to delete new file " + this.f20274b);
            }
        }
    }

    /* renamed from: c */
    public void mo24284c(@ts2 FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            if (!m27413i(fileOutputStream)) {
                Log.e(f20272a, "Failed to sync file output stream");
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                Log.e(f20272a, "Failed to close file output stream", e);
            }
            m27412g(this.f20274b, this.f20273a);
        }
    }

    @mr2
    /* renamed from: d */
    public File mo24285d() {
        return this.f20273a;
    }

    @mr2
    /* renamed from: e */
    public FileInputStream mo24286e() throws FileNotFoundException {
        if (this.f20275c.exists()) {
            m27412g(this.f20275c, this.f20273a);
        }
        if (this.f20274b.exists() && this.f20273a.exists() && !this.f20274b.delete()) {
            Log.e(f20272a, "Failed to delete outdated new file " + this.f20274b);
        }
        return new FileInputStream(this.f20273a);
    }

    @mr2
    /* renamed from: f */
    public byte[] mo24287f() throws IOException {
        FileInputStream e = mo24286e();
        try {
            byte[] bArr = new byte[e.available()];
            int i = 0;
            while (true) {
                int read = e.read(bArr, i, bArr.length - i);
                if (read <= 0) {
                    return bArr;
                }
                i += read;
                int available = e.available();
                if (available > bArr.length - i) {
                    byte[] bArr2 = new byte[(available + i)];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } finally {
            e.close();
        }
    }

    @mr2
    /* renamed from: h */
    public FileOutputStream mo24288h() throws IOException {
        if (this.f20275c.exists()) {
            m27412g(this.f20275c, this.f20273a);
        }
        try {
            return new FileOutputStream(this.f20274b);
        } catch (FileNotFoundException unused) {
            if (this.f20274b.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.f20274b);
                } catch (FileNotFoundException e) {
                    throw new IOException("Failed to create new file " + this.f20274b, e);
                }
            } else {
                throw new IOException("Failed to create directory for " + this.f20274b);
            }
        }
    }
}
