package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0253h;
import androidx.appcompat.view.menu.C0260k;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C3884x1;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jb4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.of4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wo0;
import com.onedelhi.secure.za3;
import com.onedelhi.secure.zk0;
import com.onedelhi.secure.zk3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class NavigationMenuItemView extends ForegroundLinearLayout implements C0260k.C0261a {

    /* renamed from: c */
    public static final int[] f24032c = {16842912};

    /* renamed from: I */
    public int f24033I;

    /* renamed from: a */
    public ColorStateList f24034a;

    /* renamed from: a */
    public final CheckedTextView f24035a;

    /* renamed from: a */
    public FrameLayout f24036a;

    /* renamed from: a */
    public C0253h f24037a;

    /* renamed from: a */
    public final C3884x1 f24038a;

    /* renamed from: c */
    public Drawable f24039c;

    /* renamed from: f */
    public boolean f24040f;

    /* renamed from: g */
    public boolean f24041g;

    /* renamed from: h */
    public boolean f24042h;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    public class C4149a extends C3884x1 {
        public C4149a() {
        }

        /* renamed from: g */
        public void mo3893g(View view, @mr2 C1638a2 a2Var) {
            super.mo3893g(view, a2Var);
            a2Var.mo12542U0(NavigationMenuItemView.this.f24041g);
        }
    }

    public NavigationMenuItemView(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public NavigationMenuItemView(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C4149a aVar = new C4149a();
        this.f24038a = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(fd3.C2161k.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(fd3.C2156f.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(fd3.C2158h.design_menu_item_text);
        this.f24035a = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        jt4.m18849B1(checkedTextView, aVar);
    }

    private void setActionView(@ts2 View view) {
        if (view != null) {
            if (this.f24036a == null) {
                this.f24036a = (FrameLayout) ((ViewStub) findViewById(fd3.C2158h.design_menu_item_action_area_stub)).inflate();
            }
            this.f24036a.removeAllViews();
            this.f24036a.addView(view);
        }
    }

    /* renamed from: E */
    public final void mo28253E() {
        int i;
        LinearLayoutCompat.LayoutParams layoutParams;
        if (mo28256H()) {
            this.f24035a.setVisibility(8);
            FrameLayout frameLayout = this.f24036a;
            if (frameLayout != null) {
                layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                i = -1;
            } else {
                return;
            }
        } else {
            this.f24035a.setVisibility(0);
            FrameLayout frameLayout2 = this.f24036a;
            if (frameLayout2 != null) {
                layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
                i = -2;
            } else {
                return;
            }
        }
        layoutParams.width = i;
        this.f24036a.setLayoutParams(layoutParams);
    }

    @ts2
    /* renamed from: F */
    public final StateListDrawable mo28254F() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(za3.C4057b.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f24032c, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: G */
    public void mo28255G() {
        FrameLayout frameLayout = this.f24036a;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f24035a.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* renamed from: H */
    public final boolean mo28256H() {
        return this.f24037a.getTitle() == null && this.f24037a.getIcon() == null && this.f24037a.getActionView() != null;
    }

    /* renamed from: b */
    public void mo1171b(@mr2 C0253h hVar, int i) {
        this.f24037a = hVar;
        if (hVar.getItemId() > 0) {
            setId(hVar.getItemId());
        }
        setVisibility(hVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            jt4.m18877I1(this, mo28254F());
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.getTitle());
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.getContentDescription());
        of4.m23742a(this, hVar.getTooltipText());
        mo28253E();
    }

    /* renamed from: d */
    public boolean mo1172d() {
        return false;
    }

    /* renamed from: f */
    public boolean mo1174f() {
        return true;
    }

    public C0253h getItemData() {
        return this.f24037a;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0253h hVar = this.f24037a;
        if (hVar != null && hVar.isCheckable() && this.f24037a.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f24032c);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f24041g != z) {
            this.f24041g = z;
            this.f24038a.mo6532l(this.f24035a, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f24035a.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(@ts2 Drawable drawable) {
        if (drawable != null) {
            if (this.f24042h) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = wo0.m30989r(drawable).mutate();
                wo0.m30986o(drawable, this.f24034a);
            }
            int i = this.f24033I;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f24040f) {
            if (this.f24039c == null) {
                Drawable g = zk3.m33204g(getResources(), fd3.C2157g.navigation_empty_icon, getContext().getTheme());
                this.f24039c = g;
                if (g != null) {
                    int i2 = this.f24033I;
                    g.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f24039c;
        }
        jb4.m18336w(this.f24035a, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.f24035a.setCompoundDrawablePadding(i);
    }

    public void setIconSize(@zk0 int i) {
        this.f24033I = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f24034a = colorStateList;
        this.f24042h = colorStateList != null;
        C0253h hVar = this.f24037a;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f24035a.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f24040f = z;
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int i) {
        jb4.m18310E(this.f24035a, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f24035a.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f24035a.setText(charSequence);
    }
}
