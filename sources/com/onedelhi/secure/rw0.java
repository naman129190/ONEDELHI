package com.onedelhi.secure;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\bH&J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0016\u001a\u00020\u0015H&J\b\u0010\u0017\u001a\u00020\bH&R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/onedelhi/secure/rw0;", "", "Lokhttp3/Request;", "request", "", "contentLength", "Lcom/onedelhi/secure/oz3;", "f", "Lcom/onedelhi/secure/un4;", "e", "i", "b", "", "expectContinue", "Lokhttp3/Response$Builder;", "g", "Lokhttp3/Response;", "response", "c", "Lcom/onedelhi/secure/x04;", "d", "Lokhttp3/Headers;", "a", "cancel", "Lcom/onedelhi/secure/eg3;", "h", "()Lcom/onedelhi/secure/eg3;", "connection", "okhttp"}, k = 1, mv = {1, 4, 0})
public interface rw0 {

    /* renamed from: a */
    public static final int f34757a = 100;

    /* renamed from: a */
    public static final C6716a f34758a = C6716a.f34760a;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/onedelhi/secure/rw0$a;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.rw0$a */
    public static final class C6716a {

        /* renamed from: a */
        public static final int f34759a = 100;

        /* renamed from: a */
        public static final /* synthetic */ C6716a f34760a = new C6716a();
    }

    @vr2
    /* renamed from: a */
    Headers mo30980a() throws IOException;

    /* renamed from: b */
    void mo30981b() throws IOException;

    /* renamed from: c */
    long mo30982c(@vr2 Response response) throws IOException;

    void cancel();

    @vr2
    /* renamed from: d */
    x04 mo30984d(@vr2 Response response) throws IOException;

    /* renamed from: e */
    void mo30985e(@vr2 Request request) throws IOException;

    @vr2
    /* renamed from: f */
    oz3 mo30986f(@vr2 Request request, long j) throws IOException;

    @ss2
    /* renamed from: g */
    Response.Builder mo30987g(boolean z) throws IOException;

    @vr2
    /* renamed from: h */
    eg3 mo30988h();

    /* renamed from: i */
    void mo30989i() throws IOException;
}
