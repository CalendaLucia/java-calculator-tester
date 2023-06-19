package bonus;


import java.math.BigDecimal;

public class Ticket {

    private int kilometers;
    private int age;

    public Ticket(int kilometers, int age) throws IllegalArgumentException {
        inputNotValid(kilometers,age);
        this.kilometers = kilometers;
        this.age = age;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    //metodi
    private void inputNotValid( int kilometers, int age) {
        if (kilometers <= 0 || age <=0) {
            throw new IllegalArgumentException("Il numero di chilomentri e l'età devono essere numeri positivi");
        }
    }

    public BigDecimal getFullPrice() {
        BigDecimal fullPrice = BigDecimal.valueOf(kilometers * 0.21);
        return fullPrice;
    }

}
