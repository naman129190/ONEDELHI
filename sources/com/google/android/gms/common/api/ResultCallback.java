package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.onedelhi.secure.mr2;

public interface ResultCallback<R extends Result> {
    void onResult(@mr2 R r);
}
