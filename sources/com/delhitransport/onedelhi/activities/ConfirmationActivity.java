package com.delhitransport.onedelhi.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.C0709m;
import com.delhitransport.onedelhi.models.track.LogItem;
import com.delhitransport.onedelhi.p001db.DatabaseClient;
import com.delhitransport.onedelhi.p001db.UserTickets;
import com.delhitransport.onedelhi.ticket.FareDiscovery;
import com.delhitransport.onedelhi.ticket.Ticket;
import com.delhitransport.onedelhi.ticket.TicketRequest;
import com.delhitransport.onedelhi.viewmodels.GenerateTicketViewModel;
import com.delhitransport.onedelhi.viewmodels.TicketModel;
import com.google.android.gms.common.C1410R;
import com.onedelhi.secure.bu2;
import com.onedelhi.secure.p50;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.ts2;
import java.util.ArrayList;

public class ConfirmationActivity extends BaseActivity {

    /* renamed from: a */
    public static ArrayList<LogItem> f6122a = new ArrayList<>();

    /* renamed from: a */
    public AnimationDrawable f6123a;

    /* renamed from: a */
    public CountDownTimer f6124a;

    /* renamed from: a */
    public final Handler f6125a = new Handler();

    /* renamed from: a */
    public ImageView f6126a;

    /* renamed from: a */
    public TextView f6127a;

    /* renamed from: a */
    public LogItem f6128a;

    /* renamed from: a */
    public FareDiscovery f6129a;

    /* renamed from: a */
    public Ticket f6130a;

    /* renamed from: a */
    public TicketRequest f6131a;

    /* renamed from: a */
    public GenerateTicketViewModel f6132a;

    /* renamed from: a */
    public Boolean f6133a = Boolean.FALSE;

    /* renamed from: a */
    public Runnable f6134a;

    /* renamed from: b */
    public TextView f6135b;

    /* renamed from: e */
    public String f6136e;

    /* renamed from: e */
    public boolean f6137e;

    /* renamed from: f */
    public String f6138f;

    /* renamed from: f */
    public boolean f6139f = false;

    /* renamed from: g */
    public String f6140g;

    /* renamed from: g */
    public boolean f6141g = false;

    /* renamed from: h */
    public String f6142h;

    /* renamed from: i */
    public String f6143i;

    /* renamed from: j */
    public String f6144j;

    /* renamed from: k */
    public String f6145k;

    /* renamed from: l */
    public String f6146l;

    /* renamed from: m */
    public String f6147m;

    /* renamed from: n */
    public String f6148n = pj0.m61166a(-4302569576263L);

    /* renamed from: o */
    public int f6149o;

    /* renamed from: o */
    public String f6150o;

    /* renamed from: p */
    public int f6151p = 0;

    /* renamed from: com.delhitransport.onedelhi.activities.ConfirmationActivity$a */
    public class C1204a implements bu2<Ticket> {
        public C1204a() {
        }

