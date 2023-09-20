package androidx.lifecycle;

import android.content.Context;
import com.onedelhi.secure.C4048z8;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.mq1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.x22;
import java.util.Collections;
import java.util.List;

public final class ProcessLifecycleInitializer implements mq1<a32> {
    @mr2
    /* renamed from: b */
    public List<Class<? extends mq1<?>>> mo4139b() {
        return Collections.emptyList();
    }

    @mr2
    /* renamed from: c */
    public a32 mo4138a(@mr2 Context context) {
        if (C4048z8.m32904e(context).mo27839g(ProcessLifecycleInitializer.class)) {
            x22.m31243a(context);
            C0698i.m4818i(context);
            return C0698i.m4817h();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }
}
