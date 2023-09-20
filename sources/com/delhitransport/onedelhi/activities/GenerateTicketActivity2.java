package com.delhitransport.onedelhi.activities;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.CountDownTimer;
import android.util.Base64;
import android.util.Pair;
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
import com.delhitransport.onedelhi.p001db.DatabaseClient;
import com.delhitransport.onedelhi.p001db.UserBookings;
import com.delhitransport.onedelhi.p001db.UserTickets;
import com.delhitransport.onedelhi.ticket.Issue;
import com.delhitransport.onedelhi.ticket.IssueRequest;
import com.delhitransport.onedelhi.ticket.LastTicket;
import com.delhitransport.onedelhi.ticket.Ticket;
import com.delhitransport.onedelhi.viewmodels.TicketModel;
import com.google.android.gms.common.C1410R;
import com.google.android.material.snackbar.Snackbar;
import com.onedelhi.secure.C7256xi;
import com.onedelhi.secure.C7363yi;
import com.onedelhi.secure.bu2;
import com.onedelhi.secure.ke1;
import com.onedelhi.secure.ne1;
import com.onedelhi.secure.oe1;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.rf4;
import com.onedelhi.secure.vy4;
import com.onedelhi.secure.yl2;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class GenerateTicketActivity2 extends BaseActivity {

    /* renamed from: a */
    public float f6458a;

    /* renamed from: a */
    public AlertDialog f6459a;

    /* renamed from: a */
    public Intent f6460a;

    /* renamed from: a */
    public SharedPreferences f6461a;

    /* renamed from: a */
    public CountDownTimer f6462a;

    /* renamed from: a */
    public Button f6463a;

    /* renamed from: a */
    public ImageView f6464a;

    /* renamed from: a */
    public RelativeLayout f6465a;

    /* renamed from: a */
    public TextView f6466a;

    /* renamed from: a */
    public CoordinatorLayout f6467a;

    /* renamed from: a */
    public Ticket f6468a;

    /* renamed from: a */
    public TicketModel f6469a;

    /* renamed from: a */
    public final SimpleDateFormat f6470a;

    /* renamed from: a */
    public List<String> f6471a = new ArrayList();

    /* renamed from: b */
    public AlertDialog f6472b;

    /* renamed from: b */
    public ImageView f6473b;

    /* renamed from: b */
    public RelativeLayout f6474b;

    /* renamed from: b */
    public TextView f6475b;

    /* renamed from: b */
    public final SimpleDateFormat f6476b;

    /* renamed from: b */
    public List<Pair<Integer, String>> f6477b = new ArrayList();

    /* renamed from: c */
    public ImageView f6478c;

    /* renamed from: c */
    public RelativeLayout f6479c;

    /* renamed from: c */
    public TextView f6480c;

    /* renamed from: c */
    public final SimpleDateFormat f6481c;

    /* renamed from: d */
    public RelativeLayout f6482d;

    /* renamed from: d */
    public TextView f6483d;

    /* renamed from: e */
    public TextView f6484e;

    /* renamed from: e */
    public String f6485e;

    /* renamed from: e */
    public boolean f6486e;

    /* renamed from: f */
    public TextView f6487f;

    /* renamed from: f */
    public String f6488f = pj0.m61166a(-29093120808775L);

    /* renamed from: f */
    public boolean f6489f = false;

    /* renamed from: g */
    public TextView f6490g;

    /* renamed from: g */
    public String f6491g = pj0.m61166a(-29097415776071L);

    /* renamed from: g */
    public boolean f6492g = false;

    /* renamed from: h */
    public TextView f6493h;

    /* renamed from: h */
    public String f6494h = pj0.m61166a(-29101710743367L);

    /* renamed from: h */
    public boolean f6495h = false;

    /* renamed from: i */
    public TextView f6496i;

    /* renamed from: i */
    public String f6497i;

    /* renamed from: i */
    public boolean f6498i = false;

    /* renamed from: j */
    public TextView f6499j;

    /* renamed from: j */
    public String f6500j = pj0.m61166a(-29106005710663L);

    /* renamed from: j */
    public boolean f6501j;

    /* renamed from: k */
    public TextView f6502k;

    /* renamed from: k */
    public String f6503k;

    /* renamed from: k */
    public boolean f6504k;

    /* renamed from: l */
    public TextView f6505l;

    /* renamed from: l */
    public String f6506l = pj0.m61166a(-29110300677959L);

    /* renamed from: m */
    public TextView f6507m;

    /* renamed from: m */
    public String f6508m;

    /* renamed from: n */
    public TextView f6509n;

    /* renamed from: n */
    public String f6510n;

    /* renamed from: o */
    public int f6511o;

    /* renamed from: o */
    public String f6512o;

    /* renamed from: p */
    public int f6513p;

    /* renamed from: p */
    public String f6514p;

    /* renamed from: q */
    public String f6515q;

    /* renamed from: r */
    public String f6516r;

    /* renamed from: s */
    public String f6517s;

    /* renamed from: t */
    public String f6518t;

    /* renamed from: u */
    public String f6519u;

    /* renamed from: v */
    public String f6520v;

    /* renamed from: w */
    public String f6521w;

    /* renamed from: x */
    public String f6522x;

    /* renamed from: com.delhitransport.onedelhi.activities.GenerateTicketActivity2$a */
    public class C1246a implements View.OnClickListener {
        public C1246a() {
        }

        public void onClick(View view) {
            if (GenerateTicketActivity2.this.f6495h) {
                GenerateTicketActivity2.this.onBackPressed();
                return;
            }
            Intent intent = new Intent(GenerateTicketActivity2.this, MainActivity.class);
            intent.putExtra(pj0.m61166a(-28156817938247L), GenerateTicketActivity2.this.f6485e);
            intent.putExtra(pj0.m61166a(-28199767611207L), true);
            intent.addFlags(67108864);
            GenerateTicketActivity2.this.startActivity(intent);
            GenerateTicketActivity2.this.finish();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GenerateTicketActivity2$b */
    public class C1247b extends AsyncTask<Void, Void, List<UserBookings>> {
        public C1247b() {
        }

        /* renamed from: a */
        public List<UserBookings> doInBackground(Void... voidArr) {
            return DatabaseClient.getInstance(GenerateTicketActivity2.this.getApplicationContext()).getAppDatabase().bookingDao().getLast();
        }

        /* renamed from: b */
        public void onPostExecute(List<UserBookings> list) {
            super.onPostExecute(list);
            try {
                GenerateTicketActivity2.this.mo7685W1(list.get(0));
            } catch (Exception unused) {
                GenerateTicketActivity2.this.mo7685W1((UserBookings) null);
            }
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GenerateTicketActivity2$c */
    public class C1248c extends AsyncTask<Void, Void, List<UserTickets>> {
        public C1248c() {
        }

        /* renamed from: a */
        public List<UserTickets> doInBackground(Void... voidArr) {
            return DatabaseClient.getInstance(GenerateTicketActivity2.this.getApplicationContext()).getAppDatabase().ticketDao().getLast();
        }

        /* renamed from: b */
        public void onPostExecute(List<UserTickets> list) {
            super.onPostExecute(list);
            try {
                Ticket unused = GenerateTicketActivity2.this.f6468a = GenerateTicketActivity2.m7935C1(list.get(0));
                GenerateTicketActivity2.this.mo7687Y1(pj0.m61166a(-28268487087943L));
            } catch (Exception e) {
                System.out.println(e.getMessage());
                Ticket unused2 = GenerateTicketActivity2.this.f6468a = null;
                GenerateTicketActivity2.this.mo7676H1();
            }
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GenerateTicketActivity2$d */
    public class C1249d extends AsyncTask<Void, Void, Void> {
        public C1249d() {
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            UserTickets userTickets = new UserTickets();
            try {
                userTickets.setAc(GenerateTicketActivity2.this.f6468a.isAc());
                userTickets.setAmount_payable_by_user(GenerateTicketActivity2.this.f6468a.getAmount_payable_by_user());
                userTickets.setBooking_id(GenerateTicketActivity2.this.f6468a.getBooking_id());
                userTickets.setBooking_time(GenerateTicketActivity2.this.f6468a.getBooking_time());
                userTickets.setBus_agency(GenerateTicketActivity2.this.f6468a.getBus_agency());
                userTickets.setBus_number(GenerateTicketActivity2.this.f6468a.getBus_number());
                userTickets.setBus_route_long_name(GenerateTicketActivity2.this.f6468a.getBus_route_long_name());
                userTickets.setCategory(GenerateTicketActivity2.this.f6468a.getCategory());
                userTickets.setDescription(GenerateTicketActivity2.this.f6468a.getDescription());
                userTickets.setFare(GenerateTicketActivity2.this.f6468a.getTotal_fare());
                userTickets.setFare_per_ticket(GenerateTicketActivity2.this.f6468a.getFare_per_ticket());
                userTickets.setMessage(GenerateTicketActivity2.this.f6468a.getMessage());
                userTickets.setTicket_count(GenerateTicketActivity2.this.f6468a.getTicket_count());
                userTickets.setTicket_end_stop_idx(GenerateTicketActivity2.this.f6468a.getTicket_end_stop_idx());
                userTickets.setTicket_end_stop_name(GenerateTicketActivity2.this.f6468a.getTicket_end_stop_name());
                userTickets.setTicket_id(GenerateTicketActivity2.this.f6468a.getTicket_id());
                userTickets.setTicket_start_stop_idx(GenerateTicketActivity2.this.f6468a.getTicket_start_stop_idx());
                userTickets.setTicket_start_stop_name(GenerateTicketActivity2.this.f6468a.getTicket_start_stop_name());
                userTickets.setTotal_fare(GenerateTicketActivity2.this.f6468a.getTotal_fare());
                userTickets.setTransaction_status(GenerateTicketActivity2.this.f6468a.getTransaction_status());
                userTickets.setTransaction_type(GenerateTicketActivity2.this.f6468a.getTransaction_type());
                userTickets.setValidity(GenerateTicketActivity2.this.f6468a.getValidity());
                userTickets.setValidity_stop_idx(GenerateTicketActivity2.this.f6468a.getValidity_stop_idx());
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                DatabaseClient.getInstance(GenerateTicketActivity2.this).getAppDatabase().ticketDao().insert(userTickets);
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

    /* renamed from: com.delhitransport.onedelhi.activities.GenerateTicketActivity2$e */
    public class C1250e implements View.OnClickListener {
        public C1250e() {
        }

        public void onClick(View view) {
            GenerateTicketActivity2.this.f6465a.setVisibility(0);
            GenerateTicketActivity2.this.f6474b.setVisibility(8);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GenerateTicketActivity2$f */
    public class C1251f implements bu2<LastTicket> {
        public C1251f() {
        }

        /* renamed from: a */
        public void mo3946b(LastTicket lastTicket) {
            GenerateTicketActivity2.this.mo7671B1(pj0.m61166a(-28311436760903L));
            if (lastTicket != null) {
                if (GenerateTicketActivity2.this.f6497i.equalsIgnoreCase(pj0.m61166a(-28380156237639L))) {
                    String unused = GenerateTicketActivity2.this.f6512o = String.format(pj0.m61166a(-28388746172231L), new Object[]{pj0.m61166a(-28633559308103L), GenerateTicketActivity2.this.f6494h, GenerateTicketActivity2.this.f6485e, lastTicket.toString()});
                }
                if (lastTicket.getMessage().equalsIgnoreCase(pj0.m61166a(-28685098915655L)) && lastTicket.getLastTicket() != null) {
                    Ticket unused2 = GenerateTicketActivity2.this.f6468a = lastTicket.getLastTicket();
                    GenerateTicketActivity2.this.mo7679Q1();
                    GenerateTicketActivity2.this.mo7687Y1(pj0.m61166a(-28719458654023L));
                    boolean unused3 = GenerateTicketActivity2.this.f6492g = false;
                }
            }
            Ticket unused4 = GenerateTicketActivity2.this.f6468a = null;
            GenerateTicketActivity2.this.mo7687Y1(pj0.m61166a(-28719458654023L));
            boolean unused5 = GenerateTicketActivity2.this.f6492g = false;
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GenerateTicketActivity2$g */
    public class C1252g extends CountDownTimer {
        public C1252g(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            if (GenerateTicketActivity2.this.f6472b != null && GenerateTicketActivity2.this.f6472b.isShowing()) {
                GenerateTicketActivity2.this.f6472b.dismiss();
                GenerateTicketActivity2 generateTicketActivity2 = GenerateTicketActivity2.this;
                Toast.makeText(generateTicketActivity2, generateTicketActivity2.getResources().getString(C1410R.string.some_error_occurred), 0).show();
            }
            GenerateTicketActivity2.this.onBackPressed();
        }

        public void onTick(long j) {
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GenerateTicketActivity2$h */
    public class C1253h implements RadioGroup.OnCheckedChangeListener {
        public C1253h() {
        }

        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
            if (i != -1) {
                String unused = GenerateTicketActivity2.this.f6500j = radioButton.getText().toString();
            }
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GenerateTicketActivity2$i */
    public class C1254i implements View.OnClickListener {
        public C1254i() {
        }

        public void onClick(View view) {
            if (GenerateTicketActivity2.this.f6459a != null) {
                GenerateTicketActivity2.this.f6459a.dismiss();
            }
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GenerateTicketActivity2$j */
    public class C1255j implements bu2<Issue> {
        public C1255j() {
        }

        /* renamed from: a */
        public void mo3946b(Issue issue) {
            Toast toast;
            if (issue == null || !issue.getMessage().equalsIgnoreCase(pj0.m61166a(-28779588196167L))) {
                GenerateTicketActivity2 generateTicketActivity2 = GenerateTicketActivity2.this;
                toast = Toast.makeText(generateTicketActivity2, generateTicketActivity2.getResources().getString(C1410R.string.some_error_occurred), 0);
            } else {
                toast = Toast.makeText(GenerateTicketActivity2.this, issue.getDisplay_message(), 0);
            }
            toast.show();
            if (GenerateTicketActivity2.this.f6459a != null) {
                GenerateTicketActivity2.this.f6459a.dismiss();
            }
        }
    }

    public GenerateTicketActivity2() {
        String a = pj0.m61166a(-28813947934535L);
        Locale locale = Locale.ENGLISH;
        this.f6470a = new SimpleDateFormat(a, locale);
        this.f6476b = new SimpleDateFormat(pj0.m61166a(-28899847280455L), locale);
        this.f6481c = new SimpleDateFormat(pj0.m61166a(-29007221462855L), locale);
    }

    /* renamed from: C1 */
    public static Ticket m7935C1(UserTickets userTickets) {
        return new Ticket(userTickets.getMessage(), userTickets.getBus_number(), userTickets.getTicket_id(), userTickets.getBooking_id(), userTickets.getFare(), userTickets.getBus_route_long_name(), userTickets.getBus_agency(), userTickets.getBooking_time(), userTickets.getValidity(), userTickets.getDescription(), userTickets.getTotal_fare(), userTickets.getTicket_count(), userTickets.getTicket_count(), userTickets.getFare_per_ticket(), userTickets.getValidity_stop_idx(), userTickets.getTransaction_type(), userTickets.getTransaction_status(), userTickets.getCategory(), userTickets.getTicket_start_stop_name(), userTickets.getTicket_start_stop_idx(), userTickets.getTicket_end_stop_name(), userTickets.getTicket_end_stop_idx(), userTickets.getAmount_payable_by_user(), userTickets.isAc());
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public /* synthetic */ void m7936K1(View view) {
        this.f6465a.setVisibility(8);
        this.f6474b.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public /* synthetic */ void m7937L1(View view) {
        mo7675G1();
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public /* synthetic */ void m7938M1(View view) {
        Intent intent = new Intent(this, AllTicketsActivity.class);
        this.f6460a = intent;
        intent.putExtra(pj0.m61166a(-36742457562951L), this.f6485e);
        startActivity(this.f6460a);
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public /* synthetic */ void m7939N1(TextView textView, EditText editText, EditText editText2, String str, String str2, String str3, String str4, String str5, String str6, String str7, View view) {
        boolean z;
        Resources resources;
        int i;
        TextView textView2 = textView;
        EditText editText3 = editText;
        boolean z2 = true;
        if (this.f6500j.equalsIgnoreCase(pj0.m61166a(-36085327566663L))) {
            textView.setError(getResources().getString(C1410R.string.select_issue));
            textView.setTextColor(getResources().getColor(C1410R.color.red_ticket_bg));
            Toast.makeText(this, getResources().getString(C1410R.string.select_issue), 0).show();
            z = false;
        } else {
            z = true;
        }
        String obj = editText.getText().toString();
        String obj2 = editText2.getText().toString();
        Matcher matcher = Pattern.compile(pj0.m61166a(-36089622533959L)).matcher(obj);
        if (obj.equalsIgnoreCase(pj0.m61166a(-36119687305031L))) {
            resources = getResources();
            i = C1410R.string.enter_contact_number;
        } else {
            if (!matcher.matches()) {
                resources = getResources();
                i = C1410R.string.enter_valid_contact_number;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(pj0.m61166a(-36123982272327L));
            String str8 = str;
            sb.append(str);
            sb.append(pj0.m61166a(-36179816847175L));
            String str9 = str2;
            sb.append(str2);
            sb.append(pj0.m61166a(-36235651422023L));
            sb.append(str3);
            sb.append(pj0.m61166a(-36304370898759L));
            sb.append(str4);
            sb.append(pj0.m61166a(-36377385342791L));
            sb.append(this.f6513p);
            sb.append(pj0.m61166a(-36446104819527L));
            sb.append(this.f6511o);
            sb.append(pj0.m61166a(-36506234361671L));
            sb.append(str5);
            sb.append(pj0.m61166a(-36574953838407L));
            sb.append(str6);
            sb.append(pj0.m61166a(-36609313576775L));
            sb.append(this.f6500j);
            sb.append(pj0.m61166a(-36647968282439L));
            sb.append(obj2);
            String sb2 = sb.toString();
            if (z || !z2) {
                Toast.makeText(this, getResources().getString(C1410R.string.please_enter_details), 0).show();
            }
            this.f6469a.reportissue(new IssueRequest(this.f6485e, str7, sb2, obj, pj0.m61166a(-36712392791879L))).mo4926j(this, new C1255j());
            return;
        }
        editText.setError(resources.getString(i));
        z2 = false;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(pj0.m61166a(-36123982272327L));
        String str82 = str;
        sb3.append(str);
        sb3.append(pj0.m61166a(-36179816847175L));
        String str92 = str2;
        sb3.append(str2);
        sb3.append(pj0.m61166a(-36235651422023L));
        sb3.append(str3);
        sb3.append(pj0.m61166a(-36304370898759L));
        sb3.append(str4);
        sb3.append(pj0.m61166a(-36377385342791L));
        sb3.append(this.f6513p);
        sb3.append(pj0.m61166a(-36446104819527L));
        sb3.append(this.f6511o);
        sb3.append(pj0.m61166a(-36506234361671L));
        sb3.append(str5);
        sb3.append(pj0.m61166a(-36574953838407L));
        sb3.append(str6);
        sb3.append(pj0.m61166a(-36609313576775L));
        sb3.append(this.f6500j);
        sb3.append(pj0.m61166a(-36647968282439L));
        sb3.append(obj2);
        String sb22 = sb3.toString();
        if (z) {
        }
        Toast.makeText(this, getResources().getString(C1410R.string.please_enter_details), 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public /* synthetic */ void m7940O1(View view) {
        this.f6459a.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public /* synthetic */ void m7941P1(UserBookings userBookings, Button button, View view) {
        if (userBookings != null) {
            try {
                Intent intent = new Intent(pj0.m61166a(-35363773060935L));
                intent.setData(Uri.parse(pj0.m61166a(-34814017247047L) + this.f6522x + pj0.m61166a(-34972931036999L) + URLEncoder.encode(getResources().getString(C1410R.string.whatsapp_msg, new Object[]{this.f6485e, userBookings.getBooking_id(), this.f6461a.getString(pj0.m61166a(-35002995808071L), pj0.m61166a(-35063125350215L)), this.f6461a.getString(pj0.m61166a(-35067420317511L), pj0.m61166a(-35136139794247L)), this.f6461a.getString(pj0.m61166a(-35140434761543L), pj0.m61166a(-35187679401799L)), this.f6461a.getString(pj0.m61166a(-35196269336391L), pj0.m61166a(-35260693845831L)), this.f6461a.getString(pj0.m61166a(-35264988813127L), pj0.m61166a(-35333708289863L)), this.f6497i, this.f6520v, userBookings.getRoute_long_name(), userBookings.getAgency(), this.f6521w}), pj0.m61166a(-35338003257159L))));
                startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    Intent intent2 = new Intent(pj0.m61166a(-35694485542727L));
                    intent2.setData(Uri.parse(pj0.m61166a(-35479737177927L) + this.f6522x + pj0.m61166a(-35638650967879L) + URLEncoder.encode(getResources().getString(C1410R.string.whatsapp_msg, new Object[]{this.f6485e, this.f6518t, this.f6514p, this.f6515q, String.valueOf(this.f6458a), this.f6516r, this.f6517s, this.f6497i, this.f6520v, this.f6519u, this.f6508m, this.f6521w}), pj0.m61166a(-35668715738951L))));
                    startActivity(intent2);
                } catch (UnsupportedEncodingException e2) {
                    e2.printStackTrace();
                }
            }
        } else {
            Intent intent3 = new Intent(pj0.m61166a(-35969363449671L));
            intent3.setData(Uri.parse(pj0.m61166a(-35810449659719L) + this.f6522x));
            startActivity(intent3);
        }
        button.callOnClick();
    }

    /* renamed from: B1 */
    public void mo7671B1(String str) {
        String.format(pj0.m61166a(-34311506073415L), new Object[]{pj0.m61166a(-34582089013063L), this.f6494h, this.f6485e, str});
        CountDownTimer countDownTimer = this.f6462a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        AlertDialog alertDialog = this.f6472b;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f6472b.dismiss();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: D1 */
    public final void mo7672D1() {
        Pair[] pairArr = new Pair[this.f6471a.size()];
        for (int i = 0; i < this.f6471a.size(); i++) {
            pairArr[i] = new Pair(Integer.valueOf(i), this.f6471a.get(i));
        }
        this.f6477b = Arrays.asList(pairArr);
    }

    /* renamed from: E1 */
    public String mo7673E1(String str) {
        return Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 0);
    }

    /* renamed from: F1 */
    public void mo7674F1(JSONObject jSONObject) {
        String E1 = mo7673E1(jSONObject.toString());
        try {
            this.f6473b.setImageBitmap(new C7256xi().mo47185a(new yl2().mo35510a(E1, C7363yi.QR_CODE, 1000, 1000)));
        } catch (vy4 e) {
            e.printStackTrace();
        }
    }

    /* renamed from: G1 */
    public final void mo7675G1() {
        new C1247b().execute(new Void[0]);
    }

    /* renamed from: H1 */
    public final void mo7676H1() {
        if (this.f6497i.equalsIgnoreCase(pj0.m61166a(-32773907781447L))) {
            this.f6512o = String.format(pj0.m61166a(-32782497716039L), new Object[]{pj0.m61166a(-32997246080839L), this.f6494h, this.f6485e});
        }
        this.f6469a.userlastticket(this.f6485e).mo4926j(this, new C1251f());
    }

    /* renamed from: I1 */
    public final String mo7677I1(int i) {
        String a = pj0.m61166a(-34148297316167L);
        if (i == -1) {
            return a;
        }
        try {
            return (String) this.f6477b.get(i).second;
        } catch (Exception e) {
            e.printStackTrace();
            return a;
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: J1 */
    public final void mo7678J1() {
        if (this.f6497i.equalsIgnoreCase(pj0.m61166a(-33877714376519L))) {
            String.format(pj0.m61166a(-33886304311111L), new Object[]{pj0.m61166a(-34101052675911L), this.f6494h, this.f6485e});
        }
        new C1248c().execute(new Void[0]);
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: Q1 */
    public final void mo7679Q1() {
        new C1249d().execute(new Void[0]);
    }

    /* renamed from: R1 */
    public final void mo7680R1(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View inflate = getLayoutInflater().inflate(C1410R.layout.ticket_report_issue, (ViewGroup) null);
        builder.setView(inflate);
        EditText editText = (EditText) inflate.findViewById(C1410R.C1412id.edit_contact);
        ((RadioGroup) inflate.findViewById(C1410R.C1412id.rg_issues)).setOnCheckedChangeListener(new C1253h());
        ((Button) inflate.findViewById(C1410R.C1412id.btn_cancel)).setOnClickListener(new C1254i());
        ((Button) inflate.findViewById(C1410R.C1412id.btn_send)).setOnClickListener(new ne1(this, (TextView) inflate.findViewById(C1410R.C1412id.tv_2), editText, (EditText) inflate.findViewById(C1410R.C1412id.edit_issue), str, str2, str3, str7, str4, str6, str5));
        AlertDialog create = builder.create();
        this.f6459a = create;
        create.setCancelable(false);
        this.f6459a.show();
    }

    /* renamed from: S1 */
    public final void mo7681S1(int i) {
        this.f6467a.setBackgroundColor(getResources().getColor(i));
        this.f6479c.setBackgroundColor(getResources().getColor(i));
    }

    /* renamed from: T1 */
    public final void mo7682T1() {
        this.f6464a.setVisibility(0);
        this.f6464a.bringToFront();
    }

    /* renamed from: U1 */
    public final void mo7683U1() {
        int i = this.f6513p;
        if (i == this.f6511o) {
            this.f6488f = pj0.m61166a(-34152592283463L);
            this.f6491g = pj0.m61166a(-34156887250759L);
            Toast.makeText(this, pj0.m61166a(-34161182218055L), 0).show();
            return;
        }
        try {
            this.f6488f = mo7677I1(i);
            this.f6491g = mo7677I1(this.f6511o);
            if (!this.f6488f.equalsIgnoreCase(pj0.m61166a(-34294326204231L))) {
                this.f6466a.setText(this.f6488f);
            }
            if (!this.f6491g.equalsIgnoreCase(pj0.m61166a(-34298621171527L))) {
                this.f6475b.setText(this.f6491g);
            }
        } catch (Exception e) {
            this.f6488f = pj0.m61166a(-34302916138823L);
            this.f6491g = pj0.m61166a(-34307211106119L);
            System.out.println(e.getMessage());
        }
    }

    /* renamed from: V1 */
    public final void mo7684V1() {
        Snackbar C0 = Snackbar.m33972C0(this.f6467a, pj0.m61166a(-34637923587911L), 0);
        C0.mo28899I0(getResources().getColor(C1410R.color.red_ticket_bg));
        C0.mo28906P0(getResources().getColor(C1410R.color.white));
        C0.mo28832k0();
    }

    /* renamed from: W1 */
    public final void mo7685W1(UserBookings userBookings) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View inflate = getLayoutInflater().inflate(C1410R.layout.need_help_dialog, (ViewGroup) null);
        builder.setView(inflate);
        Button button = (Button) inflate.findViewById(C1410R.C1412id.btn_cancel);
        button.setOnClickListener(new ke1(this));
        ((Button) inflate.findViewById(C1410R.C1412id.btn_accept)).setOnClickListener(new oe1(this, userBookings, button));
        AlertDialog create = builder.create();
        this.f6459a = create;
        create.setCancelable(true);
        this.f6459a.show();
    }

    /* renamed from: X1 */
    public void mo7686X1() {
        C1252g gVar = new C1252g(rf4.f19824c, 1000);
        this.f6462a = gVar;
        gVar.start();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:87|88) */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r2 = r12.f6476b.parse(r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0408 */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0439  */
    /* renamed from: Y1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7687Y1(java.lang.String r13) {
        /*
            r12 = this;
            r0 = -33048785688391(0xffffe1f13ade68b9, double:NaN)
            java.lang.String r13 = com.onedelhi.secure.pj0.m61166a(r0)
            r12.mo7671B1(r13)
            android.app.AlertDialog r13 = r12.f6472b
            if (r13 == 0) goto L_0x0013
            r13.dismiss()
        L_0x0013:
            com.delhitransport.onedelhi.ticket.Ticket r13 = r12.f6468a
            r0 = 0
            r1 = 8
            if (r13 == 0) goto L_0x043f
            java.lang.String r13 = r13.getBus_agency()
            java.lang.String r13 = r13.toUpperCase()
            r12.f6508m = r13
            com.delhitransport.onedelhi.ticket.Ticket r13 = r12.f6468a
            java.lang.String r13 = r13.getCategory()
            r12.f6497i = r13
            com.delhitransport.onedelhi.ticket.Ticket r13 = r12.f6468a
            float r13 = r13.getAmount_payable_by_user()
            java.lang.String r13 = java.lang.String.valueOf(r13)
            com.delhitransport.onedelhi.ticket.Ticket r2 = r12.f6468a
            java.lang.String r2 = r2.getTicket_id()
            com.delhitransport.onedelhi.ticket.Ticket r3 = r12.f6468a
            java.lang.String r3 = r3.getBus_route_long_name()
            r12.f6519u = r3
            java.lang.String r3 = r12.f6497i
            r4 = -33100325295943(0xffffe1e53ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x009a
            com.delhitransport.onedelhi.ticket.Ticket r3 = r12.f6468a
            int r3 = r3.getTicket_start_stop_idx()
            r12.f6513p = r3
            com.delhitransport.onedelhi.ticket.Ticket r3 = r12.f6468a
            int r3 = r3.getTicket_end_stop_idx()
            r12.f6511o = r3
            r12.mo7683U1()
            java.lang.String r3 = r12.f6488f
            r4 = -33108915230535(0xffffe1e33ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x0081
            com.delhitransport.onedelhi.ticket.Ticket r3 = r12.f6468a
            java.lang.String r3 = r3.getTicket_start_stop_name()
            r12.f6488f = r3
        L_0x0081:
            java.lang.String r3 = r12.f6491g
            r4 = -33113210197831(0xffffe1e23ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x009a
            com.delhitransport.onedelhi.ticket.Ticket r3 = r12.f6468a
            java.lang.String r3 = r3.getTicket_end_stop_name()
            r12.f6491g = r3
        L_0x009a:
            com.delhitransport.onedelhi.ticket.Ticket r3 = r12.f6468a
            java.lang.String r3 = r3.getBooking_time()
            com.delhitransport.onedelhi.ticket.Ticket r4 = r12.f6468a
            java.lang.String r4 = r4.getBus_number()
            r12.f6520v = r4
            com.delhitransport.onedelhi.ticket.Ticket r4 = r12.f6468a
            float r4 = r4.getFare_per_ticket()
            com.delhitransport.onedelhi.ticket.Ticket r5 = r12.f6468a
            java.lang.String r5 = r5.getValidity()
            com.delhitransport.onedelhi.ticket.Ticket r6 = r12.f6468a
            boolean r6 = r6.isAc()
            r12.f6486e = r6
            com.delhitransport.onedelhi.ticket.Ticket r6 = r12.f6468a
            int r6 = r6.getTicket_count()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r12.f6503k = r6
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            r7 = -33117505165127(0xffffe1e13ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r7)     // Catch:{ JSONException -> 0x013e }
            java.lang.String r8 = r12.f6520v     // Catch:{ JSONException -> 0x013e }
            r6.put(r7, r8)     // Catch:{ JSONException -> 0x013e }
            r7 = -33164749805383(0xffffe1d63ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r7)     // Catch:{ JSONException -> 0x013e }
            java.lang.String r8 = r12.f6519u     // Catch:{ JSONException -> 0x013e }
            r6.put(r7, r8)     // Catch:{ JSONException -> 0x013e }
            r7 = -33207699478343(0xffffe1cc3ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r7)     // Catch:{ JSONException -> 0x013e }
            r6.put(r7, r3)     // Catch:{ JSONException -> 0x013e }
            r7 = -33263534053191(0xffffe1bf3ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r7)     // Catch:{ JSONException -> 0x013e }
            r6.put(r7, r5)     // Catch:{ JSONException -> 0x013e }
            r7 = -33302188758855(0xffffe1b63ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r7)     // Catch:{ JSONException -> 0x013e }
            r6.put(r7, r2)     // Catch:{ JSONException -> 0x013e }
            r7 = -33345138431815(0xffffe1ac3ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r7)     // Catch:{ JSONException -> 0x013e }
            double r8 = (double) r4     // Catch:{ JSONException -> 0x013e }
            r6.put(r7, r8)     // Catch:{ JSONException -> 0x013e }
            r7 = -33366613268295(0xffffe1a73ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r7)     // Catch:{ JSONException -> 0x013e }
            java.lang.String r8 = r12.f6508m     // Catch:{ JSONException -> 0x013e }
            r6.put(r7, r8)     // Catch:{ JSONException -> 0x013e }
            r7 = -33396678039367(0xffffe1a03ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r7)     // Catch:{ JSONException -> 0x013e }
            r8 = -33431037777735(0xffffe1983ade68b9, double:NaN)
            java.lang.String r8 = com.onedelhi.secure.pj0.m61166a(r8)     // Catch:{ JSONException -> 0x013e }
            r6.put(r7, r8)     // Catch:{ JSONException -> 0x013e }
            goto L_0x0142
        L_0x013e:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0142:
            r12.mo7674F1(r6)
            java.lang.String r6 = r12.f6497i
            r7 = -33461102548807(0xffffe1913ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r7)
            boolean r6 = r6.equalsIgnoreCase(r7)
            r7 = 0
            r8 = 2131952085(0x7f1301d5, float:1.9540603E38)
            r9 = 1
            if (r6 == 0) goto L_0x0197
            r10 = -33469692483399(0xffffe18f3ade68b9, double:NaN)
            java.lang.String r13 = com.onedelhi.secure.pj0.m61166a(r10)
            r4 = 1092616192(0x41200000, float:10.0)
            r6 = 2131100311(0x7f060297, float:1.7813E38)
            r12.mo7681S1(r6)
            android.widget.TextView r6 = r12.f6466a
            r6.setVisibility(r1)
            android.widget.TextView r6 = r12.f6475b
            r6.setVisibility(r1)
            android.widget.TextView r6 = r12.f6483d
            r6.setVisibility(r1)
            android.widget.TextView r6 = r12.f6484e
            r6.setVisibility(r1)
            android.widget.TextView r6 = r12.f6487f
            android.content.res.Resources r10 = r12.getResources()
            r11 = 2131952005(0x7f130185, float:1.954044E38)
            java.lang.String r10 = r10.getString(r11)
            r6.setText(r10)
            android.widget.TextView r6 = r12.f6487f
            r6.setTypeface(r7, r9)
            goto L_0x024d
        L_0x0197:
            java.lang.String r6 = r12.f6508m
            if (r6 == 0) goto L_0x023b
            r10 = -33486872352583(0xffffe18b3ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r10)
            boolean r6 = r2.equalsIgnoreCase(r6)
            if (r6 != 0) goto L_0x023b
            boolean r6 = r12.f6486e
            if (r6 == 0) goto L_0x01d1
            java.lang.String r6 = r12.f6508m
            r10 = -33491167319879(0xffffe18a3ade68b9, double:NaN)
            java.lang.String r10 = com.onedelhi.secure.pj0.m61166a(r10)
            boolean r6 = r6.equalsIgnoreCase(r10)
            if (r6 == 0) goto L_0x01d1
            r10 = -33508347189063(0xffffe1863ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r10)
            r12.f6506l = r6
            r6 = 2131100327(0x7f0602a7, float:1.7813032E38)
        L_0x01cd:
            r12.mo7681S1(r6)
            goto L_0x0224
        L_0x01d1:
            boolean r6 = r12.f6486e
            if (r6 == 0) goto L_0x01f5
            java.lang.String r6 = r12.f6508m
            r10 = -33521232090951(0xffffe1833ade68b9, double:NaN)
            java.lang.String r10 = com.onedelhi.secure.pj0.m61166a(r10)
            boolean r6 = r6.equalsIgnoreCase(r10)
            if (r6 == 0) goto L_0x01f5
            r10 = -33547001894727(0xffffe17d3ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r10)
            r12.f6506l = r6
            r6 = 2131099689(0x7f060029, float:1.7811738E38)
            goto L_0x01cd
        L_0x01f5:
            java.lang.String r6 = r12.f6508m
            r10 = -33559886796615(0xffffe17a3ade68b9, double:NaN)
            java.lang.String r10 = com.onedelhi.secure.pj0.m61166a(r10)
            boolean r6 = r6.equalsIgnoreCase(r10)
            if (r6 == 0) goto L_0x0215
            r10 = -33577066665799(0xffffe1763ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r10)
            r12.f6506l = r6
            r6 = 2131099787(0x7f06008b, float:1.7811937E38)
            goto L_0x01cd
        L_0x0215:
            r10 = -33607131436871(0xffffe16f3ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r10)
            r12.f6506l = r6
            r6 = 2131100299(0x7f06028b, float:1.7812976E38)
            goto L_0x01cd
        L_0x0224:
            java.lang.String r6 = r12.f6520v
            r10 = -33637196207943(0xffffe1683ade68b9, double:NaN)
            java.lang.String r10 = com.onedelhi.secure.pj0.m61166a(r10)
            boolean r6 = r6.contains(r10)
            if (r6 == 0) goto L_0x023b
            r6 = 2131099794(0x7f060092, float:1.7811951E38)
            r12.mo7681S1(r6)
        L_0x023b:
            android.content.res.Resources r6 = r12.getResources()
            java.lang.String r6 = r6.getString(r8)
            boolean r6 = r13.startsWith(r6)
            if (r6 == 0) goto L_0x024d
            java.lang.String r13 = r13.substring(r9)
        L_0x024d:
            android.widget.Button r6 = r12.f6463a
            r6.setVisibility(r1)
            android.widget.TextView r6 = r12.f6480c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            android.content.res.Resources r11 = r12.getResources()
            java.lang.String r11 = r11.getString(r8)
            r10.append(r11)
            r10.append(r13)
            java.lang.String r13 = r10.toString()
            r6.setText(r13)
            if (r2 == 0) goto L_0x028d
            r10 = -33667260979015(0xffffe1613ade68b9, double:NaN)
            java.lang.String r13 = com.onedelhi.secure.pj0.m61166a(r10)
            boolean r13 = r2.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x028d
            android.widget.TextView r13 = r12.f6509n
            r13.setVisibility(r0)
            android.widget.RelativeLayout r13 = r12.f6474b
            r13.setVisibility(r1)
            r12.mo7684V1()
            goto L_0x0297
        L_0x028d:
            android.widget.TextView r13 = r12.f6509n
            r13.setVisibility(r1)
            android.widget.RelativeLayout r13 = r12.f6474b
            r13.setVisibility(r0)
        L_0x0297:
            android.widget.TextView r13 = r12.f6505l
            java.lang.String r6 = r12.f6503k
            r13.setText(r6)
            android.widget.TextView r13 = r12.f6507m
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.res.Resources r10 = r12.getResources()
            java.lang.String r8 = r10.getString(r8)
            r6.append(r8)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r13.setText(r4)
            android.widget.TextView r13 = r12.f6502k
            java.lang.String r4 = r12.f6520v
            r13.setText(r4)
            android.widget.TextView r13 = r12.f6493h
            r13.setText(r2)
            android.widget.TextView r13 = r12.f6496i
            java.lang.String r2 = r12.f6506l
            r13.setText(r2)
            java.lang.String r13 = r12.f6519u
            if (r13 == 0) goto L_0x03af
            java.lang.String r13 = r13.toUpperCase()
            r10 = -33671555946311(0xffffe1603ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r10)
            boolean r13 = r13.contains(r2)
            if (r13 == 0) goto L_0x0302
            java.lang.String r13 = r12.f6519u
            java.lang.String r13 = r13.toUpperCase()
            r10 = -33688735815495(0xffffe15c3ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r10)
            r10 = -33705915684679(0xffffe1583ade68b9, double:NaN)
        L_0x02f8:
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r10)
            java.lang.String r13 = r13.replace(r2, r4)
            goto L_0x03b8
        L_0x0302:
            java.lang.String r13 = r12.f6519u
            java.lang.String r13 = r13.toUpperCase()
            r10 = -33710210651975(0xffffe1573ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r10)
            boolean r13 = r13.contains(r2)
            if (r13 == 0) goto L_0x032c
            java.lang.String r13 = r12.f6519u
            java.lang.String r13 = r13.toUpperCase()
            r10 = -33735980455751(0xffffe1513ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r10)
            r10 = -33761750259527(0xffffe14b3ade68b9, double:NaN)
            goto L_0x02f8
        L_0x032c:
            java.lang.String r13 = r12.f6519u
            java.lang.String r13 = r13.toUpperCase()
            r10 = -33766045226823(0xffffe14a3ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r10)
            boolean r13 = r13.contains(r2)
            if (r13 == 0) goto L_0x0356
            java.lang.String r13 = r12.f6519u
            java.lang.String r13 = r13.toUpperCase()
            r10 = -33778930128711(0xffffe1473ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r10)
            r10 = -33791815030599(0xffffe1443ade68b9, double:NaN)
            goto L_0x02f8
        L_0x0356:
            java.lang.String r13 = r12.f6519u
            java.lang.String r13 = r13.toUpperCase()
            r10 = -33796109997895(0xffffe1433ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r10)
            boolean r13 = r13.contains(r2)
            if (r13 == 0) goto L_0x0381
            java.lang.String r13 = r12.f6519u
            java.lang.String r13 = r13.toUpperCase()
            r10 = -33817584834375(0xffffe13e3ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r10)
            r10 = -33839059670855(0xffffe1393ade68b9, double:NaN)
            goto L_0x02f8
        L_0x0381:
            java.lang.String r13 = r12.f6519u
            java.lang.String r13 = r13.toUpperCase()
            r10 = -33843354638151(0xffffe1383ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r10)
            boolean r13 = r13.contains(r2)
            if (r13 == 0) goto L_0x03ac
            java.lang.String r13 = r12.f6519u
            java.lang.String r13 = r13.toUpperCase()
            r10 = -33856239540039(0xffffe1353ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r10)
            r10 = -33869124441927(0xffffe1323ade68b9, double:NaN)
            goto L_0x02f8
        L_0x03ac:
            java.lang.String r13 = r12.f6519u
            goto L_0x03b8
        L_0x03af:
            r10 = -33873419409223(0xffffe1313ade68b9, double:NaN)
            java.lang.String r13 = com.onedelhi.secure.pj0.m61166a(r10)
        L_0x03b8:
            android.widget.TextView r2 = r12.f6499j
            java.lang.String r13 = r13.toUpperCase()
            r2.setText(r13)
            if (r3 == 0) goto L_0x03cc
            java.text.SimpleDateFormat r13 = r12.f6470a     // Catch:{ ParseException -> 0x03ca }
            java.util.Date r7 = r13.parse(r3)     // Catch:{ ParseException -> 0x03ca }
            goto L_0x03cc
        L_0x03ca:
            r13 = move-exception
            goto L_0x03da
        L_0x03cc:
            if (r7 == 0) goto L_0x03e2
            android.widget.TextView r13 = r12.f6490g     // Catch:{ ParseException -> 0x03ca }
            java.text.SimpleDateFormat r2 = r12.f6481c     // Catch:{ ParseException -> 0x03ca }
            java.lang.String r2 = r2.format(r7)     // Catch:{ ParseException -> 0x03ca }
            r13.setText(r2)     // Catch:{ ParseException -> 0x03ca }
            goto L_0x03e2
        L_0x03da:
            android.widget.TextView r2 = r12.f6490g
            r2.setText(r3)
            r13.printStackTrace()
        L_0x03e2:
            android.widget.TextView r13 = r12.f6466a
            java.lang.String r2 = r12.f6488f
            r13.setText(r2)
            android.widget.TextView r13 = r12.f6475b
            java.lang.String r2 = r12.f6491g
            r13.setText(r2)
            if (r5 == 0) goto L_0x041c
            java.util.Date r13 = new java.util.Date     // Catch:{ ParseException -> 0x041f }
            r13.<init>()     // Catch:{ ParseException -> 0x041f }
            java.text.SimpleDateFormat r2 = r12.f6470a     // Catch:{ ParseException -> 0x041f }
            java.lang.String r13 = r2.format(r13)     // Catch:{ ParseException -> 0x041f }
            java.util.Date r13 = r2.parse(r13)     // Catch:{ ParseException -> 0x041f }
            java.text.SimpleDateFormat r2 = r12.f6470a     // Catch:{ Exception -> 0x0408 }
            java.util.Date r2 = r2.parse(r5)     // Catch:{ Exception -> 0x0408 }
            goto L_0x040e
        L_0x0408:
            java.text.SimpleDateFormat r2 = r12.f6476b     // Catch:{ ParseException -> 0x041f }
            java.util.Date r2 = r2.parse(r5)     // Catch:{ ParseException -> 0x041f }
        L_0x040e:
            if (r13 == 0) goto L_0x041c
            int r13 = r13.compareTo(r2)     // Catch:{ ParseException -> 0x041f }
            if (r13 <= 0) goto L_0x041c
            r12.f6489f = r9     // Catch:{ ParseException -> 0x041f }
            r12.mo7682T1()     // Catch:{ ParseException -> 0x041f }
            goto L_0x042a
        L_0x041c:
            r12.f6489f = r0     // Catch:{ ParseException -> 0x041f }
            goto L_0x042a
        L_0x041f:
            r13 = move-exception
            r12.f6489f = r0
            android.widget.TextView r2 = r12.f6490g
            r2.setText(r3)
            r13.printStackTrace()
        L_0x042a:
            boolean r13 = r12.f6489f
            if (r13 == 0) goto L_0x0439
            android.widget.ImageView r13 = r12.f6464a
            r13.setVisibility(r0)
            android.widget.ImageView r13 = r12.f6464a
            r13.bringToFront()
            goto L_0x0449
        L_0x0439:
            android.widget.ImageView r13 = r12.f6464a
            r13.setVisibility(r1)
            goto L_0x0449
        L_0x043f:
            android.widget.TextView r13 = r12.f6509n
            r13.setVisibility(r0)
            android.widget.RelativeLayout r13 = r12.f6474b
            r13.setVisibility(r1)
        L_0x0449:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.delhitransport.onedelhi.activities.GenerateTicketActivity2.mo7687Y1(java.lang.String):void");
    }

    public void onBackPressed() {
        if (this.f6495h) {
            super.onBackPressed();
            finish();
            return;
        }
        this.f6478c.callOnClick();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0490  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0510  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x054c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0219  */
    @android.annotation.SuppressLint({"SourceLockedOrientationActivity", "CommitPrefEdits"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            r0 = 1
            r10.setRequestedOrientation(r0)
            super.onCreate(r11)
            android.view.Window r11 = r10.getWindow()
            r1 = 8192(0x2000, float:1.14794E-41)
            r11.setFlags(r1, r1)
            r11 = 2131558439(0x7f0d0027, float:1.8742194E38)
            r10.setContentView((int) r11)
            r1 = -29140365449031(0xffffe57f3ade68b9, double:NaN)
            java.lang.String r11 = com.onedelhi.secure.pj0.m61166a(r1)
            r1 = 0
            android.content.SharedPreferences r11 = r10.getSharedPreferences(r11, r1)
            r10.f6461a = r11
            r2 = -29226264794951(0xffffe56b3ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            r3 = -29269214467911(0xffffe5613ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            java.lang.String r11 = r11.getString(r2, r3)
            r10.f6485e = r11
            android.content.SharedPreferences r11 = r10.f6461a
            r2 = -29273509435207(0xffffe5603ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            r3 = -29346523879239(0xffffe54f3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            java.lang.String r11 = r11.getString(r2, r3)
            r10.f6510n = r11
            android.content.SharedPreferences r11 = r10.f6461a
            r2 = -29359408781127(0xffffe54c3ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            r3 = -29389473552199(0xffffe5453ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            java.lang.String r11 = r11.getString(r2, r3)
            r10.f6497i = r11
            android.content.SharedPreferences r11 = r10.f6461a
            r2 = -29398063486791(0xffffe5433ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            boolean r11 = r11.getBoolean(r2, r1)
            r10.f6501j = r11
            android.content.SharedPreferences r11 = r10.f6461a
            r2 = -29505437669191(0xffffe52a3ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            r3 = -29565567211335(0xffffe51c3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            java.lang.String r11 = r11.getString(r2, r3)
            r10.f6521w = r11
            android.content.SharedPreferences r11 = r10.f6461a
            r2 = -29569862178631(0xffffe51b3ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            boolean r11 = r11.getBoolean(r2, r1)
            r10.f6504k = r11
            android.content.SharedPreferences r11 = r10.f6461a
            r2 = -29638581655367(0xffffe50b3ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            r3 = -29668646426439(0xffffe5043ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            java.lang.String r11 = r11.getString(r2, r3)
            r10.f6522x = r11
            java.lang.String r11 = r10.f6497i
            r2 = -29728775968583(0xffffe4f63ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            boolean r11 = r11.equalsIgnoreCase(r2)
            if (r11 == 0) goto L_0x00e5
            r2 = -29750250805063(0xffffe4f13ade68b9, double:NaN)
        L_0x00de:
            java.lang.String r11 = com.onedelhi.secure.pj0.m61166a(r2)
            r10.f6497i = r11
            goto L_0x00fc
        L_0x00e5:
            java.lang.String r11 = r10.f6497i
            r2 = -29758840739655(0xffffe4ef3ade68b9, double:NaN)
            java.lang.String r2 = com.onedelhi.secure.pj0.m61166a(r2)
            boolean r11 = r11.equalsIgnoreCase(r2)
            if (r11 == 0) goto L_0x00fc
            r2 = -29788905510727(0xffffe4e83ade68b9, double:NaN)
            goto L_0x00de
        L_0x00fc:
            r11 = 2131361913(0x7f0a0079, float:1.8343592E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.Button r11 = (android.widget.Button) r11
            r10.f6463a = r11
            r11 = 2131362688(0x7f0a0380, float:1.8345164E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10.f6509n = r11
            r11 = 2131362524(0x7f0a02dc, float:1.8344831E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            r10.f6474b = r11
            r11 = 2131362470(0x7f0a02a6, float:1.8344721E38)
            android.view.View r11 = r10.findViewById(r11)
            androidx.coordinatorlayout.widget.CoordinatorLayout r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r11
            r10.f6467a = r11
            r11 = 2131362519(0x7f0a02d7, float:1.834482E38)
            android.view.View r2 = r10.findViewById(r11)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r10.f6479c = r2
            r2 = 2131362466(0x7f0a02a2, float:1.8344713E38)
            android.view.View r2 = r10.findViewById(r2)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r3 = 2131362516(0x7f0a02d4, float:1.8344815E38)
            android.view.View r3 = r10.findViewById(r3)
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            r3 = 2131362753(0x7f0a03c1, float:1.8345295E38)
            android.view.View r3 = r10.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r10.f6507m = r3
            r3 = 2131362842(0x7f0a041a, float:1.8345476E38)
            android.view.View r3 = r10.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r10.f6505l = r3
            r3 = 2131362708(0x7f0a0394, float:1.8345204E38)
            android.view.View r3 = r10.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r10.f6502k = r3
            r3 = 2131362709(0x7f0a0395, float:1.8345206E38)
            android.view.View r3 = r10.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r10.f6499j = r3
            r3 = 2131362849(0x7f0a0421, float:1.834549E38)
            android.view.View r3 = r10.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r10.f6480c = r3
            r3 = 2131362710(0x7f0a0396, float:1.8345208E38)
            android.view.View r3 = r10.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r10.f6496i = r3
            r3 = 2131362843(0x7f0a041b, float:1.8345478E38)
            android.view.View r3 = r10.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r10.f6493h = r3
            r3 = 2131362706(0x7f0a0392, float:1.83452E38)
            android.view.View r3 = r10.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r10.f6490g = r3
            r3 = 2131362824(0x7f0a0408, float:1.834544E38)
            android.view.View r3 = r10.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r10.f6466a = r3
            r3 = 2131362746(0x7f0a03ba, float:1.8345281E38)
            android.view.View r3 = r10.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r10.f6475b = r3
            r3 = 2131362674(0x7f0a0372, float:1.8345135E38)
            android.view.View r3 = r10.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r10.f6483d = r3
            r3 = 2131362675(0x7f0a0373, float:1.8345137E38)
            android.view.View r3 = r10.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r10.f6484e = r3
            r3 = 2131362677(0x7f0a0375, float:1.8345141E38)
            android.view.View r3 = r10.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r10.f6487f = r3
            android.view.View r11 = r10.findViewById(r11)
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            r10.f6479c = r11
            r11 = 2131362462(0x7f0a029e, float:1.8344705E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            r10.f6465a = r11
            r11 = 2131362141(0x7f0a015d, float:1.8344054E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r10.f6473b = r11
            r11 = 2131362175(0x7f0a017f, float:1.8344123E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r10.f6478c = r11
            r11 = 2131362202(0x7f0a019a, float:1.8344178E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r10.f6464a = r11
            r11 = 2131362497(0x7f0a02c1, float:1.8344776E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            r10.f6482d = r11
            boolean r3 = r10.f6504k
            r4 = 8
            if (r3 != 0) goto L_0x022b
            r11.setVisibility(r4)
            android.view.ViewGroup$LayoutParams r11 = r2.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r11 = (android.widget.RelativeLayout.LayoutParams) r11
            r3 = 21
            r11.addRule(r3)
            r2.setLayoutParams(r11)
            goto L_0x022e
        L_0x022b:
            r11.setVisibility(r1)
        L_0x022e:
            android.content.Intent r11 = r10.getIntent()
            r10.f6460a = r11
            android.os.Bundle r11 = r11.getExtras()
            r3 = 0
            if (r11 == 0) goto L_0x0407
            r5 = -29797495445319(0xffffe4e63ade68b9, double:NaN)
            java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r5)
            r6 = -29836150150983(0xffffe4dd3ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            java.lang.String r5 = r11.getString(r5, r6)
            r6 = -29857624987463(0xffffe4d83ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            boolean r6 = r5.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x0319
            r6 = -29883394791239(0xffffe4d23ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            java.lang.Object r6 = r11.get(r6)
            com.delhitransport.onedelhi.ticket.Ticket r6 = (com.delhitransport.onedelhi.ticket.Ticket) r6
            r10.f6468a = r6
            r6 = -29930639431495(0xffffe4c73ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            r7 = -29990768973639(0xffffe4b93ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r7)
            java.lang.String r6 = r11.getString(r6, r7)
            r10.f6514p = r6
            r6 = -29995063940935(0xffffe4b83ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            r7 = -30063783417671(0xffffe4a83ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r7)
            java.lang.String r6 = r11.getString(r6, r7)
            r10.f6515q = r6
            r6 = -30068078384967(0xffffe4a73ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            r7 = -30136797861703(0xffffe4973ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r7)
            java.lang.String r6 = r11.getString(r6, r7)
            r10.f6517s = r6
            r6 = -30141092828999(0xffffe4963ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            r7 = -30175452567367(0xffffe48e3ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r7)
            java.lang.String r6 = r11.getString(r6, r7)
            r10.f6516r = r6
            r6 = -30179747534663(0xffffe48d3ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            float r3 = r11.getFloat(r6, r3)
            r10.f6458a = r3
            r6 = -30226992174919(0xffffe4823ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r6)
            r6 = -30269941847879(0xffffe4783ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            java.lang.String r3 = r11.getString(r3, r6)
            r10.f6518t = r3
            r6 = -30274236815175(0xffffe4773ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r6)
            boolean r3 = r11.getBoolean(r3, r1)
            r10.f6495h = r3
            r6 = -30295711651655(0xffffe4723ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r6)
            boolean r11 = r11.getBoolean(r3, r1)
            r10.f6498i = r11
            r11 = 0
            goto L_0x0466
        L_0x0319:
            r6 = -30381610997575(0xffffe45e3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r6)
            boolean r3 = r5.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0348
            r6 = -30403085834055(0xffffe4593ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r6)
            java.lang.Object r3 = r11.get(r3)
            com.delhitransport.onedelhi.ticket.Ticket r3 = (com.delhitransport.onedelhi.ticket.Ticket) r3
            r10.f6468a = r3
            r6 = -30433150605127(0xffffe4523ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r6)
            boolean r11 = r11.getBoolean(r3, r0)
            goto L_0x0466
        L_0x0348:
            r6 = -30454625441607(0xffffe44d3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r6)
            java.lang.Object r3 = r11.get(r3)
            com.delhitransport.onedelhi.ticket.Ticket r3 = (com.delhitransport.onedelhi.ticket.Ticket) r3
            r10.f6468a = r3
            r6 = -30501870081863(0xffffe4423ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r6)
            boolean r11 = r11.getBoolean(r3, r0)
            android.content.SharedPreferences r3 = r10.f6461a
            r6 = -30523344918343(0xffffe43d3ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            r7 = -30566294591303(0xffffe4333ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r7)
            java.lang.String r3 = r3.getString(r6, r7)
            r10.f6518t = r3
            android.content.SharedPreferences r3 = r10.f6461a
            r6 = -30570589558599(0xffffe4323ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            r7 = -30635014068039(0xffffe4233ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r7)
            java.lang.String r3 = r3.getString(r6, r7)
            r10.f6516r = r3
            android.content.SharedPreferences r3 = r10.f6461a
            r6 = -30639309035335(0xffffe4223ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            r7 = -30699438577479(0xffffe4143ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r7)
            java.lang.String r3 = r3.getString(r6, r7)
            r10.f6514p = r3
            android.content.SharedPreferences r3 = r10.f6461a
            r6 = -30703733544775(0xffffe4133ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            r7 = -30772453021511(0xffffe4033ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r7)
            java.lang.String r3 = r3.getString(r6, r7)
            r10.f6517s = r3
            android.content.SharedPreferences r3 = r10.f6461a
            r6 = -30776747988807(0xffffe4023ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            r7 = -30845467465543(0xffffe3f23ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r7)
            java.lang.String r3 = r3.getString(r6, r7)
            r10.f6515q = r3
            android.content.SharedPreferences r3 = r10.f6461a
            r6 = -30849762432839(0xffffe3f13ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r6)
            r7 = -30897007073095(0xffffe3e63ade68b9, double:NaN)
            java.lang.String r7 = com.onedelhi.secure.pj0.m61166a(r7)
            java.lang.String r3 = r3.getString(r6, r7)
            float r3 = java.lang.Float.parseFloat(r3)
            r10.f6458a = r3
            goto L_0x0466
        L_0x0407:
            r5 = -30905597007687(0xffffe3e43ade68b9, double:NaN)
            java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r5)
            r6 = -30927071844167(0xffffe3df3ade68b9, double:NaN)
            java.lang.String r11 = com.onedelhi.secure.pj0.m61166a(r6)
            r10.f6494h = r11
            r6 = -30931366811463(0xffffe3de3ade68b9, double:NaN)
            java.lang.String r11 = com.onedelhi.secure.pj0.m61166a(r6)
            r10.f6497i = r11
            r10.f6486e = r1
            r6 = -30939956746055(0xffffe3dc3ade68b9, double:NaN)
            java.lang.String r11 = com.onedelhi.secure.pj0.m61166a(r6)
            r10.f6488f = r11
            r6 = -30944251713351(0xffffe3db3ade68b9, double:NaN)
            java.lang.String r11 = com.onedelhi.secure.pj0.m61166a(r6)
            r10.f6491g = r11
            r10.f6513p = r1
            r10.f6511o = r1
            r6 = -30948546680647(0xffffe3da3ade68b9, double:NaN)
            java.lang.String r11 = com.onedelhi.secure.pj0.m61166a(r6)
            r10.f6503k = r11
            r6 = -30957136615239(0xffffe3d83ade68b9, double:NaN)
            java.lang.String r11 = com.onedelhi.secure.pj0.m61166a(r6)
            r10.f6508m = r11
            r10.f6458a = r3
            r6 = -30982906419015(0xffffe3d23ade68b9, double:NaN)
            java.lang.String r11 = com.onedelhi.secure.pj0.m61166a(r6)
            r10.f6518t = r11
            r11 = 1
        L_0x0466:
            r6 = -30987201386311(0xffffe3d13ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r6)
            r6 = 3
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r8 = -31201949751111(0xffffe39f3ade68b9, double:NaN)
            java.lang.String r8 = com.onedelhi.secure.pj0.m61166a(r8)
            r7[r1] = r8
            java.lang.String r8 = r10.f6494h
            r7[r0] = r8
            java.lang.String r8 = r10.f6485e
            r9 = 2
            r7[r9] = r8
            java.lang.String r3 = java.lang.String.format(r3, r7)
            r10.f6512o = r3
            boolean r3 = r10.f6498i
            if (r3 == 0) goto L_0x0494
            r2.setVisibility(r4)
            goto L_0x0497
        L_0x0494:
            r2.setVisibility(r1)
        L_0x0497:
            com.delhitransport.onedelhi.viewmodels.TicketModel r3 = new com.delhitransport.onedelhi.viewmodels.TicketModel
            r3.<init>()
            r10.f6469a = r3
            android.widget.ImageView r3 = r10.f6478c
            com.delhitransport.onedelhi.activities.GenerateTicketActivity2$a r4 = new com.delhitransport.onedelhi.activities.GenerateTicketActivity2$a
            r4.<init>()
            r3.setOnClickListener(r4)
            android.widget.RelativeLayout r3 = r10.f6479c
            com.delhitransport.onedelhi.activities.GenerateTicketActivity2$e r4 = new com.delhitransport.onedelhi.activities.GenerateTicketActivity2$e
            r4.<init>()
            r3.setOnClickListener(r4)
            android.widget.RelativeLayout r3 = r10.f6465a
            com.onedelhi.secure.me1 r4 = new com.onedelhi.secure.me1
            r4.<init>(r10)
            r3.setOnClickListener(r4)
            android.widget.RelativeLayout r3 = r10.f6482d
            com.onedelhi.secure.je1 r4 = new com.onedelhi.secure.je1
            r4.<init>(r10)
            r3.setOnClickListener(r4)
            r10.mo7686X1()
            r3 = -31253489358663(0xffffe3933ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            android.content.res.Resources r4 = r10.getResources()
            r7 = 2131951831(0x7f1300d7, float:1.9540088E38)
            java.lang.String r4 = r4.getString(r7)
            android.app.ProgressDialog r3 = android.app.ProgressDialog.show(r10, r3, r4, r0)
            r10.f6472b = r3
            r3.setCancelable(r1)
            r3 = -31257784325959(0xffffe3923ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r4[r1] = r5
            java.lang.String r7 = r10.f6494h
            r4[r0] = r7
            java.lang.String r7 = r10.f6485e
            r4[r9] = r7
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r10.f6512o = r3
            r3 = -31536957200199(0xffffe3513ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            boolean r3 = r5.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x054c
            java.lang.String r11 = r10.f6497i
            r3 = -31562727003975(0xffffe34b3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            boolean r11 = r11.equalsIgnoreCase(r3)
            if (r11 == 0) goto L_0x0545
            r3 = -31571316938567(0xffffe3493ade68b9, double:NaN)
            java.lang.String r11 = com.onedelhi.secure.pj0.m61166a(r3)
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r4 = -31807540139847(0xffffe3123ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
            r3[r1] = r4
            java.lang.String r1 = r10.f6494h
            r3[r0] = r1
            java.lang.String r0 = r10.f6485e
            r3[r9] = r0
            java.lang.String r11 = java.lang.String.format(r11, r3)
            r10.f6512o = r11
        L_0x0545:
            r0 = -31863374714695(0xffffe3053ade68b9, double:NaN)
            goto L_0x060e
        L_0x054c:
            r3 = -31889144518471(0xffffe2ff3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            boolean r3 = r5.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0609
            java.lang.String r3 = r10.f6497i
            r4 = -31910619354951(0xffffe2fa3ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x058b
            r3 = -31919209289543(0xffffe2f83ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r11)
            r4[r1] = r5
            java.lang.String r5 = r10.f6494h
            r4[r0] = r5
            java.lang.String r5 = r10.f6485e
            r4[r9] = r5
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r10.f6512o = r3
        L_0x058b:
            if (r11 != 0) goto L_0x05d0
            java.lang.String r11 = r10.f6497i
            r3 = -32155432490823(0xffffe2c13ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            boolean r11 = r11.equalsIgnoreCase(r3)
            if (r11 == 0) goto L_0x05c2
            r3 = -32164022425415(0xffffe2bf3ade68b9, double:NaN)
            java.lang.String r11 = com.onedelhi.secure.pj0.m61166a(r3)
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r4 = -32400245626695(0xffffe2883ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
            r3[r1] = r4
            java.lang.String r1 = r10.f6494h
            r3[r0] = r1
            java.lang.String r0 = r10.f6485e
            r3[r9] = r0
            java.lang.String r11 = java.lang.String.format(r11, r3)
            r10.f6512o = r11
        L_0x05c2:
            com.delhitransport.onedelhi.ticket.Ticket r11 = r10.f6468a
            if (r11 != 0) goto L_0x05ca
            r10.mo7676H1()
            goto L_0x0615
        L_0x05ca:
            r0 = -32460375168839(0xffffe27a3ade68b9, double:NaN)
            goto L_0x060e
        L_0x05d0:
            java.lang.String r11 = r10.f6497i
            r3 = -32464670136135(0xffffe2793ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            boolean r11 = r11.equalsIgnoreCase(r3)
            if (r11 == 0) goto L_0x0605
            r3 = -32473260070727(0xffffe2773ade68b9, double:NaN)
            java.lang.String r11 = com.onedelhi.secure.pj0.m61166a(r3)
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r4 = -32709483272007(0xffffe2403ade68b9, double:NaN)
            java.lang.String r4 = com.onedelhi.secure.pj0.m61166a(r4)
            r3[r1] = r4
            java.lang.String r1 = r10.f6494h
            r3[r0] = r1
            java.lang.String r0 = r10.f6485e
            r3[r9] = r0
            java.lang.String r11 = java.lang.String.format(r11, r3)
            r10.f6512o = r11
        L_0x0605:
            r10.mo7678J1()
            goto L_0x0615
        L_0x0609:
            r0 = -32752432944967(0xffffe2363ade68b9, double:NaN)
        L_0x060e:
            java.lang.String r11 = com.onedelhi.secure.pj0.m61166a(r0)
            r10.mo7687Y1(r11)
        L_0x0615:
            com.onedelhi.secure.le1 r11 = new com.onedelhi.secure.le1
            r11.<init>(r10)
            r2.setOnClickListener(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.delhitransport.onedelhi.activities.GenerateTicketActivity2.onCreate(android.os.Bundle):void");
    }

    public void onResume() {
        super.onResume();
    }
}
