package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.onedelhi.secure.C4895cn;
import com.onedelhi.secure.C6278oi;
import com.onedelhi.secure.C7509zo;
import com.onedelhi.secure.a30;
import com.onedelhi.secure.al1;
import com.onedelhi.secure.g30;
import com.onedelhi.secure.g41;
import com.onedelhi.secure.n41;
import com.onedelhi.secure.o41;
import com.onedelhi.secure.q41;
import com.onedelhi.secure.rj0;
import com.onedelhi.secure.u22;
import com.onedelhi.secure.w31;
import com.onedelhi.secure.z83;
import com.onedelhi.secure.zk1;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* access modifiers changed from: private */
    public static /* synthetic */ o41 lambda$getComponents$0(g30 g30) {
        return new n41((w31) g30.mo36546b(w31.class), g30.mo36549f(al1.class), (ExecutorService) g30.mo36547c(z83.m72649a(C6278oi.class, ExecutorService.class)), g41.m49076b((Executor) g30.mo36547c(z83.m72649a(C4895cn.class, Executor.class))));
    }

    public List<a30<?>> getComponents() {
        return Arrays.asList(new a30[]{a30.m36014h(o41.class).mo30439h(LIBRARY_NAME).mo30433b(rj0.m63679m(w31.class)).mo30433b(rj0.m63677k(al1.class)).mo30433b(rj0.m63678l(z83.m72649a(C6278oi.class, ExecutorService.class))).mo30433b(rj0.m63678l(z83.m72649a(C4895cn.class, Executor.class))).mo30437f(q41.f33968a).mo30435d(), zk1.m73223a(), u22.m66409b(LIBRARY_NAME, C7509zo.f38394c)});
    }
}
