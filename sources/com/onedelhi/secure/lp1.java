package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class lp1<E> implements List<E>, RandomAccess {

    /* renamed from: a */
    public final List<E> f31783a;

    public lp1(List<E> list) {
        this.f31783a = Collections.unmodifiableList(list);
    }

    @mr2
    /* renamed from: b */
    public static <E> lp1<E> m56329b(@mr2 List<E> list) {
        return new lp1<>(list);
    }

    @mr2
    /* renamed from: e */
    public static <E> lp1<E> m56330e(E... eArr) {
        return new lp1<>(Arrays.asList(eArr));
    }

    public void add(int i, @mr2 E e) {
        this.f31783a.add(i, e);
    }

    public boolean add(@mr2 E e) {
        return this.f31783a.add(e);
    }

    public boolean addAll(int i, @mr2 Collection<? extends E> collection) {
        return this.f31783a.addAll(i, collection);
    }

    public boolean addAll(@mr2 Collection<? extends E> collection) {
        return this.f31783a.addAll(collection);
    }

    public void clear() {
        this.f31783a.clear();
    }

    public boolean contains(@ts2 Object obj) {
        return this.f31783a.contains(obj);
    }

    public boolean containsAll(@mr2 Collection<?> collection) {
        return this.f31783a.containsAll(collection);
    }

    public boolean equals(@ts2 Object obj) {
        return this.f31783a.equals(obj);
    }

    @mr2
    public E get(int i) {
        return this.f31783a.get(i);
    }

    public int hashCode() {
        return this.f31783a.hashCode();
    }

    public int indexOf(@ts2 Object obj) {
        return this.f31783a.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f31783a.isEmpty();
    }

    @mr2
    public Iterator<E> iterator() {
        return this.f31783a.iterator();
    }

    public int lastIndexOf(@ts2 Object obj) {
        return this.f31783a.lastIndexOf(obj);
    }

    @mr2
    public ListIterator<E> listIterator() {
        return this.f31783a.listIterator();
    }

    @mr2
    public ListIterator<E> listIterator(int i) {
        return this.f31783a.listIterator(i);
    }

    public E remove(int i) {
        return this.f31783a.remove(i);
    }

    public boolean remove(@ts2 Object obj) {
        return this.f31783a.remove(obj);
    }

    public boolean removeAll(@mr2 Collection<?> collection) {
        return this.f31783a.removeAll(collection);
    }

    public boolean retainAll(@mr2 Collection<?> collection) {
        return this.f31783a.retainAll(collection);
    }

    @mr2
    public E set(int i, @mr2 E e) {
        return this.f31783a.set(i, e);
    }

    public int size() {
        return this.f31783a.size();
    }

    @mr2
    public List<E> subList(int i, int i2) {
        return this.f31783a.subList(i, i2);
    }

    @ts2
    public Object[] toArray() {
        return this.f31783a.toArray();
    }

    public <T> T[] toArray(@ts2 T[] tArr) {
        return this.f31783a.toArray(tArr);
    }
}
