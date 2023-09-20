package com.google.android.gms.common.internal;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.ja1;
import com.onedelhi.secure.ka1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@KeepForSdk
public final class GmsLogger {
    private final String zza;
    @ts2
    private final String zzb;

    @KeepForSdk
    public GmsLogger(@mr2 String str) {
        this(str, (String) null);
    }

    @KeepForSdk
    public GmsLogger(@mr2 String str, @ts2 String str2) {
        Preconditions.checkNotNull(str, "log tag cannot be null");
        Preconditions.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.zza = str;
        if (str2 == null || str2.length() <= 0) {
            this.zzb = null;
        } else {
            this.zzb = str2;
        }
    }

    private final String zza(String str) {
        String str2 = this.zzb;
        return str2 == null ? str : str2.concat(str);
    }

    @ja1
    private final String zzb(String str, Object... objArr) {
        String format = String.format(str, objArr);
        String str2 = this.zzb;
        return str2 == null ? format : str2.concat(format);
    }

    @KeepForSdk
    public boolean canLog(int i) {
        return Log.isLoggable(this.zza, i);
    }

    @KeepForSdk
    public boolean canLogPii() {
        return false;
    }

    @KeepForSdk
    /* renamed from: d */
    public void mo9999d(@mr2 String str, @mr2 String str2) {
        if (canLog(3)) {
            Log.d(str, zza(str2));
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public void mo10000d(@mr2 String str, @mr2 String str2, @mr2 Throwable th) {
        if (canLog(3)) {
            Log.d(str, zza(str2), th);
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public void mo10001e(@mr2 String str, @mr2 String str2) {
        if (canLog(6)) {
            Log.e(str, zza(str2));
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public void mo10002e(@mr2 String str, @mr2 String str2, @mr2 Throwable th) {
        if (canLog(6)) {
            Log.e(str, zza(str2), th);
        }
    }

    @KeepForSdk
    @ja1
    public void efmt(@mr2 String str, @mr2 @ka1 String str2, @mr2 Object... objArr) {
        if (canLog(6)) {
            Log.e(str, zzb(str2, objArr));
        }
    }

    @KeepForSdk
    /* renamed from: i */
    public void mo10004i(@mr2 String str, @mr2 String str2) {
        if (canLog(4)) {
            Log.i(str, zza(str2));
        }
    }

    @KeepForSdk
    /* renamed from: i */
    public void mo10005i(@mr2 String str, @mr2 String str2, @mr2 Throwable th) {
        if (canLog(4)) {
            Log.i(str, zza(str2), th);
        }
    }

    @KeepForSdk
    public void pii(@mr2 String str, @mr2 String str2) {
    }

    @KeepForSdk
    public void pii(@mr2 String str, @mr2 String str2, @mr2 Throwable th) {
    }

    @KeepForSdk
    /* renamed from: v */
    public void mo10008v(@mr2 String str, @mr2 String str2) {
        if (canLog(2)) {
            Log.v(str, zza(str2));
        }
    }

    @KeepForSdk
    /* renamed from: v */
    public void mo10009v(@mr2 String str, @mr2 String str2, @mr2 Throwable th) {
        if (canLog(2)) {
            Log.v(str, zza(str2), th);
        }
    }

    @KeepForSdk
    /* renamed from: w */
    public void mo10010w(@mr2 String str, @mr2 String str2) {
        if (canLog(5)) {
            Log.w(str, zza(str2));
        }
    }

    @KeepForSdk
    /* renamed from: w */
    public void mo10011w(@mr2 String str, @mr2 String str2, @mr2 Throwable th) {
        if (canLog(5)) {
            Log.w(str, zza(str2), th);
        }
    }

    @KeepForSdk
    @ja1
    public void wfmt(@mr2 String str, @mr2 @ka1 String str2, @mr2 Object... objArr) {
        if (canLog(5)) {
            Log.w(this.zza, zzb(str2, objArr));
        }
    }

    @KeepForSdk
    public void wtf(@mr2 String str, @mr2 String str2, @mr2 Throwable th) {
        if (canLog(7)) {
            Log.e(str, zza(str2), th);
            Log.wtf(str, zza(str2), th);
        }
    }
}
