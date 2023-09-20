package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.onedelhi.secure.C1828c0;
import com.onedelhi.secure.C3563t2;
import com.onedelhi.secure.af4;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.rv4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.vu4;
import com.onedelhi.secure.za3;

@hl3({hl3.C2354a.f13188c})
public class ActionBarContextView extends C1828c0 {

    /* renamed from: a */
    public View f1225a;

    /* renamed from: a */
    public LinearLayout f1226a;

    /* renamed from: a */
    public TextView f1227a;

    /* renamed from: a */
    public CharSequence f1228a;

    /* renamed from: b */
    public View f1229b;

    /* renamed from: b */
    public TextView f1230b;

    /* renamed from: b */
    public CharSequence f1231b;

    /* renamed from: c */
    public View f1232c;

    /* renamed from: d */
    public boolean f1233d;

    /* renamed from: p */
    public int f1234p;

    /* renamed from: q */
    public int f1235q;

    /* renamed from: r */
    public int f1236r;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    public class C0267a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C3563t2 f1238a;

        public C0267a(C3563t2 t2Var) {
            this.f1238a = t2Var;
        }

        public void onClick(View view) {
            this.f1238a.mo1150c();
        }
    }

    public ActionBarContextView(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, za3.C4057b.actionModeStyle);
    }

    public ActionBarContextView(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        af4 G = af4.m11110G(context, attributeSet, za3.C4068m.ActionMode, i, 0);
        jt4.m18877I1(this, G.mo13037h(za3.C4068m.ActionMode_background));
        this.f1234p = G.mo13050u(za3.C4068m.ActionMode_titleTextStyle, 0);
        this.f1235q = G.mo13050u(za3.C4068m.ActionMode_subtitleTextStyle, 0);
        this.f10052n = G.mo13046q(za3.C4068m.ActionMode_height, 0);
        this.f1236r = G.mo13050u(za3.C4068m.ActionMode_closeItemLayout, za3.C4065j.abc_action_mode_close_item_material);
        G.mo13029I();
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo1522c(int i) {
        super.mo1522c(i);
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ boolean mo1523d() {
        return super.mo1523d();
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ void mo1524e() {
        super.mo1524e();
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
    public /* bridge */ /* synthetic */ boolean mo1526g() {
        return super.mo1526g();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1231b;
    }

    public CharSequence getTitle() {
        return this.f1228a;
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
    public /* bridge */ /* synthetic */ boolean mo1534i() {
        return super.mo1534i();
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ void mo1535m() {
        super.mo1535m();
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ vu4 mo1536n(int i, long j) {
        return super.mo1536n(i, j);
    }

    /* renamed from: o */
    public boolean mo1537o() {
        C0348a aVar = this.f10047a;
        if (aVar != null) {
            return aVar.mo2489Q();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0348a aVar = this.f10047a;
        if (aVar != null) {
            aVar.mo2477E();
            this.f10047a.mo2478F();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean b = rv4.m27093b(this);
        int paddingRight = b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1225a;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1225a.getLayoutParams();
            int i5 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int k = C1828c0.m12161k(paddingRight, i5, b);
            paddingRight = C1828c0.m12161k(k + mo13872l(this.f1225a, k, paddingTop, paddingTop2, b), i6, b);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.f1226a;
        if (!(linearLayout == null || this.f1232c != null || linearLayout.getVisibility() == 8)) {
            i7 += mo13872l(this.f1226a, i7, paddingTop, paddingTop2, b);
        }
        int i8 = i7;
        View view2 = this.f1232c;
        if (view2 != null) {
            mo13872l(view2, i8, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f10046a;
        if (actionMenuView != null) {
            mo13872l(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.f10052n;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f1225a;
            if (view != null) {
                int j = mo13871j(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1225a.getLayoutParams();
                paddingLeft = j - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f10046a;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo13871j(this.f10046a, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f1226a;
            if (linearLayout != null && this.f1232c == null) {
                if (this.f1233d) {
                    this.f1226a.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1226a.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f1226a.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo13871j(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f1232c;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width;
                int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i6 >= 0) {
                    paddingLeft = Math.min(i6, paddingLeft);
                }
                int i8 = layoutParams.height;
                if (i8 == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f1232c.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f10052n <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public void mo1543p() {
        if (this.f1225a == null) {
            mo1554t();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1544q(com.onedelhi.secure.C3563t2 r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1225a
            if (r0 != 0) goto L_0x0019
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f1236r
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f1225a = r0
        L_0x0015:
            r3.addView(r0)
            goto L_0x0022
        L_0x0019:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0022
            android.view.View r0 = r3.f1225a
            goto L_0x0015
        L_0x0022:
            android.view.View r0 = r3.f1225a
            int r1 = com.onedelhi.secure.za3.C4062g.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            r3.f1229b = r0
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.mo1152e()
            androidx.appcompat.view.menu.e r4 = (androidx.appcompat.view.menu.C0248e) r4
            androidx.appcompat.widget.a r0 = r3.f10047a
            if (r0 == 0) goto L_0x0041
            r0.mo2474B()
        L_0x0041:
            androidx.appcompat.widget.a r0 = new androidx.appcompat.widget.a
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f10047a = r0
            r1 = 1
            r0.mo2487O(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.a r1 = r3.f10047a
            android.content.Context r2 = r3.f10045a
            r4.mo1323c(r1, r2)
            androidx.appcompat.widget.a r4 = r3.f10047a
            androidx.appcompat.view.menu.k r4 = r4.mo1216f(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f10046a = r4
            r1 = 0
            com.onedelhi.secure.jt4.m18877I1(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f10046a
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.mo1544q(com.onedelhi.secure.t2):void");
    }

    /* renamed from: r */
    public final void mo1545r() {
        if (this.f1226a == null) {
            LayoutInflater.from(getContext()).inflate(za3.C4065j.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1226a = linearLayout;
            this.f1227a = (TextView) linearLayout.findViewById(za3.C4062g.action_bar_title);
            this.f1230b = (TextView) this.f1226a.findViewById(za3.C4062g.action_bar_subtitle);
            if (this.f1234p != 0) {
                this.f1227a.setTextAppearance(getContext(), this.f1234p);
            }
            if (this.f1235q != 0) {
                this.f1230b.setTextAppearance(getContext(), this.f1235q);
            }
        }
        this.f1227a.setText(this.f1228a);
        this.f1230b.setText(this.f1231b);
        boolean z = !TextUtils.isEmpty(this.f1228a);
        boolean z2 = !TextUtils.isEmpty(this.f1231b);
        int i = 0;
        this.f1230b.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f1226a;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f1226a.getParent() == null) {
            addView(this.f1226a);
        }
    }

    /* renamed from: s */
    public boolean mo1546s() {
        return this.f1233d;
    }

    public void setContentHeight(int i) {
        this.f10052n = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1232c;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1232c = view;
        if (!(view == null || (linearLayout = this.f1226a) == null)) {
            removeView(linearLayout);
            this.f1226a = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1231b = charSequence;
        mo1545r();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1228a = charSequence;
        mo1545r();
        jt4.m18861E1(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1233d) {
            requestLayout();
        }
        this.f1233d = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public void mo1554t() {
        removeAllViews();
        this.f1232c = null;
        this.f10046a = null;
        this.f10047a = null;
        View view = this.f1229b;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }
}
