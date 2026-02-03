La classe che viola il principio di Liskon è models.models.Ghost, infatti il methodo takeDamage(), eredato da models.models.Character lancia un'eccezione.
Ciò conduce ad un comportamento indefinito del programma ogniqualvolta venga eseguito il metodo suddetto.

