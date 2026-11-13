public class Yaro implements HabitanteNPC {
    private boolean dialogosObrig = false;
    private int dialogo = 0;

    public Yaro(boolean dialogosObrig, int dialogo) {
        this.dialogosObrig = dialogosObrig;
        this.dialogo = dialogo;
    }

    public int conversar() {
        if (dialogosObrig == false) {
            IO.println("Você já conversou comigo, não há mais nada a dizer.");
            while (dialogo < 3) {
                switch (dialogo) {
                    case 0:
                        IO.println("");
                        break;
                    case 1:
                        IO.println("");
                        break;
                    case 2:
                        IO.println("");
                        break;
                    default:
                        break;
                }

                if (dialogo == 2) {
                    dialogosObrig = true;
                }

                dialogo++;
            }
        } else {
            IO.println("Você já conversou comigo, não há mais nada a dizer.");
        }
        return 0;
    }

}