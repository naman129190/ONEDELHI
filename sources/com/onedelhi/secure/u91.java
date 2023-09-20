package com.onedelhi.secure;

import android.util.Base64;
import com.onedelhi.secure.hl3;
import java.util.List;

public final class u91 {

    /* renamed from: a */
    public final int f21267a;

    /* renamed from: a */
    public final String f21268a;

    /* renamed from: a */
    public final List<List<byte[]>> f21269a;

    /* renamed from: b */
    public final String f21270b;

    /* renamed from: c */
    public final String f21271c;

    /* renamed from: d */
    public final String f21272d;

    public u91(@mr2 String str, @mr2 String str2, @mr2 String str3, @C3483sa int i) {
        this.f21268a = (String) k43.m19455l(str);
        this.f21270b = (String) k43.m19455l(str2);
        this.f21271c = (String) k43.m19455l(str3);
        this.f21269a = null;
        k43.m19444a(i != 0);
        this.f21267a = i;
        this.f21272d = mo25457a(str, str2, str3);
    }

    public u91(@mr2 String str, @mr2 String str2, @mr2 String str3, @mr2 List<List<byte[]>> list) {
        this.f21268a = (String) k43.m19455l(str);
        this.f21270b = (String) k43.m19455l(str2);
        this.f21271c = (String) k43.m19455l(str3);
        this.f21269a = (List) k43.m19455l(list);
        this.f21267a = 0;
        this.f21272d = mo25457a(str, str2, str3);
    }

    /* renamed from: a */
    public final String mo25457a(@mr2 String str, @mr2 String str2, @mr2 String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    @ts2
    /* renamed from: b */
    public List<List<byte[]>> mo25458b() {
        return this.f21269a;
    }

    @C3483sa
    /* renamed from: c */
    public int mo25459c() {
        return this.f21267a;
    }

    @mr2
    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: d */
    public String mo25460d() {
        return this.f21272d;
    }

    @Deprecated
    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: e */
    public String mo25461e() {
        return this.f21272d;
    }

    @mr2
    /* renamed from: f */
    public String mo25462f() {
        return this.f21268a;
    }

    @mr2
    /* renamed from: g */
    public String mo25463g() {
        return this.f21270b;
    }

    @mr2
    /* renamed from: h */
    public String mo25464h() {
        return this.f21271c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f21268a + ", mProviderPackage: " + this.f21270b + ", mQuery: " + this.f21271c + ", mCertificates:");
        for (int i = 0; i < this.f21269a.size(); i++) {
            sb.append(" [");
            List list = this.f21269a.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f21267a);
        return sb.toString();
    }
}
