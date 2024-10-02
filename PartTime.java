public class PartTime extends Employee {

    public PartTime(int duration, double rate) {
        this.duration = duration;
        this.rate = rate;
    }

    public void getIncome() {
        this.computeIncome();
        System.out.println("Your income for working " + this.duration + " hours is P" + this.income);
    }

}