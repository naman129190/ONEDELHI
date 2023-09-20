package com.onedelhi.secure;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;

@Deprecated
public class uk4 extends GoogleApi<Api.ApiOptions.NoOptions> {

    /* renamed from: a */
    public static final Api.ClientKey f21417a;

    /* renamed from: a */
    public static final Api f21418a;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f21417a = clientKey;
        f21418a = new Api("Fido.U2F_API", new e57(), clientKey);
    }

    public uk4(@mr2 Activity activity) {
        super(activity, f21418a, Api.ApiOptions.NO_OPTIONS, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    public uk4(@mr2 Context context) {
        super(context, f21418a, Api.ApiOptions.NO_OPTIONS, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    @mr2
    /* renamed from: V */
    public w94<vk4> mo25656V(@mr2 RegisterRequestParams registerRequestParams) {
        return doRead(TaskApiCall.builder().setMethodKey(5424).run(new wk5(this, registerRequestParams)).build());
    }

    @mr2
    /* renamed from: W */
    public w94<vk4> mo25657W(@mr2 SignRequestParams signRequestParams) {
        return doRead(TaskApiCall.builder().setMethodKey(5425).run(new r95(this, signRequestParams)).build());
    }
}
