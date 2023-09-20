package com.onedelhi.secure;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

public final class ji5 {

    /* renamed from: a */
    public final long f14182a;

    /* renamed from: a */
    public final hj5 f14183a;

    /* renamed from: a */
    public final String f14184a;

    /* renamed from: b */
    public final long f14185b;

    /* renamed from: b */
    public final String f14186b;

    /* renamed from: c */
    public final String f14187c;

    public ji5(za6 za6, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        hj5 hj5;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.f14184a = str2;
        this.f14186b = str3;
        this.f14187c = true == TextUtils.isEmpty(str) ? null : str;
        this.f14182a = j;
        this.f14185b = j2;
        if (j2 != 0 && j2 > j) {
            za6.mo15136e().mo12731w().mo25380b("Event created with reverse previous/current timestamps. appId", a56.m10802z(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            hj5 = new hj5(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    za6.mo15136e().mo12726r().mo25379a("Param name can't be null");
                } else {
                    Object o = za6.mo27871N().mo16882o(str4, bundle2.get(str4));
                    if (o == null) {
                        za6.mo15136e().mo12731w().mo25380b("Param value can't be null", za6.mo27862D().mo19281e(str4));
                    } else {
                        za6.mo27871N().mo16853D(bundle2, str4, o);
                    }
                }
                it.remove();
            }
            hj5 = new hj5(bundle2);
        }
        this.f14183a = hj5;
    }

    public ji5(za6 za6, String str, String str2, String str3, long j, long j2, hj5 hj5) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(hj5);
        this.f14184a = str2;
        this.f14186b = str3;
        this.f14187c = true == TextUtils.isEmpty(str) ? null : str;
        this.f14182a = j;
        this.f14185b = j2;
        if (j2 != 0 && j2 > j) {
            za6.mo15136e().mo12731w().mo25381c("Event created with reverse previous/current timestamps. appId, name", a56.m10802z(str2), a56.m10802z(str3));
        }
        this.f14183a = hj5;
    }

    /* renamed from: a */
    public final ji5 mo18440a(za6 za6, long j) {
        return new ji5(za6, this.f14187c, this.f14184a, this.f14186b, this.f14182a, j, this.f14183a);
    }

    public final String toString() {
        String str = this.f14184a;
        String str2 = this.f14186b;
        String obj = this.f14183a.toString();
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + obj + "}";
    }
}
