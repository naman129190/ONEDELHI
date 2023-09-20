package android.support.p000v4.media.session;

import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.support.p000v4.media.session.C0136g;
import android.util.Log;
import com.onedelhi.secure.sj3;
import java.lang.reflect.InvocationTargetException;

@sj3(24)
/* renamed from: android.support.v4.media.session.h */
public class C0139h {

    /* renamed from: a */
    public static final String f569a = "MediaSessionCompatApi24";

    /* renamed from: android.support.v4.media.session.h$a */
    public interface C0140a extends C0136g.C0137a {
        /* renamed from: a */
        void mo415a();

        /* renamed from: d */
        void mo416d(String str, Bundle bundle);

        /* renamed from: r */
        void mo417r(Uri uri, Bundle bundle);

        /* renamed from: u */
        void mo418u(String str, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.session.h$b */
    public static class C0141b<T extends C0140a> extends C0136g.C0138b<T> {
        public C0141b(T t) {
            super(t);
        }

        public void onPrepare() {
            ((C0140a) this.f568a).mo415a();
        }

        public void onPrepareFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.m458b(bundle);
            ((C0140a) this.f568a).mo418u(str, bundle);
        }

        public void onPrepareFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.m458b(bundle);
            ((C0140a) this.f568a).mo416d(str, bundle);
        }

        public void onPrepareFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.m458b(bundle);
            ((C0140a) this.f568a).mo417r(uri, bundle);
        }
    }

    /* renamed from: a */
    public static Object m1026a(C0140a aVar) {
        return new C0141b(aVar);
    }

    /* renamed from: b */
    public static String m1027b(Object obj) {
        MediaSession mediaSession = (MediaSession) obj;
        try {
            return (String) mediaSession.getClass().getMethod("getCallingPackage", new Class[0]).invoke(mediaSession, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            Log.e(f569a, "Cannot execute MediaSession.getCallingPackage()", e);
            return null;
        }
    }
}
