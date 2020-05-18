package pl.pwilkosz.javacourse.medium.methods;


/*
Principle - object should not be changed after creation
 */
public class Employee {
    private String firstName;
    private String secondName;
    private String address;

    public Employee(Builder builder){
        this.firstName = builder.firstName;
        this.secondName = builder.secondName;
        this.address = builder.address;
    }

    public Employee setFirstName(String firstName){
        return new Employee.Builder()
                .withFirstName(firstName)
                .wiithSecondName(this.secondName)
                .withAddress(this.address)
                .build();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName(){
        return secondName;
    }

    public String getAddress(){
        return address;
    }

    /*
        Object builder
     */
    public static class Builder{
        private String firstName;
        private String secondName;
        private String address;

        public Builder(){

        }

        public Builder withFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder wiithSecondName(String secondName){
            this.secondName = secondName;
            return this;
        }

        public Builder withAddress(String address){
            this.address = address;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}
