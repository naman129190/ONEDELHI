package com.onedelhi.secure;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.nd3;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@hl3({hl3.C2354a.f13188c})
public final class fi1 {

    /* renamed from: a */
    public static final int f12066a = 0;

    /* renamed from: b */
    public static final int f12067b = 1;

    /* renamed from: c */
    public static final int f12068c = 2;

    /* renamed from: com.onedelhi.secure.fi1$a */
    public static final class C2169a {

        /* renamed from: a */
        public final float[] f12069a;

        /* renamed from: a */
        public final int[] f12070a;

        public C2169a(@d10 int i, @d10 int i2) {
            this.f12070a = new int[]{i, i2};
            this.f12069a = new float[]{0.0f, 1.0f};
        }

        public C2169a(@d10 int i, @d10 int i2, @d10 int i3) {
            this.f12070a = new int[]{i, i2, i3};
            this.f12069a = new float[]{0.0f, 0.5f, 1.0f};
        }

        public C2169a(@mr2 List<Integer> list, @mr2 List<Float> list2) {
            int size = list.size();
            this.f12070a = new int[size];
            this.f12069a = new float[size];
            for (int i = 0; i < size; i++) {
                this.f12070a[i] = list.get(i).intValue();
                this.f12069a[i] = list2.get(i).floatValue();
            }
        }
    }

    /* renamed from: a */
    public static C2169a m14914a(@ts2 C2169a aVar, @d10 int i, @d10 int i2, boolean z, @d10 int i3) {
        C2169a aVar2;
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return aVar2;
        }
        aVar2 = new C2169a(i, i2);
        return aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Shader m14915b(@com.onedelhi.secure.mr2 android.content.res.Resources r4, @com.onedelhi.secure.mr2 org.xmlpull.v1.XmlPullParser r5, @com.onedelhi.secure.ts2 android.content.res.Resources.Theme r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.graphics.Shader r4 = m14916c(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.fi1.m14915b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.graphics.Shader");
    }

    /* renamed from: c */
    public static Shader m14916c(@mr2 Resources resources, @mr2 XmlPullParser xmlPullParser, @mr2 AttributeSet attributeSet, @ts2 Resources.Theme theme) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            TypedArray s = xj4.m31502s(resources, theme2, attributeSet, nd3.C2974j.GradientColor);
            float j = xj4.m31493j(s, xmlPullParser2, "startX", nd3.C2974j.GradientColor_android_startX, 0.0f);
            float j2 = xj4.m31493j(s, xmlPullParser2, "startY", nd3.C2974j.GradientColor_android_startY, 0.0f);
            float j3 = xj4.m31493j(s, xmlPullParser2, "endX", nd3.C2974j.GradientColor_android_endX, 0.0f);
            float j4 = xj4.m31493j(s, xmlPullParser2, "endY", nd3.C2974j.GradientColor_android_endY, 0.0f);
            float j5 = xj4.m31493j(s, xmlPullParser2, "centerX", nd3.C2974j.GradientColor_android_centerX, 0.0f);
            float j6 = xj4.m31493j(s, xmlPullParser2, "centerY", nd3.C2974j.GradientColor_android_centerY, 0.0f);
            int k = xj4.m31494k(s, xmlPullParser2, "type", nd3.C2974j.GradientColor_android_type, 0);
            int f = xj4.m31489f(s, xmlPullParser2, "startColor", nd3.C2974j.GradientColor_android_startColor, 0);
            boolean r = xj4.m31501r(xmlPullParser2, "centerColor");
            int f2 = xj4.m31489f(s, xmlPullParser2, "centerColor", nd3.C2974j.GradientColor_android_centerColor, 0);
            int f3 = xj4.m31489f(s, xmlPullParser2, "endColor", nd3.C2974j.GradientColor_android_endColor, 0);
            int k2 = xj4.m31494k(s, xmlPullParser2, "tileMode", nd3.C2974j.GradientColor_android_tileMode, 0);
            float f4 = j5;
            float j7 = xj4.m31493j(s, xmlPullParser2, "gradientRadius", nd3.C2974j.GradientColor_android_gradientRadius, 0.0f);
            s.recycle();
            C2169a a = m14914a(m14917d(resources, xmlPullParser, attributeSet, theme), f, f3, r, f2);
            if (k == 1) {
                float f5 = f4;
                if (j7 > 0.0f) {
                    int[] iArr = a.f12070a;
                    return new RadialGradient(f5, j6, j7, iArr, a.f12069a, m14918e(k2));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (k != 2) {
                return new LinearGradient(j, j2, j3, j4, a.f12070a, a.f12069a, m14918e(k2));
            } else {
                return new SweepGradient(f4, j6, a.f12070a, a.f12069a);
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.fi1.C2169a m14917d(@com.onedelhi.secure.mr2 android.content.res.Resources r9, @com.onedelhi.secure.mr2 org.xmlpull.v1.XmlPullParser r10, @com.onedelhi.secure.mr2 android.util.AttributeSet r11, @com.onedelhi.secure.ts2 android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r10.next()
            if (r3 == r1) goto L_0x0081
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0081
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = com.onedelhi.secure.nd3.C2974j.GradientColorItem
            android.content.res.TypedArray r3 = com.onedelhi.secure.xj4.m31502s(r9, r12, r11, r3)
            int r5 = com.onedelhi.secure.nd3.C2974j.GradientColorItem_android_color
            boolean r6 = r3.hasValue(r5)
            int r7 = com.onedelhi.secure.nd3.C2974j.GradientColorItem_android_offset
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L_0x0066
            if (r8 == 0) goto L_0x0066
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x0066:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x0081:
            int r9 = r4.size()
            if (r9 <= 0) goto L_0x008d
            com.onedelhi.secure.fi1$a r9 = new com.onedelhi.secure.fi1$a
            r9.<init>((java.util.List<java.lang.Integer>) r4, (java.util.List<java.lang.Float>) r2)
            return r9
        L_0x008d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.fi1.m14917d(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):com.onedelhi.secure.fi1$a");
    }

    /* renamed from: e */
    public static Shader.TileMode m14918e(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
