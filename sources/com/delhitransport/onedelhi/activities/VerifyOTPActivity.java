package com.delhitransport.onedelhi.activities;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.C0709m;
import com.delhitransport.onedelhi.models.auth.CreateResponse;
import com.delhitransport.onedelhi.models.auth.VerifyRequest;
import com.delhitransport.onedelhi.models.auth.VerifyResponse;
import com.delhitransport.onedelhi.util.SmsBroadcastReceiver;
import com.delhitransport.onedelhi.viewmodels.AuthenticationViewModel;
import com.google.android.gms.common.C1410R;
import com.onedelhi.secure.gv2;
import com.onedelhi.secure.m04;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.ps4;
import com.onedelhi.secure.qs4;
import com.onedelhi.secure.rs4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.vu2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyOTPActivity extends BaseActivity implements TextWatcher, View.OnKeyListener, View.OnFocusChangeListener {

    /* renamed from: a */
    public static InputMethodManager f7004a;

    /* renamed from: a */
    public SharedPreferences.Editor f7005a;

    /* renamed from: a */
    public CountDownTimer f7006a;

    /* renamed from: a */
    public EditText f7007a;

    /* renamed from: a */
    public TextView f7008a;

    /* renamed from: a */
    public SmsBroadcastReceiver f7009a;

    /* renamed from: a */
    public final char[] f7010a = new char[4];

    /* renamed from: b */
    public EditText f7011b;

    /* renamed from: b */
    public TextView f7012b;

    /* renamed from: c */
    public EditText f7013c;

    /* renamed from: d */
    public EditText f7014d;

    /* renamed from: e */
    public String f7015e;

    /* renamed from: e */
    public boolean f7016e;

    /* renamed from: f */
    public String f7017f;

    /* renamed from: f */
    public boolean f7018f = false;

    /* renamed from: g */
    public String f7019g;

    /* renamed from: g */
    public boolean f7020g;

    /* renamed from: h */
    public String f7021h;

    /* renamed from: i */
    public String f7022i;

    /* renamed from: o */
    public int f7023o;

    /* renamed from: p */
    public int f7024p;

    /* renamed from: com.delhitransport.onedelhi.activities.VerifyOTPActivity$a */
    public class C1305a implements vu2 {
        public C1305a() {
        }

        /* renamed from: c */
        public void mo7919c(@mr2 Exception exc) {
            Toast.makeText(VerifyOTPActivity.this.getApplicationContext(), pj0.m61166a(-79726490261319L), 1).show();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.VerifyOTPActivity$b */
    public class C1306b implements gv2<Void> {
        public C1306b() {
        }

        /* renamed from: b */
        public void mo7740a(Void voidR) {
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.VerifyOTPActivity$c */
    public class C1307c implements SmsBroadcastReceiver.C1398a {
        public C1307c() {
        }

        /* renamed from: a */
        public void mo7921a(Intent intent) {
            VerifyOTPActivity.this.startActivityForResult(intent, 239);
        }

        /* renamed from: b */
        public void mo7922b() {
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.VerifyOTPActivity$d */
    public class C1308d extends CountDownTimer {
        public C1308d(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            VerifyOTPActivity.this.f7008a.setTextColor(VerifyOTPActivity.this.getResources().getColor(C1410R.color.one_delhi_red));
            VerifyOTPActivity.this.f7008a.setText(VerifyOTPActivity.this.getResources().getString(C1410R.string.resend_new_code));
            boolean unused = VerifyOTPActivity.this.f7018f = true;
        }

        public void onTick(long j) {
            VerifyOTPActivity.this.f7008a.setText(VerifyOTPActivity.this.getResources().getString(C1410R.string.resend_in, new Object[]{Long.valueOf(j / 1000)}));
            boolean unused = VerifyOTPActivity.this.f7018f = false;
        }
    }

    /* renamed from: n1 */
    public static void m8499n1(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        InputMethodManager inputMethodManager = f7004a;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public /* synthetic */ void m8500o1(View view) {
        if (this.f7018f) {
            mo7914s1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public /* synthetic */ void m8501p1(CreateResponse createResponse) {
        if (createResponse == null) {
            return;
        }
        if (createResponse.getMessage().equalsIgnoreCase(pj0.m61166a(-81349987899207L))) {
            Toast.makeText(this, pj0.m61166a(-81384347637575L), 0).show();
            mo7917v1();
            return;
        }
        Toast.makeText(this, createResponse.getDescription(), 0).show();
        mo7907k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public /* synthetic */ void m8502q1(long j, VerifyResponse verifyResponse) {
        String str;
        if (verifyResponse == null) {
            mo7907k1();
            str = pj0.m61166a(-81242613716807L);
        } else if (verifyResponse.getMessage().equalsIgnoreCase(pj0.m61166a(-81010685482823L))) {
            Toast.makeText(this, verifyResponse.getDescription(), 0).show();
            this.f7005a.putString(pj0.m61166a(-81045045221191L), this.f7015e);
            this.f7005a.putString(pj0.m61166a(-81066520057671L), String.valueOf(j));
            this.f7005a.putString(pj0.m61166a(-81096584828743L), this.f7017f);
            this.f7005a.putBoolean(pj0.m61166a(-81122354632519L), true);
            this.f7005a.apply();
            Intent intent = new Intent(this, GenderActivity.class);
            intent.putExtra(pj0.m61166a(-81156714370887L), this.f7016e);
            intent.putExtra(pj0.m61166a(-81212548945735L), this.f7020g);
            intent.setFlags(335577088);
            startActivity(intent);
            finish();
            return;
        } else {
            str = verifyResponse.getDescription();
        }
        Toast.makeText(this, str, 0).show();
    }

    public void afterTextChanged(Editable editable) {
        EditText editText;
        int i = this.f7024p;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4 && !this.f7014d.getText().toString().isEmpty()) {
                        this.f7010a[3] = this.f7014d.getText().toString().charAt(0);
                        mo7909m1();
                        return;
                    }
                    return;
                } else if (!this.f7013c.getText().toString().isEmpty()) {
                    this.f7010a[2] = this.f7013c.getText().toString().charAt(0);
                    editText = this.f7014d;
                } else {
                    return;
                }
            } else if (!this.f7011b.getText().toString().isEmpty()) {
                this.f7010a[1] = this.f7011b.getText().toString().charAt(0);
                editText = this.f7013c;
            } else {
                return;
            }
        } else if (!this.f7007a.getText().toString().isEmpty()) {
            this.f7010a[0] = this.f7007a.getText().toString().charAt(0);
            editText = this.f7011b;
        } else {
            return;
        }
        editText.requestFocus();
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: k1 */
    public void mo7907k1() {
        CountDownTimer countDownTimer = this.f7006a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f7018f = true;
            this.f7008a.setTextColor(getResources().getColor(C1410R.color.one_delhi_red));
            this.f7008a.setText(getResources().getString(C1410R.string.resend_new_code));
        }
    }

    /* renamed from: l1 */
    public final void mo7908l1(String str) {
        Matcher matcher = Pattern.compile(pj0.m61166a(-80452339734343L)).matcher(str);
        if (matcher.find()) {
            this.f7022i = matcher.group(0);
            mo7909m1();
        }
    }

    /* renamed from: m1 */
    public final void mo7909m1() {
        m8499n1(this);
        String str = this.f7022i;
        if (str == null || str.isEmpty()) {
            this.f7022i = String.valueOf(this.f7010a);
        }
        if (!this.f7019g.equalsIgnoreCase(pj0.m61166a(-80718627706695L))) {
            mo7918w1(this.f7019g, this.f7022i);
            return;
        }
        Toast.makeText(this, pj0.m61166a(-80722922673991L), 0).show();
        onBackPressed();
    }

    public void onActivityResult(int i, int i2, @ts2 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 239 && i2 == -1 && intent != null) {
            mo7908l1(intent.getStringExtra(pj0.m61166a(-80211821565767L)));
        }
    }

    public void onCreate(@ts2 Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1410R.layout.activity_otp_verify);
        this.f7005a = getSharedPreferences(pj0.m61166a(-79816684574535L), 0).edit();
        this.f7007a = (EditText) findViewById(C1410R.C1412id.edit_num_1);
        this.f7011b = (EditText) findViewById(C1410R.C1412id.edit_num_2);
        this.f7013c = (EditText) findViewById(C1410R.C1412id.edit_num_3);
        this.f7014d = (EditText) findViewById(C1410R.C1412id.edit_num_4);
        this.f7008a = (TextView) findViewById(C1410R.C1412id.tv_resend);
        this.f7012b = (TextView) findViewById(C1410R.C1412id.tv_2);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f7015e = extras.getString(pj0.m61166a(-79902583920455L));
            this.f7017f = extras.getString(pj0.m61166a(-79924058756935L));
            this.f7019g = extras.getString(pj0.m61166a(-79949828560711L));
            this.f7021h = extras.getString(pj0.m61166a(-79979893331783L));
            this.f7023o = extras.getInt(pj0.m61166a(-80022843004743L));
            this.f7016e = extras.getBoolean(pj0.m61166a(-80052907775815L));
            this.f7020g = extras.getBoolean(pj0.m61166a(-80108742350663L));
        } else {
            this.f7015e = pj0.m61166a(-80138807121735L);
            this.f7019g = pj0.m61166a(-80143102089031L);
            this.f7017f = pj0.m61166a(-80147397056327L);
            this.f7021h = pj0.m61166a(-80151692023623L);
            this.f7023o = 1;
            this.f7016e = false;
            this.f7020g = false;
        }
        this.f7008a.setTextColor(getResources().getColor(C1410R.color.grey));
        this.f7012b.setText(getResources().getString(C1410R.string.verify_top_1, new Object[]{this.f7019g}));
        f7004a = (InputMethodManager) getSystemService(pj0.m61166a(-80155986990919L));
        this.f7008a.setOnClickListener(new ps4(this));
        mo7915t1();
        mo7917v1();
        this.f7007a.requestFocus();
        mo7916u1();
    }

    @SuppressLint({"NonConstantResourceId"})
    public void onFocusChange(View view, boolean z) {
        int i;
        switch (view.getId()) {
            case C1410R.C1412id.edit_num_1 /*2131362028*/:
                i = 1;
                break;
            case C1410R.C1412id.edit_num_2 /*2131362029*/:
                i = 2;
                break;
            case C1410R.C1412id.edit_num_3 /*2131362030*/:
                i = 3;
                break;
            case C1410R.C1412id.edit_num_4 /*2131362031*/:
                i = 4;
                break;
            default:
                return;
        }
        this.f7024p = i;
    }

    @SuppressLint({"NonConstantResourceId"})
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        long j;
        EditText editText;
        if (keyEvent.getAction() != 0 || i != 67) {
            return false;
        }
        switch (view.getId()) {
            case C1410R.C1412id.edit_num_2 /*2131362029*/:
                if (this.f7011b.getText().toString().isEmpty()) {
                    this.f7007a.requestFocus();
                }
                editText = this.f7007a;
                j = -80997800580935L;
                break;
            case C1410R.C1412id.edit_num_3 /*2131362030*/:
                if (this.f7013c.getText().toString().isEmpty()) {
                    this.f7011b.requestFocus();
                }
                editText = this.f7011b;
                j = -81002095548231L;
                break;
            case C1410R.C1412id.edit_num_4 /*2131362031*/:
                if (this.f7014d.getText().toString().isEmpty()) {
                    this.f7013c.requestFocus();
                }
                editText = this.f7013c;
                j = -81006390515527L;
                break;
            default:
                return false;
        }
        editText.setText(pj0.m61166a(j));
        return false;
    }

    public void onStart() {
        super.onStart();
        mo7913r1();
    }

    public void onStop() {
        super.onStop();
        unregisterReceiver(this.f7009a);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: r1 */
    public final void mo7913r1() {
        SmsBroadcastReceiver smsBroadcastReceiver = new SmsBroadcastReceiver();
        this.f7009a = smsBroadcastReceiver;
        smsBroadcastReceiver.f7206a = new C1307c();
        registerReceiver(this.f7009a, new IntentFilter(pj0.m61166a(-80495289407303L)));
    }

    /* renamed from: s1 */
    public final void mo7914s1() {
        long j;
        AuthenticationViewModel authenticationViewModel = (AuthenticationViewModel) new C0709m(this).mo5027a(AuthenticationViewModel.class);
        try {
            j = Long.parseLong(this.f7019g);
        } catch (Exception e) {
            e.printStackTrace();
            j = -1;
        }
        if (j != -1) {
            authenticationViewModel.create(j).mo4926j(this, new qs4(this));
        } else {
            Toast.makeText(this, pj0.m61166a(-80860361627463L), 0).show();
        }
    }

    /* renamed from: t1 */
    public final void mo7915t1() {
        this.f7007a.addTextChangedListener(this);
        this.f7011b.addTextChangedListener(this);
        this.f7013c.addTextChangedListener(this);
        this.f7014d.addTextChangedListener(this);
        this.f7007a.setOnKeyListener(this);
        this.f7011b.setOnKeyListener(this);
        this.f7013c.setOnKeyListener(this);
        this.f7014d.setOnKeyListener(this);
        this.f7007a.setOnFocusChangeListener(this);
        this.f7011b.setOnFocusChangeListener(this);
        this.f7013c.setOnFocusChangeListener(this);
        this.f7014d.setOnFocusChangeListener(this);
    }

    /* renamed from: u1 */
    public final void mo7916u1() {
        m04.m21111a(this).mo20828e((String) null).mo17579k(new C1306b()).mo17576h(new C1305a());
    }

    /* renamed from: v1 */
    public void mo7917v1() {
        C1308d dVar = new C1308d(120000, 1000);
        this.f7006a = dVar;
        dVar.start();
    }

    /* renamed from: w1 */
    public final void mo7918w1(String str, String str2) {
        AuthenticationViewModel authenticationViewModel = (AuthenticationViewModel) new C0709m(this).mo5027a(AuthenticationViewModel.class);
        VerifyRequest verifyRequest = new VerifyRequest(str2);
        try {
            long parseLong = Long.parseLong(str);
            authenticationViewModel.verify(parseLong, verifyRequest).mo4926j(this, new rs4(this, parseLong));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
