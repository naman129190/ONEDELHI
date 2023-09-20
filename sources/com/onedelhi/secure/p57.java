package com.onedelhi.secure;

import android.util.Log;
import com.onedelhi.secure.us1;
import java.io.IOException;

public final /* synthetic */ class p57 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ x94 f18369a;

    public /* synthetic */ p57(x94 x94) {
        this.f18369a = x94;
    }

    public final void run() {
        if (this.f18369a.mo26838d(new IOException(us1.C6979a.f36259o))) {
            Log.w("Rpc", "No response");
        }
    }
}
