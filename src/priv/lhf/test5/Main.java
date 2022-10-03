package priv.lhf.test5;

import  java.util.Scanner;
class Worker {
    private String name;//姓名
    private double rate;//小时工资
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public Worker(String name,double rate) {
        this.name=name;
        this.rate=rate;
    }
    public double pay(int hour) {
        return 0;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Worker w1 = new Worker(input.next(),input.nextDouble());
        System.out.println(w1.pay(input.nextInt()));
        SalariedWorker w2 = new SalariedWorker(input.next(),input.nextDouble());
        System.out.println(w2.pay());
        System.out.println(w2.pay(input.nextInt()));
        HourlyWorker w3 = new HourlyWorker(input.next(), input.nextDouble());
        int h=input.nextInt();
        System.out.println(w3.pay(h));
        w3.setRate(h+10);
        System.out.println(w3.pay(h));
    }

}

/* 请在这里填写答案 编写HourlyWorker和SalariedWorker类*/
class HourlyWorker extends Worker {

    public HourlyWorker(String name, double rate) {
        super(name, rate);
    }

    @Override
    public double pay(int hour) {
        if (hour <= 40)
            return this.getRate() * (double) hour;
        else
            return this.getRate() * 40.0 + 2 * this.getRate() * (hour - 40);
    }

}

class SalariedWorker extends Worker
{

    public SalariedWorker(String name, double rate) {
        super(name, rate);
    }

    @Override
    public double pay(int hour) {
        return this.getRate() * (double) 40;
    }

    public double pay()
    {
        return this.getRate() * (double) 40;

    }
}