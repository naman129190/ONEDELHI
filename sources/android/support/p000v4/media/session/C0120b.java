package android.support.p000v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p000v4.media.MediaDescriptionCompat;
import android.support.p000v4.media.MediaMetadataCompat;
import android.support.p000v4.media.RatingCompat;
import android.support.p000v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: android.support.v4.media.session.b */
public interface C0120b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    public static abstract class C0121a extends Binder implements C0120b {

        /* renamed from: A */
        public static final int f512A = 44;

        /* renamed from: B */
        public static final int f513B = 33;

        /* renamed from: C */
        public static final int f514C = 34;

        /* renamed from: D */
        public static final int f515D = 35;

        /* renamed from: E */
        public static final int f516E = 36;

        /* renamed from: F */
        public static final int f517F = 13;

        /* renamed from: G */
        public static final int f518G = 14;

        /* renamed from: H */
        public static final int f519H = 15;

        /* renamed from: I */
        public static final int f520I = 16;

        /* renamed from: J */
        public static final int f521J = 17;

        /* renamed from: K */
        public static final int f522K = 18;

        /* renamed from: L */
        public static final int f523L = 19;

        /* renamed from: M */
        public static final int f524M = 20;

        /* renamed from: N */
        public static final int f525N = 21;

        /* renamed from: O */
        public static final int f526O = 22;

        /* renamed from: P */
        public static final int f527P = 23;

        /* renamed from: Q */
        public static final int f528Q = 24;

        /* renamed from: R */
        public static final int f529R = 25;

        /* renamed from: S */
        public static final int f530S = 51;

        /* renamed from: T */
        public static final int f531T = 46;

        /* renamed from: U */
        public static final int f532U = 39;

        /* renamed from: V */
        public static final int f533V = 40;

        /* renamed from: W */
        public static final int f534W = 48;

        /* renamed from: X */
        public static final int f535X = 26;

        /* renamed from: b */
        public static final int f536b = 1;

        /* renamed from: b */
        public static final String f537b = "android.support.v4.media.session.IMediaSession";

        /* renamed from: c */
        public static final int f538c = 2;

        /* renamed from: d */
        public static final int f539d = 3;

        /* renamed from: e */
        public static final int f540e = 4;

        /* renamed from: f */
        public static final int f541f = 5;

        /* renamed from: g */
        public static final int f542g = 6;

        /* renamed from: h */
        public static final int f543h = 7;

        /* renamed from: i */
        public static final int f544i = 8;

        /* renamed from: j */
        public static final int f545j = 9;

        /* renamed from: k */
        public static final int f546k = 10;

        /* renamed from: l */
        public static final int f547l = 11;

        /* renamed from: m */
        public static final int f548m = 12;

        /* renamed from: n */
        public static final int f549n = 27;

        /* renamed from: o */
        public static final int f550o = 28;

        /* renamed from: p */
        public static final int f551p = 29;

        /* renamed from: q */
        public static final int f552q = 30;

        /* renamed from: r */
        public static final int f553r = 31;

        /* renamed from: s */
        public static final int f554s = 32;

        /* renamed from: t */
        public static final int f555t = 45;

        /* renamed from: u */
        public static final int f556u = 37;

        /* renamed from: v */
        public static final int f557v = 38;

        /* renamed from: w */
        public static final int f558w = 47;

        /* renamed from: x */
        public static final int f559x = 41;

        /* renamed from: y */
        public static final int f560y = 42;

        /* renamed from: z */
        public static final int f561z = 43;

        /* renamed from: android.support.v4.media.session.b$a$a */
        public static class C0122a implements C0120b {

            /* renamed from: a */
            public IBinder f562a;

            public C0122a(IBinder iBinder) {
                this.f562a = iBinder;
            }

