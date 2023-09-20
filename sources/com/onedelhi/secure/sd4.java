package com.onedelhi.secure;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public class sd4 implements Parcelable {
    public static final Parcelable.Creator<sd4> CREATOR = new C6756a();

    /* renamed from: b */
    public static final String f34978b = "%02d";

    /* renamed from: c */
    public static final String f34979c = "%d";

    /* renamed from: a */
    public final wf2 f34980a;

    /* renamed from: b */
    public final wf2 f34981b;

    /* renamed from: n */
    public final int f34982n;

    /* renamed from: o */
    public int f34983o;

    /* renamed from: p */
    public int f34984p;

    /* renamed from: q */
    public int f34985q;

    /* renamed from: r */
    public int f34986r;

    /* renamed from: com.onedelhi.secure.sd4$a */
    public class C6756a implements Parcelable.Creator<sd4> {
        /* renamed from: a */
        public sd4 createFromParcel(Parcel parcel) {
            return new sd4(parcel);
        }

        /* renamed from: b */
        public sd4[] newArray(int i) {
            return new sd4[i];
        }
    }

    public sd4() {
        this(0);
    }

    public sd4(int i) {
        this(0, 0, 10, i);
    }

    public sd4(int i, int i2, int i3, int i4) {
        this.f34983o = i;
        this.f34984p = i2;
        this.f34985q = i3;
        this.f34982n = i4;
        this.f34986r = m64463f(i);
        this.f34980a = new wf2(59);
        this.f34981b = new wf2(i4 == 1 ? 24 : 12);
    }

    public sd4(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    /* renamed from: a */
    public static String m64461a(Resources resources, CharSequence charSequence) {
        return m64462b(resources, charSequence, f34978b);
    }

    /* renamed from: b */
    public static String m64462b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
    }

    /* renamed from: f */
    public static int m64463f(int i) {
        return i >= 12 ? 1 : 0;
    }

    /* renamed from: c */
    public int mo44282c() {
        if (this.f34982n == 1) {
            return this.f34983o % 24;
        }
        int i = this.f34983o;
        if (i % 12 == 0) {
            return 12;
        }
        return this.f34986r == 1 ? i - 12 : i;
    }

    /* renamed from: d */
    public wf2 mo44283d() {
        return this.f34981b;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public wf2 mo44285e() {
        return this.f34980a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd4)) {
            return false;
        }
        sd4 sd4 = (sd4) obj;
        return this.f34983o == sd4.f34983o && this.f34984p == sd4.f34984p && this.f34982n == sd4.f34982n && this.f34985q == sd4.f34985q;
    }

    /* renamed from: h */
    public void mo44287h(int i) {
        if (this.f34982n == 1) {
            this.f34983o = i;
            return;
        }
        int i2 = 12;
        int i3 = i % 12;
        if (this.f34986r != 1) {
            i2 = 0;
        }
        this.f34983o = i3 + i2;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f34982n), Integer.valueOf(this.f34983o), Integer.valueOf(this.f34984p), Integer.valueOf(this.f34985q)});
    }

    /* renamed from: i */
    public void mo44289i(int i) {
        this.f34986r = m64463f(i);
        this.f34983o = i;
    }

    /* renamed from: j */
    public void mo44290j(@js1(from = 0, mo18580to = 59) int i) {
        this.f34984p = i % 60;
    }

    /* renamed from: k */
    public void mo44291k(int i) {
        int i2;
        if (i != this.f34986r) {
            this.f34986r = i;
            int i3 = this.f34983o;
            if (i3 < 12 && i == 1) {
                i2 = i3 + 12;
            } else if (i3 >= 12 && i == 0) {
                i2 = i3 - 12;
            } else {
                return;
            }
            this.f34983o = i2;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f34983o);
        parcel.writeInt(this.f34984p);
        parcel.writeInt(this.f34985q);
        parcel.writeInt(this.f34982n);
    }
}
