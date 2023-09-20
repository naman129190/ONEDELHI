package com.onedelhi.secure;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.onedelhi.secure.jh4;

public class zo0 implements jh4<Drawable> {

    /* renamed from: a */
    public final int f23828a;

    /* renamed from: a */
    public final boolean f23829a;

    public zo0(int i, boolean z) {
        this.f23828a = i;
        this.f23829a = z;
    }

    /* renamed from: b */
    public boolean mo13290a(Drawable drawable, jh4.C2520a aVar) {
        Drawable i = aVar.mo16799i();
        if (i == null) {
            i = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{i, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f23829a);
        transitionDrawable.startTransition(this.f23828a);
        aVar.mo16800j(transitionDrawable);
        return true;
    }
}
