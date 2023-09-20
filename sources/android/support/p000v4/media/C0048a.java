package android.support.p000v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sj3;
import java.util.List;

@sj3(21)
/* renamed from: android.support.v4.media.a */
public class C0048a {

    /* renamed from: a */
    public static final String f200a = "android.support.v4.media.MediaBrowserCompat.NULL_MEDIA_ITEM";

    /* renamed from: android.support.v4.media.a$a */
    public interface C0049a {
        /* renamed from: a */
        void mo38a();

        /* renamed from: b */
        void mo39b();

        /* renamed from: d */
        void mo40d();
    }

    /* renamed from: android.support.v4.media.a$b */
    public static class C0050b<T extends C0049a> extends MediaBrowser.ConnectionCallback {

        /* renamed from: a */
        public final T f201a;

        public C0050b(T t) {
            this.f201a = t;
        }

        public void onConnected() {
            this.f201a.mo39b();
        }

        public void onConnectionFailed() {
            this.f201a.mo40d();
        }

        public void onConnectionSuspended() {
            this.f201a.mo38a();
        }
    }

    /* renamed from: android.support.v4.media.a$c */
    public static class C0051c {
        /* renamed from: a */
        public static Object m195a(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getDescription();
        }

        /* renamed from: b */
        public static int m196b(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getFlags();
        }
    }

    /* renamed from: android.support.v4.media.a$d */
    public interface C0052d {
        /* renamed from: a */
        void mo108a(@mr2 String str);

        /* renamed from: b */
        void mo109b(@mr2 String str, List<?> list);
    }

    /* renamed from: android.support.v4.media.a$e */
    public static class C0053e<T extends C0052d> extends MediaBrowser.SubscriptionCallback {

        /* renamed from: a */
        public final T f202a;

        public C0053e(T t) {
            this.f202a = t;
        }

        public void onChildrenLoaded(@mr2 String str, List<MediaBrowser.MediaItem> list) {
            this.f202a.mo109b(str, list);
        }

        public void onError(@mr2 String str) {
            this.f202a.mo108a(str);
        }
    }

    /* renamed from: a */
    public static void m180a(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    /* renamed from: b */
    public static Object m181b(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) obj, bundle);
    }

    /* renamed from: c */
    public static Object m182c(C0049a aVar) {
        return new C0050b(aVar);
    }

    /* renamed from: d */
    public static Object m183d(C0052d dVar) {
        return new C0053e(dVar);
    }

    /* renamed from: e */
    public static void m184e(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    /* renamed from: f */
    public static Bundle m185f(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    /* renamed from: g */
    public static String m186g(Object obj) {
        return ((MediaBrowser) obj).getRoot();
    }

    /* renamed from: h */
    public static ComponentName m187h(Object obj) {
        return ((MediaBrowser) obj).getServiceComponent();
    }

    /* renamed from: i */
    public static Object m188i(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }

    /* renamed from: j */
    public static boolean m189j(Object obj) {
        return ((MediaBrowser) obj).isConnected();
    }

    /* renamed from: k */
    public static void m190k(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).subscribe(str, (MediaBrowser.SubscriptionCallback) obj2);
    }

    /* renamed from: l */
    public static void m191l(Object obj, String str) {
        ((MediaBrowser) obj).unsubscribe(str);
    }
}
