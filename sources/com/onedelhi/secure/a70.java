package com.onedelhi.secure;

import android.content.ClipData;
import java.util.function.Predicate;

public final /* synthetic */ class a70 implements o43 {

    /* renamed from: a */
    public final /* synthetic */ Predicate f25767a;

    public /* synthetic */ a70(Predicate predicate) {
        this.f25767a = predicate;
    }

    /* renamed from: a */
    public final boolean mo21599a(Object obj) {
        return this.f25767a.test((ClipData.Item) obj);
    }
}
