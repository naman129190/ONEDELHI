package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.mr2;

@KeepForSdk
public interface BiConsumer<T, U> {
    @KeepForSdk
    void accept(@mr2 T t, @mr2 U u);
}
