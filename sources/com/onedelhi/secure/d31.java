package com.onedelhi.secure;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\u001a*\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007\u001a*\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007\u001a\u0012\u0010\b\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a\u0012\u0010\t\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a\u0012\u0010\n\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a\u001d\u0010\f\u001a\u0004\u0018\u00010\u0000*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\r\u001a&\u0010\u0013\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u001a8\u0010\u0018\u001a\u00020\u000f*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u001a\n\u0010\u0019\u001a\u00020\u000f*\u00020\u0003\u001a\u0012\u0010\u001b\u001a\u00020\u000f*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003\u001a\u0012\u0010\u001c\u001a\u00020\u000f*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0000\u001a\u0012\u0010\u001d\u001a\u00020\u000f*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003\u001a\u0012\u0010\u001e\u001a\u00020\u000f*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0000\u001a\n\u0010\u001f\u001a\u00020\u0003*\u00020\u0003\u001a\u0013\u0010!\u001a\u00020 *\u00020 H\u0002¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030#*\b\u0012\u0004\u0012\u00020\u00030#H\u0002¢\u0006\u0004\b$\u0010%\u001a\u0012\u0010'\u001a\u00020\u0003*\u00020\u00032\u0006\u0010&\u001a\u00020\u0003\u001a\u0012\u0010(\u001a\u00020\u0003*\u00020\u00032\u0006\u0010&\u001a\u00020\u0000\u001a\u0012\u0010)\u001a\u00020\u0003*\u00020\u00032\u0006\u0010&\u001a\u00020\u0003\u001a\u0012\u0010*\u001a\u00020\u0003*\u00020\u00032\u0006\u0010&\u001a\u00020\u0000\"\u0015\u0010-\u001a\u00020\u0000*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b+\u0010,\"\u0015\u0010/\u001a\u00020\u0000*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010,\"\u0015\u00101\u001a\u00020\u0000*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010,¨\u00062"}, d2 = {"", "prefix", "suffix", "Ljava/io/File;", "directory", "R", "T", "base", "n0", "e0", "g0", "f0", "o0", "(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;", "target", "", "overwrite", "", "bufferSize", "P", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lcom/onedelhi/secure/uu2;", "onError", "N", "V", "other", "l0", "m0", "W", "X", "b0", "Lcom/onedelhi/secure/q21;", "c0", "(Lcom/onedelhi/secure/q21;)Lcom/onedelhi/secure/q21;", "", "d0", "(Ljava/util/List;)Ljava/util/List;", "relative", "h0", "i0", "j0", "k0", "Y", "(Ljava/io/File;)Ljava/lang/String;", "extension", "Z", "invariantSeparatorsPath", "a0", "nameWithoutExtension", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/io/FilesKt")
public class d31 extends c31 {

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/io/File;", "<anonymous parameter 0>", "Ljava/io/IOException;", "exception", "", "a", "(Ljava/io/File;Ljava/io/IOException;)Ljava/lang/Void;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.d31$a */
    public static final class C4950a extends d12 implements sc1 {

        /* renamed from: a */
        public static final C4950a f27204a = new C4950a();

        public C4950a() {
            super(2);
        }

