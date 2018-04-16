# SpringBoot 2 metrics

## Actuator endpoint configuration

Some configuration changes in `application.properties` are used to provide the
well-known default `/metrics` endpoint for Prometheus.

## Docker build

`docker build -t springboot2-metrics .`

## Docker run

Run the image via `docker run -it --rm -p 8080:8080 springboot2metrics`
