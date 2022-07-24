package priv.lhf.test4;

import java.util.ArrayList;

/*如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型数据对应的包装类

基本类型        包装类（引用类型，包装类都位于java.lang包下）
byte          Byte
short         Short
int           Integer       【特殊】
long          Long
float         Float
double        Double
char          Character     【特殊】
boolean       Boolean
*/
public class DemoArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String>  listA = new ArrayList<>();
//        ArrayList<int> list = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(100);
        listB.add(200);
        listB.add(300);
        System.out.println(listB);
        ArrayList<Character> listC = new ArrayList<>();
        listC.add('a');
        listC.add('b');
        listC.add('c');
        listC.add('d');
        System.out.println(listC);
    }
}
