package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import com.onedelhi.secure.C2218g6;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.onedelhi.secure.b7 */
public class C1748b7 extends ks4 implements C2218g6 {

    /* renamed from: b */
    public static final String f9672b = "AnimatedVDCompat";

    /* renamed from: b */
    public static final boolean f9673b = false;

    /* renamed from: c */
    public static final String f9674c = "animated-vector";

    /* renamed from: d */
    public static final String f9675d = "target";

    /* renamed from: a */
    public Animator.AnimatorListener f9676a;

    /* renamed from: a */
    public ArgbEvaluator f9677a;

    /* renamed from: a */
    public Context f9678a;

    /* renamed from: a */
    public final Drawable.Callback f9679a;

    /* renamed from: a */
    public C1751c f9680a;

    /* renamed from: a */
    public C1752d f9681a;

    /* renamed from: a */
    public ArrayList<C2218g6.C2219a> f9682a;

    /* renamed from: com.onedelhi.secure.b7$a */
    public class C1749a implements Drawable.Callback {
        public C1749a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            C1748b7.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C1748b7.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C1748b7.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: com.onedelhi.secure.b7$b */
    public class C1750b extends AnimatorListenerAdapter {
        public C1750b() {
        }

        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(C1748b7.this.f9682a);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C2218g6.C2219a) arrayList.get(i)).mo11537b(C1748b7.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(C1748b7.this.f9682a);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C2218g6.C2219a) arrayList.get(i)).mo11538c(C1748b7.this);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.b7$c */
    public static class C1751c extends Drawable.ConstantState {

        /* renamed from: a */
        public int f9685a;

        /* renamed from: a */
        public AnimatorSet f9686a;

        /* renamed from: a */
        public ls4 f9687a;

        /* renamed from: a */
        public C3042oa<Animator, String> f9688a;

        /* renamed from: a */
        public ArrayList<Animator> f9689a;

        public C1751c(Context context, C1751c cVar, Drawable.Callback callback, Resources resources) {
            if (cVar != null) {
                this.f9685a = cVar.f9685a;
                ls4 ls4 = cVar.f9687a;
                if (ls4 != null) {
                    Drawable.ConstantState constantState = ls4.getConstantState();
                    this.f9687a = (ls4) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    ls4 ls42 = (ls4) this.f9687a.mutate();
                    this.f9687a = ls42;
                    ls42.setCallback(callback);
                    this.f9687a.setBounds(cVar.f9687a.getBounds());
                    this.f9687a.mo19790m(false);
                }
                ArrayList<Animator> arrayList = cVar.f9689a;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f9689a = new ArrayList<>(size);
                    this.f9688a = new C3042oa<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = cVar.f9689a.get(i);
                        Animator clone = animator.clone();
                        String str = cVar.f9688a.get(animator);
                        clone.setTarget(this.f9687a.mo19781h(str));
                        this.f9689a.add(clone);
                        this.f9688a.put(clone, str);
                    }
                    mo13474a();
                }
            }
        }

        /* renamed from: a */
        public void mo13474a() {
            if (this.f9686a == null) {
                this.f9686a = new AnimatorSet();
            }
            this.f9686a.playTogether(this.f9689a);
        }

        public int getChangingConfigurations() {
            return this.f9685a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    @sj3(24)
    /* renamed from: com.onedelhi.secure.b7$d */
    public static class C1752d extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f9690a;

        public C1752d(Drawable.ConstantState constantState) {
            this.f9690a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f9690a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f9690a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1748b7 b7Var = new C1748b7();
            Drawable newDrawable = this.f9690a.newDrawable();
            b7Var.f15073a = newDrawable;
            newDrawable.setCallback(b7Var.f9679a);
            return b7Var;
        }

        public Drawable newDrawable(Resources resources) {
            C1748b7 b7Var = new C1748b7();
            Drawable newDrawable = this.f9690a.newDrawable(resources);
            b7Var.f15073a = newDrawable;
            newDrawable.setCallback(b7Var.f9679a);
            return b7Var;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1748b7 b7Var = new C1748b7();
            Drawable newDrawable = this.f9690a.newDrawable(resources, theme);
            b7Var.f15073a = newDrawable;
            newDrawable.setCallback(b7Var.f9679a);
            return b7Var;
        }
    }

    public C1748b7() {
        this((Context) null, (C1751c) null, (Resources) null);
    }

    public C1748b7(@ts2 Context context) {
        this(context, (C1751c) null, (Resources) null);
    }

    public C1748b7(@ts2 Context context, @ts2 C1751c cVar, @ts2 Resources resources) {
        this.f9677a = null;
        this.f9676a = null;
        this.f9682a = null;
        C1749a aVar = new C1749a();
        this.f9679a = aVar;
        this.f9678a = context;
        if (cVar != null) {
            this.f9680a = cVar;
        } else {
            this.f9680a = new C1751c(context, cVar, aVar, resources);
        }
    }

    /* renamed from: a */
    public static void m11578a(Drawable drawable) {
        if (drawable instanceof Animatable) {
            if (Build.VERSION.SDK_INT >= 24) {
                ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            } else {
                ((C1748b7) drawable).mo13425b();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049 A[Catch:{ IOException | XmlPullParserException -> 0x005e }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056 A[Catch:{ IOException | XmlPullParserException -> 0x005e }] */
    @com.onedelhi.secure.ts2
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.C1748b7 m11579e(@com.onedelhi.secure.mr2 android.content.Context r6, @com.onedelhi.secure.dp0 int r7) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "AnimatedVDCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0030
            com.onedelhi.secure.b7 r0 = new com.onedelhi.secure.b7
            r0.<init>(r6)
            android.content.res.Resources r1 = r6.getResources()
            android.content.res.Resources$Theme r6 = r6.getTheme()
            android.graphics.drawable.Drawable r6 = com.onedelhi.secure.zk3.m33204g(r1, r7, r6)
            r0.f15073a = r6
            android.graphics.drawable.Drawable$Callback r7 = r0.f9679a
            r6.setCallback(r7)
            com.onedelhi.secure.b7$d r6 = new com.onedelhi.secure.b7$d
            android.graphics.drawable.Drawable r7 = r0.f15073a
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            r0.f9681a = r6
            return r0
        L_0x0030:
            android.content.res.Resources r2 = r6.getResources()
            android.content.res.XmlResourceParser r7 = r2.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0060, IOException -> 0x005e }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0060, IOException -> 0x005e }
        L_0x003c:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0060, IOException -> 0x005e }
            r4 = 2
            if (r3 == r4) goto L_0x0047
            r5 = 1
            if (r3 == r5) goto L_0x0047
            goto L_0x003c
        L_0x0047:
            if (r3 != r4) goto L_0x0056
            android.content.res.Resources r3 = r6.getResources()     // Catch:{ XmlPullParserException -> 0x0060, IOException -> 0x005e }
            android.content.res.Resources$Theme r4 = r6.getTheme()     // Catch:{ XmlPullParserException -> 0x0060, IOException -> 0x005e }
            com.onedelhi.secure.b7 r6 = m11580f(r6, r3, r7, r2, r4)     // Catch:{ XmlPullParserException -> 0x0060, IOException -> 0x005e }
            return r6
        L_0x0056:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0060, IOException -> 0x005e }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0060, IOException -> 0x005e }
            throw r6     // Catch:{ XmlPullParserException -> 0x0060, IOException -> 0x005e }
        L_0x005e:
            r6 = move-exception
            goto L_0x0061
        L_0x0060:
            r6 = move-exception
        L_0x0061:
            android.util.Log.e(r1, r0, r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C1748b7.m11579e(android.content.Context, int):com.onedelhi.secure.b7");
    }

    /* renamed from: f */
    public static C1748b7 m11580f(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C1748b7 b7Var = new C1748b7(context);
        b7Var.inflate(resources, xmlPullParser, attributeSet, theme);
        return b7Var;
    }

    /* renamed from: g */
    public static void m11581g(Drawable drawable, C2218g6.C2219a aVar) {
        if (drawable != null && aVar != null && (drawable instanceof Animatable)) {
            if (Build.VERSION.SDK_INT >= 24) {
                m11582h((AnimatedVectorDrawable) drawable, aVar);
            } else {
                ((C1748b7) drawable).mo13426c(aVar);
            }
        }
    }

    @sj3(23)
    /* renamed from: h */
    public static void m11582h(@mr2 AnimatedVectorDrawable animatedVectorDrawable, @mr2 C2218g6.C2219a aVar) {
        animatedVectorDrawable.registerAnimationCallback(aVar.mo16359a());
    }

    /* renamed from: l */
    public static boolean m11583l(Drawable drawable, C2218g6.C2219a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 24 ? m11584m((AnimatedVectorDrawable) drawable, aVar) : ((C1748b7) drawable).mo13429d(aVar);
    }

    @sj3(23)
    /* renamed from: m */
    public static boolean m11584m(AnimatedVectorDrawable animatedVectorDrawable, C2218g6.C2219a aVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(aVar.mo16359a());
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            wo0.m30972a(drawable, theme);
        }
    }

    /* renamed from: b */
    public void mo13425b() {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        mo13444i();
        ArrayList<C2218g6.C2219a> arrayList = this.f9682a;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    /* renamed from: c */
    public void mo13426c(@mr2 C2218g6.C2219a aVar) {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            m11582h((AnimatedVectorDrawable) drawable, aVar);
        } else if (aVar != null) {
            if (this.f9682a == null) {
                this.f9682a = new ArrayList<>();
            }
            if (!this.f9682a.contains(aVar)) {
                this.f9682a.add(aVar);
                if (this.f9676a == null) {
                    this.f9676a = new C1750b();
                }
                this.f9680a.f9686a.addListener(this.f9676a);
            }
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            return wo0.m30973b(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* renamed from: d */
    public boolean mo13429d(@mr2 C2218g6.C2219a aVar) {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            m11584m((AnimatedVectorDrawable) drawable, aVar);
        }
        ArrayList<C2218g6.C2219a> arrayList = this.f9682a;
        if (arrayList == null || aVar == null) {
            return false;
        }
        boolean remove = arrayList.remove(aVar);
        if (this.f9682a.size() == 0) {
            mo13444i();
        }
        return remove;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f9680a.f9687a.draw(canvas);
        if (this.f9680a.f9686a.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f15073a;
        return drawable != null ? wo0.m30975d(drawable) : this.f9680a.f9687a.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f15073a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f9680a.f9685a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f15073a;
        return drawable != null ? wo0.m30976e(drawable) : this.f9680a.f9687a.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f15073a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1752d(this.f15073a.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f15073a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f9680a.f9687a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f15073a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f9680a.f9687a.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f15073a;
        return drawable != null ? drawable.getOpacity() : this.f9680a.f9687a.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* renamed from: i */
    public final void mo13444i() {
        Animator.AnimatorListener animatorListener = this.f9676a;
        if (animatorListener != null) {
            this.f9680a.f9686a.removeListener(animatorListener);
            this.f9676a = null;
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes;
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            wo0.m30978g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (f9674c.equals(name)) {
                    obtainAttributes = xj4.m31502s(resources, theme, attributeSet, C1652a6.f8797e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        ls4 e = ls4.m20924e(resources, resourceId, theme);
                        e.mo19790m(false);
                        e.setCallback(this.f9679a);
                        ls4 ls4 = this.f9680a.f9687a;
                        if (ls4 != null) {
                            ls4.setCallback((Drawable.Callback) null);
                        }
                        this.f9680a.f9687a = e;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C1652a6.f8800f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f9678a;
                        if (context != null) {
                            mo13450j(string, C2221g7.m15557j(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f9680a.mo13474a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f15073a;
        return drawable != null ? wo0.m30979h(drawable) : this.f9680a.f9687a.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f15073a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f9680a.f9686a.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f15073a;
        return drawable != null ? drawable.isStateful() : this.f9680a.f9687a.isStateful();
    }

    /* renamed from: j */
    public final void mo13450j(String str, Animator animator) {
        animator.setTarget(this.f9680a.f9687a.mo19781h(str));
        C1751c cVar = this.f9680a;
        if (cVar.f9689a == null) {
            cVar.f9689a = new ArrayList<>();
            this.f9680a.f9688a = new C3042oa<>();
        }
        this.f9680a.f9689a.add(animator);
        this.f9680a.f9688a.put(animator, str);
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    /* renamed from: k */
    public final void mo13452k(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                mo13452k(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f9677a == null) {
                    this.f9677a = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f9677a);
            }
        }
    }

    public Drawable mutate() {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f9680a.f9687a.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.f15073a;
        return drawable != null ? drawable.setLevel(i) : this.f9680a.f9687a.setLevel(i);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f15073a;
        return drawable != null ? drawable.setState(iArr) : this.f9680a.f9687a.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f9680a.f9687a.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            wo0.m30981j(drawable, z);
        } else {
            this.f9680a.f9687a.setAutoMirrored(z);
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f9680a.f9687a.setColorFilter(colorFilter);
        }
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            wo0.m30985n(drawable, i);
        } else {
            this.f9680a.f9687a.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            wo0.m30986o(drawable, colorStateList);
        } else {
            this.f9680a.f9687a.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            wo0.m30987p(drawable, mode);
        } else {
            this.f9680a.f9687a.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f9680a.f9687a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f9680a.f9686a.isStarted()) {
            this.f9680a.f9686a.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f9680a.f9686a.end();
        }
    }
}
