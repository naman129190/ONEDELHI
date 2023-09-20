package com.onedelhi.secure;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/iu1;", "Lcom/onedelhi/secure/hu1;", "Ljava/util/regex/MatchResult;", "matchResult", "", "name", "Lcom/onedelhi/secure/zd2;", "c", "Lcom/onedelhi/secure/me3;", "b", "<init>", "()V", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 6, 0})
public class iu1 extends hu1 {
    @vr2
    /* renamed from: b */
    public me3 mo38244b() {
        return new r23();
    }

    @ss2
    /* renamed from: c */
    public zd2 mo38245c(@vr2 MatchResult matchResult, @vr2 String str) {
        jt1.m53777p(matchResult, "matchResult");
        jt1.m53777p(str, "name");
        Matcher matcher = matchResult instanceof Matcher ? (Matcher) matchResult : null;
        if (matcher != null) {
            is1 is1 = new is1(matcher.start(str), matcher.end(str) - 1);
            if (is1.mo27428i().intValue() < 0) {
                return null;
            }
            String group = matcher.group(str);
            jt1.m53776o(group, "matcher.group(name)");
            return new zd2(group, is1);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
