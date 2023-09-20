package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.p000v4.media.MediaBrowserCompat;
import android.support.p000v4.media.session.C0120b;
import android.support.p000v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.C0761a;
import androidx.media.C0766b;
import androidx.media.C0769c;
import androidx.media.C0773d;
import com.onedelhi.secure.C2267gq;
import com.onedelhi.secure.C3042oa;
import com.onedelhi.secure.bg2;
import com.onedelhi.secure.cg2;
import com.onedelhi.secure.fy2;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.ul3;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: a */
    public static final float f4199a = 1.0E-5f;

    /* renamed from: b */
    public static final String f4200b = "MBServiceCompat";

    /* renamed from: b */
    public static final boolean f4201b = Log.isLoggable(f4200b, 3);

    /* renamed from: c */
    public static final String f4202c = "android.media.browse.MediaBrowserService";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: d */
    public static final String f4203d = "media_item";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: e */
    public static final String f4204e = "search_results";

    /* renamed from: n */
    public static final int f4205n = 1;

    /* renamed from: o */
    public static final int f4206o = 2;

    /* renamed from: p */
    public static final int f4207p = 4;
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: q */
    public static final int f4208q = -1;
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: r */
    public static final int f4209r = 0;
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: s */
    public static final int f4210s = 1;

    /* renamed from: a */
    public MediaSessionCompat.Token f4211a;

    /* renamed from: a */
    public C0730f f4212a;

    /* renamed from: a */
    public C0732g f4213a;

    /* renamed from: a */
    public final C0760q f4214a = new C0760q();

    /* renamed from: a */
    public final C3042oa<IBinder, C0730f> f4215a = new C3042oa<>();

    /* renamed from: androidx.media.MediaBrowserServiceCompat$a */
    public class C0725a extends C0747m<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: a */
        public final /* synthetic */ Bundle f4216a;

        /* renamed from: a */
        public final /* synthetic */ C0730f f4217a;

        /* renamed from: a */
        public final /* synthetic */ String f4219a;

        /* renamed from: b */
        public final /* synthetic */ Bundle f4220b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0725a(Object obj, C0730f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f4217a = fVar;
            this.f4219a = str;
            this.f4216a = bundle;
            this.f4220b = bundle2;
        }

        /* renamed from: l */
        public void mo5092g(List<MediaBrowserCompat.MediaItem> list) {
            if (MediaBrowserServiceCompat.this.f4215a.get(this.f4217a.f4236a.asBinder()) == this.f4217a) {
                if ((mo5130c() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.mo5066b(list, this.f4216a);
                }
                try {
                    this.f4217a.f4236a.mo5156b(this.f4219a, list, this.f4216a, this.f4220b);
                } catch (RemoteException unused) {
                    Log.w(MediaBrowserServiceCompat.f4200b, "Calling onLoadChildren() failed for id=" + this.f4219a + " package=" + this.f4217a.f4239a);
                }
            } else if (MediaBrowserServiceCompat.f4201b) {
                Log.d(MediaBrowserServiceCompat.f4200b, "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.f4217a.f4239a + " id=" + this.f4219a);
            }
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$b */
    public class C0726b extends C0747m<MediaBrowserCompat.MediaItem> {

        /* renamed from: a */
        public final /* synthetic */ ul3 f4222a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0726b(Object obj, ul3 ul3) {
            super(obj);
            this.f4222a = ul3;
        }

        /* renamed from: l */
        public void mo5092g(MediaBrowserCompat.MediaItem mediaItem) {
            if ((mo5130c() & 2) != 0) {
                this.f4222a.mo25661b(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaBrowserServiceCompat.f4203d, mediaItem);
            this.f4222a.mo25661b(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$c */
    public class C0727c extends C0747m<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: a */
        public final /* synthetic */ ul3 f4224a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0727c(Object obj, ul3 ul3) {
            super(obj);
            this.f4224a = ul3;
        }

        /* renamed from: l */
        public void mo5092g(List<MediaBrowserCompat.MediaItem> list) {
            if ((mo5130c() & 4) != 0 || list == null) {
                this.f4224a.mo25661b(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(MediaBrowserServiceCompat.f4204e, (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f4224a.mo25661b(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$d */
    public class C0728d extends C0747m<Bundle> {

        /* renamed from: a */
        public final /* synthetic */ ul3 f4226a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0728d(Object obj, ul3 ul3) {
            super(obj);
            this.f4226a = ul3;
        }

        /* renamed from: e */
        public void mo5096e(Bundle bundle) {
            this.f4226a.mo25661b(-1, bundle);
        }

        /* renamed from: f */
        public void mo5097f(Bundle bundle) {
            this.f4226a.mo25661b(1, bundle);
        }

        /* renamed from: l */
        public void mo5092g(Bundle bundle) {
            this.f4226a.mo25661b(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$e */
    public static final class C0729e {

        /* renamed from: b */
        public static final String f4227b = "android.service.media.extra.RECENT";

        /* renamed from: c */
        public static final String f4228c = "android.service.media.extra.OFFLINE";

        /* renamed from: d */
        public static final String f4229d = "android.service.media.extra.SUGGESTED";
        @Deprecated

        /* renamed from: e */
        public static final String f4230e = "android.service.media.extra.SUGGESTION_KEYWORDS";

        /* renamed from: a */
        public final Bundle f4231a;

        /* renamed from: a */
        public final String f4232a;

        public C0729e(@mr2 String str, @ts2 Bundle bundle) {
            if (str != null) {
                this.f4232a = str;
                this.f4231a = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.");
        }

        /* renamed from: a */
        public Bundle mo5099a() {
            return this.f4231a;
        }

        /* renamed from: b */
        public String mo5100b() {
            return this.f4232a;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$f */
    public class C0730f implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final int f4233a;

        /* renamed from: a */
        public final Bundle f4234a;

        /* renamed from: a */
        public C0729e f4235a;

        /* renamed from: a */
        public final C0758o f4236a;

        /* renamed from: a */
        public final C0773d.C0775b f4238a;

        /* renamed from: a */
        public final String f4239a;

        /* renamed from: a */
        public final HashMap<String, List<fy2<IBinder, Bundle>>> f4240a = new HashMap<>();

        /* renamed from: b */
        public final int f4241b;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$f$a */
        public class C0731a implements Runnable {
            public C0731a() {
            }

            public void run() {
                C0730f fVar = C0730f.this;
                MediaBrowserServiceCompat.this.f4215a.remove(fVar.f4236a.asBinder());
            }
        }

        public C0730f(String str, int i, int i2, Bundle bundle, C0758o oVar) {
            this.f4239a = str;
            this.f4233a = i;
            this.f4241b = i2;
            this.f4238a = new C0773d.C0775b(str, i, i2);
            this.f4234a = bundle;
            this.f4236a = oVar;
        }

        public void binderDied() {
            MediaBrowserServiceCompat.this.f4214a.post(new C0731a());
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$g */
    public interface C0732g {
        /* renamed from: a */
        void mo5103a(C0773d.C0775b bVar, String str, Bundle bundle);

        /* renamed from: b */
        void mo5104b(String str, Bundle bundle);

        /* renamed from: c */
        IBinder mo5105c(Intent intent);

        /* renamed from: e */
        Bundle mo5106e();

        /* renamed from: g */
        void mo5107g();

        /* renamed from: j */
        C0773d.C0775b mo5108j();

        /* renamed from: k */
        void mo5109k(MediaSessionCompat.Token token);
    }

    @sj3(21)
    /* renamed from: androidx.media.MediaBrowserServiceCompat$h */
    public class C0733h implements C0732g, C0761a.C0765d {

        /* renamed from: a */
        public Messenger f4243a;

        /* renamed from: a */
        public Object f4245a;

        /* renamed from: a */
        public final List<Bundle> f4246a = new ArrayList();

        /* renamed from: androidx.media.MediaBrowserServiceCompat$h$a */
        public class C0734a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ MediaSessionCompat.Token f4247a;

            public C0734a(MediaSessionCompat.Token token) {
                this.f4247a = token;
            }

            public void run() {
                if (!C0733h.this.f4246a.isEmpty()) {
                    C0120b d = this.f4247a.mo353d();
                    if (d != null) {
                        for (Bundle b : C0733h.this.f4246a) {
                            C2267gq.m16044b(b, cg2.f10271s, d.asBinder());
                        }
                    }
                    C0733h.this.f4246a.clear();
                }
                C0761a.m5035e(C0733h.this.f4245a, this.f4247a.mo357f());
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$h$b */
        public class C0735b extends C0747m<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: a */
            public final /* synthetic */ C0761a.C0764c f4250a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0735b(Object obj, C0761a.C0764c cVar) {
                super(obj);
                this.f4250a = cVar;
            }

            /* renamed from: b */
            public void mo5117b() {
                this.f4250a.mo5164a();
            }

            /* renamed from: l */
            public void mo5092g(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                        Parcel obtain = Parcel.obtain();
                        writeToParcel.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f4250a.mo5166c(arrayList);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$h$c */
        public class C0736c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f4251a;

            /* renamed from: b */
            public final /* synthetic */ String f4253b;

            public C0736c(String str, Bundle bundle) {
                this.f4253b = str;
                this.f4251a = bundle;
            }

            public void run() {
                for (IBinder iBinder : MediaBrowserServiceCompat.this.f4215a.keySet()) {
                    C3042oa<IBinder, C0730f> oaVar = MediaBrowserServiceCompat.this.f4215a;
                    C0733h.this.mo5114n(oaVar.get(iBinder), this.f4253b, this.f4251a);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$h$d */
        public class C0737d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f4254a;

            /* renamed from: a */
            public final /* synthetic */ C0773d.C0775b f4256a;

            /* renamed from: b */
            public final /* synthetic */ String f4257b;

            public C0737d(C0773d.C0775b bVar, String str, Bundle bundle) {
                this.f4256a = bVar;
                this.f4257b = str;
                this.f4254a = bundle;
            }

            public void run() {
                for (int i = 0; i < MediaBrowserServiceCompat.this.f4215a.size(); i++) {
                    C0730f q = MediaBrowserServiceCompat.this.f4215a.mo25352q(i);
                    if (q.f4238a.equals(this.f4256a)) {
                        C0733h.this.mo5114n(q, this.f4257b, this.f4254a);
                    }
                }
            }
        }

        public C0733h() {
        }

        /* renamed from: a */
        public void mo5103a(C0773d.C0775b bVar, String str, Bundle bundle) {
            mo5112l(bVar, str, bundle);
        }

        /* renamed from: b */
        public void mo5104b(String str, Bundle bundle) {
            mo5115o(str, bundle);
            mo5113m(str, bundle);
        }

        /* renamed from: c */
        public IBinder mo5105c(Intent intent) {
            return C0761a.m5033c(this.f4245a, intent);
        }

        /* renamed from: e */
        public Bundle mo5106e() {
            if (this.f4243a == null) {
                return null;
            }
            C0730f fVar = MediaBrowserServiceCompat.this.f4212a;
            if (fVar == null) {
                throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            } else if (fVar.f4234a == null) {
                return null;
            } else {
                return new Bundle(MediaBrowserServiceCompat.this.f4212a.f4234a);
            }
        }

        /* renamed from: f */
        public C0761a.C0762a mo5110f(String str, int i, Bundle bundle) {
            Bundle bundle2;
            if (bundle == null || bundle.getInt(cg2.f10267p, 0) == 0) {
                bundle2 = null;
            } else {
                bundle.remove(cg2.f10267p);
                this.f4243a = new Messenger(MediaBrowserServiceCompat.this.f4214a);
                bundle2 = new Bundle();
                bundle2.putInt(cg2.f10269q, 2);
                C2267gq.m16044b(bundle2, cg2.f10270r, this.f4243a.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.f4211a;
                if (token != null) {
                    C0120b d = token.mo353d();
                    C2267gq.m16044b(bundle2, cg2.f10271s, d == null ? null : d.asBinder());
                } else {
                    this.f4246a.add(bundle2);
                }
            }
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f4212a = new C0730f(str, -1, i, bundle, (C0758o) null);
            C0729e l = MediaBrowserServiceCompat.this.mo5077l(str, i, bundle);
            MediaBrowserServiceCompat.this.f4212a = null;
            if (l == null) {
                return null;
            }
            if (bundle2 == null) {
                bundle2 = l.mo5099a();
            } else if (l.mo5099a() != null) {
                bundle2.putAll(l.mo5099a());
            }
            return new C0761a.C0762a(l.mo5100b(), bundle2);
        }

        /* renamed from: g */
        public void mo5107g() {
            Object a = C0761a.m5031a(MediaBrowserServiceCompat.this, this);
            this.f4245a = a;
            C0761a.m5034d(a);
        }

        /* renamed from: i */
        public void mo5111i(String str, C0761a.C0764c<List<Parcel>> cVar) {
            MediaBrowserServiceCompat.this.mo5078m(str, new C0735b(str, cVar));
        }

        /* renamed from: j */
        public C0773d.C0775b mo5108j() {
            C0730f fVar = MediaBrowserServiceCompat.this.f4212a;
            if (fVar != null) {
                return fVar.f4238a;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        /* renamed from: k */
        public void mo5109k(MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.f4214a.mo5159a(new C0734a(token));
        }

        /* renamed from: l */
        public void mo5112l(C0773d.C0775b bVar, String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f4214a.post(new C0737d(bVar, str, bundle));
        }

        /* renamed from: m */
        public void mo5113m(String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f4214a.post(new C0736c(str, bundle));
        }

        /* renamed from: n */
        public void mo5114n(C0730f fVar, String str, Bundle bundle) {
            List<fy2> list = fVar.f4240a.get(str);
            if (list != null) {
                for (fy2 fy2 : list) {
                    if (bg2.m11853b(bundle, (Bundle) fy2.f12386b)) {
                        MediaBrowserServiceCompat.this.mo5087t(str, fVar, (Bundle) fy2.f12386b, bundle);
                    }
                }
            }
        }

        /* renamed from: o */
        public void mo5115o(String str, Bundle bundle) {
            C0761a.m5032b(this.f4245a, str);
        }
    }

    @sj3(23)
    /* renamed from: androidx.media.MediaBrowserServiceCompat$i */
    public class C0738i extends C0733h implements C0766b.C0768b {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$i$a */
        public class C0739a extends C0747m<MediaBrowserCompat.MediaItem> {

            /* renamed from: a */
            public final /* synthetic */ C0761a.C0764c f4260a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0739a(Object obj, C0761a.C0764c cVar) {
                super(obj);
                this.f4260a = cVar;
            }

            /* renamed from: b */
            public void mo5117b() {
                this.f4260a.mo5164a();
            }

            /* renamed from: l */
            public void mo5092g(MediaBrowserCompat.MediaItem mediaItem) {
                C0761a.C0764c cVar;
                Parcel parcel;
                if (mediaItem == null) {
                    cVar = this.f4260a;
                    parcel = null;
                } else {
                    parcel = Parcel.obtain();
                    mediaItem.writeToParcel(parcel, 0);
                    cVar = this.f4260a;
                }
                cVar.mo5166c(parcel);
            }
        }

        public C0738i() {
            super();
        }

        /* renamed from: g */
        public void mo5107g() {
            Object a = C0766b.m5041a(MediaBrowserServiceCompat.this, this);
            this.f4245a = a;
            C0761a.m5034d(a);
        }

        /* renamed from: h */
        public void mo5121h(String str, C0761a.C0764c<Parcel> cVar) {
            MediaBrowserServiceCompat.this.mo5080o(str, new C0739a(str, cVar));
        }
    }

    @sj3(26)
    /* renamed from: androidx.media.MediaBrowserServiceCompat$j */
    public class C0740j extends C0738i implements C0769c.C0772c {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$j$a */
        public class C0741a extends C0747m<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: a */
            public final /* synthetic */ C0769c.C0771b f4263a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0741a(Object obj, C0769c.C0771b bVar) {
                super(obj);
                this.f4263a = bVar;
            }

            /* renamed from: b */
            public void mo5117b() {
                this.f4263a.mo5169a();
            }

            /* renamed from: l */
            public void mo5092g(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                        Parcel obtain = Parcel.obtain();
                        writeToParcel.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f4263a.mo5171c(arrayList, mo5130c());
            }
        }

        public C0740j() {
            super();
        }

        /* renamed from: d */
        public void mo5123d(String str, C0769c.C0771b bVar, Bundle bundle) {
            MediaBrowserServiceCompat.this.mo5079n(str, new C0741a(str, bVar), bundle);
        }

        /* renamed from: e */
        public Bundle mo5106e() {
            C0730f fVar = MediaBrowserServiceCompat.this.f4212a;
            if (fVar == null) {
                return C0769c.m5044b(this.f4245a);
            }
            if (fVar.f4234a == null) {
                return null;
            }
            return new Bundle(MediaBrowserServiceCompat.this.f4212a.f4234a);
        }

        /* renamed from: g */
        public void mo5107g() {
            Object a = C0769c.m5043a(MediaBrowserServiceCompat.this, this);
            this.f4245a = a;
            C0761a.m5034d(a);
        }

        /* renamed from: o */
        public void mo5115o(String str, Bundle bundle) {
            if (bundle != null) {
                C0769c.m5045c(this.f4245a, str, bundle);
            } else {
                super.mo5115o(str, bundle);
            }
        }
    }

    @sj3(28)
    /* renamed from: androidx.media.MediaBrowserServiceCompat$k */
    public class C0742k extends C0740j {
        public C0742k() {
            super();
        }

        /* renamed from: j */
        public C0773d.C0775b mo5108j() {
            C0730f fVar = MediaBrowserServiceCompat.this.f4212a;
            return fVar != null ? fVar.f4238a : new C0773d.C0775b(((MediaBrowserService) this.f4245a).getCurrentBrowserInfo());
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$l */
    public class C0743l implements C0732g {

        /* renamed from: a */
        public Messenger f4265a;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$l$a */
        public class C0744a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ MediaSessionCompat.Token f4267a;

            public C0744a(MediaSessionCompat.Token token) {
                this.f4267a = token;
            }

            public void run() {
                Iterator<C0730f> it = MediaBrowserServiceCompat.this.f4215a.values().iterator();
                while (it.hasNext()) {
                    C0730f next = it.next();
                    try {
                        next.f4236a.mo5154a(next.f4235a.mo5100b(), this.f4267a, next.f4235a.mo5099a());
                    } catch (RemoteException unused) {
                        Log.w(MediaBrowserServiceCompat.f4200b, "Connection for " + next.f4239a + " is no longer valid.");
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$l$b */
        public class C0745b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f4269a;

            /* renamed from: b */
            public final /* synthetic */ String f4271b;

            public C0745b(String str, Bundle bundle) {
                this.f4271b = str;
                this.f4269a = bundle;
            }

            public void run() {
                for (IBinder iBinder : MediaBrowserServiceCompat.this.f4215a.keySet()) {
                    C3042oa<IBinder, C0730f> oaVar = MediaBrowserServiceCompat.this.f4215a;
                    C0743l.this.mo5125d(oaVar.get(iBinder), this.f4271b, this.f4269a);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$l$c */
        public class C0746c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f4272a;

            /* renamed from: a */
            public final /* synthetic */ C0773d.C0775b f4274a;

            /* renamed from: b */
            public final /* synthetic */ String f4275b;

            public C0746c(C0773d.C0775b bVar, String str, Bundle bundle) {
                this.f4274a = bVar;
                this.f4275b = str;
                this.f4272a = bundle;
            }

            public void run() {
                for (int i = 0; i < MediaBrowserServiceCompat.this.f4215a.size(); i++) {
                    C0730f q = MediaBrowserServiceCompat.this.f4215a.mo25352q(i);
                    if (q.f4238a.equals(this.f4274a)) {
                        C0743l.this.mo5125d(q, this.f4275b, this.f4272a);
                        return;
                    }
                }
            }
        }

        public C0743l() {
        }

        /* renamed from: a */
        public void mo5103a(@mr2 C0773d.C0775b bVar, @mr2 String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f4214a.post(new C0746c(bVar, str, bundle));
        }

        /* renamed from: b */
        public void mo5104b(@mr2 String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f4214a.post(new C0745b(str, bundle));
        }

        /* renamed from: c */
        public IBinder mo5105c(Intent intent) {
            if (MediaBrowserServiceCompat.f4202c.equals(intent.getAction())) {
                return this.f4265a.getBinder();
            }
            return null;
        }

        /* renamed from: d */
        public void mo5125d(C0730f fVar, String str, Bundle bundle) {
            List<fy2> list = fVar.f4240a.get(str);
            if (list != null) {
                for (fy2 fy2 : list) {
                    if (bg2.m11853b(bundle, (Bundle) fy2.f12386b)) {
                        MediaBrowserServiceCompat.this.mo5087t(str, fVar, (Bundle) fy2.f12386b, bundle);
                    }
                }
            }
        }

        /* renamed from: e */
        public Bundle mo5106e() {
            C0730f fVar = MediaBrowserServiceCompat.this.f4212a;
            if (fVar == null) {
                throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            } else if (fVar.f4234a == null) {
                return null;
            } else {
                return new Bundle(MediaBrowserServiceCompat.this.f4212a.f4234a);
            }
        }

        /* renamed from: g */
        public void mo5107g() {
            this.f4265a = new Messenger(MediaBrowserServiceCompat.this.f4214a);
        }

        /* renamed from: j */
        public C0773d.C0775b mo5108j() {
            C0730f fVar = MediaBrowserServiceCompat.this.f4212a;
            if (fVar != null) {
                return fVar.f4238a;
            }
            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        /* renamed from: k */
        public void mo5109k(MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.f4214a.post(new C0744a(token));
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$m */
    public static class C0747m<T> {

        /* renamed from: a */
        public int f4276a;

        /* renamed from: a */
        public final Object f4277a;

        /* renamed from: a */
        public boolean f4278a;

        /* renamed from: b */
        public boolean f4279b;

        /* renamed from: c */
        public boolean f4280c;

        /* renamed from: d */
        public boolean f4281d;

        public C0747m(Object obj) {
            this.f4277a = obj;
        }

        /* renamed from: a */
        public final void mo5129a(Bundle bundle) {
            if (bundle != null && bundle.containsKey(MediaBrowserCompat.f5e)) {
                float f = bundle.getFloat(MediaBrowserCompat.f5e);
                if (f < -1.0E-5f || f > 1.00001f) {
                    throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].");
                }
            }
        }

        /* renamed from: b */
        public void mo5117b() {
            if (this.f4278a) {
                throw new IllegalStateException("detach() called when detach() had already been called for: " + this.f4277a);
            } else if (this.f4279b) {
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.f4277a);
            } else if (!this.f4281d) {
                this.f4278a = true;
            } else {
                throw new IllegalStateException("detach() called when sendError() had already been called for: " + this.f4277a);
            }
        }

        /* renamed from: c */
        public int mo5130c() {
            return this.f4276a;
        }

        /* renamed from: d */
        public boolean mo5131d() {
            return this.f4278a || this.f4279b || this.f4281d;
        }

        /* renamed from: e */
        public void mo5096e(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f4277a);
        }

        /* renamed from: f */
        public void mo5097f(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an interim update for " + this.f4277a);
        }

        /* renamed from: g */
        public void mo5092g(T t) {
        }

        /* renamed from: h */
        public void mo5132h(Bundle bundle) {
            if (this.f4279b || this.f4281d) {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f4277a);
            }
            this.f4281d = true;
            mo5096e(bundle);
        }

        /* renamed from: i */
        public void mo5133i(Bundle bundle) {
            if (this.f4279b || this.f4281d) {
                throw new IllegalStateException("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: " + this.f4277a);
            }
            mo5129a(bundle);
            this.f4280c = true;
            mo5097f(bundle);
        }

        /* renamed from: j */
        public void mo5134j(T t) {
            if (this.f4279b || this.f4281d) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f4277a);
            }
            this.f4279b = true;
            mo5092g(t);
        }

        /* renamed from: k */
        public void mo5135k(int i) {
            this.f4276a = i;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$n */
    public class C0748n {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$a */
        public class C0749a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f4283a;

            /* renamed from: a */
            public final /* synthetic */ C0758o f4285a;

            /* renamed from: b */
            public final /* synthetic */ String f4286b;

            /* renamed from: n */
            public final /* synthetic */ int f4287n;

            /* renamed from: o */
            public final /* synthetic */ int f4288o;

            public C0749a(C0758o oVar, String str, int i, int i2, Bundle bundle) {
                this.f4285a = oVar;
                this.f4286b = str;
                this.f4287n = i;
                this.f4288o = i2;
                this.f4283a = bundle;
            }

            public void run() {
                IBinder asBinder = this.f4285a.asBinder();
                MediaBrowserServiceCompat.this.f4215a.remove(asBinder);
                C0730f fVar = new C0730f(this.f4286b, this.f4287n, this.f4288o, this.f4283a, this.f4285a);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.f4212a = fVar;
                C0729e l = mediaBrowserServiceCompat.mo5077l(this.f4286b, this.f4288o, this.f4283a);
                fVar.f4235a = l;
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat2.f4212a = null;
                if (l == null) {
                    Log.i(MediaBrowserServiceCompat.f4200b, "No root for client " + this.f4286b + " from service " + getClass().getName());
                    try {
                        this.f4285a.mo5157c();
                    } catch (RemoteException unused) {
                        Log.w(MediaBrowserServiceCompat.f4200b, "Calling onConnectFailed() failed. Ignoring. pkg=" + this.f4286b);
                    }
                } else {
                    try {
                        mediaBrowserServiceCompat2.f4215a.put(asBinder, fVar);
                        asBinder.linkToDeath(fVar, 0);
                        if (MediaBrowserServiceCompat.this.f4211a != null) {
                            this.f4285a.mo5154a(fVar.f4235a.mo5100b(), MediaBrowserServiceCompat.this.f4211a, fVar.f4235a.mo5099a());
                        }
                    } catch (RemoteException unused2) {
                        Log.w(MediaBrowserServiceCompat.f4200b, "Calling onConnect() failed. Dropping client. pkg=" + this.f4286b);
                        MediaBrowserServiceCompat.this.f4215a.remove(asBinder);
                    }
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$b */
        public class C0750b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0758o f4290a;

            public C0750b(C0758o oVar) {
                this.f4290a = oVar;
            }

            public void run() {
                C0730f remove = MediaBrowserServiceCompat.this.f4215a.remove(this.f4290a.asBinder());
                if (remove != null) {
                    remove.f4236a.asBinder().unlinkToDeath(remove, 0);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$c */
        public class C0751c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f4291a;

            /* renamed from: a */
            public final /* synthetic */ IBinder f4292a;

            /* renamed from: a */
            public final /* synthetic */ C0758o f4294a;

            /* renamed from: b */
            public final /* synthetic */ String f4295b;

            public C0751c(C0758o oVar, String str, IBinder iBinder, Bundle bundle) {
                this.f4294a = oVar;
                this.f4295b = str;
                this.f4292a = iBinder;
                this.f4291a = bundle;
            }

            public void run() {
                C0730f fVar = MediaBrowserServiceCompat.this.f4215a.get(this.f4294a.asBinder());
                if (fVar == null) {
                    Log.w(MediaBrowserServiceCompat.f4200b, "addSubscription for callback that isn't registered id=" + this.f4295b);
                    return;
                }
                MediaBrowserServiceCompat.this.mo5065a(this.f4295b, fVar, this.f4292a, this.f4291a);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$d */
        public class C0752d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ IBinder f4296a;

            /* renamed from: a */
            public final /* synthetic */ C0758o f4298a;

            /* renamed from: b */
            public final /* synthetic */ String f4299b;

            public C0752d(C0758o oVar, String str, IBinder iBinder) {
                this.f4298a = oVar;
                this.f4299b = str;
                this.f4296a = iBinder;
            }

            public void run() {
                C0730f fVar = MediaBrowserServiceCompat.this.f4215a.get(this.f4298a.asBinder());
                if (fVar == null) {
                    Log.w(MediaBrowserServiceCompat.f4200b, "removeSubscription for callback that isn't registered id=" + this.f4299b);
                } else if (!MediaBrowserServiceCompat.this.mo5090w(this.f4299b, fVar, this.f4296a)) {
                    Log.w(MediaBrowserServiceCompat.f4200b, "removeSubscription called for " + this.f4299b + " which is not subscribed");
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$e */
        public class C0753e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0758o f4301a;

            /* renamed from: a */
            public final /* synthetic */ ul3 f4302a;

            /* renamed from: b */
            public final /* synthetic */ String f4303b;

            public C0753e(C0758o oVar, String str, ul3 ul3) {
                this.f4301a = oVar;
                this.f4303b = str;
                this.f4302a = ul3;
            }

            public void run() {
                C0730f fVar = MediaBrowserServiceCompat.this.f4215a.get(this.f4301a.asBinder());
                if (fVar == null) {
                    Log.w(MediaBrowserServiceCompat.f4200b, "getMediaItem for callback that isn't registered id=" + this.f4303b);
                    return;
                }
                MediaBrowserServiceCompat.this.mo5088u(this.f4303b, fVar, this.f4302a);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$f */
        public class C0754f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f4304a;

            /* renamed from: a */
            public final /* synthetic */ C0758o f4306a;

            /* renamed from: b */
            public final /* synthetic */ String f4307b;

            /* renamed from: n */
            public final /* synthetic */ int f4308n;

            /* renamed from: o */
            public final /* synthetic */ int f4309o;

            public C0754f(C0758o oVar, String str, int i, int i2, Bundle bundle) {
                this.f4306a = oVar;
                this.f4307b = str;
                this.f4308n = i;
                this.f4309o = i2;
                this.f4304a = bundle;
            }

            public void run() {
                IBinder asBinder = this.f4306a.asBinder();
                MediaBrowserServiceCompat.this.f4215a.remove(asBinder);
                C0730f fVar = new C0730f(this.f4307b, this.f4308n, this.f4309o, this.f4304a, this.f4306a);
                MediaBrowserServiceCompat.this.f4215a.put(asBinder, fVar);
                try {
                    asBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                    Log.w(MediaBrowserServiceCompat.f4200b, "IBinder is already dead.");
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$g */
        public class C0755g implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0758o f4311a;

            public C0755g(C0758o oVar) {
                this.f4311a = oVar;
            }

            public void run() {
                IBinder asBinder = this.f4311a.asBinder();
                C0730f remove = MediaBrowserServiceCompat.this.f4215a.remove(asBinder);
                if (remove != null) {
                    asBinder.unlinkToDeath(remove, 0);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$h */
        public class C0756h implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f4312a;

            /* renamed from: a */
            public final /* synthetic */ C0758o f4314a;

            /* renamed from: a */
            public final /* synthetic */ ul3 f4315a;

            /* renamed from: b */
            public final /* synthetic */ String f4316b;

            public C0756h(C0758o oVar, String str, Bundle bundle, ul3 ul3) {
                this.f4314a = oVar;
                this.f4316b = str;
                this.f4312a = bundle;
                this.f4315a = ul3;
            }

            public void run() {
                C0730f fVar = MediaBrowserServiceCompat.this.f4215a.get(this.f4314a.asBinder());
                if (fVar == null) {
                    Log.w(MediaBrowserServiceCompat.f4200b, "search for callback that isn't registered query=" + this.f4316b);
                    return;
                }
                MediaBrowserServiceCompat.this.mo5089v(this.f4316b, this.f4312a, fVar, this.f4315a);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$i */
        public class C0757i implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f4317a;

            /* renamed from: a */
            public final /* synthetic */ C0758o f4319a;

            /* renamed from: a */
            public final /* synthetic */ ul3 f4320a;

            /* renamed from: b */
            public final /* synthetic */ String f4321b;

            public C0757i(C0758o oVar, String str, Bundle bundle, ul3 ul3) {
                this.f4319a = oVar;
                this.f4321b = str;
                this.f4317a = bundle;
                this.f4320a = ul3;
            }

            public void run() {
                C0730f fVar = MediaBrowserServiceCompat.this.f4215a.get(this.f4319a.asBinder());
                if (fVar == null) {
                    Log.w(MediaBrowserServiceCompat.f4200b, "sendCustomAction for callback that isn't registered action=" + this.f4321b + ", extras=" + this.f4317a);
                    return;
                }
                MediaBrowserServiceCompat.this.mo5086s(this.f4321b, this.f4317a, fVar, this.f4320a);
            }
        }

        public C0748n() {
        }

        /* renamed from: a */
        public void mo5136a(String str, IBinder iBinder, Bundle bundle, C0758o oVar) {
            MediaBrowserServiceCompat.this.f4214a.mo5159a(new C0751c(oVar, str, iBinder, bundle));
        }

        /* renamed from: b */
        public void mo5137b(String str, int i, int i2, Bundle bundle, C0758o oVar) {
            if (MediaBrowserServiceCompat.this.mo5072g(str, i2)) {
                MediaBrowserServiceCompat.this.f4214a.mo5159a(new C0749a(oVar, str, i, i2, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + str);
        }

        /* renamed from: c */
        public void mo5138c(C0758o oVar) {
            MediaBrowserServiceCompat.this.f4214a.mo5159a(new C0750b(oVar));
        }

        /* renamed from: d */
        public void mo5139d(String str, ul3 ul3, C0758o oVar) {
            if (!TextUtils.isEmpty(str) && ul3 != null) {
                MediaBrowserServiceCompat.this.f4214a.mo5159a(new C0753e(oVar, str, ul3));
            }
        }

        /* renamed from: e */
        public void mo5140e(C0758o oVar, String str, int i, int i2, Bundle bundle) {
            MediaBrowserServiceCompat.this.f4214a.mo5159a(new C0754f(oVar, str, i, i2, bundle));
        }

        /* renamed from: f */
        public void mo5141f(String str, IBinder iBinder, C0758o oVar) {
            MediaBrowserServiceCompat.this.f4214a.mo5159a(new C0752d(oVar, str, iBinder));
        }

        /* renamed from: g */
        public void mo5142g(String str, Bundle bundle, ul3 ul3, C0758o oVar) {
            if (!TextUtils.isEmpty(str) && ul3 != null) {
                MediaBrowserServiceCompat.this.f4214a.mo5159a(new C0756h(oVar, str, bundle, ul3));
            }
        }

        /* renamed from: h */
        public void mo5143h(String str, Bundle bundle, ul3 ul3, C0758o oVar) {
            if (!TextUtils.isEmpty(str) && ul3 != null) {
                MediaBrowserServiceCompat.this.f4214a.mo5159a(new C0757i(oVar, str, bundle, ul3));
            }
        }

        /* renamed from: i */
        public void mo5144i(C0758o oVar) {
            MediaBrowserServiceCompat.this.f4214a.mo5159a(new C0755g(oVar));
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$o */
    public interface C0758o {
        /* renamed from: a */
        void mo5154a(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;

        IBinder asBinder();

        /* renamed from: b */
        void mo5156b(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        /* renamed from: c */
        void mo5157c() throws RemoteException;
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$p */
    public static class C0759p implements C0758o {

        /* renamed from: a */
        public final Messenger f4322a;

        public C0759p(Messenger messenger) {
            this.f4322a = messenger;
        }

        /* renamed from: a */
        public void mo5154a(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt(cg2.f10269q, 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString(cg2.f10243d, str);
            bundle2.putParcelable(cg2.f10247f, token);
            bundle2.putBundle(cg2.f10257k, bundle);
            mo5158d(1, bundle2);
        }

        public IBinder asBinder() {
            return this.f4322a.getBinder();
        }

        /* renamed from: b */
        public void mo5156b(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString(cg2.f10243d, str);
            bundle3.putBundle(cg2.f10249g, bundle);
            bundle3.putBundle(cg2.f10251h, bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList(cg2.f10245e, list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
            }
            mo5158d(3, bundle3);
        }

        /* renamed from: c */
        public void mo5157c() throws RemoteException {
            mo5158d(2, (Bundle) null);
        }

        /* renamed from: d */
        public final void mo5158d(int i, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f4322a.send(obtain);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$q */
    public final class C0760q extends Handler {

        /* renamed from: a */
        public final C0748n f4323a;

        public C0760q() {
            this.f4323a = new C0748n();
        }

        /* renamed from: a */
        public void mo5159a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle(cg2.f10257k);
                    MediaSessionCompat.m458b(bundle);
                    this.f4323a.mo5137b(data.getString(cg2.f10253i), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new C0759p(message.replyTo));
                    return;
                case 2:
                    this.f4323a.mo5138c(new C0759p(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle(cg2.f10249g);
                    MediaSessionCompat.m458b(bundle2);
                    this.f4323a.mo5136a(data.getString(cg2.f10243d), C2267gq.m16043a(data, cg2.f10237a), bundle2, new C0759p(message.replyTo));
                    return;
                case 4:
                    this.f4323a.mo5141f(data.getString(cg2.f10243d), C2267gq.m16043a(data, cg2.f10237a), new C0759p(message.replyTo));
                    return;
                case 5:
                    this.f4323a.mo5139d(data.getString(cg2.f10243d), (ul3) data.getParcelable(cg2.f10255j), new C0759p(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle(cg2.f10257k);
                    MediaSessionCompat.m458b(bundle3);
                    C0748n nVar = this.f4323a;
                    C0759p pVar = new C0759p(message.replyTo);
                    nVar.mo5140e(pVar, data.getString(cg2.f10253i), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    return;
                case 7:
                    this.f4323a.mo5144i(new C0759p(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle(cg2.f10259l);
                    MediaSessionCompat.m458b(bundle4);
                    this.f4323a.mo5142g(data.getString(cg2.f10261m), bundle4, (ul3) data.getParcelable(cg2.f10255j), new C0759p(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle(cg2.f10265o);
                    MediaSessionCompat.m458b(bundle5);
                    this.f4323a.mo5143h(data.getString(cg2.f10263n), bundle5, (ul3) data.getParcelable(cg2.f10255j), new C0759p(message.replyTo));
                    return;
                default:
                    Log.w(MediaBrowserServiceCompat.f4200b, "Unhandled message: " + message + "\n  Service version: " + 2 + "\n  Client version: " + message.arg1);
                    return;
            }
        }

        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j);
        }
    }

    /* renamed from: a */
    public void mo5065a(String str, C0730f fVar, IBinder iBinder, Bundle bundle) {
        List<fy2> list = fVar.f4240a.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (fy2 fy2 : list) {
            if (iBinder == fy2.f12385a && bg2.m11852a(bundle, (Bundle) fy2.f12386b)) {
                return;
            }
        }
        list.add(new fy2(iBinder, bundle));
        fVar.f4240a.put(str, list);
        mo5087t(str, fVar, bundle, (Bundle) null);
        this.f4212a = fVar;
        mo5084q(str, bundle);
        this.f4212a = null;
    }

    /* renamed from: b */
    public List<MediaBrowserCompat.MediaItem> mo5066b(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt(MediaBrowserCompat.f2b, -1);
        int i2 = bundle.getInt(MediaBrowserCompat.f3c, -1);
        if (i == -1 && i2 == -1) {
            return list;
        }
        int i3 = i2 * i;
        int i4 = i3 + i2;
        if (i < 0 || i2 < 1 || i3 >= list.size()) {
            return Collections.emptyList();
        }
        if (i4 > list.size()) {
            i4 = list.size();
        }
        return list.subList(i3, i4);
    }

    @hl3({hl3.C2354a.f13185a})
    /* renamed from: c */
    public void mo5067c(Context context) {
        attachBaseContext(context);
    }

    /* renamed from: d */
    public final Bundle mo5068d() {
        return this.f4213a.mo5106e();
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @mr2
    /* renamed from: e */
    public final C0773d.C0775b mo5070e() {
        return this.f4213a.mo5108j();
    }

    @ts2
    /* renamed from: f */
    public MediaSessionCompat.Token mo5071f() {
        return this.f4211a;
    }

    /* renamed from: g */
    public boolean mo5072g(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String equals : getPackageManager().getPackagesForUid(i)) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: h */
    public void mo5073h(@mr2 C0773d.C0775b bVar, @mr2 String str, @mr2 Bundle bundle) {
        if (bVar == null) {
            throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        } else if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.f4213a.mo5103a(bVar, str, bundle);
        } else {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
    }

    /* renamed from: i */
    public void mo5074i(@mr2 String str) {
        if (str != null) {
            this.f4213a.mo5104b(str, (Bundle) null);
            return;
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    /* renamed from: j */
    public void mo5075j(@mr2 String str, @mr2 Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.f4213a.mo5104b(str, bundle);
        } else {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
    }

    /* renamed from: k */
    public void mo5076k(@mr2 String str, Bundle bundle, @mr2 C0747m<Bundle> mVar) {
        mVar.mo5132h((Bundle) null);
    }

    @ts2
    /* renamed from: l */
    public abstract C0729e mo5077l(@mr2 String str, int i, @ts2 Bundle bundle);

    /* renamed from: m */
    public abstract void mo5078m(@mr2 String str, @mr2 C0747m<List<MediaBrowserCompat.MediaItem>> mVar);

    /* renamed from: n */
    public void mo5079n(@mr2 String str, @mr2 C0747m<List<MediaBrowserCompat.MediaItem>> mVar, @mr2 Bundle bundle) {
        mVar.mo5135k(1);
        mo5078m(str, mVar);
    }

    /* renamed from: o */
    public void mo5080o(String str, @mr2 C0747m<MediaBrowserCompat.MediaItem> mVar) {
        mVar.mo5135k(2);
        mVar.mo5134j(null);
    }

    public IBinder onBind(Intent intent) {
        return this.f4213a.mo5105c(intent);
    }

    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        this.f4213a = i >= 28 ? new C0742k() : i >= 26 ? new C0740j() : i >= 23 ? new C0738i() : new C0733h();
        this.f4213a.mo5107g();
    }

    /* renamed from: p */
    public void mo5083p(@mr2 String str, Bundle bundle, @mr2 C0747m<List<MediaBrowserCompat.MediaItem>> mVar) {
        mVar.mo5135k(4);
        mVar.mo5134j(null);
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: q */
    public void mo5084q(String str, Bundle bundle) {
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: r */
    public void mo5085r(String str) {
    }

    /* renamed from: s */
    public void mo5086s(String str, Bundle bundle, C0730f fVar, ul3 ul3) {
        C0728d dVar = new C0728d(str, ul3);
        this.f4212a = fVar;
        mo5076k(str, bundle, dVar);
        this.f4212a = null;
        if (!dVar.mo5131d()) {
            throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
        }
    }

    /* renamed from: t */
    public void mo5087t(String str, C0730f fVar, Bundle bundle, Bundle bundle2) {
        C0725a aVar = new C0725a(str, fVar, str, bundle, bundle2);
        this.f4212a = fVar;
        if (bundle == null) {
            mo5078m(str, aVar);
        } else {
            mo5079n(str, aVar, bundle);
        }
        this.f4212a = null;
        if (!aVar.mo5131d()) {
            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + fVar.f4239a + " id=" + str);
        }
    }

    /* renamed from: u */
    public void mo5088u(String str, C0730f fVar, ul3 ul3) {
        C0726b bVar = new C0726b(str, ul3);
        this.f4212a = fVar;
        mo5080o(str, bVar);
        this.f4212a = null;
        if (!bVar.mo5131d()) {
            throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
        }
    }

    /* renamed from: v */
    public void mo5089v(String str, Bundle bundle, C0730f fVar, ul3 ul3) {
        C0727c cVar = new C0727c(str, ul3);
        this.f4212a = fVar;
        mo5083p(str, bundle, cVar);
        this.f4212a = null;
        if (!cVar.mo5131d()) {
            throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
        }
    }

    /* renamed from: w */
    public boolean mo5090w(String str, C0730f fVar, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            try {
                if (fVar.f4240a.remove(str) == null) {
                    z = false;
                }
                return z;
            } finally {
                this.f4212a = fVar;
                mo5085r(str);
                this.f4212a = null;
            }
        } else {
            List list = fVar.f4240a.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((fy2) it.next()).f12385a) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    fVar.f4240a.remove(str);
                }
            }
            this.f4212a = fVar;
            mo5085r(str);
            this.f4212a = null;
            return z2;
        }
    }

    /* renamed from: x */
    public void mo5091x(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null.");
        } else if (this.f4211a == null) {
            this.f4211a = token;
            this.f4213a.mo5109k(token);
        } else {
            throw new IllegalStateException("The session token has already been set.");
        }
    }
}
