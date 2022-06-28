En la universidad existe una plantilla de personal que está dividida en dos grupos:

- **Personal de Administración y Servicios (PAS)**: En el personal de administración se encuentra todo el personal que desempeña labores administrativas o de gestión de algún tipo de servicio. En este caso, por simplicidad, solo vamos a considerar que existe **personal administrativo** y **personal informático**.
- **Personal Docente Investigador (PDI)**: Personal que se dedica a la docencia y a la investigación y en el que incluimos a **profesores** y a **investigadores contratados** en algún proyecto de investigación.

Todo el personal se identifica con su nombre y DNI y recibe un salario mensual que debemos de calcular, de forma simplificada, como el número de horas de trabajo a la semana multiplicado por el importe/hora de su categoría y por el número de semanas al mes (4). Los datos de cada tipo de personal son los siguientes (las cantidades no son reales):

**Administrativos**: 37 horas/semana y un importe de 7,5 euros/hora.

**Informáticos**: 40 horas/semanas y un importe de 6 euros/hora.

**Profesores**: 37 horas/semana con un importe de 8 euros/hora.

**Investigadores**: 35 horas/semana con un importe de 7 euros/hora.

Además los profesores y los PAS tienen los siguientes ingresos adicionales:

- **Profesores**: A los profesores se les añade un complemento salarial en función de lo que se conoce como sexenios (periodos de 6 años evaluados positivamente), y que se pueden conceder hasta un máximo de 6. En concreto, se les añade 100 euros al mes por sexenio reconocido. Una vez concedido el sexenio el aumento de sueldo se mantiene para siempre.
- **PAS**: En un mes determinado los PAS (tanto administrativos como informáticos) pueden acumular horas extras. Cada hora extra se paga a 6 euros/hora. Las horas extra, una vez pagadas, se inicializan a cero de nuevo (por ejemplo, a la hora de calcular el sueldo de personal).

**Se pide:**

1. Crear una estructura de clases y subclases que represente a los trabajadores de la universidad. En dicha estructura tiene que existir una superclase común a todos los trabajadores que sea `Personal`.
2. Crear una clase `Universidad` con una función `public static void imprimirNominas(Personal[] listaPersonal)` que imprima por pantalla, para cada Personal incluido en listaPersonal, el nombre del personal, su categoría y su sueldo.
3. Crear en la misma clase Universidad, una función `obtenerPresupuestoTotal` que devuelva el total de dinero que se gasta la universidad en personal.

Para evitar usar decimales en cantidades monetarias podemos trabajar con el dinero en céntimos de Euro y solo convertirlo en euros a la hora de mostrarlo por pantalla  