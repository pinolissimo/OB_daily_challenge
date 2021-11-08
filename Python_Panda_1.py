"""
Open Boot Camp
Reto diario 08/11/2021
Bootcamper: Giuseppe Allocca Aka "Pino" ;)
- Lenguaje: Python
- IDE recomendado: PyCharm
- Nivel: Inicial
- Enunciado: Dado un fichero excel con nombres y correos
(columna nombre y columna email), realiza un script en Python
que devuelva los mails únicos de la columna email.
- Consideraciones: Utiliza la librería pandas para procesar el fichero Excel (.xls).
"""
import pandas
data = pandas.read_excel ("datos.xlsx")# local file Import
df = pandas.DataFrame(data)
print("")
print("******************************************************************")
print("* This is the Day Challenge n.1 in OB date:08/11/2021            *")
print("* Filtered list of email address in excel file:                  *")
print("* https://pandas.pydata.org/pandas-docs/stable/                  *")
print("* reference/api/pandas.DataFrame.drop_duplicates.html            *")
print("* ?highlight=drop_duplicate#pandas-dataframe-drop-duplicates     *")
print("******************************************************************")
print("")
print (df.drop_duplicates(subset="email", keep='first', inplace=False, ignore_index=False))
print("")
print("filtered by 'email' value")
print (df.drop_duplicates(subset="email", keep='first', inplace=False, ignore_index=False).email)
print(" ")
print("******************************************************************")
"""
Local Excel file :"datos.xlsx"

Nombre	email
Álex	alex@gmail.com
Álex	alex@gmail.com
Clemen	clemen@gmail.com
Clemen	clemen@gmail.com
Jesús	jesus@gmail.com
Jesús	jesus@gmail.com
Martin	martin@gmail.com
Martin	martin@gmail.com
Pablo	pablo@gmail.com
Pablo	pablo@gmail.com
Pino	pino@gmail.com
Pino	pino@gmail.com
Raúl	raul@gmail.com
Raúl	raul@gmail.com
Rubén	ruben@gmail.com
Rubén	ruben@gmail.com
Victor	victor@gmail.com
Victor	victor@gmail.com
Álex	alex@gmail.com
Álex	alex@gmail.com
Clemen	clemen@gmail.com
Clemen	clemen@gmail.com
Jesús	jesus@gmail.com
Jesús	jesus@gmail.com
Martin	martin@gmail.com
Martin	martin@gmail.com
Pablo	pablo@gmail.com
Pablo	pablo@gmail.com
Pino	pino@gmail.com
Pino	pino@gmail.com
Raúl	raul@gmail.com
Raúl	raul@gmail.com
Rubén	ruben@gmail.com
Rubén	ruben@gmail.com
Victor	victor@gmail.com
Victor	victor@gmail.com
"""
