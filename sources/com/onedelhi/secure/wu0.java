package com.onedelhi.secure;

import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public abstract class wu0<T> extends yx3 {
    public wu0(ym3 ym3) {
        super(ym3);
    }

    public abstract void bind(s74 s74, T t);

    public abstract String createQuery();

    public final int handle(T t) {
        s74 acquire = acquire();
        try {
            bind(acquire, t);
            return acquire.mo13601a1();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Iterable<? extends T> iterable) {
        s74 acquire = acquire();
        int i = 0;
        try {
            for (Object bind : iterable) {
                bind(acquire, bind);
                i += acquire.mo13601a1();
            }
            return i;
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(T[] tArr) {
        s74 acquire = acquire();
        try {
            int i = 0;
            for (T bind : tArr) {
                bind(acquire, bind);
                i += acquire.mo13601a1();
            }
            return i;
        } finally {
            release(acquire);
        }
    }
}
