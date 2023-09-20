package androidx.lifecycle;

import androidx.lifecycle.C0690e;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.br3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.wq3;

final class SavedStateHandleController implements C0694f {

    /* renamed from: a */
    public final wq3 f4059a;

    /* renamed from: b */
    public final String f4060b;

    /* renamed from: b */
    public boolean f4061b = false;

    public SavedStateHandleController(String str, wq3 wq3) {
        this.f4060b = str;
        this.f4059a = wq3;
    }

    /* renamed from: g */
    public void mo669g(@mr2 a32 a32, @mr2 C0690e.C0692b bVar) {
        if (bVar == C0690e.C0692b.ON_DESTROY) {
            this.f4061b = false;
            a32.getLifecycle().mo4960c(this);
        }
    }

    /* renamed from: h */
    public void mo4940h(br3 br3, C0690e eVar) {
        if (!this.f4061b) {
            this.f4061b = true;
            eVar.mo4958a(this);
            br3.mo13803j(this.f4060b, this.f4059a.mo26654o());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    /* renamed from: i */
    public wq3 mo4941i() {
        return this.f4059a;
    }

    /* renamed from: j */
    public boolean mo4942j() {
        return this.f4061b;
    }
}
