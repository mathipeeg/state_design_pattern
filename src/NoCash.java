public class NoCash implements ATMState {

    ATMMachine atmMachine;

    public NoCash(ATMMachine newATMMachine){
        atmMachine = newATMMachine;
    }

    public void insertCard() {
        System.out.println("We don't have that amount available");
        System.out.println("Your card is ejected");
    }

    public void ejectCard() {
        System.out.println("We don't have that amount available");
        System.out.println("There is no card to eject");
    }

    public void requestCash(int cashToWithdraw) {
        System.out.println("We don't have that amount available");
    }

    public void insertPin(int pinEntered) {
        System.out.println("We don't have that amount available");
        System.out.println("State currently is: " + atmMachine.atmState);
    }
}
