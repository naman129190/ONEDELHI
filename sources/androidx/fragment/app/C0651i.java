package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.onedelhi.secure.cb1;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.i */
public final class C0651i implements Parcelable {
    public static final Parcelable.Creator<C0651i> CREATOR = new C0652a();

    /* renamed from: a */
    public ArrayList<cb1> f3870a;

    /* renamed from: a */
    public C0621b[] f3871a;

    /* renamed from: b */
    public String f3872b = null;

    /* renamed from: b */
    public ArrayList<String> f3873b;

    /* renamed from: c */
    public ArrayList<String> f3874c = new ArrayList<>();

    /* renamed from: d */
    public ArrayList<Bundle> f3875d = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<FragmentManager.C0609n> f3876e;

    /* renamed from: n */
    public int f3877n;

    /* renamed from: androidx.fragment.app.i$a */
    public class C0652a implements Parcelable.Creator<C0651i> {
        /* renamed from: a */
        public C0651i createFromParcel(Parcel parcel) {
            return new C0651i(parcel);
        }

        /* renamed from: b */
        public C0651i[] newArray(int i) {
            return new C0651i[i];
        }
    }

    public C0651i() {
    }

    public C0651i(Parcel parcel) {
        this.f3870a = parcel.createTypedArrayList(cb1.CREATOR);
        this.f3873b = parcel.createStringArrayList();
        this.f3871a = (C0621b[]) parcel.createTypedArray(C0621b.CREATOR);
        this.f3877n = parcel.readInt();
        this.f3872b = parcel.readString();
        this.f3874c = parcel.createStringArrayList();
        this.f3875d = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f3876e = parcel.createTypedArrayList(FragmentManager.C0609n.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f3870a);
        parcel.writeStringList(this.f3873b);
        parcel.writeTypedArray(this.f3871a, i);
        parcel.writeInt(this.f3877n);
        parcel.writeString(this.f3872b);
        parcel.writeStringList(this.f3874c);
        parcel.writeTypedList(this.f3875d);
        parcel.writeTypedList(this.f3876e);
    }
}
