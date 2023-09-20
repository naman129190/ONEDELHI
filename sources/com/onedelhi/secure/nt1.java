package com.onedelhi.secure;

import java.io.IOException;

public class nt1 extends IOException {

    /* renamed from: b */
    public static final long f32781b = -1616151763072450476L;

    /* renamed from: a */
    public yh2 f32782a = null;

    /* renamed from: b */
    public boolean f32783b;

    /* renamed from: com.onedelhi.secure.nt1$a */
    public static class C6227a extends nt1 {

        /* renamed from: c */
        public static final long f32784c = 3283890091615336259L;

        public C6227a(String str) {
            super(str);
        }
    }

    public nt1(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public nt1(String str) {
        super(str);
    }

    public nt1(String str, IOException iOException) {
        super(str, iOException);
    }

    /* renamed from: c */
    public static nt1 m58782c() {
        return new nt1("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: d */
    public static nt1 m58783d() {
        return new nt1("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    public static nt1 m58784e() {
        return new nt1("Protocol message had invalid UTF-8.");
    }

    /* renamed from: f */
    public static C6227a m58785f() {
        return new C6227a("Protocol message tag had invalid wire type.");
    }

    /* renamed from: g */
    public static nt1 m58786g() {
        return new nt1("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: h */
    public static nt1 m58787h() {
        return new nt1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: i */
    public static nt1 m58788i() {
        return new nt1("Failed to parse the message.");
    }

    /* renamed from: j */
    public static nt1 m58789j() {
        return new nt1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: m */
    public static nt1 m58790m() {
        return new nt1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: n */
    public static nt1 m58791n() {
        return new nt1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: a */
    public boolean mo41482a() {
        return this.f32783b;
    }

    /* renamed from: b */
    public yh2 mo41483b() {
        return this.f32782a;
    }

    /* renamed from: k */
    public void mo41484k() {
        this.f32783b = true;
    }

    /* renamed from: l */
    public nt1 mo41485l(yh2 yh2) {
        this.f32782a = yh2;
        return this;
    }

    /* renamed from: o */
    public IOException mo41486o() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }
}
