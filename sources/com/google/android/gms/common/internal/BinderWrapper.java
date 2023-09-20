package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.onedelhi.secure.mr2;

@KeepName
@KeepForSdk
public final class BinderWrapper implements Parcelable {
    @mr2
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new zzh();
    private final IBinder zza;

    @KeepForSdk
    public BinderWrapper(@mr2 IBinder iBinder) {
        this.zza = iBinder;
    }

    public /* synthetic */ BinderWrapper(Parcel parcel, zzi zzi) {
        this.zza = parcel.readStrongBinder();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(@mr2 Parcel parcel, int i) {
        parcel.writeStrongBinder(this.zza);
    }
}
