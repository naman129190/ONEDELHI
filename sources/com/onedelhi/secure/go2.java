package com.onedelhi.secure;

import android.view.View;
import android.view.ViewGroup;

public class go2 {

    /* renamed from: a */
    public int f12675a;

    /* renamed from: b */
    public int f12676b;

    public go2(@mr2 ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int mo16724a() {
        return this.f12675a | this.f12676b;
    }

    /* renamed from: b */
    public void mo16725b(@mr2 View view, @mr2 View view2, int i) {
        mo16726c(view, view2, i, 0);
    }

    /* renamed from: c */
    public void mo16726c(@mr2 View view, @mr2 View view2, int i, int i2) {
        if (i2 == 1) {
            this.f12676b = i;
        } else {
            this.f12675a = i;
        }
    }

    /* renamed from: d */
    public void mo16727d(@mr2 View view) {
        mo16728e(view, 0);
    }

    /* renamed from: e */
    public void mo16728e(@mr2 View view, int i) {
        if (i == 1) {
            this.f12676b = 0;
        } else {
            this.f12675a = 0;
        }
    }
}
