public class CalculadoraCortisol {
    public static void main(String[] args) {
        double cortisol = 18.2;

        boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;
        boolean resultadoAnormal = cortisol < 6.0 || cortisol >18.4;

         //System.out.println("Cortisol normal " + resultadoNormal);
        //System.out.println("Cortisol anormal " + resultadoAnormal);

        if(cortisol >= 6.0 && cortisol <= 18.4){
            System.out.println("Cortisol Normal ");
        }else if (cortisol >18.4){
            System.out.println("Cortisol alto");
        }else{
            System.out.println("Cortisol baixo");
        }
    }


}
