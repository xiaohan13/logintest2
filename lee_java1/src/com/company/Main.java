package com.company;

public class Main {
    public static void main(String[] args) {
        test obj = new test();
        System.out.println(obj.value);
        obj = new test(300);
        System.out.println(obj.value);
    }
}
class test{
    {
        value = 100;
    }
    int value = 200;
    public  test(int a){
        this.value = a;
    }
    public class test(){}
}
