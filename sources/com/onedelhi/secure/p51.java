package com.onedelhi.secure;

import com.onedelhi.secure.g60;
import java.util.Map;

public final class p51 extends f13 {

    /* renamed from: a */
    public static final C7012v5 f33461a = C7012v5.m67717e();

    /* renamed from: a */
    public final eg4 f33462a;

    public p51(@mr2 eg4 eg4) {
        this.f33462a = eg4;
    }

    /* renamed from: c */
    public boolean mo35708c() {
        C7012v5 v5Var;
        StringBuilder sb;
        String str;
        if (!mo42373o(this.f33462a, 0)) {
            v5Var = f33461a;
            sb = new StringBuilder();
            str = "Invalid Trace:";
        } else if (!mo42368j(this.f33462a) || mo42366h(this.f33462a)) {
            return true;
        } else {
            v5Var = f33461a;
            sb = new StringBuilder();
            str = "Invalid Counters for Trace:";
        }
        sb.append(str);
        sb.append(this.f33462a.getName());
        v5Var.mo46010l(sb.toString());
        return false;
    }

    /* renamed from: g */
    public final boolean mo42365g(Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            try {
                f13.m47449d((String) next.getKey(), (String) next.getValue());
            } catch (IllegalArgumentException e) {
                f33461a.mo46010l(e.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo42366h(@mr2 eg4 eg4) {
        return mo42367i(eg4, 0);
    }

    /* renamed from: i */
    public final boolean mo42367i(@ts2 eg4 eg4, int i) {
        C7012v5 v5Var;
        StringBuilder sb;
        String sb2;
        if (eg4 == null) {
            return false;
        }
        if (i > 1) {
            v5Var = f33461a;
            sb2 = "Exceed MAX_SUBTRACE_DEEP:1";
        } else {
            for (Map.Entry next : eg4.mo35280Fb().entrySet()) {
                if (!mo42370l((String) next.getKey())) {
                    v5Var = f33461a;
                    sb = new StringBuilder();
                    sb.append("invalid CounterId:");
                    sb.append((String) next.getKey());
                } else if (!mo42371m((Long) next.getValue())) {
                    v5Var = f33461a;
                    sb = new StringBuilder();
                    sb.append("invalid CounterValue:");
                    sb.append(next.getValue());
                }
                sb2 = sb.toString();
            }
            for (eg4 i2 : eg4.mo35301Wi()) {
                if (!mo42367i(i2, i + 1)) {
                    return false;
                }
            }
            return true;
        }
        v5Var.mo46010l(sb2);
        return false;
    }

    /* renamed from: j */
    public final boolean mo42368j(@mr2 eg4 eg4) {
        boolean z;
        if (eg4.mo35319fe() > 0) {
            return true;
        }
        for (eg4 fe : eg4.mo35301Wi()) {
            if (fe.mo35319fe() > 0) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo42369k(@mr2 eg4 eg4) {
        return eg4.getName().startsWith(g60.f28962c);
    }

    /* renamed from: l */
    public final boolean mo42370l(@ts2 String str) {
        C7012v5 v5Var;
        String str2;
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            v5Var = f33461a;
            str2 = "counterId is empty";
        } else if (trim.length() <= 100) {
            return true;
        } else {
            v5Var = f33461a;
            str2 = "counterId exceeded max length 100";
        }
        v5Var.mo46010l(str2);
        return false;
    }

    /* renamed from: m */
    public final boolean mo42371m(@ts2 Long l) {
        return l != null;
    }

    /* renamed from: n */
    public final boolean mo42372n(@mr2 eg4 eg4) {
        Long l = eg4.mo35280Fb().get(g60.C5362a.FRAMES_TOTAL.toString());
        return l != null && l.compareTo(0L) > 0;
    }

    /* renamed from: o */
    public final boolean mo42373o(@ts2 eg4 eg4, int i) {
        if (eg4 == null) {
            f33461a.mo46010l("TraceMetric is null");
            return false;
        } else if (i > 1) {
            f33461a.mo46010l("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else if (!mo42375q(eg4.getName())) {
            C7012v5 v5Var = f33461a;
            v5Var.mo46010l("invalid TraceId:" + eg4.getName());
            return false;
        } else if (!mo42374p(eg4)) {
            C7012v5 v5Var2 = f33461a;
            v5Var2.mo46010l("invalid TraceDuration:" + eg4.mo35315ci());
            return false;
        } else if (!eg4.mo35317f2()) {
            f33461a.mo46010l("clientStartTimeUs is null.");
            return false;
        } else if (!mo42369k(eg4) || mo42372n(eg4)) {
            for (eg4 o : eg4.mo35301Wi()) {
                if (!mo42373o(o, i + 1)) {
                    return false;
                }
            }
            return mo42365g(eg4.mo35296S());
        } else {
            C7012v5 v5Var3 = f33461a;
            v5Var3.mo46010l("non-positive totalFrames in screen trace " + eg4.getName());
            return false;
        }
    }

    /* renamed from: p */
    public final boolean mo42374p(@ts2 eg4 eg4) {
        return eg4 != null && eg4.mo35315ci() > 0;
    }

    /* renamed from: q */
    public final boolean mo42375q(@ts2 String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        return !trim.isEmpty() && trim.length() <= 100;
    }
}
