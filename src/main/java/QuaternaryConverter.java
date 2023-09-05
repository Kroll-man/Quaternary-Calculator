public class QuaternaryConverter {
    public int fromQuaternary(int quaternary) {
        return 0;
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
