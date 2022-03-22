package com.enigma.savingloanapp.main;

import java.util.Scanner;

public class SavingLoanApp {

    private static String[][] data = new String[10][4];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        viewMainMenuSavingLoan();
    }

    /**
     * this method used to find all data saving and loan application
     * this method using array 2 dimension
     */
    public static void findAllSavingLoan(){

    }

    /**
     * @Unit Test for findAllSavingLoan method
     */
    public static void testFindAllSavingLoan(){
        data[0][0] = "Data@1";
        data[0][1] = "Muhammad Gunawan";
        data[0][2] = "100000";
        data[0][3] = "0";

        data[1][0] = "Data@2";
        data[1][1] = "Dewi Gita";
        data[1][2] = "0";
        data[1][3] = "30000";

        findAllSavingLoan();
    }

    /**
     * this method working for add data saving to apllication saving and loan
     * the logic method is always reduce saving data if they have loan data from array
     * until they don't have anymore loan data
     */
    public static void addSaving(){

    }

    /**
     * @Unit Test for addSaving method
     */
    public static void testaddSaving(){
        addSaving();
        findAllSavingLoan();
    }

    /**
     * this method working for remove data saving to application saving and loan
     * the logic is you indirectly delete permanently but you like taking savings
     */
    public static void removeSaving(){

    }

    /**
     * @Unit Test for removeSaving method
     */
    public static void testremoveSaving(){
        data[0][0] = "Data@1";
        data[0][1] = "Muhammad Gunawan";
        data[0][2] = "100000";
        data[0][3] = "0";

        data[1][0] = "Data@2";
        data[1][1] = "Dewi Gita";
        data[1][2] = "0";
        data[1][3] = "30000";
        findAllSavingLoan();

//        removeLoan();
        findAllSavingLoan();
    }

    /**
     * this method working for add data loan to apllication saving and loan
     * the logic method reconcile with data saving in application saving and loan
     */
    public static void addLoan(){

    }

    /**
     * @Unit Test for addLoan method
     */
    public static void testaddLoan(){
        data[0][0] = "Data@1";
        data[0][1] = "Muhammad Gunawan";
        data[0][2] = "100000";
        data[0][3] = "0";

        data[1][0] = "Data@2";
        data[1][1] = "Dewi Gita";
        data[1][2] = "0";
        data[1][3] = "30000";
        findAllSavingLoan();

        addLoan();
        findAllSavingLoan();
    }

    /**
     * this method working for remove data loan to application saving and loan
     * the logic method is deleting data permanently
     */
    public static void removeLoan(String loan){

    }

    /**
     * @Unit Test for removeLoan method
     */
    public static void testremoveLoan(){
        data[0][0] = "Data@1";
        data[0][1] = "Muhammad Gunawan";
        data[0][2] = "100000";
        data[0][3] = "0";

        data[1][0] = "Data@2";
        data[1][1] = "Dewi Gita";
        data[1][2] = "0";
        data[1][3] = "30000";
        findAllSavingLoan();

//        removeLoan();
        findAllSavingLoan();
    }

    /**
     * From this until end the method is run for view which implements above business service
     */
    public static String input(String info){
        System.out.print(info +" : ");
        String word = scanner.nextLine();
        return word;
    }

    /**
     * this method working for main view for application saving and loan
     * -all data saving and loan
     * -navigation
     * -first menu -> add new data saving
     * -second menu -> remove data saving
     * -third menu -> add data loan
     * -fourth menu -> remove data loan
     */
    public static void viewMainMenuSavingLoan(){
        while (true){
            findAllSavingLoan();

            System.out.println("===============================");
            System.out.println("MAIN MENU");
            System.out.println("===============================");
            System.out.println("1. ADD SAVING DATA");
            System.out.println("2. REMOVE SAVING DATA");
            System.out.println("3. ADD LOAN DATA");
            System.out.println("4. REMOVE LOAN DATA");
            System.out.println("X. (QUIT)");
            String insert = input("INSERT OPTION");
            if (insert.equals("1")) addSaving();
            if (insert.equals("2")) removeSaving();
            if (insert.equals("3")) addLoan();
//            if (insert.equals("4")) removeLoan();
            else break;
        }
    }

    /**
     * @Unit Test for viewMainMenuSavingLoan method
     */
    public static void testViewMainMenuSavingLoan(){
        data[0][0] = "Data@1";
        data[0][1] = "Muhammad Gunawan";
        data[0][2] = "100000";
        data[0][3] = "0";

        data[1][0] = "Data@2";
        data[1][1] = "Dewi Gita";
        data[1][2] = "0";
        data[1][3] = "30000";
        viewMainMenuSavingLoan();
    }

    /**
     * this method working for view add saving and this method contain input and addSving method
     */
    public static void viewAddMenuSaving(){
        input("Masukan data Saving");
    }

    /**
     * @Unit Test for viewAddMenuSaving method
     */
    public static void testviewAddMenuSaving(){
        viewAddMenuSaving();
        viewMainMenuSavingLoan();
    }

    /**
     * this method working for view remove saving and this method contain input and removeSaving method
     */
    public static void viewRemoveMenuSaving(){

    }

    /**
     * @Unit Test for viewRemoveMenuSaving method
     */
    public static void testviewRemoveMenuSaving(){
        viewRemoveMenuSaving();
        viewMainMenuSavingLoan();
    }

    /**
     * this method working for view add loan and this method contain input and addLoan method
     */
    public static void viewAddMenuLoan(){

    }

    /**
     * @Unit Test for viewAddMenuLoan method
     */
    public static void testviewAddMenuLoan(){
        viewAddMenuLoan();
        viewMainMenuSavingLoan();
    }

    /**
     * this method working for view remove loan and this method contain input and removeLoan method
     */
    public static void viewRemoveMenuLoan(){
        
    }

    /**
     * @Unit Test for viewRemoveMenuLoan method
     */
    public static void testviewRemoveMenuLoan(){
        viewRemoveMenuLoan();
        viewMainMenuSavingLoan();
    }
}
