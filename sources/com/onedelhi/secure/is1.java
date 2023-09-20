package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0015B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0010\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/onedelhi/secure/is1;", "Lcom/onedelhi/secure/gs1;", "Lcom/onedelhi/secure/mz;", "", "value", "", "s", "isEmpty", "", "other", "equals", "hashCode", "", "toString", "u", "()Ljava/lang/Integer;", "start", "t", "endInclusive", "<init>", "(II)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class is1 extends gs1 implements C6158mz<Integer> {
    @vr2

    /* renamed from: a */
    public static final C5742a f30446a = new C5742a((wg0) null);
    @vr2

    /* renamed from: a */
    public static final is1 f30447a = new is1(1, 0);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/onedelhi/secure/is1$a;", "", "Lcom/onedelhi/secure/is1;", "EMPTY", "Lcom/onedelhi/secure/is1;", "a", "()Lcom/onedelhi/secure/is1;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.is1$a */
    public static final class C5742a {
        public C5742a() {
        }

        public /* synthetic */ C5742a(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final is1 mo38216a() {
            return is1.f30447a;
        }
    }

    public is1(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo27426b(Comparable comparable) {
        return mo38213s(((Number) comparable).intValue());
    }

    public boolean equals(@ss2 Object obj) {
        if (obj instanceof is1) {
            if (!isEmpty() || !((is1) obj).isEmpty()) {
                is1 is1 = (is1) obj;
                if (!(mo36871j() == is1.mo36871j() && mo36872l() == is1.mo36872l())) {
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
        return (mo36871j() * 31) + mo36872l();
    }

    public boolean isEmpty() {
        return mo36871j() > mo36872l();
    }

    /* renamed from: s */
    public boolean mo38213s(int i) {
        return mo36871j() <= i && i <= mo36872l();
    }

    @vr2
    /* renamed from: t */
    public Integer mo27427g() {
        return Integer.valueOf(mo36872l());
    }

    @vr2
    public String toString() {
        return mo36871j() + ".." + mo36872l();
    }

    @vr2
    /* renamed from: u */
    public Integer mo27428i() {
        return Integer.valueOf(mo36871j());
    }
}
