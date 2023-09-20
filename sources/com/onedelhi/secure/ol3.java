package com.onedelhi.secure;

import java.util.EnumMap;
import java.util.Map;

public final class ol3 {

    /* renamed from: a */
    public final int f33079a;

    /* renamed from: a */
    public final long f33080a;

    /* renamed from: a */
    public final C7363yi f33081a;

    /* renamed from: a */
    public final String f33082a;

    /* renamed from: a */
    public Map<ql3, Object> f33083a;

    /* renamed from: a */
    public final byte[] f33084a;

    /* renamed from: a */
    public sl3[] f33085a;

    public ol3(String str, byte[] bArr, int i, sl3[] sl3Arr, C7363yi yiVar, long j) {
        this.f33082a = str;
        this.f33084a = bArr;
        this.f33079a = i;
        this.f33085a = sl3Arr;
        this.f33081a = yiVar;
        this.f33083a = null;
        this.f33080a = j;
    }

    public ol3(String str, byte[] bArr, sl3[] sl3Arr, C7363yi yiVar) {
        this(str, bArr, sl3Arr, yiVar, System.currentTimeMillis());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ol3(String str, byte[] bArr, sl3[] sl3Arr, C7363yi yiVar, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, sl3Arr, yiVar, j);
    }

    /* renamed from: a */
    public void mo41823a(sl3[] sl3Arr) {
        sl3[] sl3Arr2 = this.f33085a;
        if (sl3Arr2 == null) {
            this.f33085a = sl3Arr;
        } else if (sl3Arr != null && sl3Arr.length > 0) {
            sl3[] sl3Arr3 = new sl3[(sl3Arr2.length + sl3Arr.length)];
            System.arraycopy(sl3Arr2, 0, sl3Arr3, 0, sl3Arr2.length);
            System.arraycopy(sl3Arr, 0, sl3Arr3, sl3Arr2.length, sl3Arr.length);
            this.f33085a = sl3Arr3;
        }
    }

    /* renamed from: b */
    public C7363yi mo41824b() {
        return this.f33081a;
    }

    /* renamed from: c */
    public int mo41825c() {
        return this.f33079a;
    }

    /* renamed from: d */
    public byte[] mo41826d() {
        return this.f33084a;
    }

    /* renamed from: e */
    public Map<ql3, Object> mo41827e() {
        return this.f33083a;
    }

    /* renamed from: f */
    public sl3[] mo41828f() {
        return this.f33085a;
    }

    /* renamed from: g */
    public String mo41829g() {
        return this.f33082a;
    }

    /* renamed from: h */
    public long mo41830h() {
        return this.f33080a;
    }

    /* renamed from: i */
    public void mo41831i(Map<ql3, Object> map) {
        if (map != null) {
            Map<ql3, Object> map2 = this.f33083a;
            if (map2 == null) {
                this.f33083a = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* renamed from: j */
    public void mo41832j(ql3 ql3, Object obj) {
        if (this.f33083a == null) {
            this.f33083a = new EnumMap(ql3.class);
        }
        this.f33083a.put(ql3, obj);
    }

    public String toString() {
        return this.f33082a;
    }
}
