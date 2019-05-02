package lesson2;

public class Program {
    public static void main(String[] args) {
//        int n = 10;
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = i*2;
////            2*i найти четное число
////            2*i +1 найти не четное
//
//        }
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]+ ", ");
//        }
//        for (int i = 0; i < n; i++) {
//            if (i%2 == 1) {
//                arr[i]++;
//            }
//        }
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + ", ");
//
//        }
        MyArrayList<Character> list = new MyArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('f');
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.indexOf('g'));
        System.out.println(list.contains('x'));
        System.out.println(list.remove('v'));
        System.out.println(list.remove('d'));
        System.out.println(list);
        list.add('y');
        list.add('r');
        System.out.println(list);
//        list.selectionSort(new CharacterComparator());
        list.insertionSort(Character::compareTo);
        System.out.println(list);
    }
}
