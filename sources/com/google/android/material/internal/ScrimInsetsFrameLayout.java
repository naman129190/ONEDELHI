package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.ju2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ob4;
import com.onedelhi.secure.sx4;
import com.onedelhi.secure.ts2;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: a */
    public Rect f24044a;
    @ts2

    /* renamed from: a */
    public Drawable f24045a;

    /* renamed from: b */
    public Rect f24046b;

    /* renamed from: b */
    public boolean f24047b;

    /* renamed from: c */
    public boolean f24048c;

    /* renamed from: com.google.android.material.internal.ScrimInsetsFrameLayout$a */
    public class C4150a implements ju2 {
        public C4150a() {
        }

        /* renamed from: a */
        public sx4 mo1063a(View view, @mr2 sx4 sx4) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f24044a == null) {
                scrimInsetsFrameLayout.f24044a = new Rect();
            }
            ScrimInsetsFrameLayout.this.f24044a.set(sx4.mo24603p(), sx4.mo24605r(), sx4.mo24604q(), sx4.mo24602o());
            ScrimInsetsFrameLayout.this.mo28266a(sx4);
            ScrimInsetsFrameLayout.this.setWillNotDraw(!sx4.mo24610w() || ScrimInsetsFrameLayout.this.f24045a == null);
            jt4.m18985n1(ScrimInsetsFrameLayout.this);
            return sx4.mo24588c();
        }
    }

    public ScrimInsetsFrameLayout(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public ScrimInsetsFrameLayout(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24046b = new Rect();
        this.f24047b = true;
        this.f24048c = true;
        TypedArray k = ob4.m59195k(context, attributeSet, fd3.C2165o.ScrimInsetsFrameLayout, i, fd3.C2164n.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f24045a = k.getDrawable(fd3.C2165o.ScrimInsetsFrameLayout_insetForeground);
        k.recycle();
        setWillNotDraw(true);
        jt4.m18934a2(this, new C4150a());
    }

    /* renamed from: a */
    public void mo28266a(sx4 sx4) {
    }

    public void draw(@mr2 Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f24044a != null && this.f24045a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (this.f24047b) {
                this.f24046b.set(0, 0, width, this.f24044a.top);
                this.f24045a.setBounds(this.f24046b);
                this.f24045a.draw(canvas);
            }
            if (this.f24048c) {
                this.f24046b.set(0, height - this.f24044a.bottom, width, height);
                this.f24045a.setBounds(this.f24046b);
                this.f24045a.draw(canvas);
            }
            Rect rect = this.f24046b;
            Rect rect2 = this.f24044a;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f24045a.setBounds(this.f24046b);
            this.f24045a.draw(canvas);
            Rect rect3 = this.f24046b;
            Rect rect4 = this.f24044a;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f24045a.setBounds(this.f24046b);
            this.f24045a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f24045a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f24045a;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f24048c = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f24047b = z;
    }

    public void setScrimInsetForeground(@ts2 Drawable drawable) {
        this.f24045a = drawable;
    }
}
