package com.onedelhi.secure;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class df6 {

    /* renamed from: a */
    public long f10726a;

    /* renamed from: a */
    public final Context f10727a;
    @ts2

    /* renamed from: a */
    public nu5 f10728a;
    @ts2

    /* renamed from: a */
    public Boolean f10729a;
    @ts2

    /* renamed from: a */
    public final Long f10730a;
    @ts2

    /* renamed from: a */
    public String f10731a;

    /* renamed from: a */
    public boolean f10732a = true;
    @ts2

    /* renamed from: b */
    public String f10733b;
    @ts2

    /* renamed from: c */
    public String f10734c;
    @ts2

    /* renamed from: d */
    public String f10735d;

    @VisibleForTesting
    public df6(Context context, @ts2 nu5 nu5, @ts2 Long l) {
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f10727a = applicationContext;
        this.f10730a = l;
        if (nu5 != null) {
            this.f10728a = nu5;
            this.f10731a = nu5.f17605d;
            this.f10733b = nu5.f17604c;
            this.f10734c = nu5.f17601b;
            this.f10732a = nu5.f17602b;
            this.f10726a = nu5.f17603c;
            this.f10735d = nu5.f17606e;
            Bundle bundle = nu5.f17599a;
            if (bundle != null) {
                this.f10729a = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
