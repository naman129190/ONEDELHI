package com.google.gson.internal.bind;

import com.onedelhi.secure.cj4;
import com.onedelhi.secure.dj4;
import com.onedelhi.secure.fj1;
import com.onedelhi.secure.fv1;
import com.onedelhi.secure.r60;
import com.onedelhi.secure.tj4;

public final class JsonAdapterAnnotationTypeAdapterFactory implements dj4 {

    /* renamed from: a */
    public final r60 f25452a;

    public JsonAdapterAnnotationTypeAdapterFactory(r60 r60) {
        this.f25452a = r60;
    }

    /* renamed from: a */
    public <T> cj4<T> mo30126a(fj1 fj1, tj4<T> tj4) {
        fv1 fv1 = (fv1) tj4.getRawType().getAnnotation(fv1.class);
        if (fv1 == null) {
            return null;
        }
        return mo30152b(this.f25452a, fj1, tj4, fv1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: com.onedelhi.secure.cj4<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: com.onedelhi.secure.cj4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.onedelhi.secure.cj4<?> mo30152b(com.onedelhi.secure.r60 r9, com.onedelhi.secure.fj1 r10, com.onedelhi.secure.tj4<?> r11, com.onedelhi.secure.fv1 r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            com.onedelhi.secure.tj4 r0 = com.onedelhi.secure.tj4.get(r0)
            com.onedelhi.secure.jt2 r9 = r9.mo43820a(r0)
            java.lang.Object r9 = r9.mo38879a()
            boolean r0 = r9 instanceof com.onedelhi.secure.cj4
            if (r0 == 0) goto L_0x0017
            com.onedelhi.secure.cj4 r9 = (com.onedelhi.secure.cj4) r9
            goto L_0x0075
        L_0x0017:
            boolean r0 = r9 instanceof com.onedelhi.secure.dj4
            if (r0 == 0) goto L_0x0022
            com.onedelhi.secure.dj4 r9 = (com.onedelhi.secure.dj4) r9
            com.onedelhi.secure.cj4 r9 = r9.mo30126a(r10, r11)
            goto L_0x0075
        L_0x0022:
            boolean r0 = r9 instanceof com.onedelhi.secure.cw1
            if (r0 != 0) goto L_0x005b
            boolean r1 = r9 instanceof com.onedelhi.secure.nv1
            if (r1 == 0) goto L_0x002b
            goto L_0x005b
        L_0x002b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r12.append(r0)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x005b:
            r1 = 0
            if (r0 == 0) goto L_0x0063
            r0 = r9
            com.onedelhi.secure.cw1 r0 = (com.onedelhi.secure.cw1) r0
            r3 = r0
            goto L_0x0064
        L_0x0063:
            r3 = r1
        L_0x0064:
            boolean r0 = r9 instanceof com.onedelhi.secure.nv1
            if (r0 == 0) goto L_0x006b
            r1 = r9
            com.onedelhi.secure.nv1 r1 = (com.onedelhi.secure.nv1) r1
        L_0x006b:
            r4 = r1
            com.google.gson.internal.bind.TreeTypeAdapter r9 = new com.google.gson.internal.bind.TreeTypeAdapter
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0075:
            if (r9 == 0) goto L_0x0081
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x0081
            com.onedelhi.secure.cj4 r9 = r9.mo32407d()
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.mo30152b(com.onedelhi.secure.r60, com.onedelhi.secure.fj1, com.onedelhi.secure.tj4, com.onedelhi.secure.fv1):com.onedelhi.secure.cj4");
    }
}
