package android.support.p000v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import com.onedelhi.secure.sj3;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@sj3(21)
/* renamed from: android.support.v4.media.session.f */
public class C0132f {

    /* renamed from: a */
    public static final String f567a = "MediaSessionCompatApi21";

    /* renamed from: android.support.v4.media.session.f$a */
    public interface C0133a {
        /* renamed from: c */
        void mo398c();

        /* renamed from: e */
        void mo399e();

        /* renamed from: f */
        void mo400f(String str, Bundle bundle);

        /* renamed from: g */
        void mo401g();

        /* renamed from: h */
        void mo402h();

        /* renamed from: i */
        void mo403i(String str, Bundle bundle);

        /* renamed from: j */
        boolean mo404j(Intent intent);

        /* renamed from: k */
        void mo405k(String str, Bundle bundle, ResultReceiver resultReceiver);

        /* renamed from: l */
        void mo406l();

        /* renamed from: m */
        void mo407m();

        /* renamed from: n */
        void mo408n(long j);

        /* renamed from: o */
        void mo409o(long j);

        /* renamed from: p */
        void mo410p(Object obj);

        /* renamed from: q */
        void mo411q(Object obj, Bundle bundle);

        /* renamed from: s */
        void mo412s(String str, Bundle bundle);

        /* renamed from: t */
        void mo413t();
    }

    /* renamed from: android.support.v4.media.session.f$b */
    public static class C0134b<T extends C0133a> extends MediaSession.Callback {

        /* renamed from: a */
        public final T f568a;

        public C0134b(T t) {
            this.f568a = t;
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaSessionCompat.m458b(bundle);
            this.f568a.mo405k(str, bundle, resultReceiver);
        }

        public void onCustomAction(String str, Bundle bundle) {
            MediaSessionCompat.m458b(bundle);
            this.f568a.mo400f(str, bundle);
        }

        public void onFastForward() {
            this.f568a.mo401g();
        }

        public boolean onMediaButtonEvent(Intent intent) {
            return this.f568a.mo404j(intent) || super.onMediaButtonEvent(intent);
        }

        public void onPause() {
            this.f568a.mo399e();
        }

        public void onPlay() {
            this.f568a.mo413t();
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.m458b(bundle);
            this.f568a.mo403i(str, bundle);
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.m458b(bundle);
            this.f568a.mo412s(str, bundle);
        }

        public void onRewind() {
            this.f568a.mo406l();
        }

        public void onSeekTo(long j) {
            this.f568a.mo408n(j);
        }

        public void onSetRating(Rating rating) {
            this.f568a.mo410p(rating);
        }

        public void onSkipToNext() {
            this.f568a.mo402h();
        }

        public void onSkipToPrevious() {
            this.f568a.mo407m();
        }

        public void onSkipToQueueItem(long j) {
            this.f568a.mo409o(j);
        }

        public void onStop() {
            this.f568a.mo398c();
        }
    }

    /* renamed from: android.support.v4.media.session.f$c */
    public static class C0135c {
        /* renamed from: a */
        public static Object m1021a(Object obj, long j) {
            return new MediaSession.QueueItem((MediaDescription) obj, j);
        }

        /* renamed from: b */
        public static Object m1022b(Object obj) {
            return ((MediaSession.QueueItem) obj).getDescription();
        }

        /* renamed from: c */
        public static long m1023c(Object obj) {
            return ((MediaSession.QueueItem) obj).getQueueId();
        }
    }

    /* renamed from: a */
    public static Object m984a(C0133a aVar) {
        return new C0134b(aVar);
    }

    /* renamed from: b */
    public static Object m985b(Context context, String str) {
        return new MediaSession(context, str);
    }

    /* renamed from: c */
    public static Parcelable m986c(Object obj) {
        return ((MediaSession) obj).getSessionToken();
    }

    /* renamed from: d */
    public static boolean m987d(Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField("mCallback");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                return declaredField.get(obj) != null;
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            Log.w(f567a, "Failed to get mCallback object.");
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m988e(Object obj) {
        return ((MediaSession) obj).isActive();
    }

    /* renamed from: f */
    public static void m989f(Object obj) {
        ((MediaSession) obj).release();
    }

    /* renamed from: g */
    public static void m990g(Object obj, String str, Bundle bundle) {
        ((MediaSession) obj).sendSessionEvent(str, bundle);
    }

    /* renamed from: h */
    public static void m991h(Object obj, boolean z) {
        ((MediaSession) obj).setActive(z);
    }

    /* renamed from: i */
    public static void m992i(Object obj, Object obj2, Handler handler) {
        ((MediaSession) obj).setCallback((MediaSession.Callback) obj2, handler);
    }

    /* renamed from: j */
    public static void m993j(Object obj, Bundle bundle) {
        ((MediaSession) obj).setExtras(bundle);
    }

    /* renamed from: k */
    public static void m994k(Object obj, int i) {
        ((MediaSession) obj).setFlags(i);
    }

    /* renamed from: l */
    public static void m995l(Object obj, PendingIntent pendingIntent) {
        ((MediaSession) obj).setMediaButtonReceiver(pendingIntent);
    }

    /* renamed from: m */
    public static void m996m(Object obj, Object obj2) {
        ((MediaSession) obj).setMetadata((MediaMetadata) obj2);
    }

    /* renamed from: n */
    public static void m997n(Object obj, Object obj2) {
        ((MediaSession) obj).setPlaybackState((PlaybackState) obj2);
    }

    /* renamed from: o */
    public static void m998o(Object obj, int i) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(i);
        ((MediaSession) obj).setPlaybackToLocal(builder.build());
    }

    /* renamed from: p */
    public static void m999p(Object obj, Object obj2) {
        ((MediaSession) obj).setPlaybackToRemote((VolumeProvider) obj2);
    }

    /* renamed from: q */
    public static void m1000q(Object obj, List<Object> list) {
        if (list == null) {
            ((MediaSession) obj).setQueue((List) null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((MediaSession.QueueItem) it.next());
        }
        ((MediaSession) obj).setQueue(arrayList);
    }

    /* renamed from: r */
    public static void m1001r(Object obj, CharSequence charSequence) {
        ((MediaSession) obj).setQueueTitle(charSequence);
    }

    /* renamed from: s */
    public static void m1002s(Object obj, PendingIntent pendingIntent) {
        ((MediaSession) obj).setSessionActivity(pendingIntent);
    }

    /* renamed from: t */
    public static Object m1003t(Object obj) {
        if (obj instanceof MediaSession) {
            return obj;
        }
        throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
    }

    /* renamed from: u */
    public static Object m1004u(Object obj) {
        if (obj instanceof MediaSession.Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
}
