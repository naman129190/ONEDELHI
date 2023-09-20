package android.support.p000v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import com.onedelhi.secure.sj3;
import java.util.ArrayList;
import java.util.List;

@sj3(21)
/* renamed from: android.support.v4.media.session.c */
public class C0123c {

    /* renamed from: android.support.v4.media.session.c$a */
    public interface C0124a {
        /* renamed from: G0 */
        void mo265G0(CharSequence charSequence);

        /* renamed from: L */
        void mo266L(Bundle bundle);

        /* renamed from: S */
        void mo267S(List<?> list);

        /* renamed from: a */
        void mo268a(String str, Bundle bundle);

        /* renamed from: b */
        void mo269b(int i, int i2, int i3, int i4, int i5);

        /* renamed from: c */
        void mo270c(Object obj);

        /* renamed from: d */
        void mo271d(Object obj);

        /* renamed from: v0 */
        void mo272v0();
    }

    /* renamed from: android.support.v4.media.session.c$b */
    public static class C0125b<T extends C0124a> extends MediaController.Callback {

        /* renamed from: a */
        public final T f563a;

        public C0125b(T t) {
            this.f563a = t;
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f563a.mo269b(playbackInfo.getPlaybackType(), C0126c.m961c(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m458b(bundle);
            this.f563a.mo266L(bundle);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f563a.mo270c(mediaMetadata);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f563a.mo271d(playbackState);
        }

        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f563a.mo267S(list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f563a.mo265G0(charSequence);
        }

        public void onSessionDestroyed() {
            this.f563a.mo272v0();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m458b(bundle);
            this.f563a.mo268a(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.c$c */
    public static class C0126c {

        /* renamed from: a */
        public static final int f564a = 4;

        /* renamed from: b */
        public static final int f565b = 6;

        /* renamed from: c */
        public static final int f566c = 7;

        /* renamed from: a */
        public static AudioAttributes m959a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m960b(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getCurrentVolume();
        }

        /* renamed from: c */
        public static int m961c(Object obj) {
            return m965g(m959a(obj));
        }

        /* renamed from: d */
        public static int m962d(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getMaxVolume();
        }

        /* renamed from: e */
        public static int m963e(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getPlaybackType();
        }

        /* renamed from: f */
        public static int m964f(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getVolumeControl();
        }

        /* renamed from: g */
        public static int m965g(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage == 13) {
                return 1;
            }
            switch (usage) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
    }

    /* renamed from: android.support.v4.media.session.c$d */
    public static class C0127d {
        /* renamed from: a */
        public static void m966a(Object obj) {
            ((MediaController.TransportControls) obj).fastForward();
        }

        /* renamed from: b */
        public static void m967b(Object obj) {
            ((MediaController.TransportControls) obj).pause();
        }

        /* renamed from: c */
        public static void m968c(Object obj) {
            ((MediaController.TransportControls) obj).play();
        }

        /* renamed from: d */
        public static void m969d(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).playFromMediaId(str, bundle);
        }

        /* renamed from: e */
        public static void m970e(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).playFromSearch(str, bundle);
        }

        /* renamed from: f */
        public static void m971f(Object obj) {
            ((MediaController.TransportControls) obj).rewind();
        }

        /* renamed from: g */
        public static void m972g(Object obj, long j) {
            ((MediaController.TransportControls) obj).seekTo(j);
        }

        /* renamed from: h */
        public static void m973h(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).sendCustomAction(str, bundle);
        }

        /* renamed from: i */
        public static void m974i(Object obj, Object obj2) {
            ((MediaController.TransportControls) obj).setRating((Rating) obj2);
        }

        /* renamed from: j */
        public static void m975j(Object obj) {
            ((MediaController.TransportControls) obj).skipToNext();
        }

        /* renamed from: k */
        public static void m976k(Object obj) {
            ((MediaController.TransportControls) obj).skipToPrevious();
        }

        /* renamed from: l */
        public static void m977l(Object obj, long j) {
            ((MediaController.TransportControls) obj).skipToQueueItem(j);
        }

        /* renamed from: m */
        public static void m978m(Object obj) {
            ((MediaController.TransportControls) obj).stop();
        }
    }

    /* renamed from: a */
    public static void m929a(Object obj, int i, int i2) {
        ((MediaController) obj).adjustVolume(i, i2);
    }

    /* renamed from: b */
    public static Object m930b(C0124a aVar) {
        return new C0125b(aVar);
    }

    /* renamed from: c */
    public static boolean m931c(Object obj, KeyEvent keyEvent) {
        return ((MediaController) obj).dispatchMediaButtonEvent(keyEvent);
    }

    /* renamed from: d */
    public static Object m932d(Context context, Object obj) {
        return new MediaController(context, (MediaSession.Token) obj);
    }

    /* renamed from: e */
    public static Bundle m933e(Object obj) {
        return ((MediaController) obj).getExtras();
    }

    /* renamed from: f */
    public static long m934f(Object obj) {
        return ((MediaController) obj).getFlags();
    }

    /* renamed from: g */
    public static Object m935g(Activity activity) {
        return activity.getMediaController();
    }

    /* renamed from: h */
    public static Object m936h(Object obj) {
        return ((MediaController) obj).getMetadata();
    }

    /* renamed from: i */
    public static String m937i(Object obj) {
        return ((MediaController) obj).getPackageName();
    }

    /* renamed from: j */
    public static Object m938j(Object obj) {
        return ((MediaController) obj).getPlaybackInfo();
    }

    /* renamed from: k */
    public static Object m939k(Object obj) {
        return ((MediaController) obj).getPlaybackState();
    }

    /* renamed from: l */
    public static List<Object> m940l(Object obj) {
        List<MediaSession.QueueItem> queue = ((MediaController) obj).getQueue();
        if (queue == null) {
            return null;
        }
        return new ArrayList(queue);
    }

    /* renamed from: m */
    public static CharSequence m941m(Object obj) {
        return ((MediaController) obj).getQueueTitle();
    }

    /* renamed from: n */
    public static int m942n(Object obj) {
        return ((MediaController) obj).getRatingType();
    }

    /* renamed from: o */
    public static PendingIntent m943o(Object obj) {
        return ((MediaController) obj).getSessionActivity();
    }

    /* renamed from: p */
    public static Object m944p(Object obj) {
        return ((MediaController) obj).getSessionToken();
    }

    /* renamed from: q */
    public static Object m945q(Object obj) {
        return ((MediaController) obj).getTransportControls();
    }

    /* renamed from: r */
    public static void m946r(Object obj, Object obj2, Handler handler) {
        ((MediaController) obj).registerCallback((MediaController.Callback) obj2, handler);
    }

    /* renamed from: s */
    public static void m947s(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
        ((MediaController) obj).sendCommand(str, bundle, resultReceiver);
    }

    /* renamed from: t */
    public static void m948t(Activity activity, Object obj) {
        activity.setMediaController((MediaController) obj);
    }

    /* renamed from: u */
    public static void m949u(Object obj, int i, int i2) {
        ((MediaController) obj).setVolumeTo(i, i2);
    }

    /* renamed from: v */
    public static void m950v(Object obj, Object obj2) {
        ((MediaController) obj).unregisterCallback((MediaController.Callback) obj2);
    }
}
