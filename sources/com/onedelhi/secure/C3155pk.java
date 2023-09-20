package com.onedelhi.secure;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: com.onedelhi.secure.pk */
public final class C3155pk {

    /* renamed from: a */
    public static final char f18570a = '‪';

    /* renamed from: a */
    public static final C3155pk f18571a;

    /* renamed from: a */
    public static final String f18572a = Character.toString(f18581d);

    /* renamed from: b */
    public static final char f18573b = '‫';

    /* renamed from: b */
    public static final int f18574b = 2;

    /* renamed from: b */
    public static final C3155pk f18575b;

    /* renamed from: b */
    public static final wa4 f18576b;

    /* renamed from: b */
    public static final String f18577b = Character.toString(f18583e);

    /* renamed from: c */
    public static final char f18578c = '‬';

    /* renamed from: c */
    public static final int f18579c = 2;

    /* renamed from: c */
    public static final String f18580c = "";

    /* renamed from: d */
    public static final char f18581d = '‎';

    /* renamed from: d */
    public static final int f18582d = -1;

    /* renamed from: e */
    public static final char f18583e = '‏';

    /* renamed from: e */
    public static final int f18584e = 0;

    /* renamed from: f */
    public static final int f18585f = 1;

    /* renamed from: a */
    public final int f18586a;

    /* renamed from: a */
    public final wa4 f18587a;

    /* renamed from: a */
    public final boolean f18588a;

    /* renamed from: com.onedelhi.secure.pk$a */
    public static final class C3156a {

        /* renamed from: a */
        public int f18589a;

        /* renamed from: a */
        public wa4 f18590a;

        /* renamed from: a */
        public boolean f18591a;

        public C3156a() {
            mo22484c(C3155pk.m24761j(Locale.getDefault()));
        }

        public C3156a(Locale locale) {
            mo22484c(C3155pk.m24761j(locale));
        }

        public C3156a(boolean z) {
            mo22484c(z);
        }

        /* renamed from: b */
        public static C3155pk m24776b(boolean z) {
            return z ? C3155pk.f18575b : C3155pk.f18571a;
        }

        /* renamed from: a */
        public C3155pk mo22483a() {
            return (this.f18589a == 2 && this.f18590a == C3155pk.f18576b) ? m24776b(this.f18591a) : new C3155pk(this.f18591a, this.f18589a, this.f18590a);
        }

        /* renamed from: c */
        public final void mo22484c(boolean z) {
            this.f18591a = z;
            this.f18590a = C3155pk.f18576b;
            this.f18589a = 2;
        }

        /* renamed from: d */
        public C3156a mo22485d(wa4 wa4) {
            this.f18590a = wa4;
            return this;
        }

        /* renamed from: e */
        public C3156a mo22486e(boolean z) {
            this.f18589a = z ? this.f18589a | 2 : this.f18589a & -3;
            return this;
        }
    }

    /* renamed from: com.onedelhi.secure.pk$b */
    public static class C3157b {

        /* renamed from: a */
        public static final byte[] f18592a = new byte[f18593c];

        /* renamed from: c */
        public static final int f18593c = 1792;

        /* renamed from: a */
        public char f18594a;

        /* renamed from: a */
        public final int f18595a;

        /* renamed from: a */
        public final CharSequence f18596a;

        /* renamed from: a */
        public final boolean f18597a;

        /* renamed from: b */
        public int f18598b;

        static {
            for (int i = 0; i < 1792; i++) {
                f18592a[i] = Character.getDirectionality(i);
            }
        }

        public C3157b(CharSequence charSequence, boolean z) {
            this.f18596a = charSequence;
            this.f18597a = z;
            this.f18595a = charSequence.length();
        }

        /* renamed from: c */
        public static byte m24781c(char c) {
            return c < 1792 ? f18592a[c] : Character.getDirectionality(c);
        }

        /* renamed from: a */
        public byte mo22487a() {
            char charAt = this.f18596a.charAt(this.f18598b - 1);
            this.f18594a = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f18596a, this.f18598b);
                this.f18598b -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f18598b--;
            byte c = m24781c(this.f18594a);
            if (!this.f18597a) {
                return c;
            }
            char c2 = this.f18594a;
            return c2 == '>' ? mo22493h() : c2 == ';' ? mo22491f() : c;
        }

