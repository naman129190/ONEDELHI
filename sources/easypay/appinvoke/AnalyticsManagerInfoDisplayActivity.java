package easypay.appinvoke;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.de3;
import java.util.HashMap;

public class AnalyticsManagerInfoDisplayActivity extends AppCompatActivity {

    /* renamed from: a */
    public TextView f38618a;

    /* renamed from: a */
    public HashMap<String, Object> f38619a;

    /* renamed from: b */
    public TextView f38620b;

    /* renamed from: c */
    public TextView f38621c;

    /* renamed from: d */
    public TextView f38622d;

    /* renamed from: e */
    public TextView f38623e;

    /* renamed from: f */
    public TextView f38624f;

    /* renamed from: g */
    public TextView f38625g;

    /* renamed from: h */
    public TextView f38626h;

    /* renamed from: i */
    public TextView f38627i;

    /* renamed from: j */
    public TextView f38628j;

    /* renamed from: k */
    public TextView f38629k;

    /* renamed from: l */
    public TextView f38630l;

    /* renamed from: m */
    public TextView f38631m;

    /* renamed from: n */
    public TextView f38632n;

    /* renamed from: o */
    public TextView f38633o;

    /* renamed from: p */
    public TextView f38634p;

    /* renamed from: e1 */
    public final void mo48672e1() {
        int i = de3.C5007h.tv_RedirectUrls;
        this.f38618a = (TextView) findViewById(i);
        this.f38620b = (TextView) findViewById(de3.C5007h.tv_mid);
        this.f38621c = (TextView) findViewById(de3.C5007h.tv_cardType);
        this.f38622d = (TextView) findViewById(i);
        this.f38623e = (TextView) findViewById(de3.C5007h.tv_acsUrlRequested);
        this.f38624f = (TextView) findViewById(de3.C5007h.tv_cardIssuer);
        this.f38625g = (TextView) findViewById(de3.C5007h.tv_appName);
        this.f38626h = (TextView) findViewById(de3.C5007h.tv_smsPermission);
        this.f38627i = (TextView) findViewById(de3.C5007h.tv_isSubmitted);
        this.f38628j = (TextView) findViewById(de3.C5007h.tv_acsUrl);
        this.f38629k = (TextView) findViewById(de3.C5007h.tv_isSMSRead);
        this.f38630l = (TextView) findViewById(de3.C5007h.tv_isAssistEnable);
        this.f38631m = (TextView) findViewById(de3.C5007h.tv_otp);
        this.f38632n = (TextView) findViewById(de3.C5007h.tv_acsUrlLoaded);
        this.f38633o = (TextView) findViewById(de3.C5007h.tv_sender);
        this.f38634p = (TextView) findViewById(de3.C5007h.tv_isAssistPopped);
    }

    /* renamed from: f1 */
    public final void mo48673f1() {
        HashMap<String, Object> hashMap = this.f38619a;
        if (hashMap != null) {
            this.f38618a.setText(hashMap.get("redirectUrls").toString());
            this.f38620b.setText(this.f38619a.get("mid").toString());
            this.f38621c.setText(this.f38619a.get("cardType").toString());
            this.f38622d.setText(this.f38619a.get("orderId").toString());
            this.f38623e.setText(this.f38619a.get("acsUrlRequested").toString());
            this.f38624f.setText(this.f38619a.get("cardIssuer").toString());
            this.f38625g.setText(this.f38619a.get("appName").toString());
            this.f38626h.setText(this.f38619a.get("smsPermission").toString());
            this.f38627i.setText(this.f38619a.get("isSubmitted").toString());
            this.f38628j.setText(this.f38619a.get("acsUrl").toString());
            this.f38629k.setText(this.f38619a.get("isSMSRead").toString());
            this.f38630l.setText(this.f38619a.get("mid").toString());
            this.f38631m.setText(this.f38619a.get("otp").toString());
            this.f38632n.setText(this.f38619a.get("acsUrlLoaded").toString());
            this.f38633o.setText(this.f38619a.get("sender").toString());
            this.f38634p.setText(this.f38619a.get("isAssistPopped").toString());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(de3.C5010k.activity_analytics_manager_info_display);
        this.f38619a = (HashMap) getIntent().getExtras().getSerializable(C4311b.C4317f.C4318a.f25149a);
        mo48672e1();
        mo48673f1();
    }
}
