package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.vs4;

@hl3({hl3.C2354a.f13185a})
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(vs4 vs4) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f3272a = (IconCompat) vs4.mo26275h0(remoteActionCompat.f3272a, 1);
        remoteActionCompat.f3273a = vs4.mo26311w(remoteActionCompat.f3273a, 2);
        remoteActionCompat.f3275b = vs4.mo26311w(remoteActionCompat.f3275b, 3);
        remoteActionCompat.f3271a = (PendingIntent) vs4.mo26246W(remoteActionCompat.f3271a, 4);
        remoteActionCompat.f3274a = vs4.mo26289m(remoteActionCompat.f3274a, 5);
        remoteActionCompat.f3276b = vs4.mo26289m(remoteActionCompat.f3276b, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, vs4 vs4) {
        vs4.mo26281j0(false, false);
        vs4.mo26291m1(remoteActionCompat.f3272a, 1);
        vs4.mo26318z0(remoteActionCompat.f3273a, 2);
        vs4.mo26318z0(remoteActionCompat.f3275b, 3);
        vs4.mo26249X0(remoteActionCompat.f3271a, 4);
        vs4.mo26293n0(remoteActionCompat.f3274a, 5);
        vs4.mo26293n0(remoteActionCompat.f3276b, 6);
    }
}
