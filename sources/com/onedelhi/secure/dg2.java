package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.os.Parcel;
import java.util.Set;

@sj3(21)
public class dg2 {

    /* renamed from: com.onedelhi.secure.dg2$a */
    public static class C1971a {
        /* renamed from: a */
        public static Object m13098a(Object obj) {
            return ((MediaMetadata.Builder) obj).build();
        }

        /* renamed from: b */
        public static Object m13099b() {
            return new MediaMetadata.Builder();
        }

        /* renamed from: c */
        public static void m13100c(Object obj, String str, Bitmap bitmap) {
            ((MediaMetadata.Builder) obj).putBitmap(str, bitmap);
        }

        /* renamed from: d */
        public static void m13101d(Object obj, String str, long j) {
            ((MediaMetadata.Builder) obj).putLong(str, j);
        }

        /* renamed from: e */
        public static void m13102e(Object obj, String str, Object obj2) {
            ((MediaMetadata.Builder) obj).putRating(str, (Rating) obj2);
        }

        /* renamed from: f */
        public static void m13103f(Object obj, String str, String str2) {
            ((MediaMetadata.Builder) obj).putString(str, str2);
        }

        /* renamed from: g */
        public static void m13104g(Object obj, String str, CharSequence charSequence) {
            ((MediaMetadata.Builder) obj).putText(str, charSequence);
        }
    }

    /* renamed from: a */
    public static Object m13091a(Parcel parcel) {
        return MediaMetadata.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static Bitmap m13092b(Object obj, String str) {
        return ((MediaMetadata) obj).getBitmap(str);
    }

    /* renamed from: c */
    public static long m13093c(Object obj, String str) {
        return ((MediaMetadata) obj).getLong(str);
    }

    /* renamed from: d */
    public static Object m13094d(Object obj, String str) {
        return ((MediaMetadata) obj).getRating(str);
    }

    /* renamed from: e */
    public static CharSequence m13095e(Object obj, String str) {
        return ((MediaMetadata) obj).getText(str);
    }

    /* renamed from: f */
    public static Set<String> m13096f(Object obj) {
        return ((MediaMetadata) obj).keySet();
    }

    /* renamed from: g */
    public static void m13097g(Object obj, Parcel parcel, int i) {
        ((MediaMetadata) obj).writeToParcel(parcel, i);
    }
}
