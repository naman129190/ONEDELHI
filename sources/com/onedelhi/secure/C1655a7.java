package com.onedelhi.secure;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import com.onedelhi.secure.c20;
import com.onedelhi.secure.i34;
import com.onedelhi.secure.kb3;
import com.onedelhi.secure.xo0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.onedelhi.secure.a7 */
public class C1655a7 extends i34 implements we4 {

    /* renamed from: d */
    public static final String f8847d = C1655a7.class.getSimpleName();

    /* renamed from: e */
    public static final String f8848e = "transition";

    /* renamed from: f */
    public static final String f8849f = "item";

    /* renamed from: g */
    public static final String f8850g = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* renamed from: h */
    public static final String f8851h = ": <transition> tag requires 'fromId' & 'toId' attributes";

    /* renamed from: i */
    public static final String f8852i = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* renamed from: a */
    public C1658c f8853a;

    /* renamed from: a */
    public C1662g f8854a;

    /* renamed from: h */
    public boolean f8855h;

    /* renamed from: p */
    public int f8856p;

    /* renamed from: q */
    public int f8857q;

    /* renamed from: com.onedelhi.secure.a7$b */
    public static class C1657b extends C1662g {

        /* renamed from: a */
        public final Animatable f8858a;

        public C1657b(Animatable animatable) {
            super();
            this.f8858a = animatable;
        }

        /* renamed from: c */
        public void mo12792c() {
            this.f8858a.start();
        }

        /* renamed from: d */
        public void mo12793d() {
            this.f8858a.stop();
        }
    }

    /* renamed from: com.onedelhi.secure.a7$c */
    public static class C1658c extends i34.C2397a {

        /* renamed from: a */
        public static final long f8859a = 4294967296L;

        /* renamed from: b */
        public static final long f8860b = 8589934592L;

        /* renamed from: a */
        public ga2<Long> f8861a;

        /* renamed from: a */
        public k14<Integer> f8862a;

        public C1658c(@ts2 C1658c cVar, @mr2 C1655a7 a7Var, @ts2 Resources resources) {
            super(cVar, a7Var, resources);
            k14<Integer> k14;
            if (cVar != null) {
                this.f8861a = cVar.f8861a;
                k14 = cVar.f8862a;
            } else {
                this.f8861a = new ga2<>();
                k14 = new k14<>();
            }
            this.f8862a = k14;
        }

        /* renamed from: H */
        public static long m10851H(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* renamed from: F */
        public int mo12794F(@mr2 int[] iArr, @mr2 Drawable drawable, int i) {
            int D = super.mo17542D(iArr, drawable);
            this.f8862a.mo18855n(D, Integer.valueOf(i));
            return D;
        }

        /* renamed from: G */
        public int mo12795G(int i, int i2, @mr2 Drawable drawable, boolean z) {
            int a = super.mo27008a(drawable);
            long H = m10851H(i, i2);
            long j = z ? f8860b : 0;
            long j2 = (long) a;
            this.f8861a.mo16409a(H, Long.valueOf(j2 | j));
            if (z) {
                this.f8861a.mo16409a(m10851H(i2, i), Long.valueOf(f8859a | j2 | j));
            }
            return a;
        }

        /* renamed from: I */
        public int mo12796I(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f8862a.mo18850i(i, 0).intValue();
        }

        /* renamed from: J */
        public int mo12797J(@mr2 int[] iArr) {
            int E = super.mo17543E(iArr);
            return E >= 0 ? E : super.mo17543E(StateSet.WILD_CARD);
        }

        /* renamed from: K */
        public int mo12798K(int i, int i2) {
            return (int) this.f8861a.mo16418i(m10851H(i, i2), -1L).longValue();
        }

        /* renamed from: L */
        public boolean mo12799L(int i, int i2) {
            return (this.f8861a.mo16418i(m10851H(i, i2), -1L).longValue() & f8859a) != 0;
        }

        /* renamed from: M */
        public boolean mo12800M(int i, int i2) {
            return (this.f8861a.mo16418i(m10851H(i, i2), -1L).longValue() & f8860b) != 0;
        }

        @mr2
        public Drawable newDrawable() {
            return new C1655a7(this, (Resources) null);
        }

        @mr2
        public Drawable newDrawable(Resources resources) {
            return new C1655a7(this, resources);
        }

        /* renamed from: v */
        public void mo12803v() {
            this.f8861a = this.f8861a.clone();
            this.f8862a = this.f8862a.clone();
        }
    }

