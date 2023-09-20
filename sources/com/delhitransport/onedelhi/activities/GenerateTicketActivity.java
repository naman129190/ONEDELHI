package com.delhitransport.onedelhi.activities;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.CountDownTimer;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.C0709m;
import com.delhitransport.onedelhi.p001db.DatabaseAccess;
import com.delhitransport.onedelhi.p001db.DatabaseClient;
import com.delhitransport.onedelhi.p001db.UserTickets;
import com.delhitransport.onedelhi.ticket.FareDiscovery;
import com.delhitransport.onedelhi.ticket.Issue;
import com.delhitransport.onedelhi.ticket.IssueRequest;
import com.delhitransport.onedelhi.ticket.LastTicket;
import com.delhitransport.onedelhi.ticket.Ticket;
import com.delhitransport.onedelhi.ticket.TicketRequest;
import com.delhitransport.onedelhi.viewmodels.TicketModel;
import com.google.android.gms.common.C1410R;
import com.google.android.material.snackbar.Snackbar;
import com.onedelhi.secure.C7256xi;
import com.onedelhi.secure.C7363yi;
import com.onedelhi.secure.bu2;
import com.onedelhi.secure.gv1;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.rf4;
import com.onedelhi.secure.uv1;
import com.onedelhi.secure.vy4;
import com.onedelhi.secure.yl2;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class GenerateTicketActivity extends BaseActivity {

    /* renamed from: a */
    public AlertDialog f6385a;

    /* renamed from: a */
    public Intent f6386a;

    /* renamed from: a */
    public CountDownTimer f6387a;

    /* renamed from: a */
    public Button f6388a;

    /* renamed from: a */
    public ImageView f6389a;

    /* renamed from: a */
    public RelativeLayout f6390a;

    /* renamed from: a */
    public TextView f6391a;

    /* renamed from: a */
    public CoordinatorLayout f6392a;

    /* renamed from: a */
    public FareDiscovery f6393a;

    /* renamed from: a */
    public Ticket f6394a;

    /* renamed from: a */
    public TicketModel f6395a;

    /* renamed from: a */
    public final SimpleDateFormat f6396a;

    /* renamed from: a */
    public final HashMap<List<String>, List<String>> f6397a = new HashMap<>();

    /* renamed from: b */
    public AlertDialog f6398b;

    /* renamed from: b */
    public ImageView f6399b;

    /* renamed from: b */
    public RelativeLayout f6400b;

    /* renamed from: b */
    public TextView f6401b;

    /* renamed from: b */
    public final SimpleDateFormat f6402b;

    /* renamed from: c */
    public ImageView f6403c;

    /* renamed from: c */
    public RelativeLayout f6404c;

    /* renamed from: c */
    public TextView f6405c;

    /* renamed from: c */
    public final SimpleDateFormat f6406c;

    /* renamed from: d */
    public RelativeLayout f6407d;

    /* renamed from: d */
    public TextView f6408d;

    /* renamed from: e */
    public TextView f6409e;

    /* renamed from: e */
    public String f6410e;

    /* renamed from: e */
    public boolean f6411e;

    /* renamed from: f */
    public TextView f6412f;

    /* renamed from: f */
    public String f6413f;

    /* renamed from: f */
    public boolean f6414f;

    /* renamed from: g */
    public TextView f6415g;

    /* renamed from: g */
    public String f6416g;

    /* renamed from: g */
    public boolean f6417g = false;

    /* renamed from: h */
    public TextView f6418h;

    /* renamed from: h */
    public String f6419h = null;

    /* renamed from: i */
    public TextView f6420i;

    /* renamed from: i */
    public String f6421i = pj0.m61166a(-25403743901511L);

    /* renamed from: j */
    public TextView f6422j;

    /* renamed from: j */
    public String f6423j;

    /* renamed from: k */
    public TextView f6424k;

    /* renamed from: k */
    public String f6425k = pj0.m61166a(-25408038868807L);

    /* renamed from: l */
    public TextView f6426l;

    /* renamed from: l */
    public String f6427l;

    /* renamed from: m */
    public TextView f6428m;

    /* renamed from: m */
    public String f6429m;

    /* renamed from: n */
    public TextView f6430n;

    /* renamed from: n */
    public String f6431n = pj0.m61166a(-25412333836103L);

    /* renamed from: o */
    public int f6432o;

    /* renamed from: o */
    public String f6433o;

    /* renamed from: p */
    public int f6434p;

    /* renamed from: p */
    public String f6435p;

    /* renamed from: q */
    public String f6436q;

    /* renamed from: com.delhitransport.onedelhi.activities.GenerateTicketActivity$a */
    public class C1235a implements View.OnClickListener {
        public C1235a() {
        }

        public void onClick(View view) {
            try {
                GenerateTicketActivity generateTicketActivity = GenerateTicketActivity.this;
                generateTicketActivity.mo7647S1(generateTicketActivity.f6394a.getBus_number(), GenerateTicketActivity.this.f6394a.getBus_route_long_name(), GenerateTicketActivity.this.f6394a.getBooking_time(), GenerateTicketActivity.this.f6394a.getTicket_id(), GenerateTicketActivity.this.f6394a.getBooking_id(), String.valueOf(GenerateTicketActivity.this.f6394a.getTotal_fare()), GenerateTicketActivity.this.f6394a.getValidity());
            } catch (Exception unused) {
                GenerateTicketActivity generateTicketActivity2 = GenerateTicketActivity.this;
                Toast.makeText(generateTicketActivity2, generateTicketActivity2.getResources().getString(C1410R.string.some_error_occurred), 0).show();
            }
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GenerateTicketActivity$b */
    public class C1236b extends AsyncTask<Void, Void, List<UserTickets>> {
        public C1236b() {
        }

        /* renamed from: a */
        public List<UserTickets> doInBackground(Void... voidArr) {
            return DatabaseClient.getInstance(GenerateTicketActivity.this.getApplicationContext()).getAppDatabase().ticketDao().getLast();
        }

        /* renamed from: b */
        public void onPostExecute(List<UserTickets> list) {
            super.onPostExecute(list);
            try {
                GenerateTicketActivity generateTicketActivity = GenerateTicketActivity.this;
                Ticket unused = generateTicketActivity.f6394a = generateTicketActivity.mo7640H1(list.get(0));
                GenerateTicketActivity.this.mo7652X1();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                Ticket unused2 = GenerateTicketActivity.this.f6394a = null;
                GenerateTicketActivity.this.mo7643K1();
            }
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GenerateTicketActivity$c */
    public class C1237c extends AsyncTask<Void, Void, Void> {
        public C1237c() {
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            UserTickets userTickets = new UserTickets();
            try {
                userTickets.setAc(GenerateTicketActivity.this.f6394a.isAc());
                userTickets.setAmount_payable_by_user(GenerateTicketActivity.this.f6394a.getAmount_payable_by_user());
                userTickets.setBooking_id(GenerateTicketActivity.this.f6394a.getBooking_id());
                userTickets.setBooking_time(GenerateTicketActivity.this.f6394a.getBooking_time());
                userTickets.setBus_agency(GenerateTicketActivity.this.f6394a.getBus_agency());
                userTickets.setBus_number(GenerateTicketActivity.this.f6394a.getBus_number());
                userTickets.setBus_route_long_name(GenerateTicketActivity.this.f6394a.getBus_route_long_name());
                userTickets.setCategory(GenerateTicketActivity.this.f6394a.getCategory());
                userTickets.setDescription(GenerateTicketActivity.this.f6394a.getDescription());
                userTickets.setFare(GenerateTicketActivity.this.f6394a.getTotal_fare());
                userTickets.setFare_per_ticket(GenerateTicketActivity.this.f6394a.getFare_per_ticket());
                userTickets.setMessage(GenerateTicketActivity.this.f6394a.getMessage());
                userTickets.setTicket_count(GenerateTicketActivity.this.f6394a.getTicket_count());
                userTickets.setTicket_end_stop_idx(GenerateTicketActivity.this.f6394a.getTicket_end_stop_idx());
                userTickets.setTicket_end_stop_name(GenerateTicketActivity.this.f6394a.getTicket_end_stop_name());
                userTickets.setTicket_id(GenerateTicketActivity.this.f6394a.getTicket_id());
                userTickets.setTicket_start_stop_idx(GenerateTicketActivity.this.f6394a.getTicket_start_stop_idx());
                userTickets.setTicket_start_stop_name(GenerateTicketActivity.this.f6394a.getTicket_start_stop_name());
                userTickets.setTotal_fare(GenerateTicketActivity.this.f6394a.getTotal_fare());
                userTickets.setTransaction_status(GenerateTicketActivity.this.f6394a.getTransaction_status());
                userTickets.setTransaction_type(GenerateTicketActivity.this.f6394a.getTransaction_type());
                userTickets.setValidity(GenerateTicketActivity.this.f6394a.getValidity());
                userTickets.setValidity_stop_idx(GenerateTicketActivity.this.f6394a.getValidity_stop_idx());
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                DatabaseClient.getInstance(GenerateTicketActivity.this).getAppDatabase().ticketDao().insert(userTickets);
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GenerateTicketActivity$d */
    public class C1238d implements View.OnClickListener {
        public C1238d() {
        }

        public void onClick(View view) {
            Intent unused = GenerateTicketActivity.this.f6386a = new Intent(GenerateTicketActivity.this, AllTicketsActivity.class);
            GenerateTicketActivity.this.f6386a.putExtra(pj0.m61166a(-24317117175623L), GenerateTicketActivity.this.f6410e);
            GenerateTicketActivity generateTicketActivity = GenerateTicketActivity.this;
            generateTicketActivity.startActivity(generateTicketActivity.f6386a);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GenerateTicketActivity$e */
    public class C1239e implements bu2<Ticket> {
        public C1239e() {
        }

        /* renamed from: a */
        public void mo3946b(Ticket ticket) {
            GenerateTicketActivity.this.mo7638F1();
            boolean unused = GenerateTicketActivity.this.f6414f = true;
            if (ticket != null) {
                String message = ticket.getMessage();
                String description = ticket.getDescription();
                if (message.equalsIgnoreCase(pj0.m61166a(-24360066848583L))) {
                    Ticket unused2 = GenerateTicketActivity.this.f6394a = ticket;
                    GenerateTicketActivity.this.f6394a.setBooking_id(GenerateTicketActivity.this.f6421i);
                    GenerateTicketActivity.this.f6394a.setTicket_start_stop_idx(GenerateTicketActivity.this.f6393a.getStart_stop_index());
                    GenerateTicketActivity.this.f6394a.setTicket_start_stop_name(GenerateTicketActivity.this.f6393a.getStart_stop_name());
                    GenerateTicketActivity.this.f6394a.setTicket_end_stop_idx(GenerateTicketActivity.this.f6393a.getEnd_stop_index());
                    GenerateTicketActivity.this.f6394a.setTicket_end_stop_name(GenerateTicketActivity.this.f6393a.getEnd_stop_name());
                    GenerateTicketActivity.this.f6394a.setTicket_count(Integer.parseInt(GenerateTicketActivity.this.f6429m));
                    GenerateTicketActivity.this.f6394a.setCategory(GenerateTicketActivity.this.f6423j);
                    GenerateTicketActivity.this.f6394a.setAc(GenerateTicketActivity.this.f6411e);
                    GenerateTicketActivity.this.f6394a.setAmount_payable_by_user(GenerateTicketActivity.this.f6393a.getAmount_payable_by_user().floatValue());
                    GenerateTicketActivity.this.f6394a.setFare_per_ticket(GenerateTicketActivity.this.f6393a.getFare_per_ticket());
                    GenerateTicketActivity.this.f6394a.setTotal_fare(GenerateTicketActivity.this.f6393a.getTotal_fare());
                    GenerateTicketActivity.this.mo7646R1();
                } else {
                    GenerateTicketActivity generateTicketActivity = GenerateTicketActivity.this;
                    Toast.makeText(generateTicketActivity, GenerateTicketActivity.this.getResources().getString(C1410R.string.booking_failed_due_to) + description, 0).show();
                    return;
                }
            } else {
                String unused3 = GenerateTicketActivity.this.f6419h = pj0.m61166a(-24394426586951L);
                boolean unused4 = GenerateTicketActivity.this.f6414f = false;
                GenerateTicketActivity generateTicketActivity2 = GenerateTicketActivity.this;
                Toast.makeText(generateTicketActivity2, generateTicketActivity2.getResources().getString(C1410R.string.some_error_occurred), 0).show();
            }
            GenerateTicketActivity.this.mo7652X1();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GenerateTicketActivity$f */
    public class C1240f implements bu2<LastTicket> {
        public C1240f() {
        }

        /* renamed from: a */
        public void mo3946b(LastTicket lastTicket) {
            GenerateTicketActivity.this.mo7638F1();
            if (lastTicket == null || !lastTicket.getMessage().equalsIgnoreCase(pj0.m61166a(-24398721554247L)) || lastTicket.getLastTicket() == null) {
                Ticket unused = GenerateTicketActivity.this.f6394a = null;
            } else {
                Ticket unused2 = GenerateTicketActivity.this.f6394a = lastTicket.getLastTicket();
                GenerateTicketActivity.this.mo7646R1();
            }
            GenerateTicketActivity.this.mo7652X1();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GenerateTicketActivity$g */
    public class C1241g extends CountDownTimer {
        public C1241g(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            if (GenerateTicketActivity.this.f6398b != null) {
                GenerateTicketActivity.this.f6398b.dismiss();
            }
            GenerateTicketActivity generateTicketActivity = GenerateTicketActivity.this;
            Toast.makeText(generateTicketActivity, generateTicketActivity.getResources().getString(C1410R.string.some_error_occurred), 0).show();
            GenerateTicketActivity.this.onBackPressed();
        }

        public void onTick(long j) {
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GenerateTicketActivity$h */
    public class C1242h implements RadioGroup.OnCheckedChangeListener {
        public C1242h() {
        }

        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
            if (i != -1) {
                String unused = GenerateTicketActivity.this.f6425k = radioButton.getText().toString();
            }
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GenerateTicketActivity$i */
    public class C1243i implements View.OnClickListener {
        public C1243i() {
        }

        public void onClick(View view) {
            if (GenerateTicketActivity.this.f6385a != null) {
                GenerateTicketActivity.this.f6385a.dismiss();
            }
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GenerateTicketActivity$j */
    public class C1244j implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ EditText f6446a;

        /* renamed from: a */
        public final /* synthetic */ TextView f6447a;

        /* renamed from: b */
        public final /* synthetic */ EditText f6449b;

        /* renamed from: b */
        public final /* synthetic */ String f6450b;

        /* renamed from: c */
        public final /* synthetic */ String f6451c;

        /* renamed from: d */
        public final /* synthetic */ String f6452d;

        /* renamed from: e */
        public final /* synthetic */ String f6453e;

        /* renamed from: f */
        public final /* synthetic */ String f6454f;

        /* renamed from: g */
        public final /* synthetic */ String f6455g;

        /* renamed from: h */
        public final /* synthetic */ String f6456h;

        /* renamed from: com.delhitransport.onedelhi.activities.GenerateTicketActivity$j$a */
        public class C1245a implements bu2<Issue> {
            public C1245a() {
            }

            /* renamed from: a */
            public void mo3946b(Issue issue) {
                Toast toast;
                if (issue == null || !issue.getMessage().equalsIgnoreCase(pj0.m61166a(-24433081292615L))) {
                    GenerateTicketActivity generateTicketActivity = GenerateTicketActivity.this;
                    toast = Toast.makeText(generateTicketActivity, generateTicketActivity.getResources().getString(C1410R.string.some_error_occurred), 0);
                } else {
                    toast = Toast.makeText(GenerateTicketActivity.this, issue.getDisplay_message(), 0);
                }
                toast.show();
                if (GenerateTicketActivity.this.f6385a != null) {
                    GenerateTicketActivity.this.f6385a.dismiss();
                }
            }
        }

        public C1244j(TextView textView, EditText editText, EditText editText2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f6447a = textView;
            this.f6446a = editText;
            this.f6449b = editText2;
            this.f6450b = str;
            this.f6451c = str2;
            this.f6452d = str3;
            this.f6453e = str4;
            this.f6454f = str5;
            this.f6455g = str6;
            this.f6456h = str7;
        }

        public void onClick(View view) {
            boolean z;
            EditText editText;
            Resources resources;
            int i;
            boolean z2 = true;
            if (GenerateTicketActivity.this.f6425k.equalsIgnoreCase(pj0.m61166a(-24467441030983L))) {
                this.f6447a.setError(GenerateTicketActivity.this.getResources().getString(C1410R.string.select_issue));
                this.f6447a.setTextColor(GenerateTicketActivity.this.getResources().getColor(C1410R.color.red_ticket_bg));
                GenerateTicketActivity generateTicketActivity = GenerateTicketActivity.this;
                Toast.makeText(generateTicketActivity, generateTicketActivity.getResources().getString(C1410R.string.select_issue), 0).show();
                z = false;
            } else {
                z = true;
            }
            String obj = this.f6446a.getText().toString();
            String obj2 = this.f6449b.getText().toString();
            Matcher matcher = Pattern.compile(pj0.m61166a(-24471735998279L)).matcher(obj);
            if (obj.equalsIgnoreCase(pj0.m61166a(-24501800769351L))) {
                editText = this.f6446a;
                resources = GenerateTicketActivity.this.getResources();
                i = C1410R.string.enter_contact_number;
            } else {
                if (!matcher.matches()) {
                    editText = this.f6446a;
                    resources = GenerateTicketActivity.this.getResources();
                    i = C1410R.string.enter_valid_contact_number;
                }
                String str = pj0.m61166a(-24506095736647L) + this.f6450b + pj0.m61166a(-24561930311495L) + this.f6451c + pj0.m61166a(-24617764886343L) + this.f6452d + pj0.m61166a(-24686484363079L) + this.f6453e + pj0.m61166a(-24759498807111L) + GenerateTicketActivity.this.f6434p + pj0.m61166a(-24828218283847L) + GenerateTicketActivity.this.f6432o + pj0.m61166a(-24888347825991L) + this.f6454f + pj0.m61166a(-24957067302727L) + this.f6455g + pj0.m61166a(-24991427041095L) + GenerateTicketActivity.this.f6425k + pj0.m61166a(-25030081746759L) + obj2;
                if (z || !z2) {
                    GenerateTicketActivity generateTicketActivity2 = GenerateTicketActivity.this;
                    Toast.makeText(generateTicketActivity2, generateTicketActivity2.getResources().getString(C1410R.string.please_enter_details), 0).show();
                }
                GenerateTicketActivity.this.f6395a.reportissue(new IssueRequest(GenerateTicketActivity.this.f6410e, this.f6456h, str, obj, pj0.m61166a(-25094506256199L))).mo4926j(GenerateTicketActivity.this, new C1245a());
                return;
            }
            editText.setError(resources.getString(i));
            z2 = false;
            String str2 = pj0.m61166a(-24506095736647L) + this.f6450b + pj0.m61166a(-24561930311495L) + this.f6451c + pj0.m61166a(-24617764886343L) + this.f6452d + pj0.m61166a(-24686484363079L) + this.f6453e + pj0.m61166a(-24759498807111L) + GenerateTicketActivity.this.f6434p + pj0.m61166a(-24828218283847L) + GenerateTicketActivity.this.f6432o + pj0.m61166a(-24888347825991L) + this.f6454f + pj0.m61166a(-24957067302727L) + this.f6455g + pj0.m61166a(-24991427041095L) + GenerateTicketActivity.this.f6425k + pj0.m61166a(-25030081746759L) + obj2;
            if (z) {
            }
            GenerateTicketActivity generateTicketActivity22 = GenerateTicketActivity.this;
            Toast.makeText(generateTicketActivity22, generateTicketActivity22.getResources().getString(C1410R.string.please_enter_details), 0).show();
        }
    }

    public GenerateTicketActivity() {
        String a = pj0.m61166a(-25124571027271L);
        Locale locale = Locale.ENGLISH;
        this.f6396a = new SimpleDateFormat(a, locale);
        this.f6402b = new SimpleDateFormat(pj0.m61166a(-25210470373191L), locale);
        this.f6406c = new SimpleDateFormat(pj0.m61166a(-25317844555591L), locale);
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public /* synthetic */ void m7884N1(View view) {
        Intent intent = new Intent(pj0.m61166a(-27615652058951L));
        intent.setType(pj0.m61166a(-27731616175943L));
        String string = getResources().getString(C1410R.string.share_ticket);
        intent.putExtra(pj0.m61166a(-27778860816199L), pj0.m61166a(-27903414867783L));
        intent.putExtra(pj0.m61166a(-28002199115591L), string);
        startActivity(Intent.createChooser(intent, pj0.m61166a(-28113868265287L)));
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public /* synthetic */ void m7885O1(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public /* synthetic */ void m7886P1(View view) {
        this.f6390a.setVisibility(0);
        this.f6400b.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public /* synthetic */ void m7887Q1(View view) {
        this.f6390a.setVisibility(8);
        this.f6400b.setVisibility(0);
    }

    /* renamed from: F1 */
    public void mo7638F1() {
        CountDownTimer countDownTimer = this.f6387a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        AlertDialog alertDialog = this.f6398b;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* renamed from: G1 */
    public final void mo7639G1() {
        FareDiscovery fareDiscovery = this.f6393a;
        if (fareDiscovery != null) {
            try {
                ((TicketModel) new C0709m(this).mo5027a(TicketModel.class)).confirmation(new TicketRequest(fareDiscovery.getBus_number(), this.f6393a.getTotal_fare(), this.f6436q, this.f6421i, pj0.m61166a(-26760953567047L), this.f6427l, 0)).mo4926j(this, new C1239e());
            } catch (Exception unused) {
                AlertDialog alertDialog = this.f6398b;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
            }
        }
    }

    /* renamed from: H1 */
    public Ticket mo7640H1(UserTickets userTickets) {
        return new Ticket(userTickets.getMessage(), userTickets.getBus_number(), userTickets.getTicket_id(), userTickets.getBooking_id(), userTickets.getFare(), userTickets.getBus_route_long_name(), userTickets.getBus_agency(), userTickets.getBooking_time(), userTickets.getValidity(), userTickets.getDescription(), userTickets.getTotal_fare(), userTickets.getTicket_count(), userTickets.getTicket_count(), userTickets.getFare_per_ticket(), userTickets.getValidity_stop_idx(), userTickets.getTransaction_type(), userTickets.getTransaction_status(), userTickets.getCategory(), userTickets.getTicket_start_stop_name(), userTickets.getTicket_start_stop_idx(), userTickets.getTicket_end_stop_name(), userTickets.getTicket_end_stop_idx(), userTickets.getAmount_payable_by_user(), userTickets.isAc());
    }

    /* renamed from: I1 */
    public String mo7641I1(String str) {
        return Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 0);
    }

    /* renamed from: J1 */
    public void mo7642J1(JSONObject jSONObject) {
        String I1 = mo7641I1(jSONObject.toString());
        try {
            this.f6399b.setImageBitmap(new C7256xi().mo47185a(new yl2().mo35510a(I1, C7363yi.QR_CODE, 1000, 1000)));
        } catch (vy4 e) {
            e.printStackTrace();
        }
    }

    /* renamed from: K1 */
    public final void mo7643K1() {
        this.f6395a.userlastticket(this.f6410e).mo4926j(this, new C1240f());
    }

    /* renamed from: L1 */
    public final void mo7644L1(String str, int i, int i2) {
        List<String> list;
        DatabaseAccess instance = DatabaseAccess.getInstance(this);
        instance.open();
        try {
            list = instance.getDetails(str, this.f6433o.toLowerCase());
        } catch (Exception e) {
            ArrayList arrayList = new ArrayList();
            System.out.println(e.getMessage());
            list = arrayList;
        }
        if (i == i2) {
            this.f6413f = pj0.m61166a(-26743773697863L);
            this.f6416g = pj0.m61166a(-26748068665159L);
            Toast.makeText(this, getResources().getString(C1410R.string.some_error_occurred), 0).show();
            instance.close();
            return;
        }
        try {
            gv1 o = uv1.m67431f(list.get(0)).mo42276o();
            this.f6413f = String.valueOf(o.mo36900O(i).mo42278s().mo44567S().toArray()[0]);
            this.f6416g = String.valueOf(o.mo36900O(i2).mo42278s().mo44567S().toArray()[0]);
        } catch (Exception e2) {
            this.f6413f = pj0.m61166a(-26752363632455L);
            this.f6416g = pj0.m61166a(-26756658599751L);
            System.out.println(e2.getMessage());
        }
        instance.close();
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: M1 */
    public final void mo7645M1() {
        new C1236b().execute(new Void[0]);
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: R1 */
    public final void mo7646R1() {
        new C1237c().execute(new Void[0]);
    }

    /* renamed from: S1 */
    public final void mo7647S1(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View inflate = getLayoutInflater().inflate(C1410R.layout.ticket_report_issue, (ViewGroup) null);
        builder.setView(inflate);
        EditText editText = (EditText) inflate.findViewById(C1410R.C1412id.edit_contact);
        ((RadioGroup) inflate.findViewById(C1410R.C1412id.rg_issues)).setOnCheckedChangeListener(new C1242h());
        ((Button) inflate.findViewById(C1410R.C1412id.btn_cancel)).setOnClickListener(new C1243i());
        ((Button) inflate.findViewById(C1410R.C1412id.btn_send)).setOnClickListener(new C1244j((TextView) inflate.findViewById(C1410R.C1412id.tv_2), editText, (EditText) inflate.findViewById(C1410R.C1412id.edit_issue), str, str2, str3, str7, str4, str6, str5));
        AlertDialog create = builder.create();
        this.f6385a = create;
        create.setCancelable(false);
        this.f6385a.show();
    }

    /* renamed from: T1 */
    public final void mo7648T1(int i) {
        this.f6392a.setBackgroundColor(getResources().getColor(i));
        this.f6404c.setBackgroundColor(getResources().getColor(i));
    }

    /* renamed from: U1 */
    public final void mo7649U1() {
        this.f6389a.setVisibility(0);
        this.f6389a.bringToFront();
    }

    /* renamed from: V1 */
    public final void mo7650V1(String str) {
        Snackbar C0 = Snackbar.m33972C0(this.f6392a, str, 0);
        C0.mo28899I0(getResources().getColor(C1410R.color.red_ticket_bg));
        C0.mo28906P0(getResources().getColor(C1410R.color.white));
        C0.mo28832k0();
    }

    /* renamed from: W1 */
    public void mo7651W1() {
        C1241g gVar = new C1241g(rf4.f19824c, 1000);
        this.f6387a = gVar;
        gVar.start();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:77|78) */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r3 = r14.f6402b.parse(r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0397 */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x03c8  */
    /* renamed from: X1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7652X1() {
        /*
            r14 = this;
            r14.mo7638F1()
            android.app.AlertDialog r0 = r14.f6398b
            if (r0 == 0) goto L_0x000a
            r0.dismiss()
        L_0x000a:
            com.delhitransport.onedelhi.ticket.Ticket r0 = r14.f6394a
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L_0x03ce
            java.lang.String r0 = r0.getBus_agency()
            java.lang.String r0 = r0.toUpperCase()
            r14.f6433o = r0
            com.delhitransport.onedelhi.ticket.Ticket r0 = r14.f6394a
            java.lang.String r0 = r0.getCategory()
            r14.f6423j = r0
            com.delhitransport.onedelhi.ticket.Ticket r0 = r14.f6394a
            float r0 = r0.getAmount_payable_by_user()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.delhitransport.onedelhi.ticket.Ticket r3 = r14.f6394a
            java.lang.String r3 = r3.getTicket_id()
            r14.f6419h = r3
            com.delhitransport.onedelhi.ticket.Ticket r3 = r14.f6394a
            java.lang.String r3 = r3.getBus_route_long_name()
            java.lang.String r4 = r14.f6423j
            r5 = -26778133436231(0xffffe7a53ade68b9, double:NaN)
            java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r5)
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L_0x0093
            com.delhitransport.onedelhi.ticket.Ticket r4 = r14.f6394a
            java.lang.String r4 = r4.getBus_route_long_name()
            com.delhitransport.onedelhi.ticket.Ticket r5 = r14.f6394a
            int r5 = r5.getTicket_start_stop_idx()
            com.delhitransport.onedelhi.ticket.Ticket r6 = r14.f6394a
            int r6 = r6.getTicket_end_stop_idx()
            r14.mo7644L1(r4, r5, r6)
            java.lang.String r4 = r14.f6413f
            r5 = -26786723370823(0xffffe7a33ade68b9, double:NaN)
            java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r5)
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L_0x007a
            com.delhitransport.onedelhi.ticket.Ticket r4 = r14.f6394a
            java.lang.String r4 = r4.getTicket_start_stop_name()
            r14.f6413f = r4
        L_0x007a:
            java.lang.String r4 = r14.f6416g
            r5 = -26791018338119(0xffffe7a23ade68b9, double:NaN)
            java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r5)
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L_0x0093
            com.delhitransport.onedelhi.ticket.Ticket r4 = r14.f6394a
            java.lang.String r4 = r4.getTicket_end_stop_name()
            r14.f6416g = r4
        L_0x0093:
            com.delhitransport.onedelhi.ticket.Ticket r4 = r14.f6394a
            java.lang.String r4 = r4.getBooking_time()
            com.delhitransport.onedelhi.ticket.Ticket r5 = r14.f6394a
            java.lang.String r5 = r5.getBus_number()
            com.delhitransport.onedelhi.ticket.Ticket r6 = r14.f6394a
            float r6 = r6.getFare_per_ticket()
            com.delhitransport.onedelhi.ticket.Ticket r7 = r14.f6394a
            java.lang.String r7 = r7.getValidity()
            com.delhitransport.onedelhi.ticket.Ticket r8 = r14.f6394a
            boolean r8 = r8.isAc()
            r14.f6411e = r8
            com.delhitransport.onedelhi.ticket.Ticket r8 = r14.f6394a
            int r8 = r8.getTicket_count()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r14.f6429m = r8
            com.delhitransport.onedelhi.ticket.Ticket r8 = r14.f6394a
            r8.getValidity_stop_idx()
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            r9 = -26795313305415(0xffffe7a13ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r9)     // Catch:{ JSONException -> 0x0138 }
            r8.put(r9, r5)     // Catch:{ JSONException -> 0x0138 }
            r9 = -26842557945671(0xffffe7963ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r9)     // Catch:{ JSONException -> 0x0138 }
            r8.put(r9, r3)     // Catch:{ JSONException -> 0x0138 }
            r9 = -26885507618631(0xffffe78c3ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r9)     // Catch:{ JSONException -> 0x0138 }
            r8.put(r9, r4)     // Catch:{ JSONException -> 0x0138 }
            r9 = -26941342193479(0xffffe77f3ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r9)     // Catch:{ JSONException -> 0x0138 }
            r8.put(r9, r7)     // Catch:{ JSONException -> 0x0138 }
            r9 = -26979996899143(0xffffe7763ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r9)     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r10 = r14.f6419h     // Catch:{ JSONException -> 0x0138 }
            r8.put(r9, r10)     // Catch:{ JSONException -> 0x0138 }
            r9 = -27022946572103(0xffffe76c3ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r9)     // Catch:{ JSONException -> 0x0138 }
            double r10 = (double) r6     // Catch:{ JSONException -> 0x0138 }
            r8.put(r9, r10)     // Catch:{ JSONException -> 0x0138 }
            r9 = -27044421408583(0xffffe7673ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r9)     // Catch:{ JSONException -> 0x0138 }
            java.lang.String r10 = r14.f6433o     // Catch:{ JSONException -> 0x0138 }
            r8.put(r9, r10)     // Catch:{ JSONException -> 0x0138 }
            r9 = -27074486179655(0xffffe7603ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r9)     // Catch:{ JSONException -> 0x0138 }
            r10 = -27108845918023(0xffffe7583ade68b9, double:NaN)
            java.lang.String r10 = com.onedelhi.secure.pj0.m61166a(r10)     // Catch:{ JSONException -> 0x0138 }
            r8.put(r9, r10)     // Catch:{ JSONException -> 0x0138 }
            goto L_0x013c
        L_0x0138:
            r9 = move-exception
            r9.printStackTrace()
        L_0x013c:
            r14.mo7642J1(r8)
            java.lang.String r8 = r14.f6423j
            r9 = -27138910689095(0xffffe7513ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r9)
            boolean r8 = r8.equalsIgnoreCase(r9)
            r9 = 0
            r10 = 2131952085(0x7f1301d5, float:1.9540603E38)
            r11 = 1
            if (r8 == 0) goto L_0x0191
            r12 = -27147500623687(0xffffe74f3ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r12)
            r6 = 1092616192(0x41200000, float:10.0)
            r8 = 2131100311(0x7f060297, float:1.7813E38)
            r14.mo7648T1(r8)
            android.widget.TextView r8 = r14.f6391a
            r8.setVisibility(r2)
            android.widget.TextView r8 = r14.f6401b
            r8.setVisibility(r2)
            android.widget.TextView r8 = r14.f6408d
            r8.setVisibility(r2)
            android.widget.TextView r8 = r14.f6409e
            r8.setVisibility(r2)
            android.widget.TextView r8 = r14.f6412f
            android.content.res.Resources r12 = r14.getResources()
            r13 = 2131952005(0x7f130185, float:1.954044E38)
            java.lang.String r12 = r12.getString(r13)
            r8.setText(r12)
            android.widget.TextView r8 = r14.f6412f
            r8.setTypeface(r9, r11)
            goto L_0x0237
        L_0x0191:
            android.widget.TextView r8 = r14.f6412f
            r8.setVisibility(r2)
            java.lang.String r8 = r14.f6433o
            if (r8 == 0) goto L_0x0225
            java.lang.String r8 = r14.f6419h
            r12 = -27164680492871(0xffffe74b3ade68b9, double:NaN)
            java.lang.String r12 = com.onedelhi.secure.pj0.m61166a(r12)
            boolean r8 = r8.equalsIgnoreCase(r12)
            if (r8 != 0) goto L_0x0225
            boolean r8 = r14.f6411e
            if (r8 == 0) goto L_0x01d2
            java.lang.String r8 = r14.f6433o
            r12 = -27168975460167(0xffffe74a3ade68b9, double:NaN)
            java.lang.String r12 = com.onedelhi.secure.pj0.m61166a(r12)
            boolean r8 = r8.equalsIgnoreCase(r12)
            if (r8 == 0) goto L_0x01d2
            r12 = -27186155329351(0xffffe7463ade68b9, double:NaN)
            java.lang.String r8 = com.onedelhi.secure.pj0.m61166a(r12)
            r14.f6431n = r8
            r8 = 2131100327(0x7f0602a7, float:1.7813032E38)
        L_0x01ce:
            r14.mo7648T1(r8)
            goto L_0x0225
        L_0x01d2:
            boolean r8 = r14.f6411e
            if (r8 == 0) goto L_0x01f6
            java.lang.String r8 = r14.f6433o
            r12 = -27199040231239(0xffffe7433ade68b9, double:NaN)
            java.lang.String r12 = com.onedelhi.secure.pj0.m61166a(r12)
            boolean r8 = r8.equalsIgnoreCase(r12)
            if (r8 == 0) goto L_0x01f6
            r12 = -27224810035015(0xffffe73d3ade68b9, double:NaN)
            java.lang.String r8 = com.onedelhi.secure.pj0.m61166a(r12)
            r14.f6431n = r8
            r8 = 2131099689(0x7f060029, float:1.7811738E38)
            goto L_0x01ce
        L_0x01f6:
            java.lang.String r8 = r14.f6433o
            r12 = -27237694936903(0xffffe73a3ade68b9, double:NaN)
            java.lang.String r12 = com.onedelhi.secure.pj0.m61166a(r12)
            boolean r8 = r8.equalsIgnoreCase(r12)
            if (r8 == 0) goto L_0x0216
            r12 = -27254874806087(0xffffe7363ade68b9, double:NaN)
            java.lang.String r8 = com.onedelhi.secure.pj0.m61166a(r12)
            r14.f6431n = r8
            r8 = 2131099787(0x7f06008b, float:1.7811937E38)
            goto L_0x01ce
        L_0x0216:
            r12 = -27284939577159(0xffffe72f3ade68b9, double:NaN)
            java.lang.String r8 = com.onedelhi.secure.pj0.m61166a(r12)
            r14.f6431n = r8
            r8 = 2131100299(0x7f06028b, float:1.7812976E38)
            goto L_0x01ce
        L_0x0225:
            android.content.res.Resources r8 = r14.getResources()
            java.lang.String r8 = r8.getString(r10)
            boolean r8 = r0.startsWith(r8)
            if (r8 == 0) goto L_0x0237
            java.lang.String r0 = r0.substring(r11)
        L_0x0237:
            android.widget.Button r8 = r14.f6388a
            r8.setVisibility(r2)
            android.widget.TextView r8 = r14.f6405c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            android.content.res.Resources r13 = r14.getResources()
            java.lang.String r13 = r13.getString(r10)
            r12.append(r13)
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            r8.setText(r0)
            java.lang.String r0 = r14.f6419h
            if (r0 == 0) goto L_0x0282
            r12 = -27323594282823(0xffffe7263ade68b9, double:NaN)
            java.lang.String r8 = com.onedelhi.secure.pj0.m61166a(r12)
            boolean r0 = r0.equalsIgnoreCase(r8)
            if (r0 == 0) goto L_0x0282
            android.widget.TextView r0 = r14.f6430n
            r0.setVisibility(r1)
            android.widget.RelativeLayout r0 = r14.f6400b
            r0.setVisibility(r2)
            r12 = -27327889250119(0xffffe7253ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r12)
            r14.mo7650V1(r0)
            goto L_0x028c
        L_0x0282:
            android.widget.TextView r0 = r14.f6430n
            r0.setVisibility(r2)
            android.widget.RelativeLayout r0 = r14.f6400b
            r0.setVisibility(r1)
        L_0x028c:
            android.widget.TextView r0 = r14.f6426l
            java.lang.String r8 = r14.f6429m
            r0.setText(r8)
            android.widget.TextView r0 = r14.f6428m
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.content.res.Resources r12 = r14.getResources()
            java.lang.String r10 = r12.getString(r10)
            r8.append(r10)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r0.setText(r6)
            android.widget.TextView r0 = r14.f6424k
            r0.setText(r5)
            android.widget.TextView r0 = r14.f6418h
            java.lang.String r5 = r14.f6419h
            r0.setText(r5)
            android.widget.TextView r0 = r14.f6420i
            java.lang.String r5 = r14.f6431n
            r0.setText(r5)
            if (r3 == 0) goto L_0x033e
            java.lang.String r0 = r3.toUpperCase()
            r5 = -27503982909255(0xffffe6fc3ade68b9, double:NaN)
            java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r5)
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x02f2
            java.lang.String r0 = r3.toUpperCase()
            r5 = -27516867811143(0xffffe6f93ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r5)
            r5 = -27529752713031(0xffffe6f63ade68b9, double:NaN)
        L_0x02e9:
            java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r5)
            java.lang.String r3 = r0.replace(r3, r5)
            goto L_0x0347
        L_0x02f2:
            java.lang.String r0 = r3.toUpperCase()
            r5 = -27534047680327(0xffffe6f53ade68b9, double:NaN)
            java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r5)
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0318
            java.lang.String r0 = r3.toUpperCase()
            r5 = -27555522516807(0xffffe6f03ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r5)
            r5 = -27576997353287(0xffffe6eb3ade68b9, double:NaN)
            goto L_0x02e9
        L_0x0318:
            java.lang.String r0 = r3.toUpperCase()
            r5 = -27581292320583(0xffffe6ea3ade68b9, double:NaN)
            java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r5)
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0347
            java.lang.String r0 = r3.toUpperCase()
            r5 = -27594177222471(0xffffe6e73ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r5)
            r5 = -27607062124359(0xffffe6e43ade68b9, double:NaN)
            goto L_0x02e9
        L_0x033e:
            r5 = -27611357091655(0xffffe6e33ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r5)
        L_0x0347:
            android.widget.TextView r0 = r14.f6422j
            java.lang.String r3 = r3.toUpperCase()
            r0.setText(r3)
            if (r4 == 0) goto L_0x035b
            java.text.SimpleDateFormat r0 = r14.f6396a     // Catch:{ ParseException -> 0x0359 }
            java.util.Date r9 = r0.parse(r4)     // Catch:{ ParseException -> 0x0359 }
            goto L_0x035b
        L_0x0359:
            r0 = move-exception
            goto L_0x0369
        L_0x035b:
            if (r9 == 0) goto L_0x0371
            android.widget.TextView r0 = r14.f6415g     // Catch:{ ParseException -> 0x0359 }
            java.text.SimpleDateFormat r3 = r14.f6406c     // Catch:{ ParseException -> 0x0359 }
            java.lang.String r3 = r3.format(r9)     // Catch:{ ParseException -> 0x0359 }
            r0.setText(r3)     // Catch:{ ParseException -> 0x0359 }
            goto L_0x0371
        L_0x0369:
            android.widget.TextView r3 = r14.f6415g
            r3.setText(r4)
            r0.printStackTrace()
        L_0x0371:
            android.widget.TextView r0 = r14.f6391a
            java.lang.String r3 = r14.f6413f
            r0.setText(r3)
            android.widget.TextView r0 = r14.f6401b
            java.lang.String r3 = r14.f6416g
            r0.setText(r3)
            if (r7 == 0) goto L_0x03ab
            java.util.Date r0 = new java.util.Date     // Catch:{ ParseException -> 0x03ae }
            r0.<init>()     // Catch:{ ParseException -> 0x03ae }
            java.text.SimpleDateFormat r3 = r14.f6396a     // Catch:{ ParseException -> 0x03ae }
            java.lang.String r0 = r3.format(r0)     // Catch:{ ParseException -> 0x03ae }
            java.util.Date r0 = r3.parse(r0)     // Catch:{ ParseException -> 0x03ae }
            java.text.SimpleDateFormat r3 = r14.f6396a     // Catch:{ Exception -> 0x0397 }
            java.util.Date r3 = r3.parse(r7)     // Catch:{ Exception -> 0x0397 }
            goto L_0x039d
        L_0x0397:
            java.text.SimpleDateFormat r3 = r14.f6402b     // Catch:{ ParseException -> 0x03ae }
            java.util.Date r3 = r3.parse(r7)     // Catch:{ ParseException -> 0x03ae }
        L_0x039d:
            if (r0 == 0) goto L_0x03ab
            int r0 = r0.compareTo(r3)     // Catch:{ ParseException -> 0x03ae }
            if (r0 <= 0) goto L_0x03ab
            r14.f6417g = r11     // Catch:{ ParseException -> 0x03ae }
            r14.mo7649U1()     // Catch:{ ParseException -> 0x03ae }
            goto L_0x03b9
        L_0x03ab:
            r14.f6417g = r1     // Catch:{ ParseException -> 0x03ae }
            goto L_0x03b9
        L_0x03ae:
            r0 = move-exception
            r14.f6417g = r1
            android.widget.TextView r3 = r14.f6415g
            r3.setText(r4)
            r0.printStackTrace()
        L_0x03b9:
            boolean r0 = r14.f6417g
            if (r0 == 0) goto L_0x03c8
            android.widget.ImageView r0 = r14.f6389a
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r14.f6389a
            r0.bringToFront()
            goto L_0x03d8
        L_0x03c8:
            android.widget.ImageView r0 = r14.f6389a
            r0.setVisibility(r2)
            goto L_0x03d8
        L_0x03ce:
            android.widget.TextView r0 = r14.f6430n
            r0.setVisibility(r1)
            android.widget.RelativeLayout r0 = r14.f6400b
            r0.setVisibility(r2)
        L_0x03d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.delhitransport.onedelhi.activities.GenerateTicketActivity.mo7652X1():void");
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x01d9  */
    @android.annotation.SuppressLint({"SourceLockedOrientationActivity", "CommitPrefEdits"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 1
            r8.setRequestedOrientation(r0)
            super.onCreate(r9)
            android.view.Window r9 = r8.getWindow()
            r1 = 8192(0x2000, float:1.14794E-41)
            r9.setFlags(r1, r1)
            r9 = 2131558439(0x7f0d0027, float:1.8742194E38)
            r8.setContentView((int) r9)
            r1 = -25442398607175(0xffffe8dc3ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r1)
            r1 = 0
            android.content.SharedPreferences r9 = r8.getSharedPreferences(r9, r1)
            r2 = -25528297953095(0xffffe8c83ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            r3 = -25571247626055(0xffffe8be3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            java.lang.String r2 = r9.getString(r2, r3)
            r8.f6410e = r2
            r2 = -25575542593351(0xffffe8bd3ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            r3 = -25648557037383(0xffffe8ac3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            java.lang.String r2 = r9.getString(r2, r3)
            r8.f6435p = r2
            r2 = -25661441939271(0xffffe8a93ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            r3 = -25691506710343(0xffffe8a23ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            java.lang.String r9 = r9.getString(r2, r3)
            r8.f6423j = r9
            r2 = -25700096644935(0xffffe8a03ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            boolean r9 = r9.equalsIgnoreCase(r2)
            if (r9 == 0) goto L_0x0087
            r2 = -25721571481415(0xffffe89b3ade68b9, double:NaN)
        L_0x0080:
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r2)
            r8.f6423j = r9
            goto L_0x009e
        L_0x0087:
            java.lang.String r9 = r8.f6423j
            r2 = -25730161416007(0xffffe8993ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            boolean r9 = r9.equalsIgnoreCase(r2)
            if (r9 == 0) goto L_0x009e
            r2 = -25760226187079(0xffffe8923ade68b9, double:NaN)
            goto L_0x0080
        L_0x009e:
            r9 = 2131362497(0x7f0a02c1, float:1.8344776E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.RelativeLayout r9 = (android.widget.RelativeLayout) r9
            r8.f6407d = r9
            r9 = 2131361913(0x7f0a0079, float:1.8343592E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.Button r9 = (android.widget.Button) r9
            r8.f6388a = r9
            r9 = 2131362688(0x7f0a0380, float:1.8345164E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r8.f6430n = r9
            r9 = 2131362524(0x7f0a02dc, float:1.8344831E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.RelativeLayout r9 = (android.widget.RelativeLayout) r9
            r8.f6400b = r9
            r9 = 2131362470(0x7f0a02a6, float:1.8344721E38)
            android.view.View r9 = r8.findViewById(r9)
            androidx.coordinatorlayout.widget.CoordinatorLayout r9 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r9
            r8.f6392a = r9
            r9 = 2131362519(0x7f0a02d7, float:1.834482E38)
            android.view.View r2 = r8.findViewById(r9)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r8.f6404c = r2
            r2 = 2131362516(0x7f0a02d4, float:1.8344815E38)
            android.view.View r2 = r8.findViewById(r2)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r3 = 2131362466(0x7f0a02a2, float:1.8344713E38)
            android.view.View r3 = r8.findViewById(r3)
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            r4 = 2131362753(0x7f0a03c1, float:1.8345295E38)
            android.view.View r4 = r8.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r8.f6428m = r4
            r4 = 2131362842(0x7f0a041a, float:1.8345476E38)
            android.view.View r4 = r8.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r8.f6426l = r4
            r4 = 2131362708(0x7f0a0394, float:1.8345204E38)
            android.view.View r4 = r8.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r8.f6424k = r4
            r4 = 2131362709(0x7f0a0395, float:1.8345206E38)
            android.view.View r4 = r8.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r8.f6422j = r4
            r4 = 2131362849(0x7f0a0421, float:1.834549E38)
            android.view.View r4 = r8.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r8.f6405c = r4
            r4 = 2131362710(0x7f0a0396, float:1.8345208E38)
            android.view.View r4 = r8.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r8.f6420i = r4
            r4 = 2131362843(0x7f0a041b, float:1.8345478E38)
            android.view.View r4 = r8.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r8.f6418h = r4
            r4 = 2131362706(0x7f0a0392, float:1.83452E38)
            android.view.View r4 = r8.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r8.f6415g = r4
            r4 = 2131362824(0x7f0a0408, float:1.834544E38)
            android.view.View r4 = r8.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r8.f6391a = r4
            r4 = 2131362746(0x7f0a03ba, float:1.8345281E38)
            android.view.View r4 = r8.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r8.f6401b = r4
            r4 = 2131362674(0x7f0a0372, float:1.8345135E38)
            android.view.View r4 = r8.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r8.f6408d = r4
            r4 = 2131362675(0x7f0a0373, float:1.8345137E38)
            android.view.View r4 = r8.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r8.f6409e = r4
            r4 = 2131362677(0x7f0a0375, float:1.8345141E38)
            android.view.View r4 = r8.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r8.f6412f = r4
            android.view.View r9 = r8.findViewById(r9)
            android.widget.RelativeLayout r9 = (android.widget.RelativeLayout) r9
            r8.f6404c = r9
            r9 = 2131362462(0x7f0a029e, float:1.8344705E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.RelativeLayout r9 = (android.widget.RelativeLayout) r9
            r8.f6390a = r9
            r9 = 2131362141(0x7f0a015d, float:1.8344054E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r8.f6399b = r9
            r9 = 2131362175(0x7f0a017f, float:1.8344123E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r8.f6403c = r9
            r9 = 2131362202(0x7f0a019a, float:1.8344178E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r8.f6389a = r9
            r9 = 2131362067(0x7f0a0113, float:1.8343904E38)
            android.view.View r9 = r8.findViewById(r9)
            com.google.android.material.floatingactionbutton.FloatingActionButton r9 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r9
            android.widget.RelativeLayout r4 = r8.f6407d
            r5 = 4
            r4.setVisibility(r5)
            com.onedelhi.secure.ge1 r4 = new com.onedelhi.secure.ge1
            r4.<init>(r8)
            r9.setOnClickListener(r4)
            android.content.Intent r9 = r8.getIntent()
            r8.f6386a = r9
            android.os.Bundle r9 = r9.getExtras()
            r4 = 0
            if (r9 == 0) goto L_0x030e
            r5 = -25768816121671(0xffffe8903ade68b9, double:NaN)
            java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r5)
            r6 = -25807470827335(0xffffe8873ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            java.lang.String r5 = r9.getString(r5, r6)
            r6 = -25828945663815(0xffffe8823ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            boolean r6 = r5.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x02fe
            r6 = -25854715467591(0xffffe87c3ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r6)
            r6 = -25914845009735(0xffffe86e3ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            java.lang.String r4 = r9.getString(r4, r6)
            r8.f6436q = r4
            r6 = -25927729911623(0xffffe86b3ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r6)
            r6 = -25970679584583(0xffffe8613ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            java.lang.String r4 = r9.getString(r4, r6)
            r8.f6421i = r4
            r6 = -25974974551879(0xffffe8603ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r6)
            r6 = -26030809126727(0xffffe8533ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            java.lang.String r4 = r9.getString(r4, r6)
            r8.f6427l = r4
            r6 = -26047988995911(0xffffe84f3ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r6)
            r6 = -26086643701575(0xffffe8463ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            java.lang.String r4 = r9.getString(r4, r6)
            r8.f6423j = r4
            r6 = -26095233636167(0xffffe8443ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r6)
            boolean r4 = r9.getBoolean(r4, r1)
            r8.f6411e = r4
            r6 = -26121003439943(0xffffe83e3ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r6)
            java.lang.Object r4 = r9.get(r4)
            com.delhitransport.onedelhi.ticket.FareDiscovery r4 = (com.delhitransport.onedelhi.ticket.FareDiscovery) r4
            r8.f6393a = r4
            r6 = -26194017883975(0xffffe82d3ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r6)
            r6 = -26254147426119(0xffffe81f3ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            java.lang.String r4 = r9.getString(r4, r6)
            r8.f6413f = r4
            r6 = -26258442393415(0xffffe81e3ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r6)
            r6 = -26309982000967(0xffffe8123ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            java.lang.String r4 = r9.getString(r4, r6)
            r8.f6416g = r4
            r6 = -26314276968263(0xffffe8113ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r6)
            int r4 = r9.getInt(r4, r1)
            r8.f6434p = r4
            r6 = -26370111543111(0xffffe8043ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r6)
            int r4 = r9.getInt(r4, r1)
            r8.f6432o = r4
            r6 = -26417356183367(0xffffe7f93ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r6)
            r6 = -26503255529287(0xffffe7e53ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            java.lang.String r4 = r9.getString(r4, r6)
            r8.f6429m = r4
            r6 = -26511845463879(0xffffe7e33ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r6)
            r6 = -26559090104135(0xffffe7d83ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            java.lang.String r9 = r9.getString(r4, r6)
            r8.f6433o = r9
            r9 = 0
            goto L_0x0378
        L_0x02fe:
            r8.f6393a = r4
            r6 = -26584859907911(0xffffe7d23ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r6)
            boolean r9 = r9.getBoolean(r4, r0)
            goto L_0x0378
        L_0x030e:
            r5 = -26606334744391(0xffffe7cd3ade68b9, double:NaN)
            java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r5)
            r6 = -26627809580871(0xffffe7c83ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r6)
            r8.f6436q = r9
            r6 = -26640694482759(0xffffe7c53ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r6)
            r8.f6421i = r9
            r6 = -26644989450055(0xffffe7c43ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r6)
            r8.f6427l = r9
            r6 = -26662169319239(0xffffe7c03ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r6)
            r8.f6423j = r9
            r8.f6411e = r1
            r6 = -26670759253831(0xffffe7be3ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r6)
            r8.f6413f = r9
            r6 = -26675054221127(0xffffe7bd3ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r6)
            r8.f6416g = r9
            r8.f6434p = r1
            r8.f6432o = r1
            r8.f6393a = r4
            r6 = -26679349188423(0xffffe7bc3ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r6)
            r8.f6429m = r9
            r6 = -26687939123015(0xffffe7ba3ade68b9, double:NaN)
            java.lang.String r9 = com.onedelhi.secure.pj0.m61166a(r6)
            r8.f6433o = r9
            r9 = 1
        L_0x0378:
            com.delhitransport.onedelhi.viewmodels.TicketModel r4 = new com.delhitransport.onedelhi.viewmodels.TicketModel
            r4.<init>()
            r8.f6395a = r4
            android.widget.ImageView r4 = r8.f6403c
            com.onedelhi.secure.ie1 r6 = new com.onedelhi.secure.ie1
            r6.<init>(r8)
            r4.setOnClickListener(r6)
            android.widget.RelativeLayout r4 = r8.f6404c
            com.onedelhi.secure.fe1 r6 = new com.onedelhi.secure.fe1
            r6.<init>(r8)
            r4.setOnClickListener(r6)
            android.widget.RelativeLayout r4 = r8.f6390a
            com.onedelhi.secure.he1 r6 = new com.onedelhi.secure.he1
            r6.<init>(r8)
            r4.setOnClickListener(r6)
            r8.mo7651W1()
            r6 = -26713708926791(0xffffe7b43ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r6)
            android.content.res.Resources r6 = r8.getResources()
            r7 = 2131951831(0x7f1300d7, float:1.9540088E38)
            java.lang.String r6 = r6.getString(r7)
            android.app.ProgressDialog r0 = android.app.ProgressDialog.show(r8, r4, r6, r0)
            r8.f6398b = r0
            r0.setCancelable(r1)
            r0 = -26718003894087(0xffffe7b33ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r0)
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x03d0
            r8.mo7639G1()
            goto L_0x03d9
        L_0x03d0:
            if (r9 != 0) goto L_0x03d6
            r8.mo7643K1()
            goto L_0x03d9
        L_0x03d6:
            r8.mo7645M1()
        L_0x03d9:
            if (r2 == 0) goto L_0x03e3
            com.delhitransport.onedelhi.activities.GenerateTicketActivity$a r9 = new com.delhitransport.onedelhi.activities.GenerateTicketActivity$a
            r9.<init>()
            r2.setOnClickListener(r9)
        L_0x03e3:
            com.delhitransport.onedelhi.activities.GenerateTicketActivity$d r9 = new com.delhitransport.onedelhi.activities.GenerateTicketActivity$d
            r9.<init>()
            r3.setOnClickListener(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.delhitransport.onedelhi.activities.GenerateTicketActivity.onCreate(android.os.Bundle):void");
    }

    public void onResume() {
        super.onResume();
    }
}
