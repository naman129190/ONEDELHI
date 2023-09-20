package com.onedelhi.secure;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: com.onedelhi.secure.nr */
public final class C3002nr implements wt0 {

    /* renamed from: a */
    public static final C3002nr f17543a;

    /* renamed from: a */
    public static final Set<hu0> f17544a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new hu0[]{hu0.m16939b("proto"), hu0.m16939b("json")})));

    /* renamed from: b */
    public static final C3002nr f17545b;

    /* renamed from: c */
    public static final String f17546c = "cct";

    /* renamed from: d */
    public static final String f17547d;

    /* renamed from: e */
    public static final String f17548e;

    /* renamed from: f */
    public static final String f17549f;

    /* renamed from: g */
    public static final String f17550g = "1$";

    /* renamed from: h */
    public static final String f17551h = "\\";
    @mr2

    /* renamed from: a */
    public final String f17552a;
    @ts2

    /* renamed from: b */
    public final String f17553b;

    static {
        String a = d54.m12967a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f17547d = a;
        String a2 = d54.m12967a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f17548e = a2;
        String a3 = d54.m12967a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f17549f = a3;
        f17543a = new C3002nr(a, (String) null);
        f17545b = new C3002nr(a2, a3);
    }

    public C3002nr(@mr2 String str, @ts2 String str2) {
        this.f17552a = str;
        this.f17553b = str2;
    }

    @mr2
    /* renamed from: d */
    public static String m23134d(@mr2 byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    @mr2
    /* renamed from: e */
    public static byte[] m23135e(@mr2 String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    @mr2
    /* renamed from: f */
    public static C3002nr m23136f(@mr2 byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith(f17550g)) {
            String[] split = str.substring(2).split(Pattern.quote(f17551h), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C3002nr(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @ts2
    /* renamed from: a */
    public byte[] mo15217a() {
        return mo21447c();
    }

    /* renamed from: b */
    public Set<hu0> mo21446b() {
        return f17544a;
    }

    @ts2
    /* renamed from: c */
    public byte[] mo21447c() {
        String str = this.f17553b;
        if (str == null && this.f17552a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = f17550g;
        objArr[1] = this.f17552a;
        objArr[2] = f17551h;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    @ts2
    /* renamed from: g */
    public String mo21448g() {
        return this.f17553b;
    }

    @mr2
    public String getName() {
        return "cct";
    }

    @mr2
    /* renamed from: h */
    public String mo21449h() {
        return this.f17552a;
    }
}
