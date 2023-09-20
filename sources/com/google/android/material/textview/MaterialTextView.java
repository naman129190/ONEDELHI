package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.onedelhi.secure.af2;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.g64;
import com.onedelhi.secure.hf2;
import com.onedelhi.secure.je2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialTextView(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(hf2.m50488c(context, attributeSet, i, 0), attributeSet, i);
        mo29483k(attributeSet, i, 0);
    }

    @Deprecated
    public MaterialTextView(@mr2 Context context, @ts2 AttributeSet attributeSet, int i, int i2) {
        super(hf2.m50488c(context, attributeSet, i, i2), attributeSet, i);
        mo29483k(attributeSet, i, i2);
    }

    /* renamed from: i */
    public static boolean m34373i(Context context) {
        return je2.m53273b(context, fd3.C2153c.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: j */
    public static int m34374j(@mr2 Resources.Theme theme, @ts2 AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, fd3.C2165o.MaterialTextView, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(fd3.C2165o.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: l */
    public static int m34375l(@mr2 Context context, @mr2 TypedArray typedArray, @g64 @mr2 int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = af2.m38613d(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: m */
    public static boolean m34376m(@mr2 Context context, @mr2 Resources.Theme theme, @ts2 AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, fd3.C2165o.MaterialTextView, i, i2);
        int l = m34375l(context, obtainStyledAttributes, fd3.C2165o.MaterialTextView_android_lineHeight, fd3.C2165o.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        return l != -1;
    }

    /* renamed from: h */
    public final void mo29482h(@mr2 Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, fd3.C2165o.MaterialTextAppearance);
        int l = m34375l(getContext(), obtainStyledAttributes, fd3.C2165o.MaterialTextAppearance_android_lineHeight, fd3.C2165o.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (l >= 0) {
            setLineHeight(l);
        }
    }

    /* renamed from: k */
    public final void mo29483k(@ts2 AttributeSet attributeSet, int i, int i2) {
        int j;
        Context context = getContext();
        if (m34373i(context)) {
            Resources.Theme theme = context.getTheme();
            if (!m34376m(context, theme, attributeSet, i, i2) && (j = m34374j(theme, attributeSet, i, i2)) != -1) {
                mo29482h(theme, j);
            }
        }
    }

    public void setTextAppearance(@mr2 Context context, int i) {
        super.setTextAppearance(context, i);
        if (m34373i(context)) {
            mo29482h(context.getTheme(), i);
        }
    }
}
