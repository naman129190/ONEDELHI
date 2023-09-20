package com.onedelhi.secure;

import java.util.Random;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tH\u0016R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/onedelhi/secure/d02;", "Ljava/util/Random;", "", "bits", "next", "nextInt", "bound", "", "nextBoolean", "", "nextLong", "", "nextFloat", "", "nextDouble", "", "bytes", "Lcom/onedelhi/secure/un4;", "nextBytes", "seed", "setSeed", "Lcom/onedelhi/secure/me3;", "impl", "Lcom/onedelhi/secure/me3;", "a", "()Lcom/onedelhi/secure/me3;", "<init>", "(Lcom/onedelhi/secure/me3;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class d02 extends Random {
    @vr2

    /* renamed from: a */
    public static final C4941a f27169a = new C4941a((wg0) null);
    @Deprecated

    /* renamed from: b */
    public static final long f27170b = 0;
    @vr2

    /* renamed from: a */
    public final me3 f27171a;

    /* renamed from: b */
    public boolean f27172b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/onedelhi/secure/d02$a;", "", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.d02$a */
    public static final class C4941a {
        public C4941a() {
        }

        public /* synthetic */ C4941a(wg0 wg0) {
            this();
        }
    }

    public d02(@vr2 me3 me3) {
        jt1.m53777p(me3, "impl");
        this.f27171a = me3;
    }

    @vr2
    /* renamed from: a */
    public final me3 mo34041a() {
        return this.f27171a;
    }

    public int next(int i) {
        return this.f27171a.mo35698b(i);
    }

    public boolean nextBoolean() {
        return this.f27171a.mo35699c();
    }

    public void nextBytes(@vr2 byte[] bArr) {
        jt1.m53777p(bArr, "bytes");
        this.f27171a.mo35700e(bArr);
    }

    public double nextDouble() {
        return this.f27171a.mo35701h();
    }

    public float nextFloat() {
        return this.f27171a.mo35702k();
    }

    public int nextInt() {
        return this.f27171a.mo35703l();
    }

    public int nextInt(int i) {
        return this.f27171a.mo35704m(i);
    }

    public long nextLong() {
        return this.f27171a.mo35705o();
    }

    public void setSeed(long j) {
        if (!this.f27172b) {
            this.f27172b = true;
            return;
        }
        throw new UnsupportedOperationException("Setting seed is not supported.");
    }
}
