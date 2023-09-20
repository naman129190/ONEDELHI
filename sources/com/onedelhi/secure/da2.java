package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0016B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0011\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/onedelhi/secure/da2;", "Lcom/onedelhi/secure/ba2;", "Lcom/onedelhi/secure/mz;", "", "value", "", "s", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "u", "()Ljava/lang/Long;", "start", "t", "endInclusive", "<init>", "(JJ)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class da2 extends ba2 implements C6158mz<Long> {
    @vr2

    /* renamed from: a */
    public static final C4995a f27356a = new C4995a((wg0) null);
    @vr2

    /* renamed from: a */
    public static final da2 f27357a = new da2(1, 0);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/onedelhi/secure/da2$a;", "", "Lcom/onedelhi/secure/da2;", "EMPTY", "Lcom/onedelhi/secure/da2;", "a", "()Lcom/onedelhi/secure/da2;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.da2$a */
    public static final class C4995a {
        public C4995a() {
        }

        public /* synthetic */ C4995a(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final da2 mo34279a() {
            return da2.f27357a;
        }
    }

    public da2(long j, long j2) {
        super(j, j2, 1);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo27426b(Comparable comparable) {
        return mo34276s(((Number) comparable).longValue());
    }

    public boolean equals(@ss2 Object obj) {
        if (obj instanceof da2) {
            if (!isEmpty() || !((da2) obj).isEmpty()) {
                da2 da2 = (da2) obj;
                if (!(mo31543j() == da2.mo31543j() && mo31544l() == da2.mo31544l())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (mo31543j() ^ (mo31543j() >>> 32))) + (mo31544l() ^ (mo31544l() >>> 32)));
    }

    public boolean isEmpty() {
        return mo31543j() > mo31544l();
    }

    /* renamed from: s */
    public boolean mo34276s(long j) {
        return mo31543j() <= j && j <= mo31544l();
    }

    @vr2
    /* renamed from: t */
    public Long mo27427g() {
        return Long.valueOf(mo31544l());
    }

    @vr2
    public String toString() {
        return mo31543j() + ".." + mo31544l();
    }

    @vr2
    /* renamed from: u */
    public Long mo27428i() {
        return Long.valueOf(mo31543j());
    }
}
