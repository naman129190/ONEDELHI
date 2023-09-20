package com.onedelhi.secure;

import android.animation.Animator;

/* renamed from: com.onedelhi.secure.k7 */
public class C2607k7 {
    @ts2

    /* renamed from: a */
    public Animator f14769a;

    /* renamed from: a */
    public void mo18925a() {
        Animator animator = this.f14769a;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: b */
    public void mo18926b() {
        this.f14769a = null;
    }

    /* renamed from: c */
    public void mo18927c(Animator animator) {
        mo18925a();
        this.f14769a = animator;
    }
}
