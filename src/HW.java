/*public class HW {
    public static String isEvenOrOdd(int num) {
        if (num % 2==0){
            return "even";
        } else {
            if(num % 2 != 0){

            } return "odd";
        }
    }
}*/
/*public class HW {
    public static boolean hasSpaces(String str) {
        return str.contains(" ");
    }
}*/
/*public class HW{
    public static int getLastItem(int[] nums) {
        return nums[nums.length-1] ;
    }
}*/
/*public class HW {
    public static String add(String c, String str) {
        return str.replace(" ", c);
    }
}*/
/*public class HW { ///return ASCII value
    public static int ctoa(char c) {
        int ascii = (int)c;
        return c;
    }
}*/
/*public class HW {
    public static boolean isPlural(String word) {
        return word.endsWith("s");
    }
}*/
/*public class HW{
    public static int flipIntBool(int intBool) {
        return intBool ^= 1;
    }
}*/
/*public class HW {
    public static boolean dividesEvenly(int a, int b) {
        return (a % b) == 0 && (a % b) != 0 || (a % b) == 0;
    }
}*/
/*public class HW {
    public static int stringInt(String str) {
        return Integer.parseInt(str);
    }
}*/
/*public class HW {
    public static double absolute(double n) {
        return (double) (Math.abs(n));
    }
}*/
/*public class HW {
   /* public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                    sum += arr2[j];
                }
            }
            return sum;
        }
    }
        public static void main (String[]args){

            System.out.println(arrayPlusArray(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
            System.out.println(arrayPlusArray(new int[]{-1, -2, -3}, new int[]{-4, -5, -6}));
            System.out.println(arrayPlusArray(new int[]{0, 0, 0}, new int[]{4, 5, 6}));
            System.out.println(arrayPlusArray(new int[]{100, 200, 300}, new int[]{400, 500, 600}));
        }
}*/



/*public class HW {
    public static String MakeUpperCase(String str){
        return str.toUpperCase();
    }
    public static void main(String[] args) {

        System.out.println(MakeUpperCase("hello"));
    }
}*/
/*public class HW {
    public static String remove(String str) {

        String remove = str.substring(0,str.length()-1);
        return remove;
        }

    public static void main(String[] args) {

        System.out.println(remove("eloquent"));
        System.out.println(remove("country"));
        System.out.println(remove("person"));
        System.out.println(remove("place"));
    }
}

 */
/*public class HW {
    static String noSpace(final String x) {
        return x.replace(" ", "");
    }

    public static void main(String[] args) {

        System.out.println(noSpace("eloqu e n t"));

    }
}*/
/*public class HW {
    public static String updateLight(String current) {
        if ("green".equals(current)) {
            return "yellow";
        } else {
            if ("yellow".equals(current)) {
                return "red";
            } else {
                return "green";
            }
        }
    }

    public static void main(String[] args) {

        System.out.println(updateLight("green"));
    }
}*/

/*public class HW {
    public static boolean feast(String beast, String dish) {
        return beast.charAt(0) == dish.charAt(0)
        && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);
    }
    public static void main(String[] args) {
        System.out.println(feast("great blue heron", "garlic nann"));
        System.out.println(feast("chickadee", "chocolate cake"));
        System.out.println(feast("brown bear", "bear claw"));
    }
}

 */
/*public class HW {
    public static String position(char alphabet) {
        return "Position of alphabet: " + (alphabet - 'a' + 1);
    }
    public static void main(String[] args) {

        System.out.println(position('a'));
        System.out.println(position('z'));
        System.out.println(position('e'));
    }
}*/
/*public class HW {
    public static String abbrevName(String name) {
        //name = name.toUpperCase();
        //int index = name.indexOf(' ');
        //String ch = name.substring(index+1, index+2);
        //name = name.substring(0, 1).concat(".");
        //name = name.concat(ch);

        //name = name.substring(0, 1).concat(".").concat(name.substring(name.indexOf(' ')
        //      + 1, name.indexOf(' ') + 2)).toUpperCase();

        String[] names = name.split(" ");
        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }


    public static void main(String[] args) {

        System.out.println(abbrevName("Sam Harris"));
        System.out.println(abbrevName("Patrick Feenan"));
    }
}*/
/*public class HW {
    public static String repeatStr(final int repeat, final String string) {
        //if(repeat <= 0) {return "";}
        //return new String(new char[repeat]).replace("\0", string);
        String result = "";

        for (int i = 0; i < repeat; i++) {
            result += string;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(repeatStr(5,"I"));
        System.out.println(repeatStr(6, "Hello" ));
    }
}

 */
