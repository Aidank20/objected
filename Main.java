class Employee{
    int id;
    String name;
    float salary;
    Employee(){
        id = 12345;
        name = "John Doe";
        salary = 50000.0f;
    }
    void displayDetails(){
        System.out.println(id+"/"+name+"/"+salary);
    }
}

class EmployeeMain{
    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.displayDetails();
    }
}