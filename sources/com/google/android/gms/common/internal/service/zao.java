package com.google.android.gms.common.internal.service;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.onedelhi.secure.i45;
import com.onedelhi.secure.w94;

public final class zao extends GoogleApi implements TelemetryLoggingClient {
    public static final /* synthetic */ int zab = 0;
    private static final Api.ClientKey zac;
    private static final Api.AbstractClientBuilder zad;
    private static final Api zae;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zac = clientKey;
        zan zan = new zan();
        zad = zan;
        zae = new Api("ClientTelemetry.API", zan, clientKey);
    }

    public zao(Context context, TelemetryLoggingOptions telemetryLoggingOptions) {
        super(context, zae, telemetryLoggingOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final w94<Void> log(TelemetryData telemetryData) {
        TaskApiCall.Builder builder = TaskApiCall.builder();
        builder.setFeatures(i45.f13483a);
        builder.setAutoResolveMissingFeatures(false);
        builder.run(new zam(telemetryData));
        return doBestEffortWrite(builder.build());
    }
}
