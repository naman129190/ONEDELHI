package com.onedelhi.secure;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.onedelhi.secure.C1767b9;
import com.onedelhi.secure.C4623b5;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.onedelhi.secure.c5 */
public class C4730c5 implements C4623b5 {

    /* renamed from: a */
    public static volatile C4623b5 f26645a;
    @VisibleForTesting

    /* renamed from: a */
    public final C1767b9 f26646a;
    @VisibleForTesting

    /* renamed from: a */
    public final Map f26647a = new ConcurrentHashMap();

    /* renamed from: com.onedelhi.secure.c5$a */
    public class C4731a implements C4623b5.C4624a {

        /* renamed from: a */
        public final /* synthetic */ String f26649a;

        public C4731a(String str) {
            this.f26649a = str;
        }

        /* renamed from: a */
        public final void mo31405a() {
            if (C4730c5.this.mo32255m(this.f26649a)) {
                C4623b5.C4625b G = ((ra5) C4730c5.this.f26647a.get(this.f26649a)).mo35823G();
                if (G != null) {
                    G.mo31408a(0, (Bundle) null);
                }
                C4730c5.this.f26647a.remove(this.f26649a);
            }
        }

        @KeepForSdk
        /* renamed from: b */
        public void mo31406b(Set<String> set) {
            if (C4730c5.this.mo32255m(this.f26649a) && this.f26649a.equals("fiam") && set != null && !set.isEmpty()) {
                ((ra5) C4730c5.this.f26647a.get(this.f26649a)).mo35824H(set);
            }
        }

        @KeepForSdk
        /* renamed from: c */
        public void mo31407c() {
            if (C4730c5.this.mo32255m(this.f26649a) && this.f26649a.equals("fiam")) {
                ((ra5) C4730c5.this.f26647a.get(this.f26649a)).mo35822F();
            }
        }
    }

    public C4730c5(C1767b9 b9Var) {
        Preconditions.checkNotNull(b9Var);
        this.f26646a = b9Var;
    }

    @mr2
    @KeepForSdk
    /* renamed from: h */
    public static C4623b5 m40732h() {
        return m40733i(w31.m68755p());
    }

    @mr2
    @KeepForSdk
    /* renamed from: i */
    public static C4623b5 m40733i(@mr2 w31 w31) {
        return (C4623b5) w31.mo46526l(C4623b5.class);
    }

