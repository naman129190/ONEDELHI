package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.util.Log;
import androidx.media.C0778f;
import androidx.media.C0780g;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;

/* renamed from: androidx.media.d */
public final class C0773d {

    /* renamed from: a */
    public static volatile C0773d f4332a = null;

    /* renamed from: a */
    public static final Object f4333a = new Object();

    /* renamed from: a */
    public static final String f4334a = "MediaSessionManager";

    /* renamed from: a */
    public static final boolean f4335a = Log.isLoggable("MediaSessionManager", 3);

    /* renamed from: a */
    public C0774a f4336a;

    /* renamed from: androidx.media.d$a */
    public interface C0774a {
        /* renamed from: a */
        Context mo5174a();

        /* renamed from: b */
        boolean mo5175b(C0776c cVar);
    }

    /* renamed from: androidx.media.d$b */
    public static final class C0775b {

        /* renamed from: a */
        public static final String f4337a = "android.media.session.MediaController";

        /* renamed from: a */
        public C0776c f4338a;

        @sj3(28)
        @hl3({hl3.C2354a.f13187b})
        public C0775b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.f4338a = new C0778f.C0779a(remoteUserInfo);
        }

        public C0775b(@mr2 String str, int i, int i2) {
            this.f4338a = Build.VERSION.SDK_INT >= 28 ? new C0778f.C0779a(str, i, i2) : new C0780g.C0781a(str, i, i2);
        }

        @mr2
        /* renamed from: a */
        public String mo5176a() {
            return this.f4338a.mo5181J();
        }

        /* renamed from: b */
        public int mo5177b() {
            return this.f4338a.mo5183b();
        }

        /* renamed from: c */
        public int mo5178c() {
            return this.f4338a.mo5182a();
        }

        public boolean equals(@ts2 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0775b)) {
                return false;
            }
            return this.f4338a.equals(((C0775b) obj).f4338a);
        }

        public int hashCode() {
            return this.f4338a.hashCode();
        }
    }

    /* renamed from: androidx.media.d$c */
    public interface C0776c {
        /* renamed from: J */
        String mo5181J();

        /* renamed from: a */
        int mo5182a();

        /* renamed from: b */
        int mo5183b();
    }

    public C0773d(Context context) {
        this.f4336a = Build.VERSION.SDK_INT >= 28 ? new C0778f(context) : new C0777e(context);
    }

    @mr2
    /* renamed from: b */
    public static C0773d m5050b(@mr2 Context context) {
        C0773d dVar = f4332a;
        if (dVar == null) {
            synchronized (f4333a) {
                dVar = f4332a;
                if (dVar == null) {
                    f4332a = new C0773d(context.getApplicationContext());
                    dVar = f4332a;
                }
            }
        }
        return dVar;
    }

    /* renamed from: a */
    public Context mo5172a() {
        return this.f4336a.mo5174a();
    }

    /* renamed from: c */
    public boolean mo5173c(@mr2 C0775b bVar) {
        if (bVar != null) {
            return this.f4336a.mo5175b(bVar.f4338a);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }
}