        @vr2
        /* renamed from: a */
        public final Void mo21054h0(@vr2 File file, @vr2 IOException iOException) {
            jt1.m53777p(file, "<anonymous parameter 0>");
            jt1.m53777p(iOException, "exception");
            throw iOException;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/io/File;", "f", "Ljava/io/IOException;", "e", "Lcom/onedelhi/secure/un4;", "a", "(Ljava/io/File;Ljava/io/IOException;)V"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.d31$b */
    public static final class C4951b extends d12 implements sc1<File, IOException, un4> {

        /* renamed from: a */
        public final /* synthetic */ sc1<File, IOException, uu2> f27205a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4951b(sc1<? super File, ? super IOException, ? extends uu2> sc1) {
            super(2);
            this.f27205a = sc1;
        }

        /* renamed from: a */
        public final void mo34179a(@vr2 File file, @vr2 IOException iOException) {
            jt1.m53777p(file, "f");
            jt1.m53777p(iOException, "e");
            if (this.f27205a.mo21054h0(file, iOException) == uu2.TERMINATE) {
                throw new ma4(file);
            }
        }

        /* renamed from: h0 */
        public /* bridge */ /* synthetic */ Object mo21054h0(Object obj, Object obj2) {
            mo34179a((File) obj, (IOException) obj2);
            return un4.f36206a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c A[Catch:{ ma4 -> 0x00dc }] */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m44636N(@com.onedelhi.secure.vr2 java.io.File r11, @com.onedelhi.secure.vr2 java.io.File r12, boolean r13, @com.onedelhi.secure.vr2 com.onedelhi.secure.sc1<? super java.io.File, ? super java.io.IOException, ? extends com.onedelhi.secure.uu2> r14) {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r11, r0)
            java.lang.String r0 = "target"
            com.onedelhi.secure.jt1.m53777p(r12, r0)
            java.lang.String r0 = "onError"
            com.onedelhi.secure.jt1.m53777p(r14, r0)
            boolean r0 = r11.exists()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x002e
            com.onedelhi.secure.er2 r12 = new com.onedelhi.secure.er2
            r5 = 0
            r7 = 2
            r8 = 0
            java.lang.String r6 = "The source file doesn't exist."
            r3 = r12
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = r14.mo21054h0(r11, r12)
            com.onedelhi.secure.uu2 r12 = com.onedelhi.secure.uu2.TERMINATE
            if (r11 == r12) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            return r1
        L_0x002e:
            com.onedelhi.secure.w21 r0 = com.onedelhi.secure.c31.m40675M(r11)     // Catch:{ ma4 -> 0x00dc }
            com.onedelhi.secure.d31$b r3 = new com.onedelhi.secure.d31$b     // Catch:{ ma4 -> 0x00dc }
            r3.<init>(r14)     // Catch:{ ma4 -> 0x00dc }
            com.onedelhi.secure.w21 r0 = r0.mo46499k(r3)     // Catch:{ ma4 -> 0x00dc }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ ma4 -> 0x00dc }
        L_0x003f:
            boolean r3 = r0.hasNext()     // Catch:{ ma4 -> 0x00dc }
            if (r3 == 0) goto L_0x00db
            java.lang.Object r3 = r0.next()     // Catch:{ ma4 -> 0x00dc }
            java.io.File r3 = (java.io.File) r3     // Catch:{ ma4 -> 0x00dc }
            boolean r4 = r3.exists()     // Catch:{ ma4 -> 0x00dc }
            if (r4 != 0) goto L_0x0066
            com.onedelhi.secure.er2 r10 = new com.onedelhi.secure.er2     // Catch:{ ma4 -> 0x00dc }
            r6 = 0
            java.lang.String r7 = "The source file doesn't exist."
            r8 = 2
            r9 = 0
            r4 = r10
            r5 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ ma4 -> 0x00dc }
            java.lang.Object r3 = r14.mo21054h0(r3, r10)     // Catch:{ ma4 -> 0x00dc }
            com.onedelhi.secure.uu2 r4 = com.onedelhi.secure.uu2.TERMINATE     // Catch:{ ma4 -> 0x00dc }
            if (r3 != r4) goto L_0x003f
            return r2
        L_0x0066:
            java.lang.String r4 = m44662n0(r3, r11)     // Catch:{ ma4 -> 0x00dc }
            java.io.File r5 = new java.io.File     // Catch:{ ma4 -> 0x00dc }
            r5.<init>(r12, r4)     // Catch:{ ma4 -> 0x00dc }
            boolean r4 = r5.exists()     // Catch:{ ma4 -> 0x00dc }
            if (r4 == 0) goto L_0x00ac
            boolean r4 = r3.isDirectory()     // Catch:{ ma4 -> 0x00dc }
            if (r4 == 0) goto L_0x0081
            boolean r4 = r5.isDirectory()     // Catch:{ ma4 -> 0x00dc }
            if (r4 != 0) goto L_0x00ac
        L_0x0081:
            if (r13 != 0) goto L_0x0085
        L_0x0083:
            r4 = 1
            goto L_0x009a
        L_0x0085:
            boolean r4 = r5.isDirectory()     // Catch:{ ma4 -> 0x00dc }
            if (r4 == 0) goto L_0x0092
            boolean r4 = m44644V(r5)     // Catch:{ ma4 -> 0x00dc }
            if (r4 != 0) goto L_0x0099
            goto L_0x0083
        L_0x0092:
            boolean r4 = r5.delete()     // Catch:{ ma4 -> 0x00dc }
            if (r4 != 0) goto L_0x0099
            goto L_0x0083
        L_0x0099:
            r4 = 0
        L_0x009a:
            if (r4 == 0) goto L_0x00ac
            com.onedelhi.secure.h21 r4 = new com.onedelhi.secure.h21     // Catch:{ ma4 -> 0x00dc }
            java.lang.String r6 = "The destination file already exists."
            r4.<init>(r3, r5, r6)     // Catch:{ ma4 -> 0x00dc }
            java.lang.Object r3 = r14.mo21054h0(r5, r4)     // Catch:{ ma4 -> 0x00dc }
            com.onedelhi.secure.uu2 r4 = com.onedelhi.secure.uu2.TERMINATE     // Catch:{ ma4 -> 0x00dc }
            if (r3 != r4) goto L_0x003f
            return r2
        L_0x00ac:
            boolean r4 = r3.isDirectory()     // Catch:{ ma4 -> 0x00dc }
            if (r4 == 0) goto L_0x00b6
            r5.mkdirs()     // Catch:{ ma4 -> 0x00dc }
            goto L_0x003f
        L_0x00b6:
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r3
            r6 = r13
            java.io.File r4 = m44639Q(r4, r5, r6, r7, r8, r9)     // Catch:{ ma4 -> 0x00dc }
            long r4 = r4.length()     // Catch:{ ma4 -> 0x00dc }
            long r6 = r3.length()     // Catch:{ ma4 -> 0x00dc }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x003f
            java.io.IOException r4 = new java.io.IOException     // Catch:{ ma4 -> 0x00dc }
            java.lang.String r5 = "Source file wasn't copied completely, length of destination file differs."
            r4.<init>(r5)     // Catch:{ ma4 -> 0x00dc }
            java.lang.Object r3 = r14.mo21054h0(r3, r4)     // Catch:{ ma4 -> 0x00dc }
            com.onedelhi.secure.uu2 r4 = com.onedelhi.secure.uu2.TERMINATE     // Catch:{ ma4 -> 0x00dc }
            if (r3 != r4) goto L_0x003f
            return r2
        L_0x00db:
            return r1
        L_0x00dc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.d31.m44636N(java.io.File, java.io.File, boolean, com.onedelhi.secure.sc1):boolean");
    }

    /* renamed from: O */
    public static /* synthetic */ boolean m44637O(File file, File file2, boolean z, sc1 sc1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            sc1 = C4950a.f27204a;
        }
        return m44636N(file, file2, z, sc1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0064, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0068, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006b, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006c, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006f, code lost:
        throw r7;
     */
    @com.onedelhi.secure.vr2
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File m44638P(@com.onedelhi.secure.vr2 java.io.File r6, @com.onedelhi.secure.vr2 java.io.File r7, boolean r8, int r9) {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r6, r0)
            java.lang.String r0 = "target"
            com.onedelhi.secure.jt1.m53777p(r7, r0)
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x0070
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x002f
            if (r8 == 0) goto L_0x0027
            boolean r8 = r7.delete()
            if (r8 == 0) goto L_0x001f
            goto L_0x002f
        L_0x001f:
            com.onedelhi.secure.h21 r8 = new com.onedelhi.secure.h21
            java.lang.String r9 = "Tried to overwrite the destination, but failed to delete it."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x0027:
            com.onedelhi.secure.h21 r8 = new com.onedelhi.secure.h21
            java.lang.String r9 = "The destination file already exists."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x002f:
            boolean r8 = r6.isDirectory()
            if (r8 == 0) goto L_0x0044
            boolean r8 = r7.mkdirs()
            if (r8 == 0) goto L_0x003c
            goto L_0x0061
        L_0x003c:
            com.onedelhi.secure.v21 r8 = new com.onedelhi.secure.v21
            java.lang.String r9 = "Failed to create target directory."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x0044:
            java.io.File r8 = r7.getParentFile()
            if (r8 == 0) goto L_0x004d
            r8.mkdirs()
        L_0x004d:
            java.io.FileInputStream r8 = new java.io.FileInputStream
            r8.<init>(r6)
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x0069 }
            r6.<init>(r7)     // Catch:{ all -> 0x0069 }
            com.onedelhi.secure.C5053dr.m45499k(r8, r6, r9)     // Catch:{ all -> 0x0062 }
            r9 = 0
            com.onedelhi.secure.C5630hz.m51313a(r6, r9)     // Catch:{ all -> 0x0069 }
            com.onedelhi.secure.C5630hz.m51313a(r8, r9)
        L_0x0061:
            return r7
        L_0x0062:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r9 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r6, r7)     // Catch:{ all -> 0x0069 }
            throw r9     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x006b }
        L_0x006b:
            r7 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r8, r6)
            throw r7
        L_0x0070:
            com.onedelhi.secure.er2 r7 = new com.onedelhi.secure.er2
            r2 = 0
            r4 = 2
            r5 = 0
            java.lang.String r3 = "The source file doesn't exist."
            r0 = r7
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.d31.m44638P(java.io.File, java.io.File, boolean, int):java.io.File");
    }

    /* renamed from: Q */
    public static /* synthetic */ File m44639Q(File file, File file2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return m44638P(file, file2, z, i);
    }

    @vr2
    @xj0(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    /* renamed from: R */
    public static final File m44640R(@vr2 String str, @ss2 String str2, @ss2 File file) {
        jt1.m53777p(str, "prefix");
        File createTempFile = File.createTempFile(str, str2, file);
        createTempFile.delete();
        if (createTempFile.mkdir()) {
            jt1.m53776o(createTempFile, "dir");
            return createTempFile;
        }
        throw new IOException("Unable to create temporary directory " + createTempFile + '.');
    }

    /* renamed from: S */
    public static /* synthetic */ File m44641S(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return m44640R(str, str2, file);
    }

    @vr2
    @xj0(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    /* renamed from: T */
    public static final File m44642T(@vr2 String str, @ss2 String str2, @ss2 File file) {
        jt1.m53777p(str, "prefix");
        File createTempFile = File.createTempFile(str, str2, file);
        jt1.m53776o(createTempFile, "createTempFile(prefix, suffix, directory)");
        return createTempFile;
    }

    /* renamed from: U */
    public static /* synthetic */ File m44643U(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return m44642T(str, str2, file);
    }

    /* renamed from: V */
    public static final boolean m44644V(@vr2 File file) {
        jt1.m53777p(file, "<this>");
        Iterator it = c31.m40674L(file).iterator();
        while (true) {
            boolean z = true;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                File file2 = (File) it.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
    }

    /* renamed from: W */
    public static final boolean m44645W(@vr2 File file, @vr2 File file2) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(file2, "other");
        q21 f = a31.m36050f(file);
        q21 f2 = a31.m36050f(file2);
        if (f2.mo43092i()) {
            return jt1.m53768g(file, file2);
        }
        int h = f.mo43090h() - f2.mo43090h();
        if (h < 0) {
            return false;
        }
        return f.mo43089g().subList(h, f.mo43090h()).equals(f2.mo43089g());
    }

    /* renamed from: X */
    public static final boolean m44646X(@vr2 File file, @vr2 String str) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(str, "other");
        return m44645W(file, new File(str));
    }

    @vr2
    /* renamed from: Y */
    public static final String m44647Y(@vr2 File file) {
        jt1.m53777p(file, "<this>");
        String name = file.getName();
        jt1.m53776o(name, "name");
        return u54.m66668q5(name, '.', "");
    }

    @vr2
    /* renamed from: Z */
    public static final String m44648Z(@vr2 File file) {
        jt1.m53777p(file, "<this>");
        if (File.separatorChar != '/') {
            String path = file.getPath();
            jt1.m53776o(path, "path");
            return t54.m65444j2(path, File.separatorChar, '/', false, 4, (Object) null);
        }
        String path2 = file.getPath();
        jt1.m53776o(path2, "path");
        return path2;
    }

    @vr2
    /* renamed from: a0 */
    public static final String m44649a0(@vr2 File file) {
        jt1.m53777p(file, "<this>");
        String name = file.getName();
        jt1.m53776o(name, "name");
        return u54.m66535B5(name, ".", (String) null, 2, (Object) null);
    }

    @vr2
    /* renamed from: b0 */
    public static final File m44650b0(@vr2 File file) {
        jt1.m53777p(file, "<this>");
        q21 f = a31.m36050f(file);
        File e = f.mo43086e();
        List<File> d0 = m44652d0(f.mo43089g());
        String str = File.separator;
        jt1.m53776o(str, "separator");
        return m44657i0(e, a10.m35851h3(d0, str, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (ec1) null, 62, (Object) null));
    }

    /* renamed from: c0 */
    public static final q21 m44651c0(q21 q21) {
        return new q21(q21.mo43086e(), m44652d0(q21.mo43089g()));
    }

    /* renamed from: d0 */
    public static final List<File> m44652d0(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!jt1.m53768g(name, ".")) {
                if (!jt1.m53768g(name, "..") || arrayList.isEmpty() || jt1.m53768g(((File) a10.m35865k3(arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    @vr2
    /* renamed from: e0 */
    public static final File m44653e0(@vr2 File file, @vr2 File file2) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(file2, "base");
        return new File(m44662n0(file, file2));
    }

    @ss2
    /* renamed from: f0 */
    public static final File m44654f0(@vr2 File file, @vr2 File file2) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(file2, "base");
        String o0 = m44663o0(file, file2);
        if (o0 != null) {
            return new File(o0);
        }
        return null;
    }

    @vr2
    /* renamed from: g0 */
    public static final File m44655g0(@vr2 File file, @vr2 File file2) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(file2, "base");
        String o0 = m44663o0(file, file2);
        return o0 != null ? new File(o0) : file;
    }

    @vr2
    /* renamed from: h0 */
    public static final File m44656h0(@vr2 File file, @vr2 File file2) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(file2, "relative");
        if (a31.m36048d(file2)) {
            return file2;
        }
        String file3 = file.toString();
        jt1.m53776o(file3, "this.toString()");
        if ((file3.length() == 0) || u54.m66618a3(file3, File.separatorChar, false, 2, (Object) null)) {
            return new File(file3 + file2);
        }
        return new File(file3 + File.separatorChar + file2);
    }

    @vr2
    /* renamed from: i0 */
    public static final File m44657i0(@vr2 File file, @vr2 String str) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(str, "relative");
        return m44656h0(file, new File(str));
    }

    @vr2
    /* renamed from: j0 */
    public static final File m44658j0(@vr2 File file, @vr2 File file2) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(file2, "relative");
        q21 f = a31.m36050f(file);
        return m44656h0(m44656h0(f.mo43086e(), f.mo43090h() == 0 ? new File("..") : f.mo43093j(0, f.mo43090h() - 1)), file2);
    }

    @vr2
    /* renamed from: k0 */
    public static final File m44659k0(@vr2 File file, @vr2 String str) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(str, "relative");
        return m44658j0(file, new File(str));
    }

    /* renamed from: l0 */
    public static final boolean m44660l0(@vr2 File file, @vr2 File file2) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(file2, "other");
        q21 f = a31.m36050f(file);
        q21 f2 = a31.m36050f(file2);
        if (jt1.m53768g(f.mo43086e(), f2.mo43086e()) && f.mo43090h() >= f2.mo43090h()) {
            return f.mo43089g().subList(0, f2.mo43090h()).equals(f2.mo43089g());
        }
        return false;
    }

    /* renamed from: m0 */
    public static final boolean m44661m0(@vr2 File file, @vr2 String str) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(str, "other");
        return m44660l0(file, new File(str));
    }

    @vr2
    /* renamed from: n0 */
    public static final String m44662n0(@vr2 File file, @vr2 File file2) {
        jt1.m53777p(file, "<this>");
        jt1.m53777p(file2, "base");
        String o0 = m44663o0(file, file2);
        if (o0 != null) {
            return o0;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + '.');
    }

    /* renamed from: o0 */
    public static final String m44663o0(File file, File file2) {
        q21 c0 = m44651c0(a31.m36050f(file));
        q21 c02 = m44651c0(a31.m36050f(file2));
        if (!jt1.m53768g(c0.mo43086e(), c02.mo43086e())) {
            return null;
        }
        int h = c02.mo43090h();
        int h2 = c0.mo43090h();
        int i = 0;
        int min = Math.min(h2, h);
        while (i < min && jt1.m53768g(c0.mo43089g().get(i), c02.mo43089g().get(i))) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = h - 1;
        if (i <= i2) {
            while (!jt1.m53768g(c02.mo43089g().get(i2).getName(), "..")) {
                sb.append("..");
                if (i2 != i) {
                    sb.append(File.separatorChar);
                }
                if (i2 != i) {
                    i2--;
                }
            }
            return null;
        }
        if (i < h2) {
            if (i < h) {
                sb.append(File.separatorChar);
            }
            List<T> X1 = a10.m35800X1(c0.mo43089g(), i);
            String str = File.separator;
            jt1.m53776o(str, "separator");
            a10.m35841f3(X1, sb, str, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (ec1) null, 124, (Object) null);
        }
        return sb.toString();
    }
}
