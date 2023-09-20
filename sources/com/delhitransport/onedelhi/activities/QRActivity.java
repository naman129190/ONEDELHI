package com.delhitransport.onedelhi.activities;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.lifecycle.C0709m;
import com.delhitransport.onedelhi.p001db.DatabaseClient;
import com.delhitransport.onedelhi.p001db.UserBookings;
import com.delhitransport.onedelhi.ticket.Validate;
import com.delhitransport.onedelhi.ticket.ValidateRequest;
import com.delhitransport.onedelhi.viewmodels.TicketModel;
import com.google.android.gms.common.C1410R;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.onedelhi.secure.C3962y2;
import com.onedelhi.secure.b82;
import com.onedelhi.secure.g83;
import com.onedelhi.secure.h83;
import com.onedelhi.secure.i83;
import com.onedelhi.secure.j83;
import com.onedelhi.secure.jd1;
import com.onedelhi.secure.k83;
import com.onedelhi.secure.l83;
import com.onedelhi.secure.m83;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.n83;
import com.onedelhi.secure.nu2;
import com.onedelhi.secure.o83;
import com.onedelhi.secure.ol3;
import com.onedelhi.secure.p83;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.q83;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.r83;
import com.onedelhi.secure.rf4;
import com.onedelhi.secure.s83;
import com.onedelhi.secure.ve1;
import com.onedelhi.secure.w94;
import com.onedelhi.secure.ye1;
import com.onedelhi.secure.z62;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p005me.dm7.barcodescanner.zxing.ZXingScannerView;

public class QRActivity extends BaseActivity implements ZXingScannerView.C7621b {

    /* renamed from: a */
    public static InputMethodManager f6747a = null;

    /* renamed from: k */
    public static boolean f6748k = false;

    /* renamed from: o */
    public static final int f6749o = 123;

    /* renamed from: a */
    public ProgressDialog f6750a;

    /* renamed from: a */
    public Intent f6751a;

    /* renamed from: a */
    public SharedPreferences.Editor f6752a;

    /* renamed from: a */
    public Location f6753a;

    /* renamed from: a */
    public Bundle f6754a;

    /* renamed from: a */
    public CountDownTimer f6755a;

    /* renamed from: a */
    public EditText f6756a;

    /* renamed from: a */
    public ImageButton f6757a;

    /* renamed from: a */
    public RadioGroup f6758a;

    /* renamed from: a */
    public Validate f6759a;

    /* renamed from: a */
    public TicketModel f6760a;

    /* renamed from: a */
    public BottomSheetBehavior f6761a;

    /* renamed from: a */
    public jd1 f6762a;

    /* renamed from: a */
    public final z62 f6763a = new C1276a();

    /* renamed from: a */
    public Boolean f6764a = Boolean.TRUE;

    /* renamed from: a */
    public final ArrayList<Double> f6765a = new ArrayList<>();

    /* renamed from: a */
    public final List<String> f6766a = new ArrayList();

    /* renamed from: a */
    public ZXingScannerView f6767a;

    /* renamed from: b */
    public Location f6768b;

    /* renamed from: b */
    public EditText f6769b;

    /* renamed from: b */
    public ImageButton f6770b;

    /* renamed from: b */
    public RadioGroup f6771b;

    /* renamed from: b */
    public Boolean f6772b;

    /* renamed from: c */
    public EditText f6773c;

    /* renamed from: c */
    public Boolean f6774c;

    /* renamed from: d */
    public EditText f6775d;

    /* renamed from: d */
    public Boolean f6776d = Boolean.FALSE;

    /* renamed from: e */
    public String f6777e;

    /* renamed from: e */
    public boolean f6778e = false;

    /* renamed from: f */
    public String f6779f;

    /* renamed from: f */
    public boolean f6780f = true;

    /* renamed from: g */
    public String f6781g;

    /* renamed from: g */
    public boolean f6782g = false;

    /* renamed from: h */
    public String f6783h;

    /* renamed from: h */
    public boolean f6784h;

    /* renamed from: i */
    public String f6785i;

    /* renamed from: i */
    public boolean f6786i = false;

    /* renamed from: j */
    public String f6787j = pj0.m61166a(-61365505070919L);

    /* renamed from: j */
    public boolean f6788j = false;

    /* renamed from: k */
    public String f6789k = pj0.m61166a(-61369800038215L);

