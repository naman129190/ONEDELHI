package com.onedelhi.secure;

import android.content.Context;
import android.os.AsyncTask;
import com.delhitransport.onedelhi.data.AllStops;
import com.delhitransport.onedelhi.p001db.DatabaseClient;
import com.delhitransport.onedelhi.p001db.StopsDao;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.onedelhi.secure.iq */
public class C2456iq {

    /* renamed from: a */
    public static StopsDao f13799a;

    /* renamed from: a */
    public static kv2 f13800a;

    /* renamed from: a */
    public static List<AllStops> f13801a = new ArrayList();

    /* renamed from: a */
    public static boolean f13802a;

    /* renamed from: b */
    public static boolean f13803b;

    /* renamed from: c */
    public static boolean f13804c;

    /* renamed from: com.onedelhi.secure.iq$a */
    public class C2457a extends AsyncTask<Void, Void, Void> {
        public C2457a(kv2 kv2) {
            kv2 unused = C2456iq.f13800a = kv2;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                List unused = C2456iq.f13801a = C2456iq.f13799a.getAllStops();
                boolean unused2 = C2456iq.f13803b = true;
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                boolean unused3 = C2456iq.f13803b = false;
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            C2456iq.f13800a.mo7854J(C2456iq.f13803b, C2456iq.f13801a);
        }
    }

    /* renamed from: com.onedelhi.secure.iq$b */
    public class C2458b extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f13805a;

        /* JADX WARNING: type inference failed for: r2v0, types: [com.onedelhi.secure.kv2, java.util.ArrayList] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C2458b(com.onedelhi.secure.kv2 r1, com.onedelhi.secure.kv2 r2) {
            /*
                r0 = this;
                r0.f13805a = r2
                r0.<init>()
                com.onedelhi.secure.kv2 unused = com.onedelhi.secure.C2456iq.f13800a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C2456iq.C2458b.<init>(com.onedelhi.secure.kv2, java.util.ArrayList):void");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                C2456iq.f13799a.insertMultiple(this.f13805a);
                boolean unused = C2456iq.f13802a = true;
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                boolean unused2 = C2456iq.f13802a = false;
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            C2456iq.f13800a.mo7855m(C2456iq.f13802a);
        }
    }

    /* renamed from: com.onedelhi.secure.iq$c */
    public class C2459c extends AsyncTask<Void, Void, Void> {
        public C2459c(kv2 kv2) {
            kv2 unused = C2456iq.f13800a = kv2;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                C2456iq.f13799a.delete();
                boolean unused = C2456iq.f13804c = true;
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                boolean unused2 = C2456iq.f13804c = false;
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            C2456iq.f13800a.mo7860u(C2456iq.f13804c);
        }
    }

    /* renamed from: l */
    public static void m17793l(Context context, kv2 kv2) {
        m17795n(context);
        new C2459c(kv2).execute(new Void[0]);
    }

    /* renamed from: m */
    public static void m17794m(Context context, kv2 kv2) {
        m17795n(context);
        new C2457a(kv2).execute(new Void[0]);
    }

    /* renamed from: n */
    public static void m17795n(Context context) {
        f13799a = DatabaseClient.getInstance(context).getAppDatabase().allStopsDao();
    }

    /* renamed from: o */
    public static void m17796o(Context context, kv2 kv2, ArrayList<AllStops> arrayList) {
        m17795n(context);
        new C2458b(kv2, arrayList).execute(new Void[0]);
    }
}
