public class Math {
    public static double getAverage(double one, double two){
        return(one+two)/2.0;
    }
    public static double getAverage(double [] num){
        double sum = 0.0;
        for(int i=0; i<num.length; i++){
            sum+=num[i];
        }
        return (sum/num.length);
    }
    public static double getSum(double one, double two){
        return(one+two);
    }
    public static double getSum(double [] num){
        double sum = 0.0;
        for(int i = 0; i<num.length; i++) {
            sum+=num[i];
        }
        return sum;
    }
    public static double getProduct(double[] num){
        double product = 1;
        for(int i = 0; i<num.length; i++) {
            product*=num[i];
        }
        return product;
    }
    public static double getProduct(double one, double two){
        return(one*two);
    }
    public static String sort (double [] num){
        String sortedList = "";
        for (int j=0; j<num.length; j++){
            double small = num[j];
            int smalldx = j;
            for(int i=j+1; i<num.length; i++){
                if (small > num[i]){
                    small = num[i];
                    smalldx = i;
                }
            }
            if (j!=smalldx)
                swap (j, smalldx, num);
        }
        for(double value:num){
            sortedList += value + " ";
        }
        return sortedList;
    }
    public static void swap(int originalSmallIndex, int newSmallIndex, double [] num){
        double temp = num[newSmallIndex];
        num[newSmallIndex] = num[originalSmallIndex];
        num[originalSmallIndex] = temp;
    }
}

