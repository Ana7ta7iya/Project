/*public class Test {
    public static void main(String[] args) {
        System.out.println("Hello Ana");
    }
}*/

///////////////  FUNCTION & METHOD  /////////////////
/*public class Test {
    public static void main(String[] args) {
        String str = "Anastasiya";
        String result = str.replace('s', '7');
        System.out.println(result);
    }
}*/
/*public class Test {
    public static void main(String[] args) {
        String str = "Anastasiya";
        String result = str.replace('s', '7');
        System.out.println(result);
        System.out.println(result.length());
    }
}*/
/*public class Test {
    public static void main(String[] args) {
        String str = "Anastasiya";
        String result = str.substring(3, 5);
        System.out.println(result);
    }
}*/
/*public class Test {
    public static void main(String[] args) {
        String str = "Anastasiya";
        int result = str.indexOf('s');
        System.out.println(result);
    }
}

 */
/*public class Test {
    public static void main(String[] args) {
        String str = "Anastasiya";
        int result = str.toLowerCase().indexOf('s');
        System.out.println(result);
    }
}

 */
/*public class Test {
    public static void main(String[] args) {
        String str = "Anastasiya";
        int result = str.indexOf("ya");
        System.out.println(result);
    }
}*/
/*public class Test {
    public static void main(String[] args) {
        String str = "Anastasiya";
        System.out.println(str.charAt(7));
    }
}*/
/*public class Test {
    public static void main(String[] args) {
        String str = "Anastasiya";
        System.out.println(str.indexOf("m") == -1);
    }
}*/
/*public class Test {
    public static void main(String[] args) {
        String str = "Anastasiya";
        System.out.println(str.contains("s"));
    }
}*/
/*public class Test {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i = i + 10) {
            System.out.println(i);

        }
    }
}

 */
/*public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i = i + 1) {
            System.out.println(i);

        }
    }
}*/
/*public class Test {
    public static void main(String[] args) {
        String result = "" ;
        for (int i = 0; result.length() < 20; i = i + 1) {
            result = result + i;
            //System.out.println(result);
        }
            System.out.println(result);

        }
    }*/
/*public class Test {
    public static void main(String[] args) {
        for (int i = 1; i < 110; i = i * 2) {
            System.out.println(i);

        }
    }
}*/
/*public class Test {
    public static void main(String[] args) {
        String result = "";
        while ( result.length() < 10) {
            result = result + "+";
        }
            System.out.println(result);
        }
    }*/
/*public class Test {
    public static void main(String[] args) {
        String result = "";
        do { result = result + "+"; }
            while ( result.length() < 10);
        System.out.println(result);
    }
}

 */
/*public class Test {
    public static void main(String[] args) {
        String result = "";
        while (result.length() < 0) {
            result = result + "+";
        }
        System.out.println(result);

        String result = "";
        do {
            result = result + "+";
        }
        while (result.length() < 0);
        System.out.println(result);
    }
}*/
/*public class Test {
    public static void main(String[] args) {
        String str1 = "hello";

        if (str1.indexOf("llo") == -1) {
            System.out.println("true");
        }
    }
}*/
/*public class Test {
    public static void main(String[] args) {
        String str1 = "hello";
        //System.out.println(str1.charAt(4));

        if (str1.charAt(0) == 'h') {
            System.out.println("h");
        }
    }
}

 */
/*public class Test {
    public static void main(String[] args) {
        String str1 = "hello";
        //System.out.println(str1.charAt(4));

        if (str1.charAt(2) > 'a') {
            System.out.println("we have Ana");
        }
    }
}*/
/*public class Test {
    public static void main(String[] args) {
        String str1 = "hello";
        for (int i = 0; i < str1.length(); i = i + 1){
            System.out.println(str1.charAt(i));
        }
        }
    }*/

/*public class Test {
    public static void main(String[] args) {
        String str1 = "hello";
        int count = 0;
        for (int i = 0; i < str1.length(); i = i + 1) {
            if (str1.charAt(i) == 'l') {
                count = count + 1;
            }
            System.out.println(i);
        }
    }
}

 */
/*public class Test {
    public static void main(String[] args) {
        String str1 = "hello";
        System.out.println(str1.lastIndexOf("l"));
    }
}*/
/*public class Test {
    public static void main(String[] args) {
        String str1 = "hellol";
        System.out.println(str1.indexOf("l",2));
    }
}*/
/*public class Test {
    public static void main(String[] args) {
        String str1 = "hellol";
        int i = str1.indexOf("l");
        while (i != -1) {
            System.out.println(i);
            i = str1.indexOf("l", i + 1);
        }
    }
}
*/

