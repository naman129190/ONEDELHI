package com.onedelhi.secure;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.onedelhi.secure.th1;
import com.onedelhi.secure.xd3;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class wz1 {

    /* renamed from: a */
    public static final int f37268a = 50;

    /* renamed from: a */
    public static final String f37269a = "KmlRenderer";

    /* renamed from: a */
    public Context f37270a;

    /* renamed from: a */
    public final mb2<String, Bitmap> f37271a = new mb2<>(50);

    /* renamed from: a */
    public th1 f37272a;

    /* renamed from: a */
    public final ArrayList<String> f37273a = new ArrayList<>();

    /* renamed from: a */
    public HashMap<tz1, Object> f37274a;

    /* renamed from: a */
    public boolean f37275a = false;

    /* renamed from: b */
    public final ArrayList<String> f37276b = new ArrayList<>();

    /* renamed from: b */
    public HashMap<String, String> f37277b;

    /* renamed from: b */
    public boolean f37278b = false;

    /* renamed from: c */
    public ArrayList<kz1> f37279c;

    /* renamed from: c */
    public HashMap<String, xz1> f37280c;

    /* renamed from: c */
    public boolean f37281c = false;

    /* renamed from: d */
    public HashMap<String, xz1> f37282d = new HashMap<>();

    /* renamed from: e */
    public HashMap<oz1, wi1> f37283e;

    /* renamed from: com.onedelhi.secure.wz1$a */
    public class C7211a implements th1.C3608b {
        public C7211a() {
        }

        /* renamed from: b */
        public View mo7564b(od2 od2) {
            return null;
        }

        /* renamed from: f */
        public View mo7565f(od2 od2) {
            String str;
            View inflate = LayoutInflater.from(wz1.this.f37270a).inflate(xd3.C7237f.amu_info_window, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(xd3.C7235d.window);
            if (od2.mo21874e() != null) {
                str = od2.mo21877g() + "<br>" + od2.mo21874e();
            } else {
                str = od2.mo21877g();
            }
            textView.setText(Html.fromHtml(str));
            return inflate;
        }
    }

    /* renamed from: com.onedelhi.secure.wz1$b */
    public class C7212b extends AsyncTask<String, Void, Bitmap> {

        /* renamed from: a */
        public final String f37286a;

        public C7212b(String str) {
            this.f37286a = str;
        }

        /* renamed from: a */
        public Bitmap doInBackground(String... strArr) {
            try {
                return BitmapFactory.decodeStream((InputStream) FirebasePerfUrlConnection.getContent(new URL(this.f37286a)));
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.f37286a);
            } catch (IOException e) {
                Log.e(wz1.f37269a, "Image [" + this.f37286a + "] download issue", e);
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap == null) {
                Log.e(wz1.f37269a, "Image at this URL could not be found " + this.f37286a);
                return;
            }
            wz1.this.f37271a.mo20272j(this.f37286a, bitmap);
            if (wz1.this.f37275a) {
                wz1 wz1 = wz1.this;
                wz1.mo46954o(this.f37286a, wz1.f37283e, true);
                wz1 wz12 = wz1.this;
                wz12.mo46953n(this.f37286a, wz12.f37279c, true);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.wz1$c */
    public class C7213c extends AsyncTask<String, Void, Bitmap> {

        /* renamed from: a */
        public final String f37288a;

        public C7213c(String str) {
            this.f37288a = str;
        }

        /* renamed from: a */
        public Bitmap doInBackground(String... strArr) {
            try {
                return BitmapFactory.decodeStream((InputStream) FirebasePerfUrlConnection.getContent(new URL(this.f37288a)));
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.f37288a);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap == null) {
                Log.e(wz1.f37269a, "Image at this URL could not be found " + this.f37288a);
                return;
            }
            wz1.this.f37271a.mo20272j(this.f37288a, bitmap);
            if (wz1.this.f37275a) {
                wz1 wz1 = wz1.this;
                wz1.mo46957r(this.f37288a, wz1.f37274a);
                wz1 wz12 = wz1.this;
                wz12.mo46950k(this.f37288a, wz12.f37279c);
            }
        }
    }

    public wz1(th1 th1, Context context) {
        this.f37270a = context;
        this.f37272a = th1;
    }

    /* renamed from: F */
    public static boolean m69733F(kz1 kz1, boolean z) {
        return z && (!kz1.mo39607o("visibility") || Integer.parseInt(kz1.mo39600h("visibility")) != 0);
    }

    /* renamed from: L */
    public static boolean m69734L(tz1 tz1) {
        return !tz1.mo45343g("visibility") || Integer.parseInt(tz1.mo45340d("visibility")) != 0;
    }

    /* renamed from: R */
    public static void m69735R(HashMap<tz1, Object> hashMap) {
        for (Object next : hashMap.values()) {
            if (next instanceof od2) {
                ((od2) next).mo21885n();
            } else if (next instanceof f33) {
                ((f33) next).mo15759o();
            } else if (next instanceof d33) {
                ((d33) next).mo14476n();
            }
        }
    }

    /* renamed from: T */
    public static C3798vl m69736T(Bitmap bitmap, Double d) {
        return C3858wl.m30941d(Bitmap.createScaledBitmap(bitmap, (int) (((double) bitmap.getWidth()) * d.doubleValue()), (int) (((double) bitmap.getHeight()) * d.doubleValue()), false));
    }

    /* renamed from: A */
    public final Object mo46928A(tz1 tz1, nz1 nz1, xz1 xz1, xz1 xz12, boolean z) {
        String a = nz1.mo41500a();
        boolean g = tz1.mo45343g("drawOrder");
        float f = 0.0f;
        if (g) {
            try {
                f = Float.parseFloat(tz1.mo45340d("drawOrder"));
            } catch (NumberFormatException unused) {
                g = false;
            }
        }
        if (a.equals("Point")) {
            od2 y = mo46964y(tz1, (uz1) nz1, xz1, xz12);
            y.mo21897z(z);
            if (g) {
                y.mo21868A(f);
            }
            return y;
        } else if (a.equals("LineString")) {
            f33 t = mo46959t((qz1) nz1, xz1, xz12);
            t.mo15770z(z);
            if (g) {
                t.mo15742B(f);
            }
            return t;
        } else if (a.equals("Polygon")) {
            d33 z2 = mo46965z((vz1) nz1, xz1, xz12);
            z2.mo14487y(z);
            if (g) {
                z2.mo14488z(f);
            }
            return z2;
        } else if (!a.equals(rz1.f34809a)) {
            return null;
        } else {
            return mo46961v(tz1, (rz1) nz1, xz1, xz12, z);
        }
    }

    /* renamed from: B */
    public void mo46929B(HashMap<String, String> hashMap, HashMap<String, xz1> hashMap2) {
        for (String next : hashMap.keySet()) {
            String str = hashMap.get(next);
            if (hashMap2.containsKey(str)) {
                hashMap2.put(next, hashMap2.get(str));
            }
        }
    }

    /* renamed from: C */
    public final void mo46930C() {
        this.f37272a.mo24933B(new C7211a());
    }

    /* renamed from: D */
    public final void mo46931D() {
        this.f37281c = true;
        Iterator<String> it = this.f37276b.iterator();
        while (it.hasNext()) {
            new C7212b(it.next()).execute(new String[0]);
            it.remove();
        }
    }

    /* renamed from: E */
    public final void mo46932E() {
        this.f37278b = true;
        Iterator<String> it = this.f37273a.iterator();
        while (it.hasNext()) {
            new C7213c(it.next()).execute(new String[0]);
            it.remove();
        }
    }

    /* renamed from: G */
    public Iterable<oz1> mo46933G() {
        return this.f37283e.keySet();
    }

    /* renamed from: H */
    public Iterable<tz1> mo46934H() {
        return this.f37274a.keySet();
    }

    /* renamed from: I */
    public th1 mo46935I() {
        return this.f37272a;
    }

    /* renamed from: J */
    public Iterable<kz1> mo46936J() {
        return this.f37279c;
    }

    /* renamed from: K */
    public final xz1 mo46937K(String str) {
        return this.f37282d.get(str) != null ? this.f37282d.get(str) : this.f37282d.get((Object) null);
    }

    /* renamed from: M */
    public boolean mo46938M() {
        return this.f37274a.size() > 0;
    }

    /* renamed from: N */
    public boolean mo46939N() {
        return this.f37279c.size() > 0;
    }

    /* renamed from: O */
    public final void mo46940O(Iterable<kz1> iterable) {
        for (kz1 next : iterable) {
            m69735R(next.mo39598f());
            mo46941P(next.mo39595c());
            mo46940O(next.mo39594b());
        }
    }

    /* renamed from: P */
    public final void mo46941P(HashMap<oz1, wi1> hashMap) {
        for (wi1 l : hashMap.values()) {
            l.mo26560l();
        }
    }

    /* renamed from: Q */
    public void mo46942Q() {
        m69735R(this.f37274a);
        mo46941P(this.f37283e);
        if (mo46939N()) {
            mo46940O(mo46936J());
        }
        this.f37275a = false;
        this.f37282d.clear();
    }

    /* renamed from: S */
    public final void mo46943S(xz1 xz1, HashMap<tz1, Object> hashMap, tz1 tz1) {
        double h = xz1.mo47472h();
        ((od2) hashMap.get(tz1)).mo21890s(m69736T(this.f37271a.mo20268f(xz1.mo47473i()), Double.valueOf(h)));
    }

    /* renamed from: U */
    public final void mo46944U(g33 g33, xz1 xz1) {
        g33 l = xz1.mo47476l();
        if (xz1.mo47484t("outlineColor")) {
            g33.mo16295R2(l.mo16298U2());
        }
        if (xz1.mo47484t(yz1.f38148j)) {
            g33.mo16313j3(l.mo16304a3());
        }
        if (xz1.mo47482r()) {
            g33.mo16295R2(xz1.m70949a(l.mo16298U2()));
        }
    }

    /* renamed from: V */
    public final void mo46945V(sd2 sd2, xz1 xz1, String str) {
        sd2 j = xz1.mo47474j();
        if (xz1.mo47484t(yz1.f38140b)) {
            sd2.mo24330f3(j.mo24320V2());
        }
        if (xz1.mo47484t(yz1.f38143e)) {
            sd2.mo24310L2(j.mo24314P2(), j.mo24315Q2());
        }
        if (xz1.mo47484t("markerColor")) {
            sd2.mo24324Z2(j.mo24316R2());
        }
        if (xz1.mo47484t("iconUrl")) {
            mo46960u(xz1.mo47473i(), sd2);
        } else if (str != null) {
            mo46960u(str, sd2);
        }
    }

    /* renamed from: W */
    public final void mo46946W(e33 e33, xz1 xz1) {
        e33 k = xz1.mo47475k();
        if (xz1.mo47479o() && xz1.mo47484t("fillColor")) {
            e33.mo15010P2(k.mo15012R2());
        }
        if (xz1.mo47480p()) {
            if (xz1.mo47484t("outlineColor")) {
                e33.mo15023c3(k.mo15015U2());
            }
            if (xz1.mo47484t(yz1.f38148j)) {
                e33.mo15026f3(k.mo15018X2());
            }
        }
        if (xz1.mo47483s()) {
            e33.mo15010P2(xz1.m70949a(k.mo15012R2()));
        }
    }

    /* renamed from: X */
    public void mo46947X(th1 th1) {
        mo46942Q();
        this.f37272a = th1;
        mo46958s();
    }

    /* renamed from: Y */
    public final void mo46948Y(xz1 xz1, od2 od2, tz1 tz1) {
        String d;
        boolean g = tz1.mo45343g("name");
        boolean g2 = tz1.mo45343g("description");
        boolean n = xz1.mo47478n();
        boolean containsKey = xz1.mo47471f().containsKey("text");
        if (n && containsKey) {
            d = xz1.mo47471f().get("text");
        } else if (n && g) {
            d = tz1.mo45340d("name");
        } else if (g && g2) {
            od2.mo21896y(tz1.mo45340d("name"));
            od2.mo21894w(tz1.mo45340d("description"));
            mo46930C();
        } else if (g2) {
            d = tz1.mo45340d("description");
        } else {
            return;
        }
        od2.mo21896y(d);
        mo46930C();
    }

    /* renamed from: Z */
    public void mo46949Z(HashMap<String, xz1> hashMap, HashMap<String, String> hashMap2, HashMap<tz1, Object> hashMap3, ArrayList<kz1> arrayList, HashMap<oz1, wi1> hashMap4) {
        this.f37280c = hashMap;
        this.f37277b = hashMap2;
        this.f37274a = hashMap3;
        this.f37279c = arrayList;
        this.f37283e = hashMap4;
    }

    /* renamed from: k */
    public final void mo46950k(String str, Iterable<kz1> iterable) {
        for (kz1 next : iterable) {
            mo46957r(str, next.mo39598f());
            if (next.mo39604l()) {
                mo46950k(str, next.mo39594b());
            }
        }
    }

    /* renamed from: l */
    public final void mo46951l(Iterable<kz1> iterable, boolean z) {
        for (kz1 next : iterable) {
            boolean F = m69733F(next, z);
            if (next.mo39603k() != null) {
                this.f37282d.putAll(next.mo39603k());
            }
            if (next.mo39602j() != null) {
                mo46929B(next.mo39602j(), this.f37282d);
            }
            mo46952m(next, F);
            if (next.mo39604l()) {
                mo46951l(next.mo39594b(), F);
            }
        }
    }

    /* renamed from: m */
    public final void mo46952m(kz1 kz1, boolean z) {
        for (tz1 next : kz1.mo39597e()) {
            kz1.mo39608p(next, mo46962w(next, z && m69734L(next)));
        }
    }

    /* renamed from: n */
    public final void mo46953n(String str, Iterable<kz1> iterable, boolean z) {
        for (kz1 next : iterable) {
            boolean F = m69733F(next, z);
            mo46954o(str, next.mo39595c(), F);
            if (next.mo39604l()) {
                mo46953n(str, next.mo39594b(), F);
            }
        }
    }

    /* renamed from: o */
    public final void mo46954o(String str, HashMap<oz1, wi1> hashMap, boolean z) {
        C3798vl d = C3858wl.m30941d(this.f37271a.mo20268f(str));
        for (oz1 next : hashMap.keySet()) {
            if (next.mo42311b().equals(str)) {
                wi1 b = this.f37272a.mo24960b(next.mo42310a().mo26939X2(d));
                if (!z) {
                    b.mo26570v(false);
                }
                hashMap.put(next, b);
            }
        }
    }

    /* renamed from: p */
    public final void mo46955p(HashMap<oz1, wi1> hashMap) {
        for (oz1 next : hashMap.keySet()) {
            String b = next.mo42311b();
            if (!(b == null || next.mo42312c() == null)) {
                if (this.f37271a.mo20268f(b) != null) {
                    mo46954o(b, this.f37283e, true);
                } else if (!this.f37276b.contains(b)) {
                    this.f37276b.add(b);
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo46956q(HashMap<oz1, wi1> hashMap, Iterable<kz1> iterable) {
        mo46955p(hashMap);
        for (kz1 next : iterable) {
            mo46956q(next.mo39595c(), next.mo39594b());
        }
    }

    /* renamed from: r */
    public final void mo46957r(String str, HashMap<tz1, Object> hashMap) {
        for (tz1 next : hashMap.keySet()) {
            xz1 xz1 = this.f37282d.get(next.mo45341e());
            xz1 b = next.mo45338b();
            if ("Point".equals(next.mo45337a().mo41500a())) {
                boolean z = true;
                boolean z2 = b != null && str.equals(b.mo47473i());
                if (xz1 == null || !str.equals(xz1.mo47473i())) {
                    z = false;
                }
                if (z2) {
                    mo46943S(b, hashMap, next);
                } else if (z) {
                    mo46943S(xz1, hashMap, next);
                }
            }
        }
    }

    /* renamed from: s */
    public void mo46958s() {
        this.f37282d.putAll(this.f37280c);
        mo46929B(this.f37277b, this.f37282d);
        mo46956q(this.f37283e, this.f37279c);
        mo46951l(this.f37279c, true);
        mo46963x(this.f37274a);
        if (!this.f37281c) {
            mo46931D();
        }
        if (!this.f37278b) {
            mo46932E();
        }
        this.f37275a = true;
    }

    /* renamed from: t */
    public final f33 mo46959t(qz1 qz1, xz1 xz1, xz1 xz12) {
        g33 l = xz1.mo47476l();
        l.mo16290M2(qz1.mo41501b());
        if (xz12 != null) {
            mo46944U(l, xz12);
        } else if (xz1.mo47482r()) {
            l.mo16295R2(xz1.m70949a(l.mo16298U2()));
        }
        return this.f37272a.mo24966e(l);
    }

    /* renamed from: u */
    public final void mo46960u(String str, sd2 sd2) {
        if (this.f37271a.mo20268f(str) != null) {
            sd2.mo24324Z2(C3858wl.m30941d(this.f37271a.mo20268f(str)));
        } else if (!this.f37273a.contains(str)) {
            this.f37273a.add(str);
        }
    }

    /* renamed from: v */
    public final ArrayList<Object> mo46961v(tz1 tz1, rz1 rz1, xz1 xz1, xz1 xz12, boolean z) {
        ArrayList<Object> arrayList = new ArrayList<>();
        Iterator<nz1> it = rz1.mo41501b().iterator();
        while (it.hasNext()) {
            arrayList.add(mo46928A(tz1, it.next(), xz1, xz12, z));
        }
        return arrayList;
    }

    /* renamed from: w */
    public final Object mo46962w(tz1 tz1, boolean z) {
        if (tz1.mo45337a() == null) {
            return null;
        }
        return mo46928A(tz1, tz1.mo45337a(), mo46937K(tz1.mo45341e()), tz1.mo45338b(), z);
    }

    /* renamed from: x */
    public final void mo46963x(HashMap<tz1, Object> hashMap) {
        for (tz1 next : hashMap.keySet()) {
            hashMap.put(next, mo46962w(next, m69734L(next)));
        }
    }

    /* renamed from: y */
    public final od2 mo46964y(tz1 tz1, uz1 uz1, xz1 xz1, xz1 xz12) {
        sd2 j = xz1.mo47474j();
        j.mo24329e3(uz1.mo41501b());
        String i = xz1.mo47473i();
        if (xz12 != null) {
            mo46945V(j, xz12, i);
        } else if (i != null) {
            mo46960u(xz1.mo47473i(), j);
        }
        od2 c = this.f37272a.mo24962c(j);
        mo46948Y(xz1, c, tz1);
        return c;
    }

    /* renamed from: z */
    public final d33 mo46965z(vz1 vz1, xz1 xz1, xz1 xz12) {
        e33 k = xz1.mo47475k();
        k.mo15007M2(vz1.mo46451e());
        Iterator<ArrayList<LatLng>> it = vz1.mo46450d().iterator();
        while (it.hasNext()) {
            k.mo15008N2(it.next());
        }
        if (xz12 != null) {
            mo46946W(k, xz12);
        } else if (xz1.mo47483s()) {
            k.mo15010P2(xz1.m70949a(k.mo15012R2()));
        }
        return this.f37272a.mo24964d(k);
    }
}
