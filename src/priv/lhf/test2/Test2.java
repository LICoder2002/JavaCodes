package priv.lhf.test2;

import java.util.Scanner;

public class Test2{
    public static void main(String[] args){
        Book a[]=new Book[10];
        String name;
        double price;
        Scanner sc = new Scanner(System.in);

        int count = 0;
        while (sc.hasNext())
        {
            name = sc.next();
            price = sc.nextDouble();

            a[count] = new Book(name, price);
            ++count;
        }

        for(int i=0;i<count;i++){
            System.out.println(a[i]);

        }System.out.println("图书总册数为:"+Book.count);
    }
}
class Book{
    String name;
    static int id;
    double price;
    int num=0;
    static int count=0;
    public Book(String name,double price){
        this.name=name;
        this.price=price;
        this.id=num++;
        count++;
    }public String toString(){
        id++;
        return "书名:"+name+",书号:"+Book.id+",书价:"+price;
    }
}
