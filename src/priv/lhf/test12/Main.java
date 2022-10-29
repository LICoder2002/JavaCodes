package priv.lhf.test12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        WordDict wd = new WordDict();
        Scanner sc = new Scanner(System.in);

        //在下面编写代码实现：通过键盘输入给字典添加键值对 即 英文单词 和中文单词，以-1字符串作为结束

        while (true)
        {
            String key;
            key = sc.next();
            if(key.equals("-1"))
                break;

            String value = sc.next();

            wd.add(key, value);
        }

        String searcheng=sc.next();//输入查询的英文单词
        System.out.println("输出所有字典元素:");
        //在下面编写代码 实现 WordDict字典对象 键值对的输出  按 英文单词 中文单词 输出

        wd.print();

        System.out.println("输出对应中文单词:");
        //在下面编写代码实现：输出 searcheng对应的 中文单词，如果没找到 输出"没查到对应中文单词"
        String s = wd.find(searcheng);
        if(s == null)
            System.out.println("没查到对应中文单词");
        else
            System.out.println(s);

    }
}

class WordDict
{
    Map<String , String> map;

    public WordDict() {
        map = new HashMap<>();
    }

    void add(String englishword, String chineseword) {
        map.put(englishword, chineseword);
    }
    String find(String englishword) {
        // 在hashmap中查找englishword对应中文，找到，返回对应中文否则 返回null
        if(!map.containsKey(englishword))
            return null;
        else
            return map.get(englishword);

    }
    void print() {
        //通过 keySet(),get()方法实现输入所有键值对 输出格式：英文单词 中文单词（中间1个空格）不清楚可参考PDF文件
        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(string + " " + map.get(string));
        }

    }
}
