package com.onedelhi.secure;

import android.content.Context;
import android.os.AsyncTask;
import com.delhitransport.onedelhi.p001db.DatabaseClient;
import com.delhitransport.onedelhi.p001db.TicketDao;
import com.delhitransport.onedelhi.p001db.UserTickets;
import java.util.List;

public class jd4 {

    /* renamed from: a */
    public static TicketDao f14099a;

    /* renamed from: a */
    public static mv2 f14100a;

    /* renamed from: a */
    public static List<UserTickets> f14101a;

    /* renamed from: a */
    public static boolean f14102a;

    /* renamed from: b */
    public static boolean f14103b;

    /* renamed from: c */
    public static boolean f14104c;

    /* renamed from: com.onedelhi.secure.jd4$a */
    public class C2505a extends AsyncTask<Void, Void, Void> {
        public C2505a(mv2 mv2) {
            mv2 unused = jd4.f14100a = mv2;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                List unused = jd4.f14101a = jd4.f14099a.getAll();
                boolean unused2 = jd4.f14103b = true;
                return null;
            } catch (Exception unused3) {
                boolean unused4 = jd4.f14103b = false;
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            jd4.f14100a.mo7529M(jd4.f14103b, jd4.f14101a);
        }
    }

    /* renamed from: com.onedelhi.secure.jd4$b */
    public class C2506b extends AsyncTask<Void, Void, Void> {
        public C2506b(mv2 mv2) {
            mv2 unused = jd4.f14100a = mv2;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                List unused = jd4.f14101a = jd4.f14099a.getLast();
                boolean unused2 = jd4.f14103b = true;
                return null;
            } catch (Exception unused3) {
                boolean unused4 = jd4.f14103b = false;
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            jd4.f14100a.mo7528F(jd4.f14103b, jd4.f14101a);
        }
    }

    /* renamed from: com.onedelhi.secure.jd4$c */
    public class C2507c extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public final /* synthetic */ UserTickets f14105a;

        /* JADX WARNING: type inference failed for: r2v0, types: [com.onedelhi.secure.mv2, com.delhitransport.onedelhi.db.UserTickets] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C2507c(com.onedelhi.secure.mv2 r1, com.onedelhi.secure.mv2 r2) {
            /*
                r0 = this;
                r0.f14105a = r2
                r0.<init>()
                com.onedelhi.secure.mv2 unused = com.onedelhi.secure.jd4.f14100a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.jd4.C2507c.<init>(com.onedelhi.secure.mv2, com.delhitransport.onedelhi.db.UserTickets):void");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                jd4.f14099a.insert(this.f14105a);
                boolean unused = jd4.f14102a = true;
                return null;
            } catch (Exception unused2) {
                boolean unused3 = jd4.f14102a = false;
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            jd4.f14100a.mo7527B(jd4.f14102a);
        }
    }

    /* renamed from: j */
    public static void m18419j(Context context, mv2 mv2) {
        m18421l(context);
        new C2505a(mv2).execute(new Void[0]);
    }

    /* renamed from: k */
    public static void m18420k(Context context, mv2 mv2) {
        m18421l(context);
        new C2506b(mv2).execute(new Void[0]);
    }

    /* renamed from: l */
    public static void m18421l(Context context) {
        f14099a = DatabaseClient.getInstance(context).getAppDatabase().ticketDao();
    }

    /* renamed from: m */
    public static void m18422m(Context context, mv2 mv2, UserTickets userTickets) {
        m18421l(context);
        new C2507c(mv2, userTickets).execute(new Void[0]);
    }
}
