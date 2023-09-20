package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import com.delhitransport.onedelhi.data.Stops;
import com.delhitransport.onedelhi.p001db.DatabaseClient;
import com.delhitransport.onedelhi.p001db.DirectionsStopDao;
import java.util.ArrayList;
import java.util.List;

public class a44 {

    /* renamed from: a */
    public static DirectionsStopDao f8725a;

    /* renamed from: a */
    public static lv2 f8726a;

    /* renamed from: a */
    public static List<Stops> f8727a = new ArrayList();

    /* renamed from: a */
    public static boolean f8728a;

    /* renamed from: b */
    public static boolean f8729b;

    /* renamed from: c */
    public static boolean f8730c;

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.onedelhi.secure.a44$a */
    public class C1648a extends AsyncTask<Void, Void, Void> {
        public C1648a(lv2 lv2) {
            lv2 unused = a44.f8726a = lv2;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                a44.f8725a.delete();
                boolean unused = a44.f8730c = true;
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                boolean unused2 = a44.f8730c = false;
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            a44.f8726a.mo19919e(a44.f8730c, false, (String) null);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.onedelhi.secure.a44$b */
    public class C1649b extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public final /* synthetic */ String f8731a;

        /* JADX WARNING: type inference failed for: r2v0, types: [com.onedelhi.secure.lv2, java.lang.String] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C1649b(com.onedelhi.secure.lv2 r1, com.onedelhi.secure.lv2 r2) {
            /*
                r0 = this;
                r0.f8731a = r2
                r0.<init>()
                com.onedelhi.secure.lv2 unused = com.onedelhi.secure.a44.f8726a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.a44.C1649b.<init>(com.onedelhi.secure.lv2, java.lang.String):void");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                List unused = a44.f8727a = a44.f8725a.getStops(this.f8731a);
                boolean unused2 = a44.f8729b = a44.f8727a.size() > 0;
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                boolean unused3 = a44.f8729b = false;
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            a44.f8726a.mo19920i(a44.f8729b, a44.f8727a);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.onedelhi.secure.a44$c */
    public class C1650c extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public final /* synthetic */ String f8732a;

        /* renamed from: a */
        public final /* synthetic */ ArrayList f8733a;

        public C1650c(lv2 lv2, ArrayList arrayList, String str) {
            this.f8733a = arrayList;
            this.f8732a = str;
            lv2 unused = a44.f8726a = lv2;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                a44.f8725a.insert((ArrayList<Stops>) this.f8733a);
                boolean unused = a44.f8728a = true;
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                boolean unused2 = a44.f8728a = false;
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            a44.f8726a.mo19919e(a44.f8728a, true, this.f8732a);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.onedelhi.secure.a44$d */
    public class C1651d extends AsyncTask<Void, Void, Void> {
        public C1651d(lv2 lv2) {
            lv2 unused = a44.f8726a = lv2;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                List unused = a44.f8727a = a44.f8725a.getAll();
                boolean unused2 = a44.f8729b = a44.f8727a.size() > 0;
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                boolean unused3 = a44.f8729b = false;
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            a44.f8726a.mo19920i(a44.f8729b, a44.f8727a);
        }
    }

    /* renamed from: l */
    public static void m10781l(Context context, lv2 lv2) {
        m10784o(context);
        new C1648a(lv2).execute(new Void[0]);
    }

    /* renamed from: m */
    public static void m10782m(Context context, lv2 lv2) {
        m10784o(context);
        new C1651d(lv2).execute(new Void[0]);
    }

    /* renamed from: n */
    public static void m10783n(Context context, lv2 lv2, String str) {
        m10784o(context);
        new C1649b(lv2, str).execute(new Void[0]);
    }

    /* renamed from: o */
    public static void m10784o(Context context) {
        f8725a = DatabaseClient.getInstance(context).getAppDatabase().stopsDao();
    }

    /* renamed from: p */
    public static void m10785p(Context context, lv2 lv2, ArrayList<Stops> arrayList, String str) {
        m10784o(context);
        new C1650c(lv2, arrayList, str).execute(new Void[0]);
    }
}
