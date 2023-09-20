package androidx.media;

import android.os.Bundle;
import com.onedelhi.secure.mr2;
import java.util.Arrays;

class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f4195a;

    /* renamed from: b */
    public int f4196b;

    /* renamed from: c */
    public int f4197c;

    /* renamed from: d */
    public int f4198d;

    public AudioAttributesImplBase() {
        this.f4195a = 0;
        this.f4196b = 0;
        this.f4197c = 0;
        this.f4198d = -1;
    }

    public AudioAttributesImplBase(int i, int i2, int i3, int i4) {
        this.f4196b = i;
        this.f4197c = i2;
        this.f4195a = i3;
        this.f4198d = i4;
    }

    /* renamed from: i */
    public static AudioAttributesImpl m4914i(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new AudioAttributesImplBase(bundle.getInt(AudioAttributesCompat.f4157d, 0), bundle.getInt(AudioAttributesCompat.f4159e, 0), bundle.getInt(AudioAttributesCompat.f4155c, 0), bundle.getInt(AudioAttributesCompat.f4161f, -1));
    }

    @mr2
    /* renamed from: a */
    public Bundle mo5051a() {
        Bundle bundle = new Bundle();
        bundle.putInt(AudioAttributesCompat.f4155c, this.f4195a);
        bundle.putInt(AudioAttributesCompat.f4157d, this.f4196b);
        bundle.putInt(AudioAttributesCompat.f4159e, this.f4197c);
        int i = this.f4198d;
        if (i != -1) {
            bundle.putInt(AudioAttributesCompat.f4161f, i);
        }
        return bundle;
    }

    /* renamed from: b */
    public int mo5052b() {
        int i = this.f4197c;
        int g = mo5057g();
        if (g == 6) {
            i |= 4;
        } else if (g == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: c */
    public int mo5053c() {
        return this.f4195a;
    }

    /* renamed from: d */
    public Object mo5054d() {
        return null;
    }

    /* renamed from: e */
    public int mo5055e() {
        return this.f4196b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f4196b == audioAttributesImplBase.mo5055e() && this.f4197c == audioAttributesImplBase.mo5052b() && this.f4195a == audioAttributesImplBase.mo5053c() && this.f4198d == audioAttributesImplBase.f4198d;
    }

    /* renamed from: f */
    public int mo5056f() {
        return AudioAttributesCompat.m4877k(true, this.f4197c, this.f4195a);
    }

    /* renamed from: g */
    public int mo5057g() {
        int i = this.f4198d;
        return i != -1 ? i : AudioAttributesCompat.m4877k(false, this.f4197c, this.f4195a);
    }

    /* renamed from: h */
    public int mo5058h() {
        return this.f4198d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4196b), Integer.valueOf(this.f4197c), Integer.valueOf(this.f4195a), Integer.valueOf(this.f4198d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f4198d != -1) {
            sb.append(" stream=");
            sb.append(this.f4198d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m4880o(this.f4195a));
        sb.append(" content=");
        sb.append(this.f4196b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f4197c).toUpperCase());
        return sb.toString();
    }
}
