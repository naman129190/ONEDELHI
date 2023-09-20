package com.onedelhi.secure;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class jt6 extends lu6 {
    public jt6(int i) {
        super(i, (ku6) null);
    }

    /* renamed from: c */
    public final void mo18666c() {
        if (!mo19911n()) {
            for (int i = 0; i < mo19903d(); i++) {
                Map.Entry j = mo19910j(i);
                if (((wo6) j.getKey()).mo26642c()) {
                    j.setValue(Collections.unmodifiableList((List) j.getValue()));
                }
            }
            for (Map.Entry entry : mo19906f()) {
                if (((wo6) entry.getKey()).mo26642c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo18666c();
    }
}
