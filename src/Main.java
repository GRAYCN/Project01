import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class Main {


    private static int num;

    public static void main(String[] args) {
        //region Description
        getList();


    }

    private static void getList() {
        System.out.println("Hello World!");
        ArrayList list1 = new ArrayList();
        StringBuffer stringBuffer;
        //endregion

        System.out.println(123);

        System.out.println(123.2);
        Date date = new Date();
//        method1();
        System.out.println(list1);
    }

    public static void method1() {

        num = 10;

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
