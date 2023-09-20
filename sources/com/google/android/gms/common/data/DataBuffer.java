package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Releasable;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.io.Closeable;
import java.util.Iterator;

public interface DataBuffer<T> extends Iterable<T>, Releasable, Closeable {
    void close();

    @mr2
    T get(int i);

    int getCount();

    @KeepForSdk
    @ts2
    Bundle getMetadata();

    @Deprecated
    boolean isClosed();

    @mr2
    Iterator<T> iterator();

    void release();

    @mr2
    Iterator<T> singleRefIterator();
}
