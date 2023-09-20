package com.onedelhi.secure;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0014\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\b\u001a\u001e\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a\u0016\u0010\u000f\u001a\u0004\u0018\u00010\r*\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a\f\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0011*\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¨\u0006\u0015"}, d2 = {"", "Lcom/onedelhi/secure/n71;", "", "k", "", "T", "value", "", "g", "Ljava/util/regex/Matcher;", "from", "", "input", "Lcom/onedelhi/secure/ce2;", "f", "h", "Ljava/util/regex/MatchResult;", "Lcom/onedelhi/secure/is1;", "i", "groupIndex", "j", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
public final class gh3 {

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/onedelhi/secure/n71;", "", "T", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Enum;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.gh3$a */
    public static final class C5433a extends d12 implements ec1<T, Boolean> {

        /* renamed from: n */
        public final /* synthetic */ int f29198n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5433a(int i) {
            super(1);
            this.f29198n = i;
        }

        @vr2
        /* renamed from: a */
        public final Boolean mo17094X(T t) {
            n71 n71 = (n71) t;
            return Boolean.valueOf((this.f29198n & n71.mo37329U()) == n71.mo37328T());
        }
    }

    /* renamed from: f */
    public static final ce2 m49491f(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new de2(matcher, charSequence);
    }

    /* renamed from: g */
    public static final /* synthetic */ <T extends Enum<T> & n71> Set<T> m49492g(int i) {
        jt1.m53786y(4, mx0.f16794s2);
        EnumSet<E> allOf = EnumSet.allOf(Enum.class);
        jt1.m53776o(allOf, "");
        jt1.m53784w();
        x00.m69805N0(allOf, new C5433a(i));
        Set<T> unmodifiableSet = Collections.unmodifiableSet(allOf);
        jt1.m53776o(unmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
        return unmodifiableSet;
    }

    /* renamed from: h */
    public static final ce2 m49493h(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new de2(matcher, charSequence);
    }

    /* renamed from: i */
    public static final is1 m49494i(MatchResult matchResult) {
        return df3.m45236z1(matchResult.start(), matchResult.end());
    }

    /* renamed from: j */
    public static final is1 m49495j(MatchResult matchResult, int i) {
        return df3.m45236z1(matchResult.start(i), matchResult.end(i));
    }

    /* renamed from: k */
    public static final int m49496k(Iterable<? extends n71> iterable) {
        int i = 0;
        for (n71 T : iterable) {
            i |= T.mo37328T();
        }
        return i;
    }
}
