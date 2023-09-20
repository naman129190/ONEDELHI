package com.onedelhi.secure;

import java.io.IOException;
import java.util.List;

public final class go6 implements yv6 {

    /* renamed from: a */
    public final eo6 f12687a;

    public go6(eo6 eo6) {
        byte[] bArr = zq6.f23858a;
        this.f12687a = eo6;
        eo6.f11313a = this;
    }

    /* renamed from: K */
    public static go6 m15985K(eo6 eo6) {
        go6 go6 = eo6.f11313a;
        return go6 != null ? go6 : new go6(eo6);
    }

    /* renamed from: A */
    public final void mo16762A(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12687a.mo15276p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += eo6.m13911z(((Long) list.get(i4)).longValue());
            }
            this.f12687a.mo15278r(i3);
            while (i2 < list.size()) {
                this.f12687a.mo15280t(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12687a.mo15279s(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo16763B(int i, Object obj, gt6 gt6) throws IOException {
        vs6 vs6 = (vs6) obj;
        yn6 yn6 = (yn6) this.f12687a;
        yn6.mo15278r((i << 3) | 2);
        yn6.mo15278r(((pl6) vs6).mo18539f(gt6));
        gt6.mo16912f(vs6, yn6.f11313a);
    }

    /* renamed from: C */
    public final void mo16764C(int i, int i2) throws IOException {
        this.f12687a.mo15268h(i, i2);
    }

    /* renamed from: D */
    public final void mo16765D(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12687a.mo15276p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += eo6.m13910y((intValue >> 31) ^ (intValue + intValue));
            }
            this.f12687a.mo15278r(i3);
            while (i2 < list.size()) {
                eo6 eo6 = this.f12687a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                eo6.mo15278r((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            eo6 eo62 = this.f12687a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            eo62.mo15277q(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: E */
    public final void mo16766E(int i, on6 on6) throws IOException {
        this.f12687a.mo15267g(i, on6);
    }

    /* renamed from: F */
    public final void mo16767F(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12687a.mo15276p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += eo6.m13911z(((Long) list.get(i4)).longValue());
            }
            this.f12687a.mo15278r(i3);
            while (i2 < list.size()) {
                this.f12687a.mo15280t(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12687a.mo15279s(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: G */
    public final void mo16768G(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12687a.mo15276p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f12687a.mo15278r(i3);
            while (i2 < list.size()) {
                this.f12687a.mo15271k(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12687a.mo15270j(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: H */
    public final void mo16769H(int i, float f) throws IOException {
        this.f12687a.mo15268h(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: I */
    public final void mo16770I(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof kr6) {
            kr6 kr6 = (kr6) list;
            while (i2 < list.size()) {
                Object u0 = kr6.mo18565u0(i2);
                if (u0 instanceof String) {
                    this.f12687a.mo15275o(i, (String) u0);
                } else {
                    this.f12687a.mo15267g(i, (on6) u0);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12687a.mo15275o(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: J */
    public final void mo16771J(int i, int i2) throws IOException {
        this.f12687a.mo15277q(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: a */
    public final void mo16772a(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12687a.mo15276p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += eo6.m13911z((longValue >> 63) ^ (longValue + longValue));
            }
            this.f12687a.mo15278r(i3);
            while (i2 < list.size()) {
                eo6 eo6 = this.f12687a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                eo6.mo15280t((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            eo6 eo62 = this.f12687a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            eo62.mo15279s(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo16773b(int i, int i2) throws IOException {
        this.f12687a.mo15272l(i, i2);
    }

    /* renamed from: c */
    public final void mo16774c(int i, double d) throws IOException {
        this.f12687a.mo15270j(i, Double.doubleToRawLongBits(d));
    }

    @Deprecated
    /* renamed from: d */
    public final void mo16775d(int i) throws IOException {
        this.f12687a.mo15276p(i, 3);
    }

    /* renamed from: e */
    public final void mo16776e(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12687a.mo15276p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f12687a.mo15278r(i3);
            while (i2 < list.size()) {
                this.f12687a.mo15269i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12687a.mo15268h(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo16777f(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12687a.mo15276p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f12687a.mo15278r(i3);
            while (i2 < list.size()) {
                this.f12687a.mo15271k(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12687a.mo15270j(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* renamed from: g */
    public final void mo16778g(int i, int i2) throws IOException {
        this.f12687a.mo15277q(i, i2);
    }

    /* renamed from: h */
    public final void mo16779h(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12687a.mo15276p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f12687a.mo15278r(i3);
            while (i2 < list.size()) {
                this.f12687a.mo15269i(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12687a.mo15268h(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: i */
    public final void mo16780i(int i) throws IOException {
        this.f12687a.mo15276p(i, 4);
    }

    /* renamed from: j */
    public final void mo16781j(int i, long j) throws IOException {
        this.f12687a.mo15270j(i, j);
    }

    /* renamed from: k */
    public final void mo16782k(int i, int i2) throws IOException {
        this.f12687a.mo15272l(i, i2);
    }

    /* renamed from: l */
    public final void mo16783l(int i, int i2) throws IOException {
        this.f12687a.mo15268h(i, i2);
    }

    /* renamed from: m */
    public final void mo16784m(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12687a.mo15276p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f12687a.mo15278r(i3);
            while (i2 < list.size()) {
                this.f12687a.mo15271k(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12687a.mo15270j(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo16785n(int i, long j) throws IOException {
        this.f12687a.mo15279s(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: o */
    public final void mo16786o(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f12687a.mo15267g(i, (on6) list.get(i2));
        }
    }

    /* renamed from: p */
    public final void mo16787p(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12687a.mo15276p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += eo6.m13907v(((Integer) list.get(i4)).intValue());
            }
            this.f12687a.mo15278r(i3);
            while (i2 < list.size()) {
                this.f12687a.mo15273m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12687a.mo15272l(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: q */
    public final void mo16788q(int i, String str) throws IOException {
        this.f12687a.mo15275o(i, str);
    }

    /* renamed from: r */
    public final void mo16789r(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12687a.mo15276p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += eo6.m13907v(((Integer) list.get(i4)).intValue());
            }
            this.f12687a.mo15278r(i3);
            while (i2 < list.size()) {
                this.f12687a.mo15273m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12687a.mo15272l(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: s */
    public final void mo16790s(int i, long j) throws IOException {
        this.f12687a.mo15279s(i, j);
    }

    /* renamed from: t */
    public final void mo16791t(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12687a.mo15276p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += eo6.m13910y(((Integer) list.get(i4)).intValue());
            }
            this.f12687a.mo15278r(i3);
            while (i2 < list.size()) {
                this.f12687a.mo15278r(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12687a.mo15277q(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: u */
    public final void mo16792u(int i, long j) throws IOException {
        this.f12687a.mo15279s(i, j);
    }

    /* renamed from: v */
    public final void mo16793v(int i, Object obj, gt6 gt6) throws IOException {
        eo6 eo6 = this.f12687a;
        eo6.mo15276p(i, 3);
        gt6.mo16912f((vs6) obj, eo6.f11313a);
        eo6.mo15276p(i, 4);
    }

    /* renamed from: w */
    public final void mo16794w(int i, long j) throws IOException {
        this.f12687a.mo15270j(i, j);
    }

    /* renamed from: x */
    public final void mo16795x(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12687a.mo15276p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f12687a.mo15278r(i3);
            while (i2 < list.size()) {
                this.f12687a.mo15265e(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12687a.mo15266f(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: y */
    public final void mo16796y(int i, boolean z) throws IOException {
        this.f12687a.mo15266f(i, z);
    }

    /* renamed from: z */
    public final void mo16797z(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12687a.mo15276p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f12687a.mo15278r(i3);
            while (i2 < list.size()) {
                this.f12687a.mo15269i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12687a.mo15268h(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }
}
