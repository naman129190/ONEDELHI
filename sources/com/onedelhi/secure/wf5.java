package com.onedelhi.secure;

import java.util.ListIterator;
import org.jspecify.nullness.NullMarked;

@NullMarked
public abstract class wf5 extends lf5 implements ListIterator {
    @on0("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @on0("Always throws UnsupportedOperationException")
    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
