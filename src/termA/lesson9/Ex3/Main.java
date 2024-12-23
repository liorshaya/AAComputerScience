package termA.lesson9.Ex3;

public class Main {
    public static void main(String[] args) {

     //Create CityDelivery array
        CityDelivery[] cityArray = new CityDelivery[5];

        cityArray[0] = new CityDelivery();
        cityArray[0].cityName = "New York";
        cityArray[0].distance = 15;

        cityArray[1] = new CityDelivery();
        cityArray[1].cityName = "Los Angeles";
        cityArray[1].distance = 25;

        cityArray[2] = new CityDelivery();
        cityArray[2].cityName = "Chicago";
        cityArray[2].distance = 20;

        cityArray[3] = new CityDelivery();
        cityArray[3].cityName = "Houston";
        cityArray[3].distance = 30;

        cityArray[4] = new CityDelivery();
        cityArray[4].cityName = "Miami";
        cityArray[4].distance = 10;
// Create Delivery array
        Delivery[] deliveryArray = new Delivery[10];

        deliveryArray[0] = new Delivery();
        deliveryArray[0].price = 50.0f;
        deliveryArray[0].address = "123 Main St,New York";
        deliveryArray[0].name = "Alice Parker";

        deliveryArray[1] = new Delivery();
        deliveryArray[1].price = 60.0f;
        deliveryArray[1].address = "456 Elm St,New York";
        deliveryArray[1].name = "Bob Dob";

        deliveryArray[2] = new Delivery();
        deliveryArray[2].price = 45.0f;
        deliveryArray[2].address = "789 Pine St,Los Angeles";
        deliveryArray[2].name = "Charlie Next";

        deliveryArray[3] = new Delivery();
        deliveryArray[3].price = 70.0f;
        deliveryArray[3].address = "101 Maple Ave,Chicago";
        deliveryArray[3].name = "Diana Silver";

        deliveryArray[4] = new Delivery();
        deliveryArray[4].price = 80.0f;
        deliveryArray[4].address = "202 Oak Ave,Chicago";
        deliveryArray[4].name = "Eve Max";

        deliveryArray[5] = new Delivery();
        deliveryArray[5].price = 55.0f;
        deliveryArray[5].address = "303 Birch St,Houston";
        deliveryArray[5].name = "Frank Frankfurt";

        deliveryArray[6] = new Delivery();
        deliveryArray[6].price = 65.0f;
        deliveryArray[6].address = "404 Cedar St,Miami";
        deliveryArray[6].name = "Grace Cyprus";

        deliveryArray[7] = new Delivery();
        deliveryArray[7].price = 75.0f;
        deliveryArray[7].address = "505 Walnut St,Miami";
        deliveryArray[7].name = "Hank Bunk";

        deliveryArray[8] = new Delivery();
        deliveryArray[8].price = 85.0f;
        deliveryArray[8].address = "606 Spruce St,Houston";
        deliveryArray[8].name = "Ivy Navy";

        deliveryArray[9] = new Delivery();
        deliveryArray[9].price = 90.0f;
        deliveryArray[9].address = "707 Ash St,Los Angeles";
        deliveryArray[9].name = "Jack Sparo";

        Store store = new Store();
        store.cityArray = cityArray;
        store.deliveryArray = deliveryArray;
        String[] checking = store.clientNamesWithExpensiveDelivery(150);

        for (int i = 0; i < checking.length; i++) {
            System.out.print(checking[i] + " ");
        }
    }
}
