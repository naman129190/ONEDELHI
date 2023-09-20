package com.google.gson.internal.bind;

import com.onedelhi.secure.cj4;
import com.onedelhi.secure.dj4;
import com.onedelhi.secure.ew1;
import com.onedelhi.secure.fj1;
import com.onedelhi.secure.fw1;
import com.onedelhi.secure.gf4;
import com.onedelhi.secure.hf4;
import com.onedelhi.secure.lw1;
import com.onedelhi.secure.tj4;
import com.onedelhi.secure.xv1;
import java.io.IOException;

public final class NumberTypeAdapter extends cj4<Number> {

    /* renamed from: a */
    public static final dj4 f25459a = m35328k(gf4.LAZILY_PARSED_NUMBER);

    /* renamed from: a */
    public final hf4 f25460a;

    /* renamed from: com.google.gson.internal.bind.NumberTypeAdapter$a */
    public static /* synthetic */ class C4389a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25462a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.onedelhi.secure.fw1[] r0 = com.onedelhi.secure.fw1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25462a = r0
                com.onedelhi.secure.fw1 r1 = com.onedelhi.secure.fw1.NULL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25462a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.fw1 r1 = com.onedelhi.secure.fw1.NUMBER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25462a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.fw1 r1 = com.onedelhi.secure.fw1.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.NumberTypeAdapter.C4389a.<clinit>():void");
        }
    }

    public NumberTypeAdapter(hf4 hf4) {
        this.f25460a = hf4;
    }

    /* renamed from: j */
    public static dj4 m35327j(hf4 hf4) {
        return hf4 == gf4.LAZILY_PARSED_NUMBER ? f25459a : m35328k(hf4);
    }

    /* renamed from: k */
    public static dj4 m35328k(hf4 hf4) {
        return new dj4() {
            /* renamed from: a */
            public <T> cj4<T> mo30126a(fj1 fj1, tj4<T> tj4) {
                if (tj4.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    /* renamed from: l */
    public Number mo30144e(xv1 xv1) throws IOException {
        fw1 q0 = xv1.mo36944q0();
        int i = C4389a.f25462a[q0.ordinal()];
        if (i == 1) {
            xv1.mo36940j0();
            return null;
        } else if (i == 2 || i == 3) {
            return this.f25460a.mo36699a(xv1);
        } else {
            throw new ew1("Expecting number, got: " + q0 + "; at path " + xv1.mo36935f0());
        }
    }

    /* renamed from: m */
    public void mo30145i(lw1 lw1, Number number) throws IOException {
        lw1.mo37579F0(number);
    }
}
