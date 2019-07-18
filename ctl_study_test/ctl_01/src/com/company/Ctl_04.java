package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author hanchengbang
 * @date 2019/7/17
 */
public class Ctl_04 {

//    public static void main(String[] args) {
//
//
//        String[][] scalarClasses = new String[][]{{"supplierId", "Long"}, {"supplierName", "String"}, {"prices", "Integer"}};
//        for (int position = 0; position < scalarClasses.length; position++) {
////            sqlQuery.addScalar(scalarClasses[position][0], StandardBasicTypes.STRING);
//            System.out.println(scalarClasses[position][1]);
//        }
//
//    }

    public static void  printValur(String str){
        System.out.println("print value : "+str);
    }

    public static void main(String[] args) {
        List<String> al = Arrays.asList("a","b","c","d");
        for (String a: al) {
            Ctl_04.printValur(a);
        }
        //下面的for each循环和上面的循环是等价的
        al.forEach(x->{
            Ctl_04.printValur(x);
        });

    }

}
class MyTest {
    public static void  printValur(String str){
        System.out.println("print value : "+str);
    }

    public static void main(String[] args) {
        List<String> al = Arrays.asList("a", "b", "c", "d");
        al.forEach(MyTest::printValur);
        //下面的方法和上面等价的
        Consumer<String> methodParam = MyTest::printValur; //方法参数
        al.forEach(x -> methodParam.accept(x));//方法执行accept
    }
}
