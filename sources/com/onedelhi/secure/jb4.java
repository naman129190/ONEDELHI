package com.onedelhi.secure;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.onedelhi.secure.d43;
import com.onedelhi.secure.hl3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class jb4 {

    /* renamed from: a */
    public static final int f14066a = 0;

    /* renamed from: a */
    public static final String f14067a = "TextViewCompat";

    /* renamed from: a */
    public static Field f14068a = null;

    /* renamed from: a */
    public static boolean f14069a = false;

    /* renamed from: b */
    public static final int f14070b = 1;

    /* renamed from: b */
    public static Field f14071b = null;

    /* renamed from: b */
    public static boolean f14072b = false;

    /* renamed from: c */
    public static final int f14073c = 1;

    /* renamed from: c */
    public static Field f14074c;

    /* renamed from: c */
    public static boolean f14075c;

    /* renamed from: d */
    public static Field f14076d;

    /* renamed from: d */
    public static boolean f14077d;

    @sj3(16)
    /* renamed from: com.onedelhi.secure.jb4$a */
    public static class C2487a {
        @pn0
        /* renamed from: a */
        public static boolean m18340a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        @pn0
        /* renamed from: b */
        public static int m18341b(TextView textView) {
            return textView.getMaxLines();
        }

        @pn0
        /* renamed from: c */
        public static int m18342c(TextView textView) {
            return textView.getMinLines();
        }
    }

    @sj3(17)
    /* renamed from: com.onedelhi.secure.jb4$b */
    public static class C2488b {
        @pn0
        /* renamed from: a */
        public static Drawable[] m18343a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @pn0
        /* renamed from: b */
        public static int m18344b(View view) {
            return view.getLayoutDirection();
        }

        @pn0
        /* renamed from: c */
        public static int m18345c(View view) {
            return view.getTextDirection();
        }

        @pn0
        /* renamed from: d */
        public static Locale m18346d(TextView textView) {
            return textView.getTextLocale();
        }

        @pn0
        /* renamed from: e */
        public static void m18347e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        @pn0
        /* renamed from: f */
        public static void m18348f(TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }

        @pn0
        /* renamed from: g */
        public static void m18349g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @pn0
        /* renamed from: h */
        public static void m18350h(View view, int i) {
            view.setTextDirection(i);
        }
    }

    @sj3(23)
    /* renamed from: com.onedelhi.secure.jb4$c */
    public static class C2489c {
        @pn0
        /* renamed from: a */
        public static int m18351a(TextView textView) {
            return textView.getBreakStrategy();
        }

        @pn0
        /* renamed from: b */
        public static ColorStateList m18352b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        @pn0
        /* renamed from: c */
        public static PorterDuff.Mode m18353c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        @pn0
        /* renamed from: d */
        public static int m18354d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        @pn0
        /* renamed from: e */
        public static void m18355e(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        @pn0
        /* renamed from: f */
        public static void m18356f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        @pn0
        /* renamed from: g */
        public static void m18357g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        @pn0
        /* renamed from: h */
        public static void m18358h(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    @sj3(24)
    /* renamed from: com.onedelhi.secure.jb4$d */
    public static class C2490d {
        @pn0
        /* renamed from: a */
        public static DecimalFormatSymbols m18359a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    @sj3(26)
    /* renamed from: com.onedelhi.secure.jb4$e */
    public static class C2491e {
        @pn0
        /* renamed from: a */
        public static int m18360a(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        @pn0
        /* renamed from: b */
        public static int m18361b(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        @pn0
        /* renamed from: c */
        public static int m18362c(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @pn0
        /* renamed from: d */
        public static int[] m18363d(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        @pn0
        /* renamed from: e */
        public static int m18364e(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        @pn0
        /* renamed from: f */
        public static void m18365f(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @pn0
        /* renamed from: g */
        public static void m18366g(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @pn0
        /* renamed from: h */
        public static void m18367h(TextView textView, int i) {
            textView.setAutoSizeTextTypeWithDefaults(i);
        }
    }

    @sj3(28)
    /* renamed from: com.onedelhi.secure.jb4$f */
    public static class C2492f {
        @pn0
        /* renamed from: a */
        public static String[] m18368a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        @pn0
        /* renamed from: b */
        public static PrecomputedText.Params m18369b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        @pn0
        /* renamed from: c */
        public static void m18370c(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.jb4$g */
    public @interface C2493g {
    }

    @sj3(26)
    /* renamed from: com.onedelhi.secure.jb4$h */
    public static class C2494h implements ActionMode.Callback {

        /* renamed from: a */
        public static final int f14078a = 100;

        /* renamed from: a */
        public final ActionMode.Callback f14079a;

        /* renamed from: a */
        public final TextView f14080a;

        /* renamed from: a */
        public Class<?> f14081a;

        /* renamed from: a */
        public Method f14082a;

        /* renamed from: a */
        public boolean f14083a;

        /* renamed from: b */
        public boolean f14084b = false;

        public C2494h(ActionMode.Callback callback, TextView textView) {
            this.f14079a = callback;
            this.f14080a = textView;
        }

        /* renamed from: a */
        public final Intent mo18237a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: b */
        public final Intent mo18238b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = mo18237a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !mo18241e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        public final List<ResolveInfo> mo18239c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo next : packageManager.queryIntentActivities(mo18237a(), 0)) {
                if (mo18242f(next, context)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        @mr2
        /* renamed from: d */
        public ActionMode.Callback mo18240d() {
            return this.f14079a;
        }

        /* renamed from: e */
        public final boolean mo18241e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* renamed from: f */
        public final boolean mo18242f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        /* renamed from: g */
        public final void mo18243g(Menu menu) {
            Method method;
            Context context = this.f14080a.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f14084b) {
                this.f14084b = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f14081a = cls;
                    this.f14082a = cls.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                    this.f14083a = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f14081a = null;
                    this.f14082a = null;
                    this.f14083a = false;
                }
            }
            try {
                if (!this.f14083a || !this.f14081a.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                } else {
                    method = this.f14082a;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                List<ResolveInfo> c = mo18239c(context, packageManager);
                for (int i = 0; i < c.size(); i++) {
                    ResolveInfo resolveInfo = c.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(mo18238b(resolveInfo, this.f14080a)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f14079a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f14079a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f14079a.onDestroyActionMode(actionMode);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            mo18243g(menu);
            return this.f14079a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: A */
    public static void m18306A(@mr2 TextView textView, @e83 @js1(from = 0) int i) {
        k43.m19452i(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C2492f.m18370c(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = C2487a.m18340a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: B */
    public static void m18307B(@mr2 TextView textView, @e83 @js1(from = 0) int i) {
        k43.m19452i(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = C2487a.m18340a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: C */
    public static void m18308C(@mr2 TextView textView, @e83 @js1(from = 0) int i) {
        k43.m19452i(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: D */
    public static void m18309D(@mr2 TextView textView, @mr2 d43 d43) {
        Spanned spanned;
        if (Build.VERSION.SDK_INT >= 29) {
            spanned = d43.mo14498f();
        } else {
            boolean a = m18328o(textView).mo14509a(d43.mo14497e());
            spanned = d43;
            if (!a) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
        }
        textView.setText(spanned);
    }

    /* renamed from: E */
    public static void m18310E(@mr2 TextView textView, @e64 int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* renamed from: F */
    public static void m18311F(@mr2 TextView textView, @mr2 d43.C1942a aVar) {
        int i = Build.VERSION.SDK_INT;
        C2488b.m18350h(textView, m18326m(aVar.mo14512d()));
        if (i < 23) {
            float textScaleX = aVar.mo14513e().getTextScaleX();
            textView.getPaint().set(aVar.mo14513e());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(aVar.mo14513e());
        C2489c.m18355e(textView, aVar.mo14510b());
        C2489c.m18358h(textView, aVar.mo14511c());
    }

    @ts2
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: G */
    public static ActionMode.Callback m18312G(@ts2 ActionMode.Callback callback) {
        return (!(callback instanceof C2494h) || Build.VERSION.SDK_INT < 26) ? callback : ((C2494h) callback).mo18240d();
    }

    @ts2
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: H */
    public static ActionMode.Callback m18313H(@mr2 TextView textView, @ts2 ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof C2494h) || callback == null) ? callback : new C2494h(callback, textView);
    }

    /* renamed from: a */
    public static int m18314a(@mr2 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return C2491e.m18360a(textView);
        }
        if (textView instanceof C3056of) {
            return ((C3056of) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    /* renamed from: b */
    public static int m18315b(@mr2 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return C2491e.m18361b(textView);
        }
        if (textView instanceof C3056of) {
            return ((C3056of) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    /* renamed from: c */
    public static int m18316c(@mr2 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return C2491e.m18362c(textView);
        }
        if (textView instanceof C3056of) {
            return ((C3056of) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    @mr2
    /* renamed from: d */
    public static int[] m18317d(@mr2 TextView textView) {
        return Build.VERSION.SDK_INT >= 27 ? C2491e.m18363d(textView) : textView instanceof C3056of ? ((C3056of) textView).getAutoSizeTextAvailableSizes() : new int[0];
    }

    /* renamed from: e */
    public static int m18318e(@mr2 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return C2491e.m18364e(textView);
        }
        if (textView instanceof C3056of) {
            return ((C3056of) textView).getAutoSizeTextType();
        }
        return 0;
    }

    @ts2
    /* renamed from: f */
    public static ColorStateList m18319f(@mr2 TextView textView) {
        k43.m19455l(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            return C2489c.m18352b(textView);
        }
        if (textView instanceof ef4) {
            return ((ef4) textView).getSupportCompoundDrawablesTintList();
        }
        return null;
    }

    @ts2
    /* renamed from: g */
    public static PorterDuff.Mode m18320g(@mr2 TextView textView) {
        k43.m19455l(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            return C2489c.m18353c(textView);
        }
        if (textView instanceof ef4) {
            return ((ef4) textView).getSupportCompoundDrawablesTintMode();
        }
        return null;
    }

    @mr2
    /* renamed from: h */
    public static Drawable[] m18321h(@mr2 TextView textView) {
        return C2488b.m18343a(textView);
    }

    /* renamed from: i */
    public static int m18322i(@mr2 TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: j */
    public static int m18323j(@mr2 TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: k */
    public static int m18324k(@mr2 TextView textView) {
        return C2487a.m18341b(textView);
    }

    /* renamed from: l */
    public static int m18325l(@mr2 TextView textView) {
        return C2487a.m18342c(textView);
    }

    @sj3(18)
    /* renamed from: m */
    public static int m18326m(@mr2 TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    @sj3(18)
    /* renamed from: n */
    public static TextDirectionHeuristic m18327n(@mr2 TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (C2488b.m18344b(textView) == 1) {
                z = true;
            }
            switch (C2488b.m18345c(textView)) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    return z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(C2492f.m18368a(C2490d.m18359a(C2488b.m18346d(textView)))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
    }

    @mr2
    /* renamed from: o */
    public static d43.C1942a m18328o(@mr2 TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new d43.C1942a(C2492f.m18369b(textView));
        }
        d43.C1942a.C1943a aVar = new d43.C1942a.C1943a(new TextPaint(textView.getPaint()));
        if (i >= 23) {
            aVar.mo14518b(C2489c.m18351a(textView));
            aVar.mo14519c(C2489c.m18354d(textView));
        }
        aVar.mo14520d(m18327n(textView));
        return aVar.mo14517a();
    }

    /* renamed from: p */
    public static Field m18329p(String str) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(str);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException unused) {
            Log.e(f14067a, "Could not retrieve " + str + " field.");
            return field;
        }
    }

    /* renamed from: q */
    public static int m18330q(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            Log.d(f14067a, "Could not retrieve value of " + field.getName() + " field.");
            return -1;
        }
    }

    /* renamed from: r */
    public static void m18331r(@mr2 TextView textView, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            C2491e.m18365f(textView, i, i2, i3, i4);
        } else if (textView instanceof C3056of) {
            ((C3056of) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }

    /* renamed from: s */
    public static void m18332s(@mr2 TextView textView, @mr2 int[] iArr, int i) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            C2491e.m18366g(textView, iArr, i);
        } else if (textView instanceof C3056of) {
            ((C3056of) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }
    }

    /* renamed from: t */
    public static void m18333t(@mr2 TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 27) {
            C2491e.m18367h(textView, i);
        } else if (textView instanceof C3056of) {
            ((C3056of) textView).setAutoSizeTextTypeWithDefaults(i);
        }
    }

    /* renamed from: u */
    public static void m18334u(@mr2 TextView textView, @ts2 ColorStateList colorStateList) {
        k43.m19455l(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            C2489c.m18356f(textView, colorStateList);
        } else if (textView instanceof ef4) {
            ((ef4) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* renamed from: v */
    public static void m18335v(@mr2 TextView textView, @ts2 PorterDuff.Mode mode) {
        k43.m19455l(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            C2489c.m18357g(textView, mode);
        } else if (textView instanceof ef4) {
            ((ef4) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* renamed from: w */
    public static void m18336w(@mr2 TextView textView, @ts2 Drawable drawable, @ts2 Drawable drawable2, @ts2 Drawable drawable3, @ts2 Drawable drawable4) {
        C2488b.m18347e(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: x */
    public static void m18337x(@mr2 TextView textView, @dp0 int i, @dp0 int i2, @dp0 int i3, @dp0 int i4) {
        C2488b.m18348f(textView, i, i2, i3, i4);
    }

    /* renamed from: y */
    public static void m18338y(@mr2 TextView textView, @ts2 Drawable drawable, @ts2 Drawable drawable2, @ts2 Drawable drawable3, @ts2 Drawable drawable4) {
        C2488b.m18349g(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: z */
    public static void m18339z(@mr2 TextView textView, @mr2 ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(m18313H(textView, callback));
    }
}
