package android.support.p000v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0106a();

    /* renamed from: n */
    public int f402n;

    /* renamed from: o */
    public int f403o;

    /* renamed from: p */
    public int f404p;

    /* renamed from: q */
    public int f405q;

    /* renamed from: r */
    public int f406r;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    public static class C0106a implements Parcelable.Creator<ParcelableVolumeInfo> {
        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(int i, int i2, int i3, int i4, int i5) {
        this.f402n = i;
        this.f403o = i2;
        this.f404p = i3;
        this.f405q = i4;
        this.f406r = i5;
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f402n = parcel.readInt();
        this.f404p = parcel.readInt();
        this.f405q = parcel.readInt();
        this.f406r = parcel.readInt();
        this.f403o = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f402n);
        parcel.writeInt(this.f404p);
        parcel.writeInt(this.f405q);
        parcel.writeInt(this.f406r);
        parcel.writeInt(this.f403o);
    }
}
