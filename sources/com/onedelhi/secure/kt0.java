package com.onedelhi.secure;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00060\u0004j\u0002`\u0005B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002R\u0014\u0010\u0016\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00180\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/onedelhi/secure/kt0;", "", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "other", "", "equals", "", "hashCode", "", "toString", "isEmpty", "key", "containsKey", "value", "c", "d", "l", "h", "()I", "size", "", "", "f", "()Ljava/util/Set;", "entries", "g", "keys", "", "i", "()Ljava/util/Collection;", "values", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class kt0 implements Map, Serializable, nx1 {
    @vr2

    /* renamed from: a */
    public static final kt0 f31422a = new kt0();

    /* renamed from: b */
    public static final long f31423b = 8246714829545688274L;

    /* renamed from: c */
    public boolean mo39438c(@vr2 Void voidR) {
        jt1.m53777p(voidR, "value");
        return false;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(@ss2 Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return mo39438c((Void) obj);
    }

    @ss2
    /* renamed from: d */
    public Void get(@ss2 Object obj) {
        return null;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return mo39445f();
    }

    public boolean equals(@ss2 Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @vr2
    /* renamed from: f */
    public Set<Map.Entry> mo39445f() {
        return pt0.f33768a;
    }

    @vr2
    /* renamed from: g */
    public Set<Object> mo39446g() {
        return pt0.f33768a;
    }

    /* renamed from: h */
    public int mo39448h() {
        return 0;
    }

    public int hashCode() {
        return 0;
    }

    @vr2
    /* renamed from: i */
    public Collection mo39450i() {
        return jt0.f30929a;
    }

    public boolean isEmpty() {
        return true;
    }

    /* renamed from: j */
    public Void mo39452j(Object obj, Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ Set<Object> keySet() {
        return mo39446g();
    }

    /* renamed from: l */
    public final Object mo39454l() {
        return f31422a;
    }

    /* renamed from: m */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo39448h();
    }

    @vr2
    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return mo39450i();
    }
}
