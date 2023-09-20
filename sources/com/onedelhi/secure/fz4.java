package com.onedelhi.secure;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0013B9\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0012J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0014"}, d2 = {"Lcom/onedelhi/secure/fz4;", "Lcom/onedelhi/secure/me3;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "l", "bitCount", "b", "x", "y", "z", "w", "v", "addend", "<init>", "(IIIIII)V", "seed1", "seed2", "(II)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class fz4 extends me3 implements Serializable {
    @vr2

    /* renamed from: a */
    public static final C5340a f28773a = new C5340a((wg0) null);
    @Deprecated

    /* renamed from: b */
    public static final long f28774b = 0;

    /* renamed from: n */
    public int f28775n;

    /* renamed from: o */
    public int f28776o;

    /* renamed from: p */
    public int f28777p;

    /* renamed from: q */
    public int f28778q;

    /* renamed from: r */
    public int f28779r;

    /* renamed from: s */
    public int f28780s;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/onedelhi/secure/fz4$a;", "", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.fz4$a */
    public static final class C5340a {
        public C5340a() {
        }

        public /* synthetic */ C5340a(wg0 wg0) {
            this();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fz4(int r8, int r9) {
        /*
            r7 = this;
            int r5 = ~r8
            int r0 = r8 << 10
            int r1 = r9 >>> 4
            r6 = r0 ^ r1
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.fz4.<init>(int, int):void");
    }

    public fz4(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f28775n = i;
        this.f28776o = i2;
        this.f28777p = i3;
        this.f28778q = i4;
        this.f28779r = i5;
        this.f28780s = i6;
        int i7 = i | i2 | i3 | i4 | i5;
        if (i7 != 0) {
            for (int i8 = 0; i8 < 64; i8++) {
                mo35703l();
            }
            return;
        }
        throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
    }

    /* renamed from: b */
    public int mo35698b(int i) {
        return pe3.m60976j(mo35703l(), i);
    }

    /* renamed from: l */
    public int mo35703l() {
        int i = this.f28775n;
        int i2 = i ^ (i >>> 2);
        this.f28775n = this.f28776o;
        this.f28776o = this.f28777p;
        this.f28777p = this.f28778q;
        int i3 = this.f28779r;
        this.f28778q = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.f28779r = i4;
        int i5 = this.f28780s + 362437;
        this.f28780s = i5;
        return i4 + i5;
    }
}
