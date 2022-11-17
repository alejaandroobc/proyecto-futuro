public class App {
    public static void main(String[] args){
        String nomcomp;
        int nummod,horest;
        nomcomp="Alejandro Botella Costa";
        nummod=7;
        horest=10;
        System.out.println("Estudiante "+ args[0]+" : ");
    }
}

static String veredicto(String valor1, String valor2) {
    if (valor1.equals(valor2)) {
        return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
    }
    if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
        return "Poco tiempo de estudio. Debes dedicar más tiempo.";
    }
    return "Ideal. Trabajas los contenidos en casa.";
    }