package com.onedelhi.secure;

import java.util.concurrent.Callable;

public final /* synthetic */ class m86 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ b96 f15949a;

    /* renamed from: a */
    public final /* synthetic */ String f15950a;

    public /* synthetic */ m86(b96 b96, String str) {
        this.f15949a = b96;
        this.f15950a = str;
    }

    public final Object call() {
        return new v27("internal.appMetadata", new g86(this.f15949a, this.f15950a));
    }
}
