package com.onedelhi.secure;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class fo4 extends AbstractList<String> implements n22, RandomAccess {

    /* renamed from: a */
    public final n22 f28610a;

    /* renamed from: com.onedelhi.secure.fo4$a */
    public class C5297a implements ListIterator<String> {

        /* renamed from: a */
        public ListIterator<String> f28612a;

        /* renamed from: n */
        public final /* synthetic */ int f28613n;

        public C5297a(int i) {
            this.f28613n = i;
            this.f28612a = fo4.this.f28610a.listIterator(i);
        }

        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public String next() {
            return this.f28612a.next();
        }

        /* renamed from: d */
        public String previous() {
            return this.f28612a.previous();
        }

        /* renamed from: e */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f28612a.hasNext();
        }

        public boolean hasPrevious() {
            return this.f28612a.hasPrevious();
        }

        public int nextIndex() {
            return this.f28612a.nextIndex();
        }

        public int previousIndex() {
            return this.f28612a.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.onedelhi.secure.fo4$b */
    public class C5298b implements Iterator<String> {

        /* renamed from: a */
        public Iterator<String> f28615a;

        public C5298b() {
            this.f28615a = fo4.this.f28610a.iterator();
        }

        /* renamed from: a */
        public String next() {
            return this.f28615a.next();
        }

        public boolean hasNext() {
            return this.f28615a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public fo4(n22 n22) {
        this.f28610a = n22;
    }

    /* renamed from: E */
    public boolean mo36153E(Collection<byte[]> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: F0 */
    public List<byte[]> mo36154F0() {
        return Collections.unmodifiableList(this.f28610a.mo36154F0());
    }

    /* renamed from: H */
    public List<C5173er> mo36155H() {
        return Collections.unmodifiableList(this.f28610a.mo36155H());
    }

    /* renamed from: J1 */
    public n22 mo36156J1() {
        return this;
    }

    /* renamed from: M */
    public void mo36157M(C5173er erVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: M1 */
    public void mo36158M1(n22 n22) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a2 */
    public void mo36159a2(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b1 */
    public List<?> mo36160b1() {
        return this.f28610a.mo36160b1();
    }

    /* renamed from: e */
    public String get(int i) {
        return (String) this.f28610a.get(i);
    }

    /* renamed from: g2 */
    public Object mo36162g2(int i) {
        return this.f28610a.mo36162g2(i);
    }

    /* renamed from: i1 */
    public boolean mo36164i1(Collection<? extends C5173er> collection) {
        throw new UnsupportedOperationException();
    }

    public Iterator<String> iterator() {
        return new C5298b();
    }

    public ListIterator<String> listIterator(int i) {
        return new C5297a(i);
    }

    /* renamed from: m */
    public byte[] mo36167m(int i) {
        return this.f28610a.mo36167m(i);
    }

    /* renamed from: q */
    public void mo36168q(int i, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: s1 */
    public void mo36169s1(int i, C5173er erVar) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f28610a.size();
    }

    /* renamed from: w2 */
    public C5173er mo36171w2(int i) {
        return this.f28610a.mo36171w2(i);
    }
}
