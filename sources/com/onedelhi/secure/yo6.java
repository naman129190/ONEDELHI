package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class yo6 {

    /* renamed from: a */
    public static final yo6 f23272a = new yo6(true);

    /* renamed from: a */
    public final lu6 f23273a = new jt6(16);

    /* renamed from: a */
    public boolean f23274a;

    /* renamed from: b */
    public boolean f23275b;

    public yo6() {
    }

    public yo6(boolean z) {
        mo27657b();
        mo27657b();
    }

    /* renamed from: a */
    public static yo6 m32585a() {
        throw null;
    }

    /* renamed from: d */
    public static final void m32586d(wo6 wo6, Object obj) {
        boolean z;
        wv6 o = wo6.mo26644o();
        byte[] bArr = zq6.f23858a;
        Objects.requireNonNull(obj);
        wv6 wv6 = wv6.DOUBLE;
        xv6 xv6 = xv6.INT;
        switch (o.mo26709a().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof on6) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof nq6)) {
                    return;
                }
            case 8:
                if ((obj instanceof vs6) || (obj instanceof hr6)) {
                    return;
                }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(wo6.mo26643d()), wo6.mo26644o().mo26709a(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo27657b() {
        if (!this.f23274a) {
            for (int i = 0; i < this.f23273a.mo19903d(); i++) {
                Map.Entry j = this.f23273a.mo19910j(i);
                if (j.getValue() instanceof jq6) {
                    ((jq6) j.getValue()).mo18546u();
                }
            }
            this.f23273a.mo18666c();
            this.f23274a = true;
        }
    }

    /* renamed from: c */
    public final void mo27658c(wo6 wo6, Object obj) {
        if (!wo6.mo26642c()) {
            m32586d(wo6, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m32586d(wo6, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof hr6) {
            this.f23275b = true;
        }
        this.f23273a.put(wo6, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        yo6 yo6 = new yo6();
        for (int i = 0; i < this.f23273a.mo19903d(); i++) {
            Map.Entry j = this.f23273a.mo19910j(i);
            yo6.mo27658c((wo6) j.getKey(), j.getValue());
        }
        for (Map.Entry entry : this.f23273a.mo19906f()) {
            yo6.mo27658c((wo6) entry.getKey(), entry.getValue());
        }
        yo6.f23275b = this.f23275b;
        return yo6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo6)) {
            return false;
        }
        return this.f23273a.equals(((yo6) obj).f23273a);
    }

    public final int hashCode() {
        return this.f23273a.hashCode();
    }
}
