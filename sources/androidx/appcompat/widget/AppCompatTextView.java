package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.onedelhi.secure.C1765b8;
import com.onedelhi.secure.C2610k8;
import com.onedelhi.secure.C2701l8;
import com.onedelhi.secure.C3056of;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.C3478s8;
import com.onedelhi.secure.C3569t8;
import com.onedelhi.secure.bf4;
import com.onedelhi.secure.d43;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.ef4;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.ik4;
import com.onedelhi.secure.jb4;
import com.onedelhi.secure.js1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ps0;
import com.onedelhi.secure.qb4;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.xe4;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AppCompatTextView extends TextView implements bf4, ef4, C3056of, ps0 {

    /* renamed from: a */
    public final C1765b8 f1406a;
    @mr2

    /* renamed from: a */
    public C2610k8 f1407a;

    /* renamed from: a */
    public final C3478s8 f1408a;

    /* renamed from: a */
    public final C3569t8 f1409a;
    @ts2

    /* renamed from: a */
    public Future<d43> f1410a;

    /* renamed from: b */
    public boolean f1411b;

    public AppCompatTextView(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatTextView(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(xe4.m31415b(context), attributeSet, i);
        this.f1411b = false;
        qb4.m25632a(this, getContext());
        C1765b8 b8Var = new C1765b8(this);
        this.f1406a = b8Var;
        b8Var.mo13523e(attributeSet, i);
        C3569t8 t8Var = new C3569t8(this);
        this.f1409a = t8Var;
        t8Var.mo24756m(attributeSet, i);
        t8Var.mo24746b();
        this.f1408a = new C3478s8(this);
        getEmojiTextViewHelper().mo18949c(attributeSet, i);
    }

    @mr2
    private C2610k8 getEmojiTextViewHelper() {
        if (this.f1407a == null) {
            this.f1407a = new C2610k8(this);
        }
        return this.f1407a;
    }

    /* renamed from: c */
    public boolean mo1712c() {
        return getEmojiTextViewHelper().mo18948b();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1765b8 b8Var = this.f1406a;
        if (b8Var != null) {
            b8Var.mo13520b();
        }
        C3569t8 t8Var = this.f1409a;
        if (t8Var != null) {
            t8Var.mo24746b();
        }
    }

    /* renamed from: g */
    public final void mo1919g() {
        Future<d43> future = this.f1410a;
        if (future != null) {
            try {
                this.f1410a = null;
                jb4.m18309D(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public int getAutoSizeMaxTextSize() {
        if (C3056of.f17942a) {
            return super.getAutoSizeMaxTextSize();
        }
        C3569t8 t8Var = this.f1409a;
        if (t8Var != null) {
            return t8Var.mo24748e();
        }
        return -1;
    }

    @hl3({hl3.C2354a.f13188c})
    public int getAutoSizeMinTextSize() {
        if (C3056of.f17942a) {
            return super.getAutoSizeMinTextSize();
        }
        C3569t8 t8Var = this.f1409a;
        if (t8Var != null) {
            return t8Var.mo24749f();
        }
        return -1;
    }

    @hl3({hl3.C2354a.f13188c})
    public int getAutoSizeStepGranularity() {
        if (C3056of.f17942a) {
            return super.getAutoSizeStepGranularity();
        }
        C3569t8 t8Var = this.f1409a;
        if (t8Var != null) {
            return t8Var.mo24750g();
        }
        return -1;
    }

    @hl3({hl3.C2354a.f13188c})
    public int[] getAutoSizeTextAvailableSizes() {
        if (C3056of.f17942a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C3569t8 t8Var = this.f1409a;
        return t8Var != null ? t8Var.mo24751h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    @hl3({hl3.C2354a.f13188c})
    public int getAutoSizeTextType() {
        if (C3056of.f17942a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C3569t8 t8Var = this.f1409a;
        if (t8Var != null) {
            return t8Var.mo24752i();
        }
        return 0;
    }

    @ts2
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return jb4.m18312G(super.getCustomSelectionActionModeCallback());
    }

    public int getFirstBaselineToTopHeight() {
        return jb4.m18322i(this);
    }

    public int getLastBaselineToBottomHeight() {
        return jb4.m18323j(this);
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public ColorStateList getSupportBackgroundTintList() {
        C1765b8 b8Var = this.f1406a;
        if (b8Var != null) {
            return b8Var.mo13521c();
        }
        return null;
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1765b8 b8Var = this.f1406a;
        if (b8Var != null) {
            return b8Var.mo13522d();
        }
        return null;
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1409a.mo24753j();
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1409a.mo24754k();
    }

    public CharSequence getText() {
        mo1919g();
        return super.getText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f1408a;
     */
    @com.onedelhi.secure.mr2
    @com.onedelhi.secure.sj3(api = 26)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            com.onedelhi.secure.s8 r0 = r2.f1408a
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.mo24263a()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextView.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    @mr2
    public d43.C1942a getTextMetricsParamsCompat() {
        return jb4.m18328o(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1409a.mo24761r(this, onCreateInputConnection, editorInfo);
        return C2701l8.m20260a(onCreateInputConnection, editorInfo, this);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C3569t8 t8Var = this.f1409a;
        if (t8Var != null) {
            t8Var.mo24758o(z, i, i2, i3, i4);
        }
    }

    public void onMeasure(int i, int i2) {
        mo1919g();
        super.onMeasure(i, i2);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C3569t8 t8Var = this.f1409a;
        if (t8Var != null && !C3056of.f17942a && t8Var.mo24755l()) {
            this.f1409a.mo24747c();
        }
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo18950d(z);
    }

    @hl3({hl3.C2354a.f13188c})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C3056of.f17942a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C3569t8 t8Var = this.f1409a;
        if (t8Var != null) {
            t8Var.mo24763t(i, i2, i3, i4);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@mr2 int[] iArr, int i) throws IllegalArgumentException {
        if (C3056of.f17942a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C3569t8 t8Var = this.f1409a;
        if (t8Var != null) {
            t8Var.mo24764u(iArr, i);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C3056of.f17942a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C3569t8 t8Var = this.f1409a;
        if (t8Var != null) {
            t8Var.mo24765v(i);
        }
    }

    public void setBackgroundDrawable(@ts2 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1765b8 b8Var = this.f1406a;
        if (b8Var != null) {
            b8Var.mo13524f(drawable);
        }
    }

    public void setBackgroundResource(@dp0 int i) {
        super.setBackgroundResource(i);
        C1765b8 b8Var = this.f1406a;
        if (b8Var != null) {
            b8Var.mo13525g(i);
        }
    }

    public void setCompoundDrawables(@ts2 Drawable drawable, @ts2 Drawable drawable2, @ts2 Drawable drawable3, @ts2 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3569t8 t8Var = this.f1409a;
        if (t8Var != null) {
            t8Var.mo24759p();
        }
    }

    @sj3(17)
    public void setCompoundDrawablesRelative(@ts2 Drawable drawable, @ts2 Drawable drawable2, @ts2 Drawable drawable3, @ts2 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3569t8 t8Var = this.f1409a;
        if (t8Var != null) {
            t8Var.mo24759p();
        }
    }

    @sj3(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? C3129p8.m24529b(context, i) : null;
        Drawable b2 = i2 != 0 ? C3129p8.m24529b(context, i2) : null;
        Drawable b3 = i3 != 0 ? C3129p8.m24529b(context, i3) : null;
        if (i4 != 0) {
            drawable = C3129p8.m24529b(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b, b2, b3, drawable);
        C3569t8 t8Var = this.f1409a;
        if (t8Var != null) {
            t8Var.mo24759p();
        }
    }

    @sj3(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@ts2 Drawable drawable, @ts2 Drawable drawable2, @ts2 Drawable drawable3, @ts2 Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C3569t8 t8Var = this.f1409a;
        if (t8Var != null) {
            t8Var.mo24759p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? C3129p8.m24529b(context, i) : null;
        Drawable b2 = i2 != 0 ? C3129p8.m24529b(context, i2) : null;
        Drawable b3 = i3 != 0 ? C3129p8.m24529b(context, i3) : null;
        if (i4 != 0) {
            drawable = C3129p8.m24529b(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, drawable);
        C3569t8 t8Var = this.f1409a;
        if (t8Var != null) {
            t8Var.mo24759p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(@ts2 Drawable drawable, @ts2 Drawable drawable2, @ts2 Drawable drawable3, @ts2 Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C3569t8 t8Var = this.f1409a;
        if (t8Var != null) {
            t8Var.mo24759p();
        }
    }

    public void setCustomSelectionActionModeCallback(@ts2 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(jb4.m18313H(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo18951e(z);
    }

    public void setFilters(@mr2 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo18947a(inputFilterArr));
    }

    public void setFirstBaselineToTopHeight(@e83 @js1(from = 0) int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            jb4.m18306A(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(@e83 @js1(from = 0) int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            jb4.m18307B(this, i);
        }
    }

    public void setLineHeight(@e83 @js1(from = 0) int i) {
        jb4.m18308C(this, i);
    }

    public void setPrecomputedText(@mr2 d43 d43) {
        jb4.m18309D(this, d43);
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportBackgroundTintList(@ts2 ColorStateList colorStateList) {
        C1765b8 b8Var = this.f1406a;
        if (b8Var != null) {
            b8Var.mo13527i(colorStateList);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportBackgroundTintMode(@ts2 PorterDuff.Mode mode) {
        C1765b8 b8Var = this.f1406a;
        if (b8Var != null) {
            b8Var.mo13528j(mode);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportCompoundDrawablesTintList(@ts2 ColorStateList colorStateList) {
        this.f1409a.mo24766w(colorStateList);
        this.f1409a.mo24746b();
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportCompoundDrawablesTintMode(@ts2 PorterDuff.Mode mode) {
        this.f1409a.mo24767x(mode);
        this.f1409a.mo24746b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3569t8 t8Var = this.f1409a;
        if (t8Var != null) {
            t8Var.mo24760q(context, i);
        }
    }

    @sj3(api = 26)
    public void setTextClassifier(@ts2 TextClassifier textClassifier) {
        C3478s8 s8Var;
        if (Build.VERSION.SDK_INT >= 28 || (s8Var = this.f1408a) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            s8Var.mo24264b(textClassifier);
        }
    }

    public void setTextFuture(@ts2 Future<d43> future) {
        this.f1410a = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@mr2 d43.C1942a aVar) {
        jb4.m18311F(this, aVar);
    }

    public void setTextSize(int i, float f) {
        if (C3056of.f17942a) {
            super.setTextSize(i, f);
            return;
        }
        C3569t8 t8Var = this.f1409a;
        if (t8Var != null) {
            t8Var.mo24742A(i, f);
        }
    }

    public void setTypeface(@ts2 Typeface typeface, int i) {
        if (!this.f1411b) {
            Typeface typeface2 = null;
            if (typeface != null && i > 0) {
                typeface2 = ik4.m17650b(getContext(), typeface, i);
            }
            this.f1411b = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.f1411b = false;
            }
        }
    }
}
