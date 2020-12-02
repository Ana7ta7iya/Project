/* 1. public class Task5 {
    public static void main(String[] args) {

        String str = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'о') {
                System.out.print("о");
            }
        }
    }
}

 */

/* 2. public class Task5 {
    public static void main(String[] args) {

        String str = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'е') {
                count ++;
            }
        }
        System.out.println(count);
    }
}

 */

public class Task5 {
    public static void main(String[] args) {

        String s = "Посмотрите как Рите нравится ритм";
        s = s.toLowerCase();

        int i = s.indexOf("рит");
            while (i != -1) {
                System.out.println(i);
                i = s.indexOf("рит", i + 1);
                }
            }
        }

