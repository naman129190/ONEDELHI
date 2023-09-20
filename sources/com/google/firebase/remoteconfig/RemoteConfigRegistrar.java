package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.onedelhi.secure.C4623b5;
import com.onedelhi.secure.C4895cn;
import com.onedelhi.secure.C5052dp;
import com.onedelhi.secure.C6633r1;
import com.onedelhi.secure.a30;
import com.onedelhi.secure.g30;
import com.onedelhi.secure.o41;
import com.onedelhi.secure.rj0;
import com.onedelhi.secure.u22;
import com.onedelhi.secure.uh3;
import com.onedelhi.secure.w31;
import com.onedelhi.secure.yh3;
import com.onedelhi.secure.z83;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* access modifiers changed from: private */
    public static /* synthetic */ uh3 lambda$getComponents$0(z83 z83, g30 g30) {
        return new uh3((Context) g30.mo36546b(Context.class), (ScheduledExecutorService) g30.mo36547c(z83), (w31) g30.mo36546b(w31.class), (o41) g30.mo36546b(o41.class), ((C6633r1) g30.mo36546b(C6633r1.class)).mo43780b("frc"), g30.mo36549f(C4623b5.class));
    }

    public List<a30<?>> getComponents() {
        z83<ScheduledExecutorService> a = z83.m72649a(C4895cn.class, ScheduledExecutorService.class);
        return Arrays.asList(new a30[]{a30.m36014h(uh3.class).mo30439h(LIBRARY_NAME).mo30433b(rj0.m63679m(Context.class)).mo30433b(rj0.m63678l(a)).mo30433b(rj0.m63679m(w31.class)).mo30433b(rj0.m63679m(o41.class)).mo30433b(rj0.m63679m(C6633r1.class)).mo30433b(rj0.m63677k(C4623b5.class)).mo30437f(new yh3(a)).mo30436e().mo30435d(), u22.m66409b(LIBRARY_NAME, C5052dp.f27587c)});
    }
}
