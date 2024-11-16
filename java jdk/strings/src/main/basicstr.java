package main;

public class s1 {
    public static void main(String[] args) {//immutable in strings means that in same location we can't change the string
        String s="hello";
        String s1="hello";
        String s2= new String("hello");
        String s3=new String("hello");
        //System.out.println(s);// string pool memory mein store hoga
        //System.out.println(s1);//string pool memory mein store hoga
        //System.out.println(s2);//heap mein store hoga
//        System.out.println(s==s1);
//        System.out.println(s2==s3);
       // System.out.println(s1.charAt(3));
        String s4=new String("jayendra");
        String s5=new String("vyas");
        s4=s4+s5;//after conatination s4 gets sacved into heap not in pool
        //concatinate krne ke baad individual add lost ho hjayega
        s4=s4+"okay";
        String s6="hey"+"bye";
        System.out.println(s4);
        System.out.println(s5);
        String sting6="hey"+"bye";//pool mein bnega







    }
}
