package com.onedelhi.secure;

import android.app.Dialog;
import android.os.Bundle;
import com.onedelhi.secure.hl3;

/* renamed from: com.onedelhi.secure.h8 */
public class C2318h8 extends wk0 {
    public C2318h8() {
    }

    public C2318h8(@s12 int i) {
        super(i);
    }

    @mr2
    public Dialog onCreateDialog(@ts2 Bundle bundle) {
        return new C2223g8(getContext(), getTheme());
    }

    @hl3({hl3.C2354a.f13188c})
    public void setupDialog(@mr2 Dialog dialog, int i) {
        if (dialog instanceof C2223g8) {
            C2223g8 g8Var = (C2223g8) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            g8Var.mo16391i(1);
            return;
        }
        super.setupDialog(dialog, i);
    }
}
