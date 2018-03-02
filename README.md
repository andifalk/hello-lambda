# Hello World Lambda Function

## AWS configuration

1. Create a new AWS lambda function in AWS console
2. Set Handler to 'com.example.HelloWorldFunction::handleRequest'

## Build deployable zip artifact

Call ```gradle clean build``` to assemble the required zip file to deploy to AWS.

After successful build you will find the zip file to be deployed in the ``build/distributions`` folder.

Upload this zip file to your AWS function.

## Test the function

 Create a new test configuration with just one input string like this:
 
 `` "world"``
 
 Now when you are testing the function you should get something similar to this:
 
 ``"Hello World"``
 
 The Log output should show entries like this:
 ``
 START RequestId: bd4c4bd9-1e24-11e8-bf2a-9d3ffb4b863f Version: $LATEST
 Invoked HelloWorldFunction with argument 'World'
 END RequestId: bd4c4bd9-1e24-11e8-bf2a-9d3ffb4b863f
 REPORT RequestId: bd4c4bd9-1e24-11e8-bf2a-9d3ffb4b863f
 ``