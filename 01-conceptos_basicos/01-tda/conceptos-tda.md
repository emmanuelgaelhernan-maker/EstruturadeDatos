# Ejercicios con Matrices

1. Objetivo: Aplicar la logica de arreglos bidimensionales o tambien conocidos como 
(matricez en java) utilizando el paradigma de POO implementando validaciones de dimensiones 
recorridos de indices y encapsulacion 

Ejercicio 1 (m * n)
Sistema de reserva de asientos 
Diseña un metodo que se llame `Reserva Asiento´ que controle el mapa de ocupacion 
de un teatro o sala 

La matriz iniciara con cero 
Si el asiento solicitado contiene 0 cambialo a 1 (**Esta ocupado**) y muestre un mensaje de exito

Si el asiento ya contiene 1 notifica que esta ocupado

Validar que las coordenadas ingresadas no excedan los limites de la matriz 

**Ejercicio2**
Acumulado de ventas por sucursal y mes
(m*n)

Una empresa registra las ventas enteras de m sucursales en n meses 

* Implementar un metodo que calcule la suma con cada fila(total * sucursal)

* Calcular la suma por cada columna(total * mes)

* Genera un reporte formateado que muestre ambos totales en un solo panel de texto

**Ejercicio 3**

Diagnostico de matriz identtidad y diagonal principal (m * m) 

* Implementa un modulo para 
analicis algebraico:

**validacion previa**

comprueba si la matriz es cuadrada. si no lo es, cancela la operacion muestra un mensaje de advertencia

* Si es cuadrada, evalua si es una **matriz de identidad**(unos en la diagonal principal y ceros en el resto de la matriz )

* Calcula e imprime la suma de los elementos de la diagonal principal

**Ejercicio 4**

Transporcicion dinamica de matriz(M*M->N*M)

* Crea el metodo obtener transpuesta que invierta la orientacion de los datos

* La funcion debe retornar una nueva instancia de la clase matriz con dimensiones invertidas (m*n)

* Copia cada elemnto siguiendo la regla de exposicion transpuesta[j][i]= original[i][j]

**Ejercicio 5**

Rotacion de la matriz a 90 grados en sentido horario [n*n]

* simula el giro den una matriz cuadra:
validacion previa, verifica que la matriz se estrictamente cuadrada

* Retornar una nueva instancia de matriz rotada a 90 grados