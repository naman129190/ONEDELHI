package com.delhitransport.onedelhi.activities;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.C0709m;
import androidx.recyclerview.widget.C0887h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.pass.FormField;
import com.delhitransport.onedelhi.pass.Pass;
import com.delhitransport.onedelhi.pass.PassTxnToken;
import com.delhitransport.onedelhi.pass.PassTxnTokenRequest;
import com.delhitransport.onedelhi.pass.PassType;
import com.delhitransport.onedelhi.pass.ValidatePass;
import com.delhitransport.onedelhi.pass.ValidatePassRequest;
import com.delhitransport.onedelhi.viewmodels.TicketModel;
import com.google.android.gms.common.C1410R;
import com.onedelhi.secure.bu2;
import com.onedelhi.secure.fa1;
import com.onedelhi.secure.fz2;
import com.onedelhi.secure.g74;
import com.onedelhi.secure.gz2;
import com.onedelhi.secure.hz2;
import com.onedelhi.secure.pg4;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.rf4;
import com.onedelhi.secure.t03;
import com.onedelhi.secure.uv1;
import com.onedelhi.secure.w03;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

public class PassFormActivity extends BaseActivity {

    /* renamed from: a */
    public double f6628a = 0.0d;

    /* renamed from: a */
    public float f6629a;

    /* renamed from: a */
    public ProgressDialog f6630a;

    /* renamed from: a */
    public SharedPreferences.Editor f6631a;

    /* renamed from: a */
    public CountDownTimer f6632a;

    /* renamed from: a */
    public Button f6633a;

    /* renamed from: a */
    public TextView f6634a;

    /* renamed from: a */
    public ValidatePass f6635a;

    /* renamed from: a */
    public ValidatePassRequest f6636a;

    /* renamed from: a */
    public TicketModel f6637a;

    /* renamed from: a */
    public fa1 f6638a;

    /* renamed from: a */
    public ArrayList<FormField> f6639a;

    /* renamed from: a */
    public HashMap<String, Object> f6640a;

    /* renamed from: b */
    public float f6641b;

    /* renamed from: b */
    public ProgressDialog f6642b;

    /* renamed from: b */
    public TextView f6643b;

    /* renamed from: b */
    public ArrayList<Float> f6644b;

    /* renamed from: c */
    public float f6645c;

    /* renamed from: c */
    public TextView f6646c;

    /* renamed from: e */
    public String f6647e;

    /* renamed from: f */
    public String f6648f;

    /* renamed from: g */
    public String f6649g;

    /* renamed from: h */
    public String f6650h;

    /* renamed from: i */
    public String f6651i;

    /* renamed from: j */
    public String f6652j;

    /* renamed from: k */
    public String f6653k;

    /* renamed from: l */
    public String f6654l;

    /* renamed from: m */
    public String f6655m;

    /* renamed from: n */
    public String f6656n;

    /* renamed from: o */
    public final int f6657o = 2;

    /* renamed from: o */
    public String f6658o;

    /* renamed from: p */
    public String f6659p;

    /* renamed from: q */
    public String f6660q;

    /* renamed from: com.delhitransport.onedelhi.activities.PassFormActivity$a */
    public class C1268a implements View.OnClickListener {
        public C1268a() {
        }

