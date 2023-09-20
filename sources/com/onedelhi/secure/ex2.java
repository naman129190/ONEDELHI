package com.onedelhi.secure;

import java.io.OutputStream;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0012"}, d2 = {"Lcom/onedelhi/secure/ex2;", "Lcom/onedelhi/secure/oz3;", "Lcom/onedelhi/secure/no;", "source", "", "byteCount", "Lcom/onedelhi/secure/un4;", "write", "flush", "close", "Lcom/onedelhi/secure/me4;", "timeout", "", "toString", "Ljava/io/OutputStream;", "out", "<init>", "(Ljava/io/OutputStream;Lcom/onedelhi/secure/me4;)V", "okio"}, k = 1, mv = {1, 4, 0})
public final class ex2 implements oz3 {

    /* renamed from: a */
    public final me4 f28115a;

    /* renamed from: a */
    public final OutputStream f28116a;

    public ex2(@vr2 OutputStream outputStream, @vr2 me4 me4) {
        jt1.m53777p(outputStream, "out");
        jt1.m53777p(me4, "timeout");
        this.f28116a = outputStream;
        this.f28115a = me4;
    }

    public void close() {
        this.f28116a.close();
    }

    public void flush() {
        this.f28116a.flush();
    }

    @vr2
    public me4 timeout() {
        return this.f28115a;
    }

    @vr2
    public String toString() {
        return "sink(" + this.f28116a + ')';
    }

    public void write(@vr2 C6205no noVar, long j) {
        jt1.m53777p(noVar, "source");
        C5950l.m55169e(noVar.mo41244V0(), 0, j);
        while (j > 0) {
            this.f28115a.mo40561h();
            ws3 ws3 = noVar.f32655a;
            jt1.m53774m(ws3);
            int min = (int) Math.min(j, (long) (ws3.f37112b - ws3.f37108a));
            this.f28116a.write(ws3.f37111a, ws3.f37108a, min);
            ws3.f37108a += min;
            long j2 = (long) min;
            j -= j2;
            noVar.mo41237P0(noVar.mo41244V0() - j2);
            if (ws3.f37108a == ws3.f37112b) {
                noVar.f32655a = ws3.mo46873b();
                zs3.m74279d(ws3);
            }
        }
    }
}
