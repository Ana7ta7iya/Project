/*1/public class Person {
    String name;
    int age;
    char sex;

    String getName() {
        if (sex == 'M') {
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
}
}*/
/*public class Person {
    String name;
    int age;
    char sex;

    public  Person() {
    }

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    String getName() {
        if (sex == 'M') {
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
}

 */

///////- инкапсуляция (ООП)

/*public class Person {

    // private
    private String name;
    private int age;
    private char sex;

    public  Person() {
    }

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private String getNameWithSexPrefix() {
        if (sex == 'M') {
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }
    }
    public String getName() {
        return getNameWithSexPrefix();
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
}*/

/*package com.com.test;
public class Person {

    // protected
    private String name;
    private int age;
    private char sex;

    public Person() {
    }
    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    private String getNameWithSexPrefix() {
        if (sex == 'M') {
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }
    }
    protected String getBaseName() {
        return name;
    }
    public String getName() {
        return getNameWithSexPrefix();
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
}
 */


///////////// POLYMORPHYZM /////// 10.(11/10)
/*package com.test;
public class Person {
    // protected
    private String name;
    private int age;
    private char sex;

    public Person() {
    }
    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    private String getNameWithSexPrefix() {
        if (sex == 'M') {
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }
    }
    protected String getBaseName() {
        return name;
    }
    public String getName() {
        return getNameWithSexPrefix();
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
}*/
//////////////// 11/12/2020 /////////////
//1
/*package com.test;
public class Person {

    private String name;
    private int age;
    private char sex;

    public Person() {
    }
    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    private String getNameWithSexPrefix() {
        if (sex == 'M') {
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }
    }
    protected String getBaseName() {
        return name;
    }
    public String getName() {
        return getNameWithSexPrefix();
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
}*/
//2
/*package com.test;
public class Person {

    private String name;
    private int age;
    private char sex;

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
}*/