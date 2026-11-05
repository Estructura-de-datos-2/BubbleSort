Algoritmo hola
    Definir lista, i, z, a Como Entero
    Dimension lista[5]
	
    lista[0] <- 3
    lista[1] <- 7
    lista[2] <- 10
    lista[3] <- 17
    lista[4] <- 9
	
    Para i <- 0 Hasta 3 Con Paso 1 Hacer
        Para z <- 0 Hasta 3 Con Paso 1 Hacer
            Si lista[z] > lista[z+1] Entonces
                a <- lista[z]
                lista[z] <- lista[z+1]
                lista[z+1] <- a
            FinSi
        FinPara
    FinPara
	
    Para i <- 0 Hasta 4 Con Paso 1 Hacer
        Escribir lista[i]
    FinPara
	
FinAlgoritmo