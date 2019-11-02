# taaproject


## Build
```bash
mvn clean install
```

## Test
```bash
mvn test
```

## Run docker image
Build image in local
```bash
docker build -t taaproject .
```

Run docker image
```bash
docker run -ti --rm --name taaproject \
    -p 8080:8080 \
    taaproject
```
