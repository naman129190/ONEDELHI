package com.onedelhi.secure;

import android.content.Context;
import com.onedelhi.secure.z20;
import java.io.Closeable;
import java.io.IOException;

@z20(modules = {C2521ji.class, cw0.class, vw0.class, vr3.class, tr3.class, td4.class})
@nz3
public abstract class oi4 implements Closeable {

    @z20.C4037a
    /* renamed from: com.onedelhi.secure.oi4$a */
    public interface C3066a {
        @C2450il
        /* renamed from: a */
        C3066a mo13007a(Context context);

        /* renamed from: b */
        oi4 mo13008b();
    }

    /* renamed from: a */
    public abstract aw0 mo13004a();

    /* renamed from: b */
    public abstract ni4 mo13005b();

    public void close() throws IOException {
        mo13004a().close();
    }
}
