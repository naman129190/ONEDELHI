package com.phonepe.intent.sdk.p004ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.ae3;
import com.onedelhi.secure.aw2;
import com.onedelhi.secure.g15;
import com.onedelhi.secure.h15;
import com.onedelhi.secure.h35;
import com.onedelhi.secure.j05;
import com.onedelhi.secure.m05;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.n95;
import com.onedelhi.secure.t25;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.u25;
import com.onedelhi.secure.w15;
import com.onedelhi.secure.z15;
import com.onedelhi.secure.zv2;
import com.onedelhi.secure.zz4;
import com.phonepe.intent.sdk.api.TransactionRequest;
import jmjou.C7601c;
import org.json.JSONObject;

/* renamed from: com.phonepe.intent.sdk.ui.OpenIntentTransactionActivity */
public class OpenIntentTransactionActivity extends Activity implements t25 {

    /* renamed from: c */
    public static final String f38590c = Activity.class.getName();

    /* renamed from: a */
    public g15 f38591a;

    /* renamed from: a */
    public w15 f38592a;

    /* renamed from: a */
    public z15 f38593a;

    /* renamed from: a */
    public zz4 f38594a;

    /* renamed from: a */
    public TransactionRequest f38595a;

    /* renamed from: a */
    public C7601c f38596a;

    /* renamed from: b */
    public String f38597b;

    /* renamed from: n */
    public int f38598n = 0;

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m74477d(DialogInterface dialogInterface, int i) {
        mo48638i(new Intent(), this.f38596a.mo48876m("FAILED"));
        dialogInterface.dismiss();
    }

    /* renamed from: c */
    public void mo30383c(int i, String str) {
        String str2 = f38590c;
        m05.m56772c(str2, "onFailure: " + str);
        mo48635e(str);
        mo48636f();
    }

    /* renamed from: e */
    public final void mo48635e(String str) {
        u25 b = this.f38594a.mo48478b("SDK_NETWORK_ERROR");
        h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "sdkFlowType", j05.OPEN_INTENT_CUSTOM);
        h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "openIntentWithApp", this.f38597b);
        h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "errorMessage", str);
        this.f38594a.mo48477a(b);
    }

    /* renamed from: f */
    public final void mo48636f() {
        if (this.f38598n < 3) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(ae3.C4548k.error_message).setCancelable(false);
            builder.setPositiveButton("Retry", new zv2(this)).setNegativeButton("Close", new aw2(this));
            AlertDialog create = builder.create();
            create.show();
            Button button = create.getButton(-2);
            Resources resources = getResources();
            int i = ae3.C4541d.colorText;
            button.setTextColor(resources.getColor(i));
            create.getButton(-1).setTextColor(getResources().getColor(i));
            return;
        }
        mo48639j("SDK_CUSTOM_OPEN_INTENT_RETRY_LIMIT_EXCEEDED");
        mo48638i(new Intent(), this.f38596a.mo48876m("RETRY_LIMIT_EXCEEDED"));
    }

    /* renamed from: g */
    public final void mo48637g(DialogInterface dialogInterface, int i) {
        this.f38591a.mo36531k(this.f38595a, this.f38592a, (n95) null, this);
        this.f38598n++;
        dialogInterface.dismiss();
    }

    /* renamed from: h */
    public void mo30387h(String str) {
        z15 z15 = (z15) h15.fromJsonString(str, this.f38596a, z15.class);
        this.f38593a = z15;
        if (z15 == null) {
            mo48635e(str);
            mo48638i(new Intent(), this.f38596a.mo48876m("NETWORK_ERROR"));
        } else if (this.f38597b != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setPackage(this.f38597b);
            intent.setData(Uri.parse(this.f38593a.mo48119a()));
            try {
                startActivityForResult(intent, 8888);
                mo48639j("SDK_CUSTOM_OPEN_INTENT_APP_INVOKE_SUCCESS");
            } catch (Exception unused) {
                mo48639j("SDK_CUSTOM_OPEN_INTENT_APP_INVOKE_FAILED");
            }
        }
    }

    /* renamed from: i */
    public final void mo48638i(@mr2 Intent intent, h35 h35) {
        intent.putExtra("key_txn_result", h35.toJsonString());
        setResult(0, intent);
        finish();
    }

    /* renamed from: j */
    public final void mo48639j(String str) {
        u25 b = this.f38594a.mo48478b(str);
        h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "sdkFlowType", j05.OPEN_INTENT_CUSTOM);
        h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "openIntentWithApp", this.f38597b);
        this.f38594a.mo48477a(b);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 8888) {
            setResult(i2, intent);
            finish();
        }
    }

    public void onBackPressed() {
        mo48639j("SDK_BACK_BUTTON_CLICKED");
        mo48638i(new Intent(), this.f38596a.mo48876m("USER_CANCEL"));
    }

    public void onCreate(@ts2 Bundle bundle) {
        Class cls = g15.class;
        Class cls2 = zz4.class;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f38596a = (C7601c) bundle.getParcelable("data_factory");
            this.f38593a = (z15) bundle.getParcelable("redirect_response");
            this.f38595a = (TransactionRequest) bundle.getParcelable("request");
            this.f38592a = (w15) bundle.getParcelable("sdk_context");
            this.f38597b = bundle.getString("openIntentWithApp");
            this.f38594a = (zz4) this.f38596a.mo48873i(cls2);
            this.f38591a = (g15) this.f38596a.mo48873i(cls);
        } else if (getIntent() != null && getIntent().getExtras() != null && this.f38593a == null) {
            this.f38596a = (C7601c) getIntent().getParcelableExtra("data_factory");
            this.f38597b = getIntent().getStringExtra("openIntentWithApp");
            this.f38595a = (TransactionRequest) getIntent().getParcelableExtra("request");
            this.f38592a = (w15) getIntent().getParcelableExtra("sdk_context");
            this.f38591a = (g15) this.f38596a.mo48873i(cls);
            this.f38594a = (zz4) this.f38596a.mo48873i(cls2);
            this.f38591a.mo36531k(this.f38595a, this.f38592a, (n95) null, this);
            mo48639j("SDK_CUSTOM_OPEN_INTENT_ACTIVITY_STARTED");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("sdk_context", this.f38592a);
        bundle.putParcelable("data_factory", this.f38596a);
        bundle.putParcelable("redirect_response", this.f38593a);
        bundle.putParcelable("request", this.f38595a);
        bundle.putString("openIntentWithApp", this.f38597b);
    }
}
