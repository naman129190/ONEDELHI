package com.onedelhi.secure;

import java.io.IOException;

public final class t66 extends IOException {

    /* renamed from: a */
    public i96 f20672a = null;

    public t66(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public t66(String str) {
        super(str);
    }

    /* renamed from: a */
    public static t66 m28134a() {
        return new t66("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: b */
    public static t66 m28135b() {
        return new t66("Protocol message had invalid UTF-8.");
    }

    /* renamed from: c */
    public static t66 m28136c() {
        return new t66("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: d */
    public static t66 m28137d() {
        return new t66("Failed to parse the message.");
    }

    /* renamed from: f */
    public static t66 m28138f() {
        return new t66("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: e */
    public final t66 mo24732e(i96 i96) {
        this.f20672a = i96;
        return this;
    }
}
