package com.delhitransport.onedelhi.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0189c;
import com.google.android.gms.common.C1410R;
import com.onedelhi.secure.lv3;
import com.onedelhi.secure.mv3;
import com.onedelhi.secure.nv3;
import com.onedelhi.secure.ov3;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.pv3;
import com.onedelhi.secure.qv3;
import com.onedelhi.secure.rv3;
import com.onedelhi.secure.sv3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.tv3;
import com.onedelhi.secure.uv3;

public class SettingsActivity extends BaseActivity {

    /* renamed from: a */
    public SharedPreferences f6872a;

    /* renamed from: a */
    public Bundle f6873a;

    /* renamed from: a */
    public TextView f6874a;

    /* renamed from: a */
    public C0189c f6875a;

    /* renamed from: b */
    public TextView f6876b;

    /* renamed from: c */
    public TextView f6877c;

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public /* synthetic */ void m8349p1(String str, View view) {
        Intent intent = new Intent(this, GenderActivity.class);
        Bundle bundle = new Bundle();
        this.f6873a = bundle;
        bundle.putBoolean(pj0.m61166a(-69216705288007L), true);
        this.f6873a.putString(pj0.m61166a(-69246770059079L), str);
        intent.putExtras(this.f6873a);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public /* synthetic */ void m8350q1(View view) {
        mo7847A1(pj0.m61166a(-69195230451527L));
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public /* synthetic */ void m8351r1(View view) {
        mo7847A1(pj0.m61166a(-69169460647751L));
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public /* synthetic */ void m8352s1(View view) {
        startActivity(new Intent(this, AboutUsActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public /* synthetic */ void m8353t1(View view) {
        startActivity(new Intent(this, ContactUsActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public /* synthetic */ void m8354u1(View view) {
        startActivity(new Intent(this, HelpLineActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public /* synthetic */ void m8355v1(View view) {
        startActivity(new Intent(pj0.m61166a(-68782913591111L), Uri.parse(pj0.m61166a(-68898877708103L))));
    }

    /* access modifiers changed from: private */
    /* renamed from: w1 */
    public /* synthetic */ void m8356w1(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public /* synthetic */ void m8357x1(View view) {
        this.f6875a.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public /* synthetic */ void m8358y1(EditText editText, String str, View view) {
        boolean z;
        String trim = editText.getText().toString().trim();
        boolean z2 = false;
        if (trim.equalsIgnoreCase(pj0.m61166a(-68533805487943L))) {
            editText.setError(pj0.m61166a(-68538100455239L) + str);
            z = false;
        } else {
            z = true;
        }
        if (!str.equalsIgnoreCase(pj0.m61166a(-68598229997383L)) || trim.matches(pj0.m61166a(-68619704833863L))) {
            z2 = z;
        } else {
            editText.setError(pj0.m61166a(-68675539408711L));
        }
        if (z2) {
            mo7848z1(str, trim);
            this.f6875a.dismiss();
        }
    }

    /* renamed from: A1 */
    public final void mo7847A1(String str) {
        C0189c.C0190a aVar = new C0189c.C0190a(this);
        View inflate = getLayoutInflater().inflate(C1410R.layout.popup, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C1410R.C1412id.tv_title);
        ImageView imageView = (ImageView) inflate.findViewById(C1410R.C1412id.iv_close);
        Button button = (Button) inflate.findViewById(C1410R.C1412id.btn_send);
        EditText editText = (EditText) inflate.findViewById(C1410R.C1412id.edTitle);
        if (str.equalsIgnoreCase(pj0.m61166a(-68460791043911L))) {
            editText.setInputType(524321);
        }
        button.setText(getResources().getString(C1410R.string.set, new Object[]{str}));
        textView.setText(str);
        editText.setHint(getResources().getString(C1410R.string.enter_your, new Object[]{str}));
        imageView.setOnClickListener(new qv3(this));
        button.setOnClickListener(new tv3(this, editText, str));
        aVar.mo938M(inflate);
        C0189c a = aVar.mo941a();
        this.f6875a = a;
        a.setCancelable(true);
        this.f6875a.show();
    }

    public void onCreate(@ts2 Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView((int) C1410R.layout.fragment_settings);
        this.f6872a = getSharedPreferences(pj0.m61166a(-68241747711815L), 0);
        try {
            str = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            str = pj0.m61166a(-68327647057735L);
        }
        String string = this.f6872a.getString(pj0.m61166a(-68336236992327L), pj0.m61166a(-68366301763399L));
        String string2 = this.f6872a.getString(pj0.m61166a(-68370596730695L), pj0.m61166a(-68392071567175L));
        String string3 = this.f6872a.getString(pj0.m61166a(-68396366534471L), pj0.m61166a(-68422136338247L));
        String string4 = this.f6872a.getString(pj0.m61166a(-68426431305543L), pj0.m61166a(-68456496076615L));
        this.f6874a = (TextView) findViewById(C1410R.C1412id.tv_name);
        this.f6876b = (TextView) findViewById(C1410R.C1412id.tv_email);
        this.f6877c = (TextView) findViewById(C1410R.C1412id.tv_phone);
        ImageView imageView = (ImageView) findViewById(C1410R.C1412id.iv_back);
        ((TextView) findViewById(C1410R.C1412id.tv_app_version)).setText(String.valueOf(str));
        this.f6874a.setText(string2);
        this.f6876b.setText(string3);
        this.f6877c.setText(string4);
        ((TextView) findViewById(C1410R.C1412id.tv_gender)).setText(string.substring(0, 1).toUpperCase() + string.substring(1));
        ((ImageView) findViewById(C1410R.C1412id.iv_ch_gender)).setOnClickListener(new uv3(this, string));
        ((ImageView) findViewById(C1410R.C1412id.iv_ch_name)).setOnClickListener(new pv3(this));
        ((ImageView) findViewById(C1410R.C1412id.iv_ch_email)).setOnClickListener(new rv3(this));
        ((ImageView) findViewById(C1410R.C1412id.iv_ch_phone)).setVisibility(8);
        ((RelativeLayout) findViewById(C1410R.C1412id.rv_about)).setOnClickListener(new mv3(this));
        ((RelativeLayout) findViewById(C1410R.C1412id.rv_contact)).setOnClickListener(new lv3(this));
        ((RelativeLayout) findViewById(C1410R.C1412id.rv_helpline)).setOnClickListener(new sv3(this));
        ((RelativeLayout) findViewById(C1410R.C1412id.rv_privacy_policy)).setOnClickListener(new nv3(this));
        imageView.setOnClickListener(new ov3(this));
    }

    /* renamed from: z1 */
    public final void mo7848z1(String str, String str2) {
        TextView textView;
        if (str.equalsIgnoreCase(pj0.m61166a(-68486560847687L))) {
            textView = this.f6874a;
        } else {
            if (str.equalsIgnoreCase(pj0.m61166a(-68508035684167L))) {
                textView = this.f6876b;
            }
            SharedPreferences.Editor edit = this.f6872a.edit();
            edit.putString(str, str2);
            edit.apply();
        }
        textView.setText(str2);
        SharedPreferences.Editor edit2 = this.f6872a.edit();
        edit2.putString(str, str2);
        edit2.apply();
    }
}
