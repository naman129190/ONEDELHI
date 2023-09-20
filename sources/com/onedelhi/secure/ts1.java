package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class ts1 implements Parcelable {
    @mr2
    public static final Parcelable.Creator<ts1> CREATOR = new C3661a();
    @ts2

    /* renamed from: a */
    public final Intent f21121a;
    @mr2

    /* renamed from: a */
    public final IntentSender f21122a;

    /* renamed from: n */
    public final int f21123n;

    /* renamed from: o */
    public final int f21124o;

    /* renamed from: com.onedelhi.secure.ts1$a */
    public class C3661a implements Parcelable.Creator<ts1> {
        /* renamed from: a */
        public ts1 createFromParcel(Parcel parcel) {
            return new ts1(parcel);
        }

        /* renamed from: b */
        public ts1[] newArray(int i) {
            return new ts1[i];
        }
    }

    /* renamed from: com.onedelhi.secure.ts1$b */
    public static final class C3662b {

        /* renamed from: a */
        public int f21125a;

        /* renamed from: a */
        public Intent f21126a;

        /* renamed from: a */
        public IntentSender f21127a;

        /* renamed from: b */
        public int f21128b;

        public C3662b(@mr2 PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }

        public C3662b(@mr2 IntentSender intentSender) {
            this.f21127a = intentSender;
        }

        @mr2
        /* renamed from: a */
        public ts1 mo25301a() {
            return new ts1(this.f21127a, this.f21126a, this.f21125a, this.f21128b);
        }

        @mr2
        /* renamed from: b */
        public C3662b mo25302b(@ts2 Intent intent) {
            this.f21126a = intent;
            return this;
        }

        @mr2
        /* renamed from: c */
        public C3662b mo25303c(int i, int i2) {
            this.f21128b = i;
            this.f21125a = i2;
            return this;
        }
    }

    public ts1(@mr2 IntentSender intentSender, @ts2 Intent intent, int i, int i2) {
        this.f21122a = intentSender;
        this.f21121a = intent;
        this.f21123n = i;
        this.f21124o = i2;
    }

    public ts1(@mr2 Parcel parcel) {
        this.f21122a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f21121a = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f21123n = parcel.readInt();
        this.f21124o = parcel.readInt();
    }

    @ts2
    /* renamed from: a */
    public Intent mo25291a() {
        return this.f21121a;
    }

    /* renamed from: b */
    public int mo25292b() {
        return this.f21123n;
    }

    /* renamed from: c */
    public int mo25293c() {
        return this.f21124o;
    }

    @mr2
    /* renamed from: d */
    public IntentSender mo25294d() {
        return this.f21122a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        parcel.writeParcelable(this.f21122a, i);
        parcel.writeParcelable(this.f21121a, i);
        parcel.writeInt(this.f21123n);
        parcel.writeInt(this.f21124o);
    }
}
