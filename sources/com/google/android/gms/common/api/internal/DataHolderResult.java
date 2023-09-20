package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.onedelhi.secure.mr2;

@KeepForSdk
public abstract class DataHolderResult implements Result, Releasable {
    @mr2
    @KeepForSdk
    public final DataHolder mDataHolder;
    @mr2
    @KeepForSdk
    public final Status mStatus;

    @KeepForSdk
    public DataHolderResult(@mr2 DataHolder dataHolder) {
        this(dataHolder, new Status(dataHolder.getStatusCode()));
    }

    @KeepForSdk
    public DataHolderResult(@mr2 DataHolder dataHolder, @mr2 Status status) {
        this.mStatus = status;
        this.mDataHolder = dataHolder;
    }

    @mr2
    @KeepForSdk
    public Status getStatus() {
        return this.mStatus;
    }

    @KeepForSdk
    public void release() {
        DataHolder dataHolder = this.mDataHolder;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
