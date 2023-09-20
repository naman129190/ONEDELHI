package com.onedelhi.secure;

import kotlin.Metadata;
import okhttp3.Headers;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/xk1;", "", "", "c", "Lokhttp3/Headers;", "b", "Lcom/onedelhi/secure/to;", "source", "Lcom/onedelhi/secure/to;", "a", "()Lcom/onedelhi/secure/to;", "<init>", "(Lcom/onedelhi/secure/to;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class xk1 {

    /* renamed from: a */
    public static final int f37524a = 262144;

    /* renamed from: a */
    public static final C7269a f37525a = new C7269a((wg0) null);

    /* renamed from: a */
    public long f37526a = ((long) 262144);
    @vr2

    /* renamed from: a */
    public final C6893to f37527a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/onedelhi/secure/xk1$a;", "", "", "HEADER_LIMIT", "I", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.xk1$a */
    public static final class C7269a {
        public C7269a() {
        }

        public /* synthetic */ C7269a(wg0 wg0) {
            this();
        }
    }

    public xk1(@vr2 C6893to toVar) {
        jt1.m53777p(toVar, "source");
        this.f37527a = toVar;
    }

    @vr2
    /* renamed from: a */
    public final C6893to mo47341a() {
        return this.f37527a;
    }

    @vr2
    /* renamed from: b */
    public final Headers mo47342b() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String c = mo47343c();
            if (c.length() == 0) {
                return builder.build();
            }
            builder.addLenient$okhttp(c);
        }
    }

    @vr2
    /* renamed from: c */
    public final String mo47343c() {
        String X0 = this.f37527a.mo31678X0(this.f37526a);
        this.f37526a -= (long) X0.length();
        return X0;
    }
}
