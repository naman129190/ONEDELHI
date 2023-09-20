package com.onedelhi.secure;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class f22 implements vk1 {

    /* renamed from: a */
    public final Map<String, List<e22>> f11806a;

    /* renamed from: b */
    public volatile Map<String, String> f11807b;

    /* renamed from: com.onedelhi.secure.f22$a */
    public static final class C2113a {

        /* renamed from: a */
        public static final String f11808a = "User-Agent";

        /* renamed from: b */
        public static final String f11809b;

        /* renamed from: b */
        public static final Map<String, List<e22>> f11810b;

        /* renamed from: a */
        public Map<String, List<e22>> f11811a = f11810b;

        /* renamed from: a */
        public boolean f11812a = true;

        /* renamed from: b */
        public boolean f11813b = true;

        static {
            String g = m14565g();
            f11809b = g;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(g)) {
                hashMap.put("User-Agent", Collections.singletonList(new C2114b(g)));
            }
            f11810b = Collections.unmodifiableMap(hashMap);
        }

        @hw4
        /* renamed from: g */
        public static String m14565g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt <= 31 && charAt != 9) || charAt >= 127) {
                    charAt = '?';
                }
                sb.append(charAt);
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C2113a mo15722a(@mr2 String str, @mr2 e22 e22) {
            if (this.f11813b && "User-Agent".equalsIgnoreCase(str)) {
                return mo15728h(str, e22);
            }
            mo15726e();
            mo15727f(str).add(e22);
            return this;
        }

        /* renamed from: b */
        public C2113a mo15723b(@mr2 String str, @mr2 String str2) {
            return mo15722a(str, new C2114b(str2));
        }

        /* renamed from: c */
        public f22 mo15724c() {
            this.f11812a = true;
            return new f22(this.f11811a);
        }

        /* renamed from: d */
        public final Map<String, List<e22>> mo15725d() {
            HashMap hashMap = new HashMap(this.f11811a.size());
            for (Map.Entry next : this.f11811a.entrySet()) {
                hashMap.put(next.getKey(), new ArrayList((Collection) next.getValue()));
            }
            return hashMap;
        }

        /* renamed from: e */
        public final void mo15726e() {
            if (this.f11812a) {
                this.f11812a = false;
                this.f11811a = mo15725d();
            }
        }

        /* renamed from: f */
        public final List<e22> mo15727f(String str) {
            List<e22> list = this.f11811a.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f11811a.put(str, arrayList);
            return arrayList;
        }

        /* renamed from: h */
        public C2113a mo15728h(@mr2 String str, @ts2 e22 e22) {
            mo15726e();
            if (e22 == null) {
                this.f11811a.remove(str);
            } else {
                List<e22> f = mo15727f(str);
                f.clear();
                f.add(e22);
            }
            if (this.f11813b && "User-Agent".equalsIgnoreCase(str)) {
                this.f11813b = false;
            }
            return this;
        }

        /* renamed from: i */
        public C2113a mo15729i(@mr2 String str, @ts2 String str2) {
            return mo15728h(str, str2 == null ? null : new C2114b(str2));
        }
    }

    /* renamed from: com.onedelhi.secure.f22$b */
    public static final class C2114b implements e22 {
        @mr2

        /* renamed from: a */
        public final String f11814a;

        public C2114b(@mr2 String str) {
            this.f11814a = str;
        }

        /* renamed from: a */
        public String mo14990a() {
            return this.f11814a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2114b) {
                return this.f11814a.equals(((C2114b) obj).f11814a);
            }
            return false;
        }

        public int hashCode() {
            return this.f11814a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f11814a + '\'' + '}';
        }
    }

    public f22(Map<String, List<e22>> map) {
        this.f11806a = Collections.unmodifiableMap(map);
    }

    @mr2
    /* renamed from: a */
    public final String mo15716a(@mr2 List<e22> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a = list.get(i).mo14990a();
            if (!TextUtils.isEmpty(a)) {
                sb.append(a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final Map<String, String> mo15717b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f11806a.entrySet()) {
            String a = mo15716a((List) next.getValue());
            if (!TextUtils.isEmpty(a)) {
                hashMap.put(next.getKey(), a);
            }
        }
        return hashMap;
    }

    /* renamed from: b0 */
    public Map<String, String> mo15718b0() {
        if (this.f11807b == null) {
            synchronized (this) {
                if (this.f11807b == null) {
                    this.f11807b = Collections.unmodifiableMap(mo15717b());
                }
            }
        }
        return this.f11807b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f22) {
            return this.f11806a.equals(((f22) obj).f11806a);
        }
        return false;
    }

    public int hashCode() {
        return this.f11806a.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f11806a + '}';
    }
}
