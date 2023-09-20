package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
@KeepForSdk
public abstract class FastJsonResponse {

    @ShowFirstParty
    @SafeParcelable.Class(creator = "FieldCreator")
    @VisibleForTesting
    @KeepForSdk
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();
        @SafeParcelable.Field(getter = "getTypeIn", mo10053id = 2)
        public final int zaa;
        @SafeParcelable.Field(getter = "isTypeInArray", mo10053id = 3)
        public final boolean zab;
        @SafeParcelable.Field(getter = "getTypeOut", mo10053id = 4)
        public final int zac;
        @SafeParcelable.Field(getter = "isTypeOutArray", mo10053id = 5)
        public final boolean zad;
        @SafeParcelable.Field(getter = "getOutputFieldName", mo10053id = 6)
        @mr2
        public final String zae;
        @SafeParcelable.Field(getter = "getSafeParcelableFieldId", mo10053id = 7)
        public final int zaf;
        @ts2
        public final Class zag;
        @SafeParcelable.Field(getter = "getConcreteTypeName", mo10053id = 8)
        @ts2
        public final String zah;
        @SafeParcelable.VersionField(getter = "getVersionCode", mo10062id = 1)
        private final int zai;
        private zan zaj;
        /* access modifiers changed from: private */
        @SafeParcelable.Field(getter = "getWrappedConverter", mo10053id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")
        @ts2
        public FieldConverter zak;

        @SafeParcelable.Constructor
        public Field(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) int i2, @SafeParcelable.Param(mo10056id = 3) boolean z, @SafeParcelable.Param(mo10056id = 4) int i3, @SafeParcelable.Param(mo10056id = 5) boolean z2, @SafeParcelable.Param(mo10056id = 6) String str, @SafeParcelable.Param(mo10056id = 7) int i4, @SafeParcelable.Param(mo10056id = 8) @ts2 String str2, @SafeParcelable.Param(mo10056id = 9) @ts2 zaa zaa2) {
            this.zai = i;
            this.zaa = i2;
            this.zab = z;
            this.zac = i3;
            this.zad = z2;
            this.zae = str;
            this.zaf = i4;
            if (str2 == null) {
                this.zag = null;
                this.zah = null;
            } else {
                this.zag = SafeParcelResponse.class;
                this.zah = str2;
            }
            if (zaa2 == null) {
                this.zak = null;
            } else {
                this.zak = zaa2.zab();
            }
        }

        public Field(int i, boolean z, int i2, boolean z2, @mr2 String str, int i3, @ts2 Class cls, @ts2 FieldConverter fieldConverter) {
            this.zai = 1;
            this.zaa = i;
            this.zab = z;
            this.zac = i2;
            this.zad = z2;
            this.zae = str;
            this.zaf = i3;
            this.zag = cls;
            this.zah = cls == null ? null : cls.getCanonicalName();
            this.zak = fieldConverter;
        }

        @mr2
        @KeepForSdk
        @VisibleForTesting
        public static Field<byte[], byte[]> forBase64(@mr2 String str, int i) {
            return new Field(8, false, 8, false, str, i, (Class) null, (FieldConverter) null);
        }

        @mr2
        @KeepForSdk
        public static Field<Boolean, Boolean> forBoolean(@mr2 String str, int i) {
            return new Field(6, false, 6, false, str, i, (Class) null, (FieldConverter) null);
        }

        @mr2
        @KeepForSdk
        public static <T extends FastJsonResponse> Field<T, T> forConcreteType(@mr2 String str, int i, @mr2 Class<T> cls) {
            return new Field(11, false, 11, false, str, i, cls, (FieldConverter) null);
        }

        @mr2
        @KeepForSdk
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> forConcreteTypeArray(@mr2 String str, int i, @mr2 Class<T> cls) {
            return new Field(11, true, 11, true, str, i, cls, (FieldConverter) null);
        }

