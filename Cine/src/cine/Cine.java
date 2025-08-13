package cine;
public class Cine {
    public static void main(String[] args) {
        // Ingresar codigo
        javax.swing.SwingUtilities.invokeLater(() -> {
            new LOGIN().setVisible(true);
        });
    }
}
