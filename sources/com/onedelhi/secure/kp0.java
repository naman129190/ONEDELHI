package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.onedelhi.secure.hl3;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public final class kp0 {
    @ts2
    /* renamed from: a */
    public static Drawable m19966a(@ts2 Drawable drawable, @ts2 Drawable drawable2) {
        int i;
        int i2;
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        if (drawable2.getIntrinsicWidth() == -1 || drawable2.getIntrinsicHeight() == -1) {
            i2 = drawable.getIntrinsicWidth();
            i = drawable.getIntrinsicHeight();
        } else if (drawable2.getIntrinsicWidth() > drawable.getIntrinsicWidth() || drawable2.getIntrinsicHeight() > drawable.getIntrinsicHeight()) {
            float intrinsicWidth = ((float) drawable2.getIntrinsicWidth()) / ((float) drawable2.getIntrinsicHeight());
            if (intrinsicWidth >= ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight())) {
                int intrinsicWidth2 = drawable.getIntrinsicWidth();
                int i3 = (int) (((float) intrinsicWidth2) / intrinsicWidth);
                i2 = intrinsicWidth2;
                i = i3;
            } else {
                i = drawable.getIntrinsicHeight();
                i2 = (int) (intrinsicWidth * ((float) i));
            }
        } else {
            i2 = drawable2.getIntrinsicWidth();
            i = drawable2.getIntrinsicHeight();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            layerDrawable.setLayerSize(1, i2, i);
            layerDrawable.setLayerGravity(1, 17);
        } else {
            int intrinsicWidth3 = (drawable.getIntrinsicWidth() - i2) / 2;
            int intrinsicHeight = (drawable.getIntrinsicHeight() - i) / 2;
            layerDrawable.setLayerInset(1, intrinsicWidth3, intrinsicHeight, intrinsicWidth3, intrinsicHeight);
        }
        return layerDrawable;
    }

    @ts2
    /* renamed from: b */
    public static Drawable m19967b(@ts2 Drawable drawable, @ts2 ColorStateList colorStateList, @ts2 PorterDuff.Mode mode) {
        return m19969d(drawable, colorStateList, mode, false);
    }

    @ts2
    /* renamed from: c */
    public static Drawable m19968c(@ts2 Drawable drawable, @ts2 ColorStateList colorStateList, @ts2 PorterDuff.Mode mode) {
        return m19969d(drawable, colorStateList, mode, Build.VERSION.SDK_INT < 23);
    }

    @ts2
    /* renamed from: d */
    public static Drawable m19969d(@ts2 Drawable drawable, @ts2 ColorStateList colorStateList, @ts2 PorterDuff.Mode mode, boolean z) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = wo0.m30989r(drawable).mutate();
            if (mode != null) {
                wo0.m30987p(drawable, mode);
            }
        } else if (z) {
            drawable.mutate();
        }
        return drawable;
    }

    @mr2
    /* renamed from: e */
    public static int[] m19970e(@mr2 int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == 16842912) {
                return iArr;
            }
            if (iArr[i] == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    @mr2
    /* renamed from: f */
    public static int[] m19971f(@mr2 int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i = 0;
        for (int i2 : iArr) {
            if (i2 != 16842912) {
                iArr2[i] = i2;
                i++;
            }
        }
        return iArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f A[Catch:{ IOException | XmlPullParserException -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014 A[Catch:{ IOException | XmlPullParserException -> 0x0047 }] */
    @com.onedelhi.secure.mr2
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.AttributeSet m19972g(@com.onedelhi.secure.mr2 android.content.Context r3, @com.onedelhi.secure.ez4 int r4, @com.onedelhi.secure.mr2 java.lang.CharSequence r5) {
        /*
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            android.content.res.XmlResourceParser r3 = r3.getXml(r4)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
        L_0x0008:
            int r0 = r3.next()     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            r1 = 2
            if (r0 == r1) goto L_0x0012
            r2 = 1
            if (r0 != r2) goto L_0x0008
        L_0x0012:
            if (r0 != r1) goto L_0x003f
            java.lang.String r0 = r3.getName()     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            boolean r0 = android.text.TextUtils.equals(r0, r5)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            if (r0 == 0) goto L_0x0023
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r3)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            return r3
        L_0x0023:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            java.lang.String r1 = "Must have a <"
            r0.append(r1)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            r0.append(r5)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            java.lang.String r5 = "> start tag"
            r0.append(r5)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            java.lang.String r5 = r0.toString()     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            r3.<init>(r5)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            throw r3     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
        L_0x003f:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            java.lang.String r5 = "No start tag found"
            r3.<init>(r5)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            throw r3     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
        L_0x0047:
            r3 = move-exception
            goto L_0x004a
        L_0x0049:
            r3 = move-exception
        L_0x004a:
            android.content.res.Resources$NotFoundException r5 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't load badge resource ID #0x"
            r0.append(r1)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            r5.initCause(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.kp0.m19972g(android.content.Context, int, java.lang.CharSequence):android.util.AttributeSet");
    }

    @TargetApi(21)
    /* renamed from: h */
    public static void m19973h(@ts2 RippleDrawable rippleDrawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            rippleDrawable.setRadius(i);
            return;
        }
        Class<RippleDrawable> cls = RippleDrawable.class;
        try {
            cls.getDeclaredMethod("setMaxRadius", new Class[]{Integer.TYPE}).invoke(rippleDrawable, new Object[]{Integer.valueOf(i)});
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new IllegalStateException("Couldn't set RippleDrawable radius", e);
        }
    }

    /* renamed from: i */
    public static void m19974i(@mr2 Drawable drawable, @d10 int i) {
        boolean z = i != 0;
        if (Build.VERSION.SDK_INT == 21) {
            if (z) {
                drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            } else {
                drawable.setColorFilter((ColorFilter) null);
            }
        } else if (z) {
            wo0.m30985n(drawable, i);
        } else {
            wo0.m30986o(drawable, (ColorStateList) null);
        }
    }

    @ts2
    /* renamed from: j */
    public static PorterDuffColorFilter m19975j(@mr2 Drawable drawable, @ts2 ColorStateList colorStateList, @ts2 PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
