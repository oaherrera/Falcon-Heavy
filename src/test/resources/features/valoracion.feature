Feature: valoración 


@valoracion 
Scenario: realizar el proceso de valoración completo 
	Given ingreso a la aplicacion con usuario: sandracubides y password: Subocol2020* 
	When diligencio datos de amparo 
	And diligencio los datos basicos 
		| numeroSiniestro |rutaArchivo                         | placa | region   |departamento   |ciudad        |taller                    |tipoPintura|
		| 123400          | C:\Carga\imagenes\2237879_37_1.jpg |HVN675 | OCCIDENTE|VALLE DEL CAUCA|CALI Y REMOTAS|TALLER TERCEROS ASEGURADOS| METALIZADA|
	And diligencio zonas afectadas 
		|rutaArchivo|
		|C:\Carga\imagenes\2237879_37_1.jpg|
	And agrego las piezas o repuestos 
		|piezas|
		|para  |
	And diligencio la valoracion 
	Then se muestra mensaje de tramite exitoso
	And sale de la aplicacion
	Then valido la informacion con base de datos