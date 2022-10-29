package priv.lhf.test9;

public class School implements ComputerAverage{
    @Override
    public double average(double num[]){

        int i, length=num.length;

        double sum=0;
        double ave=0;

        for(i=0;i<length;i++)
            sum+=num[i];

        if(length > 0)
            ave=sum/num.length;

        return ave;
    }
}
