package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class jr6 extends rl6 implements RandomAccess, kr6 {

    /* renamed from: a */
    public static final jr6 f14440a;
    @Deprecated

    /* renamed from: a */
    public static final kr6 f14441a;

    /* renamed from: a */
    public final List f14442a;

    static {
        jr6 jr6 = new jr6(false);
        f14440a = jr6;
        f14441a = jr6;
    }

    public jr6() {
        this(10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jr6(int i) {
        super(true);
        ArrayList arrayList = new ArrayList(i);
        this.f14442a = arrayList;
    }

    public jr6(ArrayList arrayList) {
        super(true);
        this.f14442a = arrayList;
    }

    public jr6(boolean z) {
        super(false);
        this.f14442a = Collections.emptyList();
    }

    /* renamed from: f */
    public static String m18776f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof on6 ? ((on6) obj).mo22033s(zq6.f23859b) : zq6.m33325d((byte[]) obj);
    }

    /* renamed from: X */
    public final List mo18557X() {
        return Collections.unmodifiableList(this.f14442a);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo23935b();
        this.f14442a.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        mo23935b();
        if (collection instanceof kr6) {
            collection = ((kr6) collection).mo18557X();
        }
        boolean addAll = this.f14442a.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    /* renamed from: c2 */
    public final kr6 mo18559c2() {
        return mo23936c() ? new uu6(this) : this;
    }

    public final void clear() {
        mo23935b();
        this.f14442a.clear();
        this.modCount++;
    }

    /* renamed from: d2 */
    public final /* bridge */ /* synthetic */ xq6 mo14324d2(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f14442a);
            return new jr6(arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final String get(int i) {
        Object obj = this.f14442a.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof on6) {
            on6 on6 = (on6) obj;
            String s = on6.mo22033s(zq6.f23859b);
            if (on6.mo22031l()) {
                this.f14442a.set(i, s);
            }
            return s;
        }
        byte[] bArr = (byte[]) obj;
        String d = zq6.m33325d(bArr);
        if (ev6.m14403d(bArr)) {
            this.f14442a.set(i, d);
        }
        return d;
    }

    /* renamed from: h */
    public final void mo18563h(on6 on6) {
        mo23935b();
        this.f14442a.add(on6);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo23935b();
        Object remove = this.f14442a.remove(i);
        this.modCount++;
        return m18776f(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo23935b();
        return m18776f(this.f14442a.set(i, (String) obj));
    }

    public final int size() {
        return this.f14442a.size();
    }

    /* renamed from: u0 */
    public final Object mo18565u0(int i) {
        return this.f14442a.get(i);
    }
}
