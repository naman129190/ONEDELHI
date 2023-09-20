package com.onedelhi.secure;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/onedelhi/secure/l3;", "I", "O", "", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;", "", "resultCode", "intent", "c", "(ILandroid/content/Intent;)Ljava/lang/Object;", "Lcom/onedelhi/secure/l3$a;", "b", "(Landroid/content/Context;Ljava/lang/Object;)Lcom/onedelhi/secure/l3$a;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.l3 */
public abstract class C2691l3<I, O> {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/onedelhi/secure/l3$a;", "T", "", "value", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.l3$a */
    public static final class C2692a<T> {

        /* renamed from: a */
        public final T f15155a;

        public C2692a(T t) {
            this.f15155a = t;
        }

        /* renamed from: a */
        public final T mo19273a() {
            return this.f15155a;
        }
    }

    @vr2
    /* renamed from: a */
    public abstract Intent mo4654a(@vr2 Context context, I i);

    @ss2
    /* renamed from: b */
    public C2692a<O> mo19272b(@vr2 Context context, I i) {
        jt1.m53777p(context, "context");
        return null;
    }

    /* renamed from: c */
    public abstract O mo4655c(int i, @ss2 Intent intent);
}
