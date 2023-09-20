package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0348a;
import com.onedelhi.secure.za3;

/* renamed from: com.onedelhi.secure.c0 */
public abstract class C1828c0 extends ViewGroup {

    /* renamed from: o */
    public static final int f10044o = 200;

    /* renamed from: a */
    public final Context f10045a;

    /* renamed from: a */
    public ActionMenuView f10046a;

    /* renamed from: a */
    public C0348a f10047a;

    /* renamed from: a */
    public final C1830b f10048a;

    /* renamed from: a */
    public vu4 f10049a;

    /* renamed from: b */
    public boolean f10050b;

    /* renamed from: c */
    public boolean f10051c;

    /* renamed from: n */
    public int f10052n;

    /* renamed from: com.onedelhi.secure.c0$a */
    public class C1829a implements Runnable {
        public C1829a() {
        }

        public void run() {
            C1828c0.this.mo1537o();
        }
    }

    /* renamed from: com.onedelhi.secure.c0$b */
    public class C1830b implements xu4 {

        /* renamed from: a */
        public int f10054a;

        /* renamed from: a */
        public boolean f10056a = false;

        public C1830b() {
        }

        /* renamed from: a */
        public void mo1068a(View view) {
            if (!this.f10056a) {
                C1828c0 c0Var = C1828c0.this;
                c0Var.f10049a = null;
                C1828c0.super.setVisibility(this.f10054a);
            }
        }

        /* renamed from: b */
        public void mo1069b(View view) {
            C1828c0.super.setVisibility(0);
            this.f10056a = false;
        }

        /* renamed from: c */
        public void mo2607c(View view) {
            this.f10056a = true;
        }

        /* renamed from: d */
        public C1830b mo13875d(vu4 vu4, int i) {
            C1828c0.this.f10049a = vu4;
            this.f10054a = i;
            return this;
        }
    }

    public C1828c0(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public C1828c0(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1828c0(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10048a = new C1830b();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(za3.C4057b.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f10045a = context;
        } else {
            this.f10045a = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: k */
    public static int m12161k(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* renamed from: c */
    public void mo1522c(int i) {
        mo1536n(i, 200).mo26376y();
    }

    /* renamed from: d */
    public boolean mo1523d() {
        return mo1534i() && getVisibility() == 0;
    }

    /* renamed from: e */
    public void mo1524e() {
        C0348a aVar = this.f10047a;
        if (aVar != null) {
            aVar.mo2474B();
        }
    }

    /* renamed from: f */
    public boolean mo1525f() {
        C0348a aVar = this.f10047a;
        if (aVar != null) {
            return aVar.mo2477E();
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo1526g() {
        C0348a aVar = this.f10047a;
        if (aVar != null) {
            return aVar.mo2479G();
        }
        return false;
    }

    public int getAnimatedVisibility() {
        return this.f10049a != null ? this.f10048a.f10054a : getVisibility();
    }

    public int getContentHeight() {
        return this.f10052n;
    }

    /* renamed from: h */
    public boolean mo1533h() {
        C0348a aVar = this.f10047a;
        if (aVar != null) {
            return aVar.mo2480H();
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo1534i() {
        C0348a aVar = this.f10047a;
        return aVar != null && aVar.mo2481I();
    }

    /* renamed from: j */
    public int mo13871j(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* renamed from: l */
    public int mo13872l(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: m */
    public void mo1535m() {
        post(new C1829a());
    }

    /* renamed from: n */
    public vu4 mo1536n(int i, long j) {
        vu4 b;
        vu4 vu4 = this.f10049a;
        if (vu4 != null) {
            vu4.mo26356d();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            b = jt4.m18955g(this).mo26354b(1.0f);
        } else {
            b = jt4.m18955g(this).mo26354b(0.0f);
        }
        b.mo26370s(j);
        b.mo26372u(this.f10048a.mo13875d(b, i));
        return b;
    }

    /* renamed from: o */
    public boolean mo1537o() {
        C0348a aVar = this.f10047a;
        if (aVar != null) {
            return aVar.mo2489Q();
        }
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, za3.C4068m.ActionBar, za3.C4057b.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(za3.C4068m.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        C0348a aVar = this.f10047a;
        if (aVar != null) {
            aVar.mo2482J(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f10051c = false;
        }
        if (!this.f10051c) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f10051c = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f10051c = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f10050b = false;
        }
        if (!this.f10050b) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f10050b = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f10050b = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f10052n = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            vu4 vu4 = this.f10049a;
            if (vu4 != null) {
                vu4.mo26356d();
            }
            super.setVisibility(i);
        }
    }
}
