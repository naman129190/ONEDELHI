package com.onedelhi.secure;

import com.onedelhi.secure.hl3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class wy1 {
    @ts2

    /* renamed from: a */
    public xy1 f22360a;

    /* renamed from: a */
    public final List<String> f22361a;

    public wy1(wy1 wy1) {
        this.f22361a = new ArrayList(wy1.f22361a);
        this.f22360a = wy1.f22360a;
    }

    public wy1(String... strArr) {
        this.f22361a = Arrays.asList(strArr);
    }

    @C2677kx
    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: a */
    public wy1 mo26718a(String str) {
        wy1 wy1 = new wy1(this);
        wy1.f22361a.add(str);
        return wy1;
    }

    /* renamed from: b */
    public final boolean mo26719b() {
        List<String> list = this.f22361a;
        return list.get(list.size() - 1).equals("**");
    }

    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: c */
    public boolean mo26720c(String str, int i) {
        if (i >= this.f22361a.size()) {
            return false;
        }
        boolean z = i == this.f22361a.size() - 1;
        String str2 = this.f22361a.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.f22361a.size() + -2 && mo26719b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.f22361a.get(i + 1).equals(str)) {
            return i == this.f22361a.size() + -2 || (i == this.f22361a.size() + -3 && mo26719b());
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < this.f22361a.size() - 1) {
            return false;
        }
        return this.f22361a.get(i2).equals(str);
    }

    @ts2
    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: d */
    public xy1 mo26721d() {
        return this.f22360a;
    }

    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: e */
    public int mo26722e(String str, int i) {
        if (mo26723f(str)) {
            return 0;
        }
        if (!this.f22361a.get(i).equals("**")) {
            return 1;
        }
        return (i != this.f22361a.size() - 1 && this.f22361a.get(i + 1).equals(str)) ? 2 : 0;
    }

    /* renamed from: f */
    public final boolean mo26723f(String str) {
        return "__container".equals(str);
    }

    /* renamed from: g */
    public String mo26724g() {
        return this.f22361a.toString();
    }

    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: h */
    public boolean mo26725h(String str, int i) {
        if (mo26723f(str)) {
            return true;
        }
        if (i >= this.f22361a.size()) {
            return false;
        }
        return this.f22361a.get(i).equals(str) || this.f22361a.get(i).equals("**") || this.f22361a.get(i).equals("*");
    }

    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: i */
    public boolean mo26726i(String str, int i) {
        return "__container".equals(str) || i < this.f22361a.size() - 1 || this.f22361a.get(i).equals("**");
    }

    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: j */
    public wy1 mo26727j(xy1 xy1) {
        wy1 wy1 = new wy1(this);
        wy1.f22360a = xy1;
        return wy1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f22361a);
        sb.append(",resolved=");
        sb.append(this.f22360a != null);
        sb.append('}');
        return sb.toString();
    }
}
