package android.support.p000v4.media;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sj3;

@sj3(23)
/* renamed from: android.support.v4.media.b */
public class C0054b {

    /* renamed from: android.support.v4.media.b$a */
    public interface C0055a {
        /* renamed from: a */
        void mo46a(@mr2 String str);

        /* renamed from: b */
        void mo47b(Parcel parcel);
    }

    /* renamed from: android.support.v4.media.b$b */
    public static class C0056b<T extends C0055a> extends MediaBrowser.ItemCallback {

        /* renamed from: a */
        public final T f203a;

        public C0056b(T t) {
            this.f203a = t;
        }

        public void onError(@mr2 String str) {
            this.f203a.mo46a(str);
        }

        public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
            T t;
            Parcel parcel;
            if (mediaItem == null) {
                t = this.f203a;
                parcel = null;
            } else {
                parcel = Parcel.obtain();
                mediaItem.writeToParcel(parcel, 0);
                t = this.f203a;
            }
            t.mo47b(parcel);
        }
    }

    /* renamed from: a */
    public static Object m199a(C0055a aVar) {
        return new C0056b(aVar);
    }

    /* renamed from: b */
    public static void m200b(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).getItem(str, (MediaBrowser.ItemCallback) obj2);
    }
}
