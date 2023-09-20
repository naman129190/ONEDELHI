package com.google.android.gms.common.logging;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.vf4;
import java.util.Locale;

@KeepForSdk
public class Logger {
    private final String zza;
    private final String zzb;
    private final GmsLogger zzc;
    private final int zzd;

    @KeepForSdk
    public Logger(@mr2 String str, @mr2 String... strArr) {
        String str2;
        if (r0 == 0) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(vf4.f36537c);
                }
                sb.append(str3);
            }
            sb.append("] ");
            str2 = sb.toString();
        }
        this.zzb = str2;
        this.zza = str;
        this.zzc = new GmsLogger(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.zza, i)) {
            i++;
        }
        this.zzd = i;
    }

    @KeepForSdk
    /* renamed from: d */
    public void mo10165d(@mr2 String str, @mr2 Object... objArr) {
        if (isLoggable(3)) {
            Log.d(this.zza, format(str, objArr));
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public void mo10166e(@mr2 String str, @mr2 Throwable th, @mr2 Object... objArr) {
        Log.e(this.zza, format(str, objArr), th);
    }

    @KeepForSdk
    /* renamed from: e */
    public void mo10167e(@mr2 String str, @mr2 Object... objArr) {
        Log.e(this.zza, format(str, objArr));
    }

    @mr2
    @KeepForSdk
    public String format(@mr2 String str, @mr2 Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.zzb.concat(str);
    }

    @mr2
    @KeepForSdk
    public String getTag() {
        return this.zza;
    }

    @KeepForSdk
    /* renamed from: i */
    public void mo10170i(@mr2 String str, @mr2 Object... objArr) {
        Log.i(this.zza, format(str, objArr));
    }

    @KeepForSdk
    public boolean isLoggable(int i) {
        return this.zzd <= i;
    }

    @KeepForSdk
    /* renamed from: v */
    public void mo10172v(@mr2 String str, @mr2 Throwable th, @mr2 Object... objArr) {
        if (isLoggable(2)) {
            Log.v(this.zza, format(str, objArr), th);
        }
    }

    @KeepForSdk
    /* renamed from: v */
    public void mo10173v(@mr2 String str, @mr2 Object... objArr) {
        if (isLoggable(2)) {
            Log.v(this.zza, format(str, objArr));
        }
    }

    @KeepForSdk
    /* renamed from: w */
    public void mo10174w(@mr2 String str, @mr2 Object... objArr) {
        Log.w(this.zza, format(str, objArr));
    }

    @KeepForSdk
    public void wtf(@mr2 String str, @mr2 Throwable th, @mr2 Object... objArr) {
        Log.wtf(this.zza, format(str, objArr), th);
    }

    @KeepForSdk
    public void wtf(@mr2 Throwable th) {
        Log.wtf(this.zza, th);
    }
}
