package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.vn1;

@SuppressLint({"BanParcelableUsage"})
@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class ul3 implements Parcelable {
    public static final Parcelable.Creator<ul3> CREATOR = new C3724a();

    /* renamed from: a */
    public final Handler f21429a;

    /* renamed from: a */
    public vn1 f21430a;

    /* renamed from: b */
    public final boolean f21431b;

    /* renamed from: com.onedelhi.secure.ul3$a */
    public class C3724a implements Parcelable.Creator<ul3> {
        /* renamed from: a */
        public ul3 createFromParcel(Parcel parcel) {
            return new ul3(parcel);
        }

        /* renamed from: b */
        public ul3[] newArray(int i) {
            return new ul3[i];
        }
    }

    /* renamed from: com.onedelhi.secure.ul3$b */
    public class C3725b extends vn1.C3801b {
        public C3725b() {
        }

        /* renamed from: F6 */
        public void mo25668F6(int i, Bundle bundle) {
            ul3 ul3 = ul3.this;
            Handler handler = ul3.f21429a;
            if (handler != null) {
                handler.post(new C3726c(i, bundle));
            } else {
                ul3.mo16a(i, bundle);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.ul3$c */
    public class C3726c implements Runnable {

        /* renamed from: a */
        public final Bundle f21433a;

        /* renamed from: n */
        public final int f21435n;

        public C3726c(int i, Bundle bundle) {
            this.f21435n = i;
            this.f21433a = bundle;
        }

        public void run() {
            ul3.this.mo16a(this.f21435n, this.f21433a);
        }
    }

    public ul3(Handler handler) {
        this.f21431b = true;
        this.f21429a = handler;
    }

    public ul3(Parcel parcel) {
        this.f21431b = false;
        this.f21429a = null;
        this.f21430a = vn1.C3801b.m30233j8(parcel.readStrongBinder());
    }

    /* renamed from: a */
    public void mo16a(int i, Bundle bundle) {
    }

    /* renamed from: b */
    public void mo25661b(int i, Bundle bundle) {
        if (this.f21431b) {
            Handler handler = this.f21429a;
            if (handler != null) {
                handler.post(new C3726c(i, bundle));
            } else {
                mo16a(i, bundle);
            }
        } else {
            vn1 vn1 = this.f21430a;
            if (vn1 != null) {
                try {
                    vn1.mo25668F6(i, bundle);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        synchronized (this) {
            if (this.f21430a == null) {
                this.f21430a = new C3725b();
            }
            parcel.writeStrongBinder(this.f21430a.asBinder());
        }
    }
}
