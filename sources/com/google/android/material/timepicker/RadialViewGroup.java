package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0426d;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.onedelhi.secure.bf2;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ph3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.zk0;

class RadialViewGroup extends ConstraintLayout {

    /* renamed from: d */
    public static final String f24741d = "skip";

    /* renamed from: C */
    public int f24742C;

    /* renamed from: a */
    public bf2 f24743a;

    /* renamed from: a */
    public final Runnable f24744a;

    public RadialViewGroup(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public RadialViewGroup(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadialViewGroup(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(fd3.C2161k.material_radial_view_group, this);
        jt4.m18877I1(this, mo29527G());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fd3.C2165o.RadialViewGroup, i, 0);
        this.f24742C = obtainStyledAttributes.getDimensionPixelSize(fd3.C2165o.RadialViewGroup_materialCircleRadius, 0);
        this.f24744a = new C4282b(this);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: J */
    public static boolean m34424J(View view) {
        return f24741d.equals(view.getTag());
    }

    /* renamed from: G */
    public final Drawable mo29527G() {
        bf2 bf2 = new bf2();
        this.f24743a = bf2;
        bf2.mo31621l0(new ph3(0.5f));
        this.f24743a.mo31626o0(ColorStateList.valueOf(-1));
        return this.f24743a;
    }

    @zk0
    /* renamed from: H */
    public int mo29528H() {
        return this.f24742C;
    }

    /* renamed from: I */
    public void mo29498I(@zk0 int i) {
        this.f24742C = i;
        mo29529K();
    }

    /* renamed from: K */
    public void mo29529K() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (m34424J(getChildAt(i2))) {
                i++;
            }
        }
        C0426d dVar = new C0426d();
        dVar.mo3397H(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            int i4 = fd3.C2158h.circle_center;
            if (id != i4 && !m34424J(childAt)) {
                dVar.mo3407M(childAt.getId(), i4, this.f24742C, f);
                f += 360.0f / ((float) (childCount - i));
            }
        }
        dVar.mo3473r(this);
    }

    /* renamed from: L */
    public final void mo29530L() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f24744a);
            handler.post(this.f24744a);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(jt4.m18855D());
        }
        mo29530L();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        mo29529K();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        mo29530L();
    }

    public void setBackgroundColor(@d10 int i) {
        this.f24743a.mo31626o0(ColorStateList.valueOf(i));
    }
}
