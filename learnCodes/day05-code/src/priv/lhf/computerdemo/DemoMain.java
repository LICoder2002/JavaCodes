package priv.lhf.computerdemo;

public class DemoMain {
    public static void main(String[] args) {
        //创建一个笔记本
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标
        //Mouse mouse = new Mouse();
        //首先进行向上转型
        USB usbMouse = new Mouse(); //多态
        //参数是USB类型，传递进去的正好是USB鼠标。
        computer.useDevice(usbMouse);

        //创建一个USB键盘
        Keyboard keyboard = new Keyboard();//没有使用多态
        //方法参数是USB类型，传递进去的是实现类对象。
        computer.useDevice(keyboard);//正确写法！向上转型
        //匿名对象也行
        computer.useDevice(new Keyboard());

        computer.powerOff();
    }
}
