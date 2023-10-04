package BookStore;

public abstract class Customer {

    private final String username;
    private final String password;
    private int points;

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
        this.points = 0;
    }

    public Customer(String username, String password, int points) {
        this.username = username;
        this.password = password;
        this.points = points;
    }

    public abstract String getStatus();

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public void buyBook(double price) throws IllegalArgumentException {
        if (price <= 0) {
            throw new IllegalArgumentException("ERROR: Price cannot be negative or zero");
        }
        points += price * 10;
    }

    public double buyBookWithPoints(double price) throws IllegalArgumentException {
        if (price <= 0) {
            throw new IllegalArgumentException("ERROR: Price cannot be negative or zero");
        }
        double temp;
        if (points <= price * 100) {
            temp = price - points / 100;
            points = (int) (temp * 10);
        } else {
            points -= (int) (price * 100);
            temp = 0;
        }
        return temp;
    }

    public int getPoints() {
        return points;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
