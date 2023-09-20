package com.onedelhi.secure;

import com.onedelhi.secure.e06;
import com.onedelhi.secure.i06;

public abstract class e06<MessageType extends i06<MessageType, BuilderType>, BuilderType extends e06<MessageType, BuilderType>> implements f96 {
    /* renamed from: ai */
    public final /* bridge */ /* synthetic */ f96 mo14967ai(i96 i96) {
        if (mo15049a().getClass().isInstance(i96)) {
            return mo14970d((i06) i96);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: c */
    public abstract e06 clone();

    /* renamed from: d */
    public abstract e06 mo14970d(i06 i06);
}
