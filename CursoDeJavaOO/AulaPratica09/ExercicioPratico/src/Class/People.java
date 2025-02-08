package Class;
public class People{
    private String name;
    private int age;
    private String gender;
    
    // Public method
    public void tDBirth(){
        this.age++;
    }
    
    // Constructor

    public People(String name, int years, String gender) {
        this.name = name;
        this.age = years;
        this.gender = gender;
    }
    
    // Getters and Setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