    @mr2
    @wj3(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @KeepForSdk
    /* renamed from: j */
    public static C4623b5 m40734j(@mr2 w31 w31, @mr2 Context context, @mr2 n64 n64) {
        Preconditions.checkNotNull(w31);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(n64);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f26645a == null) {
            synchronized (C4730c5.class) {
                if (f26645a == null) {
                    Bundle bundle = new Bundle(1);
                    if (w31.mo46512B()) {
                        n64.mo40986c(nd0.class, qa5.f34052a, tl5.f35729a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", w31.mo46511A());
                    }
                    f26645a = new C4730c5(j36.m18100D(context, (String) null, (String) null, (String) null, bundle).mo18096A());
                }
            }
        }
        return f26645a;
    }

    /* renamed from: k */
    public static /* synthetic */ void m40735k(pv0 pv0) {
        boolean z = ((nd0) pv0.mo42921a()).f32476a;
        synchronized (C4730c5.class) {
            ((C4730c5) Preconditions.checkNotNull(f26645a)).f26646a.mo13539B(z);
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo31397a(@mr2 String str, @mr2 String str2, @mr2 Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (is5.m52649d(str) && is5.m52647b(str2, bundle) && is5.m52646a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1);
            }
            this.f26646a.mo13552o(str, str2, bundle);
        }
    }

    @mr2
    @KeepForSdk
    @ly4
    /* renamed from: b */
    public C4623b5.C4624a mo31398b(@mr2 String str, @mr2 C4623b5.C4625b bVar) {
        Preconditions.checkNotNull(bVar);
        if (!is5.m52649d(str) || mo32255m(str)) {
            return null;
        }
        C1767b9 b9Var = this.f26646a;
        Object k26 = "fiam".equals(str) ? new k26(b9Var, bVar) : "clx".equals(str) ? new fa6(b9Var, bVar) : null;
        if (k26 == null) {
            return null;
        }
        this.f26647a.put(str, k26);
        return new C4731a(str);
    }

    @KeepForSdk
    /* renamed from: c */
    public void mo31399c(@mr2 C4623b5.C4626c cVar) {
        String str;
        int i = is5.f30448a;
        if (cVar != null && (str = cVar.f26145a) != null && !str.isEmpty()) {
            Object obj = cVar.f26144a;
            if ((obj == null || dj6.m13167a(obj) != null) && is5.m52649d(str) && is5.m52650e(str, cVar.f26149b)) {
                String str2 = cVar.f26156f;
                if (str2 == null || (is5.m52647b(str2, cVar.f26151c) && is5.m52646a(str, cVar.f26156f, cVar.f26151c))) {
                    String str3 = cVar.f26155e;
                    if (str3 == null || (is5.m52647b(str3, cVar.f26148b) && is5.m52646a(str, cVar.f26155e, cVar.f26148b))) {
                        String str4 = cVar.f26154d;
                        if (str4 == null || (is5.m52647b(str4, cVar.f26143a) && is5.m52646a(str, cVar.f26154d, cVar.f26143a))) {
                            C1767b9 b9Var = this.f26646a;
                            Bundle bundle = new Bundle();
                            String str5 = cVar.f26145a;
                            if (str5 != null) {
                                bundle.putString("origin", str5);
                            }
                            String str6 = cVar.f26149b;
                            if (str6 != null) {
                                bundle.putString("name", str6);
                            }
                            Object obj2 = cVar.f26144a;
                            if (obj2 != null) {
                                nd6.m22704b(bundle, obj2);
                            }
                            String str7 = cVar.f26152c;
                            if (str7 != null) {
                                bundle.putString(C1767b9.C1768a.f9755d, str7);
                            }
                            bundle.putLong(C1767b9.C1768a.f9756e, cVar.f26142a);
                            String str8 = cVar.f26154d;
                            if (str8 != null) {
                                bundle.putString(C1767b9.C1768a.f9757f, str8);
                            }
                            Bundle bundle2 = cVar.f26143a;
                            if (bundle2 != null) {
                                bundle.putBundle(C1767b9.C1768a.f9758g, bundle2);
                            }
                            String str9 = cVar.f26155e;
                            if (str9 != null) {
                                bundle.putString(C1767b9.C1768a.f9759h, str9);
                            }
                            Bundle bundle3 = cVar.f26148b;
                            if (bundle3 != null) {
                                bundle.putBundle(C1767b9.C1768a.f9760i, bundle3);
                            }
                            bundle.putLong(C1767b9.C1768a.f9761j, cVar.f26147b);
                            String str10 = cVar.f26156f;
                            if (str10 != null) {
                                bundle.putString(C1767b9.C1768a.f9762k, str10);
                            }
                            Bundle bundle4 = cVar.f26151c;
                            if (bundle4 != null) {
                                bundle.putBundle(C1767b9.C1768a.f9763l, bundle4);
                            }
                            bundle.putLong(C1767b9.C1768a.f9764m, cVar.f26150c);
                            bundle.putBoolean(C1767b9.C1768a.f9765n, cVar.f26146a);
                            bundle.putLong(C1767b9.C1768a.f9766o, cVar.f26153d);
                            b9Var.mo13557t(bundle);
                        }
                    }
                }
            }
        }
    }

    @KeepForSdk
    public void clearConditionalUserProperty(@mr2 @qz3(max = 24, min = 1) String str, @mr2 String str2, @mr2 Bundle bundle) {
        if (str2 == null || is5.m52647b(str2, bundle)) {
            this.f26646a.mo13541b(str, str2, bundle);
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public void mo31401d(@mr2 String str, @mr2 String str2, @mr2 Object obj) {
        if (is5.m52649d(str) && is5.m52650e(str, str2)) {
            this.f26646a.mo13563z(str, str2, obj);
        }
    }

    @KeepForSdk
    @ly4
    /* renamed from: e */
    public int mo31402e(@mr2 @qz3(min = 1) String str) {
        return this.f26646a.mo13550m(str);
    }

    @mr2
    @ly4
    @KeepForSdk
    /* renamed from: f */
    public List<C4623b5.C4626c> mo31403f(@mr2 String str, @mr2 @qz3(max = 23, min = 1) String str2) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        ArrayList arrayList = new ArrayList();
        for (Bundle next : this.f26646a.mo13546g(str, str2)) {
            int i = is5.f30448a;
            Preconditions.checkNotNull(next);
            C4623b5.C4626c cVar = new C4623b5.C4626c();
            cVar.f26145a = (String) Preconditions.checkNotNull((String) nd6.m22703a(next, "origin", cls2, (Object) null));
            cVar.f26149b = (String) Preconditions.checkNotNull((String) nd6.m22703a(next, "name", cls2, (Object) null));
            cVar.f26144a = nd6.m22703a(next, "value", Object.class, (Object) null);
            cVar.f26152c = (String) nd6.m22703a(next, C1767b9.C1768a.f9755d, cls2, (Object) null);
            cVar.f26142a = ((Long) nd6.m22703a(next, C1767b9.C1768a.f9756e, cls, 0L)).longValue();
            cVar.f26154d = (String) nd6.m22703a(next, C1767b9.C1768a.f9757f, cls2, (Object) null);
            cVar.f26143a = (Bundle) nd6.m22703a(next, C1767b9.C1768a.f9758g, Bundle.class, (Object) null);
            cVar.f26155e = (String) nd6.m22703a(next, C1767b9.C1768a.f9759h, cls2, (Object) null);
            cVar.f26148b = (Bundle) nd6.m22703a(next, C1767b9.C1768a.f9760i, Bundle.class, (Object) null);
            cVar.f26147b = ((Long) nd6.m22703a(next, C1767b9.C1768a.f9761j, cls, 0L)).longValue();
            cVar.f26156f = (String) nd6.m22703a(next, C1767b9.C1768a.f9762k, cls2, (Object) null);
            cVar.f26151c = (Bundle) nd6.m22703a(next, C1767b9.C1768a.f9763l, Bundle.class, (Object) null);
            cVar.f26146a = ((Boolean) nd6.m22703a(next, C1767b9.C1768a.f9765n, Boolean.class, Boolean.FALSE)).booleanValue();
            cVar.f26150c = ((Long) nd6.m22703a(next, C1767b9.C1768a.f9764m, cls, 0L)).longValue();
            cVar.f26153d = ((Long) nd6.m22703a(next, C1767b9.C1768a.f9766o, cls, 0L)).longValue();
            arrayList.add(cVar);
        }
        return arrayList;
    }

    @mr2
    @ly4
    @KeepForSdk
    /* renamed from: g */
    public Map<String, Object> mo31404g(boolean z) {
        return this.f26646a.mo13551n((String) null, (String) null, z);
    }

    /* renamed from: m */
    public final boolean mo32255m(@mr2 String str) {
        return !str.isEmpty() && this.f26647a.containsKey(str) && this.f26647a.get(str) != null;
    }
}
