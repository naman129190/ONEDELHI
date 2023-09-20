package androidx.lifecycle;

import com.onedelhi.secure.bc2;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.z22;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.lifecycle.e */
public abstract class C0690e {
    @mr2
    @hl3({hl3.C2354a.f13187b})

    /* renamed from: a */
    public AtomicReference<Object> f4077a = new AtomicReference<>();

    /* renamed from: androidx.lifecycle.e$a */
    public static /* synthetic */ class C0691a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4078a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f4079b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0083 */
        static {
            /*
                androidx.lifecycle.e$b[] r0 = androidx.lifecycle.C0690e.C0692b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4079b = r0
                r1 = 1
                androidx.lifecycle.e$b r2 = androidx.lifecycle.C0690e.C0692b.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f4079b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.e$b r3 = androidx.lifecycle.C0690e.C0692b.ON_STOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f4079b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.e$b r4 = androidx.lifecycle.C0690e.C0692b.ON_START     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f4079b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.e$b r5 = androidx.lifecycle.C0690e.C0692b.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f4079b     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.e$b r6 = androidx.lifecycle.C0690e.C0692b.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r5 = f4079b     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.e$b r6 = androidx.lifecycle.C0690e.C0692b.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r5 = f4079b     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.e$b r6 = androidx.lifecycle.C0690e.C0692b.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7 = 7
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                androidx.lifecycle.e$c[] r5 = androidx.lifecycle.C0690e.C0693c.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f4078a = r5
                androidx.lifecycle.e$c r6 = androidx.lifecycle.C0690e.C0693c.CREATED     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                int[] r1 = f4078a     // Catch:{ NoSuchFieldError -> 0x006f }
                androidx.lifecycle.e$c r5 = androidx.lifecycle.C0690e.C0693c.STARTED     // Catch:{ NoSuchFieldError -> 0x006f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r0 = f4078a     // Catch:{ NoSuchFieldError -> 0x0079 }
                androidx.lifecycle.e$c r1 = androidx.lifecycle.C0690e.C0693c.RESUMED     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r0 = f4078a     // Catch:{ NoSuchFieldError -> 0x0083 }
                androidx.lifecycle.e$c r1 = androidx.lifecycle.C0690e.C0693c.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f4078a     // Catch:{ NoSuchFieldError -> 0x008d }
                androidx.lifecycle.e$c r1 = androidx.lifecycle.C0690e.C0693c.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0690e.C0691a.<clinit>():void");
        }
    }

    /* renamed from: androidx.lifecycle.e$b */
    public enum C0692b {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        @ts2
        /* renamed from: a */
        public static C0692b m4791a(@mr2 C0693c cVar) {
            int i = C0691a.f4078a[cVar.ordinal()];
            if (i == 1) {
                return ON_DESTROY;
            }
            if (i == 2) {
                return ON_STOP;
            }
            if (i != 3) {
                return null;
            }
            return ON_PAUSE;
        }

        @ts2
        /* renamed from: b */
        public static C0692b m4792b(@mr2 C0693c cVar) {
            int i = C0691a.f4078a[cVar.ordinal()];
            if (i == 1) {
                return ON_STOP;
            }
            if (i == 2) {
                return ON_PAUSE;
            }
            if (i != 4) {
                return null;
            }
            return ON_DESTROY;
        }

        @ts2
        /* renamed from: g */
        public static C0692b m4793g(@mr2 C0693c cVar) {
            int i = C0691a.f4078a[cVar.ordinal()];
            if (i == 1) {
                return ON_START;
            }
            if (i == 2) {
                return ON_RESUME;
            }
            if (i != 5) {
                return null;
            }
            return ON_CREATE;
        }

        @ts2
        /* renamed from: l */
        public static C0692b m4794l(@mr2 C0693c cVar) {
            int i = C0691a.f4078a[cVar.ordinal()];
            if (i == 1) {
                return ON_CREATE;
            }
            if (i == 2) {
                return ON_START;
            }
            if (i != 3) {
                return null;
            }
            return ON_RESUME;
        }

        @mr2
        /* renamed from: e */
        public C0693c mo4961e() {
            switch (C0691a.f4079b[ordinal()]) {
                case 1:
                case 2:
                    return C0693c.CREATED;
                case 3:
                case 4:
                    return C0693c.STARTED;
                case 5:
                    return C0693c.RESUMED;
                case 6:
                    return C0693c.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.e$c */
    public enum C0693c {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean mo4962a(@mr2 C0693c cVar) {
            return compareTo(cVar) >= 0;
        }
    }

    @bc2
    /* renamed from: a */
    public abstract void mo4958a(@mr2 z22 z22);

    @bc2
    @mr2
    /* renamed from: b */
    public abstract C0693c mo4959b();

    @bc2
    /* renamed from: c */
    public abstract void mo4960c(@mr2 z22 z22);
}
