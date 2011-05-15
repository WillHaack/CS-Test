public class Marriage {
  
  private Man husband;
  private Woman wife;
  
  public Marriage(Man man, Woman woman){
    husband = man;
    woman = woman;
  }
  
  public String toString(){
    return "" + husband + wife;  
  }
  
  public Man getHusband(){
    return husband;
  }
  
  public Woman getWife(){
    return wife;
  }
  
  public void setWife(Woman x){
    wife = x;
  }
  
  public void setHusband(Man x){
    husband = x;
  }
}

  
  
}