package priv.lhf.test9;


import java.util.Arrays;

public class Gymnastics implements ComputerAverage{
    @Override
    public double average(double[] x) {
        int j,i, length=x.length;

        double sum = 0;
        double ave = 0;

        Arrays.sort(x);

        for(i = 1; i < length-1; i++)
            sum+=x[i];

        ave=sum/(length - 2);

        return ave;

    }
}
