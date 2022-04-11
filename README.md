## Environment:
- Java version: 1.8
- Maven version: 3.*
- Spring Boot version: 2.6.6

## Data:
Example of a temperatureMonitory data JSON object:
```json
{
    "type":"CELSIUS",
    "temperatureMonitory":"10.0",
    "temperatureMonitoryRangeFrom":"5.0",
    "temperatureMonitoryRangeTo":"20.0"
}
```

## Requirements:
The `REST` service must expose the endpoints, which allows for managing the temperature records in the following way:


`POST` request to `/postTemperatureMonitory` :
* creates a new temperatureMonitory data record
* adds the given object to the database and assigns a unique long id to it

`GET` request to `/getTemperature`:
* returns a record with the given id if in some moment the temperature match the temperatureMonitory
* if the matching record exists, the response code is 200 and the response body is the matching object

## Test
To test you can import the postman collection Samsung Thermometer.postman_collection.json available in the root of the project

## Commands
- run: 
```bash
mvn clean package; java -jar target/samsungThermometer-1.0-SNAPSHOT.jar
```
- install: 
```bash
mvn clean install
```