////////////////  ARRAYS & ALGORITHMS  ////////////////
/*public class Test {
    public static void main(String[] args) {

        int v = 10;
        int [] a = {1, 2, 3, 4, 5, 6};

        System.out.println(v);
        System.out.println(Arrays.toString(a));
    }
}*/
/*import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int v = 10;
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = new int[100];

        System.out.println(v);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}*/
/*public class Test {
    public static void main(String[] args) {

        int v = 10;
        int[] a = {1, 2, 3, 4, 5, 6};

        a[4] = 50;
        System.out.println(a[4]);
        //System.out.println(Arrays.toString(a));
    }
}*/
/*public class Test {
    public static void main(String[] args) {

        int v = 10;
        int[] a = {1, 2, 3, 4, 5, 6};

        a[4] = 50;

        for (int i = 0; i < a.length; i = i + 1) {
            System.out.println(a[i]);
        }
        //System.out.println(Arrays.toString(a));
    }
}*/
/*public class Test {
    public static void main(String[] args) {

        int v = 10;
        int[] a = {1, 2, 3, 4, 5, 6};

        a[4] = 50;

        for (int i = 0; i < a.length; i = i + 1) {
            System.out.println(a[4]);
        }
        //System.out.println(Arrays.toString(a));
    }
}*/
/*public class Test {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6};

        int sum = 0;
        for (int i = 0; i < a.length; i = i + 1) {
            sum = sum + a[i];
        }
            System.out.println(sum);
        //System.out.println(Arrays.toString(a));
    }
}*/
/*public class Test {
    public static void main(String[] args) {

        int i = 0;
        i++;

        System.out.println(i);
    }
}*/
/*public class Test {
    public static void main(String[] args) {

        int i = 0;

        i += 5;
        System.out.println(i);
    }
}*/
/*public class Test {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}*/
/*public class Test {
    public static void main(String[] args) {

        int [] a = {5, 7, 3, 2, 5, 6};

        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}*/
/*public class Test {
    public static void main(String[] args) {

        int [] a = {5, 7, 3, 2, 5, 6};

        int max = 0;
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
                index = 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
    }
}

 */
/*public class Test {
    public static void main(String[] args) {

        int [] a = {-5, -7, -3, -2, -5, -6};

        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
 */
/*public class Test {
    public static void main(String[] args) {

        int [] a = {-5, -7, -3, -2, -5, -6};

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
 */
/*public class Test {
    public static void main(String[] args) {

        int [] a = {-5, -7, -3, -2, -5, -6};

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (min < a[i]) {
                min = a[i];
            }
        }
        System.out.println(min);
    }
    }
 */
/*import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] a = {5, 7, 3, 2, 5, 6};
        int[] b = {1, 2, 7, 2, 5, 3};
        int[] result = new int[a.length + b. length];

        for (int i = 0; i < a.length + b.length; i++) {
            if (i < a.length) {
                result[i] = a[i];
            }else {
                result[i] = b[i - a.length];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
 */
/*import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[][] a = {
                {5, 1}, {7, 5, 6}
        };
       a[0] = new int[]{10, 20, 30};

        System.out.println(Arrays.toString(a));
    }
}*/
/*public class Test {
    public static void main(String[] args) {

        int[][] a = {
                {5, 1}, {7, 5, 6}
        };

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }
    }
}

 */
/*import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = a;

         b[0] = 100;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println(a);
        System.out.println(b);
            }
        }*/
/*import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[][] a = {
                {5, 1},
                {7, 5, 6}
        };

        System.out.println(Arrays.deepToString(a));

        int[] x = a[1];
        x[0] = 100;
        System.out.println(Arrays.deepToString(a));
         }
}

 */
////////////////  METHODS in JAVA  ////////////////////

/*public class Test {
    public static void printName() {
        System.out.println("Anastasiya");
    }
    public static void main(String[] args) {
        printName();
    }
}

 */
/*public class Test {
    public static void printName(String name) {
        System.out.println(name);
    }
    public static void main(String[] args) {
        printName("Anastasiya");
        printName("Sergey");
    }
}

 */
/*public class Test {
    public static void printAge(int age) {
        System.out.println(age);
    }
    public static void main(String[] args) {
        printAge(30);
    }
}*/
/*public class Test {
    public static void print(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
    public static void printName(String name) {
        System.out.println(name);
    }
    public static void main(String[] args) {
        String name1 = "Ana";

        print(name1, 30);
        printName("Ana");
    }
}*/
/*public class Test {
    public static String getConcat(String str1, String str2, String str3) {
        String str = str1 + str2 + str3;
        return str;
    }
        public static void main (String[] args) {
            String str1 = "Ana";
            String str2 = "Sergey";

            String text = getConcat(str1, " + ", str2);
            System.out.println(text);
        }
    }

 */
