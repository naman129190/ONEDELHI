package com.onedelhi.secure;

import java.util.Comparator;
import java.util.Map;

public final /* synthetic */ class jr0 implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ jr0 f30910a = new jr0();

    public final int compare(Object obj, Object obj2) {
        return ((Float) ((Map.Entry) obj).getValue()).compareTo((Float) ((Map.Entry) obj2).getValue());
    }
}
