package com.onedelhi.secure;

import android.util.Property;
import android.view.ViewGroup;
import com.onedelhi.secure.fd3;

/* renamed from: com.onedelhi.secure.wx */
public class C3879wx extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final Property<ViewGroup, Float> f22357a = new C3879wx("childrenAlpha");

    public C3879wx(String str) {
        super(Float.class, str);
    }

    @mr2
    /* renamed from: a */
    public Float get(@mr2 ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(fd3.C2158h.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    /* renamed from: b */
    public void set(@mr2 ViewGroup viewGroup, @mr2 Float f) {
        float floatValue = f.floatValue();
        viewGroup.setTag(fd3.C2158h.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