/*public class Test {
    public static String getConcat(String str1, String str2, String str3) {
        String str = str1 + str2 + str3;
        return str;
    }
    public static void main (String[] args) {
        String a = "Ana";
        String b = "Sergey";

        String c = getConcat(a, " + ", b);
        System.out.println(c);
    }
}

 */
/*public class Test {
    public static int getAverege(int[] marks) {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum / marks.length;
    }
    public static void main (String[] args) {
        int[] arr1 = {2,2,2,2};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {1,1,1,1,1,1,1,2}

                System.out.println();
    }
}*/
/*public class Test {
    public static int summation (int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum +=1;
        }
             return sum;
    }
    public static void main (String[] args) {
       int x = summation(2);
       int y = summation(8);

        System.out.println(x);
        System.out.println(y);
    }
}

public class Test {
    public static int summation (int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum +=1;
        }
             return sum;
    }
    public static void main (String[] args) {
       int x = summation(2);
       int y = summation(8);

        System.out.println(x);
        System.out.println(y);
    }
}*/
/*import java.util.Arrays;

public class Test {
    public static int[] invert(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++){
            result[i] = -array[i];// * -1;
        }
             return result;
    }
    public static void main (String[] args) {

        System.out.println(Arrays.toString(invert(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(invert(new int[]{-1, 2, -3, 4, -5})));
        System.out.println(Arrays.toString(invert(new int[]{0})));
}
}*/
/*import java.util.Arrays;

public class Test {
    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -array[i];// * -1;
        }
        return array;
    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(invert(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(invert(new int[]{-1, 2, -3, 4, -5})));
        System.out.println(Arrays.toString(invert(new int[]{0})));
    }
}

 */
/*public class Test {
    public static String areYouPlayingBanjo(String name) {
        if (Character.toLowerCase(name.charAt(0)) == 'r') {
            return name + "plays banjo";
        } else {
            return name + "does not play banjo";
        }
    }
    public static void main(String[] args) {

        System.out.println(areYouPlayingBanjo("Martin"));
        System.out.println(areYouPlayingBanjo("Rikke"));
    }
}*/
/*public class Test {
    public static int Past(int h, int m, int s) {
        return (h * 3600 + m * 60 + s) * 1000;
    }

    public static void main(String[] args) {
    }
}*/
/*public class Test {
    public static boolean setAlarm(boolean employee, boolean vacation) {
        return employee && !vacation;
    }

    public static void main(String[] args) {
    }
}*/

//OOP #CLASSES
/*  7.(11/03)
/*public class Test {
    public static void main(String[] args) {

        Test1 a = new Test1();
        a.name = "anastasiya";
        String str = a.getName();

        System.out.println(str);
    }
}*/

/*public class Test {
    public static void main(String[] args) {

        Test1 a = new Test1();
        a.name = "anastasiya";
        a.age = 36;

        System.out.println(a.name);
        System.out.println(a.age);
    }
}*/

/*public class Test {
    public static void main(String[] args) {

        Test1 a = new Test1();
        a.name = "anastasiya";
        a.age = 36;

        Test1 b = new Test1();
        b.name = "sergey";
        b.age = 30;

        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(a.age);
        System.out.println(b.age);
    }
}*/

/*public class Test {
    public static void main(String[] args) {

        Test1 a = new Test1();
        a.name = "anastasiya";
        a.age = 36;

        System.out.println(a.getName());

        Test1 b = new Test1();
        b.name = "sergey";
        b.age = 30;

        System.out.println(b.getName());
    }
}*/

/*public class Test {
    public static void main(String[] args) {

        Test1 a = new Test1();
        a.name = "anastasiya";
        a.age = 36;

        System.out.println(a.getName());

        Test1 b = new Test1();
        b.name = "sergey";
        b.age = 30;

        System.out.println(b.getName());
    }
}
 */

/*public class Test {
    public static void main(String[] args) {

        Test1 a = new Test1();
        a.setName("anastasiya");
        a.age = 36;

        System.out.println(a.getName());

        Test1 b = new Test1();
        b.setName("sergey");
        b.age = 30;

        System.out.println(b.getName());
    }
}*/

/*public class Test {
    public static void main(String[] args) {

        Test1 a = new Test1();
        a.setName("anastasiya");
        a.setAge(36);
        a.setSex('F');

        System.out.println(a.getName());

        Test1 b = new Test1();
        b.setName("sergey");
        b.setAge(30);
        b.setSex('M');

        System.out.println(b.getName());
    }
}*/
/*public class Test {
    public static void main(String[] args) {

        Test1 a = new Test1();
        a.setName("anastasiya");
        a.setAge(36);
        a.setSex('F');

        System.out.println(a.getName());

        Test1 b = new Test1();
        b.setName("sergey");
        b.setAge(30);
        b.setSex('M');

        Test1[] people = {a,b};
        System.out.println(Test1Helper.getAveAge(people));
    }
}
 */
