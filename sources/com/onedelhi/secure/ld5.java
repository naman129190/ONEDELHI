package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class ld5 implements Iterable, qh5, jg5 {

    /* renamed from: a */
    public final Map f15303a;

    /* renamed from: a */
    public final SortedMap f15304a;

    public ld5() {
        this.f15304a = new TreeMap();
        this.f15303a = new TreeMap();
    }

    public ld5(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                mo19465z(i, (qh5) list.get(i));
            }
        }
    }

    /* renamed from: A */
    public final boolean mo19451A(int i) {
        if (i >= 0 && i <= ((Integer) this.f15304a.lastKey()).intValue()) {
            return this.f15304a.containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i);
    }

    /* renamed from: b */
    public final String mo13084b() {
        return mo19458t(vf4.f36537c);
    }

    /* renamed from: e */
    public final Double mo13085e() {
        return this.f15304a.size() == 1 ? mo19457s(0).mo13085e() : this.f15304a.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ld5)) {
            return false;
        }
        ld5 ld5 = (ld5) obj;
        if (mo19456r() != ld5.mo19456r()) {
            return false;
        }
        if (this.f15304a.isEmpty()) {
            return ld5.f15304a.isEmpty();
        }
        for (int intValue = ((Integer) this.f15304a.firstKey()).intValue(); intValue <= ((Integer) this.f15304a.lastKey()).intValue(); intValue++) {
            if (!mo19457s(intValue).equals(ld5.mo19457s(intValue))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final Boolean mo13087f() {
        return Boolean.TRUE;
    }

    /* renamed from: g */
    public final qh5 mo13088g(String str, w96 w96, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? mm5.m21783a(str, this, w96, list) : pf5.m24652a(this, new wi5(str), w96, list);
    }

    public final int hashCode() {
        return this.f15304a.hashCode() * 31;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r3 = (com.onedelhi.secure.qh5) r2.f15303a.get(r3);
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.qh5 mo15167i(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0017
            com.onedelhi.secure.te5 r3 = new com.onedelhi.secure.te5
            int r0 = r2.mo19456r()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
            return r3
        L_0x0017:
            boolean r0 = r2.mo15168j(r3)
            if (r0 == 0) goto L_0x0028
            java.util.Map r0 = r2.f15303a
            java.lang.Object r3 = r0.get(r3)
            com.onedelhi.secure.qh5 r3 = (com.onedelhi.secure.qh5) r3
            if (r3 == 0) goto L_0x0028
            return r3
        L_0x0028:
            com.onedelhi.secure.qh5 r3 = com.onedelhi.secure.qh5.f19182a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ld5.mo15167i(java.lang.String):com.onedelhi.secure.qh5");
    }

    public final Iterator iterator() {
        return new zc5(this);
    }

    /* renamed from: j */
    public final boolean mo15168j(String str) {
        return "length".equals(str) || this.f15303a.containsKey(str);
    }

    /* renamed from: k */
    public final qh5 mo13090k() {
        Integer num;
        SortedMap sortedMap;
        qh5 qh5;
        ld5 ld5 = new ld5();
        for (Map.Entry entry : this.f15304a.entrySet()) {
            if (entry.getValue() instanceof jg5) {
                sortedMap = ld5.f15304a;
                num = (Integer) entry.getKey();
                qh5 = (qh5) entry.getValue();
            } else {
                sortedMap = ld5.f15304a;
                num = (Integer) entry.getKey();
                qh5 = ((qh5) entry.getValue()).mo13090k();
            }
            sortedMap.put(num, qh5);
        }
        return ld5;
    }

    /* renamed from: l */
    public final Iterator mo13091l() {
        return new nc5(this, this.f15304a.keySet().iterator(), this.f15303a.keySet().iterator());
    }

    /* renamed from: n */
    public final void mo15169n(String str, qh5 qh5) {
        if (qh5 == null) {
            this.f15303a.remove(str);
        } else {
            this.f15303a.put(str, qh5);
        }
    }

    /* renamed from: o */
    public final int mo19455o() {
        return this.f15304a.size();
    }

    /* renamed from: r */
    public final int mo19456r() {
        if (this.f15304a.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f15304a.lastKey()).intValue() + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = (com.onedelhi.secure.qh5) r1.f15304a.get(java.lang.Integer.valueOf(r2));
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.qh5 mo19457s(int r2) {
        /*
            r1 = this;
            int r0 = r1.mo19456r()
            if (r2 >= r0) goto L_0x001e
            boolean r0 = r1.mo19451A(r2)
            if (r0 == 0) goto L_0x001b
            java.util.SortedMap r0 = r1.f15304a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.onedelhi.secure.qh5 r2 = (com.onedelhi.secure.qh5) r2
            if (r2 == 0) goto L_0x001b
            return r2
        L_0x001b:
            com.onedelhi.secure.qh5 r2 = com.onedelhi.secure.qh5.f19182a
            return r2
        L_0x001e:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Attempting to get element outside of current array"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ld5.mo19457s(int):com.onedelhi.secure.qh5");
    }

    /* renamed from: t */
    public final String mo19458t(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.f15304a.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= mo19456r()) {
                    break;
                }
                qh5 s = mo19457s(i);
                sb.append(str2);
                if (!(s instanceof ej5) && !(s instanceof ah5)) {
                    sb.append(s.mo13084b());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final String toString() {
        return mo19458t(vf4.f36537c);
    }

    /* renamed from: u */
    public final Iterator mo19460u() {
        return this.f15304a.keySet().iterator();
    }

    /* renamed from: v */
    public final List mo19461v() {
        ArrayList arrayList = new ArrayList(mo19456r());
        for (int i = 0; i < mo19456r(); i++) {
            arrayList.add(mo19457s(i));
        }
        return arrayList;
    }

    /* renamed from: w */
    public final void mo19462w() {
        this.f15304a.clear();
    }

    /* renamed from: x */
    public final void mo19463x(int i, qh5 qh5) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i);
        } else if (i >= mo19456r()) {
            mo19465z(i, qh5);
        } else {
            for (int intValue = ((Integer) this.f15304a.lastKey()).intValue(); intValue >= i; intValue--) {
                SortedMap sortedMap = this.f15304a;
                Integer valueOf = Integer.valueOf(intValue);
                qh5 qh52 = (qh5) sortedMap.get(valueOf);
                if (qh52 != null) {
                    mo19465z(intValue + 1, qh52);
                    this.f15304a.remove(valueOf);
                }
            }
            mo19465z(i, qh5);
        }
    }

    /* renamed from: y */
    public final void mo19464y(int i) {
        int intValue = ((Integer) this.f15304a.lastKey()).intValue();
        if (i <= intValue && i >= 0) {
            this.f15304a.remove(Integer.valueOf(i));
            if (i == intValue) {
                SortedMap sortedMap = this.f15304a;
                int i2 = i - 1;
                Integer valueOf = Integer.valueOf(i2);
                if (!sortedMap.containsKey(valueOf) && i2 >= 0) {
                    this.f15304a.put(valueOf, qh5.f19182a);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= ((Integer) this.f15304a.lastKey()).intValue()) {
                    SortedMap sortedMap2 = this.f15304a;
                    Integer valueOf2 = Integer.valueOf(i);
                    qh5 qh5 = (qh5) sortedMap2.get(valueOf2);
                    if (qh5 != null) {
                        this.f15304a.put(Integer.valueOf(i - 1), qh5);
                        this.f15304a.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    @RequiresNonNull({"elements"})
    /* renamed from: z */
    public final void mo19465z(int i, qh5 qh5) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        } else if (qh5 == null) {
            this.f15304a.remove(Integer.valueOf(i));
        } else {
            this.f15304a.put(Integer.valueOf(i), qh5);
        }
    }
}
