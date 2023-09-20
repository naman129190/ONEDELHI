package com.google.android.gms.common.data;

import com.onedelhi.secure.mr2;
import java.util.ArrayList;

public final class FreezableUtils {
    @mr2
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@mr2 ArrayList<E> arrayList) {
        ArrayList<T> arrayList2 = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((Freezable) arrayList.get(i)).freeze());
        }
        return arrayList2;
    }

    @mr2
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@mr2 E[] eArr) {
        ArrayList<T> arrayList = new ArrayList<>(eArr.length);
        for (E freeze : eArr) {
            arrayList.add(freeze.freeze());
        }
        return arrayList;
    }

    @mr2
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(@mr2 Iterable<E> iterable) {
        ArrayList<T> arrayList = new ArrayList<>();
        for (E freeze : iterable) {
            arrayList.add(freeze.freeze());
        }
        return arrayList;
    }
}
