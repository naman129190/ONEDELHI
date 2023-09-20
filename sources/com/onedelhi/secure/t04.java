package com.onedelhi.secure;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0014¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/t04;", "Lcom/onedelhi/secure/pb;", "Ljava/io/IOException;", "cause", "x", "Lcom/onedelhi/secure/un4;", "B", "Ljava/net/Socket;", "socket", "<init>", "(Ljava/net/Socket;)V", "okio"}, k = 1, mv = {1, 4, 0})
public final class t04 extends C6418pb {

    /* renamed from: a */
    public final Socket f35318a;

    public t04(@vr2 Socket socket) {
        jt1.m53777p(socket, "socket");
        this.f35318a = socket;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.AssertionError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Exception} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34458B() {
        /*
            r5 = this;
            java.lang.String r0 = "Failed to close timed out socket "
            java.net.Socket r1 = r5.f35318a     // Catch:{ Exception -> 0x001c, AssertionError -> 0x0008 }
            r1.close()     // Catch:{ Exception -> 0x001c, AssertionError -> 0x0008 }
            goto L_0x0037
        L_0x0008:
            r1 = move-exception
            boolean r2 = com.onedelhi.secure.gu2.m49836e(r1)
            if (r2 == 0) goto L_0x001b
            java.util.logging.Logger r2 = com.onedelhi.secure.hu2.f29790a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x0028
        L_0x001b:
            throw r1
        L_0x001c:
            r1 = move-exception
            java.util.logging.Logger r2 = com.onedelhi.secure.hu2.f29790a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x0028:
            r4.append(r0)
            java.net.Socket r0 = r5.f35318a
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.log(r3, r0, r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.t04.mo34458B():void");
    }

    @vr2
    /* renamed from: x */
    public IOException mo36132x(@ss2 IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
