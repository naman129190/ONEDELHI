package com.phonepe.intent.sdk.p004ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.GridView;
import android.widget.TextView;
import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.ae3;
import com.onedelhi.secure.f15;
import com.onedelhi.secure.g15;
import com.onedelhi.secure.h15;
import com.onedelhi.secure.j05;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.n95;
import com.onedelhi.secure.t25;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.u25;
import com.onedelhi.secure.w15;
import com.onedelhi.secure.z15;
import com.onedelhi.secure.zz4;
import com.phonepe.intent.sdk.api.TransactionRequest;
import java.util.ArrayList;
import jmjou.C7601c;
import org.json.JSONObject;

/* renamed from: com.phonepe.intent.sdk.ui.UpiAppsSelectionDialogActivity */
public class UpiAppsSelectionDialogActivity extends Activity implements t25, DialogInterface.OnKeyListener, DialogInterface.OnCancelListener {

    /* renamed from: a */
    public Dialog f38606a;

    /* renamed from: a */
    public g15 f38607a;

    /* renamed from: a */
    public w15 f38608a;

    /* renamed from: a */
    public z15 f38609a;

    /* renamed from: a */
    public zz4 f38610a;

    /* renamed from: a */
    public TransactionRequest f38611a;

    /* renamed from: a */
    public C7601c f38612a;

    /* renamed from: com.phonepe.intent.sdk.ui.UpiAppsSelectionDialogActivity$a */
    public class C7568a extends Dialog {
        public C7568a(@mr2 UpiAppsSelectionDialogActivity upiAppsSelectionDialogActivity, Context context, int i) {
            super(context, i);
        }

        public void show() {
            Window window = getWindow();
            window.setGravity(80);
            window.setLayout(-1, -2);
            super.show();
        }
    }

    /* renamed from: com.phonepe.intent.sdk.ui.UpiAppsSelectionDialogActivity$b */
    public class C7569b implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ View f38613a;

        /* renamed from: a */
        public final /* synthetic */ Animation f38614a;

        public C7569b(UpiAppsSelectionDialogActivity upiAppsSelectionDialogActivity, View view, Animation animation) {
            this.f38613a = view;
            this.f38614a = animation;
        }

        public void onAnimationEnd(Animation animation) {
            this.f38613a.startAnimation(this.f38614a);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.phonepe.intent.sdk.ui.UpiAppsSelectionDialogActivity$c */
    public class C7570c implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ View f38615a;

        /* renamed from: a */
        public final /* synthetic */ Animation f38616a;

        public C7570c(UpiAppsSelectionDialogActivity upiAppsSelectionDialogActivity, View view, Animation animation) {
            this.f38615a = view;
            this.f38616a = animation;
        }

        public void onAnimationEnd(Animation animation) {
            this.f38615a.startAnimation(this.f38616a);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: a */
    public final Animation mo48655a(@mr2 View view, int i, int i2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.5f, 1.0f);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.5f);
        long j = (long) i2;
        alphaAnimation.setDuration(j);
        long j2 = (long) i;
        alphaAnimation.setStartOffset(j2);
        alphaAnimation.setAnimationListener(new C7570c(this, view, alphaAnimation2));
        alphaAnimation2.setDuration(j);
        alphaAnimation2.setStartOffset(j2);
        alphaAnimation2.setAnimationListener(new C7569b(this, view, alphaAnimation));
        return alphaAnimation;
    }

