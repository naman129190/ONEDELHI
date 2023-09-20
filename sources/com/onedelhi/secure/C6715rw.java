package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\u001a\u0011\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\b\"\u001f\u0010\u0001\u001a\u00020\u0000*\u00020\u00028Æ\u0002X\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"", "code", "", "a", "b", "(C)I", "getCode$annotations", "(C)V", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.rw */
public final class C6715rw {
    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: a */
    public static final char m63929a(int i) {
        if (i >= 0 && i <= 65535) {
            return (char) i;
        }
        throw new IllegalArgumentException("Invalid Char code: " + i);
    }

    /* renamed from: b */
    public static final int m63930b(char c) {
        return c;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: c */
    public static /* synthetic */ void m63931c(char c) {
    }
}
