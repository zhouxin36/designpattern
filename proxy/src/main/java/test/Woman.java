package test;

public class Woman implements Human {
    @Override
    public String getSex() {
        return "女人";
    }

    @Override
    public Integer getAge() {
        return 16;
    }
}
