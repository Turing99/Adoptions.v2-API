package com.p5.adoptions_v2api.model;

/**
 * An interface defines behavior
 * If there are fields they are public static
 *
 * Pluses:
 * -generic implementation
 * -defines a contract(defines methods available to br used after initialization)
 *
 * Minuses:
 * -only public static fields
 * -public methods
 */
public interface AnimalInterface {

 public static String hello = "Hy animal";
 public String howManyLegs();

 /**
  * Generic implementation, does not depend on details at class level
  *
  */

 default String defaultMethod()
 {
  return "This is an default method";
 }
}
