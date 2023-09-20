package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.HasApiKey;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.qn0;
import com.onedelhi.secure.w94;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", explanation = "Use canonical fakes instead.", link = "go/gmscore-restrictedinheritance")
@KeepForSdk
@qn0("Use canonical fakes instead. go/cheezhead-testing-methodology")
public interface TelemetryLoggingClient extends HasApiKey<TelemetryLoggingOptions> {
    @mr2
    @KeepForSdk
    w94<Void> log(@mr2 TelemetryData telemetryData);
}
