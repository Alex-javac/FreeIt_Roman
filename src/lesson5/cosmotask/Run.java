package lesson5.cosmotask;

import lesson5.cosmotask.shuttle.Atlantis;
import lesson5.cosmotask.shuttle.Discovery;
import lesson5.cosmotask.shuttle.Endeavour;
import lesson5.cosmotask.shuttle.IStart;

public class Run {
    public static void main(String[] args) {
        CosmoDrome baikonur = new CosmoDrome();

        IStart atlantis = new Atlantis();
        IStart discovery = new Discovery();
        IStart endeavour = new Endeavour();

        baikonur.launch(atlantis);
        baikonur.launch(discovery);
        baikonur.launch(endeavour);
    }
}