package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

@SuppressLint({"BanParcelableUsage"})
public final class cb1 implements Parcelable {
    public static final Parcelable.Creator<cb1> CREATOR = new C1870a();

    /* renamed from: a */
    public final Bundle f10204a;

    /* renamed from: b */
    public Bundle f10205b;

    /* renamed from: b */
    public final String f10206b;

    /* renamed from: b */
    public final boolean f10207b;

    /* renamed from: c */
    public final String f10208c;

    /* renamed from: c */
    public final boolean f10209c;

    /* renamed from: d */
    public final String f10210d;

    /* renamed from: d */
    public final boolean f10211d;

    /* renamed from: e */
    public final boolean f10212e;

    /* renamed from: f */
    public final boolean f10213f;

    /* renamed from: n */
    public final int f10214n;

    /* renamed from: o */
    public final int f10215o;

    /* renamed from: p */
    public final int f10216p;

    /* renamed from: com.onedelhi.secure.cb1$a */
    public class C1870a implements Parcelable.Creator<cb1> {
        /* renamed from: a */
        public cb1 createFromParcel(Parcel parcel) {
            return new cb1(parcel);
        }

        /* renamed from: b */
        public cb1[] newArray(int i) {
            return new cb1[i];
        }
    }

    public cb1(Parcel parcel) {
        this.f10206b = parcel.readString();
        this.f10208c = parcel.readString();
        boolean z = true;
        this.f10207b = parcel.readInt() != 0;
        this.f10214n = parcel.readInt();
        this.f10215o = parcel.readInt();
        this.f10210d = parcel.readString();
        this.f10209c = parcel.readInt() != 0;
        this.f10211d = parcel.readInt() != 0;
        this.f10212e = parcel.readInt() != 0;
        this.f10204a = parcel.readBundle();
        this.f10213f = parcel.readInt() == 0 ? false : z;
        this.f10205b = parcel.readBundle();
        this.f10216p = parcel.readInt();
    }

    public cb1(Fragment fragment) {
        this.f10206b = fragment.getClass().getName();
        this.f10208c = fragment.mWho;
        this.f10207b = fragment.mFromLayout;
        this.f10214n = fragment.mFragmentId;
        this.f10215o = fragment.mContainerId;
        this.f10210d = fragment.mTag;
        this.f10209c = fragment.mRetainInstance;
        this.f10211d = fragment.mRemoving;
        this.f10212e = fragment.mDetached;
        this.f10204a = fragment.mArguments;
        this.f10213f = fragment.mHidden;
        this.f10216p = fragment.mMaxState.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    @mr2
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f10206b);
        sb.append(" (");
        sb.append(this.f10208c);
        sb.append(")}:");
        if (this.f10207b) {
            sb.append(" fromLayout");
        }
        if (this.f10215o != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f10215o));
        }
        String str = this.f10210d;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f10210d);
        }
        if (this.f10209c) {
            sb.append(" retainInstance");
        }
        if (this.f10211d) {
            sb.append(" removing");
        }
        if (this.f10212e) {
            sb.append(" detached");
        }
        if (this.f10213f) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10206b);
        parcel.writeString(this.f10208c);
        parcel.writeInt(this.f10207b ? 1 : 0);
        parcel.writeInt(this.f10214n);
        parcel.writeInt(this.f10215o);
        parcel.writeString(this.f10210d);
        parcel.writeInt(this.f10209c ? 1 : 0);
        parcel.writeInt(this.f10211d ? 1 : 0);
        parcel.writeInt(this.f10212e ? 1 : 0);
        parcel.writeBundle(this.f10204a);
        parcel.writeInt(this.f10213f ? 1 : 0);
        parcel.writeBundle(this.f10205b);
        parcel.writeInt(this.f10216p);
    }
}
