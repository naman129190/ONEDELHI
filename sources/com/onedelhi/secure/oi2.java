package com.onedelhi.secure;

import android.content.res.AssetManager;
import com.onedelhi.secure.hl3;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@sj3(19)
@hl3({hl3.C2354a.LIBRARY})
@C3568t7
public class oi2 {

    /* renamed from: a */
    public static final int f17970a = 1164798569;

    /* renamed from: b */
    public static final int f17971b = 1701669481;

    /* renamed from: c */
    public static final int f17972c = 1835365473;

    /* renamed from: com.onedelhi.secure.oi2$a */
    public static class C3062a implements C3065d {
        @mr2

        /* renamed from: a */
        public final ByteBuffer f17973a;

        public C3062a(@mr2 ByteBuffer byteBuffer) {
            this.f17973a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo21943a() throws IOException {
            return this.f17973a.getInt();
        }

        /* renamed from: b */
        public long mo21944b() throws IOException {
            return oi2.m23802e(this.f17973a.getInt());
        }

        /* renamed from: c */
        public void mo21945c(int i) throws IOException {
            ByteBuffer byteBuffer = this.f17973a;
            byteBuffer.position(byteBuffer.position() + i);
        }

        /* renamed from: d */
        public long mo21946d() {
            return (long) this.f17973a.position();
        }

        public int readUnsignedShort() throws IOException {
            return oi2.m23803f(this.f17973a.getShort());
        }
    }

    /* renamed from: com.onedelhi.secure.oi2$b */
    public static class C3063b implements C3065d {

        /* renamed from: a */
        public long f17974a = 0;
        @mr2

        /* renamed from: a */
        public final InputStream f17975a;
        @mr2

        /* renamed from: a */
        public final ByteBuffer f17976a;
        @mr2

        /* renamed from: a */
        public final byte[] f17977a;

        public C3063b(@mr2 InputStream inputStream) {
            this.f17975a = inputStream;
            byte[] bArr = new byte[4];
            this.f17977a = bArr;
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.f17976a = wrap;
            wrap.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo21943a() throws IOException {
            this.f17976a.position(0);
            mo21948e(4);
            return this.f17976a.getInt();
        }

        /* renamed from: b */
        public long mo21944b() throws IOException {
            this.f17976a.position(0);
            mo21948e(4);
            return oi2.m23802e(this.f17976a.getInt());
        }

        /* renamed from: c */
        public void mo21945c(int i) throws IOException {
            while (i > 0) {
                int skip = (int) this.f17975a.skip((long) i);
                if (skip >= 1) {
                    i -= skip;
                    this.f17974a += (long) skip;
                } else {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
            }
        }

        /* renamed from: d */
        public long mo21946d() {
            return this.f17974a;
        }

        /* renamed from: e */
        public final void mo21948e(@js1(from = 0, mo18580to = 4) int i) throws IOException {
            if (this.f17975a.read(this.f17977a, 0, i) == i) {
                this.f17974a += (long) i;
                return;
            }
            throw new IOException("read failed");
        }

        public int readUnsignedShort() throws IOException {
            this.f17976a.position(0);
            mo21948e(2);
            return oi2.m23803f(this.f17976a.getShort());
        }
    }

    /* renamed from: com.onedelhi.secure.oi2$c */
    public static class C3064c {

        /* renamed from: a */
        public final long f17978a;

        /* renamed from: b */
        public final long f17979b;

        public C3064c(long j, long j2) {
            this.f17978a = j;
            this.f17979b = j2;
        }

        /* renamed from: a */
        public long mo21949a() {
            return this.f17979b;
        }

        /* renamed from: b */
        public long mo21950b() {
            return this.f17978a;
        }
    }

    /* renamed from: com.onedelhi.secure.oi2$d */
    public interface C3065d {

        /* renamed from: a */
        public static final int f17980a = 2;

        /* renamed from: b */
        public static final int f17981b = 4;

        /* renamed from: a */
        int mo21943a() throws IOException;

        /* renamed from: b */
        long mo21944b() throws IOException;

        /* renamed from: c */
        void mo21945c(int i) throws IOException;

        /* renamed from: d */
        long mo21946d();

        int readUnsignedShort() throws IOException;
    }

    /* renamed from: a */
    public static C3064c m23798a(C3065d dVar) throws IOException {
        long j;
        dVar.mo21945c(4);
        int readUnsignedShort = dVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            dVar.mo21945c(6);
            int i = 0;
            while (true) {
                if (i >= readUnsignedShort) {
                    j = -1;
                    break;
                }
                int a = dVar.mo21943a();
                dVar.mo21945c(4);
                j = dVar.mo21944b();
                dVar.mo21945c(4);
                if (1835365473 == a) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                dVar.mo21945c((int) (j - dVar.mo21946d()));
                dVar.mo21945c(12);
                long b = dVar.mo21944b();
                for (int i2 = 0; ((long) i2) < b; i2++) {
                    int a2 = dVar.mo21943a();
                    long b2 = dVar.mo21944b();
                    long b3 = dVar.mo21944b();
                    if (1164798569 == a2 || 1701669481 == a2) {
                        return new C3064c(b2 + j, b3);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* renamed from: b */
    public static ni2 m23799b(AssetManager assetManager, String str) throws IOException {
        InputStream open = assetManager.open(str);
        try {
            ni2 c = m23800c(open);
            if (open != null) {
                open.close();
            }
            return c;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: c */
    public static ni2 m23800c(InputStream inputStream) throws IOException {
        C3063b bVar = new C3063b(inputStream);
        C3064c a = m23798a(bVar);
        bVar.mo21945c((int) (a.mo21950b() - bVar.mo21946d()));
        ByteBuffer allocate = ByteBuffer.allocate((int) a.mo21949a());
        int read = inputStream.read(allocate.array());
        if (((long) read) == a.mo21949a()) {
            return ni2.m22836G(allocate);
        }
        throw new IOException("Needed " + a.mo21949a() + " bytes, got " + read);
    }

    /* renamed from: d */
    public static ni2 m23801d(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) m23798a(new C3062a(duplicate)).mo21950b());
        return ni2.m22836G(duplicate);
    }

    /* renamed from: e */
    public static long m23802e(int i) {
        return ((long) i) & ZipConstants.ZIP64_MAGIC;
    }

    /* renamed from: f */
    public static int m23803f(short s) {
        return s & xm4.f37547c;
    }
}
