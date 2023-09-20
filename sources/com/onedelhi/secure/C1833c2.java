package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import java.util.List;

/* renamed from: com.onedelhi.secure.c2 */
public class C1833c2 {

    /* renamed from: a */
    public final AccessibilityRecord f10082a;

    @sj3(15)
    /* renamed from: com.onedelhi.secure.c2$a */
    public static class C1834a {
        @pn0
        /* renamed from: a */
        public static int m12258a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        @pn0
        /* renamed from: b */
        public static int m12259b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        @pn0
        /* renamed from: c */
        public static void m12260c(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }

        @pn0
        /* renamed from: d */
        public static void m12261d(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    @sj3(16)
    /* renamed from: com.onedelhi.secure.c2$b */
    public static class C1835b {
        @pn0
        /* renamed from: a */
        public static void m12262a(AccessibilityRecord accessibilityRecord, View view, int i) {
            accessibilityRecord.setSource(view, i);
        }
    }

    @Deprecated
    public C1833c2(Object obj) {
        this.f10082a = (AccessibilityRecord) obj;
    }

    @Deprecated
    /* renamed from: A */
    public static C1833c2 m12206A(C1833c2 c2Var) {
        return new C1833c2(AccessibilityRecord.obtain(c2Var.f10082a));
    }

    /* renamed from: N */
    public static void m12207N(@mr2 AccessibilityRecord accessibilityRecord, int i) {
        C1834a.m12260c(accessibilityRecord, i);
    }

    /* renamed from: P */
    public static void m12208P(@mr2 AccessibilityRecord accessibilityRecord, int i) {
        C1834a.m12261d(accessibilityRecord, i);
    }

    /* renamed from: Y */
    public static void m12209Y(@mr2 AccessibilityRecord accessibilityRecord, @ts2 View view, int i) {
        C1835b.m12262a(accessibilityRecord, view, i);
    }

    /* renamed from: j */
    public static int m12210j(@mr2 AccessibilityRecord accessibilityRecord) {
        return C1834a.m12258a(accessibilityRecord);
    }

    /* renamed from: l */
    public static int m12211l(@mr2 AccessibilityRecord accessibilityRecord) {
        return C1834a.m12259b(accessibilityRecord);
    }

    @Deprecated
    /* renamed from: z */
    public static C1833c2 m12212z() {
        return new C1833c2(AccessibilityRecord.obtain());
    }

    @Deprecated
    /* renamed from: B */
    public void mo13903B() {
        this.f10082a.recycle();
    }

    @Deprecated
    /* renamed from: C */
    public void mo13904C(int i) {
        this.f10082a.setAddedCount(i);
    }

    @Deprecated
    /* renamed from: D */
    public void mo13905D(CharSequence charSequence) {
        this.f10082a.setBeforeText(charSequence);
    }

    @Deprecated
    /* renamed from: E */
    public void mo13906E(boolean z) {
        this.f10082a.setChecked(z);
    }

    @Deprecated
    /* renamed from: F */
    public void mo13907F(CharSequence charSequence) {
        this.f10082a.setClassName(charSequence);
    }

    @Deprecated
    /* renamed from: G */
    public void mo13908G(CharSequence charSequence) {
        this.f10082a.setContentDescription(charSequence);
    }

    @Deprecated
    /* renamed from: H */
    public void mo13909H(int i) {
        this.f10082a.setCurrentItemIndex(i);
    }

    @Deprecated
    /* renamed from: I */
    public void mo13910I(boolean z) {
        this.f10082a.setEnabled(z);
    }

    @Deprecated
    /* renamed from: J */
    public void mo13911J(int i) {
        this.f10082a.setFromIndex(i);
    }

    @Deprecated
    /* renamed from: K */
    public void mo13912K(boolean z) {
        this.f10082a.setFullScreen(z);
    }

    @Deprecated
    /* renamed from: L */
    public void mo13913L(int i) {
        this.f10082a.setItemCount(i);
    }

    @Deprecated
    /* renamed from: M */
    public void mo13914M(int i) {
        m12207N(this.f10082a, i);
    }

    @Deprecated
    /* renamed from: O */
    public void mo13915O(int i) {
        m12208P(this.f10082a, i);
    }

    @Deprecated
    /* renamed from: Q */
    public void mo13916Q(Parcelable parcelable) {
        this.f10082a.setParcelableData(parcelable);
    }

    @Deprecated
    /* renamed from: R */
    public void mo13917R(boolean z) {
        this.f10082a.setPassword(z);
    }

    @Deprecated
    /* renamed from: S */
    public void mo13918S(int i) {
        this.f10082a.setRemovedCount(i);
    }

    @Deprecated
    /* renamed from: T */
    public void mo13919T(int i) {
        this.f10082a.setScrollX(i);
    }

    @Deprecated
    /* renamed from: U */
    public void mo13920U(int i) {
        this.f10082a.setScrollY(i);
    }

    @Deprecated
    /* renamed from: V */
    public void mo13921V(boolean z) {
        this.f10082a.setScrollable(z);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    /* renamed from: W */
    public void mo13922W(View view) {
        this.f10082a.setSource(view);
    }

    @Deprecated
    /* renamed from: X */
    public void mo13923X(View view, int i) {
        m12209Y(this.f10082a, view, i);
    }

    @Deprecated
    /* renamed from: Z */
    public void mo13924Z(int i) {
        this.f10082a.setToIndex(i);
    }

    @Deprecated
    /* renamed from: a */
    public int mo13925a() {
        return this.f10082a.getAddedCount();
    }

    @Deprecated
    /* renamed from: b */
    public CharSequence mo13926b() {
        return this.f10082a.getBeforeText();
    }

    @Deprecated
    /* renamed from: c */
    public CharSequence mo13927c() {
        return this.f10082a.getClassName();
    }

    @Deprecated
    /* renamed from: d */
    public CharSequence mo13928d() {
        return this.f10082a.getContentDescription();
    }

    @Deprecated
    /* renamed from: e */
    public int mo13929e() {
        return this.f10082a.getCurrentItemIndex();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1833c2)) {
            return false;
        }
        AccessibilityRecord accessibilityRecord = this.f10082a;
        AccessibilityRecord accessibilityRecord2 = ((C1833c2) obj).f10082a;
        return accessibilityRecord == null ? accessibilityRecord2 == null : accessibilityRecord.equals(accessibilityRecord2);
    }

