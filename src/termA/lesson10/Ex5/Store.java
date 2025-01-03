package termA.lesson10.Ex5;

public class Store {
    private Client[] clients;
    private Item[] items;

    public Store(Client[] clients , Item[] items){
        this.clients = clients;
        this.items = items;
    }

    public void printPurchaseListForClient(Client client){
        for (int i = 0; i < this.clients.length; i++) {
            if(this.clients[i] == client){
                Item[] items = clients[i].getToBuy();
                for (int j = 0; j < items.length; j++) {
                    System.out.println(items[j]);
                }
            }
        }
    }
}
