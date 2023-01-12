package a_team8Practice.day22;

public class BBaglama extends CAlici implements IDutAgaci,ITel,IBoya {
    @Override
    boolean BakimHizmetiSitermisiniz() {
        return true;
    }

    @Override
    String odemeSekli() {
        String odemeSekli="Kart ile";
        return odemeSekli;
    }


    @Override
    public void vernik() {

        System.out.println("Kizil renk vernik istiyorum");

    }

    @Override
    public String boyamaTuru() {

        String boya="Elle boyanmasini talep ediyorum";
        return boya;
    }

    @Override
    public void kurumaSuresi() {
        System.out.println("urun bana 3 ay icinde teslim edilebilir.");

    }

    @Override
    public void agacinYasi() {
        System.out.println("Baglamanin yapilacagi agac yasli olmali.");

    }

    @Override
    public void agacinBeklemeSuresi() {

        System.out.println("Agac kesildikten sora 6 ay kurutulmalidir.");

    }

    @Override
    public void kesimSekli() {

    }

    @Override
    public int telUzunlugu() {

        int uzunluk=1;
        return uzunluk;
    }

    @Override
    public String telYumusakligi() {
        return null;
    }

    @Override
    public boolean inceTelMi() {
        return false;
    }

    public static void main(String[] args) {

        BBaglama baglama1=new BBaglama();

        baglama1.agacinBeklemeSuresi();

    }
}
