# ejercicio_06

6.- Crea una clase llamada Libro que guarde la información de cada uno de los libros de una biblioteca:

La clase debe guardar el título del libro, autor, número de ejemplares del libro y número de ejemplares prestados. 

La clase contendrá los siguientes métodos:
  • Constructor por defecto. 
  • Constructor con parámetros.
  • Métodos Setters/getters.
  • Método prestamo que incremente el atributo correspondiente cada vez que se realice un préstamo del libro. No se podrán prestar libros       de los que no queden ejemplares disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en caso               contrario.
  • Método devolución que decremente el atributo correspondiente cuando se produzca la devolución de un libro. No se podrán devolver libros     que no se hayan prestado. Devuelve true si se ha podido realizar la operación y false en caso contrario.
  • Método toString para mostrar los datos de los libros. Este método lo debemos modificar (override) para adaptarlo a la clase Libro. 
  
  Escribe un programa para probar el funcionamiento de la clase Libro.
