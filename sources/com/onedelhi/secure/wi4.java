package com.onedelhi.secure;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005B\u001f\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\u0006\u0010\r\u001a\u00028\u0001\u0012\u0006\u0010\u000e\u001a\u00028\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ@\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\f\u001a\u00028\u00002\b\b\u0002\u0010\r\u001a\u00028\u00012\b\b\u0002\u0010\u000e\u001a\u00028\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0017\u0010\f\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\r\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u000e\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u001a\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/onedelhi/secure/wi4;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "toString", "a", "()Ljava/lang/Object;", "b", "c", "first", "second", "third", "d", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/onedelhi/secure/wi4;", "", "hashCode", "", "other", "", "equals", "Ljava/lang/Object;", "f", "g", "h", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class wi4<A, B, C> implements Serializable {

    /* renamed from: a */
    public final A f37003a;

    /* renamed from: b */
    public final B f37004b;

    /* renamed from: c */
    public final C f37005c;

    public wi4(A a, B b, C c) {
        this.f37003a = a;
        this.f37004b = b;
        this.f37005c = c;
    }

    /* renamed from: e */
    public static /* synthetic */ wi4 m69385e(wi4 wi4, A a, B b, C c, int i, Object obj) {
        if ((i & 1) != 0) {
            a = wi4.f37003a;
        }
        if ((i & 2) != 0) {
            b = wi4.f37004b;
        }
        if ((i & 4) != 0) {
            c = wi4.f37005c;
        }
        return wi4.mo46749d(a, b, c);
    }

    /* renamed from: a */
    public final A mo46746a() {
        return this.f37003a;
    }

    /* renamed from: b */
    public final B mo46747b() {
        return this.f37004b;
    }

    /* renamed from: c */
    public final C mo46748c() {
        return this.f37005c;
    }

    @vr2
    /* renamed from: d */
    public final wi4<A, B, C> mo46749d(A a, B b, C c) {
        return new wi4<>(a, b, c);
    }

    public boolean equals(@ss2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi4)) {
            return false;
        }
        wi4 wi4 = (wi4) obj;
        return jt1.m53768g(this.f37003a, wi4.f37003a) && jt1.m53768g(this.f37004b, wi4.f37004b) && jt1.m53768g(this.f37005c, wi4.f37005c);
    }

    /* renamed from: f */
    public final A mo46751f() {
        return this.f37003a;
    }

    /* renamed from: g */
    public final B mo46752g() {
        return this.f37004b;
    }

    /* renamed from: h */
    public final C mo46753h() {
        return this.f37005c;
    }

    public int hashCode() {
        A a = this.f37003a;
        int i = 0;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f37004b;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.f37005c;
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode2 + i;
    }

    @vr2
    public String toString() {
        return '(' + this.f37003a + ", " + this.f37004b + ", " + this.f37005c + ')';
    }
}
