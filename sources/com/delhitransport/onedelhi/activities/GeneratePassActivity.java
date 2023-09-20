package com.delhitransport.onedelhi.activities;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.C0709m;
import com.delhitransport.onedelhi.pass.DailyPass;
import com.delhitransport.onedelhi.pass.LastPass;
import com.delhitransport.onedelhi.pass.LastPassRequest;
import com.delhitransport.onedelhi.pass.PassRequest;
import com.delhitransport.onedelhi.pass.ValidatePass;
import com.delhitransport.onedelhi.pass.ValidatePassRequest;
import com.delhitransport.onedelhi.ticket.Issue;
import com.delhitransport.onedelhi.viewmodels.TicketModel;
import com.google.android.gms.common.C1410R;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.onedelhi.secure.C3962y2;
import com.onedelhi.secure.C7256xi;
import com.onedelhi.secure.C7363yi;
import com.onedelhi.secure.b82;
import com.onedelhi.secure.bu2;
import com.onedelhi.secure.fj1;
import com.onedelhi.secure.jd1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nu2;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.rf4;
import com.onedelhi.secure.vy4;
import com.onedelhi.secure.w94;
import com.onedelhi.secure.yl2;
import com.onedelhi.secure.z62;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class GeneratePassActivity extends BaseActivity {

    /* renamed from: p */
    public static final int f6320p = 123;

    /* renamed from: a */
    public double f6321a;

    /* renamed from: a */
    public float f6322a;

    /* renamed from: a */
    public AlertDialog f6323a;

    /* renamed from: a */
    public Intent f6324a;

    /* renamed from: a */
    public SharedPreferences.Editor f6325a;

    /* renamed from: a */
    public Location f6326a;

    /* renamed from: a */
    public CountDownTimer f6327a;

    /* renamed from: a */
    public ImageView f6328a;

    /* renamed from: a */
    public RelativeLayout f6329a;

    /* renamed from: a */
    public TextView f6330a;

    /* renamed from: a */
    public ValidatePassRequest f6331a;

    /* renamed from: a */
    public TicketModel f6332a;

    /* renamed from: a */
    public fj1 f6333a;

    /* renamed from: a */
    public jd1 f6334a;

    /* renamed from: a */
    public z62 f6335a = new C1222b();

    /* renamed from: a */
    public Boolean f6336a;

    /* renamed from: a */
    public SimpleDateFormat f6337a = new SimpleDateFormat(pj0.m61166a(-22242647971655L), Locale.ENGLISH);

    /* renamed from: a */
    public ArrayList<Float> f6338a = new ArrayList<>();

    /* renamed from: b */
    public AlertDialog f6339b;

    /* renamed from: b */
    public Location f6340b;

    /* renamed from: b */
    public ImageView f6341b;

    /* renamed from: b */
    public RelativeLayout f6342b;

    /* renamed from: b */
    public TextView f6343b;

    /* renamed from: c */
    public ImageView f6344c;

    /* renamed from: c */
    public RelativeLayout f6345c;

    /* renamed from: c */
    public TextView f6346c;

    /* renamed from: d */
    public RelativeLayout f6347d;

    /* renamed from: d */
    public TextView f6348d;

    /* renamed from: e */
    public TextView f6349e;

    /* renamed from: e */
    public String f6350e;

    /* renamed from: e */
    public boolean f6351e = false;

    /* renamed from: f */
    public TextView f6352f;

    /* renamed from: f */
    public String f6353f;

    /* renamed from: f */
    public boolean f6354f;

    /* renamed from: g */
    public TextView f6355g;

    /* renamed from: g */
    public String f6356g;

    /* renamed from: h */
    public TextView f6357h;

    /* renamed from: h */
    public String f6358h;

    /* renamed from: i */
    public TextView f6359i;

    /* renamed from: i */
    public String f6360i;

    /* renamed from: j */
    public String f6361j;

    /* renamed from: k */
    public String f6362k;

    /* renamed from: l */
    public String f6363l;

    /* renamed from: m */
    public String f6364m;

    /* renamed from: n */
    public String f6365n;

    /* renamed from: o */
    public int f6366o;

    /* renamed from: o */
    public String f6367o = pj0.m61166a(-22238353004359L);

    /* renamed from: p */
    public String f6368p;

    /* renamed from: com.delhitransport.onedelhi.activities.GeneratePassActivity$a */
    public class C1221a implements nu2<Location> {
        public C1221a() {
        }

        public void onComplete(@mr2 w94<Location> w94) {
            if (w94.mo17590v()) {
                Location unused = GeneratePassActivity.this.f6326a = w94.mo17586r();
                if (GeneratePassActivity.this.f6326a != null) {
                    GeneratePassActivity.this.f6340b.setLatitude(GeneratePassActivity.this.f6326a.getLatitude());
                    GeneratePassActivity.this.f6340b.setLongitude(GeneratePassActivity.this.f6326a.getLongitude());
                    return;
                }
                GeneratePassActivity.this.mo7619S1();
                return;
            }
            GeneratePassActivity generatePassActivity = GeneratePassActivity.this;
            Toast.makeText(generatePassActivity, generatePassActivity.getResources().getString(C1410R.string.please_turn_on_your_location), 0).show();
            GeneratePassActivity.this.startActivity(new Intent(pj0.m61166a(-21525388433223L)));
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GeneratePassActivity$b */
    public class C1222b extends z62 {
        public C1222b() {
        }

        /* renamed from: b */
        public void mo7567b(LocationResult locationResult) {
            Location M2 = locationResult.mo10563M2();
            GeneratePassActivity.this.f6340b.setLatitude(M2.getLatitude());
            GeneratePassActivity.this.f6340b.setLongitude(M2.getLongitude());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GeneratePassActivity$c */
    public class C1223c implements View.OnClickListener {
        public C1223c() {
        }

        public void onClick(View view) {
            GeneratePassActivity.this.f6339b.dismiss();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GeneratePassActivity$d */
    public class C1224d implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ EditText f6372a;

        /* renamed from: b */
        public final /* synthetic */ EditText f6374b;

        /* renamed from: com.delhitransport.onedelhi.activities.GeneratePassActivity$d$a */
        public class C1225a implements bu2<Issue> {
            public C1225a() {
            }

            /* renamed from: a */
            public void mo3946b(Issue issue) {
                Toast toast;
                if (issue == null || !issue.getMessage().equalsIgnoreCase(pj0.m61166a(-21705777059655L))) {
                    GeneratePassActivity generatePassActivity = GeneratePassActivity.this;
                    toast = Toast.makeText(generatePassActivity, generatePassActivity.getResources().getString(C1410R.string.some_error_occurred), 0);
                } else {
                    toast = Toast.makeText(GeneratePassActivity.this, issue.getDisplay_message(), 0);
                }
                toast.show();
                GeneratePassActivity.this.f6339b.dismiss();
            }
        }

        public C1224d(EditText editText, EditText editText2) {
            this.f6372a = editText;
            this.f6374b = editText2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x00d2  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0102  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r8) {
            /*
                r7 = this;
                android.widget.EditText r8 = r7.f6372a
                android.text.Editable r8 = r8.getText()
                java.lang.String r8 = r8.toString()
                java.lang.String r4 = r8.trim()
                android.widget.EditText r8 = r7.f6374b
                android.text.Editable r8 = r8.getText()
                java.lang.String r8 = r8.toString()
                java.lang.String r8 = r8.trim()
                r0 = -21740136798023(0xffffec3a3ade68b9, double:NaN)
                java.lang.String r0 = com.onedelhi.secure.pj0.m61166a(r0)
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                java.util.regex.Matcher r0 = r0.matcher(r4)
                r1 = -21770201569095(0xffffec333ade68b9, double:NaN)
                java.lang.String r1 = com.onedelhi.secure.pj0.m61166a(r1)
                boolean r1 = r4.equalsIgnoreCase(r1)
                r2 = 0
                if (r1 == 0) goto L_0x0051
                android.widget.EditText r0 = r7.f6372a
                com.delhitransport.onedelhi.activities.GeneratePassActivity r1 = com.delhitransport.onedelhi.activities.GeneratePassActivity.this
                android.content.res.Resources r1 = r1.getResources()
                r3 = 2131951783(0x7f1300a7, float:1.953999E38)
            L_0x0048:
                java.lang.String r1 = r1.getString(r3)
                r0.setError(r1)
                r0 = 0
                goto L_0x0064
            L_0x0051:
                boolean r0 = r0.matches()
                if (r0 != 0) goto L_0x0063
                android.widget.EditText r0 = r7.f6372a
                com.delhitransport.onedelhi.activities.GeneratePassActivity r1 = com.delhitransport.onedelhi.activities.GeneratePassActivity.this
                android.content.res.Resources r1 = r1.getResources()
                r3 = 2131951792(0x7f1300b0, float:1.9540009E38)
                goto L_0x0048
            L_0x0063:
                r0 = 1
            L_0x0064:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r5 = -21774496536391(0xffffec323ade68b9, double:NaN)
                java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r5)
                r1.append(r3)
                com.delhitransport.onedelhi.activities.GeneratePassActivity r3 = com.delhitransport.onedelhi.activities.GeneratePassActivity.this
                java.lang.String r3 = r3.f6356g
                r1.append(r3)
                r5 = -21838921045831(0xffffec233ade68b9, double:NaN)
                java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r5)
                r1.append(r3)
                com.delhitransport.onedelhi.activities.GeneratePassActivity r3 = com.delhitransport.onedelhi.activities.GeneratePassActivity.this
                java.lang.String r3 = r3.f6358h
                r1.append(r3)
                r5 = -21911935489863(0xffffec123ade68b9, double:NaN)
                java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r5)
                r1.append(r3)
                com.delhitransport.onedelhi.activities.GeneratePassActivity r3 = com.delhitransport.onedelhi.activities.GeneratePassActivity.this
                java.lang.String r3 = r3.f6360i
                r1.append(r3)
                r5 = -21980654966599(0xffffec023ade68b9, double:NaN)
                java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r5)
                r1.append(r3)
                com.delhitransport.onedelhi.activities.GeneratePassActivity r3 = com.delhitransport.onedelhi.activities.GeneratePassActivity.this
                float r3 = r3.f6322a
                r1.append(r3)
                r5 = -22015014704967(0xffffebfa3ade68b9, double:NaN)
                java.lang.String r3 = com.onedelhi.secure.pj0.m61166a(r5)
                r1.append(r3)
                r1.append(r8)
                java.lang.String r3 = r1.toString()
                if (r0 == 0) goto L_0x0102
                com.delhitransport.onedelhi.ticket.IssueRequest r8 = new com.delhitransport.onedelhi.ticket.IssueRequest
                com.delhitransport.onedelhi.activities.GeneratePassActivity r0 = com.delhitransport.onedelhi.activities.GeneratePassActivity.this
                java.lang.String r1 = r0.f6363l
                com.delhitransport.onedelhi.activities.GeneratePassActivity r0 = com.delhitransport.onedelhi.activities.GeneratePassActivity.this
                java.lang.String r2 = r0.f6367o
                r5 = -22079439214407(0xffffebeb3ade68b9, double:NaN)
                java.lang.String r5 = com.onedelhi.secure.pj0.m61166a(r5)
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                com.delhitransport.onedelhi.activities.GeneratePassActivity r0 = com.delhitransport.onedelhi.activities.GeneratePassActivity.this
                com.delhitransport.onedelhi.viewmodels.TicketModel r0 = r0.f6332a
                androidx.lifecycle.LiveData r8 = r0.reportissue(r8)
                com.delhitransport.onedelhi.activities.GeneratePassActivity r0 = com.delhitransport.onedelhi.activities.GeneratePassActivity.this
                com.delhitransport.onedelhi.activities.GeneratePassActivity$d$a r1 = new com.delhitransport.onedelhi.activities.GeneratePassActivity$d$a
                r1.<init>()
                r8.mo4926j(r0, r1)
                goto L_0x0116
            L_0x0102:
                com.delhitransport.onedelhi.activities.GeneratePassActivity r8 = com.delhitransport.onedelhi.activities.GeneratePassActivity.this
                android.content.res.Resources r0 = r8.getResources()
                r1 = 2131952049(0x7f1301b1, float:1.954053E38)
                java.lang.String r0 = r0.getString(r1)
                android.widget.Toast r8 = android.widget.Toast.makeText(r8, r0, r2)
                r8.show()
            L_0x0116:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.delhitransport.onedelhi.activities.GeneratePassActivity.C1224d.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GeneratePassActivity$e */
    public class C1226e implements View.OnClickListener {
        public C1226e() {
        }

        public void onClick(View view) {
            if (GeneratePassActivity.this.f6354f) {
                GeneratePassActivity.this.onBackPressed();
                return;
            }
            Intent intent = new Intent(GeneratePassActivity.this, MainActivity.class);
            intent.putExtra(pj0.m61166a(-21456668956487L), true);
            intent.addFlags(67108864);
            GeneratePassActivity.this.startActivity(intent);
            GeneratePassActivity.this.finish();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GeneratePassActivity$f */
    public class C1227f implements View.OnClickListener {
        public C1227f() {
        }

        public void onClick(View view) {
            GeneratePassActivity.this.mo7621U1();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GeneratePassActivity$g */
    public class C1228g implements View.OnClickListener {
        public C1228g() {
        }

        public void onClick(View view) {
            GeneratePassActivity.this.f6342b.setVisibility(0);
            GeneratePassActivity.this.f6347d.setVisibility(8);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GeneratePassActivity$h */
    public class C1229h implements View.OnClickListener {
        public C1229h() {
        }

        public void onClick(View view) {
            GeneratePassActivity.this.f6342b.setVisibility(8);
            GeneratePassActivity.this.f6347d.setVisibility(0);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GeneratePassActivity$i */
    public class C1230i implements View.OnClickListener {
        public C1230i() {
        }

        public void onClick(View view) {
            Intent unused = GeneratePassActivity.this.f6324a = new Intent(GeneratePassActivity.this, AllPassesActivity.class);
            GeneratePassActivity.this.f6324a.putExtra(pj0.m61166a(-22126683854663L), GeneratePassActivity.this.f6363l);
            GeneratePassActivity generatePassActivity = GeneratePassActivity.this;
            generatePassActivity.startActivity(generatePassActivity.f6324a);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GeneratePassActivity$j */
    public class C1231j implements Runnable {
        public C1231j() {
        }

        public void run() {
            GeneratePassActivity.this.mo7618R1();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GeneratePassActivity$k */
    public class C1232k implements bu2<DailyPass> {
        public C1232k() {
        }

        /* renamed from: a */
        public void mo3946b(DailyPass dailyPass) {
            GeneratePassActivity generatePassActivity;
            int i;
            Resources resources;
            GeneratePassActivity.this.mo7614N1();
            if (dailyPass != null) {
                String message = dailyPass.getMessage();
                dailyPass.getDescription();
                boolean equalsIgnoreCase = message.equalsIgnoreCase(pj0.m61166a(-22169633527623L));
                i = C1410R.string.some_error_occurred;
                if (equalsIgnoreCase) {
                    try {
                        GeneratePassActivity generatePassActivity2 = GeneratePassActivity.this;
                        String unused = generatePassActivity2.f6350e = generatePassActivity2.f6331a.getName();
                        GeneratePassActivity generatePassActivity3 = GeneratePassActivity.this;
                        int unused2 = generatePassActivity3.f6366o = generatePassActivity3.f6331a.getAge();
                        GeneratePassActivity generatePassActivity4 = GeneratePassActivity.this;
                        String unused3 = generatePassActivity4.f6353f = generatePassActivity4.f6331a.getPass_type();
                        String unused4 = GeneratePassActivity.this.f6356g = dailyPass.getBooking_time();
                        String unused5 = GeneratePassActivity.this.f6358h = dailyPass.getValidity();
                        String unused6 = GeneratePassActivity.this.f6360i = dailyPass.getPass_id();
                        String unused7 = GeneratePassActivity.this.f6367o = dailyPass.getBooking_id();
                        float unused8 = GeneratePassActivity.this.f6322a = dailyPass.getFare();
                        String unused9 = GeneratePassActivity.this.f6361j = dailyPass.getBackground();
                        String unused10 = GeneratePassActivity.this.f6368p = dailyPass.getBus_agency();
                        GeneratePassActivity.this.mo7623W1();
                        return;
                    } catch (Exception unused11) {
                    }
                }
                generatePassActivity = GeneratePassActivity.this;
                resources = generatePassActivity.getResources();
            } else {
                generatePassActivity = GeneratePassActivity.this;
                resources = generatePassActivity.getResources();
                i = C1410R.string.no_resp_from_server;
            }
            Toast.makeText(generatePassActivity, resources.getString(i), 0).show();
            GeneratePassActivity.this.f6357h.setVisibility(0);
            GeneratePassActivity.this.f6342b.setVisibility(8);
            GeneratePassActivity.this.f6347d.setVisibility(8);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GeneratePassActivity$l */
    public class C1233l implements bu2<LastPass> {
        public C1233l() {
        }

        /* renamed from: a */
        public void mo3946b(LastPass lastPass) {
            GeneratePassActivity.this.mo7614N1();
            if (lastPass == null || !lastPass.getMessage().equalsIgnoreCase(pj0.m61166a(-22203993265991L)) || lastPass.getDailyPass() == null) {
                GeneratePassActivity.this.f6357h.setVisibility(0);
                GeneratePassActivity.this.f6342b.setVisibility(8);
                GeneratePassActivity.this.f6347d.setVisibility(8);
                return;
            }
            String unused = GeneratePassActivity.this.f6350e = lastPass.getDailyPass().getPassenger_name();
            int unused2 = GeneratePassActivity.this.f6366o = lastPass.getDailyPass().getPassenger_age();
            String unused3 = GeneratePassActivity.this.f6353f = lastPass.getDailyPass().getPass_type();
            String unused4 = GeneratePassActivity.this.f6356g = lastPass.getDailyPass().getBooking_time();
            String unused5 = GeneratePassActivity.this.f6358h = lastPass.getDailyPass().getValidity();
            String unused6 = GeneratePassActivity.this.f6360i = lastPass.getDailyPass().getPass_id();
            String unused7 = GeneratePassActivity.this.f6367o = lastPass.getDailyPass().getBooking_id();
            float unused8 = GeneratePassActivity.this.f6322a = lastPass.getDailyPass().getFare();
            String unused9 = GeneratePassActivity.this.f6361j = lastPass.getDailyPass().getBackground();
            String unused10 = GeneratePassActivity.this.f6368p = lastPass.getDailyPass().getBus_agency();
            GeneratePassActivity.this.mo7623W1();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.GeneratePassActivity$m */
    public class C1234m extends CountDownTimer {
        public C1234m(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            if (GeneratePassActivity.this.f6323a != null) {
                GeneratePassActivity.this.f6323a.dismiss();
            }
            GeneratePassActivity generatePassActivity = GeneratePassActivity.this;
            Toast.makeText(generatePassActivity, generatePassActivity.getResources().getString(C1410R.string.some_error_occurred), 0).show();
            GeneratePassActivity.this.onBackPressed();
        }

        public void onTick(long j) {
        }
    }

    /* renamed from: L1 */
    public final void mo7612L1() {
        if (r70.m26348a(this, pj0.m61166a(-23801721100103L)) != 0) {
            this.f6336a = Boolean.FALSE;
            if (C3962y2.m31865M(this, pj0.m61166a(-23973519791943L)) && Build.VERSION.SDK_INT >= 23) {
                requestPermissions(new String[]{pj0.m61166a(-24145318483783L)}, 123);
                return;
            }
            return;
        }
        this.f6336a = Boolean.TRUE;
        mo7617Q1();
    }

    /* renamed from: M1 */
    public final void mo7613M1() {
        this.f6332a.confirmationdailypass(new PassRequest((float) this.f6321a, this.f6365n, this.f6367o, pj0.m61166a(-22964202477383L), this.f6364m)).mo4926j(this, new C1232k());
    }

    /* renamed from: N1 */
    public void mo7614N1() {
        CountDownTimer countDownTimer = this.f6327a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        AlertDialog alertDialog = this.f6323a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* renamed from: O1 */
    public String mo7615O1(String str) {
        return Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 0);
    }

    /* renamed from: P1 */
    public void mo7616P1(JSONObject jSONObject) {
        String O1 = mo7615O1(jSONObject.toString());
        try {
            this.f6328a.setImageBitmap(new C7256xi().mo47185a(new yl2().mo35510a(O1, C7363yi.QR_CODE, 1000, 1000)));
        } catch (vy4 e) {
            e.printStackTrace();
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: Q1 */
    public final void mo7617Q1() {
        if (this.f6336a.booleanValue()) {
            this.f6334a.mo18272U().mo17573e(new C1221a());
        } else {
            mo7612L1();
        }
    }

    /* renamed from: R1 */
    public final void mo7618R1() {
        this.f6338a.add(Float.valueOf((float) this.f6340b.getLatitude()));
        this.f6338a.add(Float.valueOf((float) this.f6340b.getLongitude()));
        this.f6332a.userlastpass(new LastPassRequest(this.f6363l, this.f6338a)).mo4926j(this, new C1233l());
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: S1 */
    public final void mo7619S1() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.mo10538j3(100);
        locationRequest.mo10534g3(5);
        locationRequest.mo10533f3(0);
        locationRequest.mo10537i3(1);
        jd1 a = b82.m11676a(this);
        this.f6334a = a;
        a.mo18262A(locationRequest, this.f6335a, Looper.myLooper());
    }

    /* renamed from: T1 */
    public final void mo7620T1() {
        HashMap hashMap = new HashMap();
        hashMap.put(pj0.m61166a(-23393699206983L), this.f6361j);
        hashMap.put(pj0.m61166a(-23419469010759L), this.f6360i);
        hashMap.put(pj0.m61166a(-23449533781831L), this.f6353f);
        hashMap.put(pj0.m61166a(-23488188487495L), this.f6358h);
        hashMap.put(pj0.m61166a(-23544023062343L), this.f6356g);
        hashMap.put(pj0.m61166a(-23595562669895L), Integer.valueOf(this.f6366o));
        hashMap.put(pj0.m61166a(-23651397244743L), this.f6350e);
        hashMap.put(pj0.m61166a(-23711526786887L), Float.valueOf(this.f6322a));
        this.f6325a.putString(pj0.m61166a(-23754476459847L), this.f6333a.mo36024z(hashMap));
        boolean commit = this.f6325a.commit();
        for (int i = 10; i > 0 && !commit; i--) {
            commit = this.f6325a.commit();
        }
    }

    /* renamed from: U1 */
    public void mo7621U1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View inflate = getLayoutInflater().inflate(C1410R.layout.ticket_report_issue, (ViewGroup) null);
        builder.setView(inflate);
        ((RadioGroup) inflate.findViewById(C1410R.C1412id.rg_issues)).setVisibility(8);
        ((TextView) inflate.findViewById(C1410R.C1412id.tv_2)).setVisibility(8);
        EditText editText = (EditText) inflate.findViewById(C1410R.C1412id.edit_contact);
        ((Button) inflate.findViewById(C1410R.C1412id.btn_cancel)).setOnClickListener(new C1223c());
        ((Button) inflate.findViewById(C1410R.C1412id.btn_send)).setOnClickListener(new C1224d(editText, (EditText) inflate.findViewById(C1410R.C1412id.edit_issue)));
        AlertDialog create = builder.create();
        this.f6339b = create;
        create.setCancelable(false);
        this.f6339b.show();
    }

    /* renamed from: V1 */
    public final void mo7622V1() {
        this.f6341b.setVisibility(0);
        this.f6341b.bringToFront();
        this.f6325a.putBoolean(pj0.m61166a(-23342159599431L), true);
        boolean commit = this.f6325a.commit();
        for (int i = 10; i > 0 && !commit; i--) {
            commit = this.f6325a.commit();
        }
    }

    /* renamed from: W1 */
    public final void mo7623W1() {
        int i;
        Resources resources;
        RelativeLayout relativeLayout;
        Date date;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(pj0.m61166a(-22981382346567L), this.f6356g);
            jSONObject.put(pj0.m61166a(-23037216921415L), this.f6358h);
            jSONObject.put(pj0.m61166a(-23097346463559L), this.f6360i);
            jSONObject.put(pj0.m61166a(-23131706201927L), (double) this.f6322a);
            jSONObject.put(pj0.m61166a(-23153181038407L), this.f6368p);
            jSONObject.put(pj0.m61166a(-23183245809479L), this.f6353f);
            jSONObject.put(pj0.m61166a(-23226195482439L), pj0.m61166a(-23260555220807L));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        mo7616P1(jSONObject);
        this.f6352f.setText(this.f6360i);
        this.f6343b.setText(this.f6353f);
        this.f6349e.setText(this.f6358h);
        this.f6348d.setText(this.f6356g);
        this.f6330a.setText(this.f6350e);
        this.f6346c.setText(String.valueOf(this.f6366o));
        if (this.f6353f.equalsIgnoreCase(pj0.m61166a(-23307799861063L))) {
            this.f6359i.setText(getResources().getString(C1410R.string.only_ac));
            relativeLayout = this.f6329a;
            resources = getResources();
            i = C1410R.color.pastel_red;
        } else {
            this.f6359i.setText(getResources().getString(C1410R.string.only_non_ac));
            relativeLayout = this.f6329a;
            resources = getResources();
            i = C1410R.color.pastel_green;
        }
        relativeLayout.setBackgroundColor(resources.getColor(i));
        this.f6345c.setBackgroundColor(getResources().getColor(i));
        this.f6355g.setText(getResources().getString(C1410R.string.rupees) + this.f6322a);
        if (!this.f6362k.equalsIgnoreCase(pj0.m61166a(-23320684762951L))) {
            mo7620T1();
        }
        try {
            if (this.f6358h != null) {
                Date date2 = new Date();
                SimpleDateFormat simpleDateFormat = this.f6337a;
                Date parse = simpleDateFormat.parse(simpleDateFormat.format(date2));
                try {
                    date = this.f6337a.parse(this.f6358h);
                } catch (Exception unused) {
                    date = null;
                }
                if (parse != null) {
                    if (parse.compareTo(date) > 0) {
                        this.f6351e = true;
                        mo7622V1();
                    }
                }
                this.f6351e = false;
            }
        } catch (ParseException e2) {
            e2.printStackTrace();
        }
        if (this.f6351e) {
            this.f6341b.setVisibility(0);
            this.f6341b.bringToFront();
        } else {
            this.f6341b.setVisibility(8);
        }
        mo7614N1();
    }

    /* renamed from: X1 */
    public void mo7624X1() {
        C1234m mVar = new C1234m(rf4.f19824c, 1000);
        this.f6327a = mVar;
        mVar.start();
    }

    public void onBackPressed() {
        if (this.f6354f) {
            super.onBackPressed();
            finish();
            return;
        }
        this.f6344c.callOnClick();
    }

    @SuppressLint({"CommitPrefEdits"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(8192, 8192);
        setRequestedOrientation(1);
        setContentView((int) C1410R.layout.activity_generate_pass);
        Intent intent = getIntent();
        this.f6324a = intent;
        Bundle extras = intent.getExtras();
        ValidatePass validatePass = null;
        if (extras != null) {
            validatePass = (ValidatePass) this.f6324a.getSerializableExtra(pj0.m61166a(-22328547317575L));
            this.f6331a = (ValidatePassRequest) this.f6324a.getSerializableExtra(pj0.m61166a(-22384381892423L));
            this.f6365n = extras.getString(pj0.m61166a(-22470281238343L), pj0.m61166a(-22530410780487L));
            this.f6321a = extras.getDouble(pj0.m61166a(-22543295682375L), 0.0d);
            this.f6364m = extras.getString(pj0.m61166a(-22564770518855L), pj0.m61166a(-22586245355335L));
            this.f6362k = extras.getString(pj0.m61166a(-22603425224519L), pj0.m61166a(-22642079930183L));
            this.f6354f = extras.getBoolean(pj0.m61166a(-22663554766663L), false);
        } else {
            this.f6331a = null;
            this.f6365n = pj0.m61166a(-22685029603143L);
            this.f6321a = 0.0d;
            this.f6364m = pj0.m61166a(-22697914505031L);
            this.f6362k = pj0.m61166a(-22715094374215L);
        }
        this.f6330a = (TextView) findViewById(C1410R.C1412id.tv_passengerName);
        this.f6346c = (TextView) findViewById(C1410R.C1412id.tv_passengerAge);
        this.f6343b = (TextView) findViewById(C1410R.C1412id.tv_passType);
        this.f6348d = (TextView) findViewById(C1410R.C1412id.tv_bookingTime);
        this.f6349e = (TextView) findViewById(C1410R.C1412id.tv_validityTime);
        this.f6352f = (TextView) findViewById(C1410R.C1412id.tv_passID);
        this.f6355g = (TextView) findViewById(C1410R.C1412id.tv_totalFare);
        this.f6357h = (TextView) findViewById(C1410R.C1412id.tv_activePass);
        this.f6328a = (ImageView) findViewById(C1410R.C1412id.img_ticketQR);
        this.f6329a = (RelativeLayout) findViewById(C1410R.C1412id.rv_background);
        this.f6342b = (RelativeLayout) findViewById(C1410R.C1412id.rv_QR);
        this.f6345c = (RelativeLayout) findViewById(C1410R.C1412id.rv_showQR);
        this.f6347d = (RelativeLayout) findViewById(C1410R.C1412id.rv_pass);
        this.f6359i = (TextView) findViewById(C1410R.C1412id.tv_10);
        this.f6341b = (ImageView) findViewById(C1410R.C1412id.iv_pass_expire);
        this.f6344c = (ImageView) findViewById(C1410R.C1412id.iv_close);
        this.f6334a = b82.m11676a(this);
        this.f6340b = new Location(pj0.m61166a(-22736569210695L));
        mo7612L1();
        mo7617Q1();
        mo7624X1();
        ProgressDialog show = ProgressDialog.show(this, pj0.m61166a(-22740864177991L), getResources().getString(C1410R.string.getting_pass), true);
        this.f6323a = show;
        show.setCancelable(false);
        this.f6344c.setOnClickListener(new C1226e());
        ((RelativeLayout) findViewById(C1410R.C1412id.rv_report)).setOnClickListener(new C1227f());
        this.f6345c.setOnClickListener(new C1228g());
        this.f6342b.setOnClickListener(new C1229h());
        SharedPreferences sharedPreferences = getSharedPreferences(pj0.m61166a(-22745159145287L), 0);
        this.f6363l = sharedPreferences.getString(pj0.m61166a(-22831058491207L), pj0.m61166a(-22874008164167L));
        this.f6325a = sharedPreferences.edit();
        this.f6333a = new fj1();
        this.f6332a = (TicketModel) new C0709m(this).mo5027a(TicketModel.class);
        ((RelativeLayout) findViewById(C1410R.C1412id.rv_allPass)).setOnClickListener(new C1230i());
        if (validatePass != null) {
            this.f6367o = validatePass.getBooking_id();
        }
        if (this.f6362k.equalsIgnoreCase(pj0.m61166a(-22878303131463L))) {
            new Handler().postDelayed(new C1231j(), 100);
        } else if (this.f6362k.equalsIgnoreCase(pj0.m61166a(-22899777967943L))) {
            DailyPass dailyPass = (DailyPass) getIntent().getExtras().get(pj0.m61166a(-22942727640903L));
            if (dailyPass != null) {
                this.f6360i = dailyPass.getPass_id();
                this.f6353f = dailyPass.getPass_type();
                this.f6358h = dailyPass.getValidity();
                this.f6356g = dailyPass.getBooking_time();
                this.f6350e = dailyPass.getPassenger_name();
                this.f6322a = dailyPass.getFare();
                this.f6366o = dailyPass.getPassenger_age();
                mo7623W1();
            }
        } else {
            mo7613M1();
        }
    }

    public void onResume() {
        super.onResume();
        this.f6336a = Boolean.FALSE;
        mo7612L1();
    }
}
