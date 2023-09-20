package com.onedelhi.secure;

import android.util.Log;
import com.bumptech.glide.load.data.C1195a;
import com.onedelhi.secure.n33;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class rf0<DataType, ResourceType, Transcode> {

    /* renamed from: b */
    public static final String f19814b = "DecodePath";

    /* renamed from: a */
    public final n33.C2922a<List<Throwable>> f19815a;

    /* renamed from: a */
    public final xk3<ResourceType, Transcode> f19816a;

    /* renamed from: a */
    public final Class<DataType> f19817a;

    /* renamed from: a */
    public final String f19818a;

    /* renamed from: a */
    public final List<? extends ik3<DataType, ResourceType>> f19819a;

    /* renamed from: com.onedelhi.secure.rf0$a */
    public interface C3414a<ResourceType> {
        @mr2
        /* renamed from: a */
        ck3<ResourceType> mo23140a(@mr2 ck3<ResourceType> ck3);
    }

    public rf0(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends ik3<DataType, ResourceType>> list, xk3<ResourceType, Transcode> xk3, n33.C2922a<List<Throwable>> aVar) {
        this.f19817a = cls;
        this.f19819a = list;
        this.f19816a = xk3;
        this.f19815a = aVar;
        this.f19818a = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public ck3<Transcode> mo23837a(C1195a<DataType> aVar, int i, int i2, @mr2 zw2 zw2, C3414a<ResourceType> aVar2) throws yg1 {
        return this.f19816a.mo13752a(aVar2.mo23140a(mo23838b(aVar, i, i2, zw2)), zw2);
    }

    @mr2
    /* renamed from: b */
    public final ck3<ResourceType> mo23838b(C1195a<DataType> aVar, int i, int i2, @mr2 zw2 zw2) throws yg1 {
        List list = (List) g43.m15509d(this.f19815a.mo20818b());
        try {
            return mo23839c(aVar, i, i2, zw2, list);
        } finally {
            this.f19815a.mo20817a(list);
        }
    }

    @mr2
    /* renamed from: c */
    public final ck3<ResourceType> mo23839c(C1195a<DataType> aVar, int i, int i2, @mr2 zw2 zw2, List<Throwable> list) throws yg1 {
        int size = this.f19819a.size();
        ck3<ResourceType> ck3 = null;
        for (int i3 = 0; i3 < size; i3++) {
            ik3 ik3 = (ik3) this.f19819a.get(i3);
            try {
                if (ik3.mo14337b(aVar.mo7515c(), zw2)) {
                    ck3 = ik3.mo14336a(aVar.mo7515c(), i, i2, zw2);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable(f19814b, 2)) {
                    Log.v(f19814b, "Failed to decode data for " + ik3, e);
                }
                list.add(e);
            }
            if (ck3 != null) {
                break;
            }
        }
        if (ck3 != null) {
            return ck3;
        }
        throw new yg1(this.f19818a, (List<Throwable>) new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f19817a + ", decoders=" + this.f19819a + ", transcoder=" + this.f19816a + '}';
    }
}
