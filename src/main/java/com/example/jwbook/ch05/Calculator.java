package com.example.jwbook.ch05;

import jakarta.servlet.ServletException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Calculator {
  private int n1;
  private int n2;
  private String op;

  public long calc() {
    long result = 0;
    switch (op) {
      case "+":
        result = n1 + n2;
        break;
      case "-":
        result = n1 - n2;
        break;
      case "*":
        result = n1 * n2;
        break;
      case "/":
        result = n1 / n2;
        break;
    }
    return result;
  }

}
