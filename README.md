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


