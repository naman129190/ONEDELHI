package com.onedelhi.secure;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/onedelhi/secure/dr1;", "Lcom/onedelhi/secure/x04;", "Lcom/onedelhi/secure/no;", "sink", "", "byteCount", "read", "Lcom/onedelhi/secure/un4;", "close", "Lcom/onedelhi/secure/me4;", "timeout", "", "toString", "Ljava/io/InputStream;", "input", "<init>", "(Ljava/io/InputStream;Lcom/onedelhi/secure/me4;)V", "okio"}, k = 1, mv = {1, 4, 0})
public final class dr1 implements x04 {

    /* renamed from: a */
    public final me4 f27603a;

    /* renamed from: a */
    public final InputStream f27604a;

    public dr1(@vr2 InputStream inputStream, @vr2 me4 me4) {
        jt1.m53777p(inputStream, "input");
        jt1.m53777p(me4, "timeout");
        this.f27604a = inputStream;
        this.f27603a = me4;
    }

    public void close() {
        this.f27604a.close();
    }

    public long read(@vr2 C6205no noVar, long j) {
        jt1.m53777p(noVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i >= 0) {
            try {
                this.f27603a.mo40561h();
                ws3 f1 = noVar.mo41263f1(1);
                int read = this.f27604a.read(f1.f37111a, f1.f37112b, (int) Math.min(j, (long) (8192 - f1.f37112b)));
                if (read != -1) {
                    f1.f37112b += read;
                    long j2 = (long) read;
                    noVar.mo41237P0(noVar.mo41244V0() + j2);
                    return j2;
                } else if (f1.f37108a != f1.f37112b) {
                    return -1;
                } else {
                    noVar.f32655a = f1.mo46873b();
                    zs3.m74279d(f1);
                    return -1;
                }
            } catch (AssertionError e) {
                if (gu2.m49836e(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } else {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
    }

    @vr2
    public me4 timeout() {
        return this.f27603a;
    }

    @vr2
    public String toString() {
        return "source(" + this.f27604a + ')';
    }
}
