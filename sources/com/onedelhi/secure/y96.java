package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Comparator;

public final class y96 implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C3115p3 p3Var = (C3115p3) obj;
        C3115p3 p3Var2 = (C3115p3) obj2;
        Preconditions.checkNotNull(p3Var);
        Preconditions.checkNotNull(p3Var2);
        int K2 = p3Var.mo22223K2();
        int K22 = p3Var2.mo22223K2();
        if (K2 != K22) {
            return K2 >= K22 ? 1 : -1;
        }
        int L2 = p3Var.mo22224L2();
        int L22 = p3Var2.mo22224L2();
        if (L2 == L22) {
            return 0;
        }
        return L2 < L22 ? -1 : 1;
    }
}
