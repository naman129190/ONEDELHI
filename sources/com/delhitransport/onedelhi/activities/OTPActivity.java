package com.delhitransport.onedelhi.activities;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.C0709m;
import com.delhitransport.onedelhi.models.auth.CreateResponse;
import com.delhitransport.onedelhi.viewmodels.AuthenticationViewModel;
import com.google.android.gms.common.C1410R;
import com.onedelhi.secure.et2;
import com.onedelhi.secure.ft2;
import com.onedelhi.secure.gt2;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.ts2;
import java.util.regex.Pattern;

public class OTPActivity extends BaseActivity {

    /* renamed from: a */
    public SharedPreferences.Editor f6616a;

    /* renamed from: a */
    public Button f6617a;

    /* renamed from: a */
    public EditText f6618a;

    /* renamed from: a */
    public TextView f6619a;

    /* renamed from: a */
    public Long f6620a;

    /* renamed from: b */
    public EditText f6621b;

    /* renamed from: c */
    public EditText f6622c;

    /* renamed from: e */
    public String f6623e;

    /* renamed from: e */
    public boolean f6624e;

    /* renamed from: f */
    public String f6625f;

    /* renamed from: f */
    public boolean f6626f;

    /* renamed from: g */
    public String f6627g;

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public /* synthetic */ void m8116j1(ProgressDialog progressDialog, CreateResponse createResponse) {
        long j;
        if (createResponse != null) {
            boolean equalsIgnoreCase = createResponse.getMessage().equalsIgnoreCase(pj0.m61166a(-48802725730119L));
            progressDialog.dismiss();
            if (equalsIgnoreCase) {
                Intent intent = new Intent(this, VerifyOTPActivity.class);
                intent.putExtra(pj0.m61166a(-48837085468487L), String.valueOf(this.f6620a));
                intent.putExtra(pj0.m61166a(-48867150239559L), this.f6625f);
                intent.putExtra(pj0.m61166a(-48892920043335L), this.f6623e);
                intent.putExtra(pj0.m61166a(-48914394879815L), createResponse.getExpires_after());
                intent.putExtra(pj0.m61166a(-48944459650887L), this.f6627g);
                intent.putExtra(pj0.m61166a(-48987409323847L), this.f6624e);
                intent.putExtra(pj0.m61166a(-49043243898695L), this.f6626f);
                startActivity(intent);
                if (this.f6627g.equalsIgnoreCase(pj0.m61166a(-49073308669767L))) {
                    finish();
                }
                j = -49111963375431L;
            } else {
                j = -49206452655943L;
            }
            Toast.makeText(this, pj0.m61166a(j), 0).show();
            return;
        }
        Toast.makeText(this, pj0.m61166a(-49472740628295L), 0).show();
        progressDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public /* synthetic */ void m8117k1(View view) {
        mo7759m1();
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public /* synthetic */ void m8118l1(View view) {
        mo7758i1();
    }

    /* renamed from: i1 */
    public final void mo7758i1() {
        if (mo7760n1()) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage(pj0.m61166a(-48338869262151L));
            progressDialog.setCancelable(false);
            progressDialog.show();
            ((AuthenticationViewModel) new C0709m(this).mo5027a(AuthenticationViewModel.class)).create(this.f6620a.longValue()).mo4926j(this, new gt2(this, progressDialog));
        }
    }

    /* renamed from: m1 */
    public final void mo7759m1() {
        this.f6616a.putBoolean(pj0.m61166a(-48231495079751L), true);
        this.f6616a.commit();
        Intent intent = new Intent(this, GenderActivity.class);
        intent.putExtra(pj0.m61166a(-48265854818119L), this.f6626f);
        intent.putExtra(pj0.m61166a(-48295919589191L), this.f6627g);
        startActivity(intent);
        finish();
    }

    /* renamed from: n1 */
    public final boolean mo7760n1() {
        Context applicationContext;
        long j;
        if (this.f6618a.getText().toString().trim().isEmpty()) {
            applicationContext = getApplicationContext();
            j = -48403293771591L;
        } else if (!Pattern.compile(pj0.m61166a(-48523552855879L)).matcher(this.f6618a.getText().toString().trim()).matches()) {
            applicationContext = getApplicationContext();
            j = -48579387430727L;
        } else {
            try {
                this.f6620a = Long.valueOf(Long.parseLong(this.f6618a.getText().toString().trim()));
                return true;
            } catch (Exception unused) {
                applicationContext = getApplicationContext();
                j = -48673876711239L;
            }
        }
        Toast.makeText(applicationContext, pj0.m61166a(j), 0).show();
        return false;
    }

    public void onCreate(@ts2 Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1410R.layout.activity_otp);
        this.f6618a = (EditText) findViewById(C1410R.C1412id.edit_number);
        this.f6621b = (EditText) findViewById(C1410R.C1412id.edit_name);
        this.f6622c = (EditText) findViewById(C1410R.C1412id.edit_email);
        this.f6619a = (TextView) findViewById(C1410R.C1412id.tv_skip);
        this.f6617a = (Button) findViewById(C1410R.C1412id.btn_send);
        SharedPreferences sharedPreferences = getSharedPreferences(pj0.m61166a(-47978092009287L), 0);
        this.f6616a = sharedPreferences.edit();
        boolean z = sharedPreferences.getBoolean(pj0.m61166a(-48063991355207L), false);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f6624e = extras.getBoolean(pj0.m61166a(-48098351093575L), false);
            this.f6627g = extras.getString(pj0.m61166a(-48154185668423L), pj0.m61166a(-48197135341383L));
            this.f6626f = extras.getBoolean(pj0.m61166a(-48201430308679L));
        }
        if (!this.f6626f && z) {
            mo7759m1();
        }
        this.f6619a.setOnClickListener(new ft2(this));
        this.f6617a.setOnClickListener(new et2(this));
    }
}
