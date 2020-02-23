public class Notebook {

    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {

        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice() {
        if(this.price < 600){
            System.out.println("This notebook is very cheap.");
        } else if(this.price > 600 && this.price < 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if(this.weight < 700){
            System.out.println("This notebook is very light.");
        } else if(this.weight > 800 && this.weight < 1700) {
            System.out.println("The notebook weight is ok.");
        } else {
            System.out.println("This notebook is heavy!!!");
        }
    }

    public void checkHowOld() {
        if (this.year < 2019 && this.price > 500) {
            System.out.println("This notebook is PERFECT!!!");
        } else if (this.year > 2012 && this.year >2019 && this.price > 600 && this.price < 2000) {
            System.out.println("This notebook is ok");
        } else{
            System.out.println("The notebook is OLD");
        }
    }
}