package ch06access;//: local/D12_ChocolateChip2.java
import ch06access.cookie2.*;

public class D12_ChocolateChip2 extends Cookie {
  public D12_ChocolateChip2() {
   System.out.println("D12_ChocolateChip2 constructor");
  }
  public void chomp() { bite(); } // Protected method
  public static void main(String[] args) {
    D12_ChocolateChip2 x = new D12_ChocolateChip2();
    x.chomp();
  }
} /* Output:
Cookie constructor
D12_ChocolateChip2 constructor
bite
*///:~
