package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import org.apache.commons.compress.archivers.zip.UnixStat;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class es0 {

    /* renamed from: a */
    public static final int f11332a = 16777216;

    /* renamed from: a */
    public static final String f11333a = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* renamed from: a */
    public static final String[] f11334a = new String[0];

    /* renamed from: b */
    public static final int f11335b = Integer.MIN_VALUE;

    /* renamed from: b */
    public static final String f11336b = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    @hw4

    /* renamed from: c */
    public static final int f11337c = 2048;

    /* renamed from: c */
    public static final String f11338c = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";
    @hw4

    /* renamed from: d */
    public static final int f11339d = 1024;

    /* renamed from: d */
    public static final String f11340d = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";

    /* renamed from: e */
    public static final String f11341e = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";

    @sj3(30)
    /* renamed from: com.onedelhi.secure.es0$a */
    public static class C2070a {
        /* renamed from: a */
        public static CharSequence m13959a(@mr2 EditorInfo editorInfo, int i) {
            return editorInfo.getInitialSelectedText(i);
        }

        /* renamed from: b */
        public static CharSequence m13960b(@mr2 EditorInfo editorInfo, int i, int i2) {
            return editorInfo.getInitialTextAfterCursor(i, i2);
        }

        /* renamed from: c */
        public static CharSequence m13961c(@mr2 EditorInfo editorInfo, int i, int i2) {
            return editorInfo.getInitialTextBeforeCursor(i, i2);
        }

        /* renamed from: d */
        public static void m13962d(@mr2 EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }

    @mr2
    /* renamed from: a */
    public static String[] m13947a(@mr2 EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f11334a;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f11334a;
        }
        String[] stringArray = bundle.getStringArray(f11333a);
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray(f11336b);
        }
        return stringArray != null ? stringArray : f11334a;
    }

    @ts2
    /* renamed from: b */
    public static CharSequence m13948b(@mr2 EditorInfo editorInfo, int i) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return C2070a.m13959a(editorInfo, i);
        }
        if (editorInfo.extras == null) {
            return null;
        }
        int min = Math.min(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int max = Math.max(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int i2 = editorInfo.extras.getInt(f11340d);
        int i3 = editorInfo.extras.getInt(f11341e);
        int i4 = max - min;
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i3 - i2 != i4 || (charSequence = editorInfo.extras.getCharSequence(f11338c)) == null) {
            return null;
        }
        return (i & 1) != 0 ? charSequence.subSequence(i2, i3) : TextUtils.substring(charSequence, i2, i3);
    }

    @ts2
    /* renamed from: c */
    public static CharSequence m13949c(@mr2 EditorInfo editorInfo, int i, int i2) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return C2070a.m13960b(editorInfo, i, i2);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f11338c)) == null) {
            return null;
        }
        int i3 = editorInfo.extras.getInt(f11341e);
        int i4 = i2 & 1;
        int min = Math.min(i, charSequence.length() - i3) + i3;
        return i4 != 0 ? charSequence.subSequence(i3, min) : TextUtils.substring(charSequence, i3, min);
    }

    @ts2
    /* renamed from: d */
    public static CharSequence m13950d(@mr2 EditorInfo editorInfo, int i, int i2) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return C2070a.m13961c(editorInfo, i, i2);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f11338c)) == null) {
            return null;
        }
        int i3 = editorInfo.extras.getInt(f11340d);
        int i4 = i2 & 1;
        int min = i3 - Math.min(i, i3);
        return i4 != 0 ? charSequence.subSequence(min, i3) : TextUtils.substring(charSequence, min, i3);
    }

    /* renamed from: e */
    public static int m13951e(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            return 1;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return 0;
        }
        boolean containsKey = bundle.containsKey(f11333a);
        boolean containsKey2 = editorInfo.extras.containsKey(f11336b);
        if (containsKey && containsKey2) {
            return 4;
        }
        if (containsKey) {
            return 3;
        }
        return containsKey2 ? 2 : 0;
    }

    /* renamed from: f */
    public static boolean m13952f(CharSequence charSequence, int i, int i2) {
        if (i2 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i));
        }
        if (i2 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i));
    }

    /* renamed from: g */
    public static boolean m13953g(int i) {
        int i2 = i & UnixStat.PERM_MASK;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    /* renamed from: h */
    public static void m13954h(@mr2 EditorInfo editorInfo, @ts2 String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray(f11333a, strArr);
        editorInfo.extras.putStringArray(f11336b, strArr);
    }

    /* renamed from: i */
    public static void m13955i(@mr2 EditorInfo editorInfo, @mr2 CharSequence charSequence, int i) {
        k43.m19455l(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            C2070a.m13962d(editorInfo, charSequence, i);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 - i : i2 - i;
        int i5 = i2 > i3 ? i2 - i : i3 - i;
        int length = charSequence.length();
        if (i < 0 || i4 < 0 || i5 > length) {
            m13957k(editorInfo, (CharSequence) null, 0, 0);
        } else if (m13953g(editorInfo.inputType)) {
            m13957k(editorInfo, (CharSequence) null, 0, 0);
        } else if (length <= 2048) {
            m13957k(editorInfo, charSequence, i4, i5);
        } else {
            m13958l(editorInfo, charSequence, i4, i5);
        }
    }

    /* renamed from: j */
    public static void m13956j(@mr2 EditorInfo editorInfo, @mr2 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            C2070a.m13962d(editorInfo, charSequence, 0);
        } else {
            m13955i(editorInfo, charSequence, 0);
        }
    }

    /* renamed from: k */
    public static void m13957k(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence(f11338c, charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt(f11340d, i);
        editorInfo.extras.putInt(f11341e, i2);
    }

    /* renamed from: l */
    public static void m13958l(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        int i3 = i2 - i;
        int i4 = i3 > 1024 ? 0 : i3;
        int i5 = 2048 - i4;
        int min = Math.min(charSequence.length() - i2, i5 - Math.min(i, (int) (((double) i5) * 0.8d)));
        int min2 = Math.min(i, i5 - min);
        int i6 = i - min2;
        if (m13952f(charSequence, i6, 0)) {
            i6++;
            min2--;
        }
        if (m13952f(charSequence, (i2 + min) - 1, 1)) {
            min--;
        }
        CharSequence concat = i4 != i3 ? TextUtils.concat(new CharSequence[]{charSequence.subSequence(i6, i6 + min2), charSequence.subSequence(i2, min + i2)}) : charSequence.subSequence(i6, min2 + i4 + min + i6);
        int i7 = min2 + 0;
        m13957k(editorInfo, concat, i7, i4 + i7);
    }
}
