package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.mr2;

@KeepForSdk
public interface Predicate<T> {
    @KeepForSdk
    boolean apply(@mr2 T t);
}
