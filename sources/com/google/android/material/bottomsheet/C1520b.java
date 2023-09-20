package com.google.android.material.bottomsheet;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.onedelhi.secure.C2318h8;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.s12;
import com.onedelhi.secure.ts2;

/* renamed from: com.google.android.material.bottomsheet.b */
public class C1520b extends C2318h8 {

    /* renamed from: b */
    public boolean f7970b;

    /* renamed from: com.google.android.material.bottomsheet.b$b */
    public class C1522b extends BottomSheetBehavior.C1503f {
        public C1522b() {
        }

        /* renamed from: b */
        public void mo7562b(@mr2 View view, float f) {
        }

        /* renamed from: c */
        public void mo7563c(@mr2 View view, int i) {
            if (i == 5) {
                C1520b.this.mo11327w();
            }
        }
    }

    public C1520b() {
    }

    @SuppressLint({"ValidFragment"})
    public C1520b(@s12 int i) {
        super(i);
    }

    /* renamed from: A */
    public final boolean mo11324A(boolean z) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof C1513a)) {
            return false;
        }
        C1513a aVar = (C1513a) dialog;
        BottomSheetBehavior<FrameLayout> o = aVar.mo11305o();
        if (!o.mo11217B0() || !aVar.mo11309p()) {
            return false;
        }
        mo11328y(o, z);
        return true;
    }

    public void dismiss() {
        if (!mo11324A(false)) {
            super.dismiss();
        }
    }

    public void dismissAllowingStateLoss() {
        if (!mo11324A(true)) {
            super.dismissAllowingStateLoss();
        }
    }

    @mr2
    public Dialog onCreateDialog(@ts2 Bundle bundle) {
        return new C1513a(getContext(), getTheme());
    }

    /* renamed from: w */
    public final void mo11327w() {
        if (this.f7970b) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    /* renamed from: y */
    public final void mo11328y(@mr2 BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.f7970b = z;
        if (bottomSheetBehavior.mo11277v0() == 5) {
            mo11327w();
            return;
        }
        if (getDialog() instanceof C1513a) {
            ((C1513a) getDialog()).mo11311r();
        }
        bottomSheetBehavior.mo11241Y(new C1522b());
        bottomSheetBehavior.mo11242Y0(5);
    }
}
