package com.epam.collections.collectionTask.customCollection.api;

public abstract class AbstractCustomCollection<E> implements CustomCollection<E> {
	
	protected AbstractCustomCollection() {
    }
	
	public boolean isEmpty() {
		return size()==0;
	}

}
