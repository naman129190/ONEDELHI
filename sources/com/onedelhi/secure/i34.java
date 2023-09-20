package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import com.onedelhi.secure.c20;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.kb3;
import com.onedelhi.secure.xo0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class i34 extends xo0 {

    /* renamed from: c */
    public static final String f13470c = "StateListDrawable";

    /* renamed from: g */
    public static final boolean f13471g = false;

    /* renamed from: a */
    public C2397a f13472a;

    /* renamed from: f */
    public boolean f13473f;

    /* renamed from: com.onedelhi.secure.i34$a */
    public static class C2397a extends xo0.C3937d {

        /* renamed from: a */
        public int[][] f13474a;

        public C2397a(C2397a aVar, i34 i34, Resources resources) {
            super(aVar, i34, resources);
            if (aVar != null) {
                this.f13474a = aVar.f13474a;
            } else {
                this.f13474a = new int[mo27015g()][];
            }
        }

        /* renamed from: D */
        public int mo17542D(int[] iArr, Drawable drawable) {
            int a = mo27008a(drawable);
            this.f13474a[a] = iArr;
            return a;
        }

        /* renamed from: E */
        public int mo17543E(int[] iArr) {
            int[][] iArr2 = this.f13474a;
            int i = mo27018i();
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        @mr2
        public Drawable newDrawable() {
            return new i34(this, (Resources) null);
        }

        @mr2
        public Drawable newDrawable(Resources resources) {
            return new i34(this, resources);
        }

        /* renamed from: r */
        public void mo17544r(int i, int i2) {
            super.mo17544r(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f13474a, 0, iArr, 0, i);
            this.f13474a = iArr;
        }

        /* renamed from: v */
        public void mo12803v() {
            int[][] iArr = this.f13474a;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f13474a;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f13474a = iArr2;
        }
    }

    public i34() {
        this((C2397a) null, (Resources) null);
    }

    public i34(@ts2 C2397a aVar) {
        if (aVar != null) {
            mo12767i(aVar);
        }
    }

    public i34(C2397a aVar, Resources resources) {
        mo12767i(new C2397a(aVar, this, resources));
        onStateChange(getState());
    }

    @sj3(21)
    public void applyTheme(@mr2 Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* renamed from: b */
    public void mo12752b() {
        super.mo12752b();
        this.f13473f = false;
    }

    /* renamed from: i */
    public void mo12767i(@mr2 xo0.C3937d dVar) {
        super.mo12767i(dVar);
        if (dVar instanceof C2397a) {
            this.f13472a = (C2397a) dVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    @mr2
    public Drawable mutate() {
        if (!this.f13473f && super.mutate() == this) {
            this.f13472a.mo12803v();
            this.f13473f = true;
        }
        return this;
    }

    /* renamed from: n */
    public void mo12775n(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            this.f13472a.mo17542D(iArr, drawable);
            onStateChange(getState());
        }
    }

    /* renamed from: o */
    public C2397a mo12753c() {
        return new C2397a(this.f13472a, this, (Resources) null);
    }

    public boolean onStateChange(@mr2 int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int E = this.f13472a.mo17543E(iArr);
        if (E < 0) {
            E = this.f13472a.mo17543E(StateSet.WILD_CARD);
        }
        return mo26994h(E) || onStateChange;
    }

    /* renamed from: p */
    public int[] mo17534p(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    /* renamed from: q */
    public int mo17535q() {
        return this.f13472a.mo27018i();
    }

    /* renamed from: r */
    public Drawable mo17536r(int i) {
        return this.f13472a.mo27017h(i);
    }

    /* renamed from: s */
    public int mo17537s(int[] iArr) {
        return this.f13472a.mo17543E(iArr);
    }

    /* renamed from: t */
    public C2397a mo17538t() {
        return this.f13472a;
    }

    /* renamed from: u */
    public int[] mo17539u(int i) {
        return this.f13472a.f13474a[i];
    }

    /* renamed from: v */
    public void mo12789v(@mr2 Context context, @mr2 Resources resources, @mr2 XmlPullParser xmlPullParser, @mr2 AttributeSet attributeSet, @ts2 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s = xj4.m31502s(resources, theme, attributeSet, kb3.C2617b.StateListDrawable);
        setVisible(s.getBoolean(kb3.C2617b.StateListDrawable_android_visible, true), true);
        mo17541x(s);
        mo26996m(resources);
        s.recycle();
        mo17540w(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    /* renamed from: w */
    public final void mo17540w(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        C2397a aVar = this.f13472a;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next2 == 3) {
                    return;
                }
                if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                    TypedArray s = xj4.m31502s(resources, theme, attributeSet, kb3.C2617b.StateListDrawableItem);
                    Drawable drawable = null;
                    int resourceId = s.getResourceId(kb3.C2617b.StateListDrawableItem_android_drawable, -1);
                    if (resourceId > 0) {
                        drawable = sk3.m27673h().mo24462j(context, resourceId);
                    }
                    s.recycle();
                    int[] p = mo17534p(attributeSet);
                    if (drawable == null) {
                        do {
                            next = xmlPullParser.next();
                        } while (next == 4);
                        if (next == 2) {
                            drawable = c20.C1838c.m12265a(resources, xmlPullParser, attributeSet, theme);
                        } else {
                            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + C1655a7.f8852i);
                        }
                    }
                    aVar.mo17542D(p, drawable);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: x */
    public final void mo17541x(TypedArray typedArray) {
        C2397a aVar = this.f13472a;
        aVar.f22666b |= c20.C1838c.m12266b(typedArray);
        aVar.f22664a = typedArray.getBoolean(kb3.C2617b.StateListDrawable_android_variablePadding, aVar.f22664a);
        aVar.f22669c = typedArray.getBoolean(kb3.C2617b.StateListDrawable_android_constantSize, aVar.f22669c);
        aVar.f22684k = typedArray.getInt(kb3.C2617b.StateListDrawable_android_enterFadeDuration, aVar.f22684k);
        aVar.f22686l = typedArray.getInt(kb3.C2617b.StateListDrawable_android_exitFadeDuration, aVar.f22686l);
        aVar.f22683j = typedArray.getBoolean(kb3.C2617b.StateListDrawable_android_dither, aVar.f22683j);
    }
}
