package dao;

import net.bytebuddy.asm.Advice;

/**
 * @author chengwanli
 * @date 2020/10/9 18:40
 */


public class Fish extends Object implements Animal {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    protected boolean isVoContainCaseId(Object vo) {
        Class voClazz = vo.getClass();
        try {
            voClazz.getDeclaredField("id");
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public void eat() {
        System.out.println("喝水！");
    }

    public static void main(String[] args) {
        System.out.println(new Fish().isVoContainCaseId(new Fish()));
    }
}
