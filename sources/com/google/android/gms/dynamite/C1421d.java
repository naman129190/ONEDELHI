package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.d */
public final class C1421d implements DynamiteModule.C1415b {
    /* renamed from: a */
    public final DynamiteModule.C1415b.C1417b mo10409a(Context context, String str, DynamiteModule.C1415b.C1416a aVar) throws DynamiteModule.C1414a {
        DynamiteModule.C1415b.C1417b bVar = new DynamiteModule.C1415b.C1417b();
        int a = aVar.mo10410a(context, str, false);
        bVar.f7399b = a;
        if (a == 0) {
            bVar.f7400c = 0;
        } else {
            bVar.f7400c = 1;
        }
        return bVar;
    }
}
