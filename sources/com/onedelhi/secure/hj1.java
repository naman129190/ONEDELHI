package com.onedelhi.secure;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class hj1 {

    /* renamed from: a */
    public int f29642a;

    /* renamed from: a */
    public Excluder f29643a;

    /* renamed from: a */
    public c21 f29644a;

    /* renamed from: a */
    public fa2 f29645a;

    /* renamed from: a */
    public hf4 f29646a;

    /* renamed from: a */
    public String f29647a;

    /* renamed from: a */
    public final List<dj4> f29648a;

    /* renamed from: a */
    public final Map<Type, mr1<?>> f29649a;

    /* renamed from: a */
    public boolean f29650a;

    /* renamed from: b */
    public int f29651b;

    /* renamed from: b */
    public hf4 f29652b;

    /* renamed from: b */
    public final List<dj4> f29653b;

    /* renamed from: b */
    public boolean f29654b;

    /* renamed from: c */
    public boolean f29655c;

    /* renamed from: d */
    public boolean f29656d;

    /* renamed from: e */
    public boolean f29657e;

    /* renamed from: f */
    public boolean f29658f;

    /* renamed from: g */
    public boolean f29659g;

    /* renamed from: h */
    public boolean f29660h;

    public hj1() {
        this.f29643a = Excluder.f25430a;
        this.f29645a = fa2.DEFAULT;
        this.f29644a = b21.IDENTITY;
        this.f29649a = new HashMap();
        this.f29648a = new ArrayList();
        this.f29653b = new ArrayList();
        this.f29650a = false;
        this.f29647a = fj1.f28520b;
        this.f29642a = 2;
        this.f29651b = 2;
        this.f29654b = false;
        this.f29655c = false;
        this.f29656d = true;
        this.f29657e = false;
        this.f29658f = false;
        this.f29659g = false;
        this.f29660h = true;
        this.f29646a = fj1.f28521c;
        this.f29652b = fj1.f28523d;
    }

    public hj1(fj1 fj1) {
        this.f29643a = Excluder.f25430a;
        this.f29645a = fa2.DEFAULT;
        this.f29644a = b21.IDENTITY;
        HashMap hashMap = new HashMap();
        this.f29649a = hashMap;
        ArrayList arrayList = new ArrayList();
        this.f29648a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f29653b = arrayList2;
        this.f29650a = false;
        this.f29647a = fj1.f28520b;
        this.f29642a = 2;
        this.f29651b = 2;
        this.f29654b = false;
        this.f29655c = false;
        this.f29656d = true;
        this.f29657e = false;
        this.f29658f = false;
        this.f29659g = false;
        this.f29660h = true;
        this.f29646a = fj1.f28521c;
        this.f29652b = fj1.f28523d;
        this.f29643a = fj1.f28533a;
        this.f29644a = fj1.f28535a;
        hashMap.putAll(fj1.f28547b);
        this.f29650a = fj1.f28543a;
        this.f29654b = fj1.f28548b;
        this.f29658f = fj1.f28550c;
        this.f29656d = fj1.f28551d;
        this.f29657e = fj1.f28552e;
        this.f29659g = fj1.f28553f;
        this.f29655c = fj1.f28554g;
        this.f29645a = fj1.f28536a;
        this.f29647a = fj1.f28539a;
        this.f29642a = fj1.f28532a;
        this.f29651b = fj1.f28544b;
        arrayList.addAll(fj1.f28546b);
        arrayList2.addAll(fj1.f28549c);
        this.f29660h = fj1.f28555h;
        this.f29646a = fj1.f28537a;
        this.f29652b = fj1.f28545b;
    }

    /* renamed from: A */
    public hj1 mo37341A() {
        this.f29657e = true;
        return this;
    }

    /* renamed from: B */
    public hj1 mo37342B(double d) {
        this.f29643a = this.f29643a.mo30143q(d);
        return this;
    }

    /* renamed from: a */
    public hj1 mo37343a(uw0 uw0) {
        this.f29643a = this.f29643a.mo30141o(uw0, false, true);
        return this;
    }

    /* renamed from: b */
    public hj1 mo37344b(uw0 uw0) {
        this.f29643a = this.f29643a.mo30141o(uw0, true, false);
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37345c(java.lang.String r5, int r6, int r7, java.util.List<com.onedelhi.secure.dj4> r8) {
        /*
            r4 = this;
            boolean r0 = com.onedelhi.secure.e24.f27677a
            r1 = 0
            if (r5 == 0) goto L_0x0026
            java.lang.String r2 = r5.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0026
            com.onedelhi.secure.xg0$b<java.util.Date> r6 = com.onedelhi.secure.xg0.C7251b.f37465a
            com.onedelhi.secure.dj4 r6 = r6.mo47173c(r5)
            if (r0 == 0) goto L_0x0024
            com.onedelhi.secure.xg0$b<? extends java.util.Date> r7 = com.onedelhi.secure.e24.f27679b
            com.onedelhi.secure.dj4 r1 = r7.mo47173c(r5)
            com.onedelhi.secure.xg0$b<? extends java.util.Date> r7 = com.onedelhi.secure.e24.f27676a
            com.onedelhi.secure.dj4 r5 = r7.mo47173c(r5)
            goto L_0x0045
        L_0x0024:
            r5 = r1
            goto L_0x0045
        L_0x0026:
            r5 = 2
            if (r6 == r5) goto L_0x0050
            if (r7 == r5) goto L_0x0050
            com.onedelhi.secure.xg0$b<java.util.Date> r5 = com.onedelhi.secure.xg0.C7251b.f37465a
            com.onedelhi.secure.dj4 r5 = r5.mo47172b(r6, r7)
            if (r0 == 0) goto L_0x0043
            com.onedelhi.secure.xg0$b<? extends java.util.Date> r1 = com.onedelhi.secure.e24.f27679b
            com.onedelhi.secure.dj4 r1 = r1.mo47172b(r6, r7)
            com.onedelhi.secure.xg0$b<? extends java.util.Date> r2 = com.onedelhi.secure.e24.f27676a
            com.onedelhi.secure.dj4 r6 = r2.mo47172b(r6, r7)
            r3 = r6
            r6 = r5
            r5 = r3
            goto L_0x0045
        L_0x0043:
            r6 = r5
            goto L_0x0024
        L_0x0045:
            r8.add(r6)
            if (r0 == 0) goto L_0x0050
            r8.add(r1)
            r8.add(r5)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.hj1.mo37345c(java.lang.String, int, int, java.util.List):void");
    }

    /* renamed from: d */
    public fj1 mo37346d() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f29648a.size() + this.f29653b.size() + 3);
        arrayList2.addAll(this.f29648a);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f29653b);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        mo37345c(this.f29647a, this.f29642a, this.f29651b, arrayList2);
        return new fj1(this.f29643a, this.f29644a, this.f29649a, this.f29650a, this.f29654b, this.f29658f, this.f29656d, this.f29657e, this.f29659g, this.f29655c, this.f29660h, this.f29645a, this.f29647a, this.f29642a, this.f29651b, this.f29648a, this.f29653b, arrayList, this.f29646a, this.f29652b);
    }

    /* renamed from: e */
    public hj1 mo37347e() {
        this.f29656d = false;
        return this;
    }

    /* renamed from: f */
    public hj1 mo37348f() {
        this.f29643a = this.f29643a.mo30128c();
        return this;
    }

    /* renamed from: g */
    public hj1 mo37349g() {
        this.f29660h = false;
        return this;
    }

    /* renamed from: h */
    public hj1 mo37350h() {
        this.f29654b = true;
        return this;
    }

    /* renamed from: i */
    public hj1 mo37351i(int... iArr) {
        this.f29643a = this.f29643a.mo30142p(iArr);
        return this;
    }

    /* renamed from: j */
    public hj1 mo37352j() {
        this.f29643a = this.f29643a.mo30134h();
        return this;
    }

    /* renamed from: k */
    public hj1 mo37353k() {
        this.f29658f = true;
        return this;
    }

    /* renamed from: l */
    public hj1 mo37354l(Type type, Object obj) {
        boolean z = obj instanceof cw1;
        C4453a.m35636a(z || (obj instanceof nv1) || (obj instanceof mr1) || (obj instanceof cj4));
        if (obj instanceof mr1) {
            this.f29649a.put(type, (mr1) obj);
        }
        if (z || (obj instanceof nv1)) {
            this.f29648a.add(TreeTypeAdapter.m35354l(tj4.get(type), obj));
        }
        if (obj instanceof cj4) {
            this.f29648a.add(TypeAdapters.m35363a(tj4.get(type), (cj4) obj));
        }
        return this;
    }

    /* renamed from: m */
    public hj1 mo37355m(dj4 dj4) {
        this.f29648a.add(dj4);
        return this;
    }

    /* renamed from: n */
    public hj1 mo37356n(Class<?> cls, Object obj) {
        boolean z = obj instanceof cw1;
        C4453a.m35636a(z || (obj instanceof nv1) || (obj instanceof cj4));
        if ((obj instanceof nv1) || z) {
            this.f29653b.add(TreeTypeAdapter.m35355m(cls, obj));
        }
        if (obj instanceof cj4) {
            this.f29648a.add(TypeAdapters.m35367e(cls, (cj4) obj));
        }
        return this;
    }

    /* renamed from: o */
    public hj1 mo37357o() {
        this.f29650a = true;
        return this;
    }

    /* renamed from: p */
    public hj1 mo37358p() {
        this.f29655c = true;
        return this;
    }

    /* renamed from: q */
    public hj1 mo37359q(int i) {
        this.f29642a = i;
        this.f29647a = null;
        return this;
    }

    /* renamed from: r */
    public hj1 mo37360r(int i, int i2) {
        this.f29642a = i;
        this.f29651b = i2;
        this.f29647a = null;
        return this;
    }

    /* renamed from: s */
    public hj1 mo37361s(String str) {
        this.f29647a = str;
        return this;
    }

    /* renamed from: t */
    public hj1 mo37362t(uw0... uw0Arr) {
        for (uw0 o : uw0Arr) {
            this.f29643a = this.f29643a.mo30141o(o, true, true);
        }
        return this;
    }

    /* renamed from: u */
    public hj1 mo37363u(b21 b21) {
        this.f29644a = b21;
        return this;
    }

    /* renamed from: v */
    public hj1 mo37364v(c21 c21) {
        this.f29644a = c21;
        return this;
    }

    /* renamed from: w */
    public hj1 mo37365w() {
        this.f29659g = true;
        return this;
    }

    /* renamed from: x */
    public hj1 mo37366x(fa2 fa2) {
        this.f29645a = fa2;
        return this;
    }

    /* renamed from: y */
    public hj1 mo37367y(hf4 hf4) {
        this.f29652b = hf4;
        return this;
    }

    /* renamed from: z */
    public hj1 mo37368z(hf4 hf4) {
        this.f29646a = hf4;
        return this;
    }
}
