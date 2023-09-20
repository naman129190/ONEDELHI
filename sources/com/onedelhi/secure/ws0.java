package com.onedelhi.secure;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.C0552c;
import com.onedelhi.secure.hl3;

@sj3(19)
@hl3({hl3.C2354a.LIBRARY})
public final class ws0 implements KeyListener {

    /* renamed from: a */
    public final KeyListener f22269a;

    /* renamed from: a */
    public final C3871a f22270a;

    /* renamed from: com.onedelhi.secure.ws0$a */
    public static class C3871a {
        /* renamed from: a */
        public boolean mo26675a(@mr2 Editable editable, int i, @mr2 KeyEvent keyEvent) {
            return C0552c.m4107h(editable, i, keyEvent);
        }
    }

    public ws0(KeyListener keyListener) {
        this(keyListener, new C3871a());
    }

    public ws0(KeyListener keyListener, C3871a aVar) {
        this.f22269a = keyListener;
        this.f22270a = aVar;
    }

    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.f22269a.clearMetaKeyState(view, editable, i);
    }

    public int getInputType() {
        return this.f22269a.getInputType();
    }

    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f22270a.mo26675a(editable, i, keyEvent) || this.f22269a.onKeyDown(view, editable, i, keyEvent);
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f22269a.onKeyOther(view, editable, keyEvent);
    }

    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f22269a.onKeyUp(view, editable, i, keyEvent);
    }
}
