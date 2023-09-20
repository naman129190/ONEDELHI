package com.onedelhi.secure;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

public class d40 {

    /* renamed from: a */
    public List<ti4> f10611a = new ArrayList();

    /* renamed from: a */
    public void mo14491a(ti4 ti4) {
        this.f10611a.add(ti4);
    }

    /* renamed from: b */
    public void mo14492b(Path path) {
        for (int size = this.f10611a.size() - 1; size >= 0; size--) {
            yq4.m32599b(path, this.f10611a.get(size));
        }
    }
}
