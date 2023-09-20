package com.onedelhi.secure;

import java.util.Objects;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u00062\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/py;", "Lcom/onedelhi/secure/sb0;", "Ljava/lang/Class;", "", "key", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "a", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@IgnoreJRERequirement
/* renamed from: com.onedelhi.secure.py */
public final class C6484py extends sb0 {
    @vr2

    /* renamed from: a */
    public static final C6485a f33843a = new C6485a();
    @vr2

    /* renamed from: a */
    public static final C6484py f33844a = new C6484py();

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0002`\u00040\u0001J(\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0002`\u00042\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005H\u0014¨\u0006\b"}, d2 = {"com/onedelhi/secure/py$a", "Ljava/lang/ClassValue;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/Ctor;", "Ljava/lang/Class;", "type", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.py$a */
    public static final class C6485a extends ClassValue<ec1<? super Throwable, ? extends Throwable>> {
        @vr2
        /* renamed from: a */
        public ec1<Throwable, Throwable> computeValue(@ss2 Class<?> cls) {
            Objects.requireNonNull(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
            return lw0.m56603b(cls);
        }
    }

    @vr2
    /* renamed from: a */
    public ec1<Throwable, Throwable> mo42972a(@vr2 Class<? extends Throwable> cls) {
        return (ec1) f33843a.get(cls);
    }
}
