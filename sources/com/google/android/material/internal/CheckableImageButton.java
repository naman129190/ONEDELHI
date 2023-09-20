package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C2015e0;
import com.onedelhi.secure.C3884x1;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.za3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: a */
    public static final int[] f24016a = {16842912};

    /* renamed from: c */
    public boolean f24017c;

    /* renamed from: d */
    public boolean f24018d;

    /* renamed from: e */
    public boolean f24019e;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    public class C4146a extends C3884x1 {
        public C4146a() {
        }

        /* renamed from: f */
        public void mo3892f(View view, @mr2 AccessibilityEvent accessibilityEvent) {
            super.mo3892f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        /* renamed from: g */
        public void mo3893g(View view, @mr2 C1638a2 a2Var) {
            super.mo3893g(view, a2Var);
            a2Var.mo12542U0(CheckableImageButton.this.mo28216a());
            a2Var.mo12545V0(CheckableImageButton.this.isChecked());
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$b */
    public static class C4147b extends C2015e0 {
        public static final Parcelable.Creator<C4147b> CREATOR = new C4148a();

        /* renamed from: b */
        public boolean f24021b;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$b$a */
        public class C4148a implements Parcelable.ClassLoaderCreator<C4147b> {
            @mr2
            /* renamed from: a */
            public C4147b createFromParcel(@mr2 Parcel parcel) {
                return new C4147b(parcel, (ClassLoader) null);
            }

            @mr2
            /* renamed from: b */
            public C4147b createFromParcel(@mr2 Parcel parcel, ClassLoader classLoader) {
                return new C4147b(parcel, classLoader);
            }

            @mr2
            /* renamed from: c */
            public C4147b[] newArray(int i) {
                return new C4147b[i];
            }
        }

        public C4147b(@mr2 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            mo28227b(parcel);
        }

        public C4147b(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        public final void mo28227b(@mr2 Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f24021b = z;
        }

        public void writeToParcel(@mr2 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f24021b ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, za3.C4057b.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24018d = true;
        this.f24019e = true;
        jt4.m18849B1(this, new C4146a());
    }

    /* renamed from: a */
    public boolean mo28216a() {
        return this.f24018d;
    }

    /* renamed from: b */
    public boolean mo28217b() {
        return this.f24019e;
    }

    public boolean isChecked() {
        return this.f24017c;
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.f24017c) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = f24016a;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4147b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4147b bVar = (C4147b) parcelable;
        super.onRestoreInstanceState(bVar.mo14959a());
        setChecked(bVar.f24021b);
    }

    @mr2
    public Parcelable onSaveInstanceState() {
        C4147b bVar = new C4147b(super.onSaveInstanceState());
        bVar.f24021b = this.f24017c;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.f24018d != z) {
            this.f24018d = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f24018d && this.f24017c != z) {
            this.f24017c = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f24019e = z;
    }

    public void setPressed(boolean z) {
        if (this.f24019e) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.f24017c);
    }
}
