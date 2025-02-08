package praticalexercice;
public class People {
    private String name;
    private int age;
    private char gender;
    
    // Public method
    
    public void tdBirth(){
        this.age++;
    }
    
    // Constructor Method

    public People(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    // Getters and Setters Methods

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected char getGender() {
        return gender;
    }

    protected void setGender(char gender) {
        this.gender = gender;
    }
    
}
