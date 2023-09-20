package com.onedelhi.secure;

import java.lang.reflect.Method;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B%\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/fz;", "", "", "closer", "a", "closeGuardInstance", "", "b", "Ljava/lang/reflect/Method;", "getMethod", "openMethod", "warnIfOpenMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.onedelhi.secure.fz */
public final class C5338fz {

    /* renamed from: a */
    public static final C5339a f28767a = new C5339a((wg0) null);

    /* renamed from: a */
    public final Method f28768a;

    /* renamed from: b */
    public final Method f28769b;

    /* renamed from: c */
    public final Method f28770c;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/onedelhi/secure/fz$a;", "", "Lcom/onedelhi/secure/fz;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.fz$a */
    public static final class C5339a {
        public C5339a() {
        }

        public /* synthetic */ C5339a(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final C5338fz mo36405a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new C5338fz(method3, method, method2);
        }
    }

    public C5338fz(@ss2 Method method, @ss2 Method method2, @ss2 Method method3) {
        this.f28768a = method;
        this.f28769b = method2;
        this.f28770c = method3;
    }

    @ss2
    /* renamed from: a */
    public final Object mo36403a(@vr2 String str) {
        jt1.m53777p(str, "closer");
        Method method = this.f28768a;
        if (method != null) {
            try {
                Object invoke = method.invoke((Object) null, new Object[0]);
                Method method2 = this.f28769b;
                jt1.m53774m(method2);
                method2.invoke(invoke, new Object[]{str});
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo36404b(@ss2 Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f28770c;
            jt1.m53774m(method);
            method.invoke(obj, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
