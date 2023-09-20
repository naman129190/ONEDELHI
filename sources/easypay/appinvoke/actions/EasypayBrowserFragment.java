package easypay.appinvoke.actions;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.JsonReader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.C5235fb;
import com.onedelhi.secure.C5706ib;
import com.onedelhi.secure.C5983lb;
import com.onedelhi.secure.ar4;
import com.onedelhi.secure.cx2;
import com.onedelhi.secure.db0;
import com.onedelhi.secure.de3;
import com.onedelhi.secure.dn2;
import com.onedelhi.secure.ew2;
import com.onedelhi.secure.fj1;
import com.onedelhi.secure.hi2;
import com.onedelhi.secure.ho2;
import com.onedelhi.secure.iz2;
import com.onedelhi.secure.j53;
import com.onedelhi.secure.kc0;
import com.onedelhi.secure.le3;
import com.onedelhi.secure.mm0;
import com.onedelhi.secure.mx0;
import com.onedelhi.secure.qa0;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.tj4;
import com.onedelhi.secure.to1;
import com.onedelhi.secure.vq2;
import com.onedelhi.secure.vw4;
import easypay.appinvoke.manager.Constants;
import easypay.appinvoke.manager.EasyPayHelper;
import easypay.appinvoke.manager.EasypayWebViewClient;
import easypay.appinvoke.manager.PaytmAssist;
import easypay.appinvoke.utils.AnalyticsService;
import easypay.appinvoke.utils.EasyPayConfigDownloader;
import easypay.appinvoke.widget.OtpEditText;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@sj3(api = 11)
public class EasypayBrowserFragment extends Fragment implements View.OnClickListener, vw4, CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public BroadcastReceiver f38635a = new C7572b();

    /* renamed from: a */
    public SharedPreferences.Editor f38636a;

    /* renamed from: a */
    public SharedPreferences f38637a;

    /* renamed from: a */
    public CountDownTimer f38638a;

    /* renamed from: a */
    public TextWatcher f38639a;

    /* renamed from: a */
    public WebView f38640a;

    /* renamed from: a */
    public Button f38641a;

    /* renamed from: a */
    public CheckBox f38642a;

    /* renamed from: a */
    public EditText f38643a;

    /* renamed from: a */
    public ImageButton f38644a;

    /* renamed from: a */
    public ImageView f38645a;

    /* renamed from: a */
    public LinearLayout f38646a;

    /* renamed from: a */
    public RelativeLayout f38647a;

    /* renamed from: a */
    public TextView f38648a;

    /* renamed from: a */
    public AppCompatActivity f38649a;

    /* renamed from: a */
    public ConstraintLayout f38650a;

    /* renamed from: a */
    public cx2 f38651a;

    /* renamed from: a */
    public dn2 f38652a;

    /* renamed from: a */
    public C5235fb f38653a;

    /* renamed from: a */
    public ho2 f38654a;

    /* renamed from: a */
    public iz2 f38655a;

    /* renamed from: a */
    public j53 f38656a;

    /* renamed from: a */
    public kc0 f38657a;

    /* renamed from: a */
    public le3 f38658a;

    /* renamed from: a */
    public vq2 f38659a;

    /* renamed from: a */
    public GAEventManager f38660a;

    /* renamed from: a */
    public EasyPayHelper f38661a;

    /* renamed from: a */
    public EasypayWebViewClient f38662a;

    /* renamed from: a */
    public OtpEditText f38663a;

    /* renamed from: a */
    public InputStream f38664a;

    /* renamed from: a */
    public Long f38665a;

    /* renamed from: a */
    public StringBuilder f38666a;

    /* renamed from: a */
    public HashMap<String, ew2> f38667a = new HashMap<>();

    /* renamed from: a */
    public Map<String, String> f38668a;

    /* renamed from: a */
    public TextView[] f38669a = new TextView[3];

    /* renamed from: b */
    public SharedPreferences f38670b;

    /* renamed from: b */
    public Button f38671b;

    /* renamed from: b */
    public EditText f38672b;

    /* renamed from: b */
    public ImageButton f38673b;

    /* renamed from: b */
    public ImageView f38674b;

    /* renamed from: b */
    public LinearLayout f38675b;

    /* renamed from: b */
    public TextView f38676b;

    /* renamed from: b */
    public ConstraintLayout f38677b;

    /* renamed from: b */
    public Long f38678b;

    /* renamed from: b */
    public String f38679b;

    /* renamed from: b */
    public StringBuilder f38680b = new StringBuilder();

    /* renamed from: b */
    public HashMap<String, ew2> f38681b;

    /* renamed from: b */
    public boolean f38682b;

    /* renamed from: c */
    public ImageView f38683c;

    /* renamed from: c */
    public TextView f38684c;

    /* renamed from: c */
    public String f38685c = "";

    /* renamed from: c */
    public boolean f38686c = false;

    /* renamed from: d */
    public TextView f38687d;

    /* renamed from: d */
    public String f38688d;

    /* renamed from: d */
    public boolean f38689d = true;

    /* renamed from: e */
    public TextView f38690e;

    /* renamed from: e */
    public boolean f38691e = false;

    /* renamed from: f */
    public TextView f38692f;

    /* renamed from: f */
    public boolean f38693f;

    /* renamed from: g */
    public TextView f38694g;

    /* renamed from: g */
    public boolean f38695g = false;

    /* renamed from: h */
    public boolean f38696h = true;

    /* renamed from: i */
    public boolean f38697i = true;

    /* renamed from: j */
    public boolean f38698j = false;

    /* renamed from: k */
    public boolean f38699k = false;

    /* renamed from: n */
    public int f38700n = 0;

    /* renamed from: easypay.appinvoke.actions.EasypayBrowserFragment$a */
    public class C7571a extends CountDownTimer {

        /* renamed from: a */
        public final /* synthetic */ String f38702a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7571a(long j, long j2, String str) {
            super(j, j2);
            this.f38702a = str;
        }

        public void onFinish() {
            EasypayBrowserFragment.this.mo48685L0();
            if (EasypayBrowserFragment.this.f38660a != null) {
                EasypayBrowserFragment.this.f38660a.mo38434v(true);
                EasypayBrowserFragment.this.f38660a.mo38431s(false);
                EasypayBrowserFragment.this.f38660a.mo38436x(false, 0);
                EasypayBrowserFragment.this.f38660a.mo38411M(false);
            }
        }

        public void onTick(long j) {
            String str;
            StringBuilder sb;
            String str2;
            long j2 = j / 1000;
            int i = (j2 > 1 ? 1 : (j2 == 1 ? 0 : -1));
            if (i > 0) {
                sb = new StringBuilder();
                sb.append(this.f38702a);
                sb.append(" ");
                sb.append(j2);
                str2 = " seconds";
            } else if (i == 0) {
                sb = new StringBuilder();
                sb.append(this.f38702a);
                sb.append(" ");
                sb.append(j2);
                str2 = " second";
            } else {
                onFinish();
                str = "";
                EasypayBrowserFragment.this.f38690e.setText(str);
            }
            sb.append(str2);
            str = sb.toString();
            EasypayBrowserFragment.this.f38690e.setText(str);
        }
    }

    /* renamed from: easypay.appinvoke.actions.EasypayBrowserFragment$b */
    public class C7572b extends BroadcastReceiver {
        public C7572b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (Constants.EASYPAY_ACTION_FILE_DOWNLOADED.equalsIgnoreCase(intent.getAction())) {
                EasypayBrowserFragment.this.mo48708o0();
            } else {
                EasypayBrowserFragment.this.mo48707n0();
            }
        }
    }

    /* renamed from: easypay.appinvoke.actions.EasypayBrowserFragment$c */
    public class C7573c implements TextWatcher {
        public C7573c() {
        }

        public void afterTextChanged(Editable editable) {
            if (editable.toString().equals(EasypayBrowserFragment.this.f38688d)) {
                EasypayBrowserFragment.this.mo48682I0(false);
                EasypayBrowserFragment easypayBrowserFragment = EasypayBrowserFragment.this;
                easypayBrowserFragment.mo48687N0(false, easypayBrowserFragment.f38688d);
            } else if (editable.toString().equals(EasypayBrowserFragment.this.f38685c)) {
                EasypayBrowserFragment easypayBrowserFragment2 = EasypayBrowserFragment.this;
                easypayBrowserFragment2.mo48682I0(easypayBrowserFragment2.f38689d);
            } else {
                EasypayBrowserFragment.this.mo48682I0(true);
                EasypayBrowserFragment.this.mo48687N0(true, editable.toString());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: easypay.appinvoke.actions.EasypayBrowserFragment$d */
    public class C7574d implements Runnable {
        public C7574d() {
        }

        public void run() {
            EasypayBrowserFragment easypayBrowserFragment = EasypayBrowserFragment.this;
            easypayBrowserFragment.f38686c = false;
            easypayBrowserFragment.f38650a.setVisibility(0);
            EasypayBrowserFragment.this.f38677b.setVisibility(8);
            EasypayBrowserFragment.this.mo48719v0();
        }
    }

    /* renamed from: easypay.appinvoke.actions.EasypayBrowserFragment$e */
    public class C7575e implements Runnable {
        public C7575e() {
        }

        public void run() {
            EasypayBrowserFragment easypayBrowserFragment = EasypayBrowserFragment.this;
            easypayBrowserFragment.f38686c = true;
            if (easypayBrowserFragment.f38638a != null) {
                EasypayBrowserFragment.this.f38638a.cancel();
            }
            EasypayBrowserFragment.this.f38650a.setVisibility(8);
            EasypayBrowserFragment.this.f38677b.setVisibility(0);
            if (EasypayBrowserFragment.this.f38660a != null) {
                EasypayBrowserFragment.this.f38660a.mo38432t(true);
            }
        }
    }

    /* renamed from: easypay.appinvoke.actions.EasypayBrowserFragment$f */
    public class C7576f extends tj4<HashMap<String, String>> {
        public C7576f() {
        }
    }

    /* renamed from: easypay.appinvoke.actions.EasypayBrowserFragment$g */
    public class C7577g extends tj4<HashMap<String, String>> {
        public C7577g() {
        }
    }

    /* renamed from: easypay.appinvoke.actions.EasypayBrowserFragment$h */
    public class C7578h implements Runnable {
        public C7578h() {
        }

        public void run() {
            EasypayBrowserFragment.this.mo48720w0("", 3);
        }
    }

    /* renamed from: easypay.appinvoke.actions.EasypayBrowserFragment$i */
    public class C7579i implements Runnable {
        public C7579i() {
        }

        public void run() {
            EasypayBrowserFragment.this.mo48720w0("", 4);
        }
    }

    /* renamed from: easypay.appinvoke.actions.EasypayBrowserFragment$j */
    public class C7580j implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f38712b;

        /* renamed from: n */
        public final /* synthetic */ int f38713n;

        public C7580j(int i, String str) {
            this.f38713n = i;
            this.f38712b = str;
        }

        public void run() {
            EditText y;
            String str;
            try {
                int i = this.f38713n;
                if (i == 1) {
                    EasypayBrowserFragment.this.f38646a.setVisibility(0);
                    if (EasypayBrowserFragment.this.f38642a.getVisibility() == 0) {
                        EasypayBrowserFragment.this.f38642a.setVisibility(8);
                        EasypayBrowserFragment easypayBrowserFragment = EasypayBrowserFragment.this;
                        String unused = easypayBrowserFragment.f38685c = easypayBrowserFragment.f38672b.getText().toString();
                    }
                    EasypayBrowserFragment.this.f38643a.setVisibility(0);
                    EasypayBrowserFragment.this.f38644a.setVisibility(0);
                    EasypayBrowserFragment.this.f38673b.setVisibility(8);
                    EasypayBrowserFragment.this.f38672b.setVisibility(8);
                    EasypayBrowserFragment.this.f38675b.setVisibility(8);
                    if (EasypayBrowserFragment.this.f38641a.getVisibility() != 0) {
                        EasypayBrowserFragment.this.f38641a.setVisibility(0);
                    }
                    EasypayBrowserFragment.this.f38687d.setVisibility(0);
                    if (this.f38712b != null) {
                        y = EasypayBrowserFragment.this.f38643a;
                        str = this.f38712b;
                    } else {
                        return;
                    }
                } else if (i == 0) {
                    if (EasypayBrowserFragment.this.f38643a.getVisibility() == 0 || EasypayBrowserFragment.this.f38643a.getVisibility() == 4) {
                        EasypayBrowserFragment.this.f38643a.setVisibility(8);
                    }
                    if (EasypayBrowserFragment.this.f38687d.getVisibility() == 0 || EasypayBrowserFragment.this.f38687d.getVisibility() == 4) {
                        EasypayBrowserFragment.this.f38687d.setVisibility(8);
                    }
                    if (EasypayBrowserFragment.this.f38642a.getVisibility() == 0 || EasypayBrowserFragment.this.f38642a.getVisibility() == 4) {
                        EasypayBrowserFragment.this.f38642a.setVisibility(8);
                    }
                    if (EasypayBrowserFragment.this.f38641a.getVisibility() == 0 || EasypayBrowserFragment.this.f38641a.getVisibility() == 4) {
                        EasypayBrowserFragment.this.f38641a.setVisibility(8);
                        return;
                    }
                    return;
                } else if (i == 3) {
                    if (EasypayBrowserFragment.this.f38646a != null && EasypayBrowserFragment.this.f38643a != null) {
                        y = EasypayBrowserFragment.this.f38643a;
                        str = "";
                    } else {
                        return;
                    }
                } else if (i == 4) {
                    if (EasypayBrowserFragment.this.f38646a != null) {
                        EasypayBrowserFragment.this.f38646a.setVisibility(0);
                        return;
                    }
                    return;
                } else if (i == 5 && EasypayBrowserFragment.this.f38646a != null) {
                    EasypayBrowserFragment.this.f38646a.setVisibility(8);
                    return;
                } else {
                    return;
                }
                y.setText(str);
            } catch (Exception e) {
                e.printStackTrace();
                C5706ib.m51978a("EXCEPTION", e);
            }
        }
    }

    /* renamed from: t0 */
    public static EasypayBrowserFragment m74535t0() {
        Bundle bundle = new Bundle();
        EasypayBrowserFragment easypayBrowserFragment = new EasypayBrowserFragment();
        easypayBrowserFragment.setArguments(bundle);
        return easypayBrowserFragment;
    }

    /* renamed from: A0 */
    public final void mo48674A0(Bundle bundle) {
        if (bundle != null) {
            try {
                this.f38640a = PaytmAssist.getAssistInstance().getWebView();
            } catch (NullPointerException e) {
                e.printStackTrace();
                C5706ib.m51978a("EXCEPTION", e);
            }
        }
    }

    /* renamed from: B0 */
    public void mo48675B0() {
        RelativeLayout relativeLayout = this.f38647a;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    /* renamed from: C0 */
    public void mo48676C0() {
        cx2 cx2 = this.f38651a;
        if (cx2 != null) {
            cx2.mo33968x();
            this.f38651a = null;
        }
        j53 j53 = this.f38656a;
        if (j53 != null) {
            j53.mo38441c();
            this.f38656a = null;
        }
        le3 le3 = this.f38658a;
        if (le3 != null) {
            le3.mo39794e();
            this.f38658a = null;
        }
        iz2 iz2 = this.f38655a;
        if (iz2 != null) {
            iz2.mo38304i();
            this.f38655a = null;
        }
        if (this.f38657a != null) {
            this.f38657a = null;
        }
    }

    /* renamed from: D0 */
    public final void mo48677D0(boolean z) {
        HashMap hashMap;
        fj1 fj1;
        if (z) {
            SharedPreferences sharedPreferences = this.f38649a.getApplicationContext().getSharedPreferences(Constants.BANKPREF, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            String str = this.f38668a.get("bank");
            String string = sharedPreferences.getString(Constants.USER_ID_NET_BANK_KEY, "");
            if (!TextUtils.isEmpty(string)) {
                hashMap = (HashMap) new fj1().mo36013o(string, new C7576f().getType());
                if (hashMap != null && !hashMap.containsKey(str)) {
                    hashMap.put(str, this.f38679b);
                    fj1 = new fj1();
                } else {
                    return;
                }
            } else {
                hashMap = new HashMap();
                hashMap.put(str, this.f38679b);
                fj1 = new fj1();
            }
            edit.putString(Constants.USER_ID_NET_BANK_KEY, fj1.mo36024z(hashMap));
            edit.apply();
        }
    }

    /* renamed from: E0 */
    public void mo48678E0(String str) {
        mo48682I0(false);
        this.f38688d = str;
    }

    /* renamed from: F0 */
    public void mo48679F0(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f38694g.setText(str);
        }
    }

    /* renamed from: G0 */
    public void mo48680G0(ArrayList<String> arrayList) {
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i += -1) {
            this.f38669a[(size - i) - 1].setText(arrayList.get(i));
            C5706ib.m51978a("" + arrayList.get(i) + " USER ID", this);
        }
    }

    /* renamed from: H */
    public boolean mo33954H(WebView webView, Object obj) {
        return false;
    }

    /* renamed from: H0 */
    public void mo48681H0(boolean z) {
        String string = getString(de3.C5011l.submit_time);
        C5706ib.m51978a("Timer called", this);
        try {
            CountDownTimer countDownTimer = this.f38638a;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            if (!z) {
                mo48698f0();
                this.f38638a = new C7571a(8000, 1000, string).start();
                return;
            }
            mo48696d0();
        } catch (Exception e) {
            e.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e);
        }
    }

    /* renamed from: I0 */
    public void mo48682I0(boolean z) {
        this.f38642a.setChecked(z);
    }

    /* renamed from: J0 */
    public void mo48683J0(String str) {
        this.f38672b.setText(str);
    }

    /* renamed from: K */
    public void mo33955K(WebView webView, String str, Bitmap bitmap) {
        this.f38665a = Long.valueOf(System.currentTimeMillis());
        C5706ib.m51978a("Start Called :" + this.f38665a, this);
    }

    /* renamed from: K0 */
    public final void mo48684K0() {
        AppCompatActivity appCompatActivity = this.f38649a;
        if (appCompatActivity != null) {
            appCompatActivity.runOnUiThread(new C7574d());
        }
    }

    /* renamed from: L0 */
    public final void mo48685L0() {
        C5235fb fbVar = this.f38653a;
        if (fbVar != null && this.f38691e) {
            if (Constants.EASYPAY_PAYTYPE_CREDIT_CARD.equalsIgnoreCase(fbVar.mo35829e()) || Constants.EASYPAY_PAYTYPE_DEBIT_CARD.equalsIgnoreCase(this.f38653a.mo35829e())) {
                this.f38659a.mo46291M(this.f38667a.get(Constants.SUBMIT_BTN));
            }
        }
    }

    /* renamed from: M0 */
    public void mo48686M0(int i, boolean z) {
        TextView textView;
        if (z) {
            this.f38675b.setVisibility(0);
            for (int i2 = 0; i2 < 3; i2++) {
                TextView[] textViewArr = this.f38669a;
                if (i2 >= i) {
                    textView = textViewArr[i2];
                } else if (textViewArr[i2].getText().equals(this.f38688d)) {
                    textView = this.f38669a[i2];
                } else {
                    this.f38669a[i2].setVisibility(0);
                }
                textView.setVisibility(8);
            }
            return;
        }
        this.f38675b.setVisibility(8);
        for (int i3 = 0; i3 < i; i3++) {
            this.f38669a[i3].setVisibility(8);
        }
    }

    /* renamed from: N0 */
    public final void mo48687N0(boolean z, String str) {
        if (str == null) {
            str = this.f38688d;
        }
        int w = this.f38652a.mo34515w();
        if (w == 1) {
            LinearLayout linearLayout = this.f38675b;
            if (z) {
                linearLayout.setVisibility(0);
                this.f38669a[0].setVisibility(0);
                this.f38669a[0].setText(this.f38688d);
            } else {
                linearLayout.setVisibility(8);
                this.f38669a[0].setVisibility(8);
            }
        } else if (w > 1) {
            for (int i = 0; i < w; i++) {
                if (this.f38669a[i].getText().equals(str)) {
                    this.f38669a[i].setVisibility(8);
                } else if (!this.f38669a[i].getText().equals("")) {
                    this.f38669a[i].setVisibility(0);
                }
            }
        }
        mo48682I0(z);
    }

    @JavascriptInterface
    public void NbWatcher(String str, String str2) {
        Map<String, String> map;
        AppCompatActivity appCompatActivity;
        Runnable iVar;
        String sb;
        if (str != null && str2 != null && (map = this.f38668a) != null && map.get("passwordId") != null && this.f38668a.get(ImagesContract.URL) != null && this.f38668a.get(hi2.f29634a) != null && !this.f38668a.isEmpty()) {
            try {
                this.f38682b = false;
                StringBuilder sb2 = this.f38666a;
                sb2.delete(0, sb2.length());
                if (!str.equals("101")) {
                    if (!str.equals(mm0.f16219f) && !str.equals("110")) {
                        if (str2.equals(this.f38668a.get(hi2.f29634a))) {
                            this.f38679b = str;
                            sb = this.f38666a.toString();
                            mo48720w0(sb, 0);
                        } else if (str2.equals(this.f38668a.get("passwordId"))) {
                            this.f38666a.append(str);
                            mo48720w0(str, 1);
                            return;
                        } else {
                            return;
                        }
                    }
                }
                if (!str.equals(mm0.f16219f) || !str2.equals(mx0.f16744n2)) {
                    if (str.equals(mm0.f16219f)) {
                        if (str2.equals(mx0.f16754o2)) {
                            sendEvent("confirmhelper", "", "");
                            mo48677D0(this.f38696h);
                            return;
                        }
                    }
                    if (str.equals("101")) {
                        if (str2.equals(this.f38668a.get(hi2.f29634a))) {
                            sb = this.f38666a.toString();
                            mo48720w0(sb, 0);
                        } else if (str2.equals(this.f38668a.get("passwordId"))) {
                            mo48720w0("", 1);
                        }
                    } else if (str.equals("110")) {
                        if (str2.equals(qa0.f34045b)) {
                            appCompatActivity = this.f38649a;
                            iVar = new C7578h();
                        } else if (str2.equals(mm0.f16219f)) {
                            appCompatActivity = this.f38649a;
                            iVar = new C7579i();
                        } else {
                            return;
                        }
                        appCompatActivity.runOnUiThread(iVar);
                    }
                } else {
                    this.f38682b = true;
                    mo48677D0(this.f38696h);
                    mo48697e0(this.f38640a, this.f38668a.get(ImagesContract.URL), "nbotphelper");
                    this.f38682b = false;
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: O0 */
    public void mo48689O0(boolean z) {
        this.f38699k = z;
    }

    /* renamed from: P0 */
    public void mo48690P0(int i, Boolean bool) {
        try {
            View findViewById = this.f38649a.findViewById(i);
            View findViewById2 = this.f38649a.findViewById(de3.C5007h.parentPanel);
            int i2 = bool.booleanValue() ? 0 : 8;
            findViewById2.setVisibility(i2);
            if (bool.booleanValue() && i == de3.C5007h.otpHelper) {
                GAEventManager gAEventManager = this.f38660a;
                if (gAEventManager != null) {
                    gAEventManager.mo38437y(true);
                }
                findViewById.setVisibility(i2);
                this.f38691e = true;
            } else if (!bool.booleanValue() && i == de3.C5007h.otpHelper) {
                GAEventManager gAEventManager2 = this.f38660a;
                if (gAEventManager2 != null) {
                    gAEventManager2.mo38437y(false);
                }
                findViewById.setVisibility(i2);
            } else if (i == de3.C5007h.layout_netbanking && bool.booleanValue()) {
                PaytmAssist.getAssistInstance().getmEventMap().put("showPasswordClicked", Boolean.valueOf(this.f38697i));
                GAEventManager gAEventManager3 = this.f38660a;
                if (gAEventManager3 != null) {
                    gAEventManager3.mo38402D(true);
                    this.f38660a.mo38437y(true);
                }
                this.f38647a.setBackgroundColor(0);
                ((RelativeLayout) findViewById.findViewById(i)).setVisibility(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e);
        }
    }

    /* renamed from: V */
    public void mo33956V(WebView webView, String str) {
    }

    /* renamed from: Y */
    public final void mo48691Y(WebView webView, String str, C5235fb fbVar) {
        try {
            C5706ib.m51978a("In assistNewFlow():mdetailresponse=" + this.f38653a.mo35825a() + ar4.f25981a + this.f38653a.mo35831f(), this);
            if (this.f38653a != null) {
                this.f38667a = new HashMap<>();
                ArrayList<C5983lb> f = fbVar.mo35831f();
                if (!fbVar.mo35829e().equalsIgnoreCase(Constants.EASYPAY_PAYTYPE_CREDIT_CARD)) {
                    if (!fbVar.mo35829e().equalsIgnoreCase(Constants.EASYPAY_PAYTYPE_DEBIT_CARD)) {
                        if (Constants.EASYPAY_PAYTYPE_NETBANKING.equalsIgnoreCase(fbVar.mo35829e())) {
                            mo48706m0(str, fbVar);
                            return;
                        }
                        return;
                    }
                }
                SharedPreferences sharedPreferences = this.f38649a.getSharedPreferences("com.paytm.com.paytm.pgsdk.easypay.appinvoke.PREFERENCE_FILE_KEY", 0);
                this.f38637a = sharedPreferences;
                this.f38693f = sharedPreferences.getBoolean("enableEasyPay", false);
                if (!this.f38695g) {
                    this.f38695g = true;
                }
                Iterator<C5983lb> it = f.iterator();
                while (it.hasNext()) {
                    C5983lb next = it.next();
                    if (mo48695c0(next.mo39764b(), str)) {
                        GAEventManager gAEventManager = this.f38660a;
                        if (gAEventManager != null) {
                            gAEventManager.mo38415c(str);
                        }
                        ArrayList<ew2> a = next.mo39763a();
                        if (a != null && !a.isEmpty()) {
                            Iterator<ew2> it2 = a.iterator();
                            while (it2.hasNext()) {
                                ew2 next2 = it2.next();
                                this.f38667a.put(next2.mo35649b(), next2);
                                C5706ib.m51978a("Operation type: " + next2.mo35649b(), this);
                            }
                        }
                    }
                }
                if (this.f38659a == null) {
                    C5706ib.m51978a("making object newotphelper", this);
                    this.f38659a = new vq2(this.f38649a, webView, this, this.f38662a);
                }
                if (this.f38667a.size() > 0) {
                    C5706ib.m51978a("Easypay browser fragment:fire do action-Filler from web ", this);
                    this.f38659a.mo46287G(this.f38667a);
                    this.f38659a.mo46300x(Constants.FILLER_FROM_WEB);
                    return;
                }
                mo48676C0();
            }
        } catch (Exception e) {
            e.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e);
        }
    }

    /* renamed from: Z */
    public final void mo48692Z() {
        this.f38645a.setOnClickListener(this);
        this.f38648a.setOnClickListener(this);
        this.f38676b.setOnClickListener(this);
        this.f38684c.setOnClickListener(this);
        this.f38687d.setOnClickListener(this);
        this.f38673b.setOnClickListener(this);
        this.f38644a.setOnClickListener(this);
        this.f38694g.setOnClickListener(this);
        this.f38692f.setOnClickListener(this);
        this.f38671b.setOnClickListener(this);
        this.f38642a.setOnClickListener(this);
        this.f38683c.setOnClickListener(this);
        this.f38641a.setOnClickListener(this);
        this.f38674b.setOnClickListener(this);
    }

    /* renamed from: a0 */
    public void mo48693a0(WebView webView, String str) {
        GAEventManager gAEventManager;
        AppCompatActivity appCompatActivity = this.f38649a;
        if (appCompatActivity != null && !appCompatActivity.isFinishing()) {
            try {
                String string = this.f38649a.getSharedPreferences(Constants.EASYPAY_NEW_PREFERENCE_FILE, 0).getString(Constants.EASY_PAY_CONFIG_PREF_KEY, "");
                C5706ib.m51978a("in checkAssistFlow Config json:" + string, this);
                if (!TextUtils.isEmpty(string)) {
                    C5235fb fbVar = (C5235fb) new fj1().mo36012n(string, C5235fb.class);
                    this.f38653a = fbVar;
                    if (fbVar != null) {
                        if (fbVar.mo35825a().equalsIgnoreCase(PaytmAssist.getAssistInstance().geTxnBank())) {
                            GAEventManager gAEventManager2 = this.f38660a;
                            if (gAEventManager2 != null) {
                                gAEventManager2.mo38425m(this.f38653a.mo35827c().booleanValue());
                            }
                            if (this.f38653a.mo35827c().booleanValue()) {
                                this.f38698j = true;
                                mo48691Y(webView, str, this.f38653a);
                                return;
                            }
                            gAEventManager = this.f38660a;
                            if (gAEventManager == null) {
                                return;
                            }
                        } else {
                            C5706ib.m51978a("Config JSON picked from cache doesn't have same bank name", this);
                            gAEventManager = this.f38660a;
                            if (gAEventManager == null) {
                                return;
                            }
                        }
                        gAEventManager.mo38437y(false);
                        return;
                    }
                    C5706ib.m51978a("imDetail resoinse Null", this);
                }
            } catch (Exception e) {
                e.printStackTrace();
                C5706ib.m51978a("EXCEPTION", e);
            }
        }
    }

    /* renamed from: b0 */
    public void mo48694b0() {
        this.f38663a.setText("");
        mo48679F0(this.f38649a.getString(de3.C5011l.waiting_for_otp_label, new Object[]{PaytmAssist.getAssistInstance().geTxnBank()}));
    }

    /* renamed from: c0 */
    public final boolean mo48695c0(String str, String str2) {
        return str2.contains(str);
    }

    /* renamed from: d0 */
    public final void mo48696d0() {
        this.f38692f.setVisibility(8);
        this.f38690e.setVisibility(8);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0139, code lost:
        r4.append("var fields = document.getElementsByName('");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015c, code lost:
        r0.append("if(fields.length == 0){Android.showLog('not found - ' + fields.length); throw 'error';}");
        r0 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b3, code lost:
        r4.append(r0);
        r4.append("');");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b9, code lost:
        r4.append("if(fields.length == 0){Android.showLog('not found - ' + fields.length); throw 'error';}");
        r0 = r4.toString();
     */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48697e0(android.webkit.WebView r24, java.lang.String r25, java.lang.String r26) {
        /*
            r23 = this;
            r10 = r23
            r11 = r24
            r12 = r25
            java.lang.String r13 = "EXCEPTION"
            r14 = 0
            r15 = 1
            java.util.ArrayList r1 = r10.mo48699g0(r12)     // Catch:{ Exception -> 0x002b }
            if (r1 == 0) goto L_0x0033
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0029 }
            if (r0 != 0) goto L_0x0033
            android.content.SharedPreferences r0 = r10.f38637a     // Catch:{ Exception -> 0x0029 }
            if (r0 == 0) goto L_0x0033
            java.lang.String r2 = "enableEasyPay"
            boolean r0 = r0.getBoolean(r2, r14)     // Catch:{ Exception -> 0x0029 }
            r10.f38693f = r0     // Catch:{ Exception -> 0x0029 }
            boolean r0 = r10.f38695g     // Catch:{ Exception -> 0x0029 }
            if (r0 != 0) goto L_0x0033
            r10.f38695g = r15     // Catch:{ Exception -> 0x0029 }
            goto L_0x0033
        L_0x0029:
            r0 = move-exception
            goto L_0x002d
        L_0x002b:
            r0 = move-exception
            r1 = 0
        L_0x002d:
            r0.printStackTrace()
            com.onedelhi.secure.C5706ib.m51978a(r13, r0)
        L_0x0033:
            if (r1 == 0) goto L_0x03af
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x03af
            java.util.Iterator r16 = r1.iterator()
        L_0x003f:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x03af
            java.lang.Object r0 = r16.next()
            r9 = r0
            java.util.Map r9 = (java.util.Map) r9
            java.lang.String r0 = "active"
            java.lang.Object r1 = r9.get(r0)
            if (r1 == 0) goto L_0x0063
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "false"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0063
            goto L_0x003f
        L_0x0063:
            r10.f38668a = r9
            java.lang.String r0 = "selector"
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "customjs"
            java.lang.Object r2 = r9.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0079
            java.lang.String r2 = "customJs=function(){};"
        L_0x0079:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "(function(){ try { "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "functionStart"
            r9.put(r3, r2)
            java.lang.String r2 = "functionEnd"
            java.lang.String r3 = "}catch(e){ Android.logError(\" + element not found + \"); } })();"
            r9.put(r2, r3)
            java.lang.String r2 = "if(fields.length == 0){Android.showLog('not found - ' + fields.length); throw 'error';}"
            java.lang.String r3 = "msgPattern"
            java.lang.Object r3 = r9.get(r3)
            r17 = r3
            java.lang.String r17 = (java.lang.String) r17
            java.lang.String r3 = "msgSender"
            java.lang.Object r3 = r9.get(r3)
            r18 = r3
            java.lang.String r18 = (java.lang.String) r18
            java.lang.String r3 = "msgKeywords"
            java.lang.Object r3 = r9.get(r3)
            r19 = r3
            java.lang.String r19 = (java.lang.String) r19
            java.lang.String r3 = "action"
            java.lang.Object r3 = r9.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "selectorType"
            java.lang.Object r4 = r9.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "buttonSelectorName"
            java.lang.Object r5 = r9.get(r5)
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r5 = "userId"
            java.lang.Object r5 = r9.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r20 = 2
            r21 = -1
            java.lang.String r7 = "netbanking"
            java.lang.String r14 = ""
            if (r4 == 0) goto L_0x01c1
            int r22 = r4.hashCode()
            switch(r22) {
                case -1548231387: goto L_0x0121;
                case -1349088399: goto L_0x0116;
                case 3355: goto L_0x010b;
                case 3373707: goto L_0x0100;
                case 3556653: goto L_0x00f5;
                case 1216985755: goto L_0x00ea;
                default: goto L_0x00e8;
            }
        L_0x00e8:
            r4 = -1
            goto L_0x012b
        L_0x00ea:
            java.lang.String r8 = "password"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x00f3
            goto L_0x00e8
        L_0x00f3:
            r4 = 5
            goto L_0x012b
        L_0x00f5:
            java.lang.String r8 = "text"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x00fe
            goto L_0x00e8
        L_0x00fe:
            r4 = 4
            goto L_0x012b
        L_0x0100:
            java.lang.String r8 = "name"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0109
            goto L_0x00e8
        L_0x0109:
            r4 = 3
            goto L_0x012b
        L_0x010b:
            java.lang.String r8 = "id"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0114
            goto L_0x00e8
        L_0x0114:
            r4 = 2
            goto L_0x012b
        L_0x0116:
            java.lang.String r8 = "custom"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x011f
            goto L_0x00e8
        L_0x011f:
            r4 = 1
            goto L_0x012b
        L_0x0121:
            java.lang.String r8 = "tagname"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x012a
            goto L_0x00e8
        L_0x012a:
            r4 = 0
        L_0x012b:
            java.lang.String r8 = "var fields = document.getElementsByName('"
            java.lang.String r15 = "');"
            switch(r4) {
                case 0: goto L_0x01a9;
                case 1: goto L_0x0198;
                case 2: goto L_0x016a;
                case 3: goto L_0x013e;
                case 4: goto L_0x0134;
                case 5: goto L_0x0134;
                default: goto L_0x0132;
            }
        L_0x0132:
            goto L_0x01c1
        L_0x0134:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x0139:
            r4.append(r8)
            goto L_0x01b3
        L_0x013e:
            if (r3 == 0) goto L_0x01c1
            boolean r4 = r3.contains(r7)
            if (r4 == 0) goto L_0x0164
            boolean r4 = r10.f38682b
            if (r4 != 0) goto L_0x0164
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "var field = document.getElementsByName("
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = "); var fields = field ? [field] : [];"
            r0.append(r4)
        L_0x015c:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L_0x01c2
        L_0x0164:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x0139
        L_0x016a:
            if (r3 == 0) goto L_0x01c1
            boolean r4 = r3.equals(r7)
            java.lang.String r8 = "'); var fields = field ? [field] : [];"
            java.lang.String r15 = "var field = document.getElementById('"
            if (r4 == 0) goto L_0x0189
            boolean r4 = r10.f38682b
            if (r4 != 0) goto L_0x0189
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            r0.append(r5)
            r0.append(r8)
            goto L_0x015c
        L_0x0189:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r15)
            r4.append(r0)
            r4.append(r8)
            goto L_0x01b9
        L_0x0198:
            java.lang.String r0 = "customSelector"
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            goto L_0x01b9
        L_0x01a9:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "var fields = document.getElementsByTagName('"
            r4.append(r5)
        L_0x01b3:
            r4.append(r0)
            r4.append(r15)
        L_0x01b9:
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            goto L_0x01c2
        L_0x01c1:
            r0 = r14
        L_0x01c2:
            java.lang.String r2 = "fields"
            r9.put(r2, r0)
            if (r3 == 0) goto L_0x036d
            int r0 = r3.hashCode()
            switch(r0) {
                case -1442942500: goto L_0x0205;
                case -72873923: goto L_0x01fa;
                case 181402473: goto L_0x01ef;
                case 606175354: goto L_0x01e6;
                case 933786265: goto L_0x01db;
                case 1954534377: goto L_0x01d2;
                default: goto L_0x01d0;
            }
        L_0x01d0:
            r7 = -1
            goto L_0x020f
        L_0x01d2:
            boolean r0 = r3.equals(r7)
            if (r0 != 0) goto L_0x01d9
            goto L_0x01d0
        L_0x01d9:
            r7 = 5
            goto L_0x020f
        L_0x01db:
            java.lang.String r0 = "otphelper"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x01e4
            goto L_0x01d0
        L_0x01e4:
            r7 = 4
            goto L_0x020f
        L_0x01e6:
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L_0x01ed
            goto L_0x01d0
        L_0x01ed:
            r7 = 3
            goto L_0x020f
        L_0x01ef:
            java.lang.String r0 = "radiohelper"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x01f8
            goto L_0x01d0
        L_0x01f8:
            r7 = 2
            goto L_0x020f
        L_0x01fa:
            java.lang.String r0 = "passwordtracker"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0203
            goto L_0x01d0
        L_0x0203:
            r7 = 1
            goto L_0x020f
        L_0x0205:
            java.lang.String r0 = "proceedhelper"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x020e
            goto L_0x01d0
        L_0x020e:
            r7 = 0
        L_0x020f:
            java.lang.String r0 = "time not captured"
            switch(r7) {
                case 0: goto L_0x0359;
                case 1: goto L_0x033f;
                case 2: goto L_0x0332;
                case 3: goto L_0x0325;
                case 4: goto L_0x02aa;
                case 5: goto L_0x0216;
                default: goto L_0x0214;
            }
        L_0x0214:
            goto L_0x036d
        L_0x0216:
            boolean r1 = r10.f38682b
            if (r1 != 0) goto L_0x036d
            easypay.appinvoke.actions.GAEventManager r1 = r10.f38660a     // Catch:{ Exception -> 0x02a1 }
            if (r1 == 0) goto L_0x026d
            android.webkit.WebView r2 = r10.f38640a     // Catch:{ Exception -> 0x02a1 }
            if (r2 == 0) goto L_0x0225
            r1.mo38415c(r12)     // Catch:{ Exception -> 0x02a1 }
        L_0x0225:
            java.lang.Long r1 = r10.f38665a     // Catch:{ Exception -> 0x02a1 }
            if (r1 == 0) goto L_0x0256
            java.lang.Long r1 = r10.f38678b     // Catch:{ Exception -> 0x02a1 }
            if (r1 == 0) goto L_0x0256
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a1 }
            r0.<init>()     // Catch:{ Exception -> 0x02a1 }
            r0.append(r14)     // Catch:{ Exception -> 0x02a1 }
            java.lang.Long r1 = r10.f38665a     // Catch:{ Exception -> 0x02a1 }
            r0.append(r1)     // Catch:{ Exception -> 0x02a1 }
            r0.append(r14)     // Catch:{ Exception -> 0x02a1 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02a1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a1 }
            r1.<init>()     // Catch:{ Exception -> 0x02a1 }
            r1.append(r14)     // Catch:{ Exception -> 0x02a1 }
            java.lang.Long r2 = r10.f38678b     // Catch:{ Exception -> 0x02a1 }
            r1.append(r2)     // Catch:{ Exception -> 0x02a1 }
            r1.append(r14)     // Catch:{ Exception -> 0x02a1 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02a1 }
            goto L_0x0257
        L_0x0256:
            r1 = r0
        L_0x0257:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x02a1 }
            if (r2 != 0) goto L_0x026d
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x02a1 }
            if (r2 != 0) goto L_0x026d
            easypay.appinvoke.actions.GAEventManager r2 = r10.f38660a     // Catch:{ Exception -> 0x02a1 }
            r2.mo38403E(r0)     // Catch:{ Exception -> 0x02a1 }
            easypay.appinvoke.actions.GAEventManager r0 = r10.f38660a     // Catch:{ Exception -> 0x02a1 }
            r0.mo38435w(r1)     // Catch:{ Exception -> 0x02a1 }
        L_0x026d:
            com.onedelhi.secure.ho2 r0 = r10.f38654a     // Catch:{ Exception -> 0x02a1 }
            if (r0 != 0) goto L_0x0283
            com.onedelhi.secure.ho2 r0 = new com.onedelhi.secure.ho2     // Catch:{ Exception -> 0x02a1 }
            androidx.appcompat.app.AppCompatActivity r2 = r10.f38649a     // Catch:{ Exception -> 0x02a1 }
            easypay.appinvoke.manager.EasypayWebViewClient r6 = r10.f38662a     // Catch:{ Exception -> 0x02a1 }
            r1 = r0
            r3 = r24
            r4 = r23
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x02a1 }
        L_0x0280:
            r10.f38654a = r0     // Catch:{ Exception -> 0x02a1 }
            goto L_0x0298
        L_0x0283:
            boolean r0 = r0.f29695c     // Catch:{ Exception -> 0x02a1 }
            if (r0 == 0) goto L_0x0288
            return
        L_0x0288:
            com.onedelhi.secure.ho2 r0 = new com.onedelhi.secure.ho2     // Catch:{ Exception -> 0x02a1 }
            androidx.appcompat.app.AppCompatActivity r2 = r10.f38649a     // Catch:{ Exception -> 0x02a1 }
            easypay.appinvoke.manager.EasypayWebViewClient r6 = r10.f38662a     // Catch:{ Exception -> 0x02a1 }
            r1 = r0
            r3 = r24
            r4 = r23
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x02a1 }
            goto L_0x0280
        L_0x0298:
            easypay.appinvoke.actions.GAEventManager r0 = r10.f38660a     // Catch:{ Exception -> 0x02a1 }
            if (r0 == 0) goto L_0x036d
            r0.mo38424l(r12)     // Catch:{ Exception -> 0x02a1 }
            goto L_0x036d
        L_0x02a1:
            r0 = move-exception
            r0.printStackTrace()
            com.onedelhi.secure.C5706ib.m51978a(r13, r0)
            goto L_0x036d
        L_0x02aa:
            com.onedelhi.secure.cx2 r1 = r10.f38651a     // Catch:{ Exception -> 0x031a }
            if (r1 != 0) goto L_0x0319
            easypay.appinvoke.actions.GAEventManager r1 = r10.f38660a     // Catch:{ Exception -> 0x031a }
            if (r1 == 0) goto L_0x02fa
            java.lang.Long r1 = r10.f38665a     // Catch:{ Exception -> 0x031a }
            if (r1 == 0) goto L_0x02e3
            java.lang.Long r1 = r10.f38678b     // Catch:{ Exception -> 0x031a }
            if (r1 == 0) goto L_0x02e3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x031a }
            r0.<init>()     // Catch:{ Exception -> 0x031a }
            r0.append(r14)     // Catch:{ Exception -> 0x031a }
            java.lang.Long r1 = r10.f38665a     // Catch:{ Exception -> 0x031a }
            r0.append(r1)     // Catch:{ Exception -> 0x031a }
            r0.append(r14)     // Catch:{ Exception -> 0x031a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x031a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x031a }
            r1.<init>()     // Catch:{ Exception -> 0x031a }
            r1.append(r14)     // Catch:{ Exception -> 0x031a }
            java.lang.Long r2 = r10.f38678b     // Catch:{ Exception -> 0x031a }
            r1.append(r2)     // Catch:{ Exception -> 0x031a }
            r1.append(r14)     // Catch:{ Exception -> 0x031a }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x031a }
            goto L_0x02e4
        L_0x02e3:
            r1 = r0
        L_0x02e4:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x031a }
            if (r2 != 0) goto L_0x02fa
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x031a }
            if (r2 != 0) goto L_0x02fa
            easypay.appinvoke.actions.GAEventManager r2 = r10.f38660a     // Catch:{ Exception -> 0x031a }
            r2.mo38403E(r0)     // Catch:{ Exception -> 0x031a }
            easypay.appinvoke.actions.GAEventManager r0 = r10.f38660a     // Catch:{ Exception -> 0x031a }
            r0.mo38435w(r1)     // Catch:{ Exception -> 0x031a }
        L_0x02fa:
            com.onedelhi.secure.cx2 r0 = new com.onedelhi.secure.cx2     // Catch:{ Exception -> 0x031a }
            androidx.appcompat.app.AppCompatActivity r2 = r10.f38649a     // Catch:{ Exception -> 0x031a }
            easypay.appinvoke.manager.EasypayWebViewClient r15 = r10.f38662a     // Catch:{ Exception -> 0x031a }
            r1 = r0
            r3 = r24
            r4 = r23
            r5 = r9
            r6 = r18
            r7 = r17
            r8 = r19
            r20 = r14
            r14 = r9
            r9 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0317 }
            r10.f38651a = r0     // Catch:{ Exception -> 0x0317 }
            goto L_0x0370
        L_0x0317:
            r0 = move-exception
            goto L_0x031e
        L_0x0319:
            return
        L_0x031a:
            r0 = move-exception
            r20 = r14
            r14 = r9
        L_0x031e:
            r0.printStackTrace()
            com.onedelhi.secure.C5706ib.m51978a(r13, r0)
            goto L_0x0370
        L_0x0325:
            r20 = r14
            r14 = r9
            com.onedelhi.secure.kc0 r0 = new com.onedelhi.secure.kc0
            androidx.appcompat.app.AppCompatActivity r1 = r10.f38649a
            r0.<init>(r1, r11, r10, r14)
            r10.f38657a = r0
            goto L_0x0370
        L_0x0332:
            r20 = r14
            r14 = r9
            com.onedelhi.secure.le3 r0 = new com.onedelhi.secure.le3
            androidx.appcompat.app.AppCompatActivity r1 = r10.f38649a
            r0.<init>(r1, r11, r10, r14)
            r10.f38658a = r0
            goto L_0x0370
        L_0x033f:
            r20 = r14
            r14 = r9
            com.onedelhi.secure.iz2 r0 = new com.onedelhi.secure.iz2
            androidx.appcompat.app.AppCompatActivity r2 = r10.f38649a
            r1 = r0
            r3 = r24
            r4 = r23
            r5 = r14
            r1.<init>(r2, r3, r4, r5, r6)
            r10.f38655a = r0
            easypay.appinvoke.actions.GAEventManager r0 = r10.f38660a
            if (r0 == 0) goto L_0x0370
            r0.mo38424l(r12)
            goto L_0x0370
        L_0x0359:
            r20 = r14
            r14 = r9
            com.onedelhi.secure.j53 r0 = new com.onedelhi.secure.j53
            androidx.appcompat.app.AppCompatActivity r1 = r10.f38649a
            r0.<init>(r1, r11, r10, r14)
            r10.f38656a = r0
            easypay.appinvoke.actions.GAEventManager r0 = r10.f38660a
            if (r0 == 0) goto L_0x0370
            r0.mo38407I(r12)
            goto L_0x0370
        L_0x036d:
            r20 = r14
            r14 = r9
        L_0x0370:
            java.lang.String r0 = "nbotphelper"
            r15 = r26
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x03a9
            easypay.appinvoke.actions.GAEventManager r0 = r10.f38660a
            r9 = 1
            if (r0 == 0) goto L_0x0382
            r0.mo38401C(r9)
        L_0x0382:
            r2 = r20
            r1 = 3
            r10.mo48720w0(r2, r1)
            com.onedelhi.secure.cx2 r0 = r10.f38651a
            if (r0 != 0) goto L_0x03a8
            com.onedelhi.secure.cx2 r0 = new com.onedelhi.secure.cx2
            androidx.appcompat.app.AppCompatActivity r2 = r10.f38649a
            easypay.appinvoke.manager.EasypayWebViewClient r8 = r10.f38662a
            r1 = r0
            r3 = r24
            r4 = r23
            r5 = r14
            r6 = r18
            r7 = r17
            r14 = r8
            r8 = r19
            r17 = 1
            r9 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f38651a = r0
            goto L_0x03ab
        L_0x03a8:
            return
        L_0x03a9:
            r17 = 1
        L_0x03ab:
            r14 = 0
            r15 = 1
            goto L_0x003f
        L_0x03af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: easypay.appinvoke.actions.EasypayBrowserFragment.mo48697e0(android.webkit.WebView, java.lang.String, java.lang.String):void");
    }

    /* renamed from: f0 */
    public final void mo48698f0() {
        this.f38692f.setVisibility(0);
        this.f38690e.setVisibility(0);
    }

    /* renamed from: g0 */
    public final ArrayList<Map<String, String>> mo48699g0(String str) {
        ArrayList<Map<String, String>> arrayList = new ArrayList<>();
        try {
            this.f38693f = this.f38637a.getBoolean("enableEasyPay", false);
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e);
            return arrayList;
        }
    }

    /* renamed from: h0 */
    public vq2 mo48700h0() {
        return this.f38659a;
    }

    /* renamed from: i0 */
    public void mo48701i0() {
        this.f38643a.setVisibility(0);
        this.f38644a.setVisibility(0);
        this.f38687d.setVisibility(0);
        this.f38641a.setVisibility(0);
        this.f38673b.setVisibility(8);
        this.f38642a.setVisibility(8);
        this.f38689d = this.f38642a.isChecked();
        this.f38685c = this.f38672b.getText().toString();
        this.f38672b.setVisibility(8);
        this.f38675b.setVisibility(8);
    }

    /* renamed from: j0 */
    public void mo48702j0() {
        this.f38646a.setVisibility(0);
        this.f38643a.setVisibility(8);
        this.f38644a.setVisibility(8);
        this.f38687d.setVisibility(8);
        this.f38641a.setVisibility(8);
        this.f38673b.setVisibility(0);
        this.f38642a.setVisibility(0);
        mo48682I0(this.f38689d);
        this.f38672b.setVisibility(0);
        if (this.f38699k) {
            this.f38675b.setVisibility(0);
        } else {
            this.f38675b.setVisibility(8);
        }
    }

    /* renamed from: k0 */
    public final void mo48703k0() {
        this.f38646a = (LinearLayout) this.f38649a.findViewById(de3.C5007h.ll_nb_login);
        this.f38642a = (CheckBox) this.f38649a.findViewById(de3.C5007h.cb_nb_userId);
        this.f38643a = (EditText) this.f38649a.findViewById(de3.C5007h.et_nb_password);
        this.f38672b = (EditText) this.f38649a.findViewById(de3.C5007h.et_nb_userIdCustomerId);
        this.f38675b = (LinearLayout) this.f38649a.findViewById(de3.C5007h.ll_nb_user_id_Selector);
        this.f38647a = (RelativeLayout) this.f38649a.findViewById(de3.C5007h.parentPanel);
        this.f38641a = (Button) this.f38649a.findViewById(de3.C5007h.nb_bt_submit);
        this.f38648a = (TextView) this.f38649a.findViewById(de3.C5007h.tv_user_id_one);
        this.f38676b = (TextView) this.f38649a.findViewById(de3.C5007h.tv_user_id_two);
        this.f38684c = (TextView) this.f38649a.findViewById(de3.C5007h.tv_user_id_three);
        this.f38644a = (ImageButton) this.f38649a.findViewById(de3.C5007h.nb_image_bt_previous);
        this.f38673b = (ImageButton) this.f38649a.findViewById(de3.C5007h.nb_image_bt_next);
        this.f38687d = (TextView) this.f38649a.findViewById(de3.C5007h.img_pwd_show);
        this.f38666a = new StringBuilder();
        this.f38639a = new C7573c();
        TextView[] textViewArr = this.f38669a;
        textViewArr[0] = this.f38648a;
        textViewArr[1] = this.f38676b;
        textViewArr[2] = this.f38684c;
        this.f38643a.setText("");
        this.f38672b.setText("");
        this.f38642a.setOnCheckedChangeListener(this);
        this.f38642a.setButtonDrawable(de3.C5006g.ic_checkbox_selected);
        this.f38672b.addTextChangedListener(this.f38639a);
        Drawable drawable = this.f38649a.getBaseContext().getResources().getDrawable(de3.C5006g.ic_show_passcode);
        drawable.setBounds(0, 0, 24, 24);
        this.f38687d.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* renamed from: l0 */
    public final void mo48704l0() {
        this.f38674b = (ImageView) this.f38649a.findViewById(de3.C5007h.img_show_assist);
        this.f38694g = (TextView) this.f38649a.findViewById(de3.C5007h.tv_detection_status);
        this.f38645a = (ImageView) this.f38649a.findViewById(de3.C5007h.img_hide_assist);
        this.f38663a = (OtpEditText) this.f38649a.findViewById(de3.C5007h.edit_text_otp);
        this.f38690e = (TextView) this.f38649a.findViewById(de3.C5007h.tv_submit_otp_time);
        this.f38692f = (TextView) this.f38649a.findViewById(de3.C5007h.tv_tap_to_pause);
        this.f38671b = (Button) this.f38649a.findViewById(de3.C5007h.btn_submit_otp);
        this.f38650a = (ConstraintLayout) this.f38649a.findViewById(de3.C5007h.cl_show_assist);
        this.f38677b = (ConstraintLayout) this.f38649a.findViewById(de3.C5007h.cl_hide_assist);
        this.f38683c = (ImageView) this.f38649a.findViewById(de3.C5007h.img_paytm_assist_banner);
    }

    @JavascriptInterface
    public void logEvent(String str, String str2) {
        String str3 = str2 + db0.f27369e + str;
        int i = this.f38670b.getInt(str3, 0);
        SharedPreferences.Editor edit = this.f38670b.edit();
        edit.putInt(str3, i + 1);
        edit.apply();
    }

    @SuppressLint({"JavascriptInterface"})
    /* renamed from: m0 */
    public final void mo48706m0(String str, C5235fb fbVar) {
        this.f38681b = new HashMap<>();
        Iterator<C5983lb> it = fbVar.mo35831f().iterator();
        while (it.hasNext()) {
            C5983lb next = it.next();
            if (str.contains(next.mo39764b())) {
                GAEventManager gAEventManager = this.f38660a;
                if (gAEventManager != null) {
                    gAEventManager.mo38415c(str);
                }
                ArrayList<ew2> a = next.mo39763a();
                if (a != null && !a.isEmpty()) {
                    Iterator<ew2> it2 = a.iterator();
                    while (it2.hasNext()) {
                        ew2 next2 = it2.next();
                        this.f38681b.put(next2.mo35649b(), next2);
                    }
                    if (this.f38681b.size() > 0) {
                        this.f38652a.mo34518z(this.f38681b, this.f38653a);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: n0 */
    public final void mo48707n0() {
        try {
            ArrayList<Map<String, String>> y0 = mo48722y0(Constants.EASY_PAY_CONFIG_PREF_KEY);
            if (y0 != null && y0.get(0) != null && y0.get(0).get("ttl") != null) {
                long parseLong = Long.parseLong((String) y0.get(0).get("ttl"));
                SharedPreferences.Editor edit = this.f38649a.getSharedPreferences("com.paytm.com.paytm.pgsdk.easypay.appinvoke.PREFERENCE_FILE_KEY", 0).edit();
                this.f38636a = edit;
                edit.putLong("easypay_configuration_ttl", parseLong);
                this.f38636a.apply();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: o0 */
    public final void mo48708o0() {
        try {
            C5235fb fbVar = (C5235fb) new fj1().mo36012n(this.f38649a.getSharedPreferences(Constants.EASYPAY_NEW_PREFERENCE_FILE, 0).getString(Constants.EASY_PAY_CONFIG_PREF_KEY, ""), C5235fb.class);
            this.f38653a = fbVar;
            if (fbVar != null) {
                Iterator<C5983lb> it = fbVar.mo35831f().iterator();
                while (it.hasNext()) {
                    if (mo48695c0(it.next().mo39764b(), this.f38640a.getUrl())) {
                        WebView webView = this.f38640a;
                        mo48693a0(webView, webView.getUrl());
                        return;
                    }
                }
            }
        } catch (Exception e) {
            C5706ib.m51978a("EXCEPTION", e);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    @TargetApi(21)
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        try {
            this.f38649a = (AppCompatActivity) getActivity();
            this.f38662a = PaytmAssist.getAssistInstance().getWebClientInstance();
            mo48674A0(getArguments());
            this.f38680b.append(to1.f35743f);
            mo48704l0();
            this.f38660a = PaytmAssist.getAssistInstance().getmAnalyticsManager();
            PaytmAssist.getAssistInstance().setFragmentResumed(false);
            PaytmAssist.getAssistInstance().setFragmentPaused(false);
            mo48703k0();
            WebView webView = this.f38640a;
            if (webView != null) {
                webView.getSettings().setDomStorageEnabled(true);
                this.f38640a.getSettings().setJavaScriptEnabled(true);
                this.f38640a.getSettings().setMixedContentMode(0);
                WebView.setWebContentsDebuggingEnabled(true);
                this.f38661a = PaytmAssist.getAssistInstance().getEasyPayHelper();
            }
            EasypayWebViewClient easypayWebViewClient = this.f38662a;
            if (easypayWebViewClient != null) {
                easypayWebViewClient.addAssistWebClientListener(this);
            }
            this.f38652a = new dn2((HashMap<String, ew2>) null, this.f38640a, this.f38649a, (C5235fb) null);
            mo48711p0();
            IntentFilter intentFilter = new IntentFilter(Constants.EASYPAY_ACTION_OLD_FILE_DOWNLOADED);
            intentFilter.addAction(Constants.EASYPAY_ACTION_FILE_DOWNLOADED);
            try {
                this.f38649a.registerReceiver(this.f38635a, intentFilter);
            } catch (Exception e) {
                e.printStackTrace();
                C5706ib.m51978a("EXCEPTION", e);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e2);
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String str;
        Map<String, Object> map;
        CheckBox checkBox;
        this.f38689d = z;
        if (!z || (checkBox = this.f38642a) == null) {
            CheckBox checkBox2 = this.f38642a;
            if (checkBox2 != null) {
                checkBox2.setButtonDrawable(de3.C5006g.ic_checkbox_unselected);
                this.f38696h = false;
            }
            map = PaytmAssist.getAssistInstance().getmEventMap();
            str = "UnChecked";
        } else {
            checkBox.setButtonDrawable(de3.C5006g.ic_checkbox_selected);
            this.f38696h = true;
            SharedPreferences.Editor edit = this.f38649a.getSharedPreferences(Constants.BANKPREF, 0).edit();
            this.f38636a = edit;
            edit.putString(Constants.USER_ID_NET_BANK_KEY, "abcd");
            this.f38636a.apply();
            map = PaytmAssist.getAssistInstance().getmEventMap();
            str = "Checked";
        }
        map.put("rememberUserId", str);
    }

    @TargetApi(19)
    public void onClick(View view) {
        dn2 dn2;
        String str;
        ImageView imageView;
        try {
            if (view.getId() == de3.C5007h.img_hide_assist) {
                mo48714s0();
            } else if (view.getId() == de3.C5007h.img_show_assist) {
                mo48684K0();
            } else {
                if (view.getId() == de3.C5007h.img_paytm_assist_banner) {
                    imageView = this.f38674b;
                } else if (view.getId() == de3.C5007h.tv_detection_status) {
                    imageView = this.f38645a;
                } else {
                    boolean z = false;
                    if (view.getId() == de3.C5007h.tv_user_id_one) {
                        this.f38652a.mo34509B(this.f38648a.getText().toString());
                        mo48678E0(this.f38648a.getText().toString());
                        str = this.f38688d;
                    } else if (view.getId() == de3.C5007h.tv_user_id_two) {
                        this.f38652a.mo34509B(this.f38676b.getText().toString());
                        mo48678E0(this.f38676b.getText().toString());
                        str = this.f38688d;
                    } else if (view.getId() == de3.C5007h.tv_user_id_three) {
                        this.f38652a.mo34509B(this.f38684c.getText().toString());
                        mo48678E0(this.f38684c.getText().toString());
                        return;
                    } else if (view.getId() == de3.C5007h.nb_bt_submit) {
                        if (!this.f38698j || (dn2 = this.f38652a) == null) {
                            this.f38643a.setText("");
                            return;
                        }
                        dn2.mo34514u(Constants.SUBMIT_BTN, this.f38681b.get(Constants.SUBMIT_BTN));
                        GAEventManager gAEventManager = this.f38660a;
                        if (gAEventManager != null) {
                            gAEventManager.mo38409K(this.f38689d);
                            GAEventManager gAEventManager2 = this.f38660a;
                            if (!this.f38697i) {
                                z = true;
                            }
                            gAEventManager2.mo38412N(z);
                            this.f38660a.mo38399A(true);
                            return;
                        }
                        return;
                    } else if (view.getId() == de3.C5007h.nb_image_bt_next) {
                        this.f38652a.mo34514u(Constants.NEXT_BTN, this.f38681b.get(Constants.NEXT_BTN));
                        return;
                    } else if (view.getId() == de3.C5007h.nb_image_bt_previous) {
                        this.f38652a.mo34514u(Constants.PREVIOUS_BTN, this.f38681b.get(Constants.PREVIOUS_BTN));
                        return;
                    } else if (view.getId() == de3.C5007h.tv_tap_to_pause) {
                        try {
                            PaytmAssist.getAssistInstance().getmEventMap().put("pauseBtnClicked", Boolean.TRUE);
                            GAEventManager gAEventManager3 = this.f38660a;
                            if (gAEventManager3 != null) {
                                gAEventManager3.mo38411M(true);
                            }
                            CountDownTimer countDownTimer = this.f38638a;
                            if (countDownTimer != null) {
                                countDownTimer.cancel();
                            }
                            mo48719v0();
                            return;
                        } catch (Exception e) {
                            e.printStackTrace();
                            C5706ib.m51978a("EXCEPTION", e);
                            return;
                        }
                    } else if (view.getId() == de3.C5007h.btn_submit_otp) {
                        GAEventManager gAEventManager4 = this.f38660a;
                        if (gAEventManager4 != null) {
                            gAEventManager4.mo38436x(true, 1);
                            this.f38660a.mo38434v(false);
                        }
                        CountDownTimer countDownTimer2 = this.f38638a;
                        if (countDownTimer2 != null) {
                            countDownTimer2.cancel();
                        }
                        mo48685L0();
                        return;
                    } else if (view.getId() == de3.C5007h.img_pwd_show) {
                        try {
                            PaytmAssist.getAssistInstance().getmEventMap().put("showPasswordClicked", Boolean.valueOf(this.f38697i));
                            if (this.f38697i) {
                                Drawable drawable = this.f38649a.getBaseContext().getResources().getDrawable(de3.C5006g.ic_hide_passcode);
                                drawable.setBounds(0, 0, 24, 24);
                                this.f38687d.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                                this.f38687d.setText(getString(de3.C5011l.hide));
                                this.f38643a.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                                this.f38697i = false;
                                return;
                            }
                            Drawable drawable2 = this.f38649a.getBaseContext().getResources().getDrawable(de3.C5006g.ic_show_passcode);
                            drawable2.setBounds(0, 0, 24, 24);
                            this.f38687d.setCompoundDrawables(drawable2, (Drawable) null, (Drawable) null, (Drawable) null);
                            this.f38687d.setText(getString(de3.C5011l.show));
                            this.f38643a.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            EditText editText = this.f38643a;
                            editText.setSelection(editText.getText().length());
                            this.f38697i = true;
                            return;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                    } else {
                        return;
                    }
                    mo48687N0(false, str);
                    return;
                }
                imageView.performClick();
            }
        } catch (NullPointerException e3) {
            e3.printStackTrace();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(de3.C5010k.easypay_browser_frag_revamp, viewGroup, false);
    }

    public void onDestroy() {
        EditText editText = this.f38672b;
        if (editText != null) {
            editText.removeTextChangedListener(this.f38639a);
        }
        super.onDestroy();
    }

    public void onDestroyView() {
        Exception exc;
        BroadcastReceiver broadcastReceiver;
        super.onDestroyView();
        try {
            if (this.f38665a != null && this.f38678b != null) {
                String str = "" + this.f38665a + "";
                String str2 = "" + this.f38678b + "";
                C5706ib.m51978a(str + str2 + " Check", this);
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    this.f38660a.mo38403E(str);
                    this.f38660a.mo38435w(str2);
                    this.f38660a.mo38422j(PaytmAssist.getAssistInstance().getmEventMap());
                }
            } else if (!TextUtils.isEmpty("time not captured") && !TextUtils.isEmpty("time not captured")) {
                this.f38660a.mo38403E("time not captured");
                this.f38660a.mo38435w("time not captured");
            }
            GAEventManager gAEventManager = this.f38660a;
            if (gAEventManager != null) {
                gAEventManager.mo38414b(this.f38680b);
                if (this.f38660a.mo48735O() != null) {
                    Intent intent = new Intent(this.f38649a, AnalyticsService.class);
                    intent.putExtra(C4311b.C4317f.C4318a.f25149a, this.f38660a.mo48735O());
                    AnalyticsService.m74627l(this.f38649a.getBaseContext(), intent);
                }
            }
            iz2 iz2 = this.f38655a;
            if (iz2 != null) {
                iz2.mo38309n();
            }
            AppCompatActivity appCompatActivity = this.f38649a;
            if (!(appCompatActivity == null || (broadcastReceiver = this.f38635a) == null)) {
                appCompatActivity.unregisterReceiver(broadcastReceiver);
            }
            AppCompatActivity appCompatActivity2 = this.f38649a;
            if (appCompatActivity2 != null) {
                cx2 cx2 = this.f38651a;
                if (cx2 != null) {
                    BroadcastReceiver broadcastReceiver2 = cx2.f27100b;
                    if (broadcastReceiver2 != null) {
                        appCompatActivity2.unregisterReceiver(broadcastReceiver2);
                    }
                    BroadcastReceiver broadcastReceiver3 = this.f38651a.f27089a;
                    if (broadcastReceiver3 != null) {
                        this.f38649a.unregisterReceiver(broadcastReceiver3);
                    }
                    cx2 cx22 = this.f38651a;
                    EasypayWebViewClient easypayWebViewClient = cx22.f27096a;
                    if (easypayWebViewClient != null) {
                        easypayWebViewClient.removeAssistWebClientListener(cx22);
                    }
                }
                vq2 vq2 = this.f38659a;
                if (vq2 != null) {
                    vq2.mo46293O();
                }
            }
            PaytmAssist.getAssistInstance().setFragmentResumed(false);
            PaytmAssist.getAssistInstance().setFragmentPaused(false);
        } catch (NullPointerException e) {
            e.printStackTrace();
            exc = e;
            C5706ib.m51978a("EXCEPTION", exc);
        } catch (Exception e2) {
            e2.printStackTrace();
            exc = e2;
            C5706ib.m51978a("EXCEPTION", exc);
        }
    }

    public void onPause() {
        super.onPause();
        PaytmAssist.getAssistInstance().setFragmentResumed(false);
        PaytmAssist.getAssistInstance().setFragmentPaused(true);
    }

    public void onResume() {
        super.onResume();
        PaytmAssist.getAssistInstance().setFragmentResumed(true);
        PaytmAssist.getAssistInstance().setFragmentPaused(false);
    }

    public void onStop() {
        super.onStop();
        CountDownTimer countDownTimer = this.f38638a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        mo48719v0();
    }

    /* renamed from: p0 */
    public final void mo48711p0() {
        AppCompatActivity appCompatActivity = this.f38649a;
        if (appCompatActivity != null) {
            this.f38637a = appCompatActivity.getSharedPreferences("com.paytm.com.paytm.pgsdk.easypay.appinvoke.PREFERENCE_FILE_KEY", 0);
            this.f38670b = this.f38649a.getSharedPreferences("com.paytm.com.paytm.pgsdk.easypay.appinvoke.EVENTS_FILE", 0);
            mo48692Z();
            Arrays.sort("kokookokok".toCharArray());
        }
    }

    /* renamed from: q0 */
    public void mo48712q0() {
        ImageView imageView = this.f38674b;
        if (imageView != null && imageView.getVisibility() == 0) {
            mo48684K0();
        }
    }

    /* renamed from: r0 */
    public void mo48713r0() {
        ImageView imageView = this.f38645a;
        if (imageView != null && imageView.getVisibility() == 0) {
            mo48714s0();
        }
    }

    /* renamed from: s0 */
    public final void mo48714s0() {
        AppCompatActivity appCompatActivity = this.f38649a;
        if (appCompatActivity != null) {
            appCompatActivity.runOnUiThread(new C7575e());
        }
    }

    @JavascriptInterface
    public void sendBnkDtlToApp(String str) {
        HashMap hashMap = (HashMap) new fj1().mo36013o(str, new C7577g().getType());
        Intent intent = new Intent(this.f38649a, EasyPayConfigDownloader.class);
        intent.putExtra(Constants.EXTRA_BANK_REQ_JSON, str);
        EasyPayConfigDownloader.m74629n(this.f38649a.getBaseContext(), intent);
        PaytmAssist.getAssistInstance().setTxnBank(hashMap.get(Constants.EXTRA_BANK_CODE).toString());
        PaytmAssist.getAssistInstance().setTxnPayType(hashMap.get(Constants.EXTRA_BANK_PAYTYPE).toString().toLowerCase());
        String lowerCase = (hashMap.get(Constants.EXTRA_BANK_CODE) + "-" + hashMap.get(Constants.EXTRA_BANK_PAYTYPE)).toLowerCase();
        GAEventManager gAEventManager = this.f38660a;
        if (gAEventManager != null) {
            gAEventManager.mo38433u(lowerCase);
            this.f38660a.mo38420h(lowerCase);
            if (lowerCase.contains("atm") || lowerCase.contains("idebit") || lowerCase.contains(Constants.EASYPAY_PAYTYPE_ATM) || lowerCase.contains("Idebit")) {
                this.f38660a.mo38428p(true);
            }
        }
    }

    @JavascriptInterface
    public void sendEvent(String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction("com.paytm.com.paytm.pgsdk.easypay.appinvoke.CUSTOM_EVENT");
        intent.putExtra("eventName", str);
        intent.putExtra("data0", str2);
        intent.putExtra("data1", str3);
        this.f38649a.sendBroadcast(intent);
    }

    @JavascriptInterface
    public void showLog(String str) {
        if (str.equals("not found -Net Banking js Injection")) {
            mo48720w0("", 0);
        } else if (str.equals("not found - 0") && !TextUtils.isEmpty(PaytmAssist.getAssistInstance().getLastLoadedUrl())) {
            mo48697e0(this.f38640a, PaytmAssist.getAssistInstance().getLastLoadedUrl(), "");
        }
    }

    /* renamed from: t */
    public void mo33964t(WebView webView, String str) {
        this.f38678b = Long.valueOf(System.currentTimeMillis());
        StringBuilder sb = this.f38680b;
        if (sb != null) {
            sb.append(str);
            this.f38680b.append(to1.f35743f);
        }
        mo48708o0();
    }

    /* renamed from: u0 */
    public void mo48718u0(int i, Object obj) {
        if (isAdded() && i == 155) {
            this.f38659a = new vq2(this.f38649a, this.f38640a, PaytmAssist.getAssistInstance().getFragment(), this.f38662a);
            if (this.f38681b.size() > 0) {
                this.f38659a.mo46287G(this.f38681b);
                C5706ib.m51978a("NB OTP Flow Started" + obj, this);
                this.f38661a.successEvent(107, "");
            }
        }
    }

    /* renamed from: v */
    public void mo33966v(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    /* renamed from: v0 */
    public void mo48719v0() {
        this.f38692f.setVisibility(8);
        this.f38690e.setVisibility(8);
    }

    /* renamed from: w0 */
    public void mo48720w0(String str, int i) {
        this.f38649a.runOnUiThread(new C7580j(i, str));
    }

    /* renamed from: x0 */
    public final ArrayList<Map<String, String>> mo48721x0(JsonReader jsonReader) throws IOException {
        ArrayList<Map<String, String>> arrayList = new ArrayList<>();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(mo48723z0(jsonReader));
        }
        return arrayList;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: y0 */
    public final ArrayList<Map<String, String>> mo48722y0(String str) throws Exception {
        try {
            File fileStreamPath = this.f38649a.getFileStreamPath("easypay_configuration.json");
            if (fileStreamPath != null && fileStreamPath.exists()) {
                this.f38664a = this.f38649a.getApplicationContext().openFileInput("easypay_configuration.json");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        JsonReader jsonReader = new JsonReader(new InputStreamReader(this.f38664a, StandardCharsets.UTF_8));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals(str)) {
                    ArrayList<Map<String, String>> x0 = mo48721x0(jsonReader);
                    jsonReader.close();
                    return x0;
                }
                jsonReader.skipValue();
            }
            jsonReader.endObject();
            ArrayList<Map<String, String>> x02 = mo48721x0(jsonReader);
            jsonReader.close();
            return x02;
        } catch (Exception e2) {
            e2.printStackTrace();
            jsonReader.close();
            return null;
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    /* renamed from: z0 */
    public final Map<String, String> mo48723z0(JsonReader jsonReader) throws IOException {
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            hashMap.put(jsonReader.nextName(), jsonReader.nextString());
        }
        jsonReader.endObject();
        return hashMap;
    }
}
