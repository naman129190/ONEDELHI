package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/onedelhi/secure/zd2;", "", "", "a", "Lcom/onedelhi/secure/is1;", "b", "value", "range", "c", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcom/onedelhi/secure/is1;", "e", "()Lcom/onedelhi/secure/is1;", "<init>", "(Ljava/lang/String;Lcom/onedelhi/secure/is1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class zd2 {
    @vr2

    /* renamed from: a */
    public final is1 f38315a;
    @vr2

    /* renamed from: a */
    public final String f38316a;

    public zd2(@vr2 String str, @vr2 is1 is1) {
        jt1.m53777p(str, "value");
        jt1.m53777p(is1, "range");
        this.f38316a = str;
        this.f38315a = is1;
    }

    /* renamed from: d */
    public static /* synthetic */ zd2 m73096d(zd2 zd2, String str, is1 is1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zd2.f38316a;
        }
        if ((i & 2) != 0) {
            is1 = zd2.f38315a;
        }
        return zd2.mo48223c(str, is1);
    }

    @vr2
    /* renamed from: a */
    public final String mo48221a() {
        return this.f38316a;
    }

    @vr2
    /* renamed from: b */
    public final is1 mo48222b() {
        return this.f38315a;
    }

    @vr2
    /* renamed from: c */
    public final zd2 mo48223c(@vr2 String str, @vr2 is1 is1) {
        jt1.m53777p(str, "value");
        jt1.m53777p(is1, "range");
        return new zd2(str, is1);
    }

    @vr2
    /* renamed from: e */
    public final is1 mo48224e() {
        return this.f38315a;
    }

    public boolean equals(@ss2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd2)) {
            return false;
        }
        zd2 zd2 = (zd2) obj;
        return jt1.m53768g(this.f38316a, zd2.f38316a) && jt1.m53768g(this.f38315a, zd2.f38315a);
    }

    @vr2
    /* renamed from: f */
    public final String mo48226f() {
        return this.f38316a;
    }

    public int hashCode() {
        return (this.f38316a.hashCode() * 31) + this.f38315a.hashCode();
    }

    @vr2
    public String toString() {
        return "MatchGroup(value=" + this.f38316a + ", range=" + this.f38315a + ')';
    }
}
