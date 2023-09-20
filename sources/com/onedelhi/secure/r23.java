package com.onedelhi.secure;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/onedelhi/secure/r23;", "Lcom/onedelhi/secure/f1;", "", "from", "until", "n", "", "p", "q", "", "i", "Ljava/util/Random;", "r", "()Ljava/util/Random;", "impl", "<init>", "()V", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 6, 0})
public final class r23 extends C5206f1 {
    /* renamed from: i */
    public double mo40547i(double d) {
        return ThreadLocalRandom.current().nextDouble(d);
    }

    /* renamed from: n */
    public int mo40549n(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    /* renamed from: p */
    public long mo40550p(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    /* renamed from: q */
    public long mo40551q(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @vr2
    /* renamed from: r */
    public Random mo35706r() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        jt1.m53776o(current, "current()");
        return current;
    }
}
