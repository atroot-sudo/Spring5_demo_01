package com.theoldzheng.springTest3;

/**
 * Description: 关于bean生命周期的测试
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.24 9:18
 */
public class Orders {
    private String name;

    public Orders() {
        System.out.println("1.调用无参构造创建对象实例");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2.通过set为bean的属性设置值");
    }


    public void initMethod(){
        System.out.println("4.初始化方法执行");
    }
    public void destroyMethod(){
        System.out.println("7.销毁方法执行");
    }
}
