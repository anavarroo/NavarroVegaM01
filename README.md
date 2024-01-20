# EJERCICIO 02

Crea la segunda pantalla en el mismo proyecto(investiga como). Deberás realizar un lógin tal y como se muestra en el figma, en el caso de que el usuario y contraseña sean `admin` en el TextView
de abajo saldrá “Usuario y contraseña correcta” en caso contrario “Usuario o contraseña incorrecta”. Investigar por vuestra cuenta como iniciar la aplicación en la Activity login. Pista → se configura
en el `AndroidManifest.xml`. Una vez que iniciemos el login deberá pasar a la pantalla del contador pasando el dato del nombre del usuario (aparecerá en la parte baja de la pantalla de contador donde 
ponía “by nombre_alumno”).**(ACTUALIZADO)**

## LOGIN
![Captura de pantalla 2024-01-06 174413](https://github.com/anavarroo/NavarroVegaM02/assets/117681310/b7fe4623-6777-4a1e-8902-dcd0030d3a81)

Este pantalla gestionará la autenticación de usuarios en una aplicación Android. La actividad login contiene campos para ingresar el nombre de usuario y la contraseña. Al hacer clic en el botón de inicio de sesión, verifica si las credenciales coinciden con "admin". Si es así, redirige al usuario a la actividad contador, pasando el nombre de usuario como un extra en el Intent. En caso contrario, muestra un mensaje de error en un TextView. 

## CONTADOR
![Captura de pantalla 2024-01-06 174527](https://github.com/anavarroo/NavarroVegaM02/assets/117681310/841047a3-d710-4629-a9c2-c2ee72d2d436)

El codigo de esta pantalla representa la lógica de la actividad contador en una aplicación Android. La actividad se encarga de mostrar un mensaje de bienvenida personalizado en un TextView, utilizando el nombre de usuario pasado como extra desde la actividad anterior. 


# EJERCICIO 03

Cambia el proyecto para que el segundo activity en vez de ser el contador sea un activity con un FrameLayout en el que se verán los diferentes fragments (mínimo home, contador, salir) y por otra parte una barra de navegación con la que podamos viajar entre los diferentes fragments.

## Caputuras de los 3 Fragments

![image](https://github.com/anavarroo/NavarroVegaM01/assets/117681310/9b9854ff-9f1c-41c4-9666-8c5b44208be2)

![image](https://github.com/anavarroo/NavarroVegaM01/assets/117681310/cec530c9-bd0c-4c9f-ac16-cbadcf294292)

![image](https://github.com/anavarroo/NavarroVegaM01/assets/117681310/f6a2c844-3c00-4fdd-bad6-0658b4e7ebb2)


En esta actividad creo un FrameLayout y en su interior 4 Fragments los cuales navego entre ellos con una barra de navegacion. El primero es una pantalla basica de Home con una imagen, el segundo es la Actividad anterior (contador) el tercer fragment contiene INFO sobre todas las activiades que iremos haciendo y por ultimo Salir, si lo pulsas cierras sesion y vuelves al LOGIN.

Ademas he creado nuevos directorios como puede ser el de MENU (donde como su nombre indica, he creado un menu de 4 botones para acceder a todos los fragments), el repositorio NAVIGATION donde se encuentran todos los FRAGMENTS creados y nuevos elementos como pueden ser la imagen de la portada y diferentes iconos en el directorio DRAWABLE. 


# EJERCICIO 04

Añade un Fragment mas que se llame API y sigue el tutorial (para la parte del consumo de la API) proporcionado para consumir un API con android(en esta entrega no tendrás que reflejar los resultado en la interfaz gráfica, solo en el log). Por otro lado crea un microservicio con una sola entidad.

### Nuevo Fragment
![image](https://github.com/anavarroo/NavarroVegaM01/assets/117681310/53738711-5527-4f79-93d2-7c86c9e144a4)

### Entidad
![image](https://github.com/anavarroo/NavarroVegaM01/assets/117681310/3acd20ec-c80a-4376-989a-dc306382a864)

### Terminal
![image](https://github.com/anavarroo/NavarroVegaM01/assets/117681310/5a765a1f-b9b0-46c1-9c4a-3a8589de91c4)

### Postman
![image](https://github.com/anavarroo/NavarroVegaM01/assets/117681310/a3f99ab7-4194-4c26-9a76-620fcffd4492)


En este EJ04 he creado un Fragment llamado API, en el cual no muestro nada por la interfaz grafica sino por el terminal. En el mismo aparecen todos los productos que tiene la API que consumo registrados en su BBDD (H2). Esta API solo consta de una entidad (Products) y su metodo correspondiente (getAllProducts) para obtener la lista de todos los registros de Productos. 



