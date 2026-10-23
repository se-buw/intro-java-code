public class DessertPrecedence {
    public static void main(String[] args) {
        boolean withDessert = true;
        int priceInCents = 320 + withDessert ? 90 : 0;
        System.out.println(priceInCents + " cents");
    }
}
