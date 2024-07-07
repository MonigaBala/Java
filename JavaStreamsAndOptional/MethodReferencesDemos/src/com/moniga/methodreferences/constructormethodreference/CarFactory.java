package com.moniga.methodreferences.constructormethodreference;

/**
 * @FunctionalInterface with one method named create() of type Car.
 */
public interface CarFactory {

	Car create(String model, int year);
}
