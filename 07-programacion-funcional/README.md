# Programación funcional

En este proyecto se recopilan todos los ejemplos en los cuales repasamos los conceptos básicos al trabajar con programación funcional en Java.

## Contenidos

Cada paquete representa una sección dentro del master:

- Expresiones lambda:
  - Expresiones Lambda Consumidores o Consumer
  - Referencias de métodos en expresiones lambda de tipo Consumer
  - Expresiones Lambda Function
  - Expresiones Lambda Predicate
  - Creando nuestra propia expresión lambda con una interfaz funcional
  - **Tarea:** Expresión Lambda que elimine espacios
  - **Tarea:** Expresión Lambda que cuenta la cantidad de veces

- Stream:
  - Introducción a los Streams
  - Creando un Stream
  - El operador map
  - El operador filter
  - El operador anyMatch
  - Un resumen al API Optional de java 8
  - Operadores varios filter(), distinct(), reduce(),, sum() y summaryStatistics()
  - Operadores mapToInt(), sum() y summaryStatistics()
  - Operador flatMap()
  - Convertiendo un List a un Stream
  - Generando Stream infinito o bien emitiendo elementos en un intervalo de tiempo
  - Ejemplo flatMap facturas de usuarios
  - Operador parallel()
  - **Tarea:** Modificar flujo y devolver la suma
  - **Tarea:** Obtener el numero mayor en un arreglo
  - **Tarea:** Aplanar un arreglo bidimensional en un nivel y eliminar repetidos
  - **Tarea:** Calcular importe de cada producto de una lista y sumarlo

- Optional:
  - Introducción a la clase Optional
  - Ejemplo Repositorio usando Optional
  - Optional métodos orElse() vs orElseGet()
  - Optional método orElseThrow()
  - Optional operadores map(), filter() y flatMap()