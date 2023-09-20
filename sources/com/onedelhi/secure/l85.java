package com.onedelhi.secure;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.onedelhi.secure.C2326hc;

public final class l85 {
    /* renamed from: a */
    public static PendingIntent m20321a(Context context, @ts2 C2326hc.C2327a aVar, HintRequest hintRequest, @ts2 String str) {
        Preconditions.checkNotNull(context, "context must not be null");
        Preconditions.checkNotNull(hintRequest, "request must not be null");
        Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").setPackage("com.google.android.gms").putExtra("claimedCallingPackage", (String) null).putExtra("logSessionId", TextUtils.isEmpty(str) ? w65.m30705a() : (String) Preconditions.checkNotNull(str));
        SafeParcelableSerializer.serializeToIntentExtra(hintRequest, putExtra, "com.google.android.gms.credentials.HintRequest");
        return PendingIntent.getActivity(context, 2000, putExtra, x65.f22453a | 134217728);
    }
}
