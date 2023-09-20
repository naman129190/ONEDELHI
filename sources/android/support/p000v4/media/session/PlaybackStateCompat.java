package android.support.p000v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p000v4.media.session.C0142i;
import android.text.TextUtils;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.s23;
import com.onedelhi.secure.ts2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {

    /* renamed from: A */
    public static final int f407A = 11;

    /* renamed from: A */
    public static final long f408A = 1048576;

    /* renamed from: B */
    public static final int f409B = -1;

    /* renamed from: B */
    public static final long f410B = 2097152;

    /* renamed from: C */
    public static final int f411C = 0;

    /* renamed from: C */
    public static final long f412C = -1;
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0109a();

    /* renamed from: D */
    public static final int f413D = 1;

    /* renamed from: E */
    public static final int f414E = 2;

    /* renamed from: F */
    public static final int f415F = 3;

    /* renamed from: G */
    public static final int f416G = -1;

    /* renamed from: H */
    public static final int f417H = 0;

    /* renamed from: I */
    public static final int f418I = 1;

    /* renamed from: J */
    public static final int f419J = 2;

    /* renamed from: K */
    public static final int f420K = 0;

    /* renamed from: L */
    public static final int f421L = 1;

    /* renamed from: M */
    public static final int f422M = 2;

    /* renamed from: N */
    public static final int f423N = 3;

    /* renamed from: O */
    public static final int f424O = 4;

    /* renamed from: P */
    public static final int f425P = 5;

    /* renamed from: Q */
    public static final int f426Q = 6;

    /* renamed from: R */
    public static final int f427R = 7;

    /* renamed from: S */
    public static final int f428S = 8;

    /* renamed from: T */
    public static final int f429T = 9;

    /* renamed from: U */
    public static final int f430U = 10;

    /* renamed from: V */
    public static final int f431V = 11;

    /* renamed from: W */
    public static final int f432W = 127;

    /* renamed from: X */
    public static final int f433X = 126;

    /* renamed from: g */
    public static final long f434g = 1;

    /* renamed from: h */
    public static final long f435h = 2;

    /* renamed from: i */
    public static final long f436i = 4;

    /* renamed from: j */
    public static final long f437j = 8;

    /* renamed from: k */
    public static final long f438k = 16;

    /* renamed from: l */
    public static final long f439l = 32;

    /* renamed from: m */
    public static final long f440m = 64;

    /* renamed from: n */
    public static final long f441n = 128;

    /* renamed from: o */
    public static final long f442o = 256;

    /* renamed from: p */
    public static final int f443p = 0;

    /* renamed from: p */
    public static final long f444p = 512;

    /* renamed from: q */
    public static final int f445q = 1;

    /* renamed from: q */
    public static final long f446q = 1024;

    /* renamed from: r */
    public static final int f447r = 2;

    /* renamed from: r */
    public static final long f448r = 2048;

    /* renamed from: s */
    public static final int f449s = 3;

    /* renamed from: s */
    public static final long f450s = 4096;

    /* renamed from: t */
    public static final int f451t = 4;

    /* renamed from: t */
    public static final long f452t = 8192;

    /* renamed from: u */
    public static final int f453u = 5;

    /* renamed from: u */
    public static final long f454u = 16384;

    /* renamed from: v */
    public static final int f455v = 6;

    /* renamed from: v */
    public static final long f456v = 32768;

    /* renamed from: w */
    public static final int f457w = 7;

    /* renamed from: w */
    public static final long f458w = 65536;

    /* renamed from: x */
    public static final int f459x = 8;

    /* renamed from: x */
    public static final long f460x = 131072;

    /* renamed from: y */
    public static final int f461y = 9;

    /* renamed from: y */
    public static final long f462y = 262144;

    /* renamed from: z */
    public static final int f463z = 10;
    @Deprecated

    /* renamed from: z */
    public static final long f464z = 524288;

    /* renamed from: a */
    public final float f465a;

    /* renamed from: a */
    public final Bundle f466a;

    /* renamed from: a */
    public final CharSequence f467a;

    /* renamed from: a */
    public Object f468a;

    /* renamed from: a */
    public List<CustomAction> f469a;

    /* renamed from: b */
    public final long f470b;

    /* renamed from: c */
    public final long f471c;

    /* renamed from: d */
    public final long f472d;

    /* renamed from: e */
    public final long f473e;

    /* renamed from: f */
    public final long f474f;

    /* renamed from: n */
    public final int f475n;

    /* renamed from: o */
    public final int f476o;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0107a();

        /* renamed from: a */
        public final Bundle f477a;

        /* renamed from: a */
        public final CharSequence f478a;

        /* renamed from: a */
        public Object f479a;

        /* renamed from: b */
        public final String f480b;

        /* renamed from: n */
        public final int f481n;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        public static class C0107a implements Parcelable.Creator<CustomAction> {
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$b */
        public static final class C0108b {

            /* renamed from: a */
            public final int f482a;

            /* renamed from: a */
            public Bundle f483a;

            /* renamed from: a */
            public final CharSequence f484a;

            /* renamed from: a */
            public final String f485a;

            public C0108b(String str, CharSequence charSequence, int i) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction.");
                } else if (TextUtils.isEmpty(charSequence)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction.");
                } else if (i != 0) {
                    this.f485a = str;
                    this.f484a = charSequence;
                    this.f482a = i;
                } else {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction.");
                }
            }

            /* renamed from: a */
            public CustomAction mo560a() {
                return new CustomAction(this.f485a, this.f484a, this.f482a, this.f483a);
            }

            /* renamed from: b */
            public C0108b mo561b(Bundle bundle) {
                this.f483a = bundle;
                return this;
            }
        }

        public CustomAction(Parcel parcel) {
            this.f480b = parcel.readString();
            this.f478a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f481n = parcel.readInt();
            this.f477a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f480b = str;
            this.f478a = charSequence;
            this.f481n = i;
            this.f477a = bundle;
        }

        /* renamed from: a */
        public static CustomAction m782a(Object obj) {
            if (obj == null) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0142i.C0143a.m1042a(obj), C0142i.C0143a.m1045d(obj), C0142i.C0143a.m1044c(obj), C0142i.C0143a.m1043b(obj));
            customAction.f479a = obj;
            return customAction;
        }

        /* renamed from: b */
        public String mo548b() {
            return this.f480b;
        }

        /* renamed from: c */
        public Object mo549c() {
            Object obj = this.f479a;
            if (obj != null) {
                return obj;
            }
            Object e = C0142i.C0143a.m1046e(this.f480b, this.f478a, this.f481n, this.f477a);
            this.f479a = e;
            return e;
        }

        /* renamed from: d */
        public Bundle mo550d() {
            return this.f477a;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public int mo552e() {
            return this.f481n;
        }

        /* renamed from: f */
        public CharSequence mo553f() {
            return this.f478a;
        }

        public String toString() {
            return "Action:mName='" + this.f478a + ", mIcon=" + this.f481n + ", mExtras=" + this.f477a;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f480b);
            TextUtils.writeToParcel(this.f478a, parcel, i);
            parcel.writeInt(this.f481n);
            parcel.writeBundle(this.f477a);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    public static class C0109a implements Parcelable.Creator<PlaybackStateCompat> {
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$b */
    public @interface C0110b {
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$c */
    public static final class C0111c {

        /* renamed from: a */
        public float f486a;

        /* renamed from: a */
        public int f487a;

        /* renamed from: a */
        public long f488a;

        /* renamed from: a */
        public Bundle f489a;

        /* renamed from: a */
        public CharSequence f490a;

        /* renamed from: a */
        public final List<CustomAction> f491a;

        /* renamed from: b */
        public int f492b;

        /* renamed from: b */
        public long f493b;

        /* renamed from: c */
        public long f494c;

        /* renamed from: d */
        public long f495d;

        /* renamed from: e */
        public long f496e;

        public C0111c() {
            this.f491a = new ArrayList();
            this.f496e = -1;
        }

        public C0111c(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f491a = arrayList;
            this.f496e = -1;
            this.f487a = playbackStateCompat.f475n;
            this.f488a = playbackStateCompat.f470b;
            this.f486a = playbackStateCompat.f465a;
            this.f495d = playbackStateCompat.f473e;
            this.f493b = playbackStateCompat.f471c;
            this.f494c = playbackStateCompat.f472d;
            this.f492b = playbackStateCompat.f476o;
            this.f490a = playbackStateCompat.f467a;
            List<CustomAction> list = playbackStateCompat.f469a;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f496e = playbackStateCompat.f474f;
            this.f489a = playbackStateCompat.f466a;
        }

        /* renamed from: a */
        public C0111c mo566a(CustomAction customAction) {
            if (customAction != null) {
                this.f491a.add(customAction);
                return this;
            }
            throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat.");
        }

        /* renamed from: b */
        public C0111c mo567b(String str, String str2, int i) {
            return mo566a(new CustomAction(str, str2, i, (Bundle) null));
        }

        /* renamed from: c */
        public PlaybackStateCompat mo568c() {
            return new PlaybackStateCompat(this.f487a, this.f488a, this.f493b, this.f486a, this.f494c, this.f492b, this.f490a, this.f495d, this.f491a, this.f496e, this.f489a);
        }

        /* renamed from: d */
        public C0111c mo569d(long j) {
            this.f494c = j;
            return this;
        }

        /* renamed from: e */
        public C0111c mo570e(long j) {
            this.f496e = j;
            return this;
        }

        /* renamed from: f */
        public C0111c mo571f(long j) {
            this.f493b = j;
            return this;
        }

        /* renamed from: g */
        public C0111c mo572g(int i, CharSequence charSequence) {
            this.f492b = i;
            this.f490a = charSequence;
            return this;
        }

        /* renamed from: h */
        public C0111c mo573h(CharSequence charSequence) {
            this.f490a = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0111c mo574i(Bundle bundle) {
            this.f489a = bundle;
            return this;
        }

        /* renamed from: j */
        public C0111c mo575j(int i, long j, float f) {
            return mo576k(i, j, f, SystemClock.elapsedRealtime());
        }

        /* renamed from: k */
        public C0111c mo576k(int i, long j, float f, long j2) {
            this.f487a = i;
            this.f488a = j;
            this.f495d = j2;
            this.f486a = f;
            return this;
        }
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$d */
    public @interface C0112d {
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$e */
    public @interface C0113e {
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$f */
    public @interface C0114f {
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$g */
    public @interface C0115g {
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$h */
    public @interface C0116h {
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f475n = i;
        this.f470b = j;
        this.f471c = j2;
        this.f465a = f;
        this.f472d = j3;
        this.f476o = i2;
        this.f467a = charSequence;
        this.f473e = j4;
        this.f469a = new ArrayList(list);
        this.f474f = j5;
        this.f466a = bundle;
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f475n = parcel.readInt();
        this.f470b = parcel.readLong();
        this.f465a = parcel.readFloat();
        this.f473e = parcel.readLong();
        this.f471c = parcel.readLong();
        this.f472d = parcel.readLong();
        this.f467a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f469a = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f474f = parcel.readLong();
        this.f466a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f476o = parcel.readInt();
    }

    /* renamed from: a */
    public static PlaybackStateCompat m767a(Object obj) {
        ArrayList arrayList;
        Object obj2 = obj;
        Bundle bundle = null;
        if (obj2 == null) {
            return null;
        }
        List<Object> d = C0142i.m1035d(obj);
        if (d != null) {
            ArrayList arrayList2 = new ArrayList(d.size());
            for (Object a : d) {
                arrayList2.add(CustomAction.m782a(a));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = s23.m27223a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0142i.m1040i(obj), C0142i.m1039h(obj), C0142i.m1034c(obj), C0142i.m1038g(obj), C0142i.m1032a(obj), 0, C0142i.m1036e(obj), C0142i.m1037f(obj), arrayList, C0142i.m1033b(obj), bundle);
        playbackStateCompat.f468a = obj2;
        return playbackStateCompat;
    }

    /* renamed from: q */
    public static int m768q(long j) {
        if (j == 4) {
            return 126;
        }
        if (j == 2) {
            return 127;
        }
        if (j == 32) {
            return 87;
        }
        if (j == 16) {
            return 88;
        }
        if (j == 1) {
            return 86;
        }
        if (j == 64) {
            return 90;
        }
        if (j == 8) {
            return 89;
        }
        return j == 512 ? 85 : 0;
    }

    /* renamed from: b */
    public long mo532b() {
        return this.f472d;
    }

    /* renamed from: c */
    public long mo533c() {
        return this.f474f;
    }

    /* renamed from: d */
    public long mo534d() {
        return this.f471c;
    }

    public int describeContents() {
        return 0;
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: e */
    public long mo536e(Long l) {
        return Math.max(0, this.f470b + ((long) (this.f465a * ((float) (l != null ? l.longValue() : SystemClock.elapsedRealtime() - this.f473e)))));
    }

    /* renamed from: f */
    public List<CustomAction> mo537f() {
        return this.f469a;
    }

    /* renamed from: h */
    public int mo538h() {
        return this.f476o;
    }

    /* renamed from: i */
    public CharSequence mo539i() {
        return this.f467a;
    }

    @ts2
    /* renamed from: j */
    public Bundle mo540j() {
        return this.f466a;
    }

    /* renamed from: k */
    public long mo541k() {
        return this.f473e;
    }

    /* renamed from: m */
    public float mo542m() {
        return this.f465a;
    }

    /* renamed from: n */
    public Object mo543n() {
        Object obj;
        if (this.f468a == null) {
            ArrayList arrayList = null;
            if (this.f469a != null) {
                arrayList = new ArrayList(this.f469a.size());
                for (CustomAction c : this.f469a) {
                    arrayList.add(c.mo549c());
                }
            }
            ArrayList arrayList2 = arrayList;
            int i = Build.VERSION.SDK_INT;
            int i2 = this.f475n;
            long j = this.f470b;
            long j2 = this.f471c;
            float f = this.f465a;
            long j3 = this.f472d;
            CharSequence charSequence = this.f467a;
            long j4 = this.f473e;
            if (i >= 22) {
                obj = s23.m27224b(i2, j, j2, f, j3, charSequence, j4, arrayList2, this.f474f, this.f466a);
            } else {
                obj = C0142i.m1041j(i2, j, j2, f, j3, charSequence, j4, arrayList2, this.f474f);
            }
            this.f468a = obj;
        }
        return this.f468a;
    }

    /* renamed from: o */
    public long mo544o() {
        return this.f470b;
    }

    /* renamed from: p */
    public int mo545p() {
        return this.f475n;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f475n + ", position=" + this.f470b + ", buffered position=" + this.f471c + ", speed=" + this.f465a + ", updated=" + this.f473e + ", actions=" + this.f472d + ", error code=" + this.f476o + ", error message=" + this.f467a + ", custom actions=" + this.f469a + ", active item id=" + this.f474f + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f475n);
        parcel.writeLong(this.f470b);
        parcel.writeFloat(this.f465a);
        parcel.writeLong(this.f473e);
        parcel.writeLong(this.f471c);
        parcel.writeLong(this.f472d);
        TextUtils.writeToParcel(this.f467a, parcel, i);
        parcel.writeTypedList(this.f469a);
        parcel.writeLong(this.f474f);
        parcel.writeBundle(this.f466a);
        parcel.writeInt(this.f476o);
    }
}
