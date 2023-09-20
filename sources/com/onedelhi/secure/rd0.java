package com.onedelhi.secure;

public enum rd0 {
    DATA_MASK_000 {
        /* renamed from: a */
        public boolean mo43850a(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    },
    DATA_MASK_001 {
        /* renamed from: a */
        public boolean mo43850a(int i, int i2) {
            return (i & 1) == 0;
        }
    },
    DATA_MASK_010 {
        /* renamed from: a */
        public boolean mo43850a(int i, int i2) {
            return i2 % 3 == 0;
        }
    },
    DATA_MASK_011 {
        /* renamed from: a */
        public boolean mo43850a(int i, int i2) {
            return (i + i2) % 3 == 0;
        }
    },
    DATA_MASK_100 {
        /* renamed from: a */
        public boolean mo43850a(int i, int i2) {
            return (((i / 2) + (i2 / 3)) & 1) == 0;
        }
    },
    DATA_MASK_101 {
        /* renamed from: a */
        public boolean mo43850a(int i, int i2) {
            return (i * i2) % 6 == 0;
        }
    },
    DATA_MASK_110 {
        /* renamed from: a */
        public boolean mo43850a(int i, int i2) {
            return (i * i2) % 6 < 3;
        }
    },
    DATA_MASK_111 {
        /* renamed from: a */
        public boolean mo43850a(int i, int i2) {
            return (((i + i2) + ((i * i2) % 3)) & 1) == 0;
        }
    };

    /* renamed from: a */
    public abstract boolean mo43850a(int i, int i2);

    /* renamed from: b */
    public final void mo43851b(C6190nl nlVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (mo43850a(i2, i3)) {
                    nlVar.mo41084d(i3, i2);
                }
            }
        }
    }
}
