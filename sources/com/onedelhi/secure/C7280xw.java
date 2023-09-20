package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0016B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0011\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/onedelhi/secure/xw;", "Lcom/onedelhi/secure/vw;", "Lcom/onedelhi/secure/mz;", "", "value", "", "s", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "u", "()Ljava/lang/Character;", "start", "t", "endInclusive", "<init>", "(CC)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.xw */
public final class C7280xw extends C7100vw implements C6158mz<Character> {
    @vr2

    /* renamed from: a */
    public static final C7281a f37647a = new C7281a((wg0) null);
    @vr2

    /* renamed from: a */
    public static final C7280xw f37648a = new C7280xw(1, 0);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/onedelhi/secure/xw$a;", "", "Lcom/onedelhi/secure/xw;", "EMPTY", "Lcom/onedelhi/secure/xw;", "a", "()Lcom/onedelhi/secure/xw;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.xw$a */
    public static final class C7281a {
        public C7281a() {
        }

        public /* synthetic */ C7281a(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final C7280xw mo47423a() {
            return C7280xw.f37648a;
        }
    }

    public C7280xw(char c, char c2) {
        super(c, c2, 1);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo27426b(Comparable comparable) {
        return mo47420s(((Character) comparable).charValue());
    }

    public boolean equals(@ss2 Object obj) {
        if (obj instanceof C7280xw) {
            if (!isEmpty() || !((C7280xw) obj).isEmpty()) {
                C7280xw xwVar = (C7280xw) obj;
                if (!(mo46393j() == xwVar.mo46393j() && mo46394l() == xwVar.mo46394l())) {
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
        return (mo46393j() * oo2.f33149a) + mo46394l();
    }

    public boolean isEmpty() {
        return jt1.m53781t(mo46393j(), mo46394l()) > 0;
    }

    /* renamed from: s */
    public boolean mo47420s(char c) {
        return jt1.m53781t(mo46393j(), c) <= 0 && jt1.m53781t(c, mo46394l()) <= 0;
    }

    @vr2
    /* renamed from: t */
    public Character mo27427g() {
        return Character.valueOf(mo46394l());
    }

    @vr2
    public String toString() {
        return mo46393j() + ".." + mo46394l();
    }

    @vr2
    /* renamed from: u */
    public Character mo27428i() {
        return Character.valueOf(mo46393j());
    }
}
