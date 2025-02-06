package termA.lesson11;

import java.util.Random;

public class BankSimulation {
    private BankAccount[] bankAccounts;
    private LimitedAccount[] limitedAccounts;
    private OverdraftAccount[] overdraftAccounts;

    public BankSimulation(int count){
        Random rnd = new Random();
        this.bankAccounts = new BankAccount[count];
        this.limitedAccounts = new LimitedAccount[count];
        this.overdraftAccounts = new OverdraftAccount[count];

        for (int i = 0; i < count; i++) {
            this.bankAccounts[i] = new BankAccount("Lior" , "Shaya" , rnd.nextInt(5000 , 10001));
        }

        for (int i = 0; i < count; i++) {
            this.limitedAccounts[i] = new LimitedAccount("Lior", "Shaya" , rnd.nextInt(5000 , 10001) , 1500);
        }

        for (int i = 0; i < count; i++) {
            this.overdraftAccounts[i] = new OverdraftAccount("Lior" , "Shaya" , rnd.nextInt(5000 , 10001), 2000);
        }
    }

    public void simulate(){
        Random rnd = new Random();
        int repeat = rnd.nextInt(100,1000);
        boolean success1 = true;
        boolean success2 = true;



        while(repeat != 2000){
            for (int i = 0; i < this.bankAccounts.length; i++) {
                success1 = this.bankAccounts[i].withdraw(rnd.nextInt(100,1000));
                success2 = this.bankAccounts[i].withdraw(rnd.nextInt(100,1000));
                this.bankAccounts[i].deposit(rnd.nextInt(100,1000));
                if(!success1 || !success2){
                    System.out.println(bankAccounts[i]);
                    break;
                }
            }
            if(!success1 || !success2){
                break;
            }


            for (int j = 0; j < this.limitedAccounts.length; j++) {
                success1 = this.limitedAccounts[j].withdraw(rnd.nextInt(100,1000));
                success2 = this.limitedAccounts[j].withdraw(rnd.nextInt(100,1000));
                this.limitedAccounts[j].deposit(rnd.nextInt(100,1000));
                if(!success1 || !success2){
                    System.out.println(limitedAccounts[j]);
                    break;
                }
            }
            if(!success1 || !success2){
                break;
            }

            for (int k = 0; k < this.overdraftAccounts.length; k++) {
                success1 = this.overdraftAccounts[k].withdraw(rnd.nextInt(100,1000));
                success2 = this.overdraftAccounts[k].withdraw(rnd.nextInt(100,1000));
                this.overdraftAccounts[k].deposit(rnd.nextInt(100,1000));
                if(!success1 || !success2){
                    System.out.println(overdraftAccounts[k]);
                    break;
                }
            }
            if(!success1 || !success2){
                break;
            }
        }
    }
}
