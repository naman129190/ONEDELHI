package com.onedelhi.secure;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0248e;
import androidx.appcompat.view.menu.C0253h;
import androidx.appcompat.view.menu.C0258j;
import androidx.appcompat.view.menu.C0260k;
import androidx.appcompat.view.menu.C0265m;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class mn2 implements C0258j {

    /* renamed from: a */
    public C0248e f32188a;

    /* renamed from: a */
    public NavigationBarMenuView f32189a;

    /* renamed from: b */
    public boolean f32190b = false;

    /* renamed from: n */
    public int f32191n;

    /* renamed from: com.onedelhi.secure.mn2$a */
    public static class C6127a implements Parcelable {
        public static final Parcelable.Creator<C6127a> CREATOR = new C6128a();
        @ts2

        /* renamed from: a */
        public qy2 f32192a;

        /* renamed from: n */
        public int f32193n;

        /* renamed from: com.onedelhi.secure.mn2$a$a */
        public class C6128a implements Parcelable.Creator<C6127a> {
            @mr2
            /* renamed from: a */
            public C6127a createFromParcel(@mr2 Parcel parcel) {
                return new C6127a(parcel);
            }

            @mr2
            /* renamed from: b */
            public C6127a[] newArray(int i) {
                return new C6127a[i];
            }
        }

        public C6127a() {
        }

        public C6127a(@mr2 Parcel parcel) {
            this.f32193n = parcel.readInt();
            this.f32192a = (qy2) parcel.readParcelable(getClass().getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@mr2 Parcel parcel, int i) {
            parcel.writeInt(this.f32193n);
            parcel.writeParcelable(this.f32192a, 0);
        }
    }

    /* renamed from: a */
    public void mo40719a(int i) {
        this.f32191n = i;
    }

    /* renamed from: b */
    public void mo1212b(@ts2 C0248e eVar, boolean z) {
    }

    /* renamed from: c */
    public void mo40720c(@mr2 NavigationBarMenuView navigationBarMenuView) {
        this.f32189a = navigationBarMenuView;
    }

    /* renamed from: d */
    public void mo1214d(boolean z) {
        if (!this.f32190b) {
            if (z) {
                this.f32189a.mo28345c();
            } else {
                this.f32189a.mo28380r();
            }
        }
    }

    /* renamed from: e */
    public boolean mo1215e() {
        return false;
    }

    @ts2
    /* renamed from: f */
    public C0260k mo1216f(@ts2 ViewGroup viewGroup) {
        return this.f32189a;
    }

    /* renamed from: g */
    public void mo1217g(@mr2 Context context, @mr2 C0248e eVar) {
        this.f32188a = eVar;
        this.f32189a.mo1198g(eVar);
    }

    public int getId() {
        return this.f32191n;
    }

    /* renamed from: h */
    public boolean mo1219h(@ts2 C0265m mVar) {
        return false;
    }

    @mr2
    /* renamed from: i */
    public Parcelable mo1240i() {
        C6127a aVar = new C6127a();
        aVar.f32193n = this.f32189a.getSelectedItemId();
        aVar.f32192a = C3711ui.m29361h(this.f32189a.getBadgeDrawables());
        return aVar;
    }

    /* renamed from: j */
    public void mo1220j(@ts2 C0258j.C0259a aVar) {
    }

    /* renamed from: k */
    public boolean mo1221k(@ts2 C0248e eVar, @ts2 C0253h hVar) {
        return false;
    }

    /* renamed from: l */
    public void mo40721l(boolean z) {
        this.f32190b = z;
    }

    /* renamed from: m */
    public boolean mo1223m(@ts2 C0248e eVar, @ts2 C0253h hVar) {
        return false;
    }

    /* renamed from: n */
    public void mo1242n(@mr2 Parcelable parcelable) {
        if (parcelable instanceof C6127a) {
            C6127a aVar = (C6127a) parcelable;
            this.f32189a.mo28379q(aVar.f32193n);
            this.f32189a.mo28378p(C3711ui.m29360g(this.f32189a.getContext(), aVar.f32192a));
        }
    }
}
