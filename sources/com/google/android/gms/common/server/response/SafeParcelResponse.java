package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.vf4;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@KeepForSdk
@SafeParcelable.Class(creator = "SafeParcelResponseCreator")
@VisibleForTesting
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    @mr2
    @KeepForSdk
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zaq();
    @SafeParcelable.VersionField(getter = "getVersionCode", mo10062id = 1)
    private final int zaa;
    @SafeParcelable.Field(getter = "getParcel", mo10053id = 2)
    private final Parcel zab;
    private final int zac;
    @SafeParcelable.Field(getter = "getFieldMappingDictionary", mo10053id = 3)
    private final zan zad;
    @ts2
    private final String zae;
    private int zaf;
    private int zag;

    @SafeParcelable.Constructor
    public SafeParcelResponse(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) Parcel parcel, @SafeParcelable.Param(mo10056id = 3) zan zan) {
        this.zaa = i;
        this.zab = (Parcel) Preconditions.checkNotNull(parcel);
        this.zac = 2;
        this.zad = zan;
        this.zae = zan == null ? null : zan.zaa();
        this.zaf = 2;
    }

    private SafeParcelResponse(SafeParcelable safeParcelable, zan zan, String str) {
        this.zaa = 1;
        Parcel obtain = Parcel.obtain();
        this.zab = obtain;
        safeParcelable.writeToParcel(obtain, 0);
        this.zac = 1;
        this.zad = (zan) Preconditions.checkNotNull(zan);
        this.zae = (String) Preconditions.checkNotNull(str);
        this.zaf = 2;
    }

    public SafeParcelResponse(zan zan, String str) {
        this.zaa = 1;
        this.zab = Parcel.obtain();
        this.zac = 0;
        this.zad = (zan) Preconditions.checkNotNull(zan);
        this.zae = (String) Preconditions.checkNotNull(str);
        this.zaf = 0;
    }

    @mr2
    @KeepForSdk
    public static <T extends FastJsonResponse & SafeParcelable> SafeParcelResponse from(@mr2 T t) {
        zan zan = new zan(t.getClass());
        zaF(zan, t);
        zan.zac();
        zan.zad();
        return new SafeParcelResponse((SafeParcelable) t, zan, (String) Preconditions.checkNotNull(t.getClass().getCanonicalName()));
    }

    private static void zaF(zan zan, FastJsonResponse fastJsonResponse) {
        Class<?> cls = fastJsonResponse.getClass();
        if (!zan.zaf(cls)) {
            Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
            zan.zae(cls, fieldMappings);
            for (String str : fieldMappings.keySet()) {
                FastJsonResponse.Field field = fieldMappings.get(str);
                Class cls2 = field.zag;
                if (cls2 != null) {
                    try {
                        zaF(zan, (FastJsonResponse) cls2.newInstance());
                    } catch (InstantiationException e) {
                        throw new IllegalStateException("Could not instantiate an object of type ".concat(String.valueOf(((Class) Preconditions.checkNotNull(field.zag)).getCanonicalName())), e);
                    } catch (IllegalAccessException e2) {
                        throw new IllegalStateException("Could not access object of type ".concat(String.valueOf(((Class) Preconditions.checkNotNull(field.zag)).getCanonicalName())), e2);
                    }
                }
            }
        }
    }

    private final void zaG(FastJsonResponse.Field field) {
        if (field.zaf != -1) {
            Parcel parcel = this.zab;
            if (parcel != null) {
                int i = this.zaf;
                if (i == 0) {
                    this.zag = SafeParcelWriter.beginObjectHeader(parcel);
                    this.zaf = 1;
                } else if (i != 1) {
                    throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
                }
            } else {
                throw new IllegalStateException("Internal Parcel object is null.");
            }
        } else {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0107, code lost:
        r3 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x010b, code lost:
        zaJ(r11, r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0214, code lost:
        r11.append(r3);
        r11.append("\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0249, code lost:
        r11.append(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zaH(java.lang.StringBuilder r11, java.util.Map r12, android.os.Parcel r13) {
        /*
            r10 = this;
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x000d:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r12.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r2
            int r2 = r2.getSafeParcelableFieldId()
            r0.put(r2, r1)
            goto L_0x000d
        L_0x0027:
            r12 = 123(0x7b, float:1.72E-43)
            r11.append(r12)
            int r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r13)
            r1 = 0
            r2 = 1
            r3 = 0
        L_0x0033:
            int r4 = r13.dataPosition()
            if (r4 >= r12) goto L_0x0257
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r13)
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r4)
            java.lang.Object r5 = r0.get(r5)
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            if (r5 == 0) goto L_0x0033
            java.lang.String r6 = ","
            if (r3 == 0) goto L_0x0050
            r11.append(r6)
        L_0x0050:
            java.lang.Object r3 = r5.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r5.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r5 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r5
            java.lang.String r7 = "\""
            r11.append(r7)
            r11.append(r3)
            java.lang.String r3 = "\":"
            r11.append(r3)
            boolean r3 = r5.zaj()
            if (r3 == 0) goto L_0x0111
            int r3 = r5.zac
            switch(r3) {
                case 0: goto L_0x00ff;
                case 1: goto L_0x00fa;
                case 2: goto L_0x00f1;
                case 3: goto L_0x00e8;
                case 4: goto L_0x00df;
                case 5: goto L_0x00da;
                case 6: goto L_0x00d1;
                case 7: goto L_0x00cc;
                case 8: goto L_0x00c3;
                case 9: goto L_0x00c3;
                case 10: goto L_0x0093;
                case 11: goto L_0x008b;
                default: goto L_0x0074;
            }
        L_0x0074:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Unknown field out type = "
            r12.append(r13)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x008b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Method does not accept concrete type."
            r11.<init>(r12)
            throw r11
        L_0x0093:
            android.os.Bundle r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r13, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Set r6 = r3.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x00a4:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00be
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = r3.getString(r7)
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            java.lang.String r8 = (java.lang.String) r8
            r4.put(r7, r8)
            goto L_0x00a4
        L_0x00be:
            java.lang.Object r3 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r5, r4)
            goto L_0x010b
        L_0x00c3:
            byte[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r13, r4)
            java.lang.Object r3 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r5, r3)
            goto L_0x010b
        L_0x00cc:
            java.lang.String r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r13, r4)
            goto L_0x0107
        L_0x00d1:
            boolean r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x0107
        L_0x00da:
            java.math.BigDecimal r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimal(r13, r4)
            goto L_0x0107
        L_0x00df:
            double r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(r13, r4)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            goto L_0x0107
        L_0x00e8:
            float r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r13, r4)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x0107
        L_0x00f1:
            long r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r13, r4)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0107
        L_0x00fa:
            java.math.BigInteger r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigInteger(r13, r4)
            goto L_0x0107
        L_0x00ff:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x0107:
            java.lang.Object r3 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r5, r3)
        L_0x010b:
            zaJ(r11, r5, r3)
        L_0x010e:
            r3 = 1
            goto L_0x0033
        L_0x0111:
            boolean r3 = r5.zad
            if (r3 == 0) goto L_0x0193
            java.lang.String r3 = "["
            r11.append(r3)
            int r3 = r5.zac
            switch(r3) {
                case 0: goto L_0x0185;
                case 1: goto L_0x017d;
                case 2: goto L_0x0175;
                case 3: goto L_0x016d;
                case 4: goto L_0x0165;
                case 5: goto L_0x015d;
                case 6: goto L_0x0155;
                case 7: goto L_0x014d;
                case 8: goto L_0x0145;
                case 9: goto L_0x0145;
                case 10: goto L_0x0145;
                case 11: goto L_0x0127;
                default: goto L_0x011f;
            }
        L_0x011f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Unknown field type out."
            r11.<init>(r12)
            throw r11
        L_0x0127:
            android.os.Parcel[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelArray(r13, r4)
            int r4 = r3.length
            r7 = 0
        L_0x012d:
            if (r7 >= r4) goto L_0x018c
            if (r7 <= 0) goto L_0x0134
            r11.append(r6)
        L_0x0134:
            r8 = r3[r7]
            r8.setDataPosition(r1)
            java.util.Map r8 = r5.zah()
            r9 = r3[r7]
            r10.zaH(r11, r8, r9)
            int r7 = r7 + 1
            goto L_0x012d
        L_0x0145:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            java.lang.String r12 = "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"
            r11.<init>(r12)
            throw r11
        L_0x014d:
            java.lang.String[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(r13, r4)
            com.google.android.gms.common.util.ArrayUtils.writeStringArray(r11, r3)
            goto L_0x018c
        L_0x0155:
            boolean[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBooleanArray(r13, r4)
            com.google.android.gms.common.util.ArrayUtils.writeArray((java.lang.StringBuilder) r11, (boolean[]) r3)
            goto L_0x018c
        L_0x015d:
            java.math.BigDecimal[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimalArray(r13, r4)
            com.google.android.gms.common.util.ArrayUtils.writeArray((java.lang.StringBuilder) r11, (T[]) r3)
            goto L_0x018c
        L_0x0165:
            double[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createDoubleArray(r13, r4)
            com.google.android.gms.common.util.ArrayUtils.writeArray((java.lang.StringBuilder) r11, (double[]) r3)
            goto L_0x018c
        L_0x016d:
            float[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createFloatArray(r13, r4)
            com.google.android.gms.common.util.ArrayUtils.writeArray((java.lang.StringBuilder) r11, (float[]) r3)
            goto L_0x018c
        L_0x0175:
            long[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createLongArray(r13, r4)
            com.google.android.gms.common.util.ArrayUtils.writeArray((java.lang.StringBuilder) r11, (long[]) r3)
            goto L_0x018c
        L_0x017d:
            java.math.BigInteger[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigIntegerArray(r13, r4)
            com.google.android.gms.common.util.ArrayUtils.writeArray((java.lang.StringBuilder) r11, (T[]) r3)
            goto L_0x018c
        L_0x0185:
            int[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntArray(r13, r4)
            com.google.android.gms.common.util.ArrayUtils.writeArray((java.lang.StringBuilder) r11, (int[]) r3)
        L_0x018c:
            java.lang.String r3 = "]"
        L_0x018e:
            r11.append(r3)
            goto L_0x010e
        L_0x0193:
            int r3 = r5.zac
            switch(r3) {
                case 0: goto L_0x024e;
                case 1: goto L_0x0245;
                case 2: goto L_0x023c;
                case 3: goto L_0x0233;
                case 4: goto L_0x022a;
                case 5: goto L_0x0225;
                case 6: goto L_0x021c;
                case 7: goto L_0x0209;
                case 8: goto L_0x01fd;
                case 9: goto L_0x01f1;
                case 10: goto L_0x01b0;
                case 11: goto L_0x01a0;
                default: goto L_0x0198;
            }
        L_0x0198:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Unknown field type out"
            r11.<init>(r12)
            throw r11
        L_0x01a0:
            android.os.Parcel r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcel(r13, r4)
            r3.setDataPosition(r1)
            java.util.Map r4 = r5.zah()
            r10.zaH(r11, r4, r3)
            goto L_0x010e
        L_0x01b0:
            android.os.Bundle r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r13, r4)
            java.util.Set r4 = r3.keySet()
            java.lang.String r5 = "{"
            r11.append(r5)
            java.util.Iterator r4 = r4.iterator()
            r5 = 1
        L_0x01c2:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x01ee
            java.lang.Object r8 = r4.next()
            java.lang.String r8 = (java.lang.String) r8
            if (r5 != 0) goto L_0x01d3
            r11.append(r6)
        L_0x01d3:
            r11.append(r7)
            r11.append(r8)
            java.lang.String r5 = "\":\""
            r11.append(r5)
            java.lang.String r5 = r3.getString(r8)
            java.lang.String r5 = com.google.android.gms.common.util.JsonUtils.escapeString(r5)
            r11.append(r5)
            r11.append(r7)
            r5 = 0
            goto L_0x01c2
        L_0x01ee:
            java.lang.String r3 = "}"
            goto L_0x018e
        L_0x01f1:
            byte[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r13, r4)
            r11.append(r7)
            java.lang.String r3 = com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(r3)
            goto L_0x0214
        L_0x01fd:
            byte[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r13, r4)
            r11.append(r7)
            java.lang.String r3 = com.google.android.gms.common.util.Base64Utils.encode(r3)
            goto L_0x0214
        L_0x0209:
            java.lang.String r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r13, r4)
            r11.append(r7)
            java.lang.String r3 = com.google.android.gms.common.util.JsonUtils.escapeString(r3)
        L_0x0214:
            r11.append(r3)
            r11.append(r7)
            goto L_0x010e
        L_0x021c:
            boolean r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r4)
            r11.append(r3)
            goto L_0x010e
        L_0x0225:
            java.math.BigDecimal r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimal(r13, r4)
            goto L_0x0249
        L_0x022a:
            double r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(r13, r4)
            r11.append(r3)
            goto L_0x010e
        L_0x0233:
            float r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r13, r4)
            r11.append(r3)
            goto L_0x010e
        L_0x023c:
            long r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r13, r4)
            r11.append(r3)
            goto L_0x010e
        L_0x0245:
            java.math.BigInteger r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigInteger(r13, r4)
        L_0x0249:
            r11.append(r3)
            goto L_0x010e
        L_0x024e:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r4)
            r11.append(r3)
            goto L_0x010e
        L_0x0257:
            int r0 = r13.dataPosition()
            if (r0 != r12) goto L_0x0263
            r12 = 125(0x7d, float:1.75E-43)
            r11.append(r12)
            return
        L_0x0263:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException r11 = new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Overread allowed size end="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12, r13)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.zaH(java.lang.StringBuilder, java.util.Map, android.os.Parcel):void");
    }

    private static final void zaI(StringBuilder sb, int i, @ts2 Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(JsonUtils.escapeString(Preconditions.checkNotNull(obj).toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(Base64Utils.encode((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(Base64Utils.encodeUrlSafe((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                MapUtils.writeStringMapToJson(sb, (HashMap) Preconditions.checkNotNull(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i);
        }
    }

    private static final void zaJ(StringBuilder sb, FastJsonResponse.Field field, Object obj) {
        if (field.zab) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(vf4.f36537c);
                }
                zaI(sb, field.zaa, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        zaI(sb, field.zaa, obj);
    }

    public final <T extends FastJsonResponse> void addConcreteTypeArrayInternal(@mr2 FastJsonResponse.Field field, @mr2 String str, @ts2 ArrayList<T> arrayList) {
        zaG(field);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((SafeParcelResponse) ((FastJsonResponse) arrayList.get(i))).zaE());
        }
        SafeParcelWriter.writeParcelList(this.zab, field.getSafeParcelableFieldId(), arrayList2, true);
    }

    public final <T extends FastJsonResponse> void addConcreteTypeInternal(@mr2 FastJsonResponse.Field field, @mr2 String str, @mr2 T t) {
        zaG(field);
        SafeParcelWriter.writeParcel(this.zab, field.getSafeParcelableFieldId(), ((SafeParcelResponse) t).zaE(), true);
    }

    @ts2
    public final Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        zan zan = this.zad;
        if (zan == null) {
            return null;
        }
        return zan.zab((String) Preconditions.checkNotNull(this.zae));
    }

    @mr2
    public final Object getValueObject(@mr2 String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final boolean isPrimitiveFieldSet(@mr2 String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final void setBooleanInternal(@mr2 FastJsonResponse.Field<?, ?> field, @mr2 String str, boolean z) {
        zaG(field);
        SafeParcelWriter.writeBoolean(this.zab, field.getSafeParcelableFieldId(), z);
    }

    public final void setDecodedBytesInternal(@mr2 FastJsonResponse.Field<?, ?> field, @mr2 String str, @ts2 byte[] bArr) {
        zaG(field);
        SafeParcelWriter.writeByteArray(this.zab, field.getSafeParcelableFieldId(), bArr, true);
    }

    public final void setIntegerInternal(@mr2 FastJsonResponse.Field<?, ?> field, @mr2 String str, int i) {
        zaG(field);
        SafeParcelWriter.writeInt(this.zab, field.getSafeParcelableFieldId(), i);
    }

    public final void setLongInternal(@mr2 FastJsonResponse.Field<?, ?> field, @mr2 String str, long j) {
        zaG(field);
        SafeParcelWriter.writeLong(this.zab, field.getSafeParcelableFieldId(), j);
    }

    public final void setStringInternal(@mr2 FastJsonResponse.Field<?, ?> field, @mr2 String str, @ts2 String str2) {
        zaG(field);
        SafeParcelWriter.writeString(this.zab, field.getSafeParcelableFieldId(), str2, true);
    }

    public final void setStringMapInternal(@mr2 FastJsonResponse.Field<?, ?> field, @mr2 String str, @ts2 Map<String, String> map) {
        zaG(field);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) Preconditions.checkNotNull(map)).keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        SafeParcelWriter.writeBundle(this.zab, field.getSafeParcelableFieldId(), bundle, true);
    }

    public final void setStringsInternal(@mr2 FastJsonResponse.Field<?, ?> field, @mr2 String str, @ts2 ArrayList<String> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = arrayList.get(i);
        }
        SafeParcelWriter.writeStringArray(this.zab, field.getSafeParcelableFieldId(), strArr, true);
    }

    @mr2
    public final String toString() {
        Preconditions.checkNotNull(this.zad, "Cannot convert to JSON on client side.");
        Parcel zaE = zaE();
        zaE.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        zaH(sb, (Map) Preconditions.checkNotNull(this.zad.zab((String) Preconditions.checkNotNull(this.zae))), zaE);
        return sb.toString();
    }

    public final void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeParcel(parcel, 2, zaE(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zac != 0 ? this.zad : null, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @mr2
    public final Parcel zaE() {
        int i = this.zaf;
        if (i != 0) {
            if (i == 1) {
                SafeParcelWriter.finishObjectHeader(this.zab, this.zag);
            }
            return this.zab;
        }
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(this.zab);
        this.zag = beginObjectHeader;
        SafeParcelWriter.finishObjectHeader(this.zab, beginObjectHeader);
        this.zaf = 2;
        return this.zab;
    }

    public final void zab(@mr2 FastJsonResponse.Field field, @mr2 String str, @ts2 BigDecimal bigDecimal) {
        zaG(field);
        SafeParcelWriter.writeBigDecimal(this.zab, field.getSafeParcelableFieldId(), bigDecimal, true);
    }

    public final void zad(@mr2 FastJsonResponse.Field field, @mr2 String str, @ts2 ArrayList arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i = 0; i < size; i++) {
            bigDecimalArr[i] = (BigDecimal) arrayList.get(i);
        }
        SafeParcelWriter.writeBigDecimalArray(this.zab, field.getSafeParcelableFieldId(), bigDecimalArr, true);
    }

    public final void zaf(@mr2 FastJsonResponse.Field field, @mr2 String str, @ts2 BigInteger bigInteger) {
        zaG(field);
        SafeParcelWriter.writeBigInteger(this.zab, field.getSafeParcelableFieldId(), bigInteger, true);
    }

    public final void zah(@mr2 FastJsonResponse.Field field, @mr2 String str, @ts2 ArrayList arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i = 0; i < size; i++) {
            bigIntegerArr[i] = (BigInteger) arrayList.get(i);
        }
        SafeParcelWriter.writeBigIntegerArray(this.zab, field.getSafeParcelableFieldId(), bigIntegerArr, true);
    }

    public final void zak(@mr2 FastJsonResponse.Field field, @mr2 String str, @ts2 ArrayList arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = ((Boolean) arrayList.get(i)).booleanValue();
        }
        SafeParcelWriter.writeBooleanArray(this.zab, field.getSafeParcelableFieldId(), zArr, true);
    }

    public final void zan(@mr2 FastJsonResponse.Field field, @mr2 String str, double d) {
        zaG(field);
        SafeParcelWriter.writeDouble(this.zab, field.getSafeParcelableFieldId(), d);
    }

    public final void zap(@mr2 FastJsonResponse.Field field, @mr2 String str, @ts2 ArrayList arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        SafeParcelWriter.writeDoubleArray(this.zab, field.getSafeParcelableFieldId(), dArr, true);
    }

    public final void zar(@mr2 FastJsonResponse.Field field, @mr2 String str, float f) {
        zaG(field);
        SafeParcelWriter.writeFloat(this.zab, field.getSafeParcelableFieldId(), f);
    }

    public final void zat(@mr2 FastJsonResponse.Field field, @mr2 String str, @ts2 ArrayList arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = ((Float) arrayList.get(i)).floatValue();
        }
        SafeParcelWriter.writeFloatArray(this.zab, field.getSafeParcelableFieldId(), fArr, true);
    }

    public final void zaw(@mr2 FastJsonResponse.Field field, @mr2 String str, @ts2 ArrayList arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        SafeParcelWriter.writeIntArray(this.zab, field.getSafeParcelableFieldId(), iArr, true);
    }

    public final void zaz(@mr2 FastJsonResponse.Field field, @mr2 String str, @ts2 ArrayList arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        SafeParcelWriter.writeLongArray(this.zab, field.getSafeParcelableFieldId(), jArr, true);
    }
}
