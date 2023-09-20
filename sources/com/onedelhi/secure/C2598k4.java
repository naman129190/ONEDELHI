package com.onedelhi.secure;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* renamed from: com.onedelhi.secure.k4 */
public class C2598k4 implements ky4 {

    /* renamed from: a */
    public static final String f14733a = "AlarmManagerScheduler";

    /* renamed from: b */
    public static final String f14734b = "attemptNumber";

    /* renamed from: c */
    public static final String f14735c = "backendName";

    /* renamed from: d */
    public static final String f14736d = "priority";

    /* renamed from: e */
    public static final String f14737e = "extras";

    /* renamed from: a */
    public AlarmManager f14738a;

    /* renamed from: a */
    public final Context f14739a;

    /* renamed from: a */
    public final aw0 f14740a;

    /* renamed from: a */
    public final C2106ez f14741a;

    /* renamed from: a */
    public final pr3 f14742a;

    @hw4
    public C2598k4(Context context, aw0 aw0, AlarmManager alarmManager, C2106ez ezVar, pr3 pr3) {
        this.f14739a = context;
        this.f14740a = aw0;
        this.f14738a = alarmManager;
        this.f14741a = ezVar;
        this.f14742a = pr3;
    }

    public C2598k4(Context context, aw0 aw0, C2106ez ezVar, pr3 pr3) {
        this(context, aw0, (AlarmManager) context.getSystemService(es2.f11372W), ezVar, pr3);
    }

    /* renamed from: a */
    public void mo18889a(xh4 xh4, int i) {
        mo18890b(xh4, i, false);
    }

    /* renamed from: b */
    public void mo18890b(xh4 xh4, int i, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", xh4.mo23177b());
        builder.appendQueryParameter("priority", String.valueOf(h53.m16479a(xh4.mo23179d())));
        if (xh4.mo23178c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(xh4.mo23178c(), 0));
        }
        Intent intent = new Intent(this.f14739a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (z || !mo18891c(intent)) {
            long K1 = this.f14740a.mo13294K1(xh4);
            long h = this.f14742a.mo22613h(xh4.mo23179d(), K1, i);
            r92.m26531e(f14733a, "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", xh4, Long.valueOf(h), Long.valueOf(K1), Integer.valueOf(i));
            this.f14738a.set(3, this.f14741a.mo15656a() + h, PendingIntent.getBroadcast(this.f14739a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
            return;
        }
        r92.m26529c(f14733a, "Upload for context %s is already scheduled. Returning...", xh4);
    }

    @hw4
    /* renamed from: c */
    public boolean mo18891c(Intent intent) {
        return PendingIntent.getBroadcast(this.f14739a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 603979776 : bi2.f26359j) != null;
    }
}
