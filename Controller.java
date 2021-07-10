import java.awt.event.ActionEvent;

public class Controller {
    public void runBackgroundCheck(ActionEvent actionEvent) {
        KingCountyBackground newCheck = new KingCountyBackground();
        newCheck.run();
        DOJBackground dojCheck = new DOJBackground();
        dojCheck.start();
    }
}
