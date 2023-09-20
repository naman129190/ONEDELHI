package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.ws4;
import com.onedelhi.secure.ys4;

@SuppressLint({"BanParcelableUsage"})
@hl3({hl3.C2354a.f13185a})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C1096a();

    /* renamed from: a */
    public final ys4 f5755a;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    public static class C1096a implements Parcelable.Creator<ParcelImpl> {
        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f5755a = new ws4(parcel).mo26272g0();
    }

    public ParcelImpl(ys4 ys4) {
        this.f5755a = ys4;
    }

    /* renamed from: a */
    public <T extends ys4> T mo7068a() {
        return this.f5755a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new ws4(parcel).mo26288l1(this.f5755a);
    }
}
