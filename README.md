# Project to reproduce HTTP 431 when header is too large

See https://github.com/quarkusio/quarkus/issues/33692

## Build and run

    mvn clean package && java -jar target/maven-simplest-*.jar

## Example request

    curl -k 'https://localhost:8443/' \
      -H "x-foo: $(printf -- 'A%.0s' {1..9872})" \
      -o /dev/null -s -w '> bytes sent: %{size_request}' \
      -vv 2>&1 |grep -E '(<|>)'


