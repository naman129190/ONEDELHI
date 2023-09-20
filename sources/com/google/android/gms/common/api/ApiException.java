package com.google.android.gms.common.api;

import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

public class ApiException extends Exception {
    @mr2
    @Deprecated
    public final Status mStatus;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ApiException(@com.onedelhi.secure.mr2 com.google.android.gms.common.api.Status r4) {
        /*
            r3 = this;
            int r0 = r4.getStatusCode()
            java.lang.String r1 = r4.getStatusMessage()
            if (r1 == 0) goto L_0x000f
            java.lang.String r1 = r4.getStatusMessage()
            goto L_0x0011
        L_0x000f:
            java.lang.String r1 = ""
        L_0x0011:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r3.<init>(r0)
            r3.mStatus = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.ApiException.<init>(com.google.android.gms.common.api.Status):void");
    }

    @mr2
    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.getStatusCode();
    }

    @ts2
    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.getStatusMessage();
    }
}
