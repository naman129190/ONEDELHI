package com.onedelhi.secure;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.onedelhi.secure.jv4;

public class ft4<R> implements kh4<R> {

    /* renamed from: a */
    public jh4<R> f12318a;

    /* renamed from: a */
    public final jv4.C2577a f12319a;

    /* renamed from: com.onedelhi.secure.ft4$a */
    public static class C2199a implements jv4.C2577a {

        /* renamed from: a */
        public final Animation f12320a;

        public C2199a(Animation animation) {
            this.f12320a = animation;
        }

        /* renamed from: a */
        public Animation mo16166a(Context context) {
            return this.f12320a;
        }
    }

    /* renamed from: com.onedelhi.secure.ft4$b */
    public static class C2200b implements jv4.C2577a {

        /* renamed from: a */
        public final int f12321a;

        public C2200b(int i) {
            this.f12321a = i;
        }

        /* renamed from: a */
        public Animation mo16166a(Context context) {
            return AnimationUtils.loadAnimation(context, this.f12321a);
        }
    }

    public ft4(int i) {
        this((jv4.C2577a) new C2200b(i));
    }

    public ft4(Animation animation) {
        this((jv4.C2577a) new C2199a(animation));
    }

    public ft4(jv4.C2577a aVar) {
        this.f12319a = aVar;
    }

    /* renamed from: a */
    public jh4<R> mo16140a(vd0 vd0, boolean z) {
        if (vd0 == vd0.MEMORY_CACHE || !z) {
            return fr2.m15244b();
        }
        if (this.f12318a == null) {
            this.f12318a = new jv4(this.f12319a);
        }
        return this.f12318a;
    }
}
