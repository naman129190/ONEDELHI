package com.delhitransport.onedelhi.fcm;

import android.app.ActivityManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.os.Build;
import com.delhitransport.onedelhi.activities.MainActivity;
import com.delhitransport.onedelhi.activities.SplashScreenActivity;
import com.google.android.gms.common.C1410R;
import com.google.firebase.messaging.C4323g;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.onedelhi.secure.bi2;
import com.onedelhi.secure.es2;
import com.onedelhi.secure.g74;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.sj3;
import java.util.List;
import java.util.Random;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: g */
    public final String f7041g = pj0.m61166a(-93186917766983L);

    /* renamed from: w */
    public static boolean m8517w(Context context, String str) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(pj0.m61166a(-93968601814855L))).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public void mo8305q(@mr2 C4323g gVar) {
        long j;
        String str;
        Intent intent;
        super.mo8305q(gVar);
        int nextInt = new Random().nextInt(3000);
        if (!m8517w(getApplicationContext(), pj0.m61166a(-93259932211015L))) {
            intent = new Intent(this, SplashScreenActivity.class);
            intent.addFlags(bi2.f26358i);
            str = pj0.m61166a(-93380191295303L);
            j = -93423140968263L;
        } else {
            intent = new Intent(getApplicationContext(), MainActivity.class);
            str = pj0.m61166a(-93440320837447L);
            j = -93483270510407L;
        }
        intent.putExtra(str, pj0.m61166a(j));
        PendingIntent activity = PendingIntent.getActivity(this, nextInt, intent, 201326592);
        NotificationManager notificationManager = (NotificationManager) getSystemService(pj0.m61166a(-93500450379591L));
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), C1410R.C1411drawable.one_delhi_color_logo);
        if (Build.VERSION.SDK_INT >= 26) {
            mo8306x(notificationManager);
        }
        es2.C2087g N = new es2.C2087g((Context) this, pj0.m61166a(-93556284954439L)).mo15431t0(C1410R.C1411drawable.one_logo).mo15397c0(decodeResource).mo15381P(gVar.mo29763L2().get(pj0.m61166a(-93629299398471L))).mo15380O(gVar.mo29763L2().get(pj0.m61166a(-93655069202247L))).mo15363D(true).mo15438x0(RingtoneManager.getDefaultUri(2)).mo15379N(activity);
        N.mo15375J(getResources().getColor(C1410R.color.bg_blue));
        notificationManager.notify(nextInt, N.mo15406h());
    }

    @sj3(api = 26)
    /* renamed from: x */
    public final void mo8306x(NotificationManager notificationManager) {
        String a = pj0.m61166a(-93689428940615L);
        String a2 = pj0.m61166a(-93762443384647L);
        NotificationChannel notificationChannel = new NotificationChannel(pj0.m61166a(-93895587370823L), a, 4);
        notificationChannel.setDescription(a2);
        notificationChannel.enableLights(true);
        notificationChannel.setLightColor(g74.f12468c);
        notificationChannel.enableVibration(true);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
}
