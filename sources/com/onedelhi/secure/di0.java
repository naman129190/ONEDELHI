package com.onedelhi.secure;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¨\u0006\u001a"}, d2 = {"Lcom/onedelhi/secure/di0;", "Lcom/onedelhi/secure/oz3;", "Lcom/onedelhi/secure/no;", "source", "", "byteCount", "Lcom/onedelhi/secure/un4;", "write", "flush", "b", "()V", "close", "Lcom/onedelhi/secure/me4;", "timeout", "", "toString", "", "syncFlush", "a", "Lcom/onedelhi/secure/so;", "sink", "Ljava/util/zip/Deflater;", "deflater", "<init>", "(Lcom/onedelhi/secure/so;Ljava/util/zip/Deflater;)V", "(Lcom/onedelhi/secure/oz3;Ljava/util/zip/Deflater;)V", "okio"}, k = 1, mv = {1, 4, 0})
public final class di0 implements oz3 {

    /* renamed from: a */
    public final C6785so f27460a;

    /* renamed from: a */
    public final Deflater f27461a;

    /* renamed from: b */
    public boolean f27462b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public di0(@vr2 oz3 oz3, @vr2 Deflater deflater) {
        this(gu2.m49834c(oz3), deflater);
        jt1.m53777p(oz3, "sink");
        jt1.m53777p(deflater, "deflater");
    }

    public di0(@vr2 C6785so soVar, @vr2 Deflater deflater) {
        jt1.m53777p(soVar, "sink");
        jt1.m53777p(deflater, "deflater");
        this.f27460a = soVar;
        this.f27461a = deflater;
    }

    @IgnoreJRERequirement
    /* renamed from: a */
    public final void mo34466a(boolean z) {
        ws3 f1;
        C6205no e = this.f27460a.mo31682e();
        while (true) {
            f1 = e.mo41263f1(1);
            Deflater deflater = this.f27461a;
            byte[] bArr = f1.f37111a;
            int i = f1.f37112b;
            int i2 = 8192 - i;
            int deflate = z ? deflater.deflate(bArr, i, i2, 2) : deflater.deflate(bArr, i, i2);
            if (deflate > 0) {
                f1.f37112b += deflate;
                e.mo41237P0(e.mo41244V0() + ((long) deflate));
                this.f27460a.mo41296y2();
            } else if (this.f27461a.needsInput()) {
                break;
            }
        }
        if (f1.f37108a == f1.f37112b) {
            e.f32655a = f1.mo46873b();
            zs3.m74279d(f1);
        }
    }

    /* renamed from: b */
    public final void mo34467b() {
        this.f27461a.finish();
        mo34466a(false);
    }

    public void close() throws IOException {
        if (!this.f27462b) {
            Throwable th = null;
            try {
                mo34467b();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f27461a.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f27460a.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.f27462b = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public void flush() throws IOException {
        mo34466a(true);
        this.f27460a.flush();
    }

    @vr2
    public me4 timeout() {
        return this.f27460a.timeout();
    }

    @vr2
    public String toString() {
        return "DeflaterSink(" + this.f27460a + ')';
    }

    public void write(@vr2 C6205no noVar, long j) throws IOException {
        jt1.m53777p(noVar, "source");
        C5950l.m55169e(noVar.mo41244V0(), 0, j);
        while (j > 0) {
            ws3 ws3 = noVar.f32655a;
            jt1.m53774m(ws3);
            int min = (int) Math.min(j, (long) (ws3.f37112b - ws3.f37108a));
            this.f27461a.setInput(ws3.f37111a, ws3.f37108a, min);
            mo34466a(false);
            long j2 = (long) min;
            noVar.mo41237P0(noVar.mo41244V0() - j2);
            int i = ws3.f37108a + min;
            ws3.f37108a = i;
            if (i == ws3.f37112b) {
                noVar.f32655a = ws3.mo46873b();
                zs3.m74279d(ws3);
            }
            j -= j2;
        }
    }
}
