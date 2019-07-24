package com.epam.collections.collectionTask.customCollection.api;

import java.util.ArrayList;

public abstract class AbstractCustomSet<E> extends AbstractCustomCollection<E> implements CustomSet<E> {

	protected int numberOFBuckets;
	protected int size;
	protected  ArrayList Buckets[];

	protected AbstractCustomSet() {
		numberOFBuckets=100;
		size=0;
    }
	
	public int indexOfBucket(Object o) {
		return Math.abs(o.hashCode())%numberOFBuckets;
	}
	
	public int size() {
		return size;
	}
}
