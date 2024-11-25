package java17.data;

public class Account {

    private Person owner;
    private int balance;

    public Account(Person person, int i) {
        this.owner = person;
        this.balance = i;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
