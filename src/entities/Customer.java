package entities;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private int dateOfBirth;
    private String nationalityId;
    private double balanceInAccount; // amount of money in the bank account

    public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalityId, double balanceInAccount) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
        this.balanceInAccount = balanceInAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public double getBalanceInAccount() {
        return balanceInAccount;
    }

    public void setBalanceInAccount(double balanceInAccount) {
        this.balanceInAccount = balanceInAccount;
    }
}