        @mr2
        @KeepForSdk
        public static Field<Double, Double> forDouble(@mr2 String str, int i) {
            return new Field(4, false, 4, false, str, i, (Class) null, (FieldConverter) null);
        }

        @mr2
        @KeepForSdk
        public static Field<Float, Float> forFloat(@mr2 String str, int i) {
            return new Field(3, false, 3, false, str, i, (Class) null, (FieldConverter) null);
        }

        @mr2
        @KeepForSdk
        @VisibleForTesting
        public static Field<Integer, Integer> forInteger(@mr2 String str, int i) {
            return new Field(0, false, 0, false, str, i, (Class) null, (FieldConverter) null);
        }

        @mr2
        @KeepForSdk
        public static Field<Long, Long> forLong(@mr2 String str, int i) {
            return new Field(2, false, 2, false, str, i, (Class) null, (FieldConverter) null);
        }

        @mr2
        @KeepForSdk
        public static Field<String, String> forString(@mr2 String str, int i) {
            return new Field(7, false, 7, false, str, i, (Class) null, (FieldConverter) null);
        }

        @mr2
        @KeepForSdk
        public static Field<HashMap<String, String>, HashMap<String, String>> forStringMap(@mr2 String str, int i) {
            return new Field(10, false, 10, false, str, i, (Class) null, (FieldConverter) null);
        }

        @mr2
        @KeepForSdk
        public static Field<ArrayList<String>, ArrayList<String>> forStrings(@mr2 String str, int i) {
            return new Field(7, true, 7, true, str, i, (Class) null, (FieldConverter) null);
        }

        @mr2
        @KeepForSdk
        public static Field withConverter(@mr2 String str, int i, @mr2 FieldConverter<?, ?> fieldConverter, boolean z) {
            fieldConverter.zaa();
            fieldConverter.zab();
            return new Field(7, z, 0, false, str, i, (Class) null, fieldConverter);
        }

        @KeepForSdk
        public int getSafeParcelableFieldId() {
            return this.zaf;
        }

