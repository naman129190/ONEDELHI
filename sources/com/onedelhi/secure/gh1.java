package com.onedelhi.secure;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

public class gh1 implements ky1 {

    /* renamed from: d */
    public static final String f12576d = "@#&=*+-_.,:!?()/~'%;$";

    /* renamed from: a */
    public int f12577a;

    /* renamed from: a */
    public final vk1 f12578a;
    @ts2

    /* renamed from: a */
    public final URL f12579a;
    @ts2

    /* renamed from: a */
    public volatile byte[] f12580a;
    @ts2

    /* renamed from: b */
    public final String f12581b;
    @ts2

    /* renamed from: b */
    public URL f12582b;
    @ts2

    /* renamed from: c */
    public String f12583c;

    public gh1(String str) {
        this(str, vk1.f21843b);
    }

    public gh1(String str, vk1 vk1) {
        this.f12579a = null;
        this.f12581b = g43.m15507b(str);
        this.f12578a = (vk1) g43.m15509d(vk1);
    }

    public gh1(URL url) {
        this(url, vk1.f21843b);
    }

    public gh1(URL url, vk1 vk1) {
        this.f12579a = (URL) g43.m15509d(url);
        this.f12581b = null;
        this.f12578a = (vk1) g43.m15509d(vk1);
    }

    /* renamed from: a */
    public void mo13311a(@mr2 MessageDigest messageDigest) {
        messageDigest.update(mo16576d());
    }

    /* renamed from: c */
    public String mo16575c() {
        String str = this.f12581b;
        return str != null ? str : ((URL) g43.m15509d(this.f12579a)).toString();
    }

    /* renamed from: d */
    public final byte[] mo16576d() {
        if (this.f12580a == null) {
            this.f12580a = mo16575c().getBytes(ky1.f15108a);
        }
        return this.f12580a;
    }

    /* renamed from: e */
    public Map<String, String> mo16577e() {
        return this.f12578a.mo15718b0();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof gh1)) {
            return false;
        }
        gh1 gh1 = (gh1) obj;
        return mo16575c().equals(gh1.mo16575c()) && this.f12578a.equals(gh1.f12578a);
    }

    /* renamed from: f */
    public final String mo16578f() {
        if (TextUtils.isEmpty(this.f12583c)) {
            String str = this.f12581b;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) g43.m15509d(this.f12579a)).toString();
            }
            this.f12583c = Uri.encode(str, f12576d);
        }
        return this.f12583c;
    }

    /* renamed from: g */
    public final URL mo16579g() throws MalformedURLException {
        if (this.f12582b == null) {
            this.f12582b = new URL(mo16578f());
        }
        return this.f12582b;
    }

    /* renamed from: h */
    public String mo16580h() {
        return mo16578f();
    }

    public int hashCode() {
        if (this.f12577a == 0) {
            int hashCode = mo16575c().hashCode();
            this.f12577a = hashCode;
            this.f12577a = (hashCode * 31) + this.f12578a.hashCode();
        }
        return this.f12577a;
    }

    /* renamed from: i */
    public URL mo16581i() throws MalformedURLException {
        return mo16579g();
    }

    public String toString() {
        return mo16575c();
    }
}
