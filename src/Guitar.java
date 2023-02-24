public final class Guitar {
    public String type = "acoustic";
    public String guitarName = "Gibson J-45";

}
class Musician{
    public String name = "John";
    final Guitar guitar = new Guitar();

    public static void main(String[] args) {
    Musician john = new Musician();
//    we can change the parameter of final object, but not its value, which is the address
    john.guitar.guitarName = "Fender";
    john.guitar.type = "bass";
//    john.gibson = new Guitar();
}
    }