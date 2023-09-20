package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.vs4;

@hl3({hl3.C2354a.f13185a})
public class IconCompatParcelizer {
    public static IconCompat read(vs4 vs4) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3321a = vs4.mo26226M(iconCompat.f3321a, 1);
        iconCompat.f3327a = vs4.mo26305t(iconCompat.f3327a, 2);
        iconCompat.f3324a = vs4.mo26246W(iconCompat.f3324a, 3);
        iconCompat.f3328b = vs4.mo26226M(iconCompat.f3328b, 4);
        iconCompat.f3330c = vs4.mo26226M(iconCompat.f3330c, 5);
        iconCompat.f3322a = (ColorStateList) vs4.mo26246W(iconCompat.f3322a, 6);
        iconCompat.f3326a = vs4.mo26264d0(iconCompat.f3326a, 7);
        iconCompat.f3329b = vs4.mo26264d0(iconCompat.f3329b, 8);
        iconCompat.mo3787i();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, vs4 vs4) {
        vs4.mo26281j0(true, true);
        iconCompat.mo3788j(vs4.mo26277i());
        int i = iconCompat.f3321a;
        if (-1 != i) {
            vs4.mo26227M0(i, 1);
        }
        byte[] bArr = iconCompat.f3327a;
        if (bArr != null) {
            vs4.mo26308u0(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f3324a;
        if (parcelable != null) {
            vs4.mo26249X0(parcelable, 3);
        }
        int i2 = iconCompat.f3328b;
        if (i2 != 0) {
            vs4.mo26227M0(i2, 4);
        }
        int i3 = iconCompat.f3330c;
        if (i3 != 0) {
            vs4.mo26227M0(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f3322a;
        if (colorStateList != null) {
            vs4.mo26249X0(colorStateList, 6);
        }
        String str = iconCompat.f3326a;
        if (str != null) {
            vs4.mo26270f1(str, 7);
        }
        String str2 = iconCompat.f3329b;
        if (str2 != null) {
            vs4.mo26270f1(str2, 8);
        }
    }
}
