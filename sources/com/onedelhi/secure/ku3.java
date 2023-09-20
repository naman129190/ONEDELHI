package com.onedelhi.secure;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u001b\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0002¨\u0006\u0012"}, d2 = {"Lcom/onedelhi/secure/ku3;", "Ljava/io/Externalizable;", "Ljava/io/ObjectOutput;", "output", "Lcom/onedelhi/secure/un4;", "writeExternal", "Ljava/io/ObjectInput;", "input", "readExternal", "", "a", "", "collection", "", "tag", "<init>", "(Ljava/util/Collection;I)V", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class ku3 implements Externalizable {
    @vr2

    /* renamed from: a */
    public static final C5940a f31436a = new C5940a((wg0) null);

    /* renamed from: b */
    public static final long f31437b = 0;

    /* renamed from: o */
    public static final int f31438o = 0;

    /* renamed from: p */
    public static final int f31439p = 1;
    @vr2

    /* renamed from: a */
    public Collection<?> f31440a;

    /* renamed from: n */
    public final int f31441n;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/ku3$a;", "", "", "serialVersionUID", "J", "", "tagList", "I", "tagSet", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.ku3$a */
    public static final class C5940a {
        public C5940a() {
        }

        public /* synthetic */ C5940a(wg0 wg0) {
            this();
        }
    }

    public ku3() {
        this(s00.m64037F(), 0);
    }

    public ku3(@vr2 Collection<?> collection, int i) {
        jt1.m53777p(collection, "collection");
        this.f31440a = collection;
        this.f31441n = i;
    }

    /* renamed from: a */
    public final Object mo39516a() {
        return this.f31440a;
    }

    public void readExternal(@vr2 ObjectInput objectInput) {
        Collection<?> collection;
        jt1.m53777p(objectInput, "input");
        byte readByte = objectInput.readByte();
        byte b = readByte & 1;
        if ((readByte & -2) == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                int i = 0;
                if (b == 0) {
                    List k = r00.m63299k(readInt);
                    while (i < readInt) {
                        k.add(objectInput.readObject());
                        i++;
                    }
                    collection = r00.m63290b(k);
                } else if (b == 1) {
                    Set e = gv3.m49894e(readInt);
                    while (i < readInt) {
                        e.add(objectInput.readObject());
                        i++;
                    }
                    collection = gv3.m49890a(e);
                } else {
                    throw new InvalidObjectException("Unsupported collection type tag: " + b + '.');
                }
                this.f31440a = collection;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + readByte + '.');
    }

    public void writeExternal(@vr2 ObjectOutput objectOutput) {
        jt1.m53777p(objectOutput, "output");
        objectOutput.writeByte(this.f31441n);
        objectOutput.writeInt(this.f31440a.size());
        for (Object writeObject : this.f31440a) {
            objectOutput.writeObject(writeObject);
        }
    }
}
