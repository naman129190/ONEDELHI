package com.onedelhi.secure;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class hh0 implements ImageHeaderParser {

    /* renamed from: a */
    public static final String f13081a = "DfltImageHeaderParser";

    /* renamed from: a */
    public static final byte[] f13082a = f13085b.getBytes(Charset.forName("UTF-8"));

    /* renamed from: a */
    public static final int[] f13083a = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: b */
    public static final int f13084b = 4671814;

    /* renamed from: b */
    public static final String f13085b = "Exif\u0000\u0000";

    /* renamed from: c */
    public static final int f13086c = -1991225785;

    /* renamed from: d */
    public static final int f13087d = 65496;

    /* renamed from: e */
    public static final int f13088e = 19789;

    /* renamed from: f */
    public static final int f13089f = 18761;

    /* renamed from: g */
    public static final int f13090g = 218;

    /* renamed from: h */
    public static final int f13091h = 217;

    /* renamed from: i */
    public static final int f13092i = 255;

    /* renamed from: j */
    public static final int f13093j = 225;

    /* renamed from: k */
    public static final int f13094k = 274;

    /* renamed from: l */
    public static final int f13095l = 1380533830;

    /* renamed from: m */
    public static final int f13096m = 1464156752;

    /* renamed from: n */
    public static final int f13097n = 1448097792;

    /* renamed from: o */
    public static final int f13098o = -256;

    /* renamed from: p */
    public static final int f13099p = 255;

    /* renamed from: q */
    public static final int f13100q = 88;

    /* renamed from: r */
    public static final int f13101r = 76;

    /* renamed from: s */
    public static final int f13102s = 16;

    /* renamed from: t */
    public static final int f13103t = 8;

    /* renamed from: com.onedelhi.secure.hh0$a */
    public static final class C2344a implements C2346c {

        /* renamed from: a */
        public final ByteBuffer f13104a;

        public C2344a(ByteBuffer byteBuffer) {
            this.f13104a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public short mo17272a() throws C2346c.C2347a {
            if (this.f13104a.remaining() >= 1) {
                return (short) (this.f13104a.get() & 255);
            }
            throw new C2346c.C2347a();
        }

        /* renamed from: b */
        public int mo17273b(byte[] bArr, int i) {
            int min = Math.min(i, this.f13104a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f13104a.get(bArr, 0, min);
            return min;
        }

        /* renamed from: c */
        public int mo17274c() throws C2346c.C2347a {
            return (mo17272a() << 8) | mo17272a();
        }

        public long skip(long j) {
            int min = (int) Math.min((long) this.f13104a.remaining(), j);
            ByteBuffer byteBuffer = this.f13104a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    /* renamed from: com.onedelhi.secure.hh0$b */
    public static final class C2345b {

        /* renamed from: a */
        public final ByteBuffer f13105a;

        public C2345b(byte[] bArr, int i) {
            this.f13105a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: a */
        public short mo17276a(int i) {
            if (mo17278c(i, 2)) {
                return this.f13105a.getShort(i);
            }
            return -1;
        }

        /* renamed from: b */
        public int mo17277b(int i) {
            if (mo17278c(i, 4)) {
                return this.f13105a.getInt(i);
            }
            return -1;
        }

        /* renamed from: c */
        public final boolean mo17278c(int i, int i2) {
            return this.f13105a.remaining() - i >= i2;
        }

        /* renamed from: d */
        public int mo17279d() {
            return this.f13105a.remaining();
        }

        /* renamed from: e */
        public void mo17280e(ByteOrder byteOrder) {
            this.f13105a.order(byteOrder);
        }
    }

    /* renamed from: com.onedelhi.secure.hh0$c */
    public interface C2346c {

        /* renamed from: com.onedelhi.secure.hh0$c$a */
        public static final class C2347a extends IOException {

            /* renamed from: b */
            public static final long f13106b = 1;

            public C2347a() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        short mo17272a() throws IOException;

        /* renamed from: b */
        int mo17273b(byte[] bArr, int i) throws IOException;

        /* renamed from: c */
        int mo17274c() throws IOException;

        long skip(long j) throws IOException;
    }

    /* renamed from: com.onedelhi.secure.hh0$d */
    public static final class C2348d implements C2346c {

        /* renamed from: a */
        public final InputStream f13107a;

        public C2348d(InputStream inputStream) {
            this.f13107a = inputStream;
        }

        /* renamed from: a */
        public short mo17272a() throws IOException {
            int read = this.f13107a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new C2346c.C2347a();
        }

        /* renamed from: b */
        public int mo17273b(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f13107a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 != 0 || i3 != -1) {
                return i2;
            }
            throw new C2346c.C2347a();
        }

        /* renamed from: c */
        public int mo17274c() throws IOException {
            return (mo17272a() << 8) | mo17272a();
        }

        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f13107a.skip(j2);
                if (skip <= 0) {
                    if (this.f13107a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    /* renamed from: e */
    public static int m16727e(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: h */
    public static boolean m16728h(int i) {
        return (i & f13087d) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: k */
    public static int m16729k(C2345b bVar) {
        ByteOrder byteOrder;
        String str;
        StringBuilder sb;
        String str2;
        short a = bVar.mo17276a(6);
        if (a != 18761) {
            if (a != 19789 && Log.isLoggable(f13081a, 3)) {
                Log.d(f13081a, "Unknown endianness = " + a);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.mo17280e(byteOrder);
        int b = bVar.mo17277b(10) + 6;
        short a2 = bVar.mo17276a(b);
        for (int i = 0; i < a2; i++) {
            int e = m16727e(b, i);
            short a3 = bVar.mo17276a(e);
            if (a3 == 274) {
                short a4 = bVar.mo17276a(e + 2);
                if (a4 >= 1 && a4 <= 12) {
                    int b2 = bVar.mo17277b(e + 4);
                    if (b2 >= 0) {
                        if (Log.isLoggable(f13081a, 3)) {
                            Log.d(f13081a, "Got tagIndex=" + i + " tagType=" + a3 + " formatCode=" + a4 + " componentCount=" + b2);
                        }
                        int i2 = b2 + f13083a[a4];
                        if (i2 <= 4) {
                            int i3 = e + 8;
                            if (i3 < 0 || i3 > bVar.mo17279d()) {
                                if (Log.isLoggable(f13081a, 3)) {
                                    str = "Illegal tagValueOffset=" + i3 + " tagType=" + a3;
                                    Log.d(f13081a, str);
                                }
                            } else if (i2 >= 0 && i2 + i3 <= bVar.mo17279d()) {
                                return bVar.mo17276a(i3);
                            } else {
                                if (Log.isLoggable(f13081a, 3)) {
                                    sb = new StringBuilder();
                                    sb.append("Illegal number of bytes for TI tag data tagType=");
                                    sb.append(a3);
                                    str = sb.toString();
                                    Log.d(f13081a, str);
                                }
                            }
                        } else if (Log.isLoggable(f13081a, 3)) {
                            sb = new StringBuilder();
                            str2 = "Got byte count > 4, not orientation, continuing, formatCode=";
                        }
                    } else if (Log.isLoggable(f13081a, 3)) {
                        str = "Negative tiff component count";
                        Log.d(f13081a, str);
                    }
                } else if (Log.isLoggable(f13081a, 3)) {
                    sb = new StringBuilder();
                    str2 = "Got invalid format code = ";
                }
                sb.append(str2);
                sb.append(a4);
                str = sb.toString();
                Log.d(f13081a, str);
            }
        }
        return -1;
    }

    /* renamed from: a */
    public int mo7507a(@mr2 InputStream inputStream, @mr2 C3131pa paVar) throws IOException {
        return mo17267f(new C2348d((InputStream) g43.m15509d(inputStream)), (C3131pa) g43.m15509d(paVar));
    }

    /* renamed from: b */
    public int mo7508b(@mr2 ByteBuffer byteBuffer, @mr2 C3131pa paVar) throws IOException {
        return mo17267f(new C2344a((ByteBuffer) g43.m15509d(byteBuffer)), (C3131pa) g43.m15509d(paVar));
    }

    @mr2
    /* renamed from: c */
    public ImageHeaderParser.ImageType mo7509c(@mr2 ByteBuffer byteBuffer) throws IOException {
        return mo17268g(new C2344a((ByteBuffer) g43.m15509d(byteBuffer)));
    }

    @mr2
    /* renamed from: d */
    public ImageHeaderParser.ImageType mo7510d(@mr2 InputStream inputStream) throws IOException {
        return mo17268g(new C2348d((InputStream) g43.m15509d(inputStream)));
    }

    /* renamed from: f */
    public final int mo17267f(C2346c cVar, C3131pa paVar) throws IOException {
        byte[] bArr;
        try {
            int c = cVar.mo17274c();
            if (!m16728h(c)) {
                if (Log.isLoggable(f13081a, 3)) {
                    Log.d(f13081a, "Parser doesn't handle magic number: " + c);
                }
                return -1;
            }
            int j = mo17270j(cVar);
            if (j == -1) {
                if (Log.isLoggable(f13081a, 3)) {
                    Log.d(f13081a, "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            bArr = (byte[]) paVar.mo18216d(j, byte[].class);
            int l = mo17271l(cVar, bArr, j);
            paVar.mo18218f(bArr);
            return l;
        } catch (C2346c.C2347a unused) {
            return -1;
        } catch (Throwable th) {
            paVar.mo18218f(bArr);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    @com.onedelhi.secure.mr2
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bumptech.glide.load.ImageHeaderParser.ImageType mo17268g(com.onedelhi.secure.hh0.C2346c r6) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r6.mo17274c()     // Catch:{ a -> 0x00a0 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r6.mo17272a()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r6.mo17272a()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.mo17272a()     // Catch:{ a -> 0x0039 }
            r0 = 3
            if (r6 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ a -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x0039 }
        L_0x0038:
            return r6
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            if (r0 == r1) goto L_0x0044
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x0044:
            r0 = 4
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            int r2 = r6.mo17274c()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.mo17274c()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.16888601E14)
            if (r2 == r3) goto L_0x005c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x005c:
            int r2 = r6.mo17274c()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.mo17274c()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = r2 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L_0x0071
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x0071:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L_0x0088
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.mo17272a()     // Catch:{ a -> 0x00a0 }
            r6 = r6 & 16
            if (r6 == 0) goto L_0x0085
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x0087
        L_0x0085:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x0087:
            return r6
        L_0x0088:
            r3 = 76
            if (r2 != r3) goto L_0x009d
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.mo17272a()     // Catch:{ a -> 0x00a0 }
            r6 = r6 & 8
            if (r6 == 0) goto L_0x009a
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x009c
        L_0x009a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x009c:
            return r6
        L_0x009d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x00a0:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.hh0.mo17268g(com.onedelhi.secure.hh0$c):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    /* renamed from: i */
    public final boolean mo17269i(byte[] bArr, int i) {
        boolean z = bArr != null && i > f13082a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f13082a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    /* renamed from: j */
    public final int mo17270j(C2346c cVar) throws IOException {
        short a;
        int c;
        long j;
        long skip;
        do {
            short a2 = cVar.mo17272a();
            if (a2 != 255) {
                if (Log.isLoggable(f13081a, 3)) {
                    Log.d(f13081a, "Unknown segmentId=" + a2);
                }
                return -1;
            }
            a = cVar.mo17272a();
            if (a == 218) {
                return -1;
            }
            if (a == 217) {
                if (Log.isLoggable(f13081a, 3)) {
                    Log.d(f13081a, "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            c = cVar.mo17274c() - 2;
            if (a == 225) {
                return c;
            }
            j = (long) c;
            skip = cVar.skip(j);
        } while (skip == j);
        if (Log.isLoggable(f13081a, 3)) {
            Log.d(f13081a, "Unable to skip enough data, type: " + a + ", wanted to skip: " + c + ", but actually skipped: " + skip);
        }
        return -1;
    }

    /* renamed from: l */
    public final int mo17271l(C2346c cVar, byte[] bArr, int i) throws IOException {
        int b = cVar.mo17273b(bArr, i);
        if (b != i) {
            if (Log.isLoggable(f13081a, 3)) {
                Log.d(f13081a, "Unable to read exif segment data, length: " + i + ", actually read: " + b);
            }
            return -1;
        } else if (mo17269i(bArr, i)) {
            return m16729k(new C2345b(bArr, i));
        } else {
            if (Log.isLoggable(f13081a, 3)) {
                Log.d(f13081a, "Missing jpeg exif preamble");
            }
            return -1;
        }
    }
}
