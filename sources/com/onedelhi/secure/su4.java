package com.onedelhi.secure;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.onedelhi.secure.g42;
import java.util.Arrays;

public class su4<T> implements g42.C2213b<T>, uz3 {

    /* renamed from: a */
    public C3545a f20518a;

    /* renamed from: a */
    public int[] f20519a;

    /* renamed from: com.onedelhi.secure.su4$a */
    public static final class C3545a extends rc0<View, Object> {
        public C3545a(@mr2 View view) {
            super(view);
        }

        /* renamed from: b */
        public void mo16019b(@ts2 Drawable drawable) {
        }

        /* renamed from: n */
        public void mo16020n(@ts2 Drawable drawable) {
        }

        /* renamed from: s */
        public void mo16021s(@mr2 Object obj, @ts2 jh4<? super Object> jh4) {
        }
    }

    public su4() {
    }

    public su4(@mr2 View view) {
        C3545a aVar = new C3545a(view);
        this.f20518a = aVar;
        aVar.mo14955e(this);
    }

    @ts2
    /* renamed from: a */
    public int[] mo16332a(@mr2 T t, int i, int i2) {
        int[] iArr = this.f20519a;
        if (iArr == null) {
            return null;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    /* renamed from: b */
    public void mo24552b(@mr2 View view) {
        if (this.f20519a == null && this.f20518a == null) {
            C3545a aVar = new C3545a(view);
            this.f20518a = aVar;
            aVar.mo14955e(this);
        }
    }

    /* renamed from: e */
    public void mo19958e(int i, int i2) {
        this.f20519a = new int[]{i, i2};
        this.f20518a = null;
    }
}
