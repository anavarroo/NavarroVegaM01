# EJERCICIO 02

Crea la segunda pantalla en el mismo proyecto(investiga como). Deberás realizar un lógin tal y como se muestra en el figma, en el caso de que el usuario y contraseña sean `admin` en el TextView
de abajo saldrá “Usuario y contraseña correcta” en caso contrario “Usuario o contraseña incorrecta”. Investigar por vuestra cuenta como iniciar la aplicación en la Activity login. Pista → se configura
en el `AndroidManifest.xml`. Una vez que iniciemos el login deberá pasar a la pantalla del contador pasando el dato del nombre del usuario (aparecerá en la parte baja de la pantalla de contador donde 
ponía “by nombre_alumno”).**(ACTUALIZADO)**

## LOGIN
![image](https://github.com/anavarroo/NavarroVegaM01/assets/117681310/99069468-839a-4a03-bf33-e87b949fcf22)

Este pantalla gestionará la autenticación de usuarios en una aplicación Android. La actividad login contiene campos para ingresar el nombre de usuario y la contraseña. Al hacer clic en el botón de inicio de sesión, verifica si las credenciales coinciden con "admin". Si es así, redirige al usuario a la actividad contador, pasando el nombre de usuario como un extra en el Intent. En caso contrario, muestra un mensaje de error en un TextView. 

## CONTADOR
![image](https://github.com/anavarroo/NavarroVegaM01/assets/117681310/17bde95d-f4bb-490d-a0f6-566561126ac6)

El codigo de esta pantalla representa la lógica de la actividad contador en una aplicación Android. La actividad se encarga de mostrar un mensaje de bienvenida personalizado en un TextView, utilizando el nombre de usuario pasado como extra desde la actividad anterior. 

