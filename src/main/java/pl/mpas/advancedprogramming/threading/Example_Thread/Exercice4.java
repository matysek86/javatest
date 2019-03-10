package pl.mpas.advancedprogramming.threading.Example_Thread;

class Person implements Cloneable{
    private String name;
    private String surname;

    private Person partner;

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    public Person(String name, String surname, Person partner) {
        this.name = name;
        this.surname = surname;
        this.partner = partner;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person getPartner() {
        return partner;
    }

    public Person performCloning(){
    Person newYou = null;
        try {
            newYou=(Person) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return newYou;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", partner=" + partner.name +
                '}';
    }
}

public class Exercice4 {

    public static void main(String[] args) {

        Person Ja = new Person("Piotr", "Matysik", null);
        Person Kinia = new Person("Kinga", "Karpeta", Ja);
        Ja.setPartner(Kinia);
        System.out.println(Ja);
        Person cloneWifie = Kinia;
        Ja.performCloning();
        System.out.println(Kinia);
    }
}
