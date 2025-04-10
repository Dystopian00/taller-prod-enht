Proyecto de Captura de Remisiones de Venta 

1. Resumen Ejecutivo

♦ Descripción

Esta es una aplicación de escritorio desarrollada en Java que permite capturar remisiones de venta de manera más rápida y eficiente. Está enfocada en el área de cambaceo, donde se generan remisiones manualmente y se requiere registrar múltiples productos por cliente.

• Problema Identificado

El registro actual de remisiones es manual y repetitivo. Por cada producto vendido, se vuelve a escribir la misma información (cliente, fecha, remisión), lo que aumenta el tiempo de captura y puede generar errores humanos.

• Solución

Una herramienta gráfica que permita ingresar los datos generales (cliente, fecha y número de remisión) una sola vez y luego ir agregando productos uno por uno. Los datos se guardan en un archivo .csv con encabezados, listos para procesarse o consultarse fácilmente.

• Arquitectura

Aplicación Java con Swing (interfaz gráfica). • Persistencia en archivo CSV. • No se requiere conexión a base de datos. • Proyecto gestionado con Git y GitHub.

2. Requerimientos

♦ Servidores 
• No requiere servidores externos. Es una aplicación de escritorio.

♦ Paquetes adicionales 
• Ninguno. Todo está hecho con bibliotecas estándar de Java.

♦ Versión de Java 
• Java 8 o superior.

3. Instalación

a. Instalar el ambiente de desarrollo 
• Instala Java JDK 8 o superior. 
•Instala IntelliJ IDEA (Community Edition está bien). 
• Clona el repositorio: git clone https://github.com/Dystopian00/taller-prod-enht.git 
• Abre IntelliJ y selecciona el proyecto faseiii

b. Ejecutar pruebas manualmente 
• Corre el archivo RemisionApp.java como aplicación. 
• Ingresa los datos de una remisión. 
• Verifica que se genera un archivo remisiones.csv.

4. Configuración
a. Configuración del producto 
• El archivo CSV se crea automáticamente si no existe. 
• Por defecto se guarda en el mismo directorio donde se ejecuta la aplicación.

b. Configuración de requerimientos 
• Asegúrate de tener permisos de escritura en la carpeta de ejecución. 
• No se requieren variables de entorno adicionales.

5. Uso 
a. Manual para usuario final 
• Ejecuta la aplicación. 
• Llena los campos de fecha, cliente y número de remisión. 
• Agrega productos con cantidad y precio. 
• Presiona “Guardar” cuando hayas terminado. 
• Revisa el archivo remisiones.csv.

b. Manual para administrador 
• Verifica que el archivo remisiones.csv se esté generando correctamente. 
• Puedes abrirlo con Excel, LibreOffice o un editor de texto. 
• Haz respaldos del archivo periódicamente si se usa en producción.

6. Contribución 
a. Guía de contribución 
• Clona el repositorio: git clone https://github.com/Dystopian00/taller-prod-enht.git 
• Crea un nuevo branch 
• Realiza tus cambios y haz commit 
• Sube tu rama 
• Abre un Pull Request desde GitHub. 
• Espera a que se revise y se haga el merge.

7. Roadmap (Futuras Mejoras)

♦ Opción para modificar remisiones ya guardadas.

♦ Soporte para eliminación de productos antes de guardar.

♦ Calcular y mostrar el total de la remisión automáticamente.

♦ Versión con base de datos para entornos con mayor volumen.


..::::::..
