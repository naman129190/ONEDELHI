package com.onedelhi.secure;

import java.io.File;
import java.util.Comparator;

public final /* synthetic */ class bb0 implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ bb0 f26260a = new bb0();

    public final int compare(Object obj, Object obj2) {
        return ((File) obj2).getName().compareTo(((File) obj).getName());
    }
}
