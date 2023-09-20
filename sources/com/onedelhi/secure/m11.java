package com.onedelhi.secure;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import java.util.List;

public class m11 extends GoogleApi<Api.ApiOptions.NoOptions> {

    /* renamed from: a */
    public static final Api.ClientKey f15828a;

    /* renamed from: a */
    public static final Api f15829a;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f15828a = clientKey;
        f15829a = new Api("Fido.FIDO2_PRIVILEGED_API", new sk6(), clientKey);
    }

    @Deprecated
    public m11(@mr2 Activity activity) {
        super(activity, f15829a, Api.ApiOptions.NO_OPTIONS, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    @Deprecated
    public m11(@mr2 Context context) {
        super(context, f15829a, Api.ApiOptions.NO_OPTIONS, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    @mr2
    /* renamed from: V */
    public w94<List<p11>> mo20007V(@mr2 String str) {
        return doRead(TaskApiCall.builder().run(new fn6(this, str)).setMethodKey(5430).build());
    }

    @mr2
    @Deprecated
    /* renamed from: W */
    public w94<l11> mo20008W(@mr2 C2454io ioVar) {
        return doRead(TaskApiCall.builder().setMethodKey(5414).run(new nv6(this, ioVar)).build());
    }

    @mr2
    /* renamed from: X */
    public w94<PendingIntent> mo20009X(@mr2 C2454io ioVar) {
        return doRead(TaskApiCall.builder().run(new yp6(this, ioVar)).setMethodKey(5412).build());
    }

    @mr2
    @Deprecated
    /* renamed from: Y */
    public w94<l11> mo20010Y(@mr2 C2532jo joVar) {
        return doRead(TaskApiCall.builder().setMethodKey(5415).run(new xt6(this, joVar)).build());
    }

    @mr2
    /* renamed from: Z */
    public w94<PendingIntent> mo20011Z(@mr2 C2532jo joVar) {
        return doRead(TaskApiCall.builder().run(new gs6(this, joVar)).setMethodKey(5413).build());
    }

    @mr2
    /* renamed from: a0 */
    public w94<Boolean> mo20012a0() {
        return doRead(TaskApiCall.builder().run(new gx6(this)).setFeatures(ya5.f22952h).setMethodKey(5416).build());
    }
}
