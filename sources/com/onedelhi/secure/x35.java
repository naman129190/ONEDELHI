package com.onedelhi.secure;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

public final class x35 implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((Scope) obj).getScopeUri().compareTo(((Scope) obj2).getScopeUri());
    }
}
