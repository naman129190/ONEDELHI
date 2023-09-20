package com.onedelhi.secure;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.yg1;
import java.lang.reflect.Method;

@hl3({hl3.C2354a.LIBRARY})
public class ws4 extends vs4 {

    /* renamed from: a */
    public static final boolean f22271a = false;

    /* renamed from: c */
    public static final String f22272c = "VersionedParcelParcel";

    /* renamed from: a */
    public final Parcel f22273a;

    /* renamed from: a */
    public final SparseIntArray f22274a;

    /* renamed from: b */
    public final String f22275b;

    /* renamed from: p */
    public final int f22276p;

    /* renamed from: q */
    public final int f22277q;

    /* renamed from: r */
    public int f22278r;

    /* renamed from: s */
    public int f22279s;

    /* renamed from: t */
    public int f22280t;

    public ws4(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C3042oa(), new C3042oa(), new C3042oa());
    }

    public ws4(Parcel parcel, int i, int i2, String str, C3042oa<String, Method> oaVar, C3042oa<String, Method> oaVar2, C3042oa<String, Class> oaVar3) {
        super(oaVar, oaVar2, oaVar3);
        this.f22274a = new SparseIntArray();
        this.f22278r = -1;
        this.f22280t = -1;
        this.f22273a = parcel;
        this.f22276p = i;
        this.f22277q = i2;
        this.f22279s = i;
        this.f22275b = str;
    }

    /* renamed from: C0 */
    public void mo26207C0(double d) {
        this.f22273a.writeDouble(d);
    }

    /* renamed from: F */
    public boolean mo26212F(int i) {
        while (this.f22279s < this.f22277q) {
            int i2 = this.f22280t;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f22273a.setDataPosition(this.f22279s);
            int readInt = this.f22273a.readInt();
            this.f22280t = this.f22273a.readInt();
            this.f22279s += readInt;
        }
        return this.f22280t == i;
    }

    /* renamed from: G */
    public float mo26214G() {
        return this.f22273a.readFloat();
    }

    /* renamed from: H0 */
    public void mo26217H0(float f) {
        this.f22273a.writeFloat(f);
    }

    /* renamed from: L */
    public int mo26224L() {
        return this.f22273a.readInt();
    }

    /* renamed from: L0 */
    public void mo26225L0(int i) {
        this.f22273a.writeInt(i);
    }

    /* renamed from: Q */
    public long mo26234Q() {
        return this.f22273a.readLong();
    }

    /* renamed from: Q0 */
    public void mo26235Q0(long j) {
        this.f22273a.writeLong(j);
    }

    /* renamed from: V */
    public <T extends Parcelable> T mo26244V() {
        return this.f22273a.readParcelable(getClass().getClassLoader());
    }

    /* renamed from: W0 */
    public void mo26247W0(Parcelable parcelable) {
        this.f22273a.writeParcelable(parcelable, 0);
    }

    /* renamed from: a */
    public void mo26254a() {
        int i = this.f22278r;
        if (i >= 0) {
            int i2 = this.f22274a.get(i);
            int dataPosition = this.f22273a.dataPosition();
            this.f22273a.setDataPosition(i2);
            this.f22273a.writeInt(dataPosition - i2);
            this.f22273a.setDataPosition(dataPosition);
        }
    }

    /* renamed from: c */
    public vs4 mo26260c() {
        Parcel parcel = this.f22273a;
        int dataPosition = parcel.dataPosition();
        int i = this.f22279s;
        if (i == this.f22276p) {
            i = this.f22277q;
        }
        int i2 = i;
        return new ws4(parcel, dataPosition, i2, this.f22275b + yg1.C3999a.f23084c, this.f21938a, this.f21939b, this.f21940c);
    }

    /* renamed from: c0 */
    public String mo26261c0() {
        return this.f22273a.readString();
    }

    /* renamed from: e0 */
    public IBinder mo26267e0() {
        return this.f22273a.readStrongBinder();
    }

    /* renamed from: e1 */
    public void mo26268e1(String str) {
        this.f22273a.writeString(str);
    }

    /* renamed from: g1 */
    public void mo26273g1(IBinder iBinder) {
        this.f22273a.writeStrongBinder(iBinder);
    }

    /* renamed from: i0 */
    public void mo26278i0(int i) {
        mo26254a();
        this.f22278r = i;
        this.f22274a.put(i, this.f22273a.dataPosition());
        mo26225L0(0);
        mo26225L0(i);
    }

    /* renamed from: i1 */
    public void mo26279i1(IInterface iInterface) {
        this.f22273a.writeStrongInterface(iInterface);
    }

    /* renamed from: l */
    public boolean mo26286l() {
        return this.f22273a.readInt() != 0;
    }

    /* renamed from: m0 */
    public void mo26290m0(boolean z) {
        this.f22273a.writeInt(z ? 1 : 0);
    }

    /* renamed from: p */
    public Bundle mo26297p() {
        return this.f22273a.readBundle(getClass().getClassLoader());
    }

    /* renamed from: q0 */
    public void mo26300q0(Bundle bundle) {
        this.f22273a.writeBundle(bundle);
    }

    /* renamed from: s */
    public byte[] mo26303s() {
        int readInt = this.f22273a.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f22273a.readByteArray(bArr);
        return bArr;
    }

    /* renamed from: t0 */
    public void mo26306t0(byte[] bArr) {
        if (bArr != null) {
            this.f22273a.writeInt(bArr.length);
            this.f22273a.writeByteArray(bArr);
            return;
        }
        this.f22273a.writeInt(-1);
    }

    /* renamed from: v */
    public CharSequence mo26309v() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f22273a);
    }

    /* renamed from: v0 */
    public void mo26310v0(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            this.f22273a.writeInt(bArr.length);
            this.f22273a.writeByteArray(bArr, i, i2);
            return;
        }
        this.f22273a.writeInt(-1);
    }

    /* renamed from: y */
    public double mo26315y() {
        return this.f22273a.readDouble();
    }

    /* renamed from: y0 */
    public void mo26316y0(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f22273a, 0);
    }
}