/*public class Test {
    public static void main(String[] args) {

        Test1 a = new Test1();
        a.setName("anastasiya");
        a.setAge(36);
        a.setSex('F');

        System.out.println(a.getName());

        Test1 b = new Test1();
        b.setName("sergey");
        b.setAge(30);
        b.setSex('M');

        Test1[] people = {a,b};
        Test1Helper test1Helper = new Test1Helper();
        test1Helper.printTest1(people);
    }
}*/

/*public class Test {
    public static void main(String[] args) {
        Pet petCat = new Pet();
        petCat.setName("barsik");

        Test1 a = new Test1();
        a.setName("anastasiya");
        a.setAge(36);
        a.setSex('F');
        a.setPet(petCat);

        Pet petDog = new Pet();
        petDog.setName("bob");

        Test1 b = new Test1();
        b.setName("sergey");
        b.setAge(30);
        b.setSex('M');
        b.setPet(petDog);

        a.setPet(petDog);

        System.out.println(a.getPet().getName());
        System.out.println(b.getPet().getName());
    }
}*/

//////////////////  OOP-OOP-OOP-OOP-OOP-OOP-OOP  ///////

/*public class Test {
    public static void main(String[] args) {
        Staff a = new Staff();
        a.setName("anastasiya");
        a.setAge(36);
        a.setSex('F');
        a.setSalary(1000000);

        Test1 b = new Test1();
        b.setName("sergey");
        b.setAge(30);
        b.setSex('M');
        //no method in class Test1//b.setSalary(1000000);

        System.out.println(a.getName());
        System.out.println(b.getName());
    }
}
 */

/*1/public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("anastasiya");
        employee1.setAge(36);
        employee1.setSex('F');
        employee1.setSalary(10000);

        Employee employee2 = new Employee();
        employee2.setName("sergey");
        employee2.setAge(30);
        employee2.setSex('M');
        employee2.setSalary(5000);

        Employee[] arr = {employee1, employee2};
        System.out.println(Salary.getSum(arr));
        System.out.println(employee1.isSameName(employee2));

    }
}*/

////////////////  CONSTRACTORS  ////////////////
//////- конструкторы 10.(11/10)

////////- полиморфизм (ООП)

/*public class Test {
    public static void main(String[] args) {
        Person person = new Person("Ana", 30, 'F');

        System.out.println(person.getName());
    }
}*/

///////- инкапсуляция (ООП)

/*public class Test { /// public
    public static void main(String[] args) {
        Person person = new Person("Ana", 30, 'F');

        System.out.println(person.getName());
    }
}*/

/*import com.com.test.Person;
public class Test { // protected
    public static void main(String[] args) {
        Person person = new Person("Ana", 30, 'F');

        System.out.println(person.getName());
    }
}
 */


///////////// POLYMORPHYZM ///////
/*import com.test.Person;

public class Test { // protected
    public static void main(String[] args) {
        Person person = new Person("Ana", 30, 'F');

        System.out.println(person.getName());
    }
}*/
//////////////// 11/12/2020 /////////////
//1
/*import base.test.Manager;
import base.test.Worker;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker("Ana", 36, 'F', 10000);
        System.out.println(worker.getSalary());

        Manager manager = new Manager("Serg", 30, 'M', 10000, 10);
        System.out.println(manager.getSalary());

    }
}*/
//2
/*import base.test.Manager;
        import base.test.Worker;
        import com.test.Salary;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker("Ana", 36, 'F', 10000);
        Manager manager = new Manager("Sergey", 30, 'M', 10000, 10);

        System.out.println(Salary.getSum(new Worker[]{worker, manager}));

    }
}*/
//////////// 11/19/2020 /////////////////
/*import base.test.Employee;
import base.test.Manager;
import static utils.com.MonthUtils.Q1;

public class Test {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setSalary(1000);

        System.out.println(employee.getSalary(Q1));

        Manager manager = new Manager();
        manager.setSalary(1000);
        manager.setCount(100);

        System.out.println(manager.getSalary(Q1));

    }
}*/
//8:13
/*public class Test {
                /////// abstract, final
    public static void main(String[] args) {
        /*Employee employee = new Employee();
        employee.setBaseSalary(1000);

        System.out.println(employee.getBaseSalary(Q1));

        Manager manager = new Manager();
        manager.setBaseSalary(1000);
        manager.setCount(100);

        System.out.println(manager.getSalary(Q1));
}
}
 */















