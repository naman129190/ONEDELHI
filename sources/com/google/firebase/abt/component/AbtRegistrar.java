package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.onedelhi.secure.C4623b5;
import com.onedelhi.secure.C6633r1;
import com.onedelhi.secure.C6916u1;
import com.onedelhi.secure.C7066vp;
import com.onedelhi.secure.a30;
import com.onedelhi.secure.g30;
import com.onedelhi.secure.rj0;
import com.onedelhi.secure.u22;
import java.util.Arrays;
import java.util.List;

@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* access modifiers changed from: private */
    public static /* synthetic */ C6633r1 lambda$getComponents$0(g30 g30) {
        return new C6633r1((Context) g30.mo36546b(Context.class), g30.mo36549f(C4623b5.class));
    }

    public List<a30<?>> getComponents() {
        return Arrays.asList(new a30[]{a30.m36014h(C6633r1.class).mo30439h(LIBRARY_NAME).mo30433b(rj0.m63679m(Context.class)).mo30433b(rj0.m63677k(C4623b5.class)).mo30437f(C6916u1.f35892a).mo30435d(), u22.m66409b(LIBRARY_NAME, C7066vp.f36612c)});
    }
}
