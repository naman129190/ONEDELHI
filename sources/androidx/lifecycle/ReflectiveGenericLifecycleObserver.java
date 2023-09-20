package androidx.lifecycle;

import androidx.lifecycle.C0685b;
import androidx.lifecycle.C0690e;
import com.onedelhi.secure.a32;
import com.onedelhi.secure.mr2;

@Deprecated
class ReflectiveGenericLifecycleObserver implements C0694f {

    /* renamed from: a */
    public final C0685b.C0686a f4056a;

    /* renamed from: a */
    public final Object f4057a;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f4057a = obj;
        this.f4056a = C0685b.f4068a.mo4950c(obj.getClass());
    }

    /* renamed from: g */
    public void mo669g(@mr2 a32 a32, @mr2 C0690e.C0692b bVar) {
        this.f4056a.mo4953a(a32, bVar, this.f4057a);
    }
}
