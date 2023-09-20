package com.onedelhi.secure;

import java.util.Comparator;
import java.util.Map;

public final /* synthetic */ class iq2 implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ iq2 f30416a = new iq2();

    public final int compare(Object obj, Object obj2) {
        return ((Float) ((Map.Entry) obj).getValue()).compareTo((Float) ((Map.Entry) obj2).getValue());
    }
}
