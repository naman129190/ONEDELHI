package com.onedelhi.secure;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0006"}, d2 = {"Lcom/onedelhi/secure/zb2;", "", "Lcom/onedelhi/secure/xb2;", "a", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class zb2 {
    @rw1
    @vr2

    /* renamed from: a */
    public static final xb2 f38298a;
    @vr2

    /* renamed from: a */
    public static final zb2 f38299a;

    /* renamed from: a */
    public static final boolean f38300a = g94.m49186e(ac2.f25814a, true);

    static {
        zb2 zb2 = new zb2();
        f38299a = zb2;
        f38298a = zb2.mo48215a();
    }

    /* renamed from: a */
    public final xb2 mo48215a() {
        T t;
        Class cls = yb2.class;
        try {
            List<yb2> d = f38300a ? d01.f27167a.mo34036d() : hu3.m51011c3(fu3.m48487e(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
            Iterator<T> it = d.iterator();
            if (!it.hasNext()) {
                t = null;
            } else {
                t = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((yb2) t).getLoadPriority();
                    do {
                        T next = it.next();
                        int loadPriority2 = ((yb2) next).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            t = next;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            }
            yb2 yb2 = (yb2) t;
            xb2 f = yb2 == null ? null : ac2.m38568f(yb2, d);
            return f == null ? ac2.m38564b((Throwable) null, (String) null, 3, (Object) null) : f;
        } catch (Throwable th) {
            return ac2.m38564b(th, (String) null, 2, (Object) null);
        }
    }
}
