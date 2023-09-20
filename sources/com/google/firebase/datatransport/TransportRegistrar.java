package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.onedelhi.secure.C7274xo;
import com.onedelhi.secure.a30;
import com.onedelhi.secure.mi4;
import com.onedelhi.secure.rj0;
import com.onedelhi.secure.u22;
import com.onedelhi.secure.yh4;
import java.util.Arrays;
import java.util.List;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public List<a30<?>> getComponents() {
        return Arrays.asList(new a30[]{a30.m36014h(yh4.class).mo30439h(LIBRARY_NAME).mo30433b(rj0.m63679m(Context.class)).mo30437f(mi4.f32165a).mo30435d(), u22.m66409b(LIBRARY_NAME, C7274xo.f37564c)});
    }
}