        /* renamed from: a */
        public void mo3946b(Ticket ticket) {
            ConfirmationActivity.m7657g1(ConfirmationActivity.this, pj0.m61166a(-548768159559L));
            ConfirmationActivity.this.mo7540y1(pj0.m61166a(-660437309255L));
            boolean unused = ConfirmationActivity.this.f6139f = true;
            ConfirmationActivity.m7665o1(ConfirmationActivity.this);
            if (ticket != null) {
                if (ConfirmationActivity.this.f6144j.equalsIgnoreCase(pj0.m61166a(-716271884103L))) {
                    LogItem unused2 = ConfirmationActivity.this.f6128a = new LogItem(pj0.m61166a(-1042689398599L), String.format(pj0.m61166a(-724861818695L), new Object[]{pj0.m61166a(-986854823751L), ConfirmationActivity.this.f6145k, ConfirmationActivity.this.f6147m, ticket.toString()}));
                    ConfirmationActivity.f6122a.add(ConfirmationActivity.this.f6128a);
                }
                ConfirmationActivity confirmationActivity = ConfirmationActivity.this;
                ConfirmationActivity.m7657g1(confirmationActivity, ticket.getMessage() + 10);
                String message = ticket.getMessage();
                String description = ticket.getDescription();
                if (message.equalsIgnoreCase(pj0.m61166a(-1107113908039L))) {
                    Ticket unused3 = ConfirmationActivity.this.f6130a = ticket;
                    ConfirmationActivity.this.f6130a.setBooking_id(ConfirmationActivity.this.f6145k);
                    ConfirmationActivity.this.f6130a.setTicket_start_stop_idx(ConfirmationActivity.this.f6129a.getStart_stop_index());
                    ConfirmationActivity.this.f6130a.setTicket_start_stop_name(ConfirmationActivity.this.f6129a.getStart_stop_name());
                    ConfirmationActivity.this.f6130a.setTicket_end_stop_idx(ConfirmationActivity.this.f6129a.getEnd_stop_index());
                    ConfirmationActivity.this.f6130a.setTicket_end_stop_name(ConfirmationActivity.this.f6129a.getEnd_stop_name());
                    ConfirmationActivity.this.f6130a.setTicket_count(ConfirmationActivity.this.f6149o);
                    ConfirmationActivity.this.f6130a.setCategory(ConfirmationActivity.this.f6144j);
                    ConfirmationActivity.this.f6130a.setAc(ConfirmationActivity.this.f6137e);
                    ConfirmationActivity.this.f6130a.setAmount_payable_by_user(ConfirmationActivity.this.f6129a.getAmount_payable_by_user().floatValue());
                    ConfirmationActivity.this.f6130a.setFare_per_ticket(ConfirmationActivity.this.f6129a.getFare_per_ticket());
                    ConfirmationActivity.this.f6130a.setTotal_fare(ConfirmationActivity.this.f6129a.getTotal_fare());
                    ConfirmationActivity.this.mo7535D1();
                    ConfirmationActivity.this.mo7539H1(0);
                    ConfirmationActivity.m7657g1(ConfirmationActivity.this, pj0.m61166a(-1141473646407L));
                    LogItem unused4 = ConfirmationActivity.this.f6128a = new LogItem(pj0.m61166a(-1330452207431L), pj0.m61166a(-1394876716871L));
                    ConfirmationActivity.f6122a.add(ConfirmationActivity.this.f6128a);
                } else {
                    ConfirmationActivity confirmationActivity2 = ConfirmationActivity.this;
                    Toast.makeText(confirmationActivity2, ConfirmationActivity.this.getResources().getString(C1410R.string.booking_failed_due_to) + description, 0).show();
                    ConfirmationActivity confirmationActivity3 = ConfirmationActivity.this;
                    String a = pj0.m61166a(-1583855277895L);
                    LogItem unused5 = confirmationActivity3.f6128a = new LogItem(a, String.format(pj0.m61166a(-1674049591111L), new Object[]{ConfirmationActivity.this.f6145k, ConfirmationActivity.this.f6147m}) + pj0.m61166a(-1880208021319L) + description);
                    ConfirmationActivity.f6122a.add(ConfirmationActivity.this.f6128a);
                    Ticket unused6 = ConfirmationActivity.this.f6130a = null;
                    ConfirmationActivity.this.mo7539H1(1);
                }
            } else {
                Ticket unused7 = ConfirmationActivity.this.f6130a = null;
                ConfirmationActivity.this.mo7539H1(1);
                String unused8 = ConfirmationActivity.this.f6146l = String.format(pj0.m61166a(-1918862726983L), new Object[]{pj0.m61166a(-2245280241479L), ConfirmationActivity.this.f6145k, ConfirmationActivity.this.f6147m});
                LogItem unused9 = ConfirmationActivity.this.f6128a = new LogItem(pj0.m61166a(-2301114816327L), ConfirmationActivity.this.f6146l);
                ConfirmationActivity.f6122a.add(ConfirmationActivity.this.f6128a);
                ConfirmationActivity confirmationActivity4 = ConfirmationActivity.this;
                Toast.makeText(confirmationActivity4, confirmationActivity4.getResources().getString(C1410R.string.no_resp_from_server), 0).show();
            }
            ConfirmationActivity.this.mo7536E1();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.ConfirmationActivity$b */
    public class C1205b extends AsyncTask<Void, Void, Void> {
        public C1205b() {
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            UserTickets userTickets = new UserTickets();
            try {
                userTickets.setAc(ConfirmationActivity.this.f6130a.isAc());
                userTickets.setAmount_payable_by_user(ConfirmationActivity.this.f6130a.getAmount_payable_by_user());
                userTickets.setBooking_id(ConfirmationActivity.this.f6130a.getBooking_id());
                userTickets.setBooking_time(ConfirmationActivity.this.f6130a.getBooking_time());
                userTickets.setBus_agency(ConfirmationActivity.this.f6130a.getBus_agency());
                userTickets.setBus_number(ConfirmationActivity.this.f6130a.getBus_number());
                userTickets.setBus_route_long_name(ConfirmationActivity.this.f6130a.getBus_route_long_name());
                userTickets.setCategory(ConfirmationActivity.this.f6130a.getCategory());
                userTickets.setDescription(ConfirmationActivity.this.f6130a.getDescription());
                userTickets.setFare(ConfirmationActivity.this.f6130a.getTotal_fare());
                userTickets.setFare_per_ticket(ConfirmationActivity.this.f6130a.getFare_per_ticket());
                userTickets.setMessage(ConfirmationActivity.this.f6130a.getMessage());
                userTickets.setTicket_count(ConfirmationActivity.this.f6130a.getTicket_count());
                userTickets.setTicket_end_stop_idx(ConfirmationActivity.this.f6130a.getTicket_end_stop_idx());
                userTickets.setTicket_end_stop_name(ConfirmationActivity.this.f6130a.getTicket_end_stop_name());
                userTickets.setTicket_id(ConfirmationActivity.this.f6130a.getTicket_id());
                userTickets.setTicket_start_stop_idx(ConfirmationActivity.this.f6130a.getTicket_start_stop_idx());
                userTickets.setTicket_start_stop_name(ConfirmationActivity.this.f6130a.getTicket_start_stop_name());
                userTickets.setTotal_fare(ConfirmationActivity.this.f6130a.getTotal_fare());
                userTickets.setTransaction_status(ConfirmationActivity.this.f6130a.getTransaction_status());
                userTickets.setTransaction_type(ConfirmationActivity.this.f6130a.getTransaction_type());
                userTickets.setValidity(ConfirmationActivity.this.f6130a.getValidity());
                userTickets.setValidity_stop_idx(ConfirmationActivity.this.f6130a.getValidity_stop_idx());
            } catch (Exception e) {
                e.printStackTrace();
                ConfirmationActivity confirmationActivity = ConfirmationActivity.this;
                String a = pj0.m61166a(-2365539325767L);
                LogItem unused = confirmationActivity.f6128a = new LogItem(a, pj0.m61166a(-2421373900615L) + e.getMessage());
                ConfirmationActivity.f6122a.add(ConfirmationActivity.this.f6128a);
            }
            try {
                DatabaseClient.getInstance(ConfirmationActivity.this).getAppDatabase().ticketDao().insert(userTickets);
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
                ConfirmationActivity confirmationActivity2 = ConfirmationActivity.this;
                String a2 = pj0.m61166a(-2541632984903L);
                LogItem unused2 = confirmationActivity2.f6128a = new LogItem(a2, pj0.m61166a(-2597467559751L) + e2.getMessage());
                ConfirmationActivity.f6122a.add(ConfirmationActivity.this.f6128a);
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.ConfirmationActivity$c */
    public class C1206c extends CountDownTimer {
        public C1206c(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            Ticket unused = ConfirmationActivity.this.f6130a = null;
            ConfirmationActivity.this.mo7536E1();
            ConfirmationActivity.this.mo7539H1(1);
        }

        public void onTick(long j) {
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.ConfirmationActivity$d */
    public class C1207d implements bu2<Ticket> {
        public C1207d() {
        }

        /* renamed from: a */
        public void mo3946b(Ticket ticket) {
            ConfirmationActivity.m7657g1(ConfirmationActivity.this, pj0.m61166a(-2722021611335L));
            ConfirmationActivity.this.mo7540y1(pj0.m61166a(-2833690761031L));
            boolean unused = ConfirmationActivity.this.f6139f = true;
            ConfirmationActivity.m7665o1(ConfirmationActivity.this);
            if (ticket != null) {
                if (ConfirmationActivity.this.f6144j.equalsIgnoreCase(pj0.m61166a(-2889525335879L))) {
                    LogItem unused2 = ConfirmationActivity.this.f6128a = new LogItem(pj0.m61166a(-3215942850375L), String.format(pj0.m61166a(-2898115270471L), new Object[]{pj0.m61166a(-3160108275527L), ConfirmationActivity.this.f6145k, ConfirmationActivity.this.f6147m, ticket.toString()}));
                    ConfirmationActivity.f6122a.add(ConfirmationActivity.this.f6128a);
                }
                ConfirmationActivity confirmationActivity = ConfirmationActivity.this;
                ConfirmationActivity.m7657g1(confirmationActivity, ticket.getMessage() + 10);
                String message = ticket.getMessage();
                String description = ticket.getDescription();
                if (message.equalsIgnoreCase(pj0.m61166a(-3280367359815L))) {
                    Ticket unused3 = ConfirmationActivity.this.f6130a = ticket;
                    ConfirmationActivity.this.f6130a.setBooking_id(ConfirmationActivity.this.f6145k);
                    ConfirmationActivity.this.f6130a.setTicket_start_stop_idx(ConfirmationActivity.this.f6129a.getStart_stop_index());
                    ConfirmationActivity.this.f6130a.setTicket_start_stop_name(ConfirmationActivity.this.f6129a.getStart_stop_name());
                    ConfirmationActivity.this.f6130a.setTicket_end_stop_idx(ConfirmationActivity.this.f6129a.getEnd_stop_index());
                    ConfirmationActivity.this.f6130a.setTicket_end_stop_name(ConfirmationActivity.this.f6129a.getEnd_stop_name());
                    ConfirmationActivity.this.f6130a.setTicket_count(ConfirmationActivity.this.f6149o);
                    ConfirmationActivity.this.f6130a.setCategory(ConfirmationActivity.this.f6144j);
                    ConfirmationActivity.this.f6130a.setAc(ConfirmationActivity.this.f6137e);
                    ConfirmationActivity.this.f6130a.setAmount_payable_by_user(ConfirmationActivity.this.f6129a.getAmount_payable_by_user().floatValue());
                    ConfirmationActivity.this.f6130a.setFare_per_ticket(ConfirmationActivity.this.f6129a.getFare_per_ticket());
                    ConfirmationActivity.this.f6130a.setTotal_fare(ConfirmationActivity.this.f6129a.getTotal_fare());
                    ConfirmationActivity.this.mo7535D1();
                    ConfirmationActivity.this.mo7539H1(0);
                    ConfirmationActivity.m7657g1(ConfirmationActivity.this, pj0.m61166a(-3314727098183L));
                } else {
                    ConfirmationActivity confirmationActivity2 = ConfirmationActivity.this;
                    Toast.makeText(confirmationActivity2, ConfirmationActivity.this.getResources().getString(C1410R.string.booking_failed_due_to) + description, 0).show();
                    Ticket unused4 = ConfirmationActivity.this.f6130a = null;
                    ConfirmationActivity confirmationActivity3 = ConfirmationActivity.this;
                    String a = pj0.m61166a(-3503705659207L);
                    LogItem unused5 = confirmationActivity3.f6128a = new LogItem(a, String.format(pj0.m61166a(-3602489907015L), new Object[]{ConfirmationActivity.this.f6145k, ConfirmationActivity.this.f6147m}) + pj0.m61166a(-3808648337223L) + description);
                    ConfirmationActivity.f6122a.add(ConfirmationActivity.this.f6128a);
                    ConfirmationActivity.this.mo7539H1(1);
                }
            } else {
                Ticket unused6 = ConfirmationActivity.this.f6130a = null;
                ConfirmationActivity.this.mo7539H1(1);
                String unused7 = ConfirmationActivity.this.f6146l = String.format(pj0.m61166a(-3847303042887L), new Object[]{pj0.m61166a(-4173720557383L), ConfirmationActivity.this.f6145k, ConfirmationActivity.this.f6147m});
                LogItem unused8 = ConfirmationActivity.this.f6128a = new LogItem(pj0.m61166a(-4229555132231L), ConfirmationActivity.this.f6146l);
                ConfirmationActivity.f6122a.add(ConfirmationActivity.this.f6128a);
                ConfirmationActivity confirmationActivity4 = ConfirmationActivity.this;
                Toast.makeText(confirmationActivity4, confirmationActivity4.getResources().getString(C1410R.string.no_resp_from_server), 0).show();
            }
            ConfirmationActivity.this.mo7536E1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public /* synthetic */ void m7655B1() {
        this.f6141g = false;
    }

    /* renamed from: g1 */
    public static /* synthetic */ String m7657g1(ConfirmationActivity confirmationActivity, Object obj) {
        String str = confirmationActivity.f6148n + obj;
        confirmationActivity.f6148n = str;
        return str;
    }

    /* renamed from: o1 */
    public static /* synthetic */ int m7665o1(ConfirmationActivity confirmationActivity) {
        int i = confirmationActivity.f6151p;
        confirmationActivity.f6151p = i + 1;
        return i;
    }

    /* renamed from: A1 */
    public final void mo7533A1() {
        LogItem logItem = new LogItem(pj0.m61166a(-9293321574215L), pj0.m61166a(-9366336018247L));
        this.f6128a = logItem;
        f6122a.add(logItem);
        if (this.f6129a != null) {
            try {
                this.f6132a.confirmation(this.f6131a).mo4926j(this, new C1207d());
            } catch (Exception e) {
                String a = pj0.m61166a(-9447940396871L);
                LogItem logItem2 = new LogItem(a, pj0.m61166a(-9520954840903L) + e.getLocalizedMessage());
                this.f6128a = logItem2;
                f6122a.add(logItem2);
                this.f6130a = null;
                mo7539H1(1);
            }
        } else {
            this.f6130a = null;
            mo7539H1(1);
            this.f6146l = String.format(pj0.m61166a(-9589674317639L), new Object[]{pj0.m61166a(-9817307584327L), this.f6145k, this.f6147m, pj0.m61166a(-9890322028359L)});
            LogItem logItem3 = new LogItem(pj0.m61166a(-9911796864839L), this.f6146l);
            this.f6128a = logItem3;
            f6122a.add(logItem3);
            mo7536E1();
        }
    }

    /* renamed from: C1 */
    public final void mo7534C1() {
        Intent intent = new Intent(this, GenerateTicketActivity2.class);
        intent.putExtra(pj0.m61166a(-8838055040839L), this.f6130a);
        intent.putExtra(pj0.m61166a(-8885299681095L), pj0.m61166a(-8923954386759L));
        intent.putExtra(pj0.m61166a(-8949724190535L), true);
        intent.putExtra(pj0.m61166a(-8971199027015L), this.f6142h);
        intent.putExtra(pj0.m61166a(-9039918503751L), this.f6140g);
        intent.putExtra(pj0.m61166a(-9108637980487L), this.f6138f);
        intent.putExtra(pj0.m61166a(-9168767522631L), this.f6143i);
        intent.putExtra(pj0.m61166a(-9203127260999L), this.f6145k);
        intent.putExtra(pj0.m61166a(-9246076933959L), this.f6129a.getAmount_payable_by_user());
        this.f6125a.removeCallbacks(this.f6134a);
        startActivity(intent);
        finish();
    }

    /* renamed from: D1 */
    public final void mo7535D1() {
        String str;
        if (this.f6144j.equalsIgnoreCase(pj0.m61166a(-7425010800455L))) {
            if (this.f6130a != null) {
                str = String.format(pj0.m61166a(-7433600735047L), new Object[]{pj0.m61166a(-7708478641991L), this.f6145k, this.f6147m, this.f6130a.toString()});
            } else {
                str = String.format(pj0.m61166a(-7760018249543L), new Object[]{pj0.m61166a(-8034896156487L), this.f6145k, this.f6147m, pj0.m61166a(-8086435764039L)});
            }
            this.f6146l = str;
            LogItem logItem = new LogItem(pj0.m61166a(-8107910600519L), this.f6146l);
            this.f6128a = logItem;
            f6122a.add(logItem);
        }
        new C1205b().execute(new Void[0]);
    }

    /* renamed from: E1 */
    public final void mo7536E1() {
        mo7534C1();
    }

    /* renamed from: F1 */
    public final void mo7537F1() {
        this.f6127a.setText(C1410R.string.getting_tickets);
        this.f6126a.setVisibility(0);
        this.f6123a.start();
        this.f6133a = Boolean.FALSE;
    }

    /* renamed from: G1 */
    public void mo7538G1(String str) {
        String.format(pj0.m61166a(-8163745175367L), new Object[]{pj0.m61166a(-8434328115015L), this.f6145k, this.f6147m, str});
        C1206c cVar = new C1206c(5000, 1000);
        this.f6124a = cVar;
        cVar.start();
    }

    /* renamed from: H1 */
    public final void mo7539H1(int i) {
        if (i == 1) {
            this.f6127a.setText(C1410R.string.failed_to_get_ticket);
        }
        this.f6126a.setVisibility(4);
        this.f6133a = Boolean.TRUE;
    }

    public void onBackPressed() {
        if (this.f6133a.booleanValue()) {
            if (this.f6141g) {
                super.onBackPressed();
                mo7540y1(pj0.m61166a(-8485867722567L));
                this.f6125a.removeCallbacks(this.f6134a);
            } else {
                Toast.makeText(this, pj0.m61166a(-8545997264711L), 0).show();
            }
            this.f6141g = true;
            new Handler().postDelayed(new p50(this), 2000);
            return;
        }
        Toast.makeText(this, pj0.m61166a(-8674846283591L), 0).show();
    }

    public void onCreate(@ts2 Bundle bundle) {
        setRequestedOrientation(1);
        super.onCreate(bundle);
        setContentView((int) C1410R.layout.activity_confirmation);
        SharedPreferences sharedPreferences = getSharedPreferences(pj0.m61166a(-4306864543559L), 0);
        this.f6147m = sharedPreferences.getString(pj0.m61166a(-4392763889479L), pj0.m61166a(-4435713562439L));
        this.f6150o = sharedPreferences.getString(pj0.m61166a(-4440008529735L), pj0.m61166a(-4513022973767L));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f6138f = extras.getString(pj0.m61166a(-4525907875655L), pj0.m61166a(-4586037417799L));
            this.f6145k = extras.getString(pj0.m61166a(-4598922319687L), pj0.m61166a(-4641871992647L));
            this.f6136e = extras.getString(pj0.m61166a(-4646166959943L), pj0.m61166a(-4702001534791L));
            this.f6144j = extras.getString(pj0.m61166a(-4719181403975L), pj0.m61166a(-4757836109639L));
            this.f6137e = extras.getBoolean(pj0.m61166a(-4766426044231L), false);
            this.f6129a = (FareDiscovery) extras.get(pj0.m61166a(-4792195848007L));
            this.f6149o = extras.getInt(pj0.m61166a(-4865210292039L), 1);
            this.f6145k = extras.getString(pj0.m61166a(-4951109637959L), pj0.m61166a(-4994059310919L));
            this.f6143i = extras.getString(pj0.m61166a(-4998354278215L), pj0.m61166a(-5062778787655L));
        } else {
            this.f6129a = null;
            extras.getBoolean(pj0.m61166a(-5067073754951L), true);
        }
        this.f6127a = (TextView) findViewById(C1410R.C1412id.tv_status);
        this.f6135b = (TextView) findViewById(C1410R.C1412id.tv_payment);
        ImageView imageView = (ImageView) findViewById(C1410R.C1412id.iv_loading);
        this.f6126a = imageView;
        this.f6123a = (AnimationDrawable) imageView.getDrawable();
        mo7537F1();
        mo7538G1(pj0.m61166a(-5088548591431L));
        this.f6135b.setText(pj0.m61166a(-5127203297095L));
        mo7541z1();
    }

    /* renamed from: y1 */
    public void mo7540y1(String str) {
        CountDownTimer countDownTimer = this.f6124a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* renamed from: z1 */
    public final void mo7541z1() {
        LogItem logItem = new LogItem(pj0.m61166a(-5230282512199L), pj0.m61166a(-5294707021639L));
        this.f6128a = logItem;
        f6122a.add(logItem);
        if (this.f6144j.equalsIgnoreCase(pj0.m61166a(-5333361727303L))) {
            LogItem logItem2 = new LogItem(pj0.m61166a(-5341951661895L), String.format(pj0.m61166a(-5406376171335L), new Object[]{pj0.m61166a(-5621124536135L), this.f6145k, this.f6147m}));
            this.f6128a = logItem2;
            f6122a.add(logItem2);
        }
        if (this.f6129a != null) {
            if (this.f6144j.equalsIgnoreCase(pj0.m61166a(-5676959110983L))) {
                LogItem logItem3 = new LogItem(pj0.m61166a(-5685549045575L), String.format(pj0.m61166a(-5749973555015L), new Object[]{pj0.m61166a(-6127930677063L), this.f6145k, this.f6147m, this.f6129a.toString()}));
                this.f6128a = logItem3;
                f6122a.add(logItem3);
            }
            this.f6131a = new TicketRequest(this.f6129a.getBus_number(), this.f6129a.getTotal_fare(), this.f6138f, this.f6145k, pj0.m61166a(-6179470284615L), this.f6136e, 0);
            TicketModel ticketModel = (TicketModel) new C0709m(this).mo5027a(TicketModel.class);
            if (this.f6144j.equalsIgnoreCase(pj0.m61166a(-6196650153799L))) {
                LogItem logItem4 = new LogItem(pj0.m61166a(-6205240088391L), String.format(pj0.m61166a(-6269664597831L), new Object[]{pj0.m61166a(-6497297864519L), this.f6145k, this.f6147m, this.f6131a.toString()}));
                this.f6128a = logItem4;
                f6122a.add(logItem4);
            }
            this.f6148n += pj0.m61166a(-6557427406663L);
            LogItem logItem5 = new LogItem(pj0.m61166a(-6686276425543L), pj0.m61166a(-6750700934983L));
            this.f6128a = logItem5;
            f6122a.add(logItem5);
            try {
                ticketModel.confirmation(this.f6131a).mo4926j(this, new C1204a());
            } catch (Exception e) {
                LogItem logItem6 = new LogItem(pj0.m61166a(-6879549953863L), pj0.m61166a(-6969744267079L) + e.getLocalizedMessage());
                this.f6128a = logItem6;
                f6122a.add(logItem6);
                this.f6130a = null;
                mo7539H1(1);
            }
        } else {
            this.f6130a = null;
            mo7539H1(1);
            this.f6146l = String.format(pj0.m61166a(-7038463743815L), new Object[]{pj0.m61166a(-7266097010503L), this.f6145k, this.f6147m, pj0.m61166a(-7339111454535L)});
            LogItem logItem7 = new LogItem(pj0.m61166a(-7360586291015L), this.f6146l);
            this.f6128a = logItem7;
            f6122a.add(logItem7);
            mo7536E1();
        }
    }
}
