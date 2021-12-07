package ru.mirea.lab12;

public class Phone {
    public String code, opN, threeN, fourN;
    public Phone(String phone)
    {
        if(phone.startsWith("8"))
        {
            code = "+7";
        }
        else{
            code = phone.substring(0, phone.length() - 10);
        }
        {
            opN = phone.substring(phone.length()-10, phone.length()-7);
            threeN = phone.substring(phone.length()-7, phone.length()-4);
            fourN = phone.substring(phone.length()-4);
        }
    }
    public  String toString()
    {
        return code + opN + threeN + fourN;
    }
}