public class HW {
        public static String switchItUp(int number) {
            String switchItUp;
            switch (number) {
                case 1:
                    switchItUp = "One";
                case 2:
                    switchItUp = "Two";
                case 3:
                    switchItUp = "Three";
                case 4:
                    switchItUp = "Four";
                case 5:
                    switchItUp = "Five";
                case 6:
                    switchItUp = "Six";
                case 7:
                    switchItUp = "Seven";
                case 8:
                    switchItUp = "Eight";
                case 9:
                    switchItUp = "Nine";
                    break;
            }
            return "";
        }

    public static void main(String[] args) {
        System.out.println("One");
        System.out.println("Three");
        System.out.println("Five");
    }
}

/*public class HW {
    public static String tripleTrouble(String one, String two, String three) {
        String result = "";
        for (int i = 0; i <one.length(); i++) {
            result += one.charAt(i);
            result += two.charAt(i);
            result += three.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(tripleTrouble("this", "com.test", "lock"));
    }
}

 */

/*public class HW {
    public static int squareSum(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
          //sum += n[i] * n[i];
          Math.pow(n[i] * 2);
        }
        return sum;
    }
    public static void main(String[] args) {
         System.out.println(squareSum(new int[] {1, 2, 3}));
    }
}*/

/*public class HW {
    public static int nthPower(int[] array, int n) {
        if (array.length <= n) {
            return -1;
        }
        return (int) Math.pow(array[n], n);
    }
    public static void main(String[] args) {
        System.out.println(nthPower(new int[] {1, 2}, 2));
    }
}
 */

/*public class HW {
    public static int Litres(double time) {
        return (int) time / 2;
        //return (int) (time * 0.5);
    }
    public static void main(String[] args) {
    }
}*/

/*public class HW {
    public static String fakeBin(String numberString) {
        String result = "";
        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) >= '5') {
                result += '1';
            } else {
                result += '0';
//return numberString.replaceAll("[1-4]", "0").replaceAll("[5-9]", "1");
            }
        }
        return result;
    }
    public static void main(String[] args) {
    }
}*/

/*public class HW {
    public static float mpgToKPM(final float mpg) {
        float gallon = 4.54609188f;
        float mile = 1.609344f;
        return Math.round(mpg * mile / gallon * 100) / (float) 100;
    }
    public static void main(String[] args) {
    }
}*/

/*public class Cube{
    int side;

    int getSide() {
    return side;
    }
    void setSide(int saide) {
        this.side = side;
    }}

}
 */

/*public class Block{
        int width;
        int length;
        int heigth;

        Block(int[] arr) {
            this.width = arr[0];
            this.length = arr[1];
            this.heigth = arr[2];

            int getLength() {
                return length;
            }
            int getWidth() {
                return width;
            }
            int getHeigth() {
                return heigth;
            }
            int getVolume() {
                return getWidth() * getLength() * getHeigth();
            }
            int getSurfaceArea() {
                return getWidth() * getLength() * 2
                        + getHeigth() * getLength * 2
                        + getWidth() * getLength * 2;

            }
        }
    }
}
 */
/*public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if (fighter1.name.equals(firstAttacker)) {
        }
        while (fighter1.health > 0 && fighter2.health > 0) {
            fighter2.health -= fighter1.damagePerAttack;
            fighter1.health -= fighter2.damagePerAttack;

        }
        if (fighter1.health <= 0 && fighter2.health >= 0) {
            return firstAttacker;
        } else {
            if (fighter1.health <= 0) {
                return fighter2.name;
            } else {
                return fighter1.name;
            }
        }
    }
}
 */

