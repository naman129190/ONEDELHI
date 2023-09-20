package com.onedelhi.secure;

public final /* synthetic */ class o57 implements nu2 {

    /* renamed from: a */
    public final /* synthetic */ ea5 f17699a;

    /* renamed from: a */
    public final /* synthetic */ ql5 f17700a;

    /* renamed from: a */
    public final /* synthetic */ x94 f17701a;

    public /* synthetic */ o57(ea5 ea5, x94 x94, ql5 ql5) {
        this.f17699a = ea5;
        this.f17701a = x94;
        this.f17700a = ql5;
    }

    public final void onComplete(w94 w94) {
        ea5 ea5 = this.f17699a;
        x94 x94 = this.f17701a;
        ql5 ql5 = this.f17700a;
        ea5.removeCallbacksAndMessages((Object) null);
        if (w94.mo17590v()) {
            x94.mo26839e(w94.mo17586r());
        } else if (w94.mo17588t()) {
            ql5.mo23253c();
        } else {
            Exception q = w94.mo17585q();
            q.getClass();
            x94.mo26838d(q);
        }
    }
}
