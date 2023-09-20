package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import com.onedelhi.secure.g55;
import java.util.concurrent.ExecutorService;

public final class zabj {
    private static final ExecutorService zaa = g55.m15529a().mo14529b(2, new NumberedThreadFactory("GAC_Executor"), 2);

    public static ExecutorService zaa() {
        return zaa;
    }
}
