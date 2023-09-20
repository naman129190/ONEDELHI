package com.onedelhi.secure;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0189c;
import androidx.fragment.app.Fragment;
import com.delhitransport.onedelhi.activities.AboutUsActivity;
import com.delhitransport.onedelhi.activities.ContactUsActivity;
import com.delhitransport.onedelhi.activities.FeedbackActivity;
import com.delhitransport.onedelhi.activities.GenderActivity;
import com.delhitransport.onedelhi.activities.HelpLineActivity;
import com.google.android.gms.common.C1410R;

public class iw3 extends Fragment {

    /* renamed from: a */
    public Context f13885a;

    /* renamed from: a */
    public SharedPreferences f13886a;

    /* renamed from: a */
    public Bundle f13887a;

    /* renamed from: a */
    public TextView f13888a;

    /* renamed from: a */
    public C0189c f13889a;

    /* renamed from: b */
    public TextView f13890b;

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m17940I(String str, View view) {
        Intent intent = new Intent(this.f13885a, GenderActivity.class);
        Bundle bundle = new Bundle();
        this.f13887a = bundle;
        bundle.putBoolean(pj0.m61166a(-115516452738887L), true);
        this.f13887a.putString(pj0.m61166a(-115546517509959L), str);
        this.f13887a.putString(pj0.m61166a(-115576582281031L), pj0.m61166a(-115619531953991L));
        intent.putExtras(this.f13887a);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m17941L(View view) {
        mo17983W(pj0.m61166a(-115494977902407L));
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m17942N(View view) {
        mo17983W(pj0.m61166a(-115469208098631L));
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m17943O(View view) {
        startActivity(new Intent(this.f13885a, AboutUsActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m17944P(View view) {
        startActivity(new Intent(this.f13885a, ContactUsActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m17945Q(View view) {
        startActivity(new Intent(this.f13885a, HelpLineActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m17946R(View view) {
        startActivity(new Intent(this.f13885a, FeedbackActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m17947S(View view) {
        this.f13889a.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m17948T(EditText editText, String str, View view) {
        boolean z;
        String trim = editText.getText().toString().trim();
        if (trim.equalsIgnoreCase(pj0.m61166a(-115404783589191L))) {
            editText.setError(pj0.m61166a(-115409078556487L) + str);
            z = false;
        } else {
            z = true;
        }
        if (z) {
            mo17982U(str, trim);
            this.f13889a.dismiss();
        }
    }

    /* renamed from: U */
    public final void mo17982U(String str, String str2) {
        TextView textView;
        if (str.equalsIgnoreCase(pj0.m61166a(-115357538948935L))) {
            textView = this.f13888a;
        } else {
            if (str.equalsIgnoreCase(pj0.m61166a(-115379013785415L))) {
                textView = this.f13890b;
            }
            SharedPreferences.Editor edit = this.f13886a.edit();
            edit.putString(str, str2);
            edit.apply();
        }
        textView.setText(str2);
        SharedPreferences.Editor edit2 = this.f13886a.edit();
        edit2.putString(str, str2);
        edit2.apply();
    }

    /* renamed from: W */
    public final void mo17983W(String str) {
        C0189c.C0190a aVar = new C0189c.C0190a(requireContext());
        View inflate = getLayoutInflater().inflate(C1410R.layout.popup, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C1410R.C1412id.tv_title);
        ImageView imageView = (ImageView) inflate.findViewById(C1410R.C1412id.iv_close);
        Button button = (Button) inflate.findViewById(C1410R.C1412id.btn_send);
        EditText editText = (EditText) inflate.findViewById(C1410R.C1412id.edTitle);
        if (str.equalsIgnoreCase(pj0.m61166a(-115331769145159L))) {
            editText.setInputType(524321);
        }
        button.setText(getResources().getString(C1410R.string.set, new Object[]{str}));
        textView.setText(str);
        editText.setHint(getResources().getString(C1410R.string.enter_your, new Object[]{str}));
        imageView.setOnClickListener(new bw3(this));
        button.setOnClickListener(new gw3(this, editText, str));
        aVar.mo938M(inflate);
        C0189c a = aVar.mo941a();
        this.f13889a = a;
        a.setCancelable(true);
        this.f13889a.show();
    }

    public void onAttach(@mr2 Context context) {
        super.onAttach(context);
        this.f13885a = context.getApplicationContext();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        requireActivity().getWindow().clearFlags(8192);
        View inflate = layoutInflater.inflate(C1410R.layout.fragment_settings, viewGroup, false);
        this.f13886a = this.f13885a.getSharedPreferences(pj0.m61166a(-115147085551431L), 0);
        try {
            str = this.f13885a.getPackageManager().getPackageInfo(this.f13885a.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            str = pj0.m61166a(-115232984897351L);
        }
        String string = this.f13886a.getString(pj0.m61166a(-115241574831943L), pj0.m61166a(-115271639603015L));
        String string2 = this.f13886a.getString(pj0.m61166a(-115275934570311L), pj0.m61166a(-115297409406791L));
        String string3 = this.f13886a.getString(pj0.m61166a(-115301704374087L), pj0.m61166a(-115327474177863L));
        this.f13888a = (TextView) inflate.findViewById(C1410R.C1412id.tv_name);
        this.f13890b = (TextView) inflate.findViewById(C1410R.C1412id.tv_email);
        ((TextView) inflate.findViewById(C1410R.C1412id.tv_app_version)).setText(String.valueOf(str));
        this.f13888a.setText(string2);
        this.f13890b.setText(string3);
        ((TextView) inflate.findViewById(C1410R.C1412id.tv_gender)).setText(string.substring(0, 1).toUpperCase() + string.substring(1));
        ((ImageView) inflate.findViewById(C1410R.C1412id.iv_ch_gender)).setOnClickListener(new hw3(this, string));
        ((ImageView) inflate.findViewById(C1410R.C1412id.iv_ch_name)).setOnClickListener(new zv3(this));
        ((ImageView) inflate.findViewById(C1410R.C1412id.iv_ch_email)).setOnClickListener(new fw3(this));
        ((RelativeLayout) inflate.findViewById(C1410R.C1412id.rv_about)).setOnClickListener(new dw3(this));
        ((RelativeLayout) inflate.findViewById(C1410R.C1412id.rv_contact)).setOnClickListener(new aw3(this));
        ((RelativeLayout) inflate.findViewById(C1410R.C1412id.rv_helpline)).setOnClickListener(new ew3(this));
        ((RelativeLayout) inflate.findViewById(C1410R.C1412id.rv_complaint)).setOnClickListener(new cw3(this));
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
    }
}
