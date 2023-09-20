package com.onedelhi.secure;

import com.onedelhi.secure.C6158mz;
import java.lang.Comparable;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0012\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\f\u001a\u00028\u00008\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00028\u00008\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/onedelhi/secure/w10;", "", "T", "Lcom/onedelhi/secure/mz;", "", "other", "", "equals", "", "hashCode", "", "toString", "start", "Ljava/lang/Comparable;", "i", "()Ljava/lang/Comparable;", "endInclusive", "g", "<init>", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public class w10<T extends Comparable<? super T>> implements C6158mz<T> {
    @vr2

    /* renamed from: a */
    public final T f36806a;
    @vr2

    /* renamed from: b */
    public final T f36807b;

    public w10(@vr2 T t, @vr2 T t2) {
        jt1.m53777p(t, "start");
        jt1.m53777p(t2, "endInclusive");
        this.f36806a = t;
        this.f36807b = t2;
    }

    /* renamed from: b */
    public boolean mo27426b(@vr2 T t) {
        return C6158mz.C6159a.m57757a(this, t);
    }

    public boolean equals(@ss2 Object obj) {
        if (obj instanceof w10) {
            if (!isEmpty() || !((w10) obj).isEmpty()) {
                w10 w10 = (w10) obj;
                if (!jt1.m53768g(mo27428i(), w10.mo27428i()) || !jt1.m53768g(mo27427g(), w10.mo27427g())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @vr2
    /* renamed from: g */
    public T mo27427g() {
        return this.f36807b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (mo27428i().hashCode() * 31) + mo27427g().hashCode();
    }

    @vr2
    /* renamed from: i */
    public T mo27428i() {
        return this.f36806a;
    }

    public boolean isEmpty() {
        return C6158mz.C6159a.m57758b(this);
    }

    @vr2
    public String toString() {
        return mo27428i() + ".." + mo27427g();
    }
}
