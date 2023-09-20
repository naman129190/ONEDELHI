package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.List;

public class wj0 implements sj0 {

    /* renamed from: a */
    public int f22141a;

    /* renamed from: a */
    public cl0 f22142a = null;

    /* renamed from: a */
    public gx4 f22143a;

    /* renamed from: a */
    public sj0 f22144a = null;

    /* renamed from: a */
    public C3842a f22145a = C3842a.UNKNOWN;

    /* renamed from: a */
    public List<sj0> f22146a = new ArrayList();

    /* renamed from: a */
    public boolean f22147a = false;

    /* renamed from: b */
    public int f22148b;

    /* renamed from: b */
    public List<wj0> f22149b = new ArrayList();

    /* renamed from: b */
    public boolean f22150b = false;

    /* renamed from: c */
    public int f22151c = 1;

    /* renamed from: c */
    public boolean f22152c = false;

    /* renamed from: com.onedelhi.secure.wj0$a */
    public enum C3842a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public wj0(gx4 gx4) {
        this.f22143a = gx4;
    }

    /* renamed from: a */
    public void mo13813a(sj0 sj0) {
        for (wj0 wj0 : this.f22149b) {
            if (!wj0.f22152c) {
                return;
            }
        }
        this.f22150b = true;
        sj0 sj02 = this.f22144a;
        if (sj02 != null) {
            sj02.mo13813a(this);
        }
        if (this.f22147a) {
            this.f22143a.mo13813a(this);
            return;
        }
        wj0 wj02 = null;
        int i = 0;
        for (wj0 next : this.f22149b) {
            if (!(next instanceof cl0)) {
                i++;
                wj02 = next;
            }
        }
        if (wj02 != null && i == 1 && wj02.f22152c) {
            cl0 cl0 = this.f22142a;
            if (cl0 != null) {
                if (cl0.f22152c) {
                    this.f22141a = this.f22151c * cl0.f22148b;
                } else {
                    return;
                }
            }
            mo14196e(wj02.f22148b + this.f22141a);
        }
        sj0 sj03 = this.f22144a;
        if (sj03 != null) {
            sj03.mo13813a(this);
        }
    }

    /* renamed from: b */
    public void mo26584b(sj0 sj0) {
        this.f22146a.add(sj0);
        if (this.f22152c) {
            sj0.mo13813a(sj0);
        }
    }

    /* renamed from: c */
    public void mo26585c() {
        this.f22149b.clear();
        this.f22146a.clear();
        this.f22152c = false;
        this.f22148b = 0;
        this.f22150b = false;
        this.f22147a = false;
    }

    /* renamed from: d */
    public String mo26586d() {
        StringBuilder sb;
        String str;
        String y = this.f22143a.f12807a.mo21756y();
        C3842a aVar = this.f22145a;
        if (aVar == C3842a.LEFT || aVar == C3842a.RIGHT) {
            sb = new StringBuilder();
            sb.append(y);
            str = "_HORIZONTAL";
        } else {
            sb = new StringBuilder();
            sb.append(y);
            str = "_VERTICAL";
        }
        sb.append(str);
        String sb2 = sb.toString();
        return sb2 + ar4.f25981a + this.f22145a.name();
    }

    /* renamed from: e */
    public void mo14196e(int i) {
        if (!this.f22152c) {
            this.f22152c = true;
            this.f22148b = i;
            for (sj0 next : this.f22146a) {
                next.mo13813a(next);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22143a.f12807a.mo21756y());
        sb.append(ar4.f25981a);
        sb.append(this.f22145a);
        sb.append(pl2.f33726c);
        sb.append(this.f22152c ? Integer.valueOf(this.f22148b) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f22149b.size());
        sb.append(":d=");
        sb.append(this.f22146a.size());
        sb.append(">");
        return sb.toString();
    }
}
