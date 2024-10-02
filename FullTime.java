public class FullTime extends Employee {

    public FullTime(int duration, double rate) {
        this.duration = duration;
        this.rate = rate;
    }

    public void getIncome() {
        this.computeIncome();
        System.out.println("Your income for working " + this.duration + " days is P" + this.income);
    }

}