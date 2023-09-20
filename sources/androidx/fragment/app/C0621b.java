package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.C0657l;
import androidx.lifecycle.C0690e;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b */
public final class C0621b implements Parcelable {
    public static final Parcelable.Creator<C0621b> CREATOR = new C0622a();

    /* renamed from: c */
    public static final String f3781c = "FragmentManager";

    /* renamed from: a */
    public final CharSequence f3782a;

    /* renamed from: a */
    public final ArrayList<String> f3783a;

    /* renamed from: a */
    public final int[] f3784a;

    /* renamed from: b */
    public final CharSequence f3785b;

    /* renamed from: b */
    public final String f3786b;

    /* renamed from: b */
    public final ArrayList<String> f3787b;

    /* renamed from: b */
    public final boolean f3788b;

    /* renamed from: b */
    public final int[] f3789b;

    /* renamed from: c */
    public final ArrayList<String> f3790c;

    /* renamed from: c */
    public final int[] f3791c;

    /* renamed from: n */
    public final int f3792n;

    /* renamed from: o */
    public final int f3793o;

    /* renamed from: p */
    public final int f3794p;

    /* renamed from: q */
    public final int f3795q;

    /* renamed from: androidx.fragment.app.b$a */
    public class C0622a implements Parcelable.Creator<C0621b> {
        /* renamed from: a */
        public C0621b createFromParcel(Parcel parcel) {
            return new C0621b(parcel);
        }

        /* renamed from: b */
        public C0621b[] newArray(int i) {
            return new C0621b[i];
        }
    }

    public C0621b(Parcel parcel) {
        this.f3784a = parcel.createIntArray();
        this.f3783a = parcel.createStringArrayList();
        this.f3789b = parcel.createIntArray();
        this.f3791c = parcel.createIntArray();
        this.f3792n = parcel.readInt();
        this.f3786b = parcel.readString();
        this.f3793o = parcel.readInt();
        this.f3794p = parcel.readInt();
        this.f3782a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3795q = parcel.readInt();
        this.f3785b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3787b = parcel.createStringArrayList();
        this.f3790c = parcel.createStringArrayList();
        this.f3788b = parcel.readInt() != 0;
    }

    public C0621b(C0620a aVar) {
        int size = aVar.f3926a.size();
        this.f3784a = new int[(size * 5)];
        if (aVar.f3927a) {
            this.f3783a = new ArrayList<>(size);
            this.f3789b = new int[size];
            this.f3791c = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0657l.C0658a aVar2 = aVar.f3926a.get(i);
                int i3 = i2 + 1;
                this.f3784a[i2] = aVar2.f3940a;
                ArrayList<String> arrayList = this.f3783a;
                Fragment fragment = aVar2.f3941a;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f3784a;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f3943b;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f3945c;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f3946d;
                iArr[i6] = aVar2.f3947e;
                this.f3789b[i] = aVar2.f3942a.ordinal();
                this.f3791c[i] = aVar2.f3944b.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.f3792n = aVar.f3937e;
            this.f3786b = aVar.f3925a;
            this.f3793o = aVar.f3780z;
            this.f3794p = aVar.f3938f;
            this.f3782a = aVar.f3923a;
            this.f3795q = aVar.f3939g;
            this.f3785b = aVar.f3929b;
            this.f3787b = aVar.f3930b;
            this.f3790c = aVar.f3933c;
            this.f3788b = aVar.f3934c;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C0620a mo4734a(FragmentManager fragmentManager) {
        C0620a aVar = new C0620a(fragmentManager);
        int i = 0;
        int i2 = 0;
        while (i < this.f3784a.length) {
            C0657l.C0658a aVar2 = new C0657l.C0658a();
            int i3 = i + 1;
            aVar2.f3940a = this.f3784a[i];
            if (FragmentManager.m4279T0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.f3784a[i3]);
            }
            String str = this.f3783a.get(i2);
            aVar2.f3941a = str != null ? fragmentManager.mo4601n0(str) : null;
            aVar2.f3942a = C0690e.C0693c.values()[this.f3789b[i2]];
            aVar2.f3944b = C0690e.C0693c.values()[this.f3791c[i2]];
            int[] iArr = this.f3784a;
            int i4 = i3 + 1;
            int i5 = iArr[i3];
            aVar2.f3943b = i5;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            aVar2.f3945c = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            aVar2.f3946d = i9;
            int i10 = iArr[i8];
            aVar2.f3947e = i10;
            aVar.f3921a = i5;
            aVar.f3928b = i7;
            aVar.f3932c = i9;
            aVar.f3935d = i10;
            aVar.mo4867m(aVar2);
            i2++;
            i = i8 + 1;
        }
        aVar.f3937e = this.f3792n;
        aVar.f3925a = this.f3786b;
        aVar.f3780z = this.f3793o;
        aVar.f3927a = true;
        aVar.f3938f = this.f3794p;
        aVar.f3923a = this.f3782a;
        aVar.f3939g = this.f3795q;
        aVar.f3929b = this.f3785b;
        aVar.f3930b = this.f3787b;
        aVar.f3933c = this.f3790c;
        aVar.f3934c = this.f3788b;
        aVar.mo4713U(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f3784a);
        parcel.writeStringList(this.f3783a);
        parcel.writeIntArray(this.f3789b);
        parcel.writeIntArray(this.f3791c);
        parcel.writeInt(this.f3792n);
        parcel.writeString(this.f3786b);
        parcel.writeInt(this.f3793o);
        parcel.writeInt(this.f3794p);
        TextUtils.writeToParcel(this.f3782a, parcel, 0);
        parcel.writeInt(this.f3795q);
        TextUtils.writeToParcel(this.f3785b, parcel, 0);
        parcel.writeStringList(this.f3787b);
        parcel.writeStringList(this.f3790c);
        parcel.writeInt(this.f3788b ? 1 : 0);
    }
}
