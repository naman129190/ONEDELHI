package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.onedelhi.secure.hl3;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public final class o10 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f17640a = new ThreadLocal<>();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    @com.onedelhi.secure.mr2
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m23247a(@com.onedelhi.secure.mr2 android.content.res.Resources r4, @com.onedelhi.secure.mr2 org.xmlpull.v1.XmlPullParser r5, @com.onedelhi.secure.ts2 android.content.res.Resources.Theme r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
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
            android.content.res.ColorStateList r4 = m23248b(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.o10.m23247a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    @mr2
    /* renamed from: b */
    public static ColorStateList m23248b(@mr2 Resources resources, @mr2 XmlPullParser xmlPullParser, @mr2 AttributeSet attributeSet, @ts2 Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m23251e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    @mr2
    /* renamed from: c */
    public static TypedValue m23249c() {
        ThreadLocal<TypedValue> threadLocal = f17640a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @ts2
    /* renamed from: d */
    public static ColorStateList m23250d(@mr2 Resources resources, @ez4 int i, @ts2 Resources.Theme theme) {
        try {
            return m23247a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object[]] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        if (r9.hasValue(r12) != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        if (r9.hasValue(r12) != false) goto L_0x008b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m23251e(@com.onedelhi.secure.mr2 android.content.res.Resources r17, @com.onedelhi.secure.mr2 org.xmlpull.v1.XmlPullParser r18, @com.onedelhi.secure.mr2 android.util.AttributeSet r19, @com.onedelhi.secure.ts2 android.content.res.Resources.Theme r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r17
            r1 = r19
            r2 = r20
            int r3 = r18.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r8 = 0
        L_0x0013:
            int r9 = r18.next()
            if (r9 == r4) goto L_0x00e0
            int r10 = r18.getDepth()
            if (r10 >= r3) goto L_0x0022
            r11 = 3
            if (r9 == r11) goto L_0x00e0
        L_0x0022:
            r11 = 2
            if (r9 != r11) goto L_0x00db
            if (r10 > r3) goto L_0x00db
            java.lang.String r9 = r18.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0035
            goto L_0x00db
        L_0x0035:
            int[] r9 = com.onedelhi.secure.nd3.C2974j.ColorStateListItem
            android.content.res.TypedArray r9 = m23254h(r0, r2, r1, r9)
            int r10 = com.onedelhi.secure.nd3.C2974j.ColorStateListItem_android_color
            r11 = -1
            int r12 = r9.getResourceId(r10, r11)
            r13 = -65281(0xffffffffffff00ff, float:NaN)
            if (r12 == r11) goto L_0x005c
            boolean r11 = m23252f(r0, r12)
            if (r11 != 0) goto L_0x005c
            android.content.res.XmlResourceParser r10 = r0.getXml(r12)     // Catch:{ Exception -> 0x005a }
            android.content.res.ColorStateList r10 = m23247a(r0, r10, r2)     // Catch:{ Exception -> 0x005a }
            int r10 = r10.getDefaultColor()     // Catch:{ Exception -> 0x005a }
            goto L_0x0060
        L_0x005a:
            int r10 = com.onedelhi.secure.nd3.C2974j.ColorStateListItem_android_color
        L_0x005c:
            int r10 = r9.getColor(r10, r13)
        L_0x0060:
            r11 = 1065353216(0x3f800000, float:1.0)
            int r12 = com.onedelhi.secure.nd3.C2974j.ColorStateListItem_android_alpha
            boolean r13 = r9.hasValue(r12)
            if (r13 == 0) goto L_0x006f
        L_0x006a:
            float r11 = r9.getFloat(r12, r11)
            goto L_0x0078
        L_0x006f:
            int r12 = com.onedelhi.secure.nd3.C2974j.ColorStateListItem_alpha
            boolean r13 = r9.hasValue(r12)
            if (r13 == 0) goto L_0x0078
            goto L_0x006a
        L_0x0078:
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 31
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r12 < r13) goto L_0x0089
            int r12 = com.onedelhi.secure.nd3.C2974j.ColorStateListItem_android_lStar
            boolean r13 = r9.hasValue(r12)
            if (r13 == 0) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            int r12 = com.onedelhi.secure.nd3.C2974j.ColorStateListItem_lStar
        L_0x008b:
            float r12 = r9.getFloat(r12, r14)
            r9.recycle()
            int r9 = r19.getAttributeCount()
            int[] r13 = new int[r9]
            r14 = 0
            r15 = 0
        L_0x009a:
            if (r14 >= r9) goto L_0x00c6
            int r4 = r1.getAttributeNameResource(r14)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r4 == r7) goto L_0x00c0
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r4 == r7) goto L_0x00c0
            int r7 = com.onedelhi.secure.nd3.C2965a.alpha
            if (r4 == r7) goto L_0x00c0
            int r7 = com.onedelhi.secure.nd3.C2965a.lStar
            if (r4 == r7) goto L_0x00c0
            int r7 = r15 + 1
            r0 = 0
            boolean r16 = r1.getAttributeBooleanValue(r14, r0)
            if (r16 == 0) goto L_0x00bc
            goto L_0x00bd
        L_0x00bc:
            int r4 = -r4
        L_0x00bd:
            r13[r15] = r4
            r15 = r7
        L_0x00c0:
            int r14 = r14 + 1
            r4 = 1
            r0 = r17
            goto L_0x009a
        L_0x00c6:
            int[] r0 = android.util.StateSet.trimStateSet(r13, r15)
            int r4 = m23253g(r10, r11, r12)
            int[] r5 = com.onedelhi.secure.ej1.m13819a(r5, r8, r4)
            java.lang.Object[] r0 = com.onedelhi.secure.ej1.m13821c(r6, r8, r0)
            r6 = r0
            int[][] r6 = (int[][]) r6
            int r8 = r8 + 1
        L_0x00db:
            r4 = 1
            r0 = r17
            goto L_0x0013
        L_0x00e0:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r8)
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.o10.m23251e(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* renamed from: f */
    public static boolean m23252f(@mr2 Resources resources, @k10 int i) {
        TypedValue c = m23249c();
        resources.getValue(i, c, true);
        int i2 = c.type;
        return i2 >= 28 && i2 <= 31;
    }

    @d10
    /* renamed from: g */
    public static int m23253g(@d10 int i, @d81(from = 0.0d, mo14561to = 1.0d) float f, @d81(from = 0.0d, mo14561to = 100.0d) float f2) {
        boolean z = f2 >= 0.0f && f2 <= 100.0f;
        if (f == 1.0f && !z) {
            return i;
        }
        int e = rf2.m26699e((int) ((((float) Color.alpha(i)) * f) + 0.5f), 0, 255);
        if (z) {
            C2103et c = C2103et.m14346c(i);
            i = C2103et.m14350p(c.mo15582j(), c.mo15581i(), f2);
        }
        return (i & jt4.f14542r) | (e << 24);
    }

    /* renamed from: h */
    public static TypedArray m23254h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
