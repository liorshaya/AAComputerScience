package termA.lesson10.Ex5;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Macbook Pro",8000,2);
        Item item2 = new Item("iPhone",5200,12);
        Item item3 = new Item("AirTag",100,32);
        Item item4 = new Item("Apple pencil",600,8);
        Item item5 = new Item("iPad Pro",5600,5);
        Item item6 = new Item("Apple TV",620,4);
        Item item7 = new Item("Mac Studio",14200,3);
        Item item8 = new Item("Mac 16",7000,6);
        Item item9 = new Item("Macbook Air",4700,13);
        Item item10 = new Item("iPad Air",3200,40);
        Item item11 = new Item("Keyboard for iPad",1400,7);


        Item[] itemsToBuy1 = {item3,item2,item6};
        Item[] itemsToBuy2 = {item4,item7,item3};
        Item[] itemsToBuy3 = {item5,item9,item10};

        Client client1 = new Client("Avi Bavi" , itemsToBuy1 , 15000);
        Client client2 = new Client("Ron Don" , itemsToBuy2 , 13200);
        Client client3 = new Client("Elon Melon" , itemsToBuy3 , 20000);

        Client[] clients = {client1,client2,client3};
        Item[] items = {item1,item2,item3,item4,item5,item6,item7,item8,item9,item10,item11};

        Store store = new Store(clients,items);

        store.printPurchaseListForClient(client1);





        System.out.println(item1.existInInventory());
        System.out.println("There is a shortage of " + item1.decrementCount(1) + " items.");

        System.out.println(client1.hasEnoughBudget());
        //System.out.println(client1);

        Client clientStat = cheapestList(clients);
        System.out.println(clientStat);

    }

    public static Client cheapestList(Client[] client){
        double totalLowerClient = client[0].sumItemsPriceClient();
        Client clientStat = client[0];
        double currLowerClient;
        for (int i = 1; i < client.length; i++) {
            currLowerClient = client[i].sumItemsPriceClient();
            if (currLowerClient < totalLowerClient){
                totalLowerClient = currLowerClient;
                clientStat = client[i];
            }
        }
        return clientStat;
    }



}
