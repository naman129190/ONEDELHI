package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.b */
public final class C1419b implements DynamiteModule.C1415b {
    /* renamed from: a */
    public final DynamiteModule.C1415b.C1417b mo10409a(Context context, String str, DynamiteModule.C1415b.C1416a aVar) throws DynamiteModule.C1414a {
        DynamiteModule.C1415b.C1417b bVar = new DynamiteModule.C1415b.C1417b();
        int a = aVar.mo10410a(context, str, true);
        bVar.f7399b = a;
        if (a != 0) {
            bVar.f7400c = 1;
        } else {
            int b = aVar.mo10411b(context, str);
            bVar.f7398a = b;
            if (b != 0) {
                bVar.f7400c = -1;
            }
        }
        return bVar;
    }
}
