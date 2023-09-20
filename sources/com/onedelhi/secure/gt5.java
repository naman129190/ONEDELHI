package com.onedelhi.secure;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;

public final /* synthetic */ class gt5 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ c82 f12753a;

    public /* synthetic */ gt5(c82 c82) {
        this.f12753a = c82;
    }

    public final void accept(Object obj, Object obj2) {
        c82 c82 = this.f12753a;
        xx5 xx5 = (xx5) obj;
        x94 x94 = (x94) obj2;
        Preconditions.checkArgument(c82 != null, "locationSettingsRequest can't be null");
        ((tv6) xx5.getService()).mo14875V7(c82, new gv5(x94), (String) null);
    }
}
