package com.onedelhi.secure;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.zk3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class sa4 {

    /* renamed from: b */
    public static final String f34943b = "TextAppearance";

    /* renamed from: d */
    public static final int f34944d = 1;

    /* renamed from: e */
    public static final int f34945e = 2;

    /* renamed from: f */
    public static final int f34946f = 3;

    /* renamed from: a */
    public final float f34947a;

    /* renamed from: a */
    public final int f34948a;
    @ts2

    /* renamed from: a */
    public final ColorStateList f34949a;

    /* renamed from: a */
    public Typeface f34950a;
    @ts2

    /* renamed from: a */
    public final String f34951a;

    /* renamed from: a */
    public final boolean f34952a;

    /* renamed from: b */
    public final float f34953b;

    /* renamed from: b */
    public final int f34954b;
    @ts2

    /* renamed from: b */
    public final ColorStateList f34955b;

    /* renamed from: b */
    public final boolean f34956b;

    /* renamed from: c */
    public final float f34957c;
    @y91

    /* renamed from: c */
    public final int f34958c;
    @ts2

    /* renamed from: c */
    public final ColorStateList f34959c;

    /* renamed from: c */
    public boolean f34960c = false;

    /* renamed from: d */
    public final float f34961d;
    @ts2

    /* renamed from: d */
    public ColorStateList f34962d;

    /* renamed from: e */
    public float f34963e;

    /* renamed from: com.onedelhi.secure.sa4$a */
    public class C6752a extends zk3.C4109g {

        /* renamed from: a */
        public final /* synthetic */ ua4 f34965a;

        public C6752a(ua4 ua4) {
            this.f34965a = ua4;
        }

        /* renamed from: h */
        public void mo24770h(int i) {
            boolean unused = sa4.this.f34960c = true;
            this.f34965a.mo11710a(i);
        }

        /* renamed from: i */
        public void mo24771i(@mr2 Typeface typeface) {
            sa4 sa4 = sa4.this;
            Typeface unused = sa4.f34950a = Typeface.create(typeface, sa4.f34948a);
            boolean unused2 = sa4.this.f34960c = true;
            this.f34965a.mo11711b(sa4.this.f34950a, false);
        }
    }

    /* renamed from: com.onedelhi.secure.sa4$b */
    public class C6753b extends ua4 {

        /* renamed from: a */
        public final /* synthetic */ Context f34966a;

        /* renamed from: a */
        public final /* synthetic */ TextPaint f34967a;

        /* renamed from: a */
        public final /* synthetic */ ua4 f34969a;

        public C6753b(Context context, TextPaint textPaint, ua4 ua4) {
            this.f34966a = context;
            this.f34967a = textPaint;
            this.f34969a = ua4;
        }

        /* renamed from: a */
        public void mo11710a(int i) {
            this.f34969a.mo11710a(i);
        }

        /* renamed from: b */
        public void mo11711b(@mr2 Typeface typeface, boolean z) {
            sa4.this.mo44268p(this.f34966a, this.f34967a, typeface);
            this.f34969a.mo11711b(typeface, z);
        }
    }

    public sa4(@mr2 Context context, @e64 int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, fd3.C2165o.TextAppearance);
        mo44264l(obtainStyledAttributes.getDimension(fd3.C2165o.TextAppearance_android_textSize, 0.0f));
        mo44263k(af2.m38610a(context, obtainStyledAttributes, fd3.C2165o.TextAppearance_android_textColor));
        this.f34949a = af2.m38610a(context, obtainStyledAttributes, fd3.C2165o.TextAppearance_android_textColorHint);
        this.f34955b = af2.m38610a(context, obtainStyledAttributes, fd3.C2165o.TextAppearance_android_textColorLink);
        this.f34948a = obtainStyledAttributes.getInt(fd3.C2165o.TextAppearance_android_textStyle, 0);
        this.f34954b = obtainStyledAttributes.getInt(fd3.C2165o.TextAppearance_android_typeface, 1);
        int f = af2.m38615f(obtainStyledAttributes, fd3.C2165o.TextAppearance_fontFamily, fd3.C2165o.TextAppearance_android_fontFamily);
        this.f34958c = obtainStyledAttributes.getResourceId(f, 0);
        this.f34951a = obtainStyledAttributes.getString(f);
        this.f34952a = obtainStyledAttributes.getBoolean(fd3.C2165o.TextAppearance_textAllCaps, false);
        this.f34959c = af2.m38610a(context, obtainStyledAttributes, fd3.C2165o.TextAppearance_android_shadowColor);
        this.f34947a = obtainStyledAttributes.getFloat(fd3.C2165o.TextAppearance_android_shadowDx, 0.0f);
        this.f34953b = obtainStyledAttributes.getFloat(fd3.C2165o.TextAppearance_android_shadowDy, 0.0f);
        this.f34957c = obtainStyledAttributes.getFloat(fd3.C2165o.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, fd3.C2165o.MaterialTextAppearance);
        int i2 = fd3.C2165o.MaterialTextAppearance_android_letterSpacing;
        this.f34956b = obtainStyledAttributes2.hasValue(i2);
        this.f34961d = obtainStyledAttributes2.getFloat(i2, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: d */
    public final void mo44256d() {
        String str;
        if (this.f34950a == null && (str = this.f34951a) != null) {
            this.f34950a = Typeface.create(str, this.f34948a);
        }
        if (this.f34950a == null) {
            int i = this.f34954b;
            this.f34950a = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f34950a = Typeface.create(this.f34950a, this.f34948a);
        }
    }

    /* renamed from: e */
    public Typeface mo44257e() {
        mo44256d();
        return this.f34950a;
    }

    @hw4
    @mr2
    /* renamed from: f */
    public Typeface mo44258f(@mr2 Context context) {
        if (this.f34960c) {
            return this.f34950a;
        }
        if (!context.isRestricted()) {
            try {
                Typeface j = zk3.m33207j(context, this.f34958c);
                this.f34950a = j;
                if (j != null) {
                    this.f34950a = Typeface.create(j, this.f34948a);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d(f34943b, "Error loading font " + this.f34951a, e);
            }
        }
        mo44256d();
        this.f34960c = true;
        return this.f34950a;
    }

    /* renamed from: g */
    public void mo44259g(@mr2 Context context, @mr2 TextPaint textPaint, @mr2 ua4 ua4) {
        mo44268p(context, textPaint, mo44257e());
        mo44260h(context, new C6753b(context, textPaint, ua4));
    }

    /* renamed from: h */
    public void mo44260h(@mr2 Context context, @mr2 ua4 ua4) {
        if (mo44265m(context)) {
            mo44258f(context);
        } else {
            mo44256d();
        }
        int i = this.f34958c;
        if (i == 0) {
            this.f34960c = true;
        }
        if (this.f34960c) {
            ua4.mo11711b(this.f34950a, true);
            return;
        }
        try {
            zk3.m33209l(context, i, new C6752a(ua4), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f34960c = true;
            ua4.mo11710a(1);
        } catch (Exception e) {
            Log.d(f34943b, "Error loading font " + this.f34951a, e);
            this.f34960c = true;
            ua4.mo11710a(-3);
        }
    }

    @ts2
    /* renamed from: i */
    public ColorStateList mo44261i() {
        return this.f34962d;
    }

    /* renamed from: j */
    public float mo44262j() {
        return this.f34963e;
    }

    /* renamed from: k */
    public void mo44263k(@ts2 ColorStateList colorStateList) {
        this.f34962d = colorStateList;
    }

    /* renamed from: l */
    public void mo44264l(float f) {
        this.f34963e = f;
    }

    /* renamed from: m */
    public final boolean mo44265m(Context context) {
        if (ta4.m65556b()) {
            return true;
        }
        int i = this.f34958c;
        return (i != 0 ? zk3.m33201d(context, i) : null) != null;
    }

    /* renamed from: n */
    public void mo44266n(@mr2 Context context, @mr2 TextPaint textPaint, @mr2 ua4 ua4) {
        mo44267o(context, textPaint, ua4);
        ColorStateList colorStateList = this.f34962d;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f34957c;
        float f2 = this.f34947a;
        float f3 = this.f34953b;
        ColorStateList colorStateList2 = this.f34959c;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: o */
    public void mo44267o(@mr2 Context context, @mr2 TextPaint textPaint, @mr2 ua4 ua4) {
        if (mo44265m(context)) {
            mo44268p(context, textPaint, mo44258f(context));
        } else {
            mo44259g(context, textPaint, ua4);
        }
    }

    /* renamed from: p */
    public void mo44268p(@mr2 Context context, @mr2 TextPaint textPaint, @mr2 Typeface typeface) {
        Typeface a = rk4.m63712a(context, typeface);
        if (a != null) {
            typeface = a;
        }
        textPaint.setTypeface(typeface);
        int i = this.f34948a & (~typeface.getStyle());
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f34963e);
        if (this.f34956b) {
            textPaint.setLetterSpacing(this.f34961d);
        }
    }
}