    @Deprecated
    /* renamed from: f */
    public int mo13931f() {
        return this.f10082a.getFromIndex();
    }

    @Deprecated
    /* renamed from: g */
    public Object mo13932g() {
        return this.f10082a;
    }

    @Deprecated
    /* renamed from: h */
    public int mo13933h() {
        return this.f10082a.getItemCount();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f10082a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int mo13935i() {
        return m12210j(this.f10082a);
    }

    @Deprecated
    /* renamed from: k */
    public int mo13936k() {
        return m12211l(this.f10082a);
    }

    @Deprecated
    /* renamed from: m */
    public Parcelable mo13937m() {
        return this.f10082a.getParcelableData();
    }

    @Deprecated
    /* renamed from: n */
    public int mo13938n() {
        return this.f10082a.getRemovedCount();
    }

    @Deprecated
    /* renamed from: o */
    public int mo13939o() {
        return this.f10082a.getScrollX();
    }

    @Deprecated
    /* renamed from: p */
    public int mo13940p() {
        return this.f10082a.getScrollY();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    /* renamed from: q */
    public C1638a2 mo13941q() {
        return C1638a2.m10548Y1(this.f10082a.getSource());
    }

    @Deprecated
    /* renamed from: r */
    public List<CharSequence> mo13942r() {
        return this.f10082a.getText();
    }

    @Deprecated
    /* renamed from: s */
    public int mo13943s() {
        return this.f10082a.getToIndex();
    }

    @Deprecated
    /* renamed from: t */
    public int mo13944t() {
        return this.f10082a.getWindowId();
    }

    @Deprecated
    /* renamed from: u */
    public boolean mo13945u() {
        return this.f10082a.isChecked();
    }

    @Deprecated
    /* renamed from: v */
    public boolean mo13946v() {
        return this.f10082a.isEnabled();
    }

    @Deprecated
    /* renamed from: w */
    public boolean mo13947w() {
        return this.f10082a.isFullScreen();
    }

    @Deprecated
    /* renamed from: x */
    public boolean mo13948x() {
        return this.f10082a.isPassword();
    }

    @Deprecated
    /* renamed from: y */
    public boolean mo13949y() {
        return this.f10082a.isScrollable();
    }
}
