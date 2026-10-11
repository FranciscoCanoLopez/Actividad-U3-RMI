@echo off
echo Compilando el proyecto RMI...

REM Crear directorio de salida si no existe
if not exist bin mkdir bin

REM Buscar todos los archivos .java en la carpeta src y guardar la lista en un archivo temporal
dir /s /B src\*.java > sources.txt

REM Compilar leyendo la lista de archivos
javac -encoding UTF-8 -d bin @sources.txt

REM Eliminar el archivo temporal
del sources.txt

echo Compilacion finalizada. Revisa la carpeta 'bin'.
pause