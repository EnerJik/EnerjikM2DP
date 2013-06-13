@echo off 
set REP_SOURCE=C:\Tmp\energie\data\webservice
::création du répertoire d'export s'il n'existe pas
if not exist %REP_SOURCE% mkdir %REP_SOURCE%
::URI pour connecter à l'application serveur
set URI=http://localhost:8081/webservices/importationServiceImpl?WSDL
::génerationd des codes sources
wsimport -keep  -d %REP_SOURCE% -target 2.0 -verbose %URI%
pause;