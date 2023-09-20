package com.onedelhi.secure;

import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class n42 {

    /* renamed from: a */
    public static final SparseArray<WeakHashMap<View, WeakReference<?>>> f17097a = new SparseArray<>();

    /* renamed from: a */
    public static <T> T m22334a(View view, int i) {
        return view.getTag(i);
    }

    /* renamed from: b */
    public static <T> T m22335b(View view, T t, int i) {
        T tag = view.getTag(i);
        view.setTag(i, t);
        return tag;
    }
}
