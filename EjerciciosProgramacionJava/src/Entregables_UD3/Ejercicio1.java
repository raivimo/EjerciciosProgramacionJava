package Entregables_UD3;

import java.util.Scanner;
    public class Ejercicio1 {
        public static void main (String[] args) {
            boolean siOno;
            int resp = 0;
            int riesgo = 5;
            Scanner lector = new Scanner(System.in);
            
            System.out.println("Escriba solo TRUE o FALSE");
            siOno = true;
            
            System.out.println("¿El paciente sufre de presión arterial alta?");
            siOno = lector.nextBoolean();
            
                        
                if (siOno){
                    ++resp;
                    riesgo += 15;
                }
                else if  (siOno)
                    resp = 0;
                        
            System.out.println("¿El paciente tiene el colesterol alto?");
            siOno = lector.nextBoolean();
                if(siOno) {
                    ++resp;
                    riesgo += 15;
                }
                                
                else if (siOno);
  
            System.out.println("¿El paciente tiene diabetes?");
            siOno = lector.nextBoolean();
                if(siOno){
                    ++resp;
                    riesgo += 10;
                }
                else if (siOno);
                        
            System.out.println("¿El paciente tiene obesidad?");
            siOno = lector.nextBoolean();
                if(siOno){
                    ++resp;
                    riesgo += 10;
                }
                else if (siOno);
                       
            System.out.println("¿El paciente fuma?");
            siOno = lector.nextBoolean();
                if (siOno){
                    ++resp;
                    riesgo += 10;
                }
                else if(siOno);
                        
            System.out.println("¿El paciente no realiza actividad fisica?");
            siOno = lector.nextBoolean();
                if(siOno){
                    ++resp;
                    riesgo += 10;
                }
                else if(siOno);
            
            System.out.println("¿El paciente es hombre?");
            siOno = lector.nextBoolean();
                if(siOno){
                    ++resp;
                    riesgo += 5;
                }
                else if(siOno);
                        
            System.out.println("¿El paciente tiene parientes o familiares con enfermedades del corazón?");
            siOno = lector.nextBoolean();
                if(siOno){
                    ++resp;
                    riesgo += 5;
                }
                else if(siOno);
                          
            System.out.println("¿El paciente tiene más de 55 años de edad?");
            siOno = lector.nextBoolean();
                if (siOno){
                    ++resp;
                    riesgo += 5;
                }
                else if(siOno);
                
         
            System.out.println("Valor de tu respuesta " +resp);
            System.out.println("Tu riesgo cardiovascular inicial es " +riesgo);
            
        
            switch(resp) {
                case 0: 
                    System.out.println("Tu riesgo cardiovascular final es de " +riesgo);
                    System.out.println("El efecto multiplicador es de 0");
                    break;
                case 1: case 2:
                    System.out.println("Tu riesgo cardiovascular final es de " +riesgo*1.25);
                    System.out.println("El efecto multiplicador es de 1.25");
                    break;
                case 3: case 4:
                    System.out.println("Tu riesgo cardiovascular final es de " +riesgo*1.50);
                    System.out.println("El efecto multiplicador es de 1.50");
                    break;
                case 5: case 6:
                    System.out.println("Tu riesgo cardiovascular final es de " +riesgo*1.75);
                    System.out.println("El efecto multiplicador es de 1.75");
                    break;
                case 7: case 8:
                    System.out.println("Tu riesgo cardiovascular final es de " +riesgo*2);
                    System.out.println("El efecto multiplicador es de 2");
                    break;
                case 9:
                    System.out.println("Tu riesgo cardiovascular final es de " +riesgo*2.50);
                    System.out.println("El efecto multiplicador es de 2.50");
                    break;
            }               
        }
    }

