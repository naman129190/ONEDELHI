package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.onedelhi.secure.hl3;

@SuppressLint({"AppCompatCustomView"})
@hl3({hl3.C2354a.LIBRARY_GROUP})
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: n */
    public int f24050n;

    public VisibilityAwareImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24050n = getVisibility();
    }

    /* renamed from: c */
    public final void mo28273c(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f24050n = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f24050n;
    }

    public void setVisibility(int i) {
        mo28273c(i, true);
    }
}
