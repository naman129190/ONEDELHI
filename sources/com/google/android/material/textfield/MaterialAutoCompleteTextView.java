package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.onedelhi.secure.C3483sa;
import com.onedelhi.secure.af2;
import com.onedelhi.secure.fc2;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hf2;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ob4;
import com.onedelhi.secure.oe2;
import com.onedelhi.secure.s12;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wo0;

public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: p */
    public static final int f24557p = 15;

    /* renamed from: a */
    public final float f24558a;
    @ts2

    /* renamed from: a */
    public ColorStateList f24559a;
    @mr2

    /* renamed from: a */
    public final Rect f24560a;
    @ts2

    /* renamed from: a */
    public final AccessibilityManager f24561a;
    @mr2

    /* renamed from: a */
    public final ListPopupWindow f24562a;
    @s12

    /* renamed from: n */
    public final int f24563n;

    /* renamed from: o */
    public int f24564o;

    /* renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$a */
    public class C4244a implements AdapterView.OnItemClickListener {
        public C4244a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            MaterialAutoCompleteTextView.this.mo29125j(i < 0 ? materialAutoCompleteTextView.f24562a.mo2023C() : materialAutoCompleteTextView.getAdapter().getItem(i));
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = MaterialAutoCompleteTextView.this.f24562a.mo2026F();
                    i = MaterialAutoCompleteTextView.this.f24562a.mo2025E();
                    j = MaterialAutoCompleteTextView.this.f24562a.mo2024D();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f24562a.mo1241l(), view, i, j);
            }
            MaterialAutoCompleteTextView.this.f24562a.dismiss();
        }
    }

    /* renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$b */
    public class C4245b<T> extends ArrayAdapter<String> {
        @ts2

        /* renamed from: a */
        public ColorStateList f24566a;
        @ts2

        /* renamed from: b */
        public ColorStateList f24568b;

        public C4245b(@mr2 Context context, int i, @mr2 String[] strArr) {
            super(context, i, strArr);
            mo29142f();
        }

        @ts2
        /* renamed from: a */
        public final ColorStateList mo29137a() {
            if (!mo29139c() || !mo29140d()) {
                return null;
            }
            int[] iArr = {16843623, -16842919};
            int[] iArr2 = {16842913, -16842919};
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{oe2.m23727m(MaterialAutoCompleteTextView.this.f24564o, MaterialAutoCompleteTextView.this.f24559a.getColorForState(iArr2, 0)), oe2.m23727m(MaterialAutoCompleteTextView.this.f24564o, MaterialAutoCompleteTextView.this.f24559a.getColorForState(iArr, 0)), MaterialAutoCompleteTextView.this.f24564o});
        }

        @ts2
        /* renamed from: b */
        public final Drawable mo29138b() {
            if (!mo29139c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.f24564o);
            if (this.f24568b == null) {
                return colorDrawable;
            }
            wo0.m30986o(colorDrawable, this.f24566a);
            return new RippleDrawable(this.f24568b, colorDrawable, (Drawable) null);
        }

        /* renamed from: c */
        public final boolean mo29139c() {
            return MaterialAutoCompleteTextView.this.f24564o != 0;
        }

        /* renamed from: d */
        public final boolean mo29140d() {
            return MaterialAutoCompleteTextView.this.f24559a != null;
        }

        /* renamed from: e */
        public final ColorStateList mo29141e() {
            if (!mo29140d()) {
                return null;
            }
            int[] iArr = {16842919};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{MaterialAutoCompleteTextView.this.f24559a.getColorForState(iArr, 0), 0});
        }

        /* renamed from: f */
        public void mo29142f() {
            this.f24568b = mo29141e();
            this.f24566a = mo29137a();
        }

        public View getView(int i, @ts2 View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                jt4.m18877I1(textView, MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText()) ? mo29138b() : null);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialAutoCompleteTextView(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.autoCompleteTextViewStyle);
    }

    public MaterialAutoCompleteTextView(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(hf2.m50488c(context, attributeSet, i, 0), attributeSet, i);
        this.f24560a = new Rect();
        Context context2 = getContext();
        TypedArray k = ob4.m59195k(context2, attributeSet, fd3.C2165o.MaterialAutoCompleteTextView, i, fd3.C2164n.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i2 = fd3.C2165o.MaterialAutoCompleteTextView_android_inputType;
        if (k.hasValue(i2) && k.getInt(i2, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f24563n = k.getResourceId(fd3.C2165o.MaterialAutoCompleteTextView_simpleItemLayout, fd3.C2161k.mtrl_auto_complete_simple_item);
        this.f24558a = (float) k.getDimensionPixelOffset(fd3.C2165o.MaterialAutoCompleteTextView_android_popupElevation, fd3.C2156f.mtrl_exposed_dropdown_menu_popup_elevation);
        this.f24564o = k.getColor(fd3.C2165o.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.f24559a = af2.m38610a(context2, k, fd3.C2165o.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.f24561a = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f24562a = listPopupWindow;
        listPopupWindow.mo2051d0(true);
        listPopupWindow.mo2038S(this);
        listPopupWindow.mo2046a0(2);
        listPopupWindow.mo1884e(getAdapter());
        listPopupWindow.mo2053f0(new C4244a());
        int i3 = fd3.C2165o.MaterialAutoCompleteTextView_simpleItems;
        if (k.hasValue(i3)) {
            setSimpleItems(k.getResourceId(i3, 0));
        }
        k.recycle();
    }

    @ts2
    /* renamed from: g */
    public final TextInputLayout mo29118g() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @ts2
    public CharSequence getHint() {
        TextInputLayout g = mo29118g();
        return (g == null || !g.mo29191a0()) ? super.getHint() : g.getHint();
    }

    public float getPopupElevation() {
        return this.f24558a;
    }

    public int getSimpleItemSelectedColor() {
        return this.f24564o;
    }

    @ts2
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f24559a;
    }

    /* renamed from: h */
    public final int mo29123h() {
        ListAdapter adapter = getAdapter();
        TextInputLayout g = mo29118g();
        int i = 0;
        if (adapter == null || g == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f24562a.mo2025E()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, g);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable g2 = this.f24562a.mo2054g();
        if (g2 != null) {
            g2.getPadding(this.f24560a);
            Rect rect = this.f24560a;
            i2 += rect.left + rect.right;
        }
        return i2 + g.getEndIconView().getMeasuredWidth();
    }

    /* renamed from: i */
    public final void mo29124i() {
        TextInputLayout g = mo29118g();
        if (g != null) {
            g.mo29162E0();
        }
    }

    /* renamed from: j */
    public final <T extends ListAdapter & Filterable> void mo29125j(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout g = mo29118g();
        if (g != null && g.mo29191a0() && super.getHint() == null && fc2.m47742c()) {
            setHint("");
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo29123h()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(@ts2 T t) {
        super.setAdapter(t);
        this.f24562a.mo1884e(getAdapter());
    }

    public void setOnItemSelectedListener(@ts2 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f24562a.mo2055g0(getOnItemSelectedListener());
    }

    public void setRawInputType(int i) {
        super.setRawInputType(i);
        mo29124i();
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f24564o = i;
        if (getAdapter() instanceof C4245b) {
            ((C4245b) getAdapter()).mo29142f();
        }
    }

    public void setSimpleItemSelectedRippleColor(@ts2 ColorStateList colorStateList) {
        this.f24559a = colorStateList;
        if (getAdapter() instanceof C4245b) {
            ((C4245b) getAdapter()).mo29142f();
        }
    }

    public void setSimpleItems(@C3483sa int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    public void setSimpleItems(@mr2 String[] strArr) {
        setAdapter(new C4245b(getContext(), this.f24563n, strArr));
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f24561a;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f24562a.mo1237a();
        }
    }
}
