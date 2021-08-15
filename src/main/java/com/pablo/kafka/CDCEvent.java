package com.pablo.kafka;

import lombok.Data;

@Data
public class CDCEvent {
/*{
   "topic":"RegistrTestDB.dbo.persons",
   "partition":0,
   "offset":2,
   "timestamp":1627642164585,
   "timestampType":"CREATE_TIME",
   "headers":[
   ],
   "key":"Struct{personID=0}",
   "value":"Struct{before=Struct{personID=0,lastName=Donoso Yañez,firstName=Pablo Roberto,address=Carrion de los Condes,city=Madrid},after=Struct{personID=0,lastName=Donoso Yañez,firstName=Pablo Roberto,address=Carrion de los Condes 77,city=Madrid},source=Struct{version=1.6.0.Final,connector=sqlserver,name=RegistrTestDB,ts_ms=1627642159997,db=RegistrTestDB,schema=dbo,table=persons,change_lsn=0000004c:00008f70:0003,commit_lsn=0000004c:00008f70:0004,event_serial_no=2},op=u,ts_ms=1627642164123}",
  */


    private String key;
    private String value;
    private String topic;


}
