# BitGo4j
BitGo API Client Library for Java.  
For more information on API definitions, please refer to [BitGo API document](https://api.bitgo.com/docs/).

## Introduction

**To Be Added**

## Download

### Latest JAR

**To Be Added**

### Gradle

```groovy
implementation 'com.nxt-fintech.bitgo4j:bitgo4j:(insert latest version)'
```

## Caution
`express` module is under maintenance.

## Test
### BitGo Express docker

Please refer to [BitGo official document](https://github.com/BitGo/BitGoJS/blob/master/modules/express/README.md).

```bash
docker run -it -p 4000:4000 bitgosdk/express:latest --port 4000 
# curl localhost:4000/api/v2/ping # for health check
```

### WireMock docker

Please refer to [WireMock official document](https://wiremock.org/studio/docs/getting-started/docker/).
Download OpenAPI specification from [BitGo](blob:https://api.bitgo.com/1ca850bc-7812-4fb3-b385-b643c9b5b40b) and it was modified to apply to WireMock.

```bash
docker run -it --rm -p 4040:8080 --name wiremock -v $PWD/bitgo-api:/home/wiremock wiremock/wiremock:2.34.0 --verbose      
# curl localhost:4040/api/v2/pingexpress  # for health check
```

### Run

```bash
./gradlew test
```

## Contributing

**To Be Added**

## License

```text
Copyright 2022 Next Finance Tech Co.,Ltd.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```