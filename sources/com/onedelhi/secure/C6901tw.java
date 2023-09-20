package com.onedelhi.secure;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001c\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lcom/onedelhi/secure/tw;", "", "", "value", "I", "e", "()I", "<init>", "(Ljava/lang/String;II)V", "b", "UNDEFINED", "LEFT_TO_RIGHT", "RIGHT_TO_LEFT", "RIGHT_TO_LEFT_ARABIC", "EUROPEAN_NUMBER", "EUROPEAN_NUMBER_SEPARATOR", "EUROPEAN_NUMBER_TERMINATOR", "ARABIC_NUMBER", "COMMON_NUMBER_SEPARATOR", "NONSPACING_MARK", "BOUNDARY_NEUTRAL", "PARAGRAPH_SEPARATOR", "SEGMENT_SEPARATOR", "WHITESPACE", "OTHER_NEUTRALS", "LEFT_TO_RIGHT_EMBEDDING", "LEFT_TO_RIGHT_OVERRIDE", "RIGHT_TO_LEFT_EMBEDDING", "RIGHT_TO_LEFT_OVERRIDE", "POP_DIRECTIONAL_FORMAT", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.tw */
public enum C6901tw {
    UNDEFINED(-1),
    LEFT_TO_RIGHT(0),
    RIGHT_TO_LEFT(1),
    RIGHT_TO_LEFT_ARABIC(2),
    EUROPEAN_NUMBER(3),
    EUROPEAN_NUMBER_SEPARATOR(4),
    EUROPEAN_NUMBER_TERMINATOR(5),
    ARABIC_NUMBER(6),
    COMMON_NUMBER_SEPARATOR(7),
    NONSPACING_MARK(8),
    BOUNDARY_NEUTRAL(9),
    PARAGRAPH_SEPARATOR(10),
    SEGMENT_SEPARATOR(11),
    WHITESPACE(12),
    OTHER_NEUTRALS(13),
    LEFT_TO_RIGHT_EMBEDDING(14),
    LEFT_TO_RIGHT_OVERRIDE(15),
    RIGHT_TO_LEFT_EMBEDDING(16),
    RIGHT_TO_LEFT_OVERRIDE(17),
    POP_DIRECTIONAL_FORMAT(18);
    
    @vr2

    /* renamed from: a */
    public static final C6903b f35809a = null;
    @vr2

    /* renamed from: a */
    public static final w12<Map<Integer, C6901tw>> f35811a = null;

    /* renamed from: n */
    public final int f35832n;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "Lcom/onedelhi/secure/tw;", "a", "()Ljava/util/Map;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.tw$a */
    public static final class C6902a extends d12 implements cc1<Map<Integer, ? extends C6901tw>> {

        /* renamed from: a */
        public static final C6902a f35833a = null;

        static {
            f35833a = new C6902a();
        }

        public C6902a() {
            super(0);
        }

        @vr2
        /* renamed from: a */
        public final Map<Integer, C6901tw> invoke() {
            C6901tw[] values = C6901tw.values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(df3.m45198n(hd2.m50458j(values.length), 16));
            for (C6901tw twVar : values) {
                linkedHashMap.put(Integer.valueOf(twVar.mo45323e()), twVar);
            }
            return linkedHashMap;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R'\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00068BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/tw$b;", "", "", "directionality", "Lcom/onedelhi/secure/tw;", "b", "", "directionalityMap$delegate", "Lcom/onedelhi/secure/w12;", "a", "()Ljava/util/Map;", "directionalityMap", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.tw$b */
    public static final class C6903b {
        public C6903b() {
        }

        public /* synthetic */ C6903b(wg0 wg0) {
            this();
        }

        /* renamed from: a */
        public final Map<Integer, C6901tw> mo45325a() {
            return (Map) C6901tw.f35811a.getValue();
        }

        @vr2
        /* renamed from: b */
        public final C6901tw mo45326b(int i) {
            C6901tw twVar = mo45325a().get(Integer.valueOf(i));
            if (twVar != null) {
                return twVar;
            }
            throw new IllegalArgumentException("Directionality #" + i + " is not defined.");
        }
    }

    /* access modifiers changed from: public */
    static {
        f35809a = new C6903b((wg0) null);
        f35811a = i22.m51739a(C6902a.f35833a);
    }

    /* access modifiers changed from: public */
    C6901tw(int i) {
        this.f35832n = i;
    }

    /* renamed from: e */
    public final int mo45323e() {
        return this.f35832n;
    }
}
