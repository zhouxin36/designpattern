package test;

public class MyProxyTest {
    public static void main(String[] args) throws Exception{
        Human instance = new CheckAccount().getInstance(Man.class);
        System.out.println(instance.getSex());
    }
}
