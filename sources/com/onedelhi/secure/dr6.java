package com.onedelhi.secure;

import java.io.IOException;

public class dr6 extends IOException {
    public dr6(String str) {
        super(str);
    }

    /* renamed from: a */
    public static br6 m13272a() {
        return new br6("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    public static dr6 m13273b() {
        return new dr6("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    public static dr6 m13274c() {
        return new dr6("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    public static dr6 m13275d() {
        return new dr6("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    public static dr6 m13276e() {
        return new dr6("Failed to parse the message.");
    }

    /* renamed from: f */
    public static dr6 m13277f() {
        return new dr6("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
