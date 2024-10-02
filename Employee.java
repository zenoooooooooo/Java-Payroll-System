abstract public class Employee {
    protected int duration;
    protected double rate;    
    protected double income;
    
    protected void computeIncome() {
       this.income = Math.round(this.duration * this.rate * 100.0) / 100.0;
    };

    abstract protected void getIncome();

}