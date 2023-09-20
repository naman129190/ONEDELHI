package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.C1410R;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.ak4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@KeepForSdk
public class StringResourceValueReader {
    private final Resources zza;
    private final String zzb;

    public StringResourceValueReader(@mr2 Context context) {
        Preconditions.checkNotNull(context);
        Resources resources = context.getResources();
        this.zza = resources;
        this.zzb = resources.getResourcePackageName(C1410R.string.common_google_play_services_unknown_issue);
    }

    @KeepForSdk
    @ts2
    public String getString(@mr2 String str) {
        int identifier = this.zza.getIdentifier(str, ak4.C1709b.f9167e, this.zzb);
        if (identifier == 0) {
            return null;
        }
        return this.zza.getString(identifier);
    }
}
