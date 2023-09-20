package android.support.p000v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.media.C0060d;
import android.support.p000v4.media.C0062e;
import android.text.TextUtils;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.ts2;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0037a();

    /* renamed from: b */
    public static final long f113b = 0;

    /* renamed from: c */
    public static final long f114c = 1;

    /* renamed from: c */
    public static final String f115c = "android.media.extra.BT_FOLDER_TYPE";

    /* renamed from: d */
    public static final long f116d = 2;

    /* renamed from: d */
    public static final String f117d = "android.media.extra.DOWNLOAD_STATUS";

    /* renamed from: e */
    public static final long f118e = 3;
    @hl3({hl3.C2354a.f13187b})

    /* renamed from: e */
    public static final String f119e = "android.support.v4.media.description.MEDIA_URI";

    /* renamed from: f */
    public static final long f120f = 4;
    @hl3({hl3.C2354a.f13187b})

    /* renamed from: f */
    public static final String f121f = "android.support.v4.media.description.NULL_BUNDLE_FLAG";

    /* renamed from: g */
    public static final long f122g = 5;

    /* renamed from: h */
    public static final long f123h = 6;

    /* renamed from: i */
    public static final long f124i = 0;

    /* renamed from: j */
    public static final long f125j = 1;

    /* renamed from: k */
    public static final long f126k = 2;

    /* renamed from: a */
    public final Bitmap f127a;

    /* renamed from: a */
    public final Uri f128a;

    /* renamed from: a */
    public final Bundle f129a;

    /* renamed from: a */
    public final CharSequence f130a;

    /* renamed from: a */
    public Object f131a;

    /* renamed from: b */
    public final Uri f132b;

    /* renamed from: b */
    public final CharSequence f133b;

    /* renamed from: b */
    public final String f134b;

    /* renamed from: c */
    public final CharSequence f135c;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public static class C0037a implements Parcelable.Creator<MediaDescriptionCompat> {
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m123a(C0060d.m208a(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static final class C0038b {

        /* renamed from: a */
        public Bitmap f136a;

        /* renamed from: a */
        public Uri f137a;

        /* renamed from: a */
        public Bundle f138a;

        /* renamed from: a */
        public CharSequence f139a;

        /* renamed from: a */
        public String f140a;

        /* renamed from: b */
        public Uri f141b;

        /* renamed from: b */
        public CharSequence f142b;

        /* renamed from: c */
        public CharSequence f143c;

        /* renamed from: a */
        public MediaDescriptionCompat mo129a() {
            return new MediaDescriptionCompat(this.f140a, this.f139a, this.f142b, this.f143c, this.f136a, this.f137a, this.f138a, this.f141b);
        }

        /* renamed from: b */
        public C0038b mo130b(@ts2 CharSequence charSequence) {
            this.f143c = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0038b mo131c(@ts2 Bundle bundle) {
            this.f138a = bundle;
            return this;
        }

        /* renamed from: d */
        public C0038b mo132d(@ts2 Bitmap bitmap) {
            this.f136a = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0038b mo133e(@ts2 Uri uri) {
            this.f137a = uri;
            return this;
        }

        /* renamed from: f */
        public C0038b mo134f(@ts2 String str) {
            this.f140a = str;
            return this;
        }

        /* renamed from: g */
        public C0038b mo135g(@ts2 Uri uri) {
            this.f141b = uri;
            return this;
        }

        /* renamed from: h */
        public C0038b mo136h(@ts2 CharSequence charSequence) {
            this.f142b = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0038b mo137i(@ts2 CharSequence charSequence) {
            this.f139a = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.f134b = parcel.readString();
        this.f130a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f133b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f135c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f127a = (Bitmap) parcel.readParcelable(classLoader);
        this.f128a = (Uri) parcel.readParcelable(classLoader);
        this.f129a = parcel.readBundle(classLoader);
        this.f132b = (Uri) parcel.readParcelable(classLoader);
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f134b = str;
        this.f130a = charSequence;
        this.f133b = charSequence2;
        this.f135c = charSequence3;
        this.f127a = bitmap;
        this.f128a = uri;
        this.f129a = bundle;
        this.f132b = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0069  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p000v4.media.MediaDescriptionCompat m123a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x007a
            int r1 = android.os.Build.VERSION.SDK_INT
            android.support.v4.media.MediaDescriptionCompat$b r2 = new android.support.v4.media.MediaDescriptionCompat$b
            r2.<init>()
            java.lang.String r3 = android.support.p000v4.media.C0060d.m213f(r9)
            r2.mo134f(r3)
            java.lang.CharSequence r3 = android.support.p000v4.media.C0060d.m215h(r9)
            r2.mo137i(r3)
            java.lang.CharSequence r3 = android.support.p000v4.media.C0060d.m214g(r9)
            r2.mo136h(r3)
            java.lang.CharSequence r3 = android.support.p000v4.media.C0060d.m209b(r9)
            r2.mo130b(r3)
            android.graphics.Bitmap r3 = android.support.p000v4.media.C0060d.m211d(r9)
            r2.mo132d(r3)
            android.net.Uri r3 = android.support.p000v4.media.C0060d.m212e(r9)
            r2.mo133e(r3)
            android.os.Bundle r3 = android.support.p000v4.media.C0060d.m210c(r9)
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L_0x0046
            android.support.p000v4.media.session.MediaSessionCompat.m458b(r3)
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L_0x0047
        L_0x0046:
            r5 = r0
        L_0x0047:
            if (r5 == 0) goto L_0x005f
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L_0x0059
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L_0x0059
            goto L_0x0060
        L_0x0059:
            r3.remove(r4)
            r3.remove(r6)
        L_0x005f:
            r0 = r3
        L_0x0060:
            r2.mo131c(r0)
            if (r5 == 0) goto L_0x0069
            r2.mo135g(r5)
            goto L_0x0074
        L_0x0069:
            r0 = 23
            if (r1 < r0) goto L_0x0074
            android.net.Uri r0 = android.support.p000v4.media.C0062e.m226a(r9)
            r2.mo135g(r0)
        L_0x0074:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.mo129a()
            r0.f131a = r9
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.media.MediaDescriptionCompat.m123a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @ts2
    /* renamed from: b */
    public CharSequence mo113b() {
        return this.f135c;
    }

    @ts2
    /* renamed from: c */
    public Bundle mo114c() {
        return this.f129a;
    }

    @ts2
    /* renamed from: d */
    public Bitmap mo115d() {
        return this.f127a;
    }

    public int describeContents() {
        return 0;
    }

    @ts2
    /* renamed from: e */
    public Uri mo117e() {
        return this.f128a;
    }

    /* renamed from: f */
    public Object mo118f() {
        Object obj = this.f131a;
        if (obj != null) {
            return obj;
        }
        int i = Build.VERSION.SDK_INT;
        Object b = C0060d.C0061a.m218b();
        C0060d.C0061a.m223g(b, this.f134b);
        C0060d.C0061a.m225i(b, this.f130a);
        C0060d.C0061a.m224h(b, this.f133b);
        C0060d.C0061a.m219c(b, this.f135c);
        C0060d.C0061a.m221e(b, this.f127a);
        C0060d.C0061a.m222f(b, this.f128a);
        Bundle bundle = this.f129a;
        if (i < 23 && this.f132b != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean(f121f, true);
            }
            bundle.putParcelable(f119e, this.f132b);
        }
        C0060d.C0061a.m220d(b, bundle);
        if (i >= 23) {
            C0062e.C0063a.m227a(b, this.f132b);
        }
        Object a = C0060d.C0061a.m217a(b);
        this.f131a = a;
        return a;
    }

    @ts2
    /* renamed from: h */
    public String mo119h() {
        return this.f134b;
    }

    @ts2
    /* renamed from: i */
    public Uri mo120i() {
        return this.f132b;
    }

    @ts2
    /* renamed from: j */
    public CharSequence mo121j() {
        return this.f133b;
    }

    @ts2
    /* renamed from: k */
    public CharSequence mo122k() {
        return this.f130a;
    }

    public String toString() {
        return this.f130a + ", " + this.f133b + ", " + this.f135c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0060d.m216i(mo118f(), parcel, i);
    }
}
