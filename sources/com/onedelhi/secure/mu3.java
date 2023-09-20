package com.onedelhi.secure;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0017\u0012\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\r\u0010\u000eB\t\b\u0016¢\u0006\u0004\b\r\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0002¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/mu3;", "Ljava/io/Externalizable;", "Ljava/io/ObjectOutput;", "output", "Lcom/onedelhi/secure/un4;", "writeExternal", "Ljava/io/ObjectInput;", "input", "readExternal", "", "a", "", "map", "<init>", "(Ljava/util/Map;)V", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class mu3 implements Externalizable {
    @vr2

    /* renamed from: a */
    public static final C6143a f32281a = new C6143a((wg0) null);

    /* renamed from: b */
    public static final long f32282b = 0;
    @vr2

    /* renamed from: a */
    public Map<?, ?> f32283a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/onedelhi/secure/mu3$a;", "", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.mu3$a */
    public static final class C6143a {
        public C6143a() {
        }

        public /* synthetic */ C6143a(wg0 wg0) {
            this();
        }
    }

    public mu3() {
        this(id2.m52156z());
    }

    public mu3(@vr2 Map<?, ?> map) {
        jt1.m53777p(map, "map");
        this.f32283a = map;
    }

    /* renamed from: a */
    public final Object mo40789a() {
        return this.f32283a;
    }

    public void readExternal(@vr2 ObjectInput objectInput) {
        jt1.m53777p(objectInput, "input");
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                Map h = hd2.m50456h(readInt);
                for (int i = 0; i < readInt; i++) {
                    h.put(objectInput.readObject(), objectInput.readObject());
                }
                this.f32283a = hd2.m50452d(h);
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + readByte);
    }

    public void writeExternal(@vr2 ObjectOutput objectOutput) {
        jt1.m53777p(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.f32283a.size());
        for (Map.Entry next : this.f32283a.entrySet()) {
            objectOutput.writeObject(next.getKey());
            objectOutput.writeObject(next.getValue());
        }
    }
}
