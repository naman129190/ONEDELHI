package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.C3042oa;
import com.onedelhi.secure.C3679ua;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.vq1;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@KeepForSdk
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean isEmpty(@ts2 Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @mr2
    @vq1(imports = {"java.util.Collections"}, replacement = "Collections.emptyList()")
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.emptyList();
    }

    @mr2
    @vq1(imports = {"java.util.Collections"}, replacement = "Collections.singletonList(item)")
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@mr2 T t) {
        return Collections.singletonList(t);
    }

    @mr2
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@mr2 T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : Collections.singletonList(tArr[0]) : Collections.emptyList();
    }

    @mr2
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@mr2 K k, @mr2 V v, @mr2 K k2, @mr2 V v2, @mr2 K k3, @mr2 V v3) {
        Map zza = zza(3, false);
        zza.put(k, v);
        zza.put(k2, v2);
        zza.put(k3, v3);
        return Collections.unmodifiableMap(zza);
    }

    @mr2
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@mr2 K k, @mr2 V v, @mr2 K k2, @mr2 V v2, @mr2 K k3, @mr2 V v3, @mr2 K k4, @mr2 V v4, @mr2 K k5, @mr2 V v5, @mr2 K k6, @mr2 V v6) {
        Map zza = zza(6, false);
        zza.put(k, v);
        zza.put(k2, v2);
        zza.put(k3, v3);
        zza.put(k4, v4);
        zza.put(k5, v5);
        zza.put(k6, v6);
        return Collections.unmodifiableMap(zza);
    }

    @mr2
    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(@mr2 K[] kArr, @mr2 V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        } else if (length == 0) {
            return Collections.emptyMap();
        } else {
            if (length == 1) {
                return Collections.singletonMap(kArr[0], vArr[0]);
            }
            Map zza = zza(length, false);
            for (int i = 0; i < kArr.length; i++) {
                zza.put(kArr[i], vArr[i]);
            }
            return Collections.unmodifiableMap(zza);
        }
    }

    @mr2
    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i) {
        return i == 0 ? new C3679ua() : zzb(i, true);
    }

    @mr2
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@mr2 T t, @mr2 T t2, @mr2 T t3) {
        Set zzb = zzb(3, false);
        zzb.add(t);
        zzb.add(t2);
        zzb.add(t3);
        return Collections.unmodifiableSet(zzb);
    }

    @mr2
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@mr2 T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t = tArr[0];
            T t2 = tArr[1];
            Set zzb = zzb(2, false);
            zzb.add(t);
            zzb.add(t2);
            return Collections.unmodifiableSet(zzb);
        } else if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        } else {
            if (length != 4) {
                Set zzb2 = zzb(length, false);
                Collections.addAll(zzb2, tArr);
                return Collections.unmodifiableSet(zzb2);
            }
            T t3 = tArr[0];
            T t4 = tArr[1];
            T t5 = tArr[2];
            T t6 = tArr[3];
            Set zzb3 = zzb(4, false);
            zzb3.add(t3);
            zzb3.add(t4);
            zzb3.add(t5);
            zzb3.add(t6);
            return Collections.unmodifiableSet(zzb3);
        }
    }

    private static Map zza(int i, boolean z) {
        return i <= 256 ? new C3042oa(i) : new HashMap(i, 1.0f);
    }

    private static Set zzb(int i, boolean z) {
        if (i <= (true != z ? 256 : 128)) {
            return new C3679ua(i);
        }
        return new HashSet(i, true != z ? 1.0f : 0.75f);
    }
}
