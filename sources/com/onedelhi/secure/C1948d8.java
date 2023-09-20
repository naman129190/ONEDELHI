package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.f13185a})
/* renamed from: com.onedelhi.secure.d8 */
public class C1948d8 {

    /* renamed from: a */
    public ColorStateList f10654a = null;

    /* renamed from: a */
    public PorterDuff.Mode f10655a = null;
    @mr2

    /* renamed from: a */
    public final CheckedTextView f10656a;

    /* renamed from: a */
    public boolean f10657a = false;

    /* renamed from: b */
    public boolean f10658b = false;

    /* renamed from: c */
    public boolean f10659c;

    public C1948d8(@mr2 CheckedTextView checkedTextView) {
        this.f10656a = checkedTextView;
    }

    /* renamed from: a */
    public void mo14550a() {
        Drawable a = C3098ox.m24155a(this.f10656a);
        if (a == null) {
            return;
        }
        if (this.f10657a || this.f10658b) {
            Drawable mutate = wo0.m30989r(a).mutate();
            if (this.f10657a) {
                wo0.m30986o(mutate, this.f10654a);
            }
            if (this.f10658b) {
                wo0.m30987p(mutate, this.f10655a);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f10656a.getDrawableState());
            }
            this.f10656a.setCheckMarkDrawable(mutate);
        }
    }

    /* renamed from: b */
    public ColorStateList mo14551b() {
        return this.f10654a;
    }

    /* renamed from: c */
    public PorterDuff.Mode mo14552c() {
        return this.f10655a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14553d(@com.onedelhi.secure.ts2 android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CheckedTextView r0 = r9.f10656a
            android.content.Context r0 = r0.getContext()
            int[] r3 = com.onedelhi.secure.za3.C4068m.CheckedTextView
            r8 = 0
            com.onedelhi.secure.af4 r0 = com.onedelhi.secure.af4.m11110G(r0, r10, r3, r11, r8)
            android.widget.CheckedTextView r1 = r9.f10656a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.mo13025B()
            r7 = 0
            r4 = r10
            r6 = r11
            com.onedelhi.secure.jt4.m19033z1(r1, r2, r3, r4, r5, r6, r7)
            int r10 = com.onedelhi.secure.za3.C4068m.CheckedTextView_checkMarkCompat     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo13026C(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.mo13050u(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CheckedTextView r11 = r9.f10656a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = com.onedelhi.secure.C3129p8.m24529b(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setCheckMarkDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = 0
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = com.onedelhi.secure.za3.C4068m.CheckedTextView_android_checkMark     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo13026C(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.mo13050u(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CheckedTextView r11 = r9.f10656a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = com.onedelhi.secure.C3129p8.m24529b(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setCheckMarkDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = com.onedelhi.secure.za3.C4068m.CheckedTextView_checkMarkTint     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo13026C(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CheckedTextView r11 = r9.f10656a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.mo13033d(r10)     // Catch:{ all -> 0x0084 }
            com.onedelhi.secure.C3098ox.m24158d(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = com.onedelhi.secure.za3.C4068m.CheckedTextView_checkMarkTintMode     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo13026C(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CheckedTextView r11 = r9.f10656a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.mo13044o(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = com.onedelhi.secure.jp0.m18734e(r10, r1)     // Catch:{ all -> 0x0084 }
            com.onedelhi.secure.C3098ox.m24159e(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.mo13029I()
            return
        L_0x0084:
            r10 = move-exception
            r0.mo13029I()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C1948d8.mo14553d(android.util.AttributeSet, int):void");
    }

    /* renamed from: e */
    public void mo14554e() {
        if (this.f10659c) {
            this.f10659c = false;
            return;
        }
        this.f10659c = true;
        mo14550a();
    }

    /* renamed from: f */
    public void mo14555f(ColorStateList colorStateList) {
        this.f10654a = colorStateList;
        this.f10657a = true;
        mo14550a();
    }

    /* renamed from: g */
    public void mo14556g(@ts2 PorterDuff.Mode mode) {
        this.f10655a = mode;
        this.f10658b = true;
        mo14550a();
    }
}
