package androidx.lifecycle;

import androidx.lifecycle.C0690e;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.ac1;
import com.onedelhi.secure.mr2;

class FullLifecycleObserverAdapter implements C0694f {

    /* renamed from: a */
    public final C0694f f4024a;

    /* renamed from: a */
    public final ac1 f4025a;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    public static /* synthetic */ class C0677a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4026a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.lifecycle.e$b[] r0 = androidx.lifecycle.C0690e.C0692b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4026a = r0
                androidx.lifecycle.e$b r1 = androidx.lifecycle.C0690e.C0692b.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4026a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.e$b r1 = androidx.lifecycle.C0690e.C0692b.ON_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4026a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.e$b r1 = androidx.lifecycle.C0690e.C0692b.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4026a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.e$b r1 = androidx.lifecycle.C0690e.C0692b.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f4026a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.e$b r1 = androidx.lifecycle.C0690e.C0692b.ON_STOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f4026a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.e$b r1 = androidx.lifecycle.C0690e.C0692b.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f4026a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.e$b r1 = androidx.lifecycle.C0690e.C0692b.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FullLifecycleObserverAdapter.C0677a.<clinit>():void");
        }
    }

    public FullLifecycleObserverAdapter(ac1 ac1, C0694f fVar) {
        this.f4025a = ac1;
        this.f4024a = fVar;
    }

    /* renamed from: g */
    public void mo669g(@mr2 a32 a32, @mr2 C0690e.C0692b bVar) {
        switch (C0677a.f4026a[bVar.ordinal()]) {
            case 1:
                this.f4025a.mo4147e(a32);
                break;
            case 2:
                this.f4025a.mo4144b(a32);
                break;
            case 3:
                this.f4025a.mo4148f(a32);
                break;
            case 4:
                this.f4025a.mo4145c(a32);
                break;
            case 5:
                this.f4025a.mo4143a(a32);
                break;
            case 6:
                this.f4025a.mo4146d(a32);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C0694f fVar = this.f4024a;
        if (fVar != null) {
            fVar.mo669g(a32, bVar);
        }
    }
}
