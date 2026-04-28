package java_60_exam.inheritance.p05;

class VehicleTodo {
    // TODO 1: run() 작성
    void run(){}
}

class BusTodo extends VehicleTodo {
    // TODO 2: run() 오버라이딩


    @Override
    void run() {
        System.out.println("버스가 달립니다.");
    }
}

class DriverTodo {
    // TODO 3: drive(VehicleTodo vehicle) 작성
    void drive(VehicleTodo vehicle){
        vehicle.run();
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 4: DriverTodo가 BusTodo를 운전하도록 호출
        DriverTodo driverTodo = new DriverTodo();

        driverTodo.drive(new BusTodo());

    }
}
