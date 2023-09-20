package com.onedelhi.secure;

import java.io.IOException;
import okhttp3.Request;

/* renamed from: com.onedelhi.secure.qs */
public interface C6595qs<T> extends Cloneable {
    /* renamed from: X6 */
    C6595qs<T> mo14263X6();

    /* renamed from: Yb */
    el3<T> mo14264Yb() throws IOException;

    void cancel();

    boolean isCanceled();

    boolean isExecuted();

    /* renamed from: jh */
    void mo14269jh(C7181ws<T> wsVar);

    Request request();

    me4 timeout();
}
