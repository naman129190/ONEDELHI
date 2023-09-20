package com.onedelhi.secure;

import com.google.android.gms.common.internal.ImagesContract;
import com.onedelhi.secure.C5301fr;
import com.onedelhi.secure.q51;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\n\u001a\u00020\t*\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u0006H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u001a\u0010\u0016\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\u000b*\u00020\u0017\u001a\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0017H\u0007¨\u0006\u001b"}, d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lokhttp3/Challenge;", "b", "Lcom/onedelhi/secure/no;", "", "result", "Lcom/onedelhi/secure/un4;", "d", "", "h", "", "prefix", "i", "e", "f", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "headers", "g", "Lokhttp3/Response;", "c", "response", "a", "okhttp"}, k = 2, mv = {1, 4, 0})
@uw1(name = "HttpHeaders")
public final class om1 {

    /* renamed from: a */
    public static final C5301fr f33086a;

    /* renamed from: b */
    public static final C5301fr f33087b;

    static {
        C5301fr.C5302a aVar = C5301fr.f28633a;
        f33086a = aVar.mo36296l("\"\\");
        f33087b = aVar.mo36296l("\t ,=");
    }

    @xj0(level = ak0.ERROR, message = "No longer supported", replaceWith = @oi3(expression = "response.promisesBody()", imports = {}))
    /* renamed from: a */
    public static final boolean m59472a(@vr2 Response response) {
        jt1.m53777p(response, "response");
        return m59474c(response);
    }

    @vr2
    /* renamed from: b */
    public static final List<Challenge> m59473b(@vr2 Headers headers, @vr2 String str) {
        jt1.m53777p(headers, "$this$parseChallenges");
        jt1.m53777p(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if (t54.m65410K1(str, headers.name(i), true)) {
                try {
                    m59475d(new C6205no().mo41279n(headers.value(i)), arrayList);
                } catch (EOFException e) {
                    k23.f31087a.mo39034g().mo39026m("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static final boolean m59474c(@vr2 Response response) {
        jt1.m53777p(response, "$this$promisesBody");
        if (jt1.m53768g(response.request().method(), q51.C6513a.f34004x)) {
            return false;
        }
        int code = response.code();
        return (((code >= 100 && code < 200) || code == 204 || code == 304) && nq4.m58724x(response) == -1 && !t54.m65410K1("chunked", Response.header$default(response, "Transfer-Encoding", (String) null, 2, (Object) null), true)) ? false : true;
    }

    /* renamed from: d */
    public static final void m59475d(C6205no noVar, List<Challenge> list) throws EOFException {
        String f;
        int T;
        while (true) {
            String str = null;
            while (true) {
                if (str == null) {
                    m59479h(noVar);
                    str = m59477f(noVar);
                    if (str == null) {
                        return;
                    }
                }
                boolean h = m59479h(noVar);
                f = m59477f(noVar);
                if (f != null) {
                    byte b = (byte) 61;
                    T = nq4.m58682T(noVar, b);
                    boolean h2 = m59479h(noVar);
                    if (h || (!h2 && !noVar.mo31685f2())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int T2 = T + nq4.m58682T(noVar, b);
                        while (true) {
                            if (f == null) {
                                f = m59477f(noVar);
                                if (m59479h(noVar)) {
                                    continue;
                                    break;
                                }
                                T2 = nq4.m58682T(noVar, b);
                            }
                            if (T2 == 0) {
                                continue;
                                break;
                            } else if (T2 <= 1 && !m59479h(noVar)) {
                                String e = m59480i(noVar, (byte) 34) ? m59476e(noVar) : m59477f(noVar);
                                if (e != null && ((String) linkedHashMap.put(f, e)) == null) {
                                    if (m59479h(noVar) || noVar.mo31685f2()) {
                                        f = null;
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list.add(new Challenge(str, (Map<String, String>) linkedHashMap));
                        str = f;
                    }
                } else if (noVar.mo31685f2()) {
                    list.add(new Challenge(str, (Map<String, String>) id2.m52156z()));
                    return;
                } else {
                    return;
                }
            }
            Map singletonMap = Collections.singletonMap((Object) null, f + t54.m65438g2(a13.f25713a, T));
            jt1.m53776o(singletonMap, "Collections.singletonMap…ek + \"=\".repeat(eqCount))");
            list.add(new Challenge(str, (Map<String, String>) singletonMap));
        }
    }

    /* renamed from: e */
    public static final String m59476e(C6205no noVar) throws EOFException {
        byte b = (byte) 34;
        if (noVar.readByte() == b) {
            C6205no noVar2 = new C6205no();
            while (true) {
                long q1 = noVar.mo31695q1(f33086a);
                if (q1 == -1) {
                    return null;
                }
                if (noVar.mo41249Z(q1) == b) {
                    noVar2.write(noVar, q1);
                    noVar.readByte();
                    return noVar2.mo31688j();
                } else if (noVar.mo41244V0() == q1 + 1) {
                    return null;
                } else {
                    noVar2.write(noVar, q1);
                    noVar.readByte();
                    noVar2.write(noVar, 1);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: f */
    public static final String m59477f(C6205no noVar) {
        long q1 = noVar.mo31695q1(f33087b);
        if (q1 == -1) {
            q1 = noVar.mo41244V0();
        }
        if (q1 != 0) {
            return noVar.mo31698r1(q1);
        }
        return null;
    }

    /* renamed from: g */
    public static final void m59478g(@vr2 CookieJar cookieJar, @vr2 HttpUrl httpUrl, @vr2 Headers headers) {
        jt1.m53777p(cookieJar, "$this$receiveHeaders");
        jt1.m53777p(httpUrl, ImagesContract.URL);
        jt1.m53777p(headers, "headers");
        if (cookieJar != CookieJar.NO_COOKIES) {
            List<Cookie> parseAll = Cookie.Companion.parseAll(httpUrl, headers);
            if (!parseAll.isEmpty()) {
                cookieJar.saveFromResponse(httpUrl, parseAll);
            }
        }
    }

    /* renamed from: h */
    public static final boolean m59479h(C6205no noVar) {
        boolean z = false;
        while (!noVar.mo31685f2()) {
            byte Z = noVar.mo41249Z(0);
            if (Z == 9 || Z == 32) {
                noVar.readByte();
            } else if (Z != 44) {
                break;
            } else {
                noVar.readByte();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: i */
    public static final boolean m59480i(C6205no noVar, byte b) {
        return !noVar.mo31685f2() && noVar.mo41249Z(0) == b;
    }
}
