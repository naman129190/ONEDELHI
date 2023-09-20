package com.onedelhi.secure;

import java.util.Iterator;

/* renamed from: com.onedelhi.secure.or */
public class C3086or extends C3182pr {
    public C3086or(char[] cArr) {
        super(cArr);
    }

    /* renamed from: B */
    public static C3336qr m24040B(char[] cArr) {
        return new C3086or(cArr);
    }

    /* renamed from: y */
    public String mo22057y(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        String z = mo22058z();
        if (i2 > 0 || z.length() + i >= C3336qr.f19436o) {
            sb.append("[\n");
            Iterator<C3336qr> it = this.f18683a.iterator();
            boolean z2 = true;
            while (it.hasNext()) {
                C3336qr next = it.next();
                if (!z2) {
                    sb.append(",\n");
                } else {
                    z2 = false;
                }
                mo23404b(sb, C3336qr.f19437p + i);
                sb.append(next.mo22057y(C3336qr.f19437p + i, i2 - 1));
            }
            sb.append("\n");
            mo23404b(sb, i);
            sb.append("]");
        } else {
            sb.append(z);
        }
        return sb.toString();
    }

    /* renamed from: z */
    public String mo22058z() {
        StringBuilder sb = new StringBuilder(mo23407g() + "[");
        boolean z = true;
        for (int i = 0; i < this.f18683a.size(); i++) {
            if (!z) {
                sb.append(", ");
            } else {
                z = false;
            }
            sb.append(this.f18683a.get(i).mo22058z());
        }
        return sb + "]";
    }
}
