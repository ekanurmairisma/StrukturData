package semester4.modul1;

public class Makanan extends Hidangan{
    @Override
    public String disantap() {
        return this.getNamaHidangan() + " dimakan";
    }
}
