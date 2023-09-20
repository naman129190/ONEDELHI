package android.support.p000v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p000v4.media.MediaDescriptionCompat;
import android.support.p000v4.media.MediaMetadataCompat;
import android.support.p000v4.media.RatingCompat;
import android.support.p000v4.media.session.C0117a;
import android.support.p000v4.media.session.C0120b;
import android.support.p000v4.media.session.C0123c;
import android.support.p000v4.media.session.C0128d;
import android.support.p000v4.media.session.C0130e;
import android.support.p000v4.media.session.MediaSessionCompat;
import android.support.p000v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import androidx.core.app.ComponentActivity;
import com.onedelhi.secure.C2267gq;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mj1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
public final class MediaControllerCompat {

    /* renamed from: a */
    public static final String f204a = "MediaControllerCompat";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: b */
    public static final String f205b = "android.support.v4.media.session.command.GET_EXTRA_BINDER";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: c */
    public static final String f206c = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: d */
    public static final String f207d = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: e */
    public static final String f208e = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: f */
    public static final String f209f = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: g */
    public static final String f210g = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: h */
    public static final String f211h = "android.support.v4.media.session.command.ARGUMENT_INDEX";

    /* renamed from: a */
    public final C0070c f212a;

    /* renamed from: a */
    public final MediaSessionCompat.Token f213a;

    /* renamed from: a */
    public final HashSet<C0065a> f214a = new HashSet<>();

