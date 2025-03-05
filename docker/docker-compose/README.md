# Avatar HIMSA Docker deployment

The docker compose includes GICS + MySQL + HIMSA + MongoDB images

## Preparing gICS 

[Consent management system](https://www.ths-greifswald.de/en/researchers-general-public/gics/)
Is included in the ```docker-compose.yml``` but needs a directory structure that can be downloaded from the website (bottom). The directories in the zip file needs to be placed beside the ```docker-compose.yml```

```
  |__addins/
  |__demo/
  |__deployments/
  |__envs/
  |__jboss/
  |__logs/
  |__sqls/
  |__update_sqls/
```

The owner must be changed:
```sh 
sudo chown -R 999:999 sqls
sudo chown -R 1111:1111 deployments jboss logs
```

## Start and stop
Startup:
```
docker compose up -d
```
shutdown:
```
docker compose down
```
inspect logs:
```
docker compose logs himsa -f
```

## Import gICS Data

[Import gics data for the Avatar domain](../../org.avatar.gics.service/gics_data/README.md)

