package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.p000v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.media.C0766b;
import com.onedelhi.secure.sj3;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@sj3(26)
/* renamed from: androidx.media.c */
public class C0769c {

    /* renamed from: a */
    public static final String f4329a = "MBSCompatApi26";

    /* renamed from: a */
    public static Field f4330a;

    /* renamed from: androidx.media.c$a */
    public static class C0770a extends C0766b.C0767a {
        public C0770a(Context context, C0772c cVar) {
            super(context, cVar);
        }

        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
            MediaSessionCompat.m458b(bundle);
            ((C0772c) this.f4327a).mo5123d(str, new C0771b(result), bundle);
        }
    }

    /* renamed from: androidx.media.c$b */
    public static class C0771b {

        /* renamed from: a */
        public MediaBrowserService.Result f4331a;

        public C0771b(MediaBrowserService.Result result) {
            this.f4331a = result;
        }

        /* renamed from: a */
        public void mo5169a() {
            this.f4331a.detach();
        }

        /* renamed from: b */
        public List<MediaBrowser.MediaItem> mo5170b(List<Parcel> list) {
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
        public void mo5171c(List<Parcel> list, int i) {
            try {
                C0769c.f4330a.setInt(this.f4331a, i);
            } catch (IllegalAccessException e) {
                Log.w(C0769c.f4329a, e);
            }
            this.f4331a.sendResult(mo5170b(list));
        }
    }

    /* renamed from: androidx.media.c$c */
    public interface C0772c extends C0766b.C0768b {
        /* renamed from: d */
        void mo5123d(String str, C0771b bVar, Bundle bundle);
    }

    static {
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            f4330a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            Log.w(f4329a, e);
        }
    }

    /* renamed from: a */
    public static Object m5043a(Context context, C0772c cVar) {
        return new C0770a(context, cVar);
    }

    /* renamed from: b */
    public static Bundle m5044b(Object obj) {
        return ((MediaBrowserService) obj).getBrowserRootHints();
    }

    /* renamed from: c */
    public static void m5045c(Object obj, String str, Bundle bundle) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str, bundle);
    }
}
