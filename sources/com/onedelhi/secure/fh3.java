package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u0005"}, d2 = {"Lcom/onedelhi/secure/ae2;", "", "name", "Lcom/onedelhi/secure/zd2;", "a", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 6, 0}, pn = "kotlin.text")
@uw1(name = "RegexExtensionsJDK8Kt")
public final class fh3 {
    @gz3(version = "1.2")
    @ss2
    /* renamed from: a */
    public static final zd2 m47882a(@vr2 ae2 ae2, @vr2 String str) {
        jt1.m53777p(ae2, "<this>");
        jt1.m53777p(str, "name");
        be2 be2 = ae2 instanceof be2 ? (be2) ae2 : null;
        if (be2 != null) {
            return be2.mo31557K(str);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
