package com.onedelhi.secure;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;

public class uw3 {

    /* renamed from: e */
    public static final z80 f36304e = new ph3(0.5f);

    /* renamed from: a */
    public a90 f36305a;

    /* renamed from: a */
    public bs0 f36306a;

    /* renamed from: a */
    public z80 f36307a;

    /* renamed from: b */
    public a90 f36308b;

    /* renamed from: b */
    public bs0 f36309b;

    /* renamed from: b */
    public z80 f36310b;

    /* renamed from: c */
    public a90 f36311c;

    /* renamed from: c */
    public bs0 f36312c;

    /* renamed from: c */
    public z80 f36313c;

    /* renamed from: d */
    public a90 f36314d;

    /* renamed from: d */
    public bs0 f36315d;

    /* renamed from: d */
    public z80 f36316d;

    /* renamed from: com.onedelhi.secure.uw3$b */
    public static final class C6982b {
        @mr2

        /* renamed from: a */
        public a90 f36317a = cf2.m40861b();
        @mr2

        /* renamed from: a */
        public bs0 f36318a = cf2.m40862c();
        @mr2

        /* renamed from: a */
        public z80 f36319a = new C5459h0(0.0f);
        @mr2

        /* renamed from: b */
        public a90 f36320b = cf2.m40861b();
        @mr2

        /* renamed from: b */
        public bs0 f36321b = cf2.m40862c();
        @mr2

        /* renamed from: b */
        public z80 f36322b = new C5459h0(0.0f);
        @mr2

        /* renamed from: c */
        public a90 f36323c = cf2.m40861b();
        @mr2

        /* renamed from: c */
        public bs0 f36324c = cf2.m40862c();
        @mr2

        /* renamed from: c */
        public z80 f36325c = new C5459h0(0.0f);
        @mr2

        /* renamed from: d */
        public a90 f36326d = cf2.m40861b();
        @mr2

        /* renamed from: d */
        public bs0 f36327d = cf2.m40862c();
        @mr2

        /* renamed from: d */
        public z80 f36328d = new C5459h0(0.0f);

        public C6982b() {
        }

        public C6982b(@mr2 uw3 uw3) {
            this.f36317a = uw3.f36305a;
            this.f36320b = uw3.f36308b;
            this.f36323c = uw3.f36311c;
            this.f36326d = uw3.f36314d;
            this.f36319a = uw3.f36307a;
            this.f36322b = uw3.f36310b;
            this.f36325c = uw3.f36313c;
            this.f36328d = uw3.f36316d;
            this.f36318a = uw3.f36306a;
            this.f36321b = uw3.f36309b;
            this.f36324c = uw3.f36312c;
            this.f36327d = uw3.f36315d;
        }

        /* renamed from: n */
        public static float m67480n(a90 a90) {
            if (a90 instanceof nn3) {
                return ((nn3) a90).f32648a;
            }
            if (a90 instanceof sc0) {
                return ((sc0) a90).f34970a;
            }
            return -1.0f;
        }

        @mr2
        /* renamed from: A */
        public C6982b mo45828A(int i, @mr2 z80 z80) {
            return mo45829B(cf2.m40860a(i)).mo45831D(z80);
        }

        @mr2
        /* renamed from: B */
        public C6982b mo45829B(@mr2 a90 a90) {
            this.f36323c = a90;
            float n = m67480n(a90);
            if (n != -1.0f) {
                mo45830C(n);
            }
            return this;
        }

        @mr2
        /* renamed from: C */
        public C6982b mo45830C(@zk0 float f) {
            this.f36325c = new C5459h0(f);
            return this;
        }

        @mr2
        /* renamed from: D */
        public C6982b mo45831D(@mr2 z80 z80) {
            this.f36325c = z80;
            return this;
        }

        @mr2
        /* renamed from: E */
        public C6982b mo45832E(@mr2 bs0 bs0) {
            this.f36327d = bs0;
            return this;
        }

