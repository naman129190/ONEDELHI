package com.onedelhi.secure;

import jmjou.C7601c;
import org.json.JSONArray;

public class e35 extends z25 {
    public void init(C7601c cVar, C7601c.C7602a aVar) {
        super.init(cVar, aVar);
        put("currentSdkTime", Long.valueOf(System.currentTimeMillis()));
        cVar.getClass();
        put("events", new JSONArray());
    }
}
