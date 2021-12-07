package ru.mirea.lab10;

public class Person {
    public String name, surname, otchestvo;
    public  Person(String surname)
    {
        this.surname = surname;
    }
    public Person(String surname, String name, String otchestvo)
    {
        this.surname = surname;
        this.name = name;
        this.otchestvo = otchestvo;
    }
    public String getFullName()
    {
        StringBuilder FullName = new StringBuilder(surname);
        if (name != null && !name.equals(" "))
            FullName.append(" ").append(name);
        if (otchestvo != null && !otchestvo.equals(" "))
            FullName.append(" ").append(otchestvo);
        return FullName.toString();
    }
}
