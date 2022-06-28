El objetivo del ejercicio es implementar las clases básicas para utilizar en un supermercado. Necesitaremos por tanto almacenar información de Clientes, Dependientes y Reponedores. De todos ellos necesitamos saber su nombre, apellidos, DNI, dirección y teléfono.

A parte de eso necesitamos la siguiente información específica de cada clase:

- De los clientes también nos interesa su código de cliente y el número de compras realizadas, esta última característica es necesaria para obtener el descuento que se le debe aplicar al cliente (cada 100 compras se le aplica un 1% de descuento), debemos por lo tanto implementar un método compra que anote que realizó una compra.

- De los dependientes y reponedores debemos saber su número de la seguridad social, su salario y el turno al que pertenecen (mañana, tarde o noche). Para obtener el salario se tendrá en cuenta que si trabaja en turno de noche tiene un extra de 150 euros.

- De los dependientes almacenaremos su especialidad (carnicería, frutería, caja, etc.) y de los reponedores almacenaremos información de la empresa de la que proceden ya que se suelen subcontratar.

Todos los atributos se definirán privados y deberán disponer de métodos de lectura y escritura. Se deberá incluir un método toString que sobrescriba el método toString de Object y que permita imprimir toda la información de cada clase. Emplea clases abstractas para generalizar características comunes entre distintas subclases.

Crea una clase `Mercado` que tenga un método `empleadosMercado` que cuando le pasas una lista de empleados del mercado imprime todas sus características por pantalla.