package com.hzc.base;

public class Switch {
    public static void main(String[] args) {
        String name = "我的团长";
        // 开始只支持byte,short,int,char  Java7之后支持String
        switch (name){
            case "团长":
                System.out.println(name);
            case "我的团长":
                System.out.println(name);
                break; //如果不加break会造成case穿透，即成立的case及其下面的case,default都会执行
            case "团长b":
                System.out.println(name);
                break;
            default:
                System.out.println("what?");
        }
    }
}
