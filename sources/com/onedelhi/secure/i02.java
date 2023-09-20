package com.onedelhi.secure;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

public class i02 extends Paint {
    public i02() {
    }

    public i02(int i) {
        super(i);
    }

    public i02(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }

    public i02(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public void setTextLocales(@mr2 LocaleList localeList) {
    }
}
