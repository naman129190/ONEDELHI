package com.onedelhi.secure;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

public final class zj1 {

    /* renamed from: a */
    public static final String f23735a = "HandlerCompat";

    @sj3(28)
    /* renamed from: com.onedelhi.secure.zj1$a */
    public static class C4098a {
        /* renamed from: a */
        public static Handler m33176a(Looper looper) {
            return Handler.createAsync(looper);
        }

        /* renamed from: b */
        public static Handler m33177b(Looper looper, Handler.Callback callback) {
            return Handler.createAsync(looper, callback);
        }

        /* renamed from: c */
        public static boolean m33178c(Handler handler, Runnable runnable, Object obj, long j) {
            return handler.postDelayed(runnable, obj, j);
        }
    }

    @sj3(29)
    /* renamed from: com.onedelhi.secure.zj1$b */
    public static class C4099b {
        /* renamed from: a */
        public static boolean m33179a(Handler handler, Runnable runnable) {
            return handler.hasCallbacks(runnable);
        }
    }

    @mr2
    /* renamed from: a */
    public static Handler m33172a(@mr2 Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C4098a.m33176a(looper);
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException e) {
            Log.w(f23735a, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException(cause);
            }
        }
    }

    @mr2
    /* renamed from: b */
    public static Handler m33173b(@mr2 Looper looper, @mr2 Handler.Callback callback) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C4098a.m33177b(looper, callback);
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, callback, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException e) {
            Log.w(f23735a, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper, callback);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException(cause);
            }
        }
    }

    @sj3(16)
    /* renamed from: c */
    public static boolean m33174c(@mr2 Handler handler, @mr2 Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C4099b.m33179a(handler, runnable);
        }
        try {
            return ((Boolean) Handler.class.getMethod("hasCallbacks", new Class[]{Runnable.class}).invoke(handler, new Object[]{runnable})).booleanValue();
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException(cause);
            }
        } catch (IllegalAccessException | NoSuchMethodException | NullPointerException e2) {
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e2);
        }
    }

    /* renamed from: d */
    public static boolean m33175d(@mr2 Handler handler, @mr2 Runnable runnable, @ts2 Object obj, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C4098a.m33178c(handler, runnable, obj, j);
        }
        Message obtain = Message.obtain(handler, runnable);
        obtain.obj = obj;
        return handler.sendMessageDelayed(obtain, j);
    }
}
