package com.onedelhi.secure;

import com.onedelhi.secure.b90;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0000¨\u0006\t"}, d2 = {"Lcom/onedelhi/secure/b90;", "context", "", "b", "countOrElement", "c", "oldState", "Lcom/onedelhi/secure/un4;", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class ub4 {
    @rw1
    @vr2

    /* renamed from: a */
    public static final l84 f36021a = new l84("NO_THREAD_ELEMENTS");
    @vr2

    /* renamed from: a */
    public static final sc1<Object, b90.C4634b, Object> f36022a = C6945a.f36025a;
    @vr2

    /* renamed from: b */
    public static final sc1<sb4<?>, b90.C4634b, sb4<?>> f36023b = C6946b.f36026a;
    @vr2

    /* renamed from: c */
    public static final sc1<ec4, b90.C4634b, ec4> f36024c = C6947c.f36027a;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "countOrElement", "Lcom/onedelhi/secure/b90$b;", "element", "a", "(Ljava/lang/Object;Lcom/onedelhi/secure/b90$b;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.ub4$a */
    public static final class C6945a extends d12 implements sc1<Object, b90.C4634b, Object> {

        /* renamed from: a */
        public static final C6945a f36025a = new C6945a();

        public C6945a() {
            super(2);
        }

        @ss2
        /* renamed from: a */
        public final Object mo21054h0(@ss2 Object obj, @vr2 b90.C4634b bVar) {
            if (!(bVar instanceof sb4)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num == null ? 1 : num.intValue();
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/onedelhi/secure/sb4;", "found", "Lcom/onedelhi/secure/b90$b;", "element", "a", "(Lcom/onedelhi/secure/sb4;Lcom/onedelhi/secure/b90$b;)Lcom/onedelhi/secure/sb4;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.ub4$b */
    public static final class C6946b extends d12 implements sc1<sb4<?>, b90.C4634b, sb4<?>> {

        /* renamed from: a */
        public static final C6946b f36026a = new C6946b();

        public C6946b() {
            super(2);
        }

        @ss2
        /* renamed from: a */
        public final sb4<?> mo21054h0(@ss2 sb4<?> sb4, @vr2 b90.C4634b bVar) {
            if (sb4 != null) {
                return sb4;
            }
            if (bVar instanceof sb4) {
                return (sb4) bVar;
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/onedelhi/secure/ec4;", "state", "Lcom/onedelhi/secure/b90$b;", "element", "a", "(Lcom/onedelhi/secure/ec4;Lcom/onedelhi/secure/b90$b;)Lcom/onedelhi/secure/ec4;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.ub4$c */
    public static final class C6947c extends d12 implements sc1<ec4, b90.C4634b, ec4> {

        /* renamed from: a */
        public static final C6947c f36027a = new C6947c();

        public C6947c() {
            super(2);
        }

        @vr2
        /* renamed from: a */
        public final ec4 mo21054h0(@vr2 ec4 ec4, @vr2 b90.C4634b bVar) {
            if (bVar instanceof sb4) {
                sb4 sb4 = (sb4) bVar;
                ec4.mo35121a(sb4, sb4.mo37908p0(ec4.f27854a));
            }
            return ec4;
        }
    }

    /* renamed from: a */
    public static final void m66923a(@vr2 b90 b90, @ss2 Object obj) {
        if (obj != f36021a) {
            if (obj instanceof ec4) {
                ((ec4) obj).mo35122b(b90);
                return;
            }
            Object fold = b90.fold(null, f36023b);
            Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((sb4) fold).mo37900M(b90, obj);
        }
    }

    @vr2
    /* renamed from: b */
    public static final Object m66924b(@vr2 b90 b90) {
        Object fold = b90.fold(0, f36022a);
        jt1.m53774m(fold);
        return fold;
    }

    @ss2
    /* renamed from: c */
    public static final Object m66925c(@vr2 b90 b90, @ss2 Object obj) {
        if (obj == null) {
            obj = m66924b(b90);
        }
        return obj == 0 ? f36021a : obj instanceof Integer ? b90.fold(new ec4(b90, ((Number) obj).intValue()), f36024c) : ((sb4) obj).mo37908p0(b90);
    }
}
