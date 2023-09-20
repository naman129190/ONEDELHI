package com.onedelhi.secure;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.onedelhi.secure.C6708rs;
import com.onedelhi.secure.q80;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

public class l23 {

    /* renamed from: a */
    public static final l23 f31521a = m55220f();
    @Nullable

    /* renamed from: a */
    public final Constructor<MethodHandles.Lookup> f31522a;

    /* renamed from: a */
    public final boolean f31523a;

    /* renamed from: com.onedelhi.secure.l23$a */
    public static final class C5954a extends l23 {

        /* renamed from: com.onedelhi.secure.l23$a$a */
        public static final class C5955a implements Executor {

            /* renamed from: a */
            public final Handler f31524a = new Handler(Looper.getMainLooper());

            public void execute(Runnable runnable) {
                this.f31524a.post(runnable);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5954a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        /* renamed from: c */
        public Executor mo39627c() {
            return new C5955a();
        }

        @Nullable
        /* renamed from: h */
        public Object mo39630h(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return l23.super.mo39630h(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    public l23(boolean z) {
        this.f31523a = z;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z) {
            Class<MethodHandles.Lookup> cls = MethodHandles.Lookup.class;
            try {
                constructor = cls.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f31522a = constructor;
    }

    /* renamed from: f */
    public static l23 m55220f() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? new C5954a() : new l23(true);
    }

    /* renamed from: g */
    public static l23 m55221g() {
        return f31521a;
    }

    /* renamed from: a */
    public List<? extends C6708rs.C6709a> mo39625a(@Nullable Executor executor) {
        qg0 qg0 = new qg0(executor);
        if (!this.f31523a) {
            return Collections.singletonList(qg0);
        }
        return Arrays.asList(new C6708rs.C6709a[]{i20.f30047a, qg0});
    }

    /* renamed from: b */
    public int mo39626b() {
        return this.f31523a ? 2 : 1;
    }

    @Nullable
    /* renamed from: c */
    public Executor mo39627c() {
        return null;
    }

    /* renamed from: d */
    public List<? extends q80.C6515a> mo39628d() {
        return this.f31523a ? Collections.singletonList(sw2.f35224a) : Collections.emptyList();
    }

    /* renamed from: e */
    public int mo39629e() {
        return this.f31523a ? 1 : 0;
    }

    @Nullable
    @IgnoreJRERequirement
    /* renamed from: h */
    public Object mo39630h(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        MethodHandles.Lookup lookup;
        Constructor<MethodHandles.Lookup> constructor = this.f31522a;
        if (constructor != null) {
            lookup = constructor.newInstance(new Object[]{cls, -1});
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    @IgnoreJRERequirement
    /* renamed from: i */
    public boolean mo39631i(Method method) {
        return this.f31523a && method.isDefault();
    }
}
