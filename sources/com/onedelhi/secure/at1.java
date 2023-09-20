package com.onedelhi.secure;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

public class at1 {

    /* renamed from: a */
    public View f25991a;

    /* renamed from: a */
    public final ViewTreeObserver.OnScrollChangedListener f25992a = new C4591a();

    /* renamed from: a */
    public ScrollView f25993a;

    /* renamed from: a */
    public bf2 f25994a;

    /* renamed from: a */
    public final int[] f25995a = new int[2];

    /* renamed from: b */
    public final int[] f25996b = new int[2];

    /* renamed from: com.onedelhi.secure.at1$a */
    public class C4591a implements ViewTreeObserver.OnScrollChangedListener {
        public C4591a() {
        }

        public void onScrollChanged() {
            at1.this.mo31154e();
        }
    }

    public at1(View view, bf2 bf2, ScrollView scrollView) {
        this.f25991a = view;
        this.f25994a = bf2;
        this.f25993a = scrollView;
    }

    /* renamed from: a */
    public void mo31150a(ScrollView scrollView) {
        this.f25993a = scrollView;
    }

    /* renamed from: b */
    public void mo31151b(bf2 bf2) {
        this.f25994a = bf2;
    }

    /* renamed from: c */
    public void mo31152c(@mr2 ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.f25992a);
    }

    /* renamed from: d */
    public void mo31153d(@mr2 ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.f25992a);
    }

    /* renamed from: e */
    public void mo31154e() {
        bf2 bf2;
        float f;
        ScrollView scrollView = this.f25993a;
        if (scrollView != null) {
            if (scrollView.getChildCount() != 0) {
                this.f25993a.getLocationInWindow(this.f25995a);
                this.f25993a.getChildAt(0).getLocationInWindow(this.f25996b);
                int top = (this.f25991a.getTop() - this.f25995a[1]) + this.f25996b[1];
                int height = this.f25991a.getHeight();
                int height2 = this.f25993a.getHeight();
                if (top < 0) {
                    bf2 = this.f25994a;
                    f = (((float) top) / ((float) height)) + 1.0f;
                } else {
                    int i = top + height;
                    if (i > height2) {
                        int i2 = i - height2;
                        bf2 = this.f25994a;
                        f = 1.0f - (((float) i2) / ((float) height));
                    } else if (this.f25994a.mo31648z() != 1.0f) {
                        this.f25994a.mo31629p0(1.0f);
                        this.f25991a.invalidate();
                        return;
                    } else {
                        return;
                    }
                }
                bf2.mo31629p0(Math.max(0.0f, Math.min(1.0f, f)));
                this.f25991a.invalidate();
                return;
            }
            throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
        }
    }
}
