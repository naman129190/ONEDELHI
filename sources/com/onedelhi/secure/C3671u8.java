package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.za3;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.onedelhi.secure.u8 */
public class C3671u8 {

    /* renamed from: a */
    public static final RectF f21246a = new RectF();

    /* renamed from: a */
    public static final String f21247a = "ACTVAutoSizeHelper";
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a */
    public static ConcurrentHashMap<String, Method> f21248a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final int f21249b = 12;
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: b */
    public static ConcurrentHashMap<String, Field> f21250b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static final int f21251c = 112;

    /* renamed from: d */
    public static final float f21252d = -1.0f;

    /* renamed from: d */
    public static final int f21253d = 1;

    /* renamed from: e */
    public static final int f21254e = 1048576;

    /* renamed from: a */
    public float f21255a = -1.0f;

    /* renamed from: a */
    public int f21256a = 0;

    /* renamed from: a */
    public final Context f21257a;

    /* renamed from: a */
    public TextPaint f21258a;
    @mr2

    /* renamed from: a */
    public final TextView f21259a;

    /* renamed from: a */
    public final C3677f f21260a;

    /* renamed from: a */
    public boolean f21261a = false;

    /* renamed from: a */
    public int[] f21262a = new int[0];

    /* renamed from: b */
    public float f21263b = -1.0f;

    /* renamed from: b */
    public boolean f21264b = false;

    /* renamed from: c */
    public float f21265c = -1.0f;

    @sj3(16)
    /* renamed from: com.onedelhi.secure.u8$a */
    public static final class C3672a {
        @mr2
        @pn0
        /* renamed from: a */
        public static StaticLayout m29159a(@mr2 CharSequence charSequence, @mr2 Layout.Alignment alignment, int i, @mr2 TextView textView, @mr2 TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        @pn0
        /* renamed from: b */
        public static int m29160b(@mr2 TextView textView) {
            return textView.getMaxLines();
        }
    }

    @sj3(18)
    /* renamed from: com.onedelhi.secure.u8$b */
    public static final class C3673b {
        @pn0
        /* renamed from: a */
        public static boolean m29161a(@mr2 View view) {
            return view.isInLayout();
        }
    }

