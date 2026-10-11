@echo off
echo Iniciando Servidor RMI...

REM Ejecutar el servidor aplicando la politica de seguridad y el classpath
java -Djava.security.policy=servidor.policy -cp bin com.rmi.servidor.ServidorRMI

pause