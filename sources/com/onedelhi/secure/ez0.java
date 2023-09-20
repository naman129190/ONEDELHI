package com.onedelhi.secure;

import android.content.Context;
import com.onedelhi.secure.om0;
import java.io.File;

public final class ez0 extends om0 {

    /* renamed from: com.onedelhi.secure.ez0$a */
    public class C2107a implements om0.C3076c {

        /* renamed from: a */
        public final /* synthetic */ Context f11765a;

        /* renamed from: a */
        public final /* synthetic */ String f11766a;

        public C2107a(Context context, String str) {
            this.f11765a = context;
            this.f11766a = str;
        }

        /* renamed from: a */
        public File mo14949a() {
            File externalCacheDir;
            File b = mo15657b();
            return ((b == null || !b.exists()) && (externalCacheDir = this.f11765a.getExternalCacheDir()) != null && externalCacheDir.canWrite()) ? this.f11766a != null ? new File(externalCacheDir, this.f11766a) : externalCacheDir : b;
        }

        @ts2
        /* renamed from: b */
        public final File mo15657b() {
            File cacheDir = this.f11765a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f11766a != null ? new File(cacheDir, this.f11766a) : cacheDir;
        }
    }

    public ez0(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public ez0(Context context, long j) {
        this(context, "image_manager_disk_cache", j);
    }

    public ez0(Context context, String str, long j) {
        super((om0.C3076c) new C2107a(context, str), j);
    }
}
