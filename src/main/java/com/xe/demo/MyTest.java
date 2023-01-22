package com.xe.demo;


import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class MyTest {
    private static final Logger LOGGER= LoggerFactory.getLogger(MyTest.class);

    public static void main(String[] args) {
        String name= "pankaj";
        String s = getName("Amol");
        LOGGER.info(s);

    }
     public static String getName(String name){
        LOGGER.info("My name is",   name);
        return name;
     }

     String res= " \"SAC_CONTACT\": {\n" +
             "\n" +
             "            \"link\": [\n" +
             "\n" +
             "                {},\n" +
             "\n" +
             "                {}\n" +
             "\n" +
             "            ],\n" +
             "\n" +
             "            \"item\": [\n" +
             "\n" +
             "                {\n" +
             "\n" +
             "                    \"link\": [\n" +
             "\n" +
             "                        {},\n" +
             "\n" +
             "                        {},\n" +
             "\n" +
             "                        {}\n" +
             "\n" +
             "                    ],\n" +
             "\n" +
             "                    \"rowidObject\": \"1080028       \",\n" +
             "\n" +
             "                    \"creator\": \"admin\",\n" +
             "\n" +
             "                    \"createDate\": \"2022-03-11T12:49:22.229Z\",\n" +
             "\n" +
             "                    \"updatedBy\": \"admin\",\n" +
             "\n" +
             "                    \"lastUpdateDate\": \"2022-03-17T07:30:55.148Z\",\n" +
             "\n" +
             "                    \"consolidationInd\": \"4\",\n" +
             "\n" +
             "                    \"lastRowidSystem\": \"FCR           \",\n" +
             "\n" +
             "                    \"hubStateInd\": \"1\",\n" +
             "\n" +
             "                    \"contactValue\": \"914545454545\",\n" +
             "\n" +
             "                    \"contactType\": {\n" +
             "\n" +
             "                        \"link\": [\n" +
             "\n" +
             "                            {},\n" +
             "\n" +
             "                            {},\n" +
             "\n" +
             "                            {}\n" +
             "\n" +
             "                        ],\n" +
             "\n" +
             "                        \"rowidObject\": \"20002         \",\n" +
             "\n" +
             "                        \"creator\": \"admin\",\n" +
             "\n" +
             "                        \"createDate\": \"2017-11-25T13:39:23.164Z\",\n" +
             "\n" +
             "                        \"updatedBy\": \"admin\",\n" +
             "\n" +
             "                        \"lastUpdateDate\": \"2019-05-28T12:39:55.594Z\",\n" +
             "\n" +
             "                        \"consolidationInd\": \"4\",\n" +
             "\n" +
             "                        \"lastRowidSystem\": \"LKP           \",\n" +
             "\n" +
             "                        \"hubStateInd\": \"1\",\n" +
             "\n" +
             "                        \"contactTypeDesc\": \"MOBILE\",\n" +
             "\n" +
             "                        \"contactTypeCode\": \"2\"\n" +
             "\n" +
             "                    }\n" +
             "\n" +
             "                },\n" +
             "\n" +
             "                {\n" +
             "\n" +
             "                    \"link\": [\n" +
             "\n" +
             "                        {},\n" +
             "\n" +
             "                        {},\n" +
             "\n" +
             "                        {}\n" +
             "\n" +
             "                    ],\n" +
             "\n" +
             "                    \"rowidObject\": \"1170002       \",\n" +
             "\n" +
             "                    \"creator\": \"admin\",\n" +
             "\n" +
             "                    \"createDate\": \"2022-05-12T10:31:12.505Z\",\n" +
             "\n" +
             "                    \"updatedBy\": \"admin\",\n" +
             "\n" +
             "                    \"lastUpdateDate\": \"2022-05-12T10:31:12.506Z\",\n" +
             "\n" +
             "                    \"consolidationInd\": \"4\",\n" +
             "\n" +
             "                    \"lastRowidSystem\": \"SYS0          \",\n" +
             "\n" +
             "                    \"hubStateInd\": \"1\",\n" +
             "\n" +
             "                    \"contactValue\": \"rajkumar.kushwaha@yesbank.in\",\n" +
             "\n" +
             "                    \"contactType\": {\n" +
             "\n" +
             "                        \"link\": [\n" +
             "\n" +
             "                            {},\n" +
             "\n" +
             "                            {},\n" +
             "\n" +
             "                            {}\n" +
             "\n" +
             "                        ],\n" +
             "\n" +
             "                        \"rowidObject\": \"20001         \",\n" +
             "\n" +
             "                        \"creator\": \"admin\",\n" +
             "\n" +
             "                        \"createDate\": \"2017-11-25T13:39:22.159Z\",\n" +
             "\n" +
             "                        \"updatedBy\": \"admin\",\n" +
             "\n" +
             "                        \"lastUpdateDate\": \"2019-05-28T12:39:55.594Z\",\n" +
             "\n" +
             "                        \"consolidationInd\": \"4\",\n" +
             "\n" +
             "                        \"lastRowidSystem\": \"LKP           \",\n" +
             "\n" +
             "                        \"hubStateInd\": \"1\",\n" +
             "\n" +
             "                        \"contactTypeDesc\": \"EMAIL\",\n" +
             "\n" +
             "                        \"contactTypeCode\": \"1\"\n" +
             "\n" +
             "                    }\n" +
             "\n" +
             "                }\n" +
             "\n" +
             "            ]";


}
