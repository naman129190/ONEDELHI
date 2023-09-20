package com.onedelhi.secure;

import android.support.p000v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ea3 implements Closeable {

    /* renamed from: a */
    public static final Logger f27810a = Logger.getLogger(ea3.class.getName());

    /* renamed from: p */
    public static final int f27811p = 4096;

    /* renamed from: q */
    public static final int f27812q = 16;

    /* renamed from: a */
    public C5111b f27813a;

    /* renamed from: a */
    public final RandomAccessFile f27814a;

    /* renamed from: a */
    public final byte[] f27815a = new byte[16];

    /* renamed from: b */
    public C5111b f27816b;

    /* renamed from: n */
    public int f27817n;

    /* renamed from: o */
    public int f27818o;

    /* renamed from: com.onedelhi.secure.ea3$a */
    public class C5110a implements C5113d {

        /* renamed from: a */
        public final /* synthetic */ StringBuilder f27820a;

        /* renamed from: a */
        public boolean f27821a = true;

        public C5110a(StringBuilder sb) {
            this.f27820a = sb;
        }

        /* renamed from: a */
        public void mo34983a(InputStream inputStream, int i) throws IOException {
            if (this.f27821a) {
                this.f27821a = false;
            } else {
                this.f27820a.append(", ");
            }
            this.f27820a.append(i);
        }
    }

    /* renamed from: com.onedelhi.secure.ea3$b */
    public static class C5111b {

        /* renamed from: a */
        public static final C5111b f27822a = new C5111b(0, 0);

        /* renamed from: c */
        public static final int f27823c = 4;

        /* renamed from: a */
        public final int f27824a;

        /* renamed from: b */
        public final int f27825b;

        public C5111b(int i, int i2) {
            this.f27824a = i;
            this.f27825b = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f27824a + ", length = " + this.f27825b + "]";
        }
    }

    /* renamed from: com.onedelhi.secure.ea3$c */
    public final class C5112c extends InputStream {

        /* renamed from: n */
        public int f27827n;

        /* renamed from: o */
        public int f27828o;

        public C5112c(C5111b bVar) {
            this.f27827n = ea3.this.mo34961C0(bVar.f27824a + 4);
            this.f27828o = bVar.f27825b;
        }

        public /* synthetic */ C5112c(ea3 ea3, C5111b bVar, C5110a aVar) {
            this(bVar);
        }

        public int read() throws IOException {
            if (this.f27828o == 0) {
                return -1;
            }
            ea3.this.f27814a.seek((long) this.f27827n);
            int read = ea3.this.f27814a.read();
            this.f27827n = ea3.this.mo34961C0(this.f27827n + 1);
            this.f27828o--;
            return read;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            Object unused = ea3.m46196H(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f27828o;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            ea3.this.mo34974l0(this.f27827n, bArr, i, i2);
            this.f27827n = ea3.this.mo34961C0(this.f27827n + i2);
            this.f27828o -= i2;
            return i2;
        }
    }

    /* renamed from: com.onedelhi.secure.ea3$d */
    public interface C5113d {
        /* renamed from: a */
        void mo34983a(InputStream inputStream, int i) throws IOException;
    }

    public ea3(File file) throws IOException {
        if (!file.exists()) {
            m46194A(file);
        }
        this.f27814a = m46197K(file);
        mo34967Z();
    }

    public ea3(RandomAccessFile randomAccessFile) throws IOException {
        this.f27814a = randomAccessFile;
        mo34967Z();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: A */
    public static void m46194A(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile K = m46197K(file2);
        try {
            K.setLength(PlaybackStateCompat.f450s);
            K.seek(0);
            byte[] bArr = new byte[16];
            m46198M0(bArr, 4096, 0, 0, 0);
            K.write(bArr);
            K.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            K.close();
            throw th;
        }
    }

    /* renamed from: G0 */
    public static void m46195G0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: H */
    public static <T> T m46196H(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: K */
    public static RandomAccessFile m46197K(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: M0 */
    public static void m46198M0(byte[] bArr, int... iArr) {
        int i = 0;
        for (int G0 : iArr) {
            m46195G0(bArr, i, G0);
            i += 4;
        }
    }

    /* renamed from: c0 */
    public static int m46202c0(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: C0 */
    public final int mo34961C0(int i) {
        int i2 = this.f27817n;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: E */
    public synchronized boolean mo34962E() {
        return this.f27818o == 0;
    }

    /* renamed from: F0 */
    public final void mo34963F0(int i, int i2, int i3, int i4) throws IOException {
        m46198M0(this.f27815a, i, i2, i3, i4);
        this.f27814a.seek(0);
        this.f27814a.write(this.f27815a);
    }

    /* renamed from: M */
    public synchronized void mo34964M(C5113d dVar) throws IOException {
        if (this.f27818o > 0) {
            dVar.mo34983a(new C5112c(this, this.f27813a, (C5110a) null), this.f27813a.f27825b);
        }
    }

    /* renamed from: X */
    public synchronized byte[] mo34965X() throws IOException {
        if (mo34962E()) {
            return null;
        }
        C5111b bVar = this.f27813a;
        int i = bVar.f27825b;
        byte[] bArr = new byte[i];
        mo34974l0(bVar.f27824a + 4, bArr, 0, i);
        return bArr;
    }

    /* renamed from: Y */
    public final C5111b mo34966Y(int i) throws IOException {
        if (i == 0) {
            return C5111b.f27822a;
        }
        this.f27814a.seek((long) i);
        return new C5111b(i, this.f27814a.readInt());
    }

    /* renamed from: Z */
    public final void mo34967Z() throws IOException {
        this.f27814a.seek(0);
        this.f27814a.readFully(this.f27815a);
        int c0 = m46202c0(this.f27815a, 0);
        this.f27817n = c0;
        if (((long) c0) <= this.f27814a.length()) {
            this.f27818o = m46202c0(this.f27815a, 4);
            int c02 = m46202c0(this.f27815a, 8);
            int c03 = m46202c0(this.f27815a, 12);
            this.f27813a = mo34966Y(c02);
            this.f27816b = mo34966Y(c03);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f27817n + ", Actual length: " + this.f27814a.length());
    }

    public synchronized void close() throws IOException {
        this.f27814a.close();
    }

    /* renamed from: e0 */
    public final int mo34969e0() {
        return this.f27817n - mo34982u0();
    }

    /* renamed from: g */
    public void mo34970g(byte[] bArr) throws IOException {
        mo34971h(bArr, 0, bArr.length);
    }

    /* renamed from: h */
    public synchronized void mo34971h(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        m46196H(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        mo34975m(i2);
        boolean E = mo34962E();
        if (E) {
            i3 = 16;
        } else {
            C5111b bVar = this.f27816b;
            i3 = mo34961C0(bVar.f27824a + 4 + bVar.f27825b);
        }
        C5111b bVar2 = new C5111b(i3, i2);
        m46195G0(this.f27815a, 0, i2);
        mo34976o0(bVar2.f27824a, this.f27815a, 0, 4);
        mo34976o0(bVar2.f27824a + 4, bArr, i, i2);
        mo34963F0(this.f27817n, this.f27818o + 1, E ? bVar2.f27824a : this.f27813a.f27824a, bVar2.f27824a);
        this.f27816b = bVar2;
        this.f27818o++;
        if (E) {
            this.f27813a = bVar2;
        }
    }

    /* renamed from: j0 */
    public synchronized void mo34972j0() throws IOException {
        if (mo34962E()) {
            throw new NoSuchElementException();
        } else if (this.f27818o == 1) {
            mo34973l();
        } else {
            C5111b bVar = this.f27813a;
            int C0 = mo34961C0(bVar.f27824a + 4 + bVar.f27825b);
            mo34974l0(C0, this.f27815a, 0, 4);
            int c0 = m46202c0(this.f27815a, 0);
            mo34963F0(this.f27817n, this.f27818o - 1, C0, this.f27816b.f27824a);
            this.f27818o--;
            this.f27813a = new C5111b(C0, c0);
        }
    }

    /* renamed from: l */
    public synchronized void mo34973l() throws IOException {
        mo34963F0(4096, 0, 0, 0);
        this.f27818o = 0;
        C5111b bVar = C5111b.f27822a;
        this.f27813a = bVar;
        this.f27816b = bVar;
        if (this.f27817n > 4096) {
            mo34978p0(4096);
        }
        this.f27817n = 4096;
    }

    /* renamed from: l0 */
    public final void mo34974l0(int i, byte[] bArr, int i2, int i3) throws IOException {
        RandomAccessFile randomAccessFile;
        int C0 = mo34961C0(i);
        int i4 = C0 + i3;
        int i5 = this.f27817n;
        if (i4 <= i5) {
            this.f27814a.seek((long) C0);
            randomAccessFile = this.f27814a;
        } else {
            int i6 = i5 - C0;
            this.f27814a.seek((long) C0);
            this.f27814a.readFully(bArr, i2, i6);
            this.f27814a.seek(16);
            randomAccessFile = this.f27814a;
            i2 += i6;
            i3 -= i6;
        }
        randomAccessFile.readFully(bArr, i2, i3);
    }

    /* renamed from: m */
    public final void mo34975m(int i) throws IOException {
        int i2 = i + 4;
        int e0 = mo34969e0();
        if (e0 < i2) {
            int i3 = this.f27817n;
            do {
                e0 += i3;
                i3 <<= 1;
            } while (e0 < i2);
            mo34978p0(i3);
            C5111b bVar = this.f27816b;
            int C0 = mo34961C0(bVar.f27824a + 4 + bVar.f27825b);
            if (C0 < this.f27813a.f27824a) {
                FileChannel channel = this.f27814a.getChannel();
                channel.position((long) this.f27817n);
                long j = (long) (C0 - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i4 = this.f27816b.f27824a;
            int i5 = this.f27813a.f27824a;
            if (i4 < i5) {
                int i6 = (this.f27817n + i4) - 16;
                mo34963F0(i3, this.f27818o, i5, i6);
                this.f27816b = new C5111b(i6, this.f27816b.f27825b);
            } else {
                mo34963F0(i3, this.f27818o, i5, i4);
            }
            this.f27817n = i3;
        }
    }

    /* renamed from: o0 */
    public final void mo34976o0(int i, byte[] bArr, int i2, int i3) throws IOException {
        RandomAccessFile randomAccessFile;
        int C0 = mo34961C0(i);
        int i4 = C0 + i3;
        int i5 = this.f27817n;
        if (i4 <= i5) {
            this.f27814a.seek((long) C0);
            randomAccessFile = this.f27814a;
        } else {
            int i6 = i5 - C0;
            this.f27814a.seek((long) C0);
            this.f27814a.write(bArr, i2, i6);
            this.f27814a.seek(16);
            randomAccessFile = this.f27814a;
            i2 += i6;
            i3 -= i6;
        }
        randomAccessFile.write(bArr, i2, i3);
    }

    /* renamed from: p */
    public synchronized void mo34977p(C5113d dVar) throws IOException {
        int i = this.f27813a.f27824a;
        for (int i2 = 0; i2 < this.f27818o; i2++) {
            C5111b Y = mo34966Y(i);
            dVar.mo34983a(new C5112c(this, Y, (C5110a) null), Y.f27825b);
            i = mo34961C0(Y.f27824a + 4 + Y.f27825b);
        }
    }

    /* renamed from: p0 */
    public final void mo34978p0(int i) throws IOException {
        this.f27814a.setLength((long) i);
        this.f27814a.getChannel().force(true);
    }

    /* renamed from: q */
    public boolean mo34979q(int i, int i2) {
        return (mo34982u0() + 4) + i <= i2;
    }

    /* renamed from: q0 */
    public synchronized int mo34980q0() {
        return this.f27818o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f27817n);
        sb.append(", size=");
        sb.append(this.f27818o);
        sb.append(", first=");
        sb.append(this.f27813a);
        sb.append(", last=");
        sb.append(this.f27816b);
        sb.append(", element lengths=[");
        try {
            mo34977p(new C5110a(sb));
        } catch (IOException e) {
            f27810a.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: u0 */
    public int mo34982u0() {
        if (this.f27818o == 0) {
            return 16;
        }
        C5111b bVar = this.f27816b;
        int i = bVar.f27824a;
        int i2 = this.f27813a.f27824a;
        return i >= i2 ? (i - i2) + 4 + bVar.f27825b + 16 : (((i + 4) + bVar.f27825b) + this.f27817n) - i2;
    }
}
