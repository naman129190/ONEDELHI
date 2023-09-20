package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.onedelhi.secure.mr2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(21)
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public static final String f4191a = "AudioAttributesCompat21";

    /* renamed from: a */
    public static Method f4192a;

    /* renamed from: a */
    public int f4193a;

    /* renamed from: a */
    public AudioAttributes f4194a;

    public AudioAttributesImplApi21() {
        this.f4193a = -1;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.f4194a = audioAttributes;
        this.f4193a = i;
    }

    /* renamed from: i */
    public static AudioAttributesImpl m4904i(Bundle bundle) {
        AudioAttributes audioAttributes;
        if (bundle == null || (audioAttributes = (AudioAttributes) bundle.getParcelable(AudioAttributesCompat.f4153b)) == null) {
            return null;
        }
        return new AudioAttributesImplApi21(audioAttributes, bundle.getInt(AudioAttributesCompat.f4161f, -1));
    }

    /* renamed from: j */
    public static Method m4905j() {
        try {
            if (f4192a == null) {
                f4192a = AudioAttributes.class.getMethod("toLegacyStreamType", new Class[]{AudioAttributes.class});
            }
            return f4192a;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @mr2
    /* renamed from: a */
    public Bundle mo5051a() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(AudioAttributesCompat.f4153b, this.f4194a);
        int i = this.f4193a;
        if (i != -1) {
            bundle.putInt(AudioAttributesCompat.f4161f, i);
        }
        return bundle;
    }

    /* renamed from: b */
    public int mo5052b() {
        return this.f4194a.getFlags();
    }

    /* renamed from: c */
    public int mo5053c() {
        return this.f4194a.getUsage();
    }

    /* renamed from: d */
    public Object mo5054d() {
        return this.f4194a;
    }

    /* renamed from: e */
    public int mo5055e() {
        return this.f4194a.getContentType();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f4194a.equals(((AudioAttributesImplApi21) obj).f4194a);
    }

    /* renamed from: f */
    public int mo5056f() {
        return Build.VERSION.SDK_INT >= 26 ? this.f4194a.getVolumeControlStream() : AudioAttributesCompat.m4877k(true, mo5052b(), mo5053c());
    }

    /* renamed from: g */
    public int mo5057g() {
        int i = this.f4193a;
        if (i != -1) {
            return i;
        }
        Method j = m4905j();
        if (j == null) {
            Log.w(f4191a, "No AudioAttributes#toLegacyStreamType() on API: " + Build.VERSION.SDK_INT);
            return -1;
        }
        try {
            return ((Integer) j.invoke((Object) null, new Object[]{this.f4194a})).intValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w(f4191a, "getLegacyStreamType() failed on API: " + Build.VERSION.SDK_INT, e);
            return -1;
        }
    }

    /* renamed from: h */
    public int mo5058h() {
        return this.f4193a;
    }

    public int hashCode() {
        return this.f4194a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f4194a;
    }
}
