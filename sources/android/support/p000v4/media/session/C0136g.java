package android.support.p000v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.p000v4.media.session.C0132f;
import com.onedelhi.secure.sj3;

@sj3(23)
/* renamed from: android.support.v4.media.session.g */
public class C0136g {

    /* renamed from: android.support.v4.media.session.g$a */
    public interface C0137a extends C0132f.C0133a {
        /* renamed from: b */
        void mo414b(Uri uri, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.session.g$b */
    public static class C0138b<T extends C0137a> extends C0132f.C0134b<T> {
        public C0138b(T t) {
            super(t);
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.m458b(bundle);
            ((C0137a) this.f568a).mo414b(uri, bundle);
        }
    }

    /* renamed from: a */
    public static Object m1024a(C0137a aVar) {
        return new C0138b(aVar);
    }
}
