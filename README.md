# gestioneDBwebwithexport

I would to try the export functionality of primefaces.

GO at /home.jsf and to sheet.jsf page. It works the export funcionality.
But if i go at Maintenance/Customer/list page, the export not working.

I  adapted the example from :

https://www.primefaces.org/showcase/ui/data/dataexporter/basic.xhtml
i used the library name for the icons of pdf , or excel icon

 
Used: 
Wildfly server.

Important: for run the netbeans project, resolve the  dependencies: 
from project right click and select properties/lib.

Into libs add the primefaces-6.1.jar and all-themes-1.0.10.jar (download from primefaces web site).
Add also the the jtext-2.1.7.jar and poi-3.7.jar and xmlbeans-2.3.0  for exporting features.


For the persistence, control the  <jta-data-sorce> name if your db is configurated  into wildfly
 with same name:
into project the persitence.xml contains:
 <jta-data-source>java:/jboss/datasources/MySQLDS</jta-data-source>


