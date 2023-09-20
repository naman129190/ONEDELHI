package com.onedelhi.secure;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H&¨\u0006\u0014"}, d2 = {"Lcom/onedelhi/secure/u21;", "", "Ljava/io/File;", "file", "Lcom/onedelhi/secure/x04;", "h", "Lcom/onedelhi/secure/oz3;", "e", "a", "Lcom/onedelhi/secure/un4;", "b", "", "c", "", "g", "from", "to", "f", "directory", "d", "okhttp"}, k = 1, mv = {1, 4, 0})
public interface u21 {

    /* renamed from: a */
    public static final C6918a f35944a = new C6918a((wg0) null);
    @rw1
    @vr2

    /* renamed from: a */
    public static final u21 f35945a = new C6918a.C6919a();

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0002\u0007\n\u0005\bF0\u0001¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/u21$a;", "", "Lcom/onedelhi/secure/u21;", "SYSTEM", "Lcom/onedelhi/secure/u21;", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.u21$a */
    public static final class C6918a {

        /* renamed from: a */
        public static final /* synthetic */ C6918a f35946a = null;

        @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016¨\u0006\u0018"}, d2 = {"Lcom/onedelhi/secure/u21$a$a;", "Lcom/onedelhi/secure/u21;", "Ljava/io/File;", "file", "Lcom/onedelhi/secure/x04;", "h", "Lcom/onedelhi/secure/oz3;", "e", "a", "Lcom/onedelhi/secure/un4;", "b", "", "c", "", "g", "from", "to", "f", "directory", "d", "", "toString", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: com.onedelhi.secure.u21$a$a */
        public static final class C6919a implements u21 {
            @vr2
            /* renamed from: a */
            public oz3 mo45367a(@vr2 File file) throws FileNotFoundException {
                jt1.m53777p(file, "file");
                try {
                    return gu2.m49832a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return gu2.m49832a(file);
                }
            }

            /* renamed from: b */
            public void mo45368b(@vr2 File file) throws IOException {
                jt1.m53777p(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException("failed to delete " + file);
                }
            }

            /* renamed from: c */
            public boolean mo45369c(@vr2 File file) {
                jt1.m53777p(file, "file");
                return file.exists();
            }

            /* renamed from: d */
            public void mo45370d(@vr2 File file) throws IOException {
                jt1.m53777p(file, "directory");
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i = 0;
                    while (i < length) {
                        File file2 = listFiles[i];
                        jt1.m53776o(file2, "file");
                        if (file2.isDirectory()) {
                            mo45370d(file2);
                        }
                        if (file2.delete()) {
                            i++;
                        } else {
                            throw new IOException("failed to delete " + file2);
                        }
                    }
                    return;
                }
                throw new IOException("not a readable directory: " + file);
            }

            @vr2
            /* renamed from: e */
            public oz3 mo45371e(@vr2 File file) throws FileNotFoundException {
                jt1.m53777p(file, "file");
                try {
                    return hu2.m50901j(file, false, 1, (Object) null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return hu2.m50901j(file, false, 1, (Object) null);
                }
            }

            /* renamed from: f */
            public void mo45372f(@vr2 File file, @vr2 File file2) throws IOException {
                jt1.m53777p(file, "from");
                jt1.m53777p(file2, "to");
                mo45368b(file2);
                if (!file.renameTo(file2)) {
                    throw new IOException("failed to rename " + file + " to " + file2);
                }
            }

            /* renamed from: g */
            public long mo45373g(@vr2 File file) {
                jt1.m53777p(file, "file");
                return file.length();
            }

            @vr2
            /* renamed from: h */
            public x04 mo45374h(@vr2 File file) throws FileNotFoundException {
                jt1.m53777p(file, "file");
                return gu2.m49843l(file);
            }

            @vr2
            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        public C6918a() {
        }

        public /* synthetic */ C6918a(wg0 wg0) {
            this();
        }
    }

    @vr2
    /* renamed from: a */
    oz3 mo45367a(@vr2 File file) throws FileNotFoundException;

    /* renamed from: b */
    void mo45368b(@vr2 File file) throws IOException;

    /* renamed from: c */
    boolean mo45369c(@vr2 File file);

    /* renamed from: d */
    void mo45370d(@vr2 File file) throws IOException;

    @vr2
    /* renamed from: e */
    oz3 mo45371e(@vr2 File file) throws FileNotFoundException;

    /* renamed from: f */
    void mo45372f(@vr2 File file, @vr2 File file2) throws IOException;

    /* renamed from: g */
    long mo45373g(@vr2 File file);

    @vr2
    /* renamed from: h */
    x04 mo45374h(@vr2 File file) throws FileNotFoundException;
}