    /* renamed from: l */
    public String f6790l;

    /* renamed from: com.delhitransport.onedelhi.activities.QRActivity$a */
    public class C1276a extends z62 {
        public C1276a() {
        }

        /* renamed from: b */
        public void mo7567b(LocationResult locationResult) {
            Location M2 = locationResult.mo10563M2();
            QRActivity.this.f6768b.setLatitude(M2.getLatitude());
            QRActivity.this.f6768b.setLongitude(M2.getLongitude());
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.QRActivity$b */
    public class C1277b extends AsyncTask<Void, Void, Void> {
        public C1277b() {
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            UserBookings userBookings = new UserBookings();
            userBookings.setAgency(QRActivity.this.f6759a.getAgency());
            userBookings.setBooking_id(QRActivity.this.f6759a.getBooking_id());
            userBookings.setDescription(QRActivity.this.f6759a.getDescription());
            userBookings.setIs_ac(QRActivity.this.f6759a.isIs_ac());
            userBookings.setRoute_long_name(QRActivity.this.f6759a.getRoute_long_name());
            userBookings.setRoute_termination_stop(QRActivity.this.f6759a.getRoute_termination_stop());
            userBookings.setStart_stop_index(QRActivity.this.f6759a.getStart_stop_index());
            userBookings.setMessage(QRActivity.this.f6759a.getMessage());
            try {
                DatabaseClient.getInstance(QRActivity.this).getAppDatabase().bookingDao().insert(userBookings);
                return null;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.QRActivity$c */
    public class C1278c implements Runnable {
        public C1278c() {
        }

        public void run() {
            String unused = QRActivity.this.f6789k = pj0.m61166a(-60815749257031L);
            QRActivity.this.mo7805k2();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.QRActivity$d */
    public class C1279d implements Runnable {
        public C1279d() {
        }

        public void run() {
            String unused = QRActivity.this.f6789k = pj0.m61166a(-60824339191623L);
            QRActivity.this.mo7805k2();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.QRActivity$e */
    public class C1280e implements TextWatcher {
        public C1280e() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (i3 == 1 && !QRActivity.this.f6782g) {
                QRActivity.this.mo7792J1();
            }
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.QRActivity$f */
    public class C1281f extends BottomSheetBehavior.C1503f {
        public C1281f() {
        }

        /* renamed from: b */
        public void mo7562b(@mr2 View view, float f) {
        }

        /* renamed from: c */
        public void mo7563c(@mr2 View view, int i) {
            int i2;
            BottomSheetBehavior bottomSheetBehavior;
            switch (i) {
                case 1:
                case 2:
                case 5:
                    break;
                case 3:
                    boolean unused = QRActivity.this.f6784h = true;
                    if (!QRActivity.this.f6776d.booleanValue()) {
                        QRActivity.this.f6756a.requestFocus();
                        QRActivity.m8240h2(QRActivity.this);
                        return;
                    }
                    return;
                case 4:
                    boolean unused2 = QRActivity.this.f6784h = false;
                    QRActivity.this.f6756a.clearFocus();
                    break;
                case 6:
                    if (!QRActivity.this.f6784h) {
                        bottomSheetBehavior = QRActivity.this.f6761a;
                        i2 = 3;
                    } else {
                        bottomSheetBehavior = QRActivity.this.f6761a;
                        i2 = 4;
                    }
                    bottomSheetBehavior.mo11242Y0(i2);
                    return;
                default:
                    return;
            }
            QRActivity.m8223O1(QRActivity.this);
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.QRActivity$g */
    public class C1282g implements DialogInterface.OnClickListener {
        public C1282g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            QRActivity.this.startActivity(new Intent(pj0.m61166a(-60832929126215L), Uri.parse(pj0.m61166a(-61030497621831L))));
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.QRActivity$h */
    public class C1283h implements DialogInterface.OnClickListener {
        public C1283h() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            QRActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.QRActivity$i */
    public class C1284i implements nu2<Location> {
        public C1284i() {
        }

        public void onComplete(@mr2 w94<Location> w94) {
            if (w94.mo17590v()) {
                Location unused = QRActivity.this.f6753a = w94.mo17586r();
                if (QRActivity.this.f6753a != null) {
                    QRActivity.this.f6768b.setLatitude(QRActivity.this.f6753a.getLatitude());
                    QRActivity.this.f6768b.setLongitude(QRActivity.this.f6753a.getLongitude());
                    return;
                }
                QRActivity.this.mo7800e2();
                return;
            }
            QRActivity qRActivity = QRActivity.this;
            Toast.makeText(qRActivity, qRActivity.getResources().getString(C1410R.string.please_turn_on_your_location), 0).show();
            QRActivity.this.startActivity(new Intent(pj0.m61166a(-61185116444487L)));
        }
    }

    /* renamed from: com.delhitransport.onedelhi.activities.QRActivity$j */
    public class C1285j extends CountDownTimer {
        public C1285j(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            if (QRActivity.this.f6750a != null && QRActivity.this.f6750a.isShowing()) {
                QRActivity.this.f6750a.dismiss();
            }
            QRActivity qRActivity = QRActivity.this;
            if (qRActivity != null && !qRActivity.isFinishing()) {
                QRActivity qRActivity2 = QRActivity.this;
                Toast.makeText(qRActivity2, qRActivity2.getResources().getString(C1410R.string.some_error_occurred), 0).show();
                QRActivity.this.onBackPressed();
            }
        }

        public void onTick(long j) {
        }
    }

    /* renamed from: O1 */
    public static void m8223O1(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(pj0.m61166a(-61378389972807L));
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public /* synthetic */ void m8224Q1() {
        this.f6789k = pj0.m61166a(-65870925764423L);
        mo7805k2();
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public /* synthetic */ void m8225R1(View view) {
        this.f6770b.setVisibility(0);
        this.f6757a.setVisibility(8);
        this.f6767a.setFlash(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public /* synthetic */ void m8226S1(View view) {
        this.f6757a.setVisibility(0);
        this.f6770b.setVisibility(8);
        this.f6767a.setFlash(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public /* synthetic */ void m8227T1(View view, boolean z) {
        EditText editText;
        if (z && this.f6775d.getText().toString().trim().equalsIgnoreCase(pj0.m61166a(-65879515699015L))) {
            if (this.f6773c.getText().toString().trim().equalsIgnoreCase(pj0.m61166a(-65883810666311L))) {
                editText = this.f6773c;
            } else if (this.f6769b.getText().toString().trim().equalsIgnoreCase(pj0.m61166a(-65888105633607L))) {
                editText = this.f6769b;
            } else if (this.f6756a.getText().toString().trim().equalsIgnoreCase(pj0.m61166a(-65892400600903L))) {
                editText = this.f6756a;
            } else {
                return;
            }
            editText.requestFocus();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public /* synthetic */ void m8228U1(RadioGroup radioGroup, int i) {
        this.f6761a.mo11228M0(false);
        this.f6761a.mo11227L0(120);
        this.f6761a.mo11242Y0(3);
        if (this.f6788j && this.f6771b.getCheckedRadioButtonId() != -1) {
            this.f6771b.clearCheck();
            this.f6788j = false;
        }
        RadioButton radioButton = (RadioButton) findViewById(i);
        int checkedRadioButtonId = this.f6758a.getCheckedRadioButtonId();
        this.f6786i = true;
        if (checkedRadioButtonId == -1 || this.f6782g) {
            this.f6787j = pj0.m61166a(-65956825110343L);
            return;
        }
        this.f6787j = String.valueOf(radioButton.getText());
        if (!this.f6756a.getText().toString().trim().equals(pj0.m61166a(-65939645241159L)) && !this.f6769b.getText().toString().trim().equals(pj0.m61166a(-65943940208455L)) && !this.f6773c.getText().toString().trim().equals(pj0.m61166a(-65948235175751L)) && !this.f6775d.getText().toString().trim().equals(pj0.m61166a(-65952530143047L))) {
            this.f6777e = this.f6787j + this.f6756a.getText().toString().trim() + this.f6769b.getText().toString().trim() + this.f6773c.getText().toString().trim() + this.f6775d.getText().toString().trim();
            m8223O1(this);
            new Handler().postDelayed(new C1278c(), 200);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public /* synthetic */ void m8229V1(RadioGroup radioGroup, int i) {
        try {
            this.f6761a.mo11228M0(false);
            this.f6761a.mo11227L0(120);
            this.f6761a.mo11242Y0(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.f6786i && this.f6758a.getCheckedRadioButtonId() != -1) {
            this.f6758a.clearCheck();
            this.f6786i = false;
        }
        RadioButton radioButton = (RadioButton) findViewById(i);
        int checkedRadioButtonId = this.f6771b.getCheckedRadioButtonId();
        this.f6788j = true;
        if (checkedRadioButtonId == -1 || this.f6782g) {
            this.f6787j = pj0.m61166a(-65935350273863L);
            return;
        }
        this.f6787j = String.valueOf(radioButton.getText());
        if (!this.f6756a.getText().toString().trim().equals(pj0.m61166a(-65918170404679L)) && !this.f6769b.getText().toString().trim().equals(pj0.m61166a(-65922465371975L)) && !this.f6773c.getText().toString().trim().equals(pj0.m61166a(-65926760339271L)) && !this.f6775d.getText().toString().trim().equals(pj0.m61166a(-65931055306567L))) {
            this.f6777e = this.f6787j + this.f6756a.getText().toString().trim() + this.f6769b.getText().toString().trim() + this.f6773c.getText().toString().trim() + this.f6775d.getText().toString().trim();
            m8223O1(this);
            new Handler().postDelayed(new C1279d(), 200);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public /* synthetic */ void m8230W1(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public /* synthetic */ void m8231X1() {
        this.f6756a.requestFocus();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public /* synthetic */ void m8232Y1(View view) {
        this.f6761a.mo11228M0(false);
        this.f6761a.mo11227L0(120);
        this.f6761a.mo11242Y0(3);
        new Handler().postDelayed(new j83(this), 800);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public /* synthetic */ void m8233Z1(View view, boolean z) {
        if (z) {
            this.f6776d = Boolean.TRUE;
            this.f6761a.mo11228M0(false);
            this.f6761a.mo11227L0(120);
            this.f6761a.mo11242Y0(3);
            return;
        }
        this.f6776d = Boolean.FALSE;
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public /* synthetic */ void m8234a2(View view, boolean z) {
        if (z && this.f6769b.getText().toString().trim().equalsIgnoreCase(pj0.m61166a(-65909580470087L)) && this.f6756a.getText().toString().trim().equalsIgnoreCase(pj0.m61166a(-65913875437383L))) {
            this.f6756a.requestFocus();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public /* synthetic */ void m8235b2(View view, boolean z) {
        EditText editText;
        if (z && this.f6773c.getText().toString().trim().equalsIgnoreCase(pj0.m61166a(-65896695568199L))) {
            if (this.f6769b.getText().toString().trim().equalsIgnoreCase(pj0.m61166a(-65900990535495L))) {
                editText = this.f6769b;
            } else if (this.f6756a.getText().toString().trim().equalsIgnoreCase(pj0.m61166a(-65905285502791L))) {
                editText = this.f6756a;
            } else {
                return;
            }
            editText.requestFocus();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public /* synthetic */ void m8236c2(Validate validate) {
        Resources resources;
        int i;
        mo7793K1();
        this.f6759a = validate;
        int i2 = 10;
        boolean z = false;
        if (validate != null) {
            mo7801f2();
            String message = validate.getMessage();
            String booking_id = validate.getBooking_id();
            String route_termination_stop = validate.getRoute_termination_stop();
            this.f6790l = validate.getAgency();
            this.f6752a.putString(pj0.m61166a(-64921737992007L), this.f6790l);
            this.f6752a.apply();
            this.f6778e = validate.isPostpaid();
            this.f6752a.putBoolean(pj0.m61166a(-64964687664967L), this.f6778e);
            boolean commit = this.f6752a.commit();
            while (i2 > 0 && !commit) {
                commit = this.f6752a.commit();
                i2--;
            }
            if (message.equalsIgnoreCase(pj0.m61166a(-65003342370631L))) {
                ProgressDialog progressDialog = this.f6750a;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                this.f6790l = validate.getAgency();
                String route_long_name = validate.getRoute_long_name();
                Boolean valueOf = Boolean.valueOf(validate.isIs_ac());
                if (route_long_name != null) {
                    z = true;
                }
                Intent intent = new Intent(this, ValueActivity.class);
                this.f6751a = intent;
                intent.putExtra(pj0.m61166a(-65037702108999L), this.f6789k);
                this.f6751a.putExtra(pj0.m61166a(-65097831651143L), this.f6777e);
                this.f6751a.putExtra(pj0.m61166a(-65145076291399L), this.f6765a);
                this.f6751a.putExtra(pj0.m61166a(-65200910866247L), route_long_name);
                this.f6751a.putExtra(pj0.m61166a(-65269630342983L), valueOf);
                this.f6751a.putExtra(pj0.m61166a(-65295400146759L), z);
                this.f6751a.putExtra(pj0.m61166a(-65346939754311L), booking_id);
                this.f6751a.putExtra(pj0.m61166a(-65394184394567L), route_termination_stop);
                this.f6751a.putExtra(pj0.m61166a(-65467198838599L), this.f6764a);
                this.f6751a.putExtra(pj0.m61166a(-65518738446151L), this.f6779f);
                this.f6751a.putExtra(pj0.m61166a(-65561688119111L), this.f6774c);
                this.f6751a.putExtra(pj0.m61166a(-65617522693959L), this.f6783h);
                this.f6751a.putExtra(pj0.m61166a(-65664767334215L), this.f6781g);
                this.f6751a.putExtra(pj0.m61166a(-65703422039879L), this.f6790l.toLowerCase());
                this.f6751a.putExtra(pj0.m61166a(-65733486810951L), this.f6778e);
                this.f6751a.putExtra(pj0.m61166a(-65772141516615L), this.f6759a);
                startActivity(this.f6751a);
                finish();
                return;
            }
            ProgressDialog progressDialog2 = this.f6750a;
            if (progressDialog2 != null) {
                progressDialog2.dismiss();
            }
            Toast.makeText(this, validate.getDescription(), 0).show();
            this.f6756a.setText(pj0.m61166a(-65810796222279L));
            this.f6769b.setText(pj0.m61166a(-65815091189575L));
            this.f6773c.setText(pj0.m61166a(-65819386156871L));
            this.f6775d.setText(pj0.m61166a(-65823681124167L));
            this.f6777e = pj0.m61166a(-65827976091463L);
            this.f6756a.requestFocus();
            return;
        }
        this.f6752a.putBoolean(pj0.m61166a(-65832271058759L), false);
        boolean commit2 = this.f6752a.commit();
        while (i2 > 0 && !commit2) {
            commit2 = this.f6752a.commit();
            i2--;
        }
        ProgressDialog progressDialog3 = this.f6750a;
        if (progressDialog3 != null) {
            progressDialog3.dismiss();
        }
        if (mo7797P1()) {
            resources = getResources();
            i = C1410R.string.fetch_problem;
        } else {
            resources = getResources();
            i = C1410R.string.network_error;
        }
        Toast.makeText(this, resources.getString(i), 0).show();
        onBackPressed();
    }

    /* renamed from: h2 */
    public static void m8240h2(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        InputMethodManager inputMethodManager = f6747a;
        if (inputMethodManager != null) {
            inputMethodManager.toggleSoftInputFromWindow(currentFocus.getApplicationWindowToken(), 2, 0);
        }
    }

    /* renamed from: J1 */
    public final void mo7792J1() {
        String trim = this.f6756a.getText().toString().trim();
        String trim2 = this.f6769b.getText().toString().trim();
        String trim3 = this.f6773c.getText().toString().trim();
        String trim4 = this.f6775d.getText().toString().trim();
        if (!this.f6787j.equalsIgnoreCase(pj0.m61166a(-62164368987975L)) && !trim.equalsIgnoreCase(pj0.m61166a(-62168663955271L)) && !trim2.equalsIgnoreCase(pj0.m61166a(-62172958922567L)) && !trim3.equalsIgnoreCase(pj0.m61166a(-62177253889863L)) && !trim4.equalsIgnoreCase(pj0.m61166a(-62181548857159L))) {
            this.f6777e = this.f6787j + trim + trim2 + trim3 + trim4;
            m8223O1(this);
            new Handler().postDelayed(new i83(this), 200);
        }
    }

    /* renamed from: K1 */
    public void mo7793K1() {
        CountDownTimer countDownTimer = this.f6755a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* renamed from: L1 */
    public final void mo7794L1() {
        Boolean valueOf = Boolean.valueOf(r70.m26348a(this, pj0.m61166a(-62559505979207L)) == 0 && r70.m26348a(this, pj0.m61166a(-62731304671047L)) == 0);
        this.f6772b = valueOf;
        if (!valueOf.booleanValue()) {
            C3962y2.m31859G(this, new String[]{pj0.m61166a(-62842973820743L), pj0.m61166a(-63014772512583L)}, 123);
        } else {
            mo7796N1();
        }
    }

    /* renamed from: M1 */
    public final String mo7795M1(String str) {
        try {
            return new String(Base64.decode(str, 0), StandardCharsets.UTF_8);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return str;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: N1 */
    public final void mo7796N1() {
        if (this.f6772b.booleanValue()) {
            this.f6762a.mo18272U().mo17573e(new C1284i());
        } else {
            Toast.makeText(this, pj0.m61166a(-64341917407047L), 0).show();
        }
    }

    /* renamed from: P1 */
    public final boolean mo7797P1() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService(pj0.m61166a(-62503671404359L))).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: Y */
    public void mo7798Y(ol3 ol3) {
        if (mo7799d2(mo7795M1(ol3.mo41829g())).booleanValue()) {
            this.f6782g = true;
            this.f6789k = pj0.m61166a(-64616795313991L);
            mo7802g2();
            mo7805k2();
            return;
        }
        this.f6767a.mo48943o(this);
    }

    /* renamed from: d2 */
    public Boolean mo7799d2(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f6777e = jSONObject.getString(pj0.m61166a(-62185843824455L));
                if (jSONObject.getString(pj0.m61166a(-62233088464711L)).equalsIgnoreCase(pj0.m61166a(-62271743170375L))) {
                    return Boolean.TRUE;
                }
            } catch (JSONException e) {
                System.out.println(e.getMessage());
                this.f6777e = pj0.m61166a(-62267448203079L);
            }
        }
        Toast.makeText(this, getResources().getString(C1410R.string.scan_valid_qr), 0).show();
        return Boolean.FALSE;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: e2 */
    public final void mo7800e2() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.mo10538j3(100);
        locationRequest.mo10534g3(5);
        locationRequest.mo10533f3(0);
        locationRequest.mo10537i3(1);
        jd1 a = b82.m11676a(this);
        this.f6762a = a;
        a.mo18262A(locationRequest, this.f6763a, Looper.myLooper());
    }

    /* renamed from: f2 */
    public final void mo7801f2() {
        new C1277b().execute(new Void[0]);
    }

    /* renamed from: g2 */
    public final void mo7802g2() {
        try {
            this.f6756a.setText(String.valueOf(this.f6777e.charAt(5)));
            this.f6769b.setText(String.valueOf(this.f6777e.charAt(6)));
            this.f6773c.setText(String.valueOf(this.f6777e.charAt(7)));
            this.f6775d.setText(String.valueOf(this.f6777e.charAt(8)));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    /* renamed from: i2 */
    public final void mo7803i2() {
        try {
            this.f6767a.setResultHandler(this);
            this.f6767a.mo48891f();
        } catch (Exception unused) {
            Toast.makeText(this, pj0.m61166a(-64457881524039L), 0).show();
            finish();
        }
    }

    /* renamed from: j2 */
    public void mo7804j2() {
        C1285j jVar = new C1285j(rf4.f19824c, 1000);
        this.f6755a = jVar;
        jVar.start();
    }

    /* renamed from: k2 */
    public final void mo7805k2() {
        ProgressDialog show = ProgressDialog.show(this, pj0.m61166a(-62288923039559L), getResources().getString(C1410R.string.please_wait), true);
        this.f6750a = show;
        show.setCancelable(false);
        mo7804j2();
        this.f6765a.add(Double.valueOf(this.f6768b.getLatitude()));
        this.f6765a.add(Double.valueOf(this.f6768b.getLongitude()));
        if (this.f6785i.equalsIgnoreCase(pj0.m61166a(-62293218006855L))) {
            Intent intent = new Intent(this, PassFormActivity.class);
            this.f6751a = intent;
            intent.putExtra(pj0.m61166a(-62340462647111L), this.f6789k);
            this.f6751a.putExtra(pj0.m61166a(-62400592189255L), this.f6777e);
            this.f6751a.putExtra(pj0.m61166a(-62447836829511L), this.f6765a);
            ProgressDialog progressDialog = this.f6750a;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            f6748k = true;
            mo7793K1();
            startActivity(this.f6751a);
            finish();
            return;
        }
        this.f6760a.validate(new ValidateRequest(this.f6777e, this.f6779f, this.f6781g, this.f6765a, this.f6789k)).mo4926j(this, new h83(this));
    }

    public void onBackPressed() {
        if (this.f6761a.mo11277v0() == 3) {
            this.f6761a.mo11242Y0(4);
            m8223O1(this);
            return;
        }
        try {
            super.onBackPressed();
        } catch (Exception unused) {
            Toast.makeText(getApplicationContext(), pj0.m61166a(-64625385248583L), 0).show();
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity", "CommitPrefEdits"})
    public void onCreate(Bundle bundle) {
        setRequestedOrientation(1);
        super.onCreate(bundle);
        setContentView((int) C1410R.layout.activity_qr);
        Bundle extras = getIntent().getExtras();
        this.f6754a = extras;
        if (extras != null) {
            this.f6779f = extras.getString(pj0.m61166a(-61434224547655L), pj0.m61166a(-61477174220615L));
            this.f6764a = Boolean.valueOf(this.f6754a.getBoolean(pj0.m61166a(-61481469187911L), true));
            this.f6774c = Boolean.valueOf(this.f6754a.getBoolean(pj0.m61166a(-61533008795463L), false));
            this.f6783h = this.f6754a.getString(pj0.m61166a(-61588843370311L), pj0.m61166a(-61636088010567L));
            this.f6781g = this.f6754a.getString(pj0.m61166a(-61640382977863L), pj0.m61166a(-61679037683527L));
            this.f6785i = this.f6754a.getString(pj0.m61166a(-61687627618119L), pj0.m61166a(-61721987356487L));
            this.f6780f = this.f6754a.getBoolean(pj0.m61166a(-61752052127559L), true);
        } else {
            this.f6779f = pj0.m61166a(-61782116898631L);
            this.f6764a = Boolean.TRUE;
            this.f6781g = pj0.m61166a(-61786411865927L);
            this.f6774c = Boolean.FALSE;
            this.f6783h = pj0.m61166a(-61795001800519L);
            this.f6780f = true;
            this.f6785i = pj0.m61166a(-61799296767815L);
        }
        SharedPreferences sharedPreferences = getSharedPreferences(pj0.m61166a(-61829361538887L), 0);
        this.f6752a = sharedPreferences.edit();
        f6747a = (InputMethodManager) getSystemService(pj0.m61166a(-61915260884807L));
        this.f6766a.add(pj0.m61166a(-61971095459655L));
        this.f6766a.add(pj0.m61166a(-62001160230727L));
        this.f6766a.add(pj0.m61166a(-62026930034503L));
        this.f6766a.add(pj0.m61166a(-62052699838279L));
        this.f6766a.add(pj0.m61166a(-62078469642055L));
        if (this.f6779f.equalsIgnoreCase(pj0.m61166a(-62108534413127L))) {
            this.f6779f = sharedPreferences.getString(pj0.m61166a(-62112829380423L), pj0.m61166a(-62155779053383L));
        }
        this.f6760a = (TicketModel) new C0709m(this).mo5027a(TicketModel.class);
        this.f6762a = b82.m11676a(this);
        this.f6768b = new Location(pj0.m61166a(-62160074020679L));
        mo7794L1();
        this.f6767a = new ZXingScannerView(this);
        ZXingScannerView zXingScannerView = (ZXingScannerView) findViewById(C1410R.C1412id.zx_scanner);
        this.f6767a = zXingScannerView;
        zXingScannerView.setAspectTolerance(0.5f);
        if (this.f6772b.booleanValue()) {
            mo7803i2();
        } else {
            mo7794L1();
        }
        BottomSheetBehavior i0 = BottomSheetBehavior.m9579i0((RelativeLayout) findViewById(C1410R.C1412id.bottom_sheet));
        this.f6761a = i0;
        i0.mo11242Y0(4);
        this.f6756a = (EditText) findViewById(C1410R.C1412id.edit_num_1);
        this.f6769b = (EditText) findViewById(C1410R.C1412id.edit_num_2);
        this.f6773c = (EditText) findViewById(C1410R.C1412id.edit_num_3);
        this.f6775d = (EditText) findViewById(C1410R.C1412id.edit_num_4);
        this.f6758a = (RadioGroup) findViewById(C1410R.C1412id.rg_dl);
        this.f6771b = (RadioGroup) findViewById(C1410R.C1412id.rg_el);
        this.f6757a = (ImageButton) findViewById(C1410R.C1412id.ib_torch_off);
        this.f6770b = (ImageButton) findViewById(C1410R.C1412id.ib_torch_on);
        this.f6757a.setOnClickListener(new l83(this));
        this.f6770b.setOnClickListener(new k83(this));
        new ArrayAdapter(this, 17367048, this.f6766a).setDropDownViewResource(17367049);
        this.f6758a.setOnCheckedChangeListener(new s83(this));
        this.f6771b.setOnCheckedChangeListener(new r83(this));
        ((ImageView) findViewById(C1410R.C1412id.iv_close)).setOnClickListener(new m83(this));
        this.f6756a.setOnClickListener(new g83(this));
        this.f6756a.setOnFocusChangeListener(new q83(this));
        this.f6769b.setOnFocusChangeListener(new o83(this));
        this.f6773c.setOnFocusChangeListener(new p83(this));
        this.f6775d.setOnFocusChangeListener(new n83(this));
        EditText editText = this.f6756a;
        editText.addTextChangedListener(new ye1(editText, this.f6769b));
        EditText editText2 = this.f6769b;
        editText2.addTextChangedListener(new ye1(editText2, this.f6773c));
        EditText editText3 = this.f6773c;
        editText3.addTextChangedListener(new ye1(editText3, this.f6775d));
        this.f6775d.addTextChangedListener(new C1280e());
        EditText editText4 = this.f6756a;
        editText4.setOnKeyListener(new ve1(editText4, (View) null, this.f6769b));
        EditText editText5 = this.f6769b;
        editText5.setOnKeyListener(new ve1(editText5, this.f6756a, this.f6773c));
        EditText editText6 = this.f6773c;
        editText6.setOnKeyListener(new ve1(editText6, this.f6769b, this.f6775d));
        EditText editText7 = this.f6775d;
        editText7.setOnKeyListener(new ve1(editText7, this.f6773c, (View) null));
        this.f6761a.mo11241Y(new C1281f());
    }

    public void onPause() {
        this.f6767a.mo48895h();
        this.f6756a.setText(pj0.m61166a(-64599615444807L));
        this.f6769b.setText(pj0.m61166a(-64603910412103L));
        this.f6773c.setText(pj0.m61166a(-64608205379399L));
        this.f6775d.setText(pj0.m61166a(-64612500346695L));
        super.onPause();
    }

    public void onRequestPermissionsResult(int i, @mr2 String[] strArr, @mr2 int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 123) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(pj0.m61166a(-63126441662279L));
            builder.setMessage(pj0.m61166a(-63233815844679L));
            builder.setPositiveButton(pj0.m61166a(-63517283686215L), new C1282g());
            builder.setNegativeButton(pj0.m61166a(-63538758522695L), new C1283h());
            boolean z = false;
            builder.setCancelable(false);
            boolean z2 = false;
            boolean z3 = false;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (strArr[i2].equalsIgnoreCase(pj0.m61166a(-63551643424583L))) {
                    if (iArr[i2] >= 0) {
                        z2 = true;
                    } else if (r70.m26348a(getApplicationContext(), pj0.m61166a(-63723442116423L)) != 0) {
                        builder.show();
                        Toast.makeText(this, pj0.m61166a(-63895240808263L), 0).show();
                    }
                }
                if (strArr[i2].equalsIgnoreCase(pj0.m61166a(-64011204925255L))) {
                    if (iArr[i2] >= 0) {
                        z3 = true;
                    } else if (r70.m26348a(getApplicationContext(), pj0.m61166a(-64122874074951L)) != 0) {
                        builder.show();
                        Toast.makeText(this, pj0.m61166a(-64234543224647L), 0).show();
                    }
                }
            }
            if (z2) {
                mo7796N1();
            }
            if (z2 && z3) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            this.f6772b = valueOf;
            if (valueOf.booleanValue()) {
                mo7803i2();
            }
        }
    }

    public void onResume() {
        super.onResume();
        Bundle bundle = this.f6754a;
        if (bundle != null) {
            this.f6781g = bundle.getString(pj0.m61166a(-64552370804551L), pj0.m61166a(-64591025510215L));
        }
        if (this.f6780f && f6748k) {
            mo7803i2();
        }
    }
}
