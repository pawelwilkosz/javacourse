package pl.pwilkosz.javacourse.medium.constructors.parametrization;

public class Employee {
    private final String firstName;
    private final String secondName;

    private String address;
    private int age;

    public Employee(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    /**
     * First approach - using static method
     */
    public static Employee forFullName(String firstName, String secondName){
        return new Employee(firstName, secondName);
    }

    /**
     * Second approach - builder
     */
    public Employee(Builder builder){
        this.firstName = builder.firstName;
        this.secondName = builder.secondName;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class Builder{
        private final String firstName;
        private final String secondName;

        private String address;
        private int age;

        public Builder(String firstName, String secondName){
            this.firstName = firstName;
            this.secondName = secondName;
        }

        public Builder withAddress(String address){
            this.address = address;
            return this;
        }

        public Builder withAge(int age){
            this.age = age;
            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
    }
}
