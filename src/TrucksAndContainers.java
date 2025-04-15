public class TrucksAndContainers {
    int truckContainerMax = 12;
    int containerCrateMax = 27;

    int cratesAmount = 30;

    int containersRequired;
    int trucksRequired;

    public static void main(String args[]) {
        TrucksAndContainers obj = new TrucksAndContainers();
        obj.countContainers();
        obj.countTrucks();

        obj.putCratesInTrucksAndContainers();
    }

    private static int count(int actualValue, int maxValue) {
        int count = actualValue / maxValue;
        if ((actualValue % maxValue) != 0) count++;
        return count;
    }

    private void countContainers() {
        this.containersRequired = count(this.cratesAmount, this.containerCrateMax);
    }

    private void countTrucks() {
        this.trucksRequired = count(this.containersRequired, this.truckContainerMax);
    }

    private void printMessage() {
        System.out.println(this.containersRequired);
        System.out.println(this.trucksRequired);
    }

    private void putCratesInTrucksAndContainers() {
        int containerIndex = 1;
        int truckIndex = 1;
        int crateIndex = 1;
        while (truckIndex <= this.trucksRequired) {
            System.out.println("Truck: "+ truckIndex);
            int containers = 1;

            while (containerIndex <= this.containersRequired) {
                if (containers > this.truckContainerMax) break;
                System.out.println("    Container: "+ containerIndex);
                containers++;
                containerIndex++;

                int crates = 1;
                while (crateIndex <= this.cratesAmount) {
                    if (crates > this.containerCrateMax) break;
                    System.out.println("        Crate: "+ crateIndex);
                    crates++;
                    crateIndex++;
                }
            }
            truckIndex++;
        }

    }

}