package com.google.android.gms.common.internal;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.service.zao;
import com.onedelhi.secure.mr2;

@KeepForSdk
public class TelemetryLogging {
    private TelemetryLogging() {
    }

    @mr2
    @KeepForSdk
    public static TelemetryLoggingClient getClient(@mr2 Context context) {
        return getClient(context, TelemetryLoggingOptions.zaa);
    }

    @mr2
    @KeepForSdk
    public static TelemetryLoggingClient getClient(@mr2 Context context, @mr2 TelemetryLoggingOptions telemetryLoggingOptions) {
        return new zao(context, telemetryLoggingOptions);
    }
}
