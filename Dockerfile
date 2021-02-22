FROM openjdk:8

LABEL maintainer="alexandre@piveteau.email"

ADD build/install/kotlin-backend/ /usr/local/

ENTRYPOINT [ "./usr/local/bin/kotlin-backend" ]
