package com.onedelhi.secure;

import java.io.Closeable;

public class da5 implements Closeable {
    public void close() {
        throw null;
    }

    public synchronized void finalize() {
    }
}
