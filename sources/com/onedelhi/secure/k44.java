package com.onedelhi.secure;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/onedelhi/secure/k44;", "Ljava/io/IOException;", "Lcom/onedelhi/secure/hv0;", "errorCode", "<init>", "(Lcom/onedelhi/secure/hv0;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class k44 extends IOException {
    @rw1
    @vr2

    /* renamed from: a */
    public final hv0 f31102a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k44(@vr2 hv0 hv0) {
        super("stream was reset: " + hv0);
        jt1.m53777p(hv0, "errorCode");
        this.f31102a = hv0;
    }
}
