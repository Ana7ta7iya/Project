////////////// 11/12/2020 /////////////
//2
/*package base.test;

public class Manager extends Worker {

    private int countOfPeople;

    public Manager(String name, int age, char sex, int baseSalary, int countOfPeople) {
        super(name, age, sex, baseSalary);
        this.countOfPeople = countOfPeople;
    }
    public int getCountOfPeople() {
        return countOfPeople;
    }
    public void setCountOfPeople(int countOfPeople) {
        this.countOfPeople = countOfPeople;
    }
    @Override
    public int getSalary() {
        return (int)(getBaseSalary() + getBaseSalary() * (countOfPeople / 100.0));
    }
}*/

////////////// 11/19/2020 /////////////
/*package base.test;
import static utils.com.MonthUtils.Month;

public class Manager extends Employee {

        private int count;

        public int getCount() {
            return count;
        }
        public void setCount(int count) {
            this.count = count;
        }
        @Override
        public int getSalary(Month[] monthArray) {
            int baseResult = super.getBaseSalary(monthArray);

            return baseResult + (baseResult / 100 * getCount());
        }
    }*/

//8:13////////
/*package base.test;

public class Manager extends Worker {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int getSalary() {
        if (count == 0) {
            return super.getSalary();
        } else {
            return (int)(getBaseSalary() + (getCount()/100.0);
        }
    }
}*/