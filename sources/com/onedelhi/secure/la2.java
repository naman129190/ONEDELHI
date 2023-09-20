package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import com.onedelhi.secure.hl3;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class la2 {

    /* renamed from: a */
    public float f15256a;

    /* renamed from: a */
    public int f15257a = 0;

    /* renamed from: a */
    public Rect f15258a;

    /* renamed from: a */
    public ga2<m12> f15259a;

    /* renamed from: a */
    public final j13 f15260a = new j13();

    /* renamed from: a */
    public k14<p91> f15261a;

    /* renamed from: a */
    public final HashSet<String> f15262a = new HashSet<>();

    /* renamed from: a */
    public List<pd2> f15263a;

    /* renamed from: a */
    public Map<String, List<m12>> f15264a;

    /* renamed from: a */
    public boolean f15265a;

    /* renamed from: b */
    public float f15266b;

    /* renamed from: b */
    public List<m12> f15267b;

    /* renamed from: b */
    public Map<String, sa2> f15268b;

    /* renamed from: c */
    public float f15269c;

    /* renamed from: c */
    public Map<String, m91> f15270c;

    @Deprecated
    /* renamed from: com.onedelhi.secure.la2$b */
    public static class C2710b {

        /* renamed from: com.onedelhi.secure.la2$b$a */
        public static final class C2711a implements xa2<la2>, C2278gu {

            /* renamed from: a */
            public final ou2 f15271a;

            /* renamed from: a */
            public boolean f15272a;

            public C2711a(ou2 ou2) {
                this.f15272a = false;
                this.f15271a = ou2;
            }

            /* renamed from: a */
            public void onResult(la2 la2) {
                if (!this.f15272a) {
                    this.f15271a.mo22096a(la2);
                }
            }

            public void cancel() {
                this.f15272a = true;
            }
        }

        @Deprecated
        /* renamed from: a */
        public static C2278gu m20411a(Context context, String str, ou2 ou2) {
            C2711a aVar = new C2711a(ou2);
            na2.m22544e(context, str).mo15936f(aVar);
            return aVar;
        }

        @ts2
        @Deprecated
        @ly4
        /* renamed from: b */
        public static la2 m20412b(Context context, String str) {
            return na2.m22546g(context, str).mo15104b();
        }

        @Deprecated
        /* renamed from: c */
        public static C2278gu m20413c(InputStream inputStream, ou2 ou2) {
            C2711a aVar = new C2711a(ou2);
            na2.m22549j(inputStream, (String) null).mo15936f(aVar);
            return aVar;
        }

        @ts2
        @Deprecated
        @ly4
        /* renamed from: d */
        public static la2 m20414d(InputStream inputStream) {
            return na2.m22550k(inputStream, (String) null).mo15104b();
        }

        @ts2
        @Deprecated
        @ly4
        /* renamed from: e */
        public static la2 m20415e(InputStream inputStream, boolean z) {
            if (z) {
                p92.m24544e("Lottie now auto-closes input stream!");
            }
            return na2.m22550k(inputStream, (String) null).mo15104b();
        }

        @Deprecated
        /* renamed from: f */
        public static C2278gu m20416f(wv1 wv1, ou2 ou2) {
            C2711a aVar = new C2711a(ou2);
            na2.m22552m(wv1, (String) null).mo15936f(aVar);
            return aVar;
        }

        @Deprecated
        /* renamed from: g */
        public static C2278gu m20417g(String str, ou2 ou2) {
            C2711a aVar = new C2711a(ou2);
            na2.m22555p(str, (String) null).mo15936f(aVar);
            return aVar;
        }

        @ts2
        @Deprecated
        @ly4
        /* renamed from: h */
        public static la2 m20418h(Resources resources, JSONObject jSONObject) {
            return na2.m22557r(jSONObject, (String) null).mo15104b();
        }

        @ly4
        @ts2
        @Deprecated
        /* renamed from: i */
        public static la2 m20419i(wv1 wv1) throws IOException {
            return na2.m22553n(wv1, (String) null).mo15104b();
        }

        @ts2
        @Deprecated
        @ly4
        /* renamed from: j */
        public static la2 m20420j(String str) {
            return na2.m22556q(str, (String) null).mo15104b();
        }

        @Deprecated
        /* renamed from: k */
        public static C2278gu m20421k(Context context, @mf3 int i, ou2 ou2) {
            C2711a aVar = new C2711a(ou2);
            na2.m22558s(context, i).mo15936f(aVar);
            return aVar;
        }
    }

    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: a */
    public void mo19372a(String str) {
        p92.m24544e(str);
        this.f15262a.add(str);
    }

    /* renamed from: b */
    public Rect mo19373b() {
        return this.f15258a;
    }

    /* renamed from: c */
    public k14<p91> mo19374c() {
        return this.f15261a;
    }

    /* renamed from: d */
    public float mo19375d() {
        return (float) ((long) ((mo19376e() / this.f15269c) * 1000.0f));
    }

    /* renamed from: e */
    public float mo19376e() {
        return this.f15266b - this.f15256a;
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: f */
    public float mo19377f() {
        return this.f15266b;
    }

    /* renamed from: g */
    public Map<String, m91> mo19378g() {
        return this.f15270c;
    }

    /* renamed from: h */
    public float mo19379h() {
        return this.f15269c;
    }

    /* renamed from: i */
    public Map<String, sa2> mo19380i() {
        return this.f15268b;
    }

    /* renamed from: j */
    public List<m12> mo19381j() {
        return this.f15267b;
    }

    @ts2
    /* renamed from: k */
    public pd2 mo19382k(String str) {
        this.f15263a.size();
        for (int i = 0; i < this.f15263a.size(); i++) {
            pd2 pd2 = this.f15263a.get(i);
            if (pd2.mo22391a(str)) {
                return pd2;
            }
        }
        return null;
    }

    /* renamed from: l */
    public List<pd2> mo19383l() {
        return this.f15263a;
    }

    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: m */
    public int mo19384m() {
        return this.f15257a;
    }

    /* renamed from: n */
    public j13 mo19385n() {
        return this.f15260a;
    }

    @ts2
    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: o */
    public List<m12> mo19386o(String str) {
        return this.f15264a.get(str);
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: p */
    public float mo19387p() {
        return this.f15256a;
    }

    /* renamed from: q */
    public ArrayList<String> mo19388q() {
        HashSet<String> hashSet = this.f15262a;
        return new ArrayList<>(Arrays.asList(hashSet.toArray(new String[hashSet.size()])));
    }

    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: r */
    public boolean mo19389r() {
        return this.f15265a;
    }

    /* renamed from: s */
    public boolean mo19390s() {
        return !this.f15268b.isEmpty();
    }

    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: t */
    public void mo19391t(int i) {
        this.f15257a += i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (m12 w : this.f15267b) {
            sb.append(w.mo20036w("\t"));
        }
        return sb.toString();
    }

    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: u */
    public void mo19393u(Rect rect, float f, float f2, float f3, List<m12> list, ga2<m12> ga2, Map<String, List<m12>> map, Map<String, sa2> map2, k14<p91> k14, Map<String, m91> map3, List<pd2> list2) {
        this.f15258a = rect;
        this.f15256a = f;
        this.f15266b = f2;
        this.f15269c = f3;
        this.f15267b = list;
        this.f15259a = ga2;
        this.f15264a = map;
        this.f15268b = map2;
        this.f15261a = k14;
        this.f15270c = map3;
        this.f15263a = list2;
    }

    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: v */
    public m12 mo19394v(long j) {
        return this.f15259a.mo16417h(j);
    }

    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: w */
    public void mo19395w(boolean z) {
        this.f15265a = z;
    }

    /* renamed from: x */
    public void mo19396x(boolean z) {
        this.f15260a.mo18080g(z);
    }
}
