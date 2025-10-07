class Employee {
    String getPosition();
    void getSalary(String name, int value, int rate);
}
class OfficeEmployee extends Employee {
    @Override
    public String getPosition() {
        return "Nhân viên văn phòng";
    }

    @Override
    public void getSalary(String name, int day, int slr1) {
        int salary = day * slr1;
        String str = String.valueOf(salary);
        System.out.println("Nhân viên: " + name + ", Ở vị trí: " + getPosition() + ", Có lương bằng: " + str);
    }
}

class TechnicalEmployee extends Employee {
    @Override
    public String getPosition() {
        return "Nhân viên kỹ thuật";
    }

    @Override
    public void getSalary(String name, int hour, int slr1h) {
        int salary = hour * slr1h;
        String str = String.valueOf(salary);
        System.out.println("Nhân viên: " + name + ", Ở vị trí: " + getPosition() + ", Có lương bằng: " + str);
    }
}
class Staff {
    String name;
    int value; 
    int rate;  
    Employee employee;

    public Staff(String name, int value, int rate, Employee employee) {
        this.name = name;
        this.value = value;
        this.rate = rate;
        this.employee = employee;
    }

    public void show() {
        employee.getSalary(name, value, rate);
    }
}
public class SalaryEmployee {
    public static void main(String[] args) {
        Staff stf1 = new Staff("A", 10, 200, new OfficeEmployee());
        Staff stf2 = new Staff("B", 10, 25, new TechnicalEmployee());

        stf1.show();
        stf2.show();
    }
}