        /* renamed from: b */
        public byte mo22488b() {
            char charAt = this.f18596a.charAt(this.f18598b);
            this.f18594a = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f18596a, this.f18598b);
                this.f18598b += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f18598b++;
            byte c = m24781c(this.f18594a);
            if (!this.f18597a) {
                return c;
            }
            char c2 = this.f18594a;
            return c2 == '<' ? mo22494i() : c2 == '&' ? mo22492g() : c;
        }

        /* renamed from: d */
        public int mo22489d() {
            this.f18598b = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f18598b < this.f18595a && i == 0) {
                byte b = mo22488b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f18598b > 0) {
                switch (mo22487a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r1 = r1 - 1;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo22490e() {
            /*
                r7 = this;
                int r0 = r7.f18595a
                r7.f18598b = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r7.f18598b
                if (r3 <= 0) goto L_0x003b
                byte r3 = r7.mo22487a()
                r4 = -1
                if (r3 == 0) goto L_0x0034
                r5 = 1
                if (r3 == r5) goto L_0x002e
                r6 = 2
                if (r3 == r6) goto L_0x002e
                r6 = 9
                if (r3 == r6) goto L_0x0007
                switch(r3) {
                    case 14: goto L_0x0028;
                    case 15: goto L_0x0028;
                    case 16: goto L_0x0025;
                    case 17: goto L_0x0025;
                    case 18: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0022:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x0025:
                if (r2 != r1) goto L_0x002b
                return r5
            L_0x0028:
                if (r2 != r1) goto L_0x002b
                return r4
            L_0x002b:
                int r1 = r1 + -1
                goto L_0x0007
            L_0x002e:
                if (r1 != 0) goto L_0x0031
                return r5
            L_0x0031:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0034:
                if (r1 != 0) goto L_0x0037
                return r4
            L_0x0037:
                if (r2 != 0) goto L_0x0007
            L_0x0039:
                r2 = r1
                goto L_0x0007
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3155pk.C3157b.mo22490e():int");
        }

        /* renamed from: f */
        public final byte mo22491f() {
            char charAt;
            int i = this.f18598b;
            do {
                int i2 = this.f18598b;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f18596a;
                int i3 = i2 - 1;
                this.f18598b = i3;
                charAt = charSequence.charAt(i3);
                this.f18594a = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f18598b = i;
            this.f18594a = ';';
            return v44.f21655a;
        }

        /* renamed from: g */
        public final byte mo22492g() {
            char charAt;
            do {
                int i = this.f18598b;
                if (i >= this.f18595a) {
                    return 12;
                }
                CharSequence charSequence = this.f18596a;
                this.f18598b = i + 1;
                charAt = charSequence.charAt(i);
                this.f18594a = charAt;
            } while (charAt != ';');
            return 12;
        }

        /* renamed from: h */
        public final byte mo22493h() {
            char charAt;
            int i = this.f18598b;
            while (true) {
                int i2 = this.f18598b;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f18596a;
                int i3 = i2 - 1;
                this.f18598b = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f18594a = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.f18598b;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f18596a;
                        int i5 = i4 - 1;
                        this.f18598b = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f18594a = charAt;
                    } while (charAt != charAt2);
                }
            }
            this.f18598b = i;
            this.f18594a = tk4.f35698e;
            return v44.f21655a;
        }

        /* renamed from: i */
        public final byte mo22494i() {
            char charAt;
            int i = this.f18598b;
            while (true) {
                int i2 = this.f18598b;
                if (i2 < this.f18595a) {
                    CharSequence charSequence = this.f18596a;
                    this.f18598b = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f18594a = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i3 = this.f18598b;
                            if (i3 >= this.f18595a) {
                                break;
                            }
                            CharSequence charSequence2 = this.f18596a;
                            this.f18598b = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f18594a = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f18598b = i;
                    this.f18594a = tk4.f35697d;
                    return v44.f21655a;
                }
            }
        }
    }

    static {
        wa4 wa4 = xa4.f22495c;
        f18576b = wa4;
        f18571a = new C3155pk(false, 2, wa4);
        f18575b = new C3155pk(true, 2, wa4);
    }

    public C3155pk(boolean z, int i, wa4 wa4) {
        this.f18588a = z;
        this.f18586a = i;
        this.f18587a = wa4;
    }

    /* renamed from: a */
    public static int m24756a(CharSequence charSequence) {
        return new C3157b(charSequence, false).mo22489d();
    }

    /* renamed from: b */
    public static int m24757b(CharSequence charSequence) {
        return new C3157b(charSequence, false).mo22490e();
    }

    /* renamed from: c */
    public static C3155pk m24758c() {
        return new C3156a().mo22483a();
    }

    /* renamed from: d */
    public static C3155pk m24759d(Locale locale) {
        return new C3156a(locale).mo22483a();
    }

    /* renamed from: e */
    public static C3155pk m24760e(boolean z) {
        return new C3156a(z).mo22483a();
    }

    /* renamed from: j */
    public static boolean m24761j(Locale locale) {
        return hb4.m16618b(locale) == 1;
    }

    /* renamed from: f */
    public boolean mo22469f() {
        return (this.f18586a & 2) != 0;
    }

    /* renamed from: g */
    public boolean mo22470g(CharSequence charSequence) {
        return this.f18587a.mo26476a(charSequence, 0, charSequence.length());
    }

    /* renamed from: h */
    public boolean mo22471h(String str) {
        return mo22470g(str);
    }

    /* renamed from: i */
    public boolean mo22472i() {
        return this.f18588a;
    }

    /* renamed from: k */
    public final String mo22473k(CharSequence charSequence, wa4 wa4) {
        boolean a = wa4.mo26476a(charSequence, 0, charSequence.length());
        return (this.f18588a || (!a && m24757b(charSequence) != 1)) ? this.f18588a ? (!a || m24757b(charSequence) == -1) ? f18577b : "" : "" : f18572a;
    }

    /* renamed from: l */
    public final String mo22474l(CharSequence charSequence, wa4 wa4) {
        boolean a = wa4.mo26476a(charSequence, 0, charSequence.length());
        return (this.f18588a || (!a && m24756a(charSequence) != 1)) ? this.f18588a ? (!a || m24756a(charSequence) == -1) ? f18577b : "" : "" : f18572a;
    }

    /* renamed from: m */
    public CharSequence mo22475m(CharSequence charSequence) {
        return mo22477o(charSequence, this.f18587a, true);
    }

    /* renamed from: n */
    public CharSequence mo22476n(CharSequence charSequence, wa4 wa4) {
        return mo22477o(charSequence, wa4, true);
    }

    /* renamed from: o */
    public CharSequence mo22477o(CharSequence charSequence, wa4 wa4, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a = wa4.mo26476a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (mo22469f() && z) {
            spannableStringBuilder.append(mo22474l(charSequence, a ? xa4.f22493b : xa4.f22491a));
        }
        if (a != this.f18588a) {
            spannableStringBuilder.append(a ? f18573b : f18570a);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(f18578c);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append(mo22473k(charSequence, a ? xa4.f22493b : xa4.f22491a));
        }
        return spannableStringBuilder;
    }

    /* renamed from: p */
    public CharSequence mo22478p(CharSequence charSequence, boolean z) {
        return mo22477o(charSequence, this.f18587a, z);
    }

    /* renamed from: q */
    public String mo22479q(String str) {
        return mo22481s(str, this.f18587a, true);
    }

    /* renamed from: r */
    public String mo22480r(String str, wa4 wa4) {
        return mo22481s(str, wa4, true);
    }

    /* renamed from: s */
    public String mo22481s(String str, wa4 wa4, boolean z) {
        if (str == null) {
            return null;
        }
        return mo22477o(str, wa4, z).toString();
    }

    /* renamed from: t */
    public String mo22482t(String str, boolean z) {
        return mo22481s(str, this.f18587a, z);
    }
}
