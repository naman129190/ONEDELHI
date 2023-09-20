package com.google.firebase.perf;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.onedelhi.secure.a30;
import com.onedelhi.secure.g30;
import com.onedelhi.secure.gn4;
import com.onedelhi.secure.j51;
import com.onedelhi.secure.n51;
import com.onedelhi.secure.o41;
import com.onedelhi.secure.o51;
import com.onedelhi.secure.q51;
import com.onedelhi.secure.rj0;
import com.onedelhi.secure.u22;
import com.onedelhi.secure.u51;
import com.onedelhi.secure.uh3;
import com.onedelhi.secure.w31;
import com.onedelhi.secure.y24;
import com.onedelhi.secure.yh4;
import com.onedelhi.secure.z83;
import com.onedelhi.secure.zc0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* access modifiers changed from: private */
    public static /* synthetic */ j51 lambda$getComponents$0(z83 z83, g30 g30) {
        return new j51((w31) g30.mo36546b(w31.class), g30.mo36549f(y24.class).get(), (Executor) g30.mo36547c(z83));
    }

    /* access modifiers changed from: private */
    public static q51 providesFirebasePerformance(g30 g30) {
        g30.mo36546b(j51.class);
        return zc0.m73078b().mo48219b(new u51((w31) g30.mo36546b(w31.class), (o41) g30.mo36546b(o41.class), g30.mo36549f(uh3.class), g30.mo36549f(yh4.class))).mo48218a().mo44205a();
    }

    @Keep
    public List<a30<?>> getComponents() {
        Class<j51> cls = j51.class;
        Class<w31> cls2 = w31.class;
        z83<Executor> a = z83.m72649a(gn4.class, Executor.class);
        return Arrays.asList(new a30[]{a30.m36014h(q51.class).mo30439h(LIBRARY_NAME).mo30433b(rj0.m63679m(cls2)).mo30433b(rj0.m63681o(uh3.class)).mo30433b(rj0.m63679m(o41.class)).mo30433b(rj0.m63681o(yh4.class)).mo30433b(rj0.m63679m(cls)).mo30437f(o51.f32887a).mo30435d(), a30.m36014h(cls).mo30439h(EARLY_LIBRARY_NAME).mo30433b(rj0.m63679m(cls2)).mo30433b(rj0.m63677k(y24.class)).mo30433b(rj0.m63678l(a)).mo30436e().mo30437f(new n51(a)).mo30435d(), u22.m66409b(LIBRARY_NAME, "20.3.1")});
    }
}
