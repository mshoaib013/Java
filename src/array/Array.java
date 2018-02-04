package array;
import javax.swing.JOptionPane;
public class Array {
    public static void main(String[] args) {
        int intArray[] = new int[3];
        intArray[0] = 30;
        intArray[1] = 20;
        intArray[2] = 50;
        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        int[] intArray2 = {1, 2, 2, 1};
        System.out.println(intArray2.length);
        for(int i = 0; i < intArray.length; i++) {
            System.out.print(intArray2[i]);
        }
        System.out.println();
        int[][] intMultyDarray = new int[3][];
        intMultyDarray[0] = new int[5];
        intMultyDarray[1] = new int[3];
        int[][] intMultyDarray2 = {{1, 2, 3},
                {3, 2},
                {4, 5, 1}
        };
        for(int i = 0; i < intMultyDarray2.length; i++ ) {
            for(int j = 0; j < intMultyDarray2[i].length ;j++)
                System.out.print(intMultyDarray2[i][j] + " ");
            System.out.println();
        }
        int nameCount = Integer.parseInt(
                JOptionPane.showInputDialog("How Many names you want to enter?")
                );
        String[] names = new String[nameCount];
        for(int i = 0; i < names.length; i++) {
            names[i] = JOptionPane.showInputDialog("What is the name?");
        }
        System.out.println(names[0]);
        MyClass[] mc = new MyClass[10];
//Must assign objects into the array before using it
        mc[0] = new MyClass();
        mc[0].print();
        for(int i = 1; i < mc.length; i++) {
            mc[i] = new MyClass();
        }
    }
}