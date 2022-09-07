package com.controller.model;

public class test {
    public static void main(String[] args) {
        loop : for (int i=0;i<4;i++){
            if(i==2){
                System.out.println("aaaaa: "+i);
                break  loop;
            }
        }
    }
}
