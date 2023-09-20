package android.support.p000v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.p000v4.media.C0048a;
import android.support.p000v4.media.session.MediaSessionCompat;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sj3;
import java.util.List;

@sj3(26)
/* renamed from: android.support.v4.media.c */
public class C0057c {

    /* renamed from: android.support.v4.media.c$a */
    public interface C0058a extends C0048a.C0052d {
        /* renamed from: c */
        void mo111c(@mr2 String str, List<?> list, @mr2 Bundle bundle);

        /* renamed from: d */
        void mo112d(@mr2 String str, @mr2 Bundle bundle);
    }

    /* renamed from: android.support.v4.media.c$b */
    public static class C0059b<T extends C0058a> extends C0048a.C0053e<T> {
        public C0059b(T t) {
            super(t);
        }

        public void onChildrenLoaded(@mr2 String str, List<MediaBrowser.MediaItem> list, @mr2 Bundle bundle) {
            MediaSessionCompat.m458b(bundle);
            ((C0058a) this.f202a).mo111c(str, list, bundle);
        }

        public void onError(@mr2 String str, @mr2 Bundle bundle) {
            MediaSessionCompat.m458b(bundle);
            ((C0058a) this.f202a).mo112d(str, bundle);
        }
    }

    /* renamed from: a */
    public static Object m203a(C0058a aVar) {
        return new C0059b(aVar);
    }

    /* renamed from: b */
    public static void m204b(Object obj, String str, Bundle bundle, Object obj2) {
        ((MediaBrowser) obj).subscribe(str, bundle, (MediaBrowser.SubscriptionCallback) obj2);
    }

    /* renamed from: c */
    public static void m205c(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).unsubscribe(str, (MediaBrowser.SubscriptionCallback) obj2);
    }
}
