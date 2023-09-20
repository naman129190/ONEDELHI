package jmjou;

import com.onedelhi.secure.j15;
import com.onedelhi.secure.m05;
import jmjou.C7601c;

/* renamed from: jmjou.a */
public class C7599a implements C7606e {

    /* renamed from: a */
    public j15 f38773a;

    /* renamed from: a */
    public C7601c f38774a;

    public void init(C7601c cVar, C7601c.C7602a aVar) {
        m05.m56772c("EventLoggerJS", "initializing EventLoggerJS ..");
        this.f38774a = cVar;
        j15 j15 = (j15) (aVar.containsKey("bridgeCallback") ? aVar.get("bridgeCallback") : null);
        this.f38773a = j15;
        m05.m56772c("EventLoggerJS", String.format("initialization completed bridgeCallback = {%s} is set", new Object[]{j15}));
    }

    public boolean isCachingAllowed() {
        return false;
    }
}
