package com.google.android.gms.common.data;

import com.onedelhi.secure.mr2;

public interface Freezable<T> {
    @mr2
    T freeze();

    boolean isDataValid();
}
