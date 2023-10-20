package com.driver;

public class Main {

   public static class  Product{
        public int product(int x,int y){
            return x*y;
        }

        public int product(int x,int y, int z){
            return x*y*z;
        }

        public double product(double x, double y) {
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p=new Product();
        int sum=p.product(2,3);
        int sum1=p.product(2,3,4);
        double sum2=p.product(4.0,7.0);
        System.out.print(sum+" "+sum1+" "+sum2);
    }
}