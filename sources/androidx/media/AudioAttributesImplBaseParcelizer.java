package androidx.media;

import com.onedelhi.secure.hl3;
import com.onedelhi.secure.vs4;

@hl3({hl3.C2354a.f13185a})
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(vs4 vs4) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f4195a = vs4.mo26226M(audioAttributesImplBase.f4195a, 1);
        audioAttributesImplBase.f4196b = vs4.mo26226M(audioAttributesImplBase.f4196b, 2);
        audioAttributesImplBase.f4197c = vs4.mo26226M(audioAttributesImplBase.f4197c, 3);
        audioAttributesImplBase.f4198d = vs4.mo26226M(audioAttributesImplBase.f4198d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, vs4 vs4) {
        vs4.mo26281j0(false, false);
        vs4.mo26227M0(audioAttributesImplBase.f4195a, 1);
        vs4.mo26227M0(audioAttributesImplBase.f4196b, 2);
        vs4.mo26227M0(audioAttributesImplBase.f4197c, 3);
        vs4.mo26227M0(audioAttributesImplBase.f4198d, 4);
    }
}
