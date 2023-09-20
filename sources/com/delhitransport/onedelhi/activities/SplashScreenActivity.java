package com.delhitransport.onedelhi.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.widget.Toast;
import androidx.lifecycle.C0709m;
import com.delhitransport.onedelhi.models.ConnectionModel;
import com.delhitransport.onedelhi.ticket.InitUser;
import com.delhitransport.onedelhi.ticket.InitUserRequest;
import com.delhitransport.onedelhi.viewmodels.TicketModel;
import com.google.android.gms.common.C1410R;
import com.onedelhi.secure.c41;
import com.onedelhi.secure.n61;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.s41;
import com.onedelhi.secure.t14;
import com.onedelhi.secure.t50;
import com.onedelhi.secure.t61;
import com.onedelhi.secure.u14;
import com.onedelhi.secure.v14;
import com.onedelhi.secure.w14;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;

public class SplashScreenActivity extends BaseActivity {

    /* renamed from: i */
    public static final /* synthetic */ boolean f6878i = false;

    /* renamed from: a */
    public Intent f6879a = null;

    /* renamed from: a */
    public SharedPreferences.Editor f6880a;

    /* renamed from: a */
    public SharedPreferences f6881a;

    /* renamed from: a */
    public Bundle f6882a = new Bundle();

    /* renamed from: a */
    public n61 f6883a;

    /* renamed from: a */
    public Boolean f6884a = Boolean.TRUE;

    /* renamed from: b */
    public Boolean f6885b = Boolean.FALSE;

    /* renamed from: e */
    public String f6886e;

    /* renamed from: e */
    public boolean f6887e = false;

    /* renamed from: f */
    public String f6888f;

    /* renamed from: f */
    public boolean f6889f = false;

    /* renamed from: g */
    public String f6890g;

    /* renamed from: g */
    public boolean f6891g;

    /* renamed from: h */
    public String f6892h;

    /* renamed from: h */
    public boolean f6893h;

    /* renamed from: i */
    public String f6894i;

    /* renamed from: j */
    public String f6895j;

    /* renamed from: k */
    public String f6896k = pj0.m61166a(-69276834830151L);

    /* renamed from: l */
    public String f6897l;

    /* renamed from: m */
    public String f6898m = pj0.m61166a(-69281129797447L);

    /* renamed from: o */
    public int f6899o;

    /* renamed from: p */
    public int f6900p;

    /* renamed from: q */
    public int f6901q;

    /* renamed from: r */
    public int f6902r;

    /* renamed from: s */
    public int f6903s;

    /* renamed from: t */
    public int f6904t;

    /* renamed from: u */
    public int f6905u = -1;

