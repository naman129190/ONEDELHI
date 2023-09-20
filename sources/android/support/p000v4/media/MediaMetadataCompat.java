package android.support.p000v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.media.MediaDescriptionCompat;
import android.support.p000v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import com.onedelhi.secure.C3042oa;
import com.onedelhi.secure.dg2;
import com.onedelhi.secure.hl3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;

/* renamed from: android.support.v4.media.MediaMetadataCompat */
public final class MediaMetadataCompat implements Parcelable {

    /* renamed from: A */
    public static final String f144A = "android.media.metadata.DISPLAY_ICON";

    /* renamed from: B */
    public static final String f145B = "android.media.metadata.DISPLAY_ICON_URI";

    /* renamed from: C */
    public static final String f146C = "android.media.metadata.MEDIA_ID";
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new C0039a();

    /* renamed from: D */
    public static final String f147D = "android.media.metadata.MEDIA_URI";

    /* renamed from: E */
    public static final String f148E = "android.media.metadata.BT_FOLDER_TYPE";

    /* renamed from: F */
    public static final String f149F = "android.media.metadata.ADVERTISEMENT";

    /* renamed from: G */
    public static final String f150G = "android.media.metadata.DOWNLOAD_STATUS";

    /* renamed from: a */
    public static final C3042oa<String, Integer> f151a;

    /* renamed from: a */
    public static final String[] f152a = {f155c, f157d, f159f, f174q, f161h, f160g, f162i};

    /* renamed from: b */
    public static final String f153b = "MediaMetadata";

    /* renamed from: b */
    public static final String[] f154b = {f144A, f175r, f177t};

    /* renamed from: c */
    public static final String f155c = "android.media.metadata.TITLE";

    /* renamed from: c */
    public static final String[] f156c = {f145B, f176s, f178u};

    /* renamed from: d */
    public static final String f157d = "android.media.metadata.ARTIST";

    /* renamed from: e */
    public static final String f158e = "android.media.metadata.DURATION";

    /* renamed from: f */
    public static final String f159f = "android.media.metadata.ALBUM";

    /* renamed from: g */
    public static final String f160g = "android.media.metadata.AUTHOR";

    /* renamed from: h */
    public static final String f161h = "android.media.metadata.WRITER";

    /* renamed from: i */
    public static final String f162i = "android.media.metadata.COMPOSER";

    /* renamed from: j */
    public static final String f163j = "android.media.metadata.COMPILATION";

    /* renamed from: k */
    public static final String f164k = "android.media.metadata.DATE";

    /* renamed from: l */
    public static final String f165l = "android.media.metadata.YEAR";

    /* renamed from: m */
    public static final String f166m = "android.media.metadata.GENRE";

    /* renamed from: n */
    public static final int f167n = 0;

    /* renamed from: n */
    public static final String f168n = "android.media.metadata.TRACK_NUMBER";

    /* renamed from: o */
    public static final int f169o = 1;

    /* renamed from: o */
    public static final String f170o = "android.media.metadata.NUM_TRACKS";

    /* renamed from: p */
    public static final int f171p = 2;

    /* renamed from: p */
    public static final String f172p = "android.media.metadata.DISC_NUMBER";

    /* renamed from: q */
    public static final int f173q = 3;

    /* renamed from: q */
    public static final String f174q = "android.media.metadata.ALBUM_ARTIST";

    /* renamed from: r */
    public static final String f175r = "android.media.metadata.ART";

    /* renamed from: s */
    public static final String f176s = "android.media.metadata.ART_URI";

    /* renamed from: t */
    public static final String f177t = "android.media.metadata.ALBUM_ART";

    /* renamed from: u */
    public static final String f178u = "android.media.metadata.ALBUM_ART_URI";

    /* renamed from: v */
    public static final String f179v = "android.media.metadata.USER_RATING";

    /* renamed from: w */
    public static final String f180w = "android.media.metadata.RATING";

    /* renamed from: x */
    public static final String f181x = "android.media.metadata.DISPLAY_TITLE";

    /* renamed from: y */
    public static final String f182y = "android.media.metadata.DISPLAY_SUBTITLE";

    /* renamed from: z */
    public static final String f183z = "android.media.metadata.DISPLAY_DESCRIPTION";

    /* renamed from: a */
    public final Bundle f184a;

    /* renamed from: a */
    public MediaDescriptionCompat f185a;

