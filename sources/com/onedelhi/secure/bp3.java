package com.onedelhi.secure;

import com.onedelhi.secure.o74;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;

public class bp3 implements o74.C3039c {
    @mr2

    /* renamed from: a */
    public final o74.C3039c f9921a;
    @ts2

    /* renamed from: a */
    public final File f9922a;
    @ts2

    /* renamed from: a */
    public final String f9923a;
    @ts2

    /* renamed from: a */
    public final Callable<InputStream> f9924a;

    public bp3(@ts2 String str, @ts2 File file, @ts2 Callable<InputStream> callable, @mr2 o74.C3039c cVar) {
        this.f9923a = str;
        this.f9922a = file;
        this.f9924a = callable;
        this.f9921a = cVar;
    }

    @mr2
    /* renamed from: a */
    public o74 mo13792a(o74.C3037b bVar) {
        return new ap3(bVar.f17870a, this.f9923a, this.f9922a, this.f9924a, bVar.f17871a.f17869a, this.f9921a.mo13792a(bVar));
    }
}
