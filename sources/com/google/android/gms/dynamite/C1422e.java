package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.e */
public final class C1422e implements DynamiteModule.C1415b {
    /* renamed from: a */
    public final DynamiteModule.C1415b.C1417b mo10409a(Context context, String str, DynamiteModule.C1415b.C1416a aVar) throws DynamiteModule.C1414a {
        DynamiteModule.C1415b.C1417b bVar = new DynamiteModule.C1415b.C1417b();
        bVar.f7398a = aVar.mo10411b(context, str);
        int a = aVar.mo10410a(context, str, true);
        bVar.f7399b = a;
        int i = bVar.f7398a;
        if (i == 0) {
            if (a == 0) {
                bVar.f7400c = 0;
                return bVar;
            }
            i = 0;
        }
        if (i >= a) {
            bVar.f7400c = -1;
        } else {
            bVar.f7400c = 1;
        }
        return bVar;
    }
}
