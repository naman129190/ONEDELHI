package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.zk3;

@hl3({hl3.C2354a.f13188c})
public class af4 {

    /* renamed from: a */
    public final Context f9043a;

    /* renamed from: a */
    public final TypedArray f9044a;

    /* renamed from: a */
    public TypedValue f9045a;

    @sj3(21)
    /* renamed from: com.onedelhi.secure.af4$a */
    public static class C1695a {
        @pn0
        /* renamed from: a */
        public static int m11143a(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @pn0
        /* renamed from: b */
        public static int m11144b(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    public af4(Context context, TypedArray typedArray) {
        this.f9043a = context;
        this.f9044a = typedArray;
    }

    /* renamed from: E */
    public static af4 m11108E(Context context, int i, int[] iArr) {
        return new af4(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: F */
    public static af4 m11109F(Context context, AttributeSet attributeSet, int[] iArr) {
        return new af4(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: G */
    public static af4 m11110G(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new af4(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: A */
    public boolean mo13024A(int i, TypedValue typedValue) {
        return this.f9044a.getValue(i, typedValue);
    }

    /* renamed from: B */
    public TypedArray mo13025B() {
        return this.f9044a;
    }

    /* renamed from: C */
    public boolean mo13026C(int i) {
        return this.f9044a.hasValue(i);
    }

    /* renamed from: D */
    public int mo13027D() {
        return this.f9044a.length();
    }

    /* renamed from: H */
    public TypedValue mo13028H(int i) {
        return this.f9044a.peekValue(i);
    }

    /* renamed from: I */
    public void mo13029I() {
        this.f9044a.recycle();
    }

    /* renamed from: a */
    public boolean mo13030a(int i, boolean z) {
        return this.f9044a.getBoolean(i, z);
    }

    @sj3(21)
    /* renamed from: b */
    public int mo13031b() {
        return C1695a.m11143a(this.f9044a);
    }

    /* renamed from: c */
    public int mo13032c(int i, int i2) {
        return this.f9044a.getColor(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = com.onedelhi.secure.C3129p8.m24528a(r2.f9043a, (r0 = r2.f9044a.getResourceId(r3, 0)));
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList mo13033d(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f9044a
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f9044a
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f9043a
            android.content.res.ColorStateList r0 = com.onedelhi.secure.C3129p8.m24528a(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f9044a
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.af4.mo13033d(int):android.content.res.ColorStateList");
    }

    /* renamed from: e */
    public float mo13034e(int i, float f) {
        return this.f9044a.getDimension(i, f);
    }

    /* renamed from: f */
    public int mo13035f(int i, int i2) {
        return this.f9044a.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: g */
    public int mo13036g(int i, int i2) {
        return this.f9044a.getDimensionPixelSize(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f9044a.getResourceId(r3, 0);
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable mo13037h(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f9044a
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f9044a
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f9043a
            android.graphics.drawable.Drawable r3 = com.onedelhi.secure.C3129p8.m24529b(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f9044a
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.af4.mo13037h(int):android.graphics.drawable.Drawable");
    }

    /* renamed from: i */
    public Drawable mo13038i(int i) {
        int resourceId;
        if (!this.f9044a.hasValue(i) || (resourceId = this.f9044a.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C2416i8.m17330b().mo17663d(this.f9043a, resourceId, true);
    }

    /* renamed from: j */
    public float mo13039j(int i, float f) {
        return this.f9044a.getFloat(i, f);
    }

    @ts2
    /* renamed from: k */
    public Typeface mo13040k(@g64 int i, int i2, @ts2 zk3.C4109g gVar) {
        int resourceId = this.f9044a.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f9045a == null) {
            this.f9045a = new TypedValue();
        }
        return zk3.m33208k(this.f9043a, resourceId, this.f9045a, i2, gVar);
    }

    /* renamed from: l */
    public float mo13041l(int i, int i2, int i3, float f) {
        return this.f9044a.getFraction(i, i2, i3, f);
    }

    /* renamed from: m */
    public int mo13042m(int i) {
        return this.f9044a.getIndex(i);
    }

    /* renamed from: n */
    public int mo13043n() {
        return this.f9044a.getIndexCount();
    }

    /* renamed from: o */
    public int mo13044o(int i, int i2) {
        return this.f9044a.getInt(i, i2);
    }

    /* renamed from: p */
    public int mo13045p(int i, int i2) {
        return this.f9044a.getInteger(i, i2);
    }

    /* renamed from: q */
    public int mo13046q(int i, int i2) {
        return this.f9044a.getLayoutDimension(i, i2);
    }

    /* renamed from: r */
    public int mo13047r(int i, String str) {
        return this.f9044a.getLayoutDimension(i, str);
    }

    /* renamed from: s */
    public String mo13048s(int i) {
        return this.f9044a.getNonResourceString(i);
    }

    /* renamed from: t */
    public String mo13049t() {
        return this.f9044a.getPositionDescription();
    }

    /* renamed from: u */
    public int mo13050u(int i, int i2) {
        return this.f9044a.getResourceId(i, i2);
    }

    /* renamed from: v */
    public Resources mo13051v() {
        return this.f9044a.getResources();
    }

    /* renamed from: w */
    public String mo13052w(int i) {
        return this.f9044a.getString(i);
    }

    /* renamed from: x */
    public CharSequence mo13053x(int i) {
        return this.f9044a.getText(i);
    }

    /* renamed from: y */
    public CharSequence[] mo13054y(int i) {
        return this.f9044a.getTextArray(i);
    }

    /* renamed from: z */
    public int mo13055z(int i) {
        return C1695a.m11144b(this.f9044a, i);
    }
}
