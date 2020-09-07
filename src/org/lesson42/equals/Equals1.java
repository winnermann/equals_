package org.lesson42.equals;

public class Equals1 {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "Hello";

        //так правильно сравнивать объкты в java, лучше использовать этот способ
        System.out.println(string1.equals(string2));

        //Так можно сравнить не всегда
        System.out.println(string1 == string2);
    }
}
