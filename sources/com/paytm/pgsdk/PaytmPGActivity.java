package com.paytm.pgsdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.http.SslError;
import android.os.Bundle;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.internal.ImagesContract;
import com.onedelhi.secure.C4474a8;
import com.onedelhi.secure.C5706ib;
import com.onedelhi.secure.C5871k5;
import com.onedelhi.secure.C7013v7;
import com.onedelhi.secure.a13;
import com.onedelhi.secure.fj1;
import com.onedelhi.secure.h60;
import com.onedelhi.secure.m53;
import com.onedelhi.secure.r03;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.u03;
import com.onedelhi.secure.v03;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.vw4;
import com.onedelhi.secure.w03;
import com.paytm.pgsdk.C7546a;
import easypay.appinvoke.actions.EasypayBrowserFragment;
import easypay.appinvoke.manager.EasypayWebViewClient;
import easypay.appinvoke.manager.PaytmAssist;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaytmPGActivity extends AppCompatActivity implements vw4, C4474a8 {

    /* renamed from: g */
    public static final String f38528g = "Some error occured while initializing UI of Payment Gateway Activity";

    /* renamed from: o */
    public static final int f38529o = 101;

    /* renamed from: p */
    public static final int f38530p = 121;

    /* renamed from: q */
    public static final int f38531q = 105;

    /* renamed from: r */
    public static final int f38532r = 2;

    /* renamed from: a */
    public Activity f38533a;

    /* renamed from: a */
    public Dialog f38534a;

    /* renamed from: a */
    public BroadcastReceiver f38535a;

    /* renamed from: a */
    public Context f38536a;

    /* renamed from: a */
    public volatile Bundle f38537a;

    /* renamed from: a */
    public volatile FrameLayout f38538a;

    /* renamed from: a */
    public volatile ProgressBar f38539a;

    /* renamed from: a */
    public volatile PaytmWebView f38540a;

    /* renamed from: a */
    public EasypayWebViewClient f38541a;

    /* renamed from: a */
    public PaytmAssist f38542a;

    /* renamed from: e */
    public String f38543e;

    /* renamed from: e */
    public boolean f38544e;

    /* renamed from: f */
    public String f38545f;

    /* renamed from: f */
    public boolean f38546f;

    /* renamed from: g */
    public boolean f38547g;

    /* renamed from: com.paytm.pgsdk.PaytmPGActivity$a */
    public class C7529a implements View.OnClickListener {
        public C7529a() {
        }

        public void onClick(View view) {
            a13.m35943a("User pressed back button which is present in Header Bar.");
            PaytmPGActivity.this.mo48489k1();
        }
    }

    /* renamed from: com.paytm.pgsdk.PaytmPGActivity$b */
    public class C7530b implements DialogInterface.OnClickListener {
        public C7530b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            PaytmPGActivity.this.mo48490l1();
        }
    }

    /* renamed from: com.paytm.pgsdk.PaytmPGActivity$c */
    public class C7531c implements DialogInterface.OnClickListener {
        public C7531c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            PaytmPGActivity.this.f38534a.dismiss();
        }
    }

    /* renamed from: com.paytm.pgsdk.PaytmPGActivity$d */
    public class C7532d implements C7013v7<m53> {

        /* renamed from: com.paytm.pgsdk.PaytmPGActivity$d$a */
        public class C7533a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ m53 f38552a;

            /* renamed from: a */
            public final /* synthetic */ w03 f38553a;

            public C7533a(m53 m53, w03 w03) {
                this.f38552a = m53;
                this.f38553a = w03;
            }

            public void run() {
                this.f38553a.mo7776g(a13.m35944b(new fj1().mo35995A(this.f38552a, m53.class)));
            }
        }

        public C7532d() {
        }

        /* renamed from: b */
        public void mo46021b() {
            u03.m66329h().mo45355m().mo7776g((Bundle) null);
            PaytmPGActivity.this.finish();
        }

        /* renamed from: c */
        public void mo46020a(@vr2 m53 m53) {
            w03 m = u03.m66329h().mo45355m();
            try {
                if (m53.mo40503a().mo37414a() != null) {
                    PaytmPGActivity.this.runOnUiThread(new C7533a(m53, m));
                } else {
                    m.mo7776g((Bundle) null);
                }
            } catch (Exception unused) {
                m.mo7776g((Bundle) null);
            }
            PaytmPGActivity.this.finish();
        }
    }

    /* renamed from: com.paytm.pgsdk.PaytmPGActivity$e */
    public class C7534e extends BroadcastReceiver {
        public C7534e() {
        }

        public void onReceive(Context context, Intent intent) {
            try {
                C5706ib.m51978a("Otp message received", this);
                if (intent != null && intent.getAction() != null && intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED")) {
                    String str = "";
                    for (SmsMessage smsMessage : Telephony.Sms.Intents.getMessagesFromIntent(intent)) {
                        str = str + smsMessage.getMessageBody();
                        C5706ib.m51978a("Calling checkSms from broadcast receiver", this);
                        PaytmPGActivity.this.mo48491m1(PaytmPGActivity.this.mo48495q1(str));
                    }
                }
            } catch (Exception e) {
                C5871k5.m54077e().mo39056f(h60.f29520o, e.getMessage());
                e.printStackTrace();
                C5706ib.m51978a("EXCEPTION", e);
            }
        }
    }

    /* renamed from: H */
    public boolean mo33954H(WebView webView, Object obj) {
        return false;
    }

    /* renamed from: K */
    public void mo33955K(WebView webView, String str, Bitmap bitmap) {
        a13.m35943a("Pg Activity:OnWcPageStart");
    }

    /* renamed from: V */
    public void mo33956V(WebView webView, String str) {
    }

    /* renamed from: k1 */
    public final synchronized void mo48489k1() {
        a13.m35943a("Displaying Confirmation Dialog");
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C7546a.C7559m.CancelDialogeTheme);
        builder.setTitle("Cancel Transaction");
        builder.setMessage("Are you sure you want to cancel transaction");
        builder.setPositiveButton("Yes", new C7530b());
        builder.setNegativeButton("No", new C7531c());
        AlertDialog create = builder.create();
        this.f38534a = create;
        create.show();
    }

    /* renamed from: l1 */
    public final void mo48490l1() {
        v03.m67575a().mo45921b(new C7532d());
    }

    /* renamed from: m1 */
    public final void mo48491m1(String str) {
        this.f38540a.loadUrl("javascript:if(document.getElementById('inp')){document.getElementById('inp').focus();setTimeout(function(){document.getElementById('inp').value='" + str + "'},0);}");
    }

    /* renamed from: n1 */
    public final void mo48492n1(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            try {
                Object[] objArr = (Object[]) extras.get("pdus");
                SmsMessage[] smsMessageArr = objArr != null ? new SmsMessage[objArr.length] : null;
                if (smsMessageArr != null) {
                    for (int i = 0; i < smsMessageArr.length; i++) {
                        smsMessageArr[i] = SmsMessage.createFromPdu((byte[]) objArr[i]);
                        smsMessageArr[i].getOriginatingAddress();
                        mo48491m1(mo48495q1(smsMessageArr[i].getMessageBody()));
                    }
                }
            } catch (Exception e) {
                C5871k5.m54077e().mo39056f(h60.f29520o, e.getMessage());
                e.printStackTrace();
                C5706ib.m51978a("EXCEPTION", e);
            }
        }
    }

    @SuppressLint({"ResourceType"})
    /* renamed from: o1 */
    public final synchronized boolean mo48493o1() {
        try {
            if (getIntent() != null) {
                this.f38544e = getIntent().getBooleanExtra(r03.f34470s, false);
                this.f38546f = getIntent().getBooleanExtra(r03.f34471t, false);
                this.f38543e = getIntent().getStringExtra("mid");
                this.f38545f = getIntent().getStringExtra("orderId");
                this.f38547g = getIntent().getBooleanExtra(h60.f29516k, true);
                a13.m35943a("Assist Enabled");
            }
            a13.m35943a("Hide Header " + this.f38544e);
            a13.m35943a("Initializing the UI of Transaction Page...");
            RelativeLayout relativeLayout = new RelativeLayout(this);
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            relativeLayout2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            relativeLayout2.setId(1);
            relativeLayout2.setBackgroundColor(Color.parseColor("#bdbdbd"));
            Button button = new Button(this, (AttributeSet) null, 16842825);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(15);
            layoutParams.leftMargin = (int) (getResources().getDisplayMetrics().density * 5.0f);
            button.setOnClickListener(new C7529a());
            button.setLayoutParams(layoutParams);
            button.setText("Cancel");
            TextView textView = new TextView(this);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(13);
            textView.setLayoutParams(layoutParams2);
            textView.setTextColor(-16777216);
            textView.setText("Paytm Payments");
            relativeLayout2.addView(button);
            relativeLayout2.addView(textView);
            RelativeLayout relativeLayout3 = new RelativeLayout(this);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams3.addRule(3, relativeLayout2.getId());
            relativeLayout3.setLayoutParams(layoutParams3);
            this.f38540a = new PaytmWebView(this, this.f38537a);
            this.f38542a = PaytmAssist.getAssistInstance();
            this.f38538a = new FrameLayout(this, (AttributeSet) null);
            this.f38540a.setVisibility(8);
            this.f38540a.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f38539a = new ProgressBar(this, (AttributeSet) null, 16842873);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(13);
            this.f38539a.setLayoutParams(layoutParams4);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams5.addRule(12);
            this.f38538a.setId(101);
            this.f38538a.setLayoutParams(layoutParams5);
            relativeLayout3.addView(this.f38540a);
            relativeLayout3.addView(this.f38538a);
            relativeLayout.addView(relativeLayout2);
            relativeLayout.addView(relativeLayout3);
            if (this.f38544e) {
                relativeLayout2.setVisibility(8);
            }
            requestWindowFeature(1);
            setContentView((View) relativeLayout);
            mo48497s1();
            a13.m35943a("Initialized UI of Transaction Page.");
        } catch (Exception e) {
            C5871k5.m54077e().mo39056f(h60.f29520o, e.getMessage());
            a13.m35943a("Some exception occurred while initializing UI.");
            a13.m35953k(e);
            return false;
        }
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 105) {
            String str = "javascript:window.upiIntent.intentAppClosed(" + i2 + ");";
            this.f38540a.loadUrl(str);
            a13.m35943a("Js for acknowldgement" + str);
        }
    }

    public void onBackPressed() {
        mo48489k1();
    }

    public synchronized void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            if (!(u03.m66329h() == null || u03.m66329h().mo45355m() == null)) {
                u03.m66329h().mo45355m().mo7774e("Please retry with valid parameters");
            }
            finish();
        }
        if (this.f38547g && r70.m26348a(this, "android.permission.RECEIVE_SMS") == 0 && r70.m26348a(this, "android.permission.READ_SMS") == 0) {
            mo48498t1();
        }
        if (mo48493o1()) {
            this.f38536a = this;
            mo48499u1();
        } else {
            finish();
            w03 m = u03.m66329h().mo45355m();
            if (m != null) {
                m.mo7771b(f38528g);
            }
        }
    }

    public synchronized void onDestroy() {
        BroadcastReceiver broadcastReceiver;
        try {
            if (this.f38547g && (broadcastReceiver = this.f38535a) != null) {
                unregisterReceiver(broadcastReceiver);
            }
            u03.m66329h().mo45361s();
            v03.m67576c();
            PaytmAssist paytmAssist = this.f38542a;
            if (paytmAssist != null) {
                paytmAssist.removeAssist();
            }
        } catch (Exception e) {
            C5871k5.m54077e().mo39056f(h60.f29520o, e.getMessage());
            u03.m66329h().mo45361s();
            a13.m35943a("Some exception occurred while destroying the PaytmPGActivity.");
            a13.m35953k(e);
        }
        super.onDestroy();
        C5871k5.m54076a();
    }

    public void onResume() {
        super.onResume();
    }

    /* renamed from: p1 */
    public final boolean mo48494p1() {
        if (mo4464v0().mo4606p0(101) != null) {
            return mo4464v0().mo4606p0(101).isAdded();
        }
        return false;
    }

    /* renamed from: q1 */
    public final String mo48495q1(String str) {
        if (str == null || str.isEmpty()) {
            C5706ib.m51978a("Message received is either null or empty", this);
            return "";
        }
        Matcher matcher = Pattern.compile("\\d{6}").matcher(str);
        if (!matcher.find()) {
            return "";
        }
        Matcher matcher2 = Pattern.compile("\\d{6}").matcher(matcher.group(0));
        if (!matcher2.find()) {
            return "";
        }
        String group = matcher2.group(0);
        C5706ib.m51978a("OTP found: " + group, this);
        return group;
    }

    /* renamed from: r */
    public void mo30481r(String str) {
        a13.m35943a("SMS received:" + str);
    }

    /* renamed from: r1 */
    public final void mo48496r1(String str) {
        EasypayBrowserFragment easypayBrowserFragment = (EasypayBrowserFragment) mo4464v0().mo4606p0(101);
        if (easypayBrowserFragment != null && easypayBrowserFragment.mo48700h0() != null) {
            PaytmAssist.getAssistInstance().registerSMSCallBack(easypayBrowserFragment.mo48700h0());
            PaytmAssist.getAssistInstance().setAppSMSCallback(str);
        }
    }

    /* renamed from: s1 */
    public final void mo48497s1() {
        if (!TextUtils.isEmpty(this.f38543e) && !TextUtils.isEmpty(this.f38545f)) {
            this.f38542a.startConfigAssist(this, Boolean.valueOf(this.f38547g), Boolean.valueOf(this.f38547g), Integer.valueOf(this.f38538a.getId()), this.f38540a, this, this.f38545f, this.f38543e);
            this.f38540a.setWebCLientCallBacks();
            this.f38542a.startAssist();
        }
        EasypayWebViewClient webClientInstance = this.f38542a.getWebClientInstance();
        this.f38541a = webClientInstance;
        if (webClientInstance != null) {
            a13.m35943a("EasyPayWebView Client:mwebViewClient");
            this.f38541a.addAssistWebClientListener(this);
            return;
        }
        a13.m35943a("EasyPayWebView Client:mwebViewClient Null");
    }

    /* renamed from: t */
    public void mo33964t(WebView webView, String str) {
        a13.m35943a("Pg Activity:OnWcPageFinish");
    }

    /* renamed from: t1 */
    public final void mo48498t1() {
        this.f38535a = new C7534e();
        registerReceiver(this.f38535a, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
    }

    /* renamed from: u1 */
    public final synchronized void mo48499u1() {
        a13.m35943a("Starting the Process...");
        this.f38533a = (Activity) this.f38536a;
        if (!(getIntent() == null || getIntent().getBundleExtra(r03.f34469r) == null)) {
            this.f38537a = getIntent().getBundleExtra(r03.f34469r);
            if (!(this.f38537a == null || this.f38537a.size() <= 0 || u03.m66329h() == null)) {
                this.f38540a.setId(121);
                this.f38540a.setVisibility(0);
                this.f38540a.postUrl(u03.m66329h().f35882b, a13.m35949g(this.f38537a).getBytes());
                this.f38540a.requestFocus(130);
                if (u03.m66329h().f35876a != null) {
                    if (u03.m66329h().f35876a.mo44723a() != null) {
                        if (u03.m66329h().f35876a.mo44723a().get("prenotificationurl") != null) {
                            Intent intent = new Intent(getApplicationContext(), IntentServicePreNotification.class);
                            intent.putExtra(ImagesContract.URL, u03.m66329h().f35876a.mo44723a().get("prenotificationurl"));
                            getApplicationContext().startService(intent);
                        }
                    }
                }
                w03 m = u03.m66329h().mo45355m();
                if (m != null) {
                    m.mo7770a("Transaction failed due to invaild parameters", (Bundle) null);
                }
                finish();
            }
        }
    }

    /* renamed from: v */
    public void mo33966v(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        a13.m35943a("Pg Activity:OnWcSslError");
    }
}
