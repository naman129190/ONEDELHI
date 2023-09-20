package com.onedelhi.secure;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.C0552c;
import com.onedelhi.secure.hl3;

public final class zs0 {

    /* renamed from: a */
    public final C4130b f23870a;

    @sj3(19)
    /* renamed from: com.onedelhi.secure.zs0$a */
    public static class C4129a extends C4130b {

        /* renamed from: a */
        public final TextView f23871a;

        /* renamed from: a */
        public final vs0 f23872a;

        /* renamed from: a */
        public boolean f23873a = true;

        public C4129a(TextView textView) {
            this.f23871a = textView;
            this.f23872a = new vs0(textView);
        }

        @mr2
        /* renamed from: a */
        public InputFilter[] mo28105a(@mr2 InputFilter[] inputFilterArr) {
            return !this.f23873a ? mo28113i(inputFilterArr) : mo28111g(inputFilterArr);
        }

        /* renamed from: b */
        public boolean mo28106b() {
            return this.f23873a;
        }

        /* renamed from: c */
        public void mo28107c(boolean z) {
            if (z) {
                mo28109e();
            }
        }

        /* renamed from: d */
        public void mo28108d(boolean z) {
            this.f23873a = z;
            mo28109e();
            mo28116l();
        }

        /* renamed from: e */
        public void mo28109e() {
            this.f23871a.setTransformationMethod(mo28110f(this.f23871a.getTransformationMethod()));
        }

        @ts2
        /* renamed from: f */
        public TransformationMethod mo28110f(@ts2 TransformationMethod transformationMethod) {
            return this.f23873a ? mo28117m(transformationMethod) : mo28115k(transformationMethod);
        }

        @mr2
        /* renamed from: g */
        public final InputFilter[] mo28111g(@mr2 InputFilter[] inputFilterArr) {
            for (vs0 vs0 : inputFilterArr) {
                if (vs0 == this.f23872a) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, r0);
            inputFilterArr2[r0] = this.f23872a;
            return inputFilterArr2;
        }

        /* renamed from: h */
        public final SparseArray<InputFilter> mo28112h(@mr2 InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                if (inputFilterArr[i] instanceof vs0) {
                    sparseArray.put(i, inputFilterArr[i]);
                }
            }
            return sparseArray;
        }

        @mr2
        /* renamed from: i */
        public final InputFilter[] mo28113i(@mr2 InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> h = mo28112h(inputFilterArr);
            if (h.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - h.size())];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (h.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        @hl3({hl3.C2354a.LIBRARY})
        /* renamed from: j */
        public void mo28114j(boolean z) {
            this.f23873a = z;
        }

        @ts2
        /* renamed from: k */
        public final TransformationMethod mo28115k(@ts2 TransformationMethod transformationMethod) {
            return transformationMethod instanceof bt0 ? ((bt0) transformationMethod).mo13809a() : transformationMethod;
        }

        /* renamed from: l */
        public final void mo28116l() {
            this.f23871a.setFilters(mo28105a(this.f23871a.getFilters()));
        }

        @mr2
        /* renamed from: m */
        public final TransformationMethod mo28117m(@ts2 TransformationMethod transformationMethod) {
            return (!(transformationMethod instanceof bt0) && !(transformationMethod instanceof PasswordTransformationMethod)) ? new bt0(transformationMethod) : transformationMethod;
        }
    }

    /* renamed from: com.onedelhi.secure.zs0$b */
    public static class C4130b {
        @mr2
        /* renamed from: a */
        public InputFilter[] mo28105a(@mr2 InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        /* renamed from: b */
        public boolean mo28106b() {
            return false;
        }

        /* renamed from: c */
        public void mo28107c(boolean z) {
        }

        /* renamed from: d */
        public void mo28108d(boolean z) {
        }

        /* renamed from: e */
        public void mo28109e() {
        }

        @ts2
        /* renamed from: f */
        public TransformationMethod mo28110f(@ts2 TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }

    @sj3(19)
    /* renamed from: com.onedelhi.secure.zs0$c */
    public static class C4131c extends C4130b {

        /* renamed from: a */
        public final C4129a f23874a;

        public C4131c(TextView textView) {
            this.f23874a = new C4129a(textView);
        }

        @mr2
        /* renamed from: a */
        public InputFilter[] mo28105a(@mr2 InputFilter[] inputFilterArr) {
            return mo28118g() ? inputFilterArr : this.f23874a.mo28105a(inputFilterArr);
        }

        /* renamed from: b */
        public boolean mo28106b() {
            return this.f23874a.mo28106b();
        }

        /* renamed from: c */
        public void mo28107c(boolean z) {
            if (!mo28118g()) {
                this.f23874a.mo28107c(z);
            }
        }

        /* renamed from: d */
        public void mo28108d(boolean z) {
            if (mo28118g()) {
                this.f23874a.mo28114j(z);
            } else {
                this.f23874a.mo28108d(z);
            }
        }

        /* renamed from: e */
        public void mo28109e() {
            if (!mo28118g()) {
                this.f23874a.mo28109e();
            }
        }

        @ts2
        /* renamed from: f */
        public TransformationMethod mo28110f(@ts2 TransformationMethod transformationMethod) {
            return mo28118g() ? transformationMethod : this.f23874a.mo28110f(transformationMethod);
        }

        /* renamed from: g */
        public final boolean mo28118g() {
            return !C0552c.m4111n();
        }
    }

    public zs0(@mr2 TextView textView) {
        this(textView, true);
    }

    public zs0(@mr2 TextView textView, boolean z) {
        k43.m19456m(textView, "textView cannot be null");
        this.f23870a = !z ? new C4131c(textView) : new C4129a(textView);
    }

    @mr2
    /* renamed from: a */
    public InputFilter[] mo28099a(@mr2 InputFilter[] inputFilterArr) {
        return this.f23870a.mo28105a(inputFilterArr);
    }

    /* renamed from: b */
    public boolean mo28100b() {
        return this.f23870a.mo28106b();
    }

    /* renamed from: c */
    public void mo28101c(boolean z) {
        this.f23870a.mo28107c(z);
    }

    /* renamed from: d */
    public void mo28102d(boolean z) {
        this.f23870a.mo28108d(z);
    }

    /* renamed from: e */
    public void mo28103e() {
        this.f23870a.mo28109e();
    }

    @ts2
    /* renamed from: f */
    public TransformationMethod mo28104f(@ts2 TransformationMethod transformationMethod) {
        return this.f23870a.mo28110f(transformationMethod);
    }
}
