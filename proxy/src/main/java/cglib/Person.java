package cglib;

/**
 * @author zhouxin
 * @date 2018/10/17
 */
public class Person {
    public void findLove(){
        System.out.println("findLove");
    }

    @Override
    public String toString() {
        return "toString()";
    }
}
