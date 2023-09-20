package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import com.onedelhi.secure.g55;
import java.util.concurrent.ExecutorService;

public final class zaco {
    private static final ExecutorService zaa = g55.m15529a().mo14528a(new NumberedThreadFactory("GAC_Transform"), 1);

    public static ExecutorService zaa() {
        return zaa;
    }
}
