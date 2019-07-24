package com.epam.collections.collectionTask.customCollection.api;

public interface CustomCollection<E> {
	int size();
	boolean isEmpty();
	boolean contains(Object o);
	boolean add(E e);
	boolean remove(Object o);
}
