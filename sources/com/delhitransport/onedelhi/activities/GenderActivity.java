package com.delhitransport.onedelhi.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import com.google.android.gms.common.C1410R;
import com.onedelhi.secure.ae1;
import com.onedelhi.secure.be1;
import com.onedelhi.secure.ce1;
import com.onedelhi.secure.pj0;

public class GenderActivity extends BaseActivity {

    /* renamed from: a */
    public SharedPreferences.Editor f6309a;

    /* renamed from: a */
    public SharedPreferences f6310a;

    /* renamed from: a */
    public Bundle f6311a = new Bundle();

    /* renamed from: a */
    public Boolean f6312a;

    /* renamed from: b */
    public Boolean f6313b;

    /* renamed from: c */
    public Boolean f6314c;

    /* renamed from: d */
    public Boolean f6315d;

    /* renamed from: e */
    public String f6316e;

    /* renamed from: f */
    public String f6317f;

    /* renamed from: g */
    public String f6318g;

    /* renamed from: h */
    public String f6319h;

    /* access modifiers changed from: private */
    /* renamed from: i1 */
    public /* synthetic */ void m7824i1(RadioGroup radioGroup, int i) {
        long j;
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
        if (radioGroup.getCheckedRadioButtonId() != -1) {
            if (radioButton.getText().equals(getBaseContext().getString(C1410R.string.male))) {
                j = -21280575297351L;
            } else if (radioButton.getText().equals(getBaseContext().getString(C1410R.string.female))) {
                j = -21302050133831L;
            } else if (radioButton.getText().equals(getBaseContext().getString(C1410R.string.prefer_not))) {
                j = -21332114904903L;
            } else if (radioButton.getText().equals(getBaseContext().getString(C1410R.string.non_binary))) {
                j = -21409424316231L;
            } else {
                return;
            }
            this.f6316e = pj0.m61166a(j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public /* synthetic */ void m7825j1(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public /* synthetic */ void m7826k1(View view) {
        if (this.f6316e.equalsIgnoreCase(pj0.m61166a(-20954157782855L))) {
            Toast.makeText(this, pj0.m61166a(-20958452750151L), 0).show();
            return;
        }
        String a = pj0.m61166a(this.f6316e.equalsIgnoreCase(pj0.m61166a(-21052942030663L)) ? -21083006801735L : -21113071572807L);
        SharedPreferences.Editor edit = this.f6310a.edit();
        this.f6309a = edit;
        edit.putString(pj0.m61166a(-21134546409287L), this.f6316e);
        this.f6309a.putString(pj0.m61166a(-21164611180359L), a);
        boolean commit = this.f6309a.commit();
        for (int i = 10; i > 0 && !commit; i--) {
            commit = this.f6309a.commit();
        }
        if (this.f6312a.booleanValue()) {
            Intent intent = new Intent(this, MainActivity.class);
            this.f6311a.putBoolean(pj0.m61166a(-21224740722503L), this.f6313b.booleanValue());
            intent.putExtras(this.f6311a);
            intent.addFlags(67108864);
            startActivity(intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        Boolean bool;
        super.onCreate(bundle);
        setRequestedOrientation(1);
        setContentView((int) C1410R.layout.activity_gender);
        this.f6310a = getSharedPreferences(pj0.m61166a(-20370042230599L), 0);
        Bundle extras = getIntent().getExtras();
        this.f6311a = extras;
        if (extras != null) {
            this.f6317f = extras.getString(pj0.m61166a(-20455941576519L));
            this.f6316e = this.f6311a.getString(pj0.m61166a(-20498891249479L), pj0.m61166a(-20528956020551L));
            this.f6312a = Boolean.valueOf(this.f6311a.getBoolean(pj0.m61166a(-20533250987847L), false));
            this.f6318g = this.f6311a.getString(pj0.m61166a(-20563315758919L), pj0.m61166a(-20606265431879L));
            bool = Boolean.valueOf(this.f6311a.getBoolean(pj0.m61166a(-20610560399175L), false));
        } else {
            this.f6317f = pj0.m61166a(-20666394974023L);
            this.f6316e = pj0.m61166a(-20670689941319L);
            bool = Boolean.FALSE;
            this.f6312a = bool;
            this.f6318g = pj0.m61166a(-20674984908615L);
        }
        this.f6313b = bool;
        Button button = (Button) findViewById(C1410R.C1412id.btn_set_gender);
        RadioGroup radioGroup = (RadioGroup) findViewById(C1410R.C1412id.rg_gender);
        RadioButton radioButton = (RadioButton) findViewById(C1410R.C1412id.rb_male);
        RadioButton radioButton2 = (RadioButton) findViewById(C1410R.C1412id.rb_female);
        RadioButton radioButton3 = (RadioButton) findViewById(C1410R.C1412id.rb_non_binary);
        RadioButton radioButton4 = (RadioButton) findViewById(C1410R.C1412id.rb_prefer_not);
        String str = this.f6316e;
        if (str != null && !str.isEmpty()) {
            if (this.f6316e.equalsIgnoreCase(pj0.m61166a(-20679279875911L))) {
                radioButton.setChecked(true);
            } else if (this.f6316e.equalsIgnoreCase(pj0.m61166a(-20700754712391L))) {
                radioButton2.setChecked(true);
            } else if (this.f6316e.equalsIgnoreCase(pj0.m61166a(-20730819483463L))) {
                radioButton3.setChecked(true);
            } else if (this.f6316e.equalsIgnoreCase(pj0.m61166a(-20778064123719L))) {
                radioButton4.setChecked(true);
            }
        }
        radioGroup.setOnCheckedChangeListener(new ce1(this));
        ImageButton imageButton = (ImageButton) findViewById(C1410R.C1412id.ib_back);
        if (!this.f6312a.booleanValue()) {
            if (this.f6311a == null) {
                this.f6311a = new Bundle();
            }
            Intent intent = new Intent(this, MainActivity.class);
            this.f6311a.putBoolean(pj0.m61166a(-20855373535047L), this.f6313b.booleanValue());
            this.f6311a.putString(pj0.m61166a(-20911208109895L), this.f6318g);
            intent.putExtras(this.f6311a);
            intent.addFlags(67108864);
            startActivity(intent);
            finish();
        }
        imageButton.setOnClickListener(new ae1(this));
        button.setOnClickListener(new be1(this));
    }
}
