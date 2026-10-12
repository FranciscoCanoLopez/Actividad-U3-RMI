@echo off
echo Compilando el proyecto RMI...

REM Crear directorio de salida si no existe
if not exist bin mkdir bin

REM Compilar apuntando a la ruta real (dentro de "Actividad RMI") usando comillas
javac -encoding UTF-8 -d bin -sourcepath "Actividad RMI\src\main\java" "Actividad RMI\src\main\java\com\rmi\servidor\ServidorRMI.java" "Actividad RMI\src\main\java\com\rmi\cliente\ClienteRMI.java"

echo Compilacion finalizada. Revisa la carpeta 'bin'.
pause