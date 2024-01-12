public class Main {
    public static void main(String[] args) {
        System.out.println("d");
        App myApp = new App();

        myApp.przykladDodawania();

        int i = 2;
        int j = 2;
        int k = myApp.dodaj(i, j);
        System.out.println(i + " + " + j + " = " + k);

        System.out.println("3 + 4 = " + myApp.dodaj(3, 4));
    }
}