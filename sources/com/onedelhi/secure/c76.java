package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class c76 extends m06 implements RandomAccess, f76 {

    /* renamed from: a */
    public static final c76 f10186a;

    /* renamed from: a */
    public static final f76 f10187a;

    /* renamed from: a */
    public final List f10188a;

    static {
        c76 c76 = new c76(10);
        f10186a = c76;
        c76.mo19980a();
        f10187a = c76;
    }

    public c76() {
        this(10);
    }

    public c76(int i) {
        this.f10188a = new ArrayList(i);
    }

    public c76(ArrayList arrayList) {
        this.f10188a = arrayList;
    }

    /* renamed from: f */
    public static String m12383f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof i36 ? ((i36) obj).mo17558s(t56.f20660b) : t56.m28116h((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo19981b();
        this.f10188a.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        mo19981b();
        if (collection instanceof f76) {
            collection = ((f76) collection).mo14058e0();
        }
        boolean addAll = this.f10188a.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        mo19981b();
        this.f10188a.clear();
        this.modCount++;
    }

    /* renamed from: e */
    public final String get(int i) {
        Object obj = this.f10188a.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof i36) {
            i36 i36 = (i36) obj;
            String s = i36.mo17558s(t56.f20660b);
            if (i36.mo17556k()) {
                this.f10188a.set(i, s);
            }
            return s;
        }
        byte[] bArr = (byte[]) obj;
        String h = t56.m28116h(bArr);
        if (t56.m28117i(bArr)) {
            this.f10188a.set(i, h);
        }
        return h;
    }

    /* renamed from: e0 */
    public final List mo14058e0() {
        return Collections.unmodifiableList(this.f10188a);
    }

    /* renamed from: j2 */
    public final f76 mo14060j2() {
        return mo19982c() ? new ve6(this) : this;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo19981b();
        Object remove = this.f10188a.remove(i);
        this.modCount++;
        return m12383f(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo19981b();
        return m12383f(this.f10188a.set(i, (String) obj));
    }

    public final int size() {
        return this.f10188a.size();
    }

    /* renamed from: z1 */
    public final /* bridge */ /* synthetic */ q56 mo12861z1(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f10188a);
            return new c76(arrayList);
        }
        throw new IllegalArgumentException();
    }
}
