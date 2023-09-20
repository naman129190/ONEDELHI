package androidx.media;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.C0773d;
import com.onedelhi.secure.ar4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ot2;

/* renamed from: androidx.media.g */
public class C0780g implements C0773d.C0774a {

    /* renamed from: a */
    public static final String f4341a = "MediaSessionManager";

    /* renamed from: a */
    public static final boolean f4342a = C0773d.f4335a;

    /* renamed from: b */
    public static final String f4343b = "android.permission.STATUS_BAR_SERVICE";

    /* renamed from: c */
    public static final String f4344c = "android.permission.MEDIA_CONTENT_CONTROL";

    /* renamed from: d */
    public static final String f4345d = "enabled_notification_listeners";

    /* renamed from: a */
    public ContentResolver f4346a;

    /* renamed from: a */
    public Context f4347a;

    /* renamed from: androidx.media.g$a */
    public static class C0781a implements C0773d.C0776c {

        /* renamed from: a */
        public int f4348a;

        /* renamed from: a */
        public String f4349a;

        /* renamed from: b */
        public int f4350b;

        public C0781a(String str, int i, int i2) {
            this.f4349a = str;
            this.f4348a = i;
            this.f4350b = i2;
        }

        /* renamed from: J */
        public String mo5181J() {
            return this.f4349a;
        }

        /* renamed from: a */
        public int mo5182a() {
            return this.f4350b;
        }

        /* renamed from: b */
        public int mo5183b() {
            return this.f4348a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0781a)) {
                return false;
            }
            C0781a aVar = (C0781a) obj;
            return TextUtils.equals(this.f4349a, aVar.f4349a) && this.f4348a == aVar.f4348a && this.f4350b == aVar.f4350b;
        }

        public int hashCode() {
            return ot2.m24057b(this.f4349a, Integer.valueOf(this.f4348a), Integer.valueOf(this.f4350b));
        }
    }

    public C0780g(Context context) {
        this.f4347a = context;
        this.f4346a = context.getContentResolver();
    }

    /* renamed from: a */
    public Context mo5174a() {
        return this.f4347a;
    }

    /* renamed from: b */
    public boolean mo5175b(@mr2 C0773d.C0776c cVar) {
        try {
            if (this.f4347a.getPackageManager().getApplicationInfo(cVar.mo5181J(), 0).uid == cVar.mo5182a()) {
                return mo5188d(cVar, f4343b) || mo5188d(cVar, f4344c) || cVar.mo5182a() == 1000 || mo5187c(cVar);
            }
            if (f4342a) {
                Log.d("MediaSessionManager", "Package name " + cVar.mo5181J() + " doesn't match with the uid " + cVar.mo5182a());
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            if (f4342a) {
                Log.d("MediaSessionManager", "Package " + cVar.mo5181J() + " doesn't exist");
            }
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo5187c(@mr2 C0773d.C0776c cVar) {
        String string = Settings.Secure.getString(this.f4346a, "enabled_notification_listeners");
        if (string != null) {
            String[] split = string.split(ar4.f25981a);
            for (String unflattenFromString : split) {
                ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                if (unflattenFromString2 != null && unflattenFromString2.getPackageName().equals(cVar.mo5181J())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo5188d(C0773d.C0776c cVar, String str) {
        return cVar.mo5183b() < 0 ? this.f4347a.getPackageManager().checkPermission(str, cVar.mo5181J()) == 0 : this.f4347a.checkPermission(str, cVar.mo5183b(), cVar.mo5182a()) == 0;
    }
}
