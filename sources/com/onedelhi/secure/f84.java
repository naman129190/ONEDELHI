package com.onedelhi.secure;

import android.content.Context;
import com.onedelhi.secure.fd3;

public enum f84 {
    SURFACE_0(fd3.C2156f.m3_sys_elevation_level0),
    SURFACE_1(fd3.C2156f.m3_sys_elevation_level1),
    SURFACE_2(fd3.C2156f.m3_sys_elevation_level2),
    SURFACE_3(fd3.C2156f.m3_sys_elevation_level3),
    SURFACE_4(fd3.C2156f.m3_sys_elevation_level4),
    SURFACE_5(fd3.C2156f.m3_sys_elevation_level5);
    

    /* renamed from: n */
    public final int f11983n;

    /* access modifiers changed from: public */
    f84(@yk0 int i) {
        this.f11983n = i;
    }

    @d10
    /* renamed from: b */
    public static int m14825b(@mr2 Context context, @zk0 float f) {
        return new js0(context).mo18568c(oe2.m23716b(context, fd3.C2153c.colorSurface, 0), f);
    }

    @d10
    /* renamed from: a */
    public int mo15894a(@mr2 Context context) {
        return m14825b(context, context.getResources().getDimension(this.f11983n));
    }
}
