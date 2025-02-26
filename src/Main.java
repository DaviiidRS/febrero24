import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int op, opcion, option, voto;
        int nengo=0, jh=0, bicho=0;
        int nengoInternet=0, nengoRadio=0, nengoTelevision=0;
        int jhInternet=0, jhRadio=0, jhTelevision=0;
        int bichoInternet=0, bichoRadio=0, bichoTelevision=0;
        int costonengo, costobicho, costojh;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("***** VOTACIONES PARA REPRESENTANTE DE PREMIER *****");
            System.out.println("1. Votar.");
            System.out.println("2. Calcular costo de campana.");
            System.out.println("3. Vaciar urnas de votación.");
            System.out.println("4. Totalizar votos.");
            System.out.println("5. Porcentaje de votos por candidato.");
            System.out.println("6. Calcular costo promedio de campana.");
            System.out.println("7. Salir.");
            System.out.print("Seleccione una opción: ");
            op = teclado.nextInt();
            switch (op) {
                case 1:
                    System.out.println("1. Ñengo Flow");
                    System.out.println("2. JH");
                    System.out.println("3. El bicho siuuuu");
                    System.out.print("Seleccione su voto: ");
                    opcion=teclado.nextInt();
                    switch (opcion){
                        case 1:
                            System.out.println("1. Publicidad en internet.");
                            System.out.println("2. Publicidad en radio.");
                            System.out.println("3. Publicidad en television");
                            System.out.print("Su voto fue influenciado por: ");
                            voto=teclado.nextInt();
                            switch (voto){
                                case 1:
                                    nengoInternet++;
                                    break;
                                case 2:
                                    nengoRadio++;
                                    break;
                                case 3:
                                    nengoTelevision++;
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                            }
                            System.out.println("Haz votado por Ñengo Flow");
                            nengo++;
                            break;
                        case 2:
                            System.out.println("1. Publicidad en internet.");
                            System.out.println("2. Publicidad en radio.");
                            System.out.println("3. Publicidad en television");
                            System.out.print("Su voto fue influenciado por: ");
                            voto=teclado.nextInt();
                            switch (voto){
                                case 1:
                                    jhInternet++;
                                    break;
                                case 2:
                                    jhRadio++;
                                    break;
                                case 3:
                                    jhTelevision++;
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                            }
                            System.out.println("Haz votado por JH");
                            jh++;
                            break;
                        case 3:
                            System.out.println("1. Publicidad en internet.");
                            System.out.println("2. Publicidad en radio.");
                            System.out.println("3. Publicidad en television");
                            System.out.print("Su voto fue influenciado por: ");
                            voto=teclado.nextInt();
                            switch (voto){
                                case 1:
                                    bichoInternet++;
                                    break;
                                case 2:
                                    bichoRadio++;
                                    break;
                                case 3:
                                    bichoTelevision++;
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                            }
                            System.out.println("Haz votado por El bicho siuuuu");
                            bicho++;
                            break;
                        default:
                            System.out.println("Opcion no valida.");
                    }
                    break;
                case 2:
                    System.out.println("***** COSTO DE CAMPANA *****");
                    System.out.println("1. Ñengo Flow");
                    System.out.println("2. JH");
                    System.out.println("3. El bicho siuuuu");
                    System.out.print("Seleccione un candidato: ");
                    option= teclado.nextInt();
                    switch (option){
                        case 1:
                            System.out.println("El costo de campaña es : "
                                    + ((700000*nengoInternet)
                                    + (200000*nengoRadio)
                                    + (600000*nengoTelevision)));
                            break;
                        case 2:
                            System.out.println("El costo de campaña es : "
                                    + ((700000*jhInternet)
                                    + (200000*jhRadio)
                                    + (600000*jhTelevision)));
                            break;
                        case 3:
                            System.out.println("El costo de campaña es : "
                                    + ((700000*bichoInternet)
                                    + (200000*bichoRadio)
                                    + (600000*bichoTelevision)));
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                    break;
                case 3:
                    System.out.println("*****  VACIAR URNAS *****");
                    nengo=0;
                    nengoRadio=0;
                    nengoInternet=0;
                    nengoTelevision=0;
                    jh=0;
                    jhRadio=0;
                    jhInternet=0;
                    jhTelevision=0;
                    bicho=0;
                    bichoRadio=0;
                    bichoInternet=0;
                    bichoTelevision=0;
                    System.out.println("URNAS VACIAS");
                    break;
                case 4:
                    System.out.println("***** TOTAL DE VOTOS *****");
                    System.out.println("1. Ñengo flow: "+nengo);
                    System.out.println("2. JH: "+jh);
                    System.out.println("3. El bicho siuuuuu: "+bicho);
                    System.out.println("4. TOTAL: "+(nengo+jh+bicho));
                    break;
                case 5:
                    try {


                        System.out.println("***** PORCENTAJE DE VOTOS *****");
                        System.out.println("1. Ñengo flow: " + ((nengo * 100) / (nengo + jh + bicho)));
                        System.out.println("1. JH: " + ((jh * 100) / (nengo + jh + bicho)));
                        System.out.println("1. El bicho siuuuu: " + ((bicho * 100) / (nengo + jh + bicho)));
                    } catch (ArithmeticException  a ){
                        System.out.println("Operacion no permitida");
                    }
                    break;
                case 6:
                    try {
                        System.out.println("***** COSTO PROMEDIO DE CAMPAÑA *****");
                        costonengo = (((nengoTelevision*600000) + (nengoInternet*700000) + (nengoRadio*200000)) / nengo);
                        costojh = (((jhTelevision*600000) + (jhInternet*700000) + (jhRadio*200000)) / jh);
                        costobicho = (((bichoTelevision*600000) + (bichoInternet*700000) + (bichoRadio*200000)) / bicho);
                        System.out.println("1. Ñengo Flow: $" + costonengo);
                        System.out.println("1. JH: $" + costojh);
                        System.out.println("1. El bicho siuuuu: $" + costobicho);
                    } catch (ArithmeticException  a ){
                        System.out.println("Operacion no permitida");
                    }
                    break;
                default:
            }
        } while(op!=7);
    }
}