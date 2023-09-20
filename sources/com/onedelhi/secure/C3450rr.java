package com.onedelhi.secure;

import com.onedelhi.secure.ak4;
import java.util.ArrayList;

/* renamed from: com.onedelhi.secure.rr */
public class C3450rr extends C3182pr {

    /* renamed from: b */
    public static ArrayList<String> f20086b;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f20086b = arrayList;
        arrayList.add("ConstraintSets");
        f20086b.add("Variables");
        f20086b.add("Generate");
        f20086b.add(ak4.C1715h.f9296a);
        f20086b.add(sy1.f20601c);
        f20086b.add("KeyAttributes");
        f20086b.add("KeyPositions");
        f20086b.add("KeyCycles");
    }

    public C3450rr(char[] cArr) {
        super(cArr);
    }

    /* renamed from: B */
    public static C3336qr m27026B(char[] cArr) {
        return new C3450rr(cArr);
    }

    /* renamed from: h0 */
    public static C3336qr m27027h0(String str, C3336qr qrVar) {
        C3450rr rrVar = new C3450rr(str.toCharArray());
        rrVar.mo23420x(0);
        rrVar.mo23418v((long) (str.length() - 1));
        rrVar.mo24059m0(qrVar);
        return rrVar;
    }

    /* renamed from: i0 */
    public String mo24057i0() {
        return mo23405e();
    }

    /* renamed from: k0 */
    public C3336qr mo24058k0() {
        if (this.f18683a.size() > 0) {
            return this.f18683a.get(0);
        }
        return null;
    }

    /* renamed from: m0 */
    public void mo24059m0(C3336qr qrVar) {
        if (this.f18683a.size() > 0) {
            this.f18683a.set(0, qrVar);
        } else {
            this.f18683a.add(qrVar);
        }
    }

    /* renamed from: y */
    public String mo22057y(int i, int i2) {
        StringBuilder sb = new StringBuilder(mo23407g());
        mo23404b(sb, i);
        String e = mo23405e();
        if (this.f18683a.size() > 0) {
            sb.append(e);
            sb.append(": ");
            if (f20086b.contains(e)) {
                i2 = 3;
            }
            if (i2 <= 0) {
                String z = this.f18683a.get(0).mo22058z();
                if (z.length() + i < C3336qr.f19436o) {
                    sb.append(z);
                    return sb.toString();
                }
            }
            sb.append(this.f18683a.get(0).mo22057y(i, i2 - 1));
            return sb.toString();
        }
        return e + ": <> ";
    }

    /* renamed from: z */
    public String mo22058z() {
        StringBuilder sb;
        String str;
        if (this.f18683a.size() > 0) {
            sb = new StringBuilder();
            sb.append(mo23407g());
            sb.append(mo23405e());
            sb.append(": ");
            str = this.f18683a.get(0).mo22058z();
        } else {
            sb = new StringBuilder();
            sb.append(mo23407g());
            sb.append(mo23405e());
            str = ": <> ";
        }
        sb.append(str);
        return sb.toString();
    }
}
