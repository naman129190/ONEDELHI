package com.onedelhi.secure;

import android.os.Bundle;
import android.util.Log;

public abstract class ex6<T> {

    /* renamed from: a */
    public final int f11758a;

    /* renamed from: a */
    public final Bundle f11759a;

    /* renamed from: a */
    public final x94<T> f11760a = new x94<>();

    /* renamed from: b */
    public final int f11761b;

    public ex6(int i, int i2, Bundle bundle) {
        this.f11758a = i;
        this.f11761b = i2;
        this.f11759a = bundle;
    }

    /* renamed from: a */
    public abstract void mo15650a(Bundle bundle);

    /* renamed from: b */
    public abstract boolean mo15651b();

    /* renamed from: c */
    public final void mo15652c(wy6 wy6) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(wy6);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f11760a.mo26836b(wy6);
    }

    /* renamed from: d */
    public final void mo15653d(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f11760a.mo26837c(t);
    }

    public final String toString() {
        int i = this.f11761b;
        int i2 = this.f11758a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(mo15651b());
        sb.append("}");
        return sb.toString();
    }
}
