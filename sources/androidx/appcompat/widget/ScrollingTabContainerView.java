package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.onedelhi.secure.C3222q2;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.of4;
import com.onedelhi.secure.za3;

@hl3({hl3.C2354a.f13188c})
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    public static final Interpolator f1516a = new DecelerateInterpolator();

    /* renamed from: b */
    public static final String f1517b = "ScrollingTabContainerView";

    /* renamed from: r */
    public static final int f1518r = 200;

    /* renamed from: a */
    public ViewPropertyAnimator f1519a;

    /* renamed from: a */
    public Spinner f1520a;

    /* renamed from: a */
    public LinearLayoutCompat f1521a;

    /* renamed from: a */
    public C0315c f1522a;

    /* renamed from: a */
    public final C0317e f1523a = new C0317e();

    /* renamed from: a */
    public Runnable f1524a;

    /* renamed from: b */
    public boolean f1525b;

    /* renamed from: n */
    public int f1526n;

    /* renamed from: o */
    public int f1527o;

    /* renamed from: p */
    public int f1528p;

    /* renamed from: q */
    public int f1529q;

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$a */
    public class C0313a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f1530a;

        public C0313a(View view) {
            this.f1530a = view;
        }

        public void run() {
            ScrollingTabContainerView.this.smoothScrollTo(this.f1530a.getLeft() - ((ScrollingTabContainerView.this.getWidth() - this.f1530a.getWidth()) / 2), 0);
            ScrollingTabContainerView.this.f1524a = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$b */
    public class C0314b extends BaseAdapter {
        public C0314b() {
        }

        public int getCount() {
            return ScrollingTabContainerView.this.f1521a.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0316d) ScrollingTabContainerView.this.f1521a.getChildAt(i)).mo2133b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.mo2110g((ActionBar.C0163e) getItem(i), true);
            }
            ((C0316d) view).mo2132a((ActionBar.C0163e) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$c */
    public class C0315c implements View.OnClickListener {
        public C0315c() {
        }

        public void onClick(View view) {
            ((C0316d) view).mo2133b().mo780g();
            int childCount = ScrollingTabContainerView.this.f1521a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ScrollingTabContainerView.this.f1521a.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$d */
    public class C0316d extends LinearLayout {

        /* renamed from: b */
        public static final String f1534b = "androidx.appcompat.app.ActionBar$Tab";

        /* renamed from: a */
        public View f1535a;

        /* renamed from: a */
        public ImageView f1536a;

        /* renamed from: a */
        public TextView f1537a;

        /* renamed from: a */
        public ActionBar.C0163e f1538a;

        /* renamed from: a */
        public final int[] f1540a;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0316d(android.content.Context r6, androidx.appcompat.app.ActionBar.C0163e r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.ScrollingTabContainerView.this = r5
                int r5 = com.onedelhi.secure.za3.C4057b.actionBarTabStyle
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1540a = r1
                r4.f1538a = r7
                com.onedelhi.secure.af4 r5 = com.onedelhi.secure.af4.m11110G(r6, r0, r1, r5, r3)
                boolean r6 = r5.mo13026C(r3)
                if (r6 == 0) goto L_0x0026
                android.graphics.drawable.Drawable r6 = r5.mo13037h(r3)
                r4.setBackgroundDrawable(r6)
            L_0x0026:
                r5.mo13029I()
                if (r8 == 0) goto L_0x0031
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L_0x0031:
                r4.mo2134c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ScrollingTabContainerView.C0316d.<init>(androidx.appcompat.widget.ScrollingTabContainerView, android.content.Context, androidx.appcompat.app.ActionBar$e, boolean):void");
        }

        /* renamed from: a */
        public void mo2132a(ActionBar.C0163e eVar) {
            this.f1538a = eVar;
            mo2134c();
        }

        /* renamed from: b */
        public ActionBar.C0163e mo2133b() {
            return this.f1538a;
        }

        /* renamed from: c */
        public void mo2134c() {
            ActionBar.C0163e eVar = this.f1538a;
            View b = eVar.mo775b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f1535a = b;
                TextView textView = this.f1537a;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1536a;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1536a.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f1535a;
            if (view != null) {
                removeView(view);
                this.f1535a = null;
            }
            Drawable c = eVar.mo776c();
            CharSequence f = eVar.mo779f();
            if (c != null) {
                if (this.f1536a == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1536a = appCompatImageView;
                }
                this.f1536a.setImageDrawable(c);
                this.f1536a.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1536a;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1536a.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(f);
            if (z) {
                if (this.f1537a == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null, za3.C4057b.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1537a = appCompatTextView;
                }
                this.f1537a.setText(f);
                this.f1537a.setVisibility(0);
            } else {
                TextView textView2 = this.f1537a;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1537a.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1536a;
            if (imageView3 != null) {
                imageView3.setContentDescription(eVar.mo774a());
            }
            if (!z) {
                charSequence = eVar.mo774a();
            }
            of4.m23742a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(f1534b);
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(f1534b);
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (ScrollingTabContainerView.this.f1526n > 0 && getMeasuredWidth() > (i3 = ScrollingTabContainerView.this.f1526n)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$e */
    public class C0317e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public int f1541a;

        /* renamed from: a */
        public boolean f1543a = false;

        public C0317e() {
        }

        /* renamed from: a */
        public C0317e mo2139a(ViewPropertyAnimator viewPropertyAnimator, int i) {
            this.f1541a = i;
            ScrollingTabContainerView.this.f1519a = viewPropertyAnimator;
            return this;
        }

        public void onAnimationCancel(Animator animator) {
            this.f1543a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f1543a) {
                ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
                scrollingTabContainerView.f1519a = null;
                scrollingTabContainerView.setVisibility(this.f1541a);
            }
        }

        public void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.f1543a = false;
        }
    }

    public ScrollingTabContainerView(@mr2 Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        C3222q2 b = C3222q2.m25257b(context);
        setContentHeight(b.mo22810f());
        this.f1527o = b.mo22809e();
        LinearLayoutCompat f = mo2109f();
        this.f1521a = f;
        addView(f, new ViewGroup.LayoutParams(-2, -1));
    }

    /* renamed from: a */
    public void mo2104a(ActionBar.C0163e eVar, int i, boolean z) {
        C0316d g = mo2110g(eVar, false);
        this.f1521a.addView(g, i, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.f1520a;
        if (spinner != null) {
            ((C0314b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            g.setSelected(true);
        }
        if (this.f1525b) {
            requestLayout();
        }
    }

    /* renamed from: b */
    public void mo2105b(ActionBar.C0163e eVar, boolean z) {
        C0316d g = mo2110g(eVar, false);
        this.f1521a.addView(g, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.f1520a;
        if (spinner != null) {
            ((C0314b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            g.setSelected(true);
        }
        if (this.f1525b) {
            requestLayout();
        }
    }

    /* renamed from: c */
    public void mo2106c(int i) {
        View childAt = this.f1521a.getChildAt(i);
        Runnable runnable = this.f1524a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C0313a aVar = new C0313a(childAt);
        this.f1524a = aVar;
        post(aVar);
    }

    /* renamed from: d */
    public void mo2107d(int i) {
        ViewPropertyAnimator viewPropertyAnimator;
        ViewPropertyAnimator viewPropertyAnimator2 = this.f1519a;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            viewPropertyAnimator = animate().alpha(1.0f);
        } else {
            viewPropertyAnimator = animate().alpha(0.0f);
        }
        viewPropertyAnimator.setDuration(200);
        viewPropertyAnimator.setInterpolator(f1516a);
        viewPropertyAnimator.setListener(this.f1523a.mo2139a(viewPropertyAnimator, i));
        viewPropertyAnimator.start();
    }

    /* renamed from: e */
    public final Spinner mo2108e() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), (AttributeSet) null, za3.C4057b.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* renamed from: f */
    public final LinearLayoutCompat mo2109f() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), (AttributeSet) null, za3.C4057b.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    /* renamed from: g */
    public C0316d mo2110g(ActionBar.C0163e eVar, boolean z) {
        C0316d dVar = new C0316d(getContext(), eVar, z);
        if (z) {
            dVar.setBackgroundDrawable((Drawable) null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1528p));
        } else {
            dVar.setFocusable(true);
            if (this.f1522a == null) {
                this.f1522a = new C0315c();
            }
            dVar.setOnClickListener(this.f1522a);
        }
        return dVar;
    }

    /* renamed from: h */
    public final boolean mo2111h() {
        Spinner spinner = this.f1520a;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: i */
    public final void mo2112i() {
        if (!mo2111h()) {
            if (this.f1520a == null) {
                this.f1520a = mo2108e();
            }
            removeView(this.f1521a);
            addView(this.f1520a, new ViewGroup.LayoutParams(-2, -1));
            if (this.f1520a.getAdapter() == null) {
                this.f1520a.setAdapter(new C0314b());
            }
            Runnable runnable = this.f1524a;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f1524a = null;
            }
            this.f1520a.setSelection(this.f1529q);
        }
    }

    /* renamed from: j */
    public final boolean mo2113j() {
        if (!mo2111h()) {
            return false;
        }
        removeView(this.f1520a);
        addView(this.f1521a, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1520a.getSelectedItemPosition());
        return false;
    }

    /* renamed from: k */
    public void mo2114k() {
        this.f1521a.removeAllViews();
        Spinner spinner = this.f1520a;
        if (spinner != null) {
            ((C0314b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f1525b) {
            requestLayout();
        }
    }

    /* renamed from: l */
    public void mo2115l(int i) {
        this.f1521a.removeViewAt(i);
        Spinner spinner = this.f1520a;
        if (spinner != null) {
            ((C0314b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f1525b) {
            requestLayout();
        }
    }

    /* renamed from: m */
    public void mo2116m(int i) {
        ((C0316d) this.f1521a.getChildAt(i)).mo2134c();
        Spinner spinner = this.f1520a;
        if (spinner != null) {
            ((C0314b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f1525b) {
            requestLayout();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1524a;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C3222q2 b = C3222q2.m25257b(getContext());
        setContentHeight(b.mo22810f());
        this.f1527o = b.mo22809e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1524a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0316d) view).mo2133b().mo780g();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1521a.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.f1526n = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f1526n = View.MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.f1526n, this.f1527o);
        }
        this.f1526n = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1528p, 1073741824);
        if (z2 || !this.f1525b) {
            z = false;
        }
        if (z) {
            this.f1521a.measure(0, makeMeasureSpec);
            if (this.f1521a.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                mo2112i();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.f1529q);
                    return;
                }
            }
        }
        mo2113j();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1525b = z;
    }

    public void setContentHeight(int i) {
        this.f1528p = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f1529q = i;
        int childCount = this.f1521a.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1521a.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo2106c(i);
            }
            i2++;
        }
        Spinner spinner = this.f1520a;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}
