package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

public abstract class zag implements DialogInterface.OnClickListener {
    public static zag zab(Activity activity, @ts2 Intent intent, int i) {
        return new zad(intent, activity, i);
    }

    public static zag zac(@mr2 Fragment fragment, @ts2 Intent intent, int i) {
        return new zae(intent, fragment, i);
    }

    public static zag zad(@mr2 LifecycleFragment lifecycleFragment, @ts2 Intent intent, int i) {
        return new zaf(intent, lifecycleFragment, 2);
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            zaa();
        } catch (ActivityNotFoundException e) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e);
        } finally {
            dialogInterface.dismiss();
        }
    }

    public abstract void zaa();
}
