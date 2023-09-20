package com.onedelhi.secure;

import android.content.Context;
import android.os.AsyncTask;
import com.delhitransport.onedelhi.data.AllRoutes;
import com.delhitransport.onedelhi.p001db.DatabaseClient;
import java.util.ArrayList;
import java.util.List;

public class go3 {

    /* renamed from: a */
    public static eo3 f12677a;

    /* renamed from: a */
    public static jv2 f12678a;

    /* renamed from: a */
    public static List<AllRoutes> f12679a = new ArrayList();

    /* renamed from: a */
    public static boolean f12680a;

    /* renamed from: b */
    public static boolean f12681b;

    /* renamed from: c */
    public static boolean f12682c;

    /* renamed from: com.onedelhi.secure.go3$a */
    public class C2260a extends AsyncTask<Void, Void, Void> {
        public C2260a(jv2 jv2) {
            jv2 unused = go3.f12678a = jv2;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                go3.f12677a.delete();
                boolean unused = go3.f12682c = true;
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                boolean unused2 = go3.f12682c = false;
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            go3.f12678a.mo15816b(go3.f12682c);
        }
    }

    /* renamed from: com.onedelhi.secure.go3$b */
    public class C2261b extends AsyncTask<Void, Void, Void> {
        public C2261b(jv2 jv2) {
            jv2 unused = go3.f12678a = jv2;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                List unused = go3.f12679a = go3.f12677a.mo15257a();
                boolean unused2 = go3.f12681b = true;
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                boolean unused3 = go3.f12681b = false;
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            go3.f12678a.mo15815a(go3.f12681b, go3.f12679a);
        }
    }

    /* renamed from: com.onedelhi.secure.go3$c */
    public class C2262c extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f12683a;

        /* JADX WARNING: type inference failed for: r2v0, types: [com.onedelhi.secure.jv2, java.util.ArrayList] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C2262c(com.onedelhi.secure.jv2 r1, com.onedelhi.secure.jv2 r2) {
            /*
                r0 = this;
                r0.f12683a = r2
                r0.<init>()
                com.onedelhi.secure.jv2 unused = com.onedelhi.secure.go3.f12678a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.go3.C2262c.<init>(com.onedelhi.secure.jv2, java.util.ArrayList):void");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                go3.f12677a.insertMultiple(this.f12683a);
                boolean unused = go3.f12680a = true;
                return null;
            } catch (Exception e) {
                boolean unused2 = go3.f12680a = false;
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            go3.f12678a.mo15817g(go3.f12680a);
        }
    }

    /* renamed from: l */
    public static void m15967l(Context context, jv2 jv2) {
        m15969n(context);
        new C2260a(jv2).execute(new Void[0]);
    }

    /* renamed from: m */
    public static void m15968m(Context context, jv2 jv2) {
        m15969n(context);
        new C2261b(jv2).execute(new Void[0]);
    }

    /* renamed from: n */
    public static void m15969n(Context context) {
        f12677a = DatabaseClient.getInstance(context).getAppDatabase().routesDao();
    }

    /* renamed from: o */
    public static void m15970o(Context context, jv2 jv2, ArrayList<AllRoutes> arrayList) {
        m15969n(context);
        new C2262c(jv2, arrayList).execute(new Void[0]);
    }
}
