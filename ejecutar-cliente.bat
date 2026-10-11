@echo off
echo Iniciando Cliente RMI...

REM Ejecutar el cliente aplicando la politica de seguridad y el classpath
java -Djava.security.policy=cliente.policy -cp bin com.rmi.cliente.ClienteRMI

pause