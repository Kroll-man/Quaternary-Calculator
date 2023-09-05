public class QuaternaryConverter {

    public int fromQuaternary(int quaternary) {
        int index = 0;
        int decimal = 0;
        int nextDigit;
        while (quaternary !=0) {
            nextDigit = quaternary % 10;
            decimal+= nextDigit * Math.pow(4,index);
            index +=1;
            quaternary = quaternary/10;
        }
        return decimal;
    }

    public int toQuaternary(int decimal) {
        int index = 0;
        int quaternary = 0;
        int nextDigit;
        while (decimal !=0) {
            nextDigit = decimal % 4;
            quaternary+= nextDigit * Math.pow(10,index);
            index +=1;
            decimal = decimal/4;
        }
        return quaternary;
    }
}
