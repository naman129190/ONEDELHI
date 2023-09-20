package com.onedelhi.secure;

import android.os.Looper;
import android.os.Message;

public final class ob5 extends p66 {

    /* renamed from: a */
    public final /* synthetic */ ho3 f17909a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ob5(ho3 ho3, Looper looper) {
        super(looper);
        this.f17909a = ho3;
    }

    public final void handleMessage(Message message) {
        ho3.m16872d(this.f17909a, message);
    }
}
