package com.onedelhi.secure;

import com.onedelhi.secure.dc4;
import java.lang.Comparable;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\r\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b/\u0010\bJ\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000b\u0010\nJ&\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fH\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00028\u00002\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\r0\fH\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u0019\u0010\nJ\u0017\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u0018\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001aH\u0010¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001aH\u0010¢\u0006\u0004\b\"\u0010!J\u0017\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000#H\u0002¢\u0006\u0004\b\u001f\u0010$J\u001f\u0010%\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010&R$\u0010+\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001a8F@BX\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010!R\u0011\u0010.\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/onedelhi/secure/cc4;", "Lcom/onedelhi/secure/dc4;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lcom/onedelhi/secure/un4;", "d", "()V", "h", "()Lcom/onedelhi/secure/dc4;", "m", "Lkotlin/Function1;", "", "predicate", "l", "(Lcom/onedelhi/secure/ec1;)Lcom/onedelhi/secure/dc4;", "node", "b", "(Lcom/onedelhi/secure/dc4;)V", "cond", "c", "(Lcom/onedelhi/secure/dc4;Lcom/onedelhi/secure/ec1;)Z", "j", "(Lcom/onedelhi/secure/dc4;)Z", "e", "", "index", "k", "(I)Lcom/onedelhi/secure/dc4;", "a", "i", "p", "(I)V", "o", "", "()[Lcom/onedelhi/secure/dc4;", "q", "(II)V", "value", "f", "()I", "n", "size", "g", "()Z", "isEmpty", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@zs1
public class cc4<T extends dc4 & Comparable<? super T>> {
    @vr2
    private volatile /* synthetic */ int _size = 0;
    @ss2

    /* renamed from: a */
    public T[] f26716a;

    @z73
    /* renamed from: a */
    public final void mo32286a(@vr2 T t) {
        t.mo34301b(this);
        dc4[] i = mo32294i();
        int f = mo32291f();
        mo32299n(f + 1);
        i[f] = t;
        t.mo34303l(f);
        mo32301p(f);
    }

    /* renamed from: b */
    public final void mo32287b(@vr2 T t) {
        synchronized (this) {
            mo32286a(t);
            un4 un4 = un4.f36206a;
        }
    }

    /* renamed from: c */
    public final boolean mo32288c(@vr2 T t, @vr2 ec1<? super T, Boolean> ec1) {
        boolean z;
        synchronized (this) {
            try {
                if (ec1.mo17094X(mo32290e()).booleanValue()) {
                    mo32286a(t);
                    z = true;
                } else {
                    z = false;
                }
                uq1.m67403d(1);
            } catch (Throwable th) {
                uq1.m67403d(1);
                uq1.m67402c(1);
                throw th;
            }
        }
        uq1.m67402c(1);
        return z;
    }

    /* renamed from: d */
    public final void mo32289d() {
        synchronized (this) {
            T[] tArr = this.f26716a;
            if (tArr != null) {
                C7458za.m73006w2(tArr, (Object) null, 0, 0, 6, (Object) null);
            }
            this._size = 0;
            un4 un4 = un4.f36206a;
        }
    }

    @ss2
    @z73
    /* renamed from: e */
    public final T mo32290e() {
        T[] tArr = this.f26716a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: f */
    public final int mo32291f() {
        return this._size;
    }

    /* renamed from: g */
    public final boolean mo32292g() {
        return mo32291f() == 0;
    }

    @ss2
    /* renamed from: h */
    public final T mo32293h() {
        T e;
        synchronized (this) {
            e = mo32290e();
        }
        return e;
    }

    /* renamed from: i */
    public final T[] mo32294i() {
        T[] tArr = this.f26716a;
        if (tArr == null) {
            T[] tArr2 = new dc4[4];
            this.f26716a = tArr2;
            return tArr2;
        } else if (mo32291f() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, mo32291f() * 2);
            jt1.m53776o(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (dc4[]) copyOf;
            this.f26716a = tArr3;
            return tArr3;
        }
    }

    /* renamed from: j */
    public final boolean mo32295j(@vr2 T t) {
        boolean z;
        synchronized (this) {
            if (t.mo34302g() == null) {
                z = false;
            } else {
                mo32296k(t.mo34300a());
                z = true;
            }
        }
        return z;
    }

    @vr2
    @z73
    /* renamed from: k */
    public final T mo32296k(int i) {
        T[] tArr = this.f26716a;
        jt1.m53774m(tArr);
        mo32299n(mo32291f() - 1);
        if (i < mo32291f()) {
            mo32302q(i, mo32291f());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                jt1.m53774m(t);
                T t2 = tArr[i2];
                jt1.m53774m(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    mo32302q(i, i2);
                    mo32301p(i2);
                }
            }
            mo32300o(i);
        }
        T t3 = tArr[mo32291f()];
        jt1.m53774m(t3);
        t3.mo34301b((cc4<?>) null);
        t3.mo34303l(-1);
        tArr[mo32291f()] = null;
        return t3;
    }

    @ss2
    /* renamed from: l */
    public final T mo32297l(@vr2 ec1<? super T, Boolean> ec1) {
        synchronized (this) {
            try {
                dc4 e = mo32290e();
                T t = null;
                if (e == null) {
                    uq1.m67403d(2);
                    uq1.m67402c(2);
                    return null;
                }
                if (ec1.mo17094X(e).booleanValue()) {
                    t = mo32296k(0);
                }
                uq1.m67403d(1);
                uq1.m67402c(1);
                return t;
            } catch (Throwable th) {
                uq1.m67403d(1);
                uq1.m67402c(1);
                throw th;
            }
        }
    }

    @ss2
    /* renamed from: m */
    public final T mo32298m() {
        T k;
        synchronized (this) {
            k = mo32291f() > 0 ? mo32296k(0) : null;
        }
        return k;
    }

    /* renamed from: n */
    public final void mo32299n(int i) {
        this._size = i;
    }

    /* renamed from: o */
    public final void mo32300o(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < mo32291f()) {
                T[] tArr = this.f26716a;
                jt1.m53774m(tArr);
                int i3 = i2 + 1;
                if (i3 < mo32291f()) {
                    T t = tArr[i3];
                    jt1.m53774m(t);
                    T t2 = tArr[i2];
                    jt1.m53774m(t2);
                    if (((Comparable) t).compareTo(t2) < 0) {
                        i2 = i3;
                    }
                }
                T t3 = tArr[i];
                jt1.m53774m(t3);
                T t4 = tArr[i2];
                jt1.m53774m(t4);
                if (((Comparable) t3).compareTo(t4) > 0) {
                    mo32302q(i, i2);
                    i = i2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    public final void mo32301p(int i) {
        while (i > 0) {
            T[] tArr = this.f26716a;
            jt1.m53774m(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            jt1.m53774m(t);
            T t2 = tArr[i];
            jt1.m53774m(t2);
            if (((Comparable) t).compareTo(t2) > 0) {
                mo32302q(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: q */
    public final void mo32302q(int i, int i2) {
        T[] tArr = this.f26716a;
        jt1.m53774m(tArr);
        T t = tArr[i2];
        jt1.m53774m(t);
        T t2 = tArr[i];
        jt1.m53774m(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.mo34303l(i);
        t2.mo34303l(i2);
    }
}