            /* renamed from: A2 */
            public void mo452A2(Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f562a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: F0 */
            public long mo453F0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    this.f562a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: F5 */
            public void mo454F5(RatingCompat ratingCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    if (ratingCompat != null) {
                        obtain.writeInt(1);
                        ratingCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f562a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: H0 */
            public void mo455H0(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f562a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: H1 */
            public void mo456H1(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (resultReceiverWrapper != null) {
                        obtain.writeInt(1);
                        resultReceiverWrapper.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f562a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: J */
            public String mo457J() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    this.f562a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: K */
            public PlaybackStateCompat mo458K() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    this.f562a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: M4 */
            public void mo459M4(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    obtain.writeLong(j);
                    this.f562a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: O */
            public String mo460O() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    this.f562a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: O0 */
            public MediaMetadataCompat mo461O0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    this.f562a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: P0 */
            public boolean mo462P0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    boolean z = false;
                    this.f562a.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: P5 */
            public void mo463P5(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f562a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: P7 */
            public void mo464P7(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f562a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: R */
            public int mo465R() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    this.f562a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: T */
            public CharSequence mo466T() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    this.f562a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: U */
            public void mo467U(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f562a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: X3 */
            public void mo468X3(Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f562a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: X6 */
            public boolean mo469X6() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    boolean z = false;
                    this.f562a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: X7 */
            public void mo470X7(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f562a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a0 */
            public int mo471a0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    this.f562a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f562a;
            }

            /* renamed from: b4 */
            public void mo472b4(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f562a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b5 */
            public void mo473b5(C0117a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f562a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c4 */
            public void mo474c4(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    obtain.writeInt(i);
                    this.f562a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f2 */
            public boolean mo475f2(KeyEvent keyEvent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    boolean z = true;
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f562a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g1 */
            public void mo476g1(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    if (ratingCompat != null) {
                        obtain.writeInt(1);
                        ratingCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f562a.transact(51, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g8 */
            public void mo477g8(int i, int i2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f562a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Bundle getExtras() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    this.f562a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j4 */
            public ParcelableVolumeInfo mo479j4() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    this.f562a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j6 */
            public void mo480j6(C0117a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f562a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j7 */
            public void mo481j7(int i, int i2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f562a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j8 */
            public String mo584j8() {
                return C0121a.f537b;
            }

            /* renamed from: l0 */
            public int mo482l0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    this.f562a.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m5 */
            public void mo483m5() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    this.f562a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n0 */
            public void mo484n0(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    obtain.writeInt(i);
                    this.f562a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n7 */
            public boolean mo485n7() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    boolean z = false;
                    this.f562a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: q7 */
            public void mo486q7() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    this.f562a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: r5 */
            public void mo487r5(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f562a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: r6 */
            public void mo488r6(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    obtain.writeInt(z ? 1 : 0);
                    this.f562a.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: s0 */
            public void mo489s0(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    obtain.writeInt(i);
                    this.f562a.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: s1 */
            public void mo490s1() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    this.f562a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: s6 */
            public void mo491s6(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f562a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void stop() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    this.f562a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: t0 */
            public List<MediaSessionCompat.QueueItem> mo493t0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    this.f562a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: t4 */
            public PendingIntent mo494t4() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    this.f562a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: t7 */
            public void mo495t7() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    this.f562a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: u0 */
            public void mo496u0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    this.f562a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: u4 */
            public void mo497u4() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    this.f562a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: x0 */
            public void mo498x0(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    obtain.writeInt(z ? 1 : 0);
                    this.f562a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: x1 */
            public void mo499x1() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    this.f562a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: z2 */
            public void mo500z2(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0121a.f537b);
                    obtain.writeLong(j);
                    this.f562a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0121a() {
            attachInterface(this, f537b);
        }

        /* renamed from: j8 */
        public static C0120b m880j8(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f537b);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0120b)) ? new C0122a(iBinder) : (C0120b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: android.view.KeyEvent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: android.support.v4.media.RatingCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: android.support.v4.media.MediaDescriptionCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: android.support.v4.media.MediaDescriptionCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: android.support.v4.media.MediaDescriptionCompat} */
        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v43 */
        /* JADX WARNING: type inference failed for: r1v44 */
        /* JADX WARNING: type inference failed for: r1v45 */
        /* JADX WARNING: type inference failed for: r1v46 */
        /* JADX WARNING: type inference failed for: r1v47 */
        /* JADX WARNING: type inference failed for: r1v48 */
        /* JADX WARNING: type inference failed for: r1v49 */
        /* JADX WARNING: type inference failed for: r1v50 */
        /* JADX WARNING: type inference failed for: r1v51 */
        /* JADX WARNING: type inference failed for: r1v52 */
        /* JADX WARNING: type inference failed for: r1v53 */
        /* JADX WARNING: type inference failed for: r1v54 */
        /* JADX WARNING: type inference failed for: r1v55 */
        /* JADX WARNING: type inference failed for: r1v56 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 51
                r1 = 0
                java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                r3 = 1
                if (r5 == r0) goto L_0x03cd
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L_0x03c9
                r0 = 0
                switch(r5) {
                    case 1: goto L_0x039c;
                    case 2: goto L_0x037f;
                    case 3: goto L_0x036d;
                    case 4: goto L_0x035b;
                    case 5: goto L_0x034d;
                    case 6: goto L_0x033f;
                    case 7: goto L_0x0331;
                    case 8: goto L_0x031a;
                    case 9: goto L_0x030c;
                    case 10: goto L_0x02f5;
                    case 11: goto L_0x02df;
                    case 12: goto L_0x02c9;
                    case 13: goto L_0x02bf;
                    case 14: goto L_0x02a2;
                    case 15: goto L_0x0285;
                    case 16: goto L_0x025c;
                    case 17: goto L_0x024e;
                    case 18: goto L_0x0244;
                    case 19: goto L_0x023a;
                    case 20: goto L_0x0230;
                    case 21: goto L_0x0226;
                    case 22: goto L_0x021c;
                    case 23: goto L_0x0212;
                    case 24: goto L_0x0204;
                    case 25: goto L_0x01eb;
                    case 26: goto L_0x01ce;
                    case 27: goto L_0x01b7;
                    case 28: goto L_0x01a0;
                    case 29: goto L_0x0192;
                    case 30: goto L_0x017b;
                    case 31: goto L_0x0164;
                    case 32: goto L_0x0156;
                    case 33: goto L_0x014c;
                    case 34: goto L_0x012f;
                    case 35: goto L_0x0112;
                    case 36: goto L_0x00e9;
                    case 37: goto L_0x00db;
                    case 38: goto L_0x00cd;
                    case 39: goto L_0x00bf;
                    case 40: goto L_0x00ae;
                    case 41: goto L_0x0095;
                    case 42: goto L_0x0078;
                    case 43: goto L_0x005f;
                    case 44: goto L_0x0051;
                    case 45: goto L_0x0043;
                    case 46: goto L_0x0032;
                    case 47: goto L_0x0024;
                    case 48: goto L_0x0016;
                    default: goto L_0x0011;
                }
            L_0x0011:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0016:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.mo489s0(r5)
                r7.writeNoException()
                return r3
            L_0x0024:
                r6.enforceInterface(r2)
                int r5 = r4.mo482l0()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L_0x0032:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x003c
                r0 = 1
            L_0x003c:
                r4.mo498x0(r0)
                r7.writeNoException()
                return r3
            L_0x0043:
                r6.enforceInterface(r2)
                boolean r5 = r4.mo462P0()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L_0x0051:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.mo474c4(r5)
                r7.writeNoException()
                return r3
            L_0x005f:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0071
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.p000v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                android.support.v4.media.MediaDescriptionCompat r1 = (android.support.p000v4.media.MediaDescriptionCompat) r1
            L_0x0071:
                r4.mo467U(r1)
                r7.writeNoException()
                return r3
            L_0x0078:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x008a
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.p000v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                android.support.v4.media.MediaDescriptionCompat r1 = (android.support.p000v4.media.MediaDescriptionCompat) r1
            L_0x008a:
                int r5 = r6.readInt()
                r4.mo464P7(r1, r5)
                r7.writeNoException()
                return r3
            L_0x0095:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00a7
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.p000v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                android.support.v4.media.MediaDescriptionCompat r1 = (android.support.p000v4.media.MediaDescriptionCompat) r1
            L_0x00a7:
                r4.mo455H0(r1)
                r7.writeNoException()
                return r3
            L_0x00ae:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00b8
                r0 = 1
            L_0x00b8:
                r4.mo488r6(r0)
                r7.writeNoException()
                return r3
            L_0x00bf:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.mo484n0(r5)
                r7.writeNoException()
                return r3
            L_0x00cd:
                r6.enforceInterface(r2)
                boolean r5 = r4.mo485n7()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L_0x00db:
                r6.enforceInterface(r2)
                int r5 = r4.mo465R()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L_0x00e9:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00fb
                android.os.Parcelable$Creator r5 = android.net.Uri.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.net.Uri r5 = (android.net.Uri) r5
                goto L_0x00fc
            L_0x00fb:
                r5 = r1
            L_0x00fc:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x010b
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x010b:
                r4.mo468X3(r5, r1)
                r7.writeNoException()
                return r3
            L_0x0112:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0128
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0128:
                r4.mo470X7(r5, r1)
                r7.writeNoException()
                return r3
            L_0x012f:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0145
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0145:
                r4.mo491s6(r5, r1)
                r7.writeNoException()
                return r3
            L_0x014c:
                r6.enforceInterface(r2)
                r4.mo490s1()
                r7.writeNoException()
                return r3
            L_0x0156:
                r6.enforceInterface(r2)
                int r5 = r4.mo471a0()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L_0x0164:
                r6.enforceInterface(r2)
                android.os.Bundle r5 = r4.getExtras()
                r7.writeNoException()
                if (r5 == 0) goto L_0x0177
                r7.writeInt(r3)
                r5.writeToParcel(r7, r3)
                goto L_0x017a
            L_0x0177:
                r7.writeInt(r0)
            L_0x017a:
                return r3
            L_0x017b:
                r6.enforceInterface(r2)
                java.lang.CharSequence r5 = r4.mo466T()
                r7.writeNoException()
                if (r5 == 0) goto L_0x018e
                r7.writeInt(r3)
                android.text.TextUtils.writeToParcel(r5, r7, r3)
                goto L_0x0191
            L_0x018e:
                r7.writeInt(r0)
            L_0x0191:
                return r3
            L_0x0192:
                r6.enforceInterface(r2)
                java.util.List r5 = r4.mo493t0()
                r7.writeNoException()
                r7.writeTypedList(r5)
                return r3
            L_0x01a0:
                r6.enforceInterface(r2)
                android.support.v4.media.session.PlaybackStateCompat r5 = r4.mo458K()
                r7.writeNoException()
                if (r5 == 0) goto L_0x01b3
                r7.writeInt(r3)
                r5.writeToParcel(r7, r3)
                goto L_0x01b6
            L_0x01b3:
                r7.writeInt(r0)
            L_0x01b6:
                return r3
            L_0x01b7:
                r6.enforceInterface(r2)
                android.support.v4.media.MediaMetadataCompat r5 = r4.mo461O0()
                r7.writeNoException()
                if (r5 == 0) goto L_0x01ca
                r7.writeInt(r3)
                r5.writeToParcel(r7, r3)
                goto L_0x01cd
            L_0x01ca:
                r7.writeInt(r0)
            L_0x01cd:
                return r3
            L_0x01ce:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x01e4
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x01e4:
                r4.mo487r5(r5, r1)
                r7.writeNoException()
                return r3
            L_0x01eb:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x01fd
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r5 = android.support.p000v4.media.RatingCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                android.support.v4.media.RatingCompat r1 = (android.support.p000v4.media.RatingCompat) r1
            L_0x01fd:
                r4.mo454F5(r1)
                r7.writeNoException()
                return r3
            L_0x0204:
                r6.enforceInterface(r2)
                long r5 = r6.readLong()
                r4.mo459M4(r5)
                r7.writeNoException()
                return r3
            L_0x0212:
                r6.enforceInterface(r2)
                r4.mo495t7()
                r7.writeNoException()
                return r3
            L_0x021c:
                r6.enforceInterface(r2)
                r4.mo497u4()
                r7.writeNoException()
                return r3
            L_0x0226:
                r6.enforceInterface(r2)
                r4.mo486q7()
                r7.writeNoException()
                return r3
            L_0x0230:
                r6.enforceInterface(r2)
                r4.mo499x1()
                r7.writeNoException()
                return r3
            L_0x023a:
                r6.enforceInterface(r2)
                r4.stop()
                r7.writeNoException()
                return r3
            L_0x0244:
                r6.enforceInterface(r2)
                r4.mo496u0()
                r7.writeNoException()
                return r3
            L_0x024e:
                r6.enforceInterface(r2)
                long r5 = r6.readLong()
                r4.mo500z2(r5)
                r7.writeNoException()
                return r3
            L_0x025c:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x026e
                android.os.Parcelable$Creator r5 = android.net.Uri.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.net.Uri r5 = (android.net.Uri) r5
                goto L_0x026f
            L_0x026e:
                r5 = r1
            L_0x026f:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x027e
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x027e:
                r4.mo452A2(r5, r1)
                r7.writeNoException()
                return r3
            L_0x0285:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x029b
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x029b:
                r4.mo463P5(r5, r1)
                r7.writeNoException()
                return r3
            L_0x02a2:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x02b8
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x02b8:
                r4.mo472b4(r5, r1)
                r7.writeNoException()
                return r3
            L_0x02bf:
                r6.enforceInterface(r2)
                r4.mo483m5()
                r7.writeNoException()
                return r3
            L_0x02c9:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                java.lang.String r6 = r6.readString()
                r4.mo481j7(r5, r8, r6)
                r7.writeNoException()
                return r3
            L_0x02df:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                java.lang.String r6 = r6.readString()
                r4.mo477g8(r5, r8, r6)
                r7.writeNoException()
                return r3
            L_0x02f5:
                r6.enforceInterface(r2)
                android.support.v4.media.session.ParcelableVolumeInfo r5 = r4.mo479j4()
                r7.writeNoException()
                if (r5 == 0) goto L_0x0308
                r7.writeInt(r3)
                r5.writeToParcel(r7, r3)
                goto L_0x030b
            L_0x0308:
                r7.writeInt(r0)
            L_0x030b:
                return r3
            L_0x030c:
                r6.enforceInterface(r2)
                long r5 = r4.mo453F0()
                r7.writeNoException()
                r7.writeLong(r5)
                return r3
            L_0x031a:
                r6.enforceInterface(r2)
                android.app.PendingIntent r5 = r4.mo494t4()
                r7.writeNoException()
                if (r5 == 0) goto L_0x032d
                r7.writeInt(r3)
                r5.writeToParcel(r7, r3)
                goto L_0x0330
            L_0x032d:
                r7.writeInt(r0)
            L_0x0330:
                return r3
            L_0x0331:
                r6.enforceInterface(r2)
                java.lang.String r5 = r4.mo460O()
                r7.writeNoException()
                r7.writeString(r5)
                return r3
            L_0x033f:
                r6.enforceInterface(r2)
                java.lang.String r5 = r4.mo457J()
                r7.writeNoException()
                r7.writeString(r5)
                return r3
            L_0x034d:
                r6.enforceInterface(r2)
                boolean r5 = r4.mo469X6()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L_0x035b:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.v4.media.session.a r5 = android.support.p000v4.media.session.C0117a.C0118a.m818j8(r5)
                r4.mo480j6(r5)
                r7.writeNoException()
                return r3
            L_0x036d:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.v4.media.session.a r5 = android.support.p000v4.media.session.C0117a.C0118a.m818j8(r5)
                r4.mo473b5(r5)
                r7.writeNoException()
                return r3
            L_0x037f:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0391
                android.os.Parcelable$Creator r5 = android.view.KeyEvent.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                android.view.KeyEvent r1 = (android.view.KeyEvent) r1
            L_0x0391:
                boolean r5 = r4.mo475f2(r1)
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L_0x039c:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x03b2
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.os.Bundle r8 = (android.os.Bundle) r8
                goto L_0x03b3
            L_0x03b2:
                r8 = r1
            L_0x03b3:
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x03c2
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper> r0 = android.support.p000v4.media.session.MediaSessionCompat.ResultReceiverWrapper.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r1 = r6
                android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper r1 = (android.support.p000v4.media.session.MediaSessionCompat.ResultReceiverWrapper) r1
            L_0x03c2:
                r4.mo456H1(r5, r8, r1)
                r7.writeNoException()
                return r3
            L_0x03c9:
                r7.writeString(r2)
                return r3
            L_0x03cd:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x03df
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r5 = android.support.p000v4.media.RatingCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.support.v4.media.RatingCompat r5 = (android.support.p000v4.media.RatingCompat) r5
                goto L_0x03e0
            L_0x03df:
                r5 = r1
            L_0x03e0:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x03ef
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x03ef:
                r4.mo476g1(r5, r1)
                r7.writeNoException()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.media.session.C0120b.C0121a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: A2 */
    void mo452A2(Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: F0 */
    long mo453F0() throws RemoteException;

    /* renamed from: F5 */
    void mo454F5(RatingCompat ratingCompat) throws RemoteException;

    /* renamed from: H0 */
    void mo455H0(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    /* renamed from: H1 */
    void mo456H1(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException;

    /* renamed from: J */
    String mo457J() throws RemoteException;

    /* renamed from: K */
    PlaybackStateCompat mo458K() throws RemoteException;

    /* renamed from: M4 */
    void mo459M4(long j) throws RemoteException;

    /* renamed from: O */
    String mo460O() throws RemoteException;

    /* renamed from: O0 */
    MediaMetadataCompat mo461O0() throws RemoteException;

    /* renamed from: P0 */
    boolean mo462P0() throws RemoteException;

    /* renamed from: P5 */
    void mo463P5(String str, Bundle bundle) throws RemoteException;

    /* renamed from: P7 */
    void mo464P7(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException;

    /* renamed from: R */
    int mo465R() throws RemoteException;

    /* renamed from: T */
    CharSequence mo466T() throws RemoteException;

    /* renamed from: U */
    void mo467U(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    /* renamed from: X3 */
    void mo468X3(Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: X6 */
    boolean mo469X6() throws RemoteException;

    /* renamed from: X7 */
    void mo470X7(String str, Bundle bundle) throws RemoteException;

    /* renamed from: a0 */
    int mo471a0() throws RemoteException;

    /* renamed from: b4 */
    void mo472b4(String str, Bundle bundle) throws RemoteException;

    /* renamed from: b5 */
    void mo473b5(C0117a aVar) throws RemoteException;

    /* renamed from: c4 */
    void mo474c4(int i) throws RemoteException;

    /* renamed from: f2 */
    boolean mo475f2(KeyEvent keyEvent) throws RemoteException;

    /* renamed from: g1 */
    void mo476g1(RatingCompat ratingCompat, Bundle bundle) throws RemoteException;

    /* renamed from: g8 */
    void mo477g8(int i, int i2, String str) throws RemoteException;

    Bundle getExtras() throws RemoteException;

    /* renamed from: j4 */
    ParcelableVolumeInfo mo479j4() throws RemoteException;

    /* renamed from: j6 */
    void mo480j6(C0117a aVar) throws RemoteException;

    /* renamed from: j7 */
    void mo481j7(int i, int i2, String str) throws RemoteException;

    /* renamed from: l0 */
    int mo482l0() throws RemoteException;

    /* renamed from: m5 */
    void mo483m5() throws RemoteException;

    /* renamed from: n0 */
    void mo484n0(int i) throws RemoteException;

    /* renamed from: n7 */
    boolean mo485n7() throws RemoteException;

    /* renamed from: q7 */
    void mo486q7() throws RemoteException;

    /* renamed from: r5 */
    void mo487r5(String str, Bundle bundle) throws RemoteException;

    /* renamed from: r6 */
    void mo488r6(boolean z) throws RemoteException;

    /* renamed from: s0 */
    void mo489s0(int i) throws RemoteException;

    /* renamed from: s1 */
    void mo490s1() throws RemoteException;

    /* renamed from: s6 */
    void mo491s6(String str, Bundle bundle) throws RemoteException;

    void stop() throws RemoteException;

    /* renamed from: t0 */
    List<MediaSessionCompat.QueueItem> mo493t0() throws RemoteException;

    /* renamed from: t4 */
    PendingIntent mo494t4() throws RemoteException;

    /* renamed from: t7 */
    void mo495t7() throws RemoteException;

    /* renamed from: u0 */
    void mo496u0() throws RemoteException;

    /* renamed from: u4 */
    void mo497u4() throws RemoteException;

    /* renamed from: x0 */
    void mo498x0(boolean z) throws RemoteException;

    /* renamed from: x1 */
    void mo499x1() throws RemoteException;

    /* renamed from: z2 */
    void mo500z2(long j) throws RemoteException;
}
