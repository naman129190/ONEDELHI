package com.delhitransport.onedelhi.activities;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.delhitransport.onedelhi.others.NotificationResponse;
import com.delhitransport.onedelhi.others.Notifications;
import com.delhitransport.onedelhi.viewmodels.NotificationViewModel;
import com.google.android.gms.common.C1410R;
import com.onedelhi.secure.as2;
import com.onedelhi.secure.fj1;
import com.onedelhi.secure.ls2;
import com.onedelhi.secure.ms2;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.rf4;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

public class NotificationsActivity extends BaseActivity {

    /* renamed from: a */
    public ProgressDialog f6607a;

    /* renamed from: a */
    public SharedPreferences.Editor f6608a;

    /* renamed from: a */
    public SharedPreferences f6609a;

    /* renamed from: a */
    public CountDownTimer f6610a;

    /* renamed from: a */
    public as2 f6611a;

    /* renamed from: a */
    public SimpleDateFormat f6612a = new SimpleDateFormat(pj0.m61166a(-47256537503559L), Locale.ENGLISH);

    /* renamed from: a */
    public ArrayList<Notifications> f6613a;

    /* renamed from: e */
    public boolean f6614e = false;

    /* renamed from: com.delhitransport.onedelhi.activities.NotificationsActivity$a */
    public class C1267a extends CountDownTimer {
        public C1267a(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            if (NotificationsActivity.this.f6607a != null) {
                NotificationsActivity.this.f6607a.dismiss();
            }
            NotificationsActivity notificationsActivity = NotificationsActivity.this;
            Toast.makeText(notificationsActivity, notificationsActivity.getResources().getString(C1410R.string.some_error_occurred), 0).show();
            NotificationsActivity.this.onBackPressed();
        }

        public void onTick(long j) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public /* synthetic */ void m8106l1(NotificationResponse notificationResponse) {
        if (notificationResponse != null) {
            if (notificationResponse.getMessage().equalsIgnoreCase(pj0.m61166a(-47819178219335L))) {
                this.f6613a.clear();
                Iterator<Notifications> it = notificationResponse.getData().iterator();
                while (it.hasNext()) {
                    Notifications next = it.next();
                    this.f6613a.add(new Notifications(next.getNotification(), next.getUrl(), next.getTime()));
                }
            }
            mo7751i1();
        }
        this.f6613a.clear();
        this.f6613a.add(new Notifications(pj0.m61166a(-47853537957703L), pj0.m61166a(-47969502074695L), pj0.m61166a(-47973797041991L)));
        this.f6611a.mo5717m();
        mo7751i1();
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public /* synthetic */ void m8107m1(View view) {
        onBackPressed();
    }

    /* renamed from: i1 */
    public void mo7751i1() {
        CountDownTimer countDownTimer = this.f6610a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        ProgressDialog progressDialog = this.f6607a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    /* renamed from: j1 */
    public final void mo7752j1() {
        this.f6614e = true;
        mo7755o1();
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f6607a = progressDialog;
        progressDialog.setMessage(pj0.m61166a(-47531415410503L));
        this.f6607a.show();
        new NotificationViewModel().getAllNotifications().mo4926j(this, new ms2(this));
        this.f6608a.putString(pj0.m61166a(-47582955018055L), this.f6612a.format(new Date()));
        this.f6608a.apply();
    }

    /* renamed from: k1 */
    public final void mo7753k1() {
        Collection stringSet = this.f6609a.getStringSet(pj0.m61166a(-47737573840711L), (Set) null);
        if (stringSet == null) {
            stringSet = new HashSet();
        }
        ArrayList arrayList = new ArrayList(stringSet);
        fj1 fj1 = new fj1();
        for (int i = 0; i < arrayList.size(); i++) {
            this.f6613a.add((Notifications) fj1.mo36012n((String) arrayList.get(i), Notifications.class));
        }
        this.f6613a.size();
        Collections.sort(this.f6613a, new Notifications.NotificationComparator());
        this.f6611a.mo5717m();
    }

    /* renamed from: n1 */
    public final void mo7754n1(ArrayList<Notifications> arrayList) {
        fj1 fj1 = new fj1();
        HashSet hashSet = new HashSet();
        Iterator<Notifications> it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add(fj1.mo36024z(it.next()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f6608a.putStringSet(pj0.m61166a(-47677444298567L), hashSet);
        this.f6608a.apply();
    }

    /* renamed from: o1 */
    public void mo7755o1() {
        C1267a aVar = new C1267a(rf4.f19824c, 1000);
        this.f6610a = aVar;
        aVar.start();
    }

    @SuppressLint({"CommitPrefEdits"})
    public void onCreate(Bundle bundle) {
        setRequestedOrientation(1);
        super.onCreate(bundle);
        setContentView((int) C1410R.layout.activity_notifications);
        SharedPreferences sharedPreferences = getSharedPreferences(pj0.m61166a(-47320962012999L), 0);
        this.f6609a = sharedPreferences;
        this.f6608a = sharedPreferences.edit();
        this.f6613a = new ArrayList<>();
        RecyclerView recyclerView = (RecyclerView) findViewById(C1410R.C1412id.rv_notification_list);
        this.f6611a = new as2(this, this.f6613a);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(this.f6611a);
        this.f6613a.add(new Notifications(pj0.m61166a(-47406861358919L), pj0.m61166a(-47522825475911L), pj0.m61166a(-47527120443207L)));
        this.f6611a.mo5717m();
        ((ImageButton) findViewById(C1410R.C1412id.ib_back)).setOnClickListener(new ls2(this));
    }

    public void onDestroy() {
        mo7751i1();
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        if (!this.f6614e) {
            mo7752j1();
        }
    }
}
