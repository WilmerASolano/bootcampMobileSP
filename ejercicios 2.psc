Algoritmo sin_titulo
	
	Escribir "escriba la cantidad de numeros"
	leer num
	Dimension cantidad[num]
	Dimension alterna[num]
	cont=3
	
		para i = 1 hasta num Hacer
			Escribir "escriba un numero"
			leer val 
			cantidad[i]= val
			
		FinPara
		
	para i = 1 hasta num Hacer
		Escribir cantidad[i]," "
	FinPara
	Escribir "///////////////////////"
	para i = 1 hasta num hacer
	
		Escribir cantidad[cont -i +1]
	FinPara
	
	
	
	
    
	


FinAlgoritmo