    @sj3(21)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    public static class MediaControllerImplApi21 implements C0070c {

        /* renamed from: a */
        public final MediaSessionCompat.Token f215a;

        /* renamed from: a */
        public final Object f216a;

        /* renamed from: a */
        public HashMap<C0065a, C0064a> f217a = new HashMap<>();
        @mj1("mLock")

        /* renamed from: a */
        public final List<C0065a> f218a = new ArrayList();

        /* renamed from: b */
        public final Object f219b = new Object();

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a */
            public WeakReference<MediaControllerImplApi21> f220a;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super((Handler) null);
                this.f220a = new WeakReference<>(mediaControllerImplApi21);
            }

            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f220a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f219b) {
                        mediaControllerImplApi21.f215a.mo358h(C0120b.C0121a.m880j8(C2267gq.m16043a(bundle, MediaSessionCompat.f291z)));
                        mediaControllerImplApi21.f215a.mo360i(bundle.getBundle(MediaSessionCompat.f253A));
                        mediaControllerImplApi21.mo238m();
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        public static class C0064a extends C0065a.C0068c {
            public C0064a(C0065a aVar) {
                super(aVar);
            }

            /* renamed from: G0 */
            public void mo242G0(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: L */
            public void mo243L(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: S */
            public void mo244S(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: U7 */
            public void mo245U7(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: n2 */
            public void mo246n2(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: v0 */
            public void mo247v0() throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) throws RemoteException {
            this.f215a = token;
            Object d = C0123c.m932d(context, token.mo357f());
            this.f216a = d;
            if (d == null) {
                throw new RemoteException();
            } else if (token.mo353d() == null) {
                mo239n();
            }
        }

        /* renamed from: F0 */
        public long mo214F0() {
            return C0123c.m934f(this.f216a);
        }

        /* renamed from: H0 */
        public void mo215H0(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((mo214F0() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.f210g, mediaDescriptionCompat);
                mo229f(MediaControllerCompat.f206c, bundle, (ResultReceiver) null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        /* renamed from: J */
        public String mo216J() {
            return C0123c.m937i(this.f216a);
        }

        /* renamed from: K */
        public PlaybackStateCompat mo217K() {
            if (this.f215a.mo353d() != null) {
                try {
                    return this.f215a.mo353d().mo458K();
                } catch (RemoteException e) {
                    Log.e(MediaControllerCompat.f204a, "Dead object in getPlaybackState.", e);
                }
            }
            Object k = C0123c.m939k(this.f216a);
            if (k != null) {
                return PlaybackStateCompat.m767a(k);
            }
            return null;
        }

        /* renamed from: O0 */
        public MediaMetadataCompat mo218O0() {
            Object h = C0123c.m936h(this.f216a);
            if (h != null) {
                return MediaMetadataCompat.m144b(h);
            }
            return null;
        }

        /* renamed from: P0 */
        public boolean mo219P0() {
            if (this.f215a.mo353d() == null) {
                return false;
            }
            try {
                return this.f215a.mo353d().mo462P0();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in isCaptioningEnabled.", e);
                return false;
            }
        }

        /* renamed from: R */
        public int mo220R() {
            if (this.f215a.mo353d() == null) {
                return -1;
            }
            try {
                return this.f215a.mo353d().mo465R();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in getRepeatMode.", e);
                return -1;
            }
        }

        /* renamed from: T */
        public CharSequence mo221T() {
            return C0123c.m941m(this.f216a);
        }

        /* renamed from: U */
        public void mo222U(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((mo214F0() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.f210g, mediaDescriptionCompat);
                mo229f(MediaControllerCompat.f208e, bundle, (ResultReceiver) null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        /* renamed from: a */
        public final void mo223a(C0065a aVar, Handler handler) {
            C0123c.m946r(this.f216a, aVar.f223a, handler);
            synchronized (this.f219b) {
                if (this.f215a.mo353d() != null) {
                    C0064a aVar2 = new C0064a(aVar);
                    this.f217a.put(aVar, aVar2);
                    aVar.f222a = aVar2;
                    try {
                        this.f215a.mo353d().mo473b5(aVar2);
                        aVar.mo262n(13, (Object) null, (Bundle) null);
                    } catch (RemoteException e) {
                        Log.e(MediaControllerCompat.f204a, "Dead object in registerCallback.", e);
                    }
                } else {
                    aVar.f222a = null;
                    this.f218a.add(aVar);
                }
            }
        }

        /* renamed from: a0 */
        public int mo224a0() {
            if (Build.VERSION.SDK_INT < 22 && this.f215a.mo353d() != null) {
                try {
                    return this.f215a.mo353d().mo471a0();
                } catch (RemoteException e) {
                    Log.e(MediaControllerCompat.f204a, "Dead object in getRatingType.", e);
                }
            }
            return C0123c.m942n(this.f216a);
        }

        /* renamed from: b */
        public void mo225b(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if ((mo214F0() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.f210g, mediaDescriptionCompat);
                bundle.putInt(MediaControllerCompat.f211h, i);
                mo229f(MediaControllerCompat.f207d, bundle, (ResultReceiver) null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        /* renamed from: c */
        public C0074g mo226c() {
            Object j = C0123c.m938j(this.f216a);
            if (j != null) {
                return new C0074g(C0123c.C0126c.m963e(j), C0123c.C0126c.m961c(j), C0123c.C0126c.m964f(j), C0123c.C0126c.m962d(j), C0123c.C0126c.m960b(j));
            }
            return null;
        }

        /* renamed from: d */
        public final void mo227d(C0065a aVar) {
            C0123c.m950v(this.f216a, aVar.f223a);
            synchronized (this.f219b) {
                if (this.f215a.mo353d() != null) {
                    try {
                        C0064a remove = this.f217a.remove(aVar);
                        if (remove != null) {
                            aVar.f222a = null;
                            this.f215a.mo353d().mo480j6(remove);
                        }
                    } catch (RemoteException e) {
                        Log.e(MediaControllerCompat.f204a, "Dead object in unregisterCallback.", e);
                    }
                } else {
                    this.f218a.remove(aVar);
                }
            }
        }

        /* renamed from: e */
        public void mo228e(int i, int i2) {
            C0123c.m929a(this.f216a, i, i2);
        }

        /* renamed from: f */
        public void mo229f(String str, Bundle bundle, ResultReceiver resultReceiver) {
            C0123c.m947s(this.f216a, str, bundle, resultReceiver);
        }

        /* renamed from: g */
        public void mo230g(int i, int i2) {
            C0123c.m949u(this.f216a, i, i2);
        }

        public Bundle getExtras() {
            return C0123c.m933e(this.f216a);
        }

        /* renamed from: h */
        public boolean mo232h() {
            return this.f215a.mo353d() != null;
        }

        /* renamed from: i */
        public boolean mo233i(KeyEvent keyEvent) {
            return C0123c.m931c(this.f216a, keyEvent);
        }

        /* renamed from: j */
        public Object mo234j() {
            return this.f216a;
        }

        /* renamed from: k */
        public PendingIntent mo235k() {
            return C0123c.m943o(this.f216a);
        }

        /* renamed from: l */
        public C0075h mo236l() {
            Object q = C0123c.m945q(this.f216a);
            if (q != null) {
                return new C0076i(q);
            }
            return null;
        }

        /* renamed from: l0 */
        public int mo237l0() {
            if (this.f215a.mo353d() == null) {
                return -1;
            }
            try {
                return this.f215a.mo353d().mo482l0();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in getShuffleMode.", e);
                return -1;
            }
        }

        @mj1("mLock")
        /* renamed from: m */
        public void mo238m() {
            if (this.f215a.mo353d() != null) {
                for (C0065a next : this.f218a) {
                    C0064a aVar = new C0064a(next);
                    this.f217a.put(next, aVar);
                    next.f222a = aVar;
                    try {
                        this.f215a.mo353d().mo473b5(aVar);
                        next.mo262n(13, (Object) null, (Bundle) null);
                    } catch (RemoteException e) {
                        Log.e(MediaControllerCompat.f204a, "Dead object in registerCallback.", e);
                    }
                }
                this.f218a.clear();
            }
        }

        /* renamed from: n */
        public final void mo239n() {
            mo229f(MediaControllerCompat.f205b, (Bundle) null, new ExtraBinderRequestResultReceiver(this));
        }

        /* renamed from: t0 */
        public List<MediaSessionCompat.QueueItem> mo240t0() {
            List<Object> l = C0123c.m940l(this.f216a);
            if (l != null) {
                return MediaSessionCompat.QueueItem.m490b(l);
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class C0065a implements IBinder.DeathRecipient {

        /* renamed from: a */
        public C0066a f221a;

        /* renamed from: a */
        public C0117a f222a;

        /* renamed from: a */
        public final Object f223a = C0123c.m930b(new C0067b(this));

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        public class C0066a extends Handler {

            /* renamed from: a */
            public static final int f224a = 1;

            /* renamed from: b */
            public static final int f225b = 2;

            /* renamed from: c */
            public static final int f226c = 3;

            /* renamed from: d */
            public static final int f227d = 4;

            /* renamed from: e */
            public static final int f228e = 5;

            /* renamed from: f */
            public static final int f229f = 6;

            /* renamed from: g */
            public static final int f230g = 7;

            /* renamed from: h */
            public static final int f231h = 8;

            /* renamed from: i */
            public static final int f232i = 9;

            /* renamed from: j */
            public static final int f233j = 11;

            /* renamed from: k */
            public static final int f234k = 12;

            /* renamed from: l */
            public static final int f235l = 13;

            /* renamed from: a */
            public boolean f237a = false;

            public C0066a(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                if (this.f237a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.m458b(data);
                            C0065a.this.mo259k((String) message.obj, data);
                            return;
                        case 2:
                            C0065a.this.mo254f((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            C0065a.this.mo253e((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            C0065a.this.mo249b((C0074g) message.obj);
                            return;
                        case 5:
                            C0065a.this.mo255g((List) message.obj);
                            return;
                        case 6:
                            C0065a.this.mo256h((CharSequence) message.obj);
                            return;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.m458b(bundle);
                            C0065a.this.mo252d(bundle);
                            return;
                        case 8:
                            C0065a.this.mo258j();
                            return;
                        case 9:
                            C0065a.this.mo257i(((Integer) message.obj).intValue());
                            return;
                        case 11:
                            C0065a.this.mo251c(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            C0065a.this.mo261m(((Integer) message.obj).intValue());
                            return;
                        case 13:
                            C0065a.this.mo260l();
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        public static class C0067b implements C0123c.C0124a {

            /* renamed from: a */
            public final WeakReference<C0065a> f238a;

            public C0067b(C0065a aVar) {
                this.f238a = new WeakReference<>(aVar);
            }

            /* renamed from: G0 */
            public void mo265G0(CharSequence charSequence) {
                C0065a aVar = (C0065a) this.f238a.get();
                if (aVar != null) {
                    aVar.mo256h(charSequence);
                }
            }

            /* renamed from: L */
            public void mo266L(Bundle bundle) {
                C0065a aVar = (C0065a) this.f238a.get();
                if (aVar != null) {
                    aVar.mo252d(bundle);
                }
            }

            /* renamed from: S */
            public void mo267S(List<?> list) {
                C0065a aVar = (C0065a) this.f238a.get();
                if (aVar != null) {
                    aVar.mo255g(MediaSessionCompat.QueueItem.m490b(list));
                }
            }

            /* renamed from: a */
            public void mo268a(String str, Bundle bundle) {
                C0065a aVar = (C0065a) this.f238a.get();
                if (aVar == null) {
                    return;
                }
                if (aVar.f222a == null || Build.VERSION.SDK_INT >= 23) {
                    aVar.mo259k(str, bundle);
                }
            }

            /* renamed from: b */
            public void mo269b(int i, int i2, int i3, int i4, int i5) {
                C0065a aVar = (C0065a) this.f238a.get();
                if (aVar != null) {
                    aVar.mo249b(new C0074g(i, i2, i3, i4, i5));
                }
            }

            /* renamed from: c */
            public void mo270c(Object obj) {
                C0065a aVar = (C0065a) this.f238a.get();
                if (aVar != null) {
                    aVar.mo253e(MediaMetadataCompat.m144b(obj));
                }
            }

            /* renamed from: d */
            public void mo271d(Object obj) {
                C0065a aVar = (C0065a) this.f238a.get();
                if (aVar != null && aVar.f222a == null) {
                    aVar.mo254f(PlaybackStateCompat.m767a(obj));
                }
            }

            /* renamed from: v0 */
            public void mo272v0() {
                C0065a aVar = (C0065a) this.f238a.get();
                if (aVar != null) {
                    aVar.mo258j();
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$c */
        public static class C0068c extends C0117a.C0118a {

            /* renamed from: a */
            public final WeakReference<C0065a> f239a;

            public C0068c(C0065a aVar) {
                this.f239a = new WeakReference<>(aVar);
            }

            /* renamed from: G0 */
            public void mo242G0(CharSequence charSequence) throws RemoteException {
                C0065a aVar = (C0065a) this.f239a.get();
                if (aVar != null) {
                    aVar.mo262n(6, charSequence, (Bundle) null);
                }
            }

            /* renamed from: K3 */
            public void mo273K3(boolean z) throws RemoteException {
            }

            /* renamed from: L */
            public void mo243L(Bundle bundle) throws RemoteException {
                C0065a aVar = (C0065a) this.f239a.get();
                if (aVar != null) {
                    aVar.mo262n(7, bundle, (Bundle) null);
                }
            }

            /* renamed from: P6 */
            public void mo274P6(int i) throws RemoteException {
                C0065a aVar = (C0065a) this.f239a.get();
                if (aVar != null) {
                    aVar.mo262n(12, Integer.valueOf(i), (Bundle) null);
                }
            }

            /* renamed from: S */
            public void mo244S(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                C0065a aVar = (C0065a) this.f239a.get();
                if (aVar != null) {
                    aVar.mo262n(5, list, (Bundle) null);
                }
            }

            /* renamed from: U7 */
            public void mo245U7(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                C0065a aVar = (C0065a) this.f239a.get();
                if (aVar != null) {
                    aVar.mo262n(3, mediaMetadataCompat, (Bundle) null);
                }
            }

            /* renamed from: W */
            public void mo275W(String str, Bundle bundle) throws RemoteException {
                C0065a aVar = (C0065a) this.f239a.get();
                if (aVar != null) {
                    aVar.mo262n(1, str, bundle);
                }
            }

            /* renamed from: Z0 */
            public void mo276Z0(boolean z) throws RemoteException {
                C0065a aVar = (C0065a) this.f239a.get();
                if (aVar != null) {
                    aVar.mo262n(11, Boolean.valueOf(z), (Bundle) null);
                }
            }

            /* renamed from: k5 */
            public void mo277k5(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                C0065a aVar = (C0065a) this.f239a.get();
                if (aVar != null) {
                    aVar.mo262n(2, playbackStateCompat, (Bundle) null);
                }
            }

            /* renamed from: n2 */
            public void mo246n2(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                C0065a aVar = (C0065a) this.f239a.get();
                if (aVar != null) {
                    aVar.mo262n(4, parcelableVolumeInfo != null ? new C0074g(parcelableVolumeInfo.f402n, parcelableVolumeInfo.f403o, parcelableVolumeInfo.f404p, parcelableVolumeInfo.f405q, parcelableVolumeInfo.f406r) : null, (Bundle) null);
                }
            }

            /* renamed from: o7 */
            public void mo278o7(int i) throws RemoteException {
                C0065a aVar = (C0065a) this.f239a.get();
                if (aVar != null) {
                    aVar.mo262n(9, Integer.valueOf(i), (Bundle) null);
                }
            }

            /* renamed from: t1 */
            public void mo279t1() throws RemoteException {
                C0065a aVar = (C0065a) this.f239a.get();
                if (aVar != null) {
                    aVar.mo262n(13, (Object) null, (Bundle) null);
                }
            }

            /* renamed from: v0 */
            public void mo247v0() throws RemoteException {
                C0065a aVar = (C0065a) this.f239a.get();
                if (aVar != null) {
                    aVar.mo262n(8, (Object) null, (Bundle) null);
                }
            }
        }

        @hl3({hl3.C2354a.f13185a})
        /* renamed from: a */
        public C0117a mo248a() {
            return this.f222a;
        }

        /* renamed from: b */
        public void mo249b(C0074g gVar) {
        }

        public void binderDied() {
            mo262n(8, (Object) null, (Bundle) null);
        }

        /* renamed from: c */
        public void mo251c(boolean z) {
        }

        /* renamed from: d */
        public void mo252d(Bundle bundle) {
        }

        /* renamed from: e */
        public void mo253e(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* renamed from: f */
        public void mo254f(PlaybackStateCompat playbackStateCompat) {
        }

        /* renamed from: g */
        public void mo255g(List<MediaSessionCompat.QueueItem> list) {
        }

        /* renamed from: h */
        public void mo256h(CharSequence charSequence) {
        }

        /* renamed from: i */
        public void mo257i(int i) {
        }

        /* renamed from: j */
        public void mo258j() {
        }

        /* renamed from: k */
        public void mo259k(String str, Bundle bundle) {
        }

        /* renamed from: l */
        public void mo260l() {
        }

        /* renamed from: m */
        public void mo261m(int i) {
        }

        /* renamed from: n */
        public void mo262n(int i, Object obj, Bundle bundle) {
            C0066a aVar = this.f221a;
            if (aVar != null) {
                Message obtainMessage = aVar.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        /* renamed from: o */
        public void mo263o(Handler handler) {
            if (handler == null) {
                C0066a aVar = this.f221a;
                if (aVar != null) {
                    aVar.f237a = false;
                    aVar.removeCallbacksAndMessages((Object) null);
                    this.f221a = null;
                    return;
                }
                return;
            }
            C0066a aVar2 = new C0066a(handler.getLooper());
            this.f221a = aVar2;
            aVar2.f237a = true;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    public static class C0069b extends ComponentActivity.C0464a {

        /* renamed from: a */
        public final MediaControllerCompat f240a;

        public C0069b(MediaControllerCompat mediaControllerCompat) {
            this.f240a = mediaControllerCompat;
        }

        /* renamed from: a */
        public MediaControllerCompat mo280a() {
            return this.f240a;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    public interface C0070c {
        /* renamed from: F0 */
        long mo214F0();

        /* renamed from: H0 */
        void mo215H0(MediaDescriptionCompat mediaDescriptionCompat);

        /* renamed from: J */
        String mo216J();

        /* renamed from: K */
        PlaybackStateCompat mo217K();

        /* renamed from: O0 */
        MediaMetadataCompat mo218O0();

        /* renamed from: P0 */
        boolean mo219P0();

        /* renamed from: R */
        int mo220R();

        /* renamed from: T */
        CharSequence mo221T();

        /* renamed from: U */
        void mo222U(MediaDescriptionCompat mediaDescriptionCompat);

        /* renamed from: a */
        void mo223a(C0065a aVar, Handler handler);

        /* renamed from: a0 */
        int mo224a0();

        /* renamed from: b */
        void mo225b(MediaDescriptionCompat mediaDescriptionCompat, int i);

        /* renamed from: c */
        C0074g mo226c();

        /* renamed from: d */
        void mo227d(C0065a aVar);

        /* renamed from: e */
        void mo228e(int i, int i2);

        /* renamed from: f */
        void mo229f(String str, Bundle bundle, ResultReceiver resultReceiver);

        /* renamed from: g */
        void mo230g(int i, int i2);

        Bundle getExtras();

        /* renamed from: h */
        boolean mo232h();

        /* renamed from: i */
        boolean mo233i(KeyEvent keyEvent);

        /* renamed from: j */
        Object mo234j();

        /* renamed from: k */
        PendingIntent mo235k();

        /* renamed from: l */
        C0075h mo236l();

        /* renamed from: l0 */
        int mo237l0();

        /* renamed from: t0 */
        List<MediaSessionCompat.QueueItem> mo240t0();
    }

    @sj3(23)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$d */
    public static class C0071d extends MediaControllerImplApi21 {
        public C0071d(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }

        /* renamed from: l */
        public C0075h mo236l() {
            Object q = C0123c.m945q(this.f216a);
            if (q != null) {
                return new C0077j(q);
            }
            return null;
        }
    }

    @sj3(24)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$e */
    public static class C0072e extends C0071d {
        public C0072e(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }

        /* renamed from: l */
        public C0075h mo236l() {
            Object q = C0123c.m945q(this.f216a);
            if (q != null) {
                return new C0078k(q);
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$f */
    public static class C0073f implements C0070c {

        /* renamed from: a */
        public C0075h f241a;

        /* renamed from: a */
        public C0120b f242a;

        public C0073f(MediaSessionCompat.Token token) {
            this.f242a = C0120b.C0121a.m880j8((IBinder) token.mo357f());
        }

        /* renamed from: F0 */
        public long mo214F0() {
            try {
                return this.f242a.mo453F0();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in getFlags.", e);
                return 0;
            }
        }

        /* renamed from: H0 */
        public void mo215H0(MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.f242a.mo453F0() & 4) != 0) {
                    this.f242a.mo455H0(mediaDescriptionCompat);
                    return;
                }
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in addQueueItem.", e);
            }
        }

        /* renamed from: J */
        public String mo216J() {
            try {
                return this.f242a.mo457J();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in getPackageName.", e);
                return null;
            }
        }

        /* renamed from: K */
        public PlaybackStateCompat mo217K() {
            try {
                return this.f242a.mo458K();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in getPlaybackState.", e);
                return null;
            }
        }

        /* renamed from: O0 */
        public MediaMetadataCompat mo218O0() {
            try {
                return this.f242a.mo461O0();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in getMetadata.", e);
                return null;
            }
        }

        /* renamed from: P0 */
        public boolean mo219P0() {
            try {
                return this.f242a.mo462P0();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in isCaptioningEnabled.", e);
                return false;
            }
        }

        /* renamed from: R */
        public int mo220R() {
            try {
                return this.f242a.mo465R();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in getRepeatMode.", e);
                return -1;
            }
        }

        /* renamed from: T */
        public CharSequence mo221T() {
            try {
                return this.f242a.mo466T();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in getQueueTitle.", e);
                return null;
            }
        }

        /* renamed from: U */
        public void mo222U(MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.f242a.mo453F0() & 4) != 0) {
                    this.f242a.mo467U(mediaDescriptionCompat);
                    return;
                }
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in removeQueueItem.", e);
            }
        }

        /* renamed from: a */
        public void mo223a(C0065a aVar, Handler handler) {
            if (aVar != null) {
                try {
                    this.f242a.asBinder().linkToDeath(aVar, 0);
                    this.f242a.mo473b5((C0117a) aVar.f223a);
                    aVar.mo262n(13, (Object) null, (Bundle) null);
                } catch (RemoteException e) {
                    Log.e(MediaControllerCompat.f204a, "Dead object in registerCallback.", e);
                    aVar.mo262n(8, (Object) null, (Bundle) null);
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }

        /* renamed from: a0 */
        public int mo224a0() {
            try {
                return this.f242a.mo471a0();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in getRatingType.", e);
                return 0;
            }
        }

        /* renamed from: b */
        public void mo225b(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            try {
                if ((this.f242a.mo453F0() & 4) != 0) {
                    this.f242a.mo464P7(mediaDescriptionCompat, i);
                    return;
                }
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in addQueueItemAt.", e);
            }
        }

        /* renamed from: c */
        public C0074g mo226c() {
            try {
                ParcelableVolumeInfo j4 = this.f242a.mo479j4();
                return new C0074g(j4.f402n, j4.f403o, j4.f404p, j4.f405q, j4.f406r);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in getPlaybackInfo.", e);
                return null;
            }
        }

        /* renamed from: d */
        public void mo227d(C0065a aVar) {
            if (aVar != null) {
                try {
                    this.f242a.mo480j6((C0117a) aVar.f223a);
                    this.f242a.asBinder().unlinkToDeath(aVar, 0);
                } catch (RemoteException e) {
                    Log.e(MediaControllerCompat.f204a, "Dead object in unregisterCallback.", e);
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }

        /* renamed from: e */
        public void mo228e(int i, int i2) {
            try {
                this.f242a.mo477g8(i, i2, (String) null);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in adjustVolume.", e);
            }
        }

        /* renamed from: f */
        public void mo229f(String str, Bundle bundle, ResultReceiver resultReceiver) {
            try {
                this.f242a.mo456H1(str, bundle, new MediaSessionCompat.ResultReceiverWrapper(resultReceiver));
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in sendCommand.", e);
            }
        }

        /* renamed from: g */
        public void mo230g(int i, int i2) {
            try {
                this.f242a.mo481j7(i, i2, (String) null);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in setVolumeTo.", e);
            }
        }

        public Bundle getExtras() {
            try {
                return this.f242a.getExtras();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in getExtras.", e);
                return null;
            }
        }

        /* renamed from: h */
        public boolean mo232h() {
            return true;
        }

        /* renamed from: i */
        public boolean mo233i(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.f242a.mo475f2(keyEvent);
                    return false;
                } catch (RemoteException e) {
                    Log.e(MediaControllerCompat.f204a, "Dead object in dispatchMediaButtonEvent.", e);
                    return false;
                }
            } else {
                throw new IllegalArgumentException("event may not be null.");
            }
        }

        /* renamed from: j */
        public Object mo234j() {
            return null;
        }

        /* renamed from: k */
        public PendingIntent mo235k() {
            try {
                return this.f242a.mo494t4();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in getSessionActivity.", e);
                return null;
            }
        }

        /* renamed from: l */
        public C0075h mo236l() {
            if (this.f241a == null) {
                this.f241a = new C0079l(this.f242a);
            }
            return this.f241a;
        }

        /* renamed from: l0 */
        public int mo237l0() {
            try {
                return this.f242a.mo482l0();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in getShuffleMode.", e);
                return -1;
            }
        }

        /* renamed from: t0 */
        public List<MediaSessionCompat.QueueItem> mo240t0() {
            try {
                return this.f242a.mo493t0();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in getQueue.", e);
                return null;
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$g */
    public static final class C0074g {

        /* renamed from: f */
        public static final int f243f = 1;

        /* renamed from: g */
        public static final int f244g = 2;

        /* renamed from: a */
        public final int f245a;

        /* renamed from: b */
        public final int f246b;

        /* renamed from: c */
        public final int f247c;

        /* renamed from: d */
        public final int f248d;

        /* renamed from: e */
        public final int f249e;

        public C0074g(int i, int i2, int i3, int i4, int i5) {
            this.f245a = i;
            this.f246b = i2;
            this.f247c = i3;
            this.f248d = i4;
            this.f249e = i5;
        }

        /* renamed from: a */
        public int mo281a() {
            return this.f246b;
        }

        /* renamed from: b */
        public int mo282b() {
            return this.f249e;
        }

        /* renamed from: c */
        public int mo283c() {
            return this.f248d;
        }

        /* renamed from: d */
        public int mo284d() {
            return this.f245a;
        }

        /* renamed from: e */
        public int mo285e() {
            return this.f247c;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$h */
    public static abstract class C0075h {

        /* renamed from: a */
        public static final String f250a = "android.media.session.extra.LEGACY_STREAM_TYPE";

        /* renamed from: a */
        public abstract void mo286a();

        /* renamed from: b */
        public abstract void mo287b();

        /* renamed from: c */
        public abstract void mo288c();

        /* renamed from: d */
        public abstract void mo289d(String str, Bundle bundle);

        /* renamed from: e */
        public abstract void mo290e(String str, Bundle bundle);

        /* renamed from: f */
        public abstract void mo291f(Uri uri, Bundle bundle);

        /* renamed from: g */
        public abstract void mo292g();

        /* renamed from: h */
        public abstract void mo293h(String str, Bundle bundle);

        /* renamed from: i */
        public abstract void mo294i(String str, Bundle bundle);

        /* renamed from: j */
        public abstract void mo295j(Uri uri, Bundle bundle);

        /* renamed from: k */
        public abstract void mo296k();

        /* renamed from: l */
        public abstract void mo297l(long j);

        /* renamed from: m */
        public abstract void mo298m(PlaybackStateCompat.CustomAction customAction, Bundle bundle);

        /* renamed from: n */
        public abstract void mo299n(String str, Bundle bundle);

        /* renamed from: o */
        public abstract void mo300o(boolean z);

        /* renamed from: p */
        public abstract void mo301p(RatingCompat ratingCompat);

        /* renamed from: q */
        public abstract void mo302q(RatingCompat ratingCompat, Bundle bundle);

        /* renamed from: r */
        public abstract void mo303r(int i);

        /* renamed from: s */
        public abstract void mo304s(int i);

        /* renamed from: t */
        public abstract void mo305t();

        /* renamed from: u */
        public abstract void mo306u();

        /* renamed from: v */
        public abstract void mo307v(long j);

        /* renamed from: w */
        public abstract void mo308w();
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$i */
    public static class C0076i extends C0075h {

        /* renamed from: a */
        public final Object f251a;

        public C0076i(Object obj) {
            this.f251a = obj;
        }

        /* renamed from: a */
        public void mo286a() {
            C0123c.C0127d.m966a(this.f251a);
        }

        /* renamed from: b */
        public void mo287b() {
            C0123c.C0127d.m967b(this.f251a);
        }

        /* renamed from: c */
        public void mo288c() {
            C0123c.C0127d.m968c(this.f251a);
        }

        /* renamed from: d */
        public void mo289d(String str, Bundle bundle) {
            C0123c.C0127d.m969d(this.f251a, str, bundle);
        }

        /* renamed from: e */
        public void mo290e(String str, Bundle bundle) {
            C0123c.C0127d.m970e(this.f251a, str, bundle);
        }

        /* renamed from: f */
        public void mo291f(Uri uri, Bundle bundle) {
            if (uri == null || Uri.EMPTY.equals(uri)) {
                throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.f284s, uri);
            bundle2.putBundle(MediaSessionCompat.f286u, bundle);
            mo299n(MediaSessionCompat.f273h, bundle2);
        }

        /* renamed from: g */
        public void mo292g() {
            mo299n(MediaSessionCompat.f274i, (Bundle) null);
        }

        /* renamed from: h */
        public void mo293h(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaSessionCompat.f282q, str);
            bundle2.putBundle(MediaSessionCompat.f286u, bundle);
            mo299n(MediaSessionCompat.f275j, bundle2);
        }

        /* renamed from: i */
        public void mo294i(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaSessionCompat.f283r, str);
            bundle2.putBundle(MediaSessionCompat.f286u, bundle);
            mo299n(MediaSessionCompat.f276k, bundle2);
        }

        /* renamed from: j */
        public void mo295j(Uri uri, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.f284s, uri);
            bundle2.putBundle(MediaSessionCompat.f286u, bundle);
            mo299n(MediaSessionCompat.f277l, bundle2);
        }

        /* renamed from: k */
        public void mo296k() {
            C0123c.C0127d.m971f(this.f251a);
        }

        /* renamed from: l */
        public void mo297l(long j) {
            C0123c.C0127d.m972g(this.f251a, j);
        }

        /* renamed from: m */
        public void mo298m(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
            MediaControllerCompat.m229F(customAction.mo548b(), bundle);
            C0123c.C0127d.m973h(this.f251a, customAction.mo548b(), bundle);
        }

        /* renamed from: n */
        public void mo299n(String str, Bundle bundle) {
            MediaControllerCompat.m229F(str, bundle);
            C0123c.C0127d.m973h(this.f251a, str, bundle);
        }

        /* renamed from: o */
        public void mo300o(boolean z) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(MediaSessionCompat.f287v, z);
            mo299n(MediaSessionCompat.f278m, bundle);
        }

        /* renamed from: p */
        public void mo301p(RatingCompat ratingCompat) {
            C0123c.C0127d.m974i(this.f251a, ratingCompat != null ? ratingCompat.mo163c() : null);
        }

        /* renamed from: q */
        public void mo302q(RatingCompat ratingCompat, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.f285t, ratingCompat);
            bundle2.putBundle(MediaSessionCompat.f286u, bundle);
            mo299n(MediaSessionCompat.f281p, bundle2);
        }

        /* renamed from: r */
        public void mo303r(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.f288w, i);
            mo299n(MediaSessionCompat.f279n, bundle);
        }

        /* renamed from: s */
        public void mo304s(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.f289x, i);
            mo299n(MediaSessionCompat.f280o, bundle);
        }

        /* renamed from: t */
        public void mo305t() {
            C0123c.C0127d.m975j(this.f251a);
        }

        /* renamed from: u */
        public void mo306u() {
            C0123c.C0127d.m976k(this.f251a);
        }

        /* renamed from: v */
        public void mo307v(long j) {
            C0123c.C0127d.m977l(this.f251a, j);
        }

        /* renamed from: w */
        public void mo308w() {
            C0123c.C0127d.m978m(this.f251a);
        }
    }

    @sj3(23)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$j */
    public static class C0077j extends C0076i {
        public C0077j(Object obj) {
            super(obj);
        }

        /* renamed from: f */
        public void mo291f(Uri uri, Bundle bundle) {
            C0128d.C0129a.m979a(this.f251a, uri, bundle);
        }
    }

    @sj3(24)
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$k */
    public static class C0078k extends C0077j {
        public C0078k(Object obj) {
            super(obj);
        }

        /* renamed from: g */
        public void mo292g() {
            C0130e.C0131a.m980a(this.f251a);
        }

        /* renamed from: h */
        public void mo293h(String str, Bundle bundle) {
            C0130e.C0131a.m981b(this.f251a, str, bundle);
        }

        /* renamed from: i */
        public void mo294i(String str, Bundle bundle) {
            C0130e.C0131a.m982c(this.f251a, str, bundle);
        }

        /* renamed from: j */
        public void mo295j(Uri uri, Bundle bundle) {
            C0130e.C0131a.m983d(this.f251a, uri, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$l */
    public static class C0079l extends C0075h {

        /* renamed from: a */
        public C0120b f252a;

        public C0079l(C0120b bVar) {
            this.f252a = bVar;
        }

        /* renamed from: a */
        public void mo286a() {
            try {
                this.f252a.mo497u4();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in fastForward.", e);
            }
        }

        /* renamed from: b */
        public void mo287b() {
            try {
                this.f252a.mo496u0();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in pause.", e);
            }
        }

        /* renamed from: c */
        public void mo288c() {
            try {
                this.f252a.mo483m5();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in play.", e);
            }
        }

        /* renamed from: d */
        public void mo289d(String str, Bundle bundle) {
            try {
                this.f252a.mo472b4(str, bundle);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in playFromMediaId.", e);
            }
        }

        /* renamed from: e */
        public void mo290e(String str, Bundle bundle) {
            try {
                this.f252a.mo463P5(str, bundle);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in playFromSearch.", e);
            }
        }

        /* renamed from: f */
        public void mo291f(Uri uri, Bundle bundle) {
            try {
                this.f252a.mo452A2(uri, bundle);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in playFromUri.", e);
            }
        }

        /* renamed from: g */
        public void mo292g() {
            try {
                this.f252a.mo490s1();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in prepare.", e);
            }
        }

        /* renamed from: h */
        public void mo293h(String str, Bundle bundle) {
            try {
                this.f252a.mo491s6(str, bundle);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in prepareFromMediaId.", e);
            }
        }

        /* renamed from: i */
        public void mo294i(String str, Bundle bundle) {
            try {
                this.f252a.mo470X7(str, bundle);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in prepareFromSearch.", e);
            }
        }

        /* renamed from: j */
        public void mo295j(Uri uri, Bundle bundle) {
            try {
                this.f252a.mo468X3(uri, bundle);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in prepareFromUri.", e);
            }
        }

        /* renamed from: k */
        public void mo296k() {
            try {
                this.f252a.mo495t7();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in rewind.", e);
            }
        }

        /* renamed from: l */
        public void mo297l(long j) {
            try {
                this.f252a.mo459M4(j);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in seekTo.", e);
            }
        }

        /* renamed from: m */
        public void mo298m(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
            mo299n(customAction.mo548b(), bundle);
        }

        /* renamed from: n */
        public void mo299n(String str, Bundle bundle) {
            MediaControllerCompat.m229F(str, bundle);
            try {
                this.f252a.mo487r5(str, bundle);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in sendCustomAction.", e);
            }
        }

        /* renamed from: o */
        public void mo300o(boolean z) {
            try {
                this.f252a.mo498x0(z);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in setCaptioningEnabled.", e);
            }
        }

        /* renamed from: p */
        public void mo301p(RatingCompat ratingCompat) {
            try {
                this.f252a.mo454F5(ratingCompat);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in setRating.", e);
            }
        }

        /* renamed from: q */
        public void mo302q(RatingCompat ratingCompat, Bundle bundle) {
            try {
                this.f252a.mo476g1(ratingCompat, bundle);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in setRating.", e);
            }
        }

        /* renamed from: r */
        public void mo303r(int i) {
            try {
                this.f252a.mo484n0(i);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in setRepeatMode.", e);
            }
        }

        /* renamed from: s */
        public void mo304s(int i) {
            try {
                this.f252a.mo489s0(i);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in setShuffleMode.", e);
            }
        }

        /* renamed from: t */
        public void mo305t() {
            try {
                this.f252a.mo499x1();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in skipToNext.", e);
            }
        }

        /* renamed from: u */
        public void mo306u() {
            try {
                this.f252a.mo486q7();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in skipToPrevious.", e);
            }
        }

        /* renamed from: v */
        public void mo307v(long j) {
            try {
                this.f252a.mo500z2(j);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in skipToQueueItem.", e);
            }
        }

        /* renamed from: w */
        public void mo308w() {
            try {
                this.f252a.stop();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.f204a, "Dead object in stop.", e);
            }
        }
    }

    public MediaControllerCompat(Context context, @mr2 MediaSessionCompat.Token token) throws RemoteException {
        if (token != null) {
            this.f213a = token;
            int i = Build.VERSION.SDK_INT;
            this.f212a = i >= 24 ? new C0072e(context, token) : i >= 23 ? new C0071d(context, token) : new MediaControllerImplApi21(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public MediaControllerCompat(Context context, @mr2 MediaSessionCompat mediaSessionCompat) {
        if (mediaSessionCompat != null) {
            MediaSessionCompat.Token i = mediaSessionCompat.mo320i();
            this.f213a = i;
            C0070c cVar = null;
            try {
                int i2 = Build.VERSION.SDK_INT;
                cVar = i2 >= 24 ? new C0072e(context, i) : i2 >= 23 ? new C0071d(context, i) : new MediaControllerImplApi21(context, i);
            } catch (RemoteException e) {
                Log.w(f204a, "Failed to create MediaControllerImpl.", e);
            }
            this.f212a = cVar;
            return;
        }
        throw new IllegalArgumentException("session must not be null");
    }

    /* renamed from: C */
    public static void m228C(@mr2 Activity activity, MediaControllerCompat mediaControllerCompat) {
        if (activity instanceof ComponentActivity) {
            ((ComponentActivity) activity).mo3705i0(new C0069b(mediaControllerCompat));
        }
        Object obj = null;
        if (mediaControllerCompat != null) {
            obj = C0123c.m932d(activity, mediaControllerCompat.mo205r().mo357f());
        }
        C0123c.m948t(activity, obj);
    }

    /* renamed from: F */
    public static void m229F(String str, Bundle bundle) {
        if (str != null) {
            if (!str.equals(MediaSessionCompat.f265d) && !str.equals(MediaSessionCompat.f267e)) {
                return;
            }
            if (bundle == null || !bundle.containsKey(MediaSessionCompat.f269f)) {
                throw new IllegalArgumentException("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action " + str + ".");
            }
        }
    }

    /* renamed from: g */
    public static MediaControllerCompat m230g(@mr2 Activity activity) {
        if (activity instanceof ComponentActivity) {
            C0069b bVar = (C0069b) ((ComponentActivity) activity).mo3704h0(C0069b.class);
            if (bVar != null) {
                return bVar.mo280a();
            }
            return null;
        }
        Object g = C0123c.m935g(activity);
        if (g == null) {
            return null;
        }
        try {
            return new MediaControllerCompat((Context) activity, MediaSessionCompat.Token.m499b(C0123c.m944p(g)));
        } catch (RemoteException e) {
            Log.e(f204a, "Dead object in getMediaController.", e);
            return null;
        }
    }

    @Deprecated
    /* renamed from: A */
    public void mo185A(int i) {
        MediaSessionCompat.QueueItem queueItem;
        List<MediaSessionCompat.QueueItem> m = mo200m();
        if (m != null && i >= 0 && i < m.size() && (queueItem = m.get(i)) != null) {
            mo213z(queueItem.mo337c());
        }
    }

    /* renamed from: B */
    public void mo186B(@mr2 String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (!TextUtils.isEmpty(str)) {
            this.f212a.mo229f(str, bundle, resultReceiver);
            return;
        }
        throw new IllegalArgumentException("command must neither be null nor empty");
    }

    /* renamed from: D */
    public void mo187D(int i, int i2) {
        this.f212a.mo230g(i, i2);
    }

    /* renamed from: E */
    public void mo188E(@mr2 C0065a aVar) {
        if (aVar != null) {
            try {
                this.f214a.remove(aVar);
                this.f212a.mo227d(aVar);
            } finally {
                aVar.mo263o((Handler) null);
            }
        } else {
            throw new IllegalArgumentException("callback must not be null");
        }
    }

    /* renamed from: a */
    public void mo189a(MediaDescriptionCompat mediaDescriptionCompat) {
        this.f212a.mo215H0(mediaDescriptionCompat);
    }

    /* renamed from: b */
    public void mo190b(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        this.f212a.mo225b(mediaDescriptionCompat, i);
    }

    /* renamed from: c */
    public void mo191c(int i, int i2) {
        this.f212a.mo228e(i, i2);
    }

    /* renamed from: d */
    public boolean mo192d(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f212a.mo233i(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    /* renamed from: e */
    public Bundle mo193e() {
        return this.f212a.getExtras();
    }

    /* renamed from: f */
    public long mo194f() {
        return this.f212a.mo214F0();
    }

    /* renamed from: h */
    public Object mo195h() {
        return this.f212a.mo234j();
    }

    /* renamed from: i */
    public MediaMetadataCompat mo196i() {
        return this.f212a.mo218O0();
    }

    /* renamed from: j */
    public String mo197j() {
        return this.f212a.mo216J();
    }

    /* renamed from: k */
    public C0074g mo198k() {
        return this.f212a.mo226c();
    }

    /* renamed from: l */
    public PlaybackStateCompat mo199l() {
        return this.f212a.mo217K();
    }

    /* renamed from: m */
    public List<MediaSessionCompat.QueueItem> mo200m() {
        return this.f212a.mo240t0();
    }

    /* renamed from: n */
    public CharSequence mo201n() {
        return this.f212a.mo221T();
    }

    /* renamed from: o */
    public int mo202o() {
        return this.f212a.mo224a0();
    }

    /* renamed from: p */
    public int mo203p() {
        return this.f212a.mo220R();
    }

    /* renamed from: q */
    public PendingIntent mo204q() {
        return this.f212a.mo235k();
    }

    /* renamed from: r */
    public MediaSessionCompat.Token mo205r() {
        return this.f213a;
    }

    @ts2
    @hl3({hl3.C2354a.f13187b})
    /* renamed from: s */
    public Bundle mo206s() {
        return this.f213a.mo355e();
    }

    /* renamed from: t */
    public int mo207t() {
        return this.f212a.mo237l0();
    }

    /* renamed from: u */
    public C0075h mo208u() {
        return this.f212a.mo236l();
    }

    /* renamed from: v */
    public boolean mo209v() {
        return this.f212a.mo219P0();
    }

    /* renamed from: w */
    public boolean mo210w() {
        return this.f212a.mo232h();
    }

    /* renamed from: x */
    public void mo211x(@mr2 C0065a aVar) {
        mo212y(aVar, (Handler) null);
    }

    /* renamed from: y */
    public void mo212y(@mr2 C0065a aVar, Handler handler) {
        if (aVar != null) {
            if (handler == null) {
                handler = new Handler();
            }
            aVar.mo263o(handler);
            this.f212a.mo223a(aVar, handler);
            this.f214a.add(aVar);
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    /* renamed from: z */
    public void mo213z(MediaDescriptionCompat mediaDescriptionCompat) {
        this.f212a.mo222U(mediaDescriptionCompat);
    }
}
