package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier( warehouse1);

        businessProcess(picker);
        businessProcess(courier);
        System.out.println(warehouse.getCountPickedOrders());
        System.out.println(warehouse.getCountDeliveredOrders());
        System.out.println(picker.getSalary());
        System.out.println(courier.getSalary());

        System.out.println();

        picker1.doWork();
        courier1.doWork();
        System.out.println(picker1.getSalary());
        System.out.println(courier1.getSalary());
        System.out.println(warehouse1.getCountPickedOrders());
        System.out.println(warehouse1.getCountDeliveredOrders());

//        picker.bonus();
//        System.out.println(picker.getIsPayed());
//        System.out.println(picker.getSalary());
//        System.out.println();
//        picker.bonus();
//        System.out.println(picker.getIsPayed());
//        System.out.println(picker.getSalary());
    }
    static void businessProcess(Worker worker) {
        for(int i =0; i < 10000; i++) {
            worker.doWork();
            if(i == 9999) {
                worker.bonus();
            }
        }
    }
}