        @mr2
        /* renamed from: F */
        public C6982b mo45833F(@mr2 bs0 bs0) {
            this.f36321b = bs0;
            return this;
        }

        @mr2
        /* renamed from: G */
        public C6982b mo45834G(@mr2 bs0 bs0) {
            this.f36318a = bs0;
            return this;
        }

        @mr2
        /* renamed from: H */
        public C6982b mo45835H(int i, @zk0 float f) {
            return mo45837J(cf2.m40860a(i)).mo45838K(f);
        }

        @mr2
        /* renamed from: I */
        public C6982b mo45836I(int i, @mr2 z80 z80) {
            return mo45837J(cf2.m40860a(i)).mo45839L(z80);
        }

        @mr2
        /* renamed from: J */
        public C6982b mo45837J(@mr2 a90 a90) {
            this.f36317a = a90;
            float n = m67480n(a90);
            if (n != -1.0f) {
                mo45838K(n);
            }
            return this;
        }

        @mr2
        /* renamed from: K */
        public C6982b mo45838K(@zk0 float f) {
            this.f36319a = new C5459h0(f);
            return this;
        }

        @mr2
        /* renamed from: L */
        public C6982b mo45839L(@mr2 z80 z80) {
            this.f36319a = z80;
            return this;
        }

        @mr2
        /* renamed from: M */
        public C6982b mo45840M(int i, @zk0 float f) {
            return mo45842O(cf2.m40860a(i)).mo45843P(f);
        }

        @mr2
        /* renamed from: N */
        public C6982b mo45841N(int i, @mr2 z80 z80) {
            return mo45842O(cf2.m40860a(i)).mo45844Q(z80);
        }

        @mr2
        /* renamed from: O */
        public C6982b mo45842O(@mr2 a90 a90) {
            this.f36320b = a90;
            float n = m67480n(a90);
            if (n != -1.0f) {
                mo45843P(n);
            }
            return this;
        }

        @mr2
        /* renamed from: P */
        public C6982b mo45843P(@zk0 float f) {
            this.f36322b = new C5459h0(f);
            return this;
        }

        @mr2
        /* renamed from: Q */
        public C6982b mo45844Q(@mr2 z80 z80) {
            this.f36322b = z80;
            return this;
        }

        @mr2
        /* renamed from: m */
        public uw3 mo45845m() {
            return new uw3(this);
        }

        @mr2
        /* renamed from: o */
        public C6982b mo45846o(@zk0 float f) {
            return mo45838K(f).mo45843P(f).mo45830C(f).mo45855x(f);
        }

        @mr2
        /* renamed from: p */
        public C6982b mo45847p(@mr2 z80 z80) {
            return mo45839L(z80).mo45844Q(z80).mo45831D(z80).mo45856y(z80);
        }

        @mr2
        /* renamed from: q */
        public C6982b mo45848q(int i, @zk0 float f) {
            return mo45849r(cf2.m40860a(i)).mo45846o(f);
        }

        @mr2
        /* renamed from: r */
        public C6982b mo45849r(@mr2 a90 a90) {
            return mo45837J(a90).mo45842O(a90).mo45829B(a90).mo45854w(a90);
        }

        @mr2
        /* renamed from: s */
        public C6982b mo45850s(@mr2 bs0 bs0) {
            return mo45832E(bs0).mo45834G(bs0).mo45833F(bs0).mo45851t(bs0);
        }

        @mr2
        /* renamed from: t */
        public C6982b mo45851t(@mr2 bs0 bs0) {
            this.f36324c = bs0;
            return this;
        }

        @mr2
        /* renamed from: u */
        public C6982b mo45852u(int i, @zk0 float f) {
            return mo45854w(cf2.m40860a(i)).mo45855x(f);
        }

        @mr2
        /* renamed from: v */
        public C6982b mo45853v(int i, @mr2 z80 z80) {
            return mo45854w(cf2.m40860a(i)).mo45856y(z80);
        }

