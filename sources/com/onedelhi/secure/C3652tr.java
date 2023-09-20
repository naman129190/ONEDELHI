package com.onedelhi.secure;

import java.util.Iterator;

/* renamed from: com.onedelhi.secure.tr */
public class C3652tr extends C3182pr implements Iterable<C3450rr> {

    /* renamed from: com.onedelhi.secure.tr$a */
    public class C3653a implements Iterator {

        /* renamed from: a */
        public C3652tr f21052a;

        /* renamed from: n */
        public int f21054n = 0;

        public C3653a(C3652tr trVar) {
            this.f21052a = trVar;
        }

        public boolean hasNext() {
            return this.f21054n < this.f21052a.size();
        }

        public Object next() {
            C3450rr rrVar = (C3450rr) this.f21052a.f18683a.get(this.f21054n);
            this.f21054n++;
            return rrVar;
        }
    }

    public C3652tr(char[] cArr) {
        super(cArr);
    }

    /* renamed from: h0 */
    public static C3652tr m28852h0(char[] cArr) {
        return new C3652tr(cArr);
    }

    /* renamed from: i0 */
    public String mo25254i0() {
        return mo22057y(0, 0);
    }

    public Iterator iterator() {
        return new C3653a(this);
    }

    /* renamed from: y */
    public String mo22057y(int i, int i2) {
        StringBuilder sb = new StringBuilder(mo23407g());
        sb.append("{\n");
        Iterator<C3336qr> it = this.f18683a.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C3336qr next = it.next();
            if (!z) {
                sb.append(",\n");
            } else {
                z = false;
            }
            sb.append(next.mo22057y(C3336qr.f19437p + i, i2 - 1));
        }
        sb.append("\n");
        mo23404b(sb, i);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: z */
    public String mo22058z() {
        StringBuilder sb = new StringBuilder(mo23407g() + "{ ");
        Iterator<C3336qr> it = this.f18683a.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C3336qr next = it.next();
            if (!z) {
                sb.append(", ");
            } else {
                z = false;
            }
            sb.append(next.mo22058z());
        }
        sb.append(" }");
        return sb.toString();
    }
}
