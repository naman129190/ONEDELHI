package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.HashMap;

public class th1 {

    /* renamed from: a */
    public static final int f20833a = 0;

    /* renamed from: b */
    public static final int f20834b = 1;

    /* renamed from: c */
    public static final int f20835c = 2;

    /* renamed from: d */
    public static final int f20836d = 3;

    /* renamed from: e */
    public static final int f20837e = 4;

    /* renamed from: a */
    public fn4 f20838a;

    /* renamed from: a */
    public final nn1 f20839a;

    /* renamed from: a */
    public final HashMap f20840a = new HashMap();

    /* renamed from: com.onedelhi.secure.th1$a */
    public interface C3607a {
        /* renamed from: a */
        void mo24994a();

        void onCancel();
    }

    /* renamed from: com.onedelhi.secure.th1$b */
    public interface C3608b {
        @ts2
        /* renamed from: b */
        View mo7564b(@mr2 od2 od2);

        @ts2
        /* renamed from: f */
        View mo7565f(@mr2 od2 od2);
    }

    @Deprecated
    /* renamed from: com.onedelhi.secure.th1$c */
    public interface C3609c {
        /* renamed from: a */
        void mo24996a(@mr2 CameraPosition cameraPosition);
    }

    /* renamed from: com.onedelhi.secure.th1$d */
    public interface C3610d {
        /* renamed from: b */
        void mo24997b();
    }

    /* renamed from: com.onedelhi.secure.th1$e */
    public interface C3611e {
        /* renamed from: a */
        void mo24998a();
    }

    /* renamed from: com.onedelhi.secure.th1$f */
    public interface C3612f {
        /* renamed from: a */
        void mo24999a();
    }

    /* renamed from: com.onedelhi.secure.th1$g */
    public interface C3613g {

        /* renamed from: a */
        public static final int f20841a = 1;

        /* renamed from: b */
        public static final int f20842b = 2;

        /* renamed from: c */
        public static final int f20843c = 3;

        /* renamed from: a */
        void mo25000a(int i);
    }

    /* renamed from: com.onedelhi.secure.th1$h */
    public interface C3614h {
        /* renamed from: a */
        void mo25001a(@mr2 C4141zx zxVar);
    }

    /* renamed from: com.onedelhi.secure.th1$i */
    public interface C3615i {
        /* renamed from: a */
        void mo25002a(@mr2 wi1 wi1);
    }

    /* renamed from: com.onedelhi.secure.th1$j */
    public interface C3616j {
        /* renamed from: a */
        void mo25003a();

        /* renamed from: b */
        void mo25004b(@mr2 hq1 hq1);
    }

    /* renamed from: com.onedelhi.secure.th1$k */
    public interface C3617k {
        /* renamed from: a */
        void mo25005a(@mr2 od2 od2);
    }

    /* renamed from: com.onedelhi.secure.th1$l */
    public interface C3618l {
        /* renamed from: a */
        void mo25006a(@mr2 od2 od2);
    }

    /* renamed from: com.onedelhi.secure.th1$m */
    public interface C3619m {
        /* renamed from: a */
        void mo25007a(@mr2 od2 od2);
    }

    /* renamed from: com.onedelhi.secure.th1$n */
    public interface C3620n {
        /* renamed from: a */
        void mo25008a(@mr2 LatLng latLng);
    }

    /* renamed from: com.onedelhi.secure.th1$o */
    public interface C3621o {
        /* renamed from: a */
        void mo25009a();
    }

    /* renamed from: com.onedelhi.secure.th1$p */
    public interface C3622p {
        /* renamed from: a */
        void mo25010a(@mr2 LatLng latLng);
    }

    /* renamed from: com.onedelhi.secure.th1$q */
    public interface C3623q {
        /* renamed from: g */
        boolean mo25011g(@mr2 od2 od2);
    }

    /* renamed from: com.onedelhi.secure.th1$r */
    public interface C3624r {
        /* renamed from: c */
        void mo25012c(@mr2 od2 od2);

        /* renamed from: d */
        void mo25013d(@mr2 od2 od2);

        /* renamed from: e */
        void mo25014e(@mr2 od2 od2);
    }

    /* renamed from: com.onedelhi.secure.th1$s */
    public interface C3625s {
        /* renamed from: a */
        boolean mo25015a();
    }

    @Deprecated
    /* renamed from: com.onedelhi.secure.th1$t */
    public interface C3626t {
        /* renamed from: a */
        void mo25016a(@mr2 Location location);
    }

