package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.FlowLayout;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C2530jn;
import com.onedelhi.secure.C6153mx;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mo1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.yk0;
import com.onedelhi.secure.zk0;
import java.util.List;
import java.util.Set;

public class ChipGroup extends FlowLayout {

    /* renamed from: t */
    public static final int f8095t = fd3.C2164n.Widget_MaterialComponents_ChipGroup;
    @ts2

    /* renamed from: a */
    public C1547d f8096a;
    @mr2

    /* renamed from: a */
    public final C1548e f8097a;

    /* renamed from: a */
    public final C6153mx<Chip> f8098a;
    @zk0

    /* renamed from: q */
    public int f8099q;
    @zk0

    /* renamed from: r */
    public int f8100r;

    /* renamed from: s */
    public final int f8101s;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$a */
    public class C1544a implements C6153mx.C6155b {
        public C1544a() {
        }

        /* renamed from: a */
        public void mo11755a(Set<Integer> set) {
            if (ChipGroup.this.f8096a != null) {
                C1547d e = ChipGroup.this.f8096a;
                ChipGroup chipGroup = ChipGroup.this;
                e.mo11756a(chipGroup, chipGroup.f8098a.mo40864j(ChipGroup.this));
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    public class C1545b implements C1547d {

        /* renamed from: a */
        public final /* synthetic */ C1546c f8103a;

        public C1545b(C1546c cVar) {
            this.f8103a = cVar;
        }

        /* renamed from: a */
        public void mo11756a(@mr2 ChipGroup chipGroup, @mr2 List<Integer> list) {
            if (ChipGroup.this.f8098a.mo40867m()) {
                this.f8103a.mo11757a(chipGroup, ChipGroup.this.getCheckedChipId());
            }
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public interface C1546c {
        /* renamed from: a */
        void mo11757a(@mr2 ChipGroup chipGroup, @mo1 int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface C1547d {
        /* renamed from: a */
        void mo11756a(@mr2 ChipGroup chipGroup, @mr2 List<Integer> list);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    public class C1548e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a */
        public ViewGroup.OnHierarchyChangeListener f8105a;

        public C1548e() {
        }

        public /* synthetic */ C1548e(ChipGroup chipGroup, C1544a aVar) {
            this();
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(jt4.m18855D());
                }
                ChipGroup.this.f8098a.mo40859e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f8105a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f8098a.mo40869o((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f8105a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.chipGroupStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChipGroup(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = f8095t
            android.content.Context r9 = com.onedelhi.secure.hf2.m50488c(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            com.onedelhi.secure.mx r9 = new com.onedelhi.secure.mx
            r9.<init>()
            r8.f8098a = r9
            com.google.android.material.chip.ChipGroup$e r6 = new com.google.android.material.chip.ChipGroup$e
            r0 = 0
            r6.<init>(r8, r0)
            r8.f8097a = r6
            android.content.Context r0 = r8.getContext()
            int[] r2 = com.onedelhi.secure.fd3.C2165o.ChipGroup
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r10
            r3 = r11
            android.content.res.TypedArray r10 = com.onedelhi.secure.ob4.m59195k(r0, r1, r2, r3, r4, r5)
            int r11 = com.onedelhi.secure.fd3.C2165o.ChipGroup_chipSpacing
            int r11 = r10.getDimensionPixelOffset(r11, r7)
            int r0 = com.onedelhi.secure.fd3.C2165o.ChipGroup_chipSpacingHorizontal
            int r0 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingHorizontal(r0)
            int r0 = com.onedelhi.secure.fd3.C2165o.ChipGroup_chipSpacingVertical
            int r11 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingVertical(r11)
            int r11 = com.onedelhi.secure.fd3.C2165o.ChipGroup_singleLine
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleLine((boolean) r11)
            int r11 = com.onedelhi.secure.fd3.C2165o.ChipGroup_singleSelection
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleSelection((boolean) r11)
            int r11 = com.onedelhi.secure.fd3.C2165o.ChipGroup_selectionRequired
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSelectionRequired(r11)
            int r11 = com.onedelhi.secure.fd3.C2165o.ChipGroup_checkedChip
            r0 = -1
            int r11 = r10.getResourceId(r11, r0)
            r8.f8101s = r11
            r10.recycle()
            com.google.android.material.chip.ChipGroup$a r10 = new com.google.android.material.chip.ChipGroup$a
            r10.<init>()
            r9.mo40870p(r10)
            super.setOnHierarchyChangeListener(r6)
            r9 = 1
            com.onedelhi.secure.jt4.m18906R1(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && mo11731j(i2)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public boolean mo11719c() {
        return super.mo11719c();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    /* renamed from: g */
    public void mo11721g(@mo1 int i) {
        this.f8098a.mo40860f(i);
    }

    @mr2
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @mr2
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @mr2
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @mo1
    public int getCheckedChipId() {
        return this.f8098a.mo40865k();
    }

    @mr2
    public List<Integer> getCheckedChipIds() {
        return this.f8098a.mo40864j(this);
    }

    @zk0
    public int getChipSpacingHorizontal() {
        return this.f8099q;
    }

    @zk0
    public int getChipSpacingVertical() {
        return this.f8100r;
    }

    /* renamed from: h */
    public void mo11729h() {
        this.f8098a.mo40862h();
    }

    /* renamed from: i */
    public int mo11730i(@ts2 View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof Chip) && mo11731j(i2)) {
                if (((Chip) childAt) == view) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final boolean mo11731j(int i) {
        return getChildAt(i).getVisibility() == 0;
    }

    /* renamed from: k */
    public boolean mo11732k() {
        return this.f8098a.mo40866l();
    }

    /* renamed from: l */
    public boolean mo11733l() {
        return this.f8098a.mo40867m();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f8101s;
        if (i != -1) {
            this.f8098a.mo40860f(i);
        }
    }

    public void onInitializeAccessibilityNodeInfo(@mr2 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1638a2.m10547X1(accessibilityNodeInfo).mo12553Y0(C1638a2.C1640b.m10703f(getRowCount(), mo11719c() ? getVisibleChipCount() : -1, false, mo11733l() ? 1 : 2));
    }

    public void setChipSpacing(@zk0 int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(@zk0 int i) {
        if (this.f8099q != i) {
            this.f8099q = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@yk0 int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(@yk0 int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(@zk0 int i) {
        if (this.f8100r != i) {
            this.f8100r = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@yk0 int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@ts2 Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@ts2 C1546c cVar) {
        if (cVar == null) {
            setOnCheckedStateChangeListener((C1547d) null);
        } else {
            setOnCheckedStateChangeListener(new C1545b(cVar));
        }
    }

    public void setOnCheckedStateChangeListener(@ts2 C1547d dVar) {
        this.f8096a = dVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        ViewGroup.OnHierarchyChangeListener unused = this.f8097a.f8105a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f8098a.mo40871q(z);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(@C2530jn int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(@C2530jn int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        this.f8098a.mo40872r(z);
    }
}
