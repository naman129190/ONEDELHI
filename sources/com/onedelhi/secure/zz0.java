package com.onedelhi.secure;

import java.util.Random;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/zz0;", "Lcom/onedelhi/secure/f1;", "Ljava/util/Random;", "r", "()Ljava/util/Random;", "impl", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class zz0 extends C5206f1 {
    @vr2

    /* renamed from: a */
    public final C7526a f38516a = new C7526a();

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, d2 = {"com/onedelhi/secure/zz0$a", "Ljava/lang/ThreadLocal;", "Ljava/util/Random;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.zz0$a */
    public static final class C7526a extends ThreadLocal<Random> {
        @vr2
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    @vr2
    /* renamed from: r */
    public Random mo35706r() {
        Object obj = this.f38516a.get();
        jt1.m53776o(obj, "implStorage.get()");
        return (Random) obj;
    }
}
