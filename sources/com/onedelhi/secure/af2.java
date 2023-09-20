package com.onedelhi.secure;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.TypedValue;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class af2 {

    /* renamed from: a */
    public static final float f25828a = 1.3f;

    /* renamed from: b */
    public static final float f25829b = 2.0f;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = com.onedelhi.secure.C3129p8.m24528a(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    @com.onedelhi.secure.ts2
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m38610a(@com.onedelhi.secure.mr2 android.content.Context r1, @com.onedelhi.secure.mr2 android.content.res.TypedArray r2, @com.onedelhi.secure.g64 int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.content.res.ColorStateList r1 = com.onedelhi.secure.C3129p8.m24528a(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.content.res.ColorStateList r1 = r2.getColorStateList(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.af2.m38610a(android.content.Context, android.content.res.TypedArray, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = com.onedelhi.secure.C3129p8.m24528a(r1, (r0 = r2.mo13050u(r3, 0)));
     */
    @com.onedelhi.secure.ts2
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m38611b(@com.onedelhi.secure.mr2 android.content.Context r1, @com.onedelhi.secure.mr2 com.onedelhi.secure.af4 r2, @com.onedelhi.secure.g64 int r3) {
        /*
            boolean r0 = r2.mo13026C(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.mo13050u(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.content.res.ColorStateList r1 = com.onedelhi.secure.C3129p8.m24528a(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.content.res.ColorStateList r1 = r2.mo13033d(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.af2.m38611b(android.content.Context, com.onedelhi.secure.af4, int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public static int m38612c(TypedValue typedValue) {
        return Build.VERSION.SDK_INT >= 22 ? typedValue.getComplexUnit() : (typedValue.data >> 0) & 15;
    }

    /* renamed from: d */
    public static int m38613d(@mr2 Context context, @mr2 TypedArray typedArray, @g64 int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = com.onedelhi.secure.C3129p8.m24529b(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    @com.onedelhi.secure.ts2
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable m38614e(@com.onedelhi.secure.mr2 android.content.Context r1, @com.onedelhi.secure.mr2 android.content.res.TypedArray r2, @com.onedelhi.secure.g64 int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r1 = com.onedelhi.secure.C3129p8.m24529b(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.af2.m38614e(android.content.Context, android.content.res.TypedArray, int):android.graphics.drawable.Drawable");
    }

    @g64
    /* renamed from: f */
    public static int m38615f(@mr2 TypedArray typedArray, @g64 int i, @g64 int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    @ts2
    /* renamed from: g */
    public static sa4 m38616g(@mr2 Context context, @mr2 TypedArray typedArray, @g64 int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new sa4(context, resourceId);
    }

    /* renamed from: h */
    public static int m38617h(@mr2 Context context, @e64 int i, int i2) {
        if (i == 0) {
            return i2;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, fd3.C2165o.TextAppearance);
        TypedValue typedValue = new TypedValue();
        boolean value = obtainStyledAttributes.getValue(fd3.C2165o.TextAppearance_android_textSize, typedValue);
        obtainStyledAttributes.recycle();
        return !value ? i2 : m38612c(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    /* renamed from: i */
    public static boolean m38618i(@mr2 Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: j */
    public static boolean m38619j(@mr2 Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
