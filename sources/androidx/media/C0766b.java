package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import androidx.media.C0761a;
import com.onedelhi.secure.sj3;

@sj3(23)
/* renamed from: androidx.media.b */
public class C0766b {

    /* renamed from: androidx.media.b$a */
    public static class C0767a extends C0761a.C0763b {
        public C0767a(Context context, C0768b bVar) {
            super(context, bVar);
        }

        public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
            ((C0768b) this.f4327a).mo5121h(str, new C0761a.C0764c(result));
        }
    }

    /* renamed from: androidx.media.b$b */
    public interface C0768b extends C0761a.C0765d {
        /* renamed from: h */
        void mo5121h(String str, C0761a.C0764c<Parcel> cVar);
    }

    /* renamed from: a */
    public static Object m5041a(Context context, C0768b bVar) {
        return new C0767a(context, bVar);
    }
}