    @sj3(23)
    /* renamed from: com.onedelhi.secure.u8$c */
    public static final class C3674c {
        @mr2
        @pn0
        /* renamed from: a */
        public static StaticLayout m29162a(@mr2 CharSequence charSequence, @mr2 Layout.Alignment alignment, int i, int i2, @mr2 TextView textView, @mr2 TextPaint textPaint, @mr2 C3677f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                fVar.mo25434a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w(C3671u8.f21247a, "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    @sj3(23)
    /* renamed from: com.onedelhi.secure.u8$d */
    public static class C3675d extends C3677f {
        /* renamed from: a */
        public void mo25434a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C3671u8.m29133p(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    @sj3(29)
    /* renamed from: com.onedelhi.secure.u8$e */
    public static class C3676e extends C3675d {
        /* renamed from: a */
        public void mo25434a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* renamed from: b */
        public boolean mo25435b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* renamed from: com.onedelhi.secure.u8$f */
    public static class C3677f {
        /* renamed from: a */
        public void mo25434a(StaticLayout.Builder builder, TextView textView) {
        }

        /* renamed from: b */
        public boolean mo25435b(TextView textView) {
            return ((Boolean) C3671u8.m29133p(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public C3671u8(@mr2 TextView textView) {
        this.f21259a = textView;
        this.f21257a = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        this.f21260a = i >= 29 ? new C3676e() : i >= 23 ? new C3675d() : new C3677f();
    }

    /* renamed from: a */
    public static <T> T m29130a(@mr2 Object obj, @mr2 String str, @mr2 T t) {
        try {
            Field m = m29131m(str);
            return m == null ? t : m.get(obj);
        } catch (IllegalAccessException e) {
            Log.w(f21247a, "Failed to access TextView#" + str + " member", e);
            return t;
        }
    }

    @ts2
    /* renamed from: m */
    public static Field m29131m(@mr2 String str) {
        try {
            Field field = f21250b.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f21250b.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e) {
            Log.w(f21247a, "Failed to access TextView#" + str + " member", e);
            return null;
        }
    }

    @ts2
    /* renamed from: n */
    public static Method m29132n(@mr2 String str) {
        try {
            Method method = f21248a.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f21248a.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w(f21247a, "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: p */
    public static <T> T m29133p(@mr2 Object obj, @mr2 String str, @mr2 T t) {
        try {
            return m29132n(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w(f21247a, "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: A */
    public final boolean mo25409A(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f21259a.getText();
        TransformationMethod transformationMethod = this.f21259a.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f21259a)) == null)) {
            text = transformation;
        }
        int b = C3672a.m29160b(this.f21259a);
        mo25423o(i);
        StaticLayout e = mo25415e(text, (Layout.Alignment) m29133p(this.f21259a, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b);
        return (b == -1 || (e.getLineCount() <= b && e.getLineEnd(e.getLineCount() - 1) == text.length())) && ((float) e.getHeight()) <= rectF.bottom;
    }

    /* renamed from: B */
    public final boolean mo25410B() {
        return !(this.f21259a instanceof AppCompatEditText);
    }

    /* renamed from: C */
    public final void mo25411C(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f21256a = 1;
            this.f21263b = f;
            this.f21265c = f2;
            this.f21255a = f3;
            this.f21264b = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public void mo25412b() {
        if (mo25424q()) {
            if (this.f21261a) {
                if (this.f21259a.getMeasuredHeight() > 0 && this.f21259a.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f21260a.mo25435b(this.f21259a) ? 1048576 : (this.f21259a.getMeasuredWidth() - this.f21259a.getTotalPaddingLeft()) - this.f21259a.getTotalPaddingRight();
                    int height = (this.f21259a.getHeight() - this.f21259a.getCompoundPaddingBottom()) - this.f21259a.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f21246a;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            float g = (float) mo25417g(rectF);
                            if (g != this.f21259a.getTextSize()) {
                                mo25430w(0, g);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f21261a = true;
        }
    }

    /* renamed from: c */
    public final int[] mo25413c(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: d */
    public final void mo25414d() {
        this.f21256a = 0;
        this.f21263b = -1.0f;
        this.f21265c = -1.0f;
        this.f21255a = -1.0f;
        this.f21262a = new int[0];
        this.f21261a = false;
    }

    @hw4
    @mr2
    /* renamed from: e */
    public StaticLayout mo25415e(@mr2 CharSequence charSequence, @mr2 Layout.Alignment alignment, int i, int i2) {
        if (Build.VERSION.SDK_INT < 23) {
            return C3672a.m29159a(charSequence, alignment, i, this.f21259a, this.f21258a);
        }
        return C3674c.m29162a(charSequence, alignment, i, i2, this.f21259a, this.f21258a, this.f21260a);
    }

    /* renamed from: f */
    public final StaticLayout mo25416f(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f21258a, i, alignment, ((Float) m29130a(this.f21259a, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) m29130a(this.f21259a, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) m29130a(this.f21259a, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    /* renamed from: g */
    public final int mo25417g(RectF rectF) {
        int length = this.f21262a.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (mo25409A(this.f21262a[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f21262a[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: h */
    public int mo25418h() {
        return Math.round(this.f21265c);
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: i */
    public int mo25419i() {
        return Math.round(this.f21263b);
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: j */
    public int mo25420j() {
        return Math.round(this.f21255a);
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: k */
    public int[] mo25421k() {
        return this.f21262a;
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: l */
    public int mo25422l() {
        return this.f21256a;
    }

    @hw4
    /* renamed from: o */
    public void mo25423o(int i) {
        TextPaint textPaint = this.f21258a;
        if (textPaint == null) {
            this.f21258a = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f21258a.set(this.f21259a.getPaint());
        this.f21258a.setTextSize((float) i);
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: q */
    public boolean mo25424q() {
        return mo25410B() && this.f21256a != 0;
    }

    /* renamed from: r */
    public void mo25425r(@ts2 AttributeSet attributeSet, int i) {
        int resourceId;
        Context context = this.f21257a;
        int[] iArr = za3.C4068m.AppCompatTextView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.f21259a;
        jt4.m19033z1(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = za3.C4068m.AppCompatTextView_autoSizeTextType;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f21256a = obtainStyledAttributes.getInt(i2, 0);
        }
        int i3 = za3.C4068m.AppCompatTextView_autoSizeStepGranularity;
        float dimension = obtainStyledAttributes.hasValue(i3) ? obtainStyledAttributes.getDimension(i3, -1.0f) : -1.0f;
        int i4 = za3.C4068m.AppCompatTextView_autoSizeMinTextSize;
        float dimension2 = obtainStyledAttributes.hasValue(i4) ? obtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = za3.C4068m.AppCompatTextView_autoSizeMaxTextSize;
        float dimension3 = obtainStyledAttributes.hasValue(i5) ? obtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = za3.C4068m.AppCompatTextView_autoSizePresetSizes;
        if (obtainStyledAttributes.hasValue(i6) && (resourceId = obtainStyledAttributes.getResourceId(i6, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            mo25432y(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!mo25410B()) {
            this.f21256a = 0;
        } else if (this.f21256a == 1) {
            if (!this.f21264b) {
                DisplayMetrics displayMetrics = this.f21257a.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                mo25411C(dimension2, dimension3, dimension);
            }
            mo25431x();
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: s */
    public void mo25426s(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (mo25410B()) {
            DisplayMetrics displayMetrics = this.f21257a.getResources().getDisplayMetrics();
            mo25411C(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (mo25431x()) {
                mo25412b();
            }
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: t */
    public void mo25427t(@mr2 int[] iArr, int i) throws IllegalArgumentException {
        if (mo25410B()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f21257a.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f21262a = mo25413c(iArr2);
                if (!mo25433z()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f21264b = false;
            }
            if (mo25431x()) {
                mo25412b();
            }
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: u */
    public void mo25428u(int i) {
        if (!mo25410B()) {
            return;
        }
        if (i == 0) {
            mo25414d();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f21257a.getResources().getDisplayMetrics();
            mo25411C(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (mo25431x()) {
                mo25412b();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    /* renamed from: v */
    public final void mo25429v(float f) {
        if (f != this.f21259a.getPaint().getTextSize()) {
            this.f21259a.getPaint().setTextSize(f);
            boolean a = C3673b.m29161a(this.f21259a);
            if (this.f21259a.getLayout() != null) {
                this.f21261a = false;
                try {
                    Method n = m29132n("nullLayouts");
                    if (n != null) {
                        n.invoke(this.f21259a, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w(f21247a, "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!a) {
                    this.f21259a.requestLayout();
                } else {
                    this.f21259a.forceLayout();
                }
                this.f21259a.invalidate();
            }
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: w */
    public void mo25430w(int i, float f) {
        Context context = this.f21257a;
        mo25429v(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* renamed from: x */
    public final boolean mo25431x() {
        if (!mo25410B() || this.f21256a != 1) {
            this.f21261a = false;
        } else {
            if (!this.f21264b || this.f21262a.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f21265c - this.f21263b) / this.f21255a))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f21263b + (((float) i) * this.f21255a));
                }
                this.f21262a = mo25413c(iArr);
            }
            this.f21261a = true;
        }
        return this.f21261a;
    }

    /* renamed from: y */
    public final void mo25432y(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f21262a = mo25413c(iArr);
            mo25433z();
        }
    }

    /* renamed from: z */
    public final boolean mo25433z() {
        int[] iArr = this.f21262a;
        int length = iArr.length;
        boolean z = length > 0;
        this.f21264b = z;
        if (z) {
            this.f21256a = 1;
            this.f21263b = (float) iArr[0];
            this.f21265c = (float) iArr[length - 1];
            this.f21255a = -1.0f;
        }
        return z;
    }
}
