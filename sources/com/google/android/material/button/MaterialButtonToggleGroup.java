package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C2530jn;
import com.onedelhi.secure.C3884x1;
import com.onedelhi.secure.C5459h0;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.ld2;
import com.onedelhi.secure.mo1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pv4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.uw3;
import com.onedelhi.secure.z80;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: b */
    public static final String f7996b = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: o */
    public static final int f7997o = fd3.C2164n.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: a */
    public final C1532e f7998a;

    /* renamed from: a */
    public final Comparator<MaterialButton> f7999a;

    /* renamed from: a */
    public final LinkedHashSet<C1531d> f8000a;

    /* renamed from: a */
    public final List<C1530c> f8001a;

    /* renamed from: a */
    public Set<Integer> f8002a;

    /* renamed from: a */
    public Integer[] f8003a;

    /* renamed from: b */
    public boolean f8004b;

    /* renamed from: c */
    public boolean f8005c;

    /* renamed from: d */
    public boolean f8006d;
    @mo1

    /* renamed from: n */
    public final int f8007n;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    public class C1528a implements Comparator<MaterialButton> {
        public C1528a() {
        }

        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    public class C1529b extends C3884x1 {
        public C1529b() {
        }

        /* renamed from: g */
        public void mo3893g(View view, @mr2 C1638a2 a2Var) {
            super.mo3893g(view, a2Var);
            a2Var.mo12555Z0(C1638a2.C1641c.m10709h(0, 1, MaterialButtonToggleGroup.this.mo11422k(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    public static class C1530c {

        /* renamed from: e */
        public static final z80 f8010e = new C5459h0(0.0f);

        /* renamed from: a */
        public z80 f8011a;

        /* renamed from: b */
        public z80 f8012b;

        /* renamed from: c */
        public z80 f8013c;

        /* renamed from: d */
        public z80 f8014d;

        public C1530c(z80 z80, z80 z802, z80 z803, z80 z804) {
            this.f8011a = z80;
            this.f8012b = z803;
            this.f8013c = z804;
            this.f8014d = z802;
        }

        /* renamed from: a */
        public static C1530c m9768a(C1530c cVar) {
            z80 z80 = f8010e;
            return new C1530c(z80, cVar.f8014d, z80, cVar.f8013c);
        }

        /* renamed from: b */
        public static C1530c m9769b(C1530c cVar, View view) {
            return pv4.m61672l(view) ? m9770c(cVar) : m9771d(cVar);
        }

        /* renamed from: c */
        public static C1530c m9770c(C1530c cVar) {
            z80 z80 = cVar.f8011a;
            z80 z802 = cVar.f8014d;
            z80 z803 = f8010e;
            return new C1530c(z80, z802, z803, z803);
        }

        /* renamed from: d */
        public static C1530c m9771d(C1530c cVar) {
            z80 z80 = f8010e;
            return new C1530c(z80, z80, cVar.f8012b, cVar.f8013c);
        }

        /* renamed from: e */
        public static C1530c m9772e(C1530c cVar, View view) {
            return pv4.m61672l(view) ? m9771d(cVar) : m9770c(cVar);
        }

        /* renamed from: f */
        public static C1530c m9773f(C1530c cVar) {
            z80 z80 = cVar.f8011a;
            z80 z802 = f8010e;
            return new C1530c(z80, z802, cVar.f8012b, z802);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    public interface C1531d {
        /* renamed from: a */
        void mo11444a(MaterialButtonToggleGroup materialButtonToggleGroup, @mo1 int i, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    public class C1532e implements MaterialButton.C1525c {
        public C1532e() {
        }

        public /* synthetic */ C1532e(MaterialButtonToggleGroup materialButtonToggleGroup, C1528a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo11400a(@mr2 MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public MaterialButtonToggleGroup(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialButtonToggleGroup(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.materialButtonToggleGroupStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButtonToggleGroup(@com.onedelhi.secure.mr2 android.content.Context r7, @com.onedelhi.secure.ts2 android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f7997o
            android.content.Context r7 = com.onedelhi.secure.hf2.m50488c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f8001a = r7
            com.google.android.material.button.MaterialButtonToggleGroup$e r7 = new com.google.android.material.button.MaterialButtonToggleGroup$e
            r0 = 0
            r7.<init>(r6, r0)
            r6.f7998a = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f8000a = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f7999a = r7
            r7 = 0
            r6.f8004b = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.f8002a = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = com.onedelhi.secure.fd3.C2165o.MaterialButtonToggleGroup
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.onedelhi.secure.ob4.m59195k(r0, r1, r2, r3, r4, r5)
            int r9 = com.onedelhi.secure.fd3.C2165o.MaterialButtonToggleGroup_singleSelection
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection((boolean) r9)
            int r9 = com.onedelhi.secure.fd3.C2165o.MaterialButtonToggleGroup_checkedButton
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f8007n = r9
            int r9 = com.onedelhi.secure.fd3.C2165o.MaterialButtonToggleGroup_selectionRequired
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f8006d = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            com.onedelhi.secure.jt4.m18906R1(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (mo11424m(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (mo11424m(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && mo11424m(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(@mr2 MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(jt4.m18855D());
        }
    }

    private void setupButtonChild(@mr2 MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f7998a);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: u */
    public static void m9743u(uw3.C6982b bVar, @ts2 C1530c cVar) {
        if (cVar == null) {
            bVar.mo45846o(0.0f);
        } else {
            bVar.mo45839L(cVar.f8011a).mo45856y(cVar.f8014d).mo45844Q(cVar.f8012b).mo45831D(cVar.f8013c);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f7996b, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        mo11414f(materialButton.getId(), materialButton.isChecked());
        uw3 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f8001a.add(new C1530c(shapeAppearanceModel.mo45820r(), shapeAppearanceModel.mo45813j(), shapeAppearanceModel.mo45822t(), shapeAppearanceModel.mo45815l()));
        jt4.m18849B1(materialButton, new C1529b());
    }

    /* renamed from: b */
    public void mo11409b(@mr2 C1531d dVar) {
        this.f8000a.add(dVar);
    }

    /* renamed from: c */
    public final void mo11410c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton j = mo11421j(i);
                int min = Math.min(j.getStrokeWidth(), mo11421j(i - 1).getStrokeWidth());
                LinearLayout.LayoutParams d = mo11411d(j);
                if (getOrientation() == 0) {
                    ld2.m20483g(d, 0);
                    ld2.m20484h(d, -min);
                    d.topMargin = 0;
                } else {
                    d.bottomMargin = 0;
                    d.topMargin = -min;
                    ld2.m20484h(d, 0);
                }
                j.setLayoutParams(d);
            }
            mo11433r(firstVisibleChildIndex);
        }
    }

    @mr2
    /* renamed from: d */
    public final LinearLayout.LayoutParams mo11411d(@mr2 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    public void dispatchDraw(@mr2 Canvas canvas) {
        mo11440w();
        super.dispatchDraw(canvas);
    }

    /* renamed from: e */
    public void mo11413e(@mo1 int i) {
        mo11414f(i, true);
    }

    /* renamed from: f */
    public final void mo11414f(@mo1 int i, boolean z) {
        if (i == -1) {
            String str = f7996b;
            Log.e(str, "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f8002a);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f8005c && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else if (!z && hashSet.contains(Integer.valueOf(i))) {
            if (!this.f8006d || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        } else {
            return;
        }
        mo11439v(hashSet);
    }

    /* renamed from: g */
    public void mo11415g() {
        mo11439v(new HashSet());
    }

    @mo1
    public int getCheckedButtonId() {
        if (!this.f8005c || this.f8002a.isEmpty()) {
            return -1;
        }
        return this.f8002a.iterator().next().intValue();
    }

    @mr2
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = mo11421j(i).getId();
            if (this.f8002a.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f8003a;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w(f7996b, "Child order wasn't updated");
        return i2;
    }

    /* renamed from: h */
    public void mo11419h() {
        this.f8000a.clear();
    }

    /* renamed from: i */
    public final void mo11420i(@mo1 int i, boolean z) {
        Iterator it = this.f8000a.iterator();
        while (it.hasNext()) {
            ((C1531d) it.next()).mo11444a(this, i, z);
        }
    }

    /* renamed from: j */
    public final MaterialButton mo11421j(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* renamed from: k */
    public final int mo11422k(@ts2 View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && mo11424m(i2)) {
                i++;
            }
        }
        return -1;
    }

    @ts2
    /* renamed from: l */
    public final C1530c mo11423l(int i, int i2, int i3) {
        C1530c cVar = this.f8001a.get(i);
        if (i2 == i3) {
            return cVar;
        }
        boolean z = getOrientation() == 0;
        if (i == i2) {
            return z ? C1530c.m9772e(cVar, this) : C1530c.m9773f(cVar);
        }
        if (i == i3) {
            return z ? C1530c.m9769b(cVar, this) : C1530c.m9768a(cVar);
        }
        return null;
    }

    /* renamed from: m */
    public final boolean mo11424m(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* renamed from: n */
    public boolean mo11425n() {
        return this.f8006d;
    }

    /* renamed from: o */
    public boolean mo11426o() {
        return this.f8005c;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f8007n;
        if (i != -1) {
            mo11439v(Collections.singleton(Integer.valueOf(i)));
        }
    }

    public void onInitializeAccessibilityNodeInfo(@mr2 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1638a2.m10547X1(accessibilityNodeInfo).mo12553Y0(C1638a2.C1640b.m10703f(1, getVisibleButtonCount(), false, mo11426o() ? 1 : 2));
    }

    public void onMeasure(int i, int i2) {
        mo11441x();
        mo11410c();
        super.onMeasure(i, i2);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((MaterialButton.C1525c) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f8001a.remove(indexOfChild);
        }
        mo11441x();
        mo11410c();
    }

    /* renamed from: p */
    public void mo11431p(@mr2 MaterialButton materialButton, boolean z) {
        if (!this.f8004b) {
            mo11414f(materialButton.getId(), z);
        }
    }

    /* renamed from: q */
    public void mo11432q(@mr2 C1531d dVar) {
        this.f8000a.remove(dVar);
    }

    /* renamed from: r */
    public final void mo11433r(int i) {
        if (getChildCount() != 0 && i != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) mo11421j(i).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            ld2.m20483g(layoutParams, 0);
            ld2.m20484h(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    /* renamed from: s */
    public final void mo11434s(@mo1 int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.f8004b = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f8004b = false;
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f8006d = z;
    }

    public void setSingleSelection(@C2530jn int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f8005c != z) {
            this.f8005c = z;
            mo11415g();
        }
    }

    /* renamed from: t */
    public void mo11438t(@mo1 int i) {
        mo11414f(i, false);
    }

    /* renamed from: v */
    public final void mo11439v(Set<Integer> set) {
        Set<Integer> set2 = this.f8002a;
        this.f8002a = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = mo11421j(i).getId();
            mo11434s(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                mo11420i(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    /* renamed from: w */
    public final void mo11440w() {
        TreeMap treeMap = new TreeMap(this.f7999a);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(mo11421j(i), Integer.valueOf(i));
        }
        this.f8003a = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    @hw4
    /* renamed from: x */
    public void mo11441x() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton j = mo11421j(i);
            if (j.getVisibility() != 8) {
                uw3.C6982b v = j.getShapeAppearanceModel().mo45824v();
                m9743u(v, mo11423l(i, firstVisibleChildIndex, lastVisibleChildIndex));
                j.setShapeAppearanceModel(v.mo45845m());
            }
        }
    }
}
