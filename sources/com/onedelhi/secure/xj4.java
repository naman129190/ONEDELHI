package com.onedelhi.secure;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.onedelhi.secure.hl3;
import org.xmlpull.v1.XmlPullParser;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class xj4 {

    /* renamed from: a */
    public static final String f22601a = "http://schemas.android.com/apk/res/android";

    /* renamed from: a */
    public static int m31484a(@mr2 Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    /* renamed from: b */
    public static boolean m31485b(@mr2 TypedArray typedArray, @g64 int i, @g64 int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    @ts2
    /* renamed from: c */
    public static Drawable m31486c(@mr2 TypedArray typedArray, @g64 int i, @g64 int i2) {
        Drawable drawable = typedArray.getDrawable(i);
        return drawable == null ? typedArray.getDrawable(i2) : drawable;
    }

    /* renamed from: d */
    public static int m31487d(@mr2 TypedArray typedArray, @g64 int i, @g64 int i2, int i3) {
        return typedArray.getInt(i, typedArray.getInt(i2, i3));
    }

    /* renamed from: e */
    public static boolean m31488e(@mr2 TypedArray typedArray, @mr2 XmlPullParser xmlPullParser, @mr2 String str, @g64 int i, boolean z) {
        return !m31501r(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    @d10
    /* renamed from: f */
    public static int m31489f(@mr2 TypedArray typedArray, @mr2 XmlPullParser xmlPullParser, @mr2 String str, @g64 int i, @d10 int i2) {
        return !m31501r(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    @ts2
    /* renamed from: g */
    public static ColorStateList m31490g(@mr2 TypedArray typedArray, @mr2 XmlPullParser xmlPullParser, @ts2 Resources.Theme theme, @mr2 String str, @g64 int i) {
        if (!m31501r(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 != 2) {
            return (i2 < 28 || i2 > 31) ? o10.m23250d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme) : m31491h(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
    }

    @mr2
    /* renamed from: h */
    public static ColorStateList m31491h(@mr2 TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: i */
    public static t20 m31492i(@mr2 TypedArray typedArray, @mr2 XmlPullParser xmlPullParser, @ts2 Resources.Theme theme, @mr2 String str, @g64 int i, @d10 int i2) {
        if (m31501r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return t20.m28075b(typedValue.data);
            }
            t20 g = t20.m28078g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (g != null) {
                return g;
            }
        }
        return t20.m28075b(i2);
    }

    /* renamed from: j */
    public static float m31493j(@mr2 TypedArray typedArray, @mr2 XmlPullParser xmlPullParser, @mr2 String str, @g64 int i, float f) {
        return !m31501r(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: k */
    public static int m31494k(@mr2 TypedArray typedArray, @mr2 XmlPullParser xmlPullParser, @mr2 String str, @g64 int i, int i2) {
        return !m31501r(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    @C3476s7
    /* renamed from: l */
    public static int m31495l(@mr2 TypedArray typedArray, @mr2 XmlPullParser xmlPullParser, @mr2 String str, @g64 int i, @C3476s7 int i2) {
        return !m31501r(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    @ts2
    /* renamed from: m */
    public static String m31496m(@mr2 TypedArray typedArray, @mr2 XmlPullParser xmlPullParser, @mr2 String str, @g64 int i) {
        if (!m31501r(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    @C3476s7
    /* renamed from: n */
    public static int m31497n(@mr2 TypedArray typedArray, @g64 int i, @g64 int i2, @C3476s7 int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    @ts2
    /* renamed from: o */
    public static String m31498o(@mr2 TypedArray typedArray, @g64 int i, @g64 int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    @ts2
    /* renamed from: p */
    public static CharSequence m31499p(@mr2 TypedArray typedArray, @g64 int i, @g64 int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    @ts2
    /* renamed from: q */
    public static CharSequence[] m31500q(@mr2 TypedArray typedArray, @g64 int i, @g64 int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    /* renamed from: r */
    public static boolean m31501r(@mr2 XmlPullParser xmlPullParser, @mr2 String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    @mr2
    /* renamed from: s */
    public static TypedArray m31502s(@mr2 Resources resources, @ts2 Resources.Theme theme, @mr2 AttributeSet attributeSet, @mr2 int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @ts2
    /* renamed from: t */
    public static TypedValue m31503t(@mr2 TypedArray typedArray, @mr2 XmlPullParser xmlPullParser, @mr2 String str, int i) {
        if (!m31501r(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }
}
