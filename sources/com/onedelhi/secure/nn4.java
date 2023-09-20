package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/nn4;", "T", "Lcom/onedelhi/secure/o81;", "value", "Lcom/onedelhi/secure/un4;", "c", "(Ljava/lang/Object;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "downstream", "Lcom/onedelhi/secure/b90;", "emitContext", "<init>", "(Lcom/onedelhi/secure/o81;Lcom/onedelhi/secure/b90;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class nn4<T> implements o81<T> {
    @vr2

    /* renamed from: a */
    public final b90 f32649a;
    @vr2

    /* renamed from: a */
    public final sc1<T, b80<? super un4>, Object> f32650a;
    @vr2

    /* renamed from: a */
    public final Object f32651a;

    @cf0(mo32326c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", mo32327f = "ChannelFlow.kt", mo32328i = {}, mo32329l = {212}, mo32330m = "invokeSuspend", mo32331n = {}, mo32332s = {})
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@"}, d2 = {"T", "it", "Lcom/onedelhi/secure/un4;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.nn4$a */
    public static final class C6204a extends i84 implements sc1<T, b80<? super un4>, Object> {

        /* renamed from: a */
        public final /* synthetic */ o81<T> f32652a;

        /* renamed from: a */
        public /* synthetic */ Object f32653a;

        /* renamed from: o */
        public int f32654o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6204a(o81<? super T> o81, b80<? super C6204a> b80) {
            super(2, b80);
            this.f32652a = o81;
        }

        @vr2
        /* renamed from: B */
        public final b80<un4> mo22644B(@ss2 Object obj, @vr2 b80<?> b80) {
            C6204a aVar = new C6204a(this.f32652a, b80);
            aVar.f32653a = obj;
            return aVar;
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            Object h = mt1.m57558h();
            int i = this.f32654o;
            if (i == 0) {
                pl3.m61436n(obj);
                Object obj2 = this.f32653a;
                o81<T> o81 = this.f32652a;
                this.f32654o = 1;
                if (o81.mo31452c(obj2, this) == h) {
                    return h;
                }
            } else if (i == 1) {
                pl3.m61436n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return un4.f36206a;
        }

        @ss2
        /* renamed from: M */
        public final Object mo21054h0(T t, @ss2 b80<? super un4> b80) {
            return ((C6204a) mo22644B(t, b80)).mo22645D(un4.f36206a);
        }
    }

    public nn4(@vr2 o81<? super T> o81, @vr2 b90 b90) {
        this.f32649a = b90;
        this.f32651a = ub4.m66924b(b90);
        this.f32650a = new C6204a(o81, (b80<? super C6204a>) null);
    }

    @ss2
    /* renamed from: c */
    public Object mo31452c(T t, @vr2 b80<? super un4> b80) {
        Object c = C4707bw.m40590c(this.f32649a, t, this.f32651a, this.f32650a, b80);
        return c == mt1.m57558h() ? c : un4.f36206a;
    }
}
