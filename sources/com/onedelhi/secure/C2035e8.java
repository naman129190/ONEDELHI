package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* renamed from: com.onedelhi.secure.e8 */
public class C2035e8 {

    /* renamed from: a */
    public ColorStateList f11139a = null;

    /* renamed from: a */
    public PorterDuff.Mode f11140a = null;
    @mr2

    /* renamed from: a */
    public final CompoundButton f11141a;

    /* renamed from: a */
    public boolean f11142a = false;

    /* renamed from: b */
    public boolean f11143b = false;

    /* renamed from: c */
    public boolean f11144c;

    public C2035e8(@mr2 CompoundButton compoundButton) {
        this.f11141a = compoundButton;
    }

    /* renamed from: a */
    public void mo15077a() {
        Drawable a = c40.m12287a(this.f11141a);
        if (a == null) {
            return;
        }
        if (this.f11142a || this.f11143b) {
            Drawable mutate = wo0.m30989r(a).mutate();
            if (this.f11142a) {
                wo0.m30986o(mutate, this.f11139a);
            }
            if (this.f11143b) {
                wo0.m30987p(mutate, this.f11140a);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f11141a.getDrawableState());
            }
            this.f11141a.setButtonDrawable(mutate);
        }
    }

    /* renamed from: b */
    public int mo15078b(int i) {
        return i;
    }

    /* renamed from: c */
    public ColorStateList mo15079c() {
        return this.f11139a;
    }

    /* renamed from: d */
    public PorterDuff.Mode mo15080d() {
        return this.f11140a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15081e(@com.onedelhi.secure.ts2 android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f11141a
            android.content.Context r0 = r0.getContext()
            int[] r3 = com.onedelhi.secure.za3.C4068m.CompoundButton
            r8 = 0
            com.onedelhi.secure.af4 r0 = com.onedelhi.secure.af4.m11110G(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f11141a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.mo13025B()
            r7 = 0
            r4 = r10
            r6 = r11
            com.onedelhi.secure.jt4.m19033z1(r1, r2, r3, r4, r5, r6, r7)
            int r10 = com.onedelhi.secure.za3.C4068m.CompoundButton_buttonCompat     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo13026C(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.mo13050u(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CompoundButton r11 = r9.f11141a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = com.onedelhi.secure.C3129p8.m24529b(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setButtonDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = 0
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = com.onedelhi.secure.za3.C4068m.CompoundButton_android_button     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo13026C(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.mo13050u(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CompoundButton r11 = r9.f11141a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = com.onedelhi.secure.C3129p8.m24529b(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setButtonDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = com.onedelhi.secure.za3.C4068m.CompoundButton_buttonTint     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo13026C(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CompoundButton r11 = r9.f11141a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.mo13033d(r10)     // Catch:{ all -> 0x0084 }
            com.onedelhi.secure.c40.m12290d(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = com.onedelhi.secure.za3.C4068m.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo13026C(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CompoundButton r11 = r9.f11141a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.mo13044o(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = com.onedelhi.secure.jp0.m18734e(r10, r1)     // Catch:{ all -> 0x0084 }
            com.onedelhi.secure.c40.m12291e(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.mo13029I()
            return
        L_0x0084:
            r10 = move-exception
            r0.mo13029I()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C2035e8.mo15081e(android.util.AttributeSet, int):void");
    }

    /* renamed from: f */
    public void mo15082f() {
        if (this.f11144c) {
            this.f11144c = false;
            return;
        }
        this.f11144c = true;
        mo15077a();
    }

    /* renamed from: g */
    public void mo15083g(ColorStateList colorStateList) {
        this.f11139a = colorStateList;
        this.f11142a = true;
        mo15077a();
    }

    /* renamed from: h */
    public void mo15084h(@ts2 PorterDuff.Mode mode) {
        this.f11140a = mode;
        this.f11143b = true;
        mo15077a();
    }
}
