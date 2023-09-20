package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import com.onedelhi.secure.C4623b5;
import com.onedelhi.secure.C7174wo;
import com.onedelhi.secure.a30;
import com.onedelhi.secure.c41;
import com.onedelhi.secure.g30;
import com.onedelhi.secure.ja0;
import com.onedelhi.secure.o41;
import com.onedelhi.secure.oa0;
import com.onedelhi.secure.rj0;
import com.onedelhi.secure.u22;
import com.onedelhi.secure.w31;
import java.util.Arrays;
import java.util.List;

public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: a */
    public static final String f25003a = "fire-cls";

    /* renamed from: b */
    public final c41 mo29679b(g30 g30) {
        return c41.m40703e((w31) g30.mo36546b(w31.class), (o41) g30.mo36546b(o41.class), g30.mo36552i(ja0.class), g30.mo36552i(C4623b5.class));
    }

    public List<a30<?>> getComponents() {
        return Arrays.asList(new a30[]{a30.m36014h(c41.class).mo30439h(f25003a).mo30433b(rj0.m63679m(w31.class)).mo30433b(rj0.m63679m(o41.class)).mo30433b(rj0.m63673b(ja0.class)).mo30433b(rj0.m63673b(C4623b5.class)).mo30437f(new oa0(this)).mo30436e().mo30435d(), u22.m66409b(f25003a, C7174wo.f37061c)});
    }
}