    /* renamed from: v */
    public int f6906v;

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public /* synthetic */ void m8365n1(ConnectionModel connectionModel) {
        if (connectionModel == null) {
            return;
        }
        if (connectionModel.getIsConnected()) {
            int type = connectionModel.getType();
            if (type == 0 || type == 1) {
                this.f6884a = Boolean.TRUE;
                mo7853r1(true);
                return;
            }
            return;
        }
        this.f6884a = Boolean.FALSE;
        mo7853r1(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public /* synthetic */ void m8366o1(InitUser initUser) {
        if (initUser != null) {
            String message = initUser.getMessage();
            c41.m40702d().mo32240f(message);
            int parseInt = Integer.parseInt(initUser.getCurrent_app_version());
            this.f6891g = initUser.getFeatures().getTicketing().getStatus().booleanValue();
            this.f6893h = initUser.getFeatures().getDailypass().getStatus().booleanValue();
            this.f6888f = initUser.getFeatures().getTicketing().getMessage();
            if (message.equalsIgnoreCase(pj0.m61166a(-71231044949831L))) {
                this.f6887e = true;
                if (this.f6881a.getString(pj0.m61166a(-71265404688199L), pj0.m61166a(-71308354361159L)).equalsIgnoreCase(pj0.m61166a(-71312649328455L))) {
                    this.f6880a.putString(pj0.m61166a(-71316944295751L), this.f6886e);
                }
                this.f6880a.putBoolean(pj0.m61166a(-71359893968711L), this.f6891g);
                this.f6880a.putBoolean(pj0.m61166a(-71415728543559L), this.f6893h);
                this.f6880a.putString(pj0.m61166a(-71488742987591L), this.f6888f);
                this.f6880a.putString(pj0.m61166a(-71535987627847L), this.f6896k);
                this.f6880a.apply();
                if (parseInt > this.f6905u) {
                    this.f6882a.putBoolean(pj0.m61166a(-71583232268103L), true);
                    Toast.makeText(this, pj0.m61166a(-71639066842951L), 0).show();
                } else {
                    this.f6882a.putBoolean(pj0.m61166a(-71780800763719L), false);
                }
                if (Integer.parseInt(initUser.getCurrent_db_version()) != this.f6900p) {
                    this.f6880a.putInt(pj0.m61166a(-71836635338567L), Integer.parseInt(initUser.getCurrent_db_version()));
                    this.f6880a.apply();
                }
                if (Integer.parseInt(initUser.getCurrent_db_version()) != this.f6901q) {
                    this.f6880a.putInt(pj0.m61166a(-71922534684487L), Integer.parseInt(initUser.getCurrent_db_version()));
                    this.f6880a.apply();
                }
                if (Integer.parseInt(initUser.getCurrent_db_version()) != this.f6902r) {
                    this.f6880a.putInt(pj0.m61166a(-72012728997703L), Integer.parseInt(initUser.getCurrent_db_version()));
                    this.f6880a.apply();
                }
                if (Integer.parseInt(initUser.getCurrent_db_version()) != this.f6904t) {
                    this.f6880a.putInt(pj0.m61166a(-72090038409031L), Integer.parseInt(initUser.getCurrent_db_version()));
                    this.f6880a.apply();
                }
                if (Integer.parseInt(initUser.getCurrent_db_version()) != this.f6903s) {
                    this.f6880a.putInt(pj0.m61166a(-72180232722247L), Integer.parseInt(initUser.getCurrent_db_version()));
                    this.f6880a.apply();
                }
                this.f6879a = this.f6884a.booleanValue() ? new Intent(this, OTPActivity.class) : new Intent(this, NoInternetActivity.class);
                try {
                    throw new RuntimeException(pj0.m61166a(-72279016970055L));
                } catch (Exception e) {
                    c41.m40702d().mo32241g(e);
                    this.f6882a.putBoolean(pj0.m61166a(-72334851544903L), this.f6891g);
                    this.f6882a.putBoolean(pj0.m61166a(-72390686119751L), this.f6889f);
                    this.f6882a.putString(pj0.m61166a(-72420750890823L), this.f6898m);
                    this.f6879a.putExtras(this.f6882a);
                    if (this.f6885b.booleanValue()) {
                        startActivity(this.f6879a);
                        finish();
                    }
                }
            } else {
                this.f6887e = false;
                s41.m27243a(pj0.m61166a(-72463700563783L));
                Toast.makeText(this, getResources().getString(C1410R.string.some_error_occurred), 0).show();
            }
        } else {
            this.f6887e = false;
            Toast.makeText(this, getResources().getString(C1410R.string.some_error_occurred), 0).show();
            s41.m27243a(pj0.m61166a(-72605434484551L));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public /* synthetic */ void m8367p1(Boolean bool) {
        long j;
        String str;
        String x = this.f6883a.mo40983x(pj0.m61166a(-72661269059399L));
        String x2 = this.f6883a.mo40983x(pj0.m61166a(-72738578470727L));
        boolean q = this.f6883a.mo40978q(pj0.m61166a(-72768643241799L));
        boolean q2 = this.f6883a.mo40978q(pj0.m61166a(-72858837555015L));
        this.f6880a.putString(pj0.m61166a(-72996276508487L), this.f6883a.mo40983x(pj0.m61166a(-72974801672007L)));
        this.f6880a.putString(pj0.m61166a(-73039226181447L), x);
        this.f6880a.putString(pj0.m61166a(-73116535592775L), x2);
        this.f6880a.putBoolean(pj0.m61166a(-73146600363847L), q);
        if (this.f6895j.equalsIgnoreCase(pj0.m61166a(-73215319840583L))) {
            SharedPreferences.Editor editor = this.f6880a;
            if (q2) {
                str = pj0.m61166a(-73262564480839L);
                j = -73322694022983L;
            } else {
                str = pj0.m61166a(-73352758794055L);
                j = -73412888336199L;
            }
            editor.putString(str, pj0.m61166a(j));
        }
        this.f6880a.apply();
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public /* synthetic */ void m8368q1() {
        this.f6885b = Boolean.TRUE;
        Intent intent = this.f6879a;
        if (intent != null) {
            startActivity(intent);
            finish();
        }
    }

    /* renamed from: j1 */
    public final void mo7849j1() {
        new t50(getApplicationContext()).mo4926j(this, new t14(this));
    }

    /* renamed from: k1 */
    public final void mo7850k1(String str) {
        File file = new File(pj0.m61166a(-71170915407687L) + getPackageName() + pj0.m61166a(-71222455015239L) + str);
        if (file.isDirectory()) {
            for (String file2 : file.list()) {
                try {
                    new File(file, file2).delete();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: l1 */
    public final String mo7851l1() {
        Calendar instance = Calendar.getInstance();
        return instance.getTimeInMillis() + pj0.m61166a(-70664109266759L) + this.f6886e;
    }

    @SuppressLint({"HardwareIds"})
    /* renamed from: m1 */
    public final void mo7852m1() {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        String str4 = Build.VERSION.RELEASE;
        int i = Build.VERSION.SDK_INT;
        String a = pj0.m61166a(-70672699201351L);
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            a = packageInfo.versionName;
            this.f6905u = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        String str5 = a;
        if (this.f6899o != this.f6905u) {
            this.f6880a.putInt(pj0.m61166a(-70676994168647L), this.f6905u);
            this.f6880a.putBoolean(pj0.m61166a(-70728533776199L), true);
            boolean commit = this.f6880a.commit();
            for (int i2 = 10; i2 > 0 && !commit; i2--) {
                commit = this.f6880a.commit();
            }
        }
        String string = Settings.Secure.getString(getContentResolver(), pj0.m61166a(-70767188481863L));
        String a2 = pj0.m61166a(-70814433122119L);
        try {
            MessageDigest instance = MessageDigest.getInstance(pj0.m61166a(-70818728089415L));
            instance.update(string.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString(b & 255));
            }
            a2 = sb.toString();
            this.f6886e = a2;
            this.f6896k = mo7851l1();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
        }
        ((TicketModel) new C0709m(this).mo5027a(TicketModel.class)).inituser(new InitUserRequest(str4, String.valueOf(i), str2, str, str3, pj0.m61166a(-70835907958599L), str5, String.valueOf(this.f6905u), a2, pj0.m61166a(-70840202925895L), this.f6892h, this.f6890g, this.f6894i, this.f6906v)).mo4926j(this, new u14(this));
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onCreate(Bundle bundle) {
        String str;
        c41 c41;
        super.onCreate(bundle);
        setRequestedOrientation(1);
        SharedPreferences sharedPreferences = getBaseContext().getSharedPreferences(pj0.m61166a(-69285424764743L), 0);
        this.f6881a = sharedPreferences;
        this.f6899o = sharedPreferences.getInt(pj0.m61166a(-69371324110663L), 0);
        this.f6895j = this.f6881a.getString(pj0.m61166a(-69422863718215L), pj0.m61166a(-69452928489287L));
        this.f6890g = this.f6881a.getString(pj0.m61166a(-69457223456583L), pj0.m61166a(-69478698293063L));
        this.f6892h = this.f6881a.getString(pj0.m61166a(-69482993260359L), pj0.m61166a(-69508763064135L));
        this.f6906v = this.f6881a.getInt(pj0.m61166a(-69513058031431L), -1);
        this.f6894i = this.f6881a.getString(pj0.m61166a(-69530237900615L), pj0.m61166a(-69560302671687L));
        this.f6900p = this.f6881a.getInt(pj0.m61166a(-69564597638983L), 0);
        this.f6901q = this.f6881a.getInt(pj0.m61166a(-69620432213831L), 0);
        this.f6902r = this.f6881a.getInt(pj0.m61166a(-69680561755975L), 0);
        this.f6903s = this.f6881a.getInt(pj0.m61166a(-69727806396231L), 0);
        this.f6904t = this.f6881a.getInt(pj0.m61166a(-69796525872967L), 0);
        this.f6897l = this.f6881a.getString(pj0.m61166a(-69856655415111L), pj0.m61166a(-69886720186183L));
        c41.m40702d();
        if (!this.f6894i.isEmpty()) {
            c41 = c41.m40702d();
            str = this.f6894i;
        } else {
            c41 = c41.m40702d();
            str = this.f6886e;
        }
        c41.mo32252r(str);
        try {
            this.f6898m = getIntent().getExtras().getString(pj0.m61166a(-69891015153479L), pj0.m61166a(-69933964826439L));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f6880a = this.f6881a.edit();
        if (this.f6899o < this.f6881a.getInt(pj0.m61166a(-69938259793735L), 0)) {
            mo7850k1(pj0.m61166a(-69998389335879L));
            this.f6880a.putInt(pj0.m61166a(-70041339008839L), -1);
            this.f6880a.putInt(pj0.m61166a(-70097173583687L), -1);
            this.f6880a.putInt(pj0.m61166a(-70157303125831L), -1);
            this.f6880a.putInt(pj0.m61166a(-70204547766087L), -1);
            this.f6880a.putInt(pj0.m61166a(-70264677308231L), -1);
            this.f6880a.putString(pj0.m61166a(-70333396784967L), pj0.m61166a(-70397821294407L));
            this.f6880a.putInt(pj0.m61166a(-70402116261703L), this.f6899o);
            this.f6880a.commit();
        }
        this.f6883a = n61.m57935t();
        this.f6883a.mo40964K(new t61.C6839b().mo44931g(1).mo44927c());
        this.f6883a.mo40976o().mo17579k(new v14(this));
        if (!this.f6881a.getBoolean(pj0.m61166a(-70462245803847L), false)) {
            this.f6880a.clear();
            this.f6880a.putBoolean(pj0.m61166a(-70496605542215L), true);
            this.f6880a.putBoolean(pj0.m61166a(-70530965280583L), false);
            this.f6880a.apply();
        }
        if (this.f6881a.getBoolean(pj0.m61166a(-70573914953543L), true)) {
            this.f6880a.clear();
            this.f6880a.putBoolean(pj0.m61166a(-70616864626503L), false);
            this.f6880a.apply();
        }
        setContentView((int) C1410R.layout.activity_splash_screen);
        mo7849j1();
        mo7852m1();
        this.f6889f = this.f6895j.equalsIgnoreCase(pj0.m61166a(-70659814299463L));
        new Handler().postDelayed(new w14(this), (long) 1500);
    }

    /* renamed from: r1 */
    public final void mo7853r1(boolean z) {
        if (!z) {
            Intent intent = new Intent(this, NoInternetActivity.class);
            this.f6882a.putString(pj0.m61166a(-70853087827783L), this.f6886e);
            this.f6882a.putBoolean(pj0.m61166a(-70896037500743L), this.f6891g);
            this.f6882a.putBoolean(pj0.m61166a(-70951872075591L), this.f6893h);
            this.f6882a.putString(pj0.m61166a(-71024886519623L), this.f6888f);
            this.f6882a.putBoolean(pj0.m61166a(-71072131159879L), this.f6889f);
            this.f6882a.putBoolean(pj0.m61166a(-71102195930951L), this.f6887e);
            intent.putExtras(this.f6882a);
            startActivity(intent);
            finish();
        }
    }
}
