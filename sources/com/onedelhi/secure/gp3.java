package com.onedelhi.secure;

import android.database.sqlite.SQLiteDatabase;
import com.onedelhi.secure.C1738az;
import com.onedelhi.secure.gq3;
import java.util.Map;

public final /* synthetic */ class gp3 implements gq3.C2271b {

    /* renamed from: a */
    public final /* synthetic */ C1738az.C1739a f29255a;

    /* renamed from: a */
    public final /* synthetic */ gq3 f29256a;

    /* renamed from: a */
    public final /* synthetic */ String f29257a;

    /* renamed from: a */
    public final /* synthetic */ Map f29258a;

    public /* synthetic */ gp3(gq3 gq3, String str, Map map, C1738az.C1739a aVar) {
        this.f29256a = gq3;
        this.f29257a = str;
        this.f29258a = map;
        this.f29255a = aVar;
    }

    /* renamed from: a */
    public final Object mo16830a(Object obj) {
        return this.f29256a.m16072U1(this.f29257a, this.f29258a, this.f29255a, (SQLiteDatabase) obj);
    }
}
