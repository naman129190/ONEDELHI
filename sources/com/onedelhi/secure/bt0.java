package com.onedelhi.secure;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C0552c;
import com.onedelhi.secure.hl3;

@sj3(19)
@hl3({hl3.C2354a.f13185a})
public class bt0 implements TransformationMethod {
    @ts2

    /* renamed from: a */
    public final TransformationMethod f9962a;

    public bt0(@ts2 TransformationMethod transformationMethod) {
        this.f9962a = transformationMethod;
    }

    /* renamed from: a */
    public TransformationMethod mo13809a() {
        return this.f9962a;
    }

    public CharSequence getTransformation(@ts2 CharSequence charSequence, @mr2 View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f9962a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || C0552c.m4105b().mo4170f() != 1) ? charSequence : C0552c.m4105b().mo4179u(charSequence);
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f9962a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
