package com.onedelhi.secure;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: com.onedelhi.secure.g6 */
public interface C2218g6 extends Animatable {

    /* renamed from: com.onedelhi.secure.g6$a */
    public static abstract class C2219a {

        /* renamed from: a */
        public Animatable2.AnimationCallback f12445a;

        /* renamed from: com.onedelhi.secure.g6$a$a */
        public class C2220a extends Animatable2.AnimationCallback {
            public C2220a() {
            }

            public void onAnimationEnd(Drawable drawable) {
                C2219a.this.mo11537b(drawable);
            }

            public void onAnimationStart(Drawable drawable) {
                C2219a.this.mo11538c(drawable);
            }
        }

        @sj3(23)
        /* renamed from: a */
        public Animatable2.AnimationCallback mo16359a() {
            if (this.f12445a == null) {
                this.f12445a = new C2220a();
            }
            return this.f12445a;
        }

        /* renamed from: b */
        public void mo11537b(Drawable drawable) {
        }

        /* renamed from: c */
        public void mo11538c(Drawable drawable) {
        }
    }

    /* renamed from: b */
    void mo13425b();

    /* renamed from: c */
    void mo13426c(@mr2 C2219a aVar);

    /* renamed from: d */
    boolean mo13429d(@mr2 C2219a aVar);
}
