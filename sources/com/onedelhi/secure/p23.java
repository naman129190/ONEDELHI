package com.onedelhi.secure;

import java.io.Serializable;
import java.util.Random;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u000bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/p23;", "Lcom/onedelhi/secure/f1;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/Random;", "impl", "Ljava/util/Random;", "r", "()Ljava/util/Random;", "<init>", "(Ljava/util/Random;)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class p23 extends C5206f1 implements Serializable {
    @vr2

    /* renamed from: a */
    public static final C6360a f33443a = new C6360a((wg0) null);
    @Deprecated

    /* renamed from: b */
    public static final long f33444b = 0;
    @vr2

    /* renamed from: a */
    public final Random f33445a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/onedelhi/secure/p23$a;", "", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.p23$a */
    public static final class C6360a {
        public C6360a() {
        }

        public /* synthetic */ C6360a(wg0 wg0) {
            this();
        }
    }

    public p23(@vr2 Random random) {
        jt1.m53777p(random, "impl");
        this.f33445a = random;
    }

    @vr2
    /* renamed from: r */
    public Random mo35706r() {
        return this.f33445a;
    }
}
