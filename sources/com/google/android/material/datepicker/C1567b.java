package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.C1563a;
import com.onedelhi.secure.k43;
import com.onedelhi.secure.mr2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.material.datepicker.b */
public final class C1567b implements C1563a.C1566c {
    public static final Parcelable.Creator<C1567b> CREATOR = new C1570c();

    /* renamed from: b */
    public static final C1571d f8222b = new C1568a();

    /* renamed from: c */
    public static final C1571d f8223c = new C1569b();

    /* renamed from: n */
    public static final int f8224n = 1;

    /* renamed from: o */
    public static final int f8225o = 2;
    @mr2

    /* renamed from: a */
    public final C1571d f8226a;
    @mr2

    /* renamed from: a */
    public final List<C1563a.C1566c> f8227a;

    /* renamed from: com.google.android.material.datepicker.b$a */
    public class C1568a implements C1571d {
        /* renamed from: a */
        public boolean mo12018a(@mr2 List<C1563a.C1566c> list, long j) {
            for (C1563a.C1566c next : list) {
                if (next != null && next.mo12013Z(j)) {
                    return true;
                }
            }
            return false;
        }

        public int getId() {
            return 1;
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$b */
    public class C1569b implements C1571d {
        /* renamed from: a */
        public boolean mo12018a(@mr2 List<C1563a.C1566c> list, long j) {
            for (C1563a.C1566c next : list) {
                if (next != null && !next.mo12013Z(j)) {
                    return false;
                }
            }
            return true;
        }

        public int getId() {
            return 2;
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$c */
    public class C1570c implements Parcelable.Creator<C1567b> {
        @mr2
        /* renamed from: a */
        public C1567b createFromParcel(@mr2 Parcel parcel) {
            ArrayList readArrayList = parcel.readArrayList(C1563a.C1566c.class.getClassLoader());
            int readInt = parcel.readInt();
            return new C1567b((List) k43.m19455l(readArrayList), (readInt != 2 && readInt == 1) ? C1567b.f8222b : C1567b.f8223c, (C1568a) null);
        }

        @mr2
        /* renamed from: b */
        public C1567b[] newArray(int i) {
            return new C1567b[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$d */
    public interface C1571d {
        /* renamed from: a */
        boolean mo12018a(@mr2 List<C1563a.C1566c> list, long j);

        int getId();
    }

    public C1567b(@mr2 List<C1563a.C1566c> list, C1571d dVar) {
        this.f8227a = list;
        this.f8226a = dVar;
    }

    public /* synthetic */ C1567b(List list, C1571d dVar, C1568a aVar) {
        this(list, dVar);
    }

    @mr2
    /* renamed from: c */
    public static C1563a.C1566c m10113c(@mr2 List<C1563a.C1566c> list) {
        return new C1567b(list, f8223c);
    }

    @mr2
    /* renamed from: d */
    public static C1563a.C1566c m10114d(@mr2 List<C1563a.C1566c> list) {
        return new C1567b(list, f8222b);
    }

    /* renamed from: Z */
    public boolean mo12013Z(long j) {
        return this.f8226a.mo12018a(this.f8227a, j);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1567b)) {
            return false;
        }
        C1567b bVar = (C1567b) obj;
        return this.f8227a.equals(bVar.f8227a) && this.f8226a.getId() == bVar.f8226a.getId();
    }

    public int hashCode() {
        return this.f8227a.hashCode();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        parcel.writeList(this.f8227a);
        parcel.writeInt(this.f8226a.getId());
    }
}
