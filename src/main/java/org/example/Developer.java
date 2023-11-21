package org.example;

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name, String programmingLanguage) {
        super(name);
        this.programmingLanguage = programmingLanguage;
    }



    @Override
    public String getSound() {
        return "Är du redan hungrig?";
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}
