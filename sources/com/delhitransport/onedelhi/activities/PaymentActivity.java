package com.delhitransport.onedelhi.activities;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0709m;
import androidx.recyclerview.widget.C0887h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.models.payment.CustomPaymentDataItem;
import com.delhitransport.onedelhi.models.payment.CustomPaymentFieldItem;
import com.delhitransport.onedelhi.models.payment.CustomPaymentItem;
import com.delhitransport.onedelhi.payment.UPIOptions;
import com.delhitransport.onedelhi.ticket.FareDiscovery;
import com.delhitransport.onedelhi.ticket.TxnToken;
import com.delhitransport.onedelhi.ticket.TxnTokenRequest;
import com.delhitransport.onedelhi.viewmodels.TicketModel;
import com.google.android.gms.common.C1410R;
import com.onedelhi.secure.C2394i3;
import com.onedelhi.secure.C2811m3;
import com.onedelhi.secure.C2921n3;
import com.onedelhi.secure.j03;
import com.onedelhi.secure.k03;
import com.onedelhi.secure.l03;
import com.onedelhi.secure.m03;
import com.onedelhi.secure.n03;
import com.onedelhi.secure.p03;
import com.onedelhi.secure.pg4;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.sv1;
import com.onedelhi.secure.t03;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.uv1;
import com.onedelhi.secure.w03;
import com.phonepe.intent.sdk.api.PhonePe;
import com.phonepe.intent.sdk.api.PhonePeInitException;
import com.phonepe.intent.sdk.api.TransactionRequestBuilder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class PaymentActivity extends AppCompatActivity {

    /* renamed from: D */
    public static final int f6669D = 777;

    /* renamed from: E */
    public static final int f6670E = 101;

    /* renamed from: A */
    public int f6671A = 0;

    /* renamed from: A */
    public String f6672A;

    /* renamed from: B */
    public int f6673B = -1;

    /* renamed from: B */
    public String f6674B;

    /* renamed from: C */
    public int f6675C = -1;

    /* renamed from: C */
    public String f6676C;

    /* renamed from: a */
    public float f6677a;

    /* renamed from: a */
    public ProgressDialog f6678a;

    /* renamed from: a */
    public SharedPreferences f6679a;

    /* renamed from: a */
    public PackageManager f6680a;

    /* renamed from: a */
    public ImageView f6681a;

    /* renamed from: a */
    public RelativeLayout f6682a;

    /* renamed from: a */
    public TextView f6683a;

    /* renamed from: a */
    public RecyclerView f6684a;

    /* renamed from: a */
    public UPIOptions f6685a;

    /* renamed from: a */
    public FareDiscovery f6686a;

    /* renamed from: a */
    public TicketModel f6687a;

    /* renamed from: a */
    public C2921n3<Intent> f6688a = registerForActivityResult(new C2811m3.C2824k(), new k03(this));

    /* renamed from: a */
    public p03 f6689a;

    /* renamed from: a */
    public final ArrayList<String> f6690a = new ArrayList<>();

    /* renamed from: a */
    public final HashMap<String, Integer> f6691a = new HashMap<>();

    /* renamed from: a */
    public List f6692a;

    /* renamed from: b */
    public RelativeLayout f6693b;

    /* renamed from: b */
    public TextView f6694b;

    /* renamed from: b */
    public final ArrayList<UPIOptions> f6695b = new ArrayList<>();

    /* renamed from: c */
    public TextView f6696c;

    /* renamed from: d */
    public TextView f6697d;

    /* renamed from: e */
    public TextView f6698e;

    /* renamed from: e */
    public String f6699e;

    /* renamed from: e */
    public boolean f6700e = false;

    /* renamed from: f */
    public TextView f6701f;

    /* renamed from: f */
    public String f6702f;

    /* renamed from: f */
    public boolean f6703f;

    /* renamed from: g */
    public TextView f6704g;

    /* renamed from: g */
    public String f6705g;

    /* renamed from: g */
    public boolean f6706g;

    /* renamed from: h */
    public TextView f6707h;

    /* renamed from: h */
    public String f6708h;

    /* renamed from: h */
    public boolean f6709h;

    /* renamed from: i */
    public TextView f6710i;

    /* renamed from: i */
    public String f6711i;

    /* renamed from: i */
    public boolean f6712i;

    /* renamed from: j */
    public TextView f6713j;

    /* renamed from: j */
    public String f6714j;

    /* renamed from: j */
    public boolean f6715j = false;

    /* renamed from: k */
    public String f6716k;

    /* renamed from: k */
    public boolean f6717k = false;

    /* renamed from: l */
    public String f6718l;

    /* renamed from: m */
    public String f6719m;

    /* renamed from: n */
    public String f6720n;

    /* renamed from: o */
    public final int f6721o = 2;

    /* renamed from: o */
    public String f6722o;

    /* renamed from: p */
    public final int f6723p = 0;

    /* renamed from: p */
    public String f6724p;

    /* renamed from: q */
    public final int f6725q = 3;

    /* renamed from: q */
    public String f6726q;

    /* renamed from: r */
    public final int f6727r = 0;

    /* renamed from: r */
    public String f6728r;

    /* renamed from: s */
    public final int f6729s = 1;

    /* renamed from: s */
    public String f6730s;

    /* renamed from: t */
    public final int f6731t = 300;

    /* renamed from: t */
    public String f6732t;

    /* renamed from: u */
    public final int f6733u = 301;

    /* renamed from: u */
    public String f6734u;

    /* renamed from: v */
    public final int f6735v = 100;

    /* renamed from: v */
    public String f6736v;

    /* renamed from: w */
    public int f6737w;

    /* renamed from: w */
    public String f6738w;

    /* renamed from: x */
    public int f6739x;

    /* renamed from: x */
    public String f6740x;

    /* renamed from: y */
    public int f6741y;

    /* renamed from: y */
    public String f6742y;

    /* renamed from: z */
    public int f6743z = 0;

    /* renamed from: z */
    public String f6744z;

    /* renamed from: com.delhitransport.onedelhi.activities.PaymentActivity$a */
    public class C1274a implements View.OnClickListener {
        public C1274a() {
        }

        public void onClick(View view) {
            boolean unused = PaymentActivity.this.f6715j = false;
            if (PaymentActivity.this.f6709h) {
                try {
                    PaymentActivity paymentActivity = PaymentActivity.this;
                    int unused2 = paymentActivity.f6671A = ((Integer) paymentActivity.f6691a.get(pj0.m61166a(-52084080744263L))).intValue();
                } catch (Exception unused3) {
                    int unused4 = PaymentActivity.this.f6671A = 0;
                }
                if (PaymentActivity.this.f6671A == 0) {
                    int unused5 = PaymentActivity.this.f6671A = 0;
                } else {
                    int unused6 = PaymentActivity.this.f6743z = 300;
                }
                PaymentActivity.this.mo7790z1((UPIOptions) null);
                return;
            }
            Toast.makeText(PaymentActivity.this, pj0.m61166a(-52114145515335L), 0).show();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.PaymentActivity$b */
    public class C1275b implements w03 {
        public C1275b() {
        }

        /* renamed from: a */
        public void mo7770a(String str, Bundle bundle) {
            PaymentActivity paymentActivity = PaymentActivity.this;
            Toast.makeText(paymentActivity, paymentActivity.getResources().getString(C1410R.string.payment_failed), 0).show();
        }

        /* renamed from: b */
        public void mo7771b(String str) {
            PaymentActivity paymentActivity = PaymentActivity.this;
            Toast.makeText(paymentActivity, paymentActivity.getResources().getString(C1410R.string.payment_failed), 0).show();
        }

        /* renamed from: c */
        public void mo7772c() {
            PaymentActivity paymentActivity = PaymentActivity.this;
            Toast.makeText(paymentActivity, paymentActivity.getResources().getString(C1410R.string.payment_failed), 0).show();
        }

        /* renamed from: d */
        public void mo7773d() {
            PaymentActivity paymentActivity = PaymentActivity.this;
            Toast.makeText(paymentActivity, paymentActivity.getResources().getString(C1410R.string.payment_failed), 0).show();
        }

        /* renamed from: e */
        public void mo7774e(String str) {
            PaymentActivity paymentActivity = PaymentActivity.this;
            Toast.makeText(paymentActivity, paymentActivity.getResources().getString(C1410R.string.payment_failed), 0).show();
        }

        /* renamed from: f */
        public void mo7775f(String str) {
            PaymentActivity paymentActivity = PaymentActivity.this;
            Toast.makeText(paymentActivity, paymentActivity.getResources().getString(C1410R.string.payment_failed), 0).show();
        }

        /* renamed from: g */
        public void mo7776g(@ts2 Bundle bundle) {
            String str;
            PaymentActivity paymentActivity;
            long j;
            String unused = PaymentActivity.this.f6738w = pj0.m61166a(-52277354272583L);
            try {
                str = bundle.getString(pj0.m61166a(-52294534141767L));
                String unused2 = PaymentActivity.this.f6718l = bundle.getString(pj0.m61166a(-52320303945543L));
                String unused3 = PaymentActivity.this.f6720n = bundle.getString(pj0.m61166a(-52354663683911L));
            } catch (Exception unused4) {
                str = pj0.m61166a(-52406203291463L);
            }
            if (str == null) {
                str = pj0.m61166a(-52410498258759L);
            }
            if (bundle != null) {
                try {
                    PaymentActivity.this.f6699e = String.valueOf(bundle.get(pj0.m61166a(-52423383160647L)));
                } catch (Exception unused5) {
                    paymentActivity = PaymentActivity.this;
                    j = -52453447931719L;
                }
            } else {
                paymentActivity = PaymentActivity.this;
                j = -52457742899015L;
                paymentActivity.f6699e = pj0.m61166a(j);
            }
            if (PaymentActivity.this.f6699e.equalsIgnoreCase(pj0.m61166a(-52462037866311L)) || PaymentActivity.this.f6699e.equalsIgnoreCase(pj0.m61166a(-52513577473863L)) || PaymentActivity.this.f6699e.equalsIgnoreCase(pj0.m61166a(-52517872441159L))) {
                PaymentActivity paymentActivity2 = PaymentActivity.this;
                paymentActivity2.mo7788x1(str, paymentActivity2.f6718l, PaymentActivity.this.f6720n, PaymentActivity.this.f6738w);
                return;
            }
            Toast.makeText(PaymentActivity.this, pj0.m61166a(-52552232179527L), 0).show();
        }

        /* renamed from: h */
        public void mo7777h(int i, String str, String str2) {
            PaymentActivity paymentActivity = PaymentActivity.this;
            Toast.makeText(paymentActivity, paymentActivity.getResources().getString(C1410R.string.payment_failed), 0).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public /* synthetic */ void m8171C1(UPIOptions uPIOptions, TxnToken txnToken) {
        long j;
        ProgressDialog progressDialog = this.f6678a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (txnToken != null) {
            this.f6700e = true;
            int i = this.f6671A;
            if (i == 0) {
                int i2 = this.f6743z;
                if (i2 == 1) {
                    String resultStatus = txnToken.getData().getBody().getResultInfo().getResultStatus();
                    if (resultStatus == null || !resultStatus.equalsIgnoreCase(pj0.m61166a(-60227338737479L))) {
                        try {
                            Toast.makeText(this, txnToken.getData().getBody().getResultInfo().getResultMsg(), 0).show();
                        } catch (Exception unused) {
                            j = -60235928672071L;
                        }
                    } else {
                        this.f6674B = txnToken.getData().getBody().getDeepLinkInfo().getDeepLink();
                        mo7787M1(uPIOptions);
                    }
                } else if (i2 == 0) {
                    this.f6726q = txnToken.getCallback_url();
                    this.f6728r = txnToken.getMid();
                    this.f6732t = txnToken.getTransaction_token();
                    this.f6730s = txnToken.getHost();
                    this.f6722o = txnToken.getGateway_order_id();
                    mo7785K1();
                } else {
                    try {
                        Toast.makeText(this, txnToken.getData().getBody().getResultInfo().getResultMsg(), 0).show();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } else if (i != 3) {
            } else {
                if (this.f6743z == 301) {
                    this.f6740x = txnToken.getData().getEncodedPayload();
                    this.f6742y = txnToken.getData().getChecksum();
                    this.f6744z = txnToken.getData().getEndpoint();
                    this.f6726q = txnToken.getCallback_url();
                    mo7789y1(pj0.m61166a(-60446382069575L), uPIOptions.getPackage_name());
                    return;
                }
                this.f6740x = txnToken.getData().getEncodedPayload();
                this.f6742y = txnToken.getData().getChecksum();
                this.f6744z = txnToken.getData().getEndpoint();
                String callback_url = txnToken.getCallback_url();
                this.f6726q = callback_url;
                if (callback_url != null && callback_url.equalsIgnoreCase(pj0.m61166a(-60463561938759L))) {
                    this.f6726q = pj0.m61166a(-60467856906055L);
                }
                mo7789y1(pj0.m61166a(-60592410957639L), pj0.m61166a(-60622475728711L));
            }
        } else {
            this.f6717k = false;
            j = -60626770696007L;
            Toast.makeText(this, pj0.m61166a(j), 0).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public /* synthetic */ void m8172D1(CustomPaymentItem customPaymentItem) {
        String str;
        long j;
        if (customPaymentItem == null) {
            j = -59965345732423L;
        } else if (customPaymentItem.getMessage().equalsIgnoreCase(pj0.m61166a(-59278150965063L))) {
            ArrayList<CustomPaymentDataItem> data = customPaymentItem.getData();
            if (data == null || data.size() <= 0) {
                j = -59437064755015L;
            } else {
                Iterator<CustomPaymentDataItem> it = data.iterator();
                while (it.hasNext()) {
                    CustomPaymentFieldItem fields = it.next().getFields();
                    if (fields.getMode().equalsIgnoreCase(pj0.m61166a(-59312510703431L))) {
                        this.f6709h = fields.getActive().booleanValue();
                    }
                    if (fields.getMode().equalsIgnoreCase(pj0.m61166a(-59342575474503L))) {
                        this.f6712i = fields.getActive().booleanValue();
                    }
                    if (fields.getActive().booleanValue()) {
                        this.f6691a.put(fields.getMode().toLowerCase(), Integer.valueOf(fields.getPg()));
                    }
                }
                try {
                    if (this.f6691a.get(pj0.m61166a(-59389820114759L)).intValue() == 3) {
                        int i = this.f6675C;
                        if (i != -1) {
                            this.f6695b.remove(i);
                        }
                        this.f6689a.mo5717m();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
        } else if (customPaymentItem.getDescription() == null || customPaymentItem.getDescription().equalsIgnoreCase(pj0.m61166a(-59699057760071L))) {
            j = -59703352727367L;
        } else {
            str = customPaymentItem.getDescription();
            Toast.makeText(this, str, 0).show();
        }
        str = pj0.m61166a(j);
        Toast.makeText(this, str, 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public /* synthetic */ void m8173E1(C2394i3 i3Var) {
        mo7788x1(pj0.m61166a(-60794274420551L), this.f6718l, this.f6720n, pj0.m61166a(-60798569387847L));
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public /* synthetic */ void m8174F1(UPIOptions uPIOptions) {
        int i = 1;
        this.f6743z = 1;
        this.f6715j = true;
        this.f6685a = uPIOptions;
        if (this.f6712i) {
            try {
                this.f6671A = this.f6691a.get(pj0.m61166a(-60747029780295L)).intValue();
            } catch (Exception unused) {
                this.f6671A = 0;
            }
            if (this.f6671A != 0) {
                i = 301;
            }
            this.f6743z = i;
            this.f6673B = 100;
            mo7790z1(uPIOptions);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public /* synthetic */ void m8175G1(View view) {
        onBackPressed();
    }

    /* renamed from: A1 */
    public final void mo7780A1() {
        this.f6687a.getpaymentoptions(this.f6676C, pj0.m61166a(-59076287502151L)).mo4926j(this, new l03(this));
    }

    /* renamed from: B1 */
    public final void mo7781B1(List<ResolveInfo> list) {
        this.f6695b.clear();
        Iterator<String> it = this.f6690a.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                ResolveInfo resolveInfo = list.get(i);
                if (next.equalsIgnoreCase(resolveInfo.activityInfo.packageName)) {
                    this.f6695b.add(new UPIOptions(String.valueOf(resolveInfo.loadLabel(this.f6680a)), next, resolveInfo.loadIcon(this.f6680a)));
                    if (next.equalsIgnoreCase(pj0.m61166a(-58681150510919L))) {
                        this.f6675C = this.f6695b.size() - 1;
                    }
                } else {
                    i++;
                }
            }
        }
        if (this.f6695b.isEmpty()) {
            this.f6694b.setVisibility(0);
            this.f6684a.setVisibility(8);
        } else {
            this.f6694b.setVisibility(8);
            this.f6684a.setVisibility(0);
        }
        this.f6689a.mo5717m();
    }

    /* renamed from: H1 */
    public final void mo7782H1() {
        SharedPreferences.Editor edit = this.f6679a.edit();
        edit.putString(pj0.m61166a(-58286013519687L), this.f6722o);
        edit.putString(pj0.m61166a(-58350438029127L), this.f6720n);
        edit.putString(pj0.m61166a(-58419157505863L), this.f6718l);
        edit.putBoolean(pj0.m61166a(-58487876982599L), false);
        edit.putBoolean(pj0.m61166a(-58522236720967L), true);
        edit.putBoolean(pj0.m61166a(-58543711557447L), false);
        edit.putBoolean(pj0.m61166a(-58582366263111L), false);
        if (this.f6708h.equalsIgnoreCase(pj0.m61166a(-58633905870663L))) {
            edit.putString(pj0.m61166a(-58642495805255L), this.f6708h);
        }
        boolean commit = edit.commit();
        for (int i = 10; i > 0; i--) {
            if (!commit) {
                commit = edit.commit();
            }
        }
    }

    /* renamed from: I1 */
    public final void mo7783I1() {
        long j;
        Drawable drawable;
        if (this.f6686a.getBus_agency() == null || !this.f6686a.getBus_agency().equalsIgnoreCase(pj0.m61166a(-54850039682887L))) {
            if (this.f6703f) {
                this.f6681a.setImageResource(C1410R.C1411drawable.ic_blue_bus);
                drawable = this.f6693b.getBackground();
                j = -54935939028807L;
            } else {
                this.f6681a.setImageResource(C1410R.C1411drawable.ic_orange_bus);
                drawable = this.f6693b.getBackground();
                j = -54970298767175L;
            }
        } else if (this.f6703f) {
            this.f6681a.setImageResource(C1410R.C1411drawable.ic_red_bus);
            drawable = this.f6693b.getBackground();
            j = -54867219552071L;
        } else {
            this.f6681a.setImageResource(C1410R.C1411drawable.ic_green_bus);
            drawable = this.f6693b.getBackground();
            j = -54901579290439L;
        }
        drawable.setColorFilter(Color.parseColor(pj0.m61166a(j)), PorterDuff.Mode.SRC_ATOP);
        if (this.f6686a.getBus_number() != null && this.f6686a.getBus_number().contains(pj0.m61166a(-55004658505543L))) {
            this.f6681a.setImageResource(C1410R.C1411drawable.ic_bus_light_blue);
            this.f6693b.getBackground().setColorFilter(Color.parseColor(pj0.m61166a(-55034723276615L)), PorterDuff.Mode.SRC_ATOP);
        }
    }

    /* renamed from: J1 */
    public final void mo7784J1() {
        this.f6696c.setText(this.f6719m);
        this.f6697d.setText(this.f6702f);
        this.f6698e.setText(this.f6672A);
        TextView textView = this.f6701f;
        textView.setText(pj0.m61166a(-54798500075335L) + this.f6677a);
        TextView textView2 = this.f6704g;
        textView2.setText(pj0.m61166a(-54807090009927L) + this.f6737w + pj0.m61166a(-54824269879111L));
        TextView textView3 = this.f6707h;
        textView3.setText(pj0.m61166a(-54841449748295L) + this.f6724p);
        try {
            String upperCase = this.f6734u.substring(0, 1).toUpperCase();
            this.f6710i.setText(upperCase + this.f6734u.substring(1));
        } catch (Exception unused) {
            this.f6710i.setText(this.f6734u);
        }
        try {
            String upperCase2 = this.f6736v.substring(0, 1).toUpperCase();
            this.f6713j.setText(upperCase2 + this.f6736v.substring(1));
        } catch (Exception unused2) {
            this.f6713j.setText(this.f6736v);
        }
        mo7783I1();
    }

    /* renamed from: K1 */
    public final void mo7785K1() {
        pg4 pg4 = new pg4(new t03(this.f6722o, this.f6728r, this.f6732t, this.f6724p, this.f6726q), new C1275b());
        pg4.mo42610u(this.f6730s + pj0.m61166a(-55069083014983L));
        pg4.mo42614y(this, 2);
    }

    /* renamed from: L1 */
    public final void mo7786L1(boolean z, String str, String str2) {
        UPIOptions uPIOptions;
        if (!z) {
            this.f6671A = 0;
            if (this.f6715j) {
                this.f6743z = 1;
                uPIOptions = this.f6685a;
            } else {
                this.f6743z = 0;
                uPIOptions = null;
            }
            mo7790z1(uPIOptions);
        } else if (str.equalsIgnoreCase(pj0.m61166a(-58762754889543L))) {
            HashMap hashMap = new HashMap();
            hashMap.put(pj0.m61166a(-58792819660615L), this.f6726q);
            hashMap.put(pj0.m61166a(-58857244170055L), pj0.m61166a(-58908783777607L));
            try {
                startActivityForResult(PhonePe.getTransactionIntent(new TransactionRequestBuilder().setData(this.f6740x).setChecksum(this.f6742y).setUrl(this.f6744z).setHeaders(hashMap).build()), f6669D);
            } catch (PhonePeInitException e) {
                e.printStackTrace();
            }
        } else if (str.equalsIgnoreCase(pj0.m61166a(-58930258614087L))) {
            startActivityForResult(PhonePe.getImplicitIntent((Context) this, new TransactionRequestBuilder().setData(this.f6740x).setChecksum(this.f6742y).setUrl(this.f6744z).build(), str2), 101);
        }
    }

    /* renamed from: M1 */
    public final void mo7787M1(UPIOptions uPIOptions) {
        this.f6678a = ProgressDialog.show(this, pj0.m61166a(-59080582469447L), getResources().getString(C1410R.string.loading_payment_please_wait), true, false);
        if (uPIOptions != null) {
            Intent intent = new Intent(pj0.m61166a(-59084877436743L));
            intent.setData(Uri.parse(this.f6674B));
            intent.setPackage(uPIOptions.getPackage_name());
            ProgressDialog progressDialog = this.f6678a;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            this.f6688a.mo20857b(intent);
            return;
        }
        Toast.makeText(this, pj0.m61166a(-59200841553735L), 0).show();
        ProgressDialog progressDialog2 = this.f6678a;
        if (progressDialog2 != null) {
            progressDialog2.dismiss();
        }
    }

    public void onActivityResult(int i, int i2, @ts2 Intent intent) {
        String str;
        String str2;
        String str3;
        String str4;
        long j;
        super.onActivityResult(i, i2, intent);
        if (i == 2 && intent != null) {
            String stringExtra = intent.getStringExtra(pj0.m61166a(-55193637066567L));
            if (stringExtra != null && stringExtra.equalsIgnoreCase(pj0.m61166a(-55232291772231L))) {
                j = -55236586739527L;
            } else if (stringExtra != null) {
                try {
                    sv1 s = uv1.m67431f(stringExtra).mo42278s();
                    String x = s.mo44562N(pj0.m61166a(-55395500529479L)).mo36921x();
                    this.f6716k = s.mo44562N(pj0.m61166a(-55425565300551L)).mo36921x();
                    this.f6718l = s.mo44562N(pj0.m61166a(-55451335104327L)).mo36921x();
                    this.f6720n = s.mo44562N(pj0.m61166a(-55485694842695L)).mo36921x();
                    this.f6738w = pj0.m61166a(-55537234450247L);
                    if (!x.equalsIgnoreCase(pj0.m61166a(-55554414319431L)) && !x.equalsIgnoreCase(pj0.m61166a(-55605953926983L))) {
                        if (!x.equalsIgnoreCase(pj0.m61166a(-55610248894279L))) {
                            Toast.makeText(this, pj0.m61166a(-55644608632647L), 0).show();
                            return;
                        }
                    }
                    mo7788x1(this.f6716k, this.f6718l, this.f6720n, this.f6738w);
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    str3 = this.f6716k;
                    str2 = this.f6718l;
                    str = this.f6720n;
                    str4 = this.f6738w;
                }
            } else {
                j = -55803522422599L;
            }
            Toast.makeText(this, pj0.m61166a(j), 0).show();
            return;
        } else if ((i == 777 || i == 101) && intent != null) {
            str3 = pj0.m61166a(-55962436212551L);
            str2 = pj0.m61166a(-55966731179847L);
            str = pj0.m61166a(-55971026147143L);
            str4 = pj0.m61166a(-56005385885511L);
        } else {
            return;
        }
        mo7788x1(str3, str2, str, str4);
    }

    public void onCreate(@ts2 Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1410R.layout.activity_payment);
        PhonePe.init(this);
        Bundle extras = getIntent().getExtras();
        this.f6682a = (RelativeLayout) findViewById(C1410R.C1412id.rl_other_payment_method);
        this.f6683a = (TextView) findViewById(C1410R.C1412id.tv_others_payment_methods);
        this.f6684a = (RecyclerView) findViewById(C1410R.C1412id.rv_upi_options);
        this.f6694b = (TextView) findViewById(C1410R.C1412id.tv_no_upi);
        this.f6696c = (TextView) findViewById(C1410R.C1412id.tv_date);
        this.f6697d = (TextView) findViewById(C1410R.C1412id.tv_bus_number);
        this.f6698e = (TextView) findViewById(C1410R.C1412id.tv_route_name);
        this.f6701f = (TextView) findViewById(C1410R.C1412id.tv_fare_per_ticket);
        this.f6704g = (TextView) findViewById(C1410R.C1412id.tv_ticket_count);
        this.f6707h = (TextView) findViewById(C1410R.C1412id.tv_payable_amount);
        this.f6710i = (TextView) findViewById(C1410R.C1412id.tv_starting_stop);
        this.f6713j = (TextView) findViewById(C1410R.C1412id.tv_ending_stop);
        this.f6693b = (RelativeLayout) findViewById(C1410R.C1412id.rv_ticket_top);
        this.f6681a = (ImageView) findViewById(C1410R.C1412id.img_bus);
        ImageView imageView = (ImageView) findViewById(C1410R.C1412id.iv_back);
        SharedPreferences sharedPreferences = getSharedPreferences(pj0.m61166a(-52715440936775L), 0);
        this.f6679a = sharedPreferences;
        this.f6676C = sharedPreferences.getString(pj0.m61166a(-52801340282695L), pj0.m61166a(-52844289955655L));
        if (extras != null) {
            this.f6702f = extras.getString(pj0.m61166a(-52848584922951L));
            this.f6705g = extras.getString(pj0.m61166a(-52891534595911L));
            this.f6737w = Integer.parseInt(extras.getString(pj0.m61166a(-52938779236167L)));
            this.f6708h = extras.getString(pj0.m61166a(-53024678582087L));
            this.f6711i = extras.getString(pj0.m61166a(-53063333287751L));
            this.f6714j = extras.getString(pj0.m61166a(-53101987993415L));
            this.f6724p = extras.getString(pj0.m61166a(-53144937666375L));
            this.f6686a = (FareDiscovery) extras.get(pj0.m61166a(-53187887339335L));
            this.f6703f = extras.getBoolean(pj0.m61166a(-53260901783367L));
            this.f6739x = extras.getInt(pj0.m61166a(-53286671587143L));
            this.f6734u = extras.getString(pj0.m61166a(-53342506161991L));
            this.f6741y = extras.getInt(pj0.m61166a(-53402635704135L));
            this.f6736v = extras.getString(pj0.m61166a(-53449880344391L));
            this.f6677a = extras.getFloat(pj0.m61166a(-53501419951943L));
            this.f6672A = extras.getString(pj0.m61166a(-53570139428679L));
        }
        this.f6719m = new SimpleDateFormat(pj0.m61166a(-53617384068935L), Locale.ENGLISH).format(new Date());
        this.f6687a = (TicketModel) new C0709m(this).mo5027a(TicketModel.class);
        this.f6689a = new p03(this.f6695b, this, new n03(this));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.mo5294f3(0);
        this.f6684a.setLayoutManager(linearLayoutManager);
        this.f6684a.setItemAnimator(new C0887h());
        this.f6684a.setAdapter(this.f6689a);
        this.f6690a.add(pj0.m61166a(-53720463284039L));
        this.f6690a.add(pj0.m61166a(-53789182760775L));
        this.f6690a.add(pj0.m61166a(-53857902237511L));
        this.f6690a.add(pj0.m61166a(-54025405962055L));
        this.f6690a.add(pj0.m61166a(-54167139882823L));
        this.f6680a = getPackageManager();
        Intent intent = new Intent(pj0.m61166a(-54248744261447L), (Uri) null);
        intent.addCategory(pj0.m61166a(-54364708378439L));
        intent.addCategory(pj0.m61166a(-54502147331911L));
        intent.setAction(pj0.m61166a(-54648176219975L));
        intent.setData(new Uri.Builder().scheme(pj0.m61166a(-54764140336967L)).authority(pj0.m61166a(-54781320206151L)).build());
        List<ResolveInfo> queryIntentActivities = getPackageManager().queryIntentActivities(intent, 0);
        mo7780A1();
        mo7781B1(queryIntentActivities);
        this.f6682a.setOnClickListener(new C1274a());
        imageView.setOnClickListener(new j03(this));
        mo7784J1();
    }

    public void onResume() {
        super.onResume();
        if (this.f6700e) {
            mo7788x1(pj0.m61166a(-52711145969479L), this.f6718l, this.f6720n, this.f6738w);
        }
    }

    /* renamed from: x1 */
    public final void mo7788x1(String str, String str2, String str3, String str4) {
        if (this.f6708h.equalsIgnoreCase(pj0.m61166a(-56022565754695L))) {
            String.format(pj0.m61166a(-56031155689287L), new Object[]{pj0.m61166a(-56267378890567L), this.f6714j, this.f6676C});
        }
        ProgressDialog progressDialog = this.f6678a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        Intent intent = new Intent(this, ConfirmationActivity.class);
        Bundle bundle = new Bundle();
        if (this.f6671A == 0) {
            mo7782H1();
            bundle.putInt(pj0.m61166a(-56318918498119L), this.f6739x);
            bundle.putString(pj0.m61166a(-56374753072967L), this.f6734u);
            bundle.putInt(pj0.m61166a(-56434882615111L), this.f6741y);
            bundle.putString(pj0.m61166a(-56482127255367L), this.f6736v);
            bundle.putString(pj0.m61166a(-56533666862919L), this.f6702f);
            bundle.putString(pj0.m61166a(-56576616535879L), str);
            bundle.putString(pj0.m61166a(-56636746078023L), str2);
            bundle.putString(pj0.m61166a(-56705465554759L), str3);
            bundle.putString(pj0.m61166a(-56774185031495L), this.f6699e);
            bundle.putInt(pj0.m61166a(-56851494442823L), this.f6737w);
            String a = pj0.m61166a(-56937393788743L);
            bundle.putString(a, getResources().getString(C1410R.string.rupees) + this.f6677a);
            String a2 = pj0.m61166a(-57006113265479L);
            bundle.putString(a2, getResources().getString(C1410R.string.rupees) + this.f6724p);
            bundle.putString(pj0.m61166a(-57070537774919L), this.f6705g);
            bundle.putString(pj0.m61166a(-57117782415175L), str4);
        } else {
            bundle.putInt(pj0.m61166a(-57139257251655L), this.f6739x);
            bundle.putString(pj0.m61166a(-57195091826503L), this.f6734u);
            bundle.putInt(pj0.m61166a(-57255221368647L), this.f6741y);
            bundle.putString(pj0.m61166a(-57302466008903L), this.f6736v);
            bundle.putString(pj0.m61166a(-57354005616455L), this.f6702f);
            bundle.putString(pj0.m61166a(-57396955289415L), pj0.m61166a(-57457084831559L));
            bundle.putString(pj0.m61166a(-57461379798855L), pj0.m61166a(-57530099275591L));
            bundle.putString(pj0.m61166a(-57534394242887L), pj0.m61166a(-57603113719623L));
            bundle.putString(pj0.m61166a(-57607408686919L), this.f6699e);
            bundle.putInt(pj0.m61166a(-57684718098247L), this.f6737w);
            String a3 = pj0.m61166a(-57770617444167L);
            bundle.putString(a3, getResources().getString(C1410R.string.rupees) + this.f6677a);
            String a4 = pj0.m61166a(-57839336920903L);
            bundle.putString(a4, getResources().getString(C1410R.string.rupees) + this.f6724p);
            bundle.putString(pj0.m61166a(-57903761430343L), this.f6705g);
            bundle.putString(pj0.m61166a(-57951006070599L), pj0.m61166a(-57972480907079L));
        }
        bundle.putSerializable(pj0.m61166a(-57976775874375L), this.f6686a);
        bundle.putBoolean(pj0.m61166a(-58049790318407L), this.f6703f);
        bundle.putString(pj0.m61166a(-58075560122183L), this.f6708h);
        bundle.putString(pj0.m61166a(-58114214827847L), pj0.m61166a(-58152869533511L));
        bundle.putString(pj0.m61166a(-58178639337287L), this.f6714j);
        bundle.putString(pj0.m61166a(-58221589010247L), this.f6722o);
        intent.putExtras(bundle);
        startActivity(intent);
        finish();
    }

    /* renamed from: y1 */
    public final void mo7789y1(String str, String str2) {
        mo7786L1(true, str, str2);
    }

    /* renamed from: z1 */
    public final void mo7790z1(UPIOptions uPIOptions) {
        this.f6678a = ProgressDialog.show(this, pj0.m61166a(-58947438483271L), pj0.m61166a(-58951733450567L), true, false);
        if (!this.f6714j.equalsIgnoreCase(pj0.m61166a(-59071992534855L))) {
            this.f6687a.fetchpaymenttoken(new TxnTokenRequest(this.f6714j, this.f6671A, this.f6673B, this.f6743z)).mo4926j(this, new m03(this, uPIOptions));
        }
    }
}
