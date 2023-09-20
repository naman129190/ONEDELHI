package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.ys4;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AudioAttributesCompat implements ys4 {

    /* renamed from: A */
    public static final int f4136A = 4;

    /* renamed from: B */
    public static final int f4137B = 8;

    /* renamed from: C */
    public static final int f4138C = 16;

    /* renamed from: D */
    public static final int f4139D = 32;

    /* renamed from: E */
    public static final int f4140E = 64;

    /* renamed from: F */
    public static final int f4141F = 128;

    /* renamed from: G */
    public static final int f4142G = 256;

    /* renamed from: H */
    public static final int f4143H = 512;

    /* renamed from: I */
    public static final int f4144I = 1023;

    /* renamed from: J */
    public static final int f4145J = 273;

    /* renamed from: K */
    public static final int f4146K = -1;

    /* renamed from: a */
    public static final int f4147a = 0;

    /* renamed from: a */
    public static final SparseIntArray f4148a;

    /* renamed from: a */
    public static final String f4149a = "AudioAttributesCompat";

    /* renamed from: a */
    public static boolean f4150a = false;

    /* renamed from: a */
    public static final int[] f4151a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};

    /* renamed from: b */
    public static final int f4152b = 1;

    /* renamed from: b */
    public static final String f4153b = "androidx.media.audio_attrs.FRAMEWORKS";

    /* renamed from: c */
    public static final int f4154c = 2;

    /* renamed from: c */
    public static final String f4155c = "androidx.media.audio_attrs.USAGE";

    /* renamed from: d */
    public static final int f4156d = 3;

    /* renamed from: d */
    public static final String f4157d = "androidx.media.audio_attrs.CONTENT_TYPE";

    /* renamed from: e */
    public static final int f4158e = 4;

    /* renamed from: e */
    public static final String f4159e = "androidx.media.audio_attrs.FLAGS";

    /* renamed from: f */
    public static final int f4160f = 0;

    /* renamed from: f */
    public static final String f4161f = "androidx.media.audio_attrs.LEGACY_STREAM_TYPE";

    /* renamed from: g */
    public static final int f4162g = 1;

    /* renamed from: h */
    public static final int f4163h = 2;

    /* renamed from: i */
    public static final int f4164i = 3;

    /* renamed from: j */
    public static final int f4165j = 4;

    /* renamed from: k */
    public static final int f4166k = 5;

    /* renamed from: l */
    public static final int f4167l = 6;

    /* renamed from: m */
    public static final int f4168m = 7;

    /* renamed from: n */
    public static final int f4169n = 8;

    /* renamed from: o */
    public static final int f4170o = 9;

    /* renamed from: p */
    public static final int f4171p = 10;

    /* renamed from: q */
    public static final int f4172q = 11;

    /* renamed from: r */
    public static final int f4173r = 12;

    /* renamed from: s */
    public static final int f4174s = 13;

    /* renamed from: t */
    public static final int f4175t = 14;

    /* renamed from: u */
    public static final int f4176u = 15;

    /* renamed from: v */
    public static final int f4177v = 16;

    /* renamed from: w */
    public static final int f4178w = 1;

    /* renamed from: x */
    public static final int f4179x = 2;

    /* renamed from: y */
    public static final int f4180y = 1;

    /* renamed from: z */
    public static final int f4181z = 2;

    /* renamed from: a */
    public AudioAttributesImpl f4182a;

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media.AudioAttributesCompat$a */
    public @interface C0721a {
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media.AudioAttributesCompat$b */
    public @interface C0722b {
    }

    /* renamed from: androidx.media.AudioAttributesCompat$c */
    public static abstract class C0723c {

        /* renamed from: a */
        public static final int f4183a = 6;

        /* renamed from: b */
        public static final int f4184b = 7;

        /* renamed from: c */
        public static final int f4185c = 9;

        /* renamed from: d */
        public static final int f4186d = 10;
    }

    /* renamed from: androidx.media.AudioAttributesCompat$d */
    public static class C0724d {

        /* renamed from: a */
        public int f4187a = 0;

        /* renamed from: b */
        public int f4188b = 0;

        /* renamed from: c */
        public int f4189c = 0;

        /* renamed from: d */
        public int f4190d = -1;

        public C0724d() {
        }

        public C0724d(AudioAttributesCompat audioAttributesCompat) {
            this.f4187a = audioAttributesCompat.mo5036c();
            this.f4188b = audioAttributesCompat.mo5037e();
            this.f4189c = audioAttributesCompat.mo5035b();
            this.f4190d = audioAttributesCompat.mo5041h();
        }

        /* renamed from: a */
        public AudioAttributesCompat mo5045a() {
            AudioAttributesImpl audioAttributesImpl;
            if (!AudioAttributesCompat.f4150a) {
                AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f4188b).setFlags(this.f4189c).setUsage(this.f4187a);
                int i = this.f4190d;
                if (i != -1) {
                    usage.setLegacyStreamType(i);
                }
                audioAttributesImpl = new AudioAttributesImplApi21(usage.build(), this.f4190d);
            } else {
                audioAttributesImpl = new AudioAttributesImplBase(this.f4188b, this.f4189c, this.f4187a, this.f4190d);
            }
            return new AudioAttributesCompat(audioAttributesImpl);
        }

        /* renamed from: b */
        public C0724d mo5046b(int i) {
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
                this.f4188b = i;
            } else {
                this.f4187a = 0;
            }
            return this;
        }

        /* renamed from: c */
        public C0724d mo5047c(int i) {
            this.f4189c = (i & 1023) | this.f4189c;
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
            r3.f4188b = 4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
            r3.f4188b = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
            r3.f4187a = androidx.media.AudioAttributesCompat.m4879n(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
            return r3;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.media.AudioAttributesCompat.C0724d mo5048d(int r4) {
            /*
                r3 = this;
                r0 = 1
                r1 = 4
                switch(r4) {
                    case 0: goto L_0x0034;
                    case 1: goto L_0x0031;
                    case 2: goto L_0x0031;
                    case 3: goto L_0x002f;
                    case 4: goto L_0x0031;
                    case 5: goto L_0x0031;
                    case 6: goto L_0x0027;
                    case 7: goto L_0x0021;
                    case 8: goto L_0x0031;
                    case 9: goto L_0x0031;
                    case 10: goto L_0x0034;
                    default: goto L_0x0005;
                }
            L_0x0005:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Invalid stream type "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = " for AudioAttributesCompat"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "AudioAttributesCompat"
                android.util.Log.e(r1, r0)
                goto L_0x0036
            L_0x0021:
                int r2 = r3.f4189c
                r0 = r0 | r2
                r3.f4189c = r0
                goto L_0x0031
            L_0x0027:
                r3.f4188b = r0
                int r0 = r3.f4189c
                r0 = r0 | r1
                r3.f4189c = r0
                goto L_0x0036
            L_0x002f:
                r0 = 2
                goto L_0x0034
            L_0x0031:
                r3.f4188b = r1
                goto L_0x0036
            L_0x0034:
                r3.f4188b = r0
            L_0x0036:
                int r4 = androidx.media.AudioAttributesCompat.m4879n(r4)
                r3.f4187a = r4
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media.AudioAttributesCompat.C0724d.mo5048d(int):androidx.media.AudioAttributesCompat$d");
        }

        /* renamed from: e */
        public C0724d mo5049e(int i) {
            if (i != 10) {
                this.f4190d = i;
                return mo5048d(i);
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }

        /* renamed from: f */
        public C0724d mo5050f(int i) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                case 16:
                    if (AudioAttributesCompat.f4150a || Build.VERSION.SDK_INT <= 25) {
                        i = 12;
                        break;
                    }
                default:
                    i = 0;
                    break;
            }
            this.f4187a = i;
            return this;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4148a = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public AudioAttributesCompat() {
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f4182a = audioAttributesImpl;
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: i */
    public static AudioAttributesCompat m4875i(Bundle bundle) {
        AudioAttributesImpl i = AudioAttributesImplApi21.m4904i(bundle);
        if (i == null) {
            return null;
        }
        return new AudioAttributesCompat(i);
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: j */
    public static void m4876j(boolean z) {
        f4150a = z;
    }

    /* renamed from: k */
    public static int m4877k(boolean z, int i, int i2) {
        if ((i & 1) == 1) {
            return z ? 1 : 7;
        }
        if ((i & 4) == 4) {
            return z ? 0 : 6;
        }
        switch (i2) {
            case 0:
                return z ? Integer.MIN_VALUE : 3;
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z ? 0 : 8;
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
            case 11:
                return 10;
            case 13:
                return 1;
            default:
                if (!z) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i2 + " in audio attributes");
        }
    }

    /* renamed from: l */
    public static int m4878l(boolean z, AudioAttributesCompat audioAttributesCompat) {
        return m4877k(z, audioAttributesCompat.mo5035b(), audioAttributesCompat.mo5036c());
    }

    /* renamed from: n */
    public static int m4879n(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 10:
                return 11;
            default:
                return 0;
        }
    }

    /* renamed from: o */
    public static String m4880o(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 16:
                return "USAGE_ASSISTANT";
            default:
                return "unknown usage " + i;
        }
    }

    @ts2
    /* renamed from: p */
    public static AudioAttributesCompat m4881p(@mr2 Object obj) {
        if (f4150a) {
            return null;
        }
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21((AudioAttributes) obj);
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f4182a = audioAttributesImplApi21;
        return audioAttributesCompat;
    }

    @mr2
    @hl3({hl3.C2354a.f13187b})
    /* renamed from: a */
    public Bundle mo5034a() {
        return this.f4182a.mo5051a();
    }

    /* renamed from: b */
    public int mo5035b() {
        return this.f4182a.mo5052b();
    }

    /* renamed from: c */
    public int mo5036c() {
        return this.f4182a.mo5053c();
    }

    /* renamed from: e */
    public int mo5037e() {
        return this.f4182a.mo5055e();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesImpl audioAttributesImpl = this.f4182a;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).f4182a;
        return audioAttributesImpl == null ? audioAttributesImpl2 == null : audioAttributesImpl.equals(audioAttributesImpl2);
    }

    /* renamed from: f */
    public int mo5039f() {
        return this.f4182a.mo5056f();
    }

    /* renamed from: g */
    public int mo5040g() {
        return this.f4182a.mo5057g();
    }

    /* renamed from: h */
    public int mo5041h() {
        return this.f4182a.mo5058h();
    }

    public int hashCode() {
        return this.f4182a.hashCode();
    }

    @ts2
    /* renamed from: m */
    public Object mo5043m() {
        return this.f4182a.mo5054d();
    }

    public String toString() {
        return this.f4182a.toString();
    }
}
