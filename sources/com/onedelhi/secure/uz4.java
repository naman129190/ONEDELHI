package com.onedelhi.secure;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import jmjou.C7601c;
import jmjou.C7606e;

public class uz4 implements C7606e, q15 {

    /* renamed from: a */
    public Executor f36358a;

    /* renamed from: a */
    public C7601c f36359a;

    /* renamed from: com.onedelhi.secure.uz4$a */
    public static class C6991a implements C7606e {

        /* renamed from: b */
        public String f36360b;

        /* renamed from: b */
        public boolean f36361b;

        /* renamed from: n */
        public int f36362n;

        /* renamed from: a */
        public void mo45881a(int i, String str, boolean z) {
            this.f36362n = i;
            this.f36360b = str;
            this.f36361b = z;
        }

        public void init(C7601c cVar, C7601c.C7602a aVar) {
        }

        public boolean isCachingAllowed() {
            return false;
        }
    }

    /* renamed from: a */
    public void mo43082a(String str, Map<String, String> map, String str2, @mr2 t25 t25, boolean z) {
        new c05(this, str, true, z, map, str2, t25).executeOnExecutor(this.f36358a, new Void[0]);
    }

    /* renamed from: b */
    public final l15 mo45880b(String str, boolean z, boolean z2, boolean z3, Map<String, String> map, String str2, C7601c cVar) {
        if (map == null) {
            cVar.getClass();
            map = new HashMap<>();
        }
        C7601c.C7602a aVar = (C7601c.C7602a) cVar.mo48873i(C7601c.C7602a.class);
        aVar.put(ImagesContract.URL, str);
        aVar.put("isPost", Boolean.valueOf(z));
        aVar.put("useCache", Boolean.valueOf(z2));
        aVar.put("defaultCache", Boolean.valueOf(z3));
        aVar.put("headers", map);
        aVar.put("body", str2);
        return (l15) cVar.mo48874j(l15.class, aVar);
    }

    public void init(C7601c cVar, C7601c.C7602a aVar) {
        this.f36359a = cVar;
        this.f36358a = ((k15) cVar.mo48873i(k15.class)).f31077a;
    }

    public boolean isCachingAllowed() {
        return true;
    }
}
