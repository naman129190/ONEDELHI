package com.onedelhi.secure;

import java.net.HttpURLConnection;

public final /* synthetic */ class g50 implements r64 {

    /* renamed from: a */
    public final /* synthetic */ HttpURLConnection f28946a;

    public /* synthetic */ g50(HttpURLConnection httpURLConnection) {
        this.f28946a = httpURLConnection;
    }

    public final w94 then(Object obj) {
        return this.f28946a.setRequestProperty("X-Goog-Firebase-Installations-Auth", ((kr1) obj).mo39411b());
    }
}
