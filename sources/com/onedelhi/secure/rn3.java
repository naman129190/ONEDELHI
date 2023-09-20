package com.onedelhi.secure;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R$\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038\u0006@BX\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/rn3;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/io/IOException;", "e", "Lcom/onedelhi/secure/un4;", "a", "<set-?>", "lastConnectException", "Ljava/io/IOException;", "c", "()Ljava/io/IOException;", "firstConnectException", "b", "<init>", "(Ljava/io/IOException;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class rn3 extends RuntimeException {
    @vr2

    /* renamed from: a */
    public IOException f34691a;
    @vr2

    /* renamed from: b */
    public final IOException f34692b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rn3(@vr2 IOException iOException) {
        super(iOException);
        jt1.m53777p(iOException, "firstConnectException");
        this.f34692b = iOException;
        this.f34691a = iOException;
    }

    /* renamed from: a */
    public final void mo43958a(@vr2 IOException iOException) {
        jt1.m53777p(iOException, "e");
        pw0.m61687a(this.f34692b, iOException);
        this.f34691a = iOException;
    }

    @vr2
    /* renamed from: b */
    public final IOException mo43959b() {
        return this.f34692b;
    }

    @vr2
    /* renamed from: c */
    public final IOException mo43960c() {
        return this.f34691a;
    }
}
