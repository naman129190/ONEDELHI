package com.onedelhi.secure;

import java.io.IOException;
import java.util.List;

/* renamed from: com.onedelhi.secure.y6 */
public class C3976y6 {
    @ts2
    /* renamed from: a */
    public static <T> List<ez1<T>> m31964a(wv1 wv1, float f, la2 la2, is4<T> is4) throws IOException {
        return hz1.m17062a(wv1, la2, f, is4);
    }

    @ts2
    /* renamed from: b */
    public static <T> List<ez1<T>> m31965b(wv1 wv1, la2 la2, is4<T> is4) throws IOException {
        return hz1.m17062a(wv1, la2, 1.0f, is4);
    }

    /* renamed from: c */
    public static C2398i6 m31966c(wv1 wv1, la2 la2) throws IOException {
        return new C2398i6(m31965b(wv1, la2, i10.f13448a));
    }

    /* renamed from: d */
    public static C3472s6 m31967d(wv1 wv1, la2 la2) throws IOException {
        return new C3472s6(m31965b(wv1, la2, tn0.f20964a));
    }

    /* renamed from: e */
    public static C2475j6 m31968e(wv1 wv1, la2 la2) throws IOException {
        return m31969f(wv1, la2, true);
    }

    /* renamed from: f */
    public static C2475j6 m31969f(wv1 wv1, la2 la2, boolean z) throws IOException {
        return new C2475j6(m31964a(wv1, z ? yq4.m32602e() : 1.0f, la2, b81.f9735a));
    }

    /* renamed from: g */
    public static C2602k6 m31970g(wv1 wv1, la2 la2, int i) throws IOException {
        return new C2602k6(m31965b(wv1, la2, new hi1(i)));
    }

    /* renamed from: h */
    public static C2695l6 m31971h(wv1 wv1, la2 la2) throws IOException {
        return new C2695l6(m31965b(wv1, la2, os1.f18092a));
    }

    /* renamed from: i */
    public static C3030o6 m31972i(wv1 wv1, la2 la2) throws IOException {
        return new C3030o6(m31964a(wv1, yq4.m32602e(), la2, w23.f22042a));
    }

    /* renamed from: j */
    public static C3127p6 m31973j(wv1 wv1, la2 la2) throws IOException {
        return new C3127p6((List<ez1<jr3>>) m31965b(wv1, la2, kr3.f15050a));
    }

    /* renamed from: k */
    public static C3230q6 m31974k(wv1 wv1, la2 la2) throws IOException {
        return new C3230q6(m31964a(wv1, yq4.m32602e(), la2, yw3.f23355a));
    }
}
