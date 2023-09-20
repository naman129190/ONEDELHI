package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: com.onedelhi.secure.i3 */
public final class C2394i3 implements Parcelable {
    @mr2
    public static final Parcelable.Creator<C2394i3> CREATOR = new C2395a();
    @ts2

    /* renamed from: a */
    public final Intent f13454a;

    /* renamed from: n */
    public final int f13455n;

    /* renamed from: com.onedelhi.secure.i3$a */
    public class C2395a implements Parcelable.Creator<C2394i3> {
        /* renamed from: a */
        public C2394i3 createFromParcel(@mr2 Parcel parcel) {
            return new C2394i3(parcel);
        }

        /* renamed from: b */
        public C2394i3[] newArray(int i) {
            return new C2394i3[i];
        }
    }

    public C2394i3(int i, @ts2 Intent intent) {
        this.f13455n = i;
        this.f13454a = intent;
    }

    public C2394i3(Parcel parcel) {
        this.f13455n = parcel.readInt();
        this.f13454a = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @mr2
    /* renamed from: c */
    public static String m17130c(int i) {
        return i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK";
    }

    @ts2
    /* renamed from: a */
    public Intent mo17514a() {
        return this.f13454a;
    }

    /* renamed from: b */
    public int mo17515b() {
        return this.f13455n;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m17130c(this.f13455n) + ", data=" + this.f13454a + '}';
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        parcel.writeInt(this.f13455n);
        parcel.writeInt(this.f13454a == null ? 0 : 1);
        Intent intent = this.f13454a;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
