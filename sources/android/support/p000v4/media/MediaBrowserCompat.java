package android.support.p000v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BadParcelableException;
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
import android.support.p000v4.media.C0048a;
import android.support.p000v4.media.C0054b;
import android.support.p000v4.media.C0057c;
import android.support.p000v4.media.session.C0120b;
import android.support.p000v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;
import com.onedelhi.secure.C2267gq;
import com.onedelhi.secure.C3042oa;
import com.onedelhi.secure.bg2;
import com.onedelhi.secure.cg2;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pl2;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.ul3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {

    /* renamed from: a */
    public static final String f0a = "MediaBrowserCompat";

    /* renamed from: a */
    public static final boolean f1a = Log.isLoggable(f0a, 3);

    /* renamed from: b */
    public static final String f2b = "android.media.browse.extra.PAGE";

    /* renamed from: c */
    public static final String f3c = "android.media.browse.extra.PAGE_SIZE";

    /* renamed from: d */
    public static final String f4d = "android.media.browse.extra.MEDIA_ID";

    /* renamed from: e */
    public static final String f5e = "android.media.browse.extra.DOWNLOAD_PROGRESS";

    /* renamed from: f */
    public static final String f6f = "android.support.v4.media.action.DOWNLOAD";

    /* renamed from: g */
    public static final String f7g = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";

    /* renamed from: a */
    public final C0009e f8a;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    public static class CustomActionResultReceiver extends ul3 {

        /* renamed from: a */
        public final Bundle f9a;

        /* renamed from: a */
        public final C0006c f10a;

        /* renamed from: b */
        public final String f11b;

        public CustomActionResultReceiver(String str, Bundle bundle, C0006c cVar, Handler handler) {
            super(handler);
            this.f11b = str;
            this.f9a = bundle;
            this.f10a = cVar;
        }

        /* renamed from: a */
        public void mo16a(int i, Bundle bundle) {
            if (this.f10a != null) {
                MediaSessionCompat.m458b(bundle);
                if (i == -1) {
                    this.f10a.mo41a(this.f11b, this.f9a, bundle);
                } else if (i == 0) {
                    this.f10a.mo43c(this.f11b, this.f9a, bundle);
                } else if (i != 1) {
                    Log.w(MediaBrowserCompat.f0a, "Unknown result code: " + i + " (extras=" + this.f9a + ", resultData=" + bundle + pl2.f33727d);
                } else {
                    this.f10a.mo42b(this.f11b, this.f9a, bundle);
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    public static class ItemReceiver extends ul3 {

        /* renamed from: a */
        public final C0007d f12a;

        /* renamed from: b */
        public final String f13b;

        public ItemReceiver(String str, C0007d dVar, Handler handler) {
            super(handler);
            this.f13b = str;
            this.f12a = dVar;
        }

        /* renamed from: a */
        public void mo16a(int i, Bundle bundle) {
            MediaSessionCompat.m458b(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.f4203d)) {
                this.f12a.mo44a(this.f13b);
                return;
            }
            Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.f4203d);
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.f12a.mo45b((MediaItem) parcelable);
            } else {
                this.f12a.mo44a(this.f13b);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C0000a();

        /* renamed from: o */
        public static final int f14o = 1;

        /* renamed from: p */
        public static final int f15p = 2;

        /* renamed from: a */
        public final MediaDescriptionCompat f16a;

        /* renamed from: n */
        public final int f17n;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        public static class C0000a implements Parcelable.Creator<MediaItem> {
            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: b */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        @hl3({hl3.C2354a.f13187b})
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$b */
        public @interface C0001b {
        }

        public MediaItem(Parcel parcel) {
            this.f17n = parcel.readInt();
            this.f16a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public MediaItem(@mr2 MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.mo119h())) {
                this.f17n = i;
                this.f16a = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        /* renamed from: a */
        public static MediaItem m17a(Object obj) {
            if (obj == null) {
                return null;
            }
            return new MediaItem(MediaDescriptionCompat.m123a(C0048a.C0051c.m195a(obj)), C0048a.C0051c.m196b(obj));
        }

        /* renamed from: b */
        public static List<MediaItem> m18b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object a : list) {
                arrayList.add(m17a(a));
            }
            return arrayList;
        }

        @mr2
        /* renamed from: c */
        public MediaDescriptionCompat mo17c() {
            return this.f16a;
        }

        /* renamed from: d */
        public int mo18d() {
            return this.f17n;
        }

        public int describeContents() {
            return 0;
        }

        @ts2
        /* renamed from: e */
        public String mo20e() {
            return this.f16a.mo119h();
        }

        /* renamed from: f */
        public boolean mo21f() {
            return (this.f17n & 1) != 0;
        }

        /* renamed from: h */
        public boolean mo22h() {
            return (this.f17n & 2) != 0;
        }

        public String toString() {
            return "MediaItem{" + "mFlags=" + this.f17n + ", mDescription=" + this.f16a + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f17n);
            this.f16a.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    public static class SearchResultReceiver extends ul3 {

        /* renamed from: a */
        public final Bundle f18a;

        /* renamed from: a */
        public final C0031k f19a;

        /* renamed from: b */
        public final String f20b;

        public SearchResultReceiver(String str, Bundle bundle, C0031k kVar, Handler handler) {
            super(handler);
            this.f20b = str;
            this.f18a = bundle;
            this.f19a = kVar;
        }

        /* renamed from: a */
        public void mo16a(int i, Bundle bundle) {
            MediaSessionCompat.m458b(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.f4204e)) {
                this.f19a.mo86a(this.f20b, this.f18a);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(MediaBrowserServiceCompat.f4204e);
            ArrayList arrayList = null;
            if (parcelableArray != null) {
                arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            this.f19a.mo87b(this.f20b, this.f18a, arrayList);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    public static class C0002a extends Handler {

        /* renamed from: a */
        public final WeakReference<C0030j> f21a;

        /* renamed from: b */
        public WeakReference<Messenger> f22b;

        public C0002a(C0030j jVar) {
            this.f21a = new WeakReference<>(jVar);
        }

        /* renamed from: a */
        public void mo29a(Messenger messenger) {
            this.f22b = new WeakReference<>(messenger);
        }

        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f22b;
            if (weakReference != null && weakReference.get() != null && this.f21a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.m458b(data);
                C0030j jVar = (C0030j) this.f21a.get();
                Messenger messenger = (Messenger) this.f22b.get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        Bundle bundle = data.getBundle(cg2.f10257k);
                        MediaSessionCompat.m458b(bundle);
                        jVar.mo63g(messenger, data.getString(cg2.f10243d), (MediaSessionCompat.Token) data.getParcelable(cg2.f10247f), bundle);
                    } else if (i == 2) {
                        jVar.mo62f(messenger);
                    } else if (i != 3) {
                        Log.w(MediaBrowserCompat.f0a, "Unhandled message: " + message + "\n  Client version: " + 1 + "\n  Service version: " + message.arg1);
                    } else {
                        Bundle bundle2 = data.getBundle(cg2.f10249g);
                        MediaSessionCompat.m458b(bundle2);
                        Bundle bundle3 = data.getBundle(cg2.f10251h);
                        MediaSessionCompat.m458b(bundle3);
                        jVar.mo61e(messenger, data.getString(cg2.f10243d), data.getParcelableArrayList(cg2.f10245e), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    Log.e(MediaBrowserCompat.f0a, "Could not unparcel the data.");
                    if (message.what == 1) {
                        jVar.mo62f(messenger);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class C0003b {

        /* renamed from: a */
        public C0004a f23a;

        /* renamed from: a */
        public final Object f24a = C0048a.m182c(new C0005b());

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$a */
        public interface C0004a {
            /* renamed from: a */
            void mo35a();

            /* renamed from: b */
            void mo36b();

            /* renamed from: d */
            void mo37d();
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b */
        public class C0005b implements C0048a.C0049a {
            public C0005b() {
            }

            /* renamed from: a */
            public void mo38a() {
                C0004a aVar = C0003b.this.f23a;
                if (aVar != null) {
                    aVar.mo35a();
                }
                C0003b.this.mo33c();
            }

            /* renamed from: b */
            public void mo39b() {
                C0004a aVar = C0003b.this.f23a;
                if (aVar != null) {
                    aVar.mo36b();
                }
                C0003b.this.mo31a();
            }

            /* renamed from: d */
            public void mo40d() {
                C0004a aVar = C0003b.this.f23a;
                if (aVar != null) {
                    aVar.mo37d();
                }
                C0003b.this.mo32b();
            }
        }

        /* renamed from: a */
        public void mo31a() {
        }

        /* renamed from: b */
        public void mo32b() {
        }

        /* renamed from: c */
        public void mo33c() {
        }

        /* renamed from: d */
        public void mo34d(C0004a aVar) {
            this.f23a = aVar;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static abstract class C0006c {
        /* renamed from: a */
        public void mo41a(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: b */
        public void mo42b(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: c */
        public void mo43c(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    public static abstract class C0007d {

        /* renamed from: a */
        public final Object f26a;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$d$a */
        public class C0008a implements C0054b.C0055a {
            public C0008a() {
            }

            /* renamed from: a */
            public void mo46a(@mr2 String str) {
                C0007d.this.mo44a(str);
            }

            /* renamed from: b */
            public void mo47b(Parcel parcel) {
                C0007d dVar;
                MediaItem mediaItem;
                if (parcel == null) {
                    dVar = C0007d.this;
                    mediaItem = null;
                } else {
                    parcel.setDataPosition(0);
                    mediaItem = MediaItem.CREATOR.createFromParcel(parcel);
                    parcel.recycle();
                    dVar = C0007d.this;
                }
                dVar.mo45b(mediaItem);
            }
        }

        public C0007d() {
            this.f26a = Build.VERSION.SDK_INT >= 23 ? C0054b.m199a(new C0008a()) : null;
        }

        /* renamed from: a */
        public void mo44a(@mr2 String str) {
        }

        /* renamed from: b */
        public void mo45b(MediaItem mediaItem) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    public interface C0009e {
        @mr2
        /* renamed from: D1 */
        String mo48D1();

        /* renamed from: E1 */
        void mo49E1(@mr2 String str, Bundle bundle, @mr2 C0031k kVar);

        /* renamed from: F1 */
        ComponentName mo50F1();

        /* renamed from: G1 */
        void mo51G1();

        /* renamed from: H1 */
        void mo52H1(@mr2 String str, C0034n nVar);

        @ts2
        /* renamed from: I1 */
        Bundle mo53I1();

        /* renamed from: J1 */
        void mo54J1(@mr2 String str, @ts2 Bundle bundle, @mr2 C0034n nVar);

        /* renamed from: K1 */
        void mo55K1(@mr2 String str, Bundle bundle, @ts2 C0006c cVar);

        /* renamed from: L1 */
        void mo56L1(@mr2 String str, @mr2 C0007d dVar);

        @mr2
        /* renamed from: c */
        MediaSessionCompat.Token mo57c();

        void disconnect();

        @ts2
        Bundle getExtras();

        boolean isConnected();
    }

    @sj3(21)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    public static class C0010f implements C0009e, C0030j, C0003b.C0004a {

        /* renamed from: a */
        public int f28a;

        /* renamed from: a */
        public final Context f29a;

        /* renamed from: a */
        public final Bundle f30a;

        /* renamed from: a */
        public Messenger f31a;

        /* renamed from: a */
        public final C0002a f32a = new C0002a(this);

        /* renamed from: a */
        public C0032l f33a;

        /* renamed from: a */
        public MediaSessionCompat.Token f34a;

        /* renamed from: a */
        public final C3042oa<String, C0033m> f35a = new C3042oa<>();

        /* renamed from: a */
        public final Object f36a;

        /* renamed from: b */
        public Bundle f37b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$a */
        public class C0011a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0007d f38a;

            /* renamed from: b */
            public final /* synthetic */ String f40b;

            public C0011a(C0007d dVar, String str) {
                this.f38a = dVar;
                this.f40b = str;
            }

            public void run() {
                this.f38a.mo44a(this.f40b);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$b */
        public class C0012b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0007d f41a;

            /* renamed from: b */
            public final /* synthetic */ String f43b;

            public C0012b(C0007d dVar, String str) {
                this.f41a = dVar;
                this.f43b = str;
            }

            public void run() {
                this.f41a.mo44a(this.f43b);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$c */
        public class C0013c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0007d f44a;

            /* renamed from: b */
            public final /* synthetic */ String f46b;

            public C0013c(C0007d dVar, String str) {
                this.f44a = dVar;
                this.f46b = str;
            }

            public void run() {
                this.f44a.mo44a(this.f46b);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$d */
        public class C0014d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f47a;

            /* renamed from: a */
            public final /* synthetic */ C0031k f49a;

            /* renamed from: b */
            public final /* synthetic */ String f50b;

            public C0014d(C0031k kVar, String str, Bundle bundle) {
                this.f49a = kVar;
                this.f50b = str;
                this.f47a = bundle;
            }

            public void run() {
                this.f49a.mo86a(this.f50b, this.f47a);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$e */
        public class C0015e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f51a;

            /* renamed from: a */
            public final /* synthetic */ C0031k f53a;

            /* renamed from: b */
            public final /* synthetic */ String f54b;

            public C0015e(C0031k kVar, String str, Bundle bundle) {
                this.f53a = kVar;
                this.f54b = str;
                this.f51a = bundle;
            }

            public void run() {
                this.f53a.mo86a(this.f54b, this.f51a);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$f */
        public class C0016f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f55a;

            /* renamed from: a */
            public final /* synthetic */ C0006c f56a;

            /* renamed from: b */
            public final /* synthetic */ String f58b;

            public C0016f(C0006c cVar, String str, Bundle bundle) {
                this.f56a = cVar;
                this.f58b = str;
                this.f55a = bundle;
            }

            public void run() {
                this.f56a.mo41a(this.f58b, this.f55a, (Bundle) null);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$g */
        public class C0017g implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f59a;

            /* renamed from: a */
            public final /* synthetic */ C0006c f60a;

            /* renamed from: b */
            public final /* synthetic */ String f62b;

            public C0017g(C0006c cVar, String str, Bundle bundle) {
                this.f60a = cVar;
                this.f62b = str;
                this.f59a = bundle;
            }

            public void run() {
                this.f60a.mo41a(this.f62b, this.f59a, (Bundle) null);
            }
        }

        public C0010f(Context context, ComponentName componentName, C0003b bVar, Bundle bundle) {
            Bundle bundle2;
            this.f29a = context;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            this.f30a = bundle2;
            bundle2.putInt(cg2.f10267p, 1);
            bVar.mo34d(this);
            this.f36a = C0048a.m181b(context, componentName, bVar.f24a, bundle2);
        }

        @mr2
        /* renamed from: D1 */
        public String mo48D1() {
            return C0048a.m186g(this.f36a);
        }

        /* renamed from: E1 */
        public void mo49E1(@mr2 String str, Bundle bundle, @mr2 C0031k kVar) {
            if (!isConnected()) {
                throw new IllegalStateException("search() called while not connected");
            } else if (this.f33a == null) {
                Log.i(MediaBrowserCompat.f0a, "The connected service doesn't support search.");
                this.f32a.post(new C0014d(kVar, str, bundle));
            } else {
                try {
                    this.f33a.mo94g(str, bundle, new SearchResultReceiver(str, bundle, kVar, this.f32a), this.f31a);
                } catch (RemoteException e) {
                    Log.i(MediaBrowserCompat.f0a, "Remote error searching items with query: " + str, e);
                    this.f32a.post(new C0015e(kVar, str, bundle));
                }
            }
        }

        /* renamed from: F1 */
        public ComponentName mo50F1() {
            return C0048a.m187h(this.f36a);
        }

        /* renamed from: G1 */
        public void mo51G1() {
            C0048a.m180a(this.f36a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
            if (r1.size() == 0) goto L_0x0011;
         */
        /* renamed from: H1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo52H1(@com.onedelhi.secure.mr2 java.lang.String r8, android.support.p000v4.media.MediaBrowserCompat.C0034n r9) {
            /*
                r7 = this;
                com.onedelhi.secure.oa<java.lang.String, android.support.v4.media.MediaBrowserCompat$m> r0 = r7.f35a
                java.lang.Object r0 = r0.get(r8)
                android.support.v4.media.MediaBrowserCompat$m r0 = (android.support.p000v4.media.MediaBrowserCompat.C0033m) r0
                if (r0 != 0) goto L_0x000b
                return
            L_0x000b:
                android.support.v4.media.MediaBrowserCompat$l r1 = r7.f33a
                if (r1 != 0) goto L_0x003d
                if (r9 != 0) goto L_0x0017
            L_0x0011:
                java.lang.Object r1 = r7.f36a
                android.support.p000v4.media.C0048a.m191l(r1, r8)
                goto L_0x0084
            L_0x0017:
                java.util.List r1 = r0.mo99b()
                java.util.List r2 = r0.mo100c()
                int r3 = r1.size()
                int r3 = r3 + -1
            L_0x0025:
                if (r3 < 0) goto L_0x0036
                java.lang.Object r4 = r1.get(r3)
                if (r4 != r9) goto L_0x0033
                r1.remove(r3)
                r2.remove(r3)
            L_0x0033:
                int r3 = r3 + -1
                goto L_0x0025
            L_0x0036:
                int r1 = r1.size()
                if (r1 != 0) goto L_0x0084
                goto L_0x0011
            L_0x003d:
                if (r9 != 0) goto L_0x0046
                r2 = 0
                android.os.Messenger r3 = r7.f31a     // Catch:{ RemoteException -> 0x006e }
                r1.mo93f(r8, r2, r3)     // Catch:{ RemoteException -> 0x006e }
                goto L_0x0084
            L_0x0046:
                java.util.List r1 = r0.mo99b()     // Catch:{ RemoteException -> 0x006e }
                java.util.List r2 = r0.mo100c()     // Catch:{ RemoteException -> 0x006e }
                int r3 = r1.size()     // Catch:{ RemoteException -> 0x006e }
                int r3 = r3 + -1
            L_0x0054:
                if (r3 < 0) goto L_0x0084
                java.lang.Object r4 = r1.get(r3)     // Catch:{ RemoteException -> 0x006e }
                if (r4 != r9) goto L_0x006b
                android.support.v4.media.MediaBrowserCompat$l r4 = r7.f33a     // Catch:{ RemoteException -> 0x006e }
                android.os.IBinder r5 = r9.f108a     // Catch:{ RemoteException -> 0x006e }
                android.os.Messenger r6 = r7.f31a     // Catch:{ RemoteException -> 0x006e }
                r4.mo93f(r8, r5, r6)     // Catch:{ RemoteException -> 0x006e }
                r1.remove(r3)     // Catch:{ RemoteException -> 0x006e }
                r2.remove(r3)     // Catch:{ RemoteException -> 0x006e }
            L_0x006b:
                int r3 = r3 + -1
                goto L_0x0054
            L_0x006e:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "removeSubscription failed with RemoteException parentId="
                r1.append(r2)
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "MediaBrowserCompat"
                android.util.Log.d(r2, r1)
            L_0x0084:
                boolean r0 = r0.mo101d()
                if (r0 != 0) goto L_0x008c
                if (r9 != 0) goto L_0x0091
            L_0x008c:
                com.onedelhi.secure.oa<java.lang.String, android.support.v4.media.MediaBrowserCompat$m> r9 = r7.f35a
                r9.remove(r8)
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.media.MediaBrowserCompat.C0010f.mo52H1(java.lang.String, android.support.v4.media.MediaBrowserCompat$n):void");
        }

        /* renamed from: I1 */
        public Bundle mo53I1() {
            return this.f37b;
        }

        /* renamed from: J1 */
        public void mo54J1(@mr2 String str, Bundle bundle, @mr2 C0034n nVar) {
            C0033m mVar = this.f35a.get(str);
            if (mVar == null) {
                mVar = new C0033m();
                this.f35a.put(str, mVar);
            }
            nVar.mo107e(mVar);
            Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
            mVar.mo102e(bundle2, nVar);
            C0032l lVar = this.f33a;
            if (lVar == null) {
                C0048a.m190k(this.f36a, str, nVar.f109a);
                return;
            }
            try {
                lVar.mo88a(str, nVar.f108a, bundle2, this.f31a);
            } catch (RemoteException unused) {
                Log.i(MediaBrowserCompat.f0a, "Remote error subscribing media item: " + str);
            }
        }

        /* renamed from: K1 */
        public void mo55K1(@mr2 String str, Bundle bundle, @ts2 C0006c cVar) {
            if (isConnected()) {
                if (this.f33a == null) {
                    Log.i(MediaBrowserCompat.f0a, "The connected service doesn't support sendCustomAction.");
                    if (cVar != null) {
                        this.f32a.post(new C0016f(cVar, str, bundle));
                    }
                }
                try {
                    this.f33a.mo95h(str, bundle, new CustomActionResultReceiver(str, bundle, cVar, this.f32a), this.f31a);
                } catch (RemoteException e) {
                    Log.i(MediaBrowserCompat.f0a, "Remote error sending a custom action: action=" + str + ", extras=" + bundle, e);
                    if (cVar != null) {
                        this.f32a.post(new C0017g(cVar, str, bundle));
                    }
                }
            } else {
                throw new IllegalStateException("Cannot send a custom action (" + str + ") with " + "extras " + bundle + " because the browser is not connected to the " + "service.");
            }
        }

        /* renamed from: L1 */
        public void mo56L1(@mr2 String str, @mr2 C0007d dVar) {
            C0002a aVar;
            Runnable bVar;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            } else if (dVar != null) {
                if (!C0048a.m189j(this.f36a)) {
                    Log.i(MediaBrowserCompat.f0a, "Not connected, unable to retrieve the MediaItem.");
                    aVar = this.f32a;
                    bVar = new C0011a(dVar, str);
                } else if (this.f33a == null) {
                    aVar = this.f32a;
                    bVar = new C0012b(dVar, str);
                } else {
                    try {
                        this.f33a.mo91d(str, new ItemReceiver(str, dVar, this.f32a), this.f31a);
                        return;
                    } catch (RemoteException unused) {
                        Log.i(MediaBrowserCompat.f0a, "Remote error getting media item: " + str);
                        this.f32a.post(new C0013c(dVar, str));
                        return;
                    }
                }
                aVar.post(bVar);
            } else {
                throw new IllegalArgumentException("cb is null");
            }
        }

        /* renamed from: a */
        public void mo35a() {
            this.f33a = null;
            this.f31a = null;
            this.f34a = null;
            this.f32a.mo29a((Messenger) null);
        }

        /* renamed from: b */
        public void mo36b() {
            Bundle f = C0048a.m185f(this.f36a);
            if (f != null) {
                this.f28a = f.getInt(cg2.f10269q, 0);
                IBinder a = C2267gq.m16043a(f, cg2.f10270r);
                if (a != null) {
                    this.f33a = new C0032l(a, this.f30a);
                    Messenger messenger = new Messenger(this.f32a);
                    this.f31a = messenger;
                    this.f32a.mo29a(messenger);
                    try {
                        this.f33a.mo92e(this.f29a, this.f31a);
                    } catch (RemoteException unused) {
                        Log.i(MediaBrowserCompat.f0a, "Remote error registering client messenger.");
                    }
                }
                C0120b j8 = C0120b.C0121a.m880j8(C2267gq.m16043a(f, cg2.f10271s));
                if (j8 != null) {
                    this.f34a = MediaSessionCompat.Token.m500c(C0048a.m188i(this.f36a), j8);
                }
            }
        }

        @mr2
        /* renamed from: c */
        public MediaSessionCompat.Token mo57c() {
            if (this.f34a == null) {
                this.f34a = MediaSessionCompat.Token.m499b(C0048a.m188i(this.f36a));
            }
            return this.f34a;
        }

        /* renamed from: d */
        public void mo37d() {
        }

        public void disconnect() {
            Messenger messenger;
            C0032l lVar = this.f33a;
            if (!(lVar == null || (messenger = this.f31a) == null)) {
                try {
                    lVar.mo97j(messenger);
                } catch (RemoteException unused) {
                    Log.i(MediaBrowserCompat.f0a, "Remote error unregistering client messenger.");
                }
            }
            C0048a.m184e(this.f36a);
        }

        /* renamed from: e */
        public void mo61e(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f31a == messenger) {
                C0033m mVar = this.f35a.get(str);
                if (mVar != null) {
                    C0034n a = mVar.mo98a(bundle);
                    if (a != null) {
                        if (bundle == null) {
                            if (list == null) {
                                a.mo105c(str);
                                return;
                            } else {
                                this.f37b = bundle2;
                                a.mo103a(str, list);
                            }
                        } else if (list == null) {
                            a.mo106d(str, bundle);
                            return;
                        } else {
                            this.f37b = bundle2;
                            a.mo104b(str, list, bundle);
                        }
                        this.f37b = null;
                    }
                } else if (MediaBrowserCompat.f1a) {
                    Log.d(MediaBrowserCompat.f0a, "onLoadChildren for id that isn't subscribed id=" + str);
                }
            }
        }

        /* renamed from: f */
        public void mo62f(Messenger messenger) {
        }

        /* renamed from: g */
        public void mo63g(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @ts2
        public Bundle getExtras() {
            return C0048a.m185f(this.f36a);
        }

        public boolean isConnected() {
            return C0048a.m189j(this.f36a);
        }
    }

    @sj3(23)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    public static class C0018g extends C0010f {
        public C0018g(Context context, ComponentName componentName, C0003b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }

        /* renamed from: L1 */
        public void mo56L1(@mr2 String str, @mr2 C0007d dVar) {
            if (this.f33a == null) {
                C0054b.m200b(this.f36a, str, dVar.f26a);
            } else {
                super.mo56L1(str, dVar);
            }
        }
    }

    @sj3(26)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    public static class C0019h extends C0018g {
        public C0019h(Context context, ComponentName componentName, C0003b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }

        /* renamed from: H1 */
        public void mo52H1(@mr2 String str, C0034n nVar) {
            if (this.f33a != null && this.f28a >= 2) {
                super.mo52H1(str, nVar);
            } else if (nVar == null) {
                C0048a.m191l(this.f36a, str);
            } else {
                C0057c.m205c(this.f36a, str, nVar.f109a);
            }
        }

        /* renamed from: J1 */
        public void mo54J1(@mr2 String str, @ts2 Bundle bundle, @mr2 C0034n nVar) {
            if (this.f33a != null && this.f28a >= 2) {
                super.mo54J1(str, bundle, nVar);
            } else if (bundle == null) {
                C0048a.m190k(this.f36a, str, nVar.f109a);
            } else {
                C0057c.m204b(this.f36a, str, bundle, nVar.f109a);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    public static class C0020i implements C0009e, C0030j {

        /* renamed from: b */
        public static final int f63b = 0;

        /* renamed from: c */
        public static final int f64c = 1;

        /* renamed from: d */
        public static final int f65d = 2;

        /* renamed from: e */
        public static final int f66e = 3;

        /* renamed from: f */
        public static final int f67f = 4;

        /* renamed from: a */
        public int f68a = 1;

        /* renamed from: a */
        public final ComponentName f69a;

        /* renamed from: a */
        public final Context f70a;

        /* renamed from: a */
        public final Bundle f71a;

        /* renamed from: a */
        public Messenger f72a;

        /* renamed from: a */
        public final C0002a f73a = new C0002a(this);

        /* renamed from: a */
        public final C0003b f74a;

        /* renamed from: a */
        public C0027g f75a;

        /* renamed from: a */
        public C0032l f76a;

        /* renamed from: a */
        public MediaSessionCompat.Token f77a;

        /* renamed from: a */
        public final C3042oa<String, C0033m> f78a = new C3042oa<>();

        /* renamed from: a */
        public String f79a;

        /* renamed from: b */
        public Bundle f80b;

        /* renamed from: c */
        public Bundle f81c;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$a */
        public class C0021a implements Runnable {
            public C0021a() {
            }

            public void run() {
                C0020i iVar = C0020i.this;
                if (iVar.f68a != 0) {
                    iVar.f68a = 2;
                    if (MediaBrowserCompat.f1a && iVar.f75a != null) {
                        throw new RuntimeException("mServiceConnection should be null. Instead it is " + C0020i.this.f75a);
                    } else if (iVar.f76a != null) {
                        throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + C0020i.this.f76a);
                    } else if (iVar.f72a == null) {
                        Intent intent = new Intent(MediaBrowserServiceCompat.f4202c);
                        intent.setComponent(C0020i.this.f69a);
                        C0020i iVar2 = C0020i.this;
                        iVar2.f75a = new C0027g();
                        boolean z = false;
                        try {
                            C0020i iVar3 = C0020i.this;
                            z = iVar3.f70a.bindService(intent, iVar3.f75a, 1);
                        } catch (Exception unused) {
                            Log.e(MediaBrowserCompat.f0a, "Failed binding to service " + C0020i.this.f69a);
                        }
                        if (!z) {
                            C0020i.this.mo72b();
                            C0020i.this.f74a.mo32b();
                        }
                        if (MediaBrowserCompat.f1a) {
                            Log.d(MediaBrowserCompat.f0a, "connect...");
                            C0020i.this.mo71a();
                        }
                    } else {
                        throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + C0020i.this.f72a);
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$b */
        public class C0022b implements Runnable {
            public C0022b() {
            }

            public void run() {
                C0020i iVar = C0020i.this;
                Messenger messenger = iVar.f72a;
                if (messenger != null) {
                    try {
                        iVar.f76a.mo90c(messenger);
                    } catch (RemoteException unused) {
                        Log.w(MediaBrowserCompat.f0a, "RemoteException during connect for " + C0020i.this.f69a);
                    }
                }
                C0020i iVar2 = C0020i.this;
                int i = iVar2.f68a;
                iVar2.mo72b();
                if (i != 0) {
                    C0020i.this.f68a = i;
                }
                if (MediaBrowserCompat.f1a) {
                    Log.d(MediaBrowserCompat.f0a, "disconnect...");
                    C0020i.this.mo71a();
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$c */
        public class C0023c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0007d f84a;

            /* renamed from: b */
            public final /* synthetic */ String f86b;

            public C0023c(C0007d dVar, String str) {
                this.f84a = dVar;
                this.f86b = str;
            }

            public void run() {
                this.f84a.mo44a(this.f86b);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$d */
        public class C0024d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0007d f87a;

            /* renamed from: b */
            public final /* synthetic */ String f89b;

            public C0024d(C0007d dVar, String str) {
                this.f87a = dVar;
                this.f89b = str;
            }

            public void run() {
                this.f87a.mo44a(this.f89b);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$e */
        public class C0025e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f90a;

            /* renamed from: a */
            public final /* synthetic */ C0031k f92a;

            /* renamed from: b */
            public final /* synthetic */ String f93b;

            public C0025e(C0031k kVar, String str, Bundle bundle) {
                this.f92a = kVar;
                this.f93b = str;
                this.f90a = bundle;
            }

            public void run() {
                this.f92a.mo86a(this.f93b, this.f90a);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$f */
        public class C0026f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f94a;

            /* renamed from: a */
            public final /* synthetic */ C0006c f95a;

            /* renamed from: b */
            public final /* synthetic */ String f97b;

            public C0026f(C0006c cVar, String str, Bundle bundle) {
                this.f95a = cVar;
                this.f97b = str;
                this.f94a = bundle;
            }

            public void run() {
                this.f95a.mo41a(this.f97b, this.f94a, (Bundle) null);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$g */
        public class C0027g implements ServiceConnection {

            /* renamed from: android.support.v4.media.MediaBrowserCompat$i$g$a */
            public class C0028a implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ ComponentName f99a;

                /* renamed from: a */
                public final /* synthetic */ IBinder f100a;

                public C0028a(ComponentName componentName, IBinder iBinder) {
                    this.f99a = componentName;
                    this.f100a = iBinder;
                }

                public void run() {
                    boolean z = MediaBrowserCompat.f1a;
                    if (z) {
                        Log.d(MediaBrowserCompat.f0a, "MediaServiceConnection.onServiceConnected name=" + this.f99a + " binder=" + this.f100a);
                        C0020i.this.mo71a();
                    }
                    if (C0027g.this.mo80a("onServiceConnected")) {
                        C0020i iVar = C0020i.this;
                        iVar.f76a = new C0032l(this.f100a, iVar.f71a);
                        C0020i.this.f72a = new Messenger(C0020i.this.f73a);
                        C0020i iVar2 = C0020i.this;
                        iVar2.f73a.mo29a(iVar2.f72a);
                        C0020i.this.f68a = 2;
                        if (z) {
                            try {
                                Log.d(MediaBrowserCompat.f0a, "ServiceCallbacks.onConnect...");
                                C0020i.this.mo71a();
                            } catch (RemoteException unused) {
                                Log.w(MediaBrowserCompat.f0a, "RemoteException during connect for " + C0020i.this.f69a);
                                if (MediaBrowserCompat.f1a) {
                                    Log.d(MediaBrowserCompat.f0a, "ServiceCallbacks.onConnect...");
                                    C0020i.this.mo71a();
                                    return;
                                }
                                return;
                            }
                        }
                        C0020i iVar3 = C0020i.this;
                        iVar3.f76a.mo89b(iVar3.f70a, iVar3.f72a);
                    }
                }
            }

            /* renamed from: android.support.v4.media.MediaBrowserCompat$i$g$b */
            public class C0029b implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ ComponentName f102a;

                public C0029b(ComponentName componentName) {
                    this.f102a = componentName;
                }

                public void run() {
                    if (MediaBrowserCompat.f1a) {
                        Log.d(MediaBrowserCompat.f0a, "MediaServiceConnection.onServiceDisconnected name=" + this.f102a + " this=" + this + " mServiceConnection=" + C0020i.this.f75a);
                        C0020i.this.mo71a();
                    }
                    if (C0027g.this.mo80a("onServiceDisconnected")) {
                        C0020i iVar = C0020i.this;
                        iVar.f76a = null;
                        iVar.f72a = null;
                        iVar.f73a.mo29a((Messenger) null);
                        C0020i iVar2 = C0020i.this;
                        iVar2.f68a = 4;
                        iVar2.f74a.mo33c();
                    }
                }
            }

            public C0027g() {
            }

            /* renamed from: a */
            public boolean mo80a(String str) {
                int i;
                C0020i iVar = C0020i.this;
                if (iVar.f75a == this && (i = iVar.f68a) != 0 && i != 1) {
                    return true;
                }
                int i2 = iVar.f68a;
                if (i2 == 0 || i2 == 1) {
                    return false;
                }
                Log.i(MediaBrowserCompat.f0a, str + " for " + C0020i.this.f69a + " with mServiceConnection=" + C0020i.this.f75a + " this=" + this);
                return false;
            }

            /* renamed from: b */
            public final void mo81b(Runnable runnable) {
                if (Thread.currentThread() == C0020i.this.f73a.getLooper().getThread()) {
                    runnable.run();
                } else {
                    C0020i.this.f73a.post(runnable);
                }
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                mo81b(new C0028a(componentName, iBinder));
            }

            public void onServiceDisconnected(ComponentName componentName) {
                mo81b(new C0029b(componentName));
            }
        }

        public C0020i(Context context, ComponentName componentName, C0003b bVar, Bundle bundle) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (bVar != null) {
                this.f70a = context;
                this.f69a = componentName;
                this.f74a = bVar;
                this.f71a = bundle == null ? null : new Bundle(bundle);
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        /* renamed from: d */
        public static String m74d(int i) {
            if (i == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i == 4) {
                return "CONNECT_STATE_SUSPENDED";
            }
            return "UNKNOWN/" + i;
        }

        @mr2
        /* renamed from: D1 */
        public String mo48D1() {
            if (isConnected()) {
                return this.f79a;
            }
            throw new IllegalStateException("getRoot() called while not connected(state=" + m74d(this.f68a) + pl2.f33727d);
        }

        /* renamed from: E1 */
        public void mo49E1(@mr2 String str, Bundle bundle, @mr2 C0031k kVar) {
            if (isConnected()) {
                try {
                    this.f76a.mo94g(str, bundle, new SearchResultReceiver(str, bundle, kVar, this.f73a), this.f72a);
                } catch (RemoteException e) {
                    Log.i(MediaBrowserCompat.f0a, "Remote error searching items with query: " + str, e);
                    this.f73a.post(new C0025e(kVar, str, bundle));
                }
            } else {
                throw new IllegalStateException("search() called while not connected (state=" + m74d(this.f68a) + pl2.f33727d);
            }
        }

        @mr2
        /* renamed from: F1 */
        public ComponentName mo50F1() {
            if (isConnected()) {
                return this.f69a;
            }
            throw new IllegalStateException("getServiceComponent() called while not connected (state=" + this.f68a + pl2.f33727d);
        }

        /* renamed from: G1 */
        public void mo51G1() {
            int i = this.f68a;
            if (i == 0 || i == 1) {
                this.f68a = 2;
                this.f73a.post(new C0021a());
                return;
            }
            throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + m74d(this.f68a) + pl2.f33727d);
        }

        /* renamed from: H1 */
        public void mo52H1(@mr2 String str, C0034n nVar) {
            C0033m mVar = this.f78a.get(str);
            if (mVar != null) {
                if (nVar == null) {
                    try {
                        if (isConnected()) {
                            this.f76a.mo93f(str, (IBinder) null, this.f72a);
                        }
                    } catch (RemoteException unused) {
                        Log.d(MediaBrowserCompat.f0a, "removeSubscription failed with RemoteException parentId=" + str);
                    }
                } else {
                    List<C0034n> b = mVar.mo99b();
                    List<Bundle> c = mVar.mo100c();
                    for (int size = b.size() - 1; size >= 0; size--) {
                        if (b.get(size) == nVar) {
                            if (isConnected()) {
                                this.f76a.mo93f(str, nVar.f108a, this.f72a);
                            }
                            b.remove(size);
                            c.remove(size);
                        }
                    }
                }
                if (mVar.mo101d() || nVar == null) {
                    this.f78a.remove(str);
                }
            }
        }

        /* renamed from: I1 */
        public Bundle mo53I1() {
            return this.f81c;
        }

        /* renamed from: J1 */
        public void mo54J1(@mr2 String str, Bundle bundle, @mr2 C0034n nVar) {
            C0033m mVar = this.f78a.get(str);
            if (mVar == null) {
                mVar = new C0033m();
                this.f78a.put(str, mVar);
            }
            Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
            mVar.mo102e(bundle2, nVar);
            if (isConnected()) {
                try {
                    this.f76a.mo88a(str, nVar.f108a, bundle2, this.f72a);
                } catch (RemoteException unused) {
                    Log.d(MediaBrowserCompat.f0a, "addSubscription failed with RemoteException parentId=" + str);
                }
            }
        }

        /* renamed from: K1 */
        public void mo55K1(@mr2 String str, Bundle bundle, @ts2 C0006c cVar) {
            if (isConnected()) {
                try {
                    this.f76a.mo95h(str, bundle, new CustomActionResultReceiver(str, bundle, cVar, this.f73a), this.f72a);
                } catch (RemoteException e) {
                    Log.i(MediaBrowserCompat.f0a, "Remote error sending a custom action: action=" + str + ", extras=" + bundle, e);
                    if (cVar != null) {
                        this.f73a.post(new C0026f(cVar, str, bundle));
                    }
                }
            } else {
                throw new IllegalStateException("Cannot send a custom action (" + str + ") with " + "extras " + bundle + " because the browser is not connected to the " + "service.");
            }
        }

        /* renamed from: L1 */
        public void mo56L1(@mr2 String str, @mr2 C0007d dVar) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            } else if (dVar == null) {
                throw new IllegalArgumentException("cb is null");
            } else if (!isConnected()) {
                Log.i(MediaBrowserCompat.f0a, "Not connected, unable to retrieve the MediaItem.");
                this.f73a.post(new C0023c(dVar, str));
            } else {
                try {
                    this.f76a.mo91d(str, new ItemReceiver(str, dVar, this.f73a), this.f72a);
                } catch (RemoteException unused) {
                    Log.i(MediaBrowserCompat.f0a, "Remote error getting media item: " + str);
                    this.f73a.post(new C0024d(dVar, str));
                }
            }
        }

        /* renamed from: a */
        public void mo71a() {
            Log.d(MediaBrowserCompat.f0a, "MediaBrowserCompat...");
            Log.d(MediaBrowserCompat.f0a, "  mServiceComponent=" + this.f69a);
            Log.d(MediaBrowserCompat.f0a, "  mCallback=" + this.f74a);
            Log.d(MediaBrowserCompat.f0a, "  mRootHints=" + this.f71a);
            Log.d(MediaBrowserCompat.f0a, "  mState=" + m74d(this.f68a));
            Log.d(MediaBrowserCompat.f0a, "  mServiceConnection=" + this.f75a);
            Log.d(MediaBrowserCompat.f0a, "  mServiceBinderWrapper=" + this.f76a);
            Log.d(MediaBrowserCompat.f0a, "  mCallbacksMessenger=" + this.f72a);
            Log.d(MediaBrowserCompat.f0a, "  mRootId=" + this.f79a);
            Log.d(MediaBrowserCompat.f0a, "  mMediaSessionToken=" + this.f77a);
        }

        /* renamed from: b */
        public void mo72b() {
            C0027g gVar = this.f75a;
            if (gVar != null) {
                this.f70a.unbindService(gVar);
            }
            this.f68a = 1;
            this.f75a = null;
            this.f76a = null;
            this.f72a = null;
            this.f73a.mo29a((Messenger) null);
            this.f79a = null;
            this.f77a = null;
        }

        @mr2
        /* renamed from: c */
        public MediaSessionCompat.Token mo57c() {
            if (isConnected()) {
                return this.f77a;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.f68a + pl2.f33727d);
        }

        public void disconnect() {
            this.f68a = 0;
            this.f73a.post(new C0022b());
        }

        /* renamed from: e */
        public void mo61e(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (mo73h(messenger, "onLoadChildren")) {
                boolean z = MediaBrowserCompat.f1a;
                if (z) {
                    Log.d(MediaBrowserCompat.f0a, "onLoadChildren for " + this.f69a + " id=" + str);
                }
                C0033m mVar = this.f78a.get(str);
                if (mVar != null) {
                    C0034n a = mVar.mo98a(bundle);
                    if (a != null) {
                        if (bundle == null) {
                            if (list == null) {
                                a.mo105c(str);
                                return;
                            } else {
                                this.f81c = bundle2;
                                a.mo103a(str, list);
                            }
                        } else if (list == null) {
                            a.mo106d(str, bundle);
                            return;
                        } else {
                            this.f81c = bundle2;
                            a.mo104b(str, list, bundle);
                        }
                        this.f81c = null;
                    }
                } else if (z) {
                    Log.d(MediaBrowserCompat.f0a, "onLoadChildren for id that isn't subscribed id=" + str);
                }
            }
        }

        /* renamed from: f */
        public void mo62f(Messenger messenger) {
            Log.e(MediaBrowserCompat.f0a, "onConnectFailed for " + this.f69a);
            if (mo73h(messenger, "onConnectFailed")) {
                if (this.f68a != 2) {
                    Log.w(MediaBrowserCompat.f0a, "onConnect from service while mState=" + m74d(this.f68a) + "... ignoring");
                    return;
                }
                mo72b();
                this.f74a.mo32b();
            }
        }

        /* renamed from: g */
        public void mo63g(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (mo73h(messenger, "onConnect")) {
                if (this.f68a != 2) {
                    Log.w(MediaBrowserCompat.f0a, "onConnect from service while mState=" + m74d(this.f68a) + "... ignoring");
                    return;
                }
                this.f79a = str;
                this.f77a = token;
                this.f80b = bundle;
                this.f68a = 3;
                if (MediaBrowserCompat.f1a) {
                    Log.d(MediaBrowserCompat.f0a, "ServiceCallbacks.onConnect...");
                    mo71a();
                }
                this.f74a.mo31a();
                try {
                    for (Map.Entry next : this.f78a.entrySet()) {
                        String str2 = (String) next.getKey();
                        C0033m mVar = (C0033m) next.getValue();
                        List<C0034n> b = mVar.mo99b();
                        List<Bundle> c = mVar.mo100c();
                        for (int i = 0; i < b.size(); i++) {
                            this.f76a.mo88a(str2, b.get(i).f108a, c.get(i), this.f72a);
                        }
                    }
                } catch (RemoteException unused) {
                    Log.d(MediaBrowserCompat.f0a, "addSubscription failed with RemoteException.");
                }
            }
        }

        @ts2
        public Bundle getExtras() {
            if (isConnected()) {
                return this.f80b;
            }
            throw new IllegalStateException("getExtras() called while not connected (state=" + m74d(this.f68a) + pl2.f33727d);
        }

        /* renamed from: h */
        public final boolean mo73h(Messenger messenger, String str) {
            int i;
            if (this.f72a == messenger && (i = this.f68a) != 0 && i != 1) {
                return true;
            }
            int i2 = this.f68a;
            if (i2 == 0 || i2 == 1) {
                return false;
            }
            Log.i(MediaBrowserCompat.f0a, str + " for " + this.f69a + " with mCallbacksMessenger=" + this.f72a + " this=" + this);
            return false;
        }

        public boolean isConnected() {
            return this.f68a == 3;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$j */
    public interface C0030j {
        /* renamed from: e */
        void mo61e(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

        /* renamed from: f */
        void mo62f(Messenger messenger);

        /* renamed from: g */
        void mo63g(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$k */
    public static abstract class C0031k {
        /* renamed from: a */
        public void mo86a(@mr2 String str, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo87b(@mr2 String str, Bundle bundle, @mr2 List<MediaItem> list) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$l */
    public static class C0032l {

        /* renamed from: a */
        public Bundle f104a;

        /* renamed from: a */
        public Messenger f105a;

        public C0032l(IBinder iBinder, Bundle bundle) {
            this.f105a = new Messenger(iBinder);
            this.f104a = bundle;
        }

        /* renamed from: a */
        public void mo88a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(cg2.f10243d, str);
            C2267gq.m16044b(bundle2, cg2.f10237a, iBinder);
            bundle2.putBundle(cg2.f10249g, bundle);
            mo96i(3, bundle2, messenger);
        }

        /* renamed from: b */
        public void mo89b(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(cg2.f10253i, context.getPackageName());
            bundle.putBundle(cg2.f10257k, this.f104a);
            mo96i(1, bundle, messenger);
        }

        /* renamed from: c */
        public void mo90c(Messenger messenger) throws RemoteException {
            mo96i(2, (Bundle) null, messenger);
        }

        /* renamed from: d */
        public void mo91d(String str, ul3 ul3, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(cg2.f10243d, str);
            bundle.putParcelable(cg2.f10255j, ul3);
            mo96i(5, bundle, messenger);
        }

        /* renamed from: e */
        public void mo92e(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(cg2.f10253i, context.getPackageName());
            bundle.putBundle(cg2.f10257k, this.f104a);
            mo96i(6, bundle, messenger);
        }

        /* renamed from: f */
        public void mo93f(String str, IBinder iBinder, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(cg2.f10243d, str);
            C2267gq.m16044b(bundle, cg2.f10237a, iBinder);
            mo96i(4, bundle, messenger);
        }

        /* renamed from: g */
        public void mo94g(String str, Bundle bundle, ul3 ul3, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(cg2.f10261m, str);
            bundle2.putBundle(cg2.f10259l, bundle);
            bundle2.putParcelable(cg2.f10255j, ul3);
            mo96i(8, bundle2, messenger);
        }

        /* renamed from: h */
        public void mo95h(String str, Bundle bundle, ul3 ul3, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(cg2.f10263n, str);
            bundle2.putBundle(cg2.f10265o, bundle);
            bundle2.putParcelable(cg2.f10255j, ul3);
            mo96i(9, bundle2, messenger);
        }

        /* renamed from: i */
        public final void mo96i(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f105a.send(obtain);
        }

        /* renamed from: j */
        public void mo97j(Messenger messenger) throws RemoteException {
            mo96i(7, (Bundle) null, messenger);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$m */
    public static class C0033m {

        /* renamed from: a */
        public final List<C0034n> f106a = new ArrayList();

        /* renamed from: b */
        public final List<Bundle> f107b = new ArrayList();

        /* renamed from: a */
        public C0034n mo98a(Bundle bundle) {
            for (int i = 0; i < this.f107b.size(); i++) {
                if (bg2.m11852a(this.f107b.get(i), bundle)) {
                    return this.f106a.get(i);
                }
            }
            return null;
        }

        /* renamed from: b */
        public List<C0034n> mo99b() {
            return this.f106a;
        }

        /* renamed from: c */
        public List<Bundle> mo100c() {
            return this.f107b;
        }

        /* renamed from: d */
        public boolean mo101d() {
            return this.f106a.isEmpty();
        }

        /* renamed from: e */
        public void mo102e(Bundle bundle, C0034n nVar) {
            for (int i = 0; i < this.f107b.size(); i++) {
                if (bg2.m11852a(this.f107b.get(i), bundle)) {
                    this.f106a.set(i, nVar);
                    return;
                }
            }
            this.f106a.add(nVar);
            this.f107b.add(bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$n */
    public static abstract class C0034n {

        /* renamed from: a */
        public final IBinder f108a = new Binder();

        /* renamed from: a */
        public final Object f109a;

        /* renamed from: a */
        public WeakReference<C0033m> f110a;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$n$a */
        public class C0035a implements C0048a.C0052d {
            public C0035a() {
            }

            /* renamed from: a */
            public void mo108a(@mr2 String str) {
                C0034n.this.mo105c(str);
            }

            /* renamed from: b */
            public void mo109b(@mr2 String str, List<?> list) {
                WeakReference<C0033m> weakReference = C0034n.this.f110a;
                C0033m mVar = weakReference == null ? null : (C0033m) weakReference.get();
                if (mVar == null) {
                    C0034n.this.mo103a(str, MediaItem.m18b(list));
                    return;
                }
                List<MediaItem> b = MediaItem.m18b(list);
                List<C0034n> b2 = mVar.mo99b();
                List<Bundle> c = mVar.mo100c();
                for (int i = 0; i < b2.size(); i++) {
                    Bundle bundle = c.get(i);
                    if (bundle == null) {
                        C0034n.this.mo103a(str, b);
                    } else {
                        C0034n.this.mo104b(str, mo110e(b, bundle), bundle);
                    }
                }
            }

            /* renamed from: e */
            public List<MediaItem> mo110e(List<MediaItem> list, Bundle bundle) {
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
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$n$b */
        public class C0036b extends C0035a implements C0057c.C0058a {
            public C0036b() {
                super();
            }

            /* renamed from: c */
            public void mo111c(@mr2 String str, List<?> list, @mr2 Bundle bundle) {
                C0034n.this.mo104b(str, MediaItem.m18b(list), bundle);
            }

            /* renamed from: d */
            public void mo112d(@mr2 String str, @mr2 Bundle bundle) {
                C0034n.this.mo106d(str, bundle);
            }
        }

        public C0034n() {
            this.f109a = Build.VERSION.SDK_INT >= 26 ? C0057c.m203a(new C0036b()) : C0048a.m183d(new C0035a());
        }

        /* renamed from: a */
        public void mo103a(@mr2 String str, @mr2 List<MediaItem> list) {
        }

        /* renamed from: b */
        public void mo104b(@mr2 String str, @mr2 List<MediaItem> list, @mr2 Bundle bundle) {
        }

        /* renamed from: c */
        public void mo105c(@mr2 String str) {
        }

        /* renamed from: d */
        public void mo106d(@mr2 String str, @mr2 Bundle bundle) {
        }

        /* renamed from: e */
        public void mo107e(C0033m mVar) {
            this.f110a = new WeakReference<>(mVar);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0003b bVar, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        this.f8a = i >= 26 ? new C0019h(context, componentName, bVar, bundle) : i >= 23 ? new C0018g(context, componentName, bVar, bundle) : new C0010f(context, componentName, bVar, bundle);
    }

    /* renamed from: a */
    public void mo1a() {
        this.f8a.mo51G1();
    }

    /* renamed from: b */
    public void mo2b() {
        this.f8a.disconnect();
    }

    @ts2
    /* renamed from: c */
    public Bundle mo3c() {
        return this.f8a.getExtras();
    }

    /* renamed from: d */
    public void mo4d(@mr2 String str, @mr2 C0007d dVar) {
        this.f8a.mo56L1(str, dVar);
    }

    @ts2
    @hl3({hl3.C2354a.f13185a})
    /* renamed from: e */
    public Bundle mo5e() {
        return this.f8a.mo53I1();
    }

    @mr2
    /* renamed from: f */
    public String mo6f() {
        return this.f8a.mo48D1();
    }

    @mr2
    /* renamed from: g */
    public ComponentName mo7g() {
        return this.f8a.mo50F1();
    }

    @mr2
    /* renamed from: h */
    public MediaSessionCompat.Token mo8h() {
        return this.f8a.mo57c();
    }

    /* renamed from: i */
    public boolean mo9i() {
        return this.f8a.isConnected();
    }

    /* renamed from: j */
    public void mo10j(@mr2 String str, Bundle bundle, @mr2 C0031k kVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query cannot be empty");
        } else if (kVar != null) {
            this.f8a.mo49E1(str, bundle, kVar);
        } else {
            throw new IllegalArgumentException("callback cannot be null");
        }
    }

    /* renamed from: k */
    public void mo11k(@mr2 String str, Bundle bundle, @ts2 C0006c cVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f8a.mo55K1(str, bundle, cVar);
            return;
        }
        throw new IllegalArgumentException("action cannot be empty");
    }

    /* renamed from: l */
    public void mo12l(@mr2 String str, @mr2 Bundle bundle, @mr2 C0034n nVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (nVar == null) {
            throw new IllegalArgumentException("callback is null");
        } else if (bundle != null) {
            this.f8a.mo54J1(str, bundle, nVar);
        } else {
            throw new IllegalArgumentException("options are null");
        }
    }

    /* renamed from: m */
    public void mo13m(@mr2 String str, @mr2 C0034n nVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (nVar != null) {
            this.f8a.mo54J1(str, (Bundle) null, nVar);
        } else {
            throw new IllegalArgumentException("callback is null");
        }
    }

    /* renamed from: n */
    public void mo14n(@mr2 String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f8a.mo52H1(str, (C0034n) null);
            return;
        }
        throw new IllegalArgumentException("parentId is empty");
    }

    /* renamed from: o */
    public void mo15o(@mr2 String str, @mr2 C0034n nVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (nVar != null) {
            this.f8a.mo52H1(str, nVar);
        } else {
            throw new IllegalArgumentException("callback is null");
        }
    }
}
