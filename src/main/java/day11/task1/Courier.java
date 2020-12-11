package day11.task1;

public class Courier implements Worker{
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
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
        return "Заработная плата курьера равна " + salary + ", выплаченный бонус равен " + isPayed;
    }

    @Override
    public void doWork() {
        salary = salary + 100;
        warehouse.countDeliveredOrders = warehouse.getCountDeliveredOrders() + 1;
    }

    @Override
    public void bonus() {
        if(warehouse.getCountDeliveredOrders() >= 10000) {
            if(isPayed) {
                salary = 0;
                System.out.println("Бонус уже был выплачен");
            }
            salary = salary + 50000;
            isPayed = true;
        }
        else if (warehouse.getCountDeliveredOrders() < 10000) {
            isPayed = false;
            System.out.println("Бонус пока не доступен");
        }
    }
}
