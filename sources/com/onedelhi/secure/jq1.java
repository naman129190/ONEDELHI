package com.onedelhi.secure;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0015J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0002¨\u0006\u0016"}, d2 = {"Lcom/onedelhi/secure/jq1;", "Lcom/onedelhi/secure/x04;", "Lcom/onedelhi/secure/no;", "sink", "", "byteCount", "read", "a", "", "b", "Lcom/onedelhi/secure/me4;", "timeout", "Lcom/onedelhi/secure/un4;", "close", "c", "Lcom/onedelhi/secure/to;", "source", "Ljava/util/zip/Inflater;", "inflater", "<init>", "(Lcom/onedelhi/secure/to;Ljava/util/zip/Inflater;)V", "(Lcom/onedelhi/secure/x04;Ljava/util/zip/Inflater;)V", "okio"}, k = 1, mv = {1, 4, 0})
public final class jq1 implements x04 {

    /* renamed from: a */
    public final C6893to f30903a;

    /* renamed from: a */
    public final Inflater f30904a;

    /* renamed from: b */
    public boolean f30905b;

    /* renamed from: n */
    public int f30906n;

    public jq1(@vr2 C6893to toVar, @vr2 Inflater inflater) {
        jt1.m53777p(toVar, "source");
        jt1.m53777p(inflater, "inflater");
        this.f30903a = toVar;
        this.f30904a = inflater;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public jq1(@vr2 x04 x04, @vr2 Inflater inflater) {
        this(gu2.m49835d(x04), inflater);
        jt1.m53777p(x04, "source");
        jt1.m53777p(inflater, "inflater");
    }

    /* renamed from: a */
    public final long mo38807a(@vr2 C6205no noVar, long j) throws IOException {
        jt1.m53777p(noVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!(!this.f30905b)) {
            throw new IllegalStateException("closed".toString());
        } else if (i == 0) {
            return 0;
        } else {
            try {
                ws3 f1 = noVar.mo41263f1(1);
                int min = (int) Math.min(j, (long) (8192 - f1.f37112b));
                mo38808b();
                int inflate = this.f30904a.inflate(f1.f37111a, f1.f37112b, min);
                mo38809c();
                if (inflate > 0) {
                    f1.f37112b += inflate;
                    long j2 = (long) inflate;
                    noVar.mo41237P0(noVar.mo41244V0() + j2);
                    return j2;
                }
                if (f1.f37108a == f1.f37112b) {
                    noVar.f32655a = f1.mo46873b();
                    zs3.m74279d(f1);
                }
                return 0;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo38808b() throws IOException {
        if (!this.f30904a.needsInput()) {
            return false;
        }
        if (this.f30903a.mo31685f2()) {
            return true;
        }
        ws3 ws3 = this.f30903a.mo31682e().f32655a;
        jt1.m53774m(ws3);
        int i = ws3.f37112b;
        int i2 = ws3.f37108a;
        int i3 = i - i2;
        this.f30906n = i3;
        this.f30904a.setInput(ws3.f37111a, i2, i3);
        return false;
    }

    /* renamed from: c */
    public final void mo38809c() {
        int i = this.f30906n;
        if (i != 0) {
            int remaining = i - this.f30904a.getRemaining();
            this.f30906n -= remaining;
            this.f30903a.mo31670F1((long) remaining);
        }
    }

    public void close() throws IOException {
        if (!this.f30905b) {
            this.f30904a.end();
            this.f30905b = true;
            this.f30903a.close();
        }
    }

    public long read(@vr2 C6205no noVar, long j) throws IOException {
        jt1.m53777p(noVar, "sink");
        do {
            long a = mo38807a(noVar, j);
            if (a > 0) {
                return a;
            }
            if (this.f30904a.finished() || this.f30904a.needsDictionary()) {
                return -1;
            }
        } while (!this.f30903a.mo31685f2());
        throw new EOFException("source exhausted prematurely");
    }

    @vr2
    public me4 timeout() {
        return this.f30903a.timeout();
    }
}
