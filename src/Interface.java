interface  waterbottleInterface{

     abstract void getBottleQuantity();

        }
interface  lunchBoxInterface{
    abstract void getHowManyBoxes();


}
public class Interface implements waterbottleInterface,lunchBoxInterface {

    public void getBottleQuantity() {
        System.out.println("BOTTLE QUANTITY IS 300ML");
    }

    @Override
    public void getHowManyBoxes() {
        System.out.println("3 BOXES");
    }

    public static void main(String[] args) {
        Interface it = new Interface();
        it.getBottleQuantity();
        it.getHowManyBoxes();
    }
}

