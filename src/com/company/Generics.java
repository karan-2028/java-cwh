package com.company;
import java.util.ArrayList;
 class MyGeneric<T1,T2>{
     int val = 300;
     private T1 t1;
     private T2 t2;

     public MyGeneric(int val, T1 t1, T2 t2) {
         this.val = val;
         this.t1 = t1;
         this.t2 = t2;
     }

     public T2 getT2() {
         return t2;
     }

     public void setT2(T2 t2) {
         this.t2 = t2;
     }

     public int getVal() {
         return val;
     }

     public void setVal(int val) {
         this.val = val;
     }

     public T1 getT1() {
         return t1;
     }

     public void setT1(T1 t1) {
         this.t1 = t1;
     }
 }
public class Generics {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("suman");
        arrayList.add(2);
        arrayList.add(5);

        int a = (int) arrayList.get(1);
//        System.out.println(a);


        MyGeneric<String , Integer> g1 = new MyGeneric(36,"myfavourite is ",36);
        String str = g1.getT1();
        Integer i1 = g1.getT2();
        System.out.println(str + i1);

    }
}
