package com.onedelhi.secure;

import com.google.android.gms.common.internal.ImagesContract;
import com.onedelhi.secure.do3;
import java.io.IOException;
import kotlin.Metadata;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Route;

@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rJ8\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0002J0\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\fH\u0002J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002R\u001a\u0010\u001d\u001a\u00020\u001c8\u0000X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006)"}, d2 = {"Lcom/onedelhi/secure/sw0;", "", "Lokhttp3/OkHttpClient;", "client", "Lcom/onedelhi/secure/hg3;", "chain", "Lcom/onedelhi/secure/rw0;", "a", "Ljava/io/IOException;", "e", "Lcom/onedelhi/secure/un4;", "h", "", "Lokhttp3/HttpUrl;", "url", "g", "", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "connectionRetryEnabled", "doExtensiveHealthChecks", "Lcom/onedelhi/secure/eg3;", "c", "b", "Lokhttp3/Route;", "f", "Lokhttp3/Address;", "address", "Lokhttp3/Address;", "d", "()Lokhttp3/Address;", "Lcom/onedelhi/secure/gg3;", "connectionPool", "Lcom/onedelhi/secure/dg3;", "call", "Lokhttp3/EventListener;", "eventListener", "<init>", "(Lcom/onedelhi/secure/gg3;Lokhttp3/Address;Lcom/onedelhi/secure/dg3;Lokhttp3/EventListener;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class sw0 {

    /* renamed from: a */
    public int f35214a;

    /* renamed from: a */
    public final dg3 f35215a;

    /* renamed from: a */
    public do3.C5050b f35216a;

    /* renamed from: a */
    public do3 f35217a;

    /* renamed from: a */
    public final gg3 f35218a;
    @vr2

    /* renamed from: a */
    public final Address f35219a;

    /* renamed from: a */
    public final EventListener f35220a;

    /* renamed from: a */
    public Route f35221a;

    /* renamed from: b */
    public int f35222b;

    /* renamed from: c */
    public int f35223c;

    public sw0(@vr2 gg3 gg3, @vr2 Address address, @vr2 dg3 dg3, @vr2 EventListener eventListener) {
        jt1.m53777p(gg3, "connectionPool");
        jt1.m53777p(address, "address");
        jt1.m53777p(dg3, es2.f11366Q);
        jt1.m53777p(eventListener, "eventListener");
        this.f35218a = gg3;
        this.f35219a = address;
        this.f35215a = dg3;
        this.f35220a = eventListener;
    }

    @vr2
    /* renamed from: a */
    public final rw0 mo44573a(@vr2 OkHttpClient okHttpClient, @vr2 hg3 hg3) {
        jt1.m53777p(okHttpClient, "client");
        jt1.m53777p(hg3, "chain");
        try {
            return mo44575c(hg3.mo37314d(), hg3.mo37316f(), hg3.mo37318h(), okHttpClient.pingIntervalMillis(), okHttpClient.retryOnConnectionFailure(), !jt1.m53768g(hg3.mo37317g().method(), "GET")).mo35273z(okHttpClient, hg3);
        } catch (rn3 e) {
            mo44580h(e.mo43960c());
            throw e;
        } catch (IOException e2) {
            mo44580h(e2);
            throw new rn3(e2);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.eg3 mo44574b(int r15, int r16, int r17, int r18, boolean r19) throws java.io.IOException {
        /*
            r14 = this;
            r1 = r14
            com.onedelhi.secure.dg3 r0 = r1.f35215a
            boolean r0 = r0.isCanceled()
            if (r0 != 0) goto L_0x0162
            com.onedelhi.secure.dg3 r0 = r1.f35215a
            com.onedelhi.secure.eg3 r2 = r0.mo34432k()
            r0 = 1
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0064
            monitor-enter(r2)
            boolean r5 = r2.mo35266t()     // Catch:{ all -> 0x0061 }
            if (r5 != 0) goto L_0x0030
            okhttp3.Route r5 = r2.route()     // Catch:{ all -> 0x0061 }
            okhttp3.Address r5 = r5.address()     // Catch:{ all -> 0x0061 }
            okhttp3.HttpUrl r5 = r5.url()     // Catch:{ all -> 0x0061 }
            boolean r5 = r14.mo44579g(r5)     // Catch:{ all -> 0x0061 }
            if (r5 != 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r5 = r4
            goto L_0x0036
        L_0x0030:
            com.onedelhi.secure.dg3 r5 = r1.f35215a     // Catch:{ all -> 0x0061 }
            java.net.Socket r5 = r5.mo34445v()     // Catch:{ all -> 0x0061 }
        L_0x0036:
            com.onedelhi.secure.un4 r6 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0061 }
            monitor-exit(r2)
            com.onedelhi.secure.dg3 r6 = r1.f35215a
            com.onedelhi.secure.eg3 r6 = r6.mo34432k()
            if (r6 == 0) goto L_0x0054
            if (r5 != 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            if (r0 == 0) goto L_0x0048
            return r2
        L_0x0048:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0054:
            if (r5 == 0) goto L_0x0059
            com.onedelhi.secure.nq4.m58714n(r5)
        L_0x0059:
            okhttp3.EventListener r5 = r1.f35220a
            com.onedelhi.secure.dg3 r6 = r1.f35215a
            r5.connectionReleased(r6, r2)
            goto L_0x0064
        L_0x0061:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0064:
            r1.f35214a = r3
            r1.f35222b = r3
            r1.f35223c = r3
            com.onedelhi.secure.gg3 r2 = r1.f35218a
            okhttp3.Address r5 = r1.f35219a
            com.onedelhi.secure.dg3 r6 = r1.f35215a
            boolean r2 = r2.mo36732a(r5, r6, r4, r3)
            if (r2 == 0) goto L_0x0087
        L_0x0076:
            com.onedelhi.secure.dg3 r0 = r1.f35215a
            com.onedelhi.secure.eg3 r0 = r0.mo34432k()
            com.onedelhi.secure.jt1.m53774m(r0)
        L_0x007f:
            okhttp3.EventListener r2 = r1.f35220a
            com.onedelhi.secure.dg3 r3 = r1.f35215a
            r2.connectionAcquired(r3, r0)
            return r0
        L_0x0087:
            okhttp3.Route r2 = r1.f35221a
            if (r2 == 0) goto L_0x0092
            com.onedelhi.secure.jt1.m53774m(r2)
            r1.f35221a = r4
        L_0x0090:
            r5 = r4
            goto L_0x00e7
        L_0x0092:
            com.onedelhi.secure.do3$b r2 = r1.f35216a
            if (r2 == 0) goto L_0x00a9
            com.onedelhi.secure.jt1.m53774m(r2)
            boolean r2 = r2.mo34603b()
            if (r2 == 0) goto L_0x00a9
            com.onedelhi.secure.do3$b r2 = r1.f35216a
            com.onedelhi.secure.jt1.m53774m(r2)
            okhttp3.Route r2 = r2.mo34604c()
            goto L_0x0090
        L_0x00a9:
            com.onedelhi.secure.do3 r2 = r1.f35217a
            if (r2 != 0) goto L_0x00c4
            com.onedelhi.secure.do3 r2 = new com.onedelhi.secure.do3
            okhttp3.Address r5 = r1.f35219a
            com.onedelhi.secure.dg3 r6 = r1.f35215a
            okhttp3.OkHttpClient r6 = r6.mo34431j()
            com.onedelhi.secure.pn3 r6 = r6.getRouteDatabase()
            com.onedelhi.secure.dg3 r7 = r1.f35215a
            okhttp3.EventListener r8 = r1.f35220a
            r2.<init>(r5, r6, r7, r8)
            r1.f35217a = r2
        L_0x00c4:
            com.onedelhi.secure.do3$b r2 = r2.mo34597d()
            r1.f35216a = r2
            java.util.List r5 = r2.mo34602a()
            com.onedelhi.secure.dg3 r6 = r1.f35215a
            boolean r6 = r6.isCanceled()
            if (r6 != 0) goto L_0x015a
            com.onedelhi.secure.gg3 r6 = r1.f35218a
            okhttp3.Address r7 = r1.f35219a
            com.onedelhi.secure.dg3 r8 = r1.f35215a
            boolean r3 = r6.mo36732a(r7, r8, r5, r3)
            if (r3 == 0) goto L_0x00e3
            goto L_0x0076
        L_0x00e3:
            okhttp3.Route r2 = r2.mo34604c()
        L_0x00e7:
            com.onedelhi.secure.eg3 r3 = new com.onedelhi.secure.eg3
            com.onedelhi.secure.gg3 r6 = r1.f35218a
            r3.<init>(r6, r2)
            com.onedelhi.secure.dg3 r6 = r1.f35215a
            r6.mo34447x(r3)
            com.onedelhi.secure.dg3 r12 = r1.f35215a     // Catch:{ all -> 0x0153 }
            okhttp3.EventListener r13 = r1.f35220a     // Catch:{ all -> 0x0153 }
            r6 = r3
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            r6.mo35252i(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0153 }
            com.onedelhi.secure.dg3 r6 = r1.f35215a
            r6.mo34447x(r4)
            com.onedelhi.secure.dg3 r4 = r1.f35215a
            okhttp3.OkHttpClient r4 = r4.mo34431j()
            com.onedelhi.secure.pn3 r4 = r4.getRouteDatabase()
            okhttp3.Route r6 = r3.route()
            r4.mo42830a(r6)
            com.onedelhi.secure.gg3 r4 = r1.f35218a
            okhttp3.Address r6 = r1.f35219a
            com.onedelhi.secure.dg3 r7 = r1.f35215a
            boolean r0 = r4.mo36732a(r6, r7, r5, r0)
            if (r0 == 0) goto L_0x013a
            com.onedelhi.secure.dg3 r0 = r1.f35215a
            com.onedelhi.secure.eg3 r0 = r0.mo34432k()
            com.onedelhi.secure.jt1.m53774m(r0)
            r1.f35221a = r2
            java.net.Socket r2 = r3.socket()
            com.onedelhi.secure.nq4.m58714n(r2)
            goto L_0x007f
        L_0x013a:
            monitor-enter(r3)
            com.onedelhi.secure.gg3 r0 = r1.f35218a     // Catch:{ all -> 0x0150 }
            r0.mo36739h(r3)     // Catch:{ all -> 0x0150 }
            com.onedelhi.secure.dg3 r0 = r1.f35215a     // Catch:{ all -> 0x0150 }
            r0.mo34418c(r3)     // Catch:{ all -> 0x0150 }
            com.onedelhi.secure.un4 r0 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0150 }
            monitor-exit(r3)
            okhttp3.EventListener r0 = r1.f35220a
            com.onedelhi.secure.dg3 r2 = r1.f35215a
            r0.connectionAcquired(r2, r3)
            return r3
        L_0x0150:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0153:
            r0 = move-exception
            com.onedelhi.secure.dg3 r2 = r1.f35215a
            r2.mo34447x(r4)
            throw r0
        L_0x015a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x0162:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.sw0.mo44574b(int, int, int, int, boolean):com.onedelhi.secure.eg3");
    }

    /* renamed from: c */
    public final eg3 mo44575c(int i, int i2, int i3, int i4, boolean z, boolean z2) throws IOException {
        while (true) {
            eg3 b = mo44574b(i, i2, i3, i4, z);
            if (b.mo35271x(z2)) {
                return b;
            }
            b.mo35241C();
            if (this.f35221a == null) {
                do3.C5050b bVar = this.f35216a;
                boolean z3 = true;
                if (!(bVar != null ? bVar.mo34603b() : true)) {
                    do3 do3 = this.f35217a;
                    if (do3 != null) {
                        z3 = do3.mo34595b();
                    }
                    if (!z3) {
                        throw new IOException("exhausted all routes");
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @vr2
    /* renamed from: d */
    public final Address mo44576d() {
        return this.f35219a;
    }

    /* renamed from: e */
    public final boolean mo44577e() {
        do3 do3;
        if (this.f35214a == 0 && this.f35222b == 0 && this.f35223c == 0) {
            return false;
        }
        if (this.f35221a != null) {
            return true;
        }
        Route f = mo44578f();
        if (f != null) {
            this.f35221a = f;
            return true;
        }
        do3.C5050b bVar = this.f35216a;
        if ((bVar == null || !bVar.mo34603b()) && (do3 = this.f35217a) != null) {
            return do3.mo34595b();
        }
        return true;
    }

    /* renamed from: f */
    public final Route mo44578f() {
        eg3 k;
        if (this.f35214a > 1 || this.f35222b > 1 || this.f35223c > 0 || (k = this.f35215a.mo34432k()) == null) {
            return null;
        }
        synchronized (k) {
            if (k.mo35268u() != 0) {
                return null;
            }
            if (!nq4.m58705i(k.route().address().url(), this.f35219a.url())) {
                return null;
            }
            Route route = k.route();
            return route;
        }
    }

    /* renamed from: g */
    public final boolean mo44579g(@vr2 HttpUrl httpUrl) {
        jt1.m53777p(httpUrl, ImagesContract.URL);
        HttpUrl url = this.f35219a.url();
        return httpUrl.port() == url.port() && jt1.m53768g(httpUrl.host(), url.host());
    }

    /* renamed from: h */
    public final void mo44580h(@vr2 IOException iOException) {
        jt1.m53777p(iOException, "e");
        this.f35221a = null;
        if ((iOException instanceof k44) && ((k44) iOException).f31102a == hv0.REFUSED_STREAM) {
            this.f35214a++;
        } else if (iOException instanceof u50) {
            this.f35222b++;
        } else {
            this.f35223c++;
        }
    }
}
