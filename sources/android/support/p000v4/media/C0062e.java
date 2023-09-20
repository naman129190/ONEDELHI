package android.support.p000v4.media;

import android.media.MediaDescription;
import android.net.Uri;
import com.onedelhi.secure.sj3;

@sj3(23)
/* renamed from: android.support.v4.media.e */
public class C0062e {

    /* renamed from: android.support.v4.media.e$a */
    public static class C0063a {
        /* renamed from: a */
        public static void m227a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: a */
    public static Uri m226a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
