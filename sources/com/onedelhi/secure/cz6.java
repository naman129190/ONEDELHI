package com.onedelhi.secure;

import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;

@NullMarked
public final class cz6 {
    /* renamed from: a */
    public static final CharSequence m12869a(@CheckForNull Object obj, String str) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
