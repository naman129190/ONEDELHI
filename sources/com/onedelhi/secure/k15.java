package com.onedelhi.secure;

import android.net.Uri;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jmjou.C7601c;
import jmjou.C7606e;

public class k15 implements C7606e {

    /* renamed from: a */
    public final Executor f31077a = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors() * 2, 100, TimeUnit.SECONDS, new ArrayBlockingQueue(100));

    /* renamed from: com.onedelhi.secure.k15$a */
    public static class C5869a {

        /* renamed from: a */
        public static final Uri f31078a = Uri.parse(String.format("%s://%s", new Object[]{"upi", "pay"}));
    }

    public void init(C7601c cVar, C7601c.C7602a aVar) {
    }

    public boolean isCachingAllowed() {
        return true;
    }
}
