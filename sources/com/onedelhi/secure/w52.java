package com.onedelhi.secure;

import java.util.Comparator;
import java.util.Map;

public final /* synthetic */ class w52 implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ w52 f36896a = new w52();

    public final int compare(Object obj, Object obj2) {
        return ((Float) ((Map.Entry) obj).getValue()).compareTo((Float) ((Map.Entry) obj2).getValue());
    }
}
