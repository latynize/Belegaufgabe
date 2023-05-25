public class employees {
    private String name;
    private char gender;
    private String birthdate;

    public employees(String name, char gender, String birthdate) {
        this.name = name;
        this.gender = gender;
        this.birthdate = birthdate;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    
}