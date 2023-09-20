package com.onedelhi.secure;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public final class v83 extends w83 implements gm2 {

    /* renamed from: a */
    public static final ol3[] f36455a = new ol3[0];

    /* renamed from: b */
    public static final sl3[] f36456b = new sl3[0];

    /* renamed from: com.onedelhi.secure.v83$b */
    public static final class C7020b implements Serializable, Comparator<ol3> {
        public C7020b() {
        }

        /* renamed from: a */
        public int compare(ol3 ol3, ol3 ol32) {
            Map<ql3, Object> e = ol3.mo41827e();
            ql3 ql3 = ql3.STRUCTURED_APPEND_SEQUENCE;
            return Integer.compare(((Integer) e.get(ql3)).intValue(), ((Integer) ol32.mo41827e().get(ql3)).intValue());
        }
    }

    /* renamed from: h */
    public static List<ol3> m67799h(List<ol3> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<ol3> arrayList2 = new ArrayList<>();
        for (ol3 next : list) {
            if (next.mo41827e().containsKey(ql3.STRUCTURED_APPEND_SEQUENCE)) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            return list;
        }
        Collections.sort(arrayList2, new C7020b());
        StringBuilder sb = new StringBuilder();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        for (ol3 ol3 : arrayList2) {
            sb.append(ol3.mo41829g());
            byte[] d = ol3.mo41826d();
            byteArrayOutputStream.write(d, 0, d.length);
            Iterable<byte[]> iterable = (Iterable) ol3.mo41827e().get(ql3.BYTE_SEGMENTS);
            if (iterable != null) {
                for (byte[] bArr : iterable) {
                    byteArrayOutputStream2.write(bArr, 0, bArr.length);
                }
            }
        }
        ol3 ol32 = new ol3(sb.toString(), byteArrayOutputStream.toByteArray(), f36456b, C7363yi.QR_CODE);
        if (byteArrayOutputStream2.size() > 0) {
            ol32.mo41832j(ql3.BYTE_SEGMENTS, Collections.singletonList(byteArrayOutputStream2.toByteArray()));
        }
        arrayList.add(ol32);
        return arrayList;
    }

    /* renamed from: c */
    public ol3[] mo36787c(C6969uk ukVar) throws tr2 {
        return mo36788d(ukVar, (Map<pf0, ?>) null);
    }

    /* renamed from: d */
    public ol3[] mo36788d(C6969uk ukVar, Map<pf0, ?> map) throws tr2 {
        ArrayList arrayList = new ArrayList();
        for (nk0 nk0 : new tl2(ukVar.mo45634b()).mo45175n(map)) {
            try {
                gg0 c = mo46646f().mo34412c(nk0.mo41078a(), map);
                sl3[] b = nk0.mo41079b();
                if (c.mo36722f() instanceof u83) {
                    ((u83) c.mo36722f()).mo45538a(b);
                }
                ol3 ol3 = new ol3(c.mo36726j(), c.mo36723g(), b, C7363yi.QR_CODE);
                List<byte[]> a = c.mo36717a();
                if (a != null) {
                    ol3.mo41832j(ql3.BYTE_SEGMENTS, a);
                }
                String b2 = c.mo36718b();
                if (b2 != null) {
                    ol3.mo41832j(ql3.ERROR_CORRECTION_LEVEL, b2);
                }
                if (c.mo36727k()) {
                    ol3.mo41832j(ql3.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(c.mo36725i()));
                    ol3.mo41832j(ql3.STRUCTURED_APPEND_PARITY, Integer.valueOf(c.mo36724h()));
                }
                arrayList.add(ol3);
            } catch (wf3 unused) {
            }
        }
        return arrayList.isEmpty() ? f36455a : (ol3[]) m67799h(arrayList).toArray(f36455a);
    }
}
