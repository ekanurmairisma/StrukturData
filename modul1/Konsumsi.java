package semester4.modul1;

public class Konsumsi<M, I> {
    private M m;
    private I i;

    public M getM(){
        return m;
    }

    public I getI(){
        return i;
    }

    public void setKonsumsi (M makanan, I miuman){
        this.m = makanan;
        this.i = miuman;
    }
}

