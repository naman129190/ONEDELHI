package androidx.legacy.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import com.onedelhi.secure.jg3;

@Deprecated
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final SparseArray<PowerManager.WakeLock> f4020a = new SparseArray<>();

    /* renamed from: b */
    public static final String f4021b = "androidx.contentpager.content.wakelockid";

    /* renamed from: n */
    public static int f4022n = 1;

    /* renamed from: b */
    public static boolean m4719b(Intent intent) {
        int intExtra = intent.getIntExtra(f4021b, 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f4020a;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }

    /* renamed from: c */
    public static ComponentName m4720c(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f4020a;
        synchronized (sparseArray) {
            int i = f4022n;
            int i2 = i + 1;
            f4022n = i2;
            if (i2 <= 0) {
                f4022n = 1;
            }
            intent.putExtra(f4021b, i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(jg3.f30769e);
            sparseArray.put(i, newWakeLock);
            return startService;
        }
    }
}
