package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.n70;
import com.onedelhi.secure.oe2;
import com.onedelhi.secure.ts2;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class SnackbarContentLayout extends LinearLayout implements n70 {

    /* renamed from: a */
    public Button f24409a;

    /* renamed from: a */
    public TextView f24410a;

    /* renamed from: n */
    public int f24411n;

    public SnackbarContentLayout(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public SnackbarContentLayout(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: d */
    public static void m34004d(@mr2 View view, int i, int i2) {
        if (jt4.m18926Y0(view)) {
            jt4.m18946d2(view, jt4.m18972k0(view), i, jt4.m18968j0(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: a */
    public void mo28914a(int i, int i2) {
        this.f24410a.setAlpha(0.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f24410a.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f24409a.getVisibility() == 0) {
            this.f24409a.setAlpha(0.0f);
            this.f24409a.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* renamed from: b */
    public void mo28915b(int i, int i2) {
        this.f24410a.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f24410a.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f24409a.getVisibility() == 0) {
            this.f24409a.setAlpha(1.0f);
            this.f24409a.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* renamed from: c */
    public void mo28916c(float f) {
        if (f != 1.0f) {
            this.f24409a.setTextColor(oe2.m23728n(oe2.m23718d(this, fd3.C2153c.colorSurface), this.f24409a.getCurrentTextColor(), f));
        }
    }

    /* renamed from: e */
    public final boolean mo28917e(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f24410a.getPaddingTop() == i2 && this.f24410a.getPaddingBottom() == i3) {
            return z;
        }
        m34004d(this.f24410a, i2, i3);
        return true;
    }

    public Button getActionView() {
        return this.f24409a;
    }

    public TextView getMessageView() {
        return this.f24410a;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f24410a = (TextView) findViewById(fd3.C2158h.snackbar_text);
        this.f24409a = (Button) findViewById(fd3.C2158h.snackbar_action);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (mo28917e(1, r0, r0 - r2) != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (mo28917e(0, r0, r0) != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto L_0x000b
            return
        L_0x000b:
            android.content.res.Resources r0 = r7.getResources()
            int r2 = com.onedelhi.secure.fd3.C2156f.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            int r3 = com.onedelhi.secure.fd3.C2156f.design_snackbar_padding_vertical
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f24410a
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L_0x0030
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L_0x0030
            r3 = 1
            goto L_0x0031
        L_0x0030:
            r3 = 0
        L_0x0031:
            if (r3 == 0) goto L_0x004a
            int r5 = r7.f24411n
            if (r5 <= 0) goto L_0x004a
            android.widget.Button r5 = r7.f24409a
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f24411n
            if (r5 <= r6) goto L_0x004a
            int r2 = r0 - r2
            boolean r0 = r7.mo28917e(r1, r0, r2)
            if (r0 == 0) goto L_0x0055
            goto L_0x0056
        L_0x004a:
            if (r3 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r0 = r2
        L_0x004e:
            boolean r0 = r7.mo28917e(r4, r0, r0)
            if (r0 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r1 = 0
        L_0x0056:
            if (r1 == 0) goto L_0x005b
            super.onMeasure(r8, r9)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f24411n = i;
    }
}
