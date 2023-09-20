package com.onedelhi.secure;

import android.support.p000v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aB\t\b\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002H\u0007J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\f\u0010\u0014\u001a\u00020\u0002*\u00020\u0002H\u0002J\f\u0010\u0015\u001a\u00020\u0002*\u00020\u0002H\u0002J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¨\u0006\u001c"}, d2 = {"Lcom/onedelhi/secure/ic4;", "", "", "bytesPerSecond", "waitByteCount", "maxByteCount", "Lcom/onedelhi/secure/un4;", "d", "byteCount", "j", "(J)J", "now", "a", "(JJ)J", "Lcom/onedelhi/secure/x04;", "source", "i", "Lcom/onedelhi/secure/oz3;", "sink", "h", "g", "f", "nanosToWait", "k", "allocatedUntil", "<init>", "(J)V", "()V", "okio"}, k = 1, mv = {1, 4, 0})
public final class ic4 {

    /* renamed from: a */
    public long f30268a;

    /* renamed from: b */
    public long f30269b;

    /* renamed from: c */
    public long f30270c;

    /* renamed from: d */
    public long f30271d;

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/onedelhi/secure/ic4$a", "Lcom/onedelhi/secure/ma1;", "Lcom/onedelhi/secure/no;", "source", "", "byteCount", "Lcom/onedelhi/secure/un4;", "write", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.ic4$a */
    public static final class C5715a extends ma1 {

        /* renamed from: a */
        public final /* synthetic */ ic4 f30272a;

        /* renamed from: a */
        public final /* synthetic */ oz3 f30273a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5715a(ic4 ic4, oz3 oz3, oz3 oz32) {
            super(oz32);
            this.f30272a = ic4;
            this.f30273a = oz3;
        }

        public void write(@vr2 C6205no noVar, long j) throws IOException {
            jt1.m53777p(noVar, "source");
            while (j > 0) {
                try {
                    long j2 = this.f30272a.mo38026j(j);
                    super.write(noVar, j2);
                    j -= j2;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"com/onedelhi/secure/ic4$b", "Lcom/onedelhi/secure/na1;", "Lcom/onedelhi/secure/no;", "sink", "", "byteCount", "read", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.ic4$b */
    public static final class C5716b extends na1 {

        /* renamed from: a */
        public final /* synthetic */ ic4 f30274a;

        /* renamed from: a */
        public final /* synthetic */ x04 f30275a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5716b(ic4 ic4, x04 x04, x04 x042) {
            super(x042);
            this.f30274a = ic4;
            this.f30275a = x04;
        }

        public long read(@vr2 C6205no noVar, long j) {
            jt1.m53777p(noVar, "sink");
            try {
                return super.read(noVar, this.f30274a.mo38026j(j));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException("interrupted");
            }
        }
    }

    public ic4() {
        this(System.nanoTime());
    }

    public ic4(long j) {
        this.f30271d = j;
        this.f30269b = PlaybackStateCompat.f452t;
        this.f30270c = PlaybackStateCompat.f462y;
    }

    /* renamed from: e */
    public static /* synthetic */ void m52076e(ic4 ic4, long j, long j2, long j3, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = ic4.f30269b;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            j3 = ic4.f30270c;
        }
        ic4.mo38021d(j, j4, j3);
    }

    /* renamed from: a */
    public final long mo38018a(long j, long j2) {
        long f;
        if (this.f30268a == 0) {
            return j2;
        }
        long max = Math.max(this.f30271d - j, 0);
        long g = this.f30270c - mo38023g(max);
        if (g >= j2) {
            j += max;
            f = mo38022f(j2);
        } else {
            long j3 = this.f30269b;
            if (g >= j3) {
                this.f30271d = j + mo38022f(this.f30270c);
                return g;
            }
            j2 = Math.min(j3, j2);
            long f2 = max + mo38022f(j2 - this.f30270c);
            if (f2 != 0) {
                return -f2;
            }
            f = mo38022f(this.f30270c);
        }
        this.f30271d = j + f;
        return j2;
    }

    @vw1
    /* renamed from: b */
    public final void mo38019b(long j) {
        m52076e(this, j, 0, 0, 6, (Object) null);
    }

    @vw1
    /* renamed from: c */
    public final void mo38020c(long j, long j2) {
        m52076e(this, j, j2, 0, 4, (Object) null);
    }

    @vw1
    /* renamed from: d */
    public final void mo38021d(long j, long j2, long j3) {
        synchronized (this) {
            boolean z = true;
            if (j >= 0) {
                if (j2 > 0) {
                    if (j3 < j2) {
                        z = false;
                    }
                    if (z) {
                        this.f30268a = j;
                        this.f30269b = j2;
                        this.f30270c = j3;
                        notifyAll();
                        un4 un4 = un4.f36206a;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    /* renamed from: f */
    public final long mo38022f(long j) {
        return (j * 1000000000) / this.f30268a;
    }

    /* renamed from: g */
    public final long mo38023g(long j) {
        return (j * this.f30268a) / 1000000000;
    }

    @vr2
    /* renamed from: h */
    public final oz3 mo38024h(@vr2 oz3 oz3) {
        jt1.m53777p(oz3, "sink");
        return new C5715a(this, oz3, oz3);
    }

    @vr2
    /* renamed from: i */
    public final x04 mo38025i(@vr2 x04 x04) {
        jt1.m53777p(x04, "source");
        return new C5716b(this, x04, x04);
    }

    /* renamed from: j */
    public final long mo38026j(long j) {
        long a;
        if (j > 0) {
            synchronized (this) {
                while (true) {
                    a = mo38018a(System.nanoTime(), j);
                    if (a < 0) {
                        mo38027k(-a);
                    }
                }
            }
            return a;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: k */
    public final void mo38027k(long j) {
        long j2 = j / zv0.f38454a;
        wait(j2, (int) (j - (zv0.f38454a * j2)));
    }
}
