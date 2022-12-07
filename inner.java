//2. Write a java program to illustrate the use of inner class .

public class inner {


public static void main(String[] args) {
    bike b =new bike();
    b.speed();
    
}
    
}

class bike{

    int fast=120;

    void speed(){
        System.out.println("the bike is so fast and = "+fast);
    }
}

