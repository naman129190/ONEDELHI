package androidx.lifecycle;

import androidx.lifecycle.C0690e;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.qi2;

class CompositeGeneratedAdaptersObserver implements C0694f {

    /* renamed from: a */
    public final C0688c[] f4023a;

    public CompositeGeneratedAdaptersObserver(C0688c[] cVarArr) {
        this.f4023a = cVarArr;
    }

    /* renamed from: g */
    public void mo669g(@mr2 a32 a32, @mr2 C0690e.C0692b bVar) {
        qi2 qi2 = new qi2();
        for (C0688c a : this.f4023a) {
            a.mo4957a(a32, bVar, false, qi2);
        }
        for (C0688c a2 : this.f4023a) {
            a2.mo4957a(a32, bVar, true, qi2);
        }
    }
}
