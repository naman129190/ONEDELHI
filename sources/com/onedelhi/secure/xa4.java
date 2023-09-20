package com.onedelhi.secure;

import java.nio.CharBuffer;
import java.util.Locale;

public final class xa4 {

    /* renamed from: a */
    public static final int f22490a = 0;

    /* renamed from: a */
    public static final wa4 f22491a = new C3912e((C3910c) null, false);

    /* renamed from: b */
    public static final int f22492b = 1;

    /* renamed from: b */
    public static final wa4 f22493b = new C3912e((C3910c) null, true);

    /* renamed from: c */
    public static final int f22494c = 2;

    /* renamed from: c */
    public static final wa4 f22495c;

    /* renamed from: d */
    public static final wa4 f22496d;

    /* renamed from: e */
    public static final wa4 f22497e = new C3912e(C3908a.f22499a, false);

    /* renamed from: f */
    public static final wa4 f22498f = C3913f.f22504a;

    /* renamed from: com.onedelhi.secure.xa4$a */
    public static class C3908a implements C3910c {

        /* renamed from: a */
        public static final C3908a f22499a = new C3908a(true);

        /* renamed from: a */
        public final boolean f22500a;

        public C3908a(boolean z) {
            this.f22500a = z;
        }

        /* renamed from: a */
        public int mo26860a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = xa4.m31375a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.f22500a) {
                        return 1;
                    }
                } else if (this.f22500a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f22500a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: com.onedelhi.secure.xa4$b */
    public static class C3909b implements C3910c {

        /* renamed from: a */
        public static final C3909b f22501a = new C3909b();

        /* renamed from: a */
        public int mo26860a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = xa4.m31376b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: com.onedelhi.secure.xa4$c */
    public interface C3910c {
        /* renamed from: a */
        int mo26860a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: com.onedelhi.secure.xa4$d */
    public static abstract class C3911d implements wa4 {

        /* renamed from: a */
        public final C3910c f22502a;

        public C3911d(C3910c cVar) {
            this.f22502a = cVar;
        }

        /* renamed from: a */
        public boolean mo26476a(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                return this.f22502a == null ? mo26861c() : mo26862d(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: b */
        public boolean mo26477b(char[] cArr, int i, int i2) {
            return mo26476a(CharBuffer.wrap(cArr), i, i2);
        }

        /* renamed from: c */
        public abstract boolean mo26861c();

        /* renamed from: d */
        public final boolean mo26862d(CharSequence charSequence, int i, int i2) {
            int a = this.f22502a.mo26860a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo26861c();
            }
            return false;
        }
    }

    /* renamed from: com.onedelhi.secure.xa4$e */
    public static class C3912e extends C3911d {

        /* renamed from: a */
        public final boolean f22503a;

        public C3912e(C3910c cVar, boolean z) {
            super(cVar);
            this.f22503a = z;
        }

        /* renamed from: c */
        public boolean mo26861c() {
            return this.f22503a;
        }
    }

    /* renamed from: com.onedelhi.secure.xa4$f */
    public static class C3913f extends C3911d {

        /* renamed from: a */
        public static final C3913f f22504a = new C3913f();

        public C3913f() {
            super((C3910c) null);
        }

        /* renamed from: c */
        public boolean mo26861c() {
            return hb4.m16618b(Locale.getDefault()) == 1;
        }
    }

    static {
        C3909b bVar = C3909b.f22501a;
        f22495c = new C3912e(bVar, false);
        f22496d = new C3912e(bVar, true);
    }

    /* renamed from: a */
    public static int m31375a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    public static int m31376b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
