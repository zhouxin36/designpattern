package test;

public class Man implements Human {
    @Override
    public String getSex() {
        return "男人";
    }

    @Override
    public Integer getAge() {
        return 18;
    }
}
