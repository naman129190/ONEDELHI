package com.onedelhi.secure;

import com.onedelhi.secure.hl3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public abstract class xu0<T> extends yx3 {
    public xu0(ym3 ym3) {
        super(ym3);
    }

    public abstract void bind(s74 s74, T t);

    public final void insert(Iterable<? extends T> iterable) {
        s74 acquire = acquire();
        try {
            for (Object bind : iterable) {
                bind(acquire, bind);
                acquire.mo13597F2();
            }
        } finally {
            release(acquire);
        }
    }

    public final void insert(T t) {
        s74 acquire = acquire();
        try {
            bind(acquire, t);
            acquire.mo13597F2();
        } finally {
            release(acquire);
        }
    }

    public final void insert(T[] tArr) {
        s74 acquire = acquire();
        try {
            for (T bind : tArr) {
                bind(acquire, bind);
                acquire.mo13597F2();
            }
        } finally {
            release(acquire);
        }
    }

    public final long insertAndReturnId(T t) {
        s74 acquire = acquire();
        try {
            bind(acquire, t);
            return acquire.mo13597F2();
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<? extends T> collection) {
        s74 acquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            int i = 0;
            for (Object bind : collection) {
                bind(acquire, bind);
                jArr[i] = acquire.mo13597F2();
                i++;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(T[] tArr) {
        s74 acquire = acquire();
        try {
            long[] jArr = new long[tArr.length];
            int i = 0;
            for (T bind : tArr) {
                bind(acquire, bind);
                jArr[i] = acquire.mo13597F2();
                i++;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<? extends T> collection) {
        s74 acquire = acquire();
        try {
            Long[] lArr = new Long[collection.size()];
            int i = 0;
            for (Object bind : collection) {
                bind(acquire, bind);
                lArr[i] = Long.valueOf(acquire.mo13597F2());
                i++;
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(T[] tArr) {
        s74 acquire = acquire();
        try {
            Long[] lArr = new Long[tArr.length];
            int i = 0;
            for (T bind : tArr) {
                bind(acquire, bind);
                lArr[i] = Long.valueOf(acquire.mo13597F2());
                i++;
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<? extends T> collection) {
        s74 acquire = acquire();
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            int i = 0;
            for (Object bind : collection) {
                bind(acquire, bind);
                arrayList.add(i, Long.valueOf(acquire.mo13597F2()));
                i++;
            }
            return arrayList;
        } finally {
            release(acquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(T[] tArr) {
        s74 acquire = acquire();
        try {
            ArrayList arrayList = new ArrayList(tArr.length);
            int i = 0;
            for (T bind : tArr) {
                bind(acquire, bind);
                arrayList.add(i, Long.valueOf(acquire.mo13597F2()));
                i++;
            }
            return arrayList;
        } finally {
            release(acquire);
        }
    }
}
