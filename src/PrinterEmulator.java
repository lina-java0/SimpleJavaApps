public class PrinterEmulator {
    public static void main(String[] args) {
        int paperReserve = 600000;
        int inkReserve = 600000;
        int coverReserve = 2000;

        double printRollerMinTemp = 80.5;
        double printRollerMaxTemp = 120.75;

        int pagesInBook = 530;
        int booksCount = 20;

        boolean coldPrintingMode = false;
        double printRollerTemp = 90;

        int papersCount  = booksCount * pagesInBook / 2;
        int inkedPapersCount = papersCount + booksCount;

        boolean paperCheckCount = paperReserve >= papersCount;
        boolean inkCheckCount = inkReserve >= inkedPapersCount;
        boolean coverCheckCount = coverReserve >= booksCount;
        boolean printRollerCheckTemp = printRollerTemp >= printRollerMinTemp && printRollerTemp <= printRollerMaxTemp;

        boolean errors = false;

        if(!paperCheckCount || !inkCheckCount) {
            errors = true;
            System.out.println("Not enough paper or ink");
        } else {
            if (coverCheckCount) {
                if (!coldPrintingMode && !printRollerCheckTemp) {
                    errors = true;
                    System.out.println("Wrong regime");
                }
            } else {
                errors = true;
                System.out.println("Not enough covers");
            }
        }
        if (!errors) {
            System.out.println("Print is available");
        } else {
            System.out.println("Print is not available");
        }
    }
}
