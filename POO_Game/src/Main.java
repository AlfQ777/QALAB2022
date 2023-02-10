public class Main {
    public static void main(String[] args) {

        //Archivo editado por Joel Alfonso Quispe Solorzano
        //Fecha 09 de Febrero del 2023
        //Prueba de GIT
        Toyota toyo = new Toyota("PAS201"); //200
        toyo.encenderMotor();
        toyo.avanzar();
        System.out.println("Velocidad Máxima: " + toyo.getdVelocidadMaxima());

        Toyota toyo2 = new Toyota("ASP120");
        toyo2.setdVelocidadMaxima(300);
        System.out.println("Velocidad Máxima: " + toyo2.getdVelocidadMaxima());


        System.out.println("========================================== ");

        Nissan nis = new Nissan(); // 220
        nis.encenderMotor();
        nis.avanzar();

        System.out.println("Velocidad Máxima: " + nis.getdVelocidadMaxima());

/*
        Auto auto1 = new Auto();

        auto1.encenderMotor();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar(); auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        //auto1.frenarHastaDetener();
*/




    }
}