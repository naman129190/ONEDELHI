package com.onedelhi.secure;

import java.util.Collection;
import kotlin.Metadata;

@gz3(version = "1.1")
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n\u0012\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001e\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/onedelhi/secure/xx2;", "Lcom/onedelhi/secure/ly;", "", "other", "", "equals", "", "hashCode", "", "toString", "Ljava/lang/Class;", "jClass", "Ljava/lang/Class;", "p", "()Ljava/lang/Class;", "", "Lcom/onedelhi/secure/gx1;", "e", "()Ljava/util/Collection;", "members", "moduleName", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class xx2 implements C6068ly {
    @vr2

    /* renamed from: a */
    public final Class<?> f37680a;
    @vr2

    /* renamed from: b */
    public final String f37681b;

    public xx2(@vr2 Class<?> cls, @vr2 String str) {
        jt1.m53777p(cls, "jClass");
        jt1.m53777p(str, "moduleName");
        this.f37680a = cls;
        this.f37681b = str;
    }

    @vr2
    /* renamed from: e */
    public Collection<gx1<?>> mo37613e() {
        throw new e02();
    }

    public boolean equals(@ss2 Object obj) {
        return (obj instanceof xx2) && jt1.m53768g(mo40308p(), ((xx2) obj).mo40308p());
    }

    public int hashCode() {
        return mo40308p().hashCode();
    }

    @vr2
    /* renamed from: p */
    public Class<?> mo40308p() {
        return this.f37680a;
    }

    @vr2
    public String toString() {
        return mo40308p().toString() + ah3.f25851a;
    }
}
