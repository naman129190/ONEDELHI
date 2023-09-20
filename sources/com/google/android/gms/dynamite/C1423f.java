package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.f */
public final class C1423f implements DynamiteModule.C1415b {
    /* renamed from: a */
    public final DynamiteModule.C1415b.C1417b mo10409a(Context context, String str, DynamiteModule.C1415b.C1416a aVar) throws DynamiteModule.C1414a {
        DynamiteModule.C1415b.C1417b bVar = new DynamiteModule.C1415b.C1417b();
        int b = aVar.mo10411b(context, str);
        bVar.f7398a = b;
        int i = 0;
        int a = b != 0 ? aVar.mo10410a(context, str, false) : aVar.mo10410a(context, str, true);
        bVar.f7399b = a;
        int i2 = bVar.f7398a;
        if (i2 != 0) {
            i = i2;
        } else if (a == 0) {
            bVar.f7400c = 0;
            return bVar;
        }
        if (i >= a) {
            bVar.f7400c = -1;
        } else {
            bVar.f7400c = 1;
        }
        return bVar;
    }
}
