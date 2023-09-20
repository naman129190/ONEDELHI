package com.onedelhi.secure;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.C0552c;
import com.onedelhi.secure.hl3;

@sj3(19)
@hl3({hl3.C2354a.LIBRARY})
public final class us0 extends InputConnectionWrapper {

    /* renamed from: a */
    public final TextView f21515a;

    /* renamed from: a */
    public final C3741a f21516a;

    /* renamed from: com.onedelhi.secure.us0$a */
    public static class C3741a {
        /* renamed from: a */
        public boolean mo25721a(@mr2 InputConnection inputConnection, @mr2 Editable editable, @js1(from = 0) int i, @js1(from = 0) int i2, boolean z) {
            return C0552c.m4106g(inputConnection, editable, i, i2, z);
        }

        /* renamed from: b */
        public void mo25722b(@mr2 EditorInfo editorInfo) {
            if (C0552c.m4111n()) {
                C0552c.m4105b().mo4166D(editorInfo);
            }
        }
    }

    public us0(@mr2 TextView textView, @mr2 InputConnection inputConnection, @mr2 EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new C3741a());
    }

    public us0(@mr2 TextView textView, @mr2 InputConnection inputConnection, @mr2 EditorInfo editorInfo, @mr2 C3741a aVar) {
        super(inputConnection, false);
        this.f21515a = textView;
        this.f21516a = aVar;
        aVar.mo25722b(editorInfo);
    }

    /* renamed from: a */
    public final Editable mo25718a() {
        return this.f21515a.getEditableText();
    }

    public boolean deleteSurroundingText(int i, int i2) {
        return this.f21516a.mo25721a(this, mo25718a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return this.f21516a.mo25721a(this, mo25718a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
