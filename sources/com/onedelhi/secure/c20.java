package com.onedelhi.secure;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.onedelhi.secure.hl3;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@hl3({hl3.C2354a.f13185a})
public final class c20 {

    @sj3(15)
    /* renamed from: com.onedelhi.secure.c20$a */
    public static class C1836a {
        @pn0
        /* renamed from: a */
        public static void m12263a(@mr2 Resources resources, int i, int i2, @mr2 TypedValue typedValue, boolean z) {
            resources.getValueForDensity(i, i2, typedValue, z);
        }
    }

    @sj3(18)
    /* renamed from: com.onedelhi.secure.c20$b */
    public static class C1837b {
        @pn0
        /* renamed from: a */
        public static void m12264a(@mr2 ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    @sj3(21)
    /* renamed from: com.onedelhi.secure.c20$c */
    public static class C1838c {
        @mr2
        @pn0
        /* renamed from: a */
        public static Drawable m12265a(@mr2 Resources resources, @mr2 XmlPullParser xmlPullParser, @mr2 AttributeSet attributeSet, @ts2 Resources.Theme theme) throws IOException, XmlPullParserException {
            return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }

        @pn0
        /* renamed from: b */
        public static int m12266b(@mr2 TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @pn0
        /* renamed from: c */
        public static void m12267c(@mr2 Drawable drawable, @mr2 Resources resources, @mr2 XmlPullParser xmlPullParser, @mr2 AttributeSet attributeSet, @ts2 Resources.Theme theme) throws IOException, XmlPullParserException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }
}
