package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class p46 {

    /* renamed from: a */
    public static final p46 f18359a = new p46(true);

    /* renamed from: a */
    public final zc6 f18360a = new vb6(16);

    /* renamed from: a */
    public boolean f18361a;

    /* renamed from: b */
    public boolean f18362b;

    public p46() {
    }

    public p46(boolean z) {
        mo22311b();
        mo22311b();
    }

    /* renamed from: a */
    public static p46 m24465a() {
        throw null;
    }

    /* renamed from: d */
    public static final void m24466d(m46 m46, Object obj) {
        boolean z;
        zf6 f = m46.mo20098f();
        t56.m28113e(obj);
        zf6 zf6 = zf6.DOUBLE;
        cg6 cg6 = cg6.INT;
        switch (f.mo27964a().ordinal()) {
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
                if ((obj instanceof i36) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof k56)) {
                    return;
                }
            case 8:
                if ((obj instanceof i96) || (obj instanceof w66)) {
                    return;
                }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(m46.mo20097d()), m46.mo20098f().mo27964a(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo22311b() {
        if (!this.f18361a) {
            this.f18360a.mo26000c();
            this.f18361a = true;
        }
    }

    /* renamed from: c */
    public final void mo22312c(m46 m46, Object obj) {
        if (!m46.mo20096c()) {
            m24466d(m46, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m24466d(m46, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof w66) {
            this.f18362b = true;
        }
        this.f18360a.put(m46, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        p46 p46 = new p46();
        for (int i = 0; i < this.f18360a.mo27924d(); i++) {
            Map.Entry j = this.f18360a.mo27931j(i);
            p46.mo22312c((m46) j.getKey(), j.getValue());
        }
        for (Map.Entry entry : this.f18360a.mo27927f()) {
            p46.mo22312c((m46) entry.getKey(), entry.getValue());
        }
        p46.f18362b = this.f18362b;
        return p46;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p46)) {
            return false;
        }
        return this.f18360a.equals(((p46) obj).f18360a);
    }

    public final int hashCode() {
        return this.f18360a.hashCode();
    }
}
