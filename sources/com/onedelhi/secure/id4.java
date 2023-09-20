package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.C0189c;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0709m;
import com.delhitransport.onedelhi.activities.AllPassesActivity;
import com.delhitransport.onedelhi.activities.AllTicketsActivity;
import com.delhitransport.onedelhi.activities.GeneratePassActivity;
import com.delhitransport.onedelhi.activities.GenerateTicketActivity2;
import com.delhitransport.onedelhi.activities.NotificationsActivity;
import com.delhitransport.onedelhi.activities.QRActivity;
import com.delhitransport.onedelhi.p001db.DatabaseAccess;
import com.delhitransport.onedelhi.p001db.UserTickets;
import com.delhitransport.onedelhi.pass.DailyPass;
import com.delhitransport.onedelhi.pass.LastPass;
import com.delhitransport.onedelhi.pass.LastPassRequest;
import com.delhitransport.onedelhi.ticket.LastTicket;
import com.delhitransport.onedelhi.ticket.Ticket;
import com.delhitransport.onedelhi.viewmodels.TicketModel;
import com.google.android.gms.common.C1410R;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class id4 extends Fragment implements mv2, hu4 {

    /* renamed from: n */
    public static final int f13628n = 123;

    /* renamed from: a */
    public Context f13629a;

    /* renamed from: a */
    public SharedPreferences f13630a;

    /* renamed from: a */
    public Location f13631a;

    /* renamed from: a */
    public View f13632a;

    /* renamed from: a */
    public RelativeLayout f13633a;

    /* renamed from: a */
    public TextView f13634a;

    /* renamed from: a */
    public C0189c f13635a;

    /* renamed from: a */
    public Ticket f13636a;

    /* renamed from: a */
    public gu4 f13637a;

    /* renamed from: a */
    public jd1 f13638a;

    /* renamed from: a */
    public final z62 f13639a;

    /* renamed from: a */
    public final SimpleDateFormat f13640a;

    /* renamed from: b */
    public final Location f13641b = new Location(pj0.m61166a(-117543677302599L));

    /* renamed from: b */
    public RelativeLayout f13642b;

    /* renamed from: b */
    public TextView f13643b;

    /* renamed from: b */
    public String f13644b;

    /* renamed from: b */
    public final SimpleDateFormat f13645b;

    /* renamed from: b */
    public boolean f13646b = false;

    /* renamed from: c */
    public RelativeLayout f13647c;

    /* renamed from: c */
    public TextView f13648c;

    /* renamed from: c */
    public String f13649c;

    /* renamed from: c */
    public final SimpleDateFormat f13650c;

    /* renamed from: c */
    public boolean f13651c;

    /* renamed from: d */
    public RelativeLayout f13652d;

    /* renamed from: d */
    public String f13653d;

    /* renamed from: d */
    public boolean f13654d;

    /* renamed from: e */
    public String f13655e;

    /* renamed from: com.onedelhi.secure.id4$a */
    public class C2441a extends z62 {
        public C2441a() {
        }

        /* renamed from: b */
        public void mo7567b(LocationResult locationResult) {
            Location M2 = locationResult.mo10563M2();
            id4.this.f13641b.setLatitude(M2.getLatitude());
            id4.this.f13641b.setLongitude(M2.getLongitude());
            id4.this.mo17723X();
        }
    }

    public id4() {
        String a = pj0.m61166a(-117547972269895L);
        Locale locale = Locale.ENGLISH;
        this.f13640a = new SimpleDateFormat(a, locale);
        this.f13645b = new SimpleDateFormat(pj0.m61166a(-117633871615815L), locale);
        this.f13650c = new SimpleDateFormat(pj0.m61166a(-117719770961735L), locale);
        this.f13639a = new C2441a();
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m17447d0(View view) {
        this.f13635a.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ void m17448e0(EditText editText, EditText editText2, EditText editText3, Spinner spinner, View view) {
        boolean z;
        pj0.m61166a(-120073413039943L);
        String trim = editText.getText().toString().trim();
        editText2.getText().toString().trim();
        String trim2 = editText3.getText().toString().trim();
        spinner.getSelectedItem().toString();
        boolean z2 = false;
        if (spinner.getSelectedItemPosition() == 0) {
            Toast.makeText(this.f13629a, pj0.m61166a(-120077708007239L), 0).show();
            z = false;
        } else {
            z = true;
        }
        if (trim.equalsIgnoreCase(pj0.m61166a(-120197967091527L))) {
            editText.setError(pj0.m61166a(-120202262058823L));
            z = false;
        }
        if (trim2.equalsIgnoreCase(pj0.m61166a(-120279571470151L))) {
            editText3.setError(pj0.m61166a(-120283866437447L));
        } else {
            z2 = z;
        }
        if (z2) {
            this.f13635a.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ void m17449f0(w94 w94) {
        if (w94.mo17590v()) {
            Location location = (Location) w94.mo17586r();
            this.f13631a = location;
            if (location != null) {
                this.f13641b.setLatitude(location.getLatitude());
                this.f13641b.setLongitude(this.f13631a.getLongitude());
                mo17723X();
                return;
            }
            mo17729r0();
            return;
        }
        Toast.makeText(this.f13629a, getResources().getString(C1410R.string.please_turn_on_your_location), 0).show();
        startActivity(new Intent(pj0.m61166a(-119643916310343L)));
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public /* synthetic */ void m17450g0(LastPass lastPass) {
        if (lastPass == null || !lastPass.getMessage().equalsIgnoreCase(pj0.m61166a(-120004693563207L)) || lastPass.getDailyPass() == null) {
            mo17732u0((DailyPass) null);
        } else {
            mo17732u0(lastPass.getDailyPass());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public /* synthetic */ void m17451h0(LastTicket lastTicket) {
        if (lastTicket == null || !lastTicket.getMessage().equalsIgnoreCase(pj0.m61166a(-120039053301575L)) || lastTicket.getLastTicket() == null) {
            mo17733v0((Ticket) null);
            return;
        }
        try {
            mo17733v0(lastTicket.getLastTicket());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public /* synthetic */ void m17452i0(View view) {
        Intent intent = new Intent(this.f13629a, GenerateTicketActivity2.class);
        intent.putExtra(pj0.m61166a(-121035485714247L), pj0.m61166a(-121074140419911L));
        intent.putExtra(pj0.m61166a(-121095615256391L), this.f13636a);
        intent.putExtra(pj0.m61166a(-121142859896647L), false);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public /* synthetic */ void m17453j0(View view) {
        Intent intent = new Intent(this.f13629a, GeneratePassActivity.class);
        intent.putExtra(pj0.m61166a(-120975356172103L), pj0.m61166a(-121014010877767L));
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public /* synthetic */ void m17454k0(View view) {
        if (this.f13651c) {
            Intent intent = new Intent(this.f13629a, QRActivity.class);
            intent.replaceExtras(mo17719S(pj0.m61166a(-120726248068935L)));
            startActivity(intent);
            return;
        }
        Toast.makeText(this.f13629a, pj0.m61166a(-120756312840007L), 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public /* synthetic */ void m17455l0(View view) {
        if (this.f13654d) {
            Intent intent = new Intent(this.f13629a, QRActivity.class);
            intent.replaceExtras(mo17719S(pj0.m61166a(-120468550031175L)));
            startActivity(intent);
            return;
        }
        Toast.makeText(this.f13629a, pj0.m61166a(-120515794671431L), 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public /* synthetic */ void m17456m0(View view) {
        startActivity(new Intent(this.f13629a, NotificationsActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public /* synthetic */ void m17457n0(View view) {
        Intent intent = new Intent(this.f13629a, AllTicketsActivity.class);
        intent.putExtra(pj0.m61166a(-120425600358215L), this.f13644b);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public /* synthetic */ void m17458o0(View view) {
        Intent intent = new Intent(this.f13629a, AllPassesActivity.class);
        intent.putExtra(pj0.m61166a(-120382650685255L), this.f13644b);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public /* synthetic */ void m17459p0(View view) {
        mo17721U();
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public /* synthetic */ void m17461q0(DialogInterface dialogInterface, int i) {
        startActivity(new Intent(pj0.m61166a(-119824304936775L)));
    }

    /* renamed from: B */
    public void mo7527B(boolean z) {
    }

    /* renamed from: F */
    public void mo7528F(boolean z, List<UserTickets> list) {
        List<UserTickets> list2 = list;
        if (list2 == null || list.size() == 0 || !mo17727b0()) {
            mo17733v0((Ticket) null);
            return;
        }
        UserTickets userTickets = list2.get(0);
        Ticket ticket = r3;
        Ticket ticket2 = new Ticket(userTickets.getMessage(), userTickets.getBus_number(), userTickets.getTicket_id(), userTickets.getBooking_id(), userTickets.getFare(), userTickets.getBus_route_long_name(), userTickets.getBus_agency(), userTickets.getBooking_time(), userTickets.getValidity(), userTickets.getDescription(), userTickets.getTotal_fare(), userTickets.getTicket_count(), userTickets.getTicket_count(), userTickets.getFare_per_ticket(), userTickets.getValidity_stop_idx(), userTickets.getTransaction_type(), userTickets.getTransaction_status(), userTickets.getCategory(), userTickets.getTicket_start_stop_name(), userTickets.getTicket_start_stop_idx(), userTickets.getTicket_end_stop_name(), userTickets.getTicket_end_stop_idx(), userTickets.getAmount_payable_by_user(), userTickets.isAc());
        this.f13636a = ticket;
        mo17733v0(ticket);
        Toast.makeText(getContext(), pj0.m61166a(-119545132062535L), 0).show();
    }

    /* renamed from: M */
    public void mo7529M(boolean z, List<UserTickets> list) {
    }

    /* renamed from: S */
    public final Bundle mo17719S(String str) {
        Intent intent = new Intent();
        intent.putExtra(pj0.m61166a(-118089138149191L), this.f13644b);
        intent.putExtra(pj0.m61166a(-118132087822151L), this.f13649c);
        intent.putExtra(pj0.m61166a(-118170742527815L), true);
        intent.putExtra(pj0.m61166a(-118200807298887L), str);
        return intent.getExtras();
    }

    /* renamed from: T */
    public final void mo17720T() {
        boolean z = r70.m26348a(this.f13629a, pj0.m61166a(-118291001612103L)) == 0;
        this.f13646b = z;
        if (!z) {
            requestPermissions(new String[]{pj0.m61166a(-118462800303943L)}, 123);
        } else {
            mo17731t0();
        }
    }

    /* renamed from: U */
    public final void mo17721U() {
        C0189c.C0190a aVar = new C0189c.C0190a(requireContext());
        View inflate = getLayoutInflater().inflate(C1410R.layout.complaint, (ViewGroup) null);
        Spinner spinner = (Spinner) inflate.findViewById(C1410R.C1412id.spinner_complaint);
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireActivity(), 17367048, new String[]{this.f13629a.getString(C1410R.string.select_reason), this.f13629a.getString(C1410R.string.ticketing), this.f13629a.getString(C1410R.string.others)});
        arrayAdapter.setDropDownViewResource(17367049);
        spinner.setAdapter(arrayAdapter);
        ((ImageView) inflate.findViewById(C1410R.C1412id.iv_close)).setOnClickListener(new cd4(this));
        ((Button) inflate.findViewById(C1410R.C1412id.btn_send)).setOnClickListener(new vc4(this, (EditText) inflate.findViewById(C1410R.C1412id.edName), (EditText) inflate.findViewById(C1410R.C1412id.edPhoneNumber), (EditText) inflate.findViewById(C1410R.C1412id.edComplaint), spinner));
        aVar.mo938M(inflate);
        C0189c a = aVar.mo941a();
        this.f13635a = a;
        a.setCancelable(true);
        this.f13635a.show();
    }

    /* renamed from: W */
    public final void mo17722W() {
        this.f13638a.mo18272U().mo17573e(new yc4(this));
    }

    /* renamed from: X */
    public final void mo17723X() {
        try {
            TicketModel ticketModel = (TicketModel) new C0709m(this).mo5027a(TicketModel.class);
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(Float.valueOf((float) this.f13641b.getLatitude()));
                arrayList.add(Float.valueOf((float) this.f13641b.getLongitude()));
            } catch (Exception unused) {
                arrayList.add(Float.valueOf(0.0f));
                arrayList.add(Float.valueOf(0.0f));
            }
            ticketModel.userlastpass(new LastPassRequest(this.f13644b, arrayList)).mo4926j(requireActivity(), new wc4(this));
        } catch (Exception unused2) {
            mo17732u0((DailyPass) null);
        }
    }

    /* renamed from: Y */
    public final void mo17724Y() {
        ((TicketModel) new C0709m(this).mo5027a(TicketModel.class)).userlastticket(this.f13644b).mo4926j(requireActivity(), new xc4(this));
    }

    /* renamed from: Z */
    public final void mo17725Z() {
        if (mo17727b0()) {
            jd4.m18420k(getContext(), this);
        }
    }

    /* renamed from: a0 */
    public final void mo17726a0(String str, int i, int i2, String str2) {
        List<String> list;
        DatabaseAccess instance = DatabaseAccess.getInstance(this.f13629a);
        instance.open();
        try {
            list = instance.getDetails(str, str2.toLowerCase());
        } catch (Exception e) {
            ArrayList arrayList = new ArrayList();
            System.out.println(e.getMessage());
            list = arrayList;
        }
        if (i == i2) {
            this.f13653d = pj0.m61166a(-119188649776967L);
            this.f13655e = pj0.m61166a(-119192944744263L);
            Toast.makeText(this.f13629a, getResources().getString(C1410R.string.some_error_occurred), 0).show();
            instance.close();
            return;
        }
        try {
            gv1 o = uv1.m67431f(list.get(0)).mo42276o();
            this.f13653d = String.valueOf(o.mo36900O(i).mo42278s().mo44567S().toArray()[0]);
            this.f13655e = String.valueOf(o.mo36900O(i2).mo42278s().mo44567S().toArray()[0]);
        } catch (Exception e2) {
            this.f13653d = pj0.m61166a(-119197239711559L);
            this.f13655e = pj0.m61166a(-119201534678855L);
            System.out.println(e2.getMessage());
        }
        instance.close();
    }

    /* renamed from: b0 */
    public final boolean mo17727b0() {
        try {
            if (!isAdded()) {
                return false;
            }
            requireActivity();
            return true;
        } catch (IllegalStateException unused) {
            c41.m40702d().mo32241g(new Exception(pj0.m61166a(-119012556117831L)));
            c41.m40702d().mo32242h();
            return false;
        }
    }

    /* renamed from: c0 */
    public final boolean mo17728c0() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getContext().getSystemService(pj0.m61166a(-118235167037255L))).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void onAttach(@mr2 Context context) {
        super.onAttach(context);
        this.f13629a = context.getApplicationContext();
    }

    public void onCreate(@ts2 Bundle bundle) {
        super.onCreate(bundle);
        this.f13637a = new gu4();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f13632a = layoutInflater.inflate(C1410R.layout.fragment_ticket, viewGroup, false);
        SharedPreferences sharedPreferences = this.f13629a.getSharedPreferences(pj0.m61166a(-117827145144135L), 0);
        this.f13630a = sharedPreferences;
        this.f13644b = sharedPreferences.getString(pj0.m61166a(-117913044490055L), pj0.m61166a(-117955994163015L));
        String string = this.f13630a.getString(pj0.m61166a(-117960289130311L), pj0.m61166a(-118020418672455L));
        this.f13638a = b82.m11677b(this.f13629a);
        mo17720T();
        this.f13649c = pj0.m61166a(string.equalsIgnoreCase(pj0.m61166a(-118041893508935L)) ? -118071958280007L : -118080548214599L);
        this.f13647c = (RelativeLayout) this.f13632a.findViewById(C1410R.C1412id.rv_ticket);
        this.f13652d = (RelativeLayout) this.f13632a.findViewById(C1410R.C1412id.rv_pass);
        this.f13634a = (TextView) this.f13632a.findViewById(C1410R.C1412id.tv_greetings);
        this.f13633a = (RelativeLayout) this.f13632a.findViewById(C1410R.C1412id.rv_ticketCard);
        this.f13642b = (RelativeLayout) this.f13632a.findViewById(C1410R.C1412id.rv_passCard);
        this.f13643b = (TextView) this.f13632a.findViewById(C1410R.C1412id.tv_2);
        this.f13648c = (TextView) this.f13632a.findViewById(C1410R.C1412id.tv_3);
        RelativeLayout relativeLayout = (RelativeLayout) this.f13632a.findViewById(C1410R.C1412id.rv_complaint);
        relativeLayout.setVisibility(8);
        mo17730s0();
        this.f13633a.setOnClickListener(new hd4(this));
        this.f13642b.setOnClickListener(new bd4(this));
        this.f13647c.setOnClickListener(new ed4(this));
        this.f13652d.setOnClickListener(new zc4(this));
        ((RelativeLayout) this.f13632a.findViewById(C1410R.C1412id.rv_notifications)).setOnClickListener(new ad4(this));
        ((TextView) this.f13632a.findViewById(C1410R.C1412id.tv_allTicket)).setOnClickListener(new dd4(this));
        ((TextView) this.f13632a.findViewById(C1410R.C1412id.tv_allPass)).setOnClickListener(new gd4(this));
        relativeLayout.setOnClickListener(new fd4(this));
        return this.f13632a;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f13637a.mo16917a();
    }

    public void onDestroyOptionsMenu() {
        super.onDestroyOptionsMenu();
        this.f13637a.mo16917a();
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onRequestPermissionsResult(int i, @mr2 String[] strArr, @mr2 int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 123) {
            boolean z = false;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (strArr[i2].equalsIgnoreCase(pj0.m61166a(-118634598995783L))) {
                    if (iArr[i2] >= 0) {
                        z = true;
                    } else {
                        Toast.makeText(this.f13629a, pj0.m61166a(-118806397687623L), 0).show();
                    }
                }
            }
            if (z) {
                mo17731t0();
                mo17723X();
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.f13651c = this.f13630a.getBoolean(pj0.m61166a(-119416283043655L), false);
        this.f13654d = this.f13630a.getBoolean(pj0.m61166a(-119472117618503L), false);
        if (!this.f13651c) {
            this.f13647c.setBackground(zk3.m33204g(getResources(), C1410R.C1411drawable.disabled_box, (Resources.Theme) null));
            this.f13643b.setTextColor(getResources().getColor(C1410R.color.white));
        }
        if (!this.f13654d) {
            this.f13652d.setBackground(zk3.m33204g(getResources(), C1410R.C1411drawable.disabled_box, (Resources.Theme) null));
            this.f13648c.setTextColor(getResources().getColor(C1410R.color.white));
        }
        if (mo17728c0()) {
            mo17724Y();
        } else {
            mo17725Z();
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: r0 */
    public final void mo17729r0() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.mo10538j3(100);
        locationRequest.mo10534g3(5);
        locationRequest.mo10533f3(0);
        locationRequest.mo10537i3(1);
        jd1 b = b82.m11677b(this.f13629a);
        this.f13638a = b;
        z62 z62 = this.f13639a;
        Looper myLooper = Looper.myLooper();
        Objects.requireNonNull(myLooper);
        Looper looper = myLooper;
        b.mo18262A(locationRequest, z62, myLooper);
    }

    /* renamed from: s0 */
    public final void mo17730s0() {
        Date date;
        Resources resources;
        try {
            date = this.f13640a.parse(this.f13640a.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
            date = null;
        }
        int i = C1410R.string.good_morning;
        if (date != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTime(date);
            int i2 = instance.get(11);
            if (i2 >= 12) {
                if (i2 < 17) {
                    resources = getResources();
                    i = C1410R.string.good_afternoon;
                } else {
                    resources = getResources();
                    i = C1410R.string.good_evening;
                }
                this.f13634a.setText(resources.getString(i));
            }
        }
        resources = getResources();
        this.f13634a.setText(resources.getString(i));
    }

    /* renamed from: t0 */
    public final void mo17731t0() {
        boolean z;
        if (mo17727b0()) {
            LocationManager locationManager = (LocationManager) this.f13629a.getSystemService(pj0.m61166a(-118922361804615L));
            boolean z2 = false;
            try {
                z = locationManager.isProviderEnabled(pj0.m61166a(-118961016510279L));
            } catch (Exception e) {
                e.printStackTrace();
                z = false;
            }
            try {
                z2 = locationManager.isProviderEnabled(pj0.m61166a(-118978196379463L));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (!z && !z2) {
                new C0189c.C0190a(this.f13632a.getContext()).mo954n(getResources().getString(C1410R.string.turn_on_location)).mo928C(getResources().getString(C1410R.string.turn_on), new uc4(this)).mo959s(this.f13629a.getResources().getString(C1410R.string.cancel), (DialogInterface.OnClickListener) null).mo940O();
            }
            if ((z || z2) && this.f13646b) {
                mo17722W();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r11 = r10.f13650c.parse(r11);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00ec */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x010a  */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17732u0(com.delhitransport.onedelhi.pass.DailyPass r11) {
        /*
            r10 = this;
            android.view.View r0 = r10.f13632a
            r1 = 2131362191(0x7f0a018f, float:1.8344156E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.view.View r1 = r10.f13632a
            r2 = 2131362781(0x7f0a03dd, float:1.8345352E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.view.View r2 = r10.f13632a
            r3 = 2131362795(0x7f0a03eb, float:1.834538E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.view.View r3 = r10.f13632a
            r4 = 2131362793(0x7f0a03e9, float:1.8345377E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.view.View r4 = r10.f13632a
            r5 = 2131362796(0x7f0a03ec, float:1.8345383E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.view.View r5 = r10.f13632a
            r6 = 2131362797(0x7f0a03ed, float:1.8345385E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 8
            r7 = 0
            if (r11 == 0) goto L_0x010e
            r4.setVisibility(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r8 = r10.f13629a
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131952085(0x7f1301d5, float:1.9540603E38)
            java.lang.String r8 = r8.getString(r9)
            r1.append(r8)
            float r8 = r11.getFare()
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r4.setText(r1)
            r1 = 0
            java.lang.String r4 = r11.getBooking_time()     // Catch:{ ParseException -> 0x008a }
            if (r4 == 0) goto L_0x007e
            java.text.SimpleDateFormat r1 = r10.f13640a     // Catch:{ ParseException -> 0x008a }
            java.lang.String r4 = r11.getBooking_time()     // Catch:{ ParseException -> 0x008a }
            java.util.Date r1 = r1.parse(r4)     // Catch:{ ParseException -> 0x008a }
        L_0x007e:
            if (r1 == 0) goto L_0x0095
            java.text.SimpleDateFormat r4 = r10.f13645b     // Catch:{ ParseException -> 0x008a }
            java.lang.String r1 = r4.format(r1)     // Catch:{ ParseException -> 0x008a }
            r3.setText(r1)     // Catch:{ ParseException -> 0x008a }
            goto L_0x0095
        L_0x008a:
            r1 = move-exception
            java.lang.String r4 = r11.getBooking_time()
            r3.setText(r4)
            r1.printStackTrace()
        L_0x0095:
            java.lang.String r1 = r11.getPass_type()
            r5.setText(r1)
            java.lang.String r1 = r11.getPass_type()
            r3 = -119403398141767(0xffff93673ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L_0x00b9
            android.content.Context r1 = r10.f13629a
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131231201(0x7f0801e1, float:1.8078476E38)
            goto L_0x00c2
        L_0x00b9:
            android.content.Context r1 = r10.f13629a
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131231202(0x7f0801e2, float:1.8078478E38)
        L_0x00c2:
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3)
            r5.setBackground(r1)
            java.lang.String r1 = r11.getPass_id()
            r2.setText(r1)
            java.lang.String r11 = r11.getValidity()
            if (r11 == 0) goto L_0x0100
            java.util.Date r1 = new java.util.Date     // Catch:{ ParseException -> 0x00fc }
            r1.<init>()     // Catch:{ ParseException -> 0x00fc }
            java.text.SimpleDateFormat r2 = r10.f13640a     // Catch:{ ParseException -> 0x00fc }
            java.lang.String r1 = r2.format(r1)     // Catch:{ ParseException -> 0x00fc }
            java.util.Date r1 = r2.parse(r1)     // Catch:{ ParseException -> 0x00fc }
            java.text.SimpleDateFormat r2 = r10.f13640a     // Catch:{ Exception -> 0x00ec }
            java.util.Date r11 = r2.parse(r11)     // Catch:{ Exception -> 0x00ec }
            goto L_0x00f2
        L_0x00ec:
            java.text.SimpleDateFormat r2 = r10.f13650c     // Catch:{ ParseException -> 0x00fc }
            java.util.Date r11 = r2.parse(r11)     // Catch:{ ParseException -> 0x00fc }
        L_0x00f2:
            if (r1 == 0) goto L_0x0100
            int r11 = r1.compareTo(r11)     // Catch:{ ParseException -> 0x00fc }
            if (r11 <= 0) goto L_0x0100
            r11 = 1
            goto L_0x0101
        L_0x00fc:
            r11 = move-exception
            r11.printStackTrace()
        L_0x0100:
            r11 = 0
        L_0x0101:
            if (r11 == 0) goto L_0x010a
            r0.setVisibility(r7)
            r0.bringToFront()
            goto L_0x0116
        L_0x010a:
            r0.setVisibility(r6)
            goto L_0x0116
        L_0x010e:
            android.widget.RelativeLayout r11 = r10.f13642b
            r11.setVisibility(r6)
            r1.setVisibility(r7)
        L_0x0116:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.id4.mo17732u0(com.delhitransport.onedelhi.pass.DailyPass):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:56|57) */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r0 = r1.f13650c.parse(r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x02ba */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0257 A[Catch:{ ParseException -> 0x026d }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0263 A[Catch:{ ParseException -> 0x026d }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x02a4 A[SYNTHETIC, Splitter:B:52:0x02a4] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02d8  */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17733v0(com.delhitransport.onedelhi.ticket.Ticket r19) {
        /*
            r18 = this;
            r1 = r18
            android.view.View r0 = r1.f13632a
            r2 = 2131362202(0x7f0a019a, float:1.8344178E38)
            android.view.View r0 = r0.findViewById(r2)
            r2 = r0
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.view.View r0 = r1.f13632a
            r3 = 2131362782(0x7f0a03de, float:1.8345354E38)
            android.view.View r0 = r0.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.view.View r3 = r1.f13632a
            r4 = 2131362876(0x7f0a043c, float:1.8345545E38)
            android.view.View r3 = r3.findViewById(r4)
            android.view.View r4 = r1.f13632a
            r5 = 2131362709(0x7f0a0395, float:1.8345206E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.view.View r5 = r1.f13632a
            r6 = 2131362841(0x7f0a0419, float:1.8345474E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.view.View r6 = r1.f13632a
            r7 = 2131362753(0x7f0a03c1, float:1.8345295E38)
            android.view.View r6 = r6.findViewById(r7)
            android.widget.TextView r6 = (android.widget.TextView) r6
            android.view.View r7 = r1.f13632a
            r8 = 2131362842(0x7f0a041a, float:1.8345476E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.TextView r7 = (android.widget.TextView) r7
            android.view.View r8 = r1.f13632a
            r9 = 2131362844(0x7f0a041c, float:1.834548E38)
            android.view.View r8 = r8.findViewById(r9)
            android.widget.TextView r8 = (android.widget.TextView) r8
            android.view.View r9 = r1.f13632a
            r10 = 2131362824(0x7f0a0408, float:1.834544E38)
            android.view.View r9 = r9.findViewById(r10)
            android.widget.TextView r9 = (android.widget.TextView) r9
            android.view.View r10 = r1.f13632a
            r11 = 2131362746(0x7f0a03ba, float:1.8345281E38)
            android.view.View r10 = r10.findViewById(r11)
            android.widget.TextView r10 = (android.widget.TextView) r10
            android.view.View r11 = r1.f13632a
            r12 = 2131362843(0x7f0a041b, float:1.8345478E38)
            android.view.View r11 = r11.findViewById(r12)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r12 = 8
            r13 = 0
            if (r19 == 0) goto L_0x02dc
            boolean r14 = r18.mo17727b0()
            if (r14 == 0) goto L_0x02dc
            java.lang.String r0 = r19.getCategory()
            r14 = -119205829646151(0xffff93953ade68b9, double:NaN)
            java.lang.String r14 = com.onedelhi.secure.pj0.m61166a(r14)
            boolean r0 = r0.equalsIgnoreCase(r14)
            r15 = 1
            if (r0 == 0) goto L_0x00cc
            android.content.Context r0 = r1.f13629a
            android.content.res.Resources r0 = r0.getResources()
            r14 = 2131100311(0x7f060297, float:1.7813E38)
            int r0 = r0.getColor(r14)
            r3.setBackgroundColor(r0)
            r9.setVisibility(r12)
            r10.setVisibility(r12)
            r8.setVisibility(r12)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r3 = 1123024896(0x42f00000, float:120.0)
            android.content.res.Resources r8 = r18.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r3 = android.util.TypedValue.applyDimension(r15, r3, r8)
            int r3 = (int) r3
            r0.height = r3
            r2.requestLayout()
            goto L_0x01b3
        L_0x00cc:
            r9.setVisibility(r13)
            r10.setVisibility(r13)
            r8.setVisibility(r13)
            java.lang.String r0 = r19.getBus_agency()
            r16 = -119214419580743(0xffff93933ade68b9, double:NaN)
            java.lang.String r14 = com.onedelhi.secure.pj0.m61166a(r16)
            boolean r0 = r0.equalsIgnoreCase(r14)
            if (r0 == 0) goto L_0x0102
            boolean r0 = r19.isAc()
            if (r0 == 0) goto L_0x00f8
            android.content.Context r0 = r1.f13629a
            android.content.res.Resources r0 = r0.getResources()
            r14 = 2131099689(0x7f060029, float:1.7811738E38)
            goto L_0x011b
        L_0x00f8:
            android.content.Context r0 = r1.f13629a
            android.content.res.Resources r0 = r0.getResources()
            r14 = 2131100299(0x7f06028b, float:1.7812976E38)
            goto L_0x011b
        L_0x0102:
            boolean r0 = r19.isAc()
            if (r0 == 0) goto L_0x0112
            android.content.Context r0 = r1.f13629a
            android.content.res.Resources r0 = r0.getResources()
            r14 = 2131100327(0x7f0602a7, float:1.7813032E38)
            goto L_0x011b
        L_0x0112:
            android.content.Context r0 = r1.f13629a
            android.content.res.Resources r0 = r0.getResources()
            r14 = 2131099787(0x7f06008b, float:1.7811937E38)
        L_0x011b:
            int r0 = r0.getColor(r14)
            r3.setBackgroundColor(r0)
            java.lang.String r0 = r19.getBus_number()
            r16 = -119240189384519(0xffff938d3ade68b9, double:NaN)
            java.lang.String r14 = com.onedelhi.secure.pj0.m61166a(r16)
            boolean r0 = r0.contains(r14)
            if (r0 == 0) goto L_0x0145
            android.content.Context r0 = r1.f13629a
            android.content.res.Resources r0 = r0.getResources()
            r14 = 2131099794(0x7f060092, float:1.7811951E38)
            int r0 = r0.getColor(r14)
            r3.setBackgroundColor(r0)
        L_0x0145:
            java.lang.String r0 = r19.getBus_route_long_name()
            int r3 = r19.getTicket_start_stop_idx()
            int r14 = r19.getTicket_end_stop_idx()
            java.lang.String r15 = r19.getBus_agency()
            r1.mo17726a0(r0, r3, r14, r15)
            java.lang.String r0 = r1.f13653d
            r14 = -119270254155591(0xffff93863ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r14)
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x016f
            java.lang.String r0 = r19.getTicket_start_stop_name()
            r1.f13653d = r0
        L_0x016f:
            java.lang.String r0 = r1.f13655e
            r14 = -119274549122887(0xffff93853ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r14)
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0186
            java.lang.String r0 = r19.getTicket_end_stop_name()
            r1.f13655e = r0
        L_0x0186:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r3 = r1.f13629a
            android.content.res.Resources r3 = r3.getResources()
            r14 = 2131952085(0x7f1301d5, float:1.9540603E38)
            java.lang.String r3 = r3.getString(r14)
            r0.append(r3)
            float r3 = r19.getAmount_payable_by_user()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r8.setText(r0)
            java.lang.String r0 = r1.f13653d
            r9.setText(r0)
            java.lang.String r0 = r1.f13655e
            r10.setText(r0)
        L_0x01b3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r3 = r1.f13629a
            android.content.res.Resources r3 = r3.getResources()
            r8 = 2131952085(0x7f1301d5, float:1.9540603E38)
            java.lang.String r3 = r3.getString(r8)
            r0.append(r3)
            float r3 = r19.getFare_per_ticket()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r6.setText(r0)
            java.lang.String r0 = r19.getBus_route_long_name()
            r8 = -119278844090183(0xffff93843ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r8)     // Catch:{ Exception -> 0x0244 }
            boolean r3 = r0.contains(r3)     // Catch:{ Exception -> 0x0244 }
            if (r3 == 0) goto L_0x0200
            r8 = -119291728992071(0xffff93813ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r8)     // Catch:{ Exception -> 0x0244 }
            r8 = -119304613893959(0xffff937e3ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r8)     // Catch:{ Exception -> 0x0244 }
        L_0x01fb:
            java.lang.String r0 = r0.replace(r3, r6)     // Catch:{ Exception -> 0x0244 }
            goto L_0x024d
        L_0x0200:
            r8 = -119308908861255(0xffff937d3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r8)     // Catch:{ Exception -> 0x0244 }
            boolean r3 = r0.contains(r3)     // Catch:{ Exception -> 0x0244 }
            if (r3 == 0) goto L_0x0222
            r8 = -119330383697735(0xffff93783ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r8)     // Catch:{ Exception -> 0x0244 }
            r8 = -119351858534215(0xffff93733ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r8)     // Catch:{ Exception -> 0x0244 }
            goto L_0x01fb
        L_0x0222:
            r8 = -119356153501511(0xffff93723ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r8)     // Catch:{ Exception -> 0x0244 }
            boolean r3 = r0.contains(r3)     // Catch:{ Exception -> 0x0244 }
            if (r3 == 0) goto L_0x024d
            r8 = -119369038403399(0xffff936f3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r8)     // Catch:{ Exception -> 0x0244 }
            r8 = -119381923305287(0xffff936c3ade68b9, double:NaN)
            java.lang.String r6 = com.onedelhi.secure.pj0.m61166a(r8)     // Catch:{ Exception -> 0x0244 }
            goto L_0x01fb
        L_0x0244:
            r8 = -119386218272583(0xffff936b3ade68b9, double:NaN)
            java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r8)
        L_0x024d:
            r4.setText(r0)
            r0 = 0
            java.lang.String r3 = r19.getBooking_time()     // Catch:{ ParseException -> 0x026d }
            if (r3 == 0) goto L_0x0261
            java.text.SimpleDateFormat r0 = r1.f13640a     // Catch:{ ParseException -> 0x026d }
            java.lang.String r3 = r19.getBooking_time()     // Catch:{ ParseException -> 0x026d }
            java.util.Date r0 = r0.parse(r3)     // Catch:{ ParseException -> 0x026d }
        L_0x0261:
            if (r0 == 0) goto L_0x0278
            java.text.SimpleDateFormat r3 = r1.f13645b     // Catch:{ ParseException -> 0x026d }
            java.lang.String r0 = r3.format(r0)     // Catch:{ ParseException -> 0x026d }
            r5.setText(r0)     // Catch:{ ParseException -> 0x026d }
            goto L_0x0278
        L_0x026d:
            r0 = move-exception
            java.lang.String r3 = r19.getBooking_time()
            r5.setText(r3)
            r0.printStackTrace()
        L_0x0278:
            java.lang.String r0 = r19.getTicket_id()
            r11.setText(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3 = -119390513239879(0xffff936a3ade68b9, double:NaN)
            java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r3)
            r0.append(r3)
            int r3 = r19.getTicket_count()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r7.setText(r0)
            java.lang.String r0 = r19.getValidity()
            if (r0 == 0) goto L_0x02ce
            java.util.Date r3 = new java.util.Date     // Catch:{ ParseException -> 0x02ca }
            r3.<init>()     // Catch:{ ParseException -> 0x02ca }
            java.text.SimpleDateFormat r4 = r1.f13640a     // Catch:{ ParseException -> 0x02ca }
            java.lang.String r3 = r4.format(r3)     // Catch:{ ParseException -> 0x02ca }
            java.util.Date r3 = r4.parse(r3)     // Catch:{ ParseException -> 0x02ca }
            java.text.SimpleDateFormat r4 = r1.f13640a     // Catch:{ Exception -> 0x02ba }
            java.util.Date r0 = r4.parse(r0)     // Catch:{ Exception -> 0x02ba }
            goto L_0x02c0
        L_0x02ba:
            java.text.SimpleDateFormat r4 = r1.f13650c     // Catch:{ ParseException -> 0x02ca }
            java.util.Date r0 = r4.parse(r0)     // Catch:{ ParseException -> 0x02ca }
        L_0x02c0:
            if (r3 == 0) goto L_0x02ce
            int r0 = r3.compareTo(r0)     // Catch:{ ParseException -> 0x02ca }
            if (r0 <= 0) goto L_0x02ce
            r15 = 1
            goto L_0x02cf
        L_0x02ca:
            r0 = move-exception
            r0.printStackTrace()
        L_0x02ce:
            r15 = 0
        L_0x02cf:
            if (r15 == 0) goto L_0x02d8
            r2.setVisibility(r13)
            r2.bringToFront()
            goto L_0x02e7
        L_0x02d8:
            r2.setVisibility(r12)
            goto L_0x02e7
        L_0x02dc:
            r0.setVisibility(r13)
            r3.setVisibility(r12)
            android.widget.RelativeLayout r0 = r1.f13633a
            r0.setVisibility(r12)
        L_0x02e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.id4.mo17733v0(com.delhitransport.onedelhi.ticket.Ticket):void");
    }
}
