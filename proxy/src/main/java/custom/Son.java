package custom;

/**
 * @author zhouxin
 * @date 2018/10/17
 */
public class Son implements Person {

    public void findLove(){
        System.out.println("呵呵");
    }

    @Override
    public void buy() {
        System.out.println("买买买");
    }
}
