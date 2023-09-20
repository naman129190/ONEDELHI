package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.mr2;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

@KeepForSdk
public class ListenerHolders {
    private final Set zaa = Collections.newSetFromMap(new WeakHashMap());

    @mr2
    @KeepForSdk
    public static <L> ListenerHolder<L> createListenerHolder(@mr2 L l, @mr2 Looper looper, @mr2 String str) {
        Preconditions.checkNotNull(l, "Listener must not be null");
        Preconditions.checkNotNull(looper, "Looper must not be null");
        Preconditions.checkNotNull(str, "Listener type must not be null");
        return new ListenerHolder<>(looper, l, str);
    }

    @mr2
    @KeepForSdk
    public static <L> ListenerHolder<L> createListenerHolder(@mr2 L l, @mr2 Executor executor, @mr2 String str) {
        Preconditions.checkNotNull(l, "Listener must not be null");
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(str, "Listener type must not be null");
        return new ListenerHolder<>(executor, l, str);
    }

    @mr2
    @KeepForSdk
    public static <L> ListenerHolder.ListenerKey<L> createListenerKey(@mr2 L l, @mr2 String str) {
        Preconditions.checkNotNull(l, "Listener must not be null");
        Preconditions.checkNotNull(str, "Listener type must not be null");
        Preconditions.checkNotEmpty(str, "Listener type must not be empty");
        return new ListenerHolder.ListenerKey<>(l, str);
    }

    @mr2
    public final ListenerHolder zaa(@mr2 Object obj, @mr2 Looper looper, @mr2 String str) {
        ListenerHolder createListenerHolder = createListenerHolder(obj, looper, "NO_TYPE");
        this.zaa.add(createListenerHolder);
        return createListenerHolder;
    }

    public final void zab() {
        for (ListenerHolder clear : this.zaa) {
            clear.clear();
        }
        this.zaa.clear();
    }
}
