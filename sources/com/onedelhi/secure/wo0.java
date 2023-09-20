package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class wo0 {

    /* renamed from: a */
    public static final String f22227a = "DrawableCompat";

    /* renamed from: a */
    public static Method f22228a;

    /* renamed from: a */
    public static boolean f22229a;

    /* renamed from: b */
    public static Method f22230b;

    /* renamed from: b */
    public static boolean f22231b;

    @sj3(19)
    /* renamed from: com.onedelhi.secure.wo0$a */
    public static class C3863a {
        @pn0
        /* renamed from: a */
        public static int m30990a(Drawable drawable) {
            return drawable.getAlpha();
        }

        @pn0
        /* renamed from: b */
        public static Drawable m30991b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
            return drawableContainerState.getChild(i);
        }

        @pn0
        /* renamed from: c */
        public static Drawable m30992c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        @pn0
        /* renamed from: d */
        public static boolean m30993d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        @pn0
        /* renamed from: e */
        public static void m30994e(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }
    }

    @sj3(21)
    /* renamed from: com.onedelhi.secure.wo0$b */
    public static class C3864b {
        @pn0
        /* renamed from: a */
        public static void m30995a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @pn0
        /* renamed from: b */
        public static boolean m30996b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @pn0
        /* renamed from: c */
        public static ColorFilter m30997c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @pn0
        /* renamed from: d */
        public static void m30998d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @pn0
        /* renamed from: e */
        public static void m30999e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        @pn0
        /* renamed from: f */
        public static void m31000f(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        @pn0
        /* renamed from: g */
        public static void m31001g(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        @pn0
        /* renamed from: h */
        public static void m31002h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @pn0
        /* renamed from: i */
        public static void m31003i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    @sj3(23)
    /* renamed from: com.onedelhi.secure.wo0$c */
    public static class C3865c {
        @pn0
        /* renamed from: a */
        public static int m31004a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @pn0
        /* renamed from: b */
        public static boolean m31005b(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    /* renamed from: a */
    public static void m30972a(@mr2 Drawable drawable, @mr2 Resources.Theme theme) {
        C3864b.m30995a(drawable, theme);
    }

    /* renamed from: b */
    public static boolean m30973b(@mr2 Drawable drawable) {
        return C3864b.m30996b(drawable);
    }

    /* renamed from: c */
    public static void m30974c(@mr2 Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        Drawable a;
        int i = Build.VERSION.SDK_INT;
        drawable.clearColorFilter();
        if (i < 23) {
            if (drawable instanceof InsetDrawable) {
                a = C3863a.m30992c((InsetDrawable) drawable);
            } else if (drawable instanceof my4) {
                a = ((my4) drawable).mo20811a();
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    Drawable b = C3863a.m30991b(drawableContainerState, i2);
                    if (b != null) {
                        m30974c(b);
                    }
                }
                return;
            } else {
                return;
            }
            m30974c(a);
        }
    }

    /* renamed from: d */
    public static int m30975d(@mr2 Drawable drawable) {
        return C3863a.m30990a(drawable);
    }

    @ts2
    /* renamed from: e */
    public static ColorFilter m30976e(@mr2 Drawable drawable) {
        return C3864b.m30997c(drawable);
    }

    /* renamed from: f */
    public static int m30977f(@mr2 Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C3865c.m31004a(drawable);
        }
        if (!f22231b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f22230b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i(f22227a, "Failed to retrieve getLayoutDirection() method", e);
            }
            f22231b = true;
        }
        Method method = f22230b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.i(f22227a, "Failed to invoke getLayoutDirection() via reflection", e2);
                f22230b = null;
            }
        }
        return 0;
    }

    /* renamed from: g */
    public static void m30978g(@mr2 Drawable drawable, @mr2 Resources resources, @mr2 XmlPullParser xmlPullParser, @mr2 AttributeSet attributeSet, @ts2 Resources.Theme theme) throws XmlPullParserException, IOException {
        C3864b.m30998d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: h */
    public static boolean m30979h(@mr2 Drawable drawable) {
        return C3863a.m30993d(drawable);
    }

    @Deprecated
    /* renamed from: i */
    public static void m30980i(@mr2 Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: j */
    public static void m30981j(@mr2 Drawable drawable, boolean z) {
        C3863a.m30994e(drawable, z);
    }

    /* renamed from: k */
    public static void m30982k(@mr2 Drawable drawable, float f, float f2) {
        C3864b.m30999e(drawable, f, f2);
    }

    /* renamed from: l */
    public static void m30983l(@mr2 Drawable drawable, int i, int i2, int i3, int i4) {
        C3864b.m31000f(drawable, i, i2, i3, i4);
    }

    /* renamed from: m */
    public static boolean m30984m(@mr2 Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C3865c.m31005b(drawable, i);
        }
        if (!f22229a) {
            Class<Drawable> cls = Drawable.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                f22228a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i(f22227a, "Failed to retrieve setLayoutDirection(int) method", e);
            }
            f22229a = true;
        }
        Method method = f22228a;
        if (method != null) {
            try {
                method.invoke(drawable, new Object[]{Integer.valueOf(i)});
                return true;
            } catch (Exception e2) {
                Log.i(f22227a, "Failed to invoke setLayoutDirection(int) via reflection", e2);
                f22228a = null;
            }
        }
        return false;
    }

    /* renamed from: n */
    public static void m30985n(@mr2 Drawable drawable, @d10 int i) {
        C3864b.m31001g(drawable, i);
    }

    /* renamed from: o */
    public static void m30986o(@mr2 Drawable drawable, @ts2 ColorStateList colorStateList) {
        C3864b.m31002h(drawable, colorStateList);
    }

    /* renamed from: p */
    public static void m30987p(@mr2 Drawable drawable, @mr2 PorterDuff.Mode mode) {
        C3864b.m31003i(drawable, mode);
    }

    /* renamed from: q */
    public static <T extends Drawable> T m30988q(@mr2 Drawable drawable) {
        return drawable instanceof my4 ? ((my4) drawable).mo20811a() : drawable;
    }

    @mr2
    /* renamed from: r */
    public static Drawable m30989r(@mr2 Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof we4)) ? new oy4(drawable) : drawable;
    }
}
