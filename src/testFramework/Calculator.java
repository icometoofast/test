package testFramework;

public class Calculator {
    @Check
    public void cal1(){
        System.out.println(1+2);
    }

    @Check
    public void cal2(){
        System.out.println(1/0);
    }

}
