package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.onedelhi.secure.C7277xt;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@KeepForSdk
public class TelemetryLoggingOptions implements Api.ApiOptions.Optional {
    @mr2
    public static final TelemetryLoggingOptions zaa = builder().build();
    @ts2
    private final String zab;

    @KeepForSdk
    public static class Builder {
        @ts2
        private String zaa;

        private Builder() {
        }

        public /* synthetic */ Builder(zaac zaac) {
        }

        @mr2
        @KeepForSdk
        public TelemetryLoggingOptions build() {
            return new TelemetryLoggingOptions(this.zaa, (zaad) null);
        }

        @mr2
        @KeepForSdk
        @C7277xt
        public Builder setApi(@ts2 String str) {
            this.zaa = str;
            return this;
        }
    }

    public /* synthetic */ TelemetryLoggingOptions(String str, zaad zaad) {
        this.zab = str;
    }

    @mr2
    @KeepForSdk
    public static Builder builder() {
        return new Builder((zaac) null);
    }

    public final boolean equals(@ts2 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TelemetryLoggingOptions)) {
            return false;
        }
        return Objects.equal(this.zab, ((TelemetryLoggingOptions) obj).zab);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zab);
    }

    @mr2
    public final Bundle zaa() {
        Bundle bundle = new Bundle();
        String str = this.zab;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }
}
