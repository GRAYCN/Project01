import java.util.ArrayList;

/**
 * @author Guihang Wang
 * @date 2018-08-27-16:48
 */
public class TemplateTest {
    //prsf
    private static final test T = new test();

    //psf
    public static final int NUM =1;
    public static final String NATION="china";
    // psvm
    public static void main(String[] args) {
        //sout
        System.out.println("hello");
        //soutp sourm soutv xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");
        System.out.println("args = " + args);
        int num1 =10;
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);

        //fori
        String[] arr = new String[]{"Tom","Jerry","H","L"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println(s);

        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        for (Object o : list) {
            
        }
        for (int i = 0; i < list.size(); i++) {

        }


    }

    public void method(){
        System.out.println("TemplateTest.method");
        //ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        if (list == null) {

        }
        //inn
        if (list != null) {
            
        }
        //xxx.nn xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }

}
