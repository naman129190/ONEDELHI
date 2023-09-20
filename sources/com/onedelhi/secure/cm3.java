package com.onedelhi.secure;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.onedelhi.secure.C6708rs;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.Request;

public class cm3 extends C6708rs.C6709a {

    /* renamed from: a */
    public static final String f10397a = pj0.m61166a(-85417321928519L);

    /* renamed from: a */
    public static boolean f10398a = true;

    /* renamed from: com.onedelhi.secure.cm3$a */
    public static final class C1916a<R, T> implements C6708rs<R, T> {

        /* renamed from: a */
        public final int f10399a;

        /* renamed from: a */
        public final C6708rs<R, T> f10400a;

        public C1916a(C6708rs<R, T> rsVar, int i) {
            this.f10400a = rsVar;
            this.f10399a = i;
        }

        /* renamed from: a */
        public T mo14260a(C6595qs<R> qsVar) {
            C6708rs<R, T> rsVar = this.f10400a;
            int i = this.f10399a;
            C6595qs qsVar2 = qsVar;
            if (i > 0) {
                qsVar2 = new C1918c(qsVar, i);
            }
            return rsVar.mo14260a(qsVar2);
        }

        /* renamed from: b */
        public Type mo14261b() {
            return this.f10400a.mo14261b();
        }
    }

    /* renamed from: com.onedelhi.secure.cm3$b */
    public static final class C1917b<T> implements C7181ws<T> {

        /* renamed from: a */
        public final int f10401a;

        /* renamed from: a */
        public final C6595qs<T> f10402a;

        /* renamed from: a */
        public final C7181ws<T> f10403a;

        /* renamed from: a */
        public final AtomicInteger f10404a = new AtomicInteger(0);

        public C1917b(C6595qs<T> qsVar, C7181ws<T> wsVar, int i) {
            this.f10402a = qsVar;
            this.f10403a = wsVar;
            this.f10401a = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m12621d() {
            this.f10402a.mo14263X6().mo14269jh(this);
        }

        /* renamed from: a */
        public void mo8646a(@mr2 C6595qs<T> qsVar, @mr2 Throwable th) {
            if (th.getMessage() != null) {
                c41.m40702d().mo32240f(th.getMessage());
            }
            int incrementAndGet = this.f10404a.incrementAndGet();
            int i = this.f10401a;
            if (incrementAndGet <= i) {
                mo14262e();
            } else if (i > 0) {
                boolean unused = cm3.f10398a = false;
                this.f10403a.mo8646a(qsVar, new TimeoutException(String.format(pj0.m61166a(-85086609446727L), new Object[]{Integer.valueOf(this.f10401a)})));
            } else {
                this.f10403a.mo8646a(qsVar, th);
            }
        }

        /* renamed from: b */
        public void mo8647b(@mr2 C6595qs<T> qsVar, @mr2 el3<T> el3) {
            if (el3.mo35472g() || this.f10404a.incrementAndGet() > this.f10401a) {
                this.f10403a.mo8647b(qsVar, el3);
            } else {
                mo14262e();
            }
        }

        /* renamed from: e */
        public final void mo14262e() {
            HashMap hashMap = new HashMap();
            int i = 1000;
            hashMap.put(0, 1000);
            hashMap.put(1, 3000);
            hashMap.put(2, 8000);
            hashMap.put(3, 10000);
            hashMap.put(4, 10000);
            hashMap.put(5, 10000);
            hashMap.put(6, 10000);
            try {
                i = ((Integer) hashMap.get(Integer.valueOf(this.f10404a.get()))).intValue();
            } catch (Exception unused) {
            }
            String a = pj0.m61166a(-85236933302087L);
            Log.w(a, pj0.m61166a(-85322832648007L) + this.f10404a.get() + pj0.m61166a(-85327127615303L) + this.f10401a + pj0.m61166a(-85335717549895L) + i);
            new Handler(Looper.getMainLooper()).postDelayed(new dm3(this), (long) i);
        }
    }

    /* renamed from: com.onedelhi.secure.cm3$c */
    public static final class C1918c<R> implements C6595qs<R> {

        /* renamed from: a */
        public final C6595qs<R> f10405a;

        /* renamed from: n */
        public final int f10406n;

        public C1918c(C6595qs<R> qsVar, int i) {
            this.f10405a = qsVar;
            this.f10406n = i;
        }

        /* renamed from: X6 */
        public C6595qs<R> clone() {
            return new C1918c(this.f10405a.mo14263X6(), this.f10406n);
        }

        /* renamed from: Yb */
        public el3<R> mo14264Yb() throws IOException {
            return this.f10405a.mo14264Yb();
        }

        public void cancel() {
            this.f10405a.cancel();
        }

        public boolean isCanceled() {
            return this.f10405a.isCanceled();
        }

        public boolean isExecuted() {
            return this.f10405a.isExecuted();
        }

        /* renamed from: jh */
        public void mo14269jh(@mr2 C7181ws<R> wsVar) {
            C6595qs<R> qsVar = this.f10405a;
            qsVar.mo14269jh(new C1917b(qsVar, wsVar, this.f10406n));
        }

        public Request request() {
            return this.f10405a.request();
        }

        public me4 timeout() {
            return null;
        }
    }

    /* renamed from: e */
    public static cm3 m12614e() {
        return new cm3();
    }

    @ss2
    /* renamed from: a */
    public C6708rs<?, ?> mo14257a(@mr2 Type type, @mr2 Annotation[] annotationArr, @mr2 am3 am3) {
        bm3 f = mo14258f(annotationArr);
        return new C1916a(am3.mo31019j(this, type, annotationArr), f != null ? f.max() : 0);
    }

    /* renamed from: f */
    public final bm3 mo14258f(@mr2 Annotation[] annotationArr) {
        for (bm3 bm3 : annotationArr) {
            if (bm3 instanceof bm3) {
                return bm3;
            }
        }
        return null;
    }

    /* renamed from: g */
    public boolean mo14259g() {
        return f10398a;
    }
}
