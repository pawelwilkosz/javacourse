package pl.pwilkosz.javacourse.medium.constructors.parametrization;

public class Demo {
    public static void main(String[] argc){
        Employee e = Employee.forFullName("John", "Smith");
        System.out.println(e.getFirstName() + " " + e.getSecondName());

        Employee emp = new Employee.Builder("Jan", "Kovalsky")
            .withAddress("Angel Street 11")
            .withAge(11)
            .build();

        System.out.println(emp.getFirstName() + " " +
                emp.getSecondName() + " " +
                emp.getAddress() + " " +
                emp.getAge());
    }
}
