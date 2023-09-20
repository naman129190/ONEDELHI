package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import com.delhitransport.onedelhi.data.PastSearchTripPlanner;
import com.delhitransport.onedelhi.models.directions.AllStops;
import com.delhitransport.onedelhi.p001db.DatabaseClient;
import com.delhitransport.onedelhi.p001db.PastTripPlannerSearchDao;
import java.util.ArrayList;
import java.util.List;

public class vi4 {

    /* renamed from: a */
    public static PastTripPlannerSearchDao f21801a;

    /* renamed from: a */
    public static nv2 f21802a;

    /* renamed from: a */
    public static List<PastSearchTripPlanner> f21803a;

    /* renamed from: a */
    public static boolean f21804a;

    /* renamed from: b */
    public static boolean f21805b;

    /* renamed from: c */
    public static boolean f21806c;

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.onedelhi.secure.vi4$a */
    public class C3790a extends AsyncTask<Void, Void, Void> {
        public C3790a(nv2 nv2) {
            nv2 unused = vi4.f21802a = nv2;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                vi4.f21801a.delete();
                boolean unused = vi4.f21804a = true;
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                boolean unused2 = vi4.f21804a = false;
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            vi4.f21802a.mo21496h(vi4.f21804a);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.onedelhi.secure.vi4$b */
    public class C3791b extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public final /* synthetic */ String f21807a;

        /* JADX WARNING: type inference failed for: r2v0, types: [com.onedelhi.secure.nv2, java.lang.String] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C3791b(com.onedelhi.secure.nv2 r1, com.onedelhi.secure.nv2 r2) {
            /*
                r0 = this;
                r0.f21807a = r2
                r0.<init>()
                com.onedelhi.secure.nv2 unused = com.onedelhi.secure.vi4.f21802a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vi4.C3791b.<init>(com.onedelhi.secure.nv2, java.lang.String):void");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                List unused = vi4.f21803a = vi4.f21801a.getAll(this.f21807a);
                boolean unused2 = vi4.f21805b = vi4.f21803a.size() > 0;
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                boolean unused3 = vi4.f21805b = false;
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            vi4.f21802a.mo21495c(vi4.f21805b, vi4.f21803a);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.onedelhi.secure.vi4$c */
    public class C3792c extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public final /* synthetic */ int f21808a;

        /* renamed from: a */
        public final /* synthetic */ AllStops f21809a;

        public C3792c(nv2 nv2, AllStops allStops, int i) {
            this.f21809a = allStops;
            this.f21808a = i;
            nv2 unused = vi4.f21802a = nv2;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                vi4.f21801a.insert(new PastSearchTripPlanner(this.f21809a.getId(), this.f21809a.getName(), this.f21809a.getStop_type(), this.f21809a.getNext_stop(), this.f21808a, this.f21809a.getLat(), this.f21809a.getLng()));
                boolean unused = vi4.f21806c = true;
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                boolean unused2 = vi4.f21806c = false;
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            vi4.f21802a.mo21496h(vi4.f21806c);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.onedelhi.secure.vi4$d */
    public class C3793d extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public final /* synthetic */ int f21810a;

        /* renamed from: a */
        public final /* synthetic */ String f21811a;

        /* renamed from: b */
        public final /* synthetic */ String f21812b;

        public C3793d(nv2 nv2, int i, String str, String str2) {
            this.f21810a = i;
            this.f21811a = str;
            this.f21812b = str2;
            nv2 unused = vi4.f21802a = nv2;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                vi4.f21801a.update(this.f21810a, this.f21811a, this.f21812b);
                boolean unused = vi4.f21806c = true;
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                boolean unused2 = vi4.f21806c = false;
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            vi4.f21802a.mo21496h(vi4.f21806c);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.onedelhi.secure.vi4$e */
    public class C3794e extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f21813a;

        /* JADX WARNING: type inference failed for: r2v0, types: [com.onedelhi.secure.nv2, java.util.ArrayList] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C3794e(com.onedelhi.secure.nv2 r1, com.onedelhi.secure.nv2 r2) {
            /*
                r0 = this;
                r0.f21813a = r2
                r0.<init>()
                com.onedelhi.secure.nv2 unused = com.onedelhi.secure.vi4.f21802a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vi4.C3794e.<init>(com.onedelhi.secure.nv2, java.util.ArrayList):void");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                List unused = vi4.f21803a = vi4.f21801a.getAll((ArrayList<String>) this.f21813a);
                boolean unused2 = vi4.f21805b = true;
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                boolean unused3 = vi4.f21805b = false;
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            vi4.f21802a.mo21495c(vi4.f21805b, vi4.f21803a);
        }
    }

    /* renamed from: l */
    public static void m30126l(Context context, nv2 nv2) {
        m30129o(context);
        new C3790a(nv2).execute(new Void[0]);
    }

    /* renamed from: m */
    public static void m30127m(Context context, nv2 nv2, String str) {
        m30129o(context);
        new C3791b(nv2, str).execute(new Void[0]);
    }

    /* renamed from: n */
    public static void m30128n(Context context, nv2 nv2, ArrayList<String> arrayList) {
        m30129o(context);
        new C3794e(nv2, arrayList).execute(new Void[0]);
    }

    /* renamed from: o */
    public static void m30129o(Context context) {
        f21801a = DatabaseClient.getInstance(context).getAppDatabase().pastTripPlannerSearchDao();
    }

    /* renamed from: p */
    public static void m30130p(Context context, nv2 nv2, AllStops allStops, int i) {
        m30129o(context);
        new C3792c(nv2, allStops, i).execute(new Void[0]);
    }

    /* renamed from: q */
    public static void m30131q(Context context, nv2 nv2, String str, String str2, int i) {
        m30129o(context);
        new C3793d(nv2, i, str2, str).execute(new Void[0]);
    }
}