        public void onClick(View view) {
            PassFormActivity passFormActivity = PassFormActivity.this;
            HashMap unused = passFormActivity.f6640a = passFormActivity.f6638a.mo15902L();
            if (PassFormActivity.this.f6640a != null) {
                PassFormActivity passFormActivity2 = PassFormActivity.this;
                passFormActivity2.mo7765P1(passFormActivity2.f6640a);
                return;
            }
            Toast.makeText(PassFormActivity.this, pj0.m61166a(-49562934941511L), 0).show();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.PassFormActivity$b */
    public class C1269b implements View.OnClickListener {
        public C1269b() {
        }

        public void onClick(View view) {
            PassFormActivity.this.finish();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.PassFormActivity$c */
    public class C1270c implements bu2<ValidatePass> {

        /* renamed from: a */
        public final /* synthetic */ HashMap f6664a;

        public C1270c(HashMap hashMap) {
            this.f6664a = hashMap;
        }

        /* renamed from: a */
        public void mo3946b(ValidatePass validatePass) {
            if (validatePass != null) {
                PassFormActivity.this.f6631a.putString(pj0.m61166a(-49648834287431L), PassFormActivity.this.f6636a.getName());
                PassFormActivity.this.f6631a.putInt(pj0.m61166a(-49670309123911L), PassFormActivity.this.f6636a.getAge());
                PassFormActivity.this.f6631a.putString(pj0.m61166a(-49687488993095L), String.valueOf(this.f6664a.get(pj0.m61166a(-49747618535239L))));
                PassFormActivity.this.f6631a.apply();
                PassFormActivity.this.mo7764O1(1);
                ValidatePass unused = PassFormActivity.this.f6635a = validatePass;
                String unused2 = PassFormActivity.this.f6651i = validatePass.getBooking_id();
                String unused3 = PassFormActivity.this.f6654l = String.valueOf(validatePass.getAmount_payable_by_user());
                PassFormActivity.this.mo7763N1();
                return;
            }
            PassFormActivity passFormActivity = PassFormActivity.this;
            Toast.makeText(passFormActivity, passFormActivity.getResources().getString(C1410R.string.please_try_again), 0).show();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.PassFormActivity$d */
    public class C1271d implements bu2<PassTxnToken> {

        /* renamed from: com.delhitransport.onedelhi.activities.PassFormActivity$d$a */
        public class C1272a implements w03 {
            public C1272a() {
            }

            /* renamed from: a */
            public void mo7770a(String str, Bundle bundle) {
                PassFormActivity passFormActivity = PassFormActivity.this;
                Toast.makeText(passFormActivity, passFormActivity.getResources().getString(C1410R.string.payment_failed), 0).show();
            }

            /* renamed from: b */
            public void mo7771b(String str) {
                PassFormActivity passFormActivity = PassFormActivity.this;
                Toast.makeText(passFormActivity, passFormActivity.getResources().getString(C1410R.string.payment_failed), 0).show();
            }

            /* renamed from: c */
            public void mo7772c() {
                PassFormActivity passFormActivity = PassFormActivity.this;
                Toast.makeText(passFormActivity, passFormActivity.getResources().getString(C1410R.string.payment_failed), 0).show();
            }

            /* renamed from: d */
            public void mo7773d() {
                PassFormActivity passFormActivity = PassFormActivity.this;
                Toast.makeText(passFormActivity, passFormActivity.getResources().getString(C1410R.string.payment_failed), 0).show();
            }

            /* renamed from: e */
            public void mo7774e(String str) {
                PassFormActivity passFormActivity = PassFormActivity.this;
                Toast.makeText(passFormActivity, passFormActivity.getResources().getString(C1410R.string.payment_failed), 0).show();
            }

            /* renamed from: f */
            public void mo7775f(String str) {
                PassFormActivity passFormActivity = PassFormActivity.this;
                Toast.makeText(passFormActivity, passFormActivity.getResources().getString(C1410R.string.payment_failed), 0).show();
            }

            /* renamed from: g */
            public void mo7776g(Bundle bundle) {
                String str;
                String unused = PassFormActivity.this.f6658o = pj0.m61166a(-49807748077383L);
                try {
                    str = bundle.getString(pj0.m61166a(-49824927946567L));
                } catch (Exception unused2) {
                    str = pj0.m61166a(-49850697750343L);
                }
                if (str == null) {
                    str = pj0.m61166a(-49854992717639L);
                }
                PassFormActivity passFormActivity = PassFormActivity.this;
                passFormActivity.mo7761H1(str, passFormActivity.f6658o);
            }

            /* renamed from: h */
            public void mo7777h(int i, String str, String str2) {
                PassFormActivity passFormActivity = PassFormActivity.this;
                Toast.makeText(passFormActivity, passFormActivity.getResources().getString(C1410R.string.payment_failed), 0).show();
            }
        }

        public C1271d() {
        }

        /* renamed from: a */
        public void mo3946b(PassTxnToken passTxnToken) {
            if (passTxnToken == null) {
                if (PassFormActivity.this.f6642b != null) {
                    PassFormActivity.this.mo7762I1();
                    PassFormActivity.this.f6642b.dismiss();
                }
                Toast.makeText(PassFormActivity.this, pj0.m61166a(-50026791409479L), 0).show();
            } else if (passTxnToken.getMessage().equalsIgnoreCase(pj0.m61166a(-49867877619527L))) {
                String unused = PassFormActivity.this.f6652j = passTxnToken.getCallback_url();
                String unused2 = PassFormActivity.this.f6653k = passTxnToken.getMid();
                String unused3 = PassFormActivity.this.f6655m = passTxnToken.getTransaction_token();
                String unused4 = PassFormActivity.this.f6659p = passTxnToken.getHost();
                String unused5 = PassFormActivity.this.f6660q = passTxnToken.getGateway_order_id();
                pg4 pg4 = new pg4(new t03(PassFormActivity.this.f6660q, PassFormActivity.this.f6653k, PassFormActivity.this.f6655m, PassFormActivity.this.f6654l, PassFormActivity.this.f6652j), new C1272a());
                pg4.mo42610u(PassFormActivity.this.f6659p + pj0.m61166a(-49902237357895L));
                pg4.mo42614y(PassFormActivity.this, 2);
                if (PassFormActivity.this.f6642b != null) {
                    PassFormActivity.this.mo7762I1();
                    PassFormActivity.this.f6642b.dismiss();
                }
            }
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.PassFormActivity$e */
    public class C1273e extends CountDownTimer {

        /* renamed from: a */
        public final /* synthetic */ int f6667a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1273e(long j, long j2, int i) {
            super(j, j2);
            this.f6667a = i;
        }

        public void onFinish() {
            if (this.f6667a == 1) {
                if (PassFormActivity.this.f6642b != null) {
                    PassFormActivity.this.f6642b.dismiss();
                }
                PassFormActivity passFormActivity = PassFormActivity.this;
                Toast.makeText(passFormActivity, passFormActivity.getResources().getString(C1410R.string.error_in_loading_payment), 0).show();
                return;
            }
            if (PassFormActivity.this.f6630a != null) {
                PassFormActivity.this.f6630a.dismiss();
            }
            PassFormActivity passFormActivity2 = PassFormActivity.this;
            Toast.makeText(passFormActivity2, passFormActivity2.getResources().getString(C1410R.string.some_error_occurred), 0).show();
            PassFormActivity.this.finish();
        }

        public void onTick(long j) {
        }
    }

    /* renamed from: J1 */
    public static void m8129J1(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(pj0.m61166a(-50104100820807L));
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public /* synthetic */ void m8130K1(Pass pass) {
        if (pass == null) {
            ProgressDialog progressDialog = this.f6630a;
            if (progressDialog != null) {
                progressDialog.dismiss();
                mo7762I1();
            }
            this.f6634a.setVisibility(8);
            this.f6643b.setVisibility(8);
        } else if (!pass.getIs_valid_bus().booleanValue()) {
            ProgressDialog progressDialog2 = this.f6630a;
            if (progressDialog2 != null) {
                progressDialog2.dismiss();
            }
            Toast.makeText(this, pj0.m61166a(-51916577019719L), 0).show();
            finish();
        } else {
            this.f6639a.addAll(pass.getDailyPassForm().getForm_fields());
            this.f6638a.mo5717m();
            ProgressDialog progressDialog3 = this.f6630a;
            if (progressDialog3 != null) {
                progressDialog3.dismiss();
                mo7762I1();
            }
            PassType pass_type = pass.getDailyPassForm().getPass_type();
            String str = pj0.m61166a(-51972411594567L) + getResources().getString(C1410R.string.rupees) + pass_type.getAc();
            String str2 = pj0.m61166a(-52019656234823L) + getResources().getString(C1410R.string.rupees) + pass_type.getNac();
            this.f6641b = pass_type.getAc().floatValue();
            this.f6645c = pass_type.getNac().floatValue();
            if (pass_type.getNac() == null) {
                this.f6643b.setVisibility(8);
            }
            this.f6634a.setText(str);
            this.f6643b.setText(str2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public /* synthetic */ void m8131L1(int i, View view) {
        m8129J1(this);
        float f = this.f6645c;
        this.f6628a = (double) f;
        this.f6629a = f;
        this.f6648f = pj0.m61166a(-51886512248647L);
        this.f6646c.setTextColor(getResources().getColor(C1410R.color.comfort_green));
        this.f6646c.setText(getResources().getString(C1410R.string.rupees) + this.f6628a);
        this.f6634a.setBackground(getResources().getDrawable(C1410R.C1411drawable.pass_type_round_box));
        this.f6643b.setBackground(getResources().getDrawable(C1410R.C1411drawable.selected_border_non_ac));
        this.f6643b.setTextColor(getResources().getColor(C1410R.color.white));
        this.f6634a.setTextColor(getResources().getColor(C1410R.color.black));
        this.f6634a.setPadding(i, i, i, i);
        this.f6643b.setPadding(i, i, i, i);
        this.f6633a.setText(getResources().getString(C1410R.string.pay_amount, new Object[]{String.valueOf(this.f6628a)}));
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public /* synthetic */ void m8132M1(int i, View view) {
        m8129J1(this);
        float f = this.f6641b;
        this.f6628a = (double) f;
        this.f6629a = f;
        this.f6648f = pj0.m61166a(-51873627346759L);
        this.f6646c.setText(getResources().getString(C1410R.string.rupees) + this.f6628a);
        this.f6646c.setTextColor(getResources().getColor(C1410R.color.metro_red));
        this.f6643b.setBackground(getResources().getDrawable(C1410R.C1411drawable.pass_type_round_box));
        this.f6634a.setBackground(getResources().getDrawable(C1410R.C1411drawable.selected_border_ac));
        this.f6643b.setTextColor(getResources().getColor(C1410R.color.black));
        this.f6634a.setTextColor(getResources().getColor(C1410R.color.white));
        this.f6634a.setPadding(i, i, i, i);
        this.f6643b.setPadding(i, i, i, i);
        this.f6633a.setText(getResources().getString(C1410R.string.pay_amount, new Object[]{String.valueOf(this.f6628a)}));
    }

    /* renamed from: H1 */
    public final void mo7761H1(String str, String str2) {
        Intent intent = new Intent(this, GeneratePassActivity.class);
        intent.putExtra(pj0.m61166a(-51564389701447L), this.f6628a);
        intent.putExtra(pj0.m61166a(-51585864537927L), str2);
        intent.putExtra(pj0.m61166a(-51607339374407L), pj0.m61166a(-51645994080071L));
        intent.putExtra(pj0.m61166a(-51671763883847L), str);
        intent.putExtra(pj0.m61166a(-51731893425991L), this.f6635a);
        intent.putExtra(pj0.m61166a(-51787728000839L), this.f6636a);
        mo7762I1();
        startActivity(intent);
        finish();
    }

    /* renamed from: I1 */
    public void mo7762I1() {
        CountDownTimer countDownTimer = this.f6632a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* renamed from: N1 */
    public void mo7763N1() {
        ProgressDialog show = ProgressDialog.show(this, pj0.m61166a(-51478490355527L), getResources().getString(C1410R.string.loading_payment_please_wait), true);
        this.f6642b = show;
        show.setCancelable(false);
        mo7762I1();
        this.f6637a.fetchpaymenttokendailypass(new PassTxnTokenRequest(this.f6651i, this.f6629a)).mo4926j(this, new C1271d());
    }

    /* renamed from: O1 */
    public void mo7764O1(int i) {
        C1273e eVar = new C1273e(rf4.f19824c, 1000, i);
        this.f6632a = eVar;
        eVar.start();
    }

    /* renamed from: P1 */
    public final void mo7765P1(HashMap<String, Object> hashMap) {
        ValidatePassRequest validatePassRequest = new ValidatePassRequest();
        this.f6636a = validatePassRequest;
        try {
            validatePassRequest.setUser_login_id(this.f6647e);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            this.f6636a.setAge(Integer.parseInt(String.valueOf(hashMap.get(pj0.m61166a(-50705396242247L)))));
            try {
                this.f6636a.setEmail(String.valueOf(hashMap.get(pj0.m61166a(-50799885522759L))));
                try {
                    this.f6636a.setGender(String.valueOf(hashMap.get(pj0.m61166a(-50950209378119L))));
                } catch (Exception e2) {
                    System.out.println(e2.toString());
                }
                try {
                    if (!Pattern.compile(pj0.m61166a(-50980274149191L)).matcher(String.valueOf(hashMap.get(pj0.m61166a(-51036108724039L)))).matches()) {
                        Toast.makeText(getApplicationContext(), pj0.m61166a(-51096238266183L), 0).show();
                        return;
                    }
                    this.f6636a.setMobile_number(Float.parseFloat(String.valueOf(hashMap.get(pj0.m61166a(-51190727546695L)))));
                    try {
                        this.f6636a.setName(String.valueOf(hashMap.get(pj0.m61166a(-51371116173127L))));
                        try {
                            this.f6636a.setPass_type(this.f6648f);
                        } catch (Exception e3) {
                            System.out.println(e3.toString());
                        }
                        this.f6636a.setBus_number(this.f6649g);
                        this.f6636a.setUser_lat_lon(this.f6644b);
                        this.f6636a.setValidate_mode(this.f6650h);
                        this.f6637a.validatedailypass(this.f6636a).mo4926j(this, new C1270c(hashMap));
                    } catch (Exception e4) {
                        System.out.println(e4.toString());
                        Toast.makeText(this, pj0.m61166a(-51392591009607L), 0).show();
                    }
                } catch (Exception e5) {
                    Toast.makeText(this, pj0.m61166a(-51250857088839L), 0).show();
                    System.out.println(e5.toString());
                }
            } catch (Exception e6) {
                System.out.println(e6.toString());
                Toast.makeText(this, pj0.m61166a(-50825655326535L), 0).show();
            }
        } catch (Exception e7) {
            System.out.println(e7.toString());
            Toast.makeText(this, pj0.m61166a(-50722576111431L), 0).show();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 2 || intent == null) {
            Toast.makeText(this, getResources().getString(C1410R.string.payment_failed), 0).show();
            return;
        }
        String stringExtra = intent.getStringExtra(pj0.m61166a(-51482785322823L));
        if (stringExtra != null) {
            try {
                this.f6656n = uv1.m67431f(stringExtra).mo42278s().mo44562N(pj0.m61166a(-51521440028487L)).mo36921x();
                String a = pj0.m61166a(-51547209832263L);
                this.f6658o = a;
                mo7761H1(this.f6656n, a);
                return;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        mo7761H1(this.f6656n, this.f6658o);
    }

    @SuppressLint({"CommitPrefEdits"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(1);
        setContentView((int) C1410R.layout.activity_pass_form);
        mo7764O1(0);
        this.f6630a = ProgressDialog.show(this, pj0.m61166a(-50159935395655L), pj0.m61166a(-50164230362951L), true);
        SharedPreferences sharedPreferences = getSharedPreferences(pj0.m61166a(-50220064937799L), 0);
        this.f6631a = sharedPreferences.edit();
        this.f6647e = sharedPreferences.getString(pj0.m61166a(-50305964283719L), pj0.m61166a(-50348913956679L));
        String string = sharedPreferences.getString(pj0.m61166a(-50353208923975L), pj0.m61166a(-50426223368007L));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f6649g = extras.getString(pj0.m61166a(-50439108269895L), pj0.m61166a(-50486352910151L));
            this.f6650h = extras.getString(pj0.m61166a(-50490647877447L), pj0.m61166a(-50550777419591L));
            try {
                this.f6644b = (ArrayList) extras.get(pj0.m61166a(-50563662321479L));
            } catch (Exception e) {
                this.f6644b = new ArrayList<>();
                System.out.println(e.toString());
            }
        } else {
            this.f6649g = pj0.m61166a(-50619496896327L);
            this.f6650h = pj0.m61166a(-50623791863623L);
            this.f6644b = new ArrayList<>();
        }
        SpannableString spannableString = new SpannableString(getResources().getString(C1410R.string.fields_mandatory));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(g74.f12468c);
        if (string.equalsIgnoreCase(pj0.m61166a(-50636676765511L))) {
            spannableString.setSpan(foregroundColorSpan, 14, 15, 33);
        } else {
            spannableString.setSpan(foregroundColorSpan, 0, 1, 33);
        }
        SpannableString spannableString2 = new SpannableString(getResources().getString(C1410R.string.pass_type_asterisks));
        spannableString2.setSpan(foregroundColorSpan, 17, 18, 33);
        this.f6634a = (TextView) findViewById(C1410R.C1412id.tv_ac_pass);
        this.f6643b = (TextView) findViewById(C1410R.C1412id.tv_non_ac_pass);
        this.f6646c = (TextView) findViewById(C1410R.C1412id.tv_totalFare);
        this.f6633a = (Button) findViewById(C1410R.C1412id.btn_buy);
        RecyclerView recyclerView = (RecyclerView) findViewById(C1410R.C1412id.rv_form_fields);
        ((TextView) findViewById(C1410R.C1412id.tv_1)).setText(spannableString);
        ((TextView) findViewById(C1410R.C1412id.tv_2)).setText(spannableString2);
        this.f6633a.setText(getResources().getString(C1410R.string.buy));
        ArrayList<FormField> arrayList = new ArrayList<>();
        this.f6639a = arrayList;
        this.f6638a = new fa1(this, arrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new C0887h());
        recyclerView.setAdapter(this.f6638a);
        TicketModel ticketModel = (TicketModel) new C0709m(this).mo5027a(TicketModel.class);
        this.f6637a = ticketModel;
        ticketModel.fetchdailypassformfields(string, this.f6649g).mo4926j(this, new hz2(this));
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(pj0.m61166a(-50649561667399L));
        int applyDimension = (int) TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics());
        this.f6643b.setOnClickListener(new gz2(this, applyDimension));
        this.f6634a.setOnClickListener(new fz2(this, applyDimension));
        this.f6633a.setOnClickListener(new C1268a());
        ((ImageView) findViewById(C1410R.C1412id.iv_back)).setOnClickListener(new C1269b());
    }
}
