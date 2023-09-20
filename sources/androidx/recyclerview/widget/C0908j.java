package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

/* renamed from: androidx.recyclerview.widget.j */
public class C0908j extends RecyclerView.C0818o {

    /* renamed from: a */
    public static final String f4989a = "DividerItem";

    /* renamed from: a */
    public static final int[] f4990a = {16843284};

    /* renamed from: b */
    public static final int f4991b = 0;

    /* renamed from: c */
    public static final int f4992c = 1;

    /* renamed from: a */
    public int f4993a;

    /* renamed from: a */
    public final Rect f4994a = new Rect();

    /* renamed from: a */
    public Drawable f4995a;

    public C0908j(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f4990a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f4995a = drawable;
        if (drawable == null) {
            Log.w(f4989a, "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        mo6340p(i);
    }

    /* renamed from: g */
    public void mo5781g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0797c0 c0Var) {
        Drawable drawable = this.f4995a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f4993a == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    /* renamed from: i */
    public void mo5783i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0797c0 c0Var) {
        if (recyclerView.getLayoutManager() != null && this.f4995a != null) {
            if (this.f4993a == 1) {
                mo6337m(canvas, recyclerView);
            } else {
                mo6336l(canvas, recyclerView);
            }
        }
    }

    /* renamed from: l */
    public final void mo6336l(Canvas canvas, RecyclerView recyclerView) {
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
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.getLayoutManager().mo5843X(childAt, this.f4994a);
            int round = this.f4994a.right + Math.round(childAt.getTranslationX());
            this.f4995a.setBounds(round - this.f4995a.getIntrinsicWidth(), i2, round, i);
            this.f4995a.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: m */
    public final void mo6337m(Canvas canvas, RecyclerView recyclerView) {
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
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.mo5546v0(childAt, this.f4994a);
            int round = this.f4994a.bottom + Math.round(childAt.getTranslationY());
            this.f4995a.setBounds(i2, round - this.f4995a.getIntrinsicHeight(), i, round);
            this.f4995a.draw(canvas);
        }
        canvas.restore();
    }

    @ts2
    /* renamed from: n */
    public Drawable mo6338n() {
        return this.f4995a;
    }

    /* renamed from: o */
    public void mo6339o(@mr2 Drawable drawable) {
        if (drawable != null) {
            this.f4995a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    /* renamed from: p */
    public void mo6340p(int i) {
        if (i == 0 || i == 1) {
            this.f4993a = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }
}
