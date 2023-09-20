package androidx.media;

import com.onedelhi.secure.hl3;
import com.onedelhi.secure.vs4;

@hl3({hl3.C2354a.f13185a})
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(vs4 vs4) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f4182a = (AudioAttributesImpl) vs4.mo26275h0(audioAttributesCompat.f4182a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, vs4 vs4) {
        vs4.mo26281j0(false, false);
        vs4.mo26291m1(audioAttributesCompat.f4182a, 1);
    }
}
