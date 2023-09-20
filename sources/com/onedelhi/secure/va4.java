package com.onedelhi.secure;

import com.airbnb.lottie.LottieAnimationView;
import java.util.HashMap;
import java.util.Map;

public class va4 {
    @ts2

    /* renamed from: a */
    public final LottieAnimationView f21718a;
    @ts2

    /* renamed from: a */
    public final qa2 f21719a;

    /* renamed from: a */
    public final Map<String, String> f21720a;

    /* renamed from: a */
    public boolean f21721a;

    @hw4
    public va4() {
        this.f21720a = new HashMap();
        this.f21721a = true;
        this.f21718a = null;
        this.f21719a = null;
    }

    public va4(LottieAnimationView lottieAnimationView) {
        this.f21720a = new HashMap();
        this.f21721a = true;
        this.f21718a = lottieAnimationView;
        this.f21719a = null;
    }

    public va4(qa2 qa2) {
        this.f21720a = new HashMap();
        this.f21721a = true;
        this.f21719a = qa2;
        this.f21718a = null;
    }

    /* renamed from: a */
    public final String mo25913a(String str) {
        return str;
    }

    /* renamed from: b */
    public final String mo25914b(String str) {
        if (this.f21721a && this.f21720a.containsKey(str)) {
            return this.f21720a.get(str);
        }
        String a = mo25913a(str);
        if (this.f21721a) {
            this.f21720a.put(str, a);
        }
        return a;
    }

    /* renamed from: c */
    public final void mo25915c() {
        LottieAnimationView lottieAnimationView = this.f21718a;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        qa2 qa2 = this.f21719a;
        if (qa2 != null) {
            qa2.invalidateSelf();
        }
    }

    /* renamed from: d */
    public void mo25916d() {
        this.f21720a.clear();
        mo25915c();
    }

    /* renamed from: e */
    public void mo25917e(String str) {
        this.f21720a.remove(str);
        mo25915c();
    }

    /* renamed from: f */
    public void mo25918f(boolean z) {
        this.f21721a = z;
    }

    /* renamed from: g */
    public void mo25919g(String str, String str2) {
        this.f21720a.put(str, str2);
        mo25915c();
    }
}
