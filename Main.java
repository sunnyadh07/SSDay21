public class Main {
    public static void main(String[] args) {
        //Thread departmentJustice = new Thread(new DOJBackground());
        //departmentJustice.start();

        //Thread runBackgroundCheck = new Thread(new DOJBackground());
        //departmentJustice.start();

        Thread runBackgroudCheck = new Thread(new DOJBackground());
        runBackgroudCheck.start();
        System.out.println(runBackgroudCheck.getName());
        //System.out.println(runBackgroudCheck.);
    }

}
