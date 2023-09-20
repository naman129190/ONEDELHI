package com.onedelhi.secure;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.C1444a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public class q44 {

    /* renamed from: a */
    public final zn1 f18870a;

    /* renamed from: com.onedelhi.secure.q44$a */
    public interface C3226a {
        /* renamed from: a */
        void mo22844a(@mr2 StreetViewPanoramaCamera streetViewPanoramaCamera);
    }

    /* renamed from: com.onedelhi.secure.q44$b */
    public interface C3227b {
        /* renamed from: a */
        void mo22845a(@mr2 t44 t44);
    }

    /* renamed from: com.onedelhi.secure.q44$c */
    public interface C3228c {
        /* renamed from: a */
        void mo22846a(@mr2 C1444a aVar);
    }

    /* renamed from: com.onedelhi.secure.q44$d */
    public interface C3229d {
        /* renamed from: a */
        void mo22847a(@mr2 C1444a aVar);
    }

    public q44(@mr2 zn1 zn1) {
        this.f18870a = (zn1) Preconditions.checkNotNull(zn1, "delegate");
    }

    /* renamed from: a */
    public void mo22822a(@mr2 StreetViewPanoramaCamera streetViewPanoramaCamera, long j) {
        Preconditions.checkNotNull(streetViewPanoramaCamera);
        try {
            this.f18870a.mo27045H5(streetViewPanoramaCamera, j);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: b */
    public t44 mo22823b() {
        try {
            return this.f18870a.mo27052T4();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: c */
    public StreetViewPanoramaCamera mo22824c() {
        try {
            return this.f18870a.mo27048O7();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: d */
    public boolean mo22825d() {
        try {
            return this.f18870a.mo27051S5();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: e */
    public boolean mo22826e() {
        try {
            return this.f18870a.mo27063w3();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: f */
    public boolean mo22827f() {
        try {
            return this.f18870a.mo27054W2();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: g */
    public boolean mo22828g() {
        try {
            return this.f18870a.mo27057i0();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @ts2
    /* renamed from: h */
    public Point mo22829h(@mr2 C1444a aVar) {
        try {
            tn1 i2 = this.f18870a.mo27059i2(aVar);
            if (i2 == null) {
                return null;
            }
            return (Point) nt2.m23165k8(i2);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: i */
    public C1444a mo22830i(@mr2 Point point) {
        try {
            return this.f18870a.mo27053U4(nt2.m23166l8(point));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: j */
    public final void mo22831j(@ts2 C3226a aVar) {
        if (aVar == null) {
            try {
                this.f18870a.mo27055c3((po5) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f18870a.mo27055c3(new rf5(this, aVar));
        }
    }

    /* renamed from: k */
    public final void mo22832k(@ts2 C3227b bVar) {
        if (bVar == null) {
            try {
                this.f18870a.mo27049R2((zo5) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f18870a.mo27049R2(new gf5(this, bVar));
        }
    }

    /* renamed from: l */
    public final void mo22833l(@ts2 C3228c cVar) {
        if (cVar == null) {
            try {
                this.f18870a.mo27044E6((jp5) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f18870a.mo27044E6(new cg5(this, cVar));
        }
    }

    /* renamed from: m */
    public final void mo22834m(@ts2 C3229d dVar) {
        if (dVar == null) {
            try {
                this.f18870a.mo27064z4((tp5) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f18870a.mo27064z4(new kg5(this, dVar));
        }
    }

    /* renamed from: n */
    public void mo22835n(boolean z) {
        try {
            this.f18870a.mo27046O2(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: o */
    public void mo22836o(@mr2 LatLng latLng) {
        try {
            this.f18870a.mo27056d4(latLng);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: p */
    public void mo22837p(@mr2 LatLng latLng, int i) {
        try {
            this.f18870a.mo27058i1(latLng, i);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: q */
    public void mo22838q(@mr2 LatLng latLng, int i, @ts2 u44 u44) {
        try {
            this.f18870a.mo27061n6(latLng, i, u44);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: r */
    public void mo22839r(@mr2 LatLng latLng, @ts2 u44 u44) {
        try {
            this.f18870a.mo27050S3(latLng, u44);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: s */
    public void mo22840s(@mr2 String str) {
        try {
            this.f18870a.mo27065z6(str);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: t */
    public void mo22841t(boolean z) {
        try {
            this.f18870a.mo27060k4(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: u */
    public void mo22842u(boolean z) {
        try {
            this.f18870a.mo27047O4(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: v */
    public void mo22843v(boolean z) {
        try {
            this.f18870a.mo27062t3(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }
}
