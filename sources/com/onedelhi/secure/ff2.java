package com.onedelhi.secure;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.f13187b, hl3.C2354a.f13190e})
public class ff2 extends DatePickerDialog {
    @C3982yb

    /* renamed from: n */
    public static final int f12054n = 16843612;
    @e64

    /* renamed from: o */
    public static final int f12055o = fd3.C2164n.MaterialAlertDialog_MaterialComponents_Picker_Date_Spinner;
    @mr2

    /* renamed from: a */
    public final Rect f12056a;
    @mr2

    /* renamed from: a */
    public final Drawable f12057a;

    public ff2(@mr2 Context context) {
        this(context, 0);
    }

    public ff2(@mr2 Context context, int i) {
        this(context, i, (DatePickerDialog.OnDateSetListener) null, -1, -1, -1);
    }

    public ff2(@mr2 Context context, int i, @ts2 DatePickerDialog.OnDateSetListener onDateSetListener, int i2, int i3, int i4) {
        super(context, i, onDateSetListener, i2, i3, i4);
        Context context2 = getContext();
        int g = je2.m53278g(getContext(), fd3.C2153c.colorSurface, getClass().getCanonicalName());
        int i5 = f12055o;
        bf2 bf2 = new bf2(context2, (AttributeSet) null, f12054n, i5);
        bf2.mo31626o0(ColorStateList.valueOf(g));
        Rect a = se2.m27488a(context2, f12054n, i5);
        this.f12056a = a;
        this.f12057a = se2.m27489b(bf2, a);
    }

    public ff2(@mr2 Context context, @ts2 DatePickerDialog.OnDateSetListener onDateSetListener, int i, int i2, int i3) {
        this(context, 0, onDateSetListener, i, i2, i3);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(this.f12057a);
        getWindow().getDecorView().setOnTouchListener(new fr1(this, this.f12056a));
    }
}
