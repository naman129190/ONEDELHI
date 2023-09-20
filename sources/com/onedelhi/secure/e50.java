package com.onedelhi.secure;

import android.util.Log;
import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.internal.C4367b;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

public class e50 {
    @hw4(otherwise = 3)

    /* renamed from: a */
    public static final Charset f27694a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static final Pattern f27695a = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: b */
    public static final Pattern f27696b = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a */
    public final u40 f27697a;

    /* renamed from: a */
    public final Set<BiConsumer<String, C4367b>> f27698a = new HashSet();

    /* renamed from: a */
    public final Executor f27699a;

    /* renamed from: b */
    public final u40 f27700b;

    public e50(Executor executor, u40 u40, u40 u402) {
        this.f27699a = executor;
        this.f27697a = u40;
        this.f27700b = u402;
    }

    @ts2
    /* renamed from: g */
    public static C4367b m46026g(u40 u40) {
        return u40.mo45385g();
    }

    @ts2
    /* renamed from: i */
    public static Double m46027i(u40 u40, String str) {
        C4367b g = m46026g(u40);
        if (g == null) {
            return null;
        }
        try {
            return Double.valueOf(g.mo30027f().getDouble(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static Set<String> m46028j(u40 u40) {
        HashSet hashSet = new HashSet();
        C4367b g = m46026g(u40);
        if (g == null) {
            return hashSet;
        }
        Iterator<String> keys = g.mo30027f().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    /* renamed from: l */
    public static TreeSet<String> m46029l(String str, C4367b bVar) {
        TreeSet<String> treeSet = new TreeSet<>();
        Iterator<String> keys = bVar.mo30027f().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next.startsWith(str)) {
                treeSet.add(next);
            }
        }
        return treeSet;
    }

    @ts2
    /* renamed from: n */
    public static Long m46030n(u40 u40, String str) {
        C4367b g = m46026g(u40);
        if (g == null) {
            return null;
        }
        try {
            return Long.valueOf(g.mo30027f().getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @ts2
    /* renamed from: p */
    public static String m46031p(u40 u40, String str) {
        C4367b g = m46026g(u40);
        if (g == null) {
            return null;
        }
        try {
            return g.mo30027f().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: s */
    public static void m46033s(String str, String str2) {
        Log.w(n61.f32430b, String.format("No value of type '%s' exists for parameter key '%s'.", new Object[]{str2, str}));
    }

    /* renamed from: b */
    public void mo34844b(BiConsumer<String, C4367b> biConsumer) {
        synchronized (this.f27698a) {
            this.f27698a.add(biConsumer);
        }
    }

    /* renamed from: c */
    public final void mo34845c(String str, C4367b bVar) {
        if (bVar != null) {
            synchronized (this.f27698a) {
                for (BiConsumer<String, C4367b> d50 : this.f27698a) {
                    this.f27699a.execute(new d50(d50, str, bVar));
                }
            }
        }
    }

    /* renamed from: d */
    public Map<String, u61> mo34846d() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(m46028j(this.f27697a));
        hashSet.addAll(m46028j(this.f27700b));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, mo34853q(str));
        }
        return hashMap;
    }

    /* renamed from: e */
    public boolean mo34847e(String str) {
        String p = m46031p(this.f27697a, str);
        if (p != null) {
            if (f27695a.matcher(p).matches()) {
                mo34845c(str, m46026g(this.f27697a));
                return true;
            } else if (f27696b.matcher(p).matches()) {
                mo34845c(str, m46026g(this.f27697a));
                return false;
            }
        }
        String p2 = m46031p(this.f27700b, str);
        if (p2 != null) {
            if (f27695a.matcher(p2).matches()) {
                return true;
            }
            if (f27696b.matcher(p2).matches()) {
                return false;
            }
        }
        m46033s(str, "Boolean");
        return false;
    }

    /* renamed from: f */
    public byte[] mo34848f(String str) {
        String p = m46031p(this.f27697a, str);
        if (p != null) {
            mo34845c(str, m46026g(this.f27697a));
            return p.getBytes(f27694a);
        }
        String p2 = m46031p(this.f27700b, str);
        if (p2 != null) {
            return p2.getBytes(f27694a);
        }
        m46033s(str, "ByteArray");
        return n61.f32428a;
    }

    /* renamed from: h */
    public double mo34849h(String str) {
        Double i = m46027i(this.f27697a, str);
        if (i != null) {
            mo34845c(str, m46026g(this.f27697a));
            return i.doubleValue();
        }
        Double i2 = m46027i(this.f27700b, str);
        if (i2 != null) {
            return i2.doubleValue();
        }
        m46033s(str, "Double");
        return 0.0d;
    }

    /* renamed from: k */
    public Set<String> mo34850k(String str) {
        if (str == null) {
            str = "";
        }
        TreeSet treeSet = new TreeSet();
        C4367b g = m46026g(this.f27697a);
        if (g != null) {
            treeSet.addAll(m46029l(str, g));
        }
        C4367b g2 = m46026g(this.f27700b);
        if (g2 != null) {
            treeSet.addAll(m46029l(str, g2));
        }
        return treeSet;
    }

    /* renamed from: m */
    public long mo34851m(String str) {
        Long n = m46030n(this.f27697a, str);
        if (n != null) {
            mo34845c(str, m46026g(this.f27697a));
            return n.longValue();
        }
        Long n2 = m46030n(this.f27700b, str);
        if (n2 != null) {
            return n2.longValue();
        }
        m46033s(str, "Long");
        return 0;
    }

    /* renamed from: o */
    public String mo34852o(String str) {
        String p = m46031p(this.f27697a, str);
        if (p != null) {
            mo34845c(str, m46026g(this.f27697a));
            return p;
        }
        String p2 = m46031p(this.f27700b, str);
        if (p2 != null) {
            return p2;
        }
        m46033s(str, "String");
        return "";
    }

    /* renamed from: q */
    public u61 mo34853q(String str) {
        String p = m46031p(this.f27697a, str);
        if (p != null) {
            mo34845c(str, m46026g(this.f27697a));
            return new v61(p, 2);
        }
        String p2 = m46031p(this.f27700b, str);
        if (p2 != null) {
            return new v61(p2, 1);
        }
        m46033s(str, "FirebaseRemoteConfigValue");
        return new v61("", 0);
    }
}
