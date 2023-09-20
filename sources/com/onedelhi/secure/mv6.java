package com.onedelhi.secure;

import android.os.Bundle;

public final class mv6 extends ex6<Void> {
    public mv6(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* renamed from: a */
    public final void mo15650a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            mo15653d(null);
        } else {
            mo15652c(new wy6(4, "Invalid response to one way request", (Throwable) null));
        }
    }

    /* renamed from: b */
    public final boolean mo15651b() {
        return true;
    }
}
