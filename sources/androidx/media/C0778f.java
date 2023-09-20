package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import androidx.media.C0773d;
import com.onedelhi.secure.ot2;
import com.onedelhi.secure.sj3;

@sj3(28)
/* renamed from: androidx.media.f */
public class C0778f extends C0777e {

    /* renamed from: a */
    public MediaSessionManager f4339a;

    /* renamed from: androidx.media.f$a */
    public static final class C0779a implements C0773d.C0776c {

        /* renamed from: a */
        public final MediaSessionManager.RemoteUserInfo f4340a;

        public C0779a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.f4340a = remoteUserInfo;
        }

        public C0779a(String str, int i, int i2) {
            this.f4340a = new MediaSessionManager.RemoteUserInfo(str, i, i2);
        }

        /* renamed from: J */
        public String mo5181J() {
            return this.f4340a.getPackageName();
        }

        /* renamed from: a */
        public int mo5182a() {
            return this.f4340a.getUid();
        }

        /* renamed from: b */
        public int mo5183b() {
            return this.f4340a.getPid();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0779a)) {
                return false;
            }
            return this.f4340a.equals(((C0779a) obj).f4340a);
        }

        public int hashCode() {
            return ot2.m24057b(this.f4340a);
        }
    }

    public C0778f(Context context) {
        super(context);
        this.f4339a = (MediaSessionManager) context.getSystemService("media_session");
    }

    /* renamed from: b */
    public boolean mo5175b(C0773d.C0776c cVar) {
        if (cVar instanceof C0779a) {
            return this.f4339a.isTrustedForMediaControl(((C0779a) cVar).f4340a);
        }
        return false;
    }
}
