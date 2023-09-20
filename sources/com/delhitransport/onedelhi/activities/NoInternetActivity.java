package com.delhitransport.onedelhi.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.delhitransport.onedelhi.models.ConnectionModel;
import com.delhitransport.onedelhi.p001db.UserTickets;
import com.google.android.gms.common.C1410R;
import com.onedelhi.secure.br2;
import com.onedelhi.secure.cr2;
import com.onedelhi.secure.jd4;
import com.onedelhi.secure.mv2;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.t50;
import java.io.Serializable;
import java.util.List;

public class NoInternetActivity extends BaseActivity implements mv2 {

    /* renamed from: a */
    public Boolean f6599a;

    /* renamed from: b */
    public Boolean f6600b;

    /* renamed from: c */
    public Boolean f6601c;

    /* renamed from: d */
    public Boolean f6602d;

    /* renamed from: e */
    public String f6603e;

    /* renamed from: f */
    public String f6604f;

    /* renamed from: com.delhitransport.onedelhi.activities.NoInternetActivity$a */
    public class C1265a implements DialogInterface.OnClickListener {
        public C1265a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            NoInternetActivity noInternetActivity = NoInternetActivity.this;
            jd4.m18419j(noInternetActivity, noInternetActivity);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.NoInternetActivity$b */
    public class C1266b implements DialogInterface.OnClickListener {
        public C1266b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i1 */
    public /* synthetic */ void m8095i1(ConnectionModel connectionModel) {
        if (connectionModel.getIsConnected()) {
            int type = connectionModel.getType();
            if (type == 0 || type == 1) {
                mo7748l1(true);
                return;
            }
            return;
        }
        mo7748l1(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public /* synthetic */ void m8096j1(View view) {
        mo7747k1();
    }

    /* renamed from: B */
    public void mo7527B(boolean z) {
    }

    /* renamed from: F */
    public void mo7528F(boolean z, List<UserTickets> list) {
    }

    /* renamed from: M */
    public void mo7529M(boolean z, List<UserTickets> list) {
        if (z) {
            Intent intent = new Intent(this, AllTicketsActivity.class);
            intent.putExtra(pj0.m61166a(-47136278419271L), (Serializable) list);
            startActivity(intent);
            return;
        }
        Toast.makeText(this, pj0.m61166a(-47170638157639L), 0).show();
    }

    /* renamed from: h1 */
    public final void mo7746h1() {
        new t50(getApplicationContext()).mo4926j(this, new cr2(this));
    }

    /* renamed from: k1 */
    public final void mo7747k1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(pj0.m61166a(-46560752801607L));
        builder.setMessage(pj0.m61166a(-46633767245639L));
        builder.setPositiveButton(pj0.m61166a(-46784091100999L), new C1265a());
        builder.setNegativeButton(pj0.m61166a(-46801270970183L), new C1266b());
        builder.show();
    }

    /* renamed from: l1 */
    public final void mo7748l1(boolean z) {
        if (z) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(pj0.m61166a(-46814155872071L), true);
            bundle.putString(pj0.m61166a(-46861400512327L), this.f6603e);
            bundle.putBoolean(pj0.m61166a(-46904350185287L), this.f6602d.booleanValue());
            bundle.putBoolean(pj0.m61166a(-46960184760135L), this.f6599a.booleanValue());
            bundle.putBoolean(pj0.m61166a(-47016019334983L), this.f6600b.booleanValue());
            bundle.putString(pj0.m61166a(-47089033779015L), this.f6604f);
            Intent intent = !this.f6601c.booleanValue() ? new Intent(this, SplashScreenActivity.class) : new Intent(this, GenderActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        Boolean bool;
        super.onCreate(bundle);
        setRequestedOrientation(1);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f6603e = extras.getString(pj0.m61166a(-46199975548743L), pj0.m61166a(-46242925221703L));
            this.f6599a = Boolean.valueOf(extras.getBoolean(pj0.m61166a(-46247220188999L), false));
            this.f6600b = Boolean.valueOf(extras.getBoolean(pj0.m61166a(-46303054763847L), false));
            this.f6604f = extras.getString(pj0.m61166a(-46376069207879L), pj0.m61166a(-46423313848135L));
            this.f6601c = Boolean.valueOf(extras.getBoolean(pj0.m61166a(-46427608815431L), false));
            bool = Boolean.valueOf(extras.getBoolean(pj0.m61166a(-46496328292167L), false));
        } else {
            this.f6603e = pj0.m61166a(-46552162867015L);
            bool = Boolean.FALSE;
            this.f6599a = bool;
            this.f6600b = bool;
            this.f6604f = pj0.m61166a(-46556457834311L);
            this.f6601c = bool;
        }
        this.f6602d = bool;
        setContentView((int) C1410R.layout.activity_no_internet);
        mo7746h1();
        ((RelativeLayout) findViewById(C1410R.C1412id.rv_allTickets_Passes)).setOnClickListener(new br2(this));
    }
}
