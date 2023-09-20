package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.xz2;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ls4 extends ks4 {

    /* renamed from: a */
    public static final PorterDuff.Mode f15539a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public static final String f15540b = "VectorDrawableCompat";

    /* renamed from: c */
    public static final String f15541c = "clip-path";

    /* renamed from: d */
    public static final String f15542d = "group";

    /* renamed from: d */
    public static final boolean f15543d = false;

    /* renamed from: e */
    public static final String f15544e = "path";

    /* renamed from: f */
    public static final String f15545f = "vector";

    /* renamed from: n */
    public static final int f15546n = 0;

    /* renamed from: o */
    public static final int f15547o = 1;

    /* renamed from: p */
    public static final int f15548p = 2;

    /* renamed from: q */
    public static final int f15549q = 0;

    /* renamed from: r */
    public static final int f15550r = 1;

    /* renamed from: s */
    public static final int f15551s = 2;

    /* renamed from: t */
    public static final int f15552t = 2048;

    /* renamed from: a */
    public ColorFilter f15553a;

    /* renamed from: a */
    public final Matrix f15554a;

    /* renamed from: a */
    public PorterDuffColorFilter f15555a;

    /* renamed from: a */
    public final Rect f15556a;

    /* renamed from: a */
    public Drawable.ConstantState f15557a;

    /* renamed from: a */
    public C2780h f15558a;

    /* renamed from: a */
    public final float[] f15559a;

    /* renamed from: b */
    public boolean f15560b;

    /* renamed from: c */
    public boolean f15561c;

    /* renamed from: com.onedelhi.secure.ls4$b */
    public static class C2774b extends C2778f {
        public C2774b() {
        }

        public C2774b(C2774b bVar) {
            super(bVar);
        }

        /* renamed from: e */
        public boolean mo19801e() {
            return true;
        }

        /* renamed from: i */
        public void mo19802i(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (xj4.m31501r(xmlPullParser, "pathData")) {
                TypedArray s = xj4.m31502s(resources, theme, attributeSet, C1652a6.f8794d);
                mo19803j(s, xmlPullParser);
                s.recycle();
            }
        }

        /* renamed from: j */
        public final void mo19803j(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f15589a = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f15590a = xz2.m31793d(string2);
            }
            this.f15588a = xj4.m31494k(typedArray, xmlPullParser, "fillType", 2, 0);
        }
    }

    /* renamed from: com.onedelhi.secure.ls4$c */
    public static class C2775c extends C2778f {

        /* renamed from: a */
        public float f15562a = 0.0f;

        /* renamed from: a */
        public Paint.Cap f15563a = Paint.Cap.BUTT;

        /* renamed from: a */
        public Paint.Join f15564a = Paint.Join.MITER;

        /* renamed from: a */
        public t20 f15565a;

        /* renamed from: a */
        public int[] f15566a;

        /* renamed from: b */
        public float f15567b = 1.0f;

        /* renamed from: b */
        public t20 f15568b;

        /* renamed from: c */
        public float f15569c = 1.0f;

        /* renamed from: d */
        public float f15570d = 0.0f;

        /* renamed from: e */
        public float f15571e = 1.0f;

        /* renamed from: f */
        public float f15572f = 0.0f;

        /* renamed from: g */
        public float f15573g = 4.0f;

        public C2775c() {
        }

        public C2775c(C2775c cVar) {
            super(cVar);
            this.f15566a = cVar.f15566a;
            this.f15565a = cVar.f15565a;
            this.f15562a = cVar.f15562a;
            this.f15567b = cVar.f15567b;
            this.f15568b = cVar.f15568b;
            this.f15588a = cVar.f15588a;
            this.f15569c = cVar.f15569c;
            this.f15570d = cVar.f15570d;
            this.f15571e = cVar.f15571e;
            this.f15572f = cVar.f15572f;
            this.f15563a = cVar.f15563a;
            this.f15564a = cVar.f15564a;
            this.f15573g = cVar.f15573g;
        }

        /* renamed from: a */
        public boolean mo19804a() {
            return this.f15568b.mo24691i() || this.f15565a.mo24691i();
        }

        /* renamed from: b */
        public boolean mo19805b(int[] iArr) {
            return this.f15565a.mo24692j(iArr) | this.f15568b.mo24692j(iArr);
        }

        /* renamed from: c */
        public void mo19806c(Resources.Theme theme) {
        }

        /* renamed from: d */
        public boolean mo19807d() {
            return this.f15566a != null;
        }

        public float getFillAlpha() {
            return this.f15569c;
        }

        @d10
        public int getFillColor() {
            return this.f15568b.mo24688e();
        }

        public float getStrokeAlpha() {
            return this.f15567b;
        }

        @d10
        public int getStrokeColor() {
            return this.f15565a.mo24688e();
        }

        public float getStrokeWidth() {
            return this.f15562a;
        }

        public float getTrimPathEnd() {
            return this.f15571e;
        }

        public float getTrimPathOffset() {
            return this.f15572f;
        }

        public float getTrimPathStart() {
            return this.f15570d;
        }

        /* renamed from: i */
        public final Paint.Cap mo19816i(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* renamed from: j */
        public final Paint.Join mo19817j(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* renamed from: k */
        public void mo19818k(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s = xj4.m31502s(resources, theme, attributeSet, C1652a6.f8791c);
            mo19819l(s, xmlPullParser, theme);
            s.recycle();
        }

        /* renamed from: l */
        public final void mo19819l(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f15566a = null;
            if (xj4.m31501r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f15589a = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f15590a = xz2.m31793d(string2);
                }
                Resources.Theme theme2 = theme;
                this.f15568b = xj4.m31492i(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f15569c = xj4.m31493j(typedArray, xmlPullParser, "fillAlpha", 12, this.f15569c);
                this.f15563a = mo19816i(xj4.m31494k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f15563a);
                this.f15564a = mo19817j(xj4.m31494k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f15564a);
                this.f15573g = xj4.m31493j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f15573g);
                this.f15565a = xj4.m31492i(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f15567b = xj4.m31493j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f15567b);
                this.f15562a = xj4.m31493j(typedArray, xmlPullParser, "strokeWidth", 4, this.f15562a);
                this.f15571e = xj4.m31493j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f15571e);
                this.f15572f = xj4.m31493j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f15572f);
                this.f15570d = xj4.m31493j(typedArray, xmlPullParser, "trimPathStart", 5, this.f15570d);
                this.f15588a = xj4.m31494k(typedArray, xmlPullParser, "fillType", 13, this.f15588a);
            }
        }

        public void setFillAlpha(float f) {
            this.f15569c = f;
        }

        public void setFillColor(int i) {
            this.f15568b.mo24693k(i);
        }

        public void setStrokeAlpha(float f) {
            this.f15567b = f;
        }

        public void setStrokeColor(int i) {
            this.f15565a.mo24693k(i);
        }

        public void setStrokeWidth(float f) {
            this.f15562a = f;
        }

        public void setTrimPathEnd(float f) {
            this.f15571e = f;
        }

        public void setTrimPathOffset(float f) {
            this.f15572f = f;
        }

        public void setTrimPathStart(float f) {
            this.f15570d = f;
        }
    }

    /* renamed from: com.onedelhi.secure.ls4$d */
    public static class C2776d extends C2777e {

        /* renamed from: a */
        public float f15574a;

        /* renamed from: a */
        public int f15575a;

        /* renamed from: a */
        public final Matrix f15576a;

        /* renamed from: a */
        public String f15577a;

        /* renamed from: a */
        public final ArrayList<C2777e> f15578a;

        /* renamed from: a */
        public int[] f15579a;

        /* renamed from: b */
        public float f15580b;

        /* renamed from: b */
        public final Matrix f15581b;

        /* renamed from: c */
        public float f15582c;

        /* renamed from: d */
        public float f15583d;

        /* renamed from: e */
        public float f15584e;

        /* renamed from: f */
        public float f15585f;

        /* renamed from: g */
        public float f15586g;

        public C2776d() {
            super();
            this.f15576a = new Matrix();
            this.f15578a = new ArrayList<>();
            this.f15574a = 0.0f;
            this.f15580b = 0.0f;
            this.f15582c = 0.0f;
            this.f15583d = 1.0f;
            this.f15584e = 1.0f;
            this.f15585f = 0.0f;
            this.f15586g = 0.0f;
            this.f15581b = new Matrix();
            this.f15577a = null;
        }

        public C2776d(C2776d dVar, C3042oa<String, Object> oaVar) {
            super();
            C2778f fVar;
            this.f15576a = new Matrix();
            this.f15578a = new ArrayList<>();
            this.f15574a = 0.0f;
            this.f15580b = 0.0f;
            this.f15582c = 0.0f;
            this.f15583d = 1.0f;
            this.f15584e = 1.0f;
            this.f15585f = 0.0f;
            this.f15586g = 0.0f;
            Matrix matrix = new Matrix();
            this.f15581b = matrix;
            this.f15577a = null;
            this.f15574a = dVar.f15574a;
            this.f15580b = dVar.f15580b;
            this.f15582c = dVar.f15582c;
            this.f15583d = dVar.f15583d;
            this.f15584e = dVar.f15584e;
            this.f15585f = dVar.f15585f;
            this.f15586g = dVar.f15586g;
            this.f15579a = dVar.f15579a;
            String str = dVar.f15577a;
            this.f15577a = str;
            this.f15575a = dVar.f15575a;
            if (str != null) {
                oaVar.put(str, this);
            }
            matrix.set(dVar.f15581b);
            ArrayList<C2777e> arrayList = dVar.f15578a;
            for (int i = 0; i < arrayList.size(); i++) {
                C2777e eVar = arrayList.get(i);
                if (eVar instanceof C2776d) {
                    this.f15578a.add(new C2776d((C2776d) eVar, oaVar));
                } else {
                    if (eVar instanceof C2775c) {
                        fVar = new C2775c((C2775c) eVar);
                    } else if (eVar instanceof C2774b) {
                        fVar = new C2774b((C2774b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f15578a.add(fVar);
                    String str2 = fVar.f15589a;
                    if (str2 != null) {
                        oaVar.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public boolean mo19804a() {
            for (int i = 0; i < this.f15578a.size(); i++) {
                if (this.f15578a.get(i).mo19804a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo19805b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f15578a.size(); i++) {
                z |= this.f15578a.get(i).mo19805b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public void mo19828c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s = xj4.m31502s(resources, theme, attributeSet, C1652a6.f8788b);
            mo19830e(s, xmlPullParser);
            s.recycle();
        }

        /* renamed from: d */
        public final void mo19829d() {
            this.f15581b.reset();
            this.f15581b.postTranslate(-this.f15580b, -this.f15582c);
            this.f15581b.postScale(this.f15583d, this.f15584e);
            this.f15581b.postRotate(this.f15574a, 0.0f, 0.0f);
            this.f15581b.postTranslate(this.f15585f + this.f15580b, this.f15586g + this.f15582c);
        }

        /* renamed from: e */
        public final void mo19830e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f15579a = null;
            this.f15574a = xj4.m31493j(typedArray, xmlPullParser, ly1.f15667d, 5, this.f15574a);
            this.f15580b = typedArray.getFloat(1, this.f15580b);
            this.f15582c = typedArray.getFloat(2, this.f15582c);
            this.f15583d = xj4.m31493j(typedArray, xmlPullParser, "scaleX", 3, this.f15583d);
            this.f15584e = xj4.m31493j(typedArray, xmlPullParser, "scaleY", 4, this.f15584e);
            this.f15585f = xj4.m31493j(typedArray, xmlPullParser, "translateX", 6, this.f15585f);
            this.f15586g = xj4.m31493j(typedArray, xmlPullParser, "translateY", 7, this.f15586g);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f15577a = string;
            }
            mo19829d();
        }

        public String getGroupName() {
            return this.f15577a;
        }

        public Matrix getLocalMatrix() {
            return this.f15581b;
        }

        public float getPivotX() {
            return this.f15580b;
        }

        public float getPivotY() {
            return this.f15582c;
        }

        public float getRotation() {
            return this.f15574a;
        }

        public float getScaleX() {
            return this.f15583d;
        }

        public float getScaleY() {
            return this.f15584e;
        }

        public float getTranslateX() {
            return this.f15585f;
        }

        public float getTranslateY() {
            return this.f15586g;
        }

        public void setPivotX(float f) {
            if (f != this.f15580b) {
                this.f15580b = f;
                mo19829d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f15582c) {
                this.f15582c = f;
                mo19829d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f15574a) {
                this.f15574a = f;
                mo19829d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f15583d) {
                this.f15583d = f;
                mo19829d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f15584e) {
                this.f15584e = f;
                mo19829d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f15585f) {
                this.f15585f = f;
                mo19829d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f15586g) {
                this.f15586g = f;
                mo19829d();
            }
        }
    }

    /* renamed from: com.onedelhi.secure.ls4$e */
    public static abstract class C2777e {
        public C2777e() {
        }

        /* renamed from: a */
        public boolean mo19804a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo19805b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: com.onedelhi.secure.ls4$f */
    public static abstract class C2778f extends C2777e {

        /* renamed from: c */
        public static final int f15587c = 0;

        /* renamed from: a */
        public int f15588a = 0;

        /* renamed from: a */
        public String f15589a;

        /* renamed from: a */
        public xz2.C3957b[] f15590a = null;

        /* renamed from: b */
        public int f15591b;

        public C2778f() {
            super();
        }

        public C2778f(C2778f fVar) {
            super();
            this.f15589a = fVar.f15589a;
            this.f15591b = fVar.f15591b;
            this.f15590a = xz2.m31795f(fVar.f15590a);
        }

        /* renamed from: c */
        public void mo19806c(Resources.Theme theme) {
        }

        /* renamed from: d */
        public boolean mo19807d() {
            return false;
        }

        /* renamed from: e */
        public boolean mo19801e() {
            return false;
        }

        /* renamed from: f */
        public String mo19847f(xz2.C3957b[] bVarArr) {
            String str = " ";
            for (int i = 0; i < bVarArr.length; i++) {
                str = str + bVarArr[i].f22825a + ar4.f25981a;
                float[] fArr = bVarArr[i].f22826a;
                for (int i2 = 0; i2 < fArr.length; i2++) {
                    str = str + fArr[i2] + vf4.f36537c;
                }
            }
            return str;
        }

        /* renamed from: g */
        public void mo19848g(int i) {
            String str = "";
            for (int i2 = 0; i2 < i; i2++) {
                str = str + "    ";
            }
            Log.v(ls4.f15540b, str + "current path is :" + this.f15589a + " pathData is " + mo19847f(this.f15590a));
        }

        public xz2.C3957b[] getPathData() {
            return this.f15590a;
        }

        public String getPathName() {
            return this.f15589a;
        }

        /* renamed from: h */
        public void mo19851h(Path path) {
            path.reset();
            xz2.C3957b[] bVarArr = this.f15590a;
            if (bVarArr != null) {
                xz2.C3957b.m31804e(bVarArr, path);
            }
        }

        public void setPathData(xz2.C3957b[] bVarArr) {
            if (!xz2.m31791b(this.f15590a, bVarArr)) {
                this.f15590a = xz2.m31795f(bVarArr);
            } else {
                xz2.m31800k(this.f15590a, bVarArr);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.ls4$g */
    public static class C2779g {

        /* renamed from: b */
        public static final Matrix f15592b = new Matrix();

        /* renamed from: a */
        public float f15593a;

        /* renamed from: a */
        public int f15594a;

        /* renamed from: a */
        public final Matrix f15595a;

        /* renamed from: a */
        public Paint f15596a;

        /* renamed from: a */
        public final Path f15597a;

        /* renamed from: a */
        public PathMeasure f15598a;

        /* renamed from: a */
        public final C2776d f15599a;

        /* renamed from: a */
        public final C3042oa<String, Object> f15600a;

        /* renamed from: a */
        public Boolean f15601a;

        /* renamed from: a */
        public String f15602a;

        /* renamed from: b */
        public float f15603b;

        /* renamed from: b */
        public int f15604b;

        /* renamed from: b */
        public Paint f15605b;

        /* renamed from: b */
        public final Path f15606b;

        /* renamed from: c */
        public float f15607c;

        /* renamed from: d */
        public float f15608d;

        public C2779g() {
            this.f15595a = new Matrix();
            this.f15593a = 0.0f;
            this.f15603b = 0.0f;
            this.f15607c = 0.0f;
            this.f15608d = 0.0f;
            this.f15604b = 255;
            this.f15602a = null;
            this.f15601a = null;
            this.f15600a = new C3042oa<>();
            this.f15599a = new C2776d();
            this.f15597a = new Path();
            this.f15606b = new Path();
        }

        public C2779g(C2779g gVar) {
            this.f15595a = new Matrix();
            this.f15593a = 0.0f;
            this.f15603b = 0.0f;
            this.f15607c = 0.0f;
            this.f15608d = 0.0f;
            this.f15604b = 255;
            this.f15602a = null;
            this.f15601a = null;
            C3042oa<String, Object> oaVar = new C3042oa<>();
            this.f15600a = oaVar;
            this.f15599a = new C2776d(gVar.f15599a, oaVar);
            this.f15597a = new Path(gVar.f15597a);
            this.f15606b = new Path(gVar.f15606b);
            this.f15593a = gVar.f15593a;
            this.f15603b = gVar.f15603b;
            this.f15607c = gVar.f15607c;
            this.f15608d = gVar.f15608d;
            this.f15594a = gVar.f15594a;
            this.f15604b = gVar.f15604b;
            this.f15602a = gVar.f15602a;
            String str = gVar.f15602a;
            if (str != null) {
                oaVar.put(str, this);
            }
            this.f15601a = gVar.f15601a;
        }

        /* renamed from: a */
        public static float m20959a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: b */
        public void mo19853b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            mo19854c(this.f15599a, f15592b, canvas, i, i2, colorFilter);
        }

        /* renamed from: c */
        public final void mo19854c(C2776d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f15576a.set(matrix);
            dVar.f15576a.preConcat(dVar.f15581b);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f15578a.size(); i3++) {
                C2777e eVar = dVar.f15578a.get(i3);
                if (eVar instanceof C2776d) {
                    mo19854c((C2776d) eVar, dVar.f15576a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof C2778f) {
                    mo19855d(dVar, (C2778f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        public final void mo19855d(C2776d dVar, C2778f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f15607c;
            float f2 = ((float) i2) / this.f15608d;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f15576a;
            this.f15595a.set(matrix);
            this.f15595a.postScale(f, f2);
            float e = mo19856e(matrix);
            if (e != 0.0f) {
                fVar.mo19851h(this.f15597a);
                Path path = this.f15597a;
                this.f15606b.reset();
                if (fVar.mo19801e()) {
                    this.f15606b.setFillType(fVar.f15588a == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f15606b.addPath(path, this.f15595a);
                    canvas.clipPath(this.f15606b);
                    return;
                }
                C2775c cVar = (C2775c) fVar;
                float f3 = cVar.f15570d;
                if (!(f3 == 0.0f && cVar.f15571e == 1.0f)) {
                    float f4 = cVar.f15572f;
                    float f5 = (f3 + f4) % 1.0f;
                    float f6 = (cVar.f15571e + f4) % 1.0f;
                    if (this.f15598a == null) {
                        this.f15598a = new PathMeasure();
                    }
                    this.f15598a.setPath(this.f15597a, false);
                    float length = this.f15598a.getLength();
                    float f7 = f5 * length;
                    float f8 = f6 * length;
                    path.reset();
                    if (f7 > f8) {
                        this.f15598a.getSegment(f7, length, path, true);
                        this.f15598a.getSegment(0.0f, f8, path, true);
                    } else {
                        this.f15598a.getSegment(f7, f8, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f15606b.addPath(path, this.f15595a);
                if (cVar.f15568b.mo24694l()) {
                    t20 t20 = cVar.f15568b;
                    if (this.f15605b == null) {
                        Paint paint = new Paint(1);
                        this.f15605b = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f15605b;
                    if (t20.mo24690h()) {
                        Shader f9 = t20.mo24689f();
                        f9.setLocalMatrix(this.f15595a);
                        paint2.setShader(f9);
                        paint2.setAlpha(Math.round(cVar.f15569c * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(ls4.m20923a(t20.mo24688e(), cVar.f15569c));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f15606b.setFillType(cVar.f15588a == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f15606b, paint2);
                }
                if (cVar.f15565a.mo24694l()) {
                    t20 t202 = cVar.f15565a;
                    if (this.f15596a == null) {
                        Paint paint3 = new Paint(1);
                        this.f15596a = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f15596a;
                    Paint.Join join = cVar.f15564a;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f15563a;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f15573g);
                    if (t202.mo24690h()) {
                        Shader f10 = t202.mo24689f();
                        f10.setLocalMatrix(this.f15595a);
                        paint4.setShader(f10);
                        paint4.setAlpha(Math.round(cVar.f15567b * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(ls4.m20923a(t202.mo24688e(), cVar.f15567b));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f15562a * min * e);
                    canvas.drawPath(this.f15606b, paint4);
                }
            }
        }

        /* renamed from: e */
        public final float mo19856e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a = m20959a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: f */
        public boolean mo19857f() {
            if (this.f15601a == null) {
                this.f15601a = Boolean.valueOf(this.f15599a.mo19804a());
            }
            return this.f15601a.booleanValue();
        }

        /* renamed from: g */
        public boolean mo19858g(int[] iArr) {
            return this.f15599a.mo19805b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f15604b;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f15604b = i;
        }
    }

    /* renamed from: com.onedelhi.secure.ls4$h */
    public static class C2780h extends Drawable.ConstantState {

        /* renamed from: a */
        public int f15609a;

        /* renamed from: a */
        public ColorStateList f15610a;

        /* renamed from: a */
        public Bitmap f15611a;

        /* renamed from: a */
        public Paint f15612a;

        /* renamed from: a */
        public PorterDuff.Mode f15613a;

        /* renamed from: a */
        public C2779g f15614a;

        /* renamed from: a */
        public boolean f15615a;

        /* renamed from: a */
        public int[] f15616a;

        /* renamed from: b */
        public int f15617b;

        /* renamed from: b */
        public ColorStateList f15618b;

        /* renamed from: b */
        public PorterDuff.Mode f15619b;

        /* renamed from: b */
        public boolean f15620b;

        /* renamed from: c */
        public boolean f15621c;

        public C2780h() {
            this.f15610a = null;
            this.f15613a = ls4.f15539a;
            this.f15614a = new C2779g();
        }

        public C2780h(C2780h hVar) {
            this.f15610a = null;
            this.f15613a = ls4.f15539a;
            if (hVar != null) {
                this.f15609a = hVar.f15609a;
                C2779g gVar = new C2779g(hVar.f15614a);
                this.f15614a = gVar;
                if (hVar.f15614a.f15605b != null) {
                    gVar.f15605b = new Paint(hVar.f15614a.f15605b);
                }
                if (hVar.f15614a.f15596a != null) {
                    this.f15614a.f15596a = new Paint(hVar.f15614a.f15596a);
                }
                this.f15610a = hVar.f15610a;
                this.f15613a = hVar.f15613a;
                this.f15615a = hVar.f15615a;
            }
        }

        /* renamed from: a */
        public boolean mo19863a(int i, int i2) {
            return i == this.f15611a.getWidth() && i2 == this.f15611a.getHeight();
        }

        /* renamed from: b */
        public boolean mo19864b() {
            return !this.f15621c && this.f15618b == this.f15610a && this.f15619b == this.f15613a && this.f15620b == this.f15615a && this.f15617b == this.f15614a.getRootAlpha();
        }

        /* renamed from: c */
        public void mo19865c(int i, int i2) {
            if (this.f15611a == null || !mo19863a(i, i2)) {
                this.f15611a = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f15621c = true;
            }
        }

        /* renamed from: d */
        public void mo19866d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f15611a, (Rect) null, rect, mo19867e(colorFilter));
        }

        /* renamed from: e */
        public Paint mo19867e(ColorFilter colorFilter) {
            if (!mo19868f() && colorFilter == null) {
                return null;
            }
            if (this.f15612a == null) {
                Paint paint = new Paint();
                this.f15612a = paint;
                paint.setFilterBitmap(true);
            }
            this.f15612a.setAlpha(this.f15614a.getRootAlpha());
            this.f15612a.setColorFilter(colorFilter);
            return this.f15612a;
        }

        /* renamed from: f */
        public boolean mo19868f() {
            return this.f15614a.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean mo19869g() {
            return this.f15614a.mo19857f();
        }

        public int getChangingConfigurations() {
            return this.f15609a;
        }

        /* renamed from: h */
        public boolean mo19871h(int[] iArr) {
            boolean g = this.f15614a.mo19858g(iArr);
            this.f15621c |= g;
            return g;
        }

        /* renamed from: i */
        public void mo19872i() {
            this.f15618b = this.f15610a;
            this.f15619b = this.f15613a;
            this.f15617b = this.f15614a.getRootAlpha();
            this.f15620b = this.f15615a;
            this.f15621c = false;
        }

        /* renamed from: j */
        public void mo19873j(int i, int i2) {
            this.f15611a.eraseColor(0);
            this.f15614a.mo19853b(new Canvas(this.f15611a), i, i2, (ColorFilter) null);
        }

        @mr2
        public Drawable newDrawable() {
            return new ls4(this);
        }

        @mr2
        public Drawable newDrawable(Resources resources) {
            return new ls4(this);
        }
    }

    @sj3(24)
    /* renamed from: com.onedelhi.secure.ls4$i */
    public static class C2781i extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f15622a;

        public C2781i(Drawable.ConstantState constantState) {
            this.f15622a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f15622a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f15622a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            ls4 ls4 = new ls4();
            ls4.f15073a = (VectorDrawable) this.f15622a.newDrawable();
            return ls4;
        }

        public Drawable newDrawable(Resources resources) {
            ls4 ls4 = new ls4();
            ls4.f15073a = (VectorDrawable) this.f15622a.newDrawable(resources);
            return ls4;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            ls4 ls4 = new ls4();
            ls4.f15073a = (VectorDrawable) this.f15622a.newDrawable(resources, theme);
            return ls4;
        }
    }

    public ls4() {
        this.f15561c = true;
        this.f15559a = new float[9];
        this.f15554a = new Matrix();
        this.f15556a = new Rect();
        this.f15558a = new C2780h();
    }

    public ls4(@mr2 C2780h hVar) {
        this.f15561c = true;
        this.f15559a = new float[9];
        this.f15554a = new Matrix();
        this.f15556a = new Rect();
        this.f15558a = hVar;
        this.f15555a = mo19793o(this.f15555a, hVar.f15610a, hVar.f15613a);
    }

    /* renamed from: a */
    public static int m20923a(int i, float f) {
        return (i & jt4.f14542r) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[Catch:{ IOException | XmlPullParserException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[Catch:{ IOException | XmlPullParserException -> 0x0045 }] */
    @com.onedelhi.secure.ts2
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.ls4 m20924e(@com.onedelhi.secure.mr2 android.content.res.Resources r6, @com.onedelhi.secure.dp0 int r7, @com.onedelhi.secure.ts2 android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0023
            com.onedelhi.secure.ls4 r0 = new com.onedelhi.secure.ls4
            r0.<init>()
            android.graphics.drawable.Drawable r6 = com.onedelhi.secure.zk3.m33204g(r6, r7, r8)
            r0.f15073a = r6
            com.onedelhi.secure.ls4$i r6 = new com.onedelhi.secure.ls4$i
            android.graphics.drawable.Drawable r7 = r0.f15073a
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            r0.f15557a = r6
            return r0
        L_0x0023:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
        L_0x002b:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            r4 = 2
            if (r3 == r4) goto L_0x0036
            r5 = 1
            if (r3 == r5) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            if (r3 != r4) goto L_0x003d
            com.onedelhi.secure.ls4 r6 = m20925f(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            return r6
        L_0x003d:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
        L_0x0045:
            r6 = move-exception
            goto L_0x0048
        L_0x0047:
            r6 = move-exception
        L_0x0048:
            android.util.Log.e(r1, r0, r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ls4.m20924e(android.content.res.Resources, int, android.content.res.Resources$Theme):com.onedelhi.secure.ls4");
    }

    /* renamed from: f */
    public static ls4 m20925f(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        ls4 ls4 = new ls4();
        ls4.inflate(resources, xmlPullParser, attributeSet, theme);
        return ls4;
    }

    /* renamed from: k */
    public static PorterDuff.Mode m20926k(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f15073a;
        if (drawable == null) {
            return false;
        }
        wo0.m30973b(drawable);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f15556a);
        if (this.f15556a.width() > 0 && this.f15556a.height() > 0) {
            ColorFilter colorFilter = this.f15553a;
            if (colorFilter == null) {
                colorFilter = this.f15555a;
            }
            canvas.getMatrix(this.f15554a);
            this.f15554a.getValues(this.f15559a);
            float abs = Math.abs(this.f15559a[0]);
            float abs2 = Math.abs(this.f15559a[4]);
            float abs3 = Math.abs(this.f15559a[1]);
            float abs4 = Math.abs(this.f15559a[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f15556a.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f15556a.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f15556a;
                canvas.translate((float) rect.left, (float) rect.top);
                if (mo19788j()) {
                    canvas.translate((float) this.f15556a.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f15556a.offsetTo(0, 0);
                this.f15558a.mo19865c(min, min2);
                if (!this.f15561c) {
                    this.f15558a.mo19873j(min, min2);
                } else if (!this.f15558a.mo19864b()) {
                    this.f15558a.mo19873j(min, min2);
                    this.f15558a.mo19872i();
                }
                this.f15558a.mo19866d(canvas, colorFilter, this.f15556a);
                canvas.restoreToCount(save);
            }
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: g */
    public float mo19773g() {
        C2779g gVar;
        C2780h hVar = this.f15558a;
        if (hVar == null || (gVar = hVar.f15614a) == null) {
            return 1.0f;
        }
        float f = gVar.f15593a;
        if (f == 0.0f) {
            return 1.0f;
        }
        float f2 = gVar.f15603b;
        if (f2 == 0.0f) {
            return 1.0f;
        }
        float f3 = gVar.f15608d;
        if (f3 == 0.0f) {
            return 1.0f;
        }
        float f4 = gVar.f15607c;
        if (f4 == 0.0f) {
            return 1.0f;
        }
        return Math.min(f4 / f, f3 / f2);
    }

    public int getAlpha() {
        Drawable drawable = this.f15073a;
        return drawable != null ? wo0.m30975d(drawable) : this.f15558a.f15614a.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f15073a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f15558a.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f15073a;
        return drawable != null ? wo0.m30976e(drawable) : this.f15553a;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f15073a != null && Build.VERSION.SDK_INT >= 24) {
            return new C2781i(this.f15073a.getConstantState());
        }
        this.f15558a.f15609a = getChangingConfigurations();
        return this.f15558a;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f15073a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f15558a.f15614a.f15603b;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f15073a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f15558a.f15614a.f15593a;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
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

    /* renamed from: h */
    public Object mo19781h(String str) {
        return this.f15558a.f15614a.f15600a.get(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: com.onedelhi.secure.ls4$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: com.onedelhi.secure.ls4$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: com.onedelhi.secure.ls4$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: com.onedelhi.secure.ls4$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: com.onedelhi.secure.ls4$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19782i(android.content.res.Resources r11, org.xmlpull.v1.XmlPullParser r12, android.util.AttributeSet r13, android.content.res.Resources.Theme r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r10 = this;
            com.onedelhi.secure.ls4$h r0 = r10.f15558a
            com.onedelhi.secure.ls4$g r1 = r0.f15614a
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            com.onedelhi.secure.ls4$d r3 = r1.f15599a
            r2.push(r3)
            int r3 = r12.getEventType()
            int r4 = r12.getDepth()
            r5 = 1
            int r4 = r4 + r5
            r6 = 1
        L_0x0019:
            if (r3 == r5) goto L_0x00c4
            int r7 = r12.getDepth()
            r8 = 3
            if (r7 >= r4) goto L_0x0024
            if (r3 == r8) goto L_0x00c4
        L_0x0024:
            r7 = 2
            java.lang.String r9 = "group"
            if (r3 != r7) goto L_0x00af
            java.lang.String r3 = r12.getName()
            java.lang.Object r7 = r2.peek()
            com.onedelhi.secure.ls4$d r7 = (com.onedelhi.secure.ls4.C2776d) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0059
            com.onedelhi.secure.ls4$c r3 = new com.onedelhi.secure.ls4$c
            r3.<init>()
            r3.mo19818k(r11, r13, r14, r12)
            java.util.ArrayList<com.onedelhi.secure.ls4$e> r6 = r7.f15578a
            r6.add(r3)
            java.lang.String r6 = r3.getPathName()
            if (r6 == 0) goto L_0x0057
            com.onedelhi.secure.oa<java.lang.String, java.lang.Object> r6 = r1.f15600a
            java.lang.String r7 = r3.getPathName()
            r6.put(r7, r3)
        L_0x0057:
            r6 = 0
            goto L_0x007d
        L_0x0059:
            java.lang.String r8 = "clip-path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0085
            com.onedelhi.secure.ls4$b r3 = new com.onedelhi.secure.ls4$b
            r3.<init>()
            r3.mo19802i(r11, r13, r14, r12)
            java.util.ArrayList<com.onedelhi.secure.ls4$e> r7 = r7.f15578a
            r7.add(r3)
            java.lang.String r7 = r3.getPathName()
            if (r7 == 0) goto L_0x007d
            com.onedelhi.secure.oa<java.lang.String, java.lang.Object> r7 = r1.f15600a
            java.lang.String r8 = r3.getPathName()
            r7.put(r8, r3)
        L_0x007d:
            int r7 = r0.f15609a
            int r3 = r3.f15591b
        L_0x0081:
            r3 = r3 | r7
            r0.f15609a = r3
            goto L_0x00be
        L_0x0085:
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            com.onedelhi.secure.ls4$d r3 = new com.onedelhi.secure.ls4$d
            r3.<init>()
            r3.mo19828c(r11, r13, r14, r12)
            java.util.ArrayList<com.onedelhi.secure.ls4$e> r7 = r7.f15578a
            r7.add(r3)
            r2.push(r3)
            java.lang.String r7 = r3.getGroupName()
            if (r7 == 0) goto L_0x00aa
            com.onedelhi.secure.oa<java.lang.String, java.lang.Object> r7 = r1.f15600a
            java.lang.String r8 = r3.getGroupName()
            r7.put(r8, r3)
        L_0x00aa:
            int r7 = r0.f15609a
            int r3 = r3.f15575a
            goto L_0x0081
        L_0x00af:
            if (r3 != r8) goto L_0x00be
            java.lang.String r3 = r12.getName()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            r2.pop()
        L_0x00be:
            int r3 = r12.next()
            goto L_0x0019
        L_0x00c4:
            if (r6 != 0) goto L_0x00c7
            return
        L_0x00c7:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r12 = "no path defined"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ls4.mo19782i(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            wo0.m30978g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C2780h hVar = this.f15558a;
        hVar.f15614a = new C2779g();
        TypedArray s = xj4.m31502s(resources, theme, attributeSet, C1652a6.f8785a);
        mo19792n(s, xmlPullParser, theme);
        s.recycle();
        hVar.f15609a = getChangingConfigurations();
        hVar.f15621c = true;
        mo19782i(resources, xmlPullParser, attributeSet, theme);
        this.f15555a = mo19793o(this.f15555a, hVar.f15610a, hVar.f15613a);
    }

    public void invalidateSelf() {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f15073a;
        return drawable != null ? wo0.m30979h(drawable) : this.f15558a.f15615a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f15558a.f15610a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f15558a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f15073a
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            com.onedelhi.secure.ls4$h r0 = r1.f15558a
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.mo19869g()
            if (r0 != 0) goto L_0x0028
            com.onedelhi.secure.ls4$h r0 = r1.f15558a
            android.content.res.ColorStateList r0 = r0.f15610a
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ls4.isStateful():boolean");
    }

    /* renamed from: j */
    public final boolean mo19788j() {
        return isAutoMirrored() && wo0.m30977f(this) == 1;
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    /* renamed from: l */
    public final void mo19789l(C2776d dVar, int i) {
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            str = str + "    ";
        }
        Log.v(f15540b, str + "current group is :" + dVar.getGroupName() + " rotation is " + dVar.f15574a);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("matrix is :");
        sb.append(dVar.getLocalMatrix().toString());
        Log.v(f15540b, sb.toString());
        for (int i3 = 0; i3 < dVar.f15578a.size(); i3++) {
            C2777e eVar = dVar.f15578a.get(i3);
            if (eVar instanceof C2776d) {
                mo19789l((C2776d) eVar, i + 1);
            } else {
                ((C2778f) eVar).mo19848g(i + 1);
            }
        }
    }

    /* renamed from: m */
    public void mo19790m(boolean z) {
        this.f15561c = z;
    }

    public Drawable mutate() {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f15560b && super.mutate() == this) {
            this.f15558a = new C2780h(this.f15558a);
            this.f15560b = true;
        }
        return this;
    }

    /* renamed from: n */
    public final void mo19792n(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C2780h hVar = this.f15558a;
        C2779g gVar = hVar.f15614a;
        hVar.f15613a = m20926k(xj4.m31494k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList g = xj4.m31490g(typedArray, xmlPullParser, theme, "tint", 1);
        if (g != null) {
            hVar.f15610a = g;
        }
        hVar.f15615a = xj4.m31488e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f15615a);
        gVar.f15607c = xj4.m31493j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f15607c);
        float j = xj4.m31493j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f15608d);
        gVar.f15608d = j;
        if (gVar.f15607c <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (j > 0.0f) {
            gVar.f15593a = typedArray.getDimension(3, gVar.f15593a);
            float dimension = typedArray.getDimension(2, gVar.f15603b);
            gVar.f15603b = dimension;
            if (gVar.f15593a <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(xj4.m31493j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f15602a = string;
                    gVar.f15600a.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    /* renamed from: o */
    public PorterDuffColorFilter mo19793o(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C2780h hVar = this.f15558a;
        ColorStateList colorStateList = hVar.f15610a;
        if (!(colorStateList == null || (mode = hVar.f15613a) == null)) {
            this.f15555a = mo19793o(this.f15555a, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.mo19869g() || !hVar.mo19871h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f15558a.f15614a.getRootAlpha() != i) {
            this.f15558a.f15614a.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            wo0.m30981j(drawable, z);
        } else {
            this.f15558a.f15615a = z;
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
            return;
        }
        this.f15553a = colorFilter;
        invalidateSelf();
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
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            wo0.m30986o(drawable, colorStateList);
            return;
        }
        C2780h hVar = this.f15558a;
        if (hVar.f15610a != colorStateList) {
            hVar.f15610a = colorStateList;
            this.f15555a = mo19793o(this.f15555a, colorStateList, hVar.f15613a);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            wo0.m30987p(drawable, mode);
            return;
        }
        C2780h hVar = this.f15558a;
        if (hVar.f15613a != mode) {
            hVar.f15613a = mode;
            this.f15555a = mo19793o(this.f15555a, hVar.f15610a, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f15073a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f15073a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
