package de.thbit.cleancode.v8.strategy;

public class Multiplication implements CalculationStrategy {
  public int calculate(int firstNumber, int secondNumber) {
    return firstNumber * secondNumber;
  }
}