package com.onedelhi.secure;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import com.onedelhi.secure.hl3;

/* renamed from: com.onedelhi.secure.w1 */
public final class C3823w1 extends ClickableSpan {
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})

    /* renamed from: b */
    public static final String f22024b = "ACCESSIBILITY_CLICKABLE_SPAN_ID";

    /* renamed from: a */
    public final C1638a2 f22025a;

    /* renamed from: n */
    public final int f22026n;

    /* renamed from: o */
    public final int f22027o;

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    public C3823w1(int i, @mr2 C1638a2 a2Var, int i2) {
        this.f22026n = i;
        this.f22025a = a2Var;
        this.f22027o = i2;
    }

    public void onClick(@mr2 View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(f22024b, this.f22026n);
        this.f22025a.mo12503H0(this.f22027o, bundle);
    }
}
