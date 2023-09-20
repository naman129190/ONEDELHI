package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import java.util.Locale;

@hl3({hl3.C2354a.LIBRARY_GROUP})
/* renamed from: com.onedelhi.secure.ti */
public final class C3632ti {

    /* renamed from: a */
    public static final int f20852a = 4;

    /* renamed from: a */
    public static final String f20853a = "badge";

    /* renamed from: a */
    public final float f20854a;

    /* renamed from: a */
    public final C3633a f20855a;

    /* renamed from: b */
    public final float f20856b;

    /* renamed from: b */
    public final C3633a f20857b;

    /* renamed from: c */
    public final float f20858c;

    /* renamed from: com.onedelhi.secure.ti$a */
    public static final class C3633a implements Parcelable {
        public static final Parcelable.Creator<C3633a> CREATOR = new C3634a();

        /* renamed from: t */
        public static final int f20859t = -1;

        /* renamed from: u */
        public static final int f20860u = -2;

        /* renamed from: a */
        public Boolean f20861a = Boolean.TRUE;
        @ts2

        /* renamed from: a */
        public CharSequence f20862a;
        @d10

        /* renamed from: a */
        public Integer f20863a;

        /* renamed from: a */
        public Locale f20864a;
        @d10

        /* renamed from: b */
        public Integer f20865b;

        /* renamed from: c */
        public Integer f20866c;
        @zk0(unit = 1)

        /* renamed from: d */
        public Integer f20867d;
        @zk0(unit = 1)

        /* renamed from: e */
        public Integer f20868e;
        @zk0(unit = 1)

        /* renamed from: f */
        public Integer f20869f;
        @zk0(unit = 1)

        /* renamed from: g */
        public Integer f20870g;
        @zk0(unit = 1)

        /* renamed from: h */
        public Integer f20871h;
        @zk0(unit = 1)

        /* renamed from: i */
        public Integer f20872i;
        @ez4

        /* renamed from: n */
        public int f20873n;

        /* renamed from: o */
        public int f20874o = 255;

        /* renamed from: p */
        public int f20875p = -2;

        /* renamed from: q */
        public int f20876q = -2;
        @t23

        /* renamed from: r */
        public int f20877r;
        @e54

        /* renamed from: s */
        public int f20878s;

        /* renamed from: com.onedelhi.secure.ti$a$a */
        public class C3634a implements Parcelable.Creator<C3633a> {
            @mr2
            /* renamed from: a */
            public C3633a createFromParcel(@mr2 Parcel parcel) {
                return new C3633a(parcel);
            }

            @mr2
            /* renamed from: b */
            public C3633a[] newArray(int i) {
                return new C3633a[i];
            }
        }

        public C3633a() {
        }

