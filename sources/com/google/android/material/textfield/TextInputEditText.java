package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.onedelhi.secure.fc2;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hf2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ob4;
import com.onedelhi.secure.ts2;

public class TextInputEditText extends AppCompatEditText {

    /* renamed from: a */
    public final Rect f24569a;

    /* renamed from: b */
    public boolean f24570b;

    public TextInputEditText(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public TextInputEditText(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.editTextStyle);
    }

    public TextInputEditText(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(hf2.m50488c(context, attributeSet, i, 0), attributeSet, i);
        this.f24569a = new Rect();
        TypedArray k = ob4.m59195k(context, attributeSet, fd3.C2165o.TextInputEditText, i, fd3.C2164n.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(k.getBoolean(fd3.C2165o.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        k.recycle();
    }

    @ts2
    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    @ts2
    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @mr2
    /* renamed from: d */
    public final String mo29144d(@mr2 TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean z = !TextUtils.isEmpty(text);
        String str = "";
        String charSequence = TextUtils.isEmpty(hint) ^ true ? hint.toString() : str;
        if (!z) {
            return !TextUtils.isEmpty(charSequence) ? charSequence : str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        if (!TextUtils.isEmpty(charSequence)) {
            str = ", " + charSequence;
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: e */
    public boolean mo29145e() {
        return this.f24570b;
    }

    /* renamed from: f */
    public final boolean mo29146f(@ts2 TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f24570b;
    }

    public void getFocusedRect(@ts2 Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (mo29146f(textInputLayout) && rect != null) {
            textInputLayout.getFocusedRect(this.f24569a);
            rect.bottom = this.f24569a.bottom;
        }
    }

    public boolean getGlobalVisibleRect(@ts2 Rect rect, @ts2 Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        return mo29146f(textInputLayout) ? textInputLayout.getGlobalVisibleRect(rect, point) : super.getGlobalVisibleRect(rect, point);
    }

    @ts2
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.mo29191a0()) ? super.getHint() : textInputLayout.getHint();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.mo29191a0() && super.getHint() == null && fc2.m47742c()) {
            setHint("");
        }
    }

    @ts2
    public InputConnection onCreateInputConnection(@mr2 EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public void onInitializeAccessibilityNodeInfo(@mr2 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT < 23 && textInputLayout != null) {
            accessibilityNodeInfo.setText(mo29144d(textInputLayout));
        }
    }

    public boolean requestRectangleOnScreen(@ts2 Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!mo29146f(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f24569a.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f24569a);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f24570b = z;
    }
}
