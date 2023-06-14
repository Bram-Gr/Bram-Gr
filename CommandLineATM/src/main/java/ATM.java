import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ATM {
private static final String BANNER = "\n=============================================";
private static final String START_MENU_OPTION_ENTER_PIN = "Enter Pin";
private static final String START_MENU_OPTION_CREATE_ACCOUNT = "Create Account";
private static final String[] START_MENU_OPTIONS = {START_MENU_OPTION_ENTER_PIN, START_MENU_OPTION_CREATE_ACCOUNT};
private static final String MAIN_MENU_OPTION_CHECK_BAL = "Check Balance";
private static final String MAIN_MENU_OPTION_MAKE_DEPOSIT = "Make Deposit";
private static final String MAIN_MENU_OPTION_MAKE_WITHDRAWAL = "Make Withdrawal";
private static final String MAIN_MENU_OPTION_MAKE_TRANSFER = "Make Transfer";
private static final String MAIN_MENU_OPTION_EXIT = "Exit";
private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_CHECK_BAL,MAIN_MENU_OPTION_MAKE_DEPOSIT,
        MAIN_MENU_OPTION_MAKE_WITHDRAWAL,MAIN_MENU_OPTION_MAKE_TRANSFER,MAIN_MENU_OPTION_EXIT};
private static final String CHECK_BAL_MENU_OPTION_CHECKING = "Checking Account";
private static final String CHECK_BAL_MENU_OPTION_SAVINGS = "Savings Account";
private static final String[] CHECK_BAL_MENU_OPTIONS = {CHECK_BAL_MENU_OPTION_CHECKING,CHECK_BAL_MENU_OPTION_SAVINGS};
Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.run();
        atm.userInput = new Scanner(System.in);

    }

    public void run() {
        System.out.println(BANNER);
        System.out.println("\n\t\tWELCOME TO COMMAND LINE ATM!");
        boolean runMenu = true;
        String[] activeMenu = START_MENU_OPTIONS;

        while (runMenu) {
            displayMenuOptions(activeMenu);
            System.out.println("\n\tPlease Make A Selection");
            String userSelection = userInput.nextLine();
          try {
              int userSelectionLocation = Integer.parseInt(userSelection) - 1;
              String menuSelection = activeMenu[userSelectionLocation];
              System.out.println("You Have Selected: " + menuSelection);
      //TODO start switch case with Start Menu Options include placeholder for enterPin()
      //TODO enterPin() checks customer_log.txt for pin, if valid activeMenu = MAIN_MENU_OPTIONS

          } catch (Exception e) {
              System.out.println("Please enter a valid selection\t");
          }
        }

    }


    public void displayMenuOptions(String[] menu){
        System.out.println(BANNER);
        for (int i =0; i < menu.length; i++){
            System.out.println("("+ (i+1) + ") " + menu[i]);
        }
        System.out.println(BANNER);
    }


}
