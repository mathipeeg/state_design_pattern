public class HasPin implements ATMState {

    ATMMachine atmMachine;

    public HasPin(ATMMachine newATMMachine){
        atmMachine = newATMMachine;
    }

    public void insertCard() {
        System.out.println("You already entered a card");
    }

    public void ejectCard() {
        System.out.println("Your card is ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
        System.out.println("State changed to: " + atmMachine.atmState);
    }

    public void requestCash(int cashToWithdraw) {
        if(cashToWithdraw > atmMachine.cashInMachine){
            System.out.println("You don't have that much cash available");
            System.out.println("Your card is ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());

        } else {
            System.out.println(cashToWithdraw + " is provided by the machine");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
            System.out.println("Your card is ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());

            if(atmMachine.cashInMachine <= 0){
                atmMachine.setATMState(atmMachine.getNoCashState());
            }
        }
        System.out.println("State changed to: " + atmMachine.atmState);
    }

    public void insertPin(int pinEntered) {
        System.out.println("You already entered a PIN");
    }
}
