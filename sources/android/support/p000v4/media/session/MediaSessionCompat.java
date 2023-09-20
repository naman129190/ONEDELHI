package android.support.p000v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.p000v4.media.MediaDescriptionCompat;
import android.support.p000v4.media.MediaMetadataCompat;
import android.support.p000v4.media.RatingCompat;
import android.support.p000v4.media.session.C0120b;
import android.support.p000v4.media.session.C0132f;
import android.support.p000v4.media.session.C0136g;
import android.support.p000v4.media.session.C0139h;
import android.support.p000v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media.C0773d;
import androidx.media.session.MediaButtonReceiver;
import com.onedelhi.secure.C2267gq;
import com.onedelhi.secure.eg2;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.kw4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {
    @hl3({hl3.C2354a.f13187b})

    /* renamed from: A */
    public static final String f253A = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE";

    /* renamed from: B */
    public static final String f254B = "data_calling_pkg";

    /* renamed from: C */
    public static final String f255C = "data_calling_pid";

    /* renamed from: D */
    public static final String f256D = "data_calling_uid";

    /* renamed from: E */
    public static final String f257E = "data_extras";

    /* renamed from: a */
    public static final int f258a = 1;

    /* renamed from: a */
    public static final String f259a = "MediaSessionCompat";

    /* renamed from: b */
    public static final int f260b = 2;

    /* renamed from: b */
    public static final String f261b = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";

    /* renamed from: c */
    public static final int f262c = 4;

    /* renamed from: c */
    public static final String f263c = "android.support.v4.media.session.action.SKIP_AD";

    /* renamed from: d */
    public static final int f264d = 0;

    /* renamed from: d */
    public static final String f265d = "android.support.v4.media.session.action.FOLLOW";

    /* renamed from: e */
    public static final int f266e = 1;

    /* renamed from: e */
    public static final String f267e = "android.support.v4.media.session.action.UNFOLLOW";

    /* renamed from: f */
    public static final int f268f = 2;

    /* renamed from: f */
    public static final String f269f = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";

    /* renamed from: g */
    public static final int f270g = 320;

    /* renamed from: g */
    public static final String f271g = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";

    /* renamed from: h */
    public static int f272h = 0;
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: h */
    public static final String f273h = "android.support.v4.media.session.action.PLAY_FROM_URI";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: i */
    public static final String f274i = "android.support.v4.media.session.action.PREPARE";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: j */
    public static final String f275j = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: k */
    public static final String f276k = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: l */
    public static final String f277l = "android.support.v4.media.session.action.PREPARE_FROM_URI";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: m */
    public static final String f278m = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: n */
    public static final String f279n = "android.support.v4.media.session.action.SET_REPEAT_MODE";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: o */
    public static final String f280o = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: p */
    public static final String f281p = "android.support.v4.media.session.action.SET_RATING";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: q */
    public static final String f282q = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: r */
    public static final String f283r = "android.support.v4.media.session.action.ARGUMENT_QUERY";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: s */
    public static final String f284s = "android.support.v4.media.session.action.ARGUMENT_URI";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: t */
    public static final String f285t = "android.support.v4.media.session.action.ARGUMENT_RATING";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: u */
    public static final String f286u = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: v */
    public static final String f287v = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: w */
    public static final String f288w = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: x */
    public static final String f289x = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
    @hl3({hl3.C2354a.f13187b})

    /* renamed from: y */
    public static final String f290y = "android.support.v4.media.session.TOKEN";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: z */
    public static final String f291z = "android.support.v4.media.session.EXTRA_BINDER";

    /* renamed from: a */
    public final MediaControllerCompat f292a;

    /* renamed from: a */
    public final C0091e f293a;

    /* renamed from: a */
    public final ArrayList<C0104k> f294a;

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0080a();

        /* renamed from: n */
        public static final int f295n = -1;

        /* renamed from: a */
        public final MediaDescriptionCompat f296a;

        /* renamed from: a */
        public Object f297a;

        /* renamed from: b */
        public final long f298b;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        public static class C0080a implements Parcelable.Creator<QueueItem> {
            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        public QueueItem(Parcel parcel) {
            this.f296a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f298b = parcel.readLong();
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
            this((Object) null, mediaDescriptionCompat, j);
        }

        public QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j != -1) {
                this.f296a = mediaDescriptionCompat;
                this.f298b = j;
                this.f297a = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        /* renamed from: a */
        public static QueueItem m489a(Object obj) {
            if (obj != null) {
                return new QueueItem(obj, MediaDescriptionCompat.m123a(C0132f.C0135c.m1022b(obj)), C0132f.C0135c.m1023c(obj));
            }
            return null;
        }

        /* renamed from: b */
        public static List<QueueItem> m490b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object a : list) {
                arrayList.add(m489a(a));
            }
            return arrayList;
        }

        /* renamed from: c */
        public MediaDescriptionCompat mo337c() {
            return this.f296a;
        }

        /* renamed from: d */
        public long mo338d() {
            return this.f298b;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public Object mo340e() {
            Object obj = this.f297a;
            if (obj != null) {
                return obj;
            }
            Object a = C0132f.C0135c.m1021a(this.f296a.mo118f(), this.f298b);
            this.f297a = a;
            return a;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f296a + ", Id=" + this.f298b + " }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f296a.writeToParcel(parcel, i);
            parcel.writeLong(this.f298b);
        }
    }

    @hl3({hl3.C2354a.f13185a})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0081a();

        /* renamed from: a */
        public ResultReceiver f299a;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        public static class C0081a implements Parcelable.Creator<ResultReceiverWrapper> {
            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f299a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public ResultReceiverWrapper(ResultReceiver resultReceiver) {
            this.f299a = resultReceiver;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f299a.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0082a();

        /* renamed from: a */
        public Bundle f300a;

        /* renamed from: a */
        public C0120b f301a;

        /* renamed from: a */
        public final Object f302a;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        public static class C0082a implements Parcelable.Creator<Token> {
            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null));
            }

            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Object obj) {
            this(obj, (C0120b) null, (Bundle) null);
        }

        public Token(Object obj, C0120b bVar) {
            this(obj, bVar, (Bundle) null);
        }

        public Token(Object obj, C0120b bVar, Bundle bundle) {
            this.f302a = obj;
            this.f301a = bVar;
            this.f300a = bundle;
        }

        @hl3({hl3.C2354a.f13187b})
        /* renamed from: a */
        public static Token m498a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            C0120b j8 = C0120b.C0121a.m880j8(C2267gq.m16043a(bundle, MediaSessionCompat.f291z));
            Bundle bundle2 = bundle.getBundle(MediaSessionCompat.f253A);
            Token token = (Token) bundle.getParcelable(MediaSessionCompat.f290y);
            if (token == null) {
                return null;
            }
            return new Token(token.f302a, j8, bundle2);
        }

        /* renamed from: b */
        public static Token m499b(Object obj) {
            return m500c(obj, (C0120b) null);
        }

        @hl3({hl3.C2354a.f13187b})
        /* renamed from: c */
        public static Token m500c(Object obj, C0120b bVar) {
            if (obj != null) {
                return new Token(C0132f.m1004u(obj), bVar);
            }
            return null;
        }

        @hl3({hl3.C2354a.f13187b})
        /* renamed from: d */
        public C0120b mo353d() {
            return this.f301a;
        }

        public int describeContents() {
            return 0;
        }

        @hl3({hl3.C2354a.f13187b})
        /* renamed from: e */
        public Bundle mo355e() {
            return this.f300a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = this.f302a;
            Object obj3 = ((Token) obj).f302a;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        /* renamed from: f */
        public Object mo357f() {
            return this.f302a;
        }

        @hl3({hl3.C2354a.f13187b})
        /* renamed from: h */
        public void mo358h(C0120b bVar) {
            this.f301a = bVar;
        }

        public int hashCode() {
            Object obj = this.f302a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @hl3({hl3.C2354a.f13187b})
        /* renamed from: i */
        public void mo360i(Bundle bundle) {
            this.f300a = bundle;
        }

        @hl3({hl3.C2354a.f13187b})
        /* renamed from: j */
        public Bundle mo361j() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaSessionCompat.f290y, this);
            C0120b bVar = this.f301a;
            if (bVar != null) {
                C2267gq.m16044b(bundle, MediaSessionCompat.f291z, bVar.asBinder());
            }
            Bundle bundle2 = this.f300a;
            if (bundle2 != null) {
                bundle.putBundle(MediaSessionCompat.f253A, bundle2);
            }
            return bundle;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.f302a, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$a */
    public class C0083a extends C0086d {
        public C0083a() {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$b */
    public class C0084b extends C0086d {
        public C0084b() {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$c */
    public class C0085c extends C0086d {
        public C0085c() {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$d */
    public static abstract class C0086d {

        /* renamed from: a */
        public C0087a f306a = null;

        /* renamed from: a */
        public final Object f307a;

        /* renamed from: a */
        public WeakReference<C0091e> f308a;

        /* renamed from: a */
        public boolean f309a;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$d$a */
        public class C0087a extends Handler {

            /* renamed from: a */
            public static final int f310a = 1;

            public C0087a(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                if (message.what == 1) {
                    C0086d.this.mo371a((C0773d.C0775b) message.obj);
                }
            }
        }

        @sj3(21)
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$d$b */
        public class C0088b implements C0132f.C0133a {
            public C0088b() {
            }

            /* renamed from: c */
            public void mo398c() {
                C0086d.this.mo369C();
            }

            /* renamed from: e */
            public void mo399e() {
                C0086d.this.mo378h();
            }

            /* renamed from: f */
            public void mo400f(String str, Bundle bundle) {
                Bundle bundle2 = bundle.getBundle(MediaSessionCompat.f286u);
                MediaSessionCompat.m458b(bundle2);
                if (str.equals(MediaSessionCompat.f273h)) {
                    C0086d.this.mo382l((Uri) bundle.getParcelable(MediaSessionCompat.f284s), bundle2);
                } else if (str.equals(MediaSessionCompat.f274i)) {
                    C0086d.this.mo383m();
                } else if (str.equals(MediaSessionCompat.f275j)) {
                    C0086d.this.mo384n(bundle.getString(MediaSessionCompat.f282q), bundle2);
                } else if (str.equals(MediaSessionCompat.f276k)) {
                    C0086d.this.mo385o(bundle.getString(MediaSessionCompat.f283r), bundle2);
                } else if (str.equals(MediaSessionCompat.f277l)) {
                    C0086d.this.mo386p((Uri) bundle.getParcelable(MediaSessionCompat.f284s), bundle2);
                } else if (str.equals(MediaSessionCompat.f278m)) {
                    C0086d.this.mo391u(bundle.getBoolean(MediaSessionCompat.f287v));
                } else if (str.equals(MediaSessionCompat.f279n)) {
                    C0086d.this.mo394x(bundle.getInt(MediaSessionCompat.f288w));
                } else if (str.equals(MediaSessionCompat.f280o)) {
                    C0086d.this.mo395y(bundle.getInt(MediaSessionCompat.f289x));
                } else if (str.equals(MediaSessionCompat.f281p)) {
                    C0086d.this.mo393w((RatingCompat) bundle.getParcelable(MediaSessionCompat.f285t), bundle2);
                } else {
                    C0086d.this.mo375e(str, bundle);
                }
            }

            /* renamed from: g */
            public void mo401g() {
                C0086d.this.mo376f();
            }

            /* renamed from: h */
            public void mo402h() {
                C0086d.this.mo396z();
            }

            /* renamed from: i */
            public void mo403i(String str, Bundle bundle) {
                C0086d.this.mo380j(str, bundle);
            }

            /* renamed from: j */
            public boolean mo404j(Intent intent) {
                return C0086d.this.mo377g(intent);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.support.v4.media.session.MediaSessionCompat$QueueItem} */
            /* JADX WARNING: type inference failed for: r1v0 */
            /* JADX WARNING: type inference failed for: r1v4, types: [android.os.IBinder] */
            /* JADX WARNING: type inference failed for: r1v6 */
            /* JADX WARNING: type inference failed for: r1v7 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: k */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo405k(java.lang.String r5, android.os.Bundle r6, android.os.ResultReceiver r7) {
                /*
                    r4 = this;
                    java.lang.String r0 = "android.support.v4.media.session.command.GET_EXTRA_BINDER"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c1 }
                    r1 = 0
                    if (r0 == 0) goto L_0x003d
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.p000v4.media.session.MediaSessionCompat.C0086d.this     // Catch:{ BadParcelableException -> 0x00c1 }
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$e> r5 = r5.f308a     // Catch:{ BadParcelableException -> 0x00c1 }
                    java.lang.Object r5 = r5.get()     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.support.v4.media.session.MediaSessionCompat$h r5 = (android.support.p000v4.media.session.MediaSessionCompat.C0096h) r5     // Catch:{ BadParcelableException -> 0x00c1 }
                    if (r5 == 0) goto L_0x00c8
                    android.os.Bundle r6 = new android.os.Bundle     // Catch:{ BadParcelableException -> 0x00c1 }
                    r6.<init>()     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.support.v4.media.session.MediaSessionCompat$Token r5 = r5.mo421c()     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.support.v4.media.session.b r0 = r5.mo353d()     // Catch:{ BadParcelableException -> 0x00c1 }
                    java.lang.String r2 = "android.support.v4.media.session.EXTRA_BINDER"
                    if (r0 != 0) goto L_0x0027
                    goto L_0x002b
                L_0x0027:
                    android.os.IBinder r1 = r0.asBinder()     // Catch:{ BadParcelableException -> 0x00c1 }
                L_0x002b:
                    com.onedelhi.secure.C2267gq.m16044b(r6, r2, r1)     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.os.Bundle r5 = r5.mo355e()     // Catch:{ BadParcelableException -> 0x00c1 }
                    java.lang.String r0 = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"
                    r6.putBundle(r0, r5)     // Catch:{ BadParcelableException -> 0x00c1 }
                    r5 = 0
                    r7.send(r5, r6)     // Catch:{ BadParcelableException -> 0x00c1 }
                    goto L_0x00c8
                L_0x003d:
                    java.lang.String r0 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c1 }
                    java.lang.String r2 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                    if (r0 == 0) goto L_0x0054
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.p000v4.media.session.MediaSessionCompat.C0086d.this     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.os.Parcelable r6 = r6.getParcelable(r2)     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.support.v4.media.MediaDescriptionCompat r6 = (android.support.p000v4.media.MediaDescriptionCompat) r6     // Catch:{ BadParcelableException -> 0x00c1 }
                    r5.mo372b(r6)     // Catch:{ BadParcelableException -> 0x00c1 }
                    goto L_0x00c8
                L_0x0054:
                    java.lang.String r0 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c1 }
                    java.lang.String r3 = "android.support.v4.media.session.command.ARGUMENT_INDEX"
                    if (r0 == 0) goto L_0x006e
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.p000v4.media.session.MediaSessionCompat.C0086d.this     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.os.Parcelable r7 = r6.getParcelable(r2)     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.p000v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00c1 }
                    int r6 = r6.getInt(r3)     // Catch:{ BadParcelableException -> 0x00c1 }
                    r5.mo373c(r7, r6)     // Catch:{ BadParcelableException -> 0x00c1 }
                    goto L_0x00c8
                L_0x006e:
                    java.lang.String r0 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c1 }
                    if (r0 == 0) goto L_0x0082
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.p000v4.media.session.MediaSessionCompat.C0086d.this     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.os.Parcelable r6 = r6.getParcelable(r2)     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.support.v4.media.MediaDescriptionCompat r6 = (android.support.p000v4.media.MediaDescriptionCompat) r6     // Catch:{ BadParcelableException -> 0x00c1 }
                L_0x007e:
                    r5.mo387q(r6)     // Catch:{ BadParcelableException -> 0x00c1 }
                    goto L_0x00c8
                L_0x0082:
                    java.lang.String r0 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c1 }
                    if (r0 == 0) goto L_0x00bb
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.p000v4.media.session.MediaSessionCompat.C0086d.this     // Catch:{ BadParcelableException -> 0x00c1 }
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$e> r5 = r5.f308a     // Catch:{ BadParcelableException -> 0x00c1 }
                    java.lang.Object r5 = r5.get()     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.support.v4.media.session.MediaSessionCompat$h r5 = (android.support.p000v4.media.session.MediaSessionCompat.C0096h) r5     // Catch:{ BadParcelableException -> 0x00c1 }
                    if (r5 == 0) goto L_0x00c8
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r5.f324a     // Catch:{ BadParcelableException -> 0x00c1 }
                    if (r7 == 0) goto L_0x00c8
                    r7 = -1
                    int r6 = r6.getInt(r3, r7)     // Catch:{ BadParcelableException -> 0x00c1 }
                    if (r6 < 0) goto L_0x00b2
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r5.f324a     // Catch:{ BadParcelableException -> 0x00c1 }
                    int r7 = r7.size()     // Catch:{ BadParcelableException -> 0x00c1 }
                    if (r6 >= r7) goto L_0x00b2
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r5 = r5.f324a     // Catch:{ BadParcelableException -> 0x00c1 }
                    java.lang.Object r5 = r5.get(r6)     // Catch:{ BadParcelableException -> 0x00c1 }
                    r1 = r5
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r1 = (android.support.p000v4.media.session.MediaSessionCompat.QueueItem) r1     // Catch:{ BadParcelableException -> 0x00c1 }
                L_0x00b2:
                    if (r1 == 0) goto L_0x00c8
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.p000v4.media.session.MediaSessionCompat.C0086d.this     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.support.v4.media.MediaDescriptionCompat r6 = r1.mo337c()     // Catch:{ BadParcelableException -> 0x00c1 }
                    goto L_0x007e
                L_0x00bb:
                    android.support.v4.media.session.MediaSessionCompat$d r0 = android.support.p000v4.media.session.MediaSessionCompat.C0086d.this     // Catch:{ BadParcelableException -> 0x00c1 }
                    r0.mo374d(r5, r6, r7)     // Catch:{ BadParcelableException -> 0x00c1 }
                    goto L_0x00c8
                L_0x00c1:
                    java.lang.String r5 = "MediaSessionCompat"
                    java.lang.String r6 = "Could not unparcel the extra data."
                    android.util.Log.e(r5, r6)
                L_0x00c8:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.media.session.MediaSessionCompat.C0086d.C0088b.mo405k(java.lang.String, android.os.Bundle, android.os.ResultReceiver):void");
            }

            /* renamed from: l */
            public void mo406l() {
                C0086d.this.mo389s();
            }

            /* renamed from: m */
            public void mo407m() {
                C0086d.this.mo367A();
            }

            /* renamed from: n */
            public void mo408n(long j) {
                C0086d.this.mo390t(j);
            }

            /* renamed from: o */
            public void mo409o(long j) {
                C0086d.this.mo368B(j);
            }

            /* renamed from: p */
            public void mo410p(Object obj) {
                C0086d.this.mo392v(RatingCompat.m165a(obj));
            }

            /* renamed from: q */
            public void mo411q(Object obj, Bundle bundle) {
            }

            /* renamed from: s */
            public void mo412s(String str, Bundle bundle) {
                C0086d.this.mo381k(str, bundle);
            }

            /* renamed from: t */
            public void mo413t() {
                C0086d.this.mo379i();
            }
        }

        @sj3(23)
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$d$c */
        public class C0089c extends C0088b implements C0136g.C0137a {
            public C0089c() {
                super();
            }

            /* renamed from: b */
            public void mo414b(Uri uri, Bundle bundle) {
                C0086d.this.mo382l(uri, bundle);
            }
        }

        @sj3(24)
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$d$d */
        public class C0090d extends C0089c implements C0139h.C0140a {
            public C0090d() {
                super();
            }

            /* renamed from: a */
            public void mo415a() {
                C0086d.this.mo383m();
            }

            /* renamed from: d */
            public void mo416d(String str, Bundle bundle) {
                C0086d.this.mo385o(str, bundle);
            }

            /* renamed from: r */
            public void mo417r(Uri uri, Bundle bundle) {
                C0086d.this.mo386p(uri, bundle);
            }

            /* renamed from: u */
            public void mo418u(String str, Bundle bundle) {
                C0086d.this.mo384n(str, bundle);
            }
        }

        public C0086d() {
            int i = Build.VERSION.SDK_INT;
            this.f307a = i >= 24 ? C0139h.m1026a(new C0090d()) : i >= 23 ? C0136g.m1024a(new C0089c()) : C0132f.m984a(new C0088b());
        }

        /* renamed from: A */
        public void mo367A() {
        }

        /* renamed from: B */
        public void mo368B(long j) {
        }

        /* renamed from: C */
        public void mo369C() {
        }

        /* renamed from: D */
        public void mo370D(C0091e eVar, Handler handler) {
            this.f308a = new WeakReference<>(eVar);
            C0087a aVar = this.f306a;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages((Object) null);
            }
            this.f306a = new C0087a(handler.getLooper());
        }

        /* renamed from: a */
        public void mo371a(C0773d.C0775b bVar) {
            if (this.f309a) {
                boolean z = false;
                this.f309a = false;
                this.f306a.removeMessages(1);
                C0091e eVar = (C0091e) this.f308a.get();
                if (eVar != null) {
                    PlaybackStateCompat K = eVar.mo419K();
                    long b = K == null ? 0 : K.mo532b();
                    boolean z2 = K != null && K.mo545p() == 3;
                    boolean z3 = (516 & b) != 0;
                    if ((b & 514) != 0) {
                        z = true;
                    }
                    eVar.mo436q(bVar);
                    if (z2 && z) {
                        mo378h();
                    } else if (!z2 && z3) {
                        mo379i();
                    }
                    eVar.mo436q((C0773d.C0775b) null);
                }
            }
        }

        /* renamed from: b */
        public void mo372b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        /* renamed from: c */
        public void mo373c(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        /* renamed from: d */
        public void mo374d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        /* renamed from: e */
        public void mo375e(String str, Bundle bundle) {
        }

        /* renamed from: f */
        public void mo376f() {
        }

        /* renamed from: g */
        public boolean mo377g(Intent intent) {
            C0091e eVar;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27 || (eVar = (C0091e) this.f308a.get()) == null || this.f306a == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            C0773d.C0775b t = eVar.mo442t();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                if (keyEvent.getRepeatCount() > 0) {
                    mo371a(t);
                } else if (this.f309a) {
                    this.f306a.removeMessages(1);
                    this.f309a = false;
                    PlaybackStateCompat K = eVar.mo419K();
                    if (((K == null ? 0 : K.mo532b()) & 32) != 0) {
                        mo396z();
                    }
                } else {
                    this.f309a = true;
                    C0087a aVar = this.f306a;
                    aVar.sendMessageDelayed(aVar.obtainMessage(1, t), (long) ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
            }
            mo371a(t);
            return false;
        }

        /* renamed from: h */
        public void mo378h() {
        }

        /* renamed from: i */
        public void mo379i() {
        }

        /* renamed from: j */
        public void mo380j(String str, Bundle bundle) {
        }

        /* renamed from: k */
        public void mo381k(String str, Bundle bundle) {
        }

        /* renamed from: l */
        public void mo382l(Uri uri, Bundle bundle) {
        }

        /* renamed from: m */
        public void mo383m() {
        }

        /* renamed from: n */
        public void mo384n(String str, Bundle bundle) {
        }

        /* renamed from: o */
        public void mo385o(String str, Bundle bundle) {
        }

        /* renamed from: p */
        public void mo386p(Uri uri, Bundle bundle) {
        }

        /* renamed from: q */
        public void mo387q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        @Deprecated
        /* renamed from: r */
        public void mo388r(int i) {
        }

        /* renamed from: s */
        public void mo389s() {
        }

        /* renamed from: t */
        public void mo390t(long j) {
        }

        /* renamed from: u */
        public void mo391u(boolean z) {
        }

        /* renamed from: v */
        public void mo392v(RatingCompat ratingCompat) {
        }

        /* renamed from: w */
        public void mo393w(RatingCompat ratingCompat, Bundle bundle) {
        }

        /* renamed from: x */
        public void mo394x(int i) {
        }

        /* renamed from: y */
        public void mo395y(int i) {
        }

        /* renamed from: z */
        public void mo396z() {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$e */
    public interface C0091e {
        /* renamed from: K */
        PlaybackStateCompat mo419K();

        /* renamed from: b */
        boolean mo420b();

        /* renamed from: c */
        Token mo421c();

        /* renamed from: d */
        void mo422d(int i);

        /* renamed from: e */
        void mo423e(int i);

        /* renamed from: f */
        void mo424f(List<QueueItem> list);

        /* renamed from: g */
        void mo425g(boolean z);

        /* renamed from: h */
        void mo426h(kw4 kw4);

        /* renamed from: i */
        void mo427i(MediaMetadataCompat mediaMetadataCompat);

        /* renamed from: j */
        String mo428j();

        /* renamed from: k */
        void mo429k(PendingIntent pendingIntent);

        /* renamed from: l */
        void mo430l(String str, Bundle bundle);

        /* renamed from: m */
        void mo431m(int i);

        /* renamed from: n */
        void mo432n(CharSequence charSequence);

        /* renamed from: n0 */
        void mo433n0(int i);

        /* renamed from: o */
        Object mo434o();

        /* renamed from: p */
        Object mo435p();

        /* renamed from: q */
        void mo436q(C0773d.C0775b bVar);

        /* renamed from: r */
        void mo437r(PendingIntent pendingIntent);

        void release();

        /* renamed from: s */
        void mo439s(PlaybackStateCompat playbackStateCompat);

        /* renamed from: s0 */
        void mo440s0(int i);

        void setExtras(Bundle bundle);

        /* renamed from: t */
        C0773d.C0775b mo442t();

        /* renamed from: u */
        void mo443u(C0086d dVar, Handler handler);

        /* renamed from: x0 */
        void mo444x0(boolean z);
    }

    @sj3(18)
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$f */
    public static class C0092f extends C0099j {

        /* renamed from: f */
        public static boolean f315f = true;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$f$a */
        public class C0093a implements RemoteControlClient.OnPlaybackPositionUpdateListener {
            public C0093a() {
            }

            public void onPlaybackPositionUpdate(long j) {
                C0092f.this.mo516y(18, -1, -1, Long.valueOf(j), (Bundle) null);
            }
        }

        public C0092f(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }

        /* renamed from: M */
        public void mo445M(PlaybackStateCompat playbackStateCompat) {
            long o = playbackStateCompat.mo544o();
            float m = playbackStateCompat.mo542m();
            long k = playbackStateCompat.mo541k();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.mo545p() == 3) {
                long j = 0;
                if (o > 0) {
                    if (k > 0) {
                        j = elapsedRealtime - k;
                        if (m > 0.0f && m != 1.0f) {
                            j = (long) (((float) j) * m);
                        }
                    }
                    o += j;
                }
            }
            this.f336a.setPlaybackState(mo515w(playbackStateCompat.mo545p()), o, m);
        }

        /* renamed from: O */
        public void mo446O(PendingIntent pendingIntent, ComponentName componentName) {
            if (f315f) {
                this.f335a.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.mo446O(pendingIntent, componentName);
            }
        }

        /* renamed from: u */
        public void mo443u(C0086d dVar, Handler handler) {
            super.mo443u(dVar, handler);
            if (dVar == null) {
                this.f336a.setPlaybackPositionUpdateListener((RemoteControlClient.OnPlaybackPositionUpdateListener) null);
                return;
            }
            this.f336a.setPlaybackPositionUpdateListener(new C0093a());
        }

        /* renamed from: x */
        public int mo447x(long j) {
            int x = super.mo447x(j);
            return (j & 256) != 0 ? x | 256 : x;
        }

        /* renamed from: z */
        public void mo448z(PendingIntent pendingIntent, ComponentName componentName) {
            if (f315f) {
                try {
                    this.f335a.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    Log.w(MediaSessionCompat.f259a, "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                    f315f = false;
                }
            }
            if (!f315f) {
                super.mo448z(pendingIntent, componentName);
            }
        }
    }

    @sj3(19)
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$g */
    public static class C0094g extends C0092f {

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$g$a */
        public class C0095a implements RemoteControlClient.OnMetadataUpdateListener {
            public C0095a() {
            }

            public void onMetadataUpdate(int i, Object obj) {
                if (i == 268435457 && (obj instanceof Rating)) {
                    C0094g.this.mo516y(19, -1, -1, RatingCompat.m165a(obj), (Bundle) null);
                }
            }
        }

        public C0094g(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }

        /* renamed from: u */
        public void mo443u(C0086d dVar, Handler handler) {
            super.mo443u(dVar, handler);
            if (dVar == null) {
                this.f336a.setMetadataUpdateListener((RemoteControlClient.OnMetadataUpdateListener) null);
                return;
            }
            this.f336a.setMetadataUpdateListener(new C0095a());
        }

        /* renamed from: v */
        public RemoteControlClient.MetadataEditor mo450v(Bundle bundle) {
            RemoteControlClient.MetadataEditor v = super.mo450v(bundle);
            PlaybackStateCompat playbackStateCompat = this.f344a;
            if (((playbackStateCompat == null ? 0 : playbackStateCompat.mo532b()) & 128) != 0) {
                v.addEditableKey(268435457);
            }
            if (bundle == null) {
                return v;
            }
            if (bundle.containsKey(MediaMetadataCompat.f165l)) {
                v.putLong(8, bundle.getLong(MediaMetadataCompat.f165l));
            }
            if (bundle.containsKey(MediaMetadataCompat.f180w)) {
                v.putObject(101, bundle.getParcelable(MediaMetadataCompat.f180w));
            }
            if (bundle.containsKey(MediaMetadataCompat.f179v)) {
                v.putObject(268435457, bundle.getParcelable(MediaMetadataCompat.f179v));
            }
            return v;
        }

        /* renamed from: x */
        public int mo447x(long j) {
            int x = super.mo447x(j);
            return (j & 128) != 0 ? x | 512 : x;
        }
    }

    @sj3(21)
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$h */
    public static class C0096h implements C0091e {

        /* renamed from: a */
        public int f318a;

        /* renamed from: a */
        public final RemoteCallbackList<C0117a> f319a = new RemoteCallbackList<>();

        /* renamed from: a */
        public MediaMetadataCompat f320a;

        /* renamed from: a */
        public final Token f321a;

        /* renamed from: a */
        public PlaybackStateCompat f322a;

        /* renamed from: a */
        public final Object f323a;

        /* renamed from: a */
        public List<QueueItem> f324a;

        /* renamed from: a */
        public boolean f325a = false;

        /* renamed from: b */
        public int f326b;

        /* renamed from: b */
        public boolean f327b;

        /* renamed from: c */
        public int f328c;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$h$a */
        public class C0097a extends C0120b.C0121a {
            public C0097a() {
            }

            /* renamed from: A2 */
            public void mo452A2(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: F0 */
            public long mo453F0() {
                throw new AssertionError();
            }

            /* renamed from: F5 */
            public void mo454F5(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: H0 */
            public void mo455H0(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            /* renamed from: H1 */
            public void mo456H1(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            /* renamed from: J */
            public String mo457J() {
                throw new AssertionError();
            }

            /* renamed from: K */
            public PlaybackStateCompat mo458K() {
                C0096h hVar = C0096h.this;
                return MediaSessionCompat.m460j(hVar.f322a, hVar.f320a);
            }

            /* renamed from: M4 */
            public void mo459M4(long j) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: O */
            public String mo460O() {
                throw new AssertionError();
            }

            /* renamed from: O0 */
            public MediaMetadataCompat mo461O0() {
                throw new AssertionError();
            }

            /* renamed from: P0 */
            public boolean mo462P0() {
                return C0096h.this.f327b;
            }

            /* renamed from: P5 */
            public void mo463P5(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: P7 */
            public void mo464P7(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            /* renamed from: R */
            public int mo465R() {
                return C0096h.this.f326b;
            }

            /* renamed from: T */
            public CharSequence mo466T() {
                throw new AssertionError();
            }

            /* renamed from: U */
            public void mo467U(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            /* renamed from: X3 */
            public void mo468X3(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: X6 */
            public boolean mo469X6() {
                throw new AssertionError();
            }

            /* renamed from: X7 */
            public void mo470X7(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a0 */
            public int mo471a0() {
                return C0096h.this.f318a;
            }

            /* renamed from: b4 */
            public void mo472b4(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: b5 */
            public void mo473b5(C0117a aVar) {
                C0096h hVar = C0096h.this;
                if (!hVar.f325a) {
                    String j = hVar.mo428j();
                    if (j == null) {
                        j = C0773d.C0775b.f4337a;
                    }
                    C0096h.this.f319a.register(aVar, new C0773d.C0775b(j, Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            /* renamed from: c4 */
            public void mo474c4(int i) {
                throw new AssertionError();
            }

            /* renamed from: f2 */
            public boolean mo475f2(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            /* renamed from: g1 */
            public void mo476g1(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: g8 */
            public void mo477g8(int i, int i2, String str) {
                throw new AssertionError();
            }

            public Bundle getExtras() {
                throw new AssertionError();
            }

            /* renamed from: j4 */
            public ParcelableVolumeInfo mo479j4() {
                throw new AssertionError();
            }

            /* renamed from: j6 */
            public void mo480j6(C0117a aVar) {
                C0096h.this.f319a.unregister(aVar);
            }

            /* renamed from: j7 */
            public void mo481j7(int i, int i2, String str) {
                throw new AssertionError();
            }

            /* renamed from: l0 */
            public int mo482l0() {
                return C0096h.this.f328c;
            }

            /* renamed from: m5 */
            public void mo483m5() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: n0 */
            public void mo484n0(int i) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: n7 */
            public boolean mo485n7() {
                return false;
            }

            /* renamed from: q7 */
            public void mo486q7() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: r5 */
            public void mo487r5(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: r6 */
            public void mo488r6(boolean z) throws RemoteException {
            }

            /* renamed from: s0 */
            public void mo489s0(int i) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: s1 */
            public void mo490s1() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: s6 */
            public void mo491s6(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public void stop() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: t0 */
            public List<QueueItem> mo493t0() {
                return null;
            }

            /* renamed from: t4 */
            public PendingIntent mo494t4() {
                throw new AssertionError();
            }

            /* renamed from: t7 */
            public void mo495t7() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: u0 */
            public void mo496u0() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: u4 */
            public void mo497u4() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: x0 */
            public void mo498x0(boolean z) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: x1 */
            public void mo499x1() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: z2 */
            public void mo500z2(long j) {
                throw new AssertionError();
            }
        }

        public C0096h(Context context, String str, Bundle bundle) {
            Object b = C0132f.m985b(context, str);
            this.f323a = b;
            this.f321a = new Token(C0132f.m986c(b), new C0097a(), bundle);
        }

        public C0096h(Object obj) {
            Object t = C0132f.m1003t(obj);
            this.f323a = t;
            this.f321a = new Token(C0132f.m986c(t), new C0097a());
        }

        /* renamed from: K */
        public PlaybackStateCompat mo419K() {
            return this.f322a;
        }

        /* renamed from: b */
        public boolean mo420b() {
            return C0132f.m988e(this.f323a);
        }

        /* renamed from: c */
        public Token mo421c() {
            return this.f321a;
        }

        /* renamed from: d */
        public void mo422d(int i) {
            C0132f.m994k(this.f323a, i);
        }

        /* renamed from: e */
        public void mo423e(int i) {
            if (Build.VERSION.SDK_INT < 22) {
                this.f318a = i;
            } else {
                eg2.m13748a(this.f323a, i);
            }
        }

        /* renamed from: f */
        public void mo424f(List<QueueItem> list) {
            ArrayList arrayList;
            this.f324a = list;
            if (list != null) {
                arrayList = new ArrayList();
                for (QueueItem e : list) {
                    arrayList.add(e.mo340e());
                }
            } else {
                arrayList = null;
            }
            C0132f.m1000q(this.f323a, arrayList);
        }

        /* renamed from: g */
        public void mo425g(boolean z) {
            C0132f.m991h(this.f323a, z);
        }

        /* renamed from: h */
        public void mo426h(kw4 kw4) {
            C0132f.m999p(this.f323a, kw4.mo19219d());
        }

        /* renamed from: i */
        public void mo427i(MediaMetadataCompat mediaMetadataCompat) {
            this.f320a = mediaMetadataCompat;
            C0132f.m996m(this.f323a, mediaMetadataCompat == null ? null : mediaMetadataCompat.mo144h());
        }

        /* renamed from: j */
        public String mo428j() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return C0139h.m1027b(this.f323a);
        }

        /* renamed from: k */
        public void mo429k(PendingIntent pendingIntent) {
            C0132f.m1002s(this.f323a, pendingIntent);
        }

        /* renamed from: l */
        public void mo430l(String str, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 23) {
                for (int beginBroadcast = this.f319a.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f319a.getBroadcastItem(beginBroadcast).mo275W(str, bundle);
                    } catch (RemoteException unused) {
                    }
                }
                this.f319a.finishBroadcast();
            }
            C0132f.m990g(this.f323a, str, bundle);
        }

        /* renamed from: m */
        public void mo431m(int i) {
            C0132f.m998o(this.f323a, i);
        }

        /* renamed from: n */
        public void mo432n(CharSequence charSequence) {
            C0132f.m1001r(this.f323a, charSequence);
        }

        /* renamed from: n0 */
        public void mo433n0(int i) {
            if (this.f326b != i) {
                this.f326b = i;
                for (int beginBroadcast = this.f319a.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f319a.getBroadcastItem(beginBroadcast).mo278o7(i);
                    } catch (RemoteException unused) {
                    }
                }
                this.f319a.finishBroadcast();
            }
        }

        /* renamed from: o */
        public Object mo434o() {
            return null;
        }

        /* renamed from: p */
        public Object mo435p() {
            return this.f323a;
        }

        /* renamed from: q */
        public void mo436q(C0773d.C0775b bVar) {
        }

        /* renamed from: r */
        public void mo437r(PendingIntent pendingIntent) {
            C0132f.m995l(this.f323a, pendingIntent);
        }

        public void release() {
            this.f325a = true;
            C0132f.m989f(this.f323a);
        }

        /* renamed from: s */
        public void mo439s(PlaybackStateCompat playbackStateCompat) {
            this.f322a = playbackStateCompat;
            for (int beginBroadcast = this.f319a.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f319a.getBroadcastItem(beginBroadcast).mo277k5(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f319a.finishBroadcast();
            C0132f.m997n(this.f323a, playbackStateCompat == null ? null : playbackStateCompat.mo543n());
        }

        /* renamed from: s0 */
        public void mo440s0(int i) {
            if (this.f328c != i) {
                this.f328c = i;
                for (int beginBroadcast = this.f319a.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f319a.getBroadcastItem(beginBroadcast).mo274P6(i);
                    } catch (RemoteException unused) {
                    }
                }
                this.f319a.finishBroadcast();
            }
        }

        public void setExtras(Bundle bundle) {
            C0132f.m993j(this.f323a, bundle);
        }

        /* renamed from: t */
        public C0773d.C0775b mo442t() {
            return null;
        }

        /* renamed from: u */
        public void mo443u(C0086d dVar, Handler handler) {
            C0132f.m992i(this.f323a, dVar == null ? null : dVar.f307a, handler);
            if (dVar != null) {
                dVar.mo370D(this, handler);
            }
        }

        /* renamed from: x0 */
        public void mo444x0(boolean z) {
            if (this.f327b != z) {
                this.f327b = z;
                for (int beginBroadcast = this.f319a.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f319a.getBroadcastItem(beginBroadcast).mo276Z0(z);
                    } catch (RemoteException unused) {
                    }
                }
                this.f319a.finishBroadcast();
            }
        }
    }

    @sj3(28)
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$i */
    public static class C0098i extends C0096h {
        public C0098i(Context context, String str, Bundle bundle) {
            super(context, str, bundle);
        }

        public C0098i(Object obj) {
            super(obj);
        }

        /* renamed from: q */
        public void mo436q(C0773d.C0775b bVar) {
        }

        @mr2
        /* renamed from: t */
        public final C0773d.C0775b mo442t() {
            return new C0773d.C0775b(((MediaSession) this.f323a).getCurrentControllerInfo());
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$j */
    public static class C0099j implements C0091e {

        /* renamed from: g */
        public static final int f330g = 0;

        /* renamed from: a */
        public int f331a;

        /* renamed from: a */
        public final PendingIntent f332a;

        /* renamed from: a */
        public final ComponentName f333a;

        /* renamed from: a */
        public final Context f334a;

        /* renamed from: a */
        public final AudioManager f335a;

        /* renamed from: a */
        public final RemoteControlClient f336a;

        /* renamed from: a */
        public Bundle f337a;

        /* renamed from: a */
        public final RemoteCallbackList<C0117a> f338a = new RemoteCallbackList<>();

        /* renamed from: a */
        public MediaMetadataCompat f339a;

        /* renamed from: a */
        public final Token f340a;

        /* renamed from: a */
        public volatile C0086d f341a;

        /* renamed from: a */
        public final C0102c f342a;

        /* renamed from: a */
        public C0103d f343a;

        /* renamed from: a */
        public PlaybackStateCompat f344a;

        /* renamed from: a */
        public C0773d.C0775b f345a;

        /* renamed from: a */
        public kw4.C2675b f346a = new C0100a();

        /* renamed from: a */
        public kw4 f347a;

        /* renamed from: a */
        public CharSequence f348a;

        /* renamed from: a */
        public final Object f349a = new Object();

        /* renamed from: a */
        public final String f350a;

        /* renamed from: a */
        public List<QueueItem> f351a;

        /* renamed from: a */
        public boolean f352a = false;

        /* renamed from: b */
        public int f353b;

        /* renamed from: b */
        public PendingIntent f354b;

        /* renamed from: b */
        public final String f355b;

        /* renamed from: b */
        public boolean f356b = false;

        /* renamed from: c */
        public int f357c;

        /* renamed from: c */
        public boolean f358c = false;

        /* renamed from: d */
        public int f359d;

        /* renamed from: d */
        public boolean f360d = false;

        /* renamed from: e */
        public int f361e;

        /* renamed from: e */
        public boolean f362e;

        /* renamed from: f */
        public int f363f;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$j$a */
        public class C0100a extends kw4.C2675b {
            public C0100a() {
            }

            /* renamed from: a */
            public void mo517a(kw4 kw4) {
                if (C0099j.this.f347a == kw4) {
                    C0099j jVar = C0099j.this;
                    C0099j.this.mo511L(new ParcelableVolumeInfo(jVar.f361e, jVar.f363f, kw4.mo19218c(), kw4.mo19217b(), kw4.mo19216a()));
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$j$b */
        public static final class C0101b {

            /* renamed from: a */
            public final Bundle f365a;

            /* renamed from: a */
            public final ResultReceiver f366a;

            /* renamed from: a */
            public final String f367a;

            public C0101b(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f367a = str;
                this.f365a = bundle;
                this.f366a = resultReceiver;
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$j$c */
        public class C0102c extends C0120b.C0121a {
            public C0102c() {
            }

            /* renamed from: A2 */
            public void mo452A2(Uri uri, Bundle bundle) throws RemoteException {
                mo522o8(10, uri, bundle);
            }

            /* renamed from: F0 */
            public long mo453F0() {
                long j;
                synchronized (C0099j.this.f349a) {
                    j = (long) C0099j.this.f331a;
                }
                return j;
            }

            /* renamed from: F5 */
            public void mo454F5(RatingCompat ratingCompat) throws RemoteException {
                mo520m8(19, ratingCompat);
            }

            /* renamed from: H0 */
            public void mo455H0(MediaDescriptionCompat mediaDescriptionCompat) {
                mo520m8(25, mediaDescriptionCompat);
            }

            /* renamed from: H1 */
            public void mo456H1(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                mo520m8(1, new C0101b(str, bundle, resultReceiverWrapper.f299a));
            }

            /* renamed from: J */
            public String mo457J() {
                return C0099j.this.f350a;
            }

            /* renamed from: K */
            public PlaybackStateCompat mo458K() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (C0099j.this.f349a) {
                    C0099j jVar = C0099j.this;
                    playbackStateCompat = jVar.f344a;
                    mediaMetadataCompat = jVar.f339a;
                }
                return MediaSessionCompat.m460j(playbackStateCompat, mediaMetadataCompat);
            }

            /* renamed from: M4 */
            public void mo459M4(long j) throws RemoteException {
                mo520m8(18, Long.valueOf(j));
            }

            /* renamed from: O */
            public String mo460O() {
                return C0099j.this.f355b;
            }

            /* renamed from: O0 */
            public MediaMetadataCompat mo461O0() {
                return C0099j.this.f339a;
            }

            /* renamed from: P0 */
            public boolean mo462P0() {
                return C0099j.this.f362e;
            }

            /* renamed from: P5 */
            public void mo463P5(String str, Bundle bundle) throws RemoteException {
                mo522o8(9, str, bundle);
            }

            /* renamed from: P7 */
            public void mo464P7(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                mo521n8(26, mediaDescriptionCompat, i);
            }

            /* renamed from: R */
            public int mo465R() {
                return C0099j.this.f357c;
            }

            /* renamed from: T */
            public CharSequence mo466T() {
                return C0099j.this.f348a;
            }

            /* renamed from: U */
            public void mo467U(MediaDescriptionCompat mediaDescriptionCompat) {
                mo520m8(27, mediaDescriptionCompat);
            }

            /* renamed from: X3 */
            public void mo468X3(Uri uri, Bundle bundle) throws RemoteException {
                mo522o8(6, uri, bundle);
            }

            /* renamed from: X6 */
            public boolean mo469X6() {
                return (C0099j.this.f331a & 2) != 0;
            }

            /* renamed from: X7 */
            public void mo470X7(String str, Bundle bundle) throws RemoteException {
                mo522o8(5, str, bundle);
            }

            /* renamed from: a0 */
            public int mo471a0() {
                return C0099j.this.f353b;
            }

            /* renamed from: b4 */
            public void mo472b4(String str, Bundle bundle) throws RemoteException {
                mo522o8(8, str, bundle);
            }

            /* renamed from: b5 */
            public void mo473b5(C0117a aVar) {
                if (C0099j.this.f352a) {
                    try {
                        aVar.mo247v0();
                    } catch (Exception unused) {
                    }
                } else {
                    C0099j.this.f338a.register(aVar, new C0773d.C0775b(C0773d.C0775b.f4337a, Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            /* renamed from: c4 */
            public void mo474c4(int i) {
                mo519l8(28, i);
            }

            /* renamed from: f2 */
            public boolean mo475f2(KeyEvent keyEvent) {
                boolean z = true;
                if ((C0099j.this.f331a & 1) == 0) {
                    z = false;
                }
                if (z) {
                    mo520m8(21, keyEvent);
                }
                return z;
            }

            /* renamed from: g1 */
            public void mo476g1(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                mo522o8(31, ratingCompat, bundle);
            }

            /* renamed from: g8 */
            public void mo477g8(int i, int i2, String str) {
                C0099j.this.mo514a(i, i2);
            }

            public Bundle getExtras() {
                Bundle bundle;
                synchronized (C0099j.this.f349a) {
                    bundle = C0099j.this.f337a;
                }
                return bundle;
            }

            /* renamed from: j4 */
            public ParcelableVolumeInfo mo479j4() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                synchronized (C0099j.this.f349a) {
                    C0099j jVar = C0099j.this;
                    i = jVar.f361e;
                    i2 = jVar.f363f;
                    kw4 kw4 = jVar.f347a;
                    i3 = 2;
                    if (i == 2) {
                        int c = kw4.mo19218c();
                        int b = kw4.mo19217b();
                        i4 = kw4.mo19216a();
                        i5 = b;
                        i3 = c;
                    } else {
                        i5 = jVar.f335a.getStreamMaxVolume(i2);
                        i4 = C0099j.this.f335a.getStreamVolume(i2);
                    }
                }
                return new ParcelableVolumeInfo(i, i2, i3, i5, i4);
            }

            /* renamed from: j6 */
            public void mo480j6(C0117a aVar) {
                C0099j.this.f338a.unregister(aVar);
            }

            /* renamed from: j7 */
            public void mo481j7(int i, int i2, String str) {
                C0099j.this.mo512N(i, i2);
            }

            /* renamed from: k8 */
            public void mo518k8(int i) {
                C0099j.this.mo516y(i, 0, 0, (Object) null, (Bundle) null);
            }

            /* renamed from: l0 */
            public int mo482l0() {
                return C0099j.this.f359d;
            }

            /* renamed from: l8 */
            public void mo519l8(int i, int i2) {
                C0099j.this.mo516y(i, i2, 0, (Object) null, (Bundle) null);
            }

            /* renamed from: m5 */
            public void mo483m5() throws RemoteException {
                mo518k8(7);
            }

            /* renamed from: m8 */
            public void mo520m8(int i, Object obj) {
                C0099j.this.mo516y(i, 0, 0, obj, (Bundle) null);
            }

            /* renamed from: n0 */
            public void mo484n0(int i) throws RemoteException {
                mo519l8(23, i);
            }

            /* renamed from: n7 */
            public boolean mo485n7() {
                return false;
            }

            /* renamed from: n8 */
            public void mo521n8(int i, Object obj, int i2) {
                C0099j.this.mo516y(i, i2, 0, obj, (Bundle) null);
            }

            /* renamed from: o8 */
            public void mo522o8(int i, Object obj, Bundle bundle) {
                C0099j.this.mo516y(i, 0, 0, obj, bundle);
            }

            /* renamed from: q7 */
            public void mo486q7() throws RemoteException {
                mo518k8(15);
            }

            /* renamed from: r5 */
            public void mo487r5(String str, Bundle bundle) throws RemoteException {
                mo522o8(20, str, bundle);
            }

            /* renamed from: r6 */
            public void mo488r6(boolean z) throws RemoteException {
            }

            /* renamed from: s0 */
            public void mo489s0(int i) throws RemoteException {
                mo519l8(30, i);
            }

            /* renamed from: s1 */
            public void mo490s1() throws RemoteException {
                mo518k8(3);
            }

            /* renamed from: s6 */
            public void mo491s6(String str, Bundle bundle) throws RemoteException {
                mo522o8(4, str, bundle);
            }

            public void stop() throws RemoteException {
                mo518k8(13);
            }

            /* renamed from: t0 */
            public List<QueueItem> mo493t0() {
                List<QueueItem> list;
                synchronized (C0099j.this.f349a) {
                    list = C0099j.this.f351a;
                }
                return list;
            }

            /* renamed from: t4 */
            public PendingIntent mo494t4() {
                PendingIntent pendingIntent;
                synchronized (C0099j.this.f349a) {
                    pendingIntent = C0099j.this.f354b;
                }
                return pendingIntent;
            }

            /* renamed from: t7 */
            public void mo495t7() throws RemoteException {
                mo518k8(17);
            }

            /* renamed from: u0 */
            public void mo496u0() throws RemoteException {
                mo518k8(12);
            }

            /* renamed from: u4 */
            public void mo497u4() throws RemoteException {
                mo518k8(16);
            }

            /* renamed from: x0 */
            public void mo498x0(boolean z) throws RemoteException {
                mo520m8(29, Boolean.valueOf(z));
            }

            /* renamed from: x1 */
            public void mo499x1() throws RemoteException {
                mo518k8(14);
            }

            /* renamed from: z2 */
            public void mo500z2(long j) {
                mo520m8(11, Long.valueOf(j));
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$j$d */
        public class C0103d extends Handler {

            /* renamed from: A */
            public static final int f369A = 27;

            /* renamed from: B */
            public static final int f370B = 28;

            /* renamed from: C */
            public static final int f371C = 29;

            /* renamed from: D */
            public static final int f372D = 30;

            /* renamed from: E */
            public static final int f373E = 127;

            /* renamed from: F */
            public static final int f374F = 126;

            /* renamed from: a */
            public static final int f375a = 1;

            /* renamed from: b */
            public static final int f376b = 2;

            /* renamed from: c */
            public static final int f377c = 3;

            /* renamed from: d */
            public static final int f378d = 4;

            /* renamed from: e */
            public static final int f379e = 5;

            /* renamed from: f */
            public static final int f380f = 6;

            /* renamed from: g */
            public static final int f381g = 7;

            /* renamed from: h */
            public static final int f382h = 8;

            /* renamed from: i */
            public static final int f383i = 9;

            /* renamed from: j */
            public static final int f384j = 10;

            /* renamed from: k */
            public static final int f385k = 11;

            /* renamed from: l */
            public static final int f386l = 12;

            /* renamed from: m */
            public static final int f387m = 13;

            /* renamed from: n */
            public static final int f388n = 14;

            /* renamed from: o */
            public static final int f389o = 15;

            /* renamed from: p */
            public static final int f390p = 16;

            /* renamed from: q */
            public static final int f391q = 17;

            /* renamed from: r */
            public static final int f392r = 18;

            /* renamed from: s */
            public static final int f393s = 19;

            /* renamed from: t */
            public static final int f394t = 31;

            /* renamed from: u */
            public static final int f395u = 20;

            /* renamed from: v */
            public static final int f396v = 21;

            /* renamed from: w */
            public static final int f397w = 22;

            /* renamed from: x */
            public static final int f398x = 23;

            /* renamed from: y */
            public static final int f399y = 25;

            /* renamed from: z */
            public static final int f400z = 26;

            public C0103d(Looper looper) {
                super(looper);
            }

            /* renamed from: a */
            public final void mo523a(KeyEvent keyEvent, C0086d dVar) {
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    PlaybackStateCompat playbackStateCompat = C0099j.this.f344a;
                    long b = playbackStateCompat == null ? 0 : playbackStateCompat.mo532b();
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 79) {
                        if (keyCode != 126) {
                            if (keyCode != 127) {
                                switch (keyCode) {
                                    case 85:
                                        break;
                                    case 86:
                                        if ((b & 1) != 0) {
                                            dVar.mo369C();
                                            return;
                                        }
                                        return;
                                    case 87:
                                        if ((b & 32) != 0) {
                                            dVar.mo396z();
                                            return;
                                        }
                                        return;
                                    case 88:
                                        if ((b & 16) != 0) {
                                            dVar.mo367A();
                                            return;
                                        }
                                        return;
                                    case 89:
                                        if ((b & 8) != 0) {
                                            dVar.mo389s();
                                            return;
                                        }
                                        return;
                                    case 90:
                                        if ((b & 64) != 0) {
                                            dVar.mo376f();
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                            } else if ((b & 2) != 0) {
                                dVar.mo378h();
                                return;
                            } else {
                                return;
                            }
                        } else if ((b & 4) != 0) {
                            dVar.mo379i();
                            return;
                        } else {
                            return;
                        }
                    }
                    Log.w(MediaSessionCompat.f259a, "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
                }
            }

            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void handleMessage(android.os.Message r8) {
                /*
                    r7 = this;
                    android.support.v4.media.session.MediaSessionCompat$j r0 = android.support.p000v4.media.session.MediaSessionCompat.C0099j.this
                    android.support.v4.media.session.MediaSessionCompat$d r0 = r0.f341a
                    if (r0 != 0) goto L_0x0007
                    return
                L_0x0007:
                    android.os.Bundle r1 = r8.getData()
                    android.support.p000v4.media.session.MediaSessionCompat.m458b(r1)
                    android.support.v4.media.session.MediaSessionCompat$j r2 = android.support.p000v4.media.session.MediaSessionCompat.C0099j.this
                    androidx.media.d$b r3 = new androidx.media.d$b
                    java.lang.String r4 = "data_calling_pkg"
                    java.lang.String r4 = r1.getString(r4)
                    java.lang.String r5 = "data_calling_pid"
                    int r5 = r1.getInt(r5)
                    java.lang.String r6 = "data_calling_uid"
                    int r6 = r1.getInt(r6)
                    r3.<init>(r4, r5, r6)
                    r2.mo436q(r3)
                    java.lang.String r2 = "data_extras"
                    android.os.Bundle r1 = r1.getBundle(r2)
                    android.support.p000v4.media.session.MediaSessionCompat.m458b(r1)
                    r2 = 0
                    int r3 = r8.what     // Catch:{ all -> 0x015f }
                    r4 = 0
                    switch(r3) {
                        case 1: goto L_0x014c;
                        case 2: goto L_0x0144;
                        case 3: goto L_0x0140;
                        case 4: goto L_0x0138;
                        case 5: goto L_0x0130;
                        case 6: goto L_0x0128;
                        case 7: goto L_0x0124;
                        case 8: goto L_0x011c;
                        case 9: goto L_0x0114;
                        case 10: goto L_0x010c;
                        case 11: goto L_0x0100;
                        case 12: goto L_0x00fc;
                        case 13: goto L_0x00f8;
                        case 14: goto L_0x00f4;
                        case 15: goto L_0x00ef;
                        case 16: goto L_0x00ea;
                        case 17: goto L_0x00e5;
                        case 18: goto L_0x00d8;
                        case 19: goto L_0x00cf;
                        case 20: goto L_0x00c6;
                        case 21: goto L_0x00ab;
                        case 22: goto L_0x00a2;
                        case 23: goto L_0x009b;
                        case 24: goto L_0x003a;
                        case 25: goto L_0x0092;
                        case 26: goto L_0x0087;
                        case 27: goto L_0x0082;
                        case 28: goto L_0x0059;
                        case 29: goto L_0x004c;
                        case 30: goto L_0x0045;
                        case 31: goto L_0x003c;
                        default: goto L_0x003a;
                    }     // Catch:{ all -> 0x015f }
                L_0x003a:
                    goto L_0x0159
                L_0x003c:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    android.support.v4.media.RatingCompat r8 = (android.support.p000v4.media.RatingCompat) r8     // Catch:{ all -> 0x015f }
                    r0.mo393w(r8, r1)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0045:
                    int r8 = r8.arg1     // Catch:{ all -> 0x015f }
                    r0.mo395y(r8)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x004c:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x015f }
                    boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x015f }
                    r0.mo391u(r8)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0059:
                    android.support.v4.media.session.MediaSessionCompat$j r1 = android.support.p000v4.media.session.MediaSessionCompat.C0099j.this     // Catch:{ all -> 0x015f }
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r1 = r1.f351a     // Catch:{ all -> 0x015f }
                    if (r1 == 0) goto L_0x0159
                    int r3 = r8.arg1     // Catch:{ all -> 0x015f }
                    if (r3 < 0) goto L_0x0076
                    int r1 = r1.size()     // Catch:{ all -> 0x015f }
                    if (r3 >= r1) goto L_0x0076
                    android.support.v4.media.session.MediaSessionCompat$j r1 = android.support.p000v4.media.session.MediaSessionCompat.C0099j.this     // Catch:{ all -> 0x015f }
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r1 = r1.f351a     // Catch:{ all -> 0x015f }
                    int r8 = r8.arg1     // Catch:{ all -> 0x015f }
                    java.lang.Object r8 = r1.get(r8)     // Catch:{ all -> 0x015f }
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r8 = (android.support.p000v4.media.session.MediaSessionCompat.QueueItem) r8     // Catch:{ all -> 0x015f }
                    goto L_0x0077
                L_0x0076:
                    r8 = r2
                L_0x0077:
                    if (r8 == 0) goto L_0x0159
                    android.support.v4.media.MediaDescriptionCompat r8 = r8.mo337c()     // Catch:{ all -> 0x015f }
                L_0x007d:
                    r0.mo387q(r8)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0082:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    android.support.v4.media.MediaDescriptionCompat r8 = (android.support.p000v4.media.MediaDescriptionCompat) r8     // Catch:{ all -> 0x015f }
                    goto L_0x007d
                L_0x0087:
                    java.lang.Object r1 = r8.obj     // Catch:{ all -> 0x015f }
                    android.support.v4.media.MediaDescriptionCompat r1 = (android.support.p000v4.media.MediaDescriptionCompat) r1     // Catch:{ all -> 0x015f }
                    int r8 = r8.arg1     // Catch:{ all -> 0x015f }
                    r0.mo373c(r1, r8)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0092:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    android.support.v4.media.MediaDescriptionCompat r8 = (android.support.p000v4.media.MediaDescriptionCompat) r8     // Catch:{ all -> 0x015f }
                    r0.mo372b(r8)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x009b:
                    int r8 = r8.arg1     // Catch:{ all -> 0x015f }
                    r0.mo394x(r8)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x00a2:
                    android.support.v4.media.session.MediaSessionCompat$j r0 = android.support.p000v4.media.session.MediaSessionCompat.C0099j.this     // Catch:{ all -> 0x015f }
                    int r8 = r8.arg1     // Catch:{ all -> 0x015f }
                    r0.mo512N(r8, r4)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x00ab:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    android.view.KeyEvent r8 = (android.view.KeyEvent) r8     // Catch:{ all -> 0x015f }
                    android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x015f }
                    java.lang.String r3 = "android.intent.action.MEDIA_BUTTON"
                    r1.<init>(r3)     // Catch:{ all -> 0x015f }
                    java.lang.String r3 = "android.intent.extra.KEY_EVENT"
                    r1.putExtra(r3, r8)     // Catch:{ all -> 0x015f }
                    boolean r1 = r0.mo377g(r1)     // Catch:{ all -> 0x015f }
                    if (r1 != 0) goto L_0x0159
                    r7.mo523a(r8, r0)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x00c6:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x015f }
                    r0.mo375e(r8, r1)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x00cf:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    android.support.v4.media.RatingCompat r8 = (android.support.p000v4.media.RatingCompat) r8     // Catch:{ all -> 0x015f }
                    r0.mo392v(r8)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x00d8:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x015f }
                    long r3 = r8.longValue()     // Catch:{ all -> 0x015f }
                    r0.mo390t(r3)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x00e5:
                    r0.mo389s()     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x00ea:
                    r0.mo376f()     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x00ef:
                    r0.mo367A()     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x00f4:
                    r0.mo396z()     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x00f8:
                    r0.mo369C()     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x00fc:
                    r0.mo378h()     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0100:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x015f }
                    long r3 = r8.longValue()     // Catch:{ all -> 0x015f }
                    r0.mo368B(r3)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x010c:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    android.net.Uri r8 = (android.net.Uri) r8     // Catch:{ all -> 0x015f }
                    r0.mo382l(r8, r1)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0114:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x015f }
                    r0.mo381k(r8, r1)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x011c:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x015f }
                    r0.mo380j(r8, r1)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0124:
                    r0.mo379i()     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0128:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    android.net.Uri r8 = (android.net.Uri) r8     // Catch:{ all -> 0x015f }
                    r0.mo386p(r8, r1)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0130:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x015f }
                    r0.mo385o(r8, r1)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0138:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x015f }
                    r0.mo384n(r8, r1)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0140:
                    r0.mo383m()     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0144:
                    android.support.v4.media.session.MediaSessionCompat$j r0 = android.support.p000v4.media.session.MediaSessionCompat.C0099j.this     // Catch:{ all -> 0x015f }
                    int r8 = r8.arg1     // Catch:{ all -> 0x015f }
                    r0.mo514a(r8, r4)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x014c:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    android.support.v4.media.session.MediaSessionCompat$j$b r8 = (android.support.p000v4.media.session.MediaSessionCompat.C0099j.C0101b) r8     // Catch:{ all -> 0x015f }
                    java.lang.String r1 = r8.f367a     // Catch:{ all -> 0x015f }
                    android.os.Bundle r3 = r8.f365a     // Catch:{ all -> 0x015f }
                    android.os.ResultReceiver r8 = r8.f366a     // Catch:{ all -> 0x015f }
                    r0.mo374d(r1, r3, r8)     // Catch:{ all -> 0x015f }
                L_0x0159:
                    android.support.v4.media.session.MediaSessionCompat$j r8 = android.support.p000v4.media.session.MediaSessionCompat.C0099j.this
                    r8.mo436q(r2)
                    return
                L_0x015f:
                    r8 = move-exception
                    android.support.v4.media.session.MediaSessionCompat$j r0 = android.support.p000v4.media.session.MediaSessionCompat.C0099j.this
                    r0.mo436q(r2)
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.media.session.MediaSessionCompat.C0099j.C0103d.handleMessage(android.os.Message):void");
            }
        }

        public C0099j(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            if (componentName != null) {
                this.f334a = context;
                this.f350a = context.getPackageName();
                this.f335a = (AudioManager) context.getSystemService("audio");
                this.f355b = str;
                this.f333a = componentName;
                this.f332a = pendingIntent;
                C0102c cVar = new C0102c();
                this.f342a = cVar;
                this.f340a = new Token(cVar);
                this.f353b = 0;
                this.f361e = 1;
                this.f363f = 3;
                this.f336a = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
        }

        /* renamed from: A */
        public final void mo501A(boolean z) {
            for (int beginBroadcast = this.f338a.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f338a.getBroadcastItem(beginBroadcast).mo276Z0(z);
                } catch (RemoteException unused) {
                }
            }
            this.f338a.finishBroadcast();
        }

        /* renamed from: B */
        public final void mo502B(String str, Bundle bundle) {
            for (int beginBroadcast = this.f338a.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f338a.getBroadcastItem(beginBroadcast).mo275W(str, bundle);
                } catch (RemoteException unused) {
                }
            }
            this.f338a.finishBroadcast();
        }

        /* renamed from: C */
        public final void mo503C(Bundle bundle) {
            for (int beginBroadcast = this.f338a.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f338a.getBroadcastItem(beginBroadcast).mo243L(bundle);
                } catch (RemoteException unused) {
                }
            }
            this.f338a.finishBroadcast();
        }

        /* renamed from: D */
        public final void mo504D(MediaMetadataCompat mediaMetadataCompat) {
            for (int beginBroadcast = this.f338a.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f338a.getBroadcastItem(beginBroadcast).mo245U7(mediaMetadataCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f338a.finishBroadcast();
        }

        /* renamed from: E */
        public final void mo505E(List<QueueItem> list) {
            for (int beginBroadcast = this.f338a.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f338a.getBroadcastItem(beginBroadcast).mo244S(list);
                } catch (RemoteException unused) {
                }
            }
            this.f338a.finishBroadcast();
        }

        /* renamed from: F */
        public final void mo506F(CharSequence charSequence) {
            for (int beginBroadcast = this.f338a.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f338a.getBroadcastItem(beginBroadcast).mo242G0(charSequence);
                } catch (RemoteException unused) {
                }
            }
            this.f338a.finishBroadcast();
        }

        /* renamed from: G */
        public final void mo507G(int i) {
            for (int beginBroadcast = this.f338a.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f338a.getBroadcastItem(beginBroadcast).mo278o7(i);
                } catch (RemoteException unused) {
                }
            }
            this.f338a.finishBroadcast();
        }

        /* renamed from: H */
        public final void mo508H() {
            for (int beginBroadcast = this.f338a.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f338a.getBroadcastItem(beginBroadcast).mo247v0();
                } catch (RemoteException unused) {
                }
            }
            this.f338a.finishBroadcast();
            this.f338a.kill();
        }

        /* renamed from: I */
        public final void mo509I(int i) {
            for (int beginBroadcast = this.f338a.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f338a.getBroadcastItem(beginBroadcast).mo274P6(i);
                } catch (RemoteException unused) {
                }
            }
            this.f338a.finishBroadcast();
        }

        /* renamed from: J */
        public final void mo510J(PlaybackStateCompat playbackStateCompat) {
            for (int beginBroadcast = this.f338a.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f338a.getBroadcastItem(beginBroadcast).mo277k5(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f338a.finishBroadcast();
        }

        /* renamed from: K */
        public PlaybackStateCompat mo419K() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f349a) {
                playbackStateCompat = this.f344a;
            }
            return playbackStateCompat;
        }

        /* renamed from: L */
        public void mo511L(ParcelableVolumeInfo parcelableVolumeInfo) {
            for (int beginBroadcast = this.f338a.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f338a.getBroadcastItem(beginBroadcast).mo246n2(parcelableVolumeInfo);
                } catch (RemoteException unused) {
                }
            }
            this.f338a.finishBroadcast();
        }

        /* renamed from: M */
        public void mo445M(PlaybackStateCompat playbackStateCompat) {
            this.f336a.setPlaybackState(mo515w(playbackStateCompat.mo545p()));
        }

        /* renamed from: N */
        public void mo512N(int i, int i2) {
            if (this.f361e == 2) {
                kw4 kw4 = this.f347a;
                if (kw4 != null) {
                    kw4.mo19221f(i);
                    return;
                }
                return;
            }
            this.f335a.setStreamVolume(this.f363f, i, i2);
        }

        /* renamed from: O */
        public void mo446O(PendingIntent pendingIntent, ComponentName componentName) {
            this.f335a.unregisterMediaButtonEventReceiver(componentName);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
            if ((r4.f331a & 2) == 0) goto L_0x0057;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
            if (r4.f360d != false) goto L_0x0057;
         */
        /* renamed from: P */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo513P() {
            /*
                r4 = this;
                boolean r0 = r4.f356b
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0046
                boolean r0 = r4.f358c
                if (r0 != 0) goto L_0x0019
                int r3 = r4.f331a
                r3 = r3 & r1
                if (r3 == 0) goto L_0x0019
                android.app.PendingIntent r0 = r4.f332a
                android.content.ComponentName r3 = r4.f333a
                r4.mo448z(r0, r3)
                r4.f358c = r1
                goto L_0x0029
            L_0x0019:
                if (r0 == 0) goto L_0x0029
                int r0 = r4.f331a
                r0 = r0 & r1
                if (r0 != 0) goto L_0x0029
                android.app.PendingIntent r0 = r4.f332a
                android.content.ComponentName r3 = r4.f333a
                r4.mo446O(r0, r3)
                r4.f358c = r2
            L_0x0029:
                boolean r0 = r4.f360d
                if (r0 != 0) goto L_0x003d
                int r3 = r4.f331a
                r3 = r3 & 2
                if (r3 == 0) goto L_0x003d
                android.media.AudioManager r0 = r4.f335a
                android.media.RemoteControlClient r2 = r4.f336a
                r0.registerRemoteControlClient(r2)
                r4.f360d = r1
                goto L_0x0066
            L_0x003d:
                if (r0 == 0) goto L_0x0065
                int r0 = r4.f331a
                r0 = r0 & 2
                if (r0 != 0) goto L_0x0065
                goto L_0x0057
            L_0x0046:
                boolean r0 = r4.f358c
                if (r0 == 0) goto L_0x0053
                android.app.PendingIntent r0 = r4.f332a
                android.content.ComponentName r1 = r4.f333a
                r4.mo446O(r0, r1)
                r4.f358c = r2
            L_0x0053:
                boolean r0 = r4.f360d
                if (r0 == 0) goto L_0x0065
            L_0x0057:
                android.media.RemoteControlClient r0 = r4.f336a
                r0.setPlaybackState(r2)
                android.media.AudioManager r0 = r4.f335a
                android.media.RemoteControlClient r1 = r4.f336a
                r0.unregisterRemoteControlClient(r1)
                r4.f360d = r2
            L_0x0065:
                r1 = 0
            L_0x0066:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.media.session.MediaSessionCompat.C0099j.mo513P():boolean");
        }

        /* renamed from: a */
        public void mo514a(int i, int i2) {
            if (this.f361e == 2) {
                kw4 kw4 = this.f347a;
                if (kw4 != null) {
                    kw4.mo19220e(i);
                    return;
                }
                return;
            }
            this.f335a.adjustStreamVolume(this.f363f, i, i2);
        }

        /* renamed from: b */
        public boolean mo420b() {
            return this.f356b;
        }

        /* renamed from: c */
        public Token mo421c() {
            return this.f340a;
        }

        /* renamed from: d */
        public void mo422d(int i) {
            synchronized (this.f349a) {
                this.f331a = i;
            }
            mo513P();
        }

        /* renamed from: e */
        public void mo423e(int i) {
            this.f353b = i;
        }

        /* renamed from: f */
        public void mo424f(List<QueueItem> list) {
            this.f351a = list;
            mo505E(list);
        }

        /* renamed from: g */
        public void mo425g(boolean z) {
            if (z != this.f356b) {
                this.f356b = z;
                if (mo513P()) {
                    mo427i(this.f339a);
                    mo439s(this.f344a);
                }
            }
        }

        /* renamed from: h */
        public void mo426h(kw4 kw4) {
            if (kw4 != null) {
                kw4 kw42 = this.f347a;
                if (kw42 != null) {
                    kw42.mo19222g((kw4.C2675b) null);
                }
                this.f361e = 2;
                this.f347a = kw4;
                mo511L(new ParcelableVolumeInfo(this.f361e, this.f363f, this.f347a.mo19218c(), this.f347a.mo19217b(), this.f347a.mo19216a()));
                kw4.mo19222g(this.f346a);
                return;
            }
            throw new IllegalArgumentException("volumeProvider may not be null");
        }

        /* renamed from: i */
        public void mo427i(MediaMetadataCompat mediaMetadataCompat) {
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.C0041c(mediaMetadataCompat, MediaSessionCompat.f272h).mo155a();
            }
            synchronized (this.f349a) {
                this.f339a = mediaMetadataCompat;
            }
            mo504D(mediaMetadataCompat);
            if (this.f356b) {
                mo450v(mediaMetadataCompat == null ? null : mediaMetadataCompat.mo140d()).apply();
            }
        }

        /* renamed from: j */
        public String mo428j() {
            return null;
        }

        /* renamed from: k */
        public void mo429k(PendingIntent pendingIntent) {
            synchronized (this.f349a) {
                this.f354b = pendingIntent;
            }
        }

        /* renamed from: l */
        public void mo430l(String str, Bundle bundle) {
            mo502B(str, bundle);
        }

        /* renamed from: m */
        public void mo431m(int i) {
            kw4 kw4 = this.f347a;
            if (kw4 != null) {
                kw4.mo19222g((kw4.C2675b) null);
            }
            this.f363f = i;
            this.f361e = 1;
            int i2 = this.f361e;
            int i3 = this.f363f;
            mo511L(new ParcelableVolumeInfo(i2, i3, 2, this.f335a.getStreamMaxVolume(i3), this.f335a.getStreamVolume(this.f363f)));
        }

        /* renamed from: n */
        public void mo432n(CharSequence charSequence) {
            this.f348a = charSequence;
            mo506F(charSequence);
        }

        /* renamed from: n0 */
        public void mo433n0(int i) {
            if (this.f357c != i) {
                this.f357c = i;
                mo507G(i);
            }
        }

        /* renamed from: o */
        public Object mo434o() {
            return null;
        }

        /* renamed from: p */
        public Object mo435p() {
            return null;
        }

        /* renamed from: q */
        public void mo436q(C0773d.C0775b bVar) {
            synchronized (this.f349a) {
                this.f345a = bVar;
            }
        }

        /* renamed from: r */
        public void mo437r(PendingIntent pendingIntent) {
        }

        public void release() {
            this.f356b = false;
            this.f352a = true;
            mo513P();
            mo508H();
        }

        /* renamed from: s */
        public void mo439s(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f349a) {
                this.f344a = playbackStateCompat;
            }
            mo510J(playbackStateCompat);
            if (this.f356b) {
                if (playbackStateCompat == null) {
                    this.f336a.setPlaybackState(0);
                    this.f336a.setTransportControlFlags(0);
                    return;
                }
                mo445M(playbackStateCompat);
                this.f336a.setTransportControlFlags(mo447x(playbackStateCompat.mo532b()));
            }
        }

        /* renamed from: s0 */
        public void mo440s0(int i) {
            if (this.f359d != i) {
                this.f359d = i;
                mo509I(i);
            }
        }

        public void setExtras(Bundle bundle) {
            this.f337a = bundle;
            mo503C(bundle);
        }

        /* renamed from: t */
        public C0773d.C0775b mo442t() {
            C0773d.C0775b bVar;
            synchronized (this.f349a) {
                bVar = this.f345a;
            }
            return bVar;
        }

        /* renamed from: u */
        public void mo443u(C0086d dVar, Handler handler) {
            this.f341a = dVar;
            if (dVar != null) {
                if (handler == null) {
                    handler = new Handler();
                }
                synchronized (this.f349a) {
                    C0103d dVar2 = this.f343a;
                    if (dVar2 != null) {
                        dVar2.removeCallbacksAndMessages((Object) null);
                    }
                    this.f343a = new C0103d(handler.getLooper());
                    this.f341a.mo370D(this, handler);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
            if (r2 != null) goto L_0x001d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
            if (r2 != null) goto L_0x001d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00a3  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00c4  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00d5  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00e5  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00f5  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0104  */
        /* renamed from: v */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.media.RemoteControlClient.MetadataEditor mo450v(android.os.Bundle r7) {
            /*
                r6 = this;
                android.media.RemoteControlClient r0 = r6.f336a
                r1 = 1
                android.media.RemoteControlClient$MetadataEditor r0 = r0.editMetadata(r1)
                if (r7 != 0) goto L_0x000a
                return r0
            L_0x000a:
                java.lang.String r2 = "android.media.metadata.ART"
                boolean r3 = r7.containsKey(r2)
                r4 = 100
                r5 = 0
                if (r3 == 0) goto L_0x0029
                android.os.Parcelable r2 = r7.getParcelable(r2)
                android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
                if (r2 == 0) goto L_0x0025
            L_0x001d:
                android.graphics.Bitmap$Config r3 = r2.getConfig()
                android.graphics.Bitmap r2 = r2.copy(r3, r5)
            L_0x0025:
                r0.putBitmap(r4, r2)
                goto L_0x003a
            L_0x0029:
                java.lang.String r2 = "android.media.metadata.ALBUM_ART"
                boolean r3 = r7.containsKey(r2)
                if (r3 == 0) goto L_0x003a
                android.os.Parcelable r2 = r7.getParcelable(r2)
                android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
                if (r2 == 0) goto L_0x0025
                goto L_0x001d
            L_0x003a:
                java.lang.String r2 = "android.media.metadata.ALBUM"
                boolean r3 = r7.containsKey(r2)
                if (r3 == 0) goto L_0x0049
                java.lang.String r2 = r7.getString(r2)
                r0.putString(r1, r2)
            L_0x0049:
                java.lang.String r1 = "android.media.metadata.ALBUM_ARTIST"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x005a
                r2 = 13
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x005a:
                java.lang.String r1 = "android.media.metadata.ARTIST"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x006a
                r2 = 2
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x006a:
                java.lang.String r1 = "android.media.metadata.AUTHOR"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x007a
                r2 = 3
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x007a:
                java.lang.String r1 = "android.media.metadata.COMPILATION"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x008b
                r2 = 15
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x008b:
                java.lang.String r1 = "android.media.metadata.COMPOSER"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x009b
                r2 = 4
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x009b:
                java.lang.String r1 = "android.media.metadata.DATE"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x00ab
                r2 = 5
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x00ab:
                java.lang.String r1 = "android.media.metadata.DISC_NUMBER"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x00bc
                r2 = 14
                long r3 = r7.getLong(r1)
                r0.putLong(r2, r3)
            L_0x00bc:
                java.lang.String r1 = "android.media.metadata.DURATION"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x00cd
                r2 = 9
                long r3 = r7.getLong(r1)
                r0.putLong(r2, r3)
            L_0x00cd:
                java.lang.String r1 = "android.media.metadata.GENRE"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x00dd
                r2 = 6
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x00dd:
                java.lang.String r1 = "android.media.metadata.TITLE"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x00ed
                r2 = 7
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x00ed:
                java.lang.String r1 = "android.media.metadata.TRACK_NUMBER"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x00fc
                long r1 = r7.getLong(r1)
                r0.putLong(r5, r1)
            L_0x00fc:
                java.lang.String r1 = "android.media.metadata.WRITER"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x010d
                r2 = 11
                java.lang.String r7 = r7.getString(r1)
                r0.putString(r2, r7)
            L_0x010d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.media.session.MediaSessionCompat.C0099j.mo450v(android.os.Bundle):android.media.RemoteControlClient$MetadataEditor");
        }

        /* renamed from: w */
        public int mo515w(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        /* renamed from: x */
        public int mo447x(long j) {
            int i = (1 & j) != 0 ? 32 : 0;
            if ((2 & j) != 0) {
                i |= 16;
            }
            if ((4 & j) != 0) {
                i |= 4;
            }
            if ((8 & j) != 0) {
                i |= 2;
            }
            if ((16 & j) != 0) {
                i |= 1;
            }
            if ((32 & j) != 0) {
                i |= 128;
            }
            if ((64 & j) != 0) {
                i |= 64;
            }
            return (j & 512) != 0 ? i | 8 : i;
        }

        /* renamed from: x0 */
        public void mo444x0(boolean z) {
            if (this.f362e != z) {
                this.f362e = z;
                mo501A(z);
            }
        }

        /* renamed from: y */
        public void mo516y(int i, int i2, int i3, Object obj, Bundle bundle) {
            synchronized (this.f349a) {
                C0103d dVar = this.f343a;
                if (dVar != null) {
                    Message obtainMessage = dVar.obtainMessage(i, i2, i3, obj);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(MediaSessionCompat.f254B, C0773d.C0775b.f4337a);
                    bundle2.putInt("data_calling_pid", Binder.getCallingPid());
                    bundle2.putInt("data_calling_uid", Binder.getCallingUid());
                    if (bundle != null) {
                        bundle2.putBundle(MediaSessionCompat.f257E, bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }

        /* renamed from: z */
        public void mo448z(PendingIntent pendingIntent, ComponentName componentName) {
            this.f335a.registerMediaButtonEventReceiver(componentName);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$k */
    public interface C0104k {
        /* renamed from: a */
        void mo525a();
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$l */
    public @interface C0105l {
    }

    public MediaSessionCompat(Context context, C0091e eVar) {
        this.f294a = new ArrayList<>();
        this.f293a = eVar;
        if (!C0132f.m987d(eVar.mo435p())) {
            mo326p(new C0085c());
        }
        this.f292a = new MediaControllerCompat(context, this);
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, (ComponentName) null, (PendingIntent) null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, (Bundle) null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        C0091e hVar;
        C0086d bVar;
        this.f294a = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            if (componentName == null && (componentName = MediaButtonReceiver.m5076c(context)) == null) {
                Log.w(f259a, "Couldn't find a unique registered media button receiver in the given context.");
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                hVar = new C0098i(context, str, bundle);
                this.f293a = hVar;
                bVar = new C0083a();
            } else {
                hVar = new C0096h(context, str, bundle);
                this.f293a = hVar;
                bVar = new C0084b();
            }
            mo326p(bVar);
            hVar.mo437r(pendingIntent);
            this.f292a = new MediaControllerCompat(context, this);
            if (f272h == 0) {
                f272h = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }

    @hl3({hl3.C2354a.f13187b})
    public MediaSessionCompat(Context context, String str, Bundle bundle) {
        this(context, str, (ComponentName) null, (PendingIntent) null, bundle);
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: b */
    public static void m458b(@ts2 Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: c */
    public static MediaSessionCompat m459c(Context context, Object obj) {
        if (context == null || obj == null) {
            return null;
        }
        return new MediaSessionCompat(context, (C0091e) new C0096h(obj));
    }

    /* renamed from: j */
    public static PlaybackStateCompat m460j(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j = -1;
        if (playbackStateCompat.mo544o() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.mo545p() != 3 && playbackStateCompat.mo545p() != 4 && playbackStateCompat.mo545p() != 5) {
            return playbackStateCompat;
        }
        long k = playbackStateCompat.mo541k();
        if (k <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long m = ((long) (playbackStateCompat.mo542m() * ((float) (elapsedRealtime - k)))) + playbackStateCompat.mo544o();
        if (mediaMetadataCompat != null && mediaMetadataCompat.mo138a(MediaMetadataCompat.f158e)) {
            j = mediaMetadataCompat.mo143f(MediaMetadataCompat.f158e);
        }
        return new PlaybackStateCompat.C0111c(playbackStateCompat).mo576k(playbackStateCompat.mo545p(), (j < 0 || m <= j) ? m < 0 ? 0 : m : j, playbackStateCompat.mo542m(), elapsedRealtime).mo568c();
    }

    /* renamed from: A */
    public void mo309A(CharSequence charSequence) {
        this.f293a.mo432n(charSequence);
    }

    /* renamed from: B */
    public void mo310B(int i) {
        this.f293a.mo423e(i);
    }

    /* renamed from: C */
    public void mo311C(int i) {
        this.f293a.mo433n0(i);
    }

    /* renamed from: D */
    public void mo312D(PendingIntent pendingIntent) {
        this.f293a.mo429k(pendingIntent);
    }

    /* renamed from: E */
    public void mo313E(int i) {
        this.f293a.mo440s0(i);
    }

    /* renamed from: a */
    public void mo314a(C0104k kVar) {
        if (kVar != null) {
            this.f294a.add(kVar);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: d */
    public String mo315d() {
        return this.f293a.mo428j();
    }

    /* renamed from: e */
    public MediaControllerCompat mo316e() {
        return this.f292a;
    }

    @mr2
    /* renamed from: f */
    public final C0773d.C0775b mo317f() {
        return this.f293a.mo442t();
    }

    /* renamed from: g */
    public Object mo318g() {
        return this.f293a.mo435p();
    }

    /* renamed from: h */
    public Object mo319h() {
        return this.f293a.mo434o();
    }

    /* renamed from: i */
    public Token mo320i() {
        return this.f293a.mo421c();
    }

    /* renamed from: k */
    public boolean mo321k() {
        return this.f293a.mo420b();
    }

    /* renamed from: l */
    public void mo322l() {
        this.f293a.release();
    }

    /* renamed from: m */
    public void mo323m(C0104k kVar) {
        if (kVar != null) {
            this.f294a.remove(kVar);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    /* renamed from: n */
    public void mo324n(String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f293a.mo430l(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    /* renamed from: o */
    public void mo325o(boolean z) {
        this.f293a.mo425g(z);
        Iterator<C0104k> it = this.f294a.iterator();
        while (it.hasNext()) {
            it.next().mo525a();
        }
    }

    /* renamed from: p */
    public void mo326p(C0086d dVar) {
        mo327q(dVar, (Handler) null);
    }

    /* renamed from: q */
    public void mo327q(C0086d dVar, Handler handler) {
        if (dVar == null) {
            this.f293a.mo443u((C0086d) null, (Handler) null);
            return;
        }
        C0091e eVar = this.f293a;
        if (handler == null) {
            handler = new Handler();
        }
        eVar.mo443u(dVar, handler);
    }

    /* renamed from: r */
    public void mo328r(boolean z) {
        this.f293a.mo444x0(z);
    }

    /* renamed from: s */
    public void mo329s(Bundle bundle) {
        this.f293a.setExtras(bundle);
    }

    /* renamed from: t */
    public void mo330t(int i) {
        this.f293a.mo422d(i);
    }

    /* renamed from: u */
    public void mo331u(PendingIntent pendingIntent) {
        this.f293a.mo437r(pendingIntent);
    }

    /* renamed from: v */
    public void mo332v(MediaMetadataCompat mediaMetadataCompat) {
        this.f293a.mo427i(mediaMetadataCompat);
    }

    /* renamed from: w */
    public void mo333w(PlaybackStateCompat playbackStateCompat) {
        this.f293a.mo439s(playbackStateCompat);
    }

    /* renamed from: x */
    public void mo334x(int i) {
        this.f293a.mo431m(i);
    }

    /* renamed from: y */
    public void mo335y(kw4 kw4) {
        if (kw4 != null) {
            this.f293a.mo426h(kw4);
            return;
        }
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    /* renamed from: z */
    public void mo336z(List<QueueItem> list) {
        this.f293a.mo424f(list);
    }
}
