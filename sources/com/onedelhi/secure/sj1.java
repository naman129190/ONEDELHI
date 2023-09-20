package com.onedelhi.secure;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0006H\u0002J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0017\u0010\u0012\u001a\u00020\f8G¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/onedelhi/secure/sj1;", "Lcom/onedelhi/secure/oz3;", "Lcom/onedelhi/secure/no;", "source", "", "byteCount", "Lcom/onedelhi/secure/un4;", "write", "flush", "Lcom/onedelhi/secure/me4;", "timeout", "close", "Ljava/util/zip/Deflater;", "a", "()Ljava/util/zip/Deflater;", "d", "buffer", "c", "deflater", "Ljava/util/zip/Deflater;", "b", "sink", "<init>", "(Lcom/onedelhi/secure/oz3;)V", "okio"}, k = 1, mv = {1, 4, 0})
public final class sj1 implements oz3 {

    /* renamed from: a */
    public final di0 f35105a;

    /* renamed from: a */
    public final zf3 f35106a;

    /* renamed from: a */
    public final CRC32 f35107a = new CRC32();
    @vr2

    /* renamed from: a */
    public final Deflater f35108a;

    /* renamed from: b */
    public boolean f35109b;

    public sj1(@vr2 oz3 oz3) {
        jt1.m53777p(oz3, "sink");
        zf3 zf3 = new zf3(oz3);
        this.f35106a = zf3;
        Deflater deflater = new Deflater(-1, true);
        this.f35108a = deflater;
        this.f35105a = new di0((C6785so) zf3, deflater);
        C6205no noVar = zf3.f38327a;
        noVar.mo41243V(8075);
        noVar.mo41230L0(8);
        noVar.mo41230L0(0);
        noVar.mo41293w0(0);
        noVar.mo41230L0(0);
        noVar.mo41230L0(0);
    }

    @uw1(name = "-deprecated_deflater")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "deflater", imports = {}))
    /* renamed from: a */
    public final Deflater mo44383a() {
        return this.f35108a;
    }

    @uw1(name = "deflater")
    @vr2
    /* renamed from: b */
    public final Deflater mo44384b() {
        return this.f35108a;
    }

    /* renamed from: c */
    public final void mo44385c(C6205no noVar, long j) {
        ws3 ws3 = noVar.f32655a;
        while (true) {
            jt1.m53774m(ws3);
            if (j > 0) {
                int min = (int) Math.min(j, (long) (ws3.f37112b - ws3.f37108a));
                this.f35107a.update(ws3.f37111a, ws3.f37108a, min);
                j -= (long) min;
                ws3 = ws3.f37109a;
            } else {
                return;
            }
        }
    }

    public void close() throws IOException {
        if (!this.f35109b) {
            Throwable th = null;
            try {
                this.f35105a.mo34467b();
                mo44386d();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f35108a.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f35106a.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.f35109b = true;
            if (th != null) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final void mo44386d() {
        this.f35106a.mo41268h2((int) this.f35107a.getValue());
        this.f35106a.mo41268h2((int) this.f35108a.getBytesRead());
    }

    public void flush() throws IOException {
        this.f35105a.flush();
    }

    @vr2
    public me4 timeout() {
        return this.f35106a.timeout();
    }

    public void write(@vr2 C6205no noVar, long j) throws IOException {
        jt1.m53777p(noVar, "source");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (i != 0) {
            mo44385c(noVar, j);
            this.f35105a.write(noVar, j);
        }
    }
}
