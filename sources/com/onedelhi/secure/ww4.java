package com.onedelhi.secure;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.Headers;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001:\u0001\u0005BG\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003JP\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u001c"}, d2 = {"Lcom/onedelhi/secure/ww4;", "", "", "clientOriginated", "i", "a", "", "b", "()Ljava/lang/Integer;", "c", "d", "e", "f", "perMessageDeflate", "clientMaxWindowBits", "clientNoContextTakeover", "serverMaxWindowBits", "serverNoContextTakeover", "unknownValues", "g", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)Lcom/onedelhi/secure/ww4;", "", "toString", "hashCode", "other", "equals", "<init>", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class ww4 {

    /* renamed from: a */
    public static final C7192a f37153a = new C7192a((wg0) null);

    /* renamed from: a */
    public static final String f37154a = "Sec-WebSocket-Extensions";
    @rw1
    @ss2

    /* renamed from: a */
    public final Integer f37155a;
    @rw1

    /* renamed from: a */
    public final boolean f37156a;
    @rw1
    @ss2

    /* renamed from: b */
    public final Integer f37157b;
    @rw1

    /* renamed from: b */
    public final boolean f37158b;
    @rw1

    /* renamed from: c */
    public final boolean f37159c;
    @rw1

    /* renamed from: d */
    public final boolean f37160d;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/ww4$a;", "", "Lokhttp3/Headers;", "responseHeaders", "Lcom/onedelhi/secure/ww4;", "a", "", "HEADER_WEB_SOCKET_EXTENSION", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.ww4$a */
    public static final class C7192a {
        public C7192a() {
        }

        public /* synthetic */ C7192a(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final ww4 mo46914a(@vr2 Headers headers) throws IOException {
            Headers headers2 = headers;
            jt1.m53777p(headers2, "responseHeaders");
            int size = headers.size();
            boolean z = false;
            Integer num = null;
            boolean z2 = false;
            Integer num2 = null;
            boolean z3 = false;
            boolean z4 = false;
            for (int i = 0; i < size; i++) {
                if (t54.m65410K1(headers2.name(i), ww4.f37154a, true)) {
                    String value = headers2.value(i);
                    int i2 = 0;
                    while (i2 < value.length()) {
                        int r = nq4.m58718r(value, ',', i2, 0, 4, (Object) null);
                        int p = nq4.m58716p(value, ';', i2, r);
                        String h0 = nq4.m58704h0(value, i2, p);
                        int i3 = p + 1;
                        if (t54.m65410K1(h0, "permessage-deflate", true)) {
                            if (z) {
                                z4 = true;
                            }
                            while (i3 < r) {
                                int p2 = nq4.m58716p(value, ';', i3, r);
                                int p3 = nq4.m58716p(value, '=', i3, p2);
                                String h02 = nq4.m58704h0(value, i3, p3);
                                String l4 = p3 < p2 ? u54.m66652l4(nq4.m58704h0(value, p3 + 1, p2), "\"") : null;
                                int i4 = p2 + 1;
                                if (t54.m65410K1(h02, "client_max_window_bits", true)) {
                                    if (num != null) {
                                        z4 = true;
                                    }
                                    num = l4 != null ? s54.m64206X0(l4) : null;
                                    if (num != null) {
                                        i3 = i4;
                                    }
                                } else {
                                    if (t54.m65410K1(h02, "client_no_context_takeover", true)) {
                                        if (z2) {
                                            z4 = true;
                                        }
                                        if (l4 != null) {
                                            z4 = true;
                                        }
                                        z2 = true;
                                    } else if (t54.m65410K1(h02, "server_max_window_bits", true)) {
                                        if (num2 != null) {
                                            z4 = true;
                                        }
                                        num2 = l4 != null ? s54.m64206X0(l4) : null;
                                        if (num2 != null) {
                                        }
                                    } else if (t54.m65410K1(h02, "server_no_context_takeover", true)) {
                                        if (z3) {
                                            z4 = true;
                                        }
                                        if (l4 != null) {
                                            z4 = true;
                                        }
                                        z3 = true;
                                    }
                                    i3 = i4;
                                }
                                z4 = true;
                                i3 = i4;
                            }
                            i2 = i3;
                            z = true;
                        } else {
                            i2 = i3;
                            z4 = true;
                        }
                    }
                }
            }
            return new ww4(z, num, z2, num2, z3, z4);
        }
    }

    public ww4() {
        this(false, (Integer) null, false, (Integer) null, false, false, 63, (wg0) null);
    }

    public ww4(boolean z, @ss2 Integer num, boolean z2, @ss2 Integer num2, boolean z3, boolean z4) {
        this.f37156a = z;
        this.f37155a = num;
        this.f37158b = z2;
        this.f37157b = num2;
        this.f37159c = z3;
        this.f37160d = z4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ww4(boolean r6, java.lang.Integer r7, boolean r8, java.lang.Integer r9, boolean r10, boolean r11, int r12, com.onedelhi.secure.wg0 r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = 0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            r1 = 0
            if (r6 == 0) goto L_0x000f
            r2 = r1
            goto L_0x0010
        L_0x000f:
            r2 = r7
        L_0x0010:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0016
            r3 = 0
            goto L_0x0017
        L_0x0016:
            r3 = r8
        L_0x0017:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r1 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = 0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = 0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r2
            r9 = r3
            r10 = r1
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ww4.<init>(boolean, java.lang.Integer, boolean, java.lang.Integer, boolean, boolean, int, com.onedelhi.secure.wg0):void");
    }

    /* renamed from: h */
    public static /* synthetic */ ww4 m69682h(ww4 ww4, boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ww4.f37156a;
        }
        if ((i & 2) != 0) {
            num = ww4.f37155a;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            z2 = ww4.f37158b;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            num2 = ww4.f37157b;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            z3 = ww4.f37159c;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            z4 = ww4.f37160d;
        }
        return ww4.mo46910g(z, num3, z5, num4, z6, z4);
    }

    /* renamed from: a */
    public final boolean mo46903a() {
        return this.f37156a;
    }

    @ss2
    /* renamed from: b */
    public final Integer mo46904b() {
        return this.f37155a;
    }

    /* renamed from: c */
    public final boolean mo46905c() {
        return this.f37158b;
    }

    @ss2
    /* renamed from: d */
    public final Integer mo46906d() {
        return this.f37157b;
    }

    /* renamed from: e */
    public final boolean mo46907e() {
        return this.f37159c;
    }

    public boolean equals(@ss2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww4)) {
            return false;
        }
        ww4 ww4 = (ww4) obj;
        return this.f37156a == ww4.f37156a && jt1.m53768g(this.f37155a, ww4.f37155a) && this.f37158b == ww4.f37158b && jt1.m53768g(this.f37157b, ww4.f37157b) && this.f37159c == ww4.f37159c && this.f37160d == ww4.f37160d;
    }

    /* renamed from: f */
    public final boolean mo46909f() {
        return this.f37160d;
    }

    @vr2
    /* renamed from: g */
    public final ww4 mo46910g(boolean z, @ss2 Integer num, boolean z2, @ss2 Integer num2, boolean z3, boolean z4) {
        return new ww4(z, num, z2, num2, z3, z4);
    }

    public int hashCode() {
        boolean z = this.f37156a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        Integer num = this.f37155a;
        int i2 = 0;
        int hashCode = (i + (num != null ? num.hashCode() : 0)) * 31;
        boolean z3 = this.f37158b;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode + (z3 ? 1 : 0)) * 31;
        Integer num2 = this.f37157b;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        int i4 = (i3 + i2) * 31;
        boolean z4 = this.f37159c;
        if (z4) {
            z4 = true;
        }
        int i5 = (i4 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f37160d;
        if (!z5) {
            z2 = z5;
        }
        return i5 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo46912i(boolean z) {
        return z ? this.f37158b : this.f37159c;
    }

    @vr2
    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f37156a + ", clientMaxWindowBits=" + this.f37155a + ", clientNoContextTakeover=" + this.f37158b + ", serverMaxWindowBits=" + this.f37157b + ", serverNoContextTakeover=" + this.f37159c + ", unknownValues=" + this.f37160d + pl2.f33727d;
    }
}
