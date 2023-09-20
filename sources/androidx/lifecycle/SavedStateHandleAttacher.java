package androidx.lifecycle;

import androidx.lifecycle.C0690e;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.yq3;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/f;", "Lcom/onedelhi/secure/a32;", "source", "Landroidx/lifecycle/e$b;", "event", "Lcom/onedelhi/secure/un4;", "g", "Lcom/onedelhi/secure/yq3;", "provider", "<init>", "(Lcom/onedelhi/secure/yq3;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0})
public final class SavedStateHandleAttacher implements C0694f {
    @vr2

    /* renamed from: a */
    public final yq3 f4058a;

    public SavedStateHandleAttacher(@vr2 yq3 yq3) {
        jt1.m53777p(yq3, "provider");
        this.f4058a = yq3;
    }

    /* renamed from: g */
    public void mo669g(@vr2 a32 a32, @vr2 C0690e.C0692b bVar) {
        jt1.m53777p(a32, "source");
        jt1.m53777p(bVar, "event");
        if (bVar == C0690e.C0692b.ON_CREATE) {
            a32.getLifecycle().mo4960c(this);
            this.f4058a.mo27664d();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + bVar).toString());
    }
}
