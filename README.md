Micro servicio de logs 
Se debe de crear un contenedor en localHost para PostgreSQL:
docker run --name pg-logsdb -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=logsdb -p 5432:5432 -d postgres
