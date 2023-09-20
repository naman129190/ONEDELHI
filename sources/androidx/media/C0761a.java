package androidx.media;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.p000v4.media.session.MediaSessionCompat;
import com.onedelhi.secure.sj3;
import java.util.ArrayList;
import java.util.List;

@sj3(21)
/* renamed from: androidx.media.a */
public class C0761a {

    /* renamed from: androidx.media.a$a */
    public static class C0762a {

        /* renamed from: a */
        public final Bundle f4325a;

        /* renamed from: a */
        public final String f4326a;

        public C0762a(String str, Bundle bundle) {
            this.f4326a = str;
            this.f4325a = bundle;
        }
    }

    /* renamed from: androidx.media.a$b */
    public static class C0763b extends MediaBrowserService {

        /* renamed from: a */
        public final C0765d f4327a;

        public C0763b(Context context, C0765d dVar) {
            attachBaseContext(context);
            this.f4327a = dVar;
        }

        public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
            MediaSessionCompat.m458b(bundle);
            C0762a f = this.f4327a.mo5110f(str, i, bundle == null ? null : new Bundle(bundle));
            if (f == null) {
                return null;
            }
            return new MediaBrowserService.BrowserRoot(f.f4326a, f.f4325a);
        }

        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
            this.f4327a.mo5111i(str, new C0764c(result));
        }
    }

    /* renamed from: androidx.media.a$c */
    public static class C0764c<T> {

        /* renamed from: a */
        public MediaBrowserService.Result f4328a;

        public C0764c(MediaBrowserService.Result result) {
            this.f4328a = result;
        }

        /* renamed from: a */
        public void mo5164a() {
            this.f4328a.detach();
        }

        /* renamed from: b */
        public List<MediaBrowser.MediaItem> mo5165b(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel next : list) {
                next.setDataPosition(0);
                arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(next));
                next.recycle();
            }
            return arrayList;
        }

        /* renamed from: c */
        public void mo5166c(T t) {
            if (t instanceof List) {
                this.f4328a.sendResult(mo5165b((List) t));
            } else if (t instanceof Parcel) {
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                this.f4328a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            } else {
                this.f4328a.sendResult((Object) null);
            }
        }
    }

    /* renamed from: androidx.media.a$d */
    public interface C0765d {
        /* renamed from: f */
        C0762a mo5110f(String str, int i, Bundle bundle);

        /* renamed from: i */
        void mo5111i(String str, C0764c<List<Parcel>> cVar);
    }

    /* renamed from: a */
    public static Object m5031a(Context context, C0765d dVar) {
        return new C0763b(context, dVar);
    }

    /* renamed from: b */
    public static void m5032b(Object obj, String str) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str);
    }

    /* renamed from: c */
    public static IBinder m5033c(Object obj, Intent intent) {
        return ((MediaBrowserService) obj).onBind(intent);
    }

    /* renamed from: d */
    public static void m5034d(Object obj) {
        ((MediaBrowserService) obj).onCreate();
    }

    /* renamed from: e */
    public static void m5035e(Object obj, Object obj2) {
        ((MediaBrowserService) obj).setSessionToken((MediaSession.Token) obj2);
    }
}
