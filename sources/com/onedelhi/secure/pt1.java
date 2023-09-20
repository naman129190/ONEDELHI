package com.onedelhi.secure;

import androidx.lifecycle.LiveData;
import androidx.room.C0980e;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;

public class pt1 {

    /* renamed from: a */
    public final ym3 f18701a;
    @hw4

    /* renamed from: a */
    public final Set<LiveData> f18702a = Collections.newSetFromMap(new IdentityHashMap());

    public pt1(ym3 ym3) {
        this.f18701a = ym3;
    }

    /* renamed from: a */
    public <T> LiveData<T> mo22633a(String[] strArr, boolean z, Callable<T> callable) {
        return new C0980e(this.f18701a, this, z, callable, strArr);
    }

    /* renamed from: b */
    public void mo22634b(LiveData liveData) {
        this.f18702a.add(liveData);
    }

    /* renamed from: c */
    public void mo22635c(LiveData liveData) {
        this.f18702a.remove(liveData);
    }
}
