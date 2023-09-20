package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.za3;
import java.lang.ref.WeakReference;

@hl3({hl3.C2354a.f13188c})
public final class ViewStubCompat extends View {

    /* renamed from: a */
    public LayoutInflater f1734a;

    /* renamed from: a */
    public C0347a f1735a;

    /* renamed from: a */
    public WeakReference<View> f1736a;

    /* renamed from: n */
    public int f1737n;

    /* renamed from: o */
    public int f1738o;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0347a {
        /* renamed from: a */
        void mo2473a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1737n = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, za3.C4068m.ViewStubCompat, i, 0);
        this.f1738o = obtainStyledAttributes.getResourceId(za3.C4068m.ViewStubCompat_android_inflatedId, -1);
        this.f1737n = obtainStyledAttributes.getResourceId(za3.C4068m.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(za3.C4068m.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View mo2461a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1737n != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1734a;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1737n, viewGroup, false);
            int i = this.f1738o;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1736a = new WeakReference<>(inflate);
            C0347a aVar = this.f1735a;
            if (aVar != null) {
                aVar.mo2473a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1738o;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1734a;
    }

    public int getLayoutResource() {
        return this.f1737n;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1738o = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1734a = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1737n = i;
    }

    public void setOnInflateListener(C0347a aVar) {
        this.f1735a = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1736a;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo2461a();
        }
    }
}
