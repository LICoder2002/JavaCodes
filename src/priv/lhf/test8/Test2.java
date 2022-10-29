package priv.lhf.test8;

class NoLowerLetter extends Exception
//类声明，声明一个Exception的子类NoLowerLetter
{
    public void print() {
        System.out.printf("%c",'#');
    }
}
class NoDigit extends Exception
//类声明，声明一个Exception的子类NoDigit
{
    public void print() {
        System.out.printf("%c", '*');
    }
}
class People{
    void printLetter(char c) throws NoLowerLetter{
        if(c<'a'||c>'z') {
            NoLowerLetter noLowerLetter=
                    new NoLowerLetter()
                    ;//创建NoLowerLetter类型对象

            throw noLowerLetter
                    ;//抛出noLowerLetter
        }
        else {
            System.out.print(c);
        }
    }
    void printDigit(char c)
            throws NoDigit
    {
        if(c<'1'||c>'9') {
            NoDigit noDigit=
                    new NoDigit()
                    ;//创建NoDigit类型对象

            throw noDigit
                    ;//抛出noDigit
        }
        else {
            System.out.print(c);
        }
    }
}
public class Test2{

    public static void main(String[] args) {
        People people=new People();
        for(int i=0;i<128;i++) {
            try {
                people.printLetter((char)i);
            }
            catch(NoLowerLetter e) {
                e.print();
            }
        }
        for(int i=0;i<128;i++) {
            try {
                people.printDigit((char)i);
            }
            catch(NoDigit e) {
                e.print();
            }
        }

    }
}