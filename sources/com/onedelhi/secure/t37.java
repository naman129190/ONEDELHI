package com.onedelhi.secure;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;

public final /* synthetic */ class t37 implements c80 {

    /* renamed from: a */
    public static final /* synthetic */ t37 f20647a = new t37();

    public final Object then(w94 w94) {
        if (w94.mo17590v()) {
            return (Bundle) w94.mo17586r();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(w94.mo17585q());
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", w94.mo17585q());
    }
}
