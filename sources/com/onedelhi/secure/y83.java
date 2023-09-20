package com.onedelhi.secure;

import android.util.SparseArray;

public enum y83 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: a */
    public static final SparseArray<y83> f22931a = null;

    /* renamed from: n */
    public final int f22939n;

    /* access modifiers changed from: public */
    static {
        y83 y83;
        y83 y832;
        y83 y833;
        y83 y834;
        y83 y835;
        y83 y836;
        SparseArray<y83> sparseArray = new SparseArray<>();
        f22931a = sparseArray;
        sparseArray.put(0, y83);
        sparseArray.put(1, y832);
        sparseArray.put(2, y833);
        sparseArray.put(3, y834);
        sparseArray.put(4, y835);
        sparseArray.put(-1, y836);
    }

    /* access modifiers changed from: public */
    y83(int i) {
        this.f22939n = i;
    }

    @ts2
    /* renamed from: a */
    public static y83 m32002a(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return UNMETERED_ONLY;
        }
        if (i == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i != 4) {
            return null;
        }
        return NEVER;
    }

    /* renamed from: j */
    public final int mo27246j() {
        return this.f22939n;
    }
}
