package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0857c;
import androidx.recyclerview.widget.C0863d;
import androidx.recyclerview.widget.C0898i;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0803f0;
import com.onedelhi.secure.h42;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.q */
public abstract class C0935q<T, VH extends RecyclerView.C0803f0> extends RecyclerView.C0805h<VH> {

    /* renamed from: a */
    public final C0863d.C0867b<T> f5180a;

    /* renamed from: a */
    public final C0863d<T> f5181a;

    /* renamed from: androidx.recyclerview.widget.q$a */
    public class C0936a implements C0863d.C0867b<T> {
        public C0936a() {
        }

        /* renamed from: a */
        public void mo6181a(@mr2 List<T> list, @mr2 List<T> list2) {
            C0935q.this.mo6487L(list, list2);
        }
    }

    public C0935q(@mr2 C0857c<T> cVar) {
        C0936a aVar = new C0936a();
        this.f5180a = aVar;
        C0863d<T> dVar = new C0863d<>((h42) new C0848b(this), cVar);
        this.f5181a = dVar;
        dVar.mo6167a(aVar);
    }

    public C0935q(@mr2 C0898i.C0904f<T> fVar) {
        C0936a aVar = new C0936a();
        this.f5180a = aVar;
        C0863d<T> dVar = new C0863d<>((h42) new C0848b(this), new C0857c.C0858a(fVar).mo6157a());
        this.f5181a = dVar;
        dVar.mo6167a(aVar);
    }

    @mr2
    /* renamed from: J */
    public List<T> mo6485J() {
        return this.f5181a.mo6168b();
    }

    /* renamed from: K */
    public T mo6486K(int i) {
        return this.f5181a.mo6168b().get(i);
    }

    /* renamed from: L */
    public void mo6487L(@mr2 List<T> list, @mr2 List<T> list2) {
    }

    /* renamed from: M */
    public void mo6488M(@ts2 List<T> list) {
        this.f5181a.mo6172f(list);
    }

    /* renamed from: N */
    public void mo6489N(@ts2 List<T> list, @ts2 Runnable runnable) {
        this.f5181a.mo6173g(list, runnable);
    }

    /* renamed from: g */
    public int mo5711g() {
        return this.f5181a.mo6168b().size();
    }
}
