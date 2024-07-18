Para ejecutar vamos a la parte de arriba del editor IntellJ Idea

editamos la configuración para el debug, asignamos un nombre a la aplicación, escogemos la versión y tomamos como main class: com.example.demo.DemoApplication

Para poder hacer pruebas
es en la url http://localhost:8080
Para Get
http://localhost:8080/usuarios
Para POST
http://localhost:8080/usuarios
y este Body desde Postman lo ejecutamos
{
    "nombre": "Alejandro Lara",
    "correo": "alejandro@expample.com",
    "password": "12312341",
    "fechaRegistro": "2024-07-17T12:00:00"
}
Para Put se remplaza el id por el numero del usuario a corregir
http://localhost:8080/usuarios/id

Para Delete se remplaza el id por el numero del usuario a eliminar

Adicionalmente Adjunto Video
https://drive.google.com/file/d/1MeZrcGSbitF6o6uMns7_x1PF66Bk9jxV/view?usp=sharing
