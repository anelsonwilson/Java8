package com.infotech.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Modified by me. Dev branch creation.
 * @author nelson
 *
 */
public class ClientTest {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(4,9,36,100);
		numbers.forEach(System.out::println);
		System.out.println("-------------------------");
		
		List<Double> squareRoots = ClientTest.findSquareRoots(numbers,Integer::new);
		squareRoots.forEach(System.out::println);
	}

	private static List<Double> findSquareRoots(List<Integer> numbers,Function<Integer, Integer> f) {
		List<Double> results = new ArrayList<>();
		numbers.forEach(x->results.add(Math.sqrt(f.apply(x))));
		return results;
	}
}
