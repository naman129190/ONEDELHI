package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import com.onedelhi.secure.hl3;
import java.util.ArrayList;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public final class h34 {

    /* renamed from: a */
    public final Animator.AnimatorListener f29411a = new C5476a();
    @ts2

    /* renamed from: a */
    public ValueAnimator f29412a = null;
    @ts2

    /* renamed from: a */
    public C5477b f29413a = null;

    /* renamed from: a */
    public final ArrayList<C5477b> f29414a = new ArrayList<>();

    /* renamed from: com.onedelhi.secure.h34$a */
    public class C5476a extends AnimatorListenerAdapter {
        public C5476a() {
        }

        public void onAnimationEnd(Animator animator) {
            h34 h34 = h34.this;
            if (h34.f29412a == animator) {
                h34.f29412a = null;
            }
        }
    }

    /* renamed from: com.onedelhi.secure.h34$b */
    public static class C5477b {

        /* renamed from: a */
        public final ValueAnimator f29416a;

        /* renamed from: a */
        public final int[] f29417a;

        public C5477b(int[] iArr, ValueAnimator valueAnimator) {
            this.f29417a = iArr;
            this.f29416a = valueAnimator;
        }
    }

    /* renamed from: a */
    public void mo37168a(int[] iArr, ValueAnimator valueAnimator) {
        C5477b bVar = new C5477b(iArr, valueAnimator);
        valueAnimator.addListener(this.f29411a);
        this.f29414a.add(bVar);
    }

    /* renamed from: b */
    public final void mo37169b() {
        ValueAnimator valueAnimator = this.f29412a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f29412a = null;
        }
    }

    /* renamed from: c */
    public void mo37170c() {
        ValueAnimator valueAnimator = this.f29412a;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f29412a = null;
        }
    }

    /* renamed from: d */
    public void mo37171d(int[] iArr) {
        C5477b bVar;
        int size = this.f29414a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.f29414a.get(i);
            if (StateSet.stateSetMatches(bVar.f29417a, iArr)) {
                break;
            }
            i++;
        }
        C5477b bVar2 = this.f29413a;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                mo37169b();
            }
            this.f29413a = bVar;
            if (bVar != null) {
                mo37172e(bVar);
            }
        }
    }

    /* renamed from: e */
    public final void mo37172e(@mr2 C5477b bVar) {
        ValueAnimator valueAnimator = bVar.f29416a;
        this.f29412a = valueAnimator;
        valueAnimator.start();
    }
}
