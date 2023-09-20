package com.onedelhi.secure;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class sq6 {

    /* renamed from: a */
    public final Context f20493a;

    @VisibleForTesting
    public sq6(Context context) {
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f20493a = applicationContext;
    }
}
