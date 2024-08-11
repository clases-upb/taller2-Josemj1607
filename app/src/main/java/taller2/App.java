/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {
        try {
    
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }


    }

    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */
    
    public static int Calcular_saldo(int base, int recaudos, int retiros) {
        try {
           
            // Inicializamos variable de retorno para la función.
            int saldo_final = 0;

             // Imponemos condiciones iniciales.
             if (base != 2000000) {
                return -1;
            }
            
            // Actualizamos el valor de la variable saldo_final.
            saldo_final = base + recaudos - retiros;
            return saldo_final;
    
        } catch (Exception e) {
            return -1;
        }
    }
    
    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */

    public static String Calcular_tip(float consumo){
        try {
            
            //imponemos nuestra estructura condicional.
            if(consumo <= 0){
            return "Error calculando consumo";
            }

            //declaramos variable para retornar y el consumo total.
            String factura = "";
            float total = 0;

            //declaración de constantes
            final float propina = (float)(consumo * (0.1));
            final float impuesto = (float)(consumo * (0.08));

            //actualizamos el valor de la variable del total.
                  total = consumo + propina + impuesto;

            //actualizamos el valor de la variable de retorno tipo String.
            factura = ("valor comida: "+ "$"+consumo + " - " + "valor propina " + "$"+propina + " - " + "valor impoconsumo "+
             "$"+impuesto + " - " + "total a pagar "+ "$"+total);

            return factura;


        }    catch (Exception e) {
              return "Error en la función Calcular_tip";
        }

    }
      
    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */
    public static int Obtener_puntos(int ganados, int perdidos, int empatados){
        try {

            //imponemos condiciones iniciales para los datos a ingresar.
            if(ganados < 0 || perdidos < 0 || empatados <0){
                return -1;
            }

            //inicializamos la variables.
            int puntos_totales = 0;
            int puntaje_partidos_ganados = 0;
            int puntaje_partidos_empatados = 0;
            int puntaje_partidos_perdidos = 0;


            //declaramos constantes de puntaje.
            final byte victoria = 3;
            final byte empate = 1;
            final byte derrota = 0;

            //actualizamos el valor de las variables.
            puntaje_partidos_ganados = ganados * victoria;
            puntaje_partidos_empatados = empatados * empate;
            puntaje_partidos_perdidos = perdidos * derrota;

            //actualizamos el valor de la varaible de retorno.
            puntos_totales = puntaje_partidos_ganados + puntaje_partidos_empatados + puntaje_partidos_perdidos;
            return puntos_totales;
                      
        } catch (Exception e) {
            return -1;
        }



    }

    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */

      public static float Calcular_definitiva(float nota1, float nota2, float nota3, float nota4, float nota5,float porcentaje_n1, 
      float porcentaje_n2, float porcentaje_n3, float porcentaje_n4, float porcentaje_n5){
        try {

            //establecemos las condiciones iniciales para que nuestro programa pueda funcionar según las indicaciones.
            if( ((porcentaje_n1 < 0 && porcentaje_n1 >1)||(porcentaje_n2 < 0 && porcentaje_n2> 1)||(porcentaje_n3 < 0 && porcentaje_n3 > 1)
            ||(porcentaje_n4 < 0 && porcentaje_n4 > 1)||(porcentaje_n5 < 0 && porcentaje_n5 >1)) ||

            (porcentaje_n1 + porcentaje_n2 + porcentaje_n3 + porcentaje_n4 + porcentaje_n5 != 1)||

            (0 > nota1 && nota1 > 5)|| 
            (0 > nota2 && nota2 > 5) || 
            (0 > nota3 && nota3 > 5) ||
            (0 > nota4 && nota4 > 5) ||
            (0 > nota5 && nota5 > 5)){ 

                return -1;
                
            }

            //inicializamos nuestra variable de retorno.
            float definitiva = 0;

            //damos el valor a las variables que compondrán la de retorno
            float total_n1 = (float) (nota1 * porcentaje_n1);
            float total_n2 = (float) (nota2 * porcentaje_n2);
            float total_n3 = (float) (nota3 * porcentaje_n3);
            float total_n4 = (float) (nota4 * porcentaje_n4);
            float total_n5 = (float) (nota5 * porcentaje_n5);

            //ahora actualizamos el valor de nuestra variable de retorno
            definitiva = (float)(total_n1 + total_n2 + total_n3 + total_n4 + total_n5);
                    return definitiva;

        } catch (Exception e) {
           return 0;
        }
    }

    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */

    public static float Calcular_para_ganar(float nota1, float nota2, float nota3, float nota4, float p1, float p2, float p3, float p4, float p5){
        try {
            //declaramos nuestra estructura condicional para la validación de los datos.
            if(((p1 < 0 && p1 >1)||(p2 < 0 && p2 > 1)||(p3 < 0 && p3 > 1)||(p4 < 0 && p4 > 1)||(p5 < 0 && p5 >1))|| (p1 + p2 + p3 + p4 + p5 !=1)||
            (0 > nota1 && nota1 > 5)|| 
            (0 > nota2 && nota2 > 5) || 
            (0 > nota3 && nota3 > 5) ||
            (0 > nota4 && nota4 > 5)){
                return -1;
            }

            //inicializamos variable de retorno para la función.
            float nota_necesaria = 0;
            //declaramos constante de puntaje mínimo
            final float puntaje_minimo_para_ganar = 3f;
            //actualizamos el valor de la variable de retorno
            nota_necesaria = (float)((puntaje_minimo_para_ganar) - (nota1 * p1) - (nota2 * p2) - (nota3 * p3) - (nota4 * p4)) / (p5);

              return nota_necesaria;

        } catch (Exception e) {
            return 0;
        }


    }

    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */

    public static float Calcular_salario(int horas_normales, int horas_diurnas, int horas_nocturnas, float valor_hora_normal){
        try {
            //establecemos nuestra estructura condicional para validar la información.
            if(valor_hora_normal <= 0){
                return -1;
            }

            //inicializamos variables
            float salario_total = 0;
            float salario_normal = 0;
            float salario_diurno = 0;
            float salario_nocturno = 0;
            
            //declaramos constantes.
             float aumento_diurno = (float) (valor_hora_normal * (1.15));
             float aumento_nocturno = (float)(valor_hora_normal * (1.35));
            
            //actualizamos el valor de las variables.
            salario_normal = horas_normales * valor_hora_normal;
            salario_diurno = horas_diurnas * aumento_diurno;
            salario_nocturno = horas_nocturnas * aumento_nocturno;

            //actualizamos el valor de la variable de retorno.
            salario_total = (salario_normal + salario_diurno + salario_nocturno);

                 return salario_total;
            
        } catch (Exception e) {
            return -1;
        }

    }

    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */
    
    public static float Calcular_area_triangulo(float base, float altura){
        try {

            //creamos nuestra estructura condicional para validar la información.
            if(base <0 || altura < 0){
                return -1;
            }

        //inicializamos variable
        float area_triangulo = 0;

        //actualizamos el valor de la variable de retorno.
        area_triangulo = ((base) * (altura)) * (0.5f);
               return area_triangulo;
       
        } catch (Exception e) {
            return -1;

        
        }
    
    }

    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */

    public static float Calcular_perimetro_cuadrado(float lado){
        try {
            //creamos estructura condicional para validar los datos.
            if(lado < 0){
                return -1;
            }

            float perimetro_cuadrado = lado * 4;
            return perimetro_cuadrado;
      
        } catch (Exception e) {
          return -1;
        }
    }

    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */

    public static float Calcular_volumen_cilindro(float radiob, float altura){
        try {
            //validamos la información antes de hacer operaciones
            if(radiob <0 || altura <0){
                return -1;
            }

            //inicializamos variable y declaramos constantes
            float volumen = 0;
            final float pi = 3.1415927f;
            final float exponente = 2;

            //actualizamos el valor de la variable de retorno.
            volumen =(float)(pi * (Math.pow(radiob, exponente)) * altura);
               return volumen;
      
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */

    public static float Calcular_area_circulo(float radio){
        try {
            //validamos la magnitud del radio de la circunferencia
            if(radio <= 0 ){
                return -1;
            }

          //inicializamos variable y declaramos constante
          float area_total = 0;
          final float pii = 3.1415927f;
          final float exponentee = 2;

          //actualizamos el valor de la variable de retorno
          area_total = (float)(pii * Math.pow(radio, exponentee));
            return area_total;
            
        } catch (Exception e) {

          return -1;

        }
    }




}

