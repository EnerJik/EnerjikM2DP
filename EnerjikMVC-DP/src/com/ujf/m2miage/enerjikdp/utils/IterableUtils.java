package com.ujf.m2miage.enerjikdp.utils;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Classe utilitaire
 * @author lalaina
 *
 */
public class IterableUtils {
	public static <E> Collection<E> makeCollection(Iterable<E> iter) {
		Collection<E> list = new ArrayList<E>();
		for (E item : iter) {
			list.add(item);
		}
		return list;
	}
}
