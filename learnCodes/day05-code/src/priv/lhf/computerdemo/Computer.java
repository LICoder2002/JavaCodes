package priv.lhf.computerdemo;

public class Computer {
    public void powerOn()
    {
        System.out.println("开机");
    }

    public void powerOff()
    {
        System.out.println("关机");
    }

    //使用USB设备的方法
    public void useDevice(USB usb)
    {
        usb.open();//打开设备
        if(usb instanceof Mouse)
        {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }
        else if(usb instanceof Keyboard)
        {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }

        usb.close();//关闭设备
    }
}
