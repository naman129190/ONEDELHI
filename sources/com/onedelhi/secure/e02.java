package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0006B\u001d\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0002\u0010\tB\u0013\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/e02;", "Ljava/lang/Error;", "<init>", "()V", "", "message", "(Ljava/lang/String;)V", "", "cause", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public class e02 extends Error {
    public e02() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public e02(@ss2 String str) {
        super(str);
    }

    public e02(@ss2 String str, @ss2 Throwable th) {
        super(str, th);
    }

    public e02(@ss2 Throwable th) {
        super(th);
    }
}
