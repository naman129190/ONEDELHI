package androidx.databinding;

import androidx.databinding.C0519f;
import com.onedelhi.secure.mr2;

/* renamed from: androidx.databinding.a */
public class C0509a implements C0519f {

    /* renamed from: a */
    public transient C0527k f3421a;

    /* renamed from: a */
    public void mo3970a(@mr2 C0519f.C0520a aVar) {
        synchronized (this) {
            C0527k kVar = this.f3421a;
            if (kVar != null) {
                kVar.mo3987m(aVar);
            }
        }
    }

    /* renamed from: b */
    public void mo3971b(@mr2 C0519f.C0520a aVar) {
        synchronized (this) {
            if (this.f3421a == null) {
                this.f3421a = new C0527k();
            }
        }
        this.f3421a.mo3974a(aVar);
    }

    /* renamed from: d */
    public void mo3972d() {
        synchronized (this) {
            C0527k kVar = this.f3421a;
            if (kVar != null) {
                kVar.mo3982h(this, 0, null);
            }
        }
    }

    /* renamed from: e */
    public void mo3973e(int i) {
        synchronized (this) {
            C0527k kVar = this.f3421a;
            if (kVar != null) {
                kVar.mo3982h(this, i, null);
            }
        }
    }
}