    /* renamed from: c */
    public void mo30383c(int i, String str) {
        u25 b = this.f38610a.mo48478b("SDK_NETWORK_ERROR");
        h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "errorMessage", str);
        this.f38610a.mo48477a(b);
        this.f38606a.findViewById(ae3.C4544g.loading_animation).setVisibility(8);
        this.f38606a.findViewById(ae3.C4544g.error_container).setVisibility(0);
        ((TextView) this.f38606a.findViewById(ae3.C4544g.error_message)).setText(ae3.C4548k.error_message);
    }

    /* renamed from: h */
    public void mo30387h(String str) {
        z15 z15 = (z15) h15.fromJsonString(str, this.f38612a, z15.class);
        this.f38609a = z15;
        if (z15 == null) {
            u25 b = this.f38610a.mo48478b("SDK_NETWORK_ERROR");
            h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "errorMessage", str);
            this.f38610a.mo48477a(b);
            Intent intent = new Intent();
            intent.putExtra("key_txn_result", this.f38612a.mo48876m("NETWORK_ERROR").toJsonString());
            setResult(0, intent);
            finish();
            return;
        }
        this.f38610a.mo48477a(this.f38610a.mo48478b("SDK_TRANSACTION_TOKEN_RECEIVED"));
        this.f38606a.findViewById(ae3.C4544g.loading_animation).setVisibility(8);
        this.f38609a.mo48122d();
        if (((ArrayList) this.f38609a.mo48122d()).isEmpty()) {
            this.f38606a.findViewById(ae3.C4544g.error_container).setVisibility(0);
            return;
        }
        ((TextView) this.f38606a.findViewById(ae3.C4544g.pay_via_text_view)).setText(ae3.C4548k.pay_via);
        GridView gridView = (GridView) this.f38606a.findViewById(ae3.C4544g.gridview);
        gridView.setVisibility(0);
        gridView.setAdapter(new f15(this, this.f38609a, this.f38612a, this.f38606a));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1234) {
            setResult(i2, intent);
            finish();
        }
    }

    public void onBackPressed() {
        Dialog dialog = this.f38606a;
        if (dialog != null) {
            dialog.dismiss();
        }
        u25 b = this.f38610a.mo48478b("SDK_NETWORK_ERROR");
        h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "errorMessage", "SDK_BACK_BUTTON_CLICKED");
        this.f38610a.mo48477a(b);
        Intent intent = new Intent();
        intent.putExtra("key_txn_result", this.f38612a.mo48876m("USER_CANCEL").toJsonString());
        setResult(0, intent);
        finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        onBackPressed();
    }

    public void onCreate(@ts2 Bundle bundle) {
        Class cls = g15.class;
        Class cls2 = zz4.class;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f38612a = (C7601c) bundle.getParcelable("data_factory");
            this.f38609a = (z15) bundle.getParcelable("redirect_response");
            this.f38611a = (TransactionRequest) bundle.getParcelable("request");
            this.f38608a = (w15) bundle.getParcelable("sdk_context");
            this.f38610a = (zz4) this.f38612a.mo48873i(cls2);
            this.f38607a = (g15) this.f38612a.mo48873i(cls);
        } else if (getIntent() != null && getIntent().getExtras() != null && this.f38609a == null) {
            C7601c cVar = (C7601c) getIntent().getParcelableExtra("data_factory");
            this.f38612a = cVar;
            this.f38610a = (zz4) cVar.mo48873i(cls2);
            C7568a aVar = new C7568a(this, this, ae3.C4549l.phonepeThemeInvisible);
            this.f38606a = aVar;
            aVar.setContentView(ae3.C4546i.upi_apps_dialog_layout);
            this.f38606a.setCancelable(true);
            this.f38606a.setOnCancelListener(this);
            this.f38606a.setOnKeyListener(this);
            this.f38606a.getWindow().getAttributes().windowAnimations = ae3.C4549l.DialogAnimation;
            ((TextView) this.f38606a.findViewById(ae3.C4544g.pay_via_text_view)).setText(ae3.C4548k.getting_apps);
            Dialog dialog = this.f38606a;
            View findViewById = dialog.findViewById(ae3.C4544g.circle_one);
            View findViewById2 = dialog.findViewById(ae3.C4544g.circle_two);
            View findViewById3 = dialog.findViewById(ae3.C4544g.circle_three);
            View findViewById4 = dialog.findViewById(ae3.C4544g.circle_four);
            findViewById.startAnimation(mo48655a(findViewById, 0, 450));
            findViewById2.startAnimation(mo48655a(findViewById2, 150, 450));
            findViewById3.startAnimation(mo48655a(findViewById3, 300, 450));
            findViewById4.startAnimation(mo48655a(findViewById4, 450, 450));
            this.f38606a.show();
            this.f38607a = (g15) this.f38612a.mo48873i(cls);
            this.f38611a = (TransactionRequest) getIntent().getParcelableExtra("request");
            w15 w15 = (w15) getIntent().getParcelableExtra("sdk_context");
            this.f38608a = w15;
            this.f38607a.mo36531k(this.f38611a, w15, (n95) null, this);
            u25 b = this.f38610a.mo48478b("SDK_UPI_APP_SELECTION_ACTIVITY_STARTED");
            h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "sdkFlowType", j05.OPEN_INTENT);
            this.f38610a.mo48477a(b);
        }
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        onBackPressed();
        return true;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f38612a = (C7601c) bundle.getParcelable("data_factory");
        this.f38609a = (z15) bundle.getParcelable("redirect_response");
        this.f38611a = (TransactionRequest) bundle.getParcelable("request");
        this.f38608a = (w15) bundle.getParcelable("sdk_context");
        this.f38610a = (zz4) this.f38612a.mo48873i(zz4.class);
        this.f38607a = (g15) this.f38612a.mo48873i(g15.class);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("sdk_context", this.f38608a);
        bundle.putParcelable("data_factory", this.f38612a);
        bundle.putParcelable("redirect_response", this.f38609a);
        bundle.putParcelable("request", this.f38611a);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
