package termA.lesson10.Ex5;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Macbook Pro",8000,2);
        Item item2 = new Item("Iphone",6200,12);
        Item item3 = new Item("AirTag",100,32);
        Item item4 = new Item("Apple pencil",600,8);
        Item item5 = new Item("Ipad Pro",5600,5);
        Item item6 = new Item("Apple TV",620,4);
        Item item7 = new Item("Mac Studio",14200,3);
        Item item8 = new Item("Mac 16",7000,6);
        Item item9 = new Item("Macbook Air",4700,13);
        Item item10 = new Item("Ipad Air",3200,40);

        Client client1 = new Client();
        Client client2 = new Client();
        Client client3 = new Client();

        Item[] itemsToBuy1 = {item1,item2,item6};
        Item[] itemsToBuy2 = {item4,item7,item3};
        Item[] itemsToBuy3 = {item5,item9,item10};

        client1.setToBuy(itemsToBuy1);
        client2.setToBuy(itemsToBuy2);
        client3.setToBuy(itemsToBuy3);

        client1.setBudget(14819);
        client2.setBudget(12000);
        client3.setBudget(11000);

        Client[] clients = {client1,client2,client3};

        System.out.println(item1.existInInventory());
        System.out.println("There is a shortage of " + item1.decrementCount(1) + " items.");

        System.out.println(client1.hasEnoughBudget());
    }

//    public static Client cheapestList(Client[] client){
//        Item[] currClientBudget = client[1].getToBuy();
//        Item[] lowestClientBudget = client[0].getToBuy();
//        for (int i = 0; i < client.length; i++) {
//            if (currClientBudget  lowestClientBudget) {
//                currClientBudget = client[i].getToBuy();
//            }
//        }
//    }

}
