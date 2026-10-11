@echo off
echo Compilando el proyecto RMI...

REM Crear directorio de salida si no existe
if not exist bin mkdir bin

REM Compilar todos los archivos fuente
javac -encoding UTF-8 -d bin src/main/java/com/rmi/dto/*.java src/main/java/com/rmi/interfaz/*.java src/main/java/com/rmi/servidor/*.java src/main/java/com/rmi/cliente/*.java

echo Compilacion finalizada. Revisa la carpeta 'bin'.
pause