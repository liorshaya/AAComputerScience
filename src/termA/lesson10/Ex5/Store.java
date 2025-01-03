package termA.lesson10.Ex5;

public class Store {
    private Client[] clients;
    private Item[] items;

    public Store(Client[] clients , Item[] items){
        this.clients = clients;
        this.items = items;
    }

    public void printPurchaseListForClient(Client client){
        int budget = client.getBudget();

        for (int i = 0; i < items.length; i++) {
            double sum = items[i].getCost();
            String combination = items[i].getName() + " cost: " + items[i].getCost() + "₪, ";
            for (int j = i+1; j < items.length; j++) {
                if(sum + items[j].getCost() <= budget){
                    sum += items[j].getCost();
                    combination += items[j].getName() + " cost: " + items[j].getCost() + "₪, ";

                }
                if(sum == budget){
                    System.out.println("The client: " + client.getName() + ":" + combination);
                    return;
                }
            }
        }
        System.out.println("No combination fount for " + client.getName() + " at budget of " + client.getBudget() + ".");

    }
}
