package com.onedelhi.secure;

import java.util.Random;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/onedelhi/secure/f1;", "Lcom/onedelhi/secure/me3;", "", "bitCount", "b", "l", "until", "m", "", "o", "", "c", "", "h", "", "k", "", "array", "e", "Ljava/util/Random;", "r", "()Ljava/util/Random;", "impl", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.f1 */
public abstract class C5206f1 extends me3 {
    /* renamed from: b */
    public int mo35698b(int i) {
        return pe3.m60976j(mo35706r().nextInt(), i);
    }

    /* renamed from: c */
    public boolean mo35699c() {
        return mo35706r().nextBoolean();
    }

    @vr2
    /* renamed from: e */
    public byte[] mo35700e(@vr2 byte[] bArr) {
        jt1.m53777p(bArr, "array");
        mo35706r().nextBytes(bArr);
        return bArr;
    }

    /* renamed from: h */
    public double mo35701h() {
        return mo35706r().nextDouble();
    }

    /* renamed from: k */
    public float mo35702k() {
        return mo35706r().nextFloat();
    }

    /* renamed from: l */
    public int mo35703l() {
        return mo35706r().nextInt();
    }

    /* renamed from: m */
    public int mo35704m(int i) {
        return mo35706r().nextInt(i);
    }

    /* renamed from: o */
    public long mo35705o() {
        return mo35706r().nextLong();
    }

    @vr2
    /* renamed from: r */
    public abstract Random mo35706r();
}
