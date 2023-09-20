package com.onedelhi.secure;

import android.content.Context;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.C4367b;
import com.google.firebase.remoteconfig.internal.C4370c;
import com.google.firebase.remoteconfig.internal.C4374d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class n61 {

    /* renamed from: a */
    public static final double f32423a = 0.0d;

    /* renamed from: a */
    public static final int f32424a = 0;

    /* renamed from: a */
    public static final long f32425a = 0;

    /* renamed from: a */
    public static final String f32426a = "";

    /* renamed from: a */
    public static final boolean f32427a = false;

    /* renamed from: a */
    public static final byte[] f32428a = new byte[0];

    /* renamed from: b */
    public static final int f32429b = 1;

    /* renamed from: b */
    public static final String f32430b = "FirebaseRemoteConfig";

    /* renamed from: c */
    public static final int f32431c = 2;

    /* renamed from: d */
    public static final int f32432d = -1;

    /* renamed from: e */
    public static final int f32433e = 0;

    /* renamed from: f */
    public static final int f32434f = 1;

    /* renamed from: g */
    public static final int f32435g = 2;

    /* renamed from: a */
    public final Context f32436a;

    /* renamed from: a */
    public final C4370c f32437a;

    /* renamed from: a */
    public final C4374d f32438a;

    /* renamed from: a */
    public final e50 f32439a;

    /* renamed from: a */
    public final f50 f32440a;

    /* renamed from: a */
    public final o41 f32441a;
    @ts2

    /* renamed from: a */
    public final s31 f32442a;

    /* renamed from: a */
    public final u40 f32443a;

    /* renamed from: a */
    public final w31 f32444a;

    /* renamed from: a */
    public final Executor f32445a;

    /* renamed from: b */
    public final u40 f32446b;

    /* renamed from: c */
    public final u40 f32447c;

    public n61(Context context, w31 w31, o41 o41, @ts2 s31 s31, Executor executor, u40 u40, u40 u402, u40 u403, C4370c cVar, e50 e50, C4374d dVar, f50 f50) {
        this.f32436a = context;
        this.f32444a = w31;
        this.f32441a = o41;
        this.f32442a = s31;
        this.f32445a = executor;
        this.f32443a = u40;
        this.f32446b = u402;
        this.f32447c = u403;
        this.f32437a = cVar;
        this.f32439a = e50;
        this.f32438a = dVar;
        this.f32440a = f50;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ w94 m57917A(w94 w94, w94 w942, w94 w943) throws Exception {
        if (!w94.mo17590v() || w94.mo17586r() == null) {
            return ha4.m16572g(Boolean.FALSE);
        }
        C4367b bVar = (C4367b) w94.mo17586r();
        return (!w942.mo17590v() || m57937z(bVar, (C4367b) w942.mo17586r())) ? this.f32446b.mo45388m(bVar).mo17582n(this.f32445a, new d61(this)) : ha4.m16572g(Boolean.FALSE);
    }

    /* renamed from: B */
    public static /* synthetic */ r61 m57918B(w94 w94, w94 w942) throws Exception {
        return (r61) w94.mo17586r();
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ w94 m57921E(Void voidR) throws Exception {
        return mo40971j();
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ Void m57922F() throws Exception {
        this.f32446b.mo45383d();
        this.f32443a.mo45383d();
        this.f32447c.mo45383d();
        this.f32438a.mo30065a();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ Void m57923G(t61 t61) throws Exception {
        this.f32438a.mo30078n(t61);
        return null;
    }

    @hw4
    /* renamed from: Q */
    public static List<Map<String, String>> m57925Q(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    @mr2
    /* renamed from: t */
    public static n61 m57935t() {
        return m57936u(w31.m68755p());
    }

    @mr2
    /* renamed from: u */
    public static n61 m57936u(@mr2 w31 w31) {
        return ((uh3) w31.mo46526l(uh3.class)).mo45601f();
    }

    /* renamed from: z */
    public static boolean m57937z(C4367b bVar, @ts2 C4367b bVar2) {
        return bVar2 == null || !bVar.mo30028g().equals(bVar2.mo30028g());
    }

    /* renamed from: I */
    public final boolean mo40962I(w94<C4367b> w94) {
        if (!w94.mo17590v()) {
            return false;
        }
        this.f32443a.mo45383d();
        if (w94.mo17586r() != null) {
            mo40970R(w94.mo17586r().mo30024d());
            return true;
        }
        Log.e(f32430b, "Activated configs written to disk are null.");
        return true;
    }

    @mr2
    /* renamed from: J */
    public w94<Void> mo40963J() {
        return ha4.m16569d(this.f32445a, new l61(this));
    }

    @mr2
    /* renamed from: K */
    public w94<Void> mo40964K(@mr2 t61 t61) {
        return ha4.m16569d(this.f32445a, new m61(this, t61));
    }

    /* renamed from: L */
    public void mo40965L(boolean z) {
        this.f32440a.mo35781e(z);
    }

    @mr2
    /* renamed from: M */
    public w94<Void> mo40966M(@ez4 int i) {
        return mo40968O(wh0.m69353a(this.f32436a, i));
    }

    @mr2
    /* renamed from: N */
    public w94<Void> mo40967N(@mr2 Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            boolean z = value instanceof byte[];
            String str = (String) next.getKey();
            if (z) {
                hashMap.put(str, new String((byte[]) value));
            } else {
                hashMap.put(str, value.toString());
            }
        }
        return mo40968O(hashMap);
    }

    /* renamed from: O */
    public final w94<Void> mo40968O(Map<String, String> map) {
        try {
            return this.f32447c.mo45388m(C4367b.m35165j().mo30034b(map).mo30033a()).mo17592x(g41.m49075a(), h61.f29532a);
        } catch (JSONException e) {
            Log.e(f32430b, "The provided defaults map could not be processed.", e);
            return ha4.m16572g(null);
        }
    }

    /* renamed from: P */
    public void mo40969P() {
        this.f32446b.mo45384f();
        this.f32447c.mo45384f();
        this.f32443a.mo45384f();
    }

    @hw4
    /* renamed from: R */
    public void mo40970R(@mr2 JSONArray jSONArray) {
        if (this.f32442a != null) {
            try {
                this.f32442a.mo44195m(m57925Q(jSONArray));
            } catch (JSONException e) {
                Log.e(f32430b, "Could not parse ABT experiments from the JSON response.", e);
            } catch (C6733s1 e2) {
                Log.w(f32430b, "Could not update ABT experiments.", e2);
            }
        }
    }

    @mr2
    /* renamed from: j */
    public w94<Boolean> mo40971j() {
        w94<C4367b> f = this.f32443a.mo45384f();
        w94<C4367b> f2 = this.f32446b.mo45384f();
        return ha4.m16576k(f, f2).mo17584p(this.f32445a, new e61(this, f, f2));
    }

    @mr2
    /* renamed from: k */
    public k50 mo40972k(@mr2 j50 j50) {
        return this.f32440a.mo35778b(j50);
    }

    @mr2
    /* renamed from: l */
    public w94<r61> mo40973l() {
        w94<C4367b> f = this.f32446b.mo45384f();
        w94<C4367b> f2 = this.f32447c.mo45384f();
        w94<C4367b> f3 = this.f32443a.mo45384f();
        w94 d = ha4.m16569d(this.f32445a, new k61(this));
        return ha4.m16576k(f, f2, f3, d, this.f32441a.mo40943d(), this.f32441a.mo40942c(false)).mo17582n(this.f32445a, new f61(d));
    }

    @mr2
    /* renamed from: m */
    public w94<Void> mo40974m() {
        return this.f32437a.mo30047i().mo17592x(g41.m49075a(), j61.f30583a);
    }

    @mr2
    /* renamed from: n */
    public w94<Void> mo40975n(long j) {
        return this.f32437a.mo30048j(j).mo17592x(g41.m49075a(), i61.f30088a);
    }

    @mr2
    /* renamed from: o */
    public w94<Boolean> mo40976o() {
        return mo40974m().mo17592x(this.f32445a, new g61(this));
    }

    @mr2
    /* renamed from: p */
    public Map<String, u61> mo40977p() {
        return this.f32439a.mo34846d();
    }

    /* renamed from: q */
    public boolean mo40978q(@mr2 String str) {
        return this.f32439a.mo34847e(str);
    }

    /* renamed from: r */
    public double mo40979r(@mr2 String str) {
        return this.f32439a.mo34849h(str);
    }

    @mr2
    /* renamed from: s */
    public r61 mo40980s() {
        return this.f32438a.mo30068d();
    }

    @mr2
    /* renamed from: v */
    public Set<String> mo40981v(@mr2 String str) {
        return this.f32439a.mo34850k(str);
    }

    /* renamed from: w */
    public long mo40982w(@mr2 String str) {
        return this.f32439a.mo34851m(str);
    }

    @mr2
    /* renamed from: x */
    public String mo40983x(@mr2 String str) {
        return this.f32439a.mo34852o(str);
    }

    @mr2
    /* renamed from: y */
    public u61 mo40984y(@mr2 String str) {
        return this.f32439a.mo34853q(str);
    }
}
