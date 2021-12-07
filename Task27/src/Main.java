public class Main {
    public static <E> void  sid  (String s, E [] arr){
        E [] a = arr;
        ArrayType <E> sid = new  ArrayType <E> ();
        sid.setArr(a);
        System.out.print(s + "  ");
        for(int i = 0; i< sid.getLength(); i++)
            System.out.print(sid.getArrIndex(i)+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Conversion<Integer> listInt = new Conversion(numbers);
        listInt.showList();
        String[] lines = {"q", "w", "e", "r", "t", "y"};
        Conversion<String> listStr = new Conversion(lines);
        listStr.showList();
        String [] s = {"Hello", "World","!"};
        sid("String" , s);
        Integer [] intr = { 1,2,3,4,5,6,7,8};
        sid("Integer" , intr);
        Double [] ad = {1.2,1.5,6.7};
        sid("Double" , ad);
    }
}