    /* renamed from: a */
    public Object f186a;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    public static class C0039a implements Parcelable.Creator<MediaMetadataCompat> {
        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* renamed from: b */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.MediaMetadataCompat$b */
    public @interface C0040b {
    }

    /* renamed from: android.support.v4.media.MediaMetadataCompat$c */
    public static final class C0041c {

        /* renamed from: a */
        public final Bundle f187a;

        public C0041c() {
            this.f187a = new Bundle();
        }

        public C0041c(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f184a);
            this.f187a = bundle;
            MediaSessionCompat.m458b(bundle);
        }

        @hl3({hl3.C2354a.f13187b})
        public C0041c(MediaMetadataCompat mediaMetadataCompat, int i) {
            this(mediaMetadataCompat);
            for (String str : this.f187a.keySet()) {
                Object obj = this.f187a.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i || bitmap.getWidth() > i) {
                        mo156b(str, mo161g(bitmap, i));
                    }
                }
            }
        }

        /* renamed from: a */
        public MediaMetadataCompat mo155a() {
            return new MediaMetadataCompat(this.f187a);
        }

        /* renamed from: b */
        public C0041c mo156b(String str, Bitmap bitmap) {
            C3042oa<String, Integer> oaVar = MediaMetadataCompat.f151a;
            if (!oaVar.containsKey(str) || oaVar.get(str).intValue() == 2) {
                this.f187a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        /* renamed from: c */
        public C0041c mo157c(String str, long j) {
            C3042oa<String, Integer> oaVar = MediaMetadataCompat.f151a;
            if (!oaVar.containsKey(str) || oaVar.get(str).intValue() == 0) {
                this.f187a.putLong(str, j);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        /* renamed from: d */
        public C0041c mo158d(String str, RatingCompat ratingCompat) {
            C3042oa<String, Integer> oaVar = MediaMetadataCompat.f151a;
            if (!oaVar.containsKey(str) || oaVar.get(str).intValue() == 3) {
                this.f187a.putParcelable(str, (Parcelable) ratingCompat.mo163c());
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Rating");
        }

        /* renamed from: e */
        public C0041c mo159e(String str, String str2) {
            C3042oa<String, Integer> oaVar = MediaMetadataCompat.f151a;
            if (!oaVar.containsKey(str) || oaVar.get(str).intValue() == 1) {
                this.f187a.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }

        /* renamed from: f */
        public C0041c mo160f(String str, CharSequence charSequence) {
            C3042oa<String, Integer> oaVar = MediaMetadataCompat.f151a;
            if (!oaVar.containsKey(str) || oaVar.get(str).intValue() == 1) {
                this.f187a.putCharSequence(str, charSequence);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a CharSequence");
        }

        /* renamed from: g */
        public final Bitmap mo161g(Bitmap bitmap, int i) {
            float f = (float) i;
            float min = Math.min(f / ((float) bitmap.getWidth()), f / ((float) bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), true);
        }
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.MediaMetadataCompat$d */
    public @interface C0042d {
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.MediaMetadataCompat$e */
    public @interface C0043e {
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.MediaMetadataCompat$f */
    public @interface C0044f {
    }

    static {
        C3042oa<String, Integer> oaVar = new C3042oa<>();
        f151a = oaVar;
        oaVar.put(f155c, 1);
        oaVar.put(f157d, 1);
        oaVar.put(f158e, 0);
        oaVar.put(f159f, 1);
        oaVar.put(f160g, 1);
        oaVar.put(f161h, 1);
        oaVar.put(f162i, 1);
        oaVar.put(f163j, 1);
        oaVar.put(f164k, 1);
        oaVar.put(f165l, 0);
        oaVar.put(f166m, 1);
        oaVar.put(f168n, 0);
        oaVar.put(f170o, 0);
        oaVar.put(f172p, 0);
        oaVar.put(f174q, 1);
        oaVar.put(f175r, 2);
        oaVar.put(f176s, 1);
        oaVar.put(f177t, 2);
        oaVar.put(f178u, 1);
        oaVar.put(f179v, 3);
        oaVar.put(f180w, 3);
        oaVar.put(f181x, 1);
        oaVar.put(f182y, 1);
        oaVar.put(f183z, 1);
        oaVar.put(f144A, 2);
        oaVar.put(f145B, 1);
        oaVar.put(f146C, 1);
        oaVar.put(f148E, 0);
        oaVar.put(f147D, 1);
        oaVar.put(f149F, 0);
        oaVar.put(f150G, 0);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f184a = bundle2;
        MediaSessionCompat.m458b(bundle2);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f184a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    /* renamed from: b */
    public static MediaMetadataCompat m144b(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        dg2.m13097g(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f186a = obj;
        return createFromParcel;
    }

    /* renamed from: a */
    public boolean mo138a(String str) {
        return this.f184a.containsKey(str);
    }

    /* renamed from: c */
    public Bitmap mo139c(String str) {
        try {
            return (Bitmap) this.f184a.getParcelable(str);
        } catch (Exception e) {
            Log.w(f153b, "Failed to retrieve a key as Bitmap.", e);
            return null;
        }
    }

    /* renamed from: d */
    public Bundle mo140d() {
        return new Bundle(this.f184a);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public MediaDescriptionCompat mo142e() {
        Uri uri;
        Bitmap bitmap;
        Uri uri2;
        MediaDescriptionCompat mediaDescriptionCompat = this.f185a;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String j = mo146j(f146C);
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence k = mo147k(f181x);
        if (TextUtils.isEmpty(k)) {
            int i = 0;
            int i2 = 0;
            while (i < 3) {
                String[] strArr = f152a;
                if (i2 >= strArr.length) {
                    break;
                }
                int i3 = i2 + 1;
                CharSequence k2 = mo147k(strArr[i2]);
                if (!TextUtils.isEmpty(k2)) {
                    charSequenceArr[i] = k2;
                    i++;
                }
                i2 = i3;
            }
        } else {
            charSequenceArr[0] = k;
            charSequenceArr[1] = mo147k(f182y);
            charSequenceArr[2] = mo147k(f183z);
        }
        int i4 = 0;
        while (true) {
            String[] strArr2 = f154b;
            uri = null;
            if (i4 >= strArr2.length) {
                bitmap = null;
                break;
            }
            bitmap = mo139c(strArr2[i4]);
            if (bitmap != null) {
                break;
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            String[] strArr3 = f156c;
            if (i5 >= strArr3.length) {
                uri2 = null;
                break;
            }
            String j2 = mo146j(strArr3[i5]);
            if (!TextUtils.isEmpty(j2)) {
                uri2 = Uri.parse(j2);
                break;
            }
            i5++;
        }
        String j3 = mo146j(f147D);
        if (!TextUtils.isEmpty(j3)) {
            uri = Uri.parse(j3);
        }
        MediaDescriptionCompat.C0038b bVar = new MediaDescriptionCompat.C0038b();
        bVar.mo134f(j);
        bVar.mo137i(charSequenceArr[0]);
        bVar.mo136h(charSequenceArr[1]);
        bVar.mo130b(charSequenceArr[2]);
        bVar.mo132d(bitmap);
        bVar.mo133e(uri2);
        bVar.mo135g(uri);
        Bundle bundle = new Bundle();
        if (this.f184a.containsKey(f148E)) {
            bundle.putLong(MediaDescriptionCompat.f115c, mo143f(f148E));
        }
        if (this.f184a.containsKey(f150G)) {
            bundle.putLong(MediaDescriptionCompat.f117d, mo143f(f150G));
        }
        if (!bundle.isEmpty()) {
            bVar.mo131c(bundle);
        }
        MediaDescriptionCompat a = bVar.mo129a();
        this.f185a = a;
        return a;
    }

    /* renamed from: f */
    public long mo143f(String str) {
        return this.f184a.getLong(str, 0);
    }

    /* renamed from: h */
    public Object mo144h() {
        if (this.f186a == null) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.f186a = dg2.m13091a(obtain);
            obtain.recycle();
        }
        return this.f186a;
    }

    /* renamed from: i */
    public RatingCompat mo145i(String str) {
        try {
            return RatingCompat.m165a(this.f184a.getParcelable(str));
        } catch (Exception e) {
            Log.w(f153b, "Failed to retrieve a key as Rating.", e);
            return null;
        }
    }

    /* renamed from: j */
    public String mo146j(String str) {
        CharSequence charSequence = this.f184a.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: k */
    public CharSequence mo147k(String str) {
        return this.f184a.getCharSequence(str);
    }

    /* renamed from: m */
    public Set<String> mo148m() {
        return this.f184a.keySet();
    }

    /* renamed from: n */
    public int mo149n() {
        return this.f184a.size();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f184a);
    }
}
