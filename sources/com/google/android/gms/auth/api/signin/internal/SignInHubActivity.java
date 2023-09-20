package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.onedelhi.secure.ai1;
import com.onedelhi.secure.f95;
import com.onedelhi.secure.h95;
import com.onedelhi.secure.k85;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.vh1;
import easypay.appinvoke.manager.Constants;
import java.util.Objects;

@KeepName
public class SignInHubActivity extends FragmentActivity {

    /* renamed from: g */
    public static boolean f7336g = false;

    /* renamed from: a */
    public Intent f7337a;

    /* renamed from: a */
    public SignInConfiguration f7338a;

    /* renamed from: e */
    public boolean f7339e = false;

    /* renamed from: f */
    public boolean f7340f;

    /* renamed from: o */
    public int f7341o;

    /* renamed from: O0 */
    public final void mo9252O0() {
        mo4465w0().mo18151g(0, (Bundle) null, new h95(this, (f95) null));
        f7336g = false;
    }

    /* renamed from: P0 */
    public final void mo9253P0(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f7336g = false;
    }

    /* renamed from: Q0 */
    public final void mo9254Q0(String str) {
        Intent intent = new Intent(str);
        intent.setPackage(str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") ? "com.google.android.gms" : getPackageName());
        intent.putExtra(Constants.EASY_PAY_CONFIG_PREF_KEY, this.f7338a);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f7339e = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            mo9253P0(17);
        }
    }

    public final boolean dispatchPopulateAccessibilityEvent(@mr2 AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void onActivityResult(int i, int i2, @ts2 Intent intent) {
        if (!this.f7339e) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(vh1.f21791a);
                    if (signInAccount != null && signInAccount.mo9246K2() != null) {
                        GoogleSignInAccount K2 = signInAccount.mo9246K2();
                        k85 c = k85.m19555c(this);
                        GoogleSignInOptions K22 = this.f7338a.mo9248K2();
                        Objects.requireNonNull(K2);
                        c.mo18959e(K22, K2);
                        intent.removeExtra(vh1.f21791a);
                        intent.putExtra("googleSignInAccount", K2);
                        this.f7340f = true;
                        this.f7341o = i2;
                        this.f7337a = intent;
                        mo9252O0();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = ai1.f9068b;
                        }
                        mo9253P0(intExtra);
                        return;
                    }
                }
                mo9253P0(8);
            }
        }
    }

    public final void onCreate(@ts2 Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        Objects.requireNonNull(action);
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            mo9253P0(ai1.f9067a);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle bundleExtra = intent.getBundleExtra(Constants.EASY_PAY_CONFIG_PREF_KEY);
            Objects.requireNonNull(bundleExtra);
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable(Constants.EASY_PAY_CONFIG_PREF_KEY);
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.f7338a = signInConfiguration;
            if (bundle != null) {
                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                this.f7340f = z;
                if (z) {
                    this.f7341o = bundle.getInt("signInResultCode");
                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                    Objects.requireNonNull(intent2);
                    this.f7337a = intent2;
                    mo9252O0();
                }
            } else if (f7336g) {
                setResult(0);
                mo9253P0(ai1.f9069c);
            } else {
                f7336g = true;
                mo9254Q0(action);
            }
        } else {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        f7336g = false;
    }

    public final void onSaveInstanceState(@mr2 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f7340f);
        if (this.f7340f) {
            bundle.putInt("signInResultCode", this.f7341o);
            bundle.putParcelable("signInResultData", this.f7337a);
        }
    }
}
