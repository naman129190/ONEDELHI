package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Comparator;

public final class xm6 implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        fk0 fk0 = (fk0) obj;
        fk0 fk02 = (fk0) obj2;
        Preconditions.checkNotNull(fk0);
        Preconditions.checkNotNull(fk02);
        int compareTo = Integer.valueOf(fk02.mo16025K2()).compareTo(Integer.valueOf(fk0.mo16025K2()));
        return compareTo == 0 ? Integer.valueOf(fk0.mo16026L2()).compareTo(Integer.valueOf(fk02.mo16026L2())) : compareTo;
    }
}
