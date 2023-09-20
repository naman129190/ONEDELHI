package android.support.p000v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.onedelhi.secure.hl3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0045a();

    /* renamed from: b */
    public static final float f188b = -1.0f;

    /* renamed from: b */
    public static final String f189b = "Rating";

    /* renamed from: o */
    public static final int f190o = 0;

    /* renamed from: p */
    public static final int f191p = 1;

    /* renamed from: q */
    public static final int f192q = 2;

    /* renamed from: r */
    public static final int f193r = 3;

    /* renamed from: s */
    public static final int f194s = 4;

    /* renamed from: t */
    public static final int f195t = 5;

    /* renamed from: u */
    public static final int f196u = 6;

    /* renamed from: a */
    public final float f197a;

    /* renamed from: a */
    public Object f198a;

    /* renamed from: n */
    public final int f199n;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    public static class C0045a implements Parcelable.Creator<RatingCompat> {
        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.RatingCompat$b */
    public @interface C0046b {
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.RatingCompat$c */
    public @interface C0047c {
    }

    public RatingCompat(int i, float f) {
        this.f199n = i;
        this.f197a = f;
    }

    /* renamed from: a */
    public static RatingCompat m165a(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = m166j(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompat = m169n(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = m168m(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompat = m167k(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = m170o(ratingStyle);
            }
            ratingCompat.f198a = obj;
        }
        return ratingCompat;
    }

    /* renamed from: j */
    public static RatingCompat m166j(boolean z) {
        return new RatingCompat(1, z ? 1.0f : 0.0f);
    }

    /* renamed from: k */
    public static RatingCompat m167k(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new RatingCompat(6, f);
        }
        Log.e(f189b, "Invalid percentage-based rating value");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p000v4.media.RatingCompat m168m(int r4, float r5) {
        /*
            r0 = 3
            r1 = 0
            java.lang.String r2 = "Rating"
            if (r4 == r0) goto L_0x002c
            r0 = 4
            if (r4 == r0) goto L_0x0029
            r0 = 5
            if (r4 == r0) goto L_0x0026
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Invalid rating style ("
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = ") for a star rating"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
        L_0x0022:
            android.util.Log.e(r2, r4)
            return r1
        L_0x0026:
            r0 = 1084227584(0x40a00000, float:5.0)
            goto L_0x002e
        L_0x0029:
            r0 = 1082130432(0x40800000, float:4.0)
            goto L_0x002e
        L_0x002c:
            r0 = 1077936128(0x40400000, float:3.0)
        L_0x002e:
            r3 = 0
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x003e
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
            goto L_0x003e
        L_0x0038:
            android.support.v4.media.RatingCompat r0 = new android.support.v4.media.RatingCompat
            r0.<init>(r4, r5)
            return r0
        L_0x003e:
            java.lang.String r4 = "Trying to set out of range star-based rating"
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.media.RatingCompat.m168m(int, float):android.support.v4.media.RatingCompat");
    }

    /* renamed from: n */
    public static RatingCompat m169n(boolean z) {
        return new RatingCompat(2, z ? 1.0f : 0.0f);
    }

    /* renamed from: o */
    public static RatingCompat m170o(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    /* renamed from: b */
    public float mo162b() {
        if (this.f199n != 6 || !mo168h()) {
            return -1.0f;
        }
        return this.f197a;
    }

    /* renamed from: c */
    public Object mo163c() {
        Rating rating;
        if (this.f198a == null) {
            if (mo168h()) {
                int i = this.f199n;
                switch (i) {
                    case 1:
                        rating = Rating.newHeartRating(mo167f());
                        break;
                    case 2:
                        rating = Rating.newThumbRating(mo169i());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        rating = Rating.newStarRating(i, mo166e());
                        break;
                    case 6:
                        rating = Rating.newPercentageRating(mo162b());
                        break;
                    default:
                        return null;
                }
            } else {
                rating = Rating.newUnratedRating(this.f199n);
            }
            this.f198a = rating;
        }
        return this.f198a;
    }

    /* renamed from: d */
    public int mo164d() {
        return this.f199n;
    }

    public int describeContents() {
        return this.f199n;
    }

    /* renamed from: e */
    public float mo166e() {
        int i = this.f199n;
        if ((i == 3 || i == 4 || i == 5) && mo168h()) {
            return this.f197a;
        }
        return -1.0f;
    }

    /* renamed from: f */
    public boolean mo167f() {
        return this.f199n == 1 && this.f197a == 1.0f;
    }

    /* renamed from: h */
    public boolean mo168h() {
        return this.f197a >= 0.0f;
    }

    /* renamed from: i */
    public boolean mo169i() {
        return this.f199n == 2 && this.f197a == 1.0f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f199n);
        sb.append(" rating=");
        float f = this.f197a;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f199n);
        parcel.writeFloat(this.f197a);
    }
}
