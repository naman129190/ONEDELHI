package com.onedelhi.secure;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class vb6 extends zc6 {
    public vb6(int i) {
        super(i, (wc6) null);
    }

    /* renamed from: c */
    public final void mo26000c() {
        if (!mo27932n()) {
            for (int i = 0; i < mo27924d(); i++) {
                Map.Entry j = mo27931j(i);
                if (((m46) j.getKey()).mo20096c()) {
                    j.setValue(Collections.unmodifiableList((List) j.getValue()));
                }
            }
            for (Map.Entry entry : mo27927f()) {
                if (((m46) entry.getKey()).mo20096c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo26000c();
    }
}
