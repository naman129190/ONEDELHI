package com.onedelhi.secure;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.onedelhi.secure.za3;

/* renamed from: com.onedelhi.secure.j8 */
public class C2480j8 {
    @mr2

    /* renamed from: a */
    public final EditText f14038a;
    @mr2

    /* renamed from: a */
    public final ss0 f14039a;

    public C2480j8(@mr2 EditText editText) {
        this.f14038a = editText;
        this.f14039a = new ss0(editText, false);
    }

    @ts2
    /* renamed from: a */
    public KeyListener mo18158a(@ts2 KeyListener keyListener) {
        return mo18159b(keyListener) ? this.f14039a.mo24517b(keyListener) : keyListener;
    }

    /* renamed from: b */
    public boolean mo18159b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* renamed from: c */
    public boolean mo18160c() {
        return this.f14039a.mo24519d();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public void mo18161d(@ts2 AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f14038a.getContext().obtainStyledAttributes(attributeSet, za3.C4068m.AppCompatTextView, i, 0);
        try {
            int i2 = za3.C4068m.AppCompatTextView_emojiCompatEnabled;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            mo18163f(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @ts2
    /* renamed from: e */
    public InputConnection mo18162e(@ts2 InputConnection inputConnection, @mr2 EditorInfo editorInfo) {
        return this.f14039a.mo24520e(inputConnection, editorInfo);
    }

    /* renamed from: f */
    public void mo18163f(boolean z) {
        this.f14039a.mo24522g(z);
    }
}
