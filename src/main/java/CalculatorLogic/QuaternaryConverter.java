package CalculatorLogic;

public class QuaternaryConverter {

    public long fromQuaternary(long quaternary) {
        int index = 0;
        long decimal = 0;
        long nextDigit;
        while (quaternary !=0) {
            nextDigit = quaternary % 10;
            decimal+= (long) (nextDigit * Math.pow(4,index));
            index +=1;
            quaternary = quaternary/10;
        }
        return decimal;
    }

    public long toQuaternary(long decimal) {
        int index = 0;
        long quaternary = 0;
        long nextDigit;
        while (decimal !=0) {
            nextDigit = decimal % 4;
            quaternary+= (long) (nextDigit * Math.pow(10,index));
            index +=1;
            decimal = decimal/4;
        }
        return quaternary;
    }
}
