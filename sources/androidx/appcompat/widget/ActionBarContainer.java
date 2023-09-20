package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.onedelhi.secure.C3021o2;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.za3;

@hl3({hl3.C2354a.f13188c})
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    public Drawable f1215a;

    /* renamed from: a */
    public View f1216a;

    /* renamed from: b */
    public Drawable f1217b;

    /* renamed from: b */
    public View f1218b;

    /* renamed from: b */
    public boolean f1219b;

    /* renamed from: c */
    public Drawable f1220c;

    /* renamed from: c */
    public View f1221c;

    /* renamed from: c */
    public boolean f1222c;

    /* renamed from: d */
    public boolean f1223d;

    /* renamed from: n */
    public int f1224n;

    @sj3(21)
    /* renamed from: androidx.appcompat.widget.ActionBarContainer$a */
    public static class C0266a {
        /* renamed from: a */
        public static void m2038a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        jt4.m18877I1(this, new C3021o2(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, za3.C4068m.ActionBar);
        this.f1215a = obtainStyledAttributes.getDrawable(za3.C4068m.ActionBar_background);
        this.f1217b = obtainStyledAttributes.getDrawable(za3.C4068m.ActionBar_backgroundStacked);
        this.f1224n = obtainStyledAttributes.getDimensionPixelSize(za3.C4068m.ActionBar_height, -1);
        boolean z = true;
        if (getId() == za3.C4062g.split_action_bar) {
            this.f1222c = true;
            this.f1220c = obtainStyledAttributes.getDrawable(za3.C4068m.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1222c ? !(this.f1215a == null && this.f1217b == null) : this.f1220c != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    public final int mo1502a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final boolean mo1503b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1215a;
        if (drawable != null && drawable.isStateful()) {
            this.f1215a.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1217b;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1217b.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1220c;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1220c.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f1216a;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1215a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1217b;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1220c;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1218b = findViewById(za3.C4062g.action_bar);
        this.f1221c = findViewById(za3.C4062g.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1219b || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.f1216a;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i, (measuredHeight - view2.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f1222c) {
            Drawable drawable3 = this.f1220c;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f1215a != null) {
                if (this.f1218b.getVisibility() == 0) {
                    drawable2 = this.f1215a;
                    left = this.f1218b.getLeft();
                    top = this.f1218b.getTop();
                    right = this.f1218b.getRight();
                    view = this.f1218b;
                } else {
                    View view3 = this.f1221c;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f1215a.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.f1215a;
                        left = this.f1221c.getLeft();
                        top = this.f1221c.getTop();
                        right = this.f1221c.getRight();
                        view = this.f1221c;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f1223d = z4;
            if (!z4 || (drawable = this.f1217b) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1218b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001c
            int r0 = r3.f1224n
            if (r0 < 0) goto L_0x001c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f1218b
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f1216a
            if (r0 == 0) goto L_0x006f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x006f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x006f
            android.view.View r0 = r3.f1218b
            boolean r0 = r3.mo1503b(r0)
            if (r0 != 0) goto L_0x0047
            android.view.View r0 = r3.f1218b
        L_0x0042:
            int r0 = r3.mo1502a(r0)
            goto L_0x0053
        L_0x0047:
            android.view.View r0 = r3.f1221c
            boolean r0 = r3.mo1503b(r0)
            if (r0 != 0) goto L_0x0052
            android.view.View r0 = r3.f1221c
            goto L_0x0042
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r4 != r1) goto L_0x005a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x005d
        L_0x005a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x005d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f1216a
            int r1 = r3.mo1502a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1215a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1215a);
        }
        this.f1215a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1218b;
            if (view != null) {
                this.f1215a.setBounds(view.getLeft(), this.f1218b.getTop(), this.f1218b.getRight(), this.f1218b.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1222c ? !(this.f1215a == null && this.f1217b == null) : this.f1220c != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        C0266a.m2038a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1220c;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1220c);
        }
        this.f1220c = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1222c && (drawable2 = this.f1220c) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1222c ? this.f1215a == null && this.f1217b == null : this.f1220c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        C0266a.m2038a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1217b;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1217b);
        }
        this.f1217b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1223d && (drawable2 = this.f1217b) != null) {
                drawable2.setBounds(this.f1216a.getLeft(), this.f1216a.getTop(), this.f1216a.getRight(), this.f1216a.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1222c ? !(this.f1215a == null && this.f1217b == null) : this.f1220c != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        C0266a.m2038a(this);
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f1216a;
        if (view != null) {
            removeView(view);
        }
        this.f1216a = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f1219b = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1215a;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1217b;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1220c;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1215a && !this.f1222c) || (drawable == this.f1217b && this.f1223d) || ((drawable == this.f1220c && this.f1222c) || super.verifyDrawable(drawable));
    }
}