    /* renamed from: com.onedelhi.secure.th1$u */
    public interface C3627u {
        /* renamed from: a */
        void mo25017a(@mr2 Location location);
    }

    /* renamed from: com.onedelhi.secure.th1$v */
    public interface C3628v {
        /* renamed from: a */
        void mo25018a(@mr2 z23 z23);
    }

    /* renamed from: com.onedelhi.secure.th1$w */
    public interface C3629w {
        /* renamed from: a */
        void mo25019a(@mr2 d33 d33);
    }

    /* renamed from: com.onedelhi.secure.th1$x */
    public interface C3630x {
        /* renamed from: a */
        void mo25020a(@mr2 f33 f33);
    }

    /* renamed from: com.onedelhi.secure.th1$y */
    public interface C3631y {
        /* renamed from: a */
        void mo25021a(@ts2 Bitmap bitmap);
    }

    public th1(@mr2 nn1 nn1) {
        this.f20839a = (nn1) Preconditions.checkNotNull(nn1);
    }

    /* renamed from: A */
    public final boolean mo24932A(boolean z) {
        try {
            return this.f20839a.mo12933f4(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: B */
    public final void mo24933B(@ts2 C3608b bVar) {
        if (bVar == null) {
            try {
                this.f20839a.mo12920X5((nh6) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12920X5(new b66(this, bVar));
        }
    }

    /* renamed from: C */
    public void mo24934C(@ts2 LatLngBounds latLngBounds) {
        try {
            this.f20839a.mo12921Y0(latLngBounds);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: D */
    public final void mo24935D(@ts2 h82 h82) {
        if (h82 == null) {
            try {
                this.f20839a.mo12908N4((on1) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12908N4(new p17(this, h82));
        }
    }

    /* renamed from: E */
    public boolean mo24936E(@ts2 bd2 bd2) {
        try {
            return this.f20839a.mo12912R5(bd2);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: F */
    public final void mo24937F(int i) {
        try {
            this.f20839a.mo12914U2(i);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: G */
    public void mo24938G(float f) {
        try {
            this.f20839a.mo12965w6(f);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: H */
    public void mo24939H(float f) {
        try {
            this.f20839a.mo12899I6(f);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: I */
    public final void mo24940I(boolean z) {
        try {
            this.f20839a.mo12895G2(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @Deprecated
    /* renamed from: J */
    public final void mo24941J(@ts2 C3609c cVar) {
        if (cVar == null) {
            try {
                this.f20839a.mo12947m6((rt6) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12947m6(new g27(this, cVar));
        }
    }

    /* renamed from: K */
    public final void mo24942K(@ts2 C3610d dVar) {
        if (dVar == null) {
            try {
                this.f20839a.mo12903L1((ax6) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12903L1(new u47(this, dVar));
        }
    }

    /* renamed from: L */
    public final void mo24943L(@ts2 C3611e eVar) {
        if (eVar == null) {
            try {
                this.f20839a.mo12966x5((k07) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12966x5(new e47(this, eVar));
        }
    }

    /* renamed from: M */
    public final void mo24944M(@ts2 C3612f fVar) {
        if (fVar == null) {
            try {
                this.f20839a.mo12898I5((h27) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12898I5(new o37(this, fVar));
        }
    }

    /* renamed from: N */
    public final void mo24945N(@ts2 C3613g gVar) {
        if (gVar == null) {
            try {
                this.f20839a.mo12909P4((p37) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12909P4(new x27(this, gVar));
        }
    }

    /* renamed from: O */
    public final void mo24946O(@ts2 C3614h hVar) {
        if (hVar == null) {
            try {
                this.f20839a.mo12945l4((v47) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12945l4(new qt6(this, hVar));
        }
    }

    /* renamed from: P */
    public final void mo24947P(@ts2 C3615i iVar) {
        if (iVar == null) {
            try {
                this.f20839a.mo12948m7((a67) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12948m7(new yr6(this, iVar));
        }
    }

    /* renamed from: Q */
    public final void mo24948Q(@ts2 C3616j jVar) {
        if (jVar == null) {
            try {
                this.f20839a.mo12924b3((pb5) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12924b3(new ym6(this, jVar));
        }
    }

    /* renamed from: R */
    public final void mo24949R(@ts2 C3617k kVar) {
        if (kVar == null) {
            try {
                this.f20839a.mo12919X0((cd5) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12919X0(new as5(this, kVar));
        }
    }

    /* renamed from: S */
    public final void mo24950S(@ts2 C3618l lVar) {
        if (lVar == null) {
            try {
                this.f20839a.mo12918W7((ae5) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12918W7(new d26(this, lVar));
        }
    }

    /* renamed from: T */
    public final void mo24951T(@ts2 C3619m mVar) {
        if (mVar == null) {
            try {
                this.f20839a.mo12969z1((we5) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12969z1(new fx5(this, mVar));
        }
    }

    /* renamed from: U */
    public final void mo24952U(@ts2 C3620n nVar) {
        if (nVar == null) {
            try {
                this.f20839a.mo12958q4((ug5) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12958q4(new k57(this, nVar));
        }
    }

    /* renamed from: V */
    public void mo24953V(@ts2 C3621o oVar) {
        if (oVar == null) {
            try {
                this.f20839a.mo12946m3((kh5) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12946m3(new fk6(this, oVar));
        }
    }

    /* renamed from: W */
    public final void mo24954W(@ts2 C3622p pVar) {
        if (pVar == null) {
            try {
                this.f20839a.mo12911Q7((ai5) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12911Q7(new z57(this, pVar));
        }
    }

    /* renamed from: X */
    public final void mo24955X(@ts2 C3623q qVar) {
        if (qVar == null) {
            try {
                this.f20839a.mo12940j3((gj5) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12940j3(new ga5(this, qVar));
        }
    }

    /* renamed from: Y */
    public final void mo24956Y(@ts2 C3624r rVar) {
        if (rVar == null) {
            try {
                this.f20839a.mo12917W5((wj5) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12917W5(new kl5(this, rVar));
        }
    }

    /* renamed from: Z */
    public final void mo24957Z(@ts2 C3625s sVar) {
        if (sVar == null) {
            try {
                this.f20839a.mo12913T7((mk5) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12913T7(new vd6(this, sVar));
        }
    }

    @mr2
    /* renamed from: a */
    public final C4141zx mo24958a(@mr2 C1927cy cyVar) {
        try {
            Preconditions.checkNotNull(cyVar, "CircleOptions must not be null.");
            return new C4141zx(this.f20839a.mo12957q2(cyVar));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @Deprecated
    /* renamed from: a0 */
    public final void mo24959a0(@ts2 C3626t tVar) {
        if (tVar == null) {
            try {
                this.f20839a.mo12923a2((hm5) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12923a2(new z96(this, tVar));
        }
    }

    @ts2
    /* renamed from: b */
    public final wi1 mo24960b(@mr2 xi1 xi1) {
        try {
            Preconditions.checkNotNull(xi1, "GroundOverlayOptions must not be null.");
            uv6 J3 = this.f20839a.mo12901J3(xi1);
            if (J3 != null) {
                return new wi1(J3);
            }
            return null;
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: b0 */
    public final void mo24961b0(@ts2 C3627u uVar) {
        if (uVar == null) {
            try {
                this.f20839a.mo12897H6((tm5) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12897H6(new mh6(this, uVar));
        }
    }

    @ts2
    /* renamed from: c */
    public final od2 mo24962c(@mr2 sd2 sd2) {
        try {
            Preconditions.checkNotNull(sd2, "MarkerOptions must not be null.");
            lb5 M6 = this.f20839a.mo12906M6(sd2);
            if (M6 != null) {
                return new od2(M6);
            }
            return null;
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: c0 */
    public final void mo24963c0(@ts2 C3628v vVar) {
        if (vVar == null) {
            try {
                this.f20839a.mo12943l1((fn5) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12943l1(new j07(this, vVar));
        }
    }

    @mr2
    /* renamed from: d */
    public final d33 mo24964d(@mr2 e33 e33) {
        try {
            Preconditions.checkNotNull(e33, "PolygonOptions must not be null");
            return new d33(this.f20839a.mo12936g5(e33));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: d0 */
    public final void mo24965d0(@ts2 C3629w wVar) {
        if (wVar == null) {
            try {
                this.f20839a.mo12932f1((rn5) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12932f1(new hv6(this, wVar));
        }
    }

    @mr2
    /* renamed from: e */
    public final f33 mo24966e(@mr2 g33 g33) {
        try {
            Preconditions.checkNotNull(g33, "PolylineOptions must not be null");
            return new f33(this.f20839a.mo12955p4(g33));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: e0 */
    public final void mo24967e0(@ts2 C3630x xVar) {
        if (xVar == null) {
            try {
                this.f20839a.mo12953o6((do5) null);
            } catch (RemoteException e) {
                throw new qo3(e);
            }
        } else {
            this.f20839a.mo12953o6(new zw6(this, xVar));
        }
    }

    @ts2
    /* renamed from: f */
    public final md4 mo24968f(@mr2 nd4 nd4) {
        try {
            Preconditions.checkNotNull(nd4, "TileOverlayOptions must not be null.");
            of5 y7 = this.f20839a.mo12968y7(nd4);
            if (y7 != null) {
                return new md4(y7);
            }
            return null;
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: f0 */
    public final void mo24969f0(int i, int i2, int i3, int i4) {
        try {
            this.f20839a.mo12926c1(i, i2, i3, i4);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: g */
    public final void mo24970g(@mr2 C3663tt ttVar) {
        try {
            Preconditions.checkNotNull(ttVar, "CameraUpdate must not be null.");
            this.f20839a.mo12922Z7(ttVar.mo25304a());
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: g0 */
    public final void mo24971g0(boolean z) {
        try {
            this.f20839a.mo12942k3(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: h */
    public final void mo24972h(@mr2 C3663tt ttVar, int i, @ts2 C3607a aVar) {
        try {
            Preconditions.checkNotNull(ttVar, "CameraUpdate must not be null.");
            this.f20839a.mo12961s7(ttVar.mo25304a(), i, aVar == null ? null : new ab5(aVar));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: h0 */
    public final void mo24973h0(@mr2 C3631y yVar) {
        Preconditions.checkNotNull(yVar, "Callback must not be null.");
        mo24975i0(yVar, (Bitmap) null);
    }

    /* renamed from: i */
    public final void mo24974i(@mr2 C3663tt ttVar, @ts2 C3607a aVar) {
        try {
            Preconditions.checkNotNull(ttVar, "CameraUpdate must not be null.");
            this.f20839a.mo12963u5(ttVar.mo25304a(), aVar == null ? null : new ab5(aVar));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: i0 */
    public final void mo24975i0(@mr2 C3631y yVar, @ts2 Bitmap bitmap) {
        Preconditions.checkNotNull(yVar, "Callback must not be null.");
        try {
            this.f20839a.mo12967x6(new ry6(this, yVar), (nt2) (bitmap != null ? nt2.m23166l8(bitmap) : null));
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: j */
    public final void mo24976j() {
        try {
            this.f20839a.clear();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: j0 */
    public final void mo24977j0() {
        try {
            this.f20839a.mo12902K7();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: k */
    public final CameraPosition mo24978k() {
        try {
            return this.f20839a.mo12951o4();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @ts2
    /* renamed from: l */
    public hq1 mo24979l() {
        try {
            g07 f5 = this.f20839a.mo12934f5();
            if (f5 != null) {
                return new hq1(f5);
            }
            return null;
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: m */
    public final int mo24980m() {
        try {
            return this.f20839a.mo12910Q1();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: n */
    public final float mo24981n() {
        try {
            return this.f20839a.mo12950o1();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: o */
    public final float mo24982o() {
        try {
            return this.f20839a.mo12929d6();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    @Deprecated
    /* renamed from: p */
    public final Location mo24983p() {
        try {
            return this.f20839a.mo12949n5();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: q */
    public final w53 mo24984q() {
        try {
            return new w53(this.f20839a.mo12962t2());
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    @mr2
    /* renamed from: r */
    public final fn4 mo24985r() {
        try {
            if (this.f20838a == null) {
                this.f20838a = new fn4(this.f20839a.mo12907N1());
            }
            return this.f20838a;
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: s */
    public final boolean mo24986s() {
        try {
            return this.f20839a.mo12964v5();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: t */
    public final boolean mo24987t() {
        try {
            return this.f20839a.mo12894E7();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: u */
    public final boolean mo24988u() {
        try {
            return this.f20839a.mo12956p7();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: v */
    public final boolean mo24989v() {
        try {
            return this.f20839a.mo12916W0();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: w */
    public final void mo24990w(@mr2 C3663tt ttVar) {
        try {
            Preconditions.checkNotNull(ttVar, "CameraUpdate must not be null.");
            this.f20839a.mo12952o5(ttVar.mo25304a());
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: x */
    public void mo24991x() {
        try {
            this.f20839a.mo12905L5();
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: y */
    public final void mo24992y(boolean z) {
        try {
            this.f20839a.mo12900I7(z);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }

    /* renamed from: z */
    public final void mo24993z(@ts2 String str) {
        try {
            this.f20839a.mo12941j5(str);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }
}
