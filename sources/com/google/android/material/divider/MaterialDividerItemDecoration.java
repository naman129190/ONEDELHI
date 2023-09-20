package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.af2;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.k10;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ob4;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wo0;
import com.onedelhi.secure.yk0;

public class MaterialDividerItemDecoration extends RecyclerView.C0818o {

    /* renamed from: f */
    public static final int f8358f = 0;

    /* renamed from: g */
    public static final int f8359g = 1;

    /* renamed from: h */
    public static final int f8360h = fd3.C2164n.Widget_MaterialComponents_MaterialDivider;

    /* renamed from: a */
    public int f8361a;

    /* renamed from: a */
    public final Rect f8362a;
    @mr2

    /* renamed from: a */
    public Drawable f8363a;

    /* renamed from: a */
    public boolean f8364a;
    @d10

    /* renamed from: b */
    public int f8365b;

    /* renamed from: c */
    public int f8366c;

    /* renamed from: d */
    public int f8367d;

    /* renamed from: e */
    public int f8368e;

    public MaterialDividerItemDecoration(@mr2 Context context, int i) {
        this(context, (AttributeSet) null, i);
    }

    public MaterialDividerItemDecoration(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        this(context, attributeSet, fd3.C2153c.materialDividerStyle, i);
    }

    public MaterialDividerItemDecoration(@mr2 Context context, @ts2 AttributeSet attributeSet, int i, int i2) {
        this.f8362a = new Rect();
        TypedArray k = ob4.m59195k(context, attributeSet, fd3.C2165o.MaterialDivider, i, f8360h, new int[0]);
        this.f8365b = af2.m38610a(context, k, fd3.C2165o.MaterialDivider_dividerColor).getDefaultColor();
        this.f8361a = k.getDimensionPixelSize(fd3.C2165o.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(fd3.C2156f.material_divider_thickness));
        this.f8367d = k.getDimensionPixelOffset(fd3.C2165o.MaterialDivider_dividerInsetStart, 0);
        this.f8368e = k.getDimensionPixelOffset(fd3.C2165o.MaterialDivider_dividerInsetEnd, 0);
        this.f8364a = k.getBoolean(fd3.C2165o.MaterialDivider_lastItemDecorated, true);
        k.recycle();
        this.f8363a = new ShapeDrawable();
        mo12158t(this.f8365b);
        mo12149C(i2);
    }

    /* renamed from: A */
    public void mo12147A(@mr2 Context context, @yk0 int i) {
        mo12164z(context.getResources().getDimensionPixelSize(i));
    }

    /* renamed from: B */
    public void mo12148B(boolean z) {
        this.f8364a = z;
    }

    /* renamed from: C */
    public void mo12149C(int i) {
        if (i == 0 || i == 1) {
            this.f8366c = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i + ". It should be either HORIZONTAL or VERTICAL");
    }

    /* renamed from: g */
    public void mo5781g(@mr2 Rect rect, @mr2 View view, @mr2 RecyclerView recyclerView, @mr2 RecyclerView.C0797c0 c0Var) {
        rect.set(0, 0, 0, 0);
        if (!this.f8364a && recyclerView.mo5507r0(view) == c0Var.mo5609d() - 1) {
            return;
        }
        if (this.f8366c == 1) {
            rect.bottom = this.f8363a.getIntrinsicHeight() + this.f8361a;
        } else {
            rect.right = this.f8363a.getIntrinsicWidth() + this.f8361a;
        }
    }

    /* renamed from: i */
    public void mo5783i(@mr2 Canvas canvas, @mr2 RecyclerView recyclerView, @mr2 RecyclerView.C0797c0 c0Var) {
        if (recyclerView.getLayoutManager() != null) {
            if (this.f8366c == 1) {
                mo12151m(canvas, recyclerView);
            } else {
                mo12150l(canvas, recyclerView);
            }
        }
    }

    /* renamed from: l */
    public final void mo12150l(@mr2 Canvas canvas, @mr2 RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingTop();
            i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
        } else {
            i = recyclerView.getHeight();
            i2 = 0;
        }
        int i3 = i2 + this.f8367d;
        int i4 = i - this.f8368e;
        int childCount = recyclerView.getChildCount();
        if (!this.f8364a) {
            childCount--;
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            recyclerView.mo5546v0(childAt, this.f8362a);
            int round = this.f8362a.right + Math.round(childAt.getTranslationX());
            this.f8363a.setBounds((round - this.f8363a.getIntrinsicWidth()) - this.f8361a, i3, round, i4);
            this.f8363a.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: m */
    public final void mo12151m(@mr2 Canvas canvas, @mr2 RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        boolean z = true;
        if (jt4.m18928Z(recyclerView) != 1) {
            z = false;
        }
        int i3 = i2 + (z ? this.f8368e : this.f8367d);
        int i4 = i - (z ? this.f8367d : this.f8368e);
        int childCount = recyclerView.getChildCount();
        if (!this.f8364a) {
            childCount--;
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            recyclerView.mo5546v0(childAt, this.f8362a);
            int round = this.f8362a.bottom + Math.round(childAt.getTranslationY());
            this.f8363a.setBounds(i3, (round - this.f8363a.getIntrinsicHeight()) - this.f8361a, i4, round);
            this.f8363a.draw(canvas);
        }
        canvas.restore();
    }

    @d10
    /* renamed from: n */
    public int mo12152n() {
        return this.f8365b;
    }

    @e83
    /* renamed from: o */
    public int mo12153o() {
        return this.f8368e;
    }

    @e83
    /* renamed from: p */
    public int mo12154p() {
        return this.f8367d;
    }

    @e83
    /* renamed from: q */
    public int mo12155q() {
        return this.f8361a;
    }

    /* renamed from: r */
    public int mo12156r() {
        return this.f8366c;
    }

    /* renamed from: s */
    public boolean mo12157s() {
        return this.f8364a;
    }

    /* renamed from: t */
    public void mo12158t(@d10 int i) {
        this.f8365b = i;
        Drawable r = wo0.m30989r(this.f8363a);
        this.f8363a = r;
        wo0.m30985n(r, i);
    }

    /* renamed from: u */
    public void mo12159u(@mr2 Context context, @k10 int i) {
        mo12158t(r70.m26353f(context, i));
    }

    /* renamed from: v */
    public void mo12160v(@e83 int i) {
        this.f8368e = i;
    }

    /* renamed from: w */
    public void mo12161w(@mr2 Context context, @yk0 int i) {
        mo12160v(context.getResources().getDimensionPixelOffset(i));
    }

    /* renamed from: x */
    public void mo12162x(@e83 int i) {
        this.f8367d = i;
    }

    /* renamed from: y */
    public void mo12163y(@mr2 Context context, @yk0 int i) {
        mo12162x(context.getResources().getDimensionPixelOffset(i));
    }

    /* renamed from: z */
    public void mo12164z(@e83 int i) {
        this.f8361a = i;
    }
}
