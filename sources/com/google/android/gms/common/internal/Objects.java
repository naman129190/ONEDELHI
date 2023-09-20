package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.C7277xt;
import com.onedelhi.secure.a13;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@KeepForSdk
public final class Objects {

    @KeepForSdk
    public static final class ToStringHelper {
        private final List zza = new ArrayList();
        private final Object zzb;

        public /* synthetic */ ToStringHelper(Object obj, zzai zzai) {
            Preconditions.checkNotNull(obj);
            this.zzb = obj;
        }

        @mr2
        @KeepForSdk
        @C7277xt
        public ToStringHelper add(@mr2 String str, @ts2 Object obj) {
            List list = this.zza;
            Preconditions.checkNotNull(str);
            String valueOf = String.valueOf(obj);
            list.add(str + a13.f25713a + valueOf);
            return this;
        }

        @mr2
        @KeepForSdk
        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.zzb.getClass().getSimpleName());
            sb.append('{');
            int size = this.zza.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.zza.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static boolean checkBundlesEquality(@mr2 Bundle bundle, @mr2 Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : keySet) {
            if (!equal(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    @KeepForSdk
    public static boolean equal(@ts2 Object obj, @ts2 Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    @KeepForSdk
    public static int hashCode(@mr2 Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @mr2
    @KeepForSdk
    public static ToStringHelper toStringHelper(@mr2 Object obj) {
        return new ToStringHelper(obj, (zzai) null);
    }
}
