package com.onedelhi.secure;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import okhttp3.Protocol;
import okhttp3.Response;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/r34;", "", "", "toString", "Lokhttp3/Protocol;", "protocol", "", "code", "message", "<init>", "(Lokhttp3/Protocol;ILjava/lang/String;)V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class r34 {

    /* renamed from: a */
    public static final C6635a f34483a = new C6635a((wg0) null);

    /* renamed from: b */
    public static final int f34484b = 307;

    /* renamed from: c */
    public static final int f34485c = 308;

    /* renamed from: d */
    public static final int f34486d = 421;

    /* renamed from: e */
    public static final int f34487e = 100;
    @rw1

    /* renamed from: a */
    public final int f34488a;
    @rw1
    @vr2

    /* renamed from: a */
    public final String f34489a;
    @rw1
    @vr2

    /* renamed from: a */
    public final Protocol f34490a;

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/onedelhi/secure/r34$a;", "", "Lokhttp3/Response;", "response", "Lcom/onedelhi/secure/r34;", "a", "", "statusLine", "b", "", "HTTP_CONTINUE", "I", "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.r34$a */
    public static final class C6635a {
        public C6635a() {
        }

        public /* synthetic */ C6635a(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final r34 mo43805a(@vr2 Response response) {
            jt1.m53777p(response, "response");
            return new r34(response.protocol(), response.code(), response.message());
        }

        @vr2
        /* renamed from: b */
        public final r34 mo43806b(@vr2 String str) throws IOException {
            Protocol protocol;
            String str2;
            jt1.m53777p(str, "statusLine");
            int i = 9;
            if (t54.m65466u2(str, "HTTP/1.", false, 2, (Object) null)) {
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else if (charAt == 1) {
                    protocol = Protocol.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else if (t54.m65466u2(str, "ICY ", false, 2, (Object) null)) {
                protocol = Protocol.HTTP_1_0;
                i = 4;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int i2 = i + 3;
            if (str.length() >= i2) {
                try {
                    String substring = str.substring(i, i2);
                    jt1.m53776o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i2) {
                        str2 = "";
                    } else if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                        jt1.m53776o(str2, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    return new r34(protocol, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }
    }

    public r34(@vr2 Protocol protocol, int i, @vr2 String str) {
        jt1.m53777p(protocol, "protocol");
        jt1.m53777p(str, "message");
        this.f34490a = protocol;
        this.f34488a = i;
        this.f34489a = str;
    }

    @vr2
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f34490a == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f34488a);
        sb.append(' ');
        sb.append(this.f34489a);
        String sb2 = sb.toString();
        jt1.m53776o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
