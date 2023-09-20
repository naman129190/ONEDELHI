package androidx.media;

import android.media.AudioAttributes;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.vs4;

@hl3({hl3.C2354a.f13185a})
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(vs4 vs4) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f4194a = (AudioAttributes) vs4.mo26246W(audioAttributesImplApi21.f4194a, 1);
        audioAttributesImplApi21.f4193a = vs4.mo26226M(audioAttributesImplApi21.f4193a, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, vs4 vs4) {
        vs4.mo26281j0(false, false);
        vs4.mo26249X0(audioAttributesImplApi21.f4194a, 1);
        vs4.mo26227M0(audioAttributesImplApi21.f4193a, 2);
    }
}
