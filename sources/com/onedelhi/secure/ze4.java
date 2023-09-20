package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

public class ze4 extends dl3 {

    /* renamed from: a */
    public final WeakReference<Context> f23590a;

    public ze4(@mr2 Context context, @mr2 Resources resources) {
        super(resources);
        this.f23590a = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable a = mo14742a(i);
        Context context = (Context) this.f23590a.get();
        if (!(a == null || context == null)) {
            sk3.m27673h().mo24472x(context, i, a);
        }
        return a;
    }
}
