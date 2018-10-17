package custom;


/**
 * @author zhouxin
 * @date 2018/10/17
 */
public class CustomPorxyTest {
    public static void main(String[] args) {

        try {
            Person obj = (Person)new CustomMeipo().getInstance(new Son());
            System.out.println(obj.getClass());
            obj.findLove();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
