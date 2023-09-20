package com.onedelhi.secure;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class m22 extends C5351g1<String> implements n22, RandomAccess {

    /* renamed from: a */
    public static final m22 f31976a;

    /* renamed from: a */
    public static final n22 f31977a;

    /* renamed from: a */
    public final List<Object> f31978a;

    /* renamed from: com.onedelhi.secure.m22$a */
    public static class C6080a extends AbstractList<byte[]> implements RandomAccess {

        /* renamed from: a */
        public final m22 f31979a;

        public C6080a(m22 m22) {
            this.f31979a = m22;
        }

        /* renamed from: b */
        public void add(int i, byte[] bArr) {
            this.f31979a.mo40429o(i, bArr);
            this.modCount++;
        }

        /* renamed from: e */
        public byte[] get(int i) {
            return this.f31979a.mo36167m(i);
        }

        /* renamed from: f */
        public byte[] remove(int i) {
            String x = this.f31979a.remove(i);
            this.modCount++;
            return m22.m56820r(x);
        }

        /* renamed from: g */
        public byte[] set(int i, byte[] bArr) {
            Object e = this.f31979a.mo40425A(i, bArr);
            this.modCount++;
            return m22.m56820r(e);
        }

        public int size() {
            return this.f31979a.size();
        }
    }

    /* renamed from: com.onedelhi.secure.m22$b */
    public static class C6081b extends AbstractList<C5173er> implements RandomAccess {

        /* renamed from: a */
        public final m22 f31980a;

        public C6081b(m22 m22) {
            this.f31980a = m22;
        }

        /* renamed from: b */
        public void add(int i, C5173er erVar) {
            this.f31980a.mo40427l(i, erVar);
            this.modCount++;
        }

        /* renamed from: e */
        public C5173er get(int i) {
            return this.f31980a.mo36171w2(i);
        }

        /* renamed from: f */
        public C5173er remove(int i) {
            String x = this.f31980a.remove(i);
            this.modCount++;
            return m22.m56821s(x);
        }

        /* renamed from: g */
        public C5173er set(int i, C5173er erVar) {
            Object i2 = this.f31980a.mo40435z(i, erVar);
            this.modCount++;
            return m22.m56821s(i2);
        }

        public int size() {
            return this.f31980a.size();
        }
    }

    static {
        m22 m22 = new m22();
        f31976a = m22;
        m22.mo36496Q0();
        f31977a = m22;
    }

    public m22() {
        this(10);
    }

    public m22(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public m22(n22 n22) {
        this.f31978a = new ArrayList(n22.size());
        addAll(n22);
    }

    public m22(ArrayList<Object> arrayList) {
        this.f31978a = arrayList;
    }

    public m22(List<String> list) {
        this((ArrayList<Object>) new ArrayList(list));
    }

    /* renamed from: r */
    public static byte[] m56820r(Object obj) {
        return obj instanceof byte[] ? (byte[]) obj : obj instanceof String ? vs1.m68453y((String) obj) : ((C5173er) obj).mo35538d0();
    }

    /* renamed from: s */
    public static C5173er m56821s(Object obj) {
        return obj instanceof C5173er ? (C5173er) obj : obj instanceof String ? C5173er.m47136w((String) obj) : C5173er.m47134u((byte[]) obj);
    }

    /* renamed from: t */
    public static String m56822t(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C5173er ? ((C5173er) obj).mo35543k0() : vs1.m68454z((byte[]) obj);
    }

    /* renamed from: u */
    public static m22 m56823u() {
        return f31976a;
    }

    /* renamed from: A */
    public final Object mo40425A(int i, byte[] bArr) {
        mo36498b();
        return this.f31978a.set(i, bArr);
    }

    /* renamed from: E */
    public boolean mo36153E(Collection<byte[]> collection) {
        mo36498b();
        boolean addAll = this.f31978a.addAll(collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: F0 */
    public List<byte[]> mo36154F0() {
        return new C6080a(this);
    }

    /* renamed from: H */
    public List<C5173er> mo36155H() {
        return new C6081b(this);
    }

    /* renamed from: J1 */
    public n22 mo36156J1() {
        return mo36500p() ? new fo4(this) : this;
    }

    /* renamed from: M */
    public void mo36157M(C5173er erVar) {
        mo36498b();
        this.f31978a.add(erVar);
        this.modCount++;
    }

    /* renamed from: M1 */
    public void mo36158M1(n22 n22) {
        mo36498b();
        for (Object next : n22.mo36160b1()) {
            if (next instanceof byte[]) {
                byte[] bArr = (byte[]) next;
                this.f31978a.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.f31978a.add(next);
            }
        }
    }

    /* renamed from: a2 */
    public void mo36159a2(byte[] bArr) {
        mo36498b();
        this.f31978a.add(bArr);
        this.modCount++;
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        mo36498b();
        if (collection instanceof n22) {
            collection = ((n22) collection).mo36160b1();
        }
        boolean addAll = this.f31978a.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b1 */
    public List<?> mo36160b1() {
        return Collections.unmodifiableList(this.f31978a);
    }

    public void clear() {
        mo36498b();
        this.f31978a.clear();
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: g2 */
    public Object mo36162g2(int i) {
        return this.f31978a.get(i);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i1 */
    public boolean mo36164i1(Collection<? extends C5173er> collection) {
        mo36498b();
        boolean addAll = this.f31978a.addAll(collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: l */
    public final void mo40427l(int i, C5173er erVar) {
        mo36498b();
        this.f31978a.add(i, erVar);
        this.modCount++;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.util.List<java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo36167m(int r3) {
        /*
            r2 = this;
            java.util.List<java.lang.Object> r0 = r2.f31978a
            java.lang.Object r0 = r0.get(r3)
            byte[] r1 = m56820r(r0)
            if (r1 == r0) goto L_0x0011
            java.util.List<java.lang.Object> r0 = r2.f31978a
            r0.set(r3, r1)
        L_0x0011:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.m22.mo36167m(int):byte[]");
    }

    /* renamed from: n */
    public void add(int i, String str) {
        mo36498b();
        this.f31978a.add(i, str);
        this.modCount++;
    }

    /* renamed from: o */
    public final void mo40429o(int i, byte[] bArr) {
        mo36498b();
        this.f31978a.add(i, bArr);
        this.modCount++;
    }

    /* renamed from: p */
    public /* bridge */ /* synthetic */ boolean mo36500p() {
        return super.mo36500p();
    }

    /* renamed from: q */
    public void mo36168q(int i, byte[] bArr) {
        mo40425A(i, bArr);
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    /* renamed from: s1 */
    public void mo36169s1(int i, C5173er erVar) {
        mo40435z(i, erVar);
    }

    public int size() {
        return this.f31978a.size();
    }

    /* renamed from: v */
    public String get(int i) {
        Object obj = this.f31978a.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C5173er) {
            C5173er erVar = (C5173er) obj;
            String k0 = erVar.mo35543k0();
            if (erVar.mo34533G()) {
                this.f31978a.set(i, k0);
            }
            return k0;
        }
        byte[] bArr = (byte[]) obj;
        String z = vs1.m68454z(bArr);
        if (vs1.m68449u(bArr)) {
            this.f31978a.set(i, z);
        }
        return z;
    }

    /* renamed from: w */
    public m22 mo31125H1(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f31978a);
            return new m22((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: w2 */
    public C5173er mo36171w2(int i) {
        Object obj = this.f31978a.get(i);
        C5173er s = m56821s(obj);
        if (s != obj) {
            this.f31978a.set(i, s);
        }
        return s;
    }

    /* renamed from: x */
    public String remove(int i) {
        mo36498b();
        Object remove = this.f31978a.remove(i);
        this.modCount++;
        return m56822t(remove);
    }

    /* renamed from: y */
    public String set(int i, String str) {
        mo36498b();
        return m56822t(this.f31978a.set(i, str));
    }

    /* renamed from: z */
    public final Object mo40435z(int i, C5173er erVar) {
        mo36498b();
        return this.f31978a.set(i, erVar);
    }
}
