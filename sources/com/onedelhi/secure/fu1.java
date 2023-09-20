package com.onedelhi.secure;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.sb3;

public class fu1 implements eu1 {

    /* renamed from: a */
    public static final eu1 f12331a = new fu1();

    /* renamed from: e */
    public static float m15304e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float R = jt4.m18904R(childAt);
                if (R > f) {
                    f = R;
                }
            }
        }
        return f;
    }

    /* renamed from: a */
    public void mo15594a(View view) {
    }

    /* renamed from: b */
    public void mo15595b(View view) {
        int i = sb3.C3489e.item_touch_helper_previous_elevation;
        Object tag = view.getTag(i);
        if (tag instanceof Float) {
            jt4.m18894N1(view, ((Float) tag).floatValue());
        }
        view.setTag(i, (Object) null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    /* renamed from: c */
    public void mo15596c(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }

    /* renamed from: d */
    public void mo15597d(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (z) {
            int i2 = sb3.C3489e.item_touch_helper_previous_elevation;
            if (view.getTag(i2) == null) {
                Float valueOf = Float.valueOf(jt4.m18904R(view));
                jt4.m18894N1(view, m15304e(recyclerView, view) + 1.0f);
                view.setTag(i2, valueOf);
            }
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }
}
