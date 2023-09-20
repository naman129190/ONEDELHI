package com.onedelhi.secure;

import java.util.Map;

public final /* synthetic */ class vi6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ xi6 f21814a;

    /* renamed from: a */
    public final /* synthetic */ Exception f21815a;

    /* renamed from: a */
    public final /* synthetic */ Map f21816a;

    /* renamed from: a */
    public final /* synthetic */ byte[] f21817a;

    /* renamed from: n */
    public final /* synthetic */ int f21818n;

    public /* synthetic */ vi6(xi6 xi6, int i, Exception exc, byte[] bArr, Map map) {
        this.f21814a = xi6;
        this.f21818n = i;
        this.f21815a = exc;
        this.f21817a = bArr;
        this.f21816a = map;
    }

    public final void run() {
        this.f21814a.mo26955a(this.f21818n, this.f21815a, this.f21817a, this.f21816a);
    }
}
