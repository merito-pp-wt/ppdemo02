public class App {
    public int dodaj(int a, int b) {
        int suma;

        suma = a + b;

        return suma;
    }

    public void przykladDodawania(){
        int x = 6;
        int y = 8;
        int z;

        z = dodaj(x, y);

        System.out.println(x + " + " + y + " = " + z);
    }
}
