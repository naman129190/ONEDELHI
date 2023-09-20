package com.onedelhi.secure;

import kotlin.Metadata;

@gz3(version = "1.5")
@tw4(markerClass = {oy0.class})
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u001a\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001a\u0010\u0012\u001a\u00020\u00038VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00038VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011ø\u0001\u0000\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lcom/onedelhi/secure/zl4;", "Lcom/onedelhi/secure/xl4;", "Lcom/onedelhi/secure/mz;", "Lcom/onedelhi/secure/tl4;", "value", "", "r", "(J)Z", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "t", "()J", "start", "s", "endInclusive", "<init>", "(JJLcom/onedelhi/secure/wg0;)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class zl4 extends xl4 implements C6158mz<tl4> {
    @vr2

    /* renamed from: a */
    public static final C7502a f38361a = new C7502a((wg0) null);
    @vr2

    /* renamed from: a */
    public static final zl4 f38362a = new zl4(-1, 0, (wg0) null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/onedelhi/secure/zl4$a;", "", "Lcom/onedelhi/secure/zl4;", "EMPTY", "Lcom/onedelhi/secure/zl4;", "a", "()Lcom/onedelhi/secure/zl4;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.zl4$a */
    public static final class C7502a {
        public C7502a() {
        }

        public /* synthetic */ C7502a(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final zl4 mo48314a() {
            return zl4.f38362a;
        }
    }

    public zl4(long j, long j2) {
        super(j, j2, 1, (wg0) null);
    }

    public /* synthetic */ zl4(long j, long j2, wg0 wg0) {
        this(j, j2);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo27426b(Comparable comparable) {
        return mo48311r(((tl4) comparable).mo45180r0());
    }

    public boolean equals(@ss2 Object obj) {
        if (obj instanceof zl4) {
            if (!isEmpty() || !((zl4) obj).isEmpty()) {
                zl4 zl4 = (zl4) obj;
                if (!(mo47350j() == zl4.mo47350j() && mo47351l() == zl4.mo47351l())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public /* bridge */ /* synthetic */ Comparable mo27427g() {
        return tl4.m65991b(mo48312s());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return ((int) tl4.m66012s(mo47351l() ^ tl4.m66012s(mo47351l() >>> 32))) + (((int) tl4.m66012s(mo47350j() ^ tl4.m66012s(mo47350j() >>> 32))) * 31);
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ Comparable mo27428i() {
        return tl4.m65991b(mo48313t());
    }

    public boolean isEmpty() {
        return mo4.m57481g(mo47350j(), mo47351l()) > 0;
    }

    /* renamed from: r */
    public boolean mo48311r(long j) {
        return mo4.m57481g(mo47350j(), j) <= 0 && mo4.m57481g(j, mo47351l()) <= 0;
    }

    /* renamed from: s */
    public long mo48312s() {
        return mo47351l();
    }

    /* renamed from: t */
    public long mo48313t() {
        return mo47350j();
    }

    @vr2
    public String toString() {
        return tl4.m66005m0(mo47350j()) + ".." + tl4.m66005m0(mo47351l());
    }
}
