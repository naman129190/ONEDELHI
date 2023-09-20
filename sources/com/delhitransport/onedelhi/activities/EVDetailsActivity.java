package com.delhitransport.onedelhi.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.C0887h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1173a;
import com.delhitransport.onedelhi.p002ev.EVdata;
import com.google.android.gms.common.C1410R;
import com.onedelhi.secure.C1822bx;
import com.onedelhi.secure.C3962y2;
import com.onedelhi.secure.ar0;
import com.onedelhi.secure.br0;
import com.onedelhi.secure.cr0;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.r70;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

@SuppressLint({"MissingPermission"})
public class EVDetailsActivity extends BaseActivity {

    /* renamed from: o */
    public static final int f6212o = 123;

    /* renamed from: a */
    public final Intent f6213a = new Intent(pj0.m61166a(-9984811308871L));

    /* renamed from: a */
    public Boolean f6214a;

    /* renamed from: a */
    public final SimpleDateFormat f6215a;

    /* renamed from: b */
    public final SimpleDateFormat f6216b;

    /* renamed from: e */
    public String f6217e;

    public EVDetailsActivity() {
        String a = pj0.m61166a(-10100775425863L);
        Locale locale = Locale.ENGLISH;
        this.f6215a = new SimpleDateFormat(a, locale);
        this.f6216b = new SimpleDateFormat(pj0.m61166a(-10199559673671L), locale);
    }

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public /* synthetic */ void m7735j1(View view) {
        if (this.f6214a.booleanValue()) {
            if (!this.f6217e.equalsIgnoreCase(pj0.m61166a(-11307661236039L))) {
                Intent intent = this.f6213a;
                intent.setData(Uri.parse(pj0.m61166a(-11311956203335L) + this.f6217e));
            } else {
                Toast.makeText(this, pj0.m61166a(-11333431039815L), 0).show();
            }
            startActivity(this.f6213a);
            return;
        }
        Intent intent2 = this.f6213a;
        intent2.setData(Uri.parse(pj0.m61166a(-11427920320327L) + this.f6217e));
        mo7568i1();
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public /* synthetic */ void m7736k1(EVdata eVdata, View view) {
        String a = pj0.m61166a(-11041373263687L);
        startActivity(new Intent(a, Uri.parse(pj0.m61166a(-11157337380679L) + eVdata.getCoordinates().getLatitude() + ',' + eVdata.getCoordinates().getLongitude())));
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public /* synthetic */ void m7737l1(View view) {
        onBackPressed();
    }

    /* renamed from: i1 */
    public final void mo7568i1() {
        Boolean valueOf = Boolean.valueOf(r70.m26348a(this, pj0.m61166a(-10556041959239L)) == 0);
        this.f6214a = valueOf;
        if (!valueOf.booleanValue()) {
            C3962y2.m31859G(this, new String[]{pj0.m61166a(-10684890978119L)}, 123);
        }
    }

    public void onCreate(Bundle bundle) {
        EVdata eVdata;
        String str;
        String str2;
        String str3;
        super.onCreate(bundle);
        setContentView((int) C1410R.layout.activity_ev_details);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            str = extras.getString(pj0.m61166a(-10225329477447L), pj0.m61166a(-10246804313927L));
            eVdata = (EVdata) extras.get(pj0.m61166a(-10251099281223L));
            str2 = extras.getString(pj0.m61166a(-10298343921479L), pj0.m61166a(-10341293594439L));
        } else {
            str = pj0.m61166a(-10345588561735L);
            eVdata = new EVdata();
            str2 = pj0.m61166a(-10349883529031L);
        }
        this.f6214a = Boolean.valueOf(r70.m26348a(this, pj0.m61166a(-10354178496327L)) == 0);
        TextView textView = (TextView) findViewById(C1410R.C1412id.tv_stationName);
        TextView textView2 = (TextView) findViewById(C1410R.C1412id.tv_address);
        TextView textView3 = (TextView) findViewById(C1410R.C1412id.tv_contact);
        TextView textView4 = (TextView) findViewById(C1410R.C1412id.tv_open);
        TextView textView5 = (TextView) findViewById(C1410R.C1412id.tv_close);
        TextView textView6 = (TextView) findViewById(C1410R.C1412id.tv_lastUsed);
        TextView textView7 = (TextView) findViewById(C1410R.C1412id.tv_available);
        TextView textView8 = (TextView) findViewById(C1410R.C1412id.tv_total);
        TextView textView9 = (TextView) findViewById(C1410R.C1412id.tv_payment);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C1410R.C1412id.rv_direction);
        ImageView imageView = (ImageView) findViewById(C1410R.C1412id.iv_back);
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(C1410R.C1412id.rv_call);
        String str4 = str;
        ImageView imageView2 = (ImageView) findViewById(C1410R.C1412id.vendor_logo);
        TextView textView10 = (TextView) findViewById(C1410R.C1412id.tv_dist);
        RecyclerView recyclerView = (RecyclerView) findViewById(C1410R.C1412id.rv_charger);
        if (eVdata != null) {
            RelativeLayout relativeLayout3 = relativeLayout;
            textView2.setText(eVdata.getAddress());
            textView.setText(eVdata.getVendor());
            if (!eVdata.getLogo().equalsIgnoreCase(pj0.m61166a(-10483027515207L))) {
                C1173a.m7526H(this).mo16004n(eVdata.getLogo()).mo25101k1(imageView2);
            }
            StringBuilder sb = new StringBuilder();
            this.f6217e = eVdata.getContact_numbers().size() > 0 ? eVdata.getContact_numbers().get(0) : pj0.m61166a(-10487322482503L);
            for (int i = 0; i < eVdata.getContact_numbers().size(); i++) {
                if (i == 0) {
                    if (i == eVdata.getContact_numbers().size() - 1) {
                        str3 = eVdata.getContact_numbers().get(i);
                        sb.append(str3);
                    }
                }
                sb.append(eVdata.getContact_numbers().get(i));
                str3 = pj0.m61166a(-10491617449799L);
                sb.append(str3);
            }
            boolean equalsIgnoreCase = sb.toString().equalsIgnoreCase(pj0.m61166a(-10504502351687L));
            CharSequence charSequence = sb;
            if (equalsIgnoreCase) {
                charSequence = pj0.m61166a(-10508797318983L);
            }
            textView3.setText(charSequence);
            textView4.setText(eVdata.getOpen());
            textView5.setText(eVdata.getClose());
            textView9.setText(eVdata.getPayment_modes());
            try {
                String format = this.f6216b.format(this.f6215a.parse(str2));
                textView6.setText(getResources().getString(C1410R.string.last_updated_at) + format);
            } catch (Exception e) {
                e.printStackTrace();
            }
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
            linearLayoutManager.mo5294f3(0);
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setItemAnimator(new C0887h());
            C1822bx bxVar = new C1822bx(new ArrayList(eVdata.getEvChargers()), this);
            recyclerView.setAdapter(bxVar);
            bxVar.mo5717m();
            textView7.setText(getResources().getString(C1410R.string.available) + pj0.m61166a(-10521682220871L) + eVdata.getAvailable());
            textView8.setText(getResources().getString(C1410R.string.total) + pj0.m61166a(-10538862090055L) + eVdata.getTotal());
            relativeLayout2.setOnClickListener(new br0(this));
            relativeLayout3.setOnClickListener(new cr0(this, eVdata));
        }
        textView10.setText(str4);
        imageView.setOnClickListener(new ar0(this));
    }

    public void onRequestPermissionsResult(int i, @mr2 String[] strArr, @mr2 int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 123) {
            boolean z = false;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (strArr[i2].equalsIgnoreCase(pj0.m61166a(-10813739996999L))) {
                    if (iArr[i2] >= 0) {
                        this.f6214a = Boolean.TRUE;
                        z = true;
                    } else {
                        Toast.makeText(this, pj0.m61166a(-10942589015879L), 0).show();
                    }
                }
            }
            if (z) {
                startActivity(this.f6213a);
            }
        }
    }
}
