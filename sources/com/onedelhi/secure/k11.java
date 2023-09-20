package com.onedelhi.secure;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;

public class k11 extends GoogleApi<Api.ApiOptions.NoOptions> {

    /* renamed from: a */
    public static final Api.ClientKey f14672a;

    /* renamed from: a */
    public static final Api f14673a;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f14672a = clientKey;
        f14673a = new Api("Fido.FIDO2_API", new sv6(), clientKey);
    }

    @Deprecated
    public k11(@mr2 Activity activity) {
        super(activity, f14673a, Api.ApiOptions.NO_OPTIONS, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    @Deprecated
    public k11(@mr2 Context context) {
        super(context, f14673a, Api.ApiOptions.NO_OPTIONS, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    @mr2
    @Deprecated
    /* renamed from: V */
    public w94<l11> mo18836V(@mr2 r73 r73) {
        return doRead(TaskApiCall.builder().setMethodKey(5409).run(new rx5(this, r73)).build());
    }

    @mr2
    /* renamed from: W */
    public w94<PendingIntent> mo18837W(@mr2 r73 r73) {
        return doRead(TaskApiCall.builder().run(new ms5(this, r73)).setMethodKey(5407).build());
    }

    @mr2
    @Deprecated
    /* renamed from: X */
    public w94<l11> mo18838X(@mr2 u73 u73) {
        return doRead(TaskApiCall.builder().setMethodKey(5410).run(new p95(this, u73)).build());
    }

    @mr2
    /* renamed from: Y */
    public w94<PendingIntent> mo18839Y(@mr2 u73 u73) {
        return doRead(TaskApiCall.builder().run(new n26(this, u73)).setMethodKey(5408).build());
    }

    @mr2
    /* renamed from: Z */
    public w94<Boolean> mo18840Z() {
        return doRead(TaskApiCall.builder().run(new am5(this)).setFeatures(ya5.f22952h).setMethodKey(5411).build());
    }
}
