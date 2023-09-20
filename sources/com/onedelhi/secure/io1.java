package com.onedelhi.secure;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.maps.android.p003ui.RotationLayout;
import com.onedelhi.secure.xd3;

public class io1 {

    /* renamed from: b */
    public static final int f30383b = 1;

    /* renamed from: c */
    public static final int f30384c = 2;

    /* renamed from: d */
    public static final int f30385d = 3;

    /* renamed from: e */
    public static final int f30386e = 4;

    /* renamed from: f */
    public static final int f30387f = 5;

    /* renamed from: g */
    public static final int f30388g = 6;

    /* renamed from: h */
    public static final int f30389h = 7;

    /* renamed from: a */
    public float f30390a = 0.5f;

    /* renamed from: a */
    public int f30391a;

    /* renamed from: a */
    public final Context f30392a;

    /* renamed from: a */
    public View f30393a;

    /* renamed from: a */
    public ViewGroup f30394a;

    /* renamed from: a */
    public TextView f30395a;

    /* renamed from: a */
    public RotationLayout f30396a;

    /* renamed from: a */
    public C6039lo f30397a;

    /* renamed from: b */
    public float f30398b = 1.0f;

    public io1(Context context) {
        this.f30392a = context;
        this.f30397a = new C6039lo(context.getResources());
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(xd3.C7237f.amu_text_bubble, (ViewGroup) null);
        this.f30394a = viewGroup;
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        this.f30396a = rotationLayout;
        TextView textView = (TextView) rotationLayout.findViewById(xd3.C7235d.amu_text);
        this.f30395a = textView;
        this.f30393a = textView;
        mo38186n(1);
    }

    /* renamed from: c */
    public static int m52483c(int i) {
        if (i == 3) {
            return -3407872;
        }
        if (i == 4) {
            return -16737844;
        }
        if (i == 5) {
            return -10053376;
        }
        if (i != 6) {
            return i != 7 ? -1 : -30720;
        }
        return -6736948;
    }

    /* renamed from: d */
    public static int m52484d(int i) {
        return (i == 3 || i == 4 || i == 5 || i == 6 || i == 7) ? xd3.C7240i.amu_Bubble_TextAppearance_Light : xd3.C7240i.amu_Bubble_TextAppearance_Dark;
    }

    /* renamed from: a */
    public float mo38175a() {
        return mo38179g(this.f30390a, this.f30398b);
    }

    /* renamed from: b */
    public float mo38176b() {
        return mo38179g(this.f30398b, this.f30390a);
    }

    /* renamed from: e */
    public Bitmap mo38177e() {
        float f;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f30394a.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = this.f30394a.getMeasuredWidth();
        int measuredHeight = this.f30394a.getMeasuredHeight();
        this.f30394a.layout(0, 0, measuredWidth, measuredHeight);
        int i = this.f30391a;
        if (i == 1 || i == 3) {
            measuredHeight = this.f30394a.getMeasuredWidth();
            measuredWidth = this.f30394a.getMeasuredHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        Canvas canvas = new Canvas(createBitmap);
        int i2 = this.f30391a;
        if (i2 != 0) {
            if (i2 == 1) {
                canvas.translate((float) measuredWidth, 0.0f);
                f = 90.0f;
            } else if (i2 == 2) {
                canvas.rotate(180.0f, (float) (measuredWidth / 2), (float) (measuredHeight / 2));
            } else {
                canvas.translate(0.0f, (float) measuredHeight);
                f = 270.0f;
            }
            canvas.rotate(f);
        }
        this.f30394a.draw(canvas);
        return createBitmap;
    }

    /* renamed from: f */
    public Bitmap mo38178f(CharSequence charSequence) {
        TextView textView = this.f30395a;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return mo38177e();
    }

    /* renamed from: g */
    public final float mo38179g(float f, float f2) {
        int i = this.f30391a;
        if (i == 0) {
            return f;
        }
        if (i == 1) {
            return 1.0f - f2;
        }
        if (i == 2) {
            return 1.0f - f;
        }
        if (i == 3) {
            return f2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public void mo38180h(Drawable drawable) {
        this.f30394a.setBackgroundDrawable(drawable);
        if (drawable != null) {
            Rect rect = new Rect();
            drawable.getPadding(rect);
            this.f30394a.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            return;
        }
        this.f30394a.setPadding(0, 0, 0, 0);
    }

    /* renamed from: i */
    public void mo38181i(int i) {
        this.f30397a.mo40136a(i);
        mo38180h(this.f30397a);
    }

    /* renamed from: j */
    public void mo38182j(int i, int i2, int i3, int i4) {
        this.f30393a.setPadding(i, i2, i3, i4);
    }

    /* renamed from: k */
    public void mo38183k(int i) {
        this.f30396a.setViewRotation(i);
    }

    /* renamed from: l */
    public void mo38184l(View view) {
        this.f30396a.removeAllViews();
        this.f30396a.addView(view);
        this.f30393a = view;
        View findViewById = this.f30396a.findViewById(xd3.C7235d.amu_text);
        this.f30395a = findViewById instanceof TextView ? (TextView) findViewById : null;
    }

    /* renamed from: m */
    public void mo38185m(int i) {
        this.f30391a = ((i + 360) % 360) / 90;
    }

    /* renamed from: n */
    public void mo38186n(int i) {
        mo38181i(m52483c(i));
        mo38188p(this.f30392a, m52484d(i));
    }

    /* renamed from: o */
    public void mo38187o(int i) {
        mo38188p(this.f30392a, i);
    }

    /* renamed from: p */
    public void mo38188p(Context context, int i) {
        TextView textView = this.f30395a;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }
}
