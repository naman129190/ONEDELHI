package com.delhitransport.onedelhi.activities;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.C0657l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.delhitransport.onedelhi.networking.data_download.DownloadZipExtractor;
import com.google.android.gms.common.C1410R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onedelhi.secure.C3962y2;
import com.onedelhi.secure.e74;
import com.onedelhi.secure.f62;
import com.onedelhi.secure.fm0;
import com.onedelhi.secure.gv2;
import com.onedelhi.secure.id4;
import com.onedelhi.secure.iw3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.qp2;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.rq2;
import com.onedelhi.secure.tr0;
import com.onedelhi.secure.ub2;
import com.onedelhi.secure.vb2;
import com.onedelhi.secure.wb2;
import java.io.File;
import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    /* renamed from: f */
    public static boolean f6577f;

    /* renamed from: g */
    public static boolean f6578g;

    /* renamed from: a */
    public AlertDialog f6579a;

    /* renamed from: a */
    public final Bundle f6580a = new Bundle();

    /* renamed from: a */
    public Fragment f6581a;

    /* renamed from: a */
    public final FragmentManager f6582a = mo4464v0();

    /* renamed from: a */
    public C0657l f6583a;

    /* renamed from: a */
    public BottomNavigationView f6584a;

    /* renamed from: e */
    public String f6585e = pj0.m61166a(-42076806944583L);

    /* renamed from: e */
    public boolean f6586e = false;

    /* renamed from: o */
    public final int f6587o = 123;

    /* renamed from: com.delhitransport.onedelhi.activities.MainActivity$a */
    public class C1260a implements gv2<Void> {
        public C1260a() {
        }

        /* renamed from: b */
        public void mo7740a(Void voidR) {
            Log.d(pj0.m61166a(-41591475640135L), pj0.m61166a(-41612950476615L));
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.MainActivity$b */
    public class C1261b implements gv2<Void> {
        public C1261b() {
        }

        /* renamed from: b */
        public void mo7740a(Void voidR) {
            Log.d(pj0.m61166a(-41660195116871L), pj0.m61166a(-41681669953351L));
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.MainActivity$c */
    public class C1262c implements DialogInterface.OnClickListener {
        public C1262c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            MainActivity.this.mo7727k1();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.MainActivity$d */
    public class C1263d implements DialogInterface.OnClickListener {
        public C1263d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Toast.makeText(MainActivity.this.getApplicationContext(), pj0.m61166a(-41758979364679L), 0).show();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.MainActivity$e */
    public class C1264e implements Runnable {
        public C1264e() {
        }

        public void run() {
            boolean unused = MainActivity.this.f6586e = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public /* synthetic */ boolean m8069m1(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C1410R.C1412id.action_directions /*2131361853*/:
                if (this.f6581a instanceof qp2) {
                    return false;
                }
                mo7729p1();
                return true;
            case C1410R.C1412id.action_ev /*2131361855*/:
                if (this.f6581a instanceof rq2) {
                    return false;
                }
                mo7732s1();
                return true;
            case C1410R.C1412id.action_live /*2131361857*/:
                if (this.f6581a instanceof f62) {
                    return false;
                }
                mo7731r1();
                return true;
            case C1410R.C1412id.action_support /*2131361863*/:
                if (this.f6581a instanceof e74) {
                    return false;
                }
                mo7734u1();
                return true;
            case C1410R.C1412id.action_tickets /*2131361865*/:
                if (this.f6581a instanceof id4) {
                    return false;
                }
                mo7735v1();
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public /* synthetic */ void m8070n1(View view) {
        this.f6579a.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public /* synthetic */ void m8071o1(View view) {
        this.f6579a.dismiss();
        mo7739z1();
    }

    /* renamed from: k1 */
    public final void mo7727k1() {
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = true;
            boolean z2 = r70.m26348a(getApplicationContext(), pj0.m61166a(-44198520788807L)) == 0;
            if (r70.m26348a(getApplicationContext(), pj0.m61166a(-44370319480647L)) != 0) {
                z = false;
            }
            if (!z2 || !z) {
                ArrayList arrayList = new ArrayList();
                if (!z2) {
                    arrayList.add(pj0.m61166a(-44533528237895L));
                }
                if (!z) {
                    arrayList.add(pj0.m61166a(-44705326929735L));
                }
                C3962y2.m31859G(this, (String[]) arrayList.toArray(new String[0]), 123);
            }
        }
    }

    /* renamed from: l1 */
    public final void mo7728l1() {
        if (this.f6582a.mo4635z0() == 0) {
            if (this.f6586e) {
                super.onBackPressed();
                finishAffinity();
            } else {
                Toast.makeText(this, getResources().getString(C1410R.string.press_again_to_exit), 0).show();
            }
            this.f6586e = true;
            new Handler().postDelayed(new C1264e(), 2000);
            return;
        }
        this.f6582a.mo4596l1();
    }

    public void onBackPressed() {
        ImageButton imageButton;
        Fragment p0 = mo4464v0().mo4606p0(C1410R.C1412id.fragment_frame);
        this.f6581a = p0;
        if (p0 instanceof rq2) {
            if (((rq2) p0).f20027b) {
                imageButton = ((rq2) p0).f20017b;
            }
            mo7728l1();
            return;
        }
        if (!(p0 instanceof id4)) {
            if (p0 instanceof f62) {
                boolean z = ((f62) p0).f11884b;
                f62 f62 = (f62) p0;
                if (z) {
                    imageButton = f62.f11873b;
                } else if (f62.f11860a.mo11277v0() == 3) {
                    ((f62) this.f6581a).f11860a.mo11242Y0(4);
                    return;
                }
            } else if (!(p0 instanceof iw3) && !(p0 instanceof fm0) && !(p0 instanceof qp2)) {
                return;
            }
        }
        mo7728l1();
        return;
        imageButton.callOnClick();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(1);
        setContentView((int) C1410R.layout.activity_main);
        this.f6584a = (BottomNavigationView) findViewById(C1410R.C1412id.bottom_navigation);
        mo7736w1();
        this.f6584a.setSelectedItemId(C1410R.C1412id.action_live);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            f6578g = extras.getBoolean(pj0.m61166a(-42699577202503L), false);
            this.f6585e = extras.getString(pj0.m61166a(-42755411777351L), pj0.m61166a(-42798361450311L));
            if (extras.getBoolean(pj0.m61166a(-42802656417607L), false)) {
                this.f6584a.setSelectedItemId(C1410R.C1412id.action_tickets);
            }
        } else {
            f6578g = false;
        }
        if (f6578g) {
            mo7738y1();
        }
        SharedPreferences sharedPreferences = getSharedPreferences(pj0.m61166a(-42871375894343L), 0);
        int i = sharedPreferences.getInt(pj0.m61166a(-42957275240263L), 0);
        int i2 = sharedPreferences.getInt(pj0.m61166a(-43004519880519L), 0);
        boolean z = sharedPreferences.getBoolean(pj0.m61166a(-43081829291847L), true);
        String string = sharedPreferences.getString(pj0.m61166a(-43124778964807L), pj0.m61166a(-43167728637767L));
        FirebaseMessaging.m34683u().mo29701X(pj0.m61166a(-43172023605063L)).mo17579k(new C1260a());
        if (!string.equals(pj0.m61166a(-43189203474247L))) {
            FirebaseMessaging.m34683u().mo29701X(string).mo17579k(new C1261b());
        }
        if (z || i != i2) {
            String str = pj0.m61166a(-43193498441543L) + getPackageName() + pj0.m61166a(-43245038049095L);
            new Thread(new DownloadZipExtractor(pj0.m61166a(-43382477002567L), new File(str, pj0.m61166a(-43640175040327L)), str, pj0.m61166a(-43279397787463L) + getPackageName() + pj0.m61166a(-43330937395015L), getApplicationContext())).start();
        }
        mo7727k1();
        if (this.f6585e.equalsIgnoreCase(pj0.m61166a(-43657354909511L))) {
            this.f6584a.setSelectedItemId(C1410R.C1412id.action_tickets);
        }
    }

    public void onRequestPermissionsResult(int i, @mr2 String[] strArr, @mr2 int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 123) {
            boolean z = false;
            boolean z2 = false;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                String str = strArr[i2];
                int i3 = iArr[i2];
                if (str.equals(pj0.m61166a(-42081101911879L))) {
                    z = i3 == 0;
                } else if (str.equals(pj0.m61166a(-42252900603719L))) {
                    z2 = i3 == 0;
                }
            }
            if (!z) {
                Toast.makeText(this, pj0.m61166a(-42416109360967L), 0).show();
            }
            if (!z2 && Build.VERSION.SDK_INT >= 33) {
                Toast.makeText(this, pj0.m61166a(-42549253347143L), 0).show();
            }
        }
    }

    public void onResume() {
        super.onResume();
    }

    /* renamed from: p1 */
    public final void mo7729p1() {
        qp2 qp2 = new qp2();
        this.f6581a = qp2;
        qp2.setArguments(this.f6580a);
        C0657l r = this.f6582a.mo4611r();
        this.f6583a = r;
        r.mo4845C(C1410R.C1412id.fragment_frame, this.f6581a);
        this.f6583a.mo4726q();
    }

    /* renamed from: q1 */
    public final void mo7730q1() {
        tr0 tr0 = new tr0();
        this.f6581a = tr0;
        tr0.setArguments(this.f6580a);
        C0657l r = this.f6582a.mo4611r();
        this.f6583a = r;
        r.mo4845C(C1410R.C1412id.fragment_frame, this.f6581a);
        this.f6583a.mo4726q();
    }

    /* renamed from: r1 */
    public final void mo7731r1() {
        f62 f62 = new f62();
        this.f6581a = f62;
        f62.setArguments(this.f6580a);
        C0657l r = this.f6582a.mo4611r();
        this.f6583a = r;
        r.mo4845C(C1410R.C1412id.fragment_frame, this.f6581a);
        this.f6583a.mo4726q();
    }

    /* renamed from: s1 */
    public final void mo7732s1() {
        rq2 rq2 = new rq2();
        this.f6581a = rq2;
        rq2.setArguments(this.f6580a);
        C0657l r = this.f6582a.mo4611r();
        this.f6583a = r;
        r.mo4845C(C1410R.C1412id.fragment_frame, this.f6581a);
        this.f6583a.mo4726q();
    }

    /* renamed from: t1 */
    public final void mo7733t1() {
        iw3 iw3 = new iw3();
        this.f6581a = iw3;
        iw3.setArguments(this.f6580a);
        C0657l r = this.f6582a.mo4611r();
        this.f6583a = r;
        r.mo4845C(C1410R.C1412id.fragment_frame, this.f6581a);
        this.f6583a.mo4726q();
    }

    /* renamed from: u1 */
    public final void mo7734u1() {
        e74 e74 = new e74();
        this.f6581a = e74;
        e74.setArguments(this.f6580a);
        C0657l r = this.f6582a.mo4611r();
        this.f6583a = r;
        r.mo4845C(C1410R.C1412id.fragment_frame, this.f6581a);
        this.f6583a.mo4726q();
    }

    /* renamed from: v1 */
    public final void mo7735v1() {
        id4 id4 = new id4();
        this.f6581a = id4;
        id4.setArguments(this.f6580a);
        C0657l r = this.f6582a.mo4611r();
        this.f6583a = r;
        r.mo4845C(C1410R.C1412id.fragment_frame, this.f6581a);
        this.f6583a.mo4726q();
    }

    @SuppressLint({"NonConstantResourceId"})
    /* renamed from: w1 */
    public final void mo7736w1() {
        this.f6584a.setOnItemSelectedListener(new wb2(this));
    }

    /* renamed from: x1 */
    public final void mo7737x1() {
        if (r70.m26348a(this, pj0.m61166a(-44868535686983L)) != 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(pj0.m61166a(-45031744444231L));
            builder.setMessage(pj0.m61166a(-45121938757447L));
            builder.setPositiveButton(pj0.m61166a(-45890737903431L), new C1262c());
            builder.setNegativeButton(pj0.m61166a(-45903622805319L), new C1263d());
            builder.show();
        }
    }

    /* renamed from: y1 */
    public final void mo7738y1() {
        if (f6578g && !f6577f) {
            f6577f = true;
            AlertDialog.Builder builder = new AlertDialog.Builder(this, C1410R.style.CustomAlertDialog);
            View inflate = getLayoutInflater().inflate(C1410R.layout.update_available, (ViewGroup) null);
            ((TextView) inflate.findViewById(C1410R.C1412id.tv_1)).setText(getResources().getString(C1410R.string.update_avail));
            builder.setView(inflate);
            Button button = (Button) inflate.findViewById(C1410R.C1412id.btn_cancel);
            Button button2 = (Button) inflate.findViewById(C1410R.C1412id.btn_accept);
            button.setText(C1410R.string.update_later);
            button2.setText(C1410R.string.update_now);
            button.setOnClickListener(new ub2(this));
            button2.setOnClickListener(new vb2(this));
            AlertDialog create = builder.create();
            this.f6579a = create;
            create.setCancelable(true);
            this.f6579a.show();
        }
    }

    /* renamed from: z1 */
    public final void mo7739z1() {
        String packageName = getPackageName();
        try {
            String a = pj0.m61166a(-43674534778695L);
            startActivity(new Intent(a, Uri.parse(pj0.m61166a(-43790498895687L) + packageName)));
        } catch (ActivityNotFoundException unused) {
            String a2 = pj0.m61166a(-43880693208903L);
            startActivity(new Intent(a2, Uri.parse(pj0.m61166a(-43996657325895L) + packageName)));
        }
    }
}
