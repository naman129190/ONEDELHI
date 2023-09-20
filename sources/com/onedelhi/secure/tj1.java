package com.onedelhi.secure;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0002J \u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¨\u0006\u0019"}, d2 = {"Lcom/onedelhi/secure/tj1;", "Lcom/onedelhi/secure/x04;", "Lcom/onedelhi/secure/no;", "sink", "", "byteCount", "read", "Lcom/onedelhi/secure/me4;", "timeout", "Lcom/onedelhi/secure/un4;", "close", "b", "c", "buffer", "offset", "d", "", "name", "", "expected", "actual", "a", "source", "<init>", "(Lcom/onedelhi/secure/x04;)V", "okio"}, k = 1, mv = {1, 4, 0})
public final class tj1 implements x04 {

    /* renamed from: a */
    public byte f35664a;

    /* renamed from: a */
    public final bg3 f35665a;

    /* renamed from: a */
    public final jq1 f35666a;

    /* renamed from: a */
    public final CRC32 f35667a = new CRC32();

    /* renamed from: a */
    public final Inflater f35668a;

    public tj1(@vr2 x04 x04) {
        jt1.m53777p(x04, "source");
        bg3 bg3 = new bg3(x04);
        this.f35665a = bg3;
        Inflater inflater = new Inflater(true);
        this.f35668a = inflater;
        this.f35666a = new jq1((C6893to) bg3, inflater);
    }

    /* renamed from: a */
    public final void mo45156a(String str, int i, int i2) {
        if (i2 != i) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
            jt1.m53776o(format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    /* renamed from: b */
    public final void mo45157b() throws IOException {
        this.f35665a.mo31694o(10);
        byte Z = this.f35665a.f26339a.mo41249Z(3);
        boolean z = true;
        boolean z2 = ((Z >> 1) & 1) == 1;
        if (z2) {
            mo45159d(this.f35665a.f26339a, 0, 10);
        }
        mo45156a("ID1ID2", 8075, this.f35665a.readShort());
        this.f35665a.mo31670F1(8);
        if (((Z >> 2) & 1) == 1) {
            this.f35665a.mo31694o(2);
            if (z2) {
                mo45159d(this.f35665a.f26339a, 0, 2);
            }
            long t1 = (long) this.f35665a.f26339a.mo31711t1();
            this.f35665a.mo31694o(t1);
            if (z2) {
                mo45159d(this.f35665a.f26339a, 0, t1);
            }
            this.f35665a.mo31670F1(t1);
        }
        if (((Z >> 3) & 1) == 1) {
            long i = this.f35665a.mo31686i((byte) 0);
            if (i != -1) {
                if (z2) {
                    mo45159d(this.f35665a.f26339a, 0, i + 1);
                }
                this.f35665a.mo31670F1(i + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((Z >> 4) & 1) != 1) {
            z = false;
        }
        if (z) {
            long i2 = this.f35665a.mo31686i((byte) 0);
            if (i2 != -1) {
                if (z2) {
                    mo45159d(this.f35665a.f26339a, 0, i2 + 1);
                }
                this.f35665a.mo31670F1(i2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z2) {
            mo45156a("FHCRC", this.f35665a.mo31711t1(), (short) ((int) this.f35667a.getValue()));
            this.f35667a.reset();
        }
    }

    /* renamed from: c */
    public final void mo45158c() throws IOException {
        mo45156a("CRC", this.f35665a.mo31693n1(), (int) this.f35667a.getValue());
        mo45156a("ISIZE", this.f35665a.mo31693n1(), (int) this.f35668a.getBytesWritten());
    }

    public void close() throws IOException {
        this.f35666a.close();
    }

    /* renamed from: d */
    public final void mo45159d(C6205no noVar, long j, long j2) {
        ws3 ws3 = noVar.f32655a;
        while (true) {
            jt1.m53774m(ws3);
            int i = ws3.f37112b;
            int i2 = ws3.f37108a;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            ws3 = ws3.f37109a;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) ws3.f37108a) + j);
            int min = (int) Math.min((long) (ws3.f37112b - i3), j2);
            this.f35667a.update(ws3.f37111a, i3, min);
            j2 -= (long) min;
            ws3 = ws3.f37109a;
            jt1.m53774m(ws3);
            j = 0;
        }
    }

    public long read(@vr2 C6205no noVar, long j) throws IOException {
        jt1.m53777p(noVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f35664a == 0) {
                mo45157b();
                this.f35664a = 1;
            }
            if (this.f35664a == 1) {
                long V0 = noVar.mo41244V0();
                long read = this.f35666a.read(noVar, j);
                if (read != -1) {
                    mo45159d(noVar, V0, read);
                    return read;
                }
                this.f35664a = 2;
            }
            if (this.f35664a == 2) {
                mo45158c();
                this.f35664a = 3;
                if (!this.f35665a.mo31685f2()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    @vr2
    public me4 timeout() {
        return this.f35665a.timeout();
    }
}
