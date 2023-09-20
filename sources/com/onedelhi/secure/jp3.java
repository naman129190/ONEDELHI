package com.onedelhi.secure;

import android.database.sqlite.SQLiteDatabase;
import com.onedelhi.secure.a92;
import com.onedelhi.secure.gq3;

public final /* synthetic */ class jp3 implements gq3.C2271b {

    /* renamed from: a */
    public final /* synthetic */ long f30900a;

    /* renamed from: a */
    public final /* synthetic */ a92.C1672b f30901a;

    /* renamed from: a */
    public final /* synthetic */ String f30902a;

    public /* synthetic */ jp3(String str, a92.C1672b bVar, long j) {
        this.f30902a = str;
        this.f30901a = bVar;
        this.f30900a = j;
    }

    /* renamed from: a */
    public final Object mo16830a(Object obj) {
        return gq3.m16088j2(this.f30902a, this.f30901a, this.f30900a, (SQLiteDatabase) obj);
    }
}
