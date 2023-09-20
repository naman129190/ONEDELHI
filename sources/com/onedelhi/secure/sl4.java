package com.onedelhi.secure;

import kotlin.Metadata;

@gz3(version = "1.5")
@tw4(markerClass = {oy0.class})
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u001a\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001a\u0010\u0012\u001a\u00020\u00038VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00038VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011ø\u0001\u0000\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lcom/onedelhi/secure/sl4;", "Lcom/onedelhi/secure/ql4;", "Lcom/onedelhi/secure/mz;", "Lcom/onedelhi/secure/il4;", "value", "", "r", "(I)Z", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "t", "()I", "start", "s", "endInclusive", "<init>", "(IILcom/onedelhi/secure/wg0;)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class sl4 extends ql4 implements C6158mz<il4> {
    @vr2

    /* renamed from: a */
    public static final C6782a f35140a = new C6782a((wg0) null);
    @vr2

    /* renamed from: a */
    public static final sl4 f35141a = new sl4(-1, 0, (wg0) null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/onedelhi/secure/sl4$a;", "", "Lcom/onedelhi/secure/sl4;", "EMPTY", "Lcom/onedelhi/secure/sl4;", "a", "()Lcom/onedelhi/secure/sl4;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.sl4$a */
    public static final class C6782a {
        public C6782a() {
        }

        public /* synthetic */ C6782a(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final sl4 mo44411a() {
            return sl4.f35141a;
        }
    }

    public sl4(int i, int i2) {
        super(i, i2, 1, (wg0) null);
    }

    public /* synthetic */ sl4(int i, int i2, wg0 wg0) {
        this(i, i2);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo27426b(Comparable comparable) {
        return mo44408r(((il4) comparable).mo38158r0());
    }

    public boolean equals(@ss2 Object obj) {
        if (obj instanceof sl4) {
            if (!isEmpty() || !((sl4) obj).isEmpty()) {
                sl4 sl4 = (sl4) obj;
                if (!(mo43663j() == sl4.mo43663j() && mo43664l() == sl4.mo43664l())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public /* bridge */ /* synthetic */ Comparable mo27427g() {
        return il4.m52414b(mo44409s());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (mo43663j() * 31) + mo43664l();
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ Comparable mo27428i() {
        return il4.m52414b(mo44410t());
    }

    public boolean isEmpty() {
        return mo4.m57477c(mo43663j(), mo43664l()) > 0;
    }

    /* renamed from: r */
    public boolean mo44408r(int i) {
        return mo4.m57477c(mo43663j(), i) <= 0 && mo4.m57477c(i, mo43664l()) <= 0;
    }

    /* renamed from: s */
    public int mo44409s() {
        return mo43664l();
    }

    /* renamed from: t */
    public int mo44410t() {
        return mo43663j();
    }

    @vr2
    public String toString() {
        return il4.m52428m0(mo43663j()) + ".." + il4.m52428m0(mo43664l());
    }
}
