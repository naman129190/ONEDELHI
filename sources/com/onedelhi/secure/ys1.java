package com.onedelhi.secure;

import android.content.Context;
import com.onedelhi.secure.om0;
import java.io.File;

public final class ys1 extends om0 {

    /* renamed from: com.onedelhi.secure.ys1$a */
    public class C4024a implements om0.C3076c {

        /* renamed from: a */
        public final /* synthetic */ Context f23316a;

        /* renamed from: a */
        public final /* synthetic */ String f23317a;

        public C4024a(Context context, String str) {
            this.f23316a = context;
            this.f23317a = str;
        }

        /* renamed from: a */
        public File mo14949a() {
            File cacheDir = this.f23316a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f23317a != null ? new File(cacheDir, this.f23317a) : cacheDir;
        }
    }

    public ys1(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public ys1(Context context, long j) {
        this(context, "image_manager_disk_cache", j);
    }

    public ys1(Context context, String str, long j) {
        super((om0.C3076c) new C4024a(context, str), j);
    }
}
