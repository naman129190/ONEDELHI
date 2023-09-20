package com.onedelhi.secure;

import android.content.Context;
import com.google.android.gms.maps.model.LatLngBounds;
import com.onedelhi.secure.th1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class df1 {

    /* renamed from: a */
    public LatLngBounds f27397a;

    /* renamed from: a */
    public final of1 f27398a;

    /* renamed from: com.onedelhi.secure.df1$a */
    public class C5017a implements th1.C3629w {

        /* renamed from: a */
        public final /* synthetic */ C5020d f27399a;

        public C5017a(C5020d dVar) {
            this.f27399a = dVar;
        }

        /* renamed from: a */
        public void mo25019a(d33 d33) {
            this.f27399a.mo34380a(df1.this.mo34370i(d33));
        }
    }

    /* renamed from: com.onedelhi.secure.df1$b */
    public class C5018b implements th1.C3623q {

        /* renamed from: a */
        public final /* synthetic */ C5020d f27401a;

        public C5018b(C5020d dVar) {
            this.f27401a = dVar;
        }

        /* renamed from: g */
        public boolean mo25011g(od2 od2) {
            this.f27401a.mo34380a(df1.this.mo34369h(od2));
            return false;
        }
    }

    /* renamed from: com.onedelhi.secure.df1$c */
    public class C5019c implements th1.C3630x {

        /* renamed from: a */
        public final /* synthetic */ C5020d f27403a;

        public C5019c(C5020d dVar) {
            this.f27403a = dVar;
        }

        /* renamed from: a */
        public void mo25020a(f33 f33) {
            this.f27403a.mo34380a(df1.this.mo34371j(f33));
        }
    }

    /* renamed from: com.onedelhi.secure.df1$d */
    public interface C5020d {
        /* renamed from: a */
        void mo34380a(af1 af1);
    }

    public df1(th1 th1, int i, Context context) throws IOException, JSONException {
        this(th1, m45066c(context.getResources().openRawResource(i)));
    }

    public df1(th1 th1, JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f27397a = null;
            jf1 jf1 = new jf1(jSONObject);
            this.f27397a = jf1.mo38609i();
            HashMap hashMap = new HashMap();
            Iterator<af1> it = jf1.mo38610j().iterator();
            while (it.hasNext()) {
                hashMap.put(it.next(), (Object) null);
            }
            this.f27398a = new of1(th1, hashMap);
            return;
        }
        throw new IllegalArgumentException("GeoJSON file cannot be null");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public static JSONObject m45066c(InputStream inputStream) throws IOException, JSONException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    return new JSONObject(sb.toString());
                }
            } catch (Throwable th) {
                bufferedReader.close();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void mo34363a(af1 af1) {
        if (af1 != null) {
            this.f27398a.mo41736a(af1);
            return;
        }
        throw new IllegalArgumentException("Feature cannot be null");
    }

    /* renamed from: b */
    public void mo34364b() {
        this.f27398a.mo41739d();
    }

    /* renamed from: d */
    public LatLngBounds mo34365d() {
        return this.f27397a;
    }

    /* renamed from: e */
    public ff1 mo34366e() {
        return this.f27398a.mo41746k();
    }

    /* renamed from: f */
    public lf1 mo34367f() {
        return this.f27398a.mo41747l();
    }

    /* renamed from: g */
    public nf1 mo34368g() {
        return this.f27398a.mo41748m();
    }

    /* renamed from: h */
    public af1 mo34369h(od2 od2) {
        return this.f27398a.mo41749n(od2);
    }

    /* renamed from: i */
    public af1 mo34370i(d33 d33) {
        return this.f27398a.mo41749n(d33);
    }

    /* renamed from: j */
    public af1 mo34371j(f33 f33) {
        return this.f27398a.mo41749n(f33);
    }

    /* renamed from: k */
    public Iterable<af1> mo34372k() {
        return this.f27398a.mo41750o();
    }

    /* renamed from: l */
    public th1 mo34373l() {
        return this.f27398a.mo41751p();
    }

    /* renamed from: m */
    public boolean mo34374m() {
        return this.f27398a.mo41752q();
    }

    /* renamed from: n */
    public void mo34375n(af1 af1) {
        if (af1 != null) {
            this.f27398a.mo41755t(af1);
            return;
        }
        throw new IllegalArgumentException("Feature cannot be null");
    }

    /* renamed from: o */
    public void mo34376o() {
        this.f27398a.mo41757v();
    }

    /* renamed from: p */
    public void mo34377p(th1 th1) {
        this.f27398a.mo41759x(th1);
    }

    /* renamed from: q */
    public void mo34378q(C5020d dVar) {
        th1 l = mo34373l();
        l.mo24965d0(new C5017a(dVar));
        l.mo24955X(new C5018b(dVar));
        l.mo24967e0(new C5019c(dVar));
    }

    public String toString() {
        return "Collection{" + "\n Bounding box=" + this.f27397a + "\n}\n";
    }
}