    /* renamed from: com.onedelhi.secure.a7$d */
    public static class C1659d extends C1662g {

        /* renamed from: a */
        public final C1748b7 f8863a;

        public C1659d(C1748b7 b7Var) {
            super();
            this.f8863a = b7Var;
        }

        /* renamed from: c */
        public void mo12792c() {
            this.f8863a.start();
        }

        /* renamed from: d */
        public void mo12793d() {
            this.f8863a.stop();
        }
    }

    /* renamed from: com.onedelhi.secure.a7$e */
    public static class C1660e extends C1662g {

        /* renamed from: a */
        public final ObjectAnimator f8864a;

        /* renamed from: a */
        public final boolean f8865a;

        public C1660e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C1661f fVar = new C1661f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            c20.C1837b.m12264a(ofInt, true);
            ofInt.setDuration((long) fVar.mo12806a());
            ofInt.setInterpolator(fVar);
            this.f8865a = z2;
            this.f8864a = ofInt;
        }

        /* renamed from: a */
        public boolean mo12804a() {
            return this.f8865a;
        }

        /* renamed from: b */
        public void mo12805b() {
            this.f8864a.reverse();
        }

        /* renamed from: c */
        public void mo12792c() {
            this.f8864a.start();
        }

        /* renamed from: d */
        public void mo12793d() {
            this.f8864a.cancel();
        }
    }

    /* renamed from: com.onedelhi.secure.a7$f */
    public static class C1661f implements TimeInterpolator {

        /* renamed from: a */
        public int f8866a;

        /* renamed from: a */
        public int[] f8867a;

        /* renamed from: b */
        public int f8868b;

        public C1661f(AnimationDrawable animationDrawable, boolean z) {
            mo12807b(animationDrawable, z);
        }

        /* renamed from: a */
        public int mo12806a() {
            return this.f8868b;
        }

