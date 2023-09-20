package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import android.util.Log;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public final class t20 {

    /* renamed from: a */
    public static final String f20628a = "ComplexColorCompat";

    /* renamed from: a */
    public int f20629a;

    /* renamed from: a */
    public final ColorStateList f20630a;

    /* renamed from: a */
    public final Shader f20631a;

    public t20(Shader shader, ColorStateList colorStateList, @d10 int i) {
        this.f20631a = shader;
        this.f20630a = colorStateList;
        this.f20629a = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    @com.onedelhi.secure.mr2
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.t20 m28074a(@com.onedelhi.secure.mr2 android.content.res.Resources r4, @com.onedelhi.secure.k10 int r5, @com.onedelhi.secure.ts2 android.content.res.Resources.Theme r6) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0008:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x0013
            r3 = 1
            if (r1 == r3) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            if (r1 != r2) goto L_0x005c
            java.lang.String r1 = r5.getName()
            r1.hashCode()
            java.lang.String r2 = "gradient"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0053
            java.lang.String r2 = "selector"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0035
            android.content.res.ColorStateList r4 = com.onedelhi.secure.o10.m23248b(r4, r5, r0, r6)
            com.onedelhi.secure.t20 r4 = m28076c(r4)
            return r4
        L_0x0035:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.getPositionDescription()
            r6.append(r5)
            java.lang.String r5 = ": unsupported complex color tag "
            r6.append(r5)
            r6.append(r1)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L_0x0053:
            android.graphics.Shader r4 = com.onedelhi.secure.fi1.m14916c(r4, r5, r0, r6)
            com.onedelhi.secure.t20 r4 = m28077d(r4)
            return r4
        L_0x005c:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.t20.m28074a(android.content.res.Resources, int, android.content.res.Resources$Theme):com.onedelhi.secure.t20");
    }

    /* renamed from: b */
    public static t20 m28075b(@d10 int i) {
        return new t20((Shader) null, (ColorStateList) null, i);
    }

    /* renamed from: c */
    public static t20 m28076c(@mr2 ColorStateList colorStateList) {
        return new t20((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    public static t20 m28077d(@mr2 Shader shader) {
        return new t20(shader, (ColorStateList) null, 0);
    }

    @ts2
    /* renamed from: g */
    public static t20 m28078g(@mr2 Resources resources, @k10 int i, @ts2 Resources.Theme theme) {
        try {
            return m28074a(resources, i, theme);
        } catch (Exception e) {
            Log.e(f20628a, "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    @d10
    /* renamed from: e */
    public int mo24688e() {
        return this.f20629a;
    }

    @ts2
    /* renamed from: f */
    public Shader mo24689f() {
        return this.f20631a;
    }

    /* renamed from: h */
    public boolean mo24690h() {
        return this.f20631a != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f20630a;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24691i() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.f20631a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f20630a
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.t20.mo24691i():boolean");
    }

    /* renamed from: j */
    public boolean mo24692j(int[] iArr) {
        if (mo24691i()) {
            ColorStateList colorStateList = this.f20630a;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f20629a) {
                this.f20629a = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo24693k(@d10 int i) {
        this.f20629a = i;
    }

    /* renamed from: l */
    public boolean mo24694l() {
        return mo24690h() || this.f20629a != 0;
    }
}
