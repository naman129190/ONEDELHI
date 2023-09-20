package com.onedelhi.secure;

import androidx.lifecycle.C0709m;
import com.onedelhi.secure.au4;
import com.onedelhi.secure.jb0;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\b\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/onedelhi/secure/du4;", "Lcom/onedelhi/secure/au4;", "VM", "Lcom/onedelhi/secure/w12;", "", "N1", "a", "()Lcom/onedelhi/secure/au4;", "value", "Lcom/onedelhi/secure/hx1;", "viewModelClass", "Lkotlin/Function0;", "Lcom/onedelhi/secure/gu4;", "storeProducer", "Landroidx/lifecycle/m$b;", "factoryProducer", "Lcom/onedelhi/secure/jb0;", "extrasProducer", "<init>", "(Lcom/onedelhi/secure/hx1;Lcom/onedelhi/secure/cc1;Lcom/onedelhi/secure/cc1;Lcom/onedelhi/secure/cc1;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
public final class du4<VM extends au4> implements w12<VM> {
    @ss2

    /* renamed from: a */
    public VM f10938a;
    @vr2

    /* renamed from: a */
    public final cc1<gu4> f10939a;
    @vr2

    /* renamed from: a */
    public final hx1<VM> f10940a;
    @vr2

    /* renamed from: b */
    public final cc1<C0709m.C0713b> f10941b;
    @vr2

    /* renamed from: c */
    public final cc1<jb0> f10942c;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/onedelhi/secure/au4;", "VM", "Lcom/onedelhi/secure/jb0$a;", "a", "()Lcom/onedelhi/secure/jb0$a;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.du4$a */
    public static final class C2002a extends d12 implements cc1<jb0.C2482a> {

        /* renamed from: a */
        public static final C2002a f10943a = new C2002a();

        public C2002a() {
            super(0);
        }

        @vr2
        /* renamed from: a */
        public final jb0.C2482a invoke() {
            return jb0.C2482a.f14048a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @vw1
    public du4(@vr2 hx1<VM> hx1, @vr2 cc1<? extends gu4> cc1, @vr2 cc1<? extends C0709m.C0713b> cc12) {
        this(hx1, cc1, cc12, (cc1) null, 8, (wg0) null);
        jt1.m53777p(hx1, "viewModelClass");
        jt1.m53777p(cc1, "storeProducer");
        jt1.m53777p(cc12, "factoryProducer");
    }

    @vw1
    public du4(@vr2 hx1<VM> hx1, @vr2 cc1<? extends gu4> cc1, @vr2 cc1<? extends C0709m.C0713b> cc12, @vr2 cc1<? extends jb0> cc13) {
        jt1.m53777p(hx1, "viewModelClass");
        jt1.m53777p(cc1, "storeProducer");
        jt1.m53777p(cc12, "factoryProducer");
        jt1.m53777p(cc13, "extrasProducer");
        this.f10940a = hx1;
        this.f10939a = cc1;
        this.f10941b = cc12;
        this.f10942c = cc13;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ du4(hx1 hx1, cc1 cc1, cc1 cc12, cc1 cc13, int i, wg0 wg0) {
        this(hx1, cc1, cc12, (i & 8) != 0 ? C2002a.f10943a : cc13);
    }

    /* renamed from: N1 */
    public boolean mo14855N1() {
        return this.f10938a != null;
    }

    @vr2
    /* renamed from: a */
    public VM getValue() {
        VM vm = this.f10938a;
        if (vm != null) {
            return vm;
        }
        VM a = new C0709m(this.f10939a.invoke(), this.f10941b.invoke(), this.f10942c.invoke()).mo5027a(nw1.m58840d(this.f10940a));
        this.f10938a = a;
        return a;
    }
}
