package com.onedelhi.secure;

import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY})
public class pm2<T> {
    @ts2

    /* renamed from: a */
    public T f18613a;
    @ts2

    /* renamed from: b */
    public T f18614b;

    /* renamed from: a */
    public static boolean m24822a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public void mo22505b(T t, T t2) {
        this.f18613a = t;
        this.f18614b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof fy2)) {
            return false;
        }
        fy2 fy2 = (fy2) obj;
        return m24822a(fy2.f12385a, this.f18613a) && m24822a(fy2.f12386b, this.f18614b);
    }

    public int hashCode() {
        T t = this.f18613a;
        int i = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f18614b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f18613a) + " " + String.valueOf(this.f18614b) + "}";
    }
}
