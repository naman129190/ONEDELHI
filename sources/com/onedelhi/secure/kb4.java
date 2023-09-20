package com.onedelhi.secure;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001av\u0010\r\u001a\u00020\f*\u00020\u00002d\b\u0004\u0010\u000b\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0001H\bø\u0001\u0000\u001av\u0010\u000f\u001a\u00020\f*\u00020\u00002d\b\u0004\u0010\u000b\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\n0\u0001H\bø\u0001\u0000\u001a7\u0010\u0012\u001a\u00020\f*\u00020\u00002%\b\u0004\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\n0\u0010H\bø\u0001\u0000\u001a\u0002\u0010\u0016\u001a\u00020\f*\u00020\u00002d\b\u0006\u0010\u0013\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00012d\b\u0006\u0010\u0014\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\n0\u00012%\b\u0006\u0010\u0015\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\n0\u0010H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0017"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/Function4;", "", "Lcom/onedelhi/secure/iy2;", "name", "text", "", "start", "count", "after", "Lcom/onedelhi/secure/un4;", "action", "Landroid/text/TextWatcher;", "d", "before", "e", "Lkotlin/Function1;", "Landroid/text/Editable;", "c", "beforeTextChanged", "onTextChanged", "afterTextChanged", "a", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class kb4 {

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "Lcom/onedelhi/secure/un4;", "a", "(Ljava/lang/CharSequence;III)V"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.kb4$a */
    public static final class C2618a extends d12 implements vc1<CharSequence, Integer, Integer, Integer, un4> {

        /* renamed from: a */
        public static final C2618a f14815a = new C2618a();

        public C2618a() {
            super(4);
        }

        /* renamed from: a */
        public final void mo18981a(@ss2 CharSequence charSequence, int i, int i2, int i3) {
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo18982h(Object obj, Object obj2, Object obj3, Object obj4) {
            mo18981a((CharSequence) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
            return un4.f36206a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "Lcom/onedelhi/secure/un4;", "a", "(Ljava/lang/CharSequence;III)V"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.kb4$b */
    public static final class C2619b extends d12 implements vc1<CharSequence, Integer, Integer, Integer, un4> {

        /* renamed from: a */
        public static final C2619b f14816a = new C2619b();

        public C2619b() {
            super(4);
        }

        /* renamed from: a */
        public final void mo18983a(@ss2 CharSequence charSequence, int i, int i2, int i3) {
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo18982h(Object obj, Object obj2, Object obj3, Object obj4) {
            mo18983a((CharSequence) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
            return un4.f36206a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/text/Editable;", "it", "Lcom/onedelhi/secure/un4;", "a", "(Landroid/text/Editable;)V"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.kb4$c */
    public static final class C2620c extends d12 implements ec1<Editable, un4> {

        /* renamed from: a */
        public static final C2620c f14817a = new C2620c();

        public C2620c() {
            super(1);
        }

        /* renamed from: X */
        public /* bridge */ /* synthetic */ Object mo17094X(Object obj) {
            mo18984a((Editable) obj);
            return un4.f36206a;
        }

        /* renamed from: a */
        public final void mo18984a(@ss2 Editable editable) {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"com/onedelhi/secure/kb4$d", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lcom/onedelhi/secure/un4;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.kb4$d */
    public static final class C2621d implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ ec1<Editable, un4> f14818a;

        /* renamed from: a */
        public final /* synthetic */ vc1<CharSequence, Integer, Integer, Integer, un4> f14819a;

        /* renamed from: b */
        public final /* synthetic */ vc1<CharSequence, Integer, Integer, Integer, un4> f14820b;

        public C2621d(ec1<? super Editable, un4> ec1, vc1<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, un4> vc1, vc1<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, un4> vc12) {
            this.f14818a = ec1;
            this.f14819a = vc1;
            this.f14820b = vc12;
        }

        public void afterTextChanged(@ss2 Editable editable) {
            this.f14818a.mo17094X(editable);
        }

        public void beforeTextChanged(@ss2 CharSequence charSequence, int i, int i2, int i3) {
            this.f14819a.mo18982h(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }

        public void onTextChanged(@ss2 CharSequence charSequence, int i, int i2, int i3) {
            this.f14820b.mo18982h(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/kb4$d", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lcom/onedelhi/secure/un4;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.kb4$e */
    public static final class C2622e implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ ec1 f14821a;

        public C2622e(ec1 ec1) {
            this.f14821a = ec1;
        }

        public void afterTextChanged(@ss2 Editable editable) {
            this.f14821a.mo17094X(editable);
        }

        public void beforeTextChanged(@ss2 CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(@ss2 CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/kb4$d", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lcom/onedelhi/secure/un4;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.kb4$f */
    public static final class C2623f implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ vc1 f14822a;

        public C2623f(vc1 vc1) {
            this.f14822a = vc1;
        }

        public void afterTextChanged(@ss2 Editable editable) {
        }

        public void beforeTextChanged(@ss2 CharSequence charSequence, int i, int i2, int i3) {
            this.f14822a.mo18982h(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }

        public void onTextChanged(@ss2 CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/kb4$d", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lcom/onedelhi/secure/un4;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.kb4$g */
    public static final class C2624g implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ vc1 f14823a;

        public C2624g(vc1 vc1) {
            this.f14823a = vc1;
        }

        public void afterTextChanged(@ss2 Editable editable) {
        }

        public void beforeTextChanged(@ss2 CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(@ss2 CharSequence charSequence, int i, int i2, int i3) {
            this.f14823a.mo18982h(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    @vr2
    /* renamed from: a */
    public static final TextWatcher m19625a(@vr2 TextView textView, @vr2 vc1<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, un4> vc1, @vr2 vc1<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, un4> vc12, @vr2 ec1<? super Editable, un4> ec1) {
        jt1.m53777p(textView, "<this>");
        jt1.m53777p(vc1, "beforeTextChanged");
        jt1.m53777p(vc12, "onTextChanged");
        jt1.m53777p(ec1, "afterTextChanged");
        C2621d dVar = new C2621d(ec1, vc1, vc12);
        textView.addTextChangedListener(dVar);
        return dVar;
    }

    /* renamed from: b */
    public static /* synthetic */ TextWatcher m19626b(TextView textView, vc1 vc1, vc1 vc12, ec1 ec1, int i, Object obj) {
        if ((i & 1) != 0) {
            vc1 = C2618a.f14815a;
        }
        if ((i & 2) != 0) {
            vc12 = C2619b.f14816a;
        }
        if ((i & 4) != 0) {
            ec1 = C2620c.f14817a;
        }
        jt1.m53777p(textView, "<this>");
        jt1.m53777p(vc1, "beforeTextChanged");
        jt1.m53777p(vc12, "onTextChanged");
        jt1.m53777p(ec1, "afterTextChanged");
        C2621d dVar = new C2621d(ec1, vc1, vc12);
        textView.addTextChangedListener(dVar);
        return dVar;
    }

    @vr2
    /* renamed from: c */
    public static final TextWatcher m19627c(@vr2 TextView textView, @vr2 ec1<? super Editable, un4> ec1) {
        jt1.m53777p(textView, "<this>");
        jt1.m53777p(ec1, "action");
        C2622e eVar = new C2622e(ec1);
        textView.addTextChangedListener(eVar);
        return eVar;
    }

    @vr2
    /* renamed from: d */
    public static final TextWatcher m19628d(@vr2 TextView textView, @vr2 vc1<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, un4> vc1) {
        jt1.m53777p(textView, "<this>");
        jt1.m53777p(vc1, "action");
        C2623f fVar = new C2623f(vc1);
        textView.addTextChangedListener(fVar);
        return fVar;
    }

    @vr2
    /* renamed from: e */
    public static final TextWatcher m19629e(@vr2 TextView textView, @vr2 vc1<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, un4> vc1) {
        jt1.m53777p(textView, "<this>");
        jt1.m53777p(vc1, "action");
        C2624g gVar = new C2624g(vc1);
        textView.addTextChangedListener(gVar);
        return gVar;
    }
}