        @mr2
        public final String toString() {
            Objects.ToStringHelper add = Objects.toStringHelper(this).add("versionCode", Integer.valueOf(this.zai)).add("typeIn", Integer.valueOf(this.zaa)).add("typeInArray", Boolean.valueOf(this.zab)).add("typeOut", Integer.valueOf(this.zac)).add("typeOutArray", Boolean.valueOf(this.zad)).add("outputFieldName", this.zae).add("safeParcelFieldId", Integer.valueOf(this.zaf)).add("concreteTypeName", zag());
            Class cls = this.zag;
            if (cls != null) {
                add.add("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter fieldConverter = this.zak;
            if (fieldConverter != null) {
                add.add("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return add.toString();
        }

        public final void writeToParcel(@mr2 Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, this.zai);
            SafeParcelWriter.writeInt(parcel, 2, this.zaa);
            SafeParcelWriter.writeBoolean(parcel, 3, this.zab);
            SafeParcelWriter.writeInt(parcel, 4, this.zac);
            SafeParcelWriter.writeBoolean(parcel, 5, this.zad);
            SafeParcelWriter.writeString(parcel, 6, this.zae, false);
            SafeParcelWriter.writeInt(parcel, 7, getSafeParcelableFieldId());
            SafeParcelWriter.writeString(parcel, 8, zag(), false);
            SafeParcelWriter.writeParcelable(parcel, 9, zaa(), i, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        @ts2
        public final zaa zaa() {
            FieldConverter fieldConverter = this.zak;
            if (fieldConverter == null) {
                return null;
            }
            return zaa.zaa(fieldConverter);
        }

        @mr2
        public final Field zab() {
            return new Field(this.zai, this.zaa, this.zab, this.zac, this.zad, this.zae, this.zaf, this.zah, zaa());
        }

        @mr2
        public final FastJsonResponse zad() throws InstantiationException, IllegalAccessException {
            Preconditions.checkNotNull(this.zag);
            Class<SafeParcelResponse> cls = this.zag;
            if (cls != SafeParcelResponse.class) {
                return cls.newInstance();
            }
            Preconditions.checkNotNull(this.zah);
            Preconditions.checkNotNull(this.zaj, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            return new SafeParcelResponse(this.zaj, this.zah);
        }

        @mr2
        public final Object zae(@ts2 Object obj) {
            Preconditions.checkNotNull(this.zak);
            return Preconditions.checkNotNull(this.zak.zac(obj));
        }

        @mr2
        public final Object zaf(@mr2 Object obj) {
            Preconditions.checkNotNull(this.zak);
            return this.zak.zad(obj);
        }

        @ts2
        public final String zag() {
            String str = this.zah;
            if (str == null) {
                return null;
            }
            return str;
        }

        @mr2
        public final Map zah() {
            Preconditions.checkNotNull(this.zah);
            Preconditions.checkNotNull(this.zaj);
            return (Map) Preconditions.checkNotNull(this.zaj.zab(this.zah));
        }

        public final void zai(zan zan) {
            this.zaj = zan;
        }

        public final boolean zaj() {
            return this.zak != null;
        }
    }

    @ShowFirstParty
    public interface FieldConverter<I, O> {
        int zaa();

        int zab();

        @ts2
        Object zac(@mr2 Object obj);

        @mr2
        Object zad(@mr2 Object obj);
    }

    @mr2
    public static final Object zaD(@mr2 Field field, @ts2 Object obj) {
        return field.zak != null ? field.zaf(obj) : obj;
    }

    private final void zaE(Field field, @ts2 Object obj) {
        String str = field.zae;
        Object zae = field.zae(obj);
        int i = field.zac;
        switch (i) {
            case 0:
                if (zae != null) {
                    setIntegerInternal(field, str, ((Integer) zae).intValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 1:
                zaf(field, str, (BigInteger) zae);
                return;
            case 2:
                if (zae != null) {
                    setLongInternal(field, str, ((Long) zae).longValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 4:
                if (zae != null) {
                    zan(field, str, ((Double) zae).doubleValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 5:
                zab(field, str, (BigDecimal) zae);
                return;
            case 6:
                if (zae != null) {
                    setBooleanInternal(field, str, ((Boolean) zae).booleanValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 7:
                setStringInternal(field, str, (String) zae);
                return;
            case 8:
            case 9:
                if (zae != null) {
                    setDecodedBytesInternal(field, str, (byte[]) zae);
                    return;
                } else {
                    zaG(str);
                    return;
                }
            default:
                throw new IllegalStateException("Unsupported type for conversion: " + i);
        }
    }

    private static final void zaF(StringBuilder sb, Field field, Object obj) {
        String fastJsonResponse;
        int i = field.zaa;
        if (i == 11) {
            Class cls = field.zag;
            Preconditions.checkNotNull(cls);
            fastJsonResponse = ((FastJsonResponse) cls.cast(obj)).toString();
        } else if (i == 7) {
            fastJsonResponse = "\"";
            sb.append(fastJsonResponse);
            sb.append(JsonUtils.escapeString((String) obj));
        } else {
            sb.append(obj);
            return;
        }
        sb.append(fastJsonResponse);
    }

    private static final void zaG(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            Log.e("FastJsonResponse", "Output field (" + str + ") has a null value, but expected a primitive");
        }
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(@mr2 Field field, @mr2 String str, @ts2 ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void addConcreteTypeInternal(@mr2 Field field, @mr2 String str, @mr2 T t) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    @mr2
    @KeepForSdk
    public abstract Map<String, Field<?, ?>> getFieldMappings();

    @KeepForSdk
    @ts2
    public Object getFieldValue(@mr2 Field field) {
        String str = field.zae;
        if (field.zag == null) {
            return getValueObject(str);
        }
        Preconditions.checkState(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", field.zae);
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            return getClass().getMethod("get" + upperCase + substring, new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @KeepForSdk
    @ts2
    public abstract Object getValueObject(@mr2 String str);

    @KeepForSdk
    public boolean isFieldSet(@mr2 Field field) {
        if (field.zac != 11) {
            return isPrimitiveFieldSet(field.zae);
        }
        if (field.zad) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    @KeepForSdk
    public abstract boolean isPrimitiveFieldSet(@mr2 String str);

    @KeepForSdk
    public void setBooleanInternal(@mr2 Field<?, ?> field, @mr2 String str, boolean z) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    @KeepForSdk
    public void setDecodedBytesInternal(@mr2 Field<?, ?> field, @mr2 String str, @ts2 byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    @KeepForSdk
    public void setIntegerInternal(@mr2 Field<?, ?> field, @mr2 String str, int i) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    @KeepForSdk
    public void setLongInternal(@mr2 Field<?, ?> field, @mr2 String str, long j) {
        throw new UnsupportedOperationException("Long not supported");
    }

    @KeepForSdk
    public void setStringInternal(@mr2 Field<?, ?> field, @mr2 String str, @ts2 String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    @KeepForSdk
    public void setStringMapInternal(@mr2 Field<?, ?> field, @mr2 String str, @ts2 Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    @KeepForSdk
    public void setStringsInternal(@mr2 Field<?, ?> field, @mr2 String str, @ts2 ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        r1.append(r3);
        r1.append("\"");
     */
    @com.onedelhi.secure.mr2
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            java.util.Map r0 = r9.getFieldMappings()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0013:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00aa
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.get(r3)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r4 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r4
            boolean r5 = r9.isFieldSet(r4)
            if (r5 == 0) goto L_0x0013
            java.lang.Object r5 = r9.getFieldValue(r4)
            java.lang.Object r5 = zaD(r4, r5)
            int r6 = r1.length()
            java.lang.String r7 = ","
            if (r6 != 0) goto L_0x0041
            java.lang.String r6 = "{"
            r1.append(r6)
            goto L_0x0044
        L_0x0041:
            r1.append(r7)
        L_0x0044:
            java.lang.String r6 = "\""
            r1.append(r6)
            r1.append(r3)
            java.lang.String r3 = "\":"
            r1.append(r3)
            if (r5 != 0) goto L_0x0059
            java.lang.String r3 = "null"
        L_0x0055:
            r1.append(r3)
            goto L_0x0013
        L_0x0059:
            int r3 = r4.zac
            switch(r3) {
                case 8: goto L_0x007f;
                case 9: goto L_0x0075;
                case 10: goto L_0x006f;
                default: goto L_0x005e;
            }
        L_0x005e:
            boolean r3 = r4.zab
            if (r3 == 0) goto L_0x00a5
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.String r3 = "["
            r1.append(r3)
            int r3 = r5.size()
            r6 = 0
            goto L_0x008f
        L_0x006f:
            java.util.HashMap r5 = (java.util.HashMap) r5
            com.google.android.gms.common.util.MapUtils.writeStringMapToJson(r1, r5)
            goto L_0x0013
        L_0x0075:
            r1.append(r6)
            byte[] r5 = (byte[]) r5
            java.lang.String r3 = com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(r5)
            goto L_0x0088
        L_0x007f:
            r1.append(r6)
            byte[] r5 = (byte[]) r5
            java.lang.String r3 = com.google.android.gms.common.util.Base64Utils.encode(r5)
        L_0x0088:
            r1.append(r3)
            r1.append(r6)
            goto L_0x0013
        L_0x008f:
            if (r6 >= r3) goto L_0x00a2
            if (r6 <= 0) goto L_0x0096
            r1.append(r7)
        L_0x0096:
            java.lang.Object r8 = r5.get(r6)
            if (r8 == 0) goto L_0x009f
            zaF(r1, r4, r8)
        L_0x009f:
            int r6 = r6 + 1
            goto L_0x008f
        L_0x00a2:
            java.lang.String r3 = "]"
            goto L_0x0055
        L_0x00a5:
            zaF(r1, r4, r5)
            goto L_0x0013
        L_0x00aa:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00b3
            java.lang.String r0 = "}"
            goto L_0x00b5
        L_0x00b3:
            java.lang.String r0 = "{}"
        L_0x00b5:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastJsonResponse.toString():java.lang.String");
    }

    public final void zaA(@mr2 Field field, @ts2 String str) {
        if (field.zak != null) {
            zaE(field, str);
        } else {
            setStringInternal(field, field.zae, str);
        }
    }

    public final void zaB(@mr2 Field field, @ts2 Map map) {
        if (field.zak != null) {
            zaE(field, map);
        } else {
            setStringMapInternal(field, field.zae, map);
        }
    }

    public final void zaC(@mr2 Field field, @ts2 ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            setStringsInternal(field, field.zae, arrayList);
        }
    }

    public final void zaa(@mr2 Field field, @ts2 BigDecimal bigDecimal) {
        if (field.zak != null) {
            zaE(field, bigDecimal);
        } else {
            zab(field, field.zae, bigDecimal);
        }
    }

    public void zab(@mr2 Field field, @mr2 String str, @ts2 BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(@mr2 Field field, @ts2 ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zad(field, field.zae, arrayList);
        }
    }

    public void zad(@mr2 Field field, @mr2 String str, @ts2 ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(@mr2 Field field, @ts2 BigInteger bigInteger) {
        if (field.zak != null) {
            zaE(field, bigInteger);
        } else {
            zaf(field, field.zae, bigInteger);
        }
    }

    public void zaf(@mr2 Field field, @mr2 String str, @ts2 BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(@mr2 Field field, @ts2 ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zah(field, field.zae, arrayList);
        }
    }

    public void zah(@mr2 Field field, @mr2 String str, @ts2 ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(@mr2 Field field, boolean z) {
        if (field.zak != null) {
            zaE(field, Boolean.valueOf(z));
        } else {
            setBooleanInternal(field, field.zae, z);
        }
    }

    public final void zaj(@mr2 Field field, @ts2 ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zak(field, field.zae, arrayList);
        }
    }

    public void zak(@mr2 Field field, @mr2 String str, @ts2 ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(@mr2 Field field, @ts2 byte[] bArr) {
        if (field.zak != null) {
            zaE(field, bArr);
        } else {
            setDecodedBytesInternal(field, field.zae, bArr);
        }
    }

    public final void zam(@mr2 Field field, double d) {
        if (field.zak != null) {
            zaE(field, Double.valueOf(d));
        } else {
            zan(field, field.zae, d);
        }
    }

    public void zan(@mr2 Field field, @mr2 String str, double d) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(@mr2 Field field, @ts2 ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zap(field, field.zae, arrayList);
        }
    }

    public void zap(@mr2 Field field, @mr2 String str, @ts2 ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(@mr2 Field field, float f) {
        if (field.zak != null) {
            zaE(field, Float.valueOf(f));
        } else {
            zar(field, field.zae, f);
        }
    }

    public void zar(@mr2 Field field, @mr2 String str, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(@mr2 Field field, @ts2 ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zat(field, field.zae, arrayList);
        }
    }

    public void zat(@mr2 Field field, @mr2 String str, @ts2 ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(@mr2 Field field, int i) {
        if (field.zak != null) {
            zaE(field, Integer.valueOf(i));
        } else {
            setIntegerInternal(field, field.zae, i);
        }
    }

    public final void zav(@mr2 Field field, @ts2 ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zaw(field, field.zae, arrayList);
        }
    }

    public void zaw(@mr2 Field field, @mr2 String str, @ts2 ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(@mr2 Field field, long j) {
        if (field.zak != null) {
            zaE(field, Long.valueOf(j));
        } else {
            setLongInternal(field, field.zae, j);
        }
    }

    public final void zay(@mr2 Field field, @ts2 ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zaz(field, field.zae, arrayList);
        }
    }

    public void zaz(@mr2 Field field, @mr2 String str, @ts2 ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }
}
