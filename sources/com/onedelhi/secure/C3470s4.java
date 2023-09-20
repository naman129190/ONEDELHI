package com.onedelhi.secure;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import com.onedelhi.secure.hl3;
import java.util.Locale;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
/* renamed from: com.onedelhi.secure.s4 */
public class C3470s4 implements TransformationMethod {

    /* renamed from: a */
    public Locale f20197a;

    public C3470s4(Context context) {
        this.f20197a = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f20197a);
        }
        return null;
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
