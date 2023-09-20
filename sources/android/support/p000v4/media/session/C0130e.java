package android.support.p000v4.media.session;

import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import com.onedelhi.secure.sj3;

@sj3(24)
/* renamed from: android.support.v4.media.session.e */
public class C0130e {

    /* renamed from: android.support.v4.media.session.e$a */
    public static class C0131a {
        /* renamed from: a */
        public static void m980a(Object obj) {
            ((MediaController.TransportControls) obj).prepare();
        }

        /* renamed from: b */
        public static void m981b(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).prepareFromMediaId(str, bundle);
        }

        /* renamed from: c */
        public static void m982c(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).prepareFromSearch(str, bundle);
        }

        /* renamed from: d */
        public static void m983d(Object obj, Uri uri, Bundle bundle) {
            ((MediaController.TransportControls) obj).prepareFromUri(uri, bundle);
        }
    }
}
