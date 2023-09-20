package com.onedelhi.secure;

import java.util.List;
import java.util.Locale;

public class m12 {

    /* renamed from: a */
    public final float f15830a;

    /* renamed from: a */
    public final int f15831a;

    /* renamed from: a */
    public final long f15832a;
    @ts2

    /* renamed from: a */
    public final C2475j6 f15833a;

    /* renamed from: a */
    public final la2 f15834a;

    /* renamed from: a */
    public final C2806a f15835a;

    /* renamed from: a */
    public final C2807b f15836a;
    @ts2

    /* renamed from: a */
    public final C3472s6 f15837a;
    @ts2

    /* renamed from: a */
    public final C3566t6 f15838a;

    /* renamed from: a */
    public final C3766v6 f15839a;

    /* renamed from: a */
    public final String f15840a;

    /* renamed from: a */
    public final List<h70> f15841a;

    /* renamed from: a */
    public final boolean f15842a;

    /* renamed from: b */
    public final float f15843b;

    /* renamed from: b */
    public final int f15844b;

    /* renamed from: b */
    public final long f15845b;
    @ts2

    /* renamed from: b */
    public final String f15846b;

    /* renamed from: b */
    public final List<td2> f15847b;

    /* renamed from: c */
    public final int f15848c;

    /* renamed from: c */
    public final List<ez1<Float>> f15849c;

    /* renamed from: d */
    public final int f15850d;

    /* renamed from: e */
    public final int f15851e;

    /* renamed from: com.onedelhi.secure.m12$a */
    public enum C2806a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* renamed from: com.onedelhi.secure.m12$b */
    public enum C2807b {
        NONE,
        ADD,
        INVERT,
        UNKNOWN
    }

    public m12(List<h70> list, la2 la2, String str, long j, C2806a aVar, long j2, @ts2 String str2, List<td2> list2, C3766v6 v6Var, int i, int i2, int i3, float f, float f2, int i4, int i5, @ts2 C3472s6 s6Var, @ts2 C3566t6 t6Var, List<ez1<Float>> list3, C2807b bVar, @ts2 C2475j6 j6Var, boolean z) {
        this.f15841a = list;
        this.f15834a = la2;
        this.f15840a = str;
        this.f15832a = j;
        this.f15835a = aVar;
        this.f15845b = j2;
        this.f15846b = str2;
        this.f15847b = list2;
        this.f15839a = v6Var;
        this.f15831a = i;
        this.f15844b = i2;
        this.f15848c = i3;
        this.f15830a = f;
        this.f15843b = f2;
        this.f15850d = i4;
        this.f15851e = i5;
        this.f15837a = s6Var;
        this.f15838a = t6Var;
        this.f15849c = list3;
        this.f15836a = bVar;
        this.f15833a = j6Var;
        this.f15842a = z;
    }

    /* renamed from: a */
    public la2 mo20013a() {
        return this.f15834a;
    }

    /* renamed from: b */
    public long mo20014b() {
        return this.f15832a;
    }

    /* renamed from: c */
    public List<ez1<Float>> mo20015c() {
        return this.f15849c;
    }

    /* renamed from: d */
    public C2806a mo20016d() {
        return this.f15835a;
    }

    /* renamed from: e */
    public List<td2> mo20017e() {
        return this.f15847b;
    }

    /* renamed from: f */
    public C2807b mo20018f() {
        return this.f15836a;
    }

    /* renamed from: g */
    public String mo20019g() {
        return this.f15840a;
    }

    /* renamed from: h */
    public long mo20020h() {
        return this.f15845b;
    }

    /* renamed from: i */
    public int mo20021i() {
        return this.f15851e;
    }

    /* renamed from: j */
    public int mo20022j() {
        return this.f15850d;
    }

    @ts2
    /* renamed from: k */
    public String mo20023k() {
        return this.f15846b;
    }

    /* renamed from: l */
    public List<h70> mo20024l() {
        return this.f15841a;
    }

    /* renamed from: m */
    public int mo20025m() {
        return this.f15848c;
    }

    /* renamed from: n */
    public int mo20026n() {
        return this.f15844b;
    }

    /* renamed from: o */
    public int mo20027o() {
        return this.f15831a;
    }

    /* renamed from: p */
    public float mo20028p() {
        return this.f15843b / this.f15834a.mo19376e();
    }

    @ts2
    /* renamed from: q */
    public C3472s6 mo20029q() {
        return this.f15837a;
    }

    @ts2
    /* renamed from: r */
    public C3566t6 mo20030r() {
        return this.f15838a;
    }

    @ts2
    /* renamed from: s */
    public C2475j6 mo20031s() {
        return this.f15833a;
    }

    /* renamed from: t */
    public float mo20032t() {
        return this.f15830a;
    }

    public String toString() {
        return mo20036w("");
    }

    /* renamed from: u */
    public C3766v6 mo20034u() {
        return this.f15839a;
    }

    /* renamed from: v */
    public boolean mo20035v() {
        return this.f15842a;
    }

    /* renamed from: w */
    public String mo20036w(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(mo20019g());
        sb.append("\n");
        m12 v = this.f15834a.mo19394v(mo20020h());
        if (v != null) {
            String str2 = "\t\tParents: ";
            while (true) {
                sb.append(str2);
                sb.append(v.mo20019g());
                v = this.f15834a.mo19394v(v.mo20020h());
                if (v == null) {
                    break;
                }
                str2 = "->";
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!mo20017e().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(mo20017e().size());
            sb.append("\n");
        }
        if (!(mo20027o() == 0 || mo20026n() == 0)) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(mo20027o()), Integer.valueOf(mo20026n()), Integer.valueOf(mo20025m())}));
        }
        if (!this.f15841a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (h70 next : this.f15841a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(next);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
