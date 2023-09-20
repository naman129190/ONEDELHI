package com.onedelhi.secure;

import com.bumptech.glide.load.data.C1195a;
import com.onedelhi.secure.n33;
import com.onedelhi.secure.rf0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class g62<Data, ResourceType, Transcode> {

    /* renamed from: a */
    public final n33.C2922a<List<Throwable>> f12447a;

    /* renamed from: a */
    public final Class<Data> f12448a;

    /* renamed from: a */
    public final String f12449a;

    /* renamed from: a */
    public final List<? extends rf0<Data, ResourceType, Transcode>> f12450a;

    public g62(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<rf0<Data, ResourceType, Transcode>> list, n33.C2922a<List<Throwable>> aVar) {
        this.f12448a = cls;
        this.f12447a = aVar;
        this.f12450a = (List) g43.m15508c(list);
        this.f12449a = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public Class<Data> mo16362a() {
        return this.f12448a;
    }

    /* renamed from: b */
    public ck3<Transcode> mo16363b(C1195a<Data> aVar, @mr2 zw2 zw2, int i, int i2, rf0.C3414a<ResourceType> aVar2) throws yg1 {
        List list = (List) g43.m15509d(this.f12447a.mo20818b());
        try {
            return mo16364c(aVar, zw2, i, i2, aVar2, list);
        } finally {
            this.f12447a.mo20817a(list);
        }
    }

    /* renamed from: c */
    public final ck3<Transcode> mo16364c(C1195a<Data> aVar, @mr2 zw2 zw2, int i, int i2, rf0.C3414a<ResourceType> aVar2, List<Throwable> list) throws yg1 {
        List<Throwable> list2 = list;
        int size = this.f12450a.size();
        ck3<Transcode> ck3 = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                ck3 = ((rf0) this.f12450a.get(i3)).mo23837a(aVar, i, i2, zw2, aVar2);
            } catch (yg1 e) {
                list2.add(e);
            }
            if (ck3 != null) {
                break;
            }
        }
        if (ck3 != null) {
            return ck3;
        }
        throw new yg1(this.f12449a, (List<Throwable>) new ArrayList(list2));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f12450a.toArray()) + '}';
    }
}
