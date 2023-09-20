package com.onedelhi.secure;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class s65 implements Runnable {

    /* renamed from: a */
    public static final Logger f20244a = new Logger("RevokeAccessOperation", new String[0]);

    /* renamed from: a */
    public final StatusPendingResult f20245a = new StatusPendingResult((GoogleApiClient) null);

    /* renamed from: b */
    public final String f20246b;

    public s65(String str) {
        this.f20246b = Preconditions.checkNotEmpty(str);
    }

    /* renamed from: a */
    public static PendingResult m27303a(@ts2 String str) {
        if (str == null) {
            return PendingResults.immediateFailedResult(new Status(4), (GoogleApiClient) null);
        }
        s65 s65 = new s65(str);
        new Thread(s65).start();
        return s65.f20245a;
    }

    public final void run() {
        Status status = Status.RESULT_INTERNAL_ERROR;
        try {
            String str = this.f20246b;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.RESULT_SUCCESS;
            } else {
                f20244a.mo10167e("Unable to revoke access!", new Object[0]);
            }
            Logger logger = f20244a;
            logger.mo10165d("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            f20244a.mo10167e("IOException when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]);
        } catch (Exception e2) {
            f20244a.mo10167e("Exception when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]);
        }
        this.f20245a.setResult(status);
    }
}
