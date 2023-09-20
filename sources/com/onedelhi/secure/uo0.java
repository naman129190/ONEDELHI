package com.onedelhi.secure;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

public class uo0 extends Property<Drawable, Integer> {

    /* renamed from: a */
    public static final Property<Drawable, Integer> f21459a = new uo0();

    /* renamed from: a */
    public final WeakHashMap<Drawable, Integer> f21460a = new WeakHashMap<>();

    public uo0() {
        super(Integer.class, "drawableAlphaCompat");
    }

    @ts2
    /* renamed from: a */
    public Integer get(@mr2 Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    /* renamed from: b */
    public void set(@mr2 Drawable drawable, @mr2 Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