        /* renamed from: b */
        public int mo12807b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f8866a = numberOfFrames;
            int[] iArr = this.f8867a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f8867a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f8867a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f8868b = i;
            return i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f8868b)) + 0.5f);
            int i2 = this.f8866a;
            int[] iArr = this.f8867a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f8868b) : 0.0f);
        }
    }

    /* renamed from: com.onedelhi.secure.a7$g */
    public static abstract class C1662g {
        public C1662g() {
        }

        /* renamed from: a */
        public boolean mo12804a() {
            return false;
        }

        /* renamed from: b */
        public void mo12805b() {
        }

        /* renamed from: c */
        public abstract void mo12792c();

        /* renamed from: d */
        public abstract void mo12793d();
    }

    public C1655a7() {
        this((C1658c) null, (Resources) null);
    }

    public C1655a7(@ts2 C1658c cVar, @ts2 Resources resources) {
        super((i34.C2397a) null);
        this.f8856p = -1;
        this.f8857q = -1;
        mo12767i(new C1658c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020 A[Catch:{ IOException | XmlPullParserException -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001b A[Catch:{ IOException | XmlPullParserException -> 0x0028 }] */
    @com.onedelhi.secure.ts2
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.C1655a7 m10830B(@com.onedelhi.secure.mr2 android.content.Context r6, @com.onedelhi.secure.dp0 int r7, @com.onedelhi.secure.ts2 android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            android.content.res.Resources r1 = r6.getResources()     // Catch:{ XmlPullParserException -> 0x002a, IOException -> 0x0028 }
            android.content.res.XmlResourceParser r7 = r1.getXml(r7)     // Catch:{ XmlPullParserException -> 0x002a, IOException -> 0x0028 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x002a, IOException -> 0x0028 }
        L_0x000e:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x002a, IOException -> 0x0028 }
            r4 = 2
            if (r3 == r4) goto L_0x0019
            r5 = 1
            if (r3 == r5) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            if (r3 != r4) goto L_0x0020
            com.onedelhi.secure.a7 r6 = m10831C(r6, r1, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x002a, IOException -> 0x0028 }
            return r6
        L_0x0020:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x002a, IOException -> 0x0028 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x002a, IOException -> 0x0028 }
            throw r6     // Catch:{ XmlPullParserException -> 0x002a, IOException -> 0x0028 }
        L_0x0028:
            r6 = move-exception
            goto L_0x002b
        L_0x002a:
            r6 = move-exception
        L_0x002b:
            java.lang.String r7 = f8847d
            android.util.Log.e(r7, r0, r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C1655a7.m10830B(android.content.Context, int, android.content.res.Resources$Theme):com.onedelhi.secure.a7");
    }

    @mr2
    /* renamed from: C */
    public static C1655a7 m10831C(@mr2 Context context, @mr2 Resources resources, @mr2 XmlPullParser xmlPullParser, @mr2 AttributeSet attributeSet, @ts2 Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C1655a7 a7Var = new C1655a7();
            a7Var.mo12789v(context, resources, xmlPullParser, attributeSet, theme);
            return a7Var;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: w */
    private void m10832w(@mr2 Context context, @mr2 Resources resources, @mr2 XmlPullParser xmlPullParser, @mr2 AttributeSet attributeSet, @ts2 Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        mo12748E(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals(f8848e)) {
                        mo12749F(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: x */
    private void m10833x(TypedArray typedArray) {
        C1658c cVar = this.f8853a;
        cVar.f22666b |= c20.C1838c.m12266b(typedArray);
        cVar.mo27006B(typedArray.getBoolean(kb3.C2617b.AnimatedStateListDrawableCompat_android_variablePadding, cVar.f22664a));
        cVar.mo27031x(typedArray.getBoolean(kb3.C2617b.AnimatedStateListDrawableCompat_android_constantSize, cVar.f22669c));
        cVar.mo27032y(typedArray.getInt(kb3.C2617b.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.f22684k));
        cVar.mo27033z(typedArray.getInt(kb3.C2617b.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.f22686l));
        setDither(typedArray.getBoolean(kb3.C2617b.AnimatedStateListDrawableCompat_android_dither, cVar.f22683j));
    }

    /* renamed from: A */
    public C1658c mo12776o() {
        return new C1658c(this.f8853a, this, (Resources) null);
    }

    /* renamed from: D */
    public final void mo12747D() {
        onStateChange(getState());
    }

    /* renamed from: E */
    public final int mo12748E(@mr2 Context context, @mr2 Resources resources, @mr2 XmlPullParser xmlPullParser, @mr2 AttributeSet attributeSet, @ts2 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray s = xj4.m31502s(resources, theme, attributeSet, kb3.C2617b.AnimatedStateListDrawableItem);
        int resourceId = s.getResourceId(kb3.C2617b.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = s.getResourceId(kb3.C2617b.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable j = resourceId2 > 0 ? sk3.m27673h().mo24462j(context, resourceId2) : null;
        s.recycle();
        int[] p = mo17534p(attributeSet);
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                j = xmlPullParser.getName().equals(ls4.f15545f) ? ls4.m20925f(resources, xmlPullParser, attributeSet, theme) : c20.C1838c.m12265a(resources, xmlPullParser, attributeSet, theme);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f8852i);
            }
        }
        if (j != null) {
            return this.f8853a.mo12794F(p, j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f8852i);
    }

    /* renamed from: F */
    public final int mo12749F(@mr2 Context context, @mr2 Resources resources, @mr2 XmlPullParser xmlPullParser, @mr2 AttributeSet attributeSet, @ts2 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray s = xj4.m31502s(resources, theme, attributeSet, kb3.C2617b.AnimatedStateListDrawableTransition);
        int resourceId = s.getResourceId(kb3.C2617b.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = s.getResourceId(kb3.C2617b.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = s.getResourceId(kb3.C2617b.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable j = resourceId3 > 0 ? sk3.m27673h().mo24462j(context, resourceId3) : null;
        boolean z = s.getBoolean(kb3.C2617b.AnimatedStateListDrawableTransition_android_reversible, false);
        s.recycle();
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                j = xmlPullParser.getName().equals(C1748b7.f9674c) ? C1748b7.m11580f(context, resources, xmlPullParser, attributeSet, theme) : c20.C1838c.m12265a(resources, xmlPullParser, attributeSet, theme);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f8850g);
            }
        }
        if (j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f8850g);
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f8853a.mo12795G(resourceId, resourceId2, j, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f8851h);
        }
    }

    /* renamed from: G */
    public final boolean mo12750G(int i) {
        int i2;
        int K;
        C1662g gVar;
        C1662g gVar2 = this.f8854a;
        if (gVar2 == null) {
            i2 = mo26990d();
        } else if (i == this.f8856p) {
            return true;
        } else {
            if (i != this.f8857q || !gVar2.mo12804a()) {
                i2 = this.f8856p;
                gVar2.mo12793d();
            } else {
                gVar2.mo12805b();
                this.f8856p = this.f8857q;
                this.f8857q = i;
                return true;
            }
        }
        this.f8854a = null;
        this.f8857q = -1;
        this.f8856p = -1;
        C1658c cVar = this.f8853a;
        int I = cVar.mo12796I(i2);
        int I2 = cVar.mo12796I(i);
        if (I2 == 0 || I == 0 || (K = cVar.mo12798K(I, I2)) < 0) {
            return false;
        }
        boolean M = cVar.mo12800M(I, I2);
        mo26994h(K);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new C1660e((AnimationDrawable) current, cVar.mo12799L(I, I2), M);
        } else if (current instanceof C1748b7) {
            gVar = new C1659d((C1748b7) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new C1657b((Animatable) current);
            }
            return false;
        }
        gVar.mo12792c();
        this.f8854a = gVar;
        this.f8857q = i2;
        this.f8856p = i;
        return true;
    }

    @sj3(21)
    public /* bridge */ /* synthetic */ void applyTheme(@mr2 Resources.Theme theme) {
        super.applyTheme(theme);
    }

    /* renamed from: b */
    public void mo12752b() {
        super.mo12752b();
        this.f8855h = false;
    }

    @sj3(21)
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ void draw(@mr2 Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @mr2
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(@mr2 Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @sj3(21)
    public /* bridge */ /* synthetic */ void getOutline(@mr2 Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(@mr2 Rect rect) {
        return super.getPadding(rect);
    }

    /* renamed from: i */
    public void mo12767i(@mr2 xo0.C3937d dVar) {
        super.mo12767i(dVar);
        if (dVar instanceof C1658c) {
            this.f8853a = (C1658c) dVar;
        }
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(@mr2 Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C1662g gVar = this.f8854a;
        if (gVar != null) {
            gVar.mo12793d();
            this.f8854a = null;
            mo26994h(this.f8856p);
            this.f8856p = -1;
            this.f8857q = -1;
        }
    }

    /* renamed from: k */
    public /* bridge */ /* synthetic */ void mo12772k(int i) {
        super.mo12772k(i);
    }

    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo12773l(int i) {
        super.mo12773l(i);
    }

    @mr2
    public Drawable mutate() {
        if (!this.f8855h && super.mutate() == this) {
            this.f8853a.mo12803v();
            this.f8855h = true;
        }
        return this;
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ void mo12775n(int[] iArr, Drawable drawable) {
        super.mo12775n(iArr, drawable);
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    public boolean onStateChange(@mr2 int[] iArr) {
        int J = this.f8853a.mo12797J(iArr);
        boolean z = J != mo26990d() && (mo12750G(J) || mo26994h(J));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(@mr2 Drawable drawable, @mr2 Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void setTint(@d10 int i) {
        super.setTint(i);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(@mr2 PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        C1662g gVar = this.f8854a;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.mo12792c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(@mr2 Drawable drawable, @mr2 Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    /* renamed from: v */
    public void mo12789v(@mr2 Context context, @mr2 Resources resources, @mr2 XmlPullParser xmlPullParser, @mr2 AttributeSet attributeSet, @ts2 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s = xj4.m31502s(resources, theme, attributeSet, kb3.C2617b.AnimatedStateListDrawableCompat);
        setVisible(s.getBoolean(kb3.C2617b.AnimatedStateListDrawableCompat_android_visible, true), true);
        m10833x(s);
        mo26996m(resources);
        s.recycle();
        m10832w(context, resources, xmlPullParser, attributeSet, theme);
        mo12747D();
    }

    /* renamed from: y */
    public void mo12790y(@mr2 int[] iArr, @mr2 Drawable drawable, int i) {
        ot2.m24059d(drawable);
        this.f8853a.mo12794F(iArr, drawable, i);
        onStateChange(getState());
    }

    /* renamed from: z */
    public <T extends Drawable & Animatable> void mo12791z(int i, int i2, @mr2 T t, boolean z) {
        ot2.m24059d(t);
        this.f8853a.mo12795G(i, i2, t, z);
    }
}
