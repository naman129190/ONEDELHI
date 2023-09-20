package com.onedelhi.secure;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.onedelhi.secure.c73;

public final class ma5 extends AsyncTask {

    /* renamed from: a */
    public final /* synthetic */ Context f16002a;

    /* renamed from: a */
    public final /* synthetic */ c73.C1861a f16003a;

    public ma5(Context context, c73.C1861a aVar) {
        this.f16002a = context;
        this.f16003a = aVar;
    }

    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        int i;
        Void[] voidArr = (Void[]) objArr;
        try {
            c73.m12376a(this.f16002a);
            i = 0;
        } catch (GooglePlayServicesRepairableException e) {
            i = e.getConnectionStatusCode();
        } catch (GooglePlayServicesNotAvailableException e2) {
            i = e2.errorCode;
        }
        return Integer.valueOf(i);
    }

    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.f16003a.mo14051a();
            return;
        }
        this.f16003a.mo14052b(num.intValue(), c73.f10181a.getErrorResolutionIntent(this.f16002a, num.intValue(), "pi"));
    }
}