        public C3633a(@mr2 Parcel parcel) {
            this.f20873n = parcel.readInt();
            this.f20863a = (Integer) parcel.readSerializable();
            this.f20865b = (Integer) parcel.readSerializable();
            this.f20874o = parcel.readInt();
            this.f20875p = parcel.readInt();
            this.f20876q = parcel.readInt();
            this.f20862a = parcel.readString();
            this.f20877r = parcel.readInt();
            this.f20866c = (Integer) parcel.readSerializable();
            this.f20867d = (Integer) parcel.readSerializable();
            this.f20868e = (Integer) parcel.readSerializable();
            this.f20869f = (Integer) parcel.readSerializable();
            this.f20870g = (Integer) parcel.readSerializable();
            this.f20871h = (Integer) parcel.readSerializable();
            this.f20872i = (Integer) parcel.readSerializable();
            this.f20861a = (Boolean) parcel.readSerializable();
            this.f20864a = (Locale) parcel.readSerializable();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@mr2 Parcel parcel, int i) {
            parcel.writeInt(this.f20873n);
            parcel.writeSerializable(this.f20863a);
            parcel.writeSerializable(this.f20865b);
            parcel.writeInt(this.f20874o);
            parcel.writeInt(this.f20875p);
            parcel.writeInt(this.f20876q);
            CharSequence charSequence = this.f20862a;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.f20877r);
            parcel.writeSerializable(this.f20866c);
            parcel.writeSerializable(this.f20867d);
            parcel.writeSerializable(this.f20868e);
            parcel.writeSerializable(this.f20869f);
            parcel.writeSerializable(this.f20870g);
            parcel.writeSerializable(this.f20871h);
            parcel.writeSerializable(this.f20872i);
            parcel.writeSerializable(this.f20861a);
            parcel.writeSerializable(this.f20864a);
        }
    }

    public C3632ti(Context context, @ez4 int i, @C3982yb int i2, @e64 int i3, @ts2 C3633a aVar) {
        int i4;
        Integer valueOf;
        C3633a aVar2 = new C3633a();
        this.f20857b = aVar2;
        aVar = aVar == null ? new C3633a() : aVar;
        if (i != 0) {
            int unused = aVar.f20873n = i;
        }
        TypedArray b = mo25043b(context, aVar.f20873n, i2, i3);
        Resources resources = context.getResources();
        this.f20854a = (float) b.getDimensionPixelSize(fd3.C2165o.Badge_badgeRadius, resources.getDimensionPixelSize(fd3.C2156f.mtrl_badge_radius));
        this.f20858c = (float) b.getDimensionPixelSize(fd3.C2165o.Badge_badgeWidePadding, resources.getDimensionPixelSize(fd3.C2156f.mtrl_badge_long_text_horizontal_padding));
        this.f20856b = (float) b.getDimensionPixelSize(fd3.C2165o.Badge_badgeWithTextRadius, resources.getDimensionPixelSize(fd3.C2156f.mtrl_badge_with_text_radius));
        int unused2 = aVar2.f20874o = aVar.f20874o == -2 ? 255 : aVar.f20874o;
        CharSequence unused3 = aVar2.f20862a = aVar.f20862a == null ? context.getString(fd3.C2163m.mtrl_badge_numberless_content_description) : aVar.f20862a;
        int unused4 = aVar2.f20877r = aVar.f20877r == 0 ? fd3.C2162l.mtrl_badge_content_description : aVar.f20877r;
        int unused5 = aVar2.f20878s = aVar.f20878s == 0 ? fd3.C2163m.mtrl_exceed_max_badge_number_content_description : aVar.f20878s;
        int i5 = 0;
        Boolean unused6 = aVar2.f20861a = Boolean.valueOf(aVar.f20861a == null || aVar.f20861a.booleanValue());
        int unused7 = aVar2.f20876q = aVar.f20876q == -2 ? b.getInt(fd3.C2165o.Badge_maxCharacterCount, 4) : aVar.f20876q;
        if (aVar.f20875p != -2) {
            i4 = aVar.f20875p;
        } else {
            int i6 = fd3.C2165o.Badge_number;
            i4 = b.hasValue(i6) ? b.getInt(i6, 0) : -1;
        }
        int unused8 = aVar2.f20875p = i4;
        Integer unused9 = aVar2.f20863a = Integer.valueOf(aVar.f20863a == null ? m28535v(context, b, fd3.C2165o.Badge_backgroundColor) : aVar.f20863a.intValue());
        if (aVar.f20865b != null) {
            valueOf = aVar.f20865b;
        } else {
            int i7 = fd3.C2165o.Badge_badgeTextColor;
            valueOf = Integer.valueOf(b.hasValue(i7) ? m28535v(context, b, i7) : new sa4(context, fd3.C2164n.TextAppearance_MaterialComponents_Badge).mo44261i().getDefaultColor());
        }
        Integer unused10 = aVar2.f20865b = valueOf;
        Integer unused11 = aVar2.f20866c = Integer.valueOf(aVar.f20866c == null ? b.getInt(fd3.C2165o.Badge_badgeGravity, 8388661) : aVar.f20866c.intValue());
        Integer unused12 = aVar2.f20867d = Integer.valueOf(aVar.f20867d == null ? b.getDimensionPixelOffset(fd3.C2165o.Badge_horizontalOffset, 0) : aVar.f20867d.intValue());
        Integer unused13 = aVar2.f20868e = Integer.valueOf(aVar.f20868e == null ? b.getDimensionPixelOffset(fd3.C2165o.Badge_verticalOffset, 0) : aVar.f20868e.intValue());
        Integer unused14 = aVar2.f20869f = Integer.valueOf(aVar.f20869f == null ? b.getDimensionPixelOffset(fd3.C2165o.Badge_horizontalOffsetWithText, aVar2.f20867d.intValue()) : aVar.f20869f.intValue());
        Integer unused15 = aVar2.f20870g = Integer.valueOf(aVar.f20870g == null ? b.getDimensionPixelOffset(fd3.C2165o.Badge_verticalOffsetWithText, aVar2.f20868e.intValue()) : aVar.f20870g.intValue());
        Integer unused16 = aVar2.f20871h = Integer.valueOf(aVar.f20871h == null ? 0 : aVar.f20871h.intValue());
        Integer unused17 = aVar2.f20872i = Integer.valueOf(aVar.f20872i != null ? aVar.f20872i.intValue() : i5);
        b.recycle();
        Locale unused18 = aVar2.f20864a = aVar.f20864a == null ? Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault() : aVar.f20864a;
        this.f20855a = aVar;
    }

    /* renamed from: v */
    public static int m28535v(Context context, @mr2 TypedArray typedArray, @g64 int i) {
        return af2.m38610a(context, typedArray, i).getDefaultColor();
    }

    /* renamed from: A */
    public void mo25029A(int i) {
        Integer unused = this.f20855a.f20866c = Integer.valueOf(i);
        Integer unused2 = this.f20857b.f20866c = Integer.valueOf(i);
    }

    /* renamed from: B */
    public void mo25030B(@d10 int i) {
        Integer unused = this.f20855a.f20865b = Integer.valueOf(i);
        Integer unused2 = this.f20857b.f20865b = Integer.valueOf(i);
    }

    /* renamed from: C */
    public void mo25031C(@e54 int i) {
        int unused = this.f20855a.f20878s = i;
        int unused2 = this.f20857b.f20878s = i;
    }

    /* renamed from: D */
    public void mo25032D(CharSequence charSequence) {
        CharSequence unused = this.f20855a.f20862a = charSequence;
        CharSequence unused2 = this.f20857b.f20862a = charSequence;
    }

    /* renamed from: E */
    public void mo25033E(@t23 int i) {
        int unused = this.f20855a.f20877r = i;
        int unused2 = this.f20857b.f20877r = i;
    }

    /* renamed from: F */
    public void mo25034F(@zk0(unit = 1) int i) {
        Integer unused = this.f20855a.f20869f = Integer.valueOf(i);
        Integer unused2 = this.f20857b.f20869f = Integer.valueOf(i);
    }

    /* renamed from: G */
    public void mo25035G(@zk0(unit = 1) int i) {
        Integer unused = this.f20855a.f20867d = Integer.valueOf(i);
        Integer unused2 = this.f20857b.f20867d = Integer.valueOf(i);
    }

    /* renamed from: H */
    public void mo25036H(int i) {
        int unused = this.f20855a.f20876q = i;
        int unused2 = this.f20857b.f20876q = i;
    }

    /* renamed from: I */
    public void mo25037I(int i) {
        int unused = this.f20855a.f20875p = i;
        int unused2 = this.f20857b.f20875p = i;
    }

    /* renamed from: J */
    public void mo25038J(Locale locale) {
        Locale unused = this.f20855a.f20864a = locale;
        Locale unused2 = this.f20857b.f20864a = locale;
    }

    /* renamed from: K */
    public void mo25039K(@zk0(unit = 1) int i) {
        Integer unused = this.f20855a.f20870g = Integer.valueOf(i);
        Integer unused2 = this.f20857b.f20870g = Integer.valueOf(i);
    }

    /* renamed from: L */
    public void mo25040L(@zk0(unit = 1) int i) {
        Integer unused = this.f20855a.f20868e = Integer.valueOf(i);
        Integer unused2 = this.f20857b.f20868e = Integer.valueOf(i);
    }

    /* renamed from: M */
    public void mo25041M(boolean z) {
        Boolean unused = this.f20855a.f20861a = Boolean.valueOf(z);
        Boolean unused2 = this.f20857b.f20861a = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public void mo25042a() {
        mo25037I(-1);
    }

    /* renamed from: b */
    public final TypedArray mo25043b(Context context, @ez4 int i, @C3982yb int i2, @e64 int i3) {
        AttributeSet attributeSet;
        int i4;
        if (i != 0) {
            AttributeSet g = kp0.m19972g(context, i, f20853a);
            i4 = g.getStyleAttribute();
            attributeSet = g;
        } else {
            attributeSet = null;
            i4 = 0;
        }
        return ob4.m59195k(context, attributeSet, fd3.C2165o.Badge, i2, i4 == 0 ? i3 : i4, new int[0]);
    }

    @zk0(unit = 1)
    /* renamed from: c */
    public int mo25044c() {
        return this.f20857b.f20871h.intValue();
    }

    @zk0(unit = 1)
    /* renamed from: d */
    public int mo25045d() {
        return this.f20857b.f20872i.intValue();
    }

    /* renamed from: e */
    public int mo25046e() {
        return this.f20857b.f20874o;
    }

    @d10
    /* renamed from: f */
    public int mo25047f() {
        return this.f20857b.f20863a.intValue();
    }

    /* renamed from: g */
    public int mo25048g() {
        return this.f20857b.f20866c.intValue();
    }

    @d10
    /* renamed from: h */
    public int mo25049h() {
        return this.f20857b.f20865b.intValue();
    }

    @e54
    /* renamed from: i */
    public int mo25050i() {
        return this.f20857b.f20878s;
    }

    /* renamed from: j */
    public CharSequence mo25051j() {
        return this.f20857b.f20862a;
    }

    @t23
    /* renamed from: k */
    public int mo25052k() {
        return this.f20857b.f20877r;
    }

    @zk0(unit = 1)
    /* renamed from: l */
    public int mo25053l() {
        return this.f20857b.f20869f.intValue();
    }

    @zk0(unit = 1)
    /* renamed from: m */
    public int mo25054m() {
        return this.f20857b.f20867d.intValue();
    }

    /* renamed from: n */
    public int mo25055n() {
        return this.f20857b.f20876q;
    }

    /* renamed from: o */
    public int mo25056o() {
        return this.f20857b.f20875p;
    }

    /* renamed from: p */
    public Locale mo25057p() {
        return this.f20857b.f20864a;
    }

    /* renamed from: q */
    public C3633a mo25058q() {
        return this.f20855a;
    }

    @zk0(unit = 1)
    /* renamed from: r */
    public int mo25059r() {
        return this.f20857b.f20870g.intValue();
    }

    @zk0(unit = 1)
    /* renamed from: s */
    public int mo25060s() {
        return this.f20857b.f20868e.intValue();
    }

    /* renamed from: t */
    public boolean mo25061t() {
        return this.f20857b.f20875p != -1;
    }

    /* renamed from: u */
    public boolean mo25062u() {
        return this.f20857b.f20861a.booleanValue();
    }

    /* renamed from: w */
    public void mo25063w(@zk0(unit = 1) int i) {
        Integer unused = this.f20855a.f20871h = Integer.valueOf(i);
        Integer unused2 = this.f20857b.f20871h = Integer.valueOf(i);
    }

    /* renamed from: x */
    public void mo25064x(@zk0(unit = 1) int i) {
        Integer unused = this.f20855a.f20872i = Integer.valueOf(i);
        Integer unused2 = this.f20857b.f20872i = Integer.valueOf(i);
    }

    /* renamed from: y */
    public void mo25065y(int i) {
        int unused = this.f20855a.f20874o = i;
        int unused2 = this.f20857b.f20874o = i;
    }

    /* renamed from: z */
    public void mo25066z(@d10 int i) {
        Integer unused = this.f20855a.f20863a = Integer.valueOf(i);
        Integer unused2 = this.f20857b.f20863a = Integer.valueOf(i);
    }
}
