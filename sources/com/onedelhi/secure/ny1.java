package com.onedelhi.secure;

import java.util.Arrays;
import java.util.HashMap;

public class ny1 {

    /* renamed from: a */
    public HashMap<Object, HashMap<String, float[]>> f17618a = new HashMap<>();

    /* renamed from: a */
    public float mo21502a(Object obj, String str, int i) {
        HashMap hashMap;
        float[] fArr;
        if (this.f17618a.containsKey(obj) && (hashMap = this.f17618a.get(obj)) != null && hashMap.containsKey(str) && (fArr = (float[]) hashMap.get(str)) != null && fArr.length > i) {
            return fArr[i];
        }
        return Float.NaN;
    }

    /* renamed from: b */
    public void mo21503b(Object obj, String str, int i, float f) {
        HashMap hashMap;
        if (!this.f17618a.containsKey(obj)) {
            hashMap = new HashMap();
            float[] fArr = new float[(i + 1)];
            fArr[i] = f;
            hashMap.put(str, fArr);
        } else {
            hashMap = this.f17618a.get(obj);
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            if (!hashMap.containsKey(str)) {
                float[] fArr2 = new float[(i + 1)];
                fArr2[i] = f;
                hashMap.put(str, fArr2);
            } else {
                float[] fArr3 = (float[]) hashMap.get(str);
                if (fArr3 == null) {
                    fArr3 = new float[0];
                }
                if (fArr3.length <= i) {
                    fArr3 = Arrays.copyOf(fArr3, i + 1);
                }
                fArr3[i] = f;
                hashMap.put(str, fArr3);
                return;
            }
        }
        this.f17618a.put(obj, hashMap);
    }
}
