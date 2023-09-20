package com.onedelhi.secure;

import android.content.Context;
import android.util.Log;
import com.onedelhi.secure.o74;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

public class ap3 implements o74, ji0 {
    @mr2

    /* renamed from: a */
    public final Context f9433a;
    @ts2

    /* renamed from: a */
    public ae0 f9434a;
    @mr2

    /* renamed from: a */
    public final o74 f9435a;
    @ts2

    /* renamed from: a */
    public final File f9436a;
    @ts2

    /* renamed from: a */
    public final Callable<InputStream> f9437a;
    @ts2

    /* renamed from: b */
    public final String f9438b;

    /* renamed from: b */
    public boolean f9439b;

    /* renamed from: n */
    public final int f9440n;

    /* renamed from: com.onedelhi.secure.ap3$a */
    public class C1725a extends o74.C3036a {
        public C1725a(int i) {
            super(i);
        }

        /* renamed from: d */
        public void mo13198d(@mr2 n74 n74) {
        }

        /* renamed from: f */
        public void mo13200f(@mr2 n74 n74) {
            int i = this.f17869a;
            if (i < 1) {
                n74.mo18334p2(i);
            }
        }

        /* renamed from: g */
        public void mo13201g(@mr2 n74 n74, int i, int i2) {
        }
    }

    public ap3(@mr2 Context context, @ts2 String str, @ts2 File file, @ts2 Callable<InputStream> callable, int i, @mr2 o74 o74) {
        this.f9433a = context;
        this.f9438b = str;
        this.f9436a = file;
        this.f9437a = callable;
        this.f9440n = i;
        this.f9435a = o74;
    }

    /* renamed from: Z1 */
    public synchronized n74 mo13225Z1() {
        if (!this.f9439b) {
            mo13233h(false);
            this.f9439b = true;
        }
        return this.f9435a.mo13225Z1();
    }

    @mr2
    /* renamed from: a */
    public o74 mo13226a() {
        return this.f9435a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13227b(java.io.File r5, boolean r6) throws java.io.IOException {
        /*
            r4 = this;
            java.lang.String r0 = r4.f9438b
            if (r0 == 0) goto L_0x0015
            android.content.Context r0 = r4.f9433a
            android.content.res.AssetManager r0 = r0.getAssets()
            java.lang.String r1 = r4.f9438b
            java.io.InputStream r0 = r0.open(r1)
        L_0x0010:
            java.nio.channels.ReadableByteChannel r0 = java.nio.channels.Channels.newChannel(r0)
            goto L_0x0030
        L_0x0015:
            java.io.File r0 = r4.f9436a
            if (r0 == 0) goto L_0x0025
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = r4.f9436a
            r0.<init>(r1)
            java.nio.channels.FileChannel r0 = r0.getChannel()
            goto L_0x0030
        L_0x0025:
            java.util.concurrent.Callable<java.io.InputStream> r0 = r4.f9437a
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x00b1 }
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ Exception -> 0x00b1 }
            goto L_0x0010
        L_0x0030:
            android.content.Context r1 = r4.f9433a
            java.io.File r1 = r1.getCacheDir()
            java.lang.String r2 = "room-copy-helper"
            java.lang.String r3 = ".tmp"
            java.io.File r1 = java.io.File.createTempFile(r2, r3, r1)
            r1.deleteOnExit()
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r1)
            java.nio.channels.FileChannel r2 = r2.getChannel()
            com.onedelhi.secure.x21.m31242a(r0, r2)
            java.io.File r0 = r5.getParentFile()
            if (r0 == 0) goto L_0x007b
            boolean r2 = r0.exists()
            if (r2 != 0) goto L_0x007b
            boolean r0 = r0.mkdirs()
            if (r0 == 0) goto L_0x0060
            goto L_0x007b
        L_0x0060:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to create directories for "
            r0.append(r1)
            java.lang.String r5 = r5.getAbsolutePath()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L_0x007b:
            r4.mo13230d(r1, r6)
            boolean r6 = r1.renameTo(r5)
            if (r6 == 0) goto L_0x0085
            return
        L_0x0085:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to move intermediate file ("
            r0.append(r2)
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            java.lang.String r1 = ") to destination ("
            r0.append(r1)
            java.lang.String r5 = r5.getAbsolutePath()
            r0.append(r5)
            java.lang.String r5 = ")."
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L_0x00b1:
            r5 = move-exception
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "inputStreamCallable exception on call"
            r6.<init>(r0, r5)
            throw r6
        L_0x00ba:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "copyFromAssetPath, copyFromFile and copyFromInputStream are all null!"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ap3.mo13227b(java.io.File, boolean):void");
    }

    /* renamed from: c */
    public final o74 mo13228c(File file) {
        try {
            return new sb1().mo13792a(o74.C3037b.m23597a(this.f9433a).mo21829c(file.getAbsolutePath()).mo21828b(new C1725a(Math.max(vc0.m29994g(file), 1))).mo21827a());
        } catch (IOException e) {
            throw new RuntimeException("Malformed database file, unable to read version.", e);
        }
    }

    public synchronized void close() {
        this.f9435a.close();
        this.f9439b = false;
    }

    /* renamed from: d */
    public final void mo13230d(File file, boolean z) {
        n74 n74;
        ae0 ae0 = this.f9434a;
        if (ae0 != null && ae0.f9019a != null) {
            o74 c = mo13228c(file);
            if (z) {
                try {
                    n74 = c.mo13235x();
                } catch (Throwable th) {
                    c.close();
                    throw th;
                }
            } else {
                n74 = c.mo13225Z1();
            }
            this.f9434a.f9019a.mo27644a(n74);
            c.close();
        }
    }

    /* renamed from: g */
    public void mo13231g(@ts2 ae0 ae0) {
        this.f9434a = ae0;
    }

    public String getDatabaseName() {
        return this.f9435a.getDatabaseName();
    }

    /* renamed from: h */
    public final void mo13233h(boolean z) {
        String databaseName = getDatabaseName();
        File databasePath = this.f9433a.getDatabasePath(databaseName);
        ae0 ae0 = this.f9434a;
        v80 v80 = new v80(databaseName, this.f9433a.getFilesDir(), ae0 == null || ae0.f9030b);
        try {
            v80.mo25902b();
            if (!databasePath.exists()) {
                mo13227b(databasePath, z);
                v80.mo25903c();
            } else if (this.f9434a == null) {
                v80.mo25903c();
            } else {
                try {
                    int g = vc0.m29994g(databasePath);
                    int i = this.f9440n;
                    if (g == i) {
                        v80.mo25903c();
                    } else if (this.f9434a.mo13012a(g, i)) {
                        v80.mo25903c();
                    } else {
                        if (this.f9433a.deleteDatabase(databaseName)) {
                            try {
                                mo13227b(databasePath, z);
                            } catch (IOException e) {
                                Log.w(vm3.f21887a, "Unable to copy database file.", e);
                            }
                        } else {
                            Log.w(vm3.f21887a, "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        v80.mo25903c();
                    }
                } catch (IOException e2) {
                    Log.w(vm3.f21887a, "Unable to read database version.", e2);
                    v80.mo25903c();
                }
            }
        } catch (IOException e3) {
            throw new RuntimeException("Unable to copy database file.", e3);
        } catch (Throwable th) {
            v80.mo25903c();
            throw th;
        }
    }

    @sj3(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f9435a.setWriteAheadLoggingEnabled(z);
    }

    /* renamed from: x */
    public synchronized n74 mo13235x() {
        if (!this.f9439b) {
            mo13233h(true);
            this.f9439b = true;
        }
        return this.f9435a.mo13235x();
    }
}
