package com.onedelhi.secure;

import android.content.Context;
import com.onedelhi.secure.im0;
import com.onedelhi.secure.om0;
import java.io.File;

@Deprecated
public final class dz0 extends om0 {

    /* renamed from: com.onedelhi.secure.dz0$a */
    public class C2013a implements om0.C3076c {

        /* renamed from: a */
        public final /* synthetic */ Context f11006a;

        /* renamed from: a */
        public final /* synthetic */ String f11007a;

        public C2013a(Context context, String str) {
            this.f11006a = context;
            this.f11007a = str;
        }

        /* renamed from: a */
        public File mo14949a() {
            File externalCacheDir = this.f11006a.getExternalCacheDir();
            if (externalCacheDir == null) {
                return null;
            }
            return this.f11007a != null ? new File(externalCacheDir, this.f11007a) : externalCacheDir;
        }
    }

    public dz0(Context context) {
        this(context, "image_manager_disk_cache", im0.C2452a.f13753a);
    }

    public dz0(Context context, int i) {
        this(context, "image_manager_disk_cache", i);
    }

    public dz0(Context context, String str, int i) {
        super((om0.C3076c) new C2013a(context, str), (long) i);
    }
}
