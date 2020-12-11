package day11.task1;

public class Picker implements Worker{
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Заработная плата сборщика равна " + salary + ", выплаченный бонус равен " + isPayed;
    }

    @Override
    public void doWork(){
        salary = salary + 80;
        warehouse.countPickedOrders = warehouse.getCountPickedOrders() + 1;
    }

    @Override
    public void bonus() {
        if(warehouse.getCountPickedOrders() >= 10000) {
            if(isPayed) {
                salary = 0;
                System.out.println("Бонус уже был выплачен");
            }
            salary = salary + 70000;
            isPayed = true;
        }
        else if (warehouse.getCountPickedOrders() < 10000) {
            isPayed = false;
            System.out.println("Бонус пока не доступен");
        }
    }
}
