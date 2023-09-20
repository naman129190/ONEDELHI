package com.onedelhi.secure;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.za3;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class tf4 {

    /* renamed from: a */
    public static final String f20781a = "TooltipPopup";

    /* renamed from: a */
    public final Context f20782a;

    /* renamed from: a */
    public final Rect f20783a = new Rect();

    /* renamed from: a */
    public final View f20784a;

    /* renamed from: a */
    public final WindowManager.LayoutParams f20785a;

    /* renamed from: a */
    public final TextView f20786a;

    /* renamed from: a */
    public final int[] f20787a = new int[2];

    /* renamed from: b */
    public final int[] f20788b = new int[2];

    public tf4(@mr2 Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f20785a = layoutParams;
        this.f20782a = context;
        View inflate = LayoutInflater.from(context).inflate(za3.C4065j.abc_tooltip, (ViewGroup) null);
        this.f20784a = inflate;
        this.f20786a = (TextView) inflate.findViewById(za3.C4062g.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = za3.C4067l.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: b */
    public static View m28390b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* renamed from: a */
    public final void mo24895a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f20782a.getResources().getDimensionPixelOffset(za3.C4060e.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f20782a.getResources().getDimensionPixelOffset(za3.C4060e.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f20782a.getResources().getDimensionPixelOffset(z ? za3.C4060e.tooltip_y_offset_touch : za3.C4060e.tooltip_y_offset_non_touch);
        View b = m28390b(view);
        if (b == null) {
            Log.e(f20781a, "Cannot find app view");
            return;
        }
        b.getWindowVisibleDisplayFrame(this.f20783a);
        Rect rect = this.f20783a;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f20782a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f20783a.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b.getLocationOnScreen(this.f20788b);
        view.getLocationOnScreen(this.f20787a);
        int[] iArr = this.f20787a;
        int i5 = iArr[0];
        int[] iArr2 = this.f20788b;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f20784a.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f20784a.getMeasuredHeight();
        int[] iArr3 = this.f20787a;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (!z ? measuredHeight + i7 > this.f20783a.height() : i6 >= 0) {
            layoutParams.y = i6;
        } else {
            layoutParams.y = i7;
        }
    }

    /* renamed from: c */
    public void mo24896c() {
        if (mo24897d()) {
            ((WindowManager) this.f20782a.getSystemService("window")).removeView(this.f20784a);
        }
    }

    /* renamed from: d */
    public boolean mo24897d() {
        return this.f20784a.getParent() != null;
    }

    /* renamed from: e */
    public void mo24898e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo24897d()) {
            mo24896c();
        }
        this.f20786a.setText(charSequence);
        mo24895a(view, i, i2, z, this.f20785a);
        ((WindowManager) this.f20782a.getSystemService("window")).addView(this.f20784a, this.f20785a);
    }
}
