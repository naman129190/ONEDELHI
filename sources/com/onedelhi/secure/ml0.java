package com.onedelhi.secure;

import com.delhitransport.onedelhi.activities.DirectionRouteViewer;
import com.delhitransport.onedelhi.models.directions.Routes;
import java.util.List;

public final /* synthetic */ class ml0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DirectionRouteViewer f32175a;

    /* renamed from: a */
    public final /* synthetic */ Routes f32176a;

    /* renamed from: a */
    public final /* synthetic */ List f32177a;

    /* renamed from: n */
    public final /* synthetic */ int f32178n;

    public /* synthetic */ ml0(DirectionRouteViewer directionRouteViewer, List list, Routes routes, int i) {
        this.f32175a = directionRouteViewer;
        this.f32177a = list;
        this.f32176a = routes;
        this.f32178n = i;
    }

    public final void run() {
        this.f32175a.m7697I1(this.f32177a, this.f32176a, this.f32178n);
    }
}
