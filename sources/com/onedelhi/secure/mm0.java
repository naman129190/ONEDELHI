package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class mm0 implements Closeable {

    /* renamed from: b */
    public static final String f16214b = "journal";

    /* renamed from: c */
    public static final String f16215c = "journal.tmp";

    /* renamed from: d */
    public static final String f16216d = "journal.bkp";

    /* renamed from: e */
    public static final long f16217e = -1;

    /* renamed from: e */
    public static final String f16218e = "libcore.io.DiskLruCache";

    /* renamed from: f */
    public static final String f16219f = "1";

    /* renamed from: g */
    public static final String f16220g = "CLEAN";

    /* renamed from: h */
    public static final String f16221h = "DIRTY";

    /* renamed from: i */
    public static final String f16222i = "REMOVE";

    /* renamed from: j */
    public static final String f16223j = "READ";

    /* renamed from: a */
    public final File f16224a;

    /* renamed from: a */
    public Writer f16225a;

    /* renamed from: a */
    public final LinkedHashMap<String, C2868d> f16226a = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: a */
    public final Callable<Void> f16227a = new C2865a();

    /* renamed from: a */
    public final ThreadPoolExecutor f16228a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C2866b((C2865a) null));

    /* renamed from: b */
    public long f16229b;

    /* renamed from: b */
    public final File f16230b;

    /* renamed from: c */
    public long f16231c = 0;

    /* renamed from: c */
    public final File f16232c;

    /* renamed from: d */
    public long f16233d = 0;

    /* renamed from: d */
    public final File f16234d;

    /* renamed from: n */
    public final int f16235n;

    /* renamed from: o */
    public final int f16236o;

    /* renamed from: p */
    public int f16237p;

    /* renamed from: com.onedelhi.secure.mm0$a */
    public class C2865a implements Callable<Void> {
        public C2865a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                r4 = this;
                com.onedelhi.secure.mm0 r0 = com.onedelhi.secure.mm0.this
                monitor-enter(r0)
                com.onedelhi.secure.mm0 r1 = com.onedelhi.secure.mm0.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f16225a     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                com.onedelhi.secure.mm0 r1 = com.onedelhi.secure.mm0.this     // Catch:{ all -> 0x0028 }
                r1.mo20501P0()     // Catch:{ all -> 0x0028 }
                com.onedelhi.secure.mm0 r1 = com.onedelhi.secure.mm0.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.mo20510o0()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                com.onedelhi.secure.mm0 r1 = com.onedelhi.secure.mm0.this     // Catch:{ all -> 0x0028 }
                r1.mo20495F0()     // Catch:{ all -> 0x0028 }
                com.onedelhi.secure.mm0 r1 = com.onedelhi.secure.mm0.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                int unused = r1.f16237p = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mm0.C2865a.call():java.lang.Void");
        }
    }

    /* renamed from: com.onedelhi.secure.mm0$b */
    public static final class C2866b implements ThreadFactory {
        public C2866b() {
        }

        public /* synthetic */ C2866b(C2865a aVar) {
            this();
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* renamed from: com.onedelhi.secure.mm0$c */
    public final class C2867c {

        /* renamed from: a */
        public final C2868d f16239a;

        /* renamed from: a */
        public boolean f16241a;

        /* renamed from: a */
        public final boolean[] f16242a;

        public C2867c(C2868d dVar) {
            this.f16239a = dVar;
            this.f16242a = dVar.f16247a ? null : new boolean[mm0.this.f16236o];
        }

        public /* synthetic */ C2867c(mm0 mm0, C2868d dVar, C2865a aVar) {
            this(dVar);
        }

        /* renamed from: a */
        public void mo20516a() throws IOException {
            mm0.this.mo20497H(this, false);
        }

        /* renamed from: b */
        public void mo20517b() {
            if (!this.f16241a) {
                try {
                    mo20516a();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: e */
        public void mo20518e() throws IOException {
            mm0.this.mo20497H(this, true);
            this.f16241a = true;
        }

        /* renamed from: f */
        public File mo20519f(int i) throws IOException {
            File k;
            synchronized (mm0.this) {
                if (this.f16239a.f16244a == this) {
                    if (!this.f16239a.f16247a) {
                        this.f16242a[i] = true;
                    }
                    k = this.f16239a.mo20524k(i);
                    mm0.this.f16224a.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return k;
        }

        /* renamed from: g */
        public String mo20520g(int i) throws IOException {
            InputStream h = mo20521h(i);
            if (h != null) {
                return mm0.m21733l0(h);
            }
            return null;
        }

        /* renamed from: h */
        public final InputStream mo20521h(int i) throws IOException {
            synchronized (mm0.this) {
                if (this.f16239a.f16244a != this) {
                    throw new IllegalStateException();
                } else if (!this.f16239a.f16247a) {
                    return null;
                } else {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(this.f16239a.mo20523j(i));
                        return fileInputStream;
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
            }
        }

        /* renamed from: i */
        public void mo20522i(int i, String str) throws IOException {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(mo20519f(i)), rq4.f20085b);
                try {
                    outputStreamWriter2.write(str);
                    rq4.m27022a(outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    rq4.m27022a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                rq4.m27022a(outputStreamWriter);
                throw th;
            }
        }
    }

    /* renamed from: com.onedelhi.secure.mm0$d */
    public final class C2868d {

        /* renamed from: a */
        public long f16243a;

        /* renamed from: a */
        public C2867c f16244a;

        /* renamed from: a */
        public final String f16246a;

        /* renamed from: a */
        public boolean f16247a;

        /* renamed from: a */
        public final long[] f16248a;

        /* renamed from: a */
        public File[] f16249a;

        /* renamed from: b */
        public File[] f16250b;

        public C2868d(String str) {
            this.f16246a = str;
            this.f16248a = new long[mm0.this.f16236o];
            this.f16249a = new File[mm0.this.f16236o];
            this.f16250b = new File[mm0.this.f16236o];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < mm0.this.f16236o; i++) {
                sb.append(i);
                this.f16249a[i] = new File(mm0.this.f16224a, sb.toString());
                sb.append(".tmp");
                this.f16250b[i] = new File(mm0.this.f16224a, sb.toString());
                sb.setLength(length);
            }
        }

        public /* synthetic */ C2868d(mm0 mm0, String str, C2865a aVar) {
            this(str);
        }

        /* renamed from: j */
        public File mo20523j(int i) {
            return this.f16249a[i];
        }

        /* renamed from: k */
        public File mo20524k(int i) {
            return this.f16250b[i];
        }

        /* renamed from: l */
        public String mo20525l() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f16248a) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        /* renamed from: m */
        public final IOException mo20526m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: n */
        public final void mo20527n(String[] strArr) throws IOException {
            if (strArr.length == mm0.this.f16236o) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f16248a[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw mo20526m(strArr);
                    }
                }
                return;
            }
            throw mo20526m(strArr);
        }
    }

    /* renamed from: com.onedelhi.secure.mm0$e */
    public final class C2869e {

        /* renamed from: a */
        public final long f16251a;

        /* renamed from: a */
        public final String f16253a;

        /* renamed from: a */
        public final long[] f16254a;

        /* renamed from: a */
        public final File[] f16255a;

        public C2869e(String str, long j, File[] fileArr, long[] jArr) {
            this.f16253a = str;
            this.f16251a = j;
            this.f16255a = fileArr;
            this.f16254a = jArr;
        }

        public /* synthetic */ C2869e(mm0 mm0, String str, long j, File[] fileArr, long[] jArr, C2865a aVar) {
            this(str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public C2867c mo20528a() throws IOException {
            return mm0.this.mo20503Y(this.f16253a, this.f16251a);
        }

        /* renamed from: b */
        public File mo20529b(int i) {
            return this.f16255a[i];
        }

        /* renamed from: c */
        public long mo20530c(int i) {
            return this.f16254a[i];
        }

        /* renamed from: d */
        public String mo20531d(int i) throws IOException {
            return mm0.m21733l0(new FileInputStream(this.f16255a[i]));
        }
    }

    public mm0(File file, int i, int i2, long j) {
        File file2 = file;
        this.f16224a = file2;
        this.f16235n = i;
        this.f16230b = new File(file2, f16214b);
        this.f16232c = new File(file2, f16215c);
        this.f16234d = new File(file2, f16216d);
        this.f16236o = i2;
        this.f16229b = j;
    }

    @TargetApi(26)
    /* renamed from: E */
    public static void m21722E(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: M */
    public static void m21723M(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: M0 */
    public static void m21724M0(File file, File file2, boolean z) throws IOException {
        if (z) {
            m21723M(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    /* renamed from: Z */
    public static void m21725Z(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: l0 */
    public static String m21733l0(InputStream inputStream) throws IOException {
        return rq4.m27024c(new InputStreamReader(inputStream, rq4.f20085b));
    }

    /* renamed from: p0 */
    public static mm0 m21736p0(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, f16216d);
            if (file2.exists()) {
                File file3 = new File(file, f16214b);
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m21724M0(file2, file3, false);
                }
            }
            mm0 mm0 = new mm0(file, i, i2, j);
            if (mm0.f16230b.exists()) {
                try {
                    mm0.mo20512u0();
                    mm0.mo20511q0();
                    return mm0;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    mm0.mo20498K();
                }
            }
            file.mkdirs();
            mm0 mm02 = new mm0(file, i, i2, j);
            mm02.mo20495F0();
            return mm02;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: A */
    public final void mo20493A() {
        if (this.f16225a == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: C0 */
    public final void mo20494C0(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith(f16222i)) {
                    this.f16226a.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C2868d dVar = this.f16226a.get(str2);
            if (dVar == null) {
                dVar = new C2868d(this, str2, (C2865a) null);
                this.f16226a.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith(f16220g)) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = dVar.f16247a = true;
                C2867c unused2 = dVar.f16244a = null;
                dVar.mo20527n(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith(f16221h)) {
                C2867c unused3 = dVar.f16244a = new C2867c(this, dVar, (C2865a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith(f16223j)) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: F0 */
    public final synchronized void mo20495F0() throws IOException {
        String str;
        Writer writer = this.f16225a;
        if (writer != null) {
            m21722E(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f16232c), rq4.f20084a));
        try {
            bufferedWriter.write(f16218e);
            bufferedWriter.write("\n");
            bufferedWriter.write(f16219f);
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f16235n));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f16236o));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C2868d next : this.f16226a.values()) {
                if (next.f16244a != null) {
                    str = "DIRTY " + next.f16246a + 10;
                } else {
                    str = "CLEAN " + next.f16246a + next.mo20525l() + 10;
                }
                bufferedWriter.write(str);
            }
            m21722E(bufferedWriter);
            if (this.f16230b.exists()) {
                m21724M0(this.f16230b, this.f16234d, true);
            }
            m21724M0(this.f16232c, this.f16230b, false);
            this.f16234d.delete();
            this.f16225a = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f16230b, true), rq4.f20084a));
        } catch (Throwable th) {
            m21722E(bufferedWriter);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return false;
     */
    /* renamed from: G0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo20496G0(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.mo20493A()     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, com.onedelhi.secure.mm0$d> r0 = r7.f16226a     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008f }
            com.onedelhi.secure.mm0$d r0 = (com.onedelhi.secure.mm0.C2868d) r0     // Catch:{ all -> 0x008f }
            r1 = 0
            if (r0 == 0) goto L_0x008d
            com.onedelhi.secure.mm0$c r2 = r0.f16244a     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0017
            goto L_0x008d
        L_0x0017:
            int r2 = r7.f16236o     // Catch:{ all -> 0x008f }
            if (r1 >= r2) goto L_0x0059
            java.io.File r2 = r0.mo20523j(r1)     // Catch:{ all -> 0x008f }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008f }
            r8.<init>(r0)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x008f }
        L_0x0043:
            long r2 = r7.f16231c     // Catch:{ all -> 0x008f }
            long[] r4 = r0.f16248a     // Catch:{ all -> 0x008f }
            r5 = r4[r1]     // Catch:{ all -> 0x008f }
            long r2 = r2 - r5
            r7.f16231c = r2     // Catch:{ all -> 0x008f }
            long[] r2 = r0.f16248a     // Catch:{ all -> 0x008f }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008f }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0059:
            int r0 = r7.f16237p     // Catch:{ all -> 0x008f }
            r1 = 1
            int r0 = r0 + r1
            r7.f16237p = r0     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f16225a     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f16225a     // Catch:{ all -> 0x008f }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f16225a     // Catch:{ all -> 0x008f }
            r0.append(r8)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f16225a     // Catch:{ all -> 0x008f }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, com.onedelhi.secure.mm0$d> r0 = r7.f16226a     // Catch:{ all -> 0x008f }
            r0.remove(r8)     // Catch:{ all -> 0x008f }
            boolean r8 = r7.mo20510o0()     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f16228a     // Catch:{ all -> 0x008f }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f16227a     // Catch:{ all -> 0x008f }
            r8.submit(r0)     // Catch:{ all -> 0x008f }
        L_0x008b:
            monitor-exit(r7)
            return r1
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mm0.mo20496G0(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        return;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo20497H(com.onedelhi.secure.mm0.C2867c r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            com.onedelhi.secure.mm0$d r0 = r10.f16239a     // Catch:{ all -> 0x010e }
            com.onedelhi.secure.mm0$c r1 = r0.f16244a     // Catch:{ all -> 0x010e }
            if (r1 != r10) goto L_0x0108
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f16247a     // Catch:{ all -> 0x010e }
            if (r2 != 0) goto L_0x004d
            r2 = 0
        L_0x0015:
            int r3 = r9.f16236o     // Catch:{ all -> 0x010e }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f16242a     // Catch:{ all -> 0x010e }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.mo20524k(r2)     // Catch:{ all -> 0x010e }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010e }
            if (r3 != 0) goto L_0x0030
            r10.mo20516a()     // Catch:{ all -> 0x010e }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.mo20516a()     // Catch:{ all -> 0x010e }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r11.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010e }
            r11.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010e }
            r10.<init>(r11)     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x004d:
            int r10 = r9.f16236o     // Catch:{ all -> 0x010e }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.mo20524k(r1)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.mo20523j(r1)     // Catch:{ all -> 0x010e }
            r10.renameTo(r2)     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f16248a     // Catch:{ all -> 0x010e }
            r3 = r10[r1]     // Catch:{ all -> 0x010e }
            long r5 = r2.length()     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f16248a     // Catch:{ all -> 0x010e }
            r10[r1] = r5     // Catch:{ all -> 0x010e }
            long r7 = r9.f16231c     // Catch:{ all -> 0x010e }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f16231c = r7     // Catch:{ all -> 0x010e }
            goto L_0x007e
        L_0x007b:
            m21723M(r10)     // Catch:{ all -> 0x010e }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.f16237p     // Catch:{ all -> 0x010e }
            r1 = 1
            int r10 = r10 + r1
            r9.f16237p = r10     // Catch:{ all -> 0x010e }
            r10 = 0
            com.onedelhi.secure.mm0.C2867c unused = r0.f16244a = r10     // Catch:{ all -> 0x010e }
            boolean r10 = r0.f16247a     // Catch:{ all -> 0x010e }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00c9
            boolean unused = r0.f16247a = r1     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f16225a     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f16225a     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f16225a     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.f16246a     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f16225a     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.mo20525l()     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f16225a     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x00ec
            long r10 = r9.f16233d     // Catch:{ all -> 0x010e }
            r1 = 1
            long r1 = r1 + r10
            r9.f16233d = r1     // Catch:{ all -> 0x010e }
            long unused = r0.f16243a = r10     // Catch:{ all -> 0x010e }
            goto L_0x00ec
        L_0x00c9:
            java.util.LinkedHashMap<java.lang.String, com.onedelhi.secure.mm0$d> r10 = r9.f16226a     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f16246a     // Catch:{ all -> 0x010e }
            r10.remove(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f16225a     // Catch:{ all -> 0x010e }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f16225a     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f16225a     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f16246a     // Catch:{ all -> 0x010e }
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f16225a     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
        L_0x00ec:
            java.io.Writer r10 = r9.f16225a     // Catch:{ all -> 0x010e }
            m21725Z(r10)     // Catch:{ all -> 0x010e }
            long r10 = r9.f16231c     // Catch:{ all -> 0x010e }
            long r0 = r9.f16229b     // Catch:{ all -> 0x010e }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ff
            boolean r10 = r9.mo20510o0()     // Catch:{ all -> 0x010e }
            if (r10 == 0) goto L_0x0106
        L_0x00ff:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f16228a     // Catch:{ all -> 0x010e }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f16227a     // Catch:{ all -> 0x010e }
            r10.submit(r11)     // Catch:{ all -> 0x010e }
        L_0x0106:
            monitor-exit(r9)
            return
        L_0x0108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            r10.<init>()     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x010e:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mm0.mo20497H(com.onedelhi.secure.mm0$c, boolean):void");
    }

    /* renamed from: K */
    public void mo20498K() throws IOException {
        close();
        rq4.m27023b(this.f16224a);
    }

    /* renamed from: N0 */
    public synchronized void mo20499N0(long j) {
        this.f16229b = j;
        this.f16228a.submit(this.f16227a);
    }

    /* renamed from: O0 */
    public synchronized long mo20500O0() {
        return this.f16231c;
    }

    /* renamed from: P0 */
    public final void mo20501P0() throws IOException {
        while (this.f16231c > this.f16229b) {
            mo20496G0((String) this.f16226a.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: X */
    public C2867c mo20502X(String str) throws IOException {
        return mo20503Y(str, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return null;
     */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.onedelhi.secure.mm0.C2867c mo20503Y(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.mo20493A()     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, com.onedelhi.secure.mm0$d> r0 = r5.f16226a     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005d }
            com.onedelhi.secure.mm0$d r0 = (com.onedelhi.secure.mm0.C2868d) r0     // Catch:{ all -> 0x005d }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001d
            long r1 = r0.f16243a     // Catch:{ all -> 0x005d }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
        L_0x001d:
            monitor-exit(r5)
            return r3
        L_0x001f:
            if (r0 != 0) goto L_0x002c
            com.onedelhi.secure.mm0$d r0 = new com.onedelhi.secure.mm0$d     // Catch:{ all -> 0x005d }
            r0.<init>(r5, r6, r3)     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, com.onedelhi.secure.mm0$d> r7 = r5.f16226a     // Catch:{ all -> 0x005d }
            r7.put(r6, r0)     // Catch:{ all -> 0x005d }
            goto L_0x0034
        L_0x002c:
            com.onedelhi.secure.mm0$c r7 = r0.f16244a     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0034
            monitor-exit(r5)
            return r3
        L_0x0034:
            com.onedelhi.secure.mm0$c r7 = new com.onedelhi.secure.mm0$c     // Catch:{ all -> 0x005d }
            r7.<init>(r5, r0, r3)     // Catch:{ all -> 0x005d }
            com.onedelhi.secure.mm0.C2867c unused = r0.f16244a = r7     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f16225a     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f16225a     // Catch:{ all -> 0x005d }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f16225a     // Catch:{ all -> 0x005d }
            r8.append(r6)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f16225a     // Catch:{ all -> 0x005d }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f16225a     // Catch:{ all -> 0x005d }
            m21725Z(r6)     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return r7
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mm0.mo20503Y(java.lang.String, long):com.onedelhi.secure.mm0$c");
    }

    /* renamed from: c0 */
    public synchronized C2869e mo20504c0(String str) throws IOException {
        mo20493A();
        C2868d dVar = this.f16226a.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f16247a) {
            return null;
        }
        for (File exists : dVar.f16249a) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f16237p++;
        this.f16225a.append(f16223j);
        this.f16225a.append(' ');
        this.f16225a.append(str);
        this.f16225a.append(10);
        if (mo20510o0()) {
            this.f16228a.submit(this.f16227a);
        }
        return new C2869e(this, str, dVar.f16243a, dVar.f16249a, dVar.f16248a, (C2865a) null);
    }

    public synchronized void close() throws IOException {
        if (this.f16225a != null) {
            Iterator it = new ArrayList(this.f16226a.values()).iterator();
            while (it.hasNext()) {
                C2868d dVar = (C2868d) it.next();
                if (dVar.f16244a != null) {
                    dVar.f16244a.mo20516a();
                }
            }
            mo20501P0();
            m21722E(this.f16225a);
            this.f16225a = null;
        }
    }

    /* renamed from: e0 */
    public File mo20506e0() {
        return this.f16224a;
    }

    public synchronized void flush() throws IOException {
        mo20493A();
        mo20501P0();
        m21725Z(this.f16225a);
    }

    public synchronized boolean isClosed() {
        return this.f16225a == null;
    }

    /* renamed from: j0 */
    public synchronized long mo20509j0() {
        return this.f16229b;
    }

    /* renamed from: o0 */
    public final boolean mo20510o0() {
        int i = this.f16237p;
        return i >= 2000 && i >= this.f16226a.size();
    }

    /* renamed from: q0 */
    public final void mo20511q0() throws IOException {
        m21723M(this.f16232c);
        Iterator<C2868d> it = this.f16226a.values().iterator();
        while (it.hasNext()) {
            C2868d next = it.next();
            int i = 0;
            if (next.f16244a == null) {
                while (i < this.f16236o) {
                    this.f16231c += next.f16248a[i];
                    i++;
                }
            } else {
                C2867c unused = next.f16244a = null;
                while (i < this.f16236o) {
                    m21723M(next.mo20523j(i));
                    m21723M(next.mo20524k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f16237p = r0 - r9.f16226a.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo25849c() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        mo20495F0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f16225a = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f16230b, true), com.onedelhi.secure.rq4.f20084a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20512u0() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            com.onedelhi.secure.v44 r1 = new com.onedelhi.secure.v44
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f16230b
            r2.<init>(r3)
            java.nio.charset.Charset r3 = com.onedelhi.secure.rq4.f20084a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo25851d()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.mo25851d()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.mo25851d()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.mo25851d()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.mo25851d()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f16235n     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f16236o     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo25851d()     // Catch:{ EOFException -> 0x005f }
            r9.mo20494C0(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, com.onedelhi.secure.mm0$d> r2 = r9.f16226a     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f16237p = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.mo25849c()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.mo20495F0()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f16230b     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = com.onedelhi.secure.rq4.f20084a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f16225a = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            com.onedelhi.secure.rq4.m27022a(r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            com.onedelhi.secure.rq4.m27022a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mm0.mo20512u0():void");
    }
}
