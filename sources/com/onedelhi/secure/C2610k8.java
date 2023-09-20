package com.onedelhi.secure;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import com.onedelhi.secure.za3;

/* renamed from: com.onedelhi.secure.k8 */
public class C2610k8 {
    @mr2

    /* renamed from: a */
    public final TextView f14783a;
    @mr2

    /* renamed from: a */
    public final zs0 f14784a;

    public C2610k8(@mr2 TextView textView) {
        this.f14783a = textView;
        this.f14784a = new zs0(textView, false);
    }

    @mr2
    /* renamed from: a */
    public InputFilter[] mo18947a(@mr2 InputFilter[] inputFilterArr) {
        return this.f14784a.mo28099a(inputFilterArr);
    }

    /* renamed from: b */
    public boolean mo18948b() {
        return this.f14784a.mo28100b();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public void mo18949c(@ts2 AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f14783a.getContext().obtainStyledAttributes(attributeSet, za3.C4068m.AppCompatTextView, i, 0);
        try {
            int i2 = za3.C4068m.AppCompatTextView_emojiCompatEnabled;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            mo18951e(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: d */
    public void mo18950d(boolean z) {
        this.f14784a.mo28101c(z);
    }

    /* renamed from: e */
    public void mo18951e(boolean z) {
        this.f14784a.mo28102d(z);
    }

    @ts2
    /* renamed from: f */
    public TransformationMethod mo18952f(@ts2 TransformationMethod transformationMethod) {
        return this.f14784a.mo28104f(transformationMethod);
    }
}
