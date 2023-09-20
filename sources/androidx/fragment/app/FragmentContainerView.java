package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.onedelhi.secure.ab3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.sx4;
import com.onedelhi.secure.ts2;
import java.util.ArrayList;

public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a */
    public View.OnApplyWindowInsetsListener f3684a;

    /* renamed from: a */
    public ArrayList<View> f3685a;

    /* renamed from: b */
    public ArrayList<View> f3686b;

    /* renamed from: b */
    public boolean f3687b;

    public FragmentContainerView(@mr2 Context context) {
        super(context);
        this.f3687b = true;
    }

    public FragmentContainerView(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FragmentContainerView(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        this.f3687b = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ab3.C1689l.FragmentContainerView);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(ab3.C1689l.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
            }
        }
    }

    public FragmentContainerView(@mr2 Context context, @mr2 AttributeSet attributeSet, @mr2 FragmentManager fragmentManager) {
        super(context, attributeSet);
        String str;
        this.f3687b = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ab3.C1689l.FragmentContainerView);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(ab3.C1689l.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(ab3.C1689l.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment p0 = fragmentManager.mo4606p0(id);
        if (classAttribute != null && p0 == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a = fragmentManager.mo4510E0().mo4643a(context.getClassLoader(), classAttribute);
            a.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.mo4611r().mo4857Q(true).mo4864j(this, a, string).mo4729t();
        }
        fragmentManager.mo4588i1(this);
    }

    /* renamed from: a */
    public final void mo4478a(@mr2 View view) {
        ArrayList<View> arrayList = this.f3686b;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.f3685a == null) {
                this.f3685a = new ArrayList<>();
            }
            this.f3685a.add(view);
        }
    }

    public void addView(@mr2 View view, int i, @ts2 ViewGroup.LayoutParams layoutParams) {
        if (FragmentManager.m4278N0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public boolean addViewInLayout(@mr2 View view, int i, @ts2 ViewGroup.LayoutParams layoutParams, boolean z) {
        if (FragmentManager.m4278N0(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @mr2
    @sj3(20)
    public WindowInsets dispatchApplyWindowInsets(@mr2 WindowInsets windowInsets) {
        sx4 K = sx4.m27879K(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f3684a;
        sx4 K2 = onApplyWindowInsetsListener != null ? sx4.m27879K(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : jt4.m18957g1(this, K);
        if (!K2.mo24576A()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                jt4.m18991p(getChildAt(i), K2);
            }
        }
        return windowInsets;
    }

    public void dispatchDraw(@mr2 Canvas canvas) {
        if (this.f3687b && this.f3685a != null) {
            for (int i = 0; i < this.f3685a.size(); i++) {
                super.drawChild(canvas, this.f3685a.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean drawChild(@mr2 Canvas canvas, @mr2 View view, long j) {
        ArrayList<View> arrayList;
        if (!this.f3687b || (arrayList = this.f3685a) == null || arrayList.size() <= 0 || !this.f3685a.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public void endViewTransition(@mr2 View view) {
        ArrayList<View> arrayList = this.f3686b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f3685a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f3687b = true;
            }
        }
        super.endViewTransition(view);
    }

    @mr2
    @sj3(20)
    public WindowInsets onApplyWindowInsets(@mr2 WindowInsets windowInsets) {
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            mo4478a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    public void removeDetachedView(@mr2 View view, boolean z) {
        if (z) {
            mo4478a(view);
        }
        super.removeDetachedView(view, z);
    }

    public void removeView(@mr2 View view) {
        mo4478a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        mo4478a(getChildAt(i));
        super.removeViewAt(i);
    }

    public void removeViewInLayout(@mr2 View view) {
        mo4478a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            mo4478a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            mo4478a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.f3687b = z;
    }

    public void setLayoutTransition(@ts2 LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(@mr2 View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f3684a = onApplyWindowInsetsListener;
    }

    public void startViewTransition(@mr2 View view) {
        if (view.getParent() == this) {
            if (this.f3686b == null) {
                this.f3686b = new ArrayList<>();
            }
            this.f3686b.add(view);
        }
        super.startViewTransition(view);
    }
}
