package ru.ivbo_11_19.all_practices.practice1.Cycles;
//циклы
public class Loader {
    public static void main(String[] args){
        int[]arr1={10, 2, 3, 4, 11};
        int sum=0;
        for(int i=0; i<arr1.length; i++) {
            sum+=arr1[i];
        }
        System.out.println(sum);
    }
}

/*public class Loader {
    public static void main(String[] args){
        int[]arr1={10, 2, 3, 4, 11};
        int sum=0;
        int i=0;
        while(i<arr1.length)
        for( i=0; i<arr1.length; i++) {
            sum+=arr1[i];
        }
        System.out.println(sum);
    }
}
*/
/*public class Loader {
    public static void main(String[] args){
        int[]arr1={10, 2, 3, 4, 11};
        int sum=0;
        int i=0;
        do {
            sum += arr1[i];
            i++;
        }
        while(i<arr1.length);
        System.out.println(sum);
    }
}
*/
/*public class Loader {
    public static void main(String[] args){
        int[]arr1={10, 2, 3, 4, 11};
        int sum=0;
        for(int i: arr1){
            sum+=i;}
        System.out.println(sum);
    }
}
*/
