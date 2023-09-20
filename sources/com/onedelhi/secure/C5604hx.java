package com.onedelhi.secure;

import java.nio.charset.Charset;
import kotlin.Metadata;
import org.apache.commons.compress.utils.CharsetNames;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0011\u0010\t\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/hx;", "", "Ljava/nio/charset/Charset;", "a", "()Ljava/nio/charset/Charset;", "UTF_32", "c", "UTF_32LE", "b", "UTF_32BE", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.hx */
public final class C5604hx {
    @vr2

    /* renamed from: a */
    public static final C5604hx f29887a = new C5604hx();
    @rw1
    @vr2

    /* renamed from: a */
    public static final Charset f29888a;
    @rw1
    @vr2

    /* renamed from: b */
    public static final Charset f29889b;
    @rw1
    @vr2

    /* renamed from: c */
    public static final Charset f29890c;
    @rw1
    @vr2

    /* renamed from: d */
    public static final Charset f29891d;
    @rw1
    @vr2

    /* renamed from: e */
    public static final Charset f29892e;
    @rw1
    @vr2

    /* renamed from: f */
    public static final Charset f29893f;
    @ss2

    /* renamed from: g */
    public static Charset f29894g;
    @ss2

    /* renamed from: h */
    public static Charset f29895h;
    @ss2

    /* renamed from: i */
    public static Charset f29896i;

    static {
        Charset forName = Charset.forName("UTF-8");
        jt1.m53776o(forName, "forName(\"UTF-8\")");
        f29888a = forName;
        Charset forName2 = Charset.forName(CharsetNames.UTF_16);
        jt1.m53776o(forName2, "forName(\"UTF-16\")");
        f29889b = forName2;
        Charset forName3 = Charset.forName(CharsetNames.UTF_16BE);
        jt1.m53776o(forName3, "forName(\"UTF-16BE\")");
        f29890c = forName3;
        Charset forName4 = Charset.forName(CharsetNames.UTF_16LE);
        jt1.m53776o(forName4, "forName(\"UTF-16LE\")");
        f29891d = forName4;
        Charset forName5 = Charset.forName(CharsetNames.US_ASCII);
        jt1.m53776o(forName5, "forName(\"US-ASCII\")");
        f29892e = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        jt1.m53776o(forName6, "forName(\"ISO-8859-1\")");
        f29893f = forName6;
    }

    @uw1(name = "UTF32")
    @vr2
    /* renamed from: a */
    public final Charset mo37599a() {
        Charset charset = f29894g;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32");
        jt1.m53776o(forName, "forName(\"UTF-32\")");
        f29894g = forName;
        return forName;
    }

    @uw1(name = "UTF32_BE")
    @vr2
    /* renamed from: b */
    public final Charset mo37600b() {
        Charset charset = f29896i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        jt1.m53776o(forName, "forName(\"UTF-32BE\")");
        f29896i = forName;
        return forName;
    }

    @uw1(name = "UTF32_LE")
    @vr2
    /* renamed from: c */
    public final Charset mo37601c() {
        Charset charset = f29895h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        jt1.m53776o(forName, "forName(\"UTF-32LE\")");
        f29895h = forName;
        return forName;
    }
}
