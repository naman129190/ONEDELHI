package com.onedelhi.secure;

import java.util.regex.Pattern;

public final class r74 {

    /* renamed from: a */
    public static final Pattern f19672a = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");

    /* renamed from: a */
    public final String f19673a;

    /* renamed from: a */
    public boolean f19674a = false;

    /* renamed from: a */
    public Object[] f19675a;

    /* renamed from: a */
    public String[] f19676a = null;

    /* renamed from: b */
    public String f19677b;

    /* renamed from: c */
    public String f19678c = null;

    /* renamed from: d */
    public String f19679d = null;

    /* renamed from: e */
    public String f19680e = null;

    /* renamed from: f */
    public String f19681f = null;

    public r74(String str) {
        this.f19673a = str;
    }

    /* renamed from: a */
    public static void m26474a(StringBuilder sb, String str, String str2) {
        if (!m26477i(str2)) {
            sb.append(str);
            sb.append(str2);
        }
    }

    /* renamed from: b */
    public static void m26475b(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(' ');
    }

    /* renamed from: c */
    public static r74 m26476c(String str) {
        return new r74(str);
    }

    /* renamed from: i */
    public static boolean m26477i(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: d */
    public r74 mo23697d(String[] strArr) {
        this.f19676a = strArr;
        return this;
    }

    /* renamed from: e */
    public q74 mo23698e() {
        if (!m26477i(this.f19678c) || m26477i(this.f19679d)) {
            StringBuilder sb = new StringBuilder(120);
            sb.append("SELECT ");
            if (this.f19674a) {
                sb.append("DISTINCT ");
            }
            String[] strArr = this.f19676a;
            if (strArr == null || strArr.length == 0) {
                sb.append(" * ");
            } else {
                m26475b(sb, strArr);
            }
            sb.append(" FROM ");
            sb.append(this.f19673a);
            m26474a(sb, " WHERE ", this.f19677b);
            m26474a(sb, " GROUP BY ", this.f19678c);
            m26474a(sb, " HAVING ", this.f19679d);
            m26474a(sb, " ORDER BY ", this.f19680e);
            m26474a(sb, " LIMIT ", this.f19681f);
            return new cz3(sb.toString(), this.f19675a);
        }
        throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
    }

    /* renamed from: f */
    public r74 mo23699f() {
        this.f19674a = true;
        return this;
    }

    /* renamed from: g */
    public r74 mo23700g(String str) {
        this.f19678c = str;
        return this;
    }

    /* renamed from: h */
    public r74 mo23701h(String str) {
        this.f19679d = str;
        return this;
    }

    /* renamed from: j */
    public r74 mo23702j(String str) {
        if (m26477i(str) || f19672a.matcher(str).matches()) {
            this.f19681f = str;
            return this;
        }
        throw new IllegalArgumentException("invalid LIMIT clauses:" + str);
    }

    /* renamed from: k */
    public r74 mo23703k(String str) {
        this.f19680e = str;
        return this;
    }

    /* renamed from: l */
    public r74 mo23704l(String str, Object[] objArr) {
        this.f19677b = str;
        this.f19675a = objArr;
        return this;
    }
}