        @mr2
        /* renamed from: w */
        public C6982b mo45854w(@mr2 a90 a90) {
            this.f36326d = a90;
            float n = m67480n(a90);
            if (n != -1.0f) {
                mo45855x(n);
            }
            return this;
        }

        @mr2
        /* renamed from: x */
        public C6982b mo45855x(@zk0 float f) {
            this.f36328d = new C5459h0(f);
            return this;
        }

        @mr2
        /* renamed from: y */
        public C6982b mo45856y(@mr2 z80 z80) {
            this.f36328d = z80;
            return this;
        }

        @mr2
        /* renamed from: z */
        public C6982b mo45857z(int i, @zk0 float f) {
            return mo45829B(cf2.m40860a(i)).mo45830C(f);
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: com.onedelhi.secure.uw3$c */
    public interface C6983c {
        @mr2
        /* renamed from: a */
        z80 mo31652a(@mr2 z80 z80);
    }

    public uw3() {
        this.f36305a = cf2.m40861b();
        this.f36308b = cf2.m40861b();
        this.f36311c = cf2.m40861b();
        this.f36314d = cf2.m40861b();
        this.f36307a = new C5459h0(0.0f);
        this.f36310b = new C5459h0(0.0f);
        this.f36313c = new C5459h0(0.0f);
        this.f36316d = new C5459h0(0.0f);
        this.f36306a = cf2.m40862c();
        this.f36309b = cf2.m40862c();
        this.f36312c = cf2.m40862c();
        this.f36315d = cf2.m40862c();
    }

    public uw3(@mr2 C6982b bVar) {
        this.f36305a = bVar.f36317a;
        this.f36308b = bVar.f36320b;
        this.f36311c = bVar.f36323c;
        this.f36314d = bVar.f36326d;
        this.f36307a = bVar.f36319a;
        this.f36310b = bVar.f36322b;
        this.f36313c = bVar.f36325c;
        this.f36316d = bVar.f36328d;
        this.f36306a = bVar.f36318a;
        this.f36309b = bVar.f36321b;
        this.f36312c = bVar.f36324c;
        this.f36315d = bVar.f36327d;
    }

    @mr2
    /* renamed from: a */
    public static C6982b m67443a() {
        return new C6982b();
    }

    @mr2
    /* renamed from: b */
    public static C6982b m67444b(Context context, @e64 int i, @e64 int i2) {
        return m67445c(context, i, i2, 0);
    }

    @mr2
    /* renamed from: c */
    public static C6982b m67445c(Context context, @e64 int i, @e64 int i2, int i3) {
        return m67446d(context, i, i2, new C5459h0((float) i3));
    }

    @mr2
    /* renamed from: d */
    public static C6982b m67446d(Context context, @e64 int i, @e64 int i2, @mr2 z80 z80) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(fd3.C2165o.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(fd3.C2165o.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(fd3.C2165o.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(fd3.C2165o.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(fd3.C2165o.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(fd3.C2165o.ShapeAppearance_cornerFamilyBottomLeft, i3);
            z80 m = m67450m(obtainStyledAttributes, fd3.C2165o.ShapeAppearance_cornerSize, z80);
            z80 m2 = m67450m(obtainStyledAttributes, fd3.C2165o.ShapeAppearance_cornerSizeTopLeft, m);
            z80 m3 = m67450m(obtainStyledAttributes, fd3.C2165o.ShapeAppearance_cornerSizeTopRight, m);
            z80 m4 = m67450m(obtainStyledAttributes, fd3.C2165o.ShapeAppearance_cornerSizeBottomRight, m);
            return new C6982b().mo45836I(i4, m2).mo45841N(i5, m3).mo45828A(i6, m4).mo45853v(i7, m67450m(obtainStyledAttributes, fd3.C2165o.ShapeAppearance_cornerSizeBottomLeft, m));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @mr2
    /* renamed from: e */
    public static C6982b m67447e(@mr2 Context context, AttributeSet attributeSet, @C3982yb int i, @e64 int i2) {
        return m67448f(context, attributeSet, i, i2, 0);
    }

    @mr2
    /* renamed from: f */
    public static C6982b m67448f(@mr2 Context context, AttributeSet attributeSet, @C3982yb int i, @e64 int i2, int i3) {
        return m67449g(context, attributeSet, i, i2, new C5459h0((float) i3));
    }

    @mr2
    /* renamed from: g */
    public static C6982b m67449g(@mr2 Context context, AttributeSet attributeSet, @C3982yb int i, @e64 int i2, @mr2 z80 z80) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fd3.C2165o.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(fd3.C2165o.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(fd3.C2165o.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return m67446d(context, resourceId, resourceId2, z80);
    }

    @mr2
    /* renamed from: m */
    public static z80 m67450m(TypedArray typedArray, int i, @mr2 z80 z80) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return z80;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new C5459h0((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new ph3(peekValue.getFraction(1.0f, 1.0f)) : z80;
    }

    @mr2
    /* renamed from: h */
    public bs0 mo45811h() {
        return this.f36312c;
    }

    @mr2
    /* renamed from: i */
    public a90 mo45812i() {
        return this.f36314d;
    }

    @mr2
    /* renamed from: j */
    public z80 mo45813j() {
        return this.f36316d;
    }

    @mr2
    /* renamed from: k */
    public a90 mo45814k() {
        return this.f36311c;
    }

    @mr2
    /* renamed from: l */
    public z80 mo45815l() {
        return this.f36313c;
    }

    @mr2
    /* renamed from: n */
    public bs0 mo45816n() {
        return this.f36315d;
    }

    @mr2
    /* renamed from: o */
    public bs0 mo45817o() {
        return this.f36309b;
    }

    @mr2
    /* renamed from: p */
    public bs0 mo45818p() {
        return this.f36306a;
    }

    @mr2
    /* renamed from: q */
    public a90 mo45819q() {
        return this.f36305a;
    }

    @mr2
    /* renamed from: r */
    public z80 mo45820r() {
        return this.f36307a;
    }

    @mr2
    /* renamed from: s */
    public a90 mo45821s() {
        return this.f36308b;
    }

    @mr2
    /* renamed from: t */
    public z80 mo45822t() {
        return this.f36310b;
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: u */
    public boolean mo45823u(@mr2 RectF rectF) {
        Class<bs0> cls = bs0.class;
        boolean z = this.f36315d.getClass().equals(cls) && this.f36309b.getClass().equals(cls) && this.f36306a.getClass().equals(cls) && this.f36312c.getClass().equals(cls);
        float a = this.f36307a.mo32234a(rectF);
        return z && ((this.f36310b.mo32234a(rectF) > a ? 1 : (this.f36310b.mo32234a(rectF) == a ? 0 : -1)) == 0 && (this.f36316d.mo32234a(rectF) > a ? 1 : (this.f36316d.mo32234a(rectF) == a ? 0 : -1)) == 0 && (this.f36313c.mo32234a(rectF) > a ? 1 : (this.f36313c.mo32234a(rectF) == a ? 0 : -1)) == 0) && ((this.f36308b instanceof nn3) && (this.f36305a instanceof nn3) && (this.f36311c instanceof nn3) && (this.f36314d instanceof nn3));
    }

    @mr2
    /* renamed from: v */
    public C6982b mo45824v() {
        return new C6982b(this);
    }

    @mr2
    /* renamed from: w */
    public uw3 mo45825w(float f) {
        return mo45824v().mo45846o(f).mo45845m();
    }

    @mr2
    /* renamed from: x */
    public uw3 mo45826x(@mr2 z80 z80) {
        return mo45824v().mo45847p(z80).mo45845m();
    }

    @mr2
    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: y */
    public uw3 mo45827y(@mr2 C6983c cVar) {
        return mo45824v().mo45839L(cVar.mo31652a(mo45820r())).mo45844Q(cVar.mo31652a(mo45822t())).mo45856y(cVar.mo31652a(mo45813j())).mo45831D(cVar.mo31652a(mo45815l())).mo45845m();
    }
}
