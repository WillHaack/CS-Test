import java.util.*;
public class Marriage{
 
  private Man husband;
  private Woman wife;
 
  public Marriage(Man x, Woman y){
    husband = x;
    wife = y;
  }
 
  public Man getHusband() {
    return husband;
  }
 
  public Woman getWife(){
    return wife;
  }
 
  public boolean equals(Object other){
    return ((Marriage) other).getHusband() == husband && ((Marraige) other).getWife() == wife;
  }
 
}
