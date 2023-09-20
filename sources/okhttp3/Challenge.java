package okhttp3;

import com.onedelhi.secure.ak0;
import com.onedelhi.secure.id2;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.oi3;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.uw1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.xj0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

@ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\u001b\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0002\b\u000eJ\r\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\b\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\u0015J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bR!\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00030\u00078G¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u0004\u0010\rR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\r¨\u0006\u0019"}, mo38105d2 = {"Lokhttp3/Challenge;", "", "scheme", "", "realm", "(Ljava/lang/String;Ljava/lang/String;)V", "authParams", "", "(Ljava/lang/String;Ljava/util/Map;)V", "()Ljava/util/Map;", "charset", "Ljava/nio/charset/Charset;", "()Ljava/nio/charset/Charset;", "()Ljava/lang/String;", "-deprecated_authParams", "-deprecated_charset", "equals", "", "other", "hashCode", "", "-deprecated_realm", "-deprecated_scheme", "toString", "withCharset", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
public final class Challenge {
    @vr2
    private final Map<String, String> authParams;
    @vr2
    private final String scheme;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Challenge(@com.onedelhi.secure.vr2 java.lang.String r2, @com.onedelhi.secure.vr2 java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "scheme"
            com.onedelhi.secure.jt1.m53777p(r2, r0)
            java.lang.String r0 = "realm"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r0 = "singletonMap(\"realm\", realm)"
            com.onedelhi.secure.jt1.m53776o(r3, r0)
            r1.<init>((java.lang.String) r2, (java.util.Map<java.lang.String, java.lang.String>) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Challenge.<init>(java.lang.String, java.lang.String):void");
    }

    public Challenge(@vr2 String str, @vr2 Map<String, String> map) {
        String str2;
        jt1.m53777p(str, "scheme");
        jt1.m53777p(map, "authParams");
        this.scheme = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String str3 = (String) next.getKey();
            String str4 = (String) next.getValue();
            if (str3 != null) {
                Locale locale = Locale.US;
                jt1.m53776o(locale, "US");
                str2 = str3.toLowerCase(locale);
                jt1.m53776o(str2, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, str4);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        jt1.m53776o(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.authParams = unmodifiableMap;
    }

    @uw1(name = "-deprecated_authParams")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "authParams", imports = {}))
    /* renamed from: -deprecated_authParams  reason: not valid java name */
    public final Map<String, String> m74769deprecated_authParams() {
        return this.authParams;
    }

    @uw1(name = "-deprecated_charset")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "charset", imports = {}))
    /* renamed from: -deprecated_charset  reason: not valid java name */
    public final Charset m74770deprecated_charset() {
        return charset();
    }

    @uw1(name = "-deprecated_realm")
    @ss2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "realm", imports = {}))
    /* renamed from: -deprecated_realm  reason: not valid java name */
    public final String m74771deprecated_realm() {
        return realm();
    }

    @uw1(name = "-deprecated_scheme")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "scheme", imports = {}))
    /* renamed from: -deprecated_scheme  reason: not valid java name */
    public final String m74772deprecated_scheme() {
        return this.scheme;
    }

    @uw1(name = "authParams")
    @vr2
    public final Map<String, String> authParams() {
        return this.authParams;
    }

    @uw1(name = "charset")
    @vr2
    public final Charset charset() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                jt1.m53776o(forName, "Charset.forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        jt1.m53776o(charset, "ISO_8859_1");
        return charset;
    }

    public boolean equals(@ss2 Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            return jt1.m53768g(challenge.scheme, this.scheme) && jt1.m53768g(challenge.authParams, this.authParams);
        }
    }

    public int hashCode() {
        return ((899 + this.scheme.hashCode()) * 31) + this.authParams.hashCode();
    }

    @uw1(name = "realm")
    @ss2
    public final String realm() {
        return this.authParams.get("realm");
    }

    @uw1(name = "scheme")
    @vr2
    public final String scheme() {
        return this.scheme;
    }

    @vr2
    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    @vr2
    public final Challenge withCharset(@vr2 Charset charset) {
        jt1.m53777p(charset, "charset");
        Map<String, String> J0 = id2.m52106J0(this.authParams);
        String name = charset.name();
        jt1.m53776o(name, "charset.name()");
        J0.put("charset", name);
        return new Challenge(this.scheme, J0);
    }
}
