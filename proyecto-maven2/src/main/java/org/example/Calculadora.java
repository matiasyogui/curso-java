package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Calculadora {
    public Calculadora() {
    }

    final static Logger logger = (Logger) LogManager.getLogger(Calculadora.class);

    public Integer sumar(Integer num, Integer otroNum){
        logger.debug("Inicio operacion de suma");
        logger.info("Parametros suma: " + num + " " + otroNum);
        int resultado = num + otroNum;
        logger.info("Resultado operacion suma: " + resultado);
        return resultado;
    }

    public Integer restar(Integer num, Integer otroNum){
        logger.debug("Inicio operacion de resta");
        logger.info("Parametros resta: " + num + " " + otroNum);
        int resultado = num - otroNum;
        logger.info("Resultado operacion resta: " + resultado);
        return resultado;
    }

    public Integer multiplicar(Integer num, Integer otroNum){
        logger.debug("Inicio operacion de multiplicacion");
        logger.info("Parametros multiplicacion: " + num + " " + otroNum);
        int resultado = num * otroNum;
        logger.info("Resultado operacion multiplicacion: " + resultado);
        return resultado;
    }
}